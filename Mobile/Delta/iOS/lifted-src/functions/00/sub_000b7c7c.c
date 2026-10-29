/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb7c7c..0xb8774 (2808 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b7c7c_1 {
    unsigned long long field_0;
    unsigned long long field_8;
    char padding_10[12];
    unsigned int field_1c;
    char padding_20[80];
    struct st_b7c7c_2 *field_70;
    char padding_78[8];
    unsigned long long field_80;
    char padding_88[124];
    unsigned int field_104;
    unsigned int field_108;
} st_b7c7c_1;

typedef struct st_b7c7c_3 {
    char padding_0[8];
    unsigned long long field_8;
    char padding_10[8];
    unsigned int field_18;
    unsigned int field_1c;
    char padding_20[8];
    unsigned int field_28;
    unsigned int field_2c;
    char padding_30[64];
    struct st_b7c7c_2 *field_70;
    char padding_78[8];
    unsigned long long field_80;
    char padding_88[112];
    struct st_b7c7c_1 *field_f8;
    unsigned int field_100;
    unsigned int field_104;
    unsigned int field_108;
    unsigned int field_10c;
    char padding_110[4];
    unsigned int field_114;
} st_b7c7c_3;

typedef struct st_b7c7c_2 {
    unsigned int field_0;
} st_b7c7c_2;

typedef struct st_b7c7c_4 {
    struct st_b7c7c_0 *field_0;
} st_b7c7c_4;

typedef struct st_b7c7c_0 {
    char field_0;
} st_b7c7c_0;


long long sub_b7c7c(unsigned int *a0, st_b7c7c_3 *a1, long long a2, void* a3, long long a4, unsigned int *a5, unsigned int a6, unsigned int a7)
{
    unsigned long v34;  // x27
    unsigned long v35;  // x24
    unsigned long v44;  // cc_dep2
    unsigned long long v134;  // x20
    unsigned long long v135;  // x25
    unsigned long v136;  // x8
    char *v137;  // x9
    unsigned long long v138;  // x10
    unsigned int v139;  // w12
    unsigned int *v140;  // x11
    void* v141;  // x3
    unsigned int v142;  // w9
    unsigned int v143;  // w10
    unsigned int v45;  // w8
    unsigned long v144;  // cc_dep1
    unsigned long v145;  // cc_dep2
    unsigned long long v146;  // 4105
    unsigned long long v147;  // 4105
    unsigned long v46;  // x25
    unsigned int v47;  // w8
    unsigned long long v48;  // 4112
    unsigned long long v49;  // 4108
    unsigned long long v50;  // 4112
    unsigned long long v51;  // 4108
    unsigned int v52;  // w26
    unsigned int v53;  // w8
    st_b7c7c_3 *v36;  // x19
    st_b7c7c_1 *v54;  // x11
    unsigned long long v55;  // x12
    unsigned int v56;  // w10
    unsigned int v57;  // w9
    unsigned int v58;  // w8
    unsigned long v59;  // x11
    unsigned long long v60;  // 4138
    unsigned int v61;  // w12
    unsigned long idx;  // x24
    unsigned int v63;  // w23
    void* v37;  // x23
    unsigned int v64;  // w10
    unsigned int v65;  // w21
    unsigned int v66;  // w8
    unsigned int v67;  // w0
    unsigned long v68;  // x23
    unsigned int v69;  // w0
    unsigned long v70;  // x8
    unsigned int v71;  // w0
    unsigned long long v72;  // 4121
    long long v73;  // x24
    void* v38;  // x28
    unsigned int v74;  // w0
    unsigned int *v75;  // x9
    unsigned long index;  // x8
    unsigned int v77;  // w23
    unsigned int v78;  // w10
    unsigned int v79;  // w21
    unsigned int v80;  // w9
    unsigned int v81;  // w8
    unsigned long v82;  // x24
    unsigned long long v83;  // 4121
    void* v39;  // x3
    long long v84;  // x21
    unsigned int v85;  // w0
    unsigned int v86;  // w0
    unsigned long v87;  // x23
    unsigned int v88;  // w0
    unsigned long v89;  // x23
    unsigned int v90;  // w0
    unsigned int *v91;  // x9
    unsigned long v92;  // x0
    unsigned int v93;  // w10
    unsigned int v40;  // w8
    unsigned long idx1;  // x8
    unsigned int v95;  // w25
    unsigned int v96;  // w21
    unsigned int v97;  // w9
    unsigned int v98;  // w24
    unsigned long long v99;  // 4125
    long long v100;  // x21
    unsigned int v101;  // w0
    unsigned int v102;  // w8
    unsigned long v103;  // x11
    unsigned long v41;  // x22
    unsigned int v104;  // w0
    unsigned long v105;  // x25
    unsigned int v106;  // w0
    unsigned long v107;  // x24
    unsigned int *v108;  // x9
    unsigned int v109;  // w0
    unsigned int v110;  // w21
    void* v111;  // x23
    unsigned long v112;  // x0
    unsigned int *v113;  // x9
    unsigned int v42;  // w8
    unsigned int *v116;  // x27
    unsigned int *v117;  // x11
    unsigned long long v118;  // x26
    unsigned int v119;  // w8
    unsigned int v120;  // w28
    unsigned long v121;  // x23
    unsigned long v122;  // x21
    unsigned long long v123;  // x20
    unsigned long v43;  // cc_dep1
    unsigned long v124;  // x8
    unsigned int v125;  // w11
    unsigned int *v126;  // x10
    unsigned int *v127;  // x9
    unsigned int v128;  // w28
    st_b7c7c_1 *v129;  // x10
    unsigned long v130;  // x23
    unsigned long v131;  // x22
    unsigned long v132;  // x27
    unsigned int v133;  // w28
    unsigned long long v0;  // [bp-0x168]
    unsigned long v1;  // [bp-0x160]
    unsigned int v2;  // [bp-0x154]
    unsigned long v3;  // [bp-0x150]
    unsigned int v4;  // [bp-0x144]
    unsigned long long v5;  // [bp-0x140]
    unsigned int v6;  // [bp-0x12c]
    st_b7c7c_1 *v7;  // [bp-0x128]
    st_b7c7c_3 *v8;  // [bp-0x120], Other Possible Types: unsigned int
    unsigned long v9;  // [bp-0x118]
    unsigned int v10;  // [bp-0x110]
    unsigned int v11;  // [bp-0x10c]
    unsigned int v12;  // [bp-0x108]
    unsigned int v13;  // [bp-0x104]
    unsigned int v14;  // [bp-0x100]
    unsigned int v15;  // [bp-0xfc]
    unsigned long v16;  // [bp-0xf8]
    unsigned long v17;  // [bp-0xf0]
    unsigned int v18;  // [bp-0xe4]
    unsigned int *v19;  // [bp-0xe0]
    unsigned long v20;  // [bp-0xd8]
    unsigned int v21;  // [bp-0xcc]
    unsigned int v22;  // [bp-0xc8], Other Possible Types: unsigned long
    unsigned long v23;  // [bp-0xc0], Other Possible Types: unsigned long long
    unsigned int v24;  // [bp-0xb8], Other Possible Types: unsigned long long
    unsigned int *v25;  // [bp-0xa8], Other Possible Types: unsigned long
    unsigned int v26;  // [bp-0xa0], Other Possible Types: unsigned long
    st_b7c7c_0 **v27;  // [bp-0x90], Other Possible Types: char
    st_b7c7c_0 *v28;  // [bp-0x88]
    unsigned int v29;  // [bp-0x7c]
    st_b7c7c_0 *v30;  // [bp-0x78], Other Possible Types: st_b7c7c_4 **
    st_b7c7c_0 **v31;  // [bp-0x70], Other Possible Types: st_b7c7c_4 **, char
    char *v32;  // [bp-0x10]
    char v33;  // [bp+0x0]

    v32 = &v33;
    v28 = &v27;
    v27 = &v28;
    v34 = a1->field_8;
    v35 = a1->field_2c;
    if (v34 + v35 > a3)
        return 0;
    v36 = a1;
    v30 = &v31;
    v31 = &v30;
    v37 = a3 - v34;
    v25 = a5;
    v38 = v37;
    v39 = a3;
    if ((unsigned int)v38 > (unsigned int)v35)
    {
        do
        {
            v35 += sub_b570c(v36, v34 + (v35 & 0xffffffff), a4, v37, 3, 0);
        } while ((unsigned int)v35 < (unsigned int)v37);
        v34 = v36->field_8;
        v39 = a3;
        v38 = v39 - v36->field_8;
        a5 = v25;
    }
    v36->field_2c = (unsigned int)v37;
    v30 = &v31;
    v31 = &v30;
    v40 = v36->field_114;
    if (v36->field_114 >= 0xfff)
        v40 = 0xfff;
    v8 = v40;
    v19 = v36->field_70;
    v12 = 2654435761 * *(int *)v39 >> ((char)-v36->field_108 & 31);
    v41 = *(int *)&v36->field_70[v12];
    v23 = v36->field_80;
    v10 = 0xffffffff << ((char)(v36->field_104 - 1) & 31);
    v42 = ~v10;
    v22 = v42;
    v43 = v38 & 0xffffffff;
    v44 = v42;
    if ((unsigned int)v38 < v42)
        v45 = 0;
    else
        v45 = (unsigned int)(v38 - v42);
    v21 = v45;
    v46 = v36->field_18;
    v47 = 1 << ((char)v36->field_100 & 31);
    if (v47 < (unsigned int)(v38 - v36->field_1c))
    {
        v48 = arm64g_calculate_condition(131, v43, v44, 0);
        v49 = arm64g_calculate_condition(3, (v48 & 1 ? v36->field_28 : 0), 0, 0);
        if (!(v49 & 1))
            goto LABEL_b7de2;
LABEL_b7de1:
        v52 = (unsigned int)(v38 - v47);
    }
    else
    {
        v50 = arm64g_calculate_condition(131, v43, v44, 0);
        v51 = arm64g_calculate_condition(0, (v50 & 1 ? v36->field_28 : 0), 0, 0);
        if (v51 & 1)
            goto LABEL_b7de1;
LABEL_b7de2:
        v52 = v36->field_1c;
    }
    if (1 < v52)
        v53 = v52;
    else
        v53 = 1;
    v24 = v53;
    v9 = v36->field_10c;
    v54 = v36->field_f8;
    v20 = v54->field_8;
    v16 = v54->field_0;
    v17 = v46;
    v55 = v54->field_0 - v54->field_8;
    v56 = v54->field_1c;
    v13 = v52 - v55;
    v6 = v54->field_108;
    v7 = v54;
    v57 = ~(0xffffffff << ((char)(v54->field_104 - 1) & 31));
    v5 = v55;
    if (v57 < (unsigned int)(v55 - v56))
        v58 = v55 - v57;
    else
        v58 = v56;
    v14 = v57;
    v15 = v58;
    v59 = a7 - 1;
    v11 = (unsigned int)v38;
    v18 = v56;
    v60 = arm64g_calculate_condition(129, a6, 4, 0);
    if (v60 & 1)
    {
        v26 = 0;
        v107 = v59;
        if (v59 <= 2)
            goto LABEL_b8380;
        goto LABEL_b8400;
    }
    v61 = (unsigned int)(v38 - v46);
    v1 = v39 + 3;
    idx = a6;
    if (a6 == 3)
        v63 = *a5 - 1;
    else
        v63 = a5[idx];
    v64 = v13;
    v0 = v20 - v64;
    v65 = (unsigned int)(v38 - v63);
    v66 = v63 - 1;
    v4 = v61;
    v2 = (unsigned int)(v38 - v56 - v64);
    v3 = idx;
    if (v61 > v66)
    {
        v26 = v59;
        v67 = sub_b9f30(v39, 3);
        v68 = v63;
        v69 = sub_b9f30(v39 - v68, 3);
        if (v65 < v52)
        {
            v59 = v26;
            v39 = a3;
            v38 = v11;
            goto LABEL_b80c8;
        }
        idx = v3;
        if (v67 == v69)
        {
            v38 = v11;
            v61 = v4;
            v70 = sub_7cdfc(v1, v1 + -v68, a4) + 3;
            v59 = v26;
            v39 = a3;
            a5 = v25;
            if ((unsigned int)v70 <= (unsigned int)v59)
                goto LABEL_b7ff0;
            goto LABEL_b7f44;
        }
        else
        {
            v59 = v26;
            v39 = a3;
            v38 = v11;
            v71 = 0;
            a5 = v25;
            v61 = v4;
            goto LABEL_b8018;
        }
        goto LABEL_b8018;
    }
    v71 = 0;
    if (v2 <= v66 || !(v72 = arm64g_calculate_condition(129, v65 - v46 & 0xffffffff, 4, 0), !(v72 & 1)))
    {
LABEL_b8018:
        index = idx + 1;
        if (index != 3)
            goto LABEL_b80e0;
        goto LABEL_b8024;
    }
    v26 = v59;
    v73 = v0 + v65;
    v74 = sub_b9f30(v39, 3);
    if (v74 == sub_b9f30(v73, 3))
    {
        v38 = v11;
        v61 = v4;
        idx = v3;
        v70 = sub_84f30(v1, v73 + 3, a4, v16, v34 + v46) + 3;
        v59 = v26;
        v39 = a3;
        a5 = v25;
        if ((unsigned int)v59 < (unsigned int)v70)
        {
LABEL_b7f44:
            v71 = 1;
            v75 = a0;
            *v75 = 1;
            v75[1] = v70;
            if (v8 < (unsigned int)v70)
                return 1;
            v59 = v70;
            if (v39 + v70 == a4)
                return 1;
        }
        else
        {
LABEL_b7ff0:
            v71 = 0;
            index = idx + 1;
            if (index != 3)
                goto LABEL_b80e0;
            goto LABEL_b8024;
        }
        goto LABEL_b8018;
    }
    v59 = v26;
    v39 = a3;
    v38 = v11;
    v71 = 0;
LABEL_b80c8:
    a5 = v25;
    v61 = v4;
    index = v3 + 1;
    if (index == 3)
    {
LABEL_b8024:
        v77 = *a5 - 1;
        v78 = v2;
        v79 = (unsigned int)(v38 - v77);
        v80 = v77 - 1;
        v26 = v71;
        if (v80 < v61)
            goto LABEL_b80fc;
        goto LABEL_b8044;
    }
LABEL_b80e0:
    v77 = a5[index];
    v78 = v2;
    v79 = (unsigned int)(v38 - v77);
    v80 = v77 - 1;
    v26 = v71;
    if (v61 <= v80)
    {
LABEL_b8044:
        v81 = 0;
        v82 = v59;
        if (v78 > v80 && (v83 = arm64g_calculate_condition(129, v79 - v46 & 0xffffffff, 4, 0), !(v83 & 1)))
        {
            v84 = v0 + v79;
            v85 = sub_b9f30(v39, 3);
            if (v85 == sub_b9f30(v84, 3))
            {
                v81 = sub_84f30(v1, v84 + 3, a4, v16, v34 + v46) + 3;
                goto LABEL_b8254;
            }
            else
            {
                v81 = 0;
                goto LABEL_b8254;
            }
        }
        goto LABEL_b8164;
    }
LABEL_b80fc:
    v82 = v59;
    v86 = sub_b9f30(v39, 3);
    v87 = v77;
    v88 = sub_b9f30(v39 - v87, 3);
    v81 = 0;
    if (v79 >= v52)
    {
        v39 = a3;
        v38 = v11;
        a5 = v25;
        if (v86 == v88)
        {
            a5 = v25;
            v39 = a3;
            v81 = sub_7cdfc(v1, v1 + -v87, a4) + 3;
        }
LABEL_b8164:
        v89 = v81;
        if (v89 <= v82)
            goto LABEL_b826c;
        goto LABEL_b8170;
    }
LABEL_b8254:
    v39 = a3;
    v38 = v11;
    a5 = v25;
    v89 = v81;
    if (v82 < v89)
    {
LABEL_b8170:
        v90 = v26;
        v91 = &a0[2 * v90];
        *v91 = 2;
        v91[1] = v81;
        v92 = v90 + 1;
        if (v8 < v81)
            return v92;
        v93 = v4;
        if (v39 + v89 == a4)
            return v92;
        idx1 = v3 + 2;
        if (idx1 != 3)
            goto LABEL_b8288;
        goto LABEL_b81b4;
    }
LABEL_b826c:
    v89 = v82;
    v92 = v26;
    v93 = v4;
    idx1 = v3 + 2;
    if (idx1 == 3)
    {
LABEL_b81b4:
        v95 = *a5 - 1;
        v96 = (unsigned int)(v38 - v95);
        v97 = v95 - 1;
        v98 = v92;
        if (v97 < v93)
            goto LABEL_b82a0;
        goto LABEL_b81d0;
    }
LABEL_b8288:
    v95 = a5[idx1];
    v96 = (unsigned int)(v38 - v95);
    v97 = v95 - 1;
    v98 = v92;
    if (v93 <= v97)
    {
LABEL_b81d0:
        if (v2 <= v97 || !(v99 = arm64g_calculate_condition(129, v96 - v17 & 0xffffffff, 4, 0), !(v99 & 1)))
            goto LABEL_b8338;
        v100 = v0 + v96;
        v101 = sub_b9f30(v39, 3);
        if (v101 == sub_b9f30(v100, 3))
        {
            v102 = sub_84f30(v1, v100 + 3, a4, v16, v34 + v17) + 3;
            v39 = a3;
            v38 = v11;
            v103 = v102;
            if (v89 < v103)
                goto LABEL_b8344;
        }
        else
        {
            v102 = 0;
            v39 = a3;
            v38 = v11;
            v103 = 0;
            if (v89 < 0)
                goto LABEL_b8344;
        }
    }
    else
    {
LABEL_b82a0:
        v25 = v34;
        v104 = sub_b9f30(v39, 3);
        v105 = v95;
        v106 = sub_b9f30(v39 - v105, 3);
        if (v96 >= v52)
        {
            v39 = a3;
            v34 = v25;
            v38 = v11;
            if (v104 != v106)
                goto LABEL_b8338;
            v39 = a3;
            v102 = sub_7cdfc(v1, v1 + -v105, a4) + 3;
            v103 = v102;
            if (v89 < v103)
                goto LABEL_b8344;
        }
        else
        {
            v39 = a3;
            v34 = v25;
            v38 = v11;
            v102 = 0;
LABEL_b8338:
            v103 = 0;
            if (0 > v89)
            {
LABEL_b8344:
                v108 = &a0[2 * v98];
                *v108 = 3;
                v108[1] = v102;
                if (v8 < v102)
                    return v98 + 1;
                if (v39 + v103 == a4)
                    return v98 + 1;
                v26 = v98 + 1;
                v107 = v103;
                if (2 >= v103)
                {
LABEL_b8380:
                    v109 = sub_bc548(v36, a2, v39);
                    if (v109 >= v24 && !(v110 = (unsigned int)(v38 - v109), v110 > 0x3ffff))
                    {
                        v111 = a3;
                        v112 = sub_7cdfc(v111, v34 + v109, a4);
                        v39 = v111;
                        if (v112 >= 3)
                        {
                            v113 = a0;
                            *v113 = v110 + 3;
                            v113[1] = v112;
                            if (v8 < v112 || v39 + v112 == a4)
                            {
                                v36->field_2c = (unsigned int)v38 + 1;
                                return 1;
                            }
                            v26 = 1;
                            v107 = v112;
                        }
                    }
                    else
                    {
                        v39 = a3;
                    }
                }
LABEL_b8400:
                v25 = v34;
                v8 = v36;
                v116 = v23 + ((unsigned int)v38 & ~v10) * 2 * 4;
                v117 = v116 + 1;
                v118 = (unsigned int)v38 + 9;
                v119 = (unsigned int)v38;
                v120 = 1 << ((char)v9 & 31);
                v19[v12] = v119;
                if (v24 > (unsigned int)v41)
                {
LABEL_b8450:
                    *v117 = 0;
                    *v116 = 0;
                    goto LABEL_b8458;
                }
                v19 = v117;
                v121 = 0;
                v122 = 0;
                v12 = v119 + 3;
                while (1)
                {
                    if (v122 < v121)
                        v123 = v122;
                    else
                        v123 = v121;
                    v124 = sub_7cdfc() + v123;
                    if (v124 > v107)
                    {
                        if (v118 - v41 < v124)
                            v118 = v41 + v124 & 0xffffffff;
                        else
                            v118 &= 0xffffffff;
                        v125 = v26;
                        v126 = &a0[2 * v125];
                        *v126 = v12 - v41;
                        v126[1] = v124;
                        v26 = v125 + 1;
                        v39 = a3;
                        if (0x1000 < v124 || v39 + v124 == a4)
                        {
                            *v19 = 0;
                            *v116 = 0;
LABEL_b8708:
                            v8->field_2c = (unsigned int)v118 - 8;
                            return v26;
                        }
                        v107 = v124;
                    }
                    else
                    {
                        v39 = a3;
                    }
                    v127 = v23 + ((unsigned int)v41 & v22) * 2 * 4;
                    if (*((char *)v39 + v124) > *(char *)(v25 + (v41 & 0xffffffff) + v124))
                    {
                        *v116 = v41;
                        if ((unsigned int)v41 > v21)
                        {
                            v127 += 1;
                            v122 = v124;
                            v116 = v127;
                        }
                        else
                        {
                            v116 = &v29;
                            v117 = v19;
                            goto LABEL_b8450;
                        }
                    }
                    else
                    {
                        *v19 = v41;
                        if ((unsigned int)v41 > v21)
                        {
                            v121 = v124;
                            v19 = v127;
                        }
                        else
                        {
                            v117 = &v29;
                            goto LABEL_b8450;
                        }
                    }
                    v128 = v120 - 1;
                    if (v120 == 1 || !(v41 = *v127, v120 = v128, v24 <= (unsigned int)v41))
                    {
                        *v19 = 0;
                        *v116 = 0;
                        v120 = v128;
                        if (!v120)
                        {
                            v8->field_2c = (unsigned int)v118 - 8;
                            return v26;
                        }
LABEL_b8458:
                        if (!v120)
                        {
                            v8->field_2c = (unsigned int)v118 - 8;
                            return v26;
                        }
                        v129 = v7;
                        v130 = *(int *)&v129->field_70[2654435761 * *(int *)v39 >> ((char)-v6 & 31)];
                        if ((unsigned int)v130 > v18)
                        {
                            v131 = 0;
                            v132 = 0;
                            v22 = v129->field_80;
                            v24 = v5 & 0xffffffff;
                            v21 = v11 + 3;
                            v133 = v120 - 1;
                            v23 = v25 + v13;
                            do
                            {
                                if (v132 < v131)
                                    v134 = v132;
                                else
                                    v134 = v131;
                                v135 = v130 & 0xffffffff;
                                v136 = sub_84f30() + v134;
                                if (v136 + v135 < v24)
                                    v137 = v20 + v135;
                                else
                                    v137 = v23 + v135;
                                if (v136 > v107)
                                {
                                    v138 = v130 + v13;
                                    if (v118 - v138 < v136)
                                        v118 = v138 + v136 & 0xffffffff;
                                    else
                                        v118 &= 0xffffffff;
                                    v139 = v26;
                                    v140 = &a0[2 * v139];
                                    *v140 = v21 - v138;
                                    v140[1] = v136;
                                    v26 = v139 + 1;
                                    if (0x1000 < v136 || (v141 = a3, v107 = v136, v141 + v136 == a4 || v15 >= (unsigned int)v130))
                                        break;
                                }
                                else
                                {
                                    v141 = a3;
                                    if ((unsigned int)v130 <= v15)
                                        break;
                                }
                                v142 = v137[v136];
                                v143 = *((char *)v141 + v136);
                                v144 = v142 & 0xff;
                                v145 = v143 & 0xff;
                                if (v142 < v143)
                                {
                                    v132 = v136;
                                    v146 = arm64g_calculate_condition(0x33, v144, v145, 0);
                                    if (!(v146 & 1))
                                        goto LABEL_b85aa;
                                    goto LABEL_b85a9;
                                }
                                else
                                {
                                    v132 = v132;
                                    v147 = arm64g_calculate_condition(0x33, v144, v145, 0);
                                    if (v147 & 1)
                                    {
LABEL_b85a9:
                                        continue;
                                    }
                                    else
                                    {
LABEL_b85aa:
                                        v131 = v136;
                                    }
                                }
                            } while (v133 >= 1 && (v130 = *(int *)(v22 + ((unsigned int)v130 & v14) * 2 * 4 + (v143 > v142) * 4), v133 -= 1, v18 < (unsigned int)v130));
                        }
                        goto LABEL_b8708;
                    }
                }
            }
        }
    }
    v26 = v98;
    v107 = v89;
    if (v89 <= 2)
        goto LABEL_b8380;
    goto LABEL_b8400;
}
