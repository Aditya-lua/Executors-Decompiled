/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbe0a4..0xbea48 (2468 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_be0a4_2 {
    unsigned long long field_0;
    unsigned long long field_8;
    char padding_10[12];
    unsigned int field_1c;
    char padding_20[80];
    struct st_be0a4_3 *field_70;
    char padding_78[8];
    unsigned long long field_80;
    char padding_88[124];
    unsigned int field_104;
    unsigned int field_108;
} st_be0a4_2;

typedef struct st_be0a4_4 {
    char padding_0[8];
    unsigned long long field_8;
    char padding_10[8];
    unsigned int field_18;
    unsigned int field_1c;
    char padding_20[8];
    unsigned int field_28;
    unsigned int field_2c;
    char padding_30[64];
    struct st_be0a4_3 *field_70;
    char padding_78[8];
    unsigned long long field_80;
    char padding_88[112];
    struct st_be0a4_2 *field_f8;
    unsigned int field_100;
    unsigned int field_104;
    unsigned int field_108;
    unsigned int field_10c;
    char padding_110[4];
    unsigned int field_114;
} st_be0a4_4;

typedef struct st_be0a4_3 {
    unsigned int field_0;
} st_be0a4_3;

typedef struct st_be0a4_1 {
    struct st_be0a4_0 *field_0;
} st_be0a4_1;

typedef struct st_be0a4_0 {
    char field_0;
} st_be0a4_0;


unsigned int sub_be0a4(unsigned int *a0, st_be0a4_4 *a1, unsigned long a2, void* a3, long long a4, unsigned int *a5, unsigned int a6, unsigned int a7)
{
    unsigned long v35;  // x28
    unsigned long v36;  // x24
    unsigned long v45;  // cc_dep2
    unsigned long long v135;  // 4105
    unsigned int v136;  // w27
    unsigned int v46;  // w8
    unsigned long v47;  // x25
    unsigned int v48;  // w8
    unsigned long long v49;  // 4112
    unsigned long long v50;  // 4108
    unsigned long long v51;  // 4112
    unsigned long long v52;  // 4108
    unsigned int v53;  // w23
    unsigned int v54;  // w8
    void* v37;  // x23
    st_be0a4_2 *v55;  // x11
    unsigned long long v56;  // x12
    unsigned int v57;  // w10
    unsigned int v58;  // w9
    unsigned int v59;  // w8
    unsigned long v60;  // x12
    unsigned long long v61;  // 4147
    unsigned int v62;  // w11
    unsigned long idx;  // x14
    unsigned int v64;  // w24
    void* v38;  // x27
    unsigned int v65;  // w10
    unsigned int v66;  // w13
    unsigned int v67;  // w21
    unsigned int v68;  // w8
    unsigned int v69;  // w0
    unsigned long v70;  // x25
    unsigned int v72;  // w0
    unsigned int v73;  // x24
    unsigned long long v74;  // 4121
    void* v39;  // x3
    long long v75;  // x24
    unsigned int v76;  // w0
    unsigned long v77;  // x8
    unsigned int index;  // x8
    unsigned int v79;  // w25
    unsigned int v80;  // w21
    unsigned int v81;  // w9
    unsigned int v82;  // w8
    unsigned long long v83;  // 4125
    long long v84;  // x21
    unsigned int v40;  // w8
    unsigned int v85;  // w0
    unsigned int v86;  // w0
    unsigned long v87;  // x25
    unsigned int v88;  // w0
    unsigned long v89;  // x25
    unsigned int *v90;  // x9
    unsigned int idx1;  // x8
    unsigned int v92;  // w26
    unsigned int v93;  // w21
    unsigned int v94;  // w9
    unsigned int *v41;  // x26
    unsigned int v95;  // w8
    unsigned long long v96;  // 4125
    long long v97;  // x21
    unsigned int v98;  // w0
    unsigned int v99;  // w0
    unsigned long v100;  // x26
    unsigned int v101;  // w0
    unsigned int *v102;  // x9
    unsigned int v103;  // x24
    unsigned int *v104;  // x19
    unsigned long v42;  // x22
    unsigned int *v105;  // x11
    unsigned long long v106;  // x23
    unsigned int v107;  // w8
    unsigned int v108;  // w27
    unsigned int v109;  // x28
    unsigned int v110;  // x26
    unsigned long long v111;  // x20
    unsigned long v112;  // x25
    unsigned long v113;  // x8
    unsigned int *v114;  // x10
    unsigned int v43;  // w8
    unsigned int *v115;  // x9
    unsigned int v116;  // w27
    st_be0a4_2 *v117;  // x10
    unsigned long v118;  // x25
    unsigned int v119;  // x22
    unsigned int v120;  // x28
    unsigned int v121;  // w27
    unsigned long long v122;  // x20
    unsigned long long v123;  // x21
    unsigned long v124;  // x19
    unsigned long v44;  // cc_dep1
    unsigned long v125;  // x8
    char *v126;  // x9
    unsigned long long v127;  // x10
    unsigned int *v128;  // x11
    void* v129;  // x3
    unsigned int v130;  // w9
    unsigned int v131;  // w10
    unsigned long v132;  // cc_dep1
    unsigned long v133;  // cc_dep2
    unsigned long long v134;  // 4105
    unsigned long long v0;  // [bp-0x168]
    unsigned int *v1;  // [bp-0x160]
    unsigned long v2;  // [bp-0x158]
    unsigned long long v3;  // [bp-0x150]
    unsigned long v4;  // [bp-0x148]
    unsigned long v5;  // [bp-0x140]
    unsigned int v6;  // [bp-0x134]
    unsigned int v7;  // [bp-0x130]
    unsigned int v8;  // [bp-0x12c]
    st_be0a4_4 *v9;  // [bp-0x128], Other Possible Types: unsigned int
    st_be0a4_2 *v10;  // [bp-0x120]
    unsigned long v11;  // [bp-0x118]
    unsigned int v12;  // [bp-0x10c]
    unsigned int v13;  // [bp-0x108]
    unsigned int v14;  // [bp-0x104]
    unsigned int v15;  // [bp-0x100]
    unsigned int v16;  // [bp-0xfc]
    unsigned long v17;  // [bp-0xf8]
    unsigned int v18;  // [bp-0xec]
    unsigned int *v19;  // [bp-0xe8], Other Possible Types: unsigned int
    unsigned long v20;  // [bp-0xe0]
    unsigned long v21;  // [bp-0xd8]
    unsigned int v22;  // [bp-0xcc]
    unsigned int v23;  // [bp-0xc8], Other Possible Types: unsigned long
    unsigned int v24;  // [bp-0xc0], Other Possible Types: unsigned long long
    unsigned long v25;  // [bp-0xb8], Other Possible Types: unsigned long long
    unsigned long v26;  // [bp-0xa8]
    unsigned int *v27;  // [bp-0x98], Other Possible Types: long long
    st_be0a4_0 **v28;  // [bp-0x90], Other Possible Types: char
    st_be0a4_0 *v29;  // [bp-0x88]
    unsigned int v30;  // [bp-0x7c]
    st_be0a4_0 *v31;  // [bp-0x78], Other Possible Types: st_be0a4_1 **
    st_be0a4_0 **v32;  // [bp-0x70], Other Possible Types: st_be0a4_1 **, char
    char *v33;  // [bp-0x10]
    char v34;  // [bp+0x0]

    v33 = &v34;
    v29 = &v28;
    v28 = &v29;
    v35 = a1->field_8;
    v36 = a1->field_2c;
    if (v35 + v36 > a3)
        return 0;
    v31 = &v32;
    v32 = &v31;
    v37 = a3 - v35;
    v27 = a5;
    v38 = v37;
    v39 = a3;
    if ((unsigned int)v38 > (unsigned int)v36)
    {
        do
        {
            v36 += sub_b570c(a1, v35 + (v36 & 0xffffffff), a4, v37, 4, 0);
        } while ((unsigned int)v36 < (unsigned int)v37);
        v35 = a1->field_8;
        v39 = a3;
        v38 = v39 - a1->field_8;
        a5 = v27;
    }
    a1->field_2c = (unsigned int)v37;
    v31 = &v32;
    v32 = &v31;
    v40 = a1->field_114;
    if (a1->field_114 >= 0xfff)
        v40 = 0xfff;
    v9 = v40;
    v41 = a1->field_70;
    v19 = 2654435761 * *(int *)v39 >> ((char)-a1->field_108 & 31);
    v42 = v41[v19];
    v25 = a1->field_80;
    v13 = 0xffffffff << ((char)(a1->field_104 - 1) & 31);
    v43 = ~v13;
    v23 = v43;
    v44 = v38 & 0xffffffff;
    v45 = v43;
    if ((unsigned int)v38 < v43)
        v46 = 0;
    else
        v46 = (unsigned int)(v38 - v43);
    v22 = v46;
    v47 = a1->field_18;
    v48 = 1 << ((char)a1->field_100 & 31);
    if (v48 < (unsigned int)(v38 - a1->field_1c))
    {
        v49 = arm64g_calculate_condition(131, v44, v45, 0);
        v50 = arm64g_calculate_condition(3, (v49 & 1 ? a1->field_28 : 0), 0, 0);
        if (!(v50 & 1))
            goto LABEL_be1fa;
LABEL_be1f9:
        v53 = (unsigned int)(v38 - v48);
    }
    else
    {
        v51 = arm64g_calculate_condition(131, v44, v45, 0);
        v52 = arm64g_calculate_condition(0, (v51 & 1 ? a1->field_28 : 0), 0, 0);
        if (v52 & 1)
            goto LABEL_be1f9;
LABEL_be1fa:
        v53 = a1->field_1c;
    }
    if (1 < v53)
        v54 = v53;
    else
        v54 = 1;
    v24 = v54;
    v11 = a1->field_10c;
    v55 = a1->field_f8;
    v21 = v55->field_8;
    v17 = v55->field_0;
    v56 = v55->field_0 - v55->field_8;
    v57 = v55->field_1c;
    v14 = v53 - v56;
    v8 = v55->field_108;
    v10 = v55;
    v58 = ~(0xffffffff << ((char)(v55->field_104 - 1) & 31));
    v3 = v56;
    if (v58 < (unsigned int)(v56 - v57))
        v59 = v56 - v58;
    else
        v59 = v57;
    v15 = v58;
    v16 = v59;
    v60 = a7 - 1;
    v12 = (unsigned int)v38;
    v26 = v35;
    v20 = v47;
    v18 = v57;
    v61 = arm64g_calculate_condition(129, a6, 4, 0);
    if (v61 & 1)
    {
        v103 = 0;
        goto LABEL_be6f8;
    }
    v62 = (unsigned int)(v38 - v47);
    v2 = v39 + 4;
    idx = a6;
    if (a6 == 3)
        v64 = *a5 - 1;
    else
        v64 = a5[idx];
    v65 = v14;
    v0 = v21 - v65;
    v1 = v41;
    v66 = (unsigned int)(v38 - v57 - v65);
    v67 = (unsigned int)(v38 - v64);
    v68 = v64 - 1;
    v6 = v66;
    v7 = v62;
    v5 = idx;
    if (v62 > v68)
    {
        v4 = v60;
        v69 = sub_b9f30(v39, 4);
        v70 = v64;
        if (v67 < v53 || v69 != sub_b9f30(v39 - v70, 4))
            goto LABEL_be478;
        v72 = sub_7cdfc(v2, v2 + -v70, a4);
        goto LABEL_be394;
    }
    else
    {
        v73 = 0;
        if (v66 <= v68 || !(v74 = arm64g_calculate_condition(129, v67 - v47 & 0xffffffff, 4, 0), !(v74 & 1)))
            goto LABEL_be3e0;
        v4 = v60;
        v75 = v0 + v67;
        v76 = sub_b9f30(v39, 4);
        if (v76 == sub_b9f30(v75, 4))
        {
            v72 = sub_84f30(v2, v75 + 4, a4, v17, v35 + v47);
LABEL_be394:
            v38 = v12;
            v77 = v72 + 4;
            v60 = v4;
            v39 = a3;
            if ((unsigned int)v77 > (unsigned int)v60)
            {
                v73 = 1;
                *a0 = 1;
                a0[1] = v77;
                if (v9 < (unsigned int)v77)
                    return 1;
                v60 = v77;
                a5 = v27;
                v62 = v7;
                v66 = v6;
                idx = v5;
                if (v39 + v77 == a4)
                    return 1;
            }
            else
            {
                v73 = 0;
                a5 = v27;
                v62 = v7;
                v66 = v6;
                idx = v5;
            }
LABEL_be3e0:
            index = idx + 1;
            if (index != 3)
                goto LABEL_be494;
        }
        else
        {
            v73 = 0;
LABEL_be478:
            v39 = a3;
            a5 = v27;
            v38 = v12;
            v60 = v4;
            idx = v5;
            v66 = v6;
            v62 = v7;
            index = idx + 1;
            if (index != 3)
            {
LABEL_be494:
                v79 = a5[index];
                v80 = (unsigned int)(v38 - v79);
                v81 = v79 - 1;
                if (v62 > v81)
                {
LABEL_be4a8:
                    v4 = v60;
                    v86 = sub_b9f30(v39, 4);
                    v87 = v79;
                    v88 = sub_b9f30(v39 - v87, 4);
                    v82 = 0;
                    if (v80 >= v53)
                    {
                        v39 = a3;
                        a5 = v27;
                        v38 = v12;
                        v60 = v4;
                        idx = v5;
                        v66 = v6;
                        v62 = v7;
                        if (v86 == v88)
                        {
                            v60 = v4;
                            idx = v5;
                            v66 = v6;
                            v62 = v7;
                            v39 = a3;
                            a5 = v27;
                            v82 = sub_7cdfc(v2, v2 + -v87, a4) + 4;
                        }
                    }
                    else
                    {
                        v39 = a3;
                        v38 = v12;
                        v60 = v4;
LABEL_be600:
                        a5 = v27;
                        v66 = v6;
                        v62 = v7;
                        idx = v5;
                        v89 = v82;
                        if (v60 >= v89)
                        {
LABEL_be618:
                            v89 = v60;
                            idx1 = idx + 2;
                            if (idx1 != 3)
                            {
LABEL_be628:
                                v92 = a5[idx1];
                                v93 = (unsigned int)(v38 - v92);
                                v94 = v92 - 1;
                                if (v62 > v94)
                                {
LABEL_be63c:
                                    v99 = sub_b9f30(v39, 4);
                                    v100 = v92;
                                    v101 = sub_b9f30(v39 - v100, 4);
                                    v95 = 0;
                                    if (v93 >= v53)
                                    {
                                        v39 = a3;
                                        v38 = v12;
                                        if (v99 == v101)
                                        {
                                            v39 = a3;
                                            v95 = sub_7cdfc(v2, v2 + -v100, a4) + 4;
                                        }
                                    }
                                    else
                                    {
LABEL_be6dc:
                                        v39 = a3;
                                        v38 = v12;
                                        v60 = v95;
                                        if (v89 < v60)
                                        {
LABEL_be6a4:
                                            v102 = &a0[2 * (v73 & 0xffffffff)];
                                            *v102 = 3;
                                            v102[1] = v95;
                                            v103 = v73 + 1;
                                            v41 = v1;
                                            if (v9 < v95)
                                            {
                                                return v73 + 1;
                                            }
                                            else if (v39 + v60 == a4)
                                            {
                                                return v73 + 1;
                                            }
                                        }
                                        else
                                        {
LABEL_be6f0:
                                            v60 = v89;
                                            v41 = v1;
                                            v103 = v73;
                                        }
LABEL_be6f8:
                                        v9 = a1;
                                        v27 = a4;
                                        v104 = v25 + ((unsigned int)v38 & ~v13) * 2 * 4;
                                        v105 = v104 + 1;
                                        v106 = (unsigned int)v38 + 9;
                                        v107 = (unsigned int)v38;
                                        v108 = 1 << ((char)v11 & 31);
                                        v41[v19] = v107;
                                        if (v24 > (unsigned int)v42)
                                        {
LABEL_be740:
                                            v117 = v10;
                                            goto LABEL_be744;
                                        }
                                        else
                                        {
                                            v19 = v105;
                                            v109 = 0;
                                            v110 = 0;
                                            v13 = v107 + 3;
                                        }
                                        while (1)
                                        {
                                            if (v110 < v109)
                                                v111 = v110;
                                            else
                                                v111 = v109;
                                            v112 = v60;
                                            v113 = sub_7cdfc() + v111;
                                            if (v113 > v112)
                                            {
                                                if (v106 - v42 < v113)
                                                    v106 = v42 + v113 & 0xffffffff;
                                                else
                                                    v106 &= 0xffffffff;
                                                v114 = &a0[2 * (v103 & 0xffffffff)];
                                                *v114 = v13 - v42;
                                                v114[1] = v113;
                                                v103 += 1;
                                                v39 = a3;
                                                if (0x1000 >= v113 && v39 + v113 != v27)
                                                {
                                                    v60 = v113;
                                                }
                                                else
                                                {
                                                    *v19 = 0;
                                                    *v104 = 0;
                                                    break;
                                                }
                                            }
                                            else
                                            {
                                                v60 = v112;
                                                v39 = a3;
                                            }
                                            v115 = v25 + ((unsigned int)v42 & v23) * 2 * 4;
                                            if (*((char *)v39 + v113) > *(char *)(v26 + (v42 & 0xffffffff) + v113))
                                            {
                                                *v104 = v42;
                                                if ((unsigned int)v42 > v22)
                                                {
                                                    v115 += 1;
                                                    v110 = v113;
                                                    v104 = v115;
                                                }
                                                else
                                                {
                                                    v104 = &v30;
                                                    v117 = v10;
                                                    v105 = v19;
LABEL_be744:
                                                    *v105 = 0;
                                                    *v104 = 0;
                                                    goto LABEL_be74c;
                                                }
                                            }
                                            else
                                            {
                                                *v19 = v42;
                                                if ((unsigned int)v42 > v22)
                                                {
                                                    v109 = v113;
                                                    v19 = v115;
                                                }
                                                else
                                                {
                                                    v105 = &v30;
                                                    goto LABEL_be740;
                                                }
                                            }
                                            v116 = v108 - 1;
                                            if (v108 == 1 || !(v42 = *v115, v108 = v116, v24 <= (unsigned int)v42))
                                            {
                                                *v19 = 0;
                                                *v104 = 0;
                                                v117 = v10;
                                                v108 = v116;
                                                if (v108)
                                                {
LABEL_be74c:
                                                    if (v108)
                                                    {
                                                        v118 = *(int *)&v117->field_70[2654435761 * *(int *)v39 >> ((char)-v8 & 31)];
                                                        if ((unsigned int)v118 > v18)
                                                        {
                                                            v119 = 0;
                                                            v120 = 0;
                                                            v23 = v117->field_80;
                                                            v25 = v3 & 0xffffffff;
                                                            v22 = v12 + 3;
                                                            v121 = v108 - 1;
                                                            v24 = v26 + v14;
                                                            do
                                                            {
                                                                if (v120 < v119)
                                                                    v122 = v120;
                                                                else
                                                                    v122 = v119;
                                                                v123 = v118 & 0xffffffff;
                                                                v124 = v60;
                                                                v125 = sub_84f30() + v122;
                                                                if (v125 + v123 < v25)
                                                                    v126 = v21 + v123;
                                                                else
                                                                    v126 = v24 + v123;
                                                                if (v125 > v124)
                                                                {
                                                                    v127 = v118 + v14;
                                                                    if (v106 - v127 < v125)
                                                                        v106 = v127 + v125 & 0xffffffff;
                                                                    else
                                                                        v106 &= 0xffffffff;
                                                                    v128 = &a0[2 * (v103 & 0xffffffff)];
                                                                    *v128 = v22 - v127;
                                                                    v128[1] = v125;
                                                                    v103 += 1;
                                                                    if (0x1000 < v125 || (v129 = a3, v60 = v125, v129 + v125 == v27 || v16 >= (unsigned int)v118))
                                                                        break;
                                                                }
                                                                else
                                                                {
                                                                    v60 = v124;
                                                                    v129 = a3;
                                                                    if ((unsigned int)v118 <= v16)
                                                                        break;
                                                                }
                                                                v130 = v126[v125];
                                                                v131 = *((char *)v129 + v125);
                                                                v132 = v130 & 0xff;
                                                                v133 = v131 & 0xff;
                                                                if (v130 < v131)
                                                                {
                                                                    v120 = v125;
                                                                    v134 = arm64g_calculate_condition(0x33, v132, v133, 0);
                                                                    if (!(v134 & 1))
                                                                        goto LABEL_be89a;
                                                                    goto LABEL_be899;
                                                                }
                                                                else
                                                                {
                                                                    v120 = v120;
                                                                    v135 = arm64g_calculate_condition(0x33, v132, v133, 0);
                                                                    if (v135 & 1)
                                                                    {
LABEL_be899:
                                                                        continue;
                                                                    }
                                                                    else
                                                                    {
LABEL_be89a:
                                                                        v119 = v125;
                                                                    }
                                                                }
                                                            } while ((v136 = v121 - 1, v121 >= 1 && (v118 = *(int *)(v23 + ((unsigned int)v118 & v15) * 2 * 4 + (v131 > v130) * 4), v121 -= 1, v18 < (unsigned int)v118)));
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        v9->field_2c = (unsigned int)v106 - 8;
                                        return v103;
                                    }
LABEL_be698:
                                    v60 = v95;
                                    if (v60 <= v89)
                                        goto LABEL_be6f0;
                                    goto LABEL_be6a4;
                                }
LABEL_be574:
                                v95 = 0;
                                if (v66 > v94 && (v96 = arm64g_calculate_condition(129, v93 - v20 & 0xffffffff, 4, 0), !(v96 & 1)))
                                {
                                    v97 = v0 + v93;
                                    v98 = sub_b9f30(v39, 4);
                                    if (v98 == sub_b9f30(v97, 4))
                                    {
                                        v95 = sub_84f30(v2, v97 + 4, a4, v17, v35 + v20) + 4;
                                        goto LABEL_be6dc;
                                    }
                                    else
                                    {
                                        v95 = 0;
                                        goto LABEL_be6dc;
                                    }
                                }
                                goto LABEL_be698;
                            }
LABEL_be55c:
                            v92 = *a5 - 1;
                            v93 = (unsigned int)(v38 - v92);
                            v94 = v92 - 1;
                            if (v94 < v62)
                                goto LABEL_be63c;
                            goto LABEL_be574;
                        }
LABEL_be524:
                        v90 = &a0[2 * (v73 & 0xffffffff)];
                        *v90 = 2;
                        v90[1] = v82;
                        v73 += 1;
                        if (v9 < v82)
                            return v73;
                        if (v39 + v89 == a4)
                            return v73;
                        idx1 = idx + 2;
                        if (idx1 != 3)
                            goto LABEL_be628;
                        goto LABEL_be55c;
                    }
LABEL_be518:
                    v89 = v82;
                    if (v89 <= v60)
                        goto LABEL_be618;
                    goto LABEL_be524;
                }
LABEL_be404:
                v82 = 0;
                if (v66 > v81 && (v83 = arm64g_calculate_condition(129, v80 - v20 & 0xffffffff, 4, 0), !(v83 & 1)))
                {
                    v84 = v0 + v80;
                    v85 = sub_b9f30(v39, 4);
                    if (v85 == sub_b9f30(v84, 4))
                        v82 = sub_84f30(v2, v84 + 4, a4, v17, v35 + v20) + 4;
                    else
                        v82 = 0;
                    v39 = a3;
                    v38 = v12;
                    goto LABEL_be600;
                }
                goto LABEL_be518;
            }
        }
        v79 = *a5 - 1;
        v80 = (unsigned int)(v38 - v79);
        v81 = v79 - 1;
        if (v81 < v62)
            goto LABEL_be4a8;
        goto LABEL_be404;
    }
}
