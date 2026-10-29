/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc5c018..0xc5c198 (384 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c5c018_0 {
    uint128_t field_0;
    char field_8;
    char padding_9[7];
    unsigned long long field_10;
    char padding_18[8];
    unsigned long long field_20;
    char padding_28[8];
    char field_30;
    char padding_31[7];
    unsigned long long field_38;
    char padding_40[8];
    uint128_t field_48;
    char field_50;
    char padding_51[7];
    unsigned long long field_58;
} st_c5c018_0;

typedef struct st_c5c018_1 {
    uint128_t field_0;
    unsigned long long field_10;
    uint128_t field_18;
    unsigned long long field_28;
    uint128_t field_30;
    unsigned long long field_40;
    uint128_t field_48;
    unsigned long long field_58;
} st_c5c018_1;


double sub_c5c018(st_c5c018_0 *a0, st_c5c018_1 *a1)
{
    unsigned long long v11;  // x26
    unsigned long long v12;  // x25
    unsigned int v21;  // w0
    unsigned int v22;  // w0
    unsigned long v23;  // x8
    st_c5c018_0 *v24;  // x22
    st_c5c018_0 *v25;  // x21
    unsigned long v26;  // cc_dep1
    unsigned long long v27;  // x8
    unsigned long long v28;  // 4140
    st_c5c018_0 *v29;  // x23
    unsigned long long v30;  // 4109
    unsigned long long v13;  // x24
    unsigned long long v31;  // 4109
    st_c5c018_0 *v32;  // x20
    unsigned long long v33;  // x24
    unsigned int v34;  // w0
    unsigned int v35;  // w0
    unsigned long v36;  // x8
    unsigned long long v37;  // 4109
    st_c5c018_0 *v38;  // x9
    unsigned long v39;  // cc_dep1
    unsigned long long v40;  // 4109
    unsigned long long v14;  // x23
    st_c5c018_0 *v41;  // x24
    unsigned long long v42;  // 4105
    unsigned long long v43;  // 4105
    st_c5c018_0 *v44;  // x22
    unsigned long long v45;  // 4105
    unsigned long long v46;  // 4105
    unsigned long v47;  // cc_dep1
    unsigned long long v48;  // 4109
    st_c5c018_0 *v49;  // x21
    unsigned long long v50;  // 4105
    unsigned long long v15;  // x22
    unsigned long long v51;  // 4105
    unsigned int v52;  // w0
    unsigned long v53;  // x8
    unsigned long v54;  // cc_dep1
    unsigned long long v55;  // 4109
    st_c5c018_0 *v56;  // x8
    unsigned long long v57;  // 4105
    unsigned long long v58;  // 4105
    uint128_t v59;  // q0
    unsigned long v60;  // x10
    unsigned long long v16;  // x21
    unsigned long v61;  // x8
    unsigned long long v62;  // x8
    uint128_t v63;  // q0
    unsigned long long v17;  // x20
    unsigned long long v18;  // x19
    unsigned long long v19;  // x30
    unsigned long long v20;  // x21
    unsigned long long v0;  // [bp-0x50]
    unsigned long long v1;  // [bp-0x48]
    unsigned long long v2;  // [bp-0x40]
    unsigned long long v3;  // [bp-0x38]
    unsigned long long v4;  // [bp-0x30]
    unsigned long long v5;  // [bp-0x28]
    unsigned long long v6;  // [bp-0x20]
    unsigned long long v7;  // [bp-0x18]
    char *v8;  // [bp-0x10]
    unsigned long long v9;  // [bp-0x8]
    char v10;  // [bp+0x0]

    v0 = v11;
    v1 = v12;
    v2 = v13;
    v3 = v14;
    v4 = v15;
    v5 = v16;
    v6 = v17;
    v7 = v18;
    v8 = &v10;
    v9 = v19;
    v20 = (unsigned long long)(a0->padding_18 - *(long long *)((char *)&a0->field_0 + 8));
    v21 = _memcmp();
    if (v21)
        v20 = v21;
    v22 = _memcmp();
    v23 = v22;
    if (!v22)
        v23 = (long long)a0->field_48 - *(long long *)&a0->field_30;
    v24 = (char *)a0 + (unsigned int)(v20 >> 63) * 24;
    v25 = (char *)a0 + (unsigned int)(~v20 >> 63) * 24;
    v26 = v23;
    v27 = 48;
    v28 = arm64g_calculate_condition(0x44, v23, 0, 0);
    if (v28 & 1)
    {
        v29 = a0->padding_40;
        v30 = arm64g_calculate_condition(0x44, v26, 0, 0);
        if (!(v30 & 1))
            goto LABEL_c5c0aa;
LABEL_c5c0a9:
    }
    else
    {
        v29 = a0->padding_28;
        v31 = arm64g_calculate_condition(0x44, v26, 0, 0);
        if (v31 & 1)
            goto LABEL_c5c0a9;
LABEL_c5c0aa:
        v27 = 72;
    }
    v32 = (char *)a0 + v27;
    v33 = *(long long *)((char *)&v29->field_0 + 8) - *(long long *)((char *)&v24->field_0 + 8);
    v34 = _memcmp();
    if (v34)
        v33 = v34;
    v35 = _memcmp();
    v36 = v35;
    if (!v35)
        v36 = *(long long *)((char *)&v32->field_0 + 8) - *(long long *)((char *)&v25->field_0 + 8);
    v37 = arm64g_calculate_condition(0x44, v36, 0, 0);
    if (v37 & 1)
        v38 = v29;
    else
        v38 = v25;
    v39 = v33;
    v40 = arm64g_calculate_condition(0x44, v33, 0, 0);
    if (v40 & 1)
    {
        v41 = v29;
        v42 = arm64g_calculate_condition(0x44, v39, 0, 0);
        if (!(v42 & 1))
            goto LABEL_c5c102;
LABEL_c5c101:
        v44 = v24;
        v45 = arm64g_calculate_condition(0x44, v39, 0, 0);
        if (!(v45 & 1))
            goto LABEL_c5c106;
LABEL_c5c105:
        v29 = v25;
    }
    else
    {
        v41 = v24;
        v43 = arm64g_calculate_condition(0x44, v39, 0, 0);
        if (v43 & 1)
            goto LABEL_c5c101;
LABEL_c5c102:
        v44 = v38;
        v46 = arm64g_calculate_condition(0x44, v39, 0, 0);
        if (v46 & 1)
            goto LABEL_c5c105;
LABEL_c5c106:
    }
    v47 = v36;
    v48 = arm64g_calculate_condition(0x44, v36, 0, 0);
    if (v48 & 1)
    {
        v49 = v25;
        v50 = arm64g_calculate_condition(0x44, v47, 0, 0);
        if (!(v50 & 1))
            goto LABEL_c5c112;
LABEL_c5c111:
        v29 = v32;
    }
    else
    {
        v49 = v32;
        v51 = arm64g_calculate_condition(0x44, v47, 0, 0);
        if (v51 & 1)
            goto LABEL_c5c111;
LABEL_c5c112:
    }
    v52 = _memcmp();
    v53 = v52;
    if (!v52)
        v53 = *(long long *)((char *)&v29->field_0 + 8) - *(long long *)((char *)&v44->field_0 + 8);
    v54 = v53;
    v55 = arm64g_calculate_condition(0x44, v53, 0, 0);
    if (v55 & 1)
    {
        v56 = v29;
        v57 = arm64g_calculate_condition(0x44, v54, 0, 0);
        if (!(v57 & 1))
            goto LABEL_c5c13e;
LABEL_c5c13d:
    }
    else
    {
        v56 = v44;
        v58 = arm64g_calculate_condition(0x44, v54, 0, 0);
        if (v58 & 1)
            goto LABEL_c5c13d;
LABEL_c5c13e:
        v44 = v29;
    }
    v59 = v41->field_0;
    a1->field_10 = *(long long *)&v41->field_8;
    a1->field_0 = v59;
    v60 = *(long long *)&v56->field_8;
    *(uint128_t *)&(&a1->field_10)[1] = v56->field_0;
    *(unsigned long *)((char *)&a1->field_18 + 8) = v60;
    v61 = *(long long *)&v44->field_8;
    *(uint128_t *)&a1->field_28 = v44->field_0;
    *(unsigned long *)&a1->field_30 = v61;
    v62 = *(long long *)&v49->field_8;
    v63 = v49->field_0;
    *(uint128_t *)((char *)&a1->field_30 + 8) = v63;
    (&a1->field_40)[1] = v62;
    return (unsigned long long)v63;
}
