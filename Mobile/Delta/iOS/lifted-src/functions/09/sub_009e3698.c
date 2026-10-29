/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e3698..0x9e3e34 (1948 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9e3698_0 {
    uint128_t *field_0;
    char field_8;
} st_9e3698_0;

typedef struct st_9e3698_1 {
    uint128_t *field_0;
    unsigned int field_8;
} st_9e3698_1;


char sub_9e3698(long long a0, long long a1, void* a2, long long a3)
{
    void* v4;  // x22
    void* v5;  // x21
    char v14;  // w28
    unsigned long long v104;  // x13
    unsigned long long v105;  // x12
    unsigned long long v106;  // 4110
    unsigned long long v107;  // 4102
    unsigned long long v108;  // 4110
    unsigned long long v109;  // 4102
    char v110;  // x12
    unsigned long long v111;  // x14
    unsigned long long v112;  // x15
    uint128_t *iter;  // x8
    unsigned long v15;  // cc_dep1
    uint128_t *iter1;  // x15
    unsigned long long i4;  // x16
    unsigned long long v116;  // x16
    uint128_t v117;  // q1
    unsigned long long i5;  // x8
    unsigned long long v120;  // x12
    unsigned long long *iter2;  // x11
    unsigned long long *v122;  // x10
    char v123;  // x8
    unsigned long v16;  // cc_dep2
    long long v126;  // x1
    char v127;  // w25
    int v128;  // w25
    unsigned long v129;  // cc_dep1
    unsigned long v130;  // cc_dep2
    void* v131;  // x26
    unsigned long long v132;  // 4105
    unsigned long long v133;  // 4105
    void* v17;  // x20
    void* v134;  // x20
    char v135;  // x8
    uint128_t *v136;  // x9
    uint128_t *v137;  // x10
    uint128_t *v138;  // x11
    char v139;  // x12
    uint128_t *v140;  // x13
    uint128_t *v141;  // x14
    uint128_t *node;  // x15
    unsigned long long j;  // x16
    void* v18;  // x25
    unsigned long long v144;  // x16
    uint128_t v145;  // q1
    uint128_t v146;  // q3
    unsigned long long i;  // x13
    unsigned long long v149;  // x12
    unsigned long long *v150;  // x11
    unsigned long long *v151;  // x10
    unsigned long long *v152;  // x9
    char v153;  // x13
    unsigned long long v19;  // 4109
    unsigned long v157;  // x9
    unsigned long v158;  // cc_dep1
    unsigned long v159;  // cc_dep2
    uint128_t *v160;  // x10
    uint128_t *v161;  // x11
    unsigned long long v162;  // x13
    unsigned long long v163;  // x12
    unsigned long long v20;  // 4109
    unsigned long long v164;  // 4110
    unsigned long long v165;  // 4102
    unsigned long long v166;  // 4110
    unsigned long long v167;  // 4102
    char v168;  // x12
    unsigned long long v169;  // x14
    unsigned long long v170;  // x15
    uint128_t *v171;  // x8
    uint128_t *v172;  // x15
    unsigned long long k;  // x16
    char v21;  // x8
    unsigned long long v174;  // x16
    uint128_t v175;  // q1
    unsigned long long l;  // x8
    unsigned long long v178;  // x12
    unsigned long long *v179;  // x11
    unsigned long long *v180;  // x10
    char v181;  // x8
    uint128_t *v22;  // x9
    uint128_t *v23;  // x10
    char v6;  // x0
    uint128_t *v24;  // x11
    char v25;  // x12
    uint128_t *v26;  // x13
    uint128_t *v27;  // x14
    uint128_t *v28;  // x15
    unsigned long long n;  // x16
    unsigned long long v30;  // x16
    uint128_t v31;  // q1
    uint128_t v32;  // q3
    st_9e3698_0 *v7;  // x24
    unsigned long long m;  // x13
    unsigned long long v35;  // x12
    unsigned long long *v36;  // x11
    unsigned long long *v37;  // x10
    unsigned long long *v38;  // x9
    char v39;  // x13
    unsigned long v43;  // x9
    char v8;  // x20
    unsigned long v44;  // cc_dep1
    unsigned long v45;  // cc_dep2
    uint128_t *v46;  // x10
    uint128_t *v47;  // x11
    unsigned long long v48;  // x13
    unsigned long long v49;  // x12
    unsigned long long v50;  // 4110
    unsigned long long v51;  // 4102
    unsigned long long v52;  // 4110
    unsigned long long v53;  // 4102
    st_9e3698_1 *v9;  // x20
    char v54;  // x12
    unsigned long long v55;  // x14
    unsigned long long v56;  // x15
    uint128_t *v57;  // x8
    uint128_t *v58;  // x15
    unsigned long long i0;  // x16
    unsigned long long v60;  // x16
    uint128_t v61;  // q1
    unsigned long long i1;  // x8
    st_9e3698_1 *v10;  // x26
    unsigned long long v64;  // x12
    unsigned long long *v65;  // x11
    unsigned long long *v66;  // x10
    char v67;  // x8
    st_9e3698_1 *v70;  // x10
    unsigned long v71;  // cc_dep1
    unsigned long v72;  // cc_dep2
    st_9e3698_1 *v73;  // x20
    char v11;  // x0
    unsigned long long v74;  // 4105
    unsigned long long v75;  // 4105
    st_9e3698_1 *v76;  // x27
    char v77;  // x8
    uint128_t *v78;  // x9
    uint128_t *v79;  // x10
    uint128_t *v80;  // x11
    char v81;  // x12
    uint128_t *v82;  // x13
    uint128_t *v83;  // x14
    void* v12;  // x27
    uint128_t *v84;  // x15
    unsigned long long i3;  // x16
    unsigned long long v86;  // x16
    uint128_t v87;  // q1
    uint128_t v88;  // q3
    unsigned long long i2;  // x13
    unsigned long long v91;  // x12
    unsigned long long *v92;  // x11
    unsigned long long *v93;  // x10
    char v13;  // w25
    unsigned long long *v94;  // x9
    char v95;  // x13
    unsigned long v99;  // x9
    unsigned long v100;  // cc_dep1
    unsigned long v101;  // cc_dep2
    uint128_t *v102;  // x10
    uint128_t *v103;  // x11
    unsigned int v0;  // [bp-0x74]
    st_9e3698_1 *v1;  // [bp-0x70]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    if (!*(int *)a2)
    {
        sub_9e5b4c();
        return 1;
    }
    sub_9de064(a3);
    v4 = sub_9de208(a3);
    v5 = sub_9de208(a3);
    v6 = sub_9de208(a3);
    if (v6 && (v7 = (st_9e3698_0 *)v6, sub_9e1d7c(v4, a1, a2)))
    {
        if (sub_9e4828(v4))
        {
            sub_9e5b4c(a0);
            sub_9de17c(a3);
            return 1;
        }
        if (!(*(char *)a2 & 1))
        {
            v9 = sub_9de208(a3);
            v10 = sub_9de208(a3);
            v11 = sub_9de208(a3);
            if (v11)
            {
                v12 = (void*)v11;
                v13 = 0;
                v1 = v9;
                while (sub_9e9188(v9, *(int *)a2, 0, 0, 0, a3) && sub_9e1d7c(v9, v9, a2) && (sub_9e5b4c(v5), sub_9e4c34(v7, v9)))
                {
                    v0 = v13;
                    if (*(int *)a2 >= 2)
                    {
                        v14 = 1;
                        do
                        {
                            if (!sub_9e253c(v5, v5, a2, a3))
                            {
                                sub_9de17c(a3);
                                return 0;
                            }
                            if (!sub_9e253c(v10, v7, a2, a3))
                            {
                                sub_9de17c(a3);
                                return 0;
                            }
                            if (!sub_9e227c(v12, v10, v4, a2, a3))
                            {
                                sub_9de17c(a3);
                                return 0;
                            }
                            v15 = (int)v5[8];
                            v16 = (int)v12[8];
                            if ((int)v5[8] < (int)v12[8])
                            {
                                v17 = v12;
                                v18 = v12;
                                v19 = arm64g_calculate_condition(179, v15, v16, 0);
                                if (!(v19 & 1))
                                    goto LABEL_9e3856;
                                goto LABEL_9e3855;
                            }
                            else
                            {
                                v17 = v5;
                                v18 = v12;
                                v20 = arm64g_calculate_condition(179, v15, v16, 0);
                                if (v20 & 1)
                                {
LABEL_9e3855:
                                    v12 = v5;
                                    goto LABEL_9e3858;
                                }
                                else
                                {
LABEL_9e3856:
LABEL_9e3858:
                                    if (!sub_9e4cdc())
                                    {
                                        sub_9de17c(a3);
                                        return 0;
                                    }
                                    v21 = (int)v12[8];
                                    if (v21 >= 1)
                                    {
                                        v22 = *(long long *)v17;
                                        v23 = *(long long *)v12;
                                        v24 = *(long long *)v5;
                                        if (3 >= v21)
                                        {
                                            v25 = 0;
                                        }
                                        else
                                        {
                                            v25 = 0;
                                            if (v24 - v22 >= 32 && v24 - v23 >= 32)
                                            {
                                                v25 = v21 & 0x7ffffffc;
                                                v26 = v22 + 1;
                                                v27 = v23 + 1;
                                                v28 = v24 + 1;
                                                n = v25;
                                                do
                                                {
                                                    v30 = n;
                                                    v31 = *v26;
                                                    v32 = *v27;
                                                    *(int128_t *)((char *)v28 - 16) = *(int128_t *)((char *)v26 - 16) ^ *(int128_t *)((char *)v27 - 16);
                                                    *v28 = v31 ^ v32;
                                                    v26 += 2;
                                                    v27 += 2;
                                                    v28 += 2;
                                                    n = v30 - 4;
                                                } while (n);
                                                if (v25 == v21)
                                                    goto LABEL_9e38c0;
                                            }
                                        }
                                        m = v21 - v25;
                                        v35 = v25 * 8;
                                        v36 = (char *)v24 + v35;
                                        v37 = (char *)v23 + v35;
                                        v38 = (char *)v22 + v35;
                                        do
                                        {
                                            v39 = m;
                                            *v36 = *v37 ^ *v38;
                                            v36 += 1;
                                            v38 += 1;
                                            v37 += 1;
                                            m = v39 - 1;
                                        } while (m);
                                    }
                                    else
                                    {
                                        v21 = 0;
                                    }
LABEL_9e38c0:
                                    v43 = (int)v17[8];
                                    v44 = v21 & 0xffffffff;
                                    v45 = v43 & 0xffffffff;
                                    if ((int)v43 > v21)
                                    {
                                        v46 = *(long long *)v17;
                                        v47 = *(long long *)v5;
                                        v48 = v43 - v21;
                                        v49 = v47 - v46;
                                        if (4 <= v48)
                                        {
                                            v50 = arm64g_calculate_condition(35, v44, v45, 0);
                                            v51 = arm64g_calculate_condition(132, (v50 & 1 ? v49 : 0), (v50 & 1 ? 31 : 0), 0);
                                            if (v51 & 1)
                                                goto LABEL_9e3954;
                                        }
                                        else
                                        {
                                            v52 = arm64g_calculate_condition(35, v44, v45, 0);
                                            v53 = arm64g_calculate_condition(128, (v52 & 1 ? v49 : 0), (v52 & 1 ? 31 : 0), 0);
                                            if (v53 & 1)
                                            {
LABEL_9e3954:
                                                v55 = v48 & 0xfffffffffffffffc;
                                                v54 = v55 + v21;
                                                v56 = v21 * 8;
                                                v57 = (char *)v46 + v56 + 16;
                                                v58 = (char *)v47 + v56 + 16;
                                                i0 = v55;
                                                do
                                                {
                                                    v60 = i0;
                                                    v61 = *v57;
                                                    *(int128_t *)((char *)v58 - 16) = *(int128_t *)((char *)v57 - 16);
                                                    *v58 = v61;
                                                    v57 += 2;
                                                    v58 += 2;
                                                    i0 = v60 - 4;
                                                } while (i0);
                                                if (v48 == v55)
                                                    goto LABEL_9e39b4;
LABEL_9e3994:
                                                i1 = v43 - v54;
                                                v64 = v54 * 8;
                                                v65 = (char *)v47 + v64;
                                                v66 = (char *)v46 + v64;
                                                do
                                                {
                                                    v67 = i1;
                                                    *v65 = *v66;
                                                    v65 += 1;
                                                    i1 = v67 - 1;
                                                    v66 += 1;
                                                } while (i1);
                                                goto LABEL_9e39b4;
                                            }
                                        }
                                        v54 = v21;
                                        goto LABEL_9e3994;
                                    }
                                    else
                                    {
LABEL_9e39b4:
                                        *(unsigned int *)&v5[8] = v43;
                                        sub_9e5708(v5);
                                        v70 = v1;
                                        v71 = v10->field_8;
                                        v72 = v70->field_8;
                                        if ((int)v10->field_8 < (int)v70->field_8)
                                        {
                                            v73 = v70;
                                            v74 = arm64g_calculate_condition(179, v71, v72, 0);
                                            if (!(v74 & 1))
                                                goto LABEL_9e39d6;
                                            goto LABEL_9e39d5;
                                        }
                                        else
                                        {
                                            v73 = v10;
                                            v75 = arm64g_calculate_condition(179, v71, v72, 0);
                                            if (v75 & 1)
                                            {
LABEL_9e39d5:
                                                v76 = v10;
                                                goto LABEL_9e39d8;
                                            }
                                            else
                                            {
LABEL_9e39d6:
                                                v76 = v70;
LABEL_9e39d8:
                                                if (!sub_9e4cdc())
                                                {
                                                    sub_9de17c(a3);
                                                    return 0;
                                                }
                                                v77 = v76->field_8;
                                                if (v77 >= 1)
                                                {
                                                    v78 = v73->field_0;
                                                    v79 = v76->field_0;
                                                    v80 = v7->field_0;
                                                    if (3 < v77)
                                                    {
                                                        v81 = 0;
                                                        if (v80 - v78 >= 32)
                                                        {
                                                            v12 = v18;
                                                            if (v80 - v79 >= 32)
                                                            {
                                                                v81 = v77 & 0x7ffffffc;
                                                                v82 = v78 + 1;
                                                                v83 = v79 + 1;
                                                                v84 = v80 + 1;
                                                                i3 = v81;
                                                                do
                                                                {
                                                                    v86 = i3;
                                                                    v87 = *v82;
                                                                    v88 = *v83;
                                                                    *(int128_t *)((char *)v84 - 16) = *(int128_t *)((char *)v82 - 16) ^ *(int128_t *)((char *)v83 - 16);
                                                                    *v84 = v87 ^ v88;
                                                                    v82 += 2;
                                                                    v83 += 2;
                                                                    v84 += 2;
                                                                    i3 = v86 - 4;
                                                                } while (i3);
                                                                if (v81 == v77)
                                                                    goto LABEL_9e3a48;
                                                            }
LABEL_9e3a10:
                                                            i2 = v77 - v81;
                                                            v91 = v81 * 8;
                                                            v92 = (char *)v80 + v91;
                                                            v93 = (char *)v79 + v91;
                                                            v94 = (char *)v78 + v91;
                                                            do
                                                            {
                                                                v95 = i2;
                                                                *v92 = *v93 ^ *v94;
                                                                v92 += 1;
                                                                v94 += 1;
                                                                v93 += 1;
                                                                i2 = v95 - 1;
                                                            } while (i2);
                                                            goto LABEL_9e3a48;
                                                        }
                                                    }
                                                    v81 = 0;
                                                    v12 = v18;
                                                    goto LABEL_9e3a10;
                                                }
                                                else
                                                {
                                                    v77 = 0;
                                                    v12 = v18;
LABEL_9e3a48:
                                                    v99 = v73->field_8;
                                                    v100 = v77 & 0xffffffff;
                                                    v101 = v99 & 0xffffffff;
                                                    if ((int)v99 <= v77)
                                                        continue;
                                                    v102 = v73->field_0;
                                                    v103 = v7->field_0;
                                                    v104 = v99 - v77;
                                                    v105 = v103 - v102;
                                                    if (4 <= v104)
                                                    {
                                                        v106 = arm64g_calculate_condition(35, v100, v101, 0);
                                                        v107 = arm64g_calculate_condition(132, (v106 & 1 ? v105 : 0), (v106 & 1 ? 31 : 0), 0);
                                                        if (v107 & 1)
                                                            goto LABEL_9e3ae0;
                                                        goto LABEL_9e3a70;
                                                    }
                                                    else
                                                    {
                                                        v108 = arm64g_calculate_condition(35, v100, v101, 0);
                                                        v109 = arm64g_calculate_condition(128, (v108 & 1 ? v105 : 0), (v108 & 1 ? 31 : 0), 0);
                                                        if (!(v109 & 1))
                                                        {
LABEL_9e3a70:
                                                            v110 = v77;
                                                            goto LABEL_9e3b20;
                                                        }
                                                        else
                                                        {
LABEL_9e3ae0:
                                                            v111 = v104 & 0xfffffffffffffffc;
                                                            v110 = v111 + v77;
                                                            v112 = v77 * 8;
                                                            iter = (char *)v102 + v112 + 16;
                                                            iter1 = (char *)v103 + v112 + 16;
                                                            i4 = v111;
                                                            do
                                                            {
                                                                v116 = i4;
                                                                v117 = *iter;
                                                                *(int128_t *)((char *)iter1 - 16) = *(int128_t *)((char *)iter - 16);
                                                                *iter1 = v117;
                                                                iter += 2;
                                                                iter1 += 2;
                                                                i4 = v116 - 4;
                                                            } while (i4);
                                                            if (v104 == v111)
                                                                continue;
LABEL_9e3b20:
                                                            i5 = v99 - v110;
                                                            v120 = v110 * 8;
                                                            iter2 = (char *)v103 + v120;
                                                            v122 = (char *)v102 + v120;
                                                            do
                                                            {
                                                                v123 = i5;
                                                                *iter2 = *v122;
                                                                iter2 += 1;
                                                                i5 = v123 - 1;
                                                                v122 += 1;
                                                            } while (i5);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } while ((*(unsigned int *)&v7->field_8 = v99, sub_9e5708(v7), v14 += 1, *(int *)a2 > v14));
                    }
                    if (!sub_9e4828(v7) || !(v13 = v0 + 1, v9 = v1, v0 < 49))
                    {
                        if (!sub_9e4828(v7))
                            goto LABEL_9e3bb4;
                        sub_a368c8();
                        sub_a369bc("crypto/bn/bn_gf2m.c", 1065, "BN_GF2m_mod_solve_quad_arr");
                        v126 = 113;
LABEL_9e3c14:
                        sub_a36abc(3, v126, 0);
                        break;
                    }
                }
            }
        }
        else if (sub_9e4c34(v5, v4))
        {
            if (3 <= *(int *)a2)
            {
                v127 = 1;
                do
                {
                    v128 = v127;
                    if (!sub_9e253c(v5, v5, a2, a3))
                    {
                        sub_9de17c(a3);
                        return 0;
                    }
                    if (!sub_9e253c(v5, v5, a2, a3))
                    {
                        sub_9de17c(a3);
                        return 0;
                    }
                    v129 = (int)v5[8];
                    v130 = (int)v4[8];
                    if ((int)v5[8] < (int)v4[8])
                    {
                        v131 = v4;
                        v132 = arm64g_calculate_condition(179, v129, v130, 0);
                        if (!(v132 & 1))
                            goto LABEL_9e3cba;
                        goto LABEL_9e3cb9;
                    }
                    else
                    {
                        v131 = v5;
                        v133 = arm64g_calculate_condition(179, v129, v130, 0);
                        if (v133 & 1)
                        {
LABEL_9e3cb9:
                            v134 = v5;
                            goto LABEL_9e3cbc;
                        }
                        else
                        {
LABEL_9e3cba:
                            v134 = v4;
LABEL_9e3cbc:
                            if (!sub_9e4cdc())
                            {
                                sub_9de17c(a3);
                                return 0;
                            }
                            v135 = (int)v134[8];
                            if (v135 >= 1)
                            {
                                v136 = *(long long *)v131;
                                v137 = *(long long *)v134;
                                v138 = *(long long *)v5;
                                if (3 >= v135)
                                {
                                    v139 = 0;
                                }
                                else
                                {
                                    v139 = 0;
                                    if (v138 - v136 >= 32 && v138 - v137 >= 32)
                                    {
                                        v139 = v135 & 0x7ffffffc;
                                        v140 = v136 + 1;
                                        v141 = v137 + 1;
                                        node = v138 + 1;
                                        j = v139;
                                        do
                                        {
                                            v144 = j;
                                            v145 = *v140;
                                            v146 = *v141;
                                            *(int128_t *)((char *)node - 16) = *(int128_t *)((char *)v140 - 16) ^ *(int128_t *)((char *)v141 - 16);
                                            *node = v145 ^ v146;
                                            v140 += 2;
                                            v141 += 2;
                                            node += 2;
                                            j = v144 - 4;
                                        } while (j);
                                        if (v139 == v135)
                                            goto LABEL_9e3d24;
                                    }
                                }
                                i = v135 - v139;
                                v149 = v139 * 8;
                                v150 = (char *)v138 + v149;
                                v151 = (char *)v137 + v149;
                                v152 = (char *)v136 + v149;
                                do
                                {
                                    v153 = i;
                                    *v150 = *v151 ^ *v152;
                                    v150 += 1;
                                    v152 += 1;
                                    v151 += 1;
                                    i = v153 - 1;
                                } while (i);
                            }
                            else
                            {
                                v135 = 0;
                            }
LABEL_9e3d24:
                            v157 = (int)v131[8];
                            v158 = v135 & 0xffffffff;
                            v159 = v157 & 0xffffffff;
                            if ((int)v157 <= v135)
                                continue;
                            v160 = *(long long *)v131;
                            v161 = *(long long *)v5;
                            v162 = v157 - v135;
                            v163 = v161 - v160;
                            if (4 <= v162)
                            {
                                v164 = arm64g_calculate_condition(35, v158, v159, 0);
                                v165 = arm64g_calculate_condition(132, (v164 & 1 ? v163 : 0), (v164 & 1 ? 31 : 0), 0);
                                if (v165 & 1)
                                    goto LABEL_9e3db8;
                                goto LABEL_9e3d4c;
                            }
                            else
                            {
                                v166 = arm64g_calculate_condition(35, v158, v159, 0);
                                v167 = arm64g_calculate_condition(128, (v166 & 1 ? v163 : 0), (v166 & 1 ? 31 : 0), 0);
                                if (!(v167 & 1))
                                {
LABEL_9e3d4c:
                                    v168 = v135;
                                    goto LABEL_9e3df8;
                                }
                                else
                                {
LABEL_9e3db8:
                                    v169 = v162 & 0xfffffffffffffffc;
                                    v168 = v169 + v135;
                                    v170 = v135 * 8;
                                    v171 = (char *)v160 + v170 + 16;
                                    v172 = (char *)v161 + v170 + 16;
                                    k = v169;
                                    do
                                    {
                                        v174 = k;
                                        v175 = *v171;
                                        *(int128_t *)((char *)v172 - 16) = *(int128_t *)((char *)v171 - 16);
                                        *v172 = v175;
                                        v171 += 2;
                                        v172 += 2;
                                        k = v174 - 4;
                                    } while (k);
                                    if (v162 == v169)
                                        continue;
LABEL_9e3df8:
                                    l = v157 - v168;
                                    v178 = v168 * 8;
                                    v179 = (char *)v161 + v178;
                                    v180 = (char *)v160 + v178;
                                    do
                                    {
                                        v181 = l;
                                        *v179 = *v180;
                                        v179 += 1;
                                        l = v181 - 1;
                                        v180 += 1;
                                    } while (l);
                                }
                            }
                        }
                    }
                } while ((*(unsigned int *)&v5[8] = v157, sub_9e5708(v5), v127 = v128 + 1, (*(int *)a2 - 1) / 2 > v128));
            }
LABEL_9e3bb4:
            if (sub_9e253c(v7, v5, a2, a3) && sub_9e1bdc(v7, v5, v7))
            {
                if (sub_9e53a8(v7, v4))
                {
                    sub_a368c8();
                    sub_a369bc("crypto/bn/bn_gf2m.c", 1075, "BN_GF2m_mod_solve_quad_arr");
                    v126 = 116;
                    goto LABEL_9e3c14;
                }
                else
                {
                    v8 = sub_9e4c34(a0, v5) != 0;
                    sub_9de17c(a3);
                    return v8;
                }
            }
        }
    }
    sub_9de17c(a3);
    return 0;
}
