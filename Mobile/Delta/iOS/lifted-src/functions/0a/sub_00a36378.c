/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa36378..0xa36410 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_a362f8;
extern long long g_f08c38;
extern long long g_f128c8;
extern unsigned long long g_f129e4;

unsigned long long sub_a36378(unsigned long long *a0)
{
    unsigned int v2;  // w21
    unsigned long long v3;  // x0
    unsigned long long v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = *(int *)___error();
    v3 = sub_a6afb8(0x40000, 0);
    if (!(unsigned int)v3)
    {
        return v3;
    }
    else if (!sub_a7c208(&g_f08c38, &g_a362f8))
    {
        return 0;
    }
    else if ((int)g_f129e4)
    {
        *a0 = sub_a7bbe0(&g_f128c8);
        v4 = sub_a7bbe8(&g_f128c8, -0x1);
        if (!(unsigned int)v4)
            return v4;
        *(unsigned int *)___error() = v2;
        return 1;
    }
    else
    {
        return 0;
    }
}
