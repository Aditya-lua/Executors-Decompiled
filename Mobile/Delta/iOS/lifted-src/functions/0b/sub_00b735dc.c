/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb735dc..0xb73878 (668 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b735dc_0 {
    char padding_0[16];
    unsigned int field_10;
    char padding_14[12];
    unsigned long long field_20;
    char padding_28[8];
    unsigned long long field_30;
    char padding_38[8];
    unsigned long long field_40;
    char padding_48[8];
    unsigned long long field_50;
    char padding_58[24];
    unsigned long long field_70;
    char padding_78[8];
    unsigned long long field_80;
} st_b735dc_0;


double sub_b735dc(uint128_t *a0, st_b735dc_0 *a1)
{
    unsigned long long v2;  // x8
    unsigned long long v3;  // x8
    unsigned long v12;  // 4110
    unsigned long v13;  // cc_op
    unsigned long v14;  // cc_dep1
    unsigned long v15;  // cc_dep2
    unsigned long long v16;  // 4110
    unsigned long v17;  // 4110
    unsigned long long v18;  // 4110
    unsigned long v19;  // 4110
    unsigned long v20;  // cc_op
    unsigned long v21;  // cc_dep1
    unsigned long v22;  // cc_dep2
    unsigned long v23;  // 4110
    unsigned long long v24;  // 4105
    unsigned long long v25;  // x9
    unsigned long long *v26;  // x9
    unsigned long long v27;  // x10
    unsigned long long v28;  // x10
    unsigned long long v29;  // x8
    unsigned long long v30;  // x8
    unsigned long long v31;  // x11
    unsigned long v5;  // x9
    unsigned long long v32;  // x8
    unsigned long long v33;  // x9
    unsigned long v35;  // x9
    unsigned long long v36;  // x10
    unsigned long long v37;  // x9
    unsigned long long v38;  // x8
    unsigned long v39;  // cc_dep1
    unsigned long v40;  // x10
    unsigned long long v41;  // x8
    unsigned long long v6;  // x10
    unsigned long v42;  // 4110
    unsigned long v43;  // cc_op
    unsigned long v44;  // cc_dep1
    unsigned long v45;  // cc_dep2
    unsigned long long v46;  // 4110
    unsigned long v47;  // 4110
    unsigned long long v48;  // 4110
    unsigned long v49;  // 4110
    unsigned long v50;  // cc_op
    unsigned long v51;  // cc_dep1
    unsigned long long v7;  // x9
    unsigned long v52;  // cc_dep2
    unsigned long v53;  // 4110
    unsigned long long v54;  // 4110
    unsigned long long v55;  // d0
    unsigned long long v56;  // x8
    unsigned long long v58;  // x9
    unsigned long long v59;  // x8
    unsigned long long v60;  // x9
    unsigned long long v61;  // x8
    unsigned long long v8;  // x8
    unsigned long v9;  // cc_dep1
    unsigned long v10;  // x10
    unsigned long long v11;  // x8
    unsigned long long v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]

    v2 = *(long long *)&a1->padding_0[0];
    if (v2 == 2)
    {
        if (*(long long *)&a1->padding_58[16])
        {
            v3 = a1->field_80 - a1->field_70 >> 3;
            *(unsigned long long *)a0 = v3;
            *(unsigned long long *)((char *)a0 + 8) = 1;
            *(unsigned long long *)&a0[1] = v3;
            return v55;
        }
    }
    else
    {
        if (*(long long *)&a1->padding_58[16])
        {
            v5 = a1->field_10;
            if (v2 == 1)
            {
                if (v5 & 1)
                {
                    v6 = *(long long *)&a1->padding_0[8];
                    v7 = a1->field_30 - a1->field_20 >> 3;
                    if (!*(long long *)&a1->padding_14[4])
                        v7 = 0;
                    v8 = a1->field_50 - a1->field_40 >> 3;
                    if (!a1->padding_38)
                        v8 = 0;
                    v9 = v6;
                    v10 = v6 != 0;
                    v11 = v8 + v7;
                    if (v6)
                        v11 += 1;
                    if (*(long long *)&a1->padding_58[0])
                    {
                        v12 = arm64g_calculate_condition(20, v9, 0, 0);
                        v13 = 4;
                        v14 = (v12 & 1 ? *(long long *)&a1->padding_58[8] : 0x40000000);
                        v15 = (v12 & 1 ? *(long long *)&a1->padding_58[0] : 0);
                        v16 = arm64g_calculate_condition(4, v14, v15, 0);
                        if (!(v16 & 1))
                            goto LABEL_b7367e;
LABEL_b7367d:
                        v19 = arm64g_calculate_condition(v13, v14, v15, 0);
                        v20 = 4;
                        v21 = (v19 & 1 ? v11 : 0);
                        v22 = (v19 & 1 ? v10 : 0);
                    }
                    else
                    {
                        v17 = arm64g_calculate_condition(20, v9, 0, 0);
                        v13 = 0;
                        v14 = (v17 & 1 ? *(long long *)&a1->padding_58[8] : 0x40000000);
                        v15 = 0;
                        v18 = arm64g_calculate_condition(0, v14, 0, 0);
                        if (v18 & 1)
                            goto LABEL_b7367d;
LABEL_b7367e:
                        v23 = arm64g_calculate_condition(v13, v14, v15, 0);
                        v20 = 0;
                        v21 = (v23 & 1 ? v11 : 0);
                        v22 = (v23 & 1 ? v10 : 0);
                    }
                    v24 = arm64g_calculate_condition(v20 | 48, v21, v22, 0);
                    v25 = !(v24 & 1);
                }
                else
                {
                    v11 = *(long long *)&a1->padding_0[8] != 0;
                    v25 = 1;
                }
                v1 = v25;
                v26 = &v0;
                v27 = v11;
            }
            else if ((unsigned int)v5)
            {
                v28 = a1->field_30 - a1->field_20 >> 3;
                if (!*(long long *)&a1->padding_14[4])
                    v28 = 0;
                v29 = a1->field_50 - a1->field_40 >> 3;
                if (!a1->padding_38)
                    v29 = 0;
                v11 = v29 + v28;
                if (*(long long *)&a1->padding_58[0] && *(long long *)&a1->padding_58[8] != *(long long *)&a1->padding_58[0])
                {
                    v27 = 0;
                    v26 = &v1;
                }
                else
                {
                    v0 = v11;
                    v26 = &v1;
                    v27 = 1;
                }
            }
            else
            {
                v11 = 0;
                v27 = 0;
                v1 = 1;
                v26 = &v0;
            }
            v30 = v11;
            *v26 = v27;
            v31 = a1->field_80 - a1->field_70 >> 3;
            v32 = v31 + v0;
            if (v32 < v0)
                v33 = 0;
            else
                v33 = (unsigned int)v1;
            *(unsigned long long *)a0 = v31 + v30;
            *(unsigned long long *)((char *)a0 + 8) = v33;
            *(unsigned long long *)&a0[1] = v32;
            return v55;
        }
        else
        {
            v35 = a1->field_10;
            if (v2 == 1)
            {
                if (v35 & 1)
                {
                    v36 = *(long long *)&a1->padding_0[8];
                    v37 = a1->field_30 - a1->field_20 >> 3;
                    if (!*(long long *)&a1->padding_14[4])
                        v37 = 0;
                    v38 = a1->field_50 - a1->field_40 >> 3;
                    if (!a1->padding_38)
                        v38 = 0;
                    v39 = v36;
                    v40 = v36 != 0;
                    v41 = v38 + v37;
                    if (v36)
                        v41 += 1;
                    if (*(long long *)&a1->padding_58[0])
                    {
                        v42 = arm64g_calculate_condition(20, v39, 0, 0);
                        v43 = 4;
                        v44 = (v42 & 1 ? *(long long *)&a1->padding_58[8] : 0x40000000);
                        v45 = (v42 & 1 ? *(long long *)&a1->padding_58[0] : 0);
                        v46 = arm64g_calculate_condition(4, v44, v45, 0);
                        if (!(v46 & 1))
                            goto LABEL_b736ea;
LABEL_b736e9:
                        v49 = arm64g_calculate_condition(v43, v44, v45, 0);
                        v50 = 4;
                        v51 = (v49 & 1 ? v41 : 0);
                        v52 = (v49 & 1 ? v40 : 0);
                    }
                    else
                    {
                        v47 = arm64g_calculate_condition(20, v39, 0, 0);
                        v43 = 0;
                        v44 = (v47 & 1 ? *(long long *)&a1->padding_58[8] : 0x40000000);
                        v45 = 0;
                        v48 = arm64g_calculate_condition(0, v44, 0, 0);
                        if (v48 & 1)
                            goto LABEL_b736e9;
LABEL_b736ea:
                        v53 = arm64g_calculate_condition(v43, v44, v45, 0);
                        v50 = 0;
                        v51 = (v53 & 1 ? v41 : 0);
                        v52 = (v53 & 1 ? v40 : 0);
                    }
                    v54 = arm64g_calculate_condition(v50 | 48, v51, v52, 0);
                    *(unsigned long long *)a0 = v41;
                    *(unsigned long long *)((char *)a0 + 8) = !(v54 & 1);
                    *(unsigned long long *)&a0[1] = v41;
                    return v55;
                }
                else
                {
                    v56 = *(long long *)&a1->padding_0[8] != 0;
                    *(unsigned long long *)a0 = v56;
                    *(unsigned long long *)((char *)a0 + 8) = 1;
                    *(unsigned long long *)&a0[1] = v56;
                    return v55;
                }
            }
            else
            {
                if ((unsigned int)v35)
                {
                    v58 = a1->field_30 - a1->field_20 >> 3;
                    if (!*(long long *)&a1->padding_14[4])
                        v58 = 0;
                    v59 = a1->field_50 - a1->field_40 >> 3;
                    if (!a1->padding_38)
                        v59 = 0;
                    v60 = v59 + v58;
                    if (!*(long long *)&a1->padding_58[0] || (v61 = 0, *(long long *)&a1->padding_58[8] == *(long long *)&a1->padding_58[0]))
                    {
                        *(unsigned long long *)&a0[1] = v60;
                        v61 = 1;
                    }
                    *(unsigned long long *)a0 = v60;
                    *(unsigned long long *)((char *)a0 + 8) = v61;
                    return v55;
                }
            }
        }
    }
    *a0 = 0x10000000000000000;
    *(unsigned long long *)&a0[1] = 0;
    return 0;
}
