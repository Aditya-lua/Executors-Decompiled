/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb47eb8..0xb489c8 (2832 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b47eb8_0 {
    char padding_0[240];
    void* field_f0;
} st_b47eb8_0;

extern long long g_f0a5c0;
extern char _NSHomeDirectory;
extern char g_10002b0;

unsigned long long sub_b47eb8(st_b47eb8_0 *a0, unsigned long long a1, unsigned long long a2, unsigned long long a3, unsigned long long a4, unsigned long long a5, unsigned long a6)
{
    unsigned long v11;  // x22
    unsigned long long v12;  // x21
    unsigned int v21;  // w12
    unsigned int *v111;  // x10
    unsigned int *v112;  // x11
    unsigned long long v113;  // x12
    unsigned int *v114;  // x10
    __m128i v115;  // q0
    unsigned int *v117;  // x11
    unsigned long long v119;  // 4137
    unsigned long long i;  // x8
    unsigned int v22;  // w13
    char *iter;  // x10
    char *v122;  // x9
    unsigned long long v123;  // x8
    char *v124;  // x9
    unsigned long long v126;  // x10
    unsigned long long v127;  // x9
    unsigned long long v128;  // x8
    uint128_t *v129;  // x11
    unsigned long long v130;  // x10
    unsigned int v23;  // w14
    unsigned long long v131;  // x13
    unsigned int *v132;  // x11
    unsigned int *v133;  // x12
    unsigned long long v134;  // x13
    unsigned int *v135;  // x11
    __m128i v136;  // q0
    unsigned int *v138;  // x12
    unsigned long long v140;  // 4137
    unsigned int v24;  // w15
    unsigned long long j;  // x8
    char *node;  // x9
    char *v143;  // x10
    unsigned long long v144;  // x8
    char *v145;  // x10
    unsigned long long v147;  // x8
    unsigned long long v148;  // x9
    unsigned long long v149;  // x12
    unsigned int *v150;  // x10
    unsigned int v25;  // w16
    unsigned int *v151;  // x11
    unsigned long long v152;  // x12
    unsigned int *v153;  // x10
    __m128i v154;  // q0
    unsigned int *v156;  // x11
    unsigned long long v158;  // 4137
    unsigned long long k;  // x8
    char *iter1;  // x10
    unsigned int v26;  // w17
    char *v161;  // x9
    unsigned long long v162;  // x8
    char *v163;  // x9
    unsigned long long v165;  // x10
    unsigned long long v166;  // x9
    unsigned long long v167;  // x8
    uint128_t *v168;  // x11
    unsigned long long v169;  // x10
    unsigned long long v170;  // x13
    unsigned int v27;  // w0
    unsigned int *v171;  // x11
    unsigned int *v172;  // x12
    unsigned long long v173;  // x13
    unsigned int *v174;  // x11
    __m128i v175;  // q0
    unsigned int *v177;  // x12
    unsigned long long v179;  // 4137
    unsigned long long l;  // x8
    unsigned int v28;  // w1
    char *iter2;  // x9
    char *v182;  // x10
    unsigned long long v183;  // x8
    char *v184;  // x10
    unsigned int v29;  // w2
    unsigned int v30;  // w3
    void* v13;  // x19
    char v31;  // x5
    unsigned long long v32;  // x24
    unsigned int v33;  // w4
    unsigned int v34;  // w8
    unsigned int v35;  // w8
    unsigned int v36;  // w8
    unsigned int v37;  // w8
    unsigned int v38;  // w8
    unsigned int v39;  // w8
    unsigned int v40;  // w8
    void* v14;  // x23
    unsigned int v41;  // w8
    unsigned int v42;  // w8
    unsigned int v43;  // w8
    unsigned int v44;  // w8
    unsigned int v45;  // w8
    unsigned int v46;  // w8
    unsigned int v47;  // w8
    unsigned long long v48;  // w0
    unsigned long long n;  // x24
    void* v50;  // x15
    uint128_t v15;  // q0
    void* v51;  // x28
    uint128_t *v52;  // x28
    uint128_t v53;  // q1
    unsigned long v54;  // cc_dep1
    unsigned long long v55;  // x24
    unsigned long long v56;  // 4102
    unsigned long long v57;  // 4102
    unsigned long long v58;  // x2
    unsigned long v59;  // x8
    unsigned long v60;  // x8
    unsigned int v16;  // w4
    void* v61;  // x22
    uint128_t v62;  // q0
    unsigned long long v63;  // x8
    unsigned long long v64;  // x22
    uint128_t v65;  // q3
    void* v66;  // x21
    uint128_t *v67;  // x21
    unsigned long long v68;  // x10
    unsigned long long v69;  // x8
    unsigned long long v70;  // x11
    unsigned int v17;  // w8
    uint128_t *v71;  // x9
    unsigned long long v72;  // x12
    unsigned long long v73;  // x14
    unsigned int *v74;  // x13
    unsigned long long v75;  // x14
    __m128i v76;  // q0
    unsigned long long v79;  // 4141
    unsigned long long m;  // x11
    unsigned int v18;  // w9
    char *v81;  // x12
    unsigned long long v82;  // x11
    unsigned long long v84;  // x12
    unsigned long long v85;  // x11
    unsigned long long v86;  // x10
    unsigned long v87;  // cc_dep1
    uint128_t *v88;  // x13
    unsigned long long v89;  // x9
    unsigned long long v90;  // x14
    unsigned int v19;  // w10
    unsigned long long v91;  // 4110
    unsigned long long v92;  // 4102
    unsigned long long v93;  // 4110
    unsigned long long v94;  // 4102
    unsigned long long v95;  // x9
    unsigned long long v96;  // x13
    unsigned int *v97;  // x12
    unsigned long long v98;  // x13
    __m128i v99;  // q0
    unsigned int v20;  // w11
    unsigned long long v102;  // 4142
    unsigned long long n;  // x10
    char *v104;  // x9
    unsigned long long v105;  // x10
    unsigned long long v107;  // x13
    unsigned long long v108;  // x8
    unsigned long long v109;  // x9
    unsigned long long v110;  // x12
    void* ptr;  // [bp-0xf0]
    unsigned long long v1;  // [bp-0xdc]
    unsigned long long v2;  // [bp-0xd8]
    unsigned long long v3;  // [bp-0xd4]
    char v4;  // [bp-0xd0]
    uint128_t v5;  // [bp-0xa0]
    uint128_t v6;  // [bp-0x90]
    uint128_t v7;  // [bp-0x80]
    unsigned long v8;  // [bp-0x68]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v11 = a6;
    v12 = a4;
    v8 = *(long long *)&g_10002b0;
    v13 = a0->field_f0;
    v1 = 16;
    v14 = v13 + 84;
    v15 = (int128_t)v13[84];
    v16 = (char)v13[99] + 1;
    *(char *)&v13[99] = v16;
    v17 = (char)v13[98] + (v16 >> 8);
    *(char *)&v13[98] = v17;
    v18 = (char)v13[97] + (v17 >> 8);
    *(char *)&v13[97] = v18;
    v19 = (char)v13[96] + (v18 >> 8);
    *(char *)&v13[96] = v19;
    v20 = (char)v13[95] + (v19 >> 8);
    *(char *)&v13[95] = v20;
    v21 = (char)v13[94] + (v20 >> 8);
    *(char *)&v13[94] = v21;
    v22 = (char)v13[93] + (v21 >> 8);
    *(char *)&v13[93] = v22;
    v23 = (char)v13[92] + (v22 >> 8);
    *(char *)&v13[92] = v23;
    v24 = (char)v13[91] + (v23 >> 8);
    *(char *)&v13[91] = v24;
    v25 = (char)v13[90] + (v24 >> 8);
    *(char *)&v13[90] = v25;
    v26 = (char)v13[89] + (v25 >> 8);
    *(char *)&v13[89] = v26;
    v27 = (char)v13[88] + (v26 >> 8);
    *(char *)&v13[88] = v27;
    v28 = (char)v13[87] + (v27 >> 8);
    *(char *)&v13[87] = v28;
    v29 = (char)v13[86] + (v28 >> 8);
    *(char *)&v13[86] = v29;
    v30 = (char)v13[0x55] + (v29 >> 8);
    *(char *)&v13[0x55] = v30;
    v31 = (char)v13[84] + (char)(v30 >> 8);
    *(char *)&v13[84] = v31;
    v5 = v15;
    v6 = (int128_t)v13[84];
    if ((long long)v13[40] == 16)
    {
        v32 = 32;
    }
    else
    {
        v33 = (v16 & 0xff) + 1;
        *(char *)&v13[99] = v33;
        v34 = (v33 >> 8) + (v17 & 0xff);
        *(char *)&v13[98] = v34;
        v35 = (v34 >> 8) + (v18 & 0xff);
        *(char *)&v13[97] = v35;
        v36 = (v35 >> 8) + (v19 & 0xff);
        *(char *)&v13[96] = v36;
        v37 = (v36 >> 8) + (v20 & 0xff);
        *(char *)&v13[95] = v37;
        v38 = (v37 >> 8) + (v21 & 0xff);
        *(char *)&v13[94] = v38;
        v39 = (v38 >> 8) + (v22 & 0xff);
        *(char *)&v13[93] = v39;
        v40 = (v39 >> 8) + (v23 & 0xff);
        *(char *)&v13[92] = v40;
        v41 = (v40 >> 8) + (v24 & 0xff);
        *(char *)&v13[91] = v41;
        v42 = (v41 >> 8) + (v25 & 0xff);
        *(char *)&v13[90] = v42;
        v43 = (v42 >> 8) + (v26 & 0xff);
        *(char *)&v13[89] = v43;
        v44 = (v43 >> 8) + (v27 & 0xff);
        *(char *)&v13[88] = v44;
        v45 = (v44 >> 8) + (v28 & 0xff);
        *(char *)&v13[87] = v45;
        v46 = (v45 >> 8) + (v29 & 0xff);
        *(char *)&v13[86] = v46;
        v47 = (v46 >> 8) + (v30 & 0xff);
        *(char *)&v13[0x55] = v47;
        *(char *)&v13[84] = v31 + (char)(v47 >> 8);
        v7 = *(int128_t *)v14;
        v32 = 48;
    }
    v48 = 0;
    if (sub_a4c6a0(*(long long *)v13, &v4, &v1, &v5, v32) && v1 == (unsigned int)v32)
    {
        n = (long long)v13[40];
        ptr = v13 + 52;
        _memcpy(ptr, &v4, n);
        v50 = v14;
        *(int128_t *)v14 = *(int128_t *)&(&v4)[n];
        if (!(int)v13[48])
        {
            v107 = a2;
            if (a1 && v107)
            {
                if (n < v107)
                    v108 = n;
                else
                    v108 = v107;
                if (32 >= v108)
                {
                    if (v108)
                    {
                        if (v108 < 4 || a1 + v108 > ptr && v13 + v108 + 52 > a1)
                        {
                            v109 = 0;
                        }
                        else if (16 > v108)
                        {
                            v109 = 0;
LABEL_b485a0:
                            v110 = v109;
                            v109 = v108 & 60;
                            v111 = a1 + v110;
                            v112 = v110 + v13 + 52;
                            v113 = v110 - v109;
                            do
                            {
                                v114 = v111 + 1;
                                v115 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_xor_si128(_mm_srli_epi16(_mm_unpacklo_epi8(_mm_setzero_si128(), *v111), 8), _mm_srli_epi16(_mm_unpacklo_epi8(_mm_setzero_si128(), *v112), 8)));
                                v117 = v112 + 1;
                                *v112 = __dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_unpacklo_epi64(v115, v115), _mm_unpacklo_epi64(v115, v115)));
                                v119 = arm64g_calculate_condition(18, v113, 4, 0);
                                v111 = v114;
                                v112 = v117;
                                v113 += 4;
                            } while (v119 & 1);
                            if (v108 == v109)
                                goto LABEL_b482f8;
                        }
                        else
                        {
                            v109 = v108 & 48;
                            *(int128_t *)ptr = *(int128_t *)a1 ^ *(int128_t *)ptr;
                            if (v109 != 16)
                                *(int128_t *)&v13[0x44] = *(int128_t *)(a1 + 16) ^ (int128_t)v13[0x44];
                            if (v108 == v109)
                                goto LABEL_b482f8;
                            if (v108 & 12)
                                goto LABEL_b485a0;
                        }
                        i = v108 - v109;
                        iter = v109 + v13 + 52;
                        v122 = a1 + v109;
                        do
                        {
                            v123 = i;
                            v124 = v122 + 1;
                            *iter = *iter ^ *v122;
                            iter += 1;
                            i = v123 - 1;
                            v122 = v124;
                        } while (i);
                    }
LABEL_b482f8:
                    v126 = v107 - n;
                    if (v107 > n)
                    {
                        if (v126 < 16)
                            v127 = v126;
                        else
                            v127 = 16;
                        if (1 < v127)
                            v128 = v127;
                        else
                            v128 = 1;
                        if (v126 < 4 || (v129 = a1 + n, (char *)v129 + v128 > v50 && v13 + v128 + 84 > v129))
                        {
                            v130 = 0;
                        }
                        else if (16 > v126)
                        {
                            v130 = 0;
LABEL_b485f4:
                            v131 = v130;
                            v130 = v128 & 28;
                            v132 = a1 + v131 + n;
                            v133 = v131 + v13 + 84;
                            v134 = v131 - v130;
                            do
                            {
                                v135 = v132 + 1;
                                v136 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_xor_si128(_mm_srli_epi16(_mm_unpacklo_epi8(_mm_setzero_si128(), *v132), 8), _mm_srli_epi16(_mm_unpacklo_epi8(_mm_setzero_si128(), *v133), 8)));
                                v138 = v133 + 1;
                                *v133 = __dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_unpacklo_epi64(v136, v136), _mm_unpacklo_epi64(v136, v136)));
                                v140 = arm64g_calculate_condition(18, v134, 4, 0);
                                v132 = v135;
                                v133 = v138;
                                v134 += 4;
                            } while (v140 & 1);
                            if (v127 == v130)
                                goto LABEL_b4836c;
                        }
                        else
                        {
                            v130 = v128 & 16;
                            *(uint128_t *)v50 = *v129 ^ *(int128_t *)v50;
                            if (v128 == v130)
                                goto LABEL_b4836c;
                            if (v128 & 12)
                                goto LABEL_b485f4;
                        }
                        j = v128 - v130;
                        node = v130 + v13 + 84;
                        v143 = a1 + v130 + n;
                        do
                        {
                            v144 = j;
                            v145 = v143 + 1;
                            *node = *node ^ *v143;
                            node += 1;
                            j = v144 - 1;
                            v143 = v145;
                        } while (j);
                    }
                }
            }
