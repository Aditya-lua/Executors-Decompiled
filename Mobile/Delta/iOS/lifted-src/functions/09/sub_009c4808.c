/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c4808..0x9c4de8 (1504 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9c4808_1 {
    char padding_0[1];
    char field_1;
} st_9c4808_1;

typedef struct st_9c4808_0 {
    unsigned int field_0;
    unsigned int field_4;
    char *field_8;
    unsigned long long field_10;
} st_9c4808_0;

typedef struct st_9c4808_2 {
    int field_0;
    unsigned int field_4;
    unsigned int field_8;
    unsigned int field_c;
} st_9c4808_2;

extern char g_a3d70b;
extern st_9c4808_2 g_d2c690;
extern st_9c4808_2 g_d2c6d8;
extern unsigned int g_d2c738[4];

unsigned long long sub_9c4808(unsigned int idx, st_9c4808_0 *a1)
{
    unsigned int v11;  // w8
    unsigned int v12;  // w10
    unsigned long v21;  // x0
    unsigned int v22;  // w9
    unsigned long v23;  // cc_dep1
    unsigned long v24;  // cc_dep2
    unsigned int v25;  // w9
    unsigned long long v26;  // x9
    unsigned long long v27;  // 4110
    unsigned long long v28;  // 4102
    unsigned long long v29;  // 4110
    unsigned long long v30;  // 4102
    unsigned int v13;  // x9
    unsigned long long v31;  // x0
    st_9c4808_1 *v32;  // x22
    unsigned long long v33;  // x0
    unsigned int v34;  // w9
    unsigned long v35;  // x10
    unsigned long v36;  // x11
    unsigned int v37;  // w9
    unsigned int v38;  // w11
    unsigned int v39;  // w11
    unsigned int v40;  // w12
    unsigned int v14;  // w11
    unsigned long v41;  // cc_dep1
    unsigned int v42;  // w11
    unsigned long long v43;  // 4112
    unsigned long long v44;  // 4110
    unsigned long long v45;  // 4112
    unsigned long long v46;  // 4110
    int v47;  // w11
    unsigned int v48;  // w12
    unsigned int v49;  // w11
    unsigned int v50;  // w10
    unsigned long v15;  // x11
    unsigned int v51;  // w12
    unsigned int v52;  // w13
    unsigned long v53;  // cc_dep1
    unsigned int v54;  // w12
    unsigned long v55;  // 4112
    unsigned long v56;  // cc_op
    unsigned long v57;  // cc_dep1
    unsigned long v58;  // cc_dep2
    unsigned long v59;  // 4112
    unsigned long long v60;  // 4105
    char *v16;  // x23
    unsigned int v61;  // w12
    unsigned int v62;  // w11
    unsigned long v63;  // x12
    int v64;  // w13
    unsigned int v65;  // w12
    unsigned long long v67;  // w9
    int v68;  // w10
    unsigned long v69;  // x22
    unsigned long long v70;  // x8
    unsigned long long v17;  // x26
    unsigned int v71;  // x19
    unsigned long long v72;  // x21
    unsigned long long v73;  // x0
    unsigned long long v74;  // 4111
    unsigned int v75;  // w21
    unsigned int v76;  // w19
    unsigned long v77;  // x26
    unsigned long long v78;  // x0
    char *v79;  // x25
    unsigned long long v80;  // x0
    unsigned int v18;  // x28
    int v81;  // w24
    unsigned int v82;  // w8
    unsigned long v83;  // x26
    unsigned long long v84;  // x0
    unsigned long long v85;  // x0
    unsigned int v86;  // w11
    int v87;  // w8
    unsigned int v88;  // w9
    unsigned long long v89;  // x0
    unsigned int v19;  // x21
    unsigned int i;  // w24
    unsigned int v0;  // [bp-0xc8]
    unsigned long v1;  // [bp-0xc0]
    unsigned int v2;  // [bp-0xb4]
    unsigned long long v3;  // [bp-0xb0]
    unsigned int v4;  // [bp-0xa4]
    unsigned int v5;  // [bp-0xa0]
    uint128_t v6;  // [bp-0x90], Other Possible Types: unsigned int
    unsigned int v7;  // [bp-0x80]
    unsigned int v8;  // [bp-0x70]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v11 = a1->field_4;
    if (v11 == 23)
    {
        v12 = 13;
        v13 = 5;
        v14 = 6;
    }
    else if (v11 == 24)
    {
        v12 = 15;
        v13 = 6;
        v14 = 7;
    }
    else
    {
        return 0;
    }
    v4 = v14;
    v15 = a1->field_0;
    v16 = a1->field_8;
    v17 = a1->field_10;
    v5 = 0;
    v6 = 0;
    v7 = 0;
    v8 = 0;
    if ((int)v12 > (int)v15)
    {
LABEL_9c4880:
        return 0;
    }
    v18 = 0;
    v19 = 0;
    v2 = 0;
    i = 0;
    v0 = v4 * 2;
    v1 = v15;
    v3 = (v13 * 2 | v13 >> 63) & 0x1fffffffe & 0x1ffffffff;
    do
    {
        v21 = v16[v18];
        if (!(v17 >> 8 & 1) && (v22 = v3, v23 = v22, v24 = v18 & 0xffffffff, v22 == v18))
        {
            v25 = ((unsigned int)v21 & 0xff) - 43;
            v26 = 1 << ((char)v25 & 63) & 140737488355333;
            if (v25 <= 47)
            {
                v27 = arm64g_calculate_condition(147, v23, v24, 0);
                v28 = arm64g_calculate_condition(20, (v27 & 1 ? v26 : 0x40000000), 0, 0);
                if (v28 & 1)
                    goto LABEL_9c4bf0;
                else
                    goto LABEL_9c492c;
            }
            else
            {
                v29 = arm64g_calculate_condition(147, v23, v24, 0);
                v30 = arm64g_calculate_condition(16, (v29 & 1 ? v26 : 0x40000000), 0, 0);
                if (v30 & 1)
                    goto LABEL_9c4bf0;
                else
                    goto LABEL_9c492c;
            }
        }
LABEL_9c492c:
        v31 = sub_a69974(v21);
        if (!(unsigned int)v31)
            return v31;
        if (v1 - 1 == v18)
            return 0;
        v32 = &v16[v18];
        v33 = sub_a69974(v32->field_1);
        if (!(unsigned int)v33)
            return v33;
        if (v1 - 2 == v18)
            return 0;
        v34 = v32->field_1 + 10 * v16[v18];
        v35 = v34 - 528;
        v11 = a1->field_4;
        if (v11 != 23)
            v36 = i;
        else
            v36 = i + 1;
        if ((int)v35 < (&g_d2c690.field_0)[v36 & 0xffffffff])
            return 0;
        if (*(int *)(4 * v36 + 13813428) < (int)v35)
            return 0;
        v37 = v34 - 480;
        if ((int)v36 > 2)
        {
            if (4 < (int)v36)
            {
                if ((unsigned int)v36 == 5)
                {
                    (&v5)[1] = v35;
                    goto LABEL_9c48dc;
                }
                else if ((unsigned int)v36 == 6)
                {
                    v5 = v35;
                    goto LABEL_9c48dc;
                }
            }
            if ((unsigned int)v36 != 3 && (unsigned int)v36 == 4)
            {
                (&v5)[2] = v35;
                goto LABEL_9c48dc;
            }
            v38 = v2;
            if (v38 != 1)
            {
                if ((int)v35 > (&g_d2c6d8.field_0)[v38])
                    return 0;
                goto LABEL_9c4abc;
            }
            v39 = 85899344 + 3264175145 * (v19 + 1900);
            v40 = __ROL__(v39, 28);
            v41 = v40;
            if (v40 < &g_a3d70b)
            {
                if (29 < (int)v35)
                    return 0;
LABEL_9c4abc:
                v48 = v2;
                v49 = v37 + g_d2c738[v48] - 49;
                (&v5)[3] = v35;
                *(unsigned int *)((char *)&v6 + 12) = v49;
                if ((int)v48 >= 2)
                {
                    v50 = v19 + 1900;
                    v51 = 85899344 + 3264175145 * v50;
                    v52 = __ROL__(v51, 28);
                    v53 = v52;
                    if (v52 >= &g_a3d70b)
                    {
                        v54 = __ROL__(v51, 30);
                        if (!(v19 & 3))
                        {
                            v55 = arm64g_calculate_condition(3, v53, &g_a3d70b, 0);
                            v56 = 3;
                            v57 = (v55 & 1 ? v54 : 0);
                            v58 = (v55 & 1 ? 42949672 : 0);
                        }
                        else
                        {
                            v59 = arm64g_calculate_condition(3, v53, &g_a3d70b, 0);
                            v56 = 0;
                            v57 = (v59 & 1 ? v54 : 0);
                            v58 = (v59 & 1 ? 42949672 : 0);
                        }
                        v60 = arm64g_calculate_condition(v56 | 144, v57, v58, 0);
                        v61 = !(v60 & 1);
                    }
                    else
                    {
                        v61 = 1;
                    }
                    *(unsigned int *)((char *)&v6 + 12) = v61 + v49;
                    v62 = v2 + 2;
                }
                else
                {
                    v62 = v48 + 14;
                    v50 = v19 + 1899;
                }
                v63 = v50 * 1374389535;
                v64 = v63 >> 32;
                v65 = v63 >> 63;
                v67 = v37 + ((13 * v62) * 1717986919 >> 63) + ((int)((13 * v62) * 1717986919) >> 33) + v50 - 100 * (v65 + (v64 >> 5)) + v65 + (v64 >> 7) + (v65 + (v64 >> 5)) * 5 + ((char)((char)(v50 - 100 * (v65 + (v64 >> 5))) + ((char)(__ROL__((char)(v50 - 100 * (v65 + (v64 >> 5))), 19)) & 3)) >> 2) - 42;
                v68 = (unsigned int)(v67 * -1840700269 >> 32) + v67;
                *(unsigned long long *)&(&v6)[2] = v67 + (v68 >> 2) + ((unsigned int)(v68) >> 31) - ((v68 >> 2) + ((unsigned int)(v68) >> 31)) * 8;
                continue;
            }
            v42 = __ROL__(v39, 30);
            if (!(v19 & 3))
            {
                v43 = arm64g_calculate_condition(3, v41, &g_a3d70b, 0);
                v44 = arm64g_calculate_condition(147, (v43 & 1 ? v42 : 0), (v43 & 1 ? 42949672 : 0), 0);
                if (!(v44 & 1))
                    goto LABEL_9c4a66;
            }
            else
            {
                v45 = arm64g_calculate_condition(3, v41, &g_a3d70b, 0);
                v46 = arm64g_calculate_condition(144, (v45 & 1 ? v42 : 0), (v45 & 1 ? 42949672 : 0), 0);
                if (!(v46 & 1))
                {
LABEL_9c4a66:
                    v47 = 29;
LABEL_9c4a68:
                    if ((int)v35 > v47)
                        return 0;
                    goto LABEL_9c4abc;
                }
            }
            v47 = 28;
            goto LABEL_9c4a68;
        }
        else
        {
            if (!(unsigned int)v36)
            {
                v19 = 0xfffff894 + 100 * (unsigned int)v35;
            }
            else if ((unsigned int)v36 != 1)
            {
                if ((unsigned int)v36 == 2)
                {
                    v2 = v37 - 49;
                    v6 = v2;
                    goto LABEL_9c48dc;
                }
            }
            else
            {
                if (v11 == 23)
                {
                    if ((int)v37 < 98)
                        v19 = v37 + 52;
                    else
                        v19 = v35 & 0xffffffff;
                }
                else
                {
                    v19 += v35;
                }
            }
            (&v6)[1] = v19;
        }
LABEL_9c48dc:
        i += 1;
        v18 += 2;
    } while (i != v4);
    v18 = v0;
LABEL_9c4bf0:
    v69 = v1;
    if (v11 == 24)
    {
        v70 = v18 & 0xffffffff;
        if (v16[v70] == 46)
        {
            if (v17 >> 8 & 1)
                return 0;
            if ((int)v69 <= (int)(v18 | 1))
                return 0;
            v71 = 0;
            v72 = v70 + 1;
            while (1)
            {
                v73 = sub_a69974(v16[v71 + v72]);
                if (!(unsigned int)v73)
                    break;
                v71 += 1;
                v74 = arm64g_calculate_condition(18, v72 - v69, v71, 0);
                if (!(v74 & 1))
                    return 0;
            }
            if (!v71)
                return v73;
            if (!((unsigned int)(v72 - v69) + v71))
                return v73;
            v18 = v72 + v71;
        }
    }
    v75 = v16[v18];
    if (v75 == 90)
    {
        v76 = v18 + 1;
    }
    else
    {
        if (v17 >> 8 & 1)
            return 0;
        if (v75 != 45 && v75 != 43 || !(v76 = v18 + 5, v76 == (unsigned int)v69))
            goto LABEL_9c4880;
        v77 = v18 + 1;
        v78 = sub_a69974(v16[v77]);
        if (!(unsigned int)v78)
            return v78;
        v79 = v16 + 1;
        v80 = sub_a69974(v79[v77]);
        if (!(unsigned int)v80)
            return v80;
        v81 = v79[v77] + 10 * v16[v77] - 528;
        v82 = v4;
        if (a1->field_4 == 23)
            v82 += 1;
        if (v81 < (&g_d2c690.field_0)[v82] || *(int *)(4 * v82 + 13813428) < v81)
            return 0;
        v83 = v77 + 2;
        v84 = sub_a69974(v16[v83]);
        if (!(unsigned int)v84)
            return v84;
        v85 = sub_a69974(v79[v83]);
        if (!(unsigned int)v85)
            return v85;
        v86 = v4;
        v87 = v79[v83] + 10 * v16[v83] - 528;
        if (a1->field_4 == 23)
            v88 = v86 + 2;
        else
            v88 = v86 + 1;
        if (v87 < (&g_d2c690.field_0)[v88] || *(int *)(4 * v88 + 13813428) < v87)
        {
            return 0;
        }
        else if (idx && v81 * 3600 + v87 * 60)
        {
            v89 = sub_a6e324();
            v69 = v1;
            if (!(unsigned int)v89)
                return v89;
        }
        else
        {
            v69 = v1;
        }
    }
    if (v76 != (unsigned int)v69)
        return 0;
    if (!idx)
        return 1;
    *(uint128_t *)idx = v5;
    *(uint128_t *)(idx + 16) = v6;
    *(uint128_t *)(idx + 32) = v7;
    *(unsigned long long *)(idx + 48) = v8;
    return 1;
}
