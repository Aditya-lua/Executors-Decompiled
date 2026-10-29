/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbd080..0xbd98c (2316 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bd080_1 {
    char padding_0[8];
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned int field_18;
    unsigned int field_1c;
    char padding_20[8];
    unsigned int field_28;
    unsigned int field_2c;
    char padding_30[64];
    struct st_bd080_2 *field_70;
    char padding_78[8];
    unsigned long long field_80;
    char padding_88[120];
    unsigned int field_100;
    unsigned int field_104;
    unsigned int field_108;
    unsigned int field_10c;
    char padding_110[4];
    unsigned int field_114;
} st_bd080_1;

typedef struct st_bd080_2 {
    unsigned int field_0;
} st_bd080_2;

typedef struct st_bd080_3 {
    struct st_bd080_0 *field_0;
} st_bd080_3;

typedef struct st_bd080_0 {
    char field_0;
} st_bd080_0;


unsigned int sub_bd080(unsigned int *a0, st_bd080_1 *a1, unsigned long a2, void* a3, long long a4, unsigned int *a5, unsigned int a6, unsigned int a7)
{
    unsigned long v27;  // x28
    unsigned long v28;  // x23
    unsigned int v37;  // w8
    unsigned long v38;  // x22
    unsigned long v39;  // cc_dep1
    unsigned long v40;  // cc_dep2
    unsigned int v41;  // w8
    unsigned long v42;  // x12
    unsigned int v43;  // w8
    unsigned long long v44;  // 4112
    unsigned long long v45;  // 4108
    unsigned long long v46;  // 4112
    void* v29;  // x25
    unsigned long long v47;  // 4108
    unsigned int v48;  // w24
    unsigned int v49;  // w8
    unsigned int v50;  // x17
    unsigned long long v51;  // 4145
    unsigned int v52;  // w26
    unsigned long index;  // x10
    unsigned int v54;  // w20
    unsigned int v55;  // w21
    unsigned int v56;  // w8
    void* v30;  // x3
    unsigned int v57;  // w0
    unsigned long v58;  // x20
    unsigned int v59;  // w0
    unsigned int v60;  // w0
    unsigned int v61;  // x0
    unsigned int idx;  // x8
    unsigned long long v63;  // 4125
    unsigned int *v64;  // x20
    long long v65;  // x23
    unsigned int v66;  // w0
    void* v31;  // x13
    unsigned long v67;  // x8
    unsigned int v68;  // w20
    unsigned int v69;  // w21
    unsigned int v70;  // w9
    unsigned long long v71;  // 4125
    unsigned int v72;  // x20
    long long v73;  // x21
    unsigned int v74;  // w0
    unsigned int v75;  // w8
    unsigned int v76;  // x21
    unsigned int v32;  // w16
    unsigned int v77;  // x24
    unsigned int v78;  // x19
    unsigned int v79;  // w0
    unsigned long v80;  // x20
    unsigned int v81;  // w0
    unsigned int *v82;  // x9
    unsigned int idx1;  // x8
    unsigned int v84;  // w20
    unsigned int v85;  // w22
    unsigned int v86;  // w9
    unsigned int *v33;  // x14
    unsigned int v87;  // w8
    unsigned long long v88;  // 4125
    unsigned long v89;  // x20
    long long v90;  // x22
    unsigned int v91;  // w0
    unsigned int v92;  // w0
    unsigned long v93;  // x20
    unsigned int v94;  // w0
    unsigned int *v95;  // x9
    unsigned int v96;  // x0
    unsigned long long idx2;  // x15
    unsigned int v97;  // x19
    unsigned long long v98;  // x26
    unsigned int v99;  // x10
    unsigned int v100;  // x27
    unsigned int v101;  // w24
    unsigned long v102;  // x28
    unsigned int v103;  // x21
    unsigned long long v104;  // x20
    unsigned long long v105;  // x22
    char *v106;  // x23
    unsigned long v35;  // x25
    unsigned int v107;  // x8
    char *v108;  // x22
    unsigned int *v109;  // x10
    unsigned int *v110;  // x9
    unsigned int v111;  // w24
    unsigned long v36;  // x23
    unsigned int v0;  // [bp-0x130]
    unsigned long long v1;  // [bp-0x128]
    unsigned int *v2;  // [bp-0x120]
    unsigned int v3;  // [bp-0x118]
    unsigned int v4;  // [bp-0x114]
    unsigned int *v5;  // [bp-0x110]
    unsigned long v6;  // [bp-0x108]
    unsigned long v7;  // [bp-0xf8]
    unsigned int v8;  // [bp-0xf8]
    unsigned long v9;  // [bp-0xf0]
    unsigned long v10;  // [bp-0xe8]
    unsigned int v11;  // [bp-0xd8], Other Possible Types: unsigned long
    unsigned int v12;  // [bp-0xd0]
    unsigned int v13;  // [bp-0xcc]
    unsigned int *v14;  // [bp-0xc8], Other Possible Types: unsigned int
    unsigned int *v15;  // [bp-0xc0], Other Possible Types: unsigned long
    unsigned int v16;  // [bp-0xb4]
    unsigned long v17;  // [bp-0xb0]
    unsigned int v18;  // [bp-0xa8]
    long long v19;  // [bp-0x98], Other Possible Types: unsigned int
    st_bd080_0 **v20;  // [bp-0x90], Other Possible Types: char
    st_bd080_0 *v21;  // [bp-0x88]
    unsigned int v22;  // [bp-0x7c]
    st_bd080_0 *v23;  // [bp-0x78], Other Possible Types: st_bd080_3 **
    st_bd080_0 **v24;  // [bp-0x70], Other Possible Types: st_bd080_3 **, char
    char *v25;  // [bp-0x10]
    char v26;  // [bp+0x0]

    v25 = &v26;
    v21 = &v20;
    v20 = &v21;
    v27 = a1->field_8;
    v28 = a1->field_2c;
    if (v27 + v28 > a3)
        return 0;
    v23 = &v24;
    v24 = &v23;
    v29 = a3 - v27;
    v30 = a3;
    v31 = v29;
    if ((unsigned int)v31 > (unsigned int)v28)
    {
        do
        {
            v28 += sub_b570c(a1, v27 + (v28 & 0xffffffff), a4, v29, 6, 1);
        } while ((unsigned int)v28 < (unsigned int)v29);
        v27 = a1->field_8;
        v30 = a3;
        v31 = v30 - a1->field_8;
    }
    a1->field_2c = (unsigned int)v29;
    v23 = &v24;
    v24 = &v23;
    if (a1->field_114 < 0xfff)
        v32 = a1->field_114;
    else
        v32 = 0xfff;
    v33 = a1->field_70;
    idx2 = 0xcf1bbcdcbf9b0000 * *(long long *)v30 >> ((char)-a1->field_108 & 63);
    v35 = v33[idx2];
    v36 = a1->field_80;
    v19 = 0xffffffff << ((char)(a1->field_104 - 1) & 31);
    v37 = ~v19;
    v38 = a1->field_10;
    v13 = v37;
    v39 = v31 & 0xffffffff;
    v40 = v37;
    if ((unsigned int)v31 < v37)
        v41 = 0;
    else
        v41 = (unsigned int)(v31 - v37);
    v12 = v41;
    v42 = a1->field_18;
    v43 = 1 << ((char)a1->field_100 & 31);
    if (v43 < (unsigned int)(v31 - a1->field_1c))
    {
        v44 = arm64g_calculate_condition(131, v39, v40, 0);
        v45 = arm64g_calculate_condition(3, (v44 & 1 ? a1->field_28 : 0), 0, 0);
        if (!(v45 & 1))
            goto LABEL_bd1da;
LABEL_bd1d9:
        v48 = (unsigned int)(v31 - v43);
    }
    else
    {
        v46 = arm64g_calculate_condition(131, v39, v40, 0);
        v47 = arm64g_calculate_condition(0, (v46 & 1 ? a1->field_28 : 0), 0, 0);
        if (v47 & 1)
            goto LABEL_bd1d9;
LABEL_bd1da:
        v48 = a1->field_1c;
    }
    if (1 < v48)
        v49 = v48;
    else
        v49 = 1;
    v16 = v49;
    v7 = a1->field_10c;
    v9 = v36;
    v50 = a7 - 1;
    v17 = v42;
    v51 = arm64g_calculate_condition(129, a6, 4, 0);
    if (v51 & 1)
    {
        v96 = 0;
        goto LABEL_bd770;
    }
    v52 = (unsigned int)(v31 - v42);
    v6 = v30 + 4;
    index = a6;
    if (a6 == 3)
        v54 = *a5 - 1;
    else
        v54 = a5[index];
    v11 = v32;
    v55 = (unsigned int)(v31 - v54);
    v56 = v54 - 1;
    v18 = (unsigned int)v31;
    v1 = idx2;
    v2 = v33;
    v10 = v38;
    v5 = a5;
    v3 = (unsigned int)(v31 - v48);
    v4 = v48;
    v14 = v52;
    v15 = index;
    if (v52 > v56)
    {
        v0 = v50;
        v57 = sub_b9f30(v30, 4);
        v58 = v54;
        v59 = sub_b9f30(v30 - v58, 4);
        if (v55 >= v48)
        {
            v38 = v10;
            if (v57 == v59)
            {
                v60 = sub_7cdfc(v6, v6 + -v58, a4);
                a5 = v5;
                goto LABEL_bd334;
            }
            else
            {
                v30 = a3;
                v31 = v18;
            }
        }
        else
        {
            v30 = a3;
            v31 = v18;
            v38 = v10;
        }
        v61 = 0;
        v50 = v0;
        a5 = v5;
        v52 = v14;
        idx = v15 + 1;
        if (idx != 3)
            goto LABEL_bd48c;
    }
    else
    {
        v61 = 0;
        if (v3 <= v56 || !(v63 = arm64g_calculate_condition(129, v55 - v17 & 0xffffffff, 4, 0), !(v63 & 1)))
            goto LABEL_bd384;
        v64 = a5;
        v0 = v50;
        v65 = v38 + v55;
        v66 = sub_b9f30(v30, 4);
        if (v66 == sub_b9f30(v65, 4))
        {
            v60 = sub_84f30(v6, v65 + 4, a4, v38 + v17, v27 + v17);
            v36 = v9;
            a5 = v64;
LABEL_bd334:
            v67 = v60 + 4;
            v50 = v0;
            v30 = a3;
            v31 = v18;
            if ((unsigned int)v67 > v50)
            {
                v61 = 1;
                *a0 = 1;
                a0[1] = v67;
                if (v11 < (unsigned int)v67)
                    return 1;
                v50 = v67;
                v52 = v14;
                index = v15;
                if (v30 + v67 == a4)
                    return 1;
            }
            else
            {
                v61 = 0;
                v52 = v14;
                index = v15;
            }
LABEL_bd384:
            idx = index + 1;
            if (idx != 3)
                goto LABEL_bd48c;
        }
        else
        {
            v61 = 0;
            v30 = a3;
            v36 = v9;
            v31 = v18;
            v50 = v0;
            a5 = v64;
            v52 = v14;
            idx = v15 + 1;
            if (idx != 3)
            {
LABEL_bd48c:
                v68 = a5[idx];
                v69 = (unsigned int)(v31 - v68);
                v70 = v68 - 1;
                if (v52 <= v70)
                {
LABEL_bd3a8:
                    if (v3 > v70 && (v71 = arm64g_calculate_condition(129, v69 - v17 & 0xffffffff, 4, 0), !(v71 & 1)))
                    {
                        v72 = v50;
                        v73 = v38 + v69;
                        v74 = sub_b9f30(v30, 4);
                        if (v74 == sub_b9f30(v73, 4))
                            v75 = sub_84f30(v6, v73 + 4, a4, v38 + v17, v27 + v17) + 4;
                        else
                            v75 = 0;
                        v30 = a3;
                        v31 = v18;
                        v50 = v72;
                        v52 = v14;
                        v76 = v75;
                        if (v72 >= v76)
                            goto LABEL_bd658;
                        goto LABEL_bd568;
                    }
                }
                else
                {
LABEL_bd4a0:
                    v77 = v50;
                    v78 = v61;
                    v79 = sub_b9f30(v30, 4);
                    v80 = v68;
                    v81 = sub_b9f30(v30 - v80, 4);
                    if (v69 >= v4)
                    {
                        v30 = a3;
                        v61 = v78;
                        v31 = v18;
                        v50 = v77;
                        a5 = v5;
                        v52 = v14;
                        if (v79 == v81)
                        {
                            v50 = v77;
                            v31 = v18;
                            v30 = a3;
                            v75 = sub_7cdfc(v6, v6 + -v80, a4) + 4;
                            v76 = v75;
                            if (v77 >= v76)
                                goto LABEL_bd658;
                            goto LABEL_bd568;
                        }
                    }
                    else
                    {
                        v30 = a3;
                        v61 = v78;
                        v31 = v18;
                        v50 = v77;
                        a5 = v5;
                        v52 = v14;
                    }
                }
                v75 = 0;
                v76 = 0;
                if (0 <= v50)
                {
LABEL_bd658:
                    v76 = v50;
                    idx1 = v15 + 2;
                    if (idx1 != 3)
                    {
LABEL_bd66c:
                        v84 = a5[idx1];
                        v85 = (unsigned int)(v31 - v84);
                        v86 = v84 - 1;
                        if (v52 > v86)
                        {
LABEL_bd680:
                            v92 = sub_b9f30(v30, 4);
                            v93 = v84;
                            v94 = sub_b9f30(v30 - v93, 4);
                            v87 = 0;
                            if (v85 >= v4)
                            {
                                v30 = a3;
                                v31 = v18;
                                v36 = v9;
                                if (v92 == v94)
                                {
                                    v31 = v18;
                                    v30 = a3;
                                    v87 = sub_7cdfc(v6, v6 + -v93, a4) + 4;
                                    v36 = v9;
                                }
                            }
                            else
                            {
                                v30 = a3;
                                v36 = v9;
LABEL_bd750:
                                v31 = v18;
                                v50 = v87;
                                if (v76 < v50)
                                {
LABEL_bd708:
                                    v38 = v10;
                                    v95 = &a0[2 * (v61 & 0xffffffff)];
                                    *v95 = 3;
                                    v95[1] = v87;
                                    v96 = v61 + 1;
                                    idx2 = v1;
                                    v33 = v2;
                                    if (v11 < v87)
                                    {
                                        return v61 + 1;
                                    }
                                    else if (v30 + v50 == a4)
                                    {
                                        return v61 + 1;
                                    }
                                }
                                else
                                {
LABEL_bd764:
                                    v50 = v76;
                                    idx2 = v1;
                                    v33 = v2;
                                    v38 = v10;
                                    v96 = v61;
                                }
LABEL_bd770:
                                v97 = v96;
                                v14 = v36 + ((unsigned int)v31 & ~v19) * 2 * 4;
                                v15 = v14 + 1;
                                v98 = (unsigned int)v31 + 9;
                                v33[idx2] = (unsigned int)v31;
                                if (v16 <= (unsigned int)v35)
                                {
                                    v10 = v38;
                                    v11 = v27;
                                    v19 = a4;
                                    v99 = 0;
                                    v100 = 0;
                                    v8 = (unsigned int)v31 + 3;
                                    v101 = (1 << ((char)v7 & 31)) - 1;
                                    v102 = v17;
                                    do
                                    {
                                        v103 = v50;
                                        v18 = v99;
                                        if (v100 < v99)
                                            v104 = v100;
                                        else
                                            v104 = v99;
                                        v105 = v35 & 0xffffffff;
                                        if (v102 > v104 + v105)
                                        {
                                            v106 = v10 + v105;
                                            v107 = sub_84f30(v30 + v104, &v106[v104], v19, v10 + v102, v11 + v17) + v104;
                                            v102 = v17;
                                            if (v107 + v105 < v102)
                                                v108 = v106;
                                            else
                                                v108 = v11 + v105;
                                            v36 = v9;
                                            if (v103 < v107)
                                                goto LABEL_bd8ac;
                                            goto LABEL_bd87c;
                                        }
                                        else
                                        {
                                            v108 = v11 + v105;
                                            v107 = sub_7cdfc(v30 + v104, &v108[v104], v19) + v104;
                                            if (v107 <= v103)
                                            {
LABEL_bd87c:
                                                v50 = v103;
                                                v30 = a3;
                                                goto LABEL_bd8f4;
                                            }
                                            else
                                            {
LABEL_bd8ac:
                                                if (v98 - v35 < v107)
                                                    v98 = v35 + v107 & 0xffffffff;
                                                else
                                                    v98 &= 0xffffffff;
                                                v109 = &a0[2 * (v97 & 0xffffffff)];
                                                *v109 = v8 - v35;
                                                v109[1] = v107;
                                                v97 += 1;
                                                v30 = a3;
                                                if (0x1000 < v107 || (v50 = v107, v30 + v107 == v19))
                                                    break;
LABEL_bd8f4:
                                                v110 = v36 + ((unsigned int)v35 & v13) * 2 * 4;
                                                if (*((char *)v30 + v107) > v108[v107])
                                                {
                                                    *v14 = v35;
                                                    if ((unsigned int)v35 > v12)
                                                    {
                                                        v110 += 1;
                                                        v100 = v107;
                                                        v14 = v110;
                                                        v99 = v18;
                                                        continue;
                                                    }
                                                    else
                                                    {
                                                        v14 = &v22;
                                                        break;
                                                    }
                                                }
                                                else
                                                {
                                                    *v15 = v35;
                                                    if ((unsigned int)v35 > v12)
                                                    {
                                                        v99 = v107;
                                                        v15 = v110;
                                                    }
                                                    else
                                                    {
                                                        v15 = &v22;
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                        v111 = v101 - 1;
                                    } while (v101 >= 1 && (v35 = *v110, v101 = v111, v16 <= (unsigned int)v35));
                                }
                                *v15 = 0;
                                *v14 = 0;
                                a1->field_2c = (unsigned int)v98 - 8;
                                return v97;
                            }
LABEL_bd6fc:
                            v50 = v87;
                            if (v50 <= v76)
                                goto LABEL_bd764;
                            goto LABEL_bd708;
                        }
LABEL_bd5bc:
                        v87 = 0;
                        if (v3 > v86 && (v88 = arm64g_calculate_condition(129, v85 - v17 & 0xffffffff, 4, 0), !(v88 & 1)))
                        {
                            v89 = v10;
                            v90 = v89 + v85;
                            v91 = sub_b9f30(v30, 4);
                            if (v91 == sub_b9f30(v90, 4))
                                v87 = sub_84f30(v6, v90 + 4, a4, v89 + v17, v27 + v17) + 4;
                            else
                                v87 = 0;
                            v30 = a3;
                            goto LABEL_bd750;
                        }
                        goto LABEL_bd6fc;
                    }
LABEL_bd5a4:
                    v84 = *a5 - 1;
                    v85 = (unsigned int)(v31 - v84);
                    v86 = v84 - 1;
                    if (v86 < v52)
                        goto LABEL_bd680;
                    goto LABEL_bd5bc;
                }
LABEL_bd568:
                v82 = &a0[2 * (v61 & 0xffffffff)];
                *v82 = 2;
                v82[1] = v75;
                v61 += 1;
                if (v11 < v75)
                    return v61;
                if (v30 + v76 == a4)
                    return v61;
                idx1 = v15 + 2;
                if (idx1 != 3)
                    goto LABEL_bd66c;
                goto LABEL_bd5a4;
            }
        }
    }
    v68 = *a5 - 1;
    v69 = (unsigned int)(v31 - v68);
    v70 = v68 - 1;
    if (v70 < v52)
        goto LABEL_bd4a0;
    goto LABEL_bd3a8;
}
