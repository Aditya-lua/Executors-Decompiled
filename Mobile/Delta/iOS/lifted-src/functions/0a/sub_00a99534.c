/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa99534..0xa995ac (120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_a995ac;
extern long long g_a995c8;
extern long long g_a995dc;
extern long long g_f12f20;
extern long long g_f12f28;

unsigned long long sub_a99534(void)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (g_f12f20)
    {
        sub_a19710(g_f12f20, 0);
        sub_a66c58(g_f12f20, &g_a995ac);
        sub_a66c58(g_f12f20, &g_a995c8);
        sub_a66c58(g_f12f20, &g_a995dc);
        sub_a66664(g_f12f20);
        g_f12f20 = 0;
    }
    v2 = sub_a7c1d0(g_f12f28);
    g_f12f28 = 0;
    return v2;
}
