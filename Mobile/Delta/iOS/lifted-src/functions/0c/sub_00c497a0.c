/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc497a0..0xc4a314 (2932 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c497a0_0 {
    char padding_0[8];
    void* field_8;
    unsigned long long field_10;
    unsigned long long field_18;
    char padding_20[8];
    unsigned long long field_28;
} st_c497a0_0;


void sub_c497a0(st_c497a0_0 *a0, unsigned long a1, unsigned long long a2, unsigned long long *a3, unsigned long a4, unsigned long long a5, unsigned long a6)
{
    unsigned long long v2;  // x9
    void* v3;  // x8
    unsigned int v12;  // w11
    unsigned long long v102;  // x15
    unsigned long long v103;  // 4125
    unsigned long long v104;  // 4127
    unsigned long long v105;  // x12
    __m128i v106;  // q1
    __m128i v107;  // q0
    unsigned long v109;  // x12
    unsigned long long v110;  // x12
    unsigned long long v111;  // 4128
    unsigned long long v13;  // w11
    unsigned long long v112;  // 4130
    unsigned long long v113;  // x12
    unsigned long long v114;  // x12
    unsigned long long v115;  // x2
    unsigned long long v116;  // x13
    unsigned long long v117;  // x12
    unsigned long long v118;  // w12
    unsigned long long v119;  // w12
    unsigned int v120;  // w12
    unsigned long long v121;  // w12
    unsigned int v14;  // w11
    unsigned int v122;  // w12
    unsigned long long v123;  // w12
    unsigned int v124;  // w12
    unsigned long long v125;  // w12
    unsigned int v126;  // w12
    unsigned long long v127;  // w12
    unsigned int v128;  // w12
    unsigned long long v129;  // w12
    unsigned int v130;  // w12
    unsigned long long v131;  // w12
    unsigned long long v15;  // w11
    unsigned int v132;  // w12
    unsigned long long v133;  // w12
    unsigned int v134;  // w12
    unsigned long long v135;  // w12
    unsigned int v136;  // w12
    unsigned long long v137;  // w12
    unsigned int v138;  // w12
    unsigned long long v139;  // w12
    unsigned int v140;  // w12
    unsigned long long v141;  // w12
    unsigned int v16;  // w11
    unsigned int v142;  // w12
    void* v143;  // x14
    unsigned long long v144;  // x16
    void* iter;  // x15
    unsigned long long v146;  // x16
    unsigned long v148;  // x15
    unsigned long long v149;  // x15
    unsigned long long v150;  // 4128
    unsigned long long v151;  // 4130
    unsigned long long v17;  // w11
    unsigned long long v152;  // x14
    unsigned long long v153;  // x14
    unsigned long v154;  // x16
    void* node;  // x15
    __m128i v156;  // q3
    __m128i v157;  // q2
    __m128i v158;  // q1
    __m128i v159;  // q0
    unsigned long v161;  // x14
    unsigned int v18;  // w11
    unsigned long long v162;  // x14
    unsigned long v164;  // x14
    unsigned long v166;  // x14
    void* v167;  // x14
    unsigned long long v169;  // x15
    unsigned long long v170;  // 4125
    unsigned long long v171;  // 4127
    unsigned long long v19;  // w11
    unsigned long long v172;  // x14
    void* v173;  // x16
    unsigned long v175;  // x17
    unsigned long long v176;  // x17
    unsigned long long v177;  // 4125
    unsigned long long v178;  // 4127
    unsigned long long v179;  // x14
    unsigned long v180;  // d0
    unsigned long v181;  // x15
    unsigned int v20;  // w11
    unsigned long long v182;  // 4128
    unsigned long long v183;  // 4130
    unsigned long v184;  // x15
    unsigned long long v185;  // x15
    unsigned long long v186;  // x1
    __m128i v187;  // q0
    unsigned long v189;  // x11
    unsigned long long v190;  // x11
    unsigned long long v21;  // w11
    unsigned long v192;  // x11
    unsigned long long v193;  // 4128
    unsigned long long v194;  // 4130
    unsigned long long v195;  // x11
    unsigned long long v196;  // x11
    unsigned long v198;  // x11
    unsigned long long v199;  // x11
    unsigned long v200;  // cc_dep1
    unsigned long long v201;  // 4143
    unsigned long long v4;  // x9
    unsigned int v22;  // w11
    unsigned long long v202;  // 4145
    unsigned long long v203;  // x11
    unsigned long long v204;  // x11
    unsigned long long v205;  // 4108
    unsigned long long v206;  // 4108
    unsigned long long v207;  // x9
    unsigned long long v208;  // x14
    unsigned long long v209;  // 4113
    unsigned long long v23;  // w11
    unsigned int v24;  // w11
    unsigned int v27;  // w11
    unsigned long long v28;  // w11
    unsigned long long v29;  // x12
    unsigned long long v30;  // w11
    unsigned int v31;  // w11
    unsigned long long v5;  // w10
    unsigned long long v32;  // w11
    unsigned int v33;  // w11
    unsigned long long v34;  // w11
    unsigned int v35;  // w11
    unsigned long long v36;  // w11
    unsigned int v37;  // w11
    unsigned long long v38;  // w11
    unsigned int v39;  // w11
    unsigned long long v40;  // w11
    unsigned int v41;  // w11
    unsigned long long v6;  // x10
    unsigned long long v42;  // w11
    unsigned int v43;  // w11
    unsigned long long v44;  // w11
    unsigned int v45;  // w11
    unsigned long long v46;  // w11
    unsigned int v47;  // w11
    unsigned long long v48;  // w11
    unsigned int v49;  // w11
    unsigned long long v50;  // w11
    unsigned int v51;  // w11
    unsigned long long v7;  // w11
    unsigned long long v52;  // w11
    unsigned int v53;  // w11
    unsigned long long v54;  // w11
    unsigned int v55;  // w11
    unsigned long long v56;  // w11
    unsigned int v57;  // w11
    unsigned long long v58;  // x1
    unsigned long long v59;  // x11
    unsigned long v60;  // cc_dep2
    unsigned long v61;  // cc_dep1
    unsigned int v8;  // w11
    void* iter1;  // x12
    unsigned long long v63;  // x13
    unsigned long long v64;  // x13
    unsigned long long v65;  // w14
    unsigned long long v66;  // 4112
    unsigned long long v67;  // 4102
    unsigned long long v68;  // 4112
    unsigned long long v69;  // 4102
    __m128i v70;  // q1
    __m128i v71;  // q0
    unsigned long long v9;  // w11
    unsigned long v73;  // x13
    unsigned long long v74;  // x13
    unsigned long long v75;  // 4128
    unsigned long long v76;  // 4130
    unsigned long long v77;  // x12
    unsigned long long v78;  // x12
    void* v79;  // x13
    unsigned long long v80;  // x15
    void* iter2;  // x14
    unsigned int v10;  // w11
    __m128i v82;  // q0
    __m128i v83;  // q2
    __m128i v84;  // q1
    unsigned long v86;  // x12
    unsigned long long v87;  // x12
    unsigned long long v88;  // 4125
    unsigned long long v89;  // 4127
    unsigned long long v90;  // x12
    unsigned long long v11;  // w11
    unsigned long long v92;  // x13
    unsigned long long v93;  // 4140
    unsigned long long v94;  // 4142
    unsigned long long v95;  // x13
    unsigned long long v96;  // x13
    void* v97;  // x12
    __m128i v98;  // q2
    __m128i v99;  // q1
    unsigned long v101;  // x15
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = *a3;
    if (a2 >= v2 && a2 - v2 > 59)
    {
        v3 = a1 + v2;
        v4 = v2 + 60;
        *a3 = v4;
        if ((short)v3[58] != 2656)
        {
            a0->field_8 = "Invalid archive terminator";
            a0->field_10 = 26;
            *(unsigned long long *)a0->padding_0 = 2;
            return;
        }
        if ((char)v3[48] != 32)
        {
            v5 = (char)v3[48];
            if (v5 == 32)
            {
                v6 = 0;
                goto LABEL_c49830;
            }
            v6 = v5 - 48;
            if (9 >= (unsigned int)v6)
            {
                v7 = (char)v3[49];
                if (v7 == 32)
                {
LABEL_c49830:
                    v27 = *(char *)v3;
                    if (v27 != 47 || 10 <= (char)v3[1] - 48)
                    {
                        if ((*(short *)v3 | (char)v3[2] * 0x10000) == 3092771 && 9 >= (char)v3[3] - 48)
                        {
                            v118 = (char)v3[3];
                            if (v118 == 32)
                            {
                                v115 = 0;
                            }
                            else
                            {
                                v115 = v118 - 48;
                                if (9 < (unsigned int)v115)
                                {
                                    a0->field_8 = "Invalid archive extended name length";
                                    a0->field_10 = 36;
                                    *(unsigned long long *)a0->padding_0 = 2;
                                    return;
                                }
                                v119 = (char)v3[4];
                                if (v119 != 32)
                                {
                                    v120 = v119 - 48;
                                    if (9 < v120)
                                    {
                                        a0->field_8 = "Invalid archive extended name length";
                                        a0->field_10 = 36;
                                        *(unsigned long long *)a0->padding_0 = 2;
                                        return;
                                    }
                                    v115 = (unsigned int)v115 * 10 + v120;
                                    v121 = (char)v3[5];
                                    if (v121 != 32)
                                    {
                                        v122 = v121 - 48;
                                        if (9 < v122)
                                        {
                                            a0->field_8 = "Invalid archive extended name length";
                                            a0->field_10 = 36;
                                            *(unsigned long long *)a0->padding_0 = 2;
                                            return;
                                        }
                                        v115 = 10 * v115 + v122;
                                        v123 = (char)v3[6];
                                        if (v123 != 32)
                                        {
                                            v124 = v123 - 48;
                                            if (9 < v124)
                                            {
                                                a0->field_8 = "Invalid archive extended name length";
                                                a0->field_10 = 36;
                                                *(unsigned long long *)a0->padding_0 = 2;
                                                return;
                                            }
                                            v115 = 10 * v115 + v124;
                                            v125 = (char)v3[7];
                                            if (v125 != 32)
                                            {
                                                v126 = v125 - 48;
                                                if (9 < v126)
                                                {
                                                    a0->field_8 = "Invalid archive extended name length";
                                                    a0->field_10 = 36;
                                                    *(unsigned long long *)a0->padding_0 = 2;
                                                    return;
                                                }
                                                v115 = 10 * v115 + v126;
                                                v127 = (char)v3[8];
                                                if (v127 != 32)
                                                {
                                                    v128 = v127 - 48;
                                                    if (9 < v128)
                                                    {
                                                        a0->field_8 = "Invalid archive extended name length";
                                                        a0->field_10 = 36;
                                                        *(unsigned long long *)a0->padding_0 = 2;
                                                        return;
                                                    }
                                                    v115 = 10 * v115 + v128;
                                                    v129 = (char)v3[9];
                                                    if (v129 != 32)
                                                    {
                                                        v130 = v129 - 48;
                                                        if (9 < v130)
                                                        {
                                                            a0->field_8 = "Invalid archive extended name length";
                                                            a0->field_10 = 36;
                                                            *(unsigned long long *)a0->padding_0 = 2;
                                                            return;
                                                        }
                                                        v115 = 10 * v115 + v130;
                                                        v131 = (char)v3[10];
                                                        if (v131 != 32)
                                                        {
                                                            v132 = v131 - 48;
                                                            if (9 < v132)
                                                            {
                                                                a0->field_8 = "Invalid archive extended name length";
                                                                a0->field_10 = 36;
                                                                *(unsigned long long *)a0->padding_0 = 2;
                                                                return;
                                                            }
                                                            v115 = 10 * v115 + v132;
                                                            v133 = (char)v3[11];
                                                            if (v133 != 32)
                                                            {
                                                                v134 = v133 - 48;
                                                                if (9 < v134)
                                                                {
                                                                    a0->field_8 = "Invalid archive extended name length";
                                                                    a0->field_10 = 36;
                                                                    *(unsigned long long *)a0->padding_0 = 2;
                                                                    return;
                                                                }
                                                                v115 = 10 * v115 + v134;
                                                                v135 = (char)v3[12];
                                                                if (v135 != 32)
                                                                {
                                                                    v136 = v135 - 48;
                                                                    if (9 < v136)
                                                                    {
                                                                        a0->field_8 = "Invalid archive extended name length";
                                                                        a0->field_10 = 36;
                                                                        *(unsigned long long *)a0->padding_0 = 2;
                                                                        return;
                                                                    }
                                                                    v115 = 10 * v115 + v136;
                                                                    v137 = (char)v3[13];
                                                                    if (v137 != 32)
                                                                    {
                                                                        v138 = v137 - 48;
                                                                        if (9 < v138)
                                                                        {
                                                                            a0->field_8 = "Invalid archive extended name length";
                                                                            a0->field_10 = 36;
                                                                            *(unsigned long long *)a0->padding_0 = 2;
                                                                            return;
                                                                        }
                                                                        v115 = 10 * v115 + v138;
                                                                        v139 = (char)v3[14];
                                                                        if (v139 != 32)
                                                                        {
                                                                            v140 = v139 - 48;
                                                                            if (9 < v140)
                                                                            {
                                                                                a0->field_8 = "Invalid archive extended name length";
                                                                                a0->field_10 = 36;
                                                                                *(unsigned long long *)a0->padding_0 = 2;
                                                                                return;
                                                                            }
                                                                            v115 = 10 * v115 + v140;
                                                                            v141 = (char)v3[15];
                                                                            if (v141 != 32)
                                                                            {
                                                                                v142 = v141 - 48;
                                                                                if (9 < v142)
                                                                                {
                                                                                    a0->field_8 = "Invalid archive extended name length";
                                                                                    a0->field_10 = 36;
                                                                                    *(unsigned long long *)a0->padding_0 = 2;
                                                                                    return;
                                                                                }
                                                                                v115 = 10 * v115 + v142;
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
                                    }
                                }
                            }
                            v117 = v6 - v115;
                            if (v6 < v115)
                            {
                                a0->field_8 = "Invalid archive extended name length";
                                a0->field_10 = 36;
                                *(unsigned long long *)a0->padding_0 = 2;
                                return;
                            }
                            if (v115)
                            {
                                if (a2 - v4 < v115)
                                {
                                    a0->field_8 = "Invalid archive extended name length";
                                    a0->field_10 = 36;
                                    *(unsigned long long *)a0->padding_0 = 2;
                                    return;
                                }
                                v59 = a1 + v4;
                                v116 = v115 + v4;
                                v143 = v59 + v115;
                                if (15 >= v115)
                                {
                                    v144 = v115 & 3;
                                    iter = v59;
                                    if (v115 & 3)
                                    {
                                        iter = v59;
                                        do
                                        {
                                            v146 = v144;
                                            if (!*(char *)iter)
                                                goto LABEL_c4a2c8;
                                        } while ((iter += 1, v144 = v146 - 1, v146 != 1));
                                    }
                                    if (v115 >= 4)
                                    {
                                        do
                                        {
                                            if (!*(char *)iter)
                                                goto LABEL_c4a2c8;
                                            if (!(char)iter[1])
                                            {
                                                iter += 1;
                                                goto LABEL_c4a2c8;
                                            }
                                            else if (!(char)iter[2])
                                            {
                                                iter += 2;
                                                goto LABEL_c4a2c8;
                                            }
                                            else if (!(char)iter[3])
                                            {
                                                iter += 3;
                                                goto LABEL_c4a2c8;
                                            }
                                        } while ((iter += 4, iter != v143));
                                    }
                                }
                                else
                                {
                                    v148 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi16(_mm_cmpeq_epi8(*(int128_t *)v59, _mm_setzero_si128()), 4), _mm_srli_epi16(_mm_cmpeq_epi8(*(int128_t *)v59, _mm_setzero_si128()), 4)));
                                    v149 = v148 & 0x8888888888888888;
                                    if (v148 & 0x8888888888888888)
                                    {
                                        v150 = ((((((v149 & 0xaaaaaaaaaaaaaaaa) >> 1 | v149 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v149 & 0xaaaaaaaaaaaaaaaa) >> 1 | v149 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v149 & 0xaaaaaaaaaaaaaaaa) >> 1 | v149 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v149 & 0xaaaaaaaaaaaaaaaa) >> 1 | v149 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                        v151 = (((((((v149 & 0xaaaaaaaaaaaaaaaa) >> 1 | v149 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v149 & 0xaaaaaaaaaaaaaaaa) >> 1 | v149 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v149 & 0xaaaaaaaaaaaaaaaa) >> 1 | v149 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v149 & 0xaaaaaaaaaaaaaaaa) >> 1 | v149 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                        v152 = ((((v151 | v150) & 0xffff0000ffff0000) >> 16 | (v151 | v150) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v151 | v150) & 0xffff0000ffff0000) >> 16 | (v151 | v150) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                        if (!v152)
                                            v153 = 64;
                                        else
                                            v153 = Clz(v152);
                                        iter = v59 + (v153 >> 2);
                                        goto LABEL_c4a2c8;
                                    }
                                    else
                                    {
                                        v154 = 16 - (v59 & 15);
                                        node = v59 + v154;
                                        if (v115 >= 64 && (long long)(v115 - 64) >= (long long)v154)
                                        {
                                            while (1)
                                            {
                                                v156 = _mm_cmpeq_epi8(*(int128_t *)node, _mm_setzero_si128());
                                                v157 = _mm_cmpeq_epi8((int128_t)node[16], _mm_setzero_si128());
                                                v158 = _mm_cmpeq_epi8((int128_t)node[32], _mm_setzero_si128());
                                                v159 = _mm_cmpeq_epi8((int128_t)node[48], _mm_setzero_si128());
                                                if (_mm_cvtsi128_si64(_mm_max_epu8(CatEvenLanesV(_mm_or_si128(_mm_or_si128(v157, v156), _mm_or_si128(v158, v159)), _mm_or_si128(_mm_or_si128(v157, v156), _mm_or_si128(v158, v159))), CatOddLanesV(_mm_or_si128(_mm_or_si128(v157, v156), _mm_or_si128(v158, v159)), _mm_or_si128(_mm_or_si128(v157, v156), _mm_or_si128(v158, v159))))))
                                                    break;
                                                node += 64;
                                                if (node > v143 - 64)
                                                    goto LABEL_c4a1b8;
                                            }
                                            v161 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi16(v156, 4), _mm_srli_epi16(v156, 4)));
                                            v162 = v161 & 0x8888888888888888;
                                            if (!(v161 & 0x8888888888888888))
                                            {
                                                v164 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi16(v157, 4), _mm_srli_epi16(v157, 4)));
                                                v162 = v164 & 0x8888888888888888;
                                                if (v164 & 0x8888888888888888)
                                                {
                                                    node += 16;
                                                    goto LABEL_c4a2bc;
                                                }
                                                v166 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi16(v158, 4), _mm_srli_epi16(v158, 4)));
                                                v162 = v166 & 0x8888888888888888;
                                                if (v166 & 0x8888888888888888)
                                                {
                                                    node += 32;
                                                    goto LABEL_c4a2bc;
                                                }
                                                else
                                                {
                                                    v167 = node + 48;
                                                    v169 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi16(v159, 4), _mm_srli_epi16(v159, 4))) & 0x8888888888888888;
                                                }
LABEL_c4a208:
                                                v182 = ((((((v169 & 0xaaaaaaaaaaaaaaaa) >> 1 | v169 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v169 & 0xaaaaaaaaaaaaaaaa) >> 1 | v169 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v169 & 0xaaaaaaaaaaaaaaaa) >> 1 | v169 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v169 & 0xaaaaaaaaaaaaaaaa) >> 1 | v169 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                                v183 = (((((((v169 & 0xaaaaaaaaaaaaaaaa) >> 1 | v169 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v169 & 0xaaaaaaaaaaaaaaaa) >> 1 | v169 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v169 & 0xaaaaaaaaaaaaaaaa) >> 1 | v169 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v169 & 0xaaaaaaaaaaaaaaaa) >> 1 | v169 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                                v184 = ((((v183 | v182) & 0xffff0000ffff0000) >> 16 | (v183 | v182) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v183 | v182) & 0xffff0000ffff0000) >> 16 | (v183 | v182) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                                if (!v184)
                                                    v185 = 64;
                                                else
                                                    v185 = Clz(v184);
                                                iter = v167 + (v185 >> 2);
                                            }
                                            else
                                            {
LABEL_c4a2bc:
                                                v170 = ((((((v162 & 0xaaaaaaaaaaaaaaaa) >> 1 | v162 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v162 & 0xaaaaaaaaaaaaaaaa) >> 1 | v162 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v162 & 0xaaaaaaaaaaaaaaaa) >> 1 | v162 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v162 & 0xaaaaaaaaaaaaaaaa) >> 1 | v162 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                                v171 = (((((((v162 & 0xaaaaaaaaaaaaaaaa) >> 1 | v162 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v162 & 0xaaaaaaaaaaaaaaaa) >> 1 | v162 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v162 & 0xaaaaaaaaaaaaaaaa) >> 1 | v162 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v162 & 0xaaaaaaaaaaaaaaaa) >> 1 | v162 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                                v172 = ((((v171 | v170) & 0xffff0000ffff0000) >> 16 | (v171 | v170) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v171 | v170) & 0xffff0000ffff0000) >> 16 | (v171 | v170) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
LABEL_c4a2c0:
                                                if (!v172)
                                                    v179 = 64;
                                                else
                                                    v179 = Clz(v172);
                                                iter = node + (v179 >> 2);
                                            }
LABEL_c4a2c8:
                                            v186 = iter - v59;
                                            if (v115 < v186)
                                            {
                                                sub_c73bb0(0);
                                                sub_c73c94(v115);
                                            }
                                            v115 = v186;
                                            goto LABEL_c49b5c;
                                        }
                                        else
                                        {
LABEL_c4a1b8:
                                            v173 = v143 - 16;
                                            if (v173 >= node)
                                            {
                                                do
                                                {
                                                    v175 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi16(_mm_cmpeq_epi8(*(int128_t *)node, _mm_setzero_si128()), 4), _mm_srli_epi16(_mm_cmpeq_epi8(*(int128_t *)node, _mm_setzero_si128()), 4)));
                                                    v176 = v175 & 0x8888888888888888;
                                                    if (v175 & 0x8888888888888888)
                                                    {
                                                        v177 = ((((((v176 & 0xaaaaaaaaaaaaaaaa) >> 1 | v176 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v176 & 0xaaaaaaaaaaaaaaaa) >> 1 | v176 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v176 & 0xaaaaaaaaaaaaaaaa) >> 1 | v176 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v176 & 0xaaaaaaaaaaaaaaaa) >> 1 | v176 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                                        v178 = (((((((v176 & 0xaaaaaaaaaaaaaaaa) >> 1 | v176 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v176 & 0xaaaaaaaaaaaaaaaa) >> 1 | v176 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v176 & 0xaaaaaaaaaaaaaaaa) >> 1 | v176 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v176 & 0xaaaaaaaaaaaaaaaa) >> 1 | v176 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                                        v172 = ((((v178 | v177) & 0xffff0000ffff0000) >> 16 | (v178 | v177) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v178 | v177) & 0xffff0000ffff0000) >> 16 | (v178 | v177) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                                        goto LABEL_c4a2c0;
                                                    }
                                                } while ((node += 16, node <= v173));
                                            }
                                            if (v143 > node && (v167 = v143 - 16, v180 = __dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi16(_mm_cmpeq_epi8(*(int128_t *)((char *)v143 - 16), _mm_setzero_si128()), 4), _mm_srli_epi16(_mm_cmpeq_epi8(*(int128_t *)((char *)v143 - 16), _mm_setzero_si128()), 4))), v181 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi16(_mm_cmpeq_epi8(*(int128_t *)((char *)v143 - 16), _mm_setzero_si128()), 4), _mm_srli_epi16(_mm_cmpeq_epi8(*(int128_t *)((char *)v143 - 16), _mm_setzero_si128()), 4))), v169 = v181 & 0x8888888888888888, v181 & 0x8888888888888888))
                                                goto LABEL_c4a208;
                                            goto LABEL_c49b5c;
                                        }
                                    }
                                }
                            }
                            else
                            {
                                v59 = 1;
                                v116 = v4;
                                goto LABEL_c49b5c;
                            }
                        }
                        else
                        {
                            v187 = *(int128_t *)v3;
                            if (v27 == 47)
                            {
                                v189 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi16(_mm_cmpeq_epi8(v187, _mm_set1_epi8(32)), 4), _mm_srli_epi16(_mm_cmpeq_epi8(v187, _mm_set1_epi8(32)), 4)));
                                v190 = v189 & 0x8888888888888888;
                                if (v189 & 0x8888888888888888)
                                    goto LABEL_c49af4;
                                v115 = 16;
                            }
                            else
                            {
                                v192 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi16(_mm_cmpeq_epi8(v187, _mm_set1_epi8(47)), 4), _mm_srli_epi16(_mm_cmpeq_epi8(v187, _mm_set1_epi8(47)), 4)));
                                v190 = v192 & 0x8888888888888888;
                                if (v192 & 0x8888888888888888)
                                {
LABEL_c49af4:
                                    v193 = ((((((v190 & 0xaaaaaaaaaaaaaaaa) >> 1 | v190 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v190 & 0xaaaaaaaaaaaaaaaa) >> 1 | v190 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v190 & 0xaaaaaaaaaaaaaaaa) >> 1 | v190 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v190 & 0xaaaaaaaaaaaaaaaa) >> 1 | v190 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                    v194 = (((((((v190 & 0xaaaaaaaaaaaaaaaa) >> 1 | v190 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v190 & 0xaaaaaaaaaaaaaaaa) >> 1 | v190 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v190 & 0xaaaaaaaaaaaaaaaa) >> 1 | v190 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v190 & 0xaaaaaaaaaaaaaaaa) >> 1 | v190 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                    v195 = ((((v194 | v193) & 0xffff0000ffff0000) >> 16 | (v194 | v193) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v194 | v193) & 0xffff0000ffff0000) >> 16 | (v194 | v193) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                    if (!v195)
                                        v196 = 64;
                                    else
                                        v196 = Clz(v195);
                                    v115 = v196 >> 2;
                                }
                                else
                                {
                                    v198 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi16(_mm_cmpeq_epi8(v187, _mm_set1_epi8(32)), 4), _mm_srli_epi16(_mm_cmpeq_epi8(v187, _mm_set1_epi8(32)), 4)));
                                    v199 = v198 & 0x8888888888888888;
                                    v200 = v198 & 0x8888888888888888;
                                    v201 = ((((((v199 & 0xaaaaaaaaaaaaaaaa) >> 1 | v199 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v199 & 0xaaaaaaaaaaaaaaaa) >> 1 | v199 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v199 & 0xaaaaaaaaaaaaaaaa) >> 1 | v199 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v199 & 0xaaaaaaaaaaaaaaaa) >> 1 | v199 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                    v202 = (((((((v199 & 0xaaaaaaaaaaaaaaaa) >> 1 | v199 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v199 & 0xaaaaaaaaaaaaaaaa) >> 1 | v199 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v199 & 0xaaaaaaaaaaaaaaaa) >> 1 | v199 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v199 & 0xaaaaaaaaaaaaaaaa) >> 1 | v199 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                    v203 = ((((v202 | v201) & 0xffff0000ffff0000) >> 16 | (v202 | v201) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v202 | v201) & 0xffff0000ffff0000) >> 16 | (v202 | v201) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                    if (!v203)
                                    {
                                        v204 = 16;
                                        v205 = arm64g_calculate_condition(10, v200, 0, 0);
                                        if (!(v205 & 1))
                                            goto LABEL_c49b4e;
LABEL_c49b4d:
                                        v115 = 16;
                                    }
                                    else
                                    {
                                        v204 = Clz(v203) >> 2;
                                        v206 = arm64g_calculate_condition(10, v200, 0, 0);
                                        if (v206 & 1)
                                            goto LABEL_c49b4d;
LABEL_c49b4e:
                                        v115 = v204;
                                    }
                                }
                            }
LABEL_c49b50:
                            v116 = v4;
                            v117 = v6;
                            v59 = v3;
                            goto LABEL_c49b50;
                        }
                        goto LABEL_c49b5c;
                    }
                    v28 = (char)v3[1];
                    if (v28 == 32)
                    {
                        v29 = 0;
                        goto LABEL_c4985c;
                    }
                    v29 = v28 - 48;
                    if (9 >= (unsigned int)v29)
                    {
                        v30 = (char)v3[2];
                        if (v30 == 32)
                        {
LABEL_c49b1c:
                            if (v29 <= a5)
                            {
LABEL_c4985c:
                                v58 = a5 - v29;
                                if (a5 > v29)
                                {
                                    v59 = a4 + v29;
                                    v60 = 15;
                                    if (15 >= v58)
                                    {
                                        v61 = v58;
                                        iter1 = v59;
                                        v63 = v58;
                                        do
                                        {
                                            v64 = v63;
                                            v65 = *(char *)iter1;
                                            if (v65)
                                            {
                                                v66 = arm64g_calculate_condition(20, v61, v60, 0);
                                                v67 = arm64g_calculate_condition(3, (v66 & 1 ? v65 & 0xff : 0x40000000), (v66 & 1 ? 10 : 0), 0);
                                                if (!(v67 & 1))
                                                    continue;
                                            }
                                            else
                                            {
                                                v68 = arm64g_calculate_condition(20, v61, v60, 0);
                                                v69 = arm64g_calculate_condition(0, (v68 & 1 ? v65 & 0xff : 0x40000000), (v68 & 1 ? 10 : 0), 0);
                                                if (v69 & 1)
                                                    goto LABEL_c49dfc;
                                            }
                                        } while ((iter1 += 1, v63 = v64 - 1, v61 = v64, v60 = 1, v64 != 1));
                                    }
                                    else
                                    {
                                        v70 = _mm_cmpeq_epi8(*(int128_t *)v59, _mm_set1_epi8(10));
                                        v71 = _mm_cmpeq_epi8(*(int128_t *)v59, _mm_setzero_si128());
                                        v73 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi16(_mm_or_si128(v70, v71), 4), _mm_srli_epi16(_mm_or_si128(v70, v71), 4)));
                                        v74 = v73 & 0x8888888888888888;
                                        if (v73 & 0x8888888888888888)
                                        {
                                            v75 = ((((((v74 & 0xaaaaaaaaaaaaaaaa) >> 1 | v74 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v74 & 0xaaaaaaaaaaaaaaaa) >> 1 | v74 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v74 & 0xaaaaaaaaaaaaaaaa) >> 1 | v74 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v74 & 0xaaaaaaaaaaaaaaaa) >> 1 | v74 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                            v76 = (((((((v74 & 0xaaaaaaaaaaaaaaaa) >> 1 | v74 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v74 & 0xaaaaaaaaaaaaaaaa) >> 1 | v74 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v74 & 0xaaaaaaaaaaaaaaaa) >> 1 | v74 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v74 & 0xaaaaaaaaaaaaaaaa) >> 1 | v74 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                            v77 = ((((v76 | v75) & 0xffff0000ffff0000) >> 16 | (v76 | v75) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v76 | v75) & 0xffff0000ffff0000) >> 16 | (v76 | v75) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                            if (!v77)
                                                v78 = 64;
                                            else
                                                v78 = Clz(v77);
                                            iter1 = v59 + (v78 >> 2);
                                            goto LABEL_c49dfc;
                                        }
                                        v79 = a4 + a5;
                                        v80 = 16 - (v59 & 15);
                                        iter2 = v59 + v80;
                                        if (v58 >= 32 && (long long)(a5 - 32) >= (long long)(v80 + v29))
                                        {
                                            v82 = _mm_set1_epi32(0xa0a0a0a);
                                            while (1)
                                            {
                                                v83 = _mm_or_si128(_mm_cmpeq_epi8(*(int128_t *)iter2, v82), _mm_cmpeq_epi8(*(int128_t *)iter2, _mm_setzero_si128()));
                                                v84 = _mm_or_si128(_mm_cmpeq_epi8((int128_t)iter2[16], v82), _mm_cmpeq_epi8((int128_t)iter2[16], _mm_setzero_si128()));
                                                if (_mm_cvtsi128_si64(_mm_max_epu8(CatEvenLanesV(_mm_or_si128(v84, v83), _mm_or_si128(v84, v83)), CatOddLanesV(_mm_or_si128(v84, v83), _mm_or_si128(v84, v83)))))
                                                    break;
                                                iter2 += 32;
                                                if (iter2 > v79 - 32)
                                                    goto LABEL_c4a0a8;
                                            }
                                            v86 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi16(v83, 4), _mm_srli_epi16(v83, 4)));
                                            v87 = v86 & 0x8888888888888888;
                                            if (v86 & 0x8888888888888888)
                                            {
                                                v88 = ((((((v87 & 0xaaaaaaaaaaaaaaaa) >> 1 | v87 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v87 & 0xaaaaaaaaaaaaaaaa) >> 1 | v87 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v87 & 0xaaaaaaaaaaaaaaaa) >> 1 | v87 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v87 & 0xaaaaaaaaaaaaaaaa) >> 1 | v87 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                                v89 = (((((((v87 & 0xaaaaaaaaaaaaaaaa) >> 1 | v87 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v87 & 0xaaaaaaaaaaaaaaaa) >> 1 | v87 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v87 & 0xaaaaaaaaaaaaaaaa) >> 1 | v87 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v87 & 0xaaaaaaaaaaaaaaaa) >> 1 | v87 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                                v90 = ((((v89 | v88) & 0xffff0000ffff0000) >> 16 | (v89 | v88) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v89 | v88) & 0xffff0000ffff0000) >> 16 | (v89 | v88) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
LABEL_c4a234:
                                                if (!v90)
                                                    v105 = 64;
                                                else
                                                    v105 = Clz(v90);
                                                iter1 = iter2 + (v105 >> 2);
                                                goto LABEL_c49dfc;
                                            }
                                            else
                                            {
                                                v92 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi16(v84, 4), _mm_srli_epi16(v84, 4))) & 0x8888888888888888;
                                                v93 = ((((((v92 & 0xaaaaaaaaaaaaaaaa) >> 1 | v92 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v92 & 0xaaaaaaaaaaaaaaaa) >> 1 | v92 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v92 & 0xaaaaaaaaaaaaaaaa) >> 1 | v92 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v92 & 0xaaaaaaaaaaaaaaaa) >> 1 | v92 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                                v94 = (((((((v92 & 0xaaaaaaaaaaaaaaaa) >> 1 | v92 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v92 & 0xaaaaaaaaaaaaaaaa) >> 1 | v92 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v92 & 0xaaaaaaaaaaaaaaaa) >> 1 | v92 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v92 & 0xaaaaaaaaaaaaaaaa) >> 1 | v92 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                                v95 = ((((v94 | v93) & 0xffff0000ffff0000) >> 16 | (v94 | v93) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v94 | v93) & 0xffff0000ffff0000) >> 16 | (v94 | v93) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                                if (!v95)
                                                    v96 = 64;
                                                else
                                                    v96 = Clz(v95);
                                                iter1 = iter2 + 16 + (v96 >> 2);
                                                goto LABEL_c49dfc;
                                            }
                                        }
                                        else
                                        {
LABEL_c4a0a8:
                                            v97 = v79 - 16;
                                            if (v97 >= iter2)
                                            {
                                                do
                                                {
                                                    v98 = _mm_cmpeq_epi8(*(int128_t *)iter2, _mm_set1_epi8(10));
                                                    v99 = _mm_cmpeq_epi8(*(int128_t *)iter2, _mm_setzero_si128());
                                                    v101 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi16(_mm_or_si128(v98, v99), 4), _mm_srli_epi16(_mm_or_si128(v98, v99), 4)));
                                                    v102 = v101 & 0x8888888888888888;
                                                    if (v101 & 0x8888888888888888)
                                                    {
                                                        v103 = ((((((v102 & 0xaaaaaaaaaaaaaaaa) >> 1 | v102 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v102 & 0xaaaaaaaaaaaaaaaa) >> 1 | v102 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v102 & 0xaaaaaaaaaaaaaaaa) >> 1 | v102 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v102 & 0xaaaaaaaaaaaaaaaa) >> 1 | v102 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                                        v104 = (((((((v102 & 0xaaaaaaaaaaaaaaaa) >> 1 | v102 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v102 & 0xaaaaaaaaaaaaaaaa) >> 1 | v102 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v102 & 0xaaaaaaaaaaaaaaaa) >> 1 | v102 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v102 & 0xaaaaaaaaaaaaaaaa) >> 1 | v102 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                                        v90 = ((((v104 | v103) & 0xffff0000ffff0000) >> 16 | (v104 | v103) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v104 | v103) & 0xffff0000ffff0000) >> 16 | (v104 | v103) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                                        goto LABEL_c4a234;
                                                    }
                                                } while ((iter2 += 16, iter2 <= v97));
                                            }
                                            if (v79 > iter2)
                                            {
                                                v106 = _mm_cmpeq_epi8(*(int128_t *)((char *)v79 - 16), _mm_set1_epi8(10));
                                                v107 = _mm_cmpeq_epi8(*(int128_t *)((char *)v79 - 16), _mm_setzero_si128());
                                                v109 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_srli_epi16(_mm_or_si128(v106, v107), 4), _mm_srli_epi16(_mm_or_si128(v106, v107), 4)));
                                                v110 = v109 & 0x8888888888888888;
                                                if (v109 & 0x8888888888888888)
                                                {
                                                    v111 = ((((((v110 & 0xaaaaaaaaaaaaaaaa) >> 1 | v110 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v110 & 0xaaaaaaaaaaaaaaaa) >> 1 | v110 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v110 & 0xaaaaaaaaaaaaaaaa) >> 1 | v110 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v110 & 0xaaaaaaaaaaaaaaaa) >> 1 | v110 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                                    v112 = (((((((v110 & 0xaaaaaaaaaaaaaaaa) >> 1 | v110 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v110 & 0xaaaaaaaaaaaaaaaa) >> 1 | v110 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v110 & 0xaaaaaaaaaaaaaaaa) >> 1 | v110 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v110 & 0xaaaaaaaaaaaaaaaa) >> 1 | v110 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                                    v113 = ((((v112 | v111) & 0xffff0000ffff0000) >> 16 | (v112 | v111) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v112 | v111) & 0xffff0000ffff0000) >> 16 | (v112 | v111) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                                    if (!v113)
                                                        v114 = 64;
                                                    else
                                                        v114 = Clz(v113);
                                                    iter1 = v79 - 16 + (v114 >> 2);
LABEL_c49dfc:
                                                    v115 = iter1 - v59;
                                                    if (v58 <= v115)
                                                        sub_c73c94(v115);
                                                    if (*(char *)(v59 + v115) != 10)
                                                    {
                                                        v116 = v4;
                                                        v117 = v6;
LABEL_c49b5c:
                                                        if (a6 & 1)
                                                        {
                                                            switch (v115)
                                                            {
                                                            case 7:
                                                                if ((*(int *)v59 | (*(short *)(v59 + 4) | *(char *)(v59 + 6) * 0x10000) * 0x100000000) == 13286731735978799)
                                                                    goto LABEL_c49d64;
                                                                goto LABEL_c49db8;
                                                            case 2:
                                                                if (*(short *)v59 == 0x2f2f)
                                                                    goto LABEL_c49d64;
                                                                goto LABEL_c49db8;
                                                            case 1:
                                                                if (*(char *)v59 == 47)
                                                                    goto LABEL_c49d64;
                                                            default:
LABEL_c49db8:
                                                                *(unsigned long long *)a0->padding_0 = 0;
                                                                a0->field_8 = v3;
                                                                a0->field_10 = v59;
                                                                a0->field_18 = v115;
                                                                *(unsigned long long *)a0->padding_20 = 0;
                                                                break;
                                                            }
                                                        }
                                                        else
                                                        {
LABEL_c49d64:
                                                            v207 = v4 + v6;
                                                            v208 = v207 + 1;
                                                            v209 = arm64g_calculate_condition(50, v207, 1, 0);
                                                            if (!(v209 & 1))
                                                                v208 = 0xffffffffffffffff;
                                                            if (v6 & 1)
                                                                v207 = v208;
                                                            *a3 = v207;
                                                            *(unsigned long long *)a0->padding_0 = 0;
                                                            a0->field_8 = v3;
                                                            a0->field_10 = v59;
                                                            a0->field_18 = v115;
                                                            *(unsigned long long *)a0->padding_20 = v116;
                                                        }
                                                        a0->field_28 = v117;
                                                        return;
                                                    }
                                                    else if (v115 && (v115 -= 1, v116 = v4, v117 = v6, *(char *)(v59 + v115) == 47))
                                                    {
                                                        goto LABEL_c49b5c;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        else
                        {
                            v31 = v30 - 48;
                            if (9 >= v31)
                            {
                                v29 = (unsigned int)v29 * 10 + v31;
                                v32 = (char)v3[3];
                                if (v32 == 32)
                                    goto LABEL_c49b1c;
                                v33 = v32 - 48;
                                if (9 >= v33)
                                {
                                    v29 = 10 * v29 + v33;
                                    v34 = (char)v3[4];
                                    if (v34 == 32)
                                        goto LABEL_c49b1c;
                                    v35 = v34 - 48;
                                    if (9 >= v35)
                                    {
                                        v29 = 10 * v29 + v35;
                                        v36 = (char)v3[5];
                                        if (v36 == 32)
                                            goto LABEL_c49b1c;
                                        v37 = v36 - 48;
                                        if (9 >= v37)
                                        {
                                            v29 = 10 * v29 + v37;
                                            v38 = (char)v3[6];
                                            if (v38 == 32)
                                                goto LABEL_c49b1c;
                                            v39 = v38 - 48;
                                            if (9 >= v39)
                                            {
                                                v29 = 10 * v29 + v39;
                                                v40 = (char)v3[7];
                                                if (v40 == 32)
                                                    goto LABEL_c49b1c;
                                                v41 = v40 - 48;
                                                if (9 >= v41)
                                                {
                                                    v29 = 10 * v29 + v41;
                                                    v42 = (char)v3[8];
                                                    if (v42 == 32)
                                                        goto LABEL_c49b1c;
                                                    v43 = v42 - 48;
                                                    if (9 >= v43)
                                                    {
                                                        v29 = 10 * v29 + v43;
                                                        v44 = (char)v3[9];
                                                        if (v44 == 32)
                                                            goto LABEL_c49b1c;
                                                        v45 = v44 - 48;
                                                        if (9 >= v45)
                                                        {
                                                            v29 = 10 * v29 + v45;
                                                            v46 = (char)v3[10];
                                                            if (v46 == 32)
                                                                goto LABEL_c49b1c;
                                                            v47 = v46 - 48;
                                                            if (9 >= v47)
                                                            {
                                                                v29 = 10 * v29 + v47;
                                                                v48 = (char)v3[11];
                                                                if (v48 == 32)
                                                                    goto LABEL_c49b1c;
                                                                v49 = v48 - 48;
                                                                if (9 >= v49)
                                                                {
                                                                    v29 = 10 * v29 + v49;
                                                                    v50 = (char)v3[12];
                                                                    if (v50 == 32)
                                                                        goto LABEL_c49b1c;
                                                                    v51 = v50 - 48;
                                                                    if (9 >= v51)
                                                                    {
                                                                        v29 = 10 * v29 + v51;
                                                                        v52 = (char)v3[13];
                                                                        if (v52 == 32)
                                                                            goto LABEL_c49b1c;
                                                                        v53 = v52 - 48;
                                                                        if (9 >= v53)
                                                                        {
                                                                            v29 = 10 * v29 + v53;
                                                                            v54 = (char)v3[14];
                                                                            if (v54 == 32)
                                                                                goto LABEL_c49b1c;
                                                                            v55 = v54 - 48;
                                                                            if (9 >= v55)
                                                                            {
                                                                                v29 = 10 * v29 + v55;
                                                                                v56 = (char)v3[15];
                                                                                if (v56 == 32)
                                                                                    goto LABEL_c49b1c;
                                                                                v57 = v56 - 48;
                                                                                if (9 >= v57)
                                                                                {
                                                                                    v29 = 10 * v29 + v57;
                                                                                    goto LABEL_c49b1c;
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
                                        }
                                    }
                                }
                            }
                        }
                    }
                    a0->field_8 = "Invalid archive extended name offset";
                    a0->field_10 = 36;
                    *(unsigned long long *)a0->padding_0 = 2;
                    return;
                }
                else
                {
                    v8 = v7 - 48;
                    if (9 >= v8)
                    {
                        v6 = (unsigned int)v6 * 10 + v8;
                        v9 = (char)v3[50];
                        if (v9 == 32)
                            goto LABEL_c49830;
                        v10 = v9 - 48;
                        if (9 >= v10)
                        {
                            v6 = 10 * v6 + v10;
                            v11 = (char)v3[0x33];
                            if (v11 == 32)
                                goto LABEL_c49830;
                            v12 = v11 - 48;
                            if (9 >= v12)
                            {
                                v6 = 10 * v6 + v12;
                                v13 = (char)v3[52];
                                if (v13 == 32)
                                    goto LABEL_c49830;
                                v14 = v13 - 48;
                                if (9 >= v14)
                                {
                                    v6 = 10 * v6 + v14;
                                    v15 = (char)v3[53];
                                    if (v15 == 32)
                                        goto LABEL_c49830;
                                    v16 = v15 - 48;
                                    if (9 >= v16)
                                    {
                                        v6 = 10 * v6 + v16;
                                        v17 = (char)v3[54];
                                        if (v17 == 32)
                                            goto LABEL_c49830;
                                        v18 = v17 - 48;
                                        if (9 >= v18)
                                        {
                                            v6 = 10 * v6 + v18;
                                            v19 = (char)v3[55];
                                            if (v19 == 32)
                                                goto LABEL_c49830;
                                            v20 = v19 - 48;
                                            if (9 >= v20)
                                            {
                                                v6 = 10 * v6 + v20;
                                                v21 = (char)v3[56];
                                                if (v21 == 32)
                                                    goto LABEL_c49830;
                                                v22 = v21 - 48;
                                                if (9 >= v22)
                                                {
                                                    v6 = 10 * v6 + v22;
                                                    v23 = (char)v3[57];
                                                    if (v23 == 32)
                                                        goto LABEL_c49830;
                                                    v24 = v23 - 48;
                                                    if (9 >= v24)
                                                    {
                                                        v6 = 10 * v6 + v24;
                                                        goto LABEL_c49830;
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
            }
        }
        a0->field_8 = "Invalid archive member size";
        a0->field_10 = 27;
        *(unsigned long long *)a0->padding_0 = 2;
        return;
    }
    a0->field_8 = "Invalid archive member headera formatting trait implementation returned an error when the underlying stream did notinternal error: entered unreachable codefile name contained an unexpected NUL byte<unnamed>__rust_end_short_backtrace__rust_begin_short_backtraces";
    a0->field_10 = 29;
    *(unsigned long long *)a0->padding_0 = 2;
    return;
}
