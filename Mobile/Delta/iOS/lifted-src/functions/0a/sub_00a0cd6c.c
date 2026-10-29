/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa0cd6c..0xa0d9ac (3136 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a0cd6c_0 {
    uint128_t field_0;
    uint128_t field_10;
    unsigned long long field_20;
    uint128_t field_28;
    uint128_t field_38;
    unsigned long long field_48;
    uint128_t field_50;
    uint128_t field_60;
    unsigned long long field_70;
} st_a0cd6c_0;

extern char g_d44174;
extern char g_10002b0;

unsigned long long sub_a0cd6c(unsigned int *ptr, char *a1, st_a0cd6c_0 *a2, char *a3)
{
    unsigned long long i;  // x9
    __m128i v43;  // q0
    unsigned long v144;  // d1
    __m128i v145;  // q6
    uint128_t v146;  // q4
    __m128i v148;  // q1
    __m128i v149;  // q2
    __m128i v150;  // q4
    unsigned long v53;  // d4
    unsigned long long v151;  // d1
    unsigned long long v154;  // d2
    uint128_t v155;  // q5
    __m128i v156;  // q5
    __m128i v157;  // q4
    __m128i v158;  // q1
    __m128i v159;  // q2
    unsigned long v54;  // d5
    uint128_t v162;  // q3
    __m128i v166;  // q1
    __m128i v168;  // q2
    unsigned long v169;  // x22
    long long v170;  // x22
    void* v55;  // x12
    unsigned int v171;  // w9
    unsigned int v172;  // w10
    unsigned int v173;  // w11
    unsigned int v174;  // w12
    unsigned int v175;  // w13
    unsigned int v176;  // w8
    __m128i v177;  // q0
    __m128i v178;  // q1
    unsigned long v180;  // d2
    unsigned long long v56;  // x9
    __m128i v181;  // q2
    __m128i v183;  // q3
    __m128i v184;  // q4
    __m128i v185;  // q5
    unsigned long long v186;  // d3
    unsigned long long v189;  // d4
    unsigned long v57;  // x13
    uint128_t v192;  // q3
    uint128_t v193;  // q6
    __m128i v194;  // q6
    __m128i v195;  // q0
    unsigned int v196;  // w9
    unsigned int v197;  // w10
    unsigned int v198;  // w11
    unsigned int v199;  // w12
    unsigned int v200;  // w13
    unsigned long long v58;  // x14
    unsigned int v201;  // w8
    __m128i v202;  // q1
    __m128i v203;  // q2
    unsigned long v205;  // d3
    __m128i v206;  // q3
    __m128i v208;  // q4
    __m128i v209;  // q5
    __m128i v210;  // q6
    unsigned long v59;  // x15
    unsigned long long v211;  // d4
    unsigned long long v214;  // d5
    uint128_t v217;  // q4
    uint128_t v218;  // q7
    __m128i v219;  // q7
    __m128i v220;  // q1
    unsigned long long v60;  // x16
    __m128i v221;  // q3
    __m128i v222;  // q2
    __m128i v223;  // q5
    __m128i v224;  // q4
    uint128_t v226;  // q6
    __m128i v230;  // q3
    unsigned int v61;  // w0
    __m128i v232;  // q1
    char *iter;  // x10
    unsigned int v62;  // w17
    unsigned int v63;  // w1
    unsigned int v64;  // w0
    unsigned int v65;  // w17
    unsigned long long v66;  // 4121
    unsigned long long v67;  // x17
    unsigned long long j;  // x9
    __m128i v69;  // q0
    char *node;  // x8
    char v71;  // 4138
    char v45;  // 4138
    uint128_t v72;  // 4197
    char v73;  // 4148
    uint128_t v74;  // 4199
    uint128_t v76;  // q6
    unsigned long v79;  // d4
    unsigned long v80;  // d5
    unsigned long long *v81;  // x11
    uint128_t v46;  // 4197
    unsigned long long v82;  // x8
    unsigned long v83;  // x12
    unsigned long long v84;  // x13
    unsigned long v85;  // x14
    unsigned long long v86;  // x15
    unsigned int v87;  // w17
    unsigned int v88;  // w16
    unsigned int v89;  // w0
    unsigned int v90;  // w17
    unsigned int v91;  // w16
    char v47;  // 4148
    unsigned long long v92;  // 4121
    unsigned long long v93;  // x16
    unsigned long long v94;  // x0
    unsigned int *v95;  // x20
    unsigned int *v96;  // x20
    unsigned int *v97;  // x21
    unsigned int *v98;  // x21
    unsigned long long v99;  // w10
    unsigned long v100;  // x27
    unsigned long long v101;  // 4118
    uint128_t v48;  // 4199
    __m128i v102;  // q7
    unsigned long k;  // x27
    unsigned int v104;  // w8
    unsigned long long v105;  // x22
    char *v106;  // x22
    unsigned int v107;  // w9
    unsigned int v108;  // w10
    unsigned int v109;  // w11
    unsigned int v110;  // w12
    unsigned int v111;  // w13
    unsigned int v112;  // w8
    __m128i v113;  // q0
    __m128i v114;  // q1
    unsigned long v116;  // d2
    __m128i v117;  // q2
    __m128i v119;  // q3
    __m128i v120;  // q4
    uint128_t v50;  // q6
    __m128i v121;  // q5
    unsigned long v122;  // d3
    unsigned long v125;  // d4
    uint128_t v128;  // q3
    uint128_t v129;  // q6
    __m128i v130;  // q6
    __m128i v131;  // q1
    __m128i v132;  // q0
    unsigned int v133;  // w9
    unsigned int v134;  // w10
    unsigned int v135;  // w11
    unsigned int v136;  // w12
    unsigned int v137;  // w8
    unsigned int v138;  // w15
    __m128i v139;  // q2
    __m128i v140;  // q3
    char v0;  // [bp-0x960]
    char v1;  // [bp-0x938]
    char v2;  // [bp-0x910]
    char v3;  // [bp-0x8e8]
    uint128_t v4;  // [bp-0x8c0]
    uint128_t v5;  // [bp-0x8b0]
    uint192_t v6;  // [bp-0x8a0]
    uint192_t v7;  // [bp-0x888]
    __m128i v8;  // [bp-0x870]
    __m128i v9;  // [bp-0x860]
    unsigned long v10;  // [bp-0x850]
    char v11;  // [bp-0x848]
    uint128_t v12;  // [bp-0x820], Other Possible Types: unsigned long, char
    unsigned int v13;  // [bp-0x818]
    unsigned int v14;  // [bp-0x814]
    uint128_t v15;  // [bp-0x810], Other Possible Types: unsigned long long
    unsigned long long v16;  // [bp-0x808]
    uint128_t v17;  // [bp-0x800]
    uint128_t v18;  // [bp-0x800]
    uint128_t v19;  // [bp-0x800]
    char v20;  // [bp-0x7f8]
    unsigned int v21;  // [bp-0x7f0]
    unsigned int v22;  // [bp-0x7ec]
    uint320_t v23;  // [bp-0x7e8]
    uint320_t v24;  // [bp-0x7e8]
    uint320_t v25;  // [bp-0x7e8], Other Possible Types: unsigned int
    __m128i v26;  // [bp-0x7e4]
    unsigned int v27;  // [bp-0x7d4]
    uint512_t v28;  // [bp-0x7c0], Other Possible Types: char
    char v29;  // [bp-0x778]
    char v30;  // [bp-0x6d8]
    char v31;  // [bp-0x638]
    char v32;  // [bp-0x598]
    char v33;  // [bp-0x4f8]
    char v34;  // [bp-0x458]
    char v35;  // [bp-0x3b8]
    char v36;  // [bp-0x318]
    uint128_t v37;  // [bp-0x278]
    char v38;  // [bp-0x178]
    unsigned long v39;  // [bp-0x78]
    char *v40;  // [bp-0x10]
    char v41;  // [bp+0x0]

    v40 = &v41;
    i = 0;
    v39 = *(long long *)&g_10002b0;
    v43 = _mm_set_epi64x(0, 0x706050403020100);
    iter = a1 + 1;
    do
    {
        v45 = *(iter - 1);
        v46 = __dirty_unsupported_Iop_ZeroHI64ofV128(CONCAT(v45 | v45 * 0x100 | (v45 | v45 * 0x100) * 0x10000 | (v45 | v45 * 0x100 | (v45 | v45 * 0x100) * 0x10000) * 0x100000000, v45 | v45 * 0x100 | (v45 | v45 * 0x100) * 0x10000 | (v45 | v45 * 0x100 | (v45 | v45 * 0x100) * 0x10000) * 0x100000000));
        v47 = *iter;
        v48 = __dirty_unsupported_Iop_ZeroHI64ofV128(CONCAT(v47 | v47 * 0x100 | (v47 | v47 * 0x100) * 0x10000 | (v47 | v47 * 0x100 | (v47 | v47 * 0x100) * 0x10000) * 0x100000000, v47 | v47 * 0x100 | (v47 | v47 * 0x100) * 0x10000 | (v47 | v47 * 0x100 | (v47 | v47 * 0x100) * 0x10000) * 0x100000000));
        v50 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_sub_epi8(_mm_setzero_si128(), __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_and_si128(v43, _mm_set_epi64x(0, 0x707070707070707)))));
        v53 = __dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_Sh8Ux16(v46, v50)) & 0x101010101010101);
        v54 = __dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_Sh8Ux16(v48, v50)) & 0x101010101010101);
        v55 = &(&v38)[i];
        *(unsigned long *)v55 = v53;
        *(unsigned long *)&v55[8] = v54;
        i += 16;
        v43 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_add_epi8(v43, _mm_set_epi8(0, 0, 0, 0, 0, 0, 0, 0, 16, 16, 16, 16, 16, 16, 16, 16)));
        iter += 2;
    } while (i != 0x100);
    v56 = 0;
    v57 = 1;
    do
    {
        if (254 >= v56 && (&v38)[v56])
        {
            v58 = v56;
            v59 = 1;
            v60 = v57;
            do
            {
                v61 = (&v38)[v60];
                if (!v61)
                    continue;
                v62 = (&v38)[v56];
                v63 = v61 << ((char)v59 & 31);
                v64 = v63 + v62;
                if (15 >= (int)v64)
                {
                    (&v38)[v56] = v64;
                    (&v38)[v60] = 0;
                }
                else
                {
                    v65 = v62 - v63;
                    v66 = arm64g_calculate_condition(177, v65, 15, 0);
                    if (v66 & 1)
                        break;
                    (&v38)[v56] = v65;
                    v67 = v58;
                    do
                    {
                        if (!(&v38)[1 + v67])
                        {
                            (&v38)[1 + v67] = 1;
                            break;
                        }
                    } while (((&v38)[1 + v67] = 0, v67 += 1, v67 < 0xff));
                }
            } while (5 >= v59 && (v59 += 1, v60 += 1, v58 += 1, v59 + v56 < 0x100));
        }
    } while ((v56 += 1, v57 += 1, v56 != 0x100));
    j = 0;
    v69 = _mm_set_epi64x(0, 0x706050403020100);
    node = a3 + 1;
    do
    {
        v71 = *(node - 1);
        v72 = __dirty_unsupported_Iop_ZeroHI64ofV128(CONCAT(v71 | v71 * 0x100 | (v71 | v71 * 0x100) * 0x10000 | (v71 | v71 * 0x100 | (v71 | v71 * 0x100) * 0x10000) * 0x100000000, v71 | v71 * 0x100 | (v71 | v71 * 0x100) * 0x10000 | (v71 | v71 * 0x100 | (v71 | v71 * 0x100) * 0x10000) * 0x100000000));
        v73 = *node;
        v74 = __dirty_unsupported_Iop_ZeroHI64ofV128(CONCAT(v73 | v73 * 0x100 | (v73 | v73 * 0x100) * 0x10000 | (v73 | v73 * 0x100 | (v73 | v73 * 0x100) * 0x10000) * 0x100000000, v73 | v73 * 0x100 | (v73 | v73 * 0x100) * 0x10000 | (v73 | v73 * 0x100 | (v73 | v73 * 0x100) * 0x10000) * 0x100000000));
        v76 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_sub_epi8(_mm_setzero_si128(), __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_and_si128(v69, _mm_set_epi64x(0, 0x707070707070707)))));
        v79 = __dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_Sh8Ux16(v72, v76)) & 0x101010101010101);
        v80 = __dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_Sh8Ux16(v74, v76)) & 0x101010101010101);
        v81 = (char *)&v37 + j;
        *v81 = v79;
        v81[1] = v80;
        j += 16;
        v69 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_add_epi8(v69, _mm_set_epi8(0, 0, 0, 0, 0, 0, 0, 0, 16, 16, 16, 16, 16, 16, 16, 16)));
        node += 2;
    } while (j != 0x100);
    v82 = 0;
    v83 = 1;
    do
    {
        if (254 >= v82 && *((char *)&v37 + v82))
        {
            v84 = v82;
            v85 = 1;
            v86 = v83;
            do
            {
                v87 = *((char *)&v37 + v86);
                if (!v87)
                    continue;
                v88 = *((char *)&v37 + v82);
                v89 = v87 << ((char)v85 & 31);
                v90 = v89 + v88;
                if (15 >= (int)v90)
                {
                    *((char *)&v37 + v82) = v90;
                    *((char *)&v37 + v86) = 0;
                }
                else
                {
                    v91 = v88 - v89;
                    v92 = arm64g_calculate_condition(177, v91, 15, 0);
                    if (v92 & 1)
                        break;
                    *((char *)&v37 + v82) = v91;
                    v93 = v84;
                    do
                    {
                        if (!*((char *)&v37 + v93 + 1))
                        {
                            *((char *)&v37 + v93 + 1) = 1;
                            break;
                        }
                    } while ((*((char *)&v37 + v93 + 1) = 0, v93 += 1, v93 < 0xff));
                }
            } while (5 >= v85 && (v85 += 1, v86 += 1, v84 += 1, v85 + v82 < 0x100));
        }
    } while ((v82 += 1, v83 += 1, v82 != 0x100));
    sub_a115fc(&v29, a2);
    v4 = a2->field_0;
    v5 = a2->field_10;
    *(int128_t *)((char *)&v6 + 8) = *(int128_t *)&(&a2->field_20)[1];
    *(int128_t *)&v7 = *(int128_t *)((char *)&a2->field_28 + 8);
    *(unsigned long long *)&v6 = a2->field_20;
    *(long long *)((char *)&v7 + 16) = *(long long *)((char *)&a2->field_38 + 8);
    v8 = *(int128_t *)&a2->field_48;
    v9 = a2->field_50;
    v10 = a2->field_60;
    sub_a10c84(&v12, &v4);
    sub_a10314(&v0, &v12, &v28 + 24);
    sub_a10314(&v1, &v20, (char *)&v24 + 24);
    sub_a10314(&v2, (char *)&v24 + 24, &v28 + 24);
    sub_a10314(&v3, &v12, &v20);
    sub_a11760(&v12, &v0, &v29);
    sub_a10314(&v4, &v12, &v28 + 24);
    sub_a10314((char *)&v6 + 8, &v20, (char *)&v24 + 24);
    sub_a10314(&v8, (char *)&v24 + 24, &v28 + 24);
    sub_a10314(&v11, &v12, &v20);
    sub_a115fc(&v30, &v4);
    sub_a11760(&v12, &v0, &v30);
    sub_a10314(&v4, &v12, &v28 + 24);
    sub_a10314((char *)&v6 + 8, &v20, (char *)&v24 + 24);
    sub_a10314(&v8, (char *)&v24 + 24, &v28 + 24);
    sub_a10314(&v11, &v12, &v20);
    sub_a115fc(&v31, &v4);
    sub_a11760(&v12, &v0, &v31);
    sub_a10314(&v4, &v12, &v28 + 24);
    sub_a10314((char *)&v6 + 8, &v20, (char *)&v24 + 24);
    sub_a10314(&v8, (char *)&v24 + 24, &v28 + 24);
    sub_a10314(&v11, &v12, &v20);
    sub_a115fc(&v32, &v4);
    sub_a11760(&v12, &v0, &v32);
    sub_a10314(&v4, &v12, &v28 + 24);
    sub_a10314((char *)&v6 + 8, &v20, (char *)&v24 + 24);
    sub_a10314(&v8, (char *)&v24 + 24, &v28 + 24);
    sub_a10314(&v11, &v12, &v20);
    sub_a115fc(&v33, &v4);
    sub_a11760(&v12, &v0, &v33);
    sub_a10314(&v4, &v12, &v28 + 24);
    sub_a10314((char *)&v6 + 8, &v20, (char *)&v24 + 24);
    sub_a10314(&v8, (char *)&v24 + 24, &v28 + 24);
    sub_a10314(&v11, &v12, &v20);
    sub_a115fc(&v34, &v4);
    sub_a11760(&v12, &v0, &v34);
    sub_a10314(&v4, &v12, &v28 + 24);
    sub_a10314((char *)&v6 + 8, &v20, (char *)&v24 + 24);
    sub_a10314(&v8, (char *)&v24 + 24, &v28 + 24);
    sub_a10314(&v11, &v12, &v20);
    sub_a115fc(&v35, &v4);
    sub_a11760(&v12, &v0, &v35);
    sub_a10314(&v4, &v12, &v28 + 24);
    sub_a10314((char *)&v6 + 8, &v20, (char *)&v24 + 24);
    sub_a10314(&v8, (char *)&v24 + 24, &v28 + 24);
    sub_a10314(&v11, &v12, &v20);
    v94 = sub_a115fc(&v36, &v4);
    memset(ptr, 0, 40);
    v95 = ptr;
    *(uint128_t *)&v95[10] = 0;
    v96 = v95 + 10;
    *(uint128_t *)&ptr[14] = 0;
    *(unsigned long long *)&ptr[18] = 0;
    *v96 = 1;
    v97 = ptr;
    *(uint128_t *)&v97[20] = 0;
    v98 = v97 + 20;
    *(uint128_t *)&ptr[24] = 0;
    *v98 = 1;
    v99 = 0xff;
    *(unsigned long long *)&ptr[28] = 0;
    do
    {
        v100 = v99;
        if (((&v38)[v100] || *((char *)&v37 + v100)) && !(v100 >> 31 & 1))
        {
            v24 = v23;
            do
            {
                k = v100;
                sub_a10c84(&v12, ptr);
                v104 = (&v38)[k];
                v105 = v104 & 0xff;
                if ((int)v104 >= 1)
                {
                    sub_a10314(&v4, &v12, (char *)&v28 + 24);
                    sub_a10314((char *)&v6 + 8, &v20, (char *)&v24 + 24);
                    sub_a10314(&v8, (char *)&v24 + 24, (char *)&v28 + 24);
                    sub_a10314(&v11, &v12, &v20);
                    sub_a11760(&v12, &v4, &(&v29)[(unsigned int)(v105 >> 1) * 160]);
                }
                else if (v105 >> 7 & 1)
                {
                    sub_a10314(&v4, &v12, (char *)&v28 + 24);
                    sub_a10314((char *)&v6 + 8, &v20, (char *)&v24 + 24);
                    sub_a10314(&v8, (char *)&v24 + 24, (char *)&v28 + 24);
                    sub_a10314(&v11, &v12, &v20);
                    v106 = &(&v29)[(__ROL__(-(unsigned int)v105, 31) & 0x8000007f & 127) * 160];
                    v107 = *(unsigned int *)((void*)&v6 + 16);
                    v108 = *(unsigned int *)((void*)&v6 + 20);
                    v109 = *(unsigned int *)((void*)&v4 + 8);
                    v110 = *(unsigned int *)((void*)&v4 + 12);
                    v12 = _INSERT(CONCAT(v12, 0), 8, v109 + v107);
                    *(unsigned int *)((char *)&v12 + 12) = v110 + v108;
                    v111 = *(unsigned int *)&v7;
                    v112 = *(unsigned int *)((void*)&v7 + 20);
                    v113 = *(uint128_t *)&v6;
                    v114 = *(unsigned long long *)&v4;
                    v116 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_add_epi32(v114, __dirty_unsupported_Iop_SliceV128(v113, v113, 8)));
                    *(unsigned long *)&v12 = v116;
                    v117 = *(uint128_t *)((void*)&v7 + 4);
                    v119 = (__m128i)_INSERT(__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_unpacklo_epi64(v117, v117), _mm_unpacklo_epi64(v117, v117))), 0, __int_as_float(v111));
                    v21 = v107 - v109;
                    v22 = v108 - v110;
                    v120 = *(unsigned long long *)&v5;
                    v121 = *(unsigned long long *)((void*)&v5 + 8);
                    v122 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_add_epi32(v120, v119));
                    v125 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_add_epi32(v121, __dirty_unsupported_Iop_SliceV128(v117, v117, 4)));
                    v15 = CONCAT(v125, v122);
                    v128 = _INSERT(_mm_add_epi32(v113, _INSERT(CatOddLanesV(_mm_unpackhi_epi64(v117, v117), _mm_unpackhi_epi64(v117, v117)), 4, v112)), 8, _mm_extract_epi64(_mm_sub_epi32(v113, _INSERT(v114, 8, _mm_cvtsi128_si64(v114))), 1));
                    v17 = v128;
                    v129 = _INSERT(_INSERT(CatEvenLanesV(_mm_unpacklo_epi64(v113, v113), _mm_unpacklo_epi64(v113, v113)), 0, __int_as_float(_mm_extract_epi32(v120, 1))), 4, _mm_cvtsi128_si32(v121));
                    v130 = (__m128i)_INSERT(v129, 8, _mm_extract_epi32(v121, 1));
                    v25 = _INSERT(CONCAT((unsigned int)v24, 0), 4, _mm_sub_epi32(v117, v130));
                    *(unsigned int *)&v25 = v111 - _mm_cvtsi128_si32(v120);
                    *(unsigned int *)((char *)&v25 + 20) = v112 - _mm_extract_epi32(v113, 1);
                    sub_a10314((char *)&v25 + 24, &v12, v106 + 40);
                    sub_a10314((char *)&v17 + 8, (char *)&v17 + 8, v106);
                    sub_a10314((char *)&v28 + 24, v106 + 120, &v11);
                    sub_a10314(&v12, &v8, v106 + 80);
                    v131 = *(unsigned long long *)((void*)&v17 + 8);
                    v132 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_add_epi32(*(unsigned long long *)&v17, *(unsigned long long *)&v17));
                    v133 = *(unsigned int *)((void*)&v25 + 32);
                    v134 = *(unsigned int *)((void*)&v25 + 36);
                    v135 = v21;
                    v136 = v22;
                    v137 = *(unsigned int *)&v28;
                    v138 = *(unsigned int *)((void*)&v28 + 20);
                    v139 = *(uint128_t *)((void*)&v25 + 16);
                    v21 = v135 + v133;
                    v22 = v136 + v134;
                    v140 = *(uint128_t *)((void*)&v28 + 4);
                    v144 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_sub_epi32(__dirty_unsupported_Iop_SliceV128(v139, v139, 8), v131));
                    v145 = _mm_add_epi32(v12, v12);
                    v13 = v133 - v135;
                    v14 = v134 - v136;
                    v146 = _INSERT(_mm_sub_epi32(_INSERT(CatOddLanesV(_mm_unpackhi_epi64(v140, v140), _mm_unpackhi_epi64(v140, v140)), 4, v138), v139), 8, _mm_extract_epi64(_mm_add_epi32(_INSERT(v102, 8, _mm_cvtsi128_si64(v131)), v139), 1));
                    v18 = v146;
                    v12 = v144;
                    v148 = (__m128i)_INSERT(__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_unpacklo_epi64(v140, v140), _mm_unpacklo_epi64(v140, v140))), 0, __int_as_float(v137));
                    v149 = *(unsigned long long *)&v25;
                    v150 = *(unsigned long long *)((void*)&v25 + 8);
                    v151 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_sub_epi32(v148, v149));
                    v154 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_sub_epi32(__dirty_unsupported_Iop_SliceV128(v140, v140, 4), v150));
                    v155 = _INSERT(_INSERT(CatEvenLanesV(_mm_unpacklo_epi64(v139, v139), _mm_unpacklo_epi64(v139, v139)), 0, __int_as_float(_mm_extract_epi32(v149, 1))), 4, _mm_cvtsi128_si32(v150));
                    v156 = (__m128i)_INSERT(v155, 8, _mm_extract_epi32(v150, 1));
                    v157 = *(uint128_t *)((void*)&v28 + 24);
                    v102 = _mm_add_epi32(v15, v15);
                    v27 = _mm_extract_epi32(v139, 1) + v138;
                    v25 = _mm_cvtsi128_si32(v149) + v137;
                    v26 = _mm_add_epi32(v156, v140);
                    v15 = v151;
                    v16 = v154;
                    v158 = *(uint128_t *)((void*)&v28 + 40);
                    v24 = _INSERT(CONCAT(v25, 0), 24, _mm_sub_epi32(v145, v157));
                    *(__m128i *)&v28 = _mm_sub_epi32(v102, v158);
                    v159 = *(unsigned long long *)((void*)&v28 + 56);
                    v162 = _INSERT(__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_sub_epi32(v132, v159)), 8, (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_add_epi32(v157, v145)));
                    v166 = (__m128i)_INSERT(__dirty_unsupported_Iop_SliceV128(v158, v158, 8), 8, _mm_cvtsi128_si64(v159));
                    *(uint128_t *)((char *)&v28 + 16) = v162;
                    *(__m128i *)((char *)&v28 + 32) = _mm_add_epi32(__dirty_unsupported_Iop_SliceV128(v158, v157, 8), __dirty_unsupported_Iop_SliceV128(v102, v145, 8));
                    v168 = (__m128i)_INSERT(__dirty_unsupported_Iop_SliceV128(v102, v102, 8), 8, _mm_cvtsi128_si64(v132));
                    *(__m128i *)((char *)&v28 + 48) = _mm_add_epi32(v166, v168);
                }
                v169 = *((char *)&v37 + k);
                if (1 <= (int)v169)
                {
                    sub_a10314(&v4, &v12, (char *)&v28 + 24);
                    sub_a10314((char *)&v6 + 8, &v20, (char *)&v24 + 24);
                    sub_a10314(&v8, (char *)&v24 + 24, (char *)&v28 + 24);
                    sub_a10314(&v11, &v12, &v20);
                    sub_a109e0(&v12, &v4, &(&g_d44174)[(__ROL__((unsigned int)v169, 31) & 0x8000007f & 127) * 120]);
                }
                else if (v169 >> 31 & 1)
                {
                    sub_a10314(&v4, &v12, (char *)&v28 + 24);
                    sub_a10314((char *)&v6 + 8, &v20, (char *)&v24 + 24);
                    sub_a10314(&v8, (char *)&v24 + 24, (char *)&v28 + 24);
                    sub_a10314(&v11, &v12, &v20);
                    v170 = &(&g_d44174)[(__ROL__(-(unsigned int)v169, 31) & 0x8000007f & 127) * 120];
                    v171 = *(unsigned int *)((void*)&v6 + 16);
                    v172 = *(unsigned int *)((void*)&v6 + 20);
                    v173 = *(unsigned int *)((void*)&v4 + 8);
                    v174 = *(unsigned int *)((void*)&v4 + 12);
                    v13 = v173 + v171;
                    v14 = v174 + v172;
                    v175 = *(unsigned int *)&v7;
                    v176 = *(unsigned int *)((void*)&v7 + 20);
                    v177 = *(uint128_t *)&v6;
                    v178 = *(unsigned long long *)&v4;
                    v180 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_add_epi32(v178, __dirty_unsupported_Iop_SliceV128(v177, v177, 8)));
                    v12 = v180;
                    v181 = *(uint128_t *)((void*)&v7 + 4);
                    v183 = (__m128i)_INSERT(__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_unpacklo_epi64(v181, v181), _mm_unpacklo_epi64(v181, v181))), 0, __int_as_float(v175));
                    v21 = v171 - v173;
                    v22 = v172 - v174;
                    v184 = *(unsigned long long *)&v5;
                    v185 = *(unsigned long long *)((void*)&v5 + 8);
                    v186 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_add_epi32(v184, v183));
                    v189 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_add_epi32(v185, __dirty_unsupported_Iop_SliceV128(v181, v181, 4)));
                    v15 = v186;
                    v16 = v189;
                    v192 = _INSERT(_mm_add_epi32(v177, _INSERT(CatOddLanesV(_mm_unpackhi_epi64(v181, v181), _mm_unpackhi_epi64(v181, v181)), 4, v176)), 8, _mm_extract_epi64(_mm_sub_epi32(v177, _INSERT(v178, 8, _mm_cvtsi128_si64(v178))), 1));
                    v17 = v192;
                    v193 = _INSERT(_INSERT(CatEvenLanesV(_mm_unpacklo_epi64(v177, v177), _mm_unpacklo_epi64(v177, v177)), 0, __int_as_float(_mm_extract_epi32(v184, 1))), 4, _mm_cvtsi128_si32(v185));
                    v194 = (__m128i)_INSERT(v193, 8, _mm_extract_epi32(v185, 1));
                    v25 = _INSERT(CONCAT((unsigned int)v24, 0), 4, _mm_sub_epi32(v181, v194));
                    *(unsigned int *)&v25 = v175 - _mm_cvtsi128_si32(v184);
                    *(unsigned int *)((char *)&v25 + 20) = v176 - _mm_extract_epi32(v177, 1);
                    sub_a10314((char *)&v25 + 24, &v12, v170 + 40);
                    sub_a10314((char *)&v17 + 8, (char *)&v17 + 8, v170);
                    sub_a10314((char *)&v28 + 24, v170 + 80, &v11);
                    v195 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_add_epi32(v10, v10));
                    v196 = *(unsigned int *)((void*)&v25 + 32);
                    v197 = *(unsigned int *)((void*)&v25 + 36);
                    v198 = v21;
                    v199 = v22;
                    v13 = v196 - v198;
                    v14 = v197 - v199;
                    v200 = *(unsigned int *)&v28;
                    v201 = *(unsigned int *)((void*)&v28 + 20);
                    v202 = *(uint128_t *)((void*)&v25 + 16);
                    v203 = *(unsigned long long *)((void*)&v17 + 8);
                    v205 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_sub_epi32(__dirty_unsupported_Iop_SliceV128(v202, v202, 8), v203));
                    v12 = v205;
                    v206 = *(uint128_t *)((void*)&v28 + 4);
                    v21 = v198 + v196;
                    v22 = v199 + v197;
                    v208 = (__m128i)_INSERT(__dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_unpacklo_epi64(v206, v206), _mm_unpacklo_epi64(v206, v206))), 0, __int_as_float(v200));
                    v209 = *(unsigned long long *)&v25;
                    v210 = *(unsigned long long *)((void*)&v25 + 8);
                    v211 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_sub_epi32(v208, v209));
                    v214 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_sub_epi32(__dirty_unsupported_Iop_SliceV128(v206, v206, 4), v210));
                    v15 = v211;
                    v16 = v214;
                    v217 = _INSERT(_mm_sub_epi32(_INSERT(CatOddLanesV(_mm_unpackhi_epi64(v206, v206), _mm_unpackhi_epi64(v206, v206)), 4, v201), v202), 8, _mm_extract_epi64(_mm_add_epi32(_INSERT(v203, 8, _mm_cvtsi128_si64(v203)), v202), 1));
                    v218 = _INSERT(_INSERT(CatEvenLanesV(_mm_unpacklo_epi64(v202, v202), _mm_unpacklo_epi64(v202, v202)), 0, __int_as_float(_mm_extract_epi32(v209, 1))), 4, _mm_cvtsi128_si32(v210));
                    v219 = (__m128i)_INSERT(v218, 8, _mm_extract_epi32(v210, 1));
                    v19 = v217;
                    v26 = _mm_add_epi32(v219, v206);
                    v25 = _mm_cvtsi128_si32(v209) + v200;
                    v27 = _mm_extract_epi32(v202, 1) + v201;
                    v220 = _mm_add_epi32(v8, v8);
                    v221 = *(uint128_t *)((void*)&v28 + 24);
                    v222 = _mm_add_epi32(v9, v9);
                    v223 = *(uint128_t *)((void*)&v28 + 40);
                    v24 = _INSERT(CONCAT(v25, 0), 24, _mm_sub_epi32(v220, v221));
                    *(__m128i *)&v28 = _mm_sub_epi32(v222, v223);
                    v224 = *(unsigned long long *)((void*)&v28 + 56);
                    v102 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_add_epi32(v221, v220));
                    v226 = _INSERT(__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_sub_epi32(v195, v224)), 8, _mm_cvtsi128_si64(v102));
                    v230 = (__m128i)_INSERT(__dirty_unsupported_Iop_SliceV128(v223, v223, 8), 8, _mm_cvtsi128_si64(v224));
                    *(uint128_t *)((char *)&v28 + 16) = v226;
                    *(__m128i *)((char *)&v28 + 32) = _mm_add_epi32(__dirty_unsupported_Iop_SliceV128(v223, v221, 8), __dirty_unsupported_Iop_SliceV128(v222, v220, 8));
                    v232 = (__m128i)_INSERT(__dirty_unsupported_Iop_SliceV128(v222, v222, 8), 8, _mm_cvtsi128_si64(v195));
                    *(__m128i *)((char *)&v28 + 48) = _mm_add_epi32(v230, v232);
                }
                sub_a10314(ptr, &v12, (char *)&v28 + 24);
                sub_a10314(v96, &v20, (char *)&v24 + 24);
                v94 = sub_a10314(v98, (char *)&v24 + 24, (char *)&v28 + 24);
                v100 = k - 1;
            } while ((long long)k > 0);
        }
    } while ((v99 = (unsigned int)v100 - 1, v101 = arm64g_calculate_condition(0x11, v99, 1, 0), v101 & 1));
    if (*(long long *)&g_10002b0 == v39)
        return v94;
    ___stack_chk_fail();
}
