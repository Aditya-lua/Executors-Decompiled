/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x58b6c..0x58c74 (264 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_f011c0;
extern unsigned short g_f0cfb8;
extern unsigned long long g_f0cfc0;
extern unsigned long long g_f0cfc8;
extern unsigned int g_f0cfd0;
extern unsigned short g_f0cfd8;
extern unsigned long long g_f0cfe0;
extern unsigned long long g_f0cfe8;
extern unsigned int g_f0cff0;
extern unsigned short g_f0cff8;
extern unsigned long long g_f0d000;
extern unsigned long long g_f0d008;
extern unsigned int g_f0d010;
extern unsigned short g_f0d018;
extern unsigned long long g_f0d020;
extern unsigned long long g_f0d028;
extern unsigned int g_f0d030;
extern unsigned short g_f0d038;
extern unsigned long long g_f0d040;
extern unsigned long long g_f0d048;
extern unsigned int g_f0d050;
extern unsigned short g_f0d058;
extern unsigned long long g_f0d060;
extern unsigned long long g_f0d068;
extern unsigned int g_f0d070;
extern unsigned short g_f0d078;
extern unsigned long long g_f0d080;
extern unsigned long long g_f0d088;
extern unsigned int g_f0d090;
extern long long g_f0db1c;

void sub_58b6c(void)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    g_f0cfb8 = 0;
    g_f0cfc0 = "LuauDirectFieldGet";
    g_f0cfc8 = g_f011c0;
    g_f0cfd0 = 0;
    g_f011c0 = &g_f0cfb8;
    sub_137d0(&g_f0db1c, "LuauDirectFieldGet", 3);
    g_f0cfd8 = 0;
    g_f0cfe0 = "LuauCIProto";
    g_f0cfe8 = g_f011c0;
    g_f0cff0 = 0;
    g_f0cff8 = 0;
    g_f0d000 = "DebugLuauUserDefinedClassesRuntime";
    g_f0d008 = &g_f0cfd8;
    g_f0d010 = 0;
    g_f0d018 = 0;
    g_f0d020 = "LuauCallFeedback";
    g_f0d028 = &g_f0cff8;
    g_f0d030 = 0;
    g_f0d038 = 0;
    g_f0d040 = "LuauYieldIter2";
    g_f0d048 = &g_f0d018;
    g_f0d050 = 0;
    g_f0d058 = 0;
    g_f0d060 = "LuauPromoteProto";
    g_f0d068 = &g_f0d038;
    g_f0d070 = 0;
    g_f0d078 = 0;
    g_f0d080 = "LuauBackedgeHeapCheck";
    g_f0d088 = &g_f0d058;
    g_f0d090 = 0;
    g_f011c0 = &g_f0d078;
    sub_137d0();
    return;
}
