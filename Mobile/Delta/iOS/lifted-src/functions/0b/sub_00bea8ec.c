/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbea8ec..0xbeaa1c (304 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_98967f;

long long sub_bea8ec(unsigned int *a0, long long a1)
{
    unsigned long v4;  // x9
    unsigned long v5;  // x10
    unsigned long long v14;  // 4112
    unsigned long long v15;  // 4102
    unsigned long long v16;  // 4112
    unsigned long long v17;  // 4102
    unsigned long v6;  // x11
    unsigned int i;  // w0
    unsigned int v8;  // w2
    unsigned int v9;  // w3
    unsigned short *v10;  // x4
    unsigned long iter;  // x10
    unsigned long v12;  // cc_dep1
    unsigned long v13;  // x12
    long double v0;  // [bp-0x1a]
    long double v1;  // [bp-0x1a]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = *a0;
    if ((unsigned int)v4 >= 1000)
    {
        v5 = 0;
        v1 = v0;
        v6 = v4;
        do
        {
            i = v6;
            v6 = (unsigned int)v6 / 10000;
            v8 = i - 10000 * (unsigned int)v6;
            v9 = 5243 * ((v8 * 0x40000000 | v8 >> 2) & 0xc0003fff & 0x3fff) >> 0x11;
            v10 = (char *)&v1 + v5;
            v10[3] = *(short *)(2 * v9 + 14721940);
            v10[4] = *(short *)(2 * (v8 - 100 * v9 & 0xffff) + 14721940);
            v5 -= 4;
        } while (&g_98967f < i);
        iter = v5 + 10;
        v12 = v6 & 0xffffffff;
        if (9 < (unsigned int)v6)
            goto LABEL_bea998;
    }
    else
    {
        iter = 10;
        v6 = v4;
        v12 = v6 & 0xffffffff;
        v1 = v0;
        if ((unsigned int)v6 > 9)
        {
LABEL_bea998:
            iter -= 2;
            v13 = 5243 * (__ROL__((unsigned int)v6, 30) & 0xc0003fff & 0x3fff) >> 0x11;
            *(short *)((char *)&v1 + iter) = *(short *)(2 * ((unsigned int)v6 - 100 * (unsigned int)v13 & 0xffff) + 14721940);
            v6 = v13;
            v1 = v0;
        }
    }
    if ((unsigned int)v4)
    {
        v14 = arm64g_calculate_condition(19, v12, 9, 0);
        v15 = arm64g_calculate_condition(3, (v14 & 1 ? v6 & 0xffffffff : 0), 0, 0);
        if (!(v15 & 1))
            goto LABEL_bea9d4;
    }
    else
    {
        v16 = arm64g_calculate_condition(19, v12, 9, 0);
        v17 = arm64g_calculate_condition(0, (v16 & 1 ? v6 & 0xffffffff : 0), 0, 0);
        if (!(v17 & 1))
        {
LABEL_bea9d4:
            iter -= 1;
            *((char *)&v1 + iter) = *(char *)((__ROL__((unsigned int)v6, 1) & 30 & 31) + 14721941);
        }
    }
    return sub_be8310(a1, 1, 1, 0, (char *)&v1 + iter, 10 - iter);
}
