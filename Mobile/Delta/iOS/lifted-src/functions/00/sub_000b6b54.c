/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb6b54..0xb7544 (2544 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b6b54_1 {
    char padding_0[8];
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned int field_18;
    unsigned int field_1c;
    char padding_20[8];
    unsigned int field_28;
    unsigned int field_2c;
    char padding_30[64];
    struct st_b6b54_2 *field_70;
    char padding_78[8];
    unsigned long long field_80;
    char padding_88[120];
    unsigned int field_100;
    unsigned int field_104;
    unsigned int field_108;
    unsigned int field_10c;
    char padding_110[4];
    unsigned int field_114;
} st_b6b54_1;

typedef struct st_b6b54_2 {
    unsigned int field_0;
} st_b6b54_2;

typedef struct st_b6b54_3 {
    struct st_b6b54_0 *field_0;
} st_b6b54_3;

typedef struct st_b6b54_0 {
    char field_0;
} st_b6b54_0;


long long sub_b6b54(unsigned int *a0, st_b6b54_1 *a1, long long a2, void* a3, long long a4, unsigned int *a5, unsigned int a6, unsigned int a7)
{
    unsigned long v27;  // x28
    unsigned long v28;  // x23
    unsigned long v37;  // x25
    unsigned long v38;  // x26
    unsigned long v39;  // cc_dep1
    unsigned long v40;  // cc_dep2
    unsigned int v41;  // w8
    unsigned long v42;  // x27
    unsigned int v43;  // w9
    unsigned int v44;  // w8
    unsigned long long v45;  // 4112
    unsigned long long v46;  // 4108
    long long v29;  // x20
    unsigned long long v47;  // 4112
    unsigned long long v48;  // 4108
    unsigned int v49;  // w8
    unsigned long v50;  // x15
    unsigned long long v51;  // 4148
    unsigned int v52;  // w11
    unsigned long idx;  // x16
    unsigned int v54;  // w22
    unsigned int v55;  // w12
    unsigned int v56;  // w21
    void* v30;  // x24
    unsigned int v57;  // w8
    unsigned int v58;  // w0
    unsigned long v59;  // x22
    unsigned int v61;  // w0
    unsigned long v62;  // x19
    unsigned long long v63;  // 4121
    unsigned int *v64;  // x22
    unsigned long v65;  // x19
    long long v66;  // x23
    void* v31;  // x26
    unsigned int v67;  // w0
    unsigned long v68;  // x8
    unsigned int *v69;  // x9
    unsigned long index;  // x8
    unsigned int v71;  // w22
    unsigned int v72;  // w21
    unsigned int v73;  // w9
    unsigned int v74;  // w8
    unsigned long long v75;  // 4121
    unsigned long v76;  // x19
    void* v32;  // x14
    long long v77;  // x21
    unsigned int v78;  // w0
    unsigned int v79;  // w0
    unsigned long v80;  // x22
    unsigned int v81;  // w0
    unsigned long v82;  // x21
    unsigned int *v83;  // x9
    unsigned long idx1;  // x8
    unsigned int v85;  // w23
    unsigned int v86;  // w22
    unsigned int v33;  // w8
    unsigned int v87;  // w9
    unsigned int v88;  // w8
    unsigned long long v89;  // 4121
    unsigned long v90;  // x19
    long long v91;  // x22
    unsigned int v92;  // w0
    unsigned int v93;  // w0
    unsigned long v94;  // x23
    unsigned int v95;  // w0
    unsigned int *v96;  // x9
    unsigned int *v34;  // x23
    unsigned long v97;  // x22
    unsigned int v98;  // w0
    unsigned int v99;  // w21
    unsigned long v100;  // x8
    unsigned long v101;  // x0
    unsigned int *v102;  // x9
    unsigned long v104;  // x10
    unsigned long v105;  // x11
    unsigned int v106;  // w21
    unsigned int v35;  // w13
    unsigned long long v107;  // x23
    unsigned long v108;  // x22
    void* v109;  // x19
    long long v110;  // x24
    char *v111;  // x20
    unsigned long v112;  // x8
    char *v113;  // x22
    unsigned long v114;  // x12
    unsigned long v115;  // x11
    unsigned int v116;  // w11
    unsigned long long v36;  // x28
    unsigned int *v117;  // x10
    unsigned int *iter;  // x9
    unsigned long v0;  // [bp-0x130]
    unsigned int *v1;  // [bp-0x128]
    unsigned int v2;  // [bp-0x11c]
    unsigned long v3;  // [bp-0x118]
    unsigned long v4;  // [bp-0x110]
    unsigned int v5;  // [bp-0x104]
    unsigned long v6;  // [bp-0x100]
    unsigned int v7;  // [bp-0xec]
    unsigned long v8;  // [bp-0xe8]
    unsigned int v9;  // [bp-0xd8]
    unsigned int v10;  // [bp-0xd4]
    unsigned int *v11;  // [bp-0xd0], Other Possible Types: long long
    unsigned int *v12;  // [bp-0xc8], Other Possible Types: unsigned int
    unsigned long v13;  // [bp-0xc0]
    unsigned int v14;  // [bp-0xb8]
    unsigned int v15;  // [bp-0xb4]
    unsigned int *v16;  // [bp-0xb0], Other Possible Types: unsigned long
    unsigned int v17;  // [bp-0xa8], Other Possible Types: unsigned long
    unsigned long v18;  // [bp-0xa0]
    unsigned int v19;  // [bp-0x94]
    st_b6b54_0 **v20;  // [bp-0x90], Other Possible Types: char
    st_b6b54_0 *v21;  // [bp-0x88]
    char v22;  // [bp-0x7c]
    st_b6b54_0 *v23;  // [bp-0x78], Other Possible Types: st_b6b54_3 **
    st_b6b54_0 **v24;  // [bp-0x70], Other Possible Types: st_b6b54_3 **, char
    char *v25;  // [bp-0x10]
    char v26;  // [bp+0x0]

    v25 = &v26;
    v21 = &v20;
    v20 = &v21;
    v27 = a1->field_8;
    v28 = a1->field_2c;
    if (v27 + v28 > a3)
        return 0;
    v29 = a4;
    v30 = a3;
    v11 = a2;
    v23 = &v24;
    v24 = &v23;
    v31 = v30 - v27;
    v16 = a5;
    v32 = v31;
    if ((unsigned int)v32 > (unsigned int)v28)
    {
        do
        {
            v28 += sub_b570c(a1, v27 + (v28 & 0xffffffff), v29, v31, 3, 1);
        } while ((unsigned int)v28 < (unsigned int)v31);
        v27 = a1->field_8;
        v32 = v30 - a1->field_8;
        a5 = v16;
    }
    v13 = v27;
    a1->field_2c = (unsigned int)v31;
    v23 = &v24;
    v24 = &v23;
    v33 = a1->field_114;
    if (a1->field_114 >= 0xfff)
        v33 = 0xfff;
    v12 = v33;
    v34 = a1->field_70;
    v7 = 2654435761 * *(int *)v30 >> ((char)-a1->field_108 & 31);
    v35 = v34[v7];
    v36 = a1->field_80;
    v14 = 0xffffffff << ((char)(a1->field_104 - 1) & 31);
    v37 = ~v14;
    v38 = a1->field_10;
    v39 = v32 & 0xffffffff;
    v40 = v37 & 0xffffffff;
    if ((unsigned int)v32 < (unsigned int)v37)
        v41 = 0;
    else
        v41 = (unsigned int)(v32 - v37);
    v10 = v41;
    v42 = a1->field_18;
    v43 = a1->field_1c;
    v44 = 1 << ((char)a1->field_100 & 31);
    if (v44 < (unsigned int)(v32 - a1->field_1c))
    {
        v45 = arm64g_calculate_condition(131, v39, v40, 0);
        v46 = arm64g_calculate_condition(3, (v45 & 1 ? a1->field_28 : 0), 0, 0);
        if (!(v46 & 1))
            goto LABEL_b6cb2;
LABEL_b6cb1:
        v43 = (unsigned int)(v32 - v44);
    }
    else
    {
        v47 = arm64g_calculate_condition(131, v39, v40, 0);
        v48 = arm64g_calculate_condition(0, (v47 & 1 ? a1->field_28 : 0), 0, 0);
        if (v48 & 1)
            goto LABEL_b6cb1;
LABEL_b6cb2:
    }
    if (1 < v43)
        v49 = v43;
    else
        v49 = 1;
    v15 = v49;
    v6 = a1->field_10c;
    v50 = a7 - 1;
    v19 = v35;
    v17 = (unsigned int)v32;
    v51 = arm64g_calculate_condition(129, a6, 4, 0);
    if (!(v51 & 1))
    {
        v52 = (unsigned int)(v32 - v42);
        v3 = v30 + 3;
        idx = a6;
        if (a6 == 3)
            v54 = *a5 - 1;
        else
            v54 = a5[idx];
        v55 = (unsigned int)(v32 - v43);
        v56 = (unsigned int)(v32 - v54);
        v57 = v54 - 1;
        v9 = v52;
        v5 = v55;
        v4 = idx;
        v2 = v43;
        if (v52 > v57)
        {
            v18 = v50;
            v0 = v42;
            v58 = sub_b9f30(v30, 3);
            v59 = v54;
            if (v56 >= v43 && v58 == sub_b9f30(v30 - v59, 3))
            {
                v61 = sub_7cdfc(v3, v3 + -v59, v29);
                v42 = v0;
                goto LABEL_b6e04;
            }
            else
            {
                v42 = v0;
                v35 = v19;
                v32 = v17;
                goto LABEL_b6f20;
            }
        }
        v62 = 0;
        if (v55 <= v57 || !(v63 = arm64g_calculate_condition(129, v56 - v42 & 0xffffffff, 4, 0), !(v63 & 1)))
            goto LABEL_b6e70;
        v18 = v50;
        v64 = v34;
        v65 = v42;
        v66 = v38 + v56;
        v67 = sub_b9f30(v30, 3);
        if (v67 == sub_b9f30(v66, 3))
        {
            v42 = v65;
            v61 = sub_84f30(v3, v66 + 3, v29, v38 + v65, v13 + v65);
            v34 = v64;
LABEL_b6e04:
            v68 = v61 + 3;
            v50 = v18;
            v32 = v17;
            if ((unsigned int)v68 > (unsigned int)v50)
            {
                v62 = 1;
                v69 = a0;
                *v69 = 1;
                v69[1] = v68;
                if (v12 < (unsigned int)v68)
                    return 1;
                v50 = v68;
                a5 = v16;
                v35 = v19;
                v52 = v9;
                idx = v4;
                v55 = v5;
                if (v30 + v68 == v29)
                    return 1;
            }
            else
            {
                v62 = 0;
                a5 = v16;
                v35 = v19;
                v52 = v9;
                idx = v4;
                v55 = v5;
            }
LABEL_b6e70:
            index = idx + 1;
            if (index != 3)
                goto LABEL_b6f40;
            goto LABEL_b6e7c;
        }
        v42 = v65;
        v35 = v19;
        v32 = v17;
        v34 = v64;
        v62 = 0;
LABEL_b6f20:
        v50 = v18;
        a5 = v16;
        v52 = v9;
        v55 = v5;
        idx = v4;
        index = idx + 1;
        if (index == 3)
        {
LABEL_b6e7c:
            v71 = *a5 - 1;
            v72 = (unsigned int)(v32 - v71);
            v73 = v71 - 1;
            v1 = v34;
            if (v73 < v52)
                goto LABEL_b6f58;
            goto LABEL_b6e98;
        }
LABEL_b6f40:
        v71 = a5[index];
        v72 = (unsigned int)(v32 - v71);
        v73 = v71 - 1;
        v1 = v34;
        if (v52 <= v73)
        {
LABEL_b6e98:
            v74 = 0;
            if (v55 > v73 && (v75 = arm64g_calculate_condition(129, v72 - v42 & 0xffffffff, 4, 0), !(v75 & 1)))
            {
                v18 = v50;
                v76 = v42;
                v77 = v38 + v72;
                v78 = sub_b9f30(v30, 3);
                if (v78 == sub_b9f30(v77, 3))
                {
                    v42 = v76;
                    v74 = sub_84f30(v3, v77 + 3, v29, v38 + v76, v13 + v76) + 3;
                }
                else
                {
                    v74 = 0;
                    v42 = v76;
                }
                goto LABEL_b70d8;
            }
            goto LABEL_b6ff4;
        }
LABEL_b6f58:
        v18 = v50;
        v79 = sub_b9f30(v30, 3);
        v80 = v71;
        v81 = sub_b9f30(v30 - v80, 3);
        v74 = 0;
        if (v72 >= v2)
        {
            v35 = v19;
            v32 = v17;
            v50 = v18;
            a5 = v16;
            v52 = v9;
            v55 = v5;
            idx = v4;
            if (v79 == v81)
            {
                idx = v4;
                v55 = v5;
                v52 = v9;
                a5 = v16;
                v50 = v18;
                v32 = v17;
                v35 = v19;
                v74 = sub_7cdfc(v3, v3 + -v80, v29) + 3;
            }
LABEL_b6ff4:
            v82 = v74;
            if (v82 <= v50)
                goto LABEL_b7100;
            goto LABEL_b7000;
        }
        v42 = v42;
        v62 = v62;
LABEL_b70d8:
        v35 = v19;
        v32 = v17;
        v50 = v18;
        a5 = v16;
        v52 = v9;
        v55 = v5;
        idx = v4;
        v82 = v74;
        if (v50 < v82)
        {
LABEL_b7000:
            v83 = &a0[2 * (v62 & 0xffffffff)];
            *v83 = 2;
            v83[1] = v74;
            v62 = (unsigned int)v62 + 1;
            if (v12 < v74)
                return v62;
            if (v30 + v82 == v29)
                return v62;
            idx1 = idx + 2;
            if (idx1 != 3)
                goto LABEL_b7110;
            goto LABEL_b7038;
        }
LABEL_b7100:
        v82 = v50;
        idx1 = idx + 2;
        if (idx1 == 3)
        {
LABEL_b7038:
            v85 = *a5 - 1;
            v86 = (unsigned int)(v32 - v85);
            v87 = v85 - 1;
            if (v87 < v52)
                goto LABEL_b7124;
            goto LABEL_b7050;
        }
LABEL_b7110:
        v85 = a5[idx1];
        v86 = (unsigned int)(v32 - v85);
        v87 = v85 - 1;
        if (v52 <= v87)
        {
LABEL_b7050:
            v88 = 0;
            if (v55 > v87 && (v89 = arm64g_calculate_condition(129, v86 - v42 & 0xffffffff, 4, 0), !(v89 & 1)))
            {
                v90 = v42;
                v91 = v38 + v86;
                v92 = sub_b9f30(v30, 3);
                if (v92 == sub_b9f30(v91, 3))
                {
                    v42 = v90;
                    v88 = sub_84f30(v3, v91 + 3, v29, v38 + v90, v13 + v90) + 3;
                }
                else
                {
                    v88 = 0;
                    v42 = v90;
                }
                goto LABEL_b72e0;
            }
            goto LABEL_b7194;
        }
LABEL_b7124:
        v9 = v62;
        v93 = sub_b9f30(v30, 3);
        v94 = v85;
        v95 = sub_b9f30(v30 - v94, 3);
        v88 = 0;
        if (v86 >= v2)
        {
            v62 = v9;
            v35 = v19;
            v32 = v17;
            if (v93 == v95)
            {
                v32 = v17;
                v35 = v19;
                v88 = sub_7cdfc(v3, v3 + -v94, v29) + 3;
            }
LABEL_b7194:
            v50 = v88;
            if (v50 <= v82)
                goto LABEL_b72f4;
            goto LABEL_b71a0;
        }
        v62 = v9;
LABEL_b72e0:
        v35 = v19;
        v32 = v17;
        v50 = v88;
        if (v82 < v50)
        {
LABEL_b71a0:
            v96 = &a0[2 * (v62 & 0xffffffff)];
            *v96 = 3;
            v96[1] = v88;
            v62 = (unsigned int)v62 + 1;
            v34 = v1;
            if (v12 < v88)
                return v62;
            if (v30 + v50 == v29)
                return v62;
            if (2 >= v50)
                goto LABEL_b71d8;
        }
        else
        {
LABEL_b72f4:
            v50 = v82;
            v34 = v1;
            if (v82 <= 2)
            {
LABEL_b71d8:
                v97 = v50;
                v98 = sub_bc548(a1, v11, v30);
                if (v98 >= v15)
                {
                    v32 = v17;
                    v99 = (unsigned int)(v32 - v98);
                    v35 = v19;
                    if (v99 <= 0x3ffff)
                    {
                        v100 = v98;
                        if ((unsigned int)v42 > v98)
                        {
                            v101 = sub_84f30(v30, v38 + v100, v29, v38 + v42, v13 + v42);
                            v35 = v19;
                            v32 = v17;
                            v50 = v97;
                            if (3 <= v101)
                                goto LABEL_b728c;
                        }
                        else
                        {
                            v101 = sub_7cdfc(v30, v13 + v100, v29);
                            v35 = v19;
                            v32 = v17;
                            v50 = v97;
                            if (v101 >= 3)
                            {
LABEL_b728c:
                                v102 = a0;
                                *v102 = v99 + 3;
                                v102[1] = v101;
                                if (v12 < v101 || v30 + v101 == v29)
                                {
                                    a1->field_2c = (unsigned int)v32 + 1;
                                    return 1;
                                }
                                v62 = 1;
                                v50 = v101;
                            }
                        }
                    }
                    else
                    {
                        v50 = v97;
                    }
                }
                else
                {
                    v35 = v19;
                    v32 = v17;
                    v50 = v97;
                }
            }
        }
    }
    else
    {
        v62 = 0;
        if (v50 <= 2)
            goto LABEL_b71d8;
    }
    v12 = v36 + ((unsigned int)v32 & ~v14) * 2 * 4;
    v11 = v12 + 1;
    v14 = (unsigned int)v32 + 9;
    v34[v7] = (unsigned int)v32;
    if (v15 <= v35)
    {
        v104 = 0;
        v105 = 0;
        v7 = (unsigned int)v32 + 3;
        v106 = (1 << ((char)v6 & 31)) - 1;
        v8 = v38;
        do
        {
            v17 = v104;
            v18 = v50;
            v16 = v105;
            if (v105 < v104)
                v107 = v105;
            else
                v107 = v104;
            v19 = v35;
            v108 = v35;
            if (v42 > v107 + v108)
            {
                v9 = v62;
                v109 = v30;
                v110 = v29;
                v111 = v38 + v108;
                v112 = sub_84f30(v109 + v107, &v111[v107], v110, v38 + v42, v13 + v42) + v107;
                v38 = v8;
                if (v112 + v108 < v42)
                    v113 = v111;
                else
                    v113 = v13 + v108;
                v29 = v110;
                v30 = v109;
                v62 = v9;
                v50 = v18;
                v114 = v19;
                if (v50 >= v112)
                    goto LABEL_b74ac;
            }
            else
            {
                v113 = v13 + v108;
                v112 = sub_7cdfc(v30 + v107, &v113[v107], v29) + v107;
                v50 = v18;
                v114 = v19;
                if (v112 <= v50)
                    goto LABEL_b74ac;
            }
            v115 = v14;
            if (v115 - v114 < v112)
                v116 = (unsigned int)v114 + (unsigned int)v112;
            else
                v116 = v115;
            v14 = v116;
            v117 = &a0[2 * (v62 & 0xffffffff)];
            *v117 = v7 - v114;
            v117[1] = v112;
            v62 = (unsigned int)v62 + 1;
            if (0x1000 < v112 || (v50 = v112, v30 + v112 == v29))
                break;
LABEL_b74ac:
            iter = v36 + ((unsigned int)v114 & (unsigned int)v37) * 2 * 4;
            if (*((char *)v30 + v112) > v113[v112])
            {
                *v12 = v114;
                if ((unsigned int)v114 > v10)
                {
                    iter += 1;
                    v105 = v112;
                    v12 = iter;
                    v104 = v17;
                    continue;
                }
                else
                {
                    v12 = &v22;
                    break;
                }
            }
            else
            {
                *v11 = v114;
                if ((unsigned int)v114 > v10)
                {
                    v104 = v112;
                    v11 = iter;
                    v105 = v16;
                }
                else
                {
                    v11 = &v22;
                    break;
                }
            }
        } while (v106 >= 1 && (v35 = *iter, v106 -= 1, v15 <= v35));
    }
    *v11 = 0;
    *v12 = 0;
    a1->field_2c = v14 - 8;
    return v62;
}
