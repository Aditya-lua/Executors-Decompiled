/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3cf69c..0x3cf884 (488 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3cf69c_0 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    uint128_t field_40;
    uint128_t field_50;
    uint128_t field_60;
    uint128_t field_70;
    uint128_t field_80;
    uint128_t field_90;
    uint128_t field_a0;
    uint128_t field_b0;
    uint128_t field_c0;
    uint128_t field_d0;
    uint128_t field_e0;
    uint128_t field_f0;
    uint128_t field_100;
    uint128_t field_110;
    uint128_t field_120;
    uint128_t field_130;
    uint128_t field_140;
    uint128_t field_150;
    uint128_t field_160;
    uint128_t field_170;
    uint128_t field_180;
    uint128_t field_190;
    uint128_t field_1a0;
    uint128_t field_1b0;
    uint128_t field_1c0;
    uint128_t field_1d0;
    uint128_t field_1e0;
    uint128_t field_1f0;
    unsigned short field_200;
    char padding_202[766];
    char field_500;
    char padding_501[259];
    unsigned int field_604;
    char padding_608[64];
    unsigned int field_648;
    unsigned int field_64c;
} st_3cf69c_0;

typedef struct st_3cf69c_1 {
    unsigned long long field_0;
} st_3cf69c_1;

extern st_3cf69c_1 *g_f0b120;

unsigned int sub_3cf69c(st_3cf69c_0 *a0, int *a1)
{
    unsigned int v2;  // x8
    unsigned int v3;  // x10
    unsigned short *iter;  // x1
    char *v13;  // x2
    char *v14;  // x2
    uint128_t v16;  // q0
    unsigned int v17;  // x11
    unsigned int v18;  // w8
    char v19;  // x8
    char *node;  // x14
    unsigned int v21;  // w15
    char *v4;  // x9
    unsigned int v22;  // w15
    unsigned int v5;  // x13
    unsigned long long v6;  // 4121
    unsigned int v7;  // w8
    unsigned int v8;  // w12
    unsigned short *v9;  // x10
    unsigned int idx;  // x16
    unsigned int v11;  // x2
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = 0;
    v3 = 0;
    v4 = &a0->field_500;
    do
    {
        if (a1[v2] >= 1)
        {
            v5 = 0;
            while (1)
            {
                v4[v5 + v3] = (char)v2 + 1;
                v6 = arm64g_calculate_condition(1, -(0x100 < (int)v3 ? v3 : 0x100) + (v3 & 0xffffffff) & 0xffffffff, v5 & 0xffffffff, 0);
                if (v6 & 1)
                    break;
                v5 += 1;
                if ((int)v5 >= a1[v2])
                {
                    v3 += v5;
                    goto LABEL_3cf6c4;
                }
            }
        }
LABEL_3cf6c4:
    } while ((v2 += 1, v2 != 16));
    v7 = 0;
    v8 = 0;
    v4[v3] = 0;
    v9 = &a0->field_200;
    idx = 1;
    while (1)
    {
        (&a0->field_64c)[idx] = v7 - v8;
        v11 = v7;
        if (idx == v4[v11])
        {
            iter = &v9[v11];
            v13 = &a0->padding_501[v11];
            do
            {
                v14 = v13;
                *iter = v8;
                iter += 1;
                v8 += 1;
                v7 += 1;
                v13 = v14 + 1;
            } while (idx == *v14);
            if (v8 - 1 >> ((char)idx & 31))
                break;
        }
        (&a0->field_604)[idx] = v8 << ((char)(16 - idx) & 31);
        v8 *= 2;
        idx += 1;
        if (idx == 0x11)
        {
            a0->field_648 = 0xffffffff;
            v16 = CONCAT(0xffffffffffffffff, 0xffffffffffffffff);
            a0->field_0 = v16;
            a0->field_10 = v16;
            a0->field_20 = v16;
            a0->field_30 = v16;
            a0->field_40 = v16;
            a0->field_50 = v16;
            a0->field_60 = v16;
            a0->field_70 = v16;
            a0->field_80 = v16;
            a0->field_90 = v16;
            a0->field_a0 = v16;
            a0->field_b0 = v16;
            a0->field_c0 = v16;
            a0->field_d0 = v16;
            a0->field_e0 = v16;
            a0->field_f0 = v16;
            a0->field_100 = v16;
            a0->field_110 = v16;
            a0->field_120 = v16;
            a0->field_130 = v16;
            a0->field_140 = v16;
            a0->field_150 = v16;
            a0->field_160 = v16;
            a0->field_170 = v16;
            a0->field_180 = v16;
            a0->field_190 = v16;
            a0->field_1a0 = v16;
            a0->field_1b0 = v16;
            a0->field_1c0 = v16;
            a0->field_1d0 = v16;
            a0->field_1e0 = v16;
            a0->field_1f0 = v16;
            if ((int)v7 < 1)
                return 1;
            v17 = 0;
            do
            {
                v18 = v4[v17];
                if (9 >= v18)
                {
                    v19 = 9 - v18;
                    node = (char *)a0 + (v9[v17] << (v19 & 31));
                    v21 = 1;
                    do
                    {
                        v22 = v21;
                        *node = v17;
                        node += 1;
                        v21 = v22 + 1;
                    } while (!(v22 >> (v19 & 31)));
                }
            } while ((v17 += 1, v17 != v7));
            return 1;
        }
    }
    g_f0b120();
}
