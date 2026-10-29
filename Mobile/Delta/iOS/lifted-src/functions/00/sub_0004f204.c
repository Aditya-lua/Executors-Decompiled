/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4f204..0x4f800 (1532 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4f204_3 {
    void* field_0;
    char field_1;
    char padding_2[6];
    struct st_4f204_3 *field_8;
    void* field_10;
    char field_18;
    char padding_19[7];
    void* field_20;
    struct st_4f204_3 *field_28;
    struct st_4f204_4 *field_30;
    struct st_4f204_3 *field_38;
    struct st_4f204_3 *field_40;
} st_4f204_3;

typedef struct st_4f204_1 {
    unsigned long long field_0;
    char field_1;
    char padding_2[6];
    struct st_4f204_1 *field_8;
    unsigned long long field_10;
    char field_18;
    char padding_19[7];
    unsigned long long field_20;
    struct st_4f204_1 *field_28;
    struct st_4f204_2 *field_30;
    struct st_4f204_1 *field_38;
    struct st_4f204_1 *field_40;
} st_4f204_1;

typedef struct st_4f204_2 {
    unsigned long long field_0;
} st_4f204_2;

typedef struct st_4f204_4 {
    void* field_0;
} st_4f204_4;

typedef struct st_4f204_0 {
    char field_0;
} st_4f204_0;

typedef struct st_40c6c_2 {
    char padding_0[8];
    struct st_40c6c_2 *field_8;
    char padding_10[12];
    unsigned int field_1c;
    unsigned long long field_20;
} st_40c6c_2;

extern st_40c6c_2 *g_f00ae0;
extern st_4f204_1 *g_f00af0;
extern unsigned int g_f00b00;
extern unsigned int g_f00b10;
extern unsigned int g_f00b20;
extern unsigned int g_f00b30;
extern st_4f204_1 *g_f00b40;
extern st_4f204_1 *g_f00b50;
extern st_4f204_1 *g_f00b60;
extern st_4f204_1 *g_f00b70;
extern st_4f204_1 *g_f00b80;
extern st_4f204_1 *g_f00b90;
extern st_4f204_1 *g_f00ba0;
extern st_4f204_1 *g_f00bb0;
extern st_4f204_1 *g_f00bc0;
extern st_4f204_1 *g_f00bd0;
extern st_4f204_1 *g_f00be0;
extern st_4f204_1 *g_f00bf0;
extern st_4f204_1 *g_f00c00;
extern st_4f204_1 *g_f00c10;

st_4f204_3 * sub_4f204(long long *a0, st_4f204_3 *a1)
{
    st_4f204_3 *v12;  // x21
    unsigned long v17;  // cc_dep2
    unsigned long long v18;  // 4102
    unsigned long v19;  // cc_op
    unsigned long v20;  // cc_dep1
    unsigned long v21;  // cc_dep2
    unsigned long v22;  // cc_ndep
    unsigned long v23;  // 4112
    unsigned long long v24;  // 4102
    st_4f204_1 *v13;  // w8
    unsigned long v25;  // 4112
    unsigned long v26;  // cc_op
    unsigned long v27;  // cc_dep1
    unsigned long v28;  // cc_dep2
    unsigned long long v29;  // 4112
    unsigned long v30;  // 4112
    unsigned long long v31;  // 4112
    unsigned long v32;  // 4112
    unsigned long v33;  // cc_op
    unsigned long v34;  // cc_dep1
    unsigned long v35;  // cc_dep2
    unsigned long long v36;  // 4112
    unsigned long v37;  // 4112
    unsigned long long v38;  // 4112
    unsigned long v39;  // 4112
    unsigned long v40;  // cc_op
    unsigned long v41;  // cc_dep1
    unsigned long v42;  // cc_dep2
    unsigned long long v43;  // 4112
    unsigned long v44;  // 4112
    unsigned long long v45;  // 4112
    unsigned long long v46;  // 4112
    unsigned long long v47;  // 4102
    unsigned long long v48;  // 4112
    unsigned long long v49;  // 4102
    st_4f204_3 *v50;  // x0
    st_4f204_3 *v51;  // x9
    st_4f204_3 *v52;  // x0
    st_4f204_3 *v53;  // x8
    st_4f204_3 *i;  // x20
    st_4f204_3 *v55;  // x0
    st_4f204_3 *v56;  // x0
    unsigned long long v57;  // x0
    st_4f204_3 *v58;  // x0
    unsigned long long v59;  // x0
    st_4f204_3 *v60;  // x20
    st_4f204_3 *v61;  // x0
    st_4f204_3 *v62;  // x0
    unsigned long long v63;  // x8
    unsigned long long v64;  // x0
    unsigned long long v65;  // x0
    st_4f204_3 *v66;  // x20
    st_4f204_3 *j;  // x22
    st_4f204_3 *v68;  // x0
    st_4f204_3 *v69;  // x23
    unsigned long long v70;  // x0
    unsigned long long v71;  // x0
    unsigned long v72;  // x8
    unsigned long v14;  // 4112
    unsigned long long v73;  // x0
    unsigned long long v74;  // x0
    unsigned long long v75;  // x20
    unsigned long long v76;  // x0
    unsigned long long *v77;  // x20
    unsigned long long k;  // x21
    st_4f204_3 *v79;  // x0
    unsigned long long v80;  // x21
    unsigned long long v82;  // x8
    unsigned long v15;  // cc_op
    unsigned long v16;  // cc_dep1
    st_4f204_0 **v0;  // [bp-0x80], Other Possible Types: char
    st_4f204_0 *v1;  // [bp-0x78]
    unsigned long long v2;  // [bp-0x70]
    uint128_t v3;  // [bp-0x70]
    st_4f204_3 *v4;  // [bp-0x68]
    unsigned long v5;  // [bp-0x60]
    unsigned long v6;  // [bp-0x58]
    st_4f204_3 *v7;  // [bp-0x50]
    st_4f204_3 *v8;  // [bp-0x48]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v1 = &v0;
    v0 = &v1;
    v8 = a1;
    if (sub_3a7e0(a0[2], &v8))
        return 0;
    v12 = v8;
    v13 = (st_4f204_1 *)*(int *)&v12->field_1;
    if (v12)
    {
        v14 = arm64g_calculate_condition(v19 | 16, v20, v21, v22);
        v15 = 3;
        v16 = (v14 & 1 ? (unsigned long long)v13 : 0);
        v17 = (v14 & 1 ? (int)g_f00ae0 : 0);
        v18 = arm64g_calculate_condition(3, v16, v17, 0);
        if (!(v18 & 1))
            goto LABEL_4f280;
    }
    else
    {
        v23 = arm64g_calculate_condition(v19 | 16, v20, v21, v22);
        v15 = 0;
        v16 = (v23 & 1 ? (unsigned long long)v13 : 0);
        v17 = (v23 & 1 ? (int)g_f00ae0 : 0);
        v24 = arm64g_calculate_condition(0, v16, v17, 0);
        if (!(v24 & 1))
        {
LABEL_4f280:
            if (v13 != (int)g_f00af0)
            {
                v25 = arm64g_calculate_condition(v15 | 16, v16, v17, 0);
                v26 = 3;
                v27 = (v25 & 1 ? (unsigned long long)v13 : 0x40000000);
                v28 = (v25 & 1 ? g_f00b00 : 0);
                v29 = arm64g_calculate_condition(19, v27, v28, 0);
                if (!(v29 & 1))
                    goto LABEL_4f2b2;
LABEL_4f2b1:
                v32 = arm64g_calculate_condition(v26 | 16, v27, v28, 0);
                v33 = 3;
                v34 = (v32 & 1 ? (unsigned long long)v13 : 0x40000000);
                v35 = (v32 & 1 ? g_f00b10 : 0);
                v36 = arm64g_calculate_condition(19, v34, v35, 0);
                if (!(v36 & 1))
                    goto LABEL_4f2b6;
                goto LABEL_4f2b5;
            }
            else
            {
                v30 = arm64g_calculate_condition(v15 | 16, v16, v17, 0);
                v26 = 0;
                v27 = (v30 & 1 ? (unsigned long long)v13 : 0x40000000);
                v28 = (v30 & 1 ? g_f00b00 : 0);
                v31 = arm64g_calculate_condition(16, v27, v28, 0);
                if (v31 & 1)
                    goto LABEL_4f2b1;
LABEL_4f2b2:
                v37 = arm64g_calculate_condition(v26 | 16, v27, v28, 0);
                v33 = 0;
                v34 = (v37 & 1 ? (unsigned long long)v13 : 0x40000000);
                v35 = (v37 & 1 ? g_f00b10 : 0);
                v38 = arm64g_calculate_condition(16, v34, v35, 0);
                if (v38 & 1)
                {
LABEL_4f2b5:
                    v39 = arm64g_calculate_condition(v33 | 16, v34, v35, 0);
                    v40 = 3;
                    v41 = (v39 & 1 ? (unsigned long long)v13 : 0x40000000);
                    v42 = (v39 & 1 ? g_f00b30 : 0);
                    v43 = arm64g_calculate_condition(19, v41, v42, 0);
                    if (!(v43 & 1))
                        goto LABEL_4f2ba;
                    goto LABEL_4f2b9;
                }
                else
                {
LABEL_4f2b6:
                    v44 = arm64g_calculate_condition(v33 | 16, v34, v35, 0);
                    v40 = 0;
                    v41 = (v44 & 1 ? (unsigned long long)v13 : 0x40000000);
                    v42 = (v44 & 1 ? g_f00b30 : 0);
                    v45 = arm64g_calculate_condition(16, v41, v42, 0);
                    if (v45 & 1)
                    {
LABEL_4f2b9:
                        v46 = arm64g_calculate_condition(v40 | 16, v41, v42, 0);
                        v47 = arm64g_calculate_condition(3, (v46 & 1 ? (unsigned long long)v13 : 0x40000000), (v46 & 1 ? g_f00b20 : 0), 0);
                        if (v47 & 1)
                            return 0;
                        goto LABEL_4f2c0;
                    }
                    else
                    {
LABEL_4f2ba:
                        v48 = arm64g_calculate_condition(v40 | 16, v41, v42, 0);
                        v49 = arm64g_calculate_condition(0, (v48 & 1 ? (unsigned long long)v13 : 0x40000000), (v48 & 1 ? g_f00b20 : 0), 0);
                        if (v49 & 1)
                            return 0;
LABEL_4f2c0:
                        if (v12 && v13 == (int)g_f00b40)
                        {
                            v50 = sub_158b8(a0 + 3, &v12->field_18);
                            if (!v50)
                                return v50;
                            return 0;
                        }
                        if (v13 == (int)g_f00b50)
                        {
                            return 1;
                        }
                        else if (v13 == (int)g_f00b60)
                        {
                            return 3;
                        }
                        else
                        {
                            if (v13 == (int)g_f00b70)
                                v51 = v12;
                            else
                                v51 = 0;
                            v7 = v51;
                            if (v51)
                            {
                                v52 = sub_158b8(a0[1], &v7);
                                if (v52 && *(int *)&v52->field_1)
                                {
                                    v53 = v7;
                                    if (!v53->field_38)
                                        return 2;
                                    if (3 >= v53->field_38)
                                    {
                                        i = 0;
                                        v55 = 2;
                                        do
                                        {
                                            v56 = v55;
                                            v57 = sub_4f204(a0, *(long long *)((char *)v53->field_30 + 0x8 * i));
                                            v55 = (v57 + (char *)v56 & 0x8080808080808080) - ((v57 + (char *)v56 & 0x8080808080808080) >> 7) | v57 + (char *)v56 & 0x7f7f7f7f7f7f7f7f;
                                            i = (char *)&i->field_0 + 1;
                                            v53 = v7;
                                        } while (i < v53->field_38);
                                        return (v57 + (char *)v56 & 0x8080808080808080) - ((v57 + (char *)v56 & 0x8080808080808080) >> 7) | v57 + (char *)v56 & 0x7f7f7f7f7f7f7f7f;
                                    }
                                    v58 = 2;
                                }
                                else
                                {
                                    v59 = sub_4f204(a0, *(long long *)&v7->field_18);
                                    v58 = (v59 + 3 & 0x8080808080808080) - ((v59 + 3 & 0x8080808080808080) >> 7) | v59 + 3 & 0x7f7f7f7f7f7f7f7f;
                                    v53 = v7;
                                    if (!v53->field_38)
                                        return (v59 + 3 & 0x8080808080808080) - ((v59 + 3 & 0x8080808080808080) >> 7) | v59 + 3 & 0x7f7f7f7f7f7f7f7f;
                                }
                                v60 = 0;
                                do
                                {
                                    v61 = v58;
                                    v62 = sub_4f204(a0, *(long long *)((char *)v53->field_30 + 0x8 * v60));
                                    v60 = (char *)&v60->field_0 + 1;
                                    if (1 >= v62)
                                        v62 = 1;
                                } while ((v58 = (v62 + v61 & 0x8080808080808080) - ((v62 + v61 & 0x8080808080808080) >> 7) | v62 + v61 & 0x7f7f7f7f7f7f7f7f, v53 = v7, v60 < v53->field_38));
                                return (v62 + v61 & 0x8080808080808080) - ((v62 + v61 & 0x8080808080808080) >> 7) | v62 + v61 & 0x7f7f7f7f7f7f7f7f;
                            }
                            else
                            {
                                if (v12 && v13 == (int)g_f00b80)
                                {
                                    v63 = (char *)&sub_4f204(a0, *(long long *)&v12->field_18)->field_0 + 1;
                                    return (v63 & 0x8080808080808080) - ((v63 & 0x8080808080808080) >> 7) | v63 & 0x7f7f7f7f7f7f7f7f;
                                }
                                if (v12 && v13 == (int)g_f00b90)
                                {
                                    v64 = sub_4f204(a0, *(long long *)&v12->field_18);
                                    v65 = sub_4f204(a0, v12->field_20);
                                    v63 = ((v65 + v64 & 0x8080808080808080) - ((v65 + v64 & 0x8080808080808080) >> 7) | v65 + v64 & 0x7f7f7f7f7f7f7f7f) + 1;
                                    return (v63 & 0x8080808080808080) - ((v63 & 0x8080808080808080) >> 7) | v63 & 0x7f7f7f7f7f7f7f7f;
                                }
                                if (v12 && v13 == (int)g_f00ba0)
                                    return 10;
                                if (v13 == (int)g_f00bb0 && v12)
                                {
                                    if (!v12->field_20)
                                        return 10;
                                    v66 = 0;
                                    j = 0;
                                    v68 = 10;
                                    do
                                    {
                                        v69 = *(long long *)&v12->field_18 + (char *)v66;
                                        if (*(long long *)&v69->field_1)
                                        {
                                            v70 = sub_4f204(a0, *(long long *)&v69->field_1);
                                            v68 = (v70 + (char *)v68 & 0x8080808080808080) - ((v70 + (char *)v68 & 0x8080808080808080) >> 7) | v70 + (char *)v68 & 0x7f7f7f7f7f7f7f7f;
                                        }
                                        v71 = sub_4f204(a0, v69->field_8);
                                        j = (char *)&j->field_0 + 1;
                                        v72 = ((v71 + (char *)v68 & 0x8080808080808080) - ((v71 + (char *)v68 & 0x8080808080808080) >> 7) | v71 + (char *)v68 & 0x7f7f7f7f7f7f7f7f) + 1;
                                        v68 = (v72 & 0x8080808080808080) - ((v72 & 0x8080808080808080) >> 7) | v72 & 0x7f7f7f7f7f7f7f7f;
                                        v66 = &v66->field_10;
                                    } while (v12->field_20 > j);
                                    return (v72 & 0x8080808080808080) - ((v72 & 0x8080808080808080) >> 7) | v72 & 0x7f7f7f7f7f7f7f7f;
                                }
                                if (v12 && v13 == (int)g_f00bc0)
                                {
                                    v5 = sub_4f204(a0, *(long long *)&v12->field_18);
                                    v6 = *(long long *)&v12->field_18;
                                    v3 = 0xffffffffffffffff0000000000000000;
                                    v5 = v5;
                                    return sub_4ed4c(&v5, &v3);
                                }
                                if (v12 && v13 == (int)g_f00bd0)
                                {
                                    v5 = sub_4f204(a0, *(long long *)&v12->field_18);
                                    v6 = *(long long *)&v12->field_18;
                                    v2 = sub_4f204(a0, v12->field_20);
                                    v4 = v12->field_20;
                                    v5 = v5;
                                    return sub_4ed4c(&v5, &v3);
                                }
                                if (!v12 || v13 != (int)g_f00be0)
                                {
                                    if (v12 && v13 == (int)g_f00bf0)
                                    {
                                        v73 = sub_4f204(a0, *(long long *)&v12->field_18);
                                        v74 = sub_4f204(a0, v12->field_28);
                                        v75 = (v74 + v73 & 0x8080808080808080) - ((v74 + v73 & 0x8080808080808080) >> 7) | v74 + v73 & 0x7f7f7f7f7f7f7f7f;
                                        v76 = sub_4f204(a0, v12->field_38);
                                        v63 = ((v75 + v76 & 0x8080808080808080) - ((v75 + v76 & 0x8080808080808080) >> 7) | v75 + v76 & 0x7f7f7f7f7f7f7f7f) + 2;
                                        return (v63 & 0x8080808080808080) - ((v63 & 0x8080808080808080) >> 7) | v63 & 0x7f7f7f7f7f7f7f7f;
                                    }
                                    if (v12 && v13 == (int)g_f00c00)
                                    {
                                        if (!v12->field_30)
                                            return 3;
                                        v77 = v12->field_28;
                                        k = v12->field_30 * 8;
                                        v79 = 3;
                                        do
                                        {
                                            v80 = k;
                                            v82 = sub_4f204(a0, *v77) + v79;
                                            v79 = (v82 & 0x8080808080808080) - ((v82 & 0x8080808080808080) >> 7) | v82 & 0x7f7f7f7f7f7f7f7f;
                                            k = v80 - 8;
                                            v77 += 1;
                                        } while (k);
                                        return (v82 & 0x8080808080808080) - ((v82 & 0x8080808080808080) >> 7) | v82 & 0x7f7f7f7f7f7f7f7f;
                                    }
                                    if (!v12)
                                    {
                                        return 0;
                                    }
                                    else if (v13 != (int)g_f00c10)
                                    {
                                        return 0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    return sub_4f204(a0, *(long long *)&v12->field_18);
}
