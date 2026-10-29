/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc4bed0..0xc4c298 (968 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c4bed0_1 {
    char padding_0[24];
    struct st_c4bed0_2 *field_18;
} st_c4bed0_1;

typedef struct st_c4bed0_2 {
    char padding_0[72];
    unsigned int field_48;
} st_c4bed0_2;

typedef struct st_c4bed0_0 {
    uint128_t field_0;
    char field_8;
    char padding_9[7];
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    uint128_t field_40;
    uint128_t field_50;
    unsigned long long field_60;
} st_c4bed0_0;


double sub_c4bed0(st_c4bed0_0 *a0, void* a1, unsigned long long a2, unsigned long long *a3)
{
    void* v31;  // x21
    unsigned int v32;  // w8
    unsigned int idx;  // x10
    unsigned long v42;  // x23
    unsigned int v43;  // x1
    unsigned long v44;  // x25
    uint128_t v45;  // q0
    unsigned long long v46;  // 4106
    unsigned int v47;  // x8
    unsigned long v48;  // x12
    unsigned long long v49;  // x11
    unsigned long v33;  // x24
    unsigned int v50;  // x23
    unsigned int v51;  // x9
    unsigned long long v52;  // x10
    unsigned int v53;  // x8
    unsigned long v54;  // x9
    unsigned int v55;  // x10
    unsigned long v34;  // x25
    unsigned long v35;  // x26
    unsigned long v36;  // x10
    unsigned int v37;  // w9
    unsigned int index;  // x8
    unsigned int v39;  // w27
    unsigned int v40;  // x9
    unsigned int v0;  // [bp-0x158], Other Possible Types: unsigned long long
    uint128_t v1;  // [bp-0x158]
    unsigned long v2;  // [bp-0x150]
    char v3;  // [bp-0x150]
    uint128_t v4;  // [bp-0x148], Other Possible Types: void*, unsigned long
    unsigned int v5;  // [bp-0x140], Other Possible Types: unsigned long
    uint128_t v6;  // [bp-0x138], Other Possible Types: uint384_t
    uint128_t v7;  // [bp-0x128]
    uint128_t v8;  // [bp-0x118]
    unsigned int v9;  // [bp-0x100]
    uint128_t v10;  // [bp-0xf8], Other Possible Types: char, unsigned int, unsigned long
    uint128_t v11;  // [bp-0xf8]
    char v13;  // [bp-0xf7]
    unsigned int v14;  // [bp-0xf6]
    unsigned short v15;  // [bp-0xf2]
    unsigned long long *v16;  // [bp-0xf0], Other Possible Types: char, unsigned int
    char v17;  // [bp-0xef]
    unsigned int v18;  // [bp-0xee]
    unsigned int v19;  // [bp-0xea], Other Possible Types: unsigned short
    uint128_t v20;  // [bp-0xe8], Other Possible Types: unsigned int, unsigned long long, unsigned long
    unsigned long v21;  // [bp-0xe0], Other Possible Types: unsigned int
    st_c4bed0_1 *v22;  // [bp-0xd8]
    char v23;  // [bp-0xd0]
    char v24;  // [bp-0xc8]
    char v25;  // [bp-0xc7]
    unsigned int v26;  // [bp-0xc6]
    unsigned short v27;  // [bp-0xc2]
    uint128_t v28;  // [bp-0xc0]
    char *v29;  // [bp-0x10]
    char v30;  // [bp+0x0]

    v29 = &v30;
    v31 = a1;
    v32 = (char)a1[536];
    if (v32 == 83)
    {
        if ((long long)v31[80] == 1)
        {
            v33 = (long long)v31[392];
            if (v33)
                v34 = (long long)v31[400];
            v35 = (long long)v31[88];
            v36 = (long long)v31[48];
            v0 = (long long)v31[40];
            v2 = (long long)v31[48];
            v4 = v31;
            v5 = (long long)v31[368] + 16;
            *(unsigned long long *)&v6 = 0;
            v9 = 0;
            sub_c539d8(&v10, &v0);
            v37 = v10;
            if (v37 == 82)
            {
                index = *(unsigned long long *)&v6;
                if (index)
                {
                    if ((unsigned short)(short)v31[74] < 5)
                        v39 = 8496;
                    else
                        v39 = 118;
                    v40 = *(unsigned long long *)((void*)&v6 + 8);
                    idx = *(unsigned long long *)((void*)&v6 + 16);
                    if (*(long long *)idx == 1)
                    {
                        v42 = *(long long *)(idx + 16);
                        v43 = *(long long *)(idx + 24);
                        v10 = index;
                        v16 = v40;
                        v20 = *(long long *)(idx + 16);
                        v21 = v43;
                        v22 = &v6;
                        if (v43)
                            goto LABEL_c4bff0;
                    }
                    else
                    {
                        v43 = *(long long *)(idx + 8);
                        if (6 <= v43)
                        {
                            sub_c73bb0(0);
                            __debugbreak();
                        }
                        v42 = idx + 16;
                        v10 = index;
                        v16 = v40;
                        v20 = v42;
                        v21 = v43;
                        v22 = &v6;
                        if (v43)
                        {
LABEL_c4bff0:
                            v44 = v43 - 1;
                            while (1)
                            {
                                v46 = arm64g_calculate_condition(2, v44, 1, 0);
                                if (!(v46 & 1))
                                {
                                    sub_c4cbcc(&v23, &v10, v22->field_18->field_48, v42);
                                    v47 = v23;
                                    if (v47 != 46)
                                    {
                                        v42 += 16;
                                        v45 = v28;
                                        v20 = v42;
                                        v21 = v44;
                                        v44 -= 1;
                                        if (v39 == *(unsigned short *)((void*)&v28 + 8))
                                        {
                                            v16 = v24;
                                            v17 = v25;
                                            v18 = v26 | v27 * 0;
                                            v19 = 0;
                                            v10 = v47;
                                            v20 = v45;
                                            sub_c4eda0(&v23, &v10);
                                            v48 = v23;
                                            v37 = v24;
                                            v36 = v25;
                                            v49 = v26 | v27 * 0x100000000;
                                            index = v28;
                                            if (v48 == 47)
                                                goto LABEL_c4c184;
                                            v10 = v48;
                                            v16 = v37;
                                            v17 = v36;
                                            v18 = v49;
                                            v19 = v49 >> 32;
                                            v20 = index;
                                            v50 = *a3;
                                            if (v10 == 46)
                                            {
                                                v51 = 0;
                                                goto LABEL_c4c108;
                                            }
                                            else
                                            {
                                                sub_c4b058(&v0, v50 + 16, (char)v31[73], (long long)v31[416], &v10);
                                                v51 = v2;
                                                index = (unsigned int)v4;
                                                if (v0 != 1)
                                                    goto LABEL_c4c108;
                                                else
                                                    goto LABEL_c4c190;
                                            }
                                        }
                                    }
                                    else
                                    {
                                        v37 = v24;
                                        v36 = v25;
                                        v49 = v26 | v27 * 0x100000000;
                                        index = v28;
                                        goto LABEL_c4c184;
                                    }
                                }
                                else
                                {
                                    index = (unsigned int)v22;
                                    if (!(*(int *)(index + 40) & 1))
                                    {
                                        v52 = *(long long *)index;
                                        *(unsigned long long *)(index + 40) = 1;
                                        *(unsigned long long *)(index + 48) = v10 - v52;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    v51 = 0;
                    v50 = *a3;
                    do
                    {
LABEL_c4c108:
                        /* unsupported instruction */;
                        /* unsupported instruction */;
                    } while (/* unsupported instruction */ ^ 1);
                    if ((long long)/* unsupported instruction */ < 0)
                        __debugbreak();
                    v1 = CONCAT(v35, v50);
                    v4 = CONCAT(v34, v33);
                    v6 = CONCAT(index, v51);
                    v7 = CONCAT(a3, v31);
                    v8 = CONCAT(v31, v31);
                    v10 = _INSERT(CONCAT(v10, 0), 8, a3);
                    v20 = a2;
                    v11 = _INSERT(v10, 0, v31);
                    if (v50)
                    {
                        a0->field_0 = v1;
                        *(uint128_t *)&a0->field_8 = v4;
                        *(unsigned long long *)&a0->field_50 = v20;
                        a0->field_30 = v8;
                        a0->field_40 = v11;
                        a0->field_10 = v6;
                        a0->field_20 = v7;
                        return (unsigned long long)v7;
                    }
                    goto LABEL_c4c1f4;
                }
                else
                {
                    v37 = 69;
                }
            }
            else
            {
                v36 = v13;
                v49 = v14 | v15 * 0x100000000;
                index = v16;
            }
LABEL_c4c184:
            v51 = v37 & 0xffffffffffff0000 | (v37 & 0xffffffffffff00ff | (v36 * 0x100 | v36 >> 56) & 0xff00) & 0xffff | v49 * 0x10000;
LABEL_c4c190:
            v10 = v51;
            v16 = index;
            v32 = (char)v31[536];
            if (v32 == 83)
            {
                sub_c796e8(v31 + 536, &v10);
                v32 = (char)v31[536];
            }
        }
        else
        {
            sub_c78464(v31 + 536);
            v32 = (char)v31[536];
        }
    }
    if (v32 == 82)
    {
        v53 = (long long)v31[544];
        if (v53)
        {
            v54 = *(long long *)(v53 + 448) + 16;
            v55 = 2;
        }
        else
        {
            v55 = 0;
            v54 = *a3 + 16;
            v53 = (unsigned int)v31;
        }
    }
    else
    {
        v54 = (long long)v31[536];
        v53 = (long long)v31[544];
        v55 = 3;
    }
    v3 = v55;
    v4 = v54;
    v5 = v53;
    v0 = 0;
    v16 = a3;
    v20 = a2;
    v11 = (uint128_t)v31;
LABEL_c4c1f4:
    sub_c4c7a4((char *)&a0->field_0 + 8, &v11, &v3);
    *(unsigned long long *)&a0->field_0 = 0;
    return (unsigned long long)v45;
}
