/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6b4b4..0xa6b540 (140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f12df8;
extern long long g_f12e08;
extern long long g_f12e10;
extern long long g_f12e18;
extern unsigned int g_f12e30;

unsigned long long sub_a6b4b4(void)
{
    unsigned long long v2;  // x0
    long long v3;  // w8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    g_f12e08 = sub_a7c11c();
    if (g_f12e08 && !(g_f12e10 = sub_a7c11c(), !g_f12e10 || !sub_a6b83c(sub_a67080()) || (v2 = sub_a6b7dc(&g_f12e18, 0), !(unsigned int)v2)))
    {
        v3 = 1;
        g_f12df8 = 1;
    }
    else
    {
        sub_a7c1d0(g_f12e08);
        g_f12e08 = 0;
        v2 = sub_a7c1d0(g_f12e10);
        v3 = 0;
        g_f12e10 = 0;
    }
    g_f12e30 = v3;
    return v2;
}
