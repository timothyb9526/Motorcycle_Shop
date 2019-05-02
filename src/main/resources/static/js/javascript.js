var x = document.getElementById("mySelect");
var y = document.getElementById("brand");
var type = document.getElementById("type")

var honda_model = ["Africa Twin", "CB", "CBR", "CRF", "Gold Wing", "Interceptor", "RC", "V4", "VFR", "XR", "Integra", "Monkey", "X-ADV", "599", "919", "CBF", "CBX", "CR", "CTX", "DN 01", "Yuga", "EVO 6", "Fury", "Grom", "Interstate", "Magna", "Montesa Cota", "NC", "Nighthawk", "NM4", "NT", "Rebel", "Rune", "Sabre", "Shadow", "Stateline", "Super Hawk", "Transalp", "VTR", "VTX"];
var honda_type = ["Commuting", "Cruising", "Electric", "Racing", "Off-road", "Sport", "Travel", "Concept", "Utility"];

var kawasaki_model = ["ER 6N", "KLX", "KX", "Ninja", "Versys", "Vulcan", "Z", "W", "Concours", "D-Tracker", "Eliminator", "KLR", "ZZR"];
var kawasaki_type = ["Commuting", "Cruising", "Electric", "Racing", "Off-road", "Sport", "Travel", "Concept", "Utility"];

var harley_model = ["CVO", "Dyna", "Fat Boy", "Road Glide", "Road King", "Roadster", "Softail", "Sportster", "Street", "Touring", "Trike", "V-Rod", "Breakout", "FXDR", "Iron 1200", "Livewire", "Electra Glide", "Fat Bob", "Forty-Eight", "Iron 883", "Low Rider", "Nightster", "Rod Special", "Seventy-Two", "Street Bob", "Street  Glide", "Street Glide Special", "SuperLow", "TriGlide", "VRSC", "XR"];
var harley_type = ["Commuting", "Cruising", "Electric", "Off-road", "Sport", "Travel", "Concept", "Utility"];

var yamaha_model = ["Bolt", "Fazer", "FZ", "MT", "Star", "V-Max", "V-star", "XT", "YZ", "YZF", "YZF-R1", "FJ", "FJR", "FZR", "FZ5", "Niken", "PW", "Raider", "Roadliner", "Road Star", "Royal Star", "SCR", "SS", "Stratoliner", "Stryker", "SZ", "TDM", "Tenere", "Tracer", "TT", "TW", "Virago", "Warrior", "WR", "XJ", "XSR", "YBR", "SR"];
var yamaha_type = ["Commuting", "Cruising", "Electric", "Racing", "Off-road", "Sport", "Travel", "Concept", "Utility"];

makeModelDropdown(honda_model);
makeTypeDropdown(honda_type);
 y.oninput = function() {
    if (y.value.toLowerCase() == "honda") {
        x.innerHTML = "";
        type.innerHTML = "";
        makeModelDropdown(honda_model)
        makeTypeDropdown(honda_type)
    } else if (y.value.toLowerCase() == "kawasaki") {
        x.innerHTML = "";
        type.innerHTML = "";
        makeModelDropdown(kawasaki_model)
        makeTypeDropdown(kawasaki_type)
    } else if (y.value.toLowerCase() == "harley") {
          x.innerHTML = "";
          type.innerHTML = "";
          makeModelDropdown(harley_model)
          makeTypeDropdown(harley_type)
    } else if (y.value.toLowerCase() == "yamaha")  {
        x.innerHTML = "";
        type.innerHTML = "";
        makeModelDropdown(yamaha_model)
        makeTypeDropdown(yamaha_type)
    }
  };
function makeModelDropdown(list) {
    for (var i = 0; i < list.length; i++) {
        var option = document.createElement("option");
        option.text = list[i];
        x.add(option);
    }
}
function makeTypeDropdown(list) {
    for (var i = 0; i < list.length; i++) {
        var option = document.createElement("option");
        option.text = list[i];
        type.add(option);
    }
}