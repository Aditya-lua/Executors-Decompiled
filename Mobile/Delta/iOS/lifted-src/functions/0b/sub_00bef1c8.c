/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbef1c8..0xbef304 (316 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bef1c8_0 {
    char padding_0[1];
    unsigned short field_1;
} st_bef1c8_0;

extern unsigned long long g_98967f;

long long sub_bef1c8(unsigned long long *a0, long long a1)
{
    unsigned long long v3;  // x9
    st_bef1c8_0 *iter;  // x12
    unsigned long long v13;  // 4110
    unsigned long long v14;  // 4102
    unsigned long long v15;  // 4110
    unsigned long long v16;  // 4102
    unsigned long long v5;  // x10
    unsigned long long v6;  // x11
    unsigned long long i;  // x0
    unsigned int v8;  // w2
    unsigned int v9;  // w3
    unsigned long long node;  // x10
    unsigned long v11;  // cc_dep1
    unsigned long long v12;  // x12
    uint224_t v0;  // [bp-0x24]
    uint96_t v1;  // [bp-0x14]
    char v2;  // [bp+0x0]

    v1 = _INSERT(*(uint96_t *)((void*)&v0 + 4), 4, &v2);
    v3 = *a0;
    if (v3 >= 1000)
    {
        iter = (char *)&v1 + 3;
        v5 = 0xffffffffffffffec;
        v6 = v3;
        do
        {
            i = v6;
            v6 /= 10000;
            v8 = (unsigned int)i - 10000 * (unsigned int)v6;
            v9 = 5243 * ((v8 * 0x40000000 | v8 >> 2) & 0xc0003fff & 0x3fff) >> 0x11;
            *(short *)((char *)iter - 3) = *(short *)(2 * v9 + 14721940);
            *(short *)((char *)iter - 1) = *(short *)(2 * (v8 - 100 * v9 & 0xffff) + 14721940);
            v5 += 4;
            iter = (char *)iter - 4;
        } while (&g_98967f < i);
        node = -v5;
        v11 = v6;
        if (9 < v6)
            goto LABEL_bef280;
    }
    else
    {
        node = 20;
        v6 = v3;
        v11 = v3;
        if (v3 > 9)
        {
LABEL_bef280:
            node -= 2;
            v12 = 5243 * (__ROL__((unsigned int)v6, 30) & 0xc0003fff & 0x3fff) >> 0x11;
            *(short *)((char *)&v0 + node) = *(short *)(2 * ((unsigned int)v6 - 100 * (unsigned int)v12 & 0xffff) + 14721940);
            v6 = v12;
        }
    }
    if (v3)
    {
        v13 = arm64g_calculate_condition(20, v11, 9, 0);
        v14 = arm64g_calculate_condition(4, (v13 & 1 ? v6 : 0), 0, 0);
        if (!(v14 & 1))
            goto LABEL_bef2bc;
    }
    else
    {
        v15 = arm64g_calculate_condition(20, v11, 9, 0);
        v16 = arm64g_calculate_condition(0, (v15 & 1 ? v6 : 0), 0, 0);
        if (!(v16 & 1))
        {
LABEL_bef2bc:
            node -= 1;
            *((char *)&v0 + node) = *(char *)(((v6 * 2 | v6 >> 63) & 30 & 31) + 14721941);
        }
    }
    return sub_be8310(a1, 1, 1, 0, (char *)&v0 + node, 20 - node);
}
