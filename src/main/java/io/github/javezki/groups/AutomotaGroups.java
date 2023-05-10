package io.github.javezki.groups;

/**
 * Enum class for categories of automota groups. 
 */
public enum AutomotaGroups {

    /**
     * Using enums so I don't have to spam strings everywhere
     * @apiNote Make sure to call toString on the enums as I can't override name
     */
    MAIN("AUTOMOTA_MAIN"),
    OUTPUT("AUTOMOTA_OUTPUT"),
    INPUT("AUTOMOTA_INPUT"),
    TOOLS("AUTOMOTA_TOOLS");

    private final String name;
    
    AutomotaGroups(String name) {
       this.name = name;
    }
    
    @Override
    public String toString() {
        return name;
    }
}
