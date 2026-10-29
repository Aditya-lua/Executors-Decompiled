/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa33210..0xa33254 (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_a33254;
extern long long g_f0d560;
extern long long g_f12800;

unsigned long long sub_a33210(void)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (g_f12800)
    {
        sub_ad6958(g_f12800, &g_a33254);
        g_f12800 = 0;
    }
    v2 = sub_a7c1d0(g_f0d560);
    g_f0d560 = 0;
    return v2;
}
