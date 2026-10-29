/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbed91c..0xbeda54 (312 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_98967f;

long long sub_bed91c(void* a0, long long a1)
{
    unsigned int v4;  // w9
    unsigned long long v5;  // 4143
    unsigned int v14;  // w13
    unsigned long long v15;  // 4112
    unsigned long long v16;  // 4102
    unsigned long long v17;  // 4112
    unsigned long long v18;  // 4102
    unsigned int v6;  // w11
    unsigned long v7;  // x12
    unsigned int i;  // w1
    unsigned int v9;  // w2
    unsigned int v10;  // w3
    unsigned short *v11;  // x4
    unsigned long iter;  // x12
    unsigned long v13;  // cc_dep1
    long double v0;  // [bp-0x1a]
    long double v1;  // [bp-0x1a]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = *(int *)a0;
    v5 = arm64g_calculate_condition(83, v4, 0, 0);
    if (v5 & 1)
        v6 = v4;
    else
        v6 = -v4;
    if (v6 >= 1000)
    {
        v7 = 0;
        v1 = v0;
        do
        {
            i = v6;
            v6 /= 10000;
            v9 = i - 10000 * v6;
            v10 = 5243 * ((v9 * 0x40000000 | v9 >> 2) & 0xc0003fff & 0x3fff) >> 0x11;
            v11 = (char *)&v1 + v7;
            v11[3] = *(short *)(2 * v10 + 14721940);
            v11[4] = *(short *)(2 * (v9 - 100 * v10 & 0xffff) + 14721940);
            v7 -= 4;
        } while (&g_98967f < i);
        iter = v7 + 10;
        v13 = v6;
        if (9 < v6)
            goto LABEL_bed9cc;
    }
    else
    {
        iter = 10;
        v13 = v6;
        v1 = v0;
        if (v6 > 9)
        {
LABEL_bed9cc:
            iter -= 2;
            v14 = 5243 * (__ROL__(v6, 30) & 0xc0003fff & 0x3fff) >> 0x11;
            *(short *)((char *)&v1 + iter) = *(short *)(2 * (v6 - 100 * v14 & 0xffff) + 14721940);
            v6 = v14;
            v1 = v0;
        }
    }
    if (v4)
    {
        v15 = arm64g_calculate_condition(19, v13, 9, 0);
        v16 = arm64g_calculate_condition(3, (v15 & 1 ? v6 : 0), 0, 0);
        if (!(v16 & 1))
            goto LABEL_beda08;
    }
    else
    {
        v17 = arm64g_calculate_condition(19, v13, 9, 0);
        v18 = arm64g_calculate_condition(0, (v17 & 1 ? v6 : 0), 0, 0);
        if (!(v18 & 1))
        {
LABEL_beda08:
            iter -= 1;
            *((char *)&v1 + iter) = *(char *)((__ROL__(v6, 1) & 30 & 31) + 14721941);
        }
    }
    return sub_be8310(a1, ~v4 >> 31, 1, 0, (char *)&v1 + iter, 10 - iter);
}
