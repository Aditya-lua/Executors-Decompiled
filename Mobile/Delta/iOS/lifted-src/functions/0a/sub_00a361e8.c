/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa361e8..0xa362b8 (208 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_a358cc;
extern long long g_f086e8;
extern long long g_f128d0;
extern long long g_f128d8;
extern char g_f128e0;

unsigned long long sub_a361e8(unsigned long long a0)
{
    unsigned int v3;  // w0
    unsigned long long v4;  // x20
    unsigned long v0;  // [bp-0x40]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = sub_a7c208(&g_f086e8, &g_a358cc);
    if (a0 >> 31 & 1)
    {
        return 0;
    }
    else if (!v3)
    {
        return 0;
    }
    else if (*(int *)&g_f128e0)
    {
        v0 = a0 & 0x7fffffff;
        if (sub_a7c17c(g_f128d0))
        {
            v4 = sub_a66b6c(g_f128d8, &v0);
            sub_a7c1b4(g_f128d0);
            if (v4)
                return *(long long *)(v4 + 8);
        }
        v0 = a0 & 0x7fffff;
        if (!sub_a7c17c(g_f128d0))
            return 0;
        v4 = sub_a66b6c(g_f128d8, &v0);
        sub_a7c1b4(g_f128d0);
        if (v4)
            return *(long long *)(v4 + 8);
        return 0;
    }
    else
    {
        return 0;
    }
}
