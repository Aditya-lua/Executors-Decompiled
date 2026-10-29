/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x98ee6c..0x98f1ac (832 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_98ee6c_1 {
    struct st_98ee6c_0 *field_0;
    unsigned long long field_8;
} st_98ee6c_1;

typedef struct st_98ee6c_0 {
    struct st_98ee6c_0 *field_0;
    char field_1;
    char field_2;
    char padding_3[5];
    struct st_98ee6c_0 *field_8;
    unsigned long long field_10;
    unsigned long long field_18;
    unsigned long long field_20;
    unsigned long long field_28;
    char field_30;
} st_98ee6c_0;


st_98ee6c_0 * sub_98ee6c(st_98ee6c_0 **a0, char a1, st_98ee6c_0 *a2, st_98ee6c_0 *a3)
{
    unsigned long long v16;  // x28
    unsigned long long v17;  // x27
    unsigned long long v26;  // x30
    st_98ee6c_0 *v27;  // x20
    unsigned long long v28;  // x0
    st_98ee6c_0 *v29;  // x10
    st_98ee6c_0 *v30;  // x8
    st_98ee6c_0 *v31;  // x9
    unsigned long v32;  // cc_op
    unsigned long v33;  // cc_dep1
    unsigned long v34;  // cc_dep2
    unsigned long v35;  // cc_ndep
    unsigned long long v18;  // x26
    unsigned long long v36;  // 4110
    unsigned long long v37;  // 4102
    unsigned long long v38;  // 4110
    unsigned long long v39;  // 4102
    unsigned long long v19;  // x25
    st_98ee6c_0 *v40;  // x20
    unsigned long long v41;  // x24
    st_98ee6c_0 *v42;  // x0
    st_98ee6c_0 *v43;  // x9
    st_98ee6c_0 *v44;  // x8
    st_98ee6c_0 *v45;  // x9
    st_98ee6c_0 *v46;  // x20
    st_98ee6c_0 *v47;  // x26
    unsigned long long v20;  // x24
    uint128_t v48;  // x0
    st_98ee6c_0 *v49;  // x9
    st_98ee6c_0 *v50;  // x8
    st_98ee6c_0 *v51;  // x9
    st_98ee6c_0 *v52;  // x25
    uint128_t v53;  // x27
    st_98ee6c_0 *v54;  // x20
    st_98ee6c_0 *v55;  // x9
    st_98ee6c_0 *v56;  // x0
    st_98ee6c_0 *v57;  // x8
    unsigned long long v21;  // x23
    st_98ee6c_0 *v58;  // x25
    st_98ee6c_0 *v59;  // x8
    st_98ee6c_0 *v60;  // x0
    st_98ee6c_0 *v61;  // x9
    st_98ee6c_0 *v62;  // x25
    unsigned long v63;  // cc_dep1
    unsigned long v64;  // cc_dep2
    st_98ee6c_0 *v65;  // x10
    unsigned long long v66;  // x8
    unsigned long long v67;  // x11
    unsigned long long v22;  // x22
    unsigned long v68;  // x8
    unsigned long long v69;  // 4110
    unsigned long long v70;  // 4105
    unsigned long long v71;  // 4110
    unsigned long long v72;  // 4105
    unsigned long long v73;  // x8
    unsigned long v74;  // x8
    st_98ee6c_0 *v75;  // x12
    unsigned long long v76;  // x11
    st_98ee6c_0 *iter;  // x26
    unsigned long long v23;  // x21
    st_98ee6c_0 *v78;  // x28
    st_98ee6c_0 *v79;  // x21
    st_98ee6c_0 *v80;  // x9
    st_98ee6c_0 *v81;  // x0
    st_98ee6c_0 *v82;  // x8
    st_98ee6c_0 *v83;  // x28
    unsigned long long v84;  // x8
    unsigned long long v85;  // x13
    st_98ee6c_0 *v86;  // x14
    st_98ee6c_1 *v87;  // x8
    unsigned long long v24;  // x20
    st_98ee6c_0 *v88;  // x8
    unsigned long long v25;  // x19
    unsigned long v0;  // [bp-0x78]
    char v1;  // [bp-0x70], Other Possible Types: unsigned long
    unsigned long v2;  // [bp-0x68]
    unsigned long long v3;  // [bp-0x60]
    unsigned long long v4;  // [bp-0x58]
    unsigned long long v5;  // [bp-0x50]
    unsigned long long v6;  // [bp-0x48]
    unsigned long long v7;  // [bp-0x40]
    unsigned long long v8;  // [bp-0x38]
    unsigned long long v9;  // [bp-0x30]
    unsigned long long v10;  // [bp-0x28]
    unsigned long long v11;  // [bp-0x20]
    unsigned long long v12;  // [bp-0x18]
    char *v13;  // [bp-0x10]
    unsigned long long v14;  // [bp-0x8]
    char v15;  // [bp+0x0]

    if (!a0[1])
        return 0;
    v3 = v16;
    v4 = v17;
    v5 = v18;
    v6 = v19;
    v7 = v20;
    v8 = v21;
    v9 = v22;
    v10 = v23;
    v11 = v24;
    v12 = v25;
    v13 = &v15;
    v14 = v26;
    v27 = 1 << ((char)((char)*a0->field_0) >> 6 & 63);
    if (a0[1] < v27)
        return 0;
    v28 = sub_a7b0d8(*a0);
    v29 = a0[1];
    v30 = *a0 + v27;
    v31 = v29 - v27;
    *a0 = v30;
    a0[1] = v31;
    if ((v28 & 0xfffffffffffffffe) == 2)
    {
        v36 = arm64g_calculate_condition(v32, v33, v34, v35);
        v37 = arm64g_calculate_condition(4, (v36 & 1 ? v29 : 0x40000000), (v36 & 1 ? v27 : 0), 0);
        if (!(v37 & 1))
            goto LABEL_98eee4;
    }
    else
    {
        v38 = arm64g_calculate_condition(v32, v33, v34, v35);
        v39 = arm64g_calculate_condition(0, (v38 & 1 ? v29 : 0x40000000), (v38 & 1 ? v27 : 0), 0);
        if (!(v39 & 1))
        {
LABEL_98eee4:
            v40 = 1 << ((char)((char)v30->field_0) >> 6 & 63);
            if (v31 >= v40)
            {
                v41 = v28;
                v42 = sub_a7b0d8(v30);
                v43 = a0[1];
                v44 = *a0 + v40;
                v45 = v43 - v40;
                *a0 = v44;
                a0[1] = v45;
                if (v43 != v40)
                {
                    v46 = 1 << ((char)((char)v44->field_0) >> 6 & 63);
                    if (v45 >= v46)
                    {
                        v47 = v42;
                        v48 = sub_a7b0d8(v44);
                        v49 = a0[1];
                        v50 = *a0 + v46;
                        v51 = v49 - v46;
                        *a0 = v50;
                        a0[1] = v51;
                        if (v49 != v46)
                        {
                            v52 = 1 << ((char)((char)v50->field_0) >> 6 & 63);
                            if (v51 >= v52)
                            {
                                v53 = v48;
                                v54 = sub_a7b0d8(v50);
                                v55 = a0[1];
                                v56 = *a0 + v52;
                                v57 = v55 - v52;
                                *a0 = v56;
                                a0[1] = v57;
                                if (v55 != v52)
                                {
                                    v58 = 1 << ((char)((char)v56->field_0) >> 6 & 63);
                                    if (v57 >= v58)
                                    {
                                        v59 = sub_a7b0d8();
                                        v60 = *a0 + v58;
                                        v61 = a0[1] - v58;
                                        *a0 = v60;
                                        a0[1] = v61;
                                        v62 = v47 - v59;
                                        v63 = v47;
                                        v64 = v59;
                                        if (v59 <= v47)
                                        {
                                            v65 = a2;
                                            if (a2)
                                            {
                                                v66 = 1 << (a1 & 63);
                                                v67 = v66 * v53;
                                                v68 = v67 / 18446744073709552;
                                                if (v53 * v66 <= 0xffffffffffffffff)
                                                {
                                                    v69 = arm64g_calculate_condition(4, v63, v64, 0);
                                                    v70 = arm64g_calculate_condition(4, 0, (v69 & 1 ? v68 : 0), 0);
                                                    if (!(v70 & 1))
                                                        goto LABEL_98f022;
LABEL_98f021:
                                                    v73 = 1000 * v67;
                                                }
                                                else
                                                {
                                                    v71 = arm64g_calculate_condition(4, v63, v64, 0);
                                                    v72 = arm64g_calculate_condition(0, 0, (v71 & 1 ? v68 : 0), 0);
                                                    if (v72 & 1)
                                                        goto LABEL_98f021;
LABEL_98f022:
                                                    v73 = 0xffffffffffffffff;
                                                }
                                                v65->field_8 = v73;
                                                if (*(long long *)&v65->field_1)
                                                {
                                                    v74 = v65->field_0;
                                                    *(st_98ee6c_0 **)v74 = v62;
                                                    *(st_98ee6c_0 **)(v74 + 8) = v47;
                                                }
                                            }
                                            v75 = a3;
                                            v76 = v41;
                                            if (v54)
                                            {
                                                iter = 0;
                                                do
                                                {
                                                    if (!v61)
                                                        return 0;
                                                    v78 = 1 << ((char)((char)v60->field_0) >> 6 & 63);
                                                    if (v61 < v78)
                                                        return 0;
                                                    v79 = sub_a7b0d8();
                                                    v80 = a0[1];
                                                    v81 = *a0 + v78;
                                                    v82 = v80 - v78;
                                                    *a0 = v81;
                                                    a0[1] = v82;
                                                    if (v80 == v78)
                                                        return 0;
                                                    v83 = 1 << ((char)((char)v81->field_0) >> 6 & 63);
                                                    if (v82 < v83)
                                                        return 0;
                                                    v84 = sub_a7b0d8();
                                                    v60 = *a0 + v83;
                                                    v61 = a0[1] - v83;
                                                    *a0 = v60;
                                                    a0[1] = v61;
                                                    if (v62 < (char *)&v79->field_0 + 2)
                                                        return 0;
                                                    v85 = v62 - v79 - 2;
                                                    v65 = a2;
                                                    v75 = a3;
                                                    v76 = v41;
                                                    if (!a2 || (v86 = v85 - v84, v85 < v84))
                                                    {
                                                        if (v85 < v84)
                                                            return 0;
                                                        iter = (char *)&iter->field_0 + 1;
                                                    }
                                                    else
                                                    {
                                                        iter = (char *)&iter->field_0 + 1;
                                                        if ((unsigned long long)*(long long *)&v65->field_1 > iter)
                                                        {
                                                            v87 = (char *)v65->field_0 + 0x10 * iter;
                                                            v87->field_0 = v86;
                                                            v87->field_8 = v85;
                                                            v62 = v86;
                                                        }
                                                    }
                                                } while (iter != v54);
                                            }
                                            if (v65)
                                            {
                                                v88 = (char *)&v54->field_0 + 1;
                                                if ((unsigned long long)*(long long *)&v65->field_1 > v88)
                                                    *(st_98ee6c_0 **)&v65->field_1 = v88;
                                            }
                                            if (v75)
                                                v75->field_0 = (char *)&v54->field_0 + 1;
                                            if (v76 != 3)
                                            {
                                                if (!v65)
                                                    return 1;
                                                *(char *)&v65->field_28 = (char)v65->field_28 & 254;
                                                return 1;
                                            }
                                            else if (sub_98ecc8(a0, &v2) && sub_98ecc8(a0, &v1) && sub_98ecc8(a0, &v0))
                                            {
                                                if (!a2)
                                                    return 1;
                                                a2->field_10 = v2;
                                                a2->field_18 = v1;
                                                a2->field_20 = v0;
                                                *(char *)&a2->field_28 = (char)a2->field_28 | 1;
                                                return 1;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    return 0;
}
