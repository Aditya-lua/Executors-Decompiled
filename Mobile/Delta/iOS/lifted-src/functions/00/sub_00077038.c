/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x77038..0x778e4 (2220 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_77038_6 {
    char padding_0[2];
    unsigned short field_2;
} st_77038_6;

typedef struct st_77038_2 {
    unsigned short field_0;
    char field_2;
    char field_3;
} st_77038_2;

typedef struct st_77038_1 {
    char padding_0[514];
    unsigned short field_202;
} st_77038_1;

typedef struct st_77038_3 {
    struct st_77038_4 *field_0;
} st_77038_3;

typedef struct st_77038_4 {
    struct st_77038_3 *field_0;
} st_77038_4;

typedef struct st_77038_0 {
    char field_0;
} st_77038_0;

typedef struct st_77038_5 {
    unsigned int field_0;
    unsigned int field_4;
    unsigned int field_8;
    unsigned int field_c;
} st_77038_5;

extern st_77038_5 g_cbeec8;
extern unsigned long long g_cbef48;

unsigned long long sub_77038(char *a0, unsigned long a1, long long a2, long long a3, unsigned int a4, st_77038_1 *a5, unsigned long a6)
{
    unsigned long long v21;  // x0
    unsigned long long v22;  // 4106
    unsigned long v31;  // x14
    char *v121;  // x0
    char *v122;  // x1
    char *iter;  // x1
    st_77038_2 *v124;  // x7
    unsigned long v125;  // x16
    unsigned long v126;  // x7
    unsigned long v127;  // x19
    unsigned long v128;  // x15
    unsigned long v129;  // x7
    unsigned long long v130;  // x7
    unsigned long long *iter1;  // x9
    unsigned long v131;  // x20
    unsigned long v132;  // x7
    st_77038_2 *v133;  // x14
    unsigned long v134;  // x17
    unsigned long v135;  // x15
    unsigned long v136;  // x19
    unsigned long v137;  // x20
    unsigned long v138;  // x14
    unsigned long long v139;  // x14
    unsigned long long *v33;  // x8
    char *v34;  // x17
    unsigned long long *v35;  // x10
    unsigned long long v36;  // x11
    unsigned long long v37;  // x11
    unsigned long long *v38;  // x11
    unsigned long long *iter2;  // x9
    unsigned long v40;  // x13
    unsigned long long v23;  // x25
    unsigned long v41;  // x15
    unsigned long long v42;  // x11
    unsigned long v43;  // x16
    unsigned long long v44;  // x12
    char *v45;  // x0
    unsigned long v46;  // x13
    unsigned long long *v47;  // x6
    unsigned long long v48;  // x6
    unsigned long long v49;  // x13
    st_77038_2 *v50;  // x15
    st_77038_6 *v24;  // x20
    unsigned long v51;  // x6
    unsigned long v52;  // x15
    unsigned long long v53;  // x14
    st_77038_2 *v54;  // x15
    unsigned long v55;  // x16
    unsigned long v56;  // x15
    unsigned long long v57;  // x14
    st_77038_2 *v58;  // x15
    unsigned long v59;  // x15
    unsigned long long v60;  // x14
    unsigned long long v25;  // x0
    st_77038_2 *v61;  // x16
    unsigned long v62;  // x6
    unsigned long v63;  // x16
    char *i;  // x1
    char *v65;  // x17
    char *v66;  // x0
    char *v67;  // x0
    st_77038_2 *v68;  // x6
    unsigned long v69;  // x15
    unsigned long v70;  // x19
    unsigned long long v26;  // 4106
    unsigned long long v71;  // x6
    unsigned long v72;  // x7
    unsigned long long v73;  // x7
    unsigned long v74;  // x7
    st_77038_2 *v75;  // x13
    unsigned long v76;  // x16
    unsigned long v77;  // x19
    unsigned long v78;  // x13
    unsigned long long v79;  // x13
    char *v27;  // x21
    unsigned long long v82;  // x0
    unsigned long long v83;  // 4106
    unsigned long v84;  // x15
    unsigned long long *v85;  // x9
    unsigned long long *v86;  // x8
    char *v87;  // x0
    unsigned long long *v88;  // x10
    unsigned long long v89;  // x11
    unsigned long long v90;  // x11
    char *v28;  // x22
    unsigned long long *v91;  // x11
    unsigned long long *node;  // x9
    unsigned long v93;  // x14
    unsigned long v94;  // x16
    unsigned long long v95;  // x11
    unsigned long v96;  // x17
    unsigned long long v97;  // x12
    char *v98;  // x1
    unsigned long v99;  // x14
    unsigned long long *v100;  // x7
    unsigned long long v29;  // x0
    unsigned long long v101;  // x7
    unsigned long long v102;  // x14
    st_77038_2 *v103;  // x16
    unsigned long v104;  // x7
    unsigned long v105;  // x16
    unsigned long long v106;  // x15
    unsigned long long v107;  // x16
    st_77038_2 *v108;  // x17
    unsigned long v109;  // x19
    unsigned long v110;  // x17
    unsigned long long v30;  // 4106
    unsigned long long v111;  // x15
    unsigned long long v112;  // x17
    st_77038_2 *v113;  // x16
    unsigned long v114;  // x16
    unsigned long long v115;  // x15
    st_77038_2 *v116;  // x17
    unsigned long v117;  // x7
    unsigned long v118;  // x17
    unsigned long v119;  // x17
    char *j;  // x2
    st_77038_0 **v0;  // [bp-0xe0], Other Possible Types: char
    st_77038_0 *v1;  // [bp-0xd8]
    unsigned int v2;  // [bp-0xd0]
    unsigned int v3;  // [bp-0xcc]
    st_77038_0 **v4;  // [bp-0xc8], Other Possible Types: char
    st_77038_0 *v5;  // [bp-0xc0]
    unsigned long v6;  // [bp-0xb8]
    unsigned long long v7;  // [bp-0xb0]
    unsigned long v8;  // [bp-0xa8]
    unsigned long long v9;  // [bp-0xa0]
    char v10;  // [bp-0x98]
    unsigned int v11;  // [bp-0x90]
    unsigned long long *v12;  // [bp-0x88]
    unsigned long long *v13;  // [bp-0x80]
    unsigned long long *v14;  // [bp-0x78]
    st_77038_4 **v15;  // [bp-0x70]
    st_77038_4 **v16;  // [bp-0x68]
    char *v17;  // [bp-0x60]
    st_77038_0 **v18;  // [bp-0x58]
    char *v19;  // [bp-0x10]
    char v20;  // [bp+0x0]

    v19 = &v20;
    v1 = &v0;
    v0 = &v1;
    v2 = 0xff;
    if (0x200 > a6)
        return 0xffffffffffffffff;
    v21 = sub_7644c(a5, &v2, &v3, a2, a3, 0);
    v22 = arm64g_calculate_condition(130, v21, 120, 0);
    if (v22 & 1)
        return v21;
    if (a4 < v3 || ((1 << ((char)v3 & 63)) + (1 << ((char)v3 & 31)) * 4 + (v2 + 1) * 2 + 19 & 0xfffffffffffffffc) + 516 > a6)
        return 0xffffffffffffffd4;
    v23 = v21;
    v24 = &a5->padding_0[0x200];
    v25 = sub_76ca4(v24, a5);
    v26 = arm64g_calculate_condition(130, v25, 120, 0);
    if (v26 & 1)
        return v25;
    v27 = &a0[a1];
    v28 = v27 - 3;
    if (a5->field_202)
    {
        v5 = &v4;
        v4 = &v5;
        v29 = sub_76b3c(&v10, a2 + v23);
        v30 = arm64g_calculate_condition(130, v29, 120, 0);
        if (v30 & 1)
            return v29;
        sub_76f64(&v8, &v10, v24);
        sub_76f64(&v6, &v10, v24);
        v18 = &v17;
        v17 = &v18;
        v31 = v11;
        if (65 <= (unsigned int)v31)
            return 0xffffffffffffffec;
        iter1 = v12;
        v33 = v14;
        v34 = a0;
        if (v33 > iter1)
        {
            v35 = v13;
            if (iter1 != v35)
            {
                v36 = v31 >> 3;
                if ((char *)iter1 - v36 < v35)
                    v37 = iter1 - v35 & 0xffffffff;
                else
                    v37 = v36 & 0xffffffff;
                iter1 = (char *)iter1 - v37;
                v31 = (unsigned int)v31 - (unsigned int)v37 * 8;
LABEL_772ac:
                v38 = iter1;
            }
            else
            {
                v38 = &v10;
                v35 = iter1;
            }
        }
        else
        {
            iter1 = (char *)iter1 - (v31 >> 3);
            v31 = (unsigned int)v31 & 7;
            v35 = v13;
            goto LABEL_772ac;
        }
        v40 = *v38;
        v41 = v8;
        v42 = v9;
        v43 = v6;
        v44 = v7;
        v15 = &v16;
        v16 = &v15;
        if (64 >= (unsigned int)v31)
        {
            v45 = v34;
            do
            {
                if (v33 > iter2)
                {
                    if (iter2 == v35)
                        goto LABEL_77404;
                    v46 = (unsigned int)v31 >> 3;
                    v47 = (char *)iter2 - v46;
                    v48 = v47 >= v35;
                    if (v35 <= v47)
                        v49 = v46 & 0xffffffff;
                    else
                        v49 = iter2 - v35 & 0xffffffff;
                    iter2 = (char *)iter2 - v49;
                    v31 = (unsigned int)v31 - (unsigned int)v49 * 8;
                    v40 = *iter2;
                }
                else
                {
                    v17 = &v18;
                    v18 = &v17;
                    iter2 = (char *)iter2 - ((unsigned int)v31 >> 3);
                    v31 = (unsigned int)v31 & 7;
                    v40 = *iter2;
                    v48 = 1;
                }
                if (v28 <= v45 || !(v48 & 1))
                {
LABEL_77404:
                    i = v27 - 2;
                    if (i < v45)
                        return 0xffffffffffffffba;
                    goto LABEL_77410;
                }
                v50 = v42 + v41 * 4;
                v51 = v50->field_0;
                v52 = v50->field_3;
                v53 = v31 + v52;
                *v45 = v50->field_2;
                v54 = v44 + v43 * 4;
                v55 = v54->field_0;
                v56 = v54->field_3;
                v57 = v53 + v56;
                v45[1] = v54->field_2;
                v58 = v42 + (v40 << ((char)v31 & 63) >> ((char)-(unsigned int)v52 & 63)) * 4 + v51 * 4;
                v59 = v58->field_3;
                v60 = v57 + v59;
                v41 = (v40 << ((char)v57 & 63) >> ((char)-(unsigned int)v59 & 63)) + v58->field_0;
                v45[2] = v58->field_2;
                v61 = v44 + (v40 << ((char)v53 & 63) >> ((char)-(unsigned int)v56 & 63)) * 4 + v55 * 4;
                v62 = v61->field_0;
                v63 = v61->field_3;
                v45[3] = v61->field_2;
                v31 = v60 + v63;
                v43 = (v40 << ((char)v60 & 63) >> ((char)-(unsigned int)v63 & 63)) + v62;
                v45 += 4;
                v15 = &v16;
                v16 = &v15;
            } while ((unsigned int)v31 <= 64);
            iter2 = &g_cbef48;
            i = v27 - 2;
            if (v45 > i)
                return 0xffffffffffffffba;
        }
        else
        {
            iter2 = &g_cbef48;
            v45 = v34;
            i = v27 - 2;
            if (i < v34)
                return 0xffffffffffffffba;
        }
LABEL_77410:
        v65 = v45 - v34;
        v66 = v45 + 1;
        do
        {
            v67 = v66;
            v68 = v42 + v41 * 4;
            v69 = v68->field_0;
            v70 = v68->field_3;
            v71 = v31 + v70;
            *(v67 - 1) = v68->field_2;
            v15 = &v16;
            v16 = &v15;
            if (64 < (unsigned int)v71)
            {
                *v67 = *(char *)(v44 + v43 * 4 + 2);
                return v65 + 2;
            }
            if (v33 <= iter2)
            {
                v17 = &v18;
                v18 = &v17;
                iter2 = (char *)iter2 - ((unsigned int)v71 >> 3);
                v71 = (unsigned int)v71 & 7;
                v74 = *iter2;
                if (v67 > i)
                    break;
            }
            else if (iter2 != v35)
            {
                v72 = (unsigned int)v71 >> 3;
                if ((char *)iter2 - v72 < v35)
                    v73 = iter2 - v35 & 0xffffffff;
                else
                    v73 = v72 & 0xffffffff;
                iter2 = (char *)iter2 - v73;
                v71 = (unsigned int)v71 - (unsigned int)v73 * 8;
                v74 = *iter2;
                if (v67 > i)
                    break;
            }
            else
            {
                v74 = v40;
                if (i < v67)
                    break;
            }
            v41 = (v40 << ((char)v31 & 63) >> ((char)-(unsigned int)v70 & 63)) + v69;
            v75 = v44 + v43 * 4;
            v76 = v75->field_0;
            v77 = v75->field_3;
            *v67 = v75->field_2;
            v31 = v71 + v77;
            v15 = &v16;
            v16 = &v15;
            if (64 < (unsigned int)v31)
            {
                v67[1] = *(char *)(v42 + v41 * 4 + 2);
                return v65 + 3;
            }
            if (v33 <= iter2)
            {
                v17 = &v18;
                v18 = &v17;
                iter2 = (char *)iter2 - ((unsigned int)v31 >> 3);
                v31 = (unsigned int)v31 & 7;
                goto LABEL_7743c;
            }
            else if (iter2 != v35)
            {
                v78 = (unsigned int)v31 >> 3;
                if ((char *)iter2 - v78 < v35)
                    v79 = iter2 - v35 & 0xffffffff;
                else
                    v79 = v78 & 0xffffffff;
                iter2 = (char *)iter2 - v79;
                v31 = (unsigned int)v31 - (unsigned int)v79 * 8;
LABEL_7743c:
                v40 = *iter2;
                continue;
            }
            else
            {
                v40 = v74;
            }
            v43 = (v74 << ((char)v71 & 63) >> ((char)-(unsigned int)v77 & 63)) + v76;
            v65 += 2;
            v66 = v67 + 2;
        } while (i >= v67 + 1);
    }
    else
    {
        v5 = &v4;
        v4 = &v5;
        v82 = sub_76b3c(&v10, a2 + v23);
        v83 = arm64g_calculate_condition(130, v82, 120, 0);
        if (v83 & 1)
            return v82;
        sub_76f64(&v8, &v10, v24);
        sub_76f64(&v6, &v10, v24);
        v18 = &v17;
        v17 = &v18;
        v84 = v11;
        if (65 <= (unsigned int)v84)
            return 0xffffffffffffffec;
        v85 = v12;
        v86 = v14;
        v87 = a0;
        if (v86 > v85)
        {
            v88 = v13;
            if (v85 != v88)
            {
                v89 = v84 >> 3;
                if ((char *)v85 - v89 < v88)
                    v90 = v85 - v88 & 0xffffffff;
                else
                    v90 = v89 & 0xffffffff;
                v85 = (char *)v85 - v90;
                v84 = (unsigned int)v84 - (unsigned int)v90 * 8;
LABEL_77568:
                v91 = v85;
            }
            else
            {
                v91 = &v10;
                v88 = v85;
            }
        }
        else
        {
            v85 = (char *)v85 - (v84 >> 3);
            v84 = (unsigned int)v84 & 7;
            v88 = v13;
            goto LABEL_77568;
        }
        v93 = *v91;
        v94 = v8;
        v95 = v9;
        v96 = v6;
        v97 = v7;
        v15 = &v16;
        v16 = &v15;
        if (64 >= (unsigned int)v84)
        {
            v98 = v87;
            do
            {
                if (v86 > node)
                {
                    if (node == v88)
                        goto LABEL_7770c;
                    v99 = (unsigned int)v84 >> 3;
                    v100 = (char *)node - v99;
                    v101 = v100 >= v88;
                    if (v88 <= v100)
                        v102 = v99 & 0xffffffff;
                    else
                        v102 = node - v88 & 0xffffffff;
                    node = (char *)node - v102;
                    v84 = (unsigned int)v84 - (unsigned int)v102 * 8;
                    v93 = *node;
                }
                else
                {
                    v17 = &v18;
                    v18 = &v17;
                    node = (char *)node - ((unsigned int)v84 >> 3);
                    v84 = (unsigned int)v84 & 7;
                    v93 = *node;
                    v101 = 1;
                }
                if (v28 <= v98 || !(v101 & 1))
                    goto LABEL_7770c;
                v103 = v95 + v94 * 4;
                v104 = v103->field_0;
                v105 = v103->field_3;
                v106 = v84 + v105;
                v107 = v93 >> ((char)-(unsigned int)v106 & 63) & (&g_cbeec8.field_0)[v105];
                *v98 = v103->field_2;
                v108 = v97 + v96 * 4;
                v109 = v108->field_0;
                v110 = v108->field_3;
                v111 = v106 + v110;
                v112 = v93 >> ((char)-(unsigned int)v111 & 63) & (&g_cbeec8.field_0)[v110];
                v98[1] = v108->field_2;
                v113 = v95 + v107 * 4 + v104 * 4;
                v114 = v113->field_3;
                v115 = v111 + v114;
                v94 = (v93 >> ((char)-(unsigned int)v115 & 63) & (&g_cbeec8.field_0)[v114]) + v113->field_0;
                v98[2] = v113->field_2;
                v116 = v97 + v112 * 4 + v109 * 4;
                v117 = v116->field_0;
                v118 = v116->field_3;
                v84 = v115 + v118;
                v119 = (&g_cbeec8.field_0)[v118];
                v98[3] = v116->field_2;
                v96 = (v93 >> ((char)-(unsigned int)v84 & 63) & v119) + v117;
                v98 += 4;
                v15 = &v16;
                v16 = &v15;
            } while ((unsigned int)v84 <= 64);
            node = &g_cbef48;
        }
        else
        {
            node = &g_cbef48;
            v98 = v87;
        }
LABEL_7770c:
        j = v27 - 2;
        if (v98 <= j)
        {
            v121 = v98 - v87;
            v122 = v98 + 1;
            do
            {
                iter = v122;
                v124 = v95 + v94 * 4;
                v125 = v124->field_0;
                v126 = v124->field_3;
                v127 = v84 + v126;
                v128 = (&g_cbeec8.field_0)[v126];
                *(iter - 1) = v124->field_2;
                v15 = &v16;
                v16 = &v15;
                if (64 < (unsigned int)v127)
                {
                    *iter = *(char *)(v97 + v96 * 4 + 2);
                    return v121 + 2;
                }
                if (v86 <= node)
                {
                    v17 = &v18;
                    v18 = &v17;
                    node = (char *)node - ((unsigned int)v127 >> 3);
                    v131 = (unsigned int)v127 & 7;
                    v132 = *node;
                    if (iter > j)
                        break;
                }
                else if (node != v88)
                {
                    v129 = (unsigned int)v127 >> 3;
                    if ((char *)node - v129 < v88)
                        v130 = node - v88 & 0xffffffff;
                    else
                        v130 = v129 & 0xffffffff;
                    node = (char *)node - v130;
                    v131 = (unsigned int)v127 - (unsigned int)v130 * 8;
                    v132 = *node;
                    if (iter > j)
                        break;
                }
                else
                {
                    v131 = v127;
                    v132 = v93;
                    if (j < iter)
                        break;
                }
                v94 = (v93 >> ((char)-(unsigned int)v127 & 63) & v128) + v125;
                v133 = v97 + v96 * 4;
                v134 = v133->field_0;
                v135 = v133->field_3;
                v136 = (&g_cbeec8.field_0)[v135];
                v137 = v131 + v135;
                *iter = v133->field_2;
                v15 = &v16;
                v16 = &v15;
                if (64 < (unsigned int)v137)
                {
                    iter[1] = *(char *)(v95 + v94 * 4 + 2);
                    return v121 + 3;
                }
                if (v86 <= node)
                {
                    v17 = &v18;
                    v18 = &v17;
                    node = (char *)node - ((unsigned int)v137 >> 3);
                    v84 = (unsigned int)v137 & 7;
                    goto LABEL_7774c;
                }
                else if (node != v88)
                {
                    v138 = (unsigned int)v137 >> 3;
                    if ((char *)node - v138 < v88)
                        v139 = node - v88 & 0xffffffff;
                    else
                        v139 = v138 & 0xffffffff;
                    node = (char *)node - v139;
                    v84 = (unsigned int)v137 - (unsigned int)v139 * 8;
LABEL_7774c:
                    v93 = *node;
                    continue;
                }
                else
                {
                    v84 = v137;
                    v93 = v132;
                }
                v96 = (v132 >> ((char)-(unsigned int)v137 & 63) & v136) + v134;
                v121 += 2;
                v122 = iter + 2;
            } while (j >= iter + 1);
        }
    }
    return 0xffffffffffffffba;
    return 0xffffffffffffffd4;
}
