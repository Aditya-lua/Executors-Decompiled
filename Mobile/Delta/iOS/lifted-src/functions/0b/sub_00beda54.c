/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbeda54..0xbedb98 (324 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_beda54_0 {
    char padding_0[1];
    unsigned short field_1;
} st_beda54_0;

extern unsigned long long g_98967f;

long long sub_beda54(unsigned long long *a0, long long a1)
{
    unsigned long long v3;  // x9
    unsigned long long v4;  // 4132
    unsigned long long v13;  // x13
    unsigned long long v14;  // 4110
    unsigned long long v15;  // 4102
    unsigned long long v16;  // 4110
    unsigned long long v17;  // 4102
    unsigned long long v5;  // x11
    st_beda54_0 *iter;  // x13
    unsigned long long v7;  // x12
    unsigned long long i;  // x1
    unsigned int v9;  // w2
    unsigned int v10;  // w3
    unsigned long long node;  // x12
    unsigned long v12;  // cc_dep1
    uint224_t v0;  // [bp-0x24]
    uint96_t v1;  // [bp-0x14]
    char v2;  // [bp+0x0]

    v1 = _INSERT(*(uint96_t *)((void*)&v0 + 4), 4, &v2);
    v3 = *a0;
    v4 = arm64g_calculate_condition(84, v3, 0, 0);
    if (v4 & 1)
        v5 = v3;
    else
        v5 = -v3;
    if (v5 >= 1000)
    {
        iter = (char *)&v1 + 3;
        v7 = 0xffffffffffffffec;
        do
        {
            i = v5;
            v5 /= 10000;
            v9 = (unsigned int)i - 10000 * (unsigned int)v5;
            v10 = 5243 * ((v9 * 0x40000000 | v9 >> 2) & 0xc0003fff & 0x3fff) >> 0x11;
            *(short *)((char *)iter - 3) = *(short *)(2 * v10 + 14721940);
            *(short *)((char *)iter - 1) = *(short *)(2 * (v9 - 100 * v10 & 0xffff) + 14721940);
            v7 += 4;
            iter = (char *)iter - 4;
        } while (&g_98967f < i);
        node = -v7;
        v12 = v5;
        if (9 < v5)
            goto LABEL_bedb10;
    }
    else
    {
        node = 20;
        v12 = v5;
        if (v5 > 9)
        {
LABEL_bedb10:
            node -= 2;
            v13 = 5243 * (__ROL__((unsigned int)v5, 30) & 0xc0003fff & 0x3fff) >> 0x11;
            *(short *)((char *)&v0 + node) = *(short *)(2 * ((unsigned int)v5 - 100 * (unsigned int)v13 & 0xffff) + 14721940);
            v5 = v13;
        }
    }
    if (v3)
    {
        v14 = arm64g_calculate_condition(20, v12, 9, 0);
        v15 = arm64g_calculate_condition(4, (v14 & 1 ? v5 : 0), 0, 0);
        if (!(v15 & 1))
            goto LABEL_bedb4c;
    }
    else
    {
        v16 = arm64g_calculate_condition(20, v12, 9, 0);
        v17 = arm64g_calculate_condition(0, (v16 & 1 ? v5 : 0), 0, 0);
        if (!(v17 & 1))
        {
LABEL_bedb4c:
            node -= 1;
            *((char *)&v0 + node) = *(char *)(((v5 * 2 | v5 >> 63) & 30 & 31) + 14721941);
        }
    }
    return sub_be8310(a1, (unsigned int)(v3 >> 63) ^ 1, 1, 0, (char *)&v0 + node, 20 - node);
}
