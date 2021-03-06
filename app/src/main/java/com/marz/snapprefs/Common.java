package com.marz.snapprefs;

public final class Common {
    // Integer to be incremented for each build(To ensure proper hook checking)
    public static final int MODULE_ENABLED_CHECK_INT = 20;
    public static final int MODULE_STATUS_NOT_ACTIVATED = 0;
    public static final int MODULE_STATUS_NOT_RESTARTED = 1;
    public static final int MODULE_STATUS_ACTIVATED = 2;
    // Debugging settings
    public static final String LOG_TAG = "SnapPrefs: ";
    // Adjustment methods
    public static final int ADJUST_CROP = 0;
    public static final int ADJUST_SCALE = 1;
    public static final int ADJUST_NONE = 2;
    // Rotation modes
    public static final int ROTATION_NONE = 0;
    public static final int ROTATION_CW = 90;
    public static final int ROTATION_CCW = 270;
    // Maximum video size setting (2.50 MB)
    public static final int MAX_VIDEO_SIZE = (int) (2.50 * 1024 * 1024);
    final static String basename = "com.snapchat.android";
    final static String PACKAGE_SNAP = "com.snapchat.android";
    final static String PACKAGE_SP = "com.marz.snapprefs";
    final static String dialog_default = "Default";
    public final static String dialog_cancel = "Cancel";
    public final static String dialog_done = "Done";
    final static String dialog_title = "SnapPrefs Colour Manager";
    final static String dialog_txtcolour = "Text Colour";
    final static String dialog_txtstyle = "Text Style";
    final static String dialog_txtgravity = "Text Alignment";
    final static String dialog_bgcolour = "Background Colour";
    final static String dialog_size = "Size";
    final static String dialog_transparency = "Transparency";
    final static String dialog_bgtransparency = "Background Transparency";
    final static String dialog_rainbow = "Rainbow Text";
    final static String dialog_bold = "Bold";
    final static String dialog_italic = "Italic";
    final static String dialog_bolditalic = "Bold and Italic";
    final static String dialog_normal = "Normal";
    final static String dialog_left = "Left";
    final static String dialog_center = "Center";
    final static String dialog_right = "Right";
    final static String select_name = "selectCheckBox";
    final static String[] colors = {
            "#64E986",
            "#F0F8FF",
            "#6CC417",
            "#FAEBD7",
            "#7FFFD4",
            "#827B60",
            "#666362",
            "#B2C248",
            "#893BFF",
            "#F0FFFF",

            "#95B9C7",
            "#C25283",
            "#F88158",
            "#848482",
            "#F75D59",
            "#E9AB17",
            "#FBB117",
            "#4C787E",
            "#F5F5DC",
            "#000000",
            "#413839",
            "#4C4646",
            "#463E3F",
            "#FFEBCD",
            "#7E3517",
            "#F9B7FF",
            "#B7CEEC",
            "#4EE2EC",
            "#157DEC",
            "#1569C7",
            "#98AFC7",
            "#77BFC7",
            "#3090C7",
            "#2B547E",
            "#659EC7",
            "#8EEBEC",
            "#6960EC",
            "#1F45FC",
            "#306EFF",
            "#342D7E",
            "#57FEFF",
            "#0041C2",
            "#E6A9EC",
            "#E56E94",
            "#B5A642",
            "#FDD017",
            "#F433FF",
            "#CD7F32",
            "#835C3B",
            "#E2A76F",
            "#8C001A",
            "#DEB887",
            "#C12267",
            "#38ACEC",

            "#E38AAE",
            "#C19A6B",
            "#78866B",
            "#FFA62F",
            "#C68E17",
            "#625D5D",
            "#C12283",
            "#F778A1",
            "#50EBEC",
            "#34282C",
            "#8AFB17",
            "#C24641",
            "#C34A2C",
            "#C11B17",
            "#C85A17",
            "#C58917",
            "#6D6968",
            "#3EA055",
            "#0020C2",
            "#6F4E37",
            "#87AFC7",
            "#F87431",
            "#C7A317",
            "#B87333",
            "#FF7F50",
            "#AFDCEC",
            "#FFF380",
            "#151B8D",
            "#6495ED",
            "#FFF8DC",
            "#FCDFFF",
            "#9F000F",
            "#FFFFCC",
            "#E238EC",
            "#9172EC",
            "#5CB3FF",
            "#92C7C7",
            "#00FFFF",

            "#254117",
            "#AF7817",
            "#F88017",
            "#7D1B7E",
            "#E18B6B",
            "#8BB381",
            "#2B3856",
            "#25383C",
            "#3B9C9C",
            "#842DCE",
            "#FFCBA4",
            "#F52887",
            "#3BB9FF",
            "#79BAEC",
            "#EDC9AF",
            "#E3319D",
            "#1589FF",
            "#85BB65",
            "#6AFB92",
            "#7F525D",

            "#0000A0",
            "#614051",
            "#9AFEFF",
            "#5FFB17",

            "#C8B560",
            "#667C26",
            "#F70D1A",
            "#F62817",
            "#800517",
            "#F9A7B0",
            "#4E9258",
            "#99C68E",

            "#C9BE62",
            "#D4A017",
            "#EAC117",
            "#EDDA74",
            "#837E7C",
            "#5E5A80",
            "#DC381F",
            "#736F6E",
            "#B6B6B4",
            "#5C5858",
            "#D1D0CE",
            "#504A4B",
            "#5E7D7E",
            "#00FF00",
            "#4CC417",
            "#6AA121",
            "#89C35C",
            "#6CBB3C",
            "#B5EAAA",
            "#B1FB17",
            "#307D7E",
            "#2C3539",

            "#E66C2C",
            "#EDE275",
            "#617C58",
            "#D462FF",
            "#F660AB",
            "#7FE817",

            "#56A5EC",
            "#9CB071",
            "#4B0082",

            "#5EFB6E",
            "#A23BEC",
            "#A0CFEC",
            "#46C7C7",
            "#616D7E",
            "#347C2C",

            "#4CC552",
            "#ADA96E",
            "#C5908E",

            "#15317E",
            "#E42217",
            "#E3E4FA",
            "#EBDDE2",
            "#87F717",
            "#FFF8C6",
            "#93FFE8",
            "#ADDFFF",
            "#E77471",
            "#E0FFFF",
            "#C3FDB8",
            "#FAAFBA",
            "#F9966B",
            "#3EA99F",
            "#82CAFA",
            "#CCFFFF",
            "#736AFF",
            "#6D7B8D",
            "#728FCE",
            "#C8A2C8",
            "#41A317",
            "#C48793",
            "#E41B17",
            "#7F38EC",

            "#F2BB66",
            "#FF00FF",
            "#C04000",
            "#FF8040",
            "#566D7E",
            "#810541",
            "#43BFC7",
            "#E0B0FF",
            "#348781",
            "#347235",
            "#B048B5",
            "#8467D7",
            "#306754",
            "#348017",
            "#48CCCD",
            "#CA226B",
            "#BCC6CC",
            "#2B1B17",
            "#151B54",
            "#FEFCFF",
            "#98FF98",
            "#646D7E",
            "#FBBBB9",
            "#827839",
            "#493D26",
            "#FFDB58",

            "#000080",
            "#59E817",
            "#F535AA",
            "#78C7C7",

            "#806517",
            "#2B65EC",
            "#3B3131",
            "#C47451",

            "#CFECEC",
            "#D16587",
            "#E56717",
            "#FFFFC2",
            "#B4CFEC",
            "#FFE5B4",
            "#FDEEF4",
            "#E9CFEC",
            "#FDD7E4",
            "#387C44",
            "#FAAFBE",
            "#C48189",
            "#FFDFDD",
            "#E45E9D",
            "#E799A3",
            "#E4287C",
            "#E7A1B0",
            "#9DC209",
            "#E5E4E2",
            "#B93B8F",
            "#7D0541",
            "#583759",
            "#7D0552",
            "#C6DEFF",
            "#7F5A58",
            "#F87217",
            "#8E35EF",
            "#6C2DC7",
            "#B041FF",
            "#C38EC7",
            "#A74AC7",
            "#4E387E",
            "#571B7E",
            "#6A287E",
            "#9E7BFF",
            "#461B7E",
            "#7A5DC7",

            "#FF0000",
            "#7F5217",
            "#C35817",
            "#990012",
            "#BDEDFF",
            "#C12869",
            "#E8ADAA",
            "#B38481",
            "#7F4E52",
            "#2B60DE",
            "#FFD801",
            "#F62217",
            "#C36241",

            "#FBB917",
            "#A1C935",
            "#C2B280",
            "#786D5F",
            "#EE9A4D",
            "#7E3817",
            "#2554C7",
            "#FF2400",
            "#E8A317",
            "#C2DFFF",
            "#4E8975",
            "#438D80",
            "#FFF5EE",
            "#437C17",
            "#CC6600",
            "#7F462C",
            "#347C17",
            "#E55B3C",
            "#8A4117",
            "#488AC7",
            "#82CAFF",
            "#357EC7",
            "#657383",
            "#BCE954",
            "#726E6D",
            "#4AA02C",
            "#4863A0",
            "#57E964",
            "#FFE87C",
            "#E67451",

            "#ECE5B6",
            "#E78A61",
            "#483C32",
            "#CCFB5D",
            "#008080",
            "#D2B9D3",
            "#81D8D0",
            "#C88141",
            "#7DFDFE",
            "#C25A7C",
            "#43C6DB",
            "#C45AEC",

            "#E55451",
            "#565051",
            "#F3E5AB",
            "#7E354D",
            "#728C00",
            "#7E587E",
            "#8D38C9",
            "#F6358A",

            "#EBF4FA",
            "#FC6C85",
            "#FFFFFF",
            "#C6AEC7",
            "#966F33",

            "#FFFF00",
            "#52D017",

            "#54C571",

    };
    // Preferences and their default values
    public static boolean DEBUGGING = true;
    public static boolean CHECK_SIZE = true;
    public static boolean TIMBER = false;
}