LABEL_b4836c:
            if (a3 && v12)
            {
                if (n < v12)
                    v147 = n;
                else
                    v147 = v12;
                if (32 >= v147)
                {
                    if (v147)
                    {
                        if (v147 < 4 || a3 + v147 > ptr && v13 + v147 + 52 > a3)
                        {
                            v148 = 0;
                        }
                        else if (16 > v147)
                        {
                            v148 = 0;
LABEL_b4864c:
                            v149 = v148;
                            v148 = v147 & 60;
                            v150 = a3 + v149;
                            v151 = v149 + v13 + 52;
                            v152 = v149 - v148;
                            do
                            {
                                v153 = v150 + 1;
                                v154 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_xor_si128(_mm_srli_epi16(_mm_unpacklo_epi8(_mm_setzero_si128(), *v150), 8), _mm_srli_epi16(_mm_unpacklo_epi8(_mm_setzero_si128(), *v151), 8)));
                                v156 = v151 + 1;
                                *v151 = __dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_unpacklo_epi64(v154, v154), _mm_unpacklo_epi64(v154, v154)));
                                v158 = arm64g_calculate_condition(18, v152, 4, 0);
                                v150 = v153;
                                v151 = v156;
                                v152 += 4;
                            } while (v158 & 1);
                            if (v147 == v148)
                                goto LABEL_b483dc;
                        }
                        else
                        {
                            v148 = v147 & 48;
                            *(int128_t *)ptr = *(int128_t *)a3 ^ *(int128_t *)ptr;
                            if (v148 != 16)
                                *(int128_t *)&v13[0x44] = *(int128_t *)(a3 + 16) ^ (int128_t)v13[0x44];
                            if (v147 == v148)
                                goto LABEL_b483dc;
                            if (v147 & 12)
                                goto LABEL_b4864c;
                        }
                        k = v147 - v148;
                        iter1 = v148 + v13 + 52;
                        v161 = a3 + v148;
                        do
                        {
                            v162 = k;
                            v163 = v161 + 1;
                            *iter1 = *iter1 ^ *v161;
                            iter1 += 1;
                            k = v162 - 1;
                            v161 = v163;
                        } while (k);
                    }
