/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc50994..0xc50d54 (960 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c50994_0 {
    char padding_0[1330];
    unsigned short field_532;
} st_c50994_0;

typedef struct st_c50994_3 {
    char padding_0[8];
    unsigned long long field_8;
    long long field_10;
} st_c50994_3;

typedef struct st_c50994_5 {
    char padding_0[8];
    unsigned long long field_8;
    unsigned long long field_10;
    struct st_c50994_0 *field_18;
    unsigned long long field_20;
} st_c50994_5;

typedef struct st_c50994_2 {
    char padding_0[40];
    unsigned long long field_28;
    unsigned long long field_30;
    unsigned long long field_38;
    char padding_40[8];
    unsigned int field_48;
    char field_49;
    char padding_4a[294];
    struct st_c50994_1 *field_170;
    char padding_178[40];
    long long field_1a0;
} st_c50994_2;

typedef struct st_c50994_1 {
    char padding_0[16];
    char field_10;
    char padding_11[7];
    unsigned long long field_18;
    unsigned long long field_20;
    struct st_c50994_0 *field_28;
    unsigned long long field_30;
} st_c50994_1;

typedef struct st_c50994_6 {
    char padding_0[82];
    unsigned short field_52;
} st_c50994_6;


double sub_c50994(void* a0, long long a1, long long a2, st_c50994_2 *a3, unsigned long long a4, long long a5, long long a6)
{
    unsigned long v17;  // x24
    unsigned long v18;  // cc_dep1
    unsigned long long v27;  // 4102
    uint128_t v28;  // q0
    unsigned long long v29;  // x8
    unsigned long long v30;  // w11
    st_c50994_1 *v31;  // x9
    st_c50994_2 *v32;  // x10
    unsigned long long v33;  // x12
    unsigned long long v34;  // x13
    char *v35;  // x14
    unsigned long v36;  // x15
    unsigned long long v19;  // x14
    unsigned long long v38;  // 4115
    unsigned long long v40;  // x10
    st_c50994_3 *v41;  // x8
    st_c50994_0 *v42;  // x10
    unsigned long v43;  // x9
    st_c50994_6 *v44;  // x12
    unsigned long long v45;  // x13
    unsigned long long v46;  // x14
    unsigned long long v20;  // x10
    unsigned long long v47;  // x11
    char v49;  // x15
    unsigned int i;  // w15
    long long v51;  // x25
    unsigned long long v52;  // x1
    unsigned long long v53;  // x28
    unsigned long long v54;  // x26
    unsigned long long v55;  // x26
    unsigned int v56;  // w8
    unsigned long long v21;  // x13
    st_c50994_2 *v58;  // x10
    unsigned long long v59;  // 4109
    void* v60;  // x8
    void* v61;  // x8
    void* v62;  // x10
    unsigned long long v22;  // x8
    unsigned long long v23;  // x8
    unsigned long long v24;  // 4110
    unsigned long long v25;  // 4102
    unsigned long long v26;  // 4110
    long long v0;  // [bp-0xf8]
    st_c50994_2 *v1;  // [bp-0xf0]
    unsigned long v2;  // [bp-0xe8]
    unsigned long v3;  // [bp-0xe0]
    unsigned long long v4;  // [bp-0xd8]
    st_c50994_5 *v5;  // [bp-0xc8]
    unsigned long long v6;  // [bp-0xc0]
    char v7;  // [bp-0xb8]
    uint128_t v8;  // [bp-0xb0]
    unsigned short v9;  // [bp-0xa0]
    unsigned long long v10;  // [bp-0x98]
    unsigned long long v11;  // [bp-0x90]
    st_c50994_2 *v12;  // [bp-0x88]
    char v13;  // [bp-0x80], Other Possible Types: unsigned long
    long long v14;  // [bp-0x78]
    char *v15;  // [bp-0x10]
    char v16;  // [bp+0x0]

    v15 = &v16;
    v17 = *((char *)&a3->field_48 + 1);
    v18 = v17 & 0xff;
    if ((unsigned int)v17 == 8)
        v19 = 12;
    else
        v19 = 4;
    v20 = a3->field_30;
    v21 = a3->field_38;
    v22 = v21 - v20 + v19;
    v23 = a4 - v22;
    if (v22 <= a4)
    {
        v24 = arm64g_calculate_condition(35, v18, 8, 0);
        v25 = arm64g_calculate_condition(52, (v24 & 1 ? v23 : 0x20000000), (v24 & 1 ? v20 : 0), 0);
        if (v25 & 1)
            goto LABEL_c509f8;
LABEL_c509e4:
        *(st_c50994_2 **)&a0[16] = a3;
        v28 = 0x3b0000000000000001;
        *(uint128_t *)a0 = 0x3b0000000000000001;
    }
    else
    {
        v26 = arm64g_calculate_condition(35, v18, 8, 0);
        v27 = arm64g_calculate_condition(48, (v26 & 1 ? v23 : 0x20000000), (v26 & 1 ? v20 : 0), 0);
        if (!(v27 & 1))
            goto LABEL_c509e4;
LABEL_c509f8:
        v29 = 0;
        v30 = 0;
        v31 = *(long long *)&a3->padding_4a[291];
        v5 = &v31->field_10;
        v6 = 0;
        v32 = a3->field_28 + v20;
        v33 = ~a4 + v19 + v21;
        v34 = a4 - v19 - v21;
        while (1)
        {
            v35 = &v32->padding_0[v34];
            v36 = *v35;
            if (v30 == 63 && 1 < (unsigned int)v36)
            {
                *(char *)&a0[8] = 6;
                memset(a0 + 9, 0, 7);
                *(st_c50994_2 **)&a0[16] = v32;
                *(unsigned long long *)a0 = 1;
                return (unsigned long long)v28;
            }
            v29 |= (v36 & 127) << ((char)v30 & 63);
            if (!(v36 >> 7 & 1))
                break;
            v30 += 7;
            v33 -= 1;
            v38 = arm64g_calculate_condition(50, v34, 1, 0);
            v34 += 1;
            if (!(v38 & 1))
            {
                *(char *)&a0[8] = 19;
                memset(a0 + 9, 0, 7);
                *(st_c50994_2 **)&a0[16] = v32;
                *(unsigned long long *)a0 = 1;
                return (unsigned long long)v28;
            }
        }
        v3 = v35 + 1;
        v4 = v33;
        if (!v29)
        {
            *(char *)&a0[8] = 58;
            *(unsigned long long *)a0 = 1;
            return (unsigned long long)v28;
        }
        v40 = v29 - 1;
        if (v31->field_20 > v40)
        {
            v41 = v31->field_18 + 112 * v40;
            if (*((char *)&v41[4].field_8 + 2) == 1)
                goto LABEL_c50aec;
        }
        else
        {
            v42 = v31->field_28;
            if (!v31->field_28)
            {
                v32 = v29;
                *(char *)&a0[8] = 18;
                memset(a0 + 9, 0, 7);
                *(st_c50994_2 **)&a0[16] = v32;
                *(unsigned long long *)a0 = 1;
                return (unsigned long long)v28;
            }
            v43 = v31->field_30;
            while (1)
            {
                v44 = &v42->padding_0[1240];
                v45 = v42->field_532;
                v46 = v45 * 8;
                v47 = 0xffffffffffffffff;
                do
                {
                    if (!v46)
                        goto LABEL_c50b68;
                    if ((unsigned long long)*(long long *)&v44->padding_0[0] <= v29)
                        v49 = v29 > (unsigned long long)*(long long *)&v44->padding_0[0];
                    else
                        v49 = 0xff;
                    v47 += 1;
                    v46 -= 8;
                    i = v49;
                    v44 = &v44->padding_0[8];
                } while (i == 1);
                v45 = v47;
                if (!i)
                    break;
LABEL_c50b68:
                if (!v43)
                {
                    *(char *)&a0[8] = 18;
                    memset(a0 + 9, 0, 7);
                    *(unsigned long long *)&a0[16] = v29;
                    *(unsigned long long *)a0 = 1;
                    return (unsigned long long)v28;
                }
                v42 = *(long long *)&v42[1].padding_0[4 + 8 * v45];
                v43 -= 1;
            }
            v41 = &v42->padding_0[112 * v47];
            if (*((char *)&v41[4].field_8 + 2) == 1)
            {
LABEL_c50aec:
                v6 = 1;
            }
        }
        if (v41->padding_0 == 1)
        {
            v51 = v41->field_10;
            v52 = (unsigned long long)v41[1].padding_0;
            if (v41[1].padding_0)
                goto LABEL_c50b90;
LABEL_c50d04:
            *(unsigned long long *)a0 = 0;
            *(unsigned long long *)&a0[8] = 0;
        }
        else
        {
            v52 = v41->field_8;
            if (6 <= v52)
                sub_c73bb0(0);
            v51 = &v41->field_10;
            if (!v52)
                goto LABEL_c50d04;
LABEL_c50b90:
            v53 = 0;
            v54 = v52 * 16;
            v2 = 46;
            while (1)
            {
                v55 = v54;
                sub_c4cbcc(&v7, &v3, a3->field_48, v51);
                if (v7 == 46)
                {
                    v28 = v8;
                    v60 = a0;
                    *(uint128_t *)&v60[8] = v28;
                    *(unsigned long long *)v60 = 1;
                    break;
                }
                else if ((short)v9 <= 70)
                {
                    switch (v56)
                    {
                    case 3:
                        sub_c4eda0(&v13, &v7);
                        sub_c4b058(&v10, a2, v17, *(long long *)&a3->padding_178[32], &v13);
                        v58 = v12;
                        if (v10)
                            v58 = v1;
                        v1 = v58;
                        v59 = arm64g_calculate_condition(19, v10, 0, 0);
                        if (!(v59 & 1))
                            v53 = v11;
                        goto LABEL_c50bd4;
                    case 49:
                        goto LABEL_c50bbc;
                    default:
LABEL_c50bd4:
                        v51 += 16;
                        v54 = v55 - 16;
                        if (v55 != 16)
                            continue;
LABEL_c50cd0:
                        if (v53)
                        {
                            v61 = a0;
                            *(unsigned long long *)&v61[8] = v53;
                            *(st_c50994_2 **)&v61[16] = v1;
                            *(unsigned long long *)v61 = 0;
                            break;
                        }
                        else
                        {
                            a0 = a0;
                            if (v2 == 46)
                                goto LABEL_c50d04;
                            sub_c4f5a8(a0, v2, v0, a1, a2, a3, a5, a6 - 1);
                            break;
                        }
                    }
                    break;
                }
                else
                {
                    switch (v56)
                    {
                    case 71:
LABEL_c50bbc:
                        sub_c4eda0(&v13, &v7);
                        v2 = v13;
                        v0 = v14;
                        goto LABEL_c50bd4;
                    case 110: case 8199:
                        sub_c4eda0(&v13, &v7);
                        sub_c4b058(&v10, a2, v17, *(long long *)&a3->padding_178[32], &v13);
                        if (v10 & 1)
                            goto LABEL_c50bd4;
                        v62 = a0;
                        *(unsigned long long *)&v62[8] = v11;
                        *(st_c50994_2 **)&v62[16] = v12;
                        *(unsigned long long *)v62 = 0;
                        return (unsigned long long)v28;
                    default:
LABEL_c50bd4:
                        v51 += 16;
                        v54 = v55 - 16;
                        if (v55 == 16)
                            goto LABEL_c50cd0;
                        break;
                    }
                }
            }
        }
    }
    return (unsigned long long)v28;
}
