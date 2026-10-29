/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x25df8..0x260d4 (732 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_25df8_0 {
    char field_0;
} st_25df8_0;

extern unsigned long long g_f011c0;
extern unsigned long long g_f011c8;
extern unsigned int g_f0c950;
extern char g_f0c954;
extern unsigned long long g_f0c958;
extern unsigned long long g_f0c960;
extern unsigned int g_f0c968;
extern unsigned int g_f0c970;
extern char g_f0c974;
extern unsigned long long g_f0c978;
extern unsigned long long g_f0c980;
extern unsigned int g_f0c988;
extern unsigned int g_f0c990;
extern char g_f0c994;
extern unsigned long long g_f0c998;
extern unsigned long long g_f0c9a0;
extern unsigned int g_f0c9a8;
extern unsigned short g_f0c9b0;
extern unsigned long long g_f0c9b8;
extern unsigned long long g_f0c9c0;
extern unsigned int g_f0c9c8;
extern unsigned short g_f0c9d0;
extern unsigned long long g_f0c9d8;
extern unsigned long long g_f0c9e0;
extern unsigned int g_f0c9e8;
extern unsigned short g_f0c9f0;
extern unsigned long long g_f0c9f8;
extern unsigned long long g_f0ca00;
extern unsigned int g_f0ca08;
extern unsigned short g_f0ca10;
extern unsigned long long g_f0ca18;
extern unsigned long long g_f0ca20;
extern unsigned int g_f0ca28;
extern unsigned short g_f0ca30;
extern unsigned long long g_f0ca38;
extern unsigned long long g_f0ca40;
extern unsigned int g_f0ca48;
extern unsigned short g_f0ca50;
extern unsigned long long g_f0ca58;
extern unsigned long long g_f0ca60;
extern unsigned int g_f0ca68;
extern unsigned short g_f0ca70;
extern unsigned long long g_f0ca78;
extern unsigned long long g_f0ca80;
extern unsigned int g_f0ca88;
extern unsigned short g_f0ca90;
extern unsigned long long g_f0ca98;
extern unsigned long long g_f0caa0;
extern unsigned int g_f0caa8;
extern unsigned short g_f0cab0;
extern unsigned long long g_f0cab8;
extern unsigned long long g_f0cac0;
extern unsigned int g_f0cac8;
extern unsigned short g_f0cad0;
extern unsigned long long g_f0cad8;
extern unsigned long long g_f0cae0;
extern unsigned int g_f0cae8;
extern unsigned short g_f0caf0;
extern unsigned long long g_f0caf8;
extern unsigned long long g_f0cb00;
extern unsigned int g_f0cb08;
extern unsigned long long g_f0cbf8;
extern unsigned int g_f0cc00;
extern char g_f0cc08;
extern char g_f0cc28;
extern unsigned long long g_f0cc30;
extern long long g_f0d600;
extern char g_10002b0;

void sub_25df8(void)
{
    long long v11;  // x0
    long long v12;  // x0
    st_25df8_0 **v0;  // [bp-0x70], Other Possible Types: char
    st_25df8_0 *v1;  // [bp-0x68]
    unsigned long long v2;  // [bp-0x60]
    unsigned int v3;  // [bp-0x58]
    char v4;  // [bp-0x50]
    char v5;  // [bp-0x30]
    unsigned long v6;  // [bp-0x28]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v6 = *(long long *)&g_10002b0;
    g_f0c950 = 1000;
    g_f0c954 = 0;
    g_f0c958 = "LuauRecursionLimit";
    g_f0c960 = g_f011c8;
    g_f0c968 = 0;
    g_f0c970 = 1000;
    g_f0c974 = 0;
    g_f0c978 = "LuauTypeLengthLimit";
    g_f0c980 = &g_f0c950;
    g_f0c988 = 0;
    g_f0c990 = 100;
    g_f0c994 = 0;
    g_f0c998 = "LuauParseErrorLimit";
    g_f0c9a0 = &g_f0c970;
    g_f0c9a8 = 0;
    g_f011c8 = &g_f0c990;
    g_f0c9b0 = 0;
    g_f0c9b8 = "LuauSolverV2";
    g_f0c9c0 = g_f011c0;
    g_f0c9c8 = 0;
    g_f0c9d0 = 0x100;
    g_f0c9d8 = "DebugLuauReportReturnTypeVariadicWithTypeSuffix";
    g_f0c9e0 = &g_f0c9b0;
    g_f0c9e8 = 0;
    g_f0c9f0 = 0;
    g_f0c9f8 = "LuauIntegerType2";
    g_f0ca00 = &g_f0c9d0;
    g_f0ca08 = 0;
    g_f0ca10 = 0;
    g_f0ca18 = "LuauExportValueSyntax";
    g_f0ca20 = &g_f0c9f0;
    g_f0ca28 = 0;
    g_f011c0 = &g_f0ca10;
    sub_137d0(&g_f0d600, "LuauExportValueSyntax", 4);
    g_f0ca30 = 0;
    g_f0ca38 = "DebugLuauNoInline";
    g_f0ca40 = g_f011c0;
    g_f0ca48 = 0;
    g_f0ca50 = 0;
    g_f0ca58 = "DebugLuauUserDefinedClasses";
    g_f0ca60 = &g_f0ca30;
    g_f0ca68 = 0;
    g_f0ca70 = 0;
    g_f0ca78 = "LuauAllowGlobalDeclarationToBeCalledClass";
    g_f0ca80 = &g_f0ca50;
    g_f0ca88 = 0;
    g_f0ca90 = 0;
    g_f0ca98 = "LuauDisallowExternClassInTypeDefinitions";
    g_f0caa0 = &g_f0ca70;
    g_f0caa8 = 0;
    g_f0cab0 = 0;
    g_f0cab8 = "LuauStoreConstKeywordBegin";
    g_f0cac0 = &g_f0ca90;
    g_f0cac8 = 0;
    g_f0cad0 = 0;
    g_f0cad8 = "LuauTrackPrefixLocal";
    g_f0cae0 = &g_f0cab0;
    g_f0cae8 = 0;
    g_f0caf0 = 0;
    g_f0caf8 = "LuauNoDuplicateBinaryPrefix";
    g_f0cb00 = &g_f0cad0;
    g_f0cb08 = 0;
    g_f011c0 = &g_f0caf0;
    sub_269c4(___cxa_atexit(0x25550, 0, 0), 0, 0);
    v1 = &v0;
    v0 = &v1;
    v2 = "debugnoinline";
    v3 = 3;
    v4 = 0;
    v5 = 0;
    g_f0cbf8 = "debugnoinline";
    g_f0cc00 = 3;
    g_f0cc28 = 0;
    g_f0cc08 = 0;
    sub_219bc(&g_f0cc08, &v4);
    g_f0cc30 = &g_f0ca30;
    sub_1c480(&v4);
    sub_256c4(sub_26c00(___cxa_atexit(" w", 0, 0), 0, 0));
    if (*(long long *)&g_10002b0 == v6)
        return;
    v11 = ___stack_chk_fail();
    sub_1c480(&g_f0cc08);
    sub_1c480(&v4);
    v12 = __Unwind_Resume(v11);
    __Unwind_Resume(v12);
}
