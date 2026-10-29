/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbac9c..0xbb414 (1912 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bac9c_3 {
    unsigned long long field_0;
    unsigned long long field_4;
} st_bac9c_3;

typedef struct st_bac9c_1 {
    char padding_0[8];
    unsigned long long field_8;
    char padding_10[8];
    unsigned int field_18;
    unsigned int field_1c;
    char padding_20[8];
    unsigned int field_28;
    unsigned int field_2c;
    char padding_30[64];
    struct st_bac9c_2 *field_70;
    char padding_78[8];
    unsigned long long field_80;
    char padding_88[120];
    unsigned int field_100;
    unsigned int field_104;
    unsigned int field_108;
    unsigned int field_10c;
    char padding_110[4];
    unsigned int field_114;
} st_bac9c_1;

typedef struct st_bac9c_2 {
    unsigned int field_0;
} st_bac9c_2;

typedef struct st_bac9c_4 {
    struct st_bac9c_0 *field_0;
} st_bac9c_4;

typedef struct st_bac9c_0 {
    char field_0;
} st_bac9c_0;


unsigned long long sub_bac9c(st_bac9c_3 *a0, st_bac9c_1 *a1, long long a2, void* a3, long long a4, unsigned int *a5, unsigned int a6, unsigned int a7)
{
    unsigned long v24;  // x28
    unsigned long v25;  // x23
    unsigned long v34;  // cc_dep1
    unsigned long v35;  // cc_dep2
    unsigned long long v36;  // w8
    unsigned int v37;  // w8
    unsigned long long v38;  // 4112
    unsigned long long v39;  // 4108
    unsigned long long v40;  // 4112
    unsigned long long v41;  // 4108
    unsigned long long v42;  // w24
    unsigned long long v43;  // w8
    long long v26;  // x20
    unsigned long long v44;  // x11
    unsigned int v45;  // w26
    unsigned long long v46;  // 4141
    unsigned int v47;  // w12
    unsigned long idx;  // x13
    unsigned int v49;  // w21
    unsigned long long v50;  // x27
    unsigned long long v51;  // x19
    unsigned long v52;  // x21
    unsigned int v53;  // w0
    void* v27;  // x26
    unsigned long v54;  // x8
    st_bac9c_3 *v55;  // x9
    unsigned long index;  // x8
    unsigned int v57;  // w21
    unsigned long long v58;  // w8
    unsigned long long v59;  // x21
    unsigned long v60;  // x21
    unsigned int v61;  // w0
    unsigned long idx1;  // x8
    unsigned int *v63;  // x9
    void* v28;  // x13
    unsigned int v64;  // w25
    long long v65;  // x28
    unsigned long long v66;  // x20
    unsigned int v67;  // w0
    unsigned long v68;  // x25
    unsigned int v69;  // w0
    unsigned long long v70;  // w8
    unsigned long long v71;  // x11
    unsigned int *v72;  // x9
    unsigned long long v73;  // x19
    unsigned long long v29;  // w8
    unsigned long long v74;  // w0
    unsigned long long v75;  // w21
    unsigned long v76;  // x0
    st_bac9c_3 *v77;  // x9
    unsigned long long v80;  // x20
    unsigned long long v81;  // x24
    unsigned long long v82;  // x21
    unsigned long long v83;  // x25
    unsigned int *v30;  // x25
    unsigned long long v84;  // w27
    unsigned long long v85;  // x23
    unsigned long long v86;  // x8
    unsigned int *v87;  // x10
    void* v88;  // x3
    unsigned int *v89;  // x9
    unsigned int v31;  // w23
    unsigned long v32;  // x22
    unsigned int v33;  // w8
    unsigned int v0;  // [bp-0x114]
    unsigned int v1;  // [bp-0x110]
    unsigned long v2;  // [bp-0x108]
    unsigned int *v3;  // [bp-0x100]
    unsigned long v4;  // [bp-0xf8]
    unsigned int v5;  // [bp-0xf0]
    unsigned int v6;  // [bp-0xec]
    unsigned long v7;  // [bp-0xe8]
    long long v8;  // [bp-0xd8], Other Possible Types: unsigned long
    unsigned long long v9;  // [bp-0xc8]
    unsigned int v10;  // [bp-0xc4]
    unsigned int *v11;  // [bp-0xc0], Other Possible Types: unsigned long
    unsigned int *v12;  // [bp-0xb8], Other Possible Types: unsigned long long
    unsigned int *v13;  // [bp-0xb0], Other Possible Types: unsigned int
    unsigned long v14;  // [bp-0xa8]
    unsigned long long v15;  // [bp-0x9c]
    void* v16;  // [bp-0x98]
    st_bac9c_0 **v17;  // [bp-0x90], Other Possible Types: char
    st_bac9c_0 *v18;  // [bp-0x88]
    unsigned int v19;  // [bp-0x7c]
    st_bac9c_0 *v20;  // [bp-0x78], Other Possible Types: st_bac9c_4 **
    st_bac9c_0 **v21;  // [bp-0x70], Other Possible Types: st_bac9c_4 **, char
    char *v22;  // [bp-0x10]
    char v23;  // [bp+0x0]

    v22 = &v23;
    v18 = &v17;
    v17 = &v18;
    v24 = a1->field_8;
    v25 = a1->field_2c;
    if (v24 + v25 > a3)
        return 0;
    v26 = a4;
    v8 = a2;
    v20 = &v21;
    v21 = &v20;
    v27 = a3 - v24;
    v16 = a3;
    v28 = v27;
    if ((unsigned int)v28 > (unsigned int)v25)
    {
        do
        {
            v25 += sub_b570c(a1, v24 + (v25 & 0xffffffff), v26, v27, 3, 0);
        } while ((unsigned int)v25 < (unsigned int)v27);
        v24 = a1->field_8;
        a3 = v16;
        v28 = a3 - a1->field_8;
    }
    a1->field_2c = (unsigned int)v27;
    v20 = &v21;
    v21 = &v20;
    v29 = a1->field_114;
    v30 = a1->field_70;
    v31 = 2654435761 * *(int *)a3 >> ((char)-a1->field_108 & 31);
    v32 = v30[v31];
    if (a1->field_114 >= 0xfff)
        v29 = 0xfff;
    v12 = v29;
    v14 = a1->field_80;
    v13 = 0xffffffff << ((char)(a1->field_104 - 1) & 31);
    v33 = ~v13;
    v10 = v33;
    v34 = v28 & 0xffffffff;
    v35 = v33;
    if ((unsigned int)v28 < v33)
        v36 = 0;
    else
        v36 = (unsigned int)(v28 - v33);
    v9 = v36;
    v37 = 1 << ((char)a1->field_100 & 31);
    if (v37 < (unsigned int)(v28 - a1->field_1c))
    {
        v38 = arm64g_calculate_condition(131, v34, v35, 0);
        v39 = arm64g_calculate_condition(3, (v38 & 1 ? a1->field_28 : 0), 0, 0);
        if (!(v39 & 1))
            goto LABEL_badfa;
LABEL_badf9:
        v42 = (unsigned int)(v28 - v37);
    }
    else
    {
        v40 = arm64g_calculate_condition(131, v34, v35, 0);
        v41 = arm64g_calculate_condition(0, (v40 & 1 ? a1->field_28 : 0), 0, 0);
        if (v41 & 1)
            goto LABEL_badf9;
LABEL_badfa:
        v42 = a1->field_1c;
    }
    if (1 < v42)
        v43 = v42;
    else
        v43 = 1;
    v15 = v43;
    v7 = a1->field_10c;
    v44 = a7 - 1;
    v45 = (unsigned int)v28;
    v46 = arm64g_calculate_condition(129, a6, 4, 0);
    if (v46 & 1)
    {
        v50 = 0;
        v73 = v44;
        if (v44 <= 2)
            goto LABEL_bb07c;
        goto LABEL_bb210;
    }
    v47 = v45 - a1->field_18;
    v2 = a3 + 3;
    idx = a6;
    if (a6 == 3)
    {
        v49 = *a5 - 1;
        v3 = v30;
        v4 = idx;
        v5 = v47;
        v6 = v31;
        v11 = a5;
        if (v49 - 1 < v47)
            goto LABEL_bae94;
        goto LABEL_bae5c;
    }
    v49 = a5[idx];
    v3 = v30;
    v4 = idx;
    v5 = v47;
    v6 = v31;
    v11 = a5;
    if (v47 <= v49 - 1)
    {
LABEL_bae5c:
        v50 = 0;
        goto LABEL_baf68;
    }
LABEL_bae94:
    v51 = v44;
    v1 = sub_b9f30(a3, 3);
    v52 = v49;
    v53 = sub_b9f30(a3 - v52, 3);
    if (v45 - v49 >= v42)
    {
        v31 = v6;
        if (v1 == v53)
        {
            v54 = sub_7cdfc(v2, v2 + -v52, v26) + 3;
            v44 = v51;
            if ((unsigned int)v54 > (unsigned int)v44)
            {
                v50 = 1;
                v55 = a0;
                *(unsigned int *)&v55->field_0 = 1;
                *(unsigned int *)((char *)&v55->field_0 + 4) = v54;
                a3 = v16;
                a5 = v11;
                v47 = v5;
                idx = v4;
                if (v12 < (unsigned int)v54)
                    return 1;
                v44 = v54;
                if (a3 + v54 == v26)
                    return 1;
            }
            else
            {
                a3 = v16;
                v50 = 0;
LABEL_baf5c:
                a5 = v11;
                v47 = v5;
                idx = v4;
            }
        }
        else
        {
            a3 = v16;
            goto LABEL_baf4c;
        }
    }
    else
    {
        a3 = v16;
        v31 = v6;
LABEL_baf4c:
        v44 = v51;
        goto LABEL_baf5c;
    }
LABEL_baf68:
    index = idx + 1;
    if (index == 3)
    {
        v57 = *a5 - 1;
        if (v57 - 1 < v47)
            goto LABEL_bb108;
        goto LABEL_baf88;
    }
    v57 = a5[index];
    if (v47 <= v57 - 1)
    {
LABEL_baf88:
        v58 = 0;
        v59 = 0;
        if (v44 < 0)
            goto LABEL_bb198;
    }
    else
    {
LABEL_bb108:
        v0 = sub_b9f30(a3, 3);
        v60 = v57;
        v61 = sub_b9f30(a3 - v60, 3);
        v58 = 0;
        if (v45 - v57 >= v42)
        {
            v31 = v6;
            a3 = v16;
            idx = v4;
            a5 = v11;
            v47 = v5;
            if (v0 == v61)
            {
                idx = v4;
                v47 = v5;
                a5 = v11;
                a3 = v16;
                v58 = sub_7cdfc(v2, v2 + -v60, v26) + 3;
            }
            v59 = v58;
            if (v59 > v44)
                goto LABEL_bb198;
        }
        else
        {
            a3 = v16;
            v47 = v5;
            v31 = v6;
            a5 = v11;
            idx = v4;
            v59 = 0;
            if (v44 < 0)
            {
LABEL_bb198:
                v63 = &(&a0->field_0)[v50 & 0xffffffff];
                *v63 = 2;
                v63[1] = v58;
                v50 = (unsigned int)v50 + 1;
                if (v12 < v58)
                    return v50;
                if (a3 + v59 == v26)
                    return v50;
                idx1 = idx + 2;
                if (idx1 != 3)
                {
LABEL_bafa8:
                    v64 = a5[idx1];
                    if (v47 <= v64 - 1)
                        goto LABEL_bb1e4;
                    goto LABEL_bafb8;
                }
LABEL_bb1d0:
                v64 = *a5 - 1;
                if (v64 - 1 < v47)
                {
LABEL_bafb8:
                    v11 = v24;
                    v65 = v26;
                    v66 = v50;
                    v5 = v45;
                    v67 = sub_b9f30(a3, 3);
                    v68 = v64;
                    v69 = sub_b9f30(a3 - v68, 3);
                    v70 = 0;
                    if (v45 - v64 >= v42)
                    {
                        v50 = v66;
                        v26 = v65;
                        v24 = v11;
                        v45 = v5;
                        v31 = v6;
                        a3 = v16;
                        if (v67 == v69)
                        {
                            a3 = v16;
                            v70 = sub_7cdfc(v2, v2 + -v68, v26) + 3;
                        }
                        v71 = v70;
                        if (v71 <= v59)
                            goto LABEL_bb1f4;
                    }
                    else
                    {
                        a3 = v16;
                        v50 = v66;
                        v26 = v65;
                        v24 = v11;
                        v45 = v5;
                        v31 = v6;
                        v71 = 0;
                        if (v59 >= 0)
                        {
LABEL_bb1f4:
                            v30 = v3;
                            v73 = v59;
                            if (v59 <= 2)
                            {
LABEL_bb07c:
                                v74 = (unsigned int)sub_bc548(a1, v8, a3);
                                if (v74 >= v15 && !(v75 = v45 - v74, v75 > 0x3ffff))
                                {
                                    v76 = sub_7cdfc(v16, v24 + v74, v26);
                                    if (v76 >= 3)
                                    {
                                        v77 = a0;
                                        *(unsigned int *)&v77->field_0 = v75 + 3;
                                        *(unsigned int *)((char *)&v77->field_0 + 4) = v76;
                                        if (v12 < v76 || v16 + v76 == v26)
                                        {
                                            a1->field_2c = v45 + 1;
                                            return 1;
                                        }
                                        v50 = 1;
                                        v73 = v76;
                                    }
                                }
                            }
LABEL_bb210:
                            v11 = v24;
                            v80 = v50;
                            v13 = v14 + (v45 & ~v13) * 2 * 4;
                            v12 = v13 + 1;
                            v81 = v45 + 9;
                            v30[v31] = v45;
                            if (v15 <= (unsigned int)v32)
                            {
                                v82 = 0;
                                v83 = 0;
                                *(unsigned int *)&v8 = v45 + 3;
                                v84 = (1 << ((char)v7 & 31)) - 1;
                                do
                                {
                                    if (v83 < v82)
                                        v85 = v83;
                                    else
                                        v85 = v82;
                                    v86 = sub_7cdfc() + v85;
                                    if (v86 > v73)
                                    {
                                        if (v81 - v32 < v86)
                                            v81 = v32 + v86 & 0xffffffff;
                                        else
                                            v81 &= 0xffffffff;
                                        v87 = &(&a0->field_0)[v80 & 0xffffffff];
                                        *v87 = (unsigned int)v8 - v32;
                                        v87[1] = v86;
                                        v80 = (unsigned int)v80 + 1;
                                        if (0x1000 < v86 || (v88 = v16, v73 = v86, v88 + v86 == v26))
                                            break;
                                    }
                                    else
                                    {
                                        v88 = v16;
                                    }
                                    v89 = v14 + ((unsigned int)v32 & v10) * 2 * 4;
                                    if (*((char *)v88 + v86) > *(char *)(v11 + (v32 & 0xffffffff) + v86))
                                    {
                                        *v13 = v32;
                                        if ((unsigned int)v32 > v9)
                                        {
                                            v89 += 1;
                                            v83 = v86;
                                            v13 = v89;
                                            continue;
                                        }
                                        else
                                        {
                                            v13 = &v19;
                                            break;
                                        }
                                    }
                                    else
                                    {
                                        *v12 = v32;
                                        if ((unsigned int)v32 > v9)
                                        {
                                            v82 = v86;
                                            v12 = v89;
                                        }
                                        else
                                        {
                                            v12 = &v19;
                                            break;
                                        }
                                    }
                                } while (v84 >= 1 && (v32 = *v89, v84 -= 1, v15 <= (unsigned int)v32));
                            }
                            *v12 = 0;
                            *v13 = 0;
                            a1->field_2c = (unsigned int)v81 - 8;
                            return v80;
                        }
                    }
                }
                else
                {
LABEL_bb1e4:
                    v70 = 0;
                    v71 = 0;
                    if (v59 >= 0)
                        goto LABEL_bb1f4;
                }
                v72 = &(&a0->field_0)[v50 & 0xffffffff];
                *v72 = 3;
                v72[1] = v70;
                v50 = (unsigned int)v50 + 1;
                v30 = v3;
                if (v12 < v70)
                    return v50;
                if (a3 + v71 == v26)
                    return v50;
                v73 = v71;
                if (2 >= v71)
                    goto LABEL_bb07c;
                goto LABEL_bb210;
            }
        }
    }
    v59 = v44;
    idx1 = idx + 2;
    if (idx1 == 3)
        goto LABEL_bb1d0;
    goto LABEL_bafa8;
}
