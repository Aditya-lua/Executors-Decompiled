/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1e18e0..0x1e2f78 (5784 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1e18e0_1 {
    char padding_0[12];
    unsigned int field_c;
} st_1e18e0_1;

typedef struct st_1e18e0_3 {
    char padding_0[32];
    unsigned long long field_20;
} st_1e18e0_3;

typedef struct st_1e18e0_0 {
    char field_0;
} st_1e18e0_0;

typedef struct st_1e18e0_6 {
    char padding_0[368];
    struct st_1e18e0_7 *field_170;
} st_1e18e0_6;

typedef struct st_1e18e0_7 {
    unsigned long long field_0;
} st_1e18e0_7;

extern st_1e18e0_7 *g_f0b0d8;
extern st_1e18e0_6 *g_f0d3d8;
extern unsigned long long g_f0d528;

unsigned long long sub_1e18e0(unsigned long long idx, unsigned long long a1)
{
    void* v9;  // x0
    unsigned int v10;  // w8
    unsigned int v19;  // w11
    unsigned long long v20;  // 4112
    unsigned long long v21;  // 4102
    unsigned long long v22;  // 4112
    unsigned long long v23;  // 4102
    st_1e18e0_3 *v24;  // x12
    unsigned long long v25;  // w2
    uint128_t *v26;  // x11
    unsigned long v27;  // x8
    unsigned long long v28;  // x8
    st_1e18e0_1 *v11;  // x8
    uint128_t *v29;  // x9
    unsigned long long i;  // x10
    uint128_t *iter;  // x12
    uint128_t *v32;  // x13
    unsigned long long v33;  // x10
    uint128_t *v34;  // x13
    unsigned int v12;  // w9
    unsigned long long v13;  // x22
    unsigned long v14;  // cc_dep1
    unsigned long long index;  // x20
    unsigned long v16;  // x10
    unsigned long long *v17;  // x26
    unsigned long long v18;  // x9
    void* v0;  // [bp-0xf8]
    st_1e18e0_0 **v1;  // [bp-0xf0], Other Possible Types: char
    st_1e18e0_0 *v2;  // [bp-0xe8]
    st_1e18e0_0 **v3;  // [bp-0xc0], Other Possible Types: char
    st_1e18e0_0 *v4;  // [bp-0xb8]
    st_1e18e0_0 *v5;  // [bp-0xb0]
    st_1e18e0_0 **v6;  // [bp-0x80], Other Possible Types: char
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v2 = &v1;
    v1 = &v2;
    v9 = sub_1da1e0();
    if (v9)
    {
        if (a1)
        {
            v10 = (char)v9[112];
            switch (v10)
            {
            case 2:
LABEL_1e19dc:
                sub_1dd788();
                break;
            case 4:
                sub_1d8d90();
                break;
            default:
                *(char *)&v9[112] = 7;
                goto LABEL_1e19dc;
            }
        }
        else
        {
            v11 = *(long long *)(idx + 96) + (long long)v9[80];
            v12 = (char)v9[112];
            if (v12 == 4 && !(v13 = (int)v9[0x44], v13 >> 31 & 1))
            {
                if (*(long long *)(idx + 88) != &v11[v13 + 1] || v11->field_c != 2 || *(long long *)&v11->padding_0[0] != v9)
                    goto LABEL_1e1a8c;
                sub_1d8d90();
                if (!(int)v9[72])
                    return v13;
            }
            else
            {
                v14 = v12 & 0xff;
                if (v12 == 2)
                {
                    index = (long long)v9[16];
                    if ((long long)v9[16] || !(index = (long long)v9[8], !(long long)v9[8]))
                    {
                        v16 = *(long long *)(idx + 88);
                        v17 = idx + 88;
                        v18 = v16 - (char *)v11;
                        v19 = *(char *)(index + 3);
                        if (v19 != 6)
                        {
                            v20 = arm64g_calculate_condition(19, v14, 2, 0);
                            v21 = arm64g_calculate_condition(19, (v20 & 1 ? v19 & 0xff : 0x40000000), v20 & 1, 0);
                            if (!(v21 & 1))
                                goto LABEL_1e1a38;
                        }
                        else
                        {
                            v22 = arm64g_calculate_condition(19, v14, 2, 0);
                            v23 = arm64g_calculate_condition(16, (v22 & 1 ? v19 & 0xff : 0x40000000), v22 & 1, 0);
                            if (!(v23 & 1))
                            {
LABEL_1e1a38:
                                v24 = *(long long *)(index + 80);
                                if (v24 == *(long long *)(idx + 80))
                                {
                                    v25 = (unsigned int)(v18 >> 4);
                                    v26 = *(long long *)(index + 88);
                                    if (v25 <= (long long)(*(long long *)(*(long long *)(index + 64) + 24) - (char *)v26 >> 4))
                                    {
                                        if (v25 >= 1)
                                        {
                                            v4 = &v3;
                                            v3 = &v4;
                                            if (index != idx)
                                            {
                                                v5 = &v6;
                                                v6 = &v5;
                                                v27 = *(char *)(index + 2);
                                                if (v27 >> 2 & 1)
                                                {
                                                    *(char *)(index + 2) = (char)v27 & 251;
                                                    *(unsigned long long *)(index + 120) = v24->field_20;
                                                    v24->field_20 = index;
                                                    v26 = *(long long *)(index + 88);
                                                    v16 = *v17;
                                                }
                                                v28 = (v18 * 0x1000000000000000 | v18 >> 4) & 0xf00000007fffffff & 0x7fffffff;
                                                v29 = v16 - v28 * 16;
                                                i = v28;
                                                iter = v26;
                                                v32 = v29;
                                                do
                                                {
                                                    v33 = i;
                                                    v34 = v32 + 1;
                                                    *iter = *v32;
                                                    iter += 1;
                                                    i = v33 - 1;
                                                    v32 = v34;
                                                } while (i);
                                                *v17 = v29;
                                                *(uint128_t **)(index + 88) = &v26[v28];
                                            }
                                        }
                                        v0 = v9;
                                        *(char *)&v9[112] = 3;
                                        g_f0b0d8();
                                    }
                                }
                            }
                        }
                    }
                    *(st_1e18e0_1 **)(idx + 88) = v11;
                    sub_1dd788();
                    sub_d5c30(idx, g_f0d528 + 2242);
                    return 0;
                }
LABEL_1e1a8c:
                *(st_1e18e0_1 **)(idx + 88) = v11;
                if ((char)v9[112] == 5)
                {
                    *(unsigned int *)(*(long long *)(idx + 64) + 32) = 0;
                    *(unsigned int *)(*(long long *)(idx + 64) + 44) = *(int *)(*(long long *)(idx + 64) + 44) | 2;
                    *(long long *)(idx + 72) = *(long long *)(idx + 88);
                }
                else
                {
                    *(char *)&v9[112] = 1;
                    *(unsigned int *)(*(long long *)(idx + 64) + 32) = 0;
                    *(unsigned int *)(*(long long *)(idx + 64) + 44) = *(int *)(*(long long *)(idx + 64) + 44) | 2;
                    *(long long *)(idx + 72) = *(long long *)(idx + 88);
                }
                *(char *)(idx + 3) = 1;
                return 0xffffffff;
            }
        }
        g_f0d3d8->field_170();
    }
    else if (a1)
    {
        g_f0d3d8->field_170();
    }
    else
    {
        return (unsigned long long)(*(long long *)(idx + 88) - *(long long *)(idx + 72)) >> 4;
    }
}
