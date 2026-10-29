/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb94b0..0xb9e50 (2464 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b94b0_2 {
    unsigned long long field_0;
    unsigned long long field_8;
    char padding_10[12];
    unsigned int field_1c;
    char padding_20[80];
    struct st_b94b0_3 *field_70;
    char padding_78[8];
    unsigned long long field_80;
    char padding_88[124];
    unsigned int field_104;
    unsigned int field_108;
} st_b94b0_2;

typedef struct st_b94b0_4 {
    char padding_0[8];
    unsigned long long field_8;
    char padding_10[8];
    unsigned int field_18;
    unsigned int field_1c;
    char padding_20[8];
    unsigned int field_28;
    unsigned int field_2c;
    char padding_30[64];
    struct st_b94b0_3 *field_70;
    char padding_78[8];
    unsigned long long field_80;
    char padding_88[112];
    struct st_b94b0_2 *field_f8;
    unsigned int field_100;
    unsigned int field_104;
    unsigned int field_108;
    unsigned int field_10c;
    char padding_110[4];
    unsigned int field_114;
} st_b94b0_4;

typedef struct st_b94b0_3 {
    unsigned int field_0;
} st_b94b0_3;

typedef struct st_b94b0_1 {
    struct st_b94b0_0 *field_0;
} st_b94b0_1;

typedef struct st_b94b0_0 {
    char field_0;
} st_b94b0_0;


unsigned int sub_b94b0(unsigned int *a0, st_b94b0_4 *a1, unsigned long a2, void* a3, long long a4, unsigned int *a5, unsigned int a6, unsigned int a7)
{
    unsigned long v36;  // x28
    unsigned long v37;  // x24
    unsigned long v46;  // cc_dep2
    unsigned long long v136;  // 4105
    unsigned long long v137;  // 4105
    unsigned int v138;  // w27
    unsigned int v47;  // w8
    unsigned long v48;  // x25
    unsigned int v49;  // w8
    unsigned long long v50;  // 4112
    unsigned long long v51;  // 4108
    unsigned long long v52;  // 4112
    unsigned long long v53;  // 4108
    unsigned int v54;  // w23
    unsigned int v55;  // w8
    void* v38;  // x23
    st_b94b0_2 *v56;  // x11
    unsigned long long v57;  // x12
    unsigned int v58;  // w10
    unsigned int v59;  // w9
    unsigned int v60;  // w8
    unsigned long v61;  // x12
    unsigned long long v62;  // 4147
    unsigned int v63;  // w11
    unsigned long index;  // x14
    unsigned int v65;  // w24
    void* v39;  // x27
    unsigned int v66;  // w10
    unsigned int v67;  // w13
    unsigned int v68;  // w21
    unsigned int v69;  // w8
    unsigned int v70;  // w0
    unsigned long v71;  // x25
    unsigned int v73;  // w0
    unsigned int v74;  // x24
    unsigned long long v75;  // 4121
    void* v40;  // x3
    long long v76;  // x24
    unsigned int v77;  // w0
    unsigned long v78;  // x8
    unsigned int idx;  // x8
    unsigned int v80;  // w25
    unsigned int v81;  // w21
    unsigned int v82;  // w9
    unsigned int v83;  // w8
    unsigned long long v84;  // 4125
    long long v85;  // x21
    unsigned int v41;  // w8
    unsigned int v86;  // w0
    unsigned int v87;  // w0
    unsigned long v88;  // x25
    unsigned int v89;  // w0
    unsigned long v90;  // x25
    unsigned int *v91;  // x9
    unsigned int idx1;  // x8
    unsigned int v93;  // w26
    unsigned int v94;  // w21
    unsigned int v95;  // w9
    unsigned int *v42;  // x26
    unsigned int v96;  // w8
    unsigned long long v97;  // 4125
    long long v98;  // x21
    unsigned int v99;  // w0
    unsigned int v100;  // w0
    unsigned long v101;  // x26
    unsigned int v102;  // w0
    unsigned int *v103;  // x9
    unsigned int v104;  // x24
    unsigned int *v105;  // x19
    unsigned long v43;  // x22
    unsigned int *v106;  // x11
    unsigned long long v107;  // x23
    unsigned int v108;  // w8
    unsigned int v109;  // w27
    unsigned int v110;  // x28
    unsigned int v111;  // x21
    unsigned long long v112;  // x20
    unsigned long v113;  // x25
    unsigned long v114;  // x8
    unsigned int *v115;  // x10
    unsigned int v44;  // w8
    void* v116;  // x3
    unsigned int *v117;  // x9
    unsigned int v118;  // w27
    st_b94b0_2 *v119;  // x10
    unsigned long v120;  // x25
    unsigned int v121;  // x22
    unsigned int v122;  // x28
    unsigned int v123;  // w27
    unsigned long long v124;  // x20
    unsigned long long v125;  // x26
    unsigned long v45;  // cc_dep1
    unsigned long v126;  // x19
    unsigned long v127;  // x8
    char *v128;  // x9
    unsigned long long v129;  // x10
    unsigned int *v130;  // x11
    void* v131;  // x3
    unsigned int v132;  // w9
    unsigned int v133;  // w10
    unsigned long v134;  // cc_dep1
    unsigned long v135;  // cc_dep2
    unsigned long long v0;  // [bp-0x170]
    unsigned int *v1;  // [bp-0x168]
    unsigned long v2;  // [bp-0x160]
    unsigned long long v3;  // [bp-0x158]
    unsigned long v4;  // [bp-0x150]
    unsigned long v5;  // [bp-0x148]
    unsigned int v6;  // [bp-0x13c]
    unsigned int v7;  // [bp-0x138]
    unsigned int v8;  // [bp-0x134]
    unsigned long long v9;  // [bp-0x130]
    st_b94b0_4 *v10;  // [bp-0x128], Other Possible Types: unsigned int
    st_b94b0_2 *v11;  // [bp-0x120]
    unsigned long v12;  // [bp-0x118]
    unsigned int v13;  // [bp-0x10c]
    unsigned int v14;  // [bp-0x108]
    unsigned int v15;  // [bp-0x104]
    unsigned int v16;  // [bp-0x100]
    unsigned int v17;  // [bp-0xfc]
    unsigned long v18;  // [bp-0xf8]
    unsigned int v19;  // [bp-0xec]
    unsigned int *idx2;  // [bp-0xe8], Other Possible Types: unsigned long
    unsigned long v21;  // [bp-0xe0]
    unsigned long v22;  // [bp-0xd8]
    unsigned int v23;  // [bp-0xcc]
    unsigned int v24;  // [bp-0xc8], Other Possible Types: unsigned long
    unsigned int v25;  // [bp-0xc0], Other Possible Types: unsigned long long
    unsigned long v26;  // [bp-0xb8], Other Possible Types: unsigned long long
    unsigned long v27;  // [bp-0xa8]
    unsigned int *v28;  // [bp-0x98], Other Possible Types: long long
    st_b94b0_0 **v29;  // [bp-0x90], Other Possible Types: char
    st_b94b0_0 *v30;  // [bp-0x88]
    unsigned int v31;  // [bp-0x7c]
    st_b94b0_0 *v32;  // [bp-0x78], Other Possible Types: st_b94b0_1 **
    st_b94b0_0 **v33;  // [bp-0x70], Other Possible Types: st_b94b0_1 **, char
    char *v34;  // [bp-0x10]
    char v35;  // [bp+0x0]

    v34 = &v35;
    v30 = &v29;
    v29 = &v30;
    v36 = a1->field_8;
    v37 = a1->field_2c;
    if (v36 + v37 > a3)
        return 0;
    v32 = &v33;
    v33 = &v32;
    v38 = a3 - v36;
    v28 = a5;
    v39 = v38;
    v40 = a3;
    if ((unsigned int)v39 > (unsigned int)v37)
    {
        do
        {
            v37 += sub_b570c(a1, v36 + (v37 & 0xffffffff), a4, v38, 5, 0);
        } while ((unsigned int)v37 < (unsigned int)v38);
        v36 = a1->field_8;
        v40 = a3;
        v39 = v40 - a1->field_8;
        a5 = v28;
    }
    a1->field_2c = (unsigned int)v38;
    v32 = &v33;
    v33 = &v32;
    v41 = a1->field_114;
    if (a1->field_114 >= 0xfff)
        v41 = 0xfff;
    v10 = v41;
    v42 = a1->field_70;
    v9 = 0xcf1bbcdcbb000000 * *(long long *)v40;
    idx2 = v9 >> ((char)-a1->field_108 & 63);
    v43 = v42[idx2];
    v26 = a1->field_80;
    v14 = 0xffffffff << ((char)(a1->field_104 - 1) & 31);
    v44 = ~v14;
    v24 = v44;
    v45 = v39 & 0xffffffff;
    v46 = v44;
    if ((unsigned int)v39 < v44)
        v47 = 0;
    else
        v47 = (unsigned int)(v39 - v44);
    v23 = v47;
    v48 = a1->field_18;
    v49 = 1 << ((char)a1->field_100 & 31);
    if (v49 < (unsigned int)(v39 - a1->field_1c))
    {
        v50 = arm64g_calculate_condition(131, v45, v46, 0);
        v51 = arm64g_calculate_condition(3, (v50 & 1 ? a1->field_28 : 0), 0, 0);
        if (!(v51 & 1))
            goto LABEL_b960e;
LABEL_b960d:
        v54 = (unsigned int)(v39 - v49);
    }
    else
    {
        v52 = arm64g_calculate_condition(131, v45, v46, 0);
        v53 = arm64g_calculate_condition(0, (v52 & 1 ? a1->field_28 : 0), 0, 0);
        if (v53 & 1)
            goto LABEL_b960d;
LABEL_b960e:
        v54 = a1->field_1c;
    }
    if (1 < v54)
        v55 = v54;
    else
        v55 = 1;
    v25 = v55;
    v12 = a1->field_10c;
    v56 = a1->field_f8;
    v22 = v56->field_8;
    v18 = v56->field_0;
    v57 = v56->field_0 - v56->field_8;
    v58 = v56->field_1c;
    v15 = v54 - v57;
    v8 = v56->field_108;
    v11 = v56;
    v59 = ~(0xffffffff << ((char)(v56->field_104 - 1) & 31));
    v3 = v57;
    if (v59 < (unsigned int)(v57 - v58))
        v60 = v57 - v59;
    else
        v60 = v58;
    v16 = v59;
    v17 = v60;
    v61 = a7 - 1;
    v13 = (unsigned int)v39;
    v27 = v36;
    v21 = v48;
    v19 = v58;
    v62 = arm64g_calculate_condition(129, a6, 4, 0);
    if (v62 & 1)
    {
        v104 = 0;
        goto LABEL_b9b0c;
    }
    v63 = (unsigned int)(v39 - v48);
    v2 = v40 + 4;
    index = a6;
    if (a6 == 3)
        v65 = *a5 - 1;
    else
        v65 = a5[index];
    v66 = v15;
    v0 = v22 - v66;
    v1 = v42;
    v67 = (unsigned int)(v39 - v58 - v66);
    v68 = (unsigned int)(v39 - v65);
    v69 = v65 - 1;
    v6 = v67;
    v7 = v63;
    v5 = index;
    if (v63 > v69)
    {
        v4 = v61;
        v70 = sub_b9f30(v40, 4);
        v71 = v65;
        if (v68 < v54 || v70 != sub_b9f30(v40 - v71, 4))
            goto LABEL_b988c;
        v73 = sub_7cdfc(v2, v2 + -v71, a4);
        goto LABEL_b97a8;
    }
    else
    {
        v74 = 0;
        if (v67 <= v69 || !(v75 = arm64g_calculate_condition(129, v68 - v48 & 0xffffffff, 4, 0), !(v75 & 1)))
            goto LABEL_b97f4;
        v4 = v61;
        v76 = v0 + v68;
        v77 = sub_b9f30(v40, 4);
        if (v77 == sub_b9f30(v76, 4))
        {
            v73 = sub_84f30(v2, v76 + 4, a4, v18, v36 + v48);
LABEL_b97a8:
            v39 = v13;
            v78 = v73 + 4;
            v61 = v4;
            v40 = a3;
            if ((unsigned int)v78 > (unsigned int)v61)
            {
                v74 = 1;
                *a0 = 1;
                a0[1] = v78;
                if (v10 < (unsigned int)v78)
                    return 1;
                v61 = v78;
                a5 = v28;
                v63 = v7;
                v67 = v6;
                index = v5;
                if (v40 + v78 == a4)
                    return 1;
            }
            else
            {
                v74 = 0;
                a5 = v28;
                v63 = v7;
                v67 = v6;
                index = v5;
            }
LABEL_b97f4:
            idx = index + 1;
            if (idx != 3)
                goto LABEL_b98a8;
        }
        else
        {
            v74 = 0;
LABEL_b988c:
            v40 = a3;
            a5 = v28;
            v39 = v13;
            v61 = v4;
            index = v5;
            v67 = v6;
            v63 = v7;
            idx = index + 1;
            if (idx != 3)
            {
LABEL_b98a8:
                v80 = a5[idx];
                v81 = (unsigned int)(v39 - v80);
                v82 = v80 - 1;
                if (v63 > v82)
                {
LABEL_b98bc:
                    v4 = v61;
                    v87 = sub_b9f30(v40, 4);
                    v88 = v80;
                    v89 = sub_b9f30(v40 - v88, 4);
                    v83 = 0;
                    if (v81 >= v54)
                    {
                        v40 = a3;
                        a5 = v28;
                        v39 = v13;
                        v61 = v4;
                        index = v5;
                        v67 = v6;
                        v63 = v7;
                        if (v87 == v89)
                        {
                            v61 = v4;
                            index = v5;
                            v67 = v6;
                            v63 = v7;
                            v40 = a3;
                            a5 = v28;
                            v83 = sub_7cdfc(v2, v2 + -v88, a4) + 4;
                        }
                    }
                    else
                    {
                        v40 = a3;
                        v39 = v13;
                        v61 = v4;
LABEL_b9a14:
                        a5 = v28;
                        v67 = v6;
                        v63 = v7;
                        index = v5;
                        v90 = v83;
                        if (v61 >= v90)
                        {
LABEL_b9a2c:
                            v90 = v61;
                            idx1 = index + 2;
                            if (idx1 != 3)
                            {
LABEL_b9a3c:
                                v93 = a5[idx1];
                                v94 = (unsigned int)(v39 - v93);
                                v95 = v93 - 1;
                                if (v63 > v95)
                                {
LABEL_b9a50:
                                    v100 = sub_b9f30(v40, 4);
                                    v101 = v93;
                                    v102 = sub_b9f30(v40 - v101, 4);
                                    v96 = 0;
                                    if (v94 >= v54)
                                    {
                                        v40 = a3;
                                        v39 = v13;
                                        if (v100 == v102)
                                        {
                                            v40 = a3;
                                            v96 = sub_7cdfc(v2, v2 + -v101, a4) + 4;
                                        }
                                    }
                                    else
                                    {
LABEL_b9af0:
                                        v40 = a3;
                                        v39 = v13;
                                        v61 = v96;
                                        if (v90 < v61)
                                        {
LABEL_b9ab8:
                                            v103 = &a0[2 * (v74 & 0xffffffff)];
                                            *v103 = 3;
                                            v103[1] = v96;
                                            v104 = v74 + 1;
                                            v42 = v1;
                                            if (v10 < v96)
                                            {
                                                return v74 + 1;
                                            }
                                            else if (v40 + v61 == a4)
                                            {
                                                return v74 + 1;
                                            }
                                        }
                                        else
                                        {
LABEL_b9b04:
                                            v61 = v90;
                                            v42 = v1;
                                            v104 = v74;
                                        }
LABEL_b9b0c:
                                        v10 = a1;
                                        v28 = a4;
                                        v105 = v26 + ((unsigned int)v39 & ~v14) * 2 * 4;
                                        v106 = v105 + 1;
                                        v107 = (unsigned int)v39 + 9;
                                        v108 = (unsigned int)v39;
                                        v109 = 1 << ((char)v12 & 31);
                                        v42[idx2] = v108;
                                        if (v25 > (unsigned int)v43)
                                        {
LABEL_b9b54:
                                            v119 = v11;
                                            goto LABEL_b9b58;
                                        }
                                        else
                                        {
                                            idx2 = v106;
                                            v110 = 0;
                                            v111 = 0;
                                            v14 = v108 + 3;
                                        }
                                        while (1)
                                        {
                                            if (v111 < v110)
                                                v112 = v111;
                                            else
                                                v112 = v110;
                                            v113 = v61;
                                            v114 = sub_7cdfc() + v112;
                                            if (v114 > v113)
                                            {
                                                if (v107 - v43 < v114)
                                                    v107 = v43 + v114 & 0xffffffff;
                                                else
                                                    v107 &= 0xffffffff;
                                                v115 = &a0[2 * (v104 & 0xffffffff)];
                                                *v115 = v14 - v43;
                                                v115[1] = v114;
                                                v104 += 1;
                                                v116 = a3;
                                                if (0x1000 >= v114 && v116 + v114 != v28)
                                                {
                                                    v61 = v114;
                                                }
                                                else
                                                {
                                                    *idx2 = 0;
                                                    *v105 = 0;
                                                    break;
                                                }
                                            }
                                            else
                                            {
                                                v61 = v113;
                                                v116 = a3;
                                            }
                                            v117 = v26 + ((unsigned int)v43 & v24) * 2 * 4;
                                            if (*((char *)v116 + v114) > *(char *)(v27 + (v43 & 0xffffffff) + v114))
                                            {
                                                *v105 = v43;
                                                if ((unsigned int)v43 > v23)
                                                {
                                                    v117 += 1;
                                                    v111 = v114;
                                                    v105 = v117;
                                                }
                                                else
                                                {
                                                    v105 = &v31;
                                                    v119 = v11;
                                                    v106 = idx2;
LABEL_b9b58:
                                                    *v106 = 0;
                                                    *v105 = 0;
                                                    goto LABEL_b9b60;
                                                }
                                            }
                                            else
                                            {
                                                *idx2 = v43;
                                                if ((unsigned int)v43 > v23)
                                                {
                                                    v110 = v114;
                                                    idx2 = v117;
                                                }
                                                else
                                                {
                                                    v106 = &v31;
                                                    goto LABEL_b9b54;
                                                }
                                            }
                                            v118 = v109 - 1;
                                            if (v109 == 1 || !(v43 = *v117, v109 = v118, v25 <= (unsigned int)v43))
                                            {
                                                *idx2 = 0;
                                                *v105 = 0;
                                                v119 = v11;
                                                v109 = v118;
                                                if (v109)
                                                {
LABEL_b9b60:
                                                    if (v109)
                                                    {
                                                        v120 = *(int *)&v119->field_70[v9 >> ((char)-v8 & 63)];
                                                        if ((unsigned int)v120 > v19)
                                                        {
                                                            v121 = 0;
                                                            v122 = 0;
                                                            v24 = v119->field_80;
                                                            v26 = v3 & 0xffffffff;
                                                            v23 = v13 + 3;
                                                            v123 = v109 - 1;
                                                            v25 = v27 + v15;
                                                            do
                                                            {
                                                                if (v122 < v121)
                                                                    v124 = v122;
                                                                else
                                                                    v124 = v121;
                                                                v125 = v120 & 0xffffffff;
                                                                v126 = v61;
                                                                v127 = sub_84f30() + v124;
                                                                if (v127 + v125 < v26)
                                                                    v128 = v22 + v125;
                                                                else
                                                                    v128 = v25 + v125;
                                                                if (v127 > v126)
                                                                {
                                                                    v129 = v120 + v15;
                                                                    if (v107 - v129 < v127)
                                                                        v107 = v129 + v127 & 0xffffffff;
                                                                    else
                                                                        v107 &= 0xffffffff;
                                                                    v130 = &a0[2 * (v104 & 0xffffffff)];
                                                                    *v130 = v23 - v129;
                                                                    v130[1] = v127;
                                                                    v104 += 1;
                                                                    if (0x1000 < v127 || (v131 = a3, v61 = v127, v131 + v127 == v28 || v17 >= (unsigned int)v120))
                                                                        break;
                                                                }
                                                                else
                                                                {
                                                                    v61 = v126;
                                                                    v131 = a3;
                                                                    if ((unsigned int)v120 <= v17)
                                                                        break;
                                                                }
                                                                v132 = v128[v127];
                                                                v133 = *((char *)v131 + v127);
                                                                v134 = v132 & 0xff;
                                                                v135 = v133 & 0xff;
                                                                if (v132 < v133)
                                                                {
                                                                    v122 = v127;
                                                                    v136 = arm64g_calculate_condition(0x33, v134, v135, 0);
                                                                    if (!(v136 & 1))
                                                                        goto LABEL_b9ca2;
                                                                    goto LABEL_b9ca1;
                                                                }
                                                                else
                                                                {
                                                                    v122 = v122;
                                                                    v137 = arm64g_calculate_condition(0x33, v134, v135, 0);
                                                                    if (v137 & 1)
                                                                    {
LABEL_b9ca1:
                                                                        continue;
                                                                    }
                                                                    else
                                                                    {
LABEL_b9ca2:
                                                                        v121 = v127;
                                                                    }
                                                                }
                                                            } while ((v138 = v123 - 1, v123 >= 1 && (v120 = *(int *)(v24 + ((unsigned int)v120 & v16) * 2 * 4 + (v133 > v132) * 4), v123 -= 1, v19 < (unsigned int)v120)));
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        v10->field_2c = (unsigned int)v107 - 8;
                                        return v104;
                                    }
LABEL_b9aac:
                                    v61 = v96;
                                    if (v61 <= v90)
                                        goto LABEL_b9b04;
                                    goto LABEL_b9ab8;
                                }
LABEL_b9988:
                                v96 = 0;
                                if (v67 > v95 && (v97 = arm64g_calculate_condition(129, v94 - v21 & 0xffffffff, 4, 0), !(v97 & 1)))
                                {
                                    v98 = v0 + v94;
                                    v99 = sub_b9f30(v40, 4);
                                    if (v99 == sub_b9f30(v98, 4))
                                    {
                                        v96 = sub_84f30(v2, v98 + 4, a4, v18, v36 + v21) + 4;
                                        goto LABEL_b9af0;
                                    }
                                    else
                                    {
                                        v96 = 0;
                                        goto LABEL_b9af0;
                                    }
                                }
                                goto LABEL_b9aac;
                            }
LABEL_b9970:
                            v93 = *a5 - 1;
                            v94 = (unsigned int)(v39 - v93);
                            v95 = v93 - 1;
                            if (v95 < v63)
                                goto LABEL_b9a50;
                            goto LABEL_b9988;
                        }
LABEL_b9938:
                        v91 = &a0[2 * (v74 & 0xffffffff)];
                        *v91 = 2;
                        v91[1] = v83;
                        v74 += 1;
                        if (v10 < v83)
                            return v74;
                        if (v40 + v90 == a4)
                            return v74;
                        idx1 = index + 2;
                        if (idx1 != 3)
                            goto LABEL_b9a3c;
                        goto LABEL_b9970;
                    }
LABEL_b992c:
                    v90 = v83;
                    if (v90 <= v61)
                        goto LABEL_b9a2c;
                    goto LABEL_b9938;
                }
LABEL_b9818:
                v83 = 0;
                if (v67 > v82 && (v84 = arm64g_calculate_condition(129, v81 - v21 & 0xffffffff, 4, 0), !(v84 & 1)))
                {
                    v85 = v0 + v81;
                    v86 = sub_b9f30(v40, 4);
                    if (v86 == sub_b9f30(v85, 4))
                        v83 = sub_84f30(v2, v85 + 4, a4, v18, v36 + v21) + 4;
                    else
                        v83 = 0;
                    v40 = a3;
                    v39 = v13;
                    goto LABEL_b9a14;
                }
                goto LABEL_b992c;
            }
        }
        v80 = *a5 - 1;
        v81 = (unsigned int)(v39 - v80);
        v82 = v80 - 1;
        if (v82 < v63)
            goto LABEL_b98bc;
        goto LABEL_b9818;
    }
}
