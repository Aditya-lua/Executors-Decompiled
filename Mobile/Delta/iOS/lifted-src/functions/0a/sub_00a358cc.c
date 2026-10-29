/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa358cc..0xa35970 (164 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_a36720;
extern long long g_a36768;
extern long long g_f128d0;
extern unsigned long long g_f128d8;
extern unsigned int g_f128e0;

long long sub_a358cc(void)
{
    unsigned long v2;  // x0
    unsigned int v3;  // w8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6afb8(0x40000, 0);
    if ((unsigned int)v2 && !(v2 = sub_a7c11c(), g_f128d0 = v2, !v2))
    {
        v2 = sub_a66520(sub_a66530(&g_a36720, &g_a36768), " ", "@", " ", "@");
        g_f128d8 = v2;
        if (v2)
        {
            v3 = 1;
        }
        else
        {
            v2 = sub_a7c1d0(g_f128d0);
            v3 = 0;
            g_f128d0 = 0;
        }
    }
    else
    {
        v3 = 0;
    }
    g_f128e0 = v3;
    return v2;
}
