/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaea738..0xaea7f4 (188 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_f099a8;
extern char g_f13288;

unsigned int sub_aea738(unsigned long a0, unsigned int a1, unsigned long a2)
{
    unsigned long long v3;  // 4112
    unsigned int v4;  // w8
    unsigned long long v5;  // x0
    unsigned long long v6;  // x0
    unsigned long long v7;  // 4116
    unsigned int v0;  // [bp-0x60]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (!sub_aea7f4())
        return 0xffffffff;
    v3 = arm64g_calculate_condition(1, a1, 1, 0);
    if (v3 & 1)
        return 1;
    v4 = a1 - 1;
    if (10 > v4)
    {
        v5 = &(&g_f099a8)[v4 * 48];
    }
    else if (*(long long *)&g_f13288)
    {
        v0 = a1;
        v6 = sub_ad66d4(*(long long *)&g_f13288, &v0);
        if (v6 >> 31 & 1)
            return 0xffffffff;
        v7 = arm64g_calculate_condition(65, v6 & 0xffffffff, 10, 0);
        if (!(v7 & 1))
            v5 = sub_ad69f8(*(long long *)&g_f13288);
        else
            v5 = 0;
    }
    else
    {
        return 0xffffffff;
    }
    (*(long long *)(v5 + 16))();
}
