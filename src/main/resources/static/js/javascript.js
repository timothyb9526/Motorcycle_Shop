var x = document.getElementById("mySelect");
var y = document.getElementById("brand");
var result = document.getElementById("result");
var honda = ["Africa Twin", "CB", "CBR", "CRF", "Gold Wing", "Interceptor", "RC", "V4", "VFR", "XR", "Integra", "Monkey", "X-ADV", "599", "919", "CBF", "CBX", "CR", "CTX", "DN 01", "Yuga", "EVO 6", "Fury", "Grom", "Interstate", "Magna", "Montesa Cota", "NC", "Nighthawk", "NM4", "NT", "Rebel", "Rune", "Sabre", "Shadow", "Stateline", "Super Hawk", "Transalp", "VTR", "VTX"];
var kawasaki = ["ER 6N", "KLX", "KX", "Ninja", "Versys", "Vulcan", "Z", "W", "Concours", "D-Tracker", "Eliminator", "KLR", "ZZR"];
var harley = ["CVO", "Dyna", "Fat Boy", "Road Glide", "Road King", "Roadster", "Softail", "Sportster", "Street", "Touring", "Trike", "V-Rod", "Breakout", "FXDR", "Iron 1200", "Livewire", "Electra Glide", "Fat Bob", "Forty-Eight", "Iron 883", "Low Rider", "Nightster", "Rod Special", "Seventy-Two", "Street Bob", "Street  Glide", "Street Glide Special", "SuperLow", "TriGlide", "VRSC", "XR"];
var yamaha = ["Bolt", "Fazer", "FZ", "MT", "Star", "V-Max", "V-star", "XT", "YZ", "YZF", "YZF-R1", "FJ", "FJR", "FZR", "FZ5", "Niken", "PW", "Raider", "Roadliner", "Road Star", "Royal Star", "SCR", "SS", "Stratoliner", "Stryker", "SZ", "TDM", "Tenere", "Tracer", "TT", "TW", "Virago", "Warrior", "WR", "XJ", "XSR", "YBR", "SR"];
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