LABEL_b483dc:
                    v165 = v12 - n;
                    if (v12 > n)
                    {
                        if (v165 < 16)
                            v166 = v165;
                        else
                            v166 = 16;
                        if (1 < v166)
                            v167 = v166;
                        else
                            v167 = 1;
                        if (v165 < 4 || (v168 = a3 + n, (char *)v168 + v167 > v50 && v13 + v167 + 84 > v168))
                        {
                            v169 = 0;
                        }
                        else if (16 > v165)
                        {
                            v169 = 0;
LABEL_b486a0:
                            v170 = v169;
                            v169 = v167 & 28;
                            v171 = a3 + v170 + n;
                            v172 = v170 + v13 + 84;
                            v173 = v170 - v169;
                            do
                            {
                                v174 = v171 + 1;
                                v175 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_xor_si128(_mm_srli_epi16(_mm_unpacklo_epi8(_mm_setzero_si128(), *v171), 8), _mm_srli_epi16(_mm_unpacklo_epi8(_mm_setzero_si128(), *v172), 8)));
                                v177 = v172 + 1;
                                *v172 = __dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_unpacklo_epi64(v175, v175), _mm_unpacklo_epi64(v175, v175)));
                                v179 = arm64g_calculate_condition(18, v173, 4, 0);
                                v171 = v174;
                                v172 = v177;
                                v173 += 4;
                            } while (v179 & 1);
                            if (v166 == v169)
                                goto LABEL_b48984;
                        }
                        else
                        {
                            v169 = v167 & 16;
                            *(uint128_t *)v50 = *v168 ^ *(int128_t *)v50;
                            if (v167 == v169)
                                goto LABEL_b48984;
                            if (v167 & 12)
                                goto LABEL_b486a0;
                        }
                        l = v167 - v169;
                        iter2 = v169 + v13 + 84;
                        v182 = a3 + v169 + n;
                        do
                        {
                            v183 = l;
                            v184 = v182 + 1;
                            *iter2 = *iter2 ^ *v182;
                            iter2 += 1;
                            l = v183 - 1;
                            v182 = v184;
                        } while (l);
                    }
                }
            }
            goto LABEL_b48984;
        }
        if (a3 || a1 || a5)
        {
            v2 = 16;
            v3 = 16;
            v51 = v13;
            *(uint128_t *)&v51[128] = 0;
            *(uint128_t *)&v51[144] = 0;
            v52 = v51 + 128;
            v53 = v52[1];
            v52[1] = &_NSHomeDirectory ^ v53;
            v52[2] = 0;
            v54 = n;
            if (n == 16)
            {
                v55 = 32;
                v56 = arm64g_calculate_condition(4, v54, 16, 0);
                if (!(v56 & 1))
                    goto LABEL_b48168;
            }
            else
            {
                v55 = 48;
                v57 = arm64g_calculate_condition(4, v54, 16, 0);
                if (!(v57 & 1))
                {
LABEL_b48168:
                    v53 = 0x2000000;
                    *(uint128_t *)&v13[160] = 0x2000000 ^ (int128_t)v13[160];
                }
            }
            if (sub_a4c6a0((long long)v13[16], v52, &v3, v52, v55) && v3 == (unsigned int)v55)
            {
                if (!a1)
                    v58 = 0;
                else
                    v58 = a2;
                if (!a5)
                    v11 = 0;
                if (!a3)
                    v12 = 0;
                v59 = v12 + v58 + v11;
                *(char *)&v13[100] = v59 >> 24;
                *(char *)&v13[101] = v59 >> 16;
                *(char *)&v13[0x66] = v59 >> 8;
                *(char *)&v13[103] = v59;
                *(unsigned short *)&v13[104] = 0;
                *(char *)&v13[106] = 0;
                *(char *)&v13[107] = (char)v13[40] + 16;
                *(unsigned long long *)&v13[120] = 8;
                if (sub_b489c8() && sub_b489c8(v13, a5, v11) && sub_b489c8(v13, a3, v12) && sub_b489c8(v13, &g_f0a5c0, 1))
                {
                    v60 = (long long)v13[120];
                    if (v60)
                    {
                        v61 = v13 + 100;
                        _bzero(v61 + v60, 16 - v60);
                        v62 = (int128_t)v13[100];
                        v63 = (long long)v13[40];
                        if (v63 == 16)
                        {
                            v64 = 32;
                        }
                        else
                        {
                            v53 = *(int128_t *)v61;
                            v64 = 48;
                        }
                        v3 = 16;
                        v65 = (int128_t)v13[144];
                        *(uint128_t *)&v13[128] = v62 ^ (int128_t)v13[128];
                        *(uint128_t *)&v13[144] = v62 ^ v65;
                        if (v63 != 16)
                            *(uint128_t *)&v13[160] = v53 ^ (int128_t)v13[160];
                        if (sub_a4c6a0((long long)v13[16], v52, &v3, v52, v64) && v3 == (unsigned int)v64)
                            goto LABEL_b484ac;
                    }
                    else
                    {
LABEL_b484ac:
                        if (sub_a4c694(*(long long *)v13, 0, 0, v52, 0, 0xffffffff) && sub_a4c6a0(*(long long *)v13, v52, &v2, (char *)v52 + v13[40], 16) && v2 == 16 && !(v66 = v13, v67 = v66 + 144, !sub_a4c6a0(*(long long *)v66, v67, &v2, v52, 16) || v2 != 16 || (long long)v13[40] != 16 && (!sub_a4c6a0(*(long long *)v13, v13 + 160, &v2, v67, 16) || v2 != 16)))
                        {
                            v50 = v14;
                            goto LABEL_b487c8;
                        }
                    }
                }
            }
            v48 = 0;
        }
        else
        {
LABEL_b487c8:
            if (a2)
            {
                v68 = *(long long *)&a0->padding_0[224];
                if (v68)
                {
                    v69 = (long long)v13[40];
                    if (v69 < v68)
                        v70 = v69;
                    else
                        v70 = v68;
                    if (32 >= v70)
                    {
                        v71 = v13 + 128;
                        if (v69)
                        {
                            if (4 > v70)
                            {
                                v72 = 0;
                            }
                            else if (16 > v70)
                            {
                                v72 = 0;
LABEL_b48810:
                                v73 = v72;
                                v72 = v70 & 60;
                                v74 = v73 + v13 + 128;
                                v75 = v73 - v72;
                                do
                                {
                                    v76 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_xor_si128(_mm_srli_epi16(_mm_unpacklo_epi8(_mm_setzero_si128(), *v74), 8), _mm_srli_epi16(_mm_unpacklo_epi8(_mm_setzero_si128(), *(int *)((char *)v74 - 76)), 8)));
                                    *(unsigned int *)((char *)v74 - 76) = __dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_unpacklo_epi64(v76, v76), _mm_unpacklo_epi64(v76, v76)));
                                    v74 += 1;
                                    v79 = arm64g_calculate_condition(18, v75, 4, 0);
                                    v75 += 4;
                                } while (v79 & 1);
                                if (v70 == v72)
                                    goto LABEL_b488c0;
                            }
                            else
                            {
                                v72 = v70 & 48;
                                *(uint128_t *)ptr = *v71 ^ *(int128_t *)ptr;
                                if (v72 != 16)
                                    *(int128_t *)&v13[0x44] = (int128_t)v13[144] ^ (int128_t)v13[0x44];
                                if (v70 == v72)
                                    goto LABEL_b488c0;
                                if (v70 & 12)
                                    goto LABEL_b48810;
                            }
                            m = v70 - v72;
                            v81 = v72 + v13 + 128;
                            do
                            {
                                v82 = m;
                                *(v81 - 76) = *(v81 - 76) ^ *v81;
                                v81 += 1;
                                m = v82 - 1;
                            } while (m);
                        }
LABEL_b488c0:
                        v84 = v68 - v69;
                        if (v68 > v69)
                        {
                            if (v84 < 16)
                                v85 = v84;
                            else
                                v85 = 16;
                            if (1 < v85)
                                v86 = v85;
                            else
                                v86 = 1;
                            v87 = v84;
                            if (v84 >= 4)
                            {
                                v88 = (char *)v71 + v69;
                                v89 = v13 + v86;
                                v90 = v89 + 84;
                                if (v50 < v89 + v69 + 128)
                                {
                                    v91 = arm64g_calculate_condition(52, v87, 4, 0);
                                    v92 = arm64g_calculate_condition(52, (v91 & 1 ? v88 : 0x20000000), (v91 & 1 ? v90 : 0), 0);
                                    if (!(v92 & 1))
                                        goto LABEL_b48904;
                                }
                                else
                                {
                                    v93 = arm64g_calculate_condition(52, v87, 4, 0);
                                    v94 = arm64g_calculate_condition(48, (v93 & 1 ? v88 : 0x20000000), (v93 & 1 ? v90 : 0), 0);
                                    if (!(v94 & 1))
                                    {
LABEL_b48904:
                                        if (16 > v84)
                                        {
                                            v95 = 0;
                                            goto LABEL_b48910;
                                        }
                                        v95 = v86 & 16;
                                        *(uint128_t *)v50 = *v88 ^ *(int128_t *)v50;
                                        if (v86 == v95)
                                            goto LABEL_b48984;
                                        if (v86 & 12)
                                        {
LABEL_b48910:
                                            v96 = v95;
                                            v95 = v86 & 28;
                                            v97 = v96 + v13 + 128;
                                            v98 = v96 - v95;
                                            do
                                            {
                                                v99 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_xor_si128(_mm_srli_epi16(_mm_unpacklo_epi8(_mm_setzero_si128(), *(int *)((char *)v97 + v69)), 8), _mm_srli_epi16(_mm_unpacklo_epi8(_mm_setzero_si128(), *(int *)((char *)v97 - 44)), 8)));
                                                *(unsigned int *)((char *)v97 - 44) = __dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_unpacklo_epi64(v99, v99), _mm_unpacklo_epi64(v99, v99)));
                                                v97 += 1;
                                                v102 = arm64g_calculate_condition(18, v98, 4, 0);
                                                v98 += 4;
                                            } while (v102 & 1);
                                            if (v85 == v95)
                                                goto LABEL_b48984;
                                            goto LABEL_b4895c;
                                        }
                                    }
                                }
                            }
                            v95 = 0;
LABEL_b4895c:
                            n = v86 - v95;
                            v104 = v95 + v13 + 128;
                            do
                            {
                                v105 = n;
                                *(v104 - 44) = *(v104 - 44) ^ v104[v69];
                                v104 += 1;
                                n = v105 - 1;
                            } while (n);
                        }
                    }
                }
            }
LABEL_b48984:
            sub_c6aa00(v13, v13 + 52, &v3);
            v48 = v3;
        }
    }
    if (*(long long *)&g_10002b0 == v8)
        return v48;
    ___stack_chk_fail();
}
