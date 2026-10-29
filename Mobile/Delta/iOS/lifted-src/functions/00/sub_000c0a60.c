/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc0a60..0xc1870 (3600 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c0a60_2 {
    char field_0;
    char field_1;
} st_c0a60_2;

typedef struct st_c0a60_1 {
    char padding_0[2];
    unsigned short field_2;
} st_c0a60_1;

typedef struct st_c0a60_3 {
    struct st_c0a60_0 *field_0;
} st_c0a60_3;

typedef struct st_c0a60_0 {
    char field_0;
} st_c0a60_0;

extern unsigned long long g_cc0ea0;

unsigned long long sub_c0a60(char *a0, unsigned long long a1, unsigned short *a2, long long a3, st_c0a60_1 *a4, unsigned long long a5)
{
    unsigned long long v40;  // x0
    unsigned long v41;  // x26
    unsigned long v50;  // x23
    unsigned int v140;  // w11
    st_c0a60_2 *v141;  // x10
    unsigned int k;  // w14
    char v144;  // x11
    unsigned long long *v145;  // x16
    unsigned long long *v146;  // x15
    unsigned long v147;  // x17
    unsigned long long *v148;  // x0
    unsigned long long v149;  // w15
    unsigned int v51;  // w20
    unsigned long long v150;  // x17
    unsigned int v151;  // w14
    unsigned long v152;  // x16
    st_c0a60_2 *v153;  // x15
    unsigned int v154;  // w14
    st_c0a60_2 *v155;  // x15
    unsigned int v156;  // w15
    st_c0a60_2 *v157;  // x14
    unsigned int v158;  // w15
    st_c0a60_2 *v159;  // x14
    unsigned long long v52;  // x0
    char *v160;  // x15
    unsigned long v161;  // x8
    unsigned long long *v162;  // x9
    unsigned long long *v163;  // x10
    unsigned long long v164;  // x11
    unsigned long long v165;  // x10
    unsigned long long *v166;  // x9
    unsigned int v167;  // w8
    unsigned int v168;  // w10
    st_c0a60_2 *v169;  // x9
    unsigned long long v53;  // 4106
    unsigned int m;  // w14
    char v171;  // x11
    unsigned long long *v172;  // x16
    unsigned long long *v173;  // x15
    unsigned long v174;  // x17
    unsigned long long *v175;  // x0
    unsigned int v176;  // w15
    unsigned long long v177;  // x17
    unsigned int v178;  // w14
    unsigned long v179;  // x16
    long long v54;  // x23
    st_c0a60_2 *v180;  // x15
    unsigned int v181;  // w14
    st_c0a60_2 *v182;  // x15
    unsigned int v183;  // w15
    st_c0a60_2 *v184;  // x14
    unsigned int v185;  // w15
    st_c0a60_2 *v186;  // x14
    char *v187;  // x15
    unsigned long v188;  // x8
    unsigned long long *v189;  // x9
    unsigned long long v55;  // x0
    unsigned long long *v190;  // x10
    unsigned long long v191;  // x11
    unsigned long long v192;  // x10
    unsigned long long *v193;  // x9
    unsigned int v194;  // w8
    unsigned int v195;  // w10
    st_c0a60_2 *v196;  // x9
    unsigned int i0;  // w13
    char v198;  // x10
    unsigned long long *v199;  // x15
    unsigned long long v56;  // 4106
    unsigned long long *v200;  // x14
    unsigned long v201;  // x16
    unsigned long long *v202;  // x17
    unsigned long long v203;  // w14
    unsigned long long v204;  // x16
    unsigned int v205;  // w13
    unsigned long v206;  // x15
    st_c0a60_2 *v207;  // x14
    unsigned int v208;  // w13
    st_c0a60_2 *v209;  // x14
    long long v57;  // x23
    unsigned int v210;  // w14
    st_c0a60_2 *v211;  // x13
    unsigned int v212;  // w14
    st_c0a60_2 *v213;  // x13
    char *v214;  // x14
    unsigned long v215;  // x8
    unsigned long long *v216;  // x9
    unsigned long long *v217;  // x10
    unsigned long long v218;  // x11
    unsigned long long v219;  // x10
    unsigned long long v58;  // x0
    unsigned long long *v220;  // x9
    unsigned int v221;  // w8
    unsigned long long i1;  // x9
    unsigned long long v223;  // x9
    unsigned int v224;  // w11
    st_c0a60_2 *v225;  // x10
    unsigned int v227;  // w0
    unsigned int v228;  // w0
    unsigned int v229;  // w0
    unsigned long long v59;  // 4106
    unsigned long v42;  // x25
    unsigned long long v60;  // x0
    unsigned long long v61;  // 4106
    unsigned long v62;  // x24
    char *v63;  // x10
    char *v64;  // x11
    char *v65;  // x9
    char v66;  // x26
    char *v67;  // x8
    unsigned long long v68;  // x12
    unsigned int v69;  // w13
    unsigned long v43;  // x22
    st_c0a60_2 *v70;  // x14
    unsigned int v71;  // w16
    unsigned long v72;  // x13
    unsigned int v73;  // w14
    st_c0a60_2 *v74;  // x15
    unsigned int v75;  // w0
    unsigned long v76;  // x14
    unsigned int v77;  // w15
    st_c0a60_2 *v78;  // x17
    unsigned int v79;  // w17
    long long v44;  // x8
    unsigned long v80;  // x15
    unsigned int v81;  // w1
    st_c0a60_2 *v82;  // x2
    unsigned int v83;  // w1
    st_c0a60_2 *v84;  // x2
    unsigned int v85;  // w16
    st_c0a60_2 *v86;  // x2
    unsigned int v87;  // w0
    st_c0a60_2 *v88;  // x2
    unsigned int v89;  // w17
    char *v45;  // x9
    st_c0a60_2 *v90;  // x2
    unsigned int v91;  // w1
    st_c0a60_2 *v92;  // x2
    unsigned int v93;  // w16
    st_c0a60_2 *v94;  // x2
    unsigned int v95;  // w0
    st_c0a60_2 *v96;  // x2
    unsigned int v97;  // w17
    st_c0a60_2 *v98;  // x2
    unsigned int v99;  // w1
    unsigned long long v46;  // x10
    st_c0a60_2 *v100;  // x12
    char *iter;  // x20
    st_c0a60_2 *v102;  // x11
    char *node;  // x28
    st_c0a60_2 *v104;  // x10
    char *iter1;  // x25
    st_c0a60_2 *v106;  // x9
    unsigned long long v107;  // w21
    unsigned long long v108;  // w22
    unsigned long long v109;  // w0
    char *v47;  // x11
    unsigned long long v110;  // w0
    char *v111;  // x4
    char *v112;  // x7
    unsigned int i;  // w14
    char v114;  // x11
    unsigned long long *v115;  // x16
    unsigned long long *v116;  // x15
    unsigned long v117;  // x17
    unsigned long long *v118;  // x0
    unsigned long long v119;  // w15
    char *v48;  // x8
    unsigned long long v120;  // x17
    unsigned int v121;  // w14
    unsigned long long v122;  // x16
    st_c0a60_2 *v123;  // x15
    unsigned int v124;  // w14
    st_c0a60_2 *v125;  // x15
    unsigned int v126;  // w15
    st_c0a60_2 *v127;  // x14
    unsigned int v128;  // w15
    st_c0a60_2 *v129;  // x14
    char *iter2;  // x27
    char *v130;  // x15
    unsigned long v131;  // x8
    unsigned long long *v132;  // x9
    unsigned long long *v133;  // x10
    unsigned long long v134;  // x11
    unsigned long long v135;  // x10
    unsigned long long *v136;  // x9
    unsigned int v137;  // w8
    unsigned long long j;  // x9
    unsigned long long v139;  // x9
    char *v0;  // [bp-0x198]
    unsigned int v1;  // [bp-0x18c]
    unsigned long long v2;  // [bp-0x188]
    char *v3;  // [bp-0x180]
    char *v4;  // [bp-0x178]
    char *v5;  // [bp-0x170]
    char *v6;  // [bp-0x168]
    char *v7;  // [bp-0x160]
    st_c0a60_0 **v8;  // [bp-0x158], Other Possible Types: char
    st_c0a60_0 *v9;  // [bp-0x150]
    st_c0a60_0 **v10;  // [bp-0x148], Other Possible Types: char
    st_c0a60_0 *v11;  // [bp-0x140]
    unsigned long v12;  // [bp-0x138]
    unsigned int v13;  // [bp-0x130]
    unsigned long long *v14;  // [bp-0x128], Other Possible Types: unsigned long long
    unsigned long long *v15;  // [bp-0x120]
    unsigned long long *v16;  // [bp-0x118]
    unsigned long v17;  // [bp-0x110]
    unsigned int v18;  // [bp-0x108]
    unsigned long long *v19;  // [bp-0x100], Other Possible Types: unsigned long long
    unsigned long long *v20;  // [bp-0xf8]
    unsigned long long *v21;  // [bp-0xf0]
    unsigned long v22;  // [bp-0xe8]
    unsigned int v23;  // [bp-0xe0]
    unsigned long long *v24;  // [bp-0xd8], Other Possible Types: unsigned long long
    unsigned long long *v25;  // [bp-0xd0]
    unsigned long long *v26;  // [bp-0xc8]
    unsigned long long v27;  // [bp-0xc0]
    unsigned int v28;  // [bp-0xb8]
    unsigned long long *v29;  // [bp-0xb0], Other Possible Types: unsigned long long
    unsigned long long *v30;  // [bp-0xa8]
    unsigned long long *v31;  // [bp-0xa0]
    st_c0a60_0 **v32;  // [bp-0x98], Other Possible Types: st_c0a60_3 **, char
    st_c0a60_0 *v33;  // [bp-0x90], Other Possible Types: st_c0a60_3 **
    st_c0a60_3 **v34;  // [bp-0x88]
    st_c0a60_3 **v35;  // [bp-0x80]
    char *v36;  // [bp-0x78], Other Possible Types: st_c0a60_0 *, st_c0a60_3 **
    st_c0a60_0 **v37;  // [bp-0x70]
    char *v38;  // [bp-0x10]
    char v39;  // [bp+0x0]

    v38 = &v39;
    v9 = &v8;
    v8 = &v9;
    if (!(a5 >> 5 & 1))
    {
        v40 = sub_c3e70(a0, a1, a2, a3, a4);
        if (v40)
            return v40;
    }
    v11 = &v10;
    v10 = &v11;
    if (a1 < 6)
    {
        return 0xffffffffffffffec;
    }
    else if ((unsigned long long)a3 >= 10)
    {
        v41 = *a2;
        v42 = a2[1];
        v43 = a2[2];
        v44 = v41 + v42 + v43 + 6;
        if ((unsigned long long)a3 < (unsigned long long)v44)
            return 0xffffffffffffffec;
        v45 = &a0[a1];
        v46 = a1 + 3 >> 2;
        v7 = a0;
        v47 = &a0[v46];
        v48 = &v47[v46];
        iter2 = &v48[v46];
        if (v45 < iter2)
            return 0xffffffffffffffec;
        v5 = v48;
        v6 = v47;
        v2 = v46;
        v4 = v45;
        v50 = a2 + 3;
        v51 = a4->field_2;
        v52 = sub_c02c0(&v27, v50, v41);
        v53 = arm64g_calculate_condition(130, v52, 120, 0);
        if (v53 & 1)
            return v52;
        v54 = v50 + v41;
        v55 = sub_c02c0(&v22, v54, v42);
        v56 = arm64g_calculate_condition(130, v55, 120, 0);
        if (v56 & 1)
            return v55;
        v57 = v54 + v42;
        v58 = sub_c02c0(&v17, v57, v43);
        v59 = arm64g_calculate_condition(130, v58, 120, 0);
        if (v59 & 1)
            return v58;
        v60 = sub_c02c0(&v12, v57 + v43, a3 - v44);
        v61 = arm64g_calculate_condition(130, v60, 120, 0);
        if (v61 & 1)
            return v60;
        v62 = a4 + 1;
        v1 = v51;
        v3 = v4 - 3;
        v0 = iter2;
        if (v4 - iter2 >= 8)
        {
            v63 = v6;
            v64 = v7;
            v65 = v5;
            if (v3 > iter2)
            {
                v66 = (char)-v51 & 63;
                v67 = iter2;
                do
                {
                    v68 = v27;
                    v69 = v28;
                    v70 = v62 + (v68 << ((char)v69 & 63) >> (v66 & 63)) * 2;
                    v71 = v69 + v70->field_0;
                    *v64 = v70->field_1;
                    v72 = v22;
                    v73 = v23;
                    v74 = v62 + (v72 << ((char)v73 & 63) >> (v66 & 63)) * 2;
                    v75 = v73 + v74->field_0;
                    *v63 = v74->field_1;
                    v76 = v17;
                    v77 = v18;
                    v78 = v62 + (v76 << ((char)v77 & 63) >> (v66 & 63)) * 2;
                    v79 = v77 + v78->field_0;
                    *v65 = v78->field_1;
                    v80 = v12;
                    v81 = v13;
                    v82 = v62 + (v80 << ((char)v81 & 63) >> (v66 & 63)) * 2;
                    v83 = v81 + v82->field_0;
                    *v67 = v82->field_1;
                    v84 = v62 + (v68 << ((char)v71 & 63) >> (v66 & 63)) * 2;
                    v85 = v71 + v84->field_0;
                    v64[1] = v84->field_1;
                    v86 = v62 + (v72 << ((char)v75 & 63) >> (v66 & 63)) * 2;
                    v87 = v75 + v86->field_0;
                    v63[1] = v86->field_1;
                    v88 = v62 + (v76 << ((char)v79 & 63) >> (v66 & 63)) * 2;
                    v89 = v79 + v88->field_0;
                    v65[1] = v88->field_1;
                    v90 = v62 + (v80 << ((char)v83 & 63) >> (v66 & 63)) * 2;
                    v91 = v83 + v90->field_0;
                    v67[1] = v90->field_1;
                    v92 = v62 + (v68 << ((char)v85 & 63) >> (v66 & 63)) * 2;
                    v93 = v85 + v92->field_0;
                    v64[2] = v92->field_1;
                    v94 = v62 + (v72 << ((char)v87 & 63) >> (v66 & 63)) * 2;
                    v95 = v87 + v94->field_0;
                    v63[2] = v94->field_1;
                    v96 = v62 + (v76 << ((char)v89 & 63) >> (v66 & 63)) * 2;
                    v97 = v89 + v96->field_0;
                    v65[2] = v96->field_1;
                    v98 = v62 + (v80 << ((char)v91 & 63) >> (v66 & 63)) * 2;
                    v99 = v91 + v98->field_0;
                    v67[2] = v98->field_1;
                    v100 = v62 + (v68 << ((char)v93 & 63) >> (v66 & 63)) * 2;
                    v28 = v93 + v100->field_0;
                    iter = v64 + 4;
                    v64[3] = v100->field_1;
                    v102 = v62 + (v72 << ((char)v95 & 63) >> (v66 & 63)) * 2;
                    v23 = v95 + v102->field_0;
                    node = v63 + 4;
                    v63[3] = v102->field_1;
                    v104 = v62 + (v76 << ((char)v97 & 63) >> (v66 & 63)) * 2;
                    v18 = v97 + v104->field_0;
                    iter1 = v65 + 4;
                    v65[3] = v104->field_1;
                    v106 = v62 + (v80 << ((char)v99 & 63) >> (v66 & 63)) * 2;
                    v13 = v99 + v106->field_0;
                    iter2 = v67 + 4;
                    v67[3] = v106->field_1;
                    v107 = (unsigned int)sub_c4538(&v27);
                    v108 = (unsigned int)sub_c4538(&v22);
                    v109 = (unsigned int)sub_c4538(&v17);
                    v110 = (unsigned int)sub_c4538(&v12);
                } while (v3 > iter2 && (v67 = iter2, v65 = iter1, v63 = node, v64 = iter, !v108 && !v107 && !v109 && !v110));
            }
            else
            {
                iter = v64;
                node = v63;
                iter1 = v65;
            }
        }
        else
        {
            node = v6;
            iter = v7;
            iter1 = v5;
        }
        v111 = v6;
        if (v111 < iter)
            return 0xffffffffffffffec;
        v112 = v5;
        if (v112 < node)
        {
            return 0xffffffffffffffec;
        }
        else if (v0 >= iter1)
        {
            v33 = &v32;
            v32 = &v33;
            if (v111 - iter >= 4)
            {
                v34 = &v35;
                v35 = &v34;
                i = v28;
                if (64 >= i)
                {
                    v114 = (char)-v1 & 63;
                    do
                    {
                        v115 = v29;
                        if (v31 > v115)
                        {
                            v116 = v30;
                            if (v115 == v116)
                                goto LABEL_c1088;
                            v117 = i >> 3;
                            v118 = (char *)v115 - v117;
                            v119 = v118 >= v116;
                            if (v116 <= v118)
                                v120 = v117 & 0xffffffff;
                            else
                                v120 = v115 - v116 & 0xffffffff;
                            v29 = (char *)v115 - v120;
                            v121 = i - (unsigned int)v120 * 8;
                            v28 = v121;
                            v122 = *v29;
                            v27 = v122;
                        }
                        else
                        {
                            v36 = &v37;
                            v37 = &v36;
                            v29 = (char *)v115 - (i >> 3);
                            v121 = i & 7;
                            v28 = v121;
                            v122 = *v29;
                            v27 = v122;
                            v119 = 1;
                        }
                        if (v111 - 3 <= iter || !v119)
                            goto LABEL_c1088;
                        v123 = v62 + (v122 << ((char)v121 & 63) >> (v114 & 63)) * 2;
                        v124 = v121 + v123->field_0;
                        *iter = v123->field_1;
                        v125 = v62 + (v27 << ((char)v124 & 63) >> (v114 & 63)) * 2;
                        v28 = v124 + v125->field_0;
                        iter[1] = v125->field_1;
                        v126 = v28;
                        v127 = v62 + (v27 << ((char)v126 & 63) >> (v114 & 63)) * 2;
                        v28 = v126 + v127->field_0;
                        iter[2] = v127->field_1;
                        v128 = v28;
                        v129 = v62 + (v27 << ((char)v128 & 63) >> (v114 & 63)) * 2;
                        v28 = v128 + v129->field_0;
                        v130 = iter + 4;
                        iter[3] = v129->field_1;
                        v34 = &v35;
                        v35 = &v34;
                        i = v28;
                        iter = v130;
                    } while (i <= 64);
                }
                else
                {
                    v130 = iter;
                }
                v29 = &g_cc0ea0;
                iter = v130;
            }
            else
            {
                v35 = &v34;
                v34 = &v35;
                v131 = v28;
                if (65 > (unsigned int)v131)
                {
                    v132 = v29;
                    if (v31 > v132)
                    {
                        v133 = v30;
                        if (v132 == v133)
                            goto LABEL_c1088;
                        v134 = v131 >> 3;
                        if ((char *)v132 - v134 < v133)
                            v135 = v132 - v133 & 0xffffffff;
                        else
                            v135 = v134 & 0xffffffff;
                        v136 = (char *)v132 - v135;
                        v29 = v136;
                        v137 = (unsigned int)v131 - (unsigned int)v135 * 8;
                    }
                    else
                    {
                        v37 = &v36;
                        v36 = &v37;
                        v136 = (char *)v132 - (v131 >> 3);
                        v29 = v136;
                        v137 = (unsigned int)v131 & 7;
                    }
                    v28 = v137;
                    v27 = *v136;
                }
                else
                {
                    v29 = &g_cc0ea0;
                }
            }
LABEL_c1088:
            if (v111 > iter)
            {
                j = &v7[v2] - iter;
                do
                {
                    v139 = j;
                    v140 = v28;
                    v141 = v62 + (v27 << ((char)v140 & 63) >> ((char)-v1 & 63)) * 2;
                    v28 = v140 + v141->field_0;
                    *iter = v141->field_1;
                    iter += 1;
                    j = v139 - 1;
                } while (j);
            }
            v33 = &v32;
            v32 = &v33;
            if (v112 - node >= 4)
            {
                v34 = &v35;
                v35 = &v34;
                k = v23;
                if (64 >= k)
                {
                    v144 = (char)-v1 & 63;
                    do
                    {
                        v145 = v24;
                        if (v26 > v145)
                        {
                            v146 = v25;
                            if (v145 == v146)
                                goto LABEL_c12e0;
                            v147 = k >> 3;
                            v148 = (char *)v145 - v147;
                            v149 = v148 >= v146;
                            if (v146 <= v148)
                                v150 = v147 & 0xffffffff;
                            else
                                v150 = v145 - v146 & 0xffffffff;
                            v24 = (char *)v145 - v150;
                            v151 = k - (unsigned int)v150 * 8;
                            v23 = v151;
                            v152 = *v24;
                            v22 = v152;
                        }
                        else
                        {
                            v36 = &v37;
                            v37 = &v36;
                            v24 = (char *)v145 - (k >> 3);
                            v151 = k & 7;
                            v23 = v151;
                            v152 = *v24;
                            v22 = v152;
                            v149 = 1;
                        }
                        if (v112 - 3 <= node || !v149)
                            goto LABEL_c12e0;
                        v153 = v62 + (v152 << ((char)v151 & 63) >> (v144 & 63)) * 2;
                        v154 = v151 + v153->field_0;
                        *node = v153->field_1;
                        v155 = v62 + (v22 << ((char)v154 & 63) >> (v144 & 63)) * 2;
                        v23 = v154 + v155->field_0;
                        node[1] = v155->field_1;
                        v156 = v23;
                        v157 = v62 + (v22 << ((char)v156 & 63) >> (v144 & 63)) * 2;
                        v23 = v156 + v157->field_0;
                        node[2] = v157->field_1;
                        v158 = v23;
                        v159 = v62 + (v22 << ((char)v158 & 63) >> (v144 & 63)) * 2;
                        v23 = v158 + v159->field_0;
                        v160 = node + 4;
                        node[3] = v159->field_1;
                        v34 = &v35;
                        v35 = &v34;
                        k = v23;
                        node = v160;
                    } while (k <= 64);
                }
                else
                {
                    v160 = node;
                }
                v24 = &g_cc0ea0;
                node = v160;
            }
            else
            {
                v35 = &v34;
                v34 = &v35;
                v161 = v23;
                if (65 > (unsigned int)v161)
                {
                    v162 = v24;
                    if (v26 > v162)
                    {
                        v163 = v25;
                        if (v162 == v163)
                            goto LABEL_c12e0;
                        v164 = v161 >> 3;
                        if ((char *)v162 - v164 < v163)
                            v165 = v162 - v163 & 0xffffffff;
                        else
                            v165 = v164 & 0xffffffff;
                        v166 = (char *)v162 - v165;
                        v24 = v166;
                        v167 = (unsigned int)v161 - (unsigned int)v165 * 8;
                    }
                    else
                    {
                        v37 = &v36;
                        v36 = &v37;
                        v166 = (char *)v162 - (v161 >> 3);
                        v24 = v166;
                        v167 = (unsigned int)v161 & 7;
                    }
                    v23 = v167;
                    v22 = *v166;
                }
                else
                {
                    v24 = &g_cc0ea0;
                }
            }
LABEL_c12e0:
            if (v112 > node)
            {
                do
                {
                    v168 = v23;
                    v169 = v62 + (v22 << ((char)v168 & 63) >> ((char)-v1 & 63)) * 2;
                    v23 = v168 + v169->field_0;
                    *node = v169->field_1;
                    node += 1;
                } while (node < v112);
            }
            v33 = &v32;
            v32 = &v33;
            if (v0 - iter1 >= 4)
            {
                v34 = &v35;
                v35 = &v34;
                m = v18;
                if (64 >= m)
                {
                    v171 = (char)-v1 & 63;
                    do
                    {
                        v172 = v19;
                        if (v21 > v172)
                        {
                            v173 = v20;
                            if (v172 == v173)
                                goto LABEL_c1508;
                            v174 = m >> 3;
                            v175 = (char *)v172 - v174;
                            v176 = v175 >= v173;
                            if (v173 <= v175)
                                v177 = v174 & 0xffffffff;
                            else
                                v177 = v172 - v173 & 0xffffffff;
                            v19 = (char *)v172 - v177;
                            v178 = m - (unsigned int)v177 * 8;
                            v18 = v178;
                            v179 = *v19;
                            v17 = v179;
                        }
                        else
                        {
                            v36 = &v37;
                            v37 = &v36;
                            v19 = (char *)v172 - (m >> 3);
                            v178 = m & 7;
                            v18 = v178;
                            v179 = *v19;
                            v17 = v179;
                            v176 = 1;
                        }
                        if (v0 - 3 <= iter1 || !v176)
                            goto LABEL_c1508;
                        v180 = v62 + (v179 << ((char)v178 & 63) >> (v171 & 63)) * 2;
                        v181 = v178 + v180->field_0;
                        *iter1 = v180->field_1;
                        v182 = v62 + (v17 << ((char)v181 & 63) >> (v171 & 63)) * 2;
                        v18 = v181 + v182->field_0;
                        iter1[1] = v182->field_1;
                        v183 = v18;
                        v184 = v62 + (v17 << ((char)v183 & 63) >> (v171 & 63)) * 2;
                        v18 = v183 + v184->field_0;
                        iter1[2] = v184->field_1;
                        v185 = v18;
                        v186 = v62 + (v17 << ((char)v185 & 63) >> (v171 & 63)) * 2;
                        v18 = v185 + v186->field_0;
                        v187 = iter1 + 4;
                        iter1[3] = v186->field_1;
                        v34 = &v35;
                        v35 = &v34;
                        m = v18;
                        iter1 = v187;
                    } while (m <= 64);
                }
                else
                {
                    v187 = iter1;
                }
                v19 = &g_cc0ea0;
                iter1 = v187;
            }
            else
            {
                v37 = &v36;
                v36 = &v37;
                v188 = v18;
                if (65 > (unsigned int)v188)
                {
                    v189 = v19;
                    if (v21 > v189)
                    {
                        v190 = v20;
                        if (v189 == v190)
                            goto LABEL_c1508;
                        v191 = v188 >> 3;
                        if ((char *)v189 - v191 < v190)
                            v192 = v189 - v190 & 0xffffffff;
                        else
                            v192 = v191 & 0xffffffff;
                        v193 = (char *)v189 - v192;
                        v19 = v193;
                        v194 = (unsigned int)v188 - (unsigned int)v192 * 8;
                    }
                    else
                    {
                        v193 = (char *)v189 - (v188 >> 3);
                        v19 = v193;
                        v194 = (unsigned int)v188 & 7;
                    }
                    v18 = v194;
                    v17 = *v193;
                }
                else
                {
                    v19 = &g_cc0ea0;
                }
            }
LABEL_c1508:
            if (v0 > iter1)
            {
                do
                {
                    v195 = v18;
                    v196 = v62 + (v17 << ((char)v195 & 63) >> ((char)-v1 & 63)) * 2;
                    v18 = v195 + v196->field_0;
                    *iter1 = v196->field_1;
                    iter1 += 1;
                } while (iter1 < v0);
            }
            v33 = &v32;
            v32 = &v33;
            if (v4 - iter2 >= 4)
            {
                v34 = &v35;
                v35 = &v34;
                i0 = v13;
                if (64 >= i0)
                {
                    v198 = (char)-v1 & 63;
                    do
                    {
                        v199 = v14;
                        if (v16 > v199)
                        {
                            v200 = v15;
                            if (v199 == v200)
                                goto LABEL_c1730;
                            v201 = i0 >> 3;
                            v202 = (char *)v199 - v201;
                            v203 = v202 >= v200;
                            if (v200 <= v202)
                                v204 = v201 & 0xffffffff;
                            else
                                v204 = v199 - v200 & 0xffffffff;
                            v14 = (char *)v199 - v204;
                            v205 = i0 - (unsigned int)v204 * 8;
                            v13 = v205;
                            v206 = *v14;
                            v12 = v206;
                        }
                        else
                        {
                            v36 = &v37;
                            v37 = &v36;
                            v14 = (char *)v199 - (i0 >> 3);
                            v205 = i0 & 7;
                            v13 = v205;
                            v206 = *v14;
                            v12 = v206;
                            v203 = 1;
                        }
                        if (v3 <= iter2 || !v203)
                            goto LABEL_c1730;
                        v207 = v62 + (v206 << ((char)v205 & 63) >> (v198 & 63)) * 2;
                        v208 = v205 + v207->field_0;
                        *iter2 = v207->field_1;
                        v209 = v62 + (v12 << ((char)v208 & 63) >> (v198 & 63)) * 2;
                        v13 = v208 + v209->field_0;
                        iter2[1] = v209->field_1;
                        v210 = v13;
                        v211 = v62 + (v12 << ((char)v210 & 63) >> (v198 & 63)) * 2;
                        v13 = v210 + v211->field_0;
                        iter2[2] = v211->field_1;
                        v212 = v13;
                        v213 = v62 + (v12 << ((char)v212 & 63) >> (v198 & 63)) * 2;
                        v13 = v212 + v213->field_0;
                        v214 = iter2 + 4;
                        iter2[3] = v213->field_1;
                        v34 = &v35;
                        v35 = &v34;
                        i0 = v13;
                        iter2 = v214;
                    } while (i0 <= 64);
                }
                else
                {
                    v214 = iter2;
                }
                v14 = &g_cc0ea0;
                iter2 = v214;
            }
            else
            {
                v37 = &v36;
                v36 = &v37;
                v215 = v13;
                if (65 > (unsigned int)v215)
                {
                    v216 = v14;
                    if (v16 > v216)
                    {
                        v217 = v15;
                        if (v216 == v217)
                            goto LABEL_c1730;
                        v218 = v215 >> 3;
                        if ((char *)v216 - v218 < v217)
                            v219 = v216 - v217 & 0xffffffff;
                        else
                            v219 = v218 & 0xffffffff;
                        v220 = (char *)v216 - v219;
                        v14 = v220;
                        v221 = (unsigned int)v215 - (unsigned int)v219 * 8;
                    }
                    else
                    {
                        v220 = (char *)v216 - (v215 >> 3);
                        v14 = v220;
                        v221 = (unsigned int)v215 & 7;
                    }
                    v13 = v221;
                    v12 = *v220;
                }
                else
                {
                    v14 = &g_cc0ea0;
                }
            }
LABEL_c1730:
            if (v4 > iter2)
            {
                i1 = &v7[a1] - iter2;
                do
                {
                    v223 = i1;
                    v224 = v13;
                    v225 = v62 + (v12 << ((char)v224 & 63) >> ((char)-v1 & 63)) * 2;
                    v13 = v224 + v225->field_0;
                    *iter2 = v225->field_1;
                    iter2 += 1;
                    i1 = v223 - 1;
                } while (i1);
            }
            v227 = sub_bfed0(&v27);
            v228 = sub_bfed0(&v22);
            v229 = sub_bfed0(&v17);
            if (v228 & v227 & v229 & sub_bfed0(&v12))
                return a1;
            return 0xffffffffffffffec;
        }
        else
        {
            return 0xffffffffffffffec;
        }
    }
    else
    {
        return 0xffffffffffffffec;
    }
}
