/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1e0a6c..0x1e18e0 (3700 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1e0a6c_0 {
    char padding_0[2];
    char field_2;
    char padding_3[61];
    struct st_1e0a6c_1 *field_40;
    unsigned long long field_48;
    struct st_1e0a6c_2 *field_50;
    struct st_1e0a6c_3 *field_58;
    char padding_60[24];
    unsigned long long field_78;
} st_1e0a6c_0;

typedef struct st_1e0a6c_3 {
    uint128_t field_0;
} st_1e0a6c_3;

typedef struct st_1e0a6c_1 {
    char padding_0[24];
    unsigned long long field_18;
} st_1e0a6c_1;

typedef struct st_1e0a6c_2 {
    char padding_0[32];
    unsigned long long field_20;
} st_1e0a6c_2;

typedef struct st_1e0a6c_4 {
    char field_0;
} st_1e0a6c_4;

typedef struct st_1e0a6c_5 {
    char padding_0[24];
    struct st_1e0a6c_0 *field_18;
    struct st_1e0a6c_2 *field_20;
    char padding_28[28];
    unsigned int field_44;
    char padding_48[40];
    char field_70;
} st_1e0a6c_5;

typedef struct st_1e0a6c_7 {
    unsigned long long field_0;
} st_1e0a6c_7;

typedef struct st_1e0a6c_6 {
    char padding_0[24];
    struct st_1e0a6c_7 *field_18;
    char padding_20[144];
    struct st_1e0a6c_7 *field_b0;
    char padding_b8[192];
    struct st_1e0a6c_7 *field_178;
} st_1e0a6c_6;

extern st_1e0a6c_6 *g_f0d3d8;
extern unsigned long long g_f0d528;

void sub_1e0a6c(st_1e0a6c_5 *a0, unsigned long long idx)
{
    unsigned long long v25;  // d9
    unsigned long long v26;  // d8
    unsigned long long v35;  // x20
    unsigned long long v36;  // x19
    unsigned long long v37;  // x30
    st_1e0a6c_0 *v38;  // x21
    st_1e0a6c_2 *v39;  // x9
    uint128_t *v40;  // x8
    long long v41;  // x24
    unsigned long v42;  // x10
    unsigned long long v43;  // x11
    unsigned long v44;  // x11
    unsigned long long v27;  // x28
    uint128_t *v45;  // x9
    long long i;  // x10
    uint128_t *iter;  // x11
    uint128_t *v48;  // x12
    long long v49;  // x10
    uint128_t *v50;  // x12
    unsigned long v52;  // x8
    unsigned long v53;  // x9
    unsigned long long v28;  // x27
    unsigned long long v29;  // x26
    unsigned long long v30;  // x25
    unsigned long long v31;  // x24
    unsigned long long v32;  // x23
    unsigned long long v33;  // x22
    unsigned long long v34;  // x21
    unsigned long long v0;  // [bp-0x108]
    unsigned int v1;  // [bp-0xfc]
    st_1e0a6c_4 **v2;  // [bp-0xf0], Other Possible Types: char
    st_1e0a6c_4 *v3;  // [bp-0xe8]
    st_1e0a6c_4 **v4;  // [bp-0xe0], Other Possible Types: char
    st_1e0a6c_4 *v5;  // [bp-0xd8]
    st_1e0a6c_4 **v6;  // [bp-0xd0], Other Possible Types: char
    st_1e0a6c_4 *v7;  // [bp-0xc8]
    st_1e0a6c_4 **v8;  // [bp-0xc0], Other Possible Types: char
    st_1e0a6c_4 *v9;  // [bp-0xb8]
    unsigned long long v10;  // [bp-0x70]
    unsigned long long v11;  // [bp-0x68]
    unsigned long long v12;  // [bp-0x60]
    unsigned long long v13;  // [bp-0x58]
    unsigned long long v14;  // [bp-0x50]
    unsigned long long v15;  // [bp-0x48]
    unsigned long long v16;  // [bp-0x40]
    unsigned long long v17;  // [bp-0x38]
    unsigned long long v18;  // [bp-0x30]
    unsigned long long v19;  // [bp-0x28]
    unsigned long long v20;  // [bp-0x20]
    unsigned long long v21;  // [bp-0x18]
    char *v22;  // [bp-0x10]
    unsigned long long v23;  // [bp-0x8]
    char v24;  // [bp+0x0]

    v10 = v25;
    v11 = v26;
    v12 = v27;
    v13 = v28;
    v14 = v29;
    v15 = v30;
    v16 = v31;
    v17 = v32;
    v18 = v33;
    v19 = v34;
    v20 = v35;
    v21 = v36;
    v22 = &v24;
    v23 = v37;
    v3 = &v2;
    v2 = &v3;
    v38 = a0->field_18;
    if (v38)
    {
        v39 = v38->field_50;
        if (v39 == a0->field_20)
        {
            v40 = v38->field_58;
            if (((char *)v40 - v38->field_48 & 0xffffffff0) == 16)
            {
                v41 = a0->field_44;
                if (!((unsigned long long)(v41) >> 31 & 1))
                {
                    v42 = *(long long *)(idx + 88);
                    v43 = v42 - *(long long *)(idx + 72) >> 4;
                    if ((int)v43 >= (int)v41 && v41 <= (long long)(v38->field_40->field_18 - (char *)v40 >> 4))
                    {
                        if ((int)v41)
                        {
                            v5 = &v4;
                            v4 = &v5;
                            if (v38 != idx)
                            {
                                if (*(long long *)(idx + 80) != v39)
                                {
                                    v7 = &v6;
                                    v6 = &v7;
                                    v0 = v43 - v41;
                                    v1 = (unsigned int)v0 + 1;
                                    v9 = &v8;
                                    v8 = &v9;
                                    g_f0d3d8->field_178();
                                }
                                v44 = v38->field_2;
                                if (v44 >> 2 & 1)
                                {
                                    v38->field_2 = (char)v44 & 251;
                                    v38->field_78 = v39->field_20;
                                    v39->field_20 = v38;
                                    v40 = v38->field_58;
                                    v42 = *(long long *)(idx + 88);
                                }
                                v45 = v42 - v41 * 16;
                                i = v41;
                                iter = v40;
                                v48 = v45;
                                do
                                {
                                    v49 = i;
                                    v50 = v48 + 1;
                                    *iter = *v48;
                                    iter += 1;
                                    i = v49 - 1;
                                    v48 = v50;
                                } while (i);
                                *(uint128_t **)(idx + 88) = v45;
                                v38->field_58 = &v40[v41];
                            }
                        }
                        a0->field_70 = 5;
                        g_f0d3d8->field_b0();
                    }
                }
            }
        }
    }
    v52 = *(long long *)(idx + 88);
    v53 = *(long long *)(idx + 72);
    if (v53 > (unsigned long long)*(long long *)(idx + 88))
    {
        do
        {
            *(unsigned long *)(idx + 88) = v52 + 16;
            *(unsigned int *)(v52 + 12) = 0;
            v52 = *(long long *)(idx + 88);
            v53 = *(long long *)(idx + 72);
        } while ((unsigned long long)*(long long *)(idx + 88) < (unsigned long long)*(long long *)(idx + 72));
    }
    *(unsigned long *)(idx + 88) = v53;
    _strlen(g_f0d528 + 2242);
    g_f0d3d8->field_18();
}
