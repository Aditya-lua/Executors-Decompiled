/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa99328..0xa993d4 (172 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_a993d4;
extern long long g_a993fc;
extern unsigned long long g_f12f00;
extern unsigned long long g_f12f08;
extern unsigned long long g_f12f10;
extern unsigned int g_f12f18;

unsigned long long sub_a99328(unsigned long long a0)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!g_f12f10)
        return a0;
    g_f12f18 = a0;
    sub_a19700(g_f12f10);
    sub_a19710(g_f12f10, 0);
    sub_a66c58(g_f12f10, &g_a993d4);
    if (a0 >> 31 & 1)
    {
        sub_a66664(g_f12f10);
        sub_ad6958(g_f12f08, &g_a993fc);
        v2 = sub_a7c1d0(g_f12f00);
        g_f12f10 = 0;
        g_f12f08 = 0;
        g_f12f00 = 0;
        return v2;
    }
    return sub_a19710();
}
