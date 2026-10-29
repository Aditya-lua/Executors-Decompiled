/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x31c68..0x31d1c (180 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_f011c0;
extern unsigned short g_f0cc58;
extern unsigned long long g_f0cc60;
extern unsigned long long g_f0cc68;
extern unsigned int g_f0cc70;
extern unsigned short g_f0cc78;
extern unsigned long long g_f0cc80;
extern unsigned long long g_f0cc88;
extern unsigned int g_f0cc90;
extern unsigned short g_f0cc98;
extern unsigned long long g_f0cca0;
extern unsigned long long g_f0cca8;
extern unsigned int g_f0ccb0;
extern unsigned short g_f0ccb8;
extern unsigned long long g_f0ccc0;
extern unsigned long long g_f0ccc8;
extern unsigned int g_f0ccd0;
extern long long g_f0d670;

void sub_31c68(void)
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
    g_f0cc58 = 0;
    g_f0cc60 = "LuauEmitCallFeedback";
    g_f0cc68 = g_f011c0;
    g_f0cc70 = 0;
    g_f0cc78 = 0;
    g_f0cc80 = "LuauVirtualBcBuilder";
    g_f0cc88 = &g_f0cc58;
    g_f0cc90 = 0;
    g_f0cc98 = 0;
    g_f0cca0 = "LuauBytecodeCostModel";
    g_f0cca8 = &g_f0cc78;
    g_f0ccb0 = 0;
    g_f011c0 = &g_f0cc98;
    sub_137d0(&g_f0d670, "LuauBytecodeCostModel", 2);
    g_f0ccb8 = 0;
    g_f0ccc0 = "LuauCompileEmitVectorDouble";
    g_f0ccc8 = g_f011c0;
    g_f0ccd0 = 0;
    g_f011c0 = &g_f0ccb8;
    sub_137d0();
    return;
}
