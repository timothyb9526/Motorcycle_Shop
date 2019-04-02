var x = document.getElementById("mySelect");
var y = document.getElementById("brand");
var result = document.getElementById("result");
var honda = ["Touring", "Adventure", "Cruiser", "Standard", "Sport", "Neo-Sports cafe", "MiniMoto"]
var kawasaki = ["Sport", "Naked", "Adventure", "Touring", "Cruiser", "off-Road"]
var harley = ["Street", "Sportster", "Softail", "Touring", "Trike", "CVO"]
var yamaha = ["Motorcross", "Cross country", "Trail", "Sport", "Naked", "Heritage", "Touring"]

makeDropdown(honda);

 y.oninput = function() {

    if (y.value.toLowerCase() == "honda") {
        x.innerHTML = "";
        makeDropdown(honda)

    } else if (y.value.toLowerCase() == "kawasaki") {
        x.innerHTML = "";
        makeDropdown(kawasaki)

    } else if (y.value.toLowerCase() == "harley") {
          x.innerHTML = "";
          makeDropdown(harley)

    } else if (y.value.toLowerCase() == "yamaha")  {
        x.innerHTML = "";
        makeDropdown(yamaha)

    }

  };

function makeDropdown(list) {

    for (var i = 0; i < list.length; i++) {
        var option = document.createElement("option");
        option.text = list[i];
        x.add(option);

    }

}

