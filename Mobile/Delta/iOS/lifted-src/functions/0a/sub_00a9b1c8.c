/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa9b1c8..0xa9b220 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_a9b220;
extern long long g_f12f38;
extern long long g_f12f40;
extern long long g_f12f48;

unsigned long long sub_a9b1c8(void)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    sub_ad6958(g_f12f48, &g_a9b220);
    sub_ad6020(g_f12f40);
    v2 = sub_a7c1d0(g_f12f38);
    g_f12f48 = 0;
    g_f12f40 = 0;
    g_f12f38 = 0;
    return v2;
}
