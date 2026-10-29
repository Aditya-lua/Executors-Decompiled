/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x8a104..0x8ad88 (3204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_8a104_1 {
    char padding_0[8];
    void* field_8;
    void* field_10;
    unsigned int field_18;
    unsigned int field_1c;
    char padding_20[8];
    unsigned int field_28;
    char padding_2c[68];
    struct st_8a104_2 *field_70;
    char padding_78[8];
    struct st_8a104_2 *field_80;
    char padding_88[120];
    unsigned int field_100;
    unsigned int field_104;
    unsigned int field_108;
} st_8a104_1;

typedef struct st_8a104_2 {
    unsigned int field_0;
} st_8a104_2;

typedef struct st_8a104_4 {
    unsigned long long field_0;
    struct st_8a104_3 *field_8;
    char padding_10[8];
    uint128_t *field_18;
    char padding_20[40];
    unsigned int field_48;
    unsigned int field_4c;
} st_8a104_4;

typedef struct st_8a104_3 {
    unsigned int field_0;
    unsigned short field_4;
    unsigned short field_6;
} st_8a104_3;

typedef struct st_8a104_0 {
    char field_0;
} st_8a104_0;

extern unsigned long long g_e6be90;
extern unsigned long long g_e6bec8;

char * sub_8a104(st_8a104_1 *a0, st_8a104_4 *a1, unsigned int *a2, void* a3, unsigned long a4, int a5)
{
    char *v25;  // x22
    void* v26;  // x28
    unsigned long long v31;  // 4108
    void* v109;  // x12
    void* v110;  // x24
    unsigned long v111;  // cc_dep1
    unsigned long v112;  // cc_dep2
    void* v113;  // x4
    void* v114;  // x8
    unsigned long long v115;  // 4113
    unsigned long long v116;  // 4113
    void* v117;  // x20
    void* v118;  // x1
    unsigned long v32;  // cc_op
    void* v119;  // x3
    void* v120;  // x8
    void* v121;  // x8
    void* v122;  // x9
    unsigned long v123;  // cc_dep1
    unsigned long v124;  // cc_dep2
    void* v125;  // x4
    void* v126;  // x8
    unsigned long long v127;  // 4113
    unsigned long long v128;  // 4113
    unsigned long v33;  // cc_dep1
    void* v129;  // x23
    void* v130;  // x8
    void* v131;  // x9
    void* v132;  // x8
    void* v133;  // x10
    void* v134;  // x20
    uint128_t *v135;  // x9
    uint128_t *iter;  // x9
    uint128_t *v137;  // x10
    unsigned long v34;  // cc_dep2
    unsigned long long v139;  // x9
    unsigned int v140;  // w10
    unsigned int v141;  // w8
    unsigned long v142;  // x9
    unsigned long long v143;  // x10
    char v144;  // x1
    unsigned int *v145;  // x13
    unsigned long long v146;  // x10
    char v147;  // x11
    void* v148;  // x8
    unsigned long v35;  // cc_ndep
    unsigned long v149;  // x9
    unsigned int v150;  // w8
    unsigned long long v151;  // x10
    char v152;  // x11
    void* v153;  // x8
    unsigned long long idx;  // x9
    void* v155;  // x8
    void* v156;  // x19
    unsigned long long v157;  // x8
    void* v158;  // x9
    unsigned long long v36;  // 4112
    unsigned long long v159;  // 4112
    void* v160;  // x0
    st_8a104_3 *v161;  // x8
    void* v162;  // x9
    unsigned long long v163;  // x10
    unsigned long v164;  // x8
    unsigned long long v37;  // 4108
    unsigned int v27;  // w8
    unsigned long long v38;  // x14
    unsigned int v28;  // w9
    unsigned long v39;  // x15
    void* v40;  // x12
    unsigned long v41;  // x4
    unsigned long v42;  // x24
    int v43;  // w23
    void* v44;  // x16
    unsigned long v45;  // x9
    unsigned int *v46;  // x0
    void* v47;  // x26
    unsigned long v48;  // x8
    unsigned int v29;  // w11
    unsigned long long v49;  // x9
    unsigned long long idx1;  // x9
    unsigned long v51;  // x21
    void* v52;  // x20
    unsigned long idx2;  // x13
    unsigned long v54;  // x19
    void* v55;  // x23
    void* v56;  // x25
    unsigned long v57;  // x27
    unsigned long long v58;  // x10
    void* v59;  // x11
    unsigned long long v60;  // 4112
    void* v61;  // x13
    unsigned long v62;  // x21
    void* v63;  // x22
    void* v64;  // x13
    void* v65;  // x26
    void* v66;  // x1
    void* v67;  // x19
    st_8a104_4 *v68;  // x27
    void* i;  // x20
    uint128_t *v70;  // x9
    uint128_t *node;  // x9
    uint128_t *v72;  // x10
    st_8a104_3 *v74;  // x8
    unsigned long long v75;  // x9
    void* v76;  // x9
    unsigned int v77;  // w10
    unsigned long v78;  // x19
    void* v79;  // x25
    unsigned long v80;  // cc_dep1
    unsigned long v81;  // cc_dep2
    void* v82;  // x4
    void* v83;  // x8
    unsigned long long v84;  // 4113
    unsigned long long v85;  // 4113
    void* v86;  // x20
    void* iter1;  // x22
    void* v88;  // x1
    void* v89;  // x8
    void* v90;  // x9
    void* v91;  // x8
    void* v92;  // x10
    void* v93;  // x13
    void* v94;  // x3
    void* v95;  // x20
    uint128_t *v96;  // x9
    uint128_t *iter2;  // x9
    uint128_t *v98;  // x10
    unsigned long long v30;  // 4112
    st_8a104_3 *v100;  // x8
    unsigned long long v101;  // x9
    void* v102;  // x9
    void* v103;  // x25
    void* v104;  // x11
    unsigned long v105;  // x8
    unsigned long v106;  // x9
    unsigned int *v107;  // x10
    unsigned long v108;  // x23
    unsigned int v0;  // [bp-0x114]
    void* v1;  // [bp-0x110]
    unsigned int v2;  // [bp-0x104]
    char *v3;  // [bp-0x100]
    st_8a104_4 *v4;  // [bp-0xf8]
    void* v5;  // [bp-0xf0]
    unsigned int v6;  // [bp-0xe4]
    void* v7;  // [bp-0xe0]
    unsigned int *v8;  // [bp-0xd8]
    unsigned long long v9;  // [bp-0xd0]
    void* v10;  // [bp-0xc8]
    void* v11;  // [bp-0xc0]
    unsigned long v12;  // [bp-0xb8]
    unsigned long long v13;  // [bp-0xb0]
    unsigned long long v14;  // [bp-0xa8]
    void* v15;  // [bp-0xa0]
    unsigned long long v16;  // [bp-0x98]
    unsigned int *v17;  // [bp-0x90]
    st_8a104_0 **v18;  // [bp-0x88], Other Possible Types: char
    st_8a104_0 *v19;  // [bp-0x80]
    st_8a104_0 **v20;  // [bp-0x78], Other Possible Types: char
    st_8a104_0 **v21;  // [bp-0x78]
    st_8a104_0 *v22;  // [bp-0x70]
    char *v23;  // [bp-0x10]
    char v24;  // [bp+0x0]

    v23 = &v24;
    v19 = &v18;
    v18 = &v19;
    v25 = a3 + a4;
    v26 = a0->field_8;
    v27 = v25 - v26;
    v28 = 1 << ((char)a0->field_100 & 31);
    v29 = a0->field_18;
    if (v28 < v27 - a0->field_1c)
    {
        v30 = arm64g_calculate_condition(v32 | 128, v33, v34, v35);
        v31 = arm64g_calculate_condition(3, (v30 & 1 ? a0->field_28 : 0), 0, 0);
        if (!(v31 & 1))
            goto LABEL_8a166;
LABEL_8a165:
        v38 = v27 - v28 & 0xffffffff;
    }
    else
    {
        v36 = arm64g_calculate_condition(v32 | 128, v33, v34, v35);
        v37 = arm64g_calculate_condition(0, (v36 & 1 ? a0->field_28 : 0), 0, 0);
        if (v37 & 1)
            goto LABEL_8a165;
LABEL_8a166:
        v38 = a0->field_1c;
    }
    if ((unsigned int)v38 < v29)
        v39 = v29;
    else
        v39 = v38 & 0xffffffff;
    if (v29 <= (unsigned int)v38)
        return sub_87ca4();
    v40 = v25 - 8;
    v41 = *a2;
    v42 = a2[1];
    if (v40 > a3)
    {
        v43 = a5;
        v11 = v26 + v39;
        v44 = a0->field_10;
        v1 = v44 + v38;
        v9 = v44 + v39;
        v17 = a0->field_70;
        v45 = a0->field_104;
        v13 = v38;
        v14 = 64 - v45;
        v46 = a0->field_80;
        v2 = 32 - v45;
        v16 = 64 - a0->field_108;
        v7 = v25 - 32;
        v8 = v46;
        v47 = a3;
        v3 = v25;
        v4 = a1;
        v12 = v39;
        v5 = v40;
        v10 = v44;
        do
        {
            v15 = a3;
            if (6 >= v43)
            {
                if (v43 == 5)
                {
                    v48 = *(long long *)v47;
                    v49 = 0xbb000000;
                    goto LABEL_8a2a4;
                }
                else if (v43 == 6)
                {
                    v48 = *(long long *)v47;
                    v49 = 0xbf9b0000;
                    goto LABEL_8a2a4;
                }
                goto LABEL_8a26c;
            }
            else
            {
                switch (v43)
                {
                case 7:
                    v48 = *(long long *)v47;
                    v49 = 0xbfa56300;
LABEL_8a2a4:
                    idx1 = ((v49 & 0xffff0000ffffffff | 0xbcdc00000000) & 0xffffffffffff | 14923521790222270464) * v48 >> ((char)v14 & 63);
LABEL_8a2b8:
                    v51 = v46[idx1];
                    if ((unsigned int)v51 < (unsigned int)v39)
                        v52 = v44;
                    else
                        v52 = v26;
                    idx2 = 14923729446382167139 * v48 >> ((char)v16 & 63);
                    v54 = v17[idx2];
                    if ((unsigned int)v54 < (unsigned int)v39)
                        v55 = v44;
                    else
                        v55 = v26;
                    v56 = v47 - v26;
                    v57 = (unsigned int)v56 + 1;
                    v58 = v57 - v41;
                    if ((unsigned int)v58 < (unsigned int)v39)
                        v59 = v44;
                    else
                        v59 = v26;
                    v17[idx2] = (unsigned int)v56;
                    v46[idx1] = (unsigned int)v56;
                    if ((unsigned int)(v57 - v38) >= (unsigned int)v41 && (v60 = arm64g_calculate_condition(129, v58 - v39 & 0xffffffff, 4, 0), !(v60 & 1) && (v61 = v47, *(int *)((char *)v59 + v58) == (int)v61[1])))
                    {
                        v62 = v41;
                        v63 = v61 + 1;
                        v64 = v63;
                        v65 = sub_84f30();
                        v66 = v15;
                        v67 = v63 - v66;
                        v22 = &v20;
                        v21 = &v22;
                        v68 = v4;
                        if (v63 > v7)
                        {
                            sub_82208(v68->field_18, v66, v64, v7);
                            v43 = a5;
                            v39 = v12;
                            v38 = v13;
                            i = v5;
                            v44 = v10;
                            v46 = v8;
                        }
                        else
                        {
                            *v68->field_18 = *(int128_t *)v66;
                            v70 = v68->field_18;
                            v43 = a5;
                            i = v5;
                            if (v67 > 16)
                            {
                                v70[1] = (int128_t)v66[16];
                                v46 = v8;
                                v38 = v13;
                                v39 = v12;
                                v44 = v10;
                                if (v67 >= 33)
                                {
                                    node = v70 + 2;
                                    v72 = v66 + 48;
                                    do
                                    {
                                        *node = *(int128_t *)((char *)v72 - 16);
                                        node[1] = *v72;
                                        node += 2;
                                        v46 = v8;
                                        v38 = v13;
                                        v39 = v12;
                                        v44 = v10;
                                        v72 += 2;
                                    } while (node < v70 + v67);
                                }
                            }
                            else
                            {
                                v68->field_18 = v70 + v67;
                                v74 = v68->field_8;
                                v39 = v12;
                                v38 = v13;
                                v44 = v10;
                                v46 = v8;
                                v74->field_4 = (unsigned short)v67;
                                v74->field_0 = 1;
                                v76 = v65 + 1;
                                if (v76 < 0x10000)
                                    goto LABEL_8a3f0;
LABEL_8a730:
                                v77 = (char *)v74 - v68->field_0 >> 3;
                                v68->field_48 = 2;
                                v68->field_4c = v77;
LABEL_8a3f0:
                                v74->field_6 = (unsigned short)v76;
                                v68->field_8 = &v74[1];
                                v78 = v62;
                                v47 = v64 + v65 + 4;
                                if (v47 <= i)
                                    goto LABEL_8a888;
                                goto LABEL_8a410;
                            }
                        }
                        v68->field_18 = v68->field_18 + v67;
                        v74 = v68->field_8;
                        if (0x10000 <= v67)
                        {
                            v75 = (char *)v74 - v68->field_0;
                            v68->field_48 = 1;
                            v68->field_4c = v75 >> 3;
                        }
                        v64 = v63;
                        v74->field_4 = (unsigned short)v67;
                        v74->field_0 = 1;
                        v76 = v65 + 1;
                        if (0x10000 > v76)
                            goto LABEL_8a3f0;
                        goto LABEL_8a730;
                    }
                    else
                    {
                        v6 = (unsigned int)v56;
                        if ((unsigned int)v54 > (unsigned int)v38 && (v79 = v55 + v54, *(long long *)v79 == v48))
                        {
                            v42 = v41;
                            v80 = v54 & 0xffffffff;
                            v81 = v39 & 0xffffffff;
                            if ((unsigned int)v54 < (unsigned int)v39)
                            {
                                v82 = v11;
                                v83 = v1;
                                v84 = arm64g_calculate_condition(0x33, v80, v81, 0);
                                if (!(v84 & 1))
                                    goto LABEL_8a456;
                            }
                            else
                            {
                                v82 = v11;
                                v83 = v1;
                                v85 = arm64g_calculate_condition(0x33, v80, v81, 0);
                                if (!(v85 & 1))
                                {
LABEL_8a456:
                                    v86 = v82;
LABEL_8a458:
                                    iter1 = sub_84f30() + 8;
                                    v88 = v15;
                                    if (v47 <= v88)
                                    {
                                        v93 = v47;
                                        v43 = a5;
                                        v56 = v6;
                                        v68 = v4;
                                        v94 = v7;
                                    }
                                    else if (v79 > v86)
                                    {
                                        v89 = v55 + v54 - 1;
                                        v90 = v47 - 1;
                                        v43 = a5;
                                        v56 = v6;
                                        do
                                        {
                                            v91 = v89;
                                            if (*(char *)v90 != *(char *)v91)
                                            {
                                                v47 = v90 + 1;
                                                goto LABEL_8a74c;
                                            }
                                        } while ((iter1 += 1, v92 = v90 - 1, v90 > v88 && (v90 = v92, v89 = v91 - 1, v86 < v91)));
                                        v47 = v92 + 1;
LABEL_8a74c:
                                        v93 = v47;
                                        v68 = v4;
                                        v94 = v7;
                                    }
                                    else
                                    {
                                        v93 = v47;
                                        v43 = a5;
                                        v56 = v6;
                                        v68 = v4;
                                        v94 = v7;
                                    }
                                    v95 = v47 - v88;
                                    v22 = &v20;
                                    v21 = &v22;
                                    if (v47 > v94)
                                    {
                                        sub_82208(v68->field_18);
                                        v39 = v12;
                                        v38 = v13;
                                        v44 = v10;
                                        v46 = v8;
                                    }
                                    else
                                    {
                                        *v68->field_18 = *(int128_t *)v88;
                                        v96 = v68->field_18;
                                        v39 = v12;
                                        v38 = v13;
                                        v44 = v10;
                                        if (v95 > 16)
                                        {
                                            v96[1] = (int128_t)v88[16];
                                            v46 = v8;
                                            if (v95 >= 33)
                                            {
                                                iter2 = v96 + 2;
                                                v98 = v88 + 48;
                                                do
                                                {
                                                    *iter2 = *(int128_t *)((char *)v98 - 16);
                                                    iter2[1] = *v98;
                                                    iter2 += 2;
                                                    v46 = v8;
                                                    v98 += 2;
                                                } while (iter2 < v96 + v95);
                                            }
                                        }
                                        else
                                        {
                                            v68->field_18 = v96 + v95;
                                            v100 = v68->field_8;
                                            v46 = v8;
LABEL_8a850:
                                            v78 = v56 - v54;
                                            v100->field_4 = (unsigned short)v95;
                                            v100->field_0 = (unsigned int)v78 + 3;
                                            v102 = iter1 - 3;
                                            if (0x10000 > v102)
                                                goto LABEL_8a86c;
                                            goto LABEL_8ac4c;
                                        }
                                    }
                                    v68->field_18 = v68->field_18 + v95;
                                    v100 = v68->field_8;
                                    if (0x10000 <= v95)
                                    {
                                        v101 = (char *)v100 - v68->field_0;
                                        v68->field_48 = 1;
                                        v68->field_4c = v101 >> 3;
                                    }
                                    goto LABEL_8a850;
                                }
                            }
                            v86 = v83;
                            goto LABEL_8a458;
                        }
                        else
                        {
                            if ((unsigned int)v51 <= (unsigned int)v38 || (v103 = v52 + v51, *(int *)v103 != *(int *)v47))
                            {
                                a3 = v15;
                                v47 = v47 + ((long long)(v47 - a3) >> 8) + 1;
                                v43 = a5;
                                i = v5;
                                goto LABEL_8a21c;
                            }
                            v0 = v41;
                            v104 = v47;
                            v105 = (long long)v104[1];
                            v106 = 14923729446382167139 * v105 >> ((char)v16 & 63);
                            v107 = v17;
                            v108 = v107[v106];
                            if ((unsigned int)v108 < (unsigned int)v39)
                                v109 = v44;
                            else
                                v109 = v26;
                            v107[v106] = v57;
                            if ((unsigned int)v108 > (unsigned int)v38 && (v110 = v109 + v108, *(long long *)v110 == v105))
                            {
                                v111 = v108 & 0xffffffff;
                                v112 = v39 & 0xffffffff;
                                if ((unsigned int)v108 < (unsigned int)v39)
                                {
                                    v113 = v11;
                                    v114 = v1;
                                    v115 = arm64g_calculate_condition(0x33, v111, v112, 0);
                                    if (!(v115 & 1))
                                        goto LABEL_8a55e;
                                }
                                else
                                {
                                    v113 = v11;
                                    v114 = v1;
                                    v116 = arm64g_calculate_condition(0x33, v111, v112, 0);
                                    if (!(v116 & 1))
                                    {
LABEL_8a55e:
                                        v117 = v113;
LABEL_8a560:
                                        v93 = v104 + 1;
                                        iter1 = sub_84f30() + 8;
                                        v78 = v57 - v108;
                                        v118 = v15;
                                        if (v93 <= v118)
                                            goto LABEL_8abc0;
                                        v68 = v4;
                                        v119 = v7;
                                        v56 = v6;
                                        if (v110 > v117)
                                        {
                                            v120 = v109 + v108 - 1;
                                            do
                                            {
                                                v121 = v120;
                                                if (*(char *)v47 != *(char *)v121)
                                                {
                                                    v93 = v47 + 1;
                                                    v43 = a5;
                                                    goto LABEL_8abd4;
                                                }
                                            } while ((iter1 += 1, v122 = v47 - 1, v47 > v118 && (v47 = v122, v120 = v121 - 1, v117 < v121)));
                                            v93 = v122 + 1;
                                            v43 = a5;
                                            goto LABEL_8abd4;
                                        }
                                        goto LABEL_8aba8;
                                    }
                                }
                                v117 = v114;
                                goto LABEL_8a560;
                            }
                            else
                            {
                                v123 = v51 & 0xffffffff;
                                v124 = v39 & 0xffffffff;
                                if ((unsigned int)v51 < (unsigned int)v39)
                                {
                                    v125 = v11;
                                    v126 = v1;
                                    v127 = arm64g_calculate_condition(0x33, v123, v124, 0);
                                    if (!(v127 & 1))
                                        goto LABEL_8a66e;
                                    goto LABEL_8a66d;
                                }
                                else
                                {
                                    v125 = v11;
                                    v126 = v1;
                                    v128 = arm64g_calculate_condition(0x33, v123, v124, 0);
                                    if (v128 & 1)
                                    {
LABEL_8a66d:
                                        v129 = v126;
                                        goto LABEL_8a670;
                                    }
                                    else
                                    {
LABEL_8a66e:
                                        v129 = v125;
LABEL_8a670:
                                        iter1 = sub_84f30() + 4;
                                        v78 = v6 - v51;
                                        v118 = v15;
                                        if (v47 > v118)
                                        {
                                            v68 = v4;
                                            v119 = v7;
                                            if (v103 > v129)
                                            {
                                                v130 = v52 + v51 - 1;
                                                v131 = v47 - 1;
                                                v56 = v6;
                                                do
                                                {
                                                    v132 = v130;
                                                    if (*(char *)v131 != *(char *)v132)
                                                    {
                                                        v93 = v131 + 1;
                                                        goto LABEL_8aba8;
                                                    }
                                                } while ((iter1 += 1, v133 = v131 - 1, v131 > v118 && (v131 = v133, v130 = v132 - 1, v129 < v132)));
                                                v93 = v133 + 1;
                                            }
                                            else
                                            {
                                                v93 = v47;
                                                v43 = a5;
                                                v56 = v6;
                                                goto LABEL_8abd4;
                                            }
LABEL_8aba8:
                                            v43 = a5;
                                            goto LABEL_8abd4;
                                        }
                                        else
                                        {
                                            v93 = v47;
LABEL_8abc0:
                                            v43 = a5;
                                            v56 = v6;
                                            v68 = v4;
                                            v119 = v7;
LABEL_8abd4:
                                            v134 = v93 - v118;
                                            v22 = &v20;
                                            v21 = &v22;
                                            if (v93 > v119)
                                            {
                                                sub_82208(v68->field_18);
                                                v39 = v12;
                                                v38 = v13;
                                                v44 = v10;
                                                v46 = v8;
                                                v42 = v0;
                                                goto LABEL_8ac18;
                                            }
                                            else
                                            {
                                                *v68->field_18 = *(int128_t *)v118;
                                                v135 = v68->field_18;
                                                v39 = v12;
                                                v38 = v13;
                                                v44 = v10;
                                                if (v134 > 16)
                                                {
                                                    v135[1] = (int128_t)v118[16];
                                                    v42 = v0;
                                                    v46 = v8;
                                                    if (v134 >= 33)
                                                    {
                                                        iter = v135 + 2;
                                                        v137 = v118 + 48;
                                                        do
                                                        {
                                                            *iter = *(int128_t *)((char *)v137 - 16);
                                                            iter[1] = *v137;
                                                            iter += 2;
                                                            v46 = v8;
                                                            v137 += 2;
                                                        } while (iter < v135 + v134);
                                                    }
LABEL_8ac18:
                                                    v68->field_18 = v68->field_18 + v134;
                                                    v100 = v68->field_8;
                                                    if (0x10000 <= v134)
                                                    {
                                                        v139 = (char *)v100 - v68->field_0;
                                                        v68->field_48 = 1;
                                                        v68->field_4c = v139 >> 3;
                                                    }
                                                    v100->field_4 = (unsigned short)v134;
                                                    v100->field_0 = (unsigned int)v78 + 3;
                                                    v102 = iter1 - 3;
                                                    if (v102 < 0x10000)
                                                        goto LABEL_8a86c;
                                                    goto LABEL_8ac4c;
                                                }
                                                else
                                                {
                                                    v68->field_18 = v135 + v134;
                                                    v100 = v68->field_8;
                                                    v46 = v8;
                                                    v42 = v0;
                                                    v100->field_4 = (unsigned short)v134;
                                                    v100->field_0 = (unsigned int)v78 + 3;
                                                    v102 = iter1 - 3;
                                                    if (v102 < 0x10000)
                                                        goto LABEL_8a86c;
LABEL_8ac4c:
                                                    v140 = (char *)v100 - v68->field_0 >> 3;
                                                    v68->field_48 = 2;
                                                    v68->field_4c = v140;
LABEL_8a86c:
                                                    v100->field_6 = (unsigned short)v102;
                                                    v68->field_8 = &v100[1];
                                                    i = v5;
                                                    v47 = v93 + iter1;
                                                    if (i < v47)
                                                    {
LABEL_8a410:
                                                        a3 = v47;
                                                        v41 = v78;
                                                        v25 = v3;
                                                        goto LABEL_8a21c;
                                                    }
                                                    else
                                                    {
LABEL_8a888:
                                                        v141 = (unsigned int)v56 + 2;
                                                        v142 = *(long long *)((char *)v26 + v141);
                                                        v143 = 14923729446382167139 * v142;
                                                        v144 = v16;
                                                        v145 = v17;
                                                        v145[v143 >> (v144 & 63)] = v141;
                                                        v145[14923729446382167139 * *(long long *)((char *)v47 - 2) >> (v144 & 63)] = v47 - 2 - v26;
                                                        v25 = v3;
                                                        if (6 >= v43)
                                                        {
                                                            if (v43 != 5)
                                                            {
                                                                if (v43 == 6)
                                                                {
                                                                    v146 = 0xbf9b0000;
                                                                    goto LABEL_8a968;
                                                                }
                                                            }
                                                            else
                                                            {
                                                                v146 = 0xbb000000;
                                                                goto LABEL_8a968;
                                                            }
                                                            goto LABEL_8a928;
                                                        }
                                                        else if (v43 != 7)
                                                        {
                                                            if (v43 == 8)
                                                            {
                                                                v147 = v14;
                                                                v46[v143 >> (v147 & 63)] = v141;
                                                                v148 = v47;
                                                                v149 = *(long long *)((char *)v148 - 1);
                                                                v150 = (unsigned int)(v148 - 1);
                                                                v151 = 14923729446382167139;
                                                                goto LABEL_8a988;
                                                            }
LABEL_8a928:
                                                            v152 = v2;
                                                            v46[2654435761 * *(int *)((char *)v26 + v141) >> (v152 & 31)] = v141;
                                                            v153 = v47;
                                                            v150 = (unsigned int)(v153 - 1);
                                                            idx = 2654435761 * *(int *)((char *)v153 - 1) >> (v152 & 31);
                                                            continue;
                                                        }
                                                        else
                                                        {
                                                            v146 = 0xbfa56300;
LABEL_8a968:
                                                            v151 = (v146 & 0xffff0000ffffffff | 0xbcdc00000000) & 0xffffffffffff | 14923521790222270464;
                                                            v147 = v14;
                                                            v46[v151 * v142 >> (v147 & 63)] = v141;
                                                            v155 = v47;
                                                            v149 = *(long long *)((char *)v155 - 1);
                                                            v150 = (unsigned int)(v155 - 1);
LABEL_8a988:
                                                            idx = v151 * v149 >> (v147 & 63);
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
                    break;
                default:
                    if (v43 == 8)
                    {
                        v48 = *(long long *)v47;
                        v49 = 3081069667;
                        goto LABEL_8a2a4;
                    }
LABEL_8a26c:
                    idx1 = 2654435761 * *(int *)v47 >> ((char)v2 & 31);
                    v48 = *(long long *)v47;
                    goto LABEL_8a2b8;
                }
            }
            v46[idx] = (unsigned int)(v150 - v26);
            if (i >= v47)
            {
                v156 = v47 - v26;
                v157 = v156 - v42;
                if ((unsigned int)v157 < (unsigned int)v39)
                    v158 = v44;
                else
                    v158 = v26;
                if ((unsigned int)(v156 - v38) < (unsigned int)v42 || !(v159 = arm64g_calculate_condition(129, v157 - v39 & 0xffffffff, 4, 0), !(v159 & 1) && *(int *)((char *)v158 + v157) == *(int *)v47))
                    goto *((void *)(g_e6be90));
                v160 = sub_84f30();
                v22 = &v21;
                v20 = &v22;
                if (v47 > v7)
                    sub_82208(v68->field_18, v47, v47, v7);
                else
                    *v68->field_18 = *(int128_t *)v47;
                v161 = v68->field_8;
                v161->field_4 = 0;
                v161->field_0 = 1;
                v162 = v160 + 1;
                if (0x10000 > v162)
                {
                    v161->field_6 = (unsigned short)v162;
                    v68->field_8 = &v161[1];
                    if (6 < v43)
                        goto LABEL_8aae4;
                }
                else
                {
                    v163 = (char *)v161 - v68->field_0;
                    v68->field_48 = 2;
                    v68->field_4c = v163 >> 3;
                    v161->field_6 = (unsigned short)v162;
                    v68->field_8 = &v161[1];
                    if (v43 > 6)
                    {
LABEL_8aae4:
                        if (v43 == 7)
                        {
                            v164 = *(long long *)v47;
                            v8[0xcf1bbcdcbfa56300 * v164 >> ((char)v14 & 63)] = (unsigned int)v156;
                            v17[14923729446382167139 * v164 >> ((char)v16 & 63)] = (unsigned int)v156;
                            goto *((void *)(g_e6bec8));
                        }
                        else if (v43 == 8)
                        {
                            v164 = *(long long *)v47;
                            v8[14923729446382167139 * v164 >> ((char)v14 & 63)] = (unsigned int)v156;
                            v17[14923729446382167139 * v164 >> ((char)v16 & 63)] = (unsigned int)v156;
                            goto *((void *)(g_e6bec8));
                        }
                        v164 = *(long long *)v47;
                        v8[2654435761 * *(int *)v47 >> ((char)v2 & 31)] = (unsigned int)v156;
                        v17[14923729446382167139 * v164 >> ((char)v16 & 63)] = (unsigned int)v156;
                        goto *((void *)(g_e6bec8));
                    }
                }
                if (v43 == 5)
                {
                    v164 = *(long long *)v47;
                    v8[0xcf1bbcdcbb000000 * v164 >> ((char)v14 & 63)] = (unsigned int)v156;
                    v17[14923729446382167139 * v164 >> ((char)v16 & 63)] = (unsigned int)v156;
                    goto *((void *)(g_e6bec8));
                }
                else if (v43 == 6)
                {
                    v164 = *(long long *)v47;
                    v8[0xcf1bbcdcbf9b0000 * v164 >> ((char)v14 & 63)] = (unsigned int)v156;
                    v17[14923729446382167139 * v164 >> ((char)v16 & 63)] = (unsigned int)v156;
                    goto *((void *)(g_e6bec8));
                }
            }
            a3 = v47;
            v41 = v78;
LABEL_8a21c:
        } while (i > v47);
    }
    *a2 = v41;
    a2[1] = v42;
    return v25 - a3;
}
