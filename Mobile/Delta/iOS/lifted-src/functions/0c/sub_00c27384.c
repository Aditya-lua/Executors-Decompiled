/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc27384..0xc27d50 (2508 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c27384_9 {
    unsigned long long field_0;
    unsigned long long field_8;
} st_c27384_9;

typedef struct st_c27384_8 {
    unsigned long long field_0;
    struct st_c27384_9 *field_8;
} st_c27384_8;

typedef struct st_c27384_0 {
    uint128_t field_0;
    unsigned long long field_10;
} st_c27384_0;

typedef struct st_c27384_4 {
    struct st_c27384_5 *field_0;
    struct st_c27384_5 *field_8;
    struct st_c27384_1 *field_10;
    struct st_c27384_6 *field_18;
} st_c27384_4;

typedef struct st_c27384_5 {
    unsigned int field_0;
} st_c27384_5;

typedef struct st_c27384_2 {
    struct st_c27384_3 *field_0;
    unsigned long long field_8;
    char padding_10[8];
    unsigned long long field_18;
    unsigned long long field_20;
    unsigned long long field_28;
} st_c27384_2;

typedef struct st_c27384_1 {
    void* field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
    unsigned long long field_20;
    unsigned long long field_28;
} st_c27384_1;

typedef struct st_c27384_3 {
    unsigned long long field_0;
} st_c27384_3;

typedef struct st_c27384_6 {
    struct st_c27384_2 *field_0;
} st_c27384_6;

typedef struct st_c27384_7 {
    unsigned long long field_0;
    char field_8;
} st_c27384_7;

extern long long g_efc6c8;

double sub_c27384(st_c27384_0 *a0, st_c27384_4 *a1)
{
    unsigned int *v16;  // x19
    unsigned long long v17;  // x8
    __m128i v26;  // q3
    unsigned long v115;  // x14
    unsigned long v116;  // x12
    unsigned long long v117;  // x13
    unsigned long v118;  // x12
    unsigned long long v119;  // x16
    unsigned long long v120;  // x11
    unsigned long v121;  // x14
    unsigned long long v122;  // x13
    unsigned long long v123;  // x11
    unsigned long v124;  // x14
    unsigned long v125;  // x12
    unsigned long long v126;  // x11
    unsigned long long v127;  // x13
    unsigned long v128;  // x14
    unsigned long v129;  // x12
    unsigned long long v130;  // x13
    unsigned long long v131;  // x11
    unsigned long v132;  // x14
    unsigned long v133;  // x12
    unsigned long long v134;  // x11
    unsigned long long v27;  // x22
    unsigned long long v135;  // x13
    unsigned long v136;  // x13
    unsigned long long v137;  // x12
    unsigned long long *v138;  // x10
    unsigned long v139;  // x11
    __m128i v140;  // q0
    unsigned long long v141;  // x12
    __m128i v142;  // q1
    unsigned long v144;  // x13
    unsigned long long v28;  // x8
    unsigned long long v145;  // x13
    uint128_t v146;  // q1
    unsigned long v149;  // x13
    unsigned long long v150;  // x13
    unsigned long long v151;  // 4128
    unsigned long long v152;  // 4130
    unsigned long long v153;  // x14
    unsigned long long v154;  // x14
    unsigned long v29;  // x9
    void* v155;  // x14
    unsigned long long v156;  // x14
    unsigned long long v157;  // x0
    unsigned long v158;  // x8
    unsigned long long v159;  // 4109
    unsigned long v160;  // x20
    unsigned long long v161;  // x22
    unsigned long long ptr;  // x0
    unsigned long long *v163;  // x8
    unsigned long long idx;  // x23
    unsigned long v30;  // x13
    unsigned long long v165;  // x0
    unsigned long long *v166;  // x19
    st_c27384_2 *v168;  // x11
    unsigned long long v169;  // x9
    unsigned long long v170;  // 4131
    unsigned long long v171;  // 4133
    unsigned long long v172;  // x12
    unsigned long long v173;  // x12
    unsigned long v174;  // x10
    unsigned long long v31;  // x14
    unsigned long v175;  // x15
    unsigned long long v176;  // x16
    unsigned long v177;  // x13
    unsigned long long v178;  // x14
    unsigned long long v179;  // x12
    unsigned long v180;  // x15
    unsigned long v181;  // x13
    unsigned long long v182;  // x14
    unsigned long v183;  // x13
    unsigned long long v184;  // x12
    unsigned long v32;  // x11
    unsigned long v185;  // x15
    unsigned long long v186;  // x14
    unsigned long long v187;  // x12
    unsigned long v188;  // x15
    unsigned long v189;  // x13
    unsigned long long v190;  // x12
    unsigned long long v191;  // x14
    unsigned long v192;  // x15
    unsigned long v193;  // x13
    unsigned long long v194;  // x14
    unsigned long long v33;  // x12
    unsigned long long v195;  // x12
    unsigned long v196;  // x15
    unsigned long v197;  // x13
    unsigned long long v198;  // x12
    unsigned long long v199;  // x14
    unsigned long v200;  // x14
    unsigned long long v201;  // x13
    unsigned long long *v202;  // x11
    unsigned long v203;  // x12
    __m128i v204;  // q0
    unsigned long long v34;  // x10
    unsigned long long v205;  // x13
    __m128i v206;  // q1
    unsigned long v208;  // x14
    unsigned long long v209;  // x14
    uint128_t v210;  // q1
    unsigned long v213;  // x14
    unsigned long long v214;  // x14
    st_c27384_4 *v18;  // x21
    unsigned long v35;  // x13
    unsigned long long v215;  // 4128
    unsigned long long v216;  // 4130
    unsigned long long v217;  // x15
    unsigned long long v218;  // x15
    void* v219;  // x15
    unsigned long long v220;  // x15
    unsigned long long v221;  // 4113
    st_c27384_8 *v222;  // x10
    unsigned long long *v223;  // x10
    unsigned long v36;  // x11
    unsigned long long v37;  // x12
    unsigned long v38;  // x11
    unsigned long long v39;  // x10
    unsigned long v40;  // x13
    unsigned long long v41;  // x12
    unsigned long long v42;  // x10
    unsigned long v43;  // x13
    unsigned long v44;  // x11
    st_c27384_0 *v19;  // x23
    unsigned long long v45;  // x10
    unsigned long long v46;  // x12
    unsigned long v47;  // x13
    unsigned long v48;  // x11
    unsigned long long v49;  // x12
    unsigned long long v50;  // x10
    unsigned long v51;  // x13
    unsigned long v52;  // x11
    unsigned long long v53;  // x10
    unsigned long long v54;  // x12
    unsigned long long v20;  // x26
    unsigned long v55;  // x12
    unsigned long long v56;  // x12
    void* v57;  // x10
    unsigned long v58;  // x11
    __m128i v59;  // q0
    unsigned long long v60;  // x13
    __m128i v61;  // q1
    unsigned long v63;  // x12
    unsigned long long v64;  // x14
    unsigned long long v21;  // x21
    __m128i v65;  // q1
    unsigned long v68;  // x12
    unsigned long long v69;  // x14
    unsigned long long v70;  // 4128
    unsigned long long v71;  // 4130
    unsigned long long v72;  // x12
    unsigned long long v73;  // x12
    unsigned long long v74;  // x15
    unsigned long long ptr1;  // x0
    void* v75;  // x12
    unsigned long long v76;  // x12
    unsigned long long v77;  // x8
    st_c27384_7 *v78;  // x9
    unsigned long v79;  // d0
    unsigned long long v80;  // x11
    unsigned long v81;  // d0
    unsigned long v82;  // x13
    unsigned long long v83;  // x11
    unsigned long long v84;  // 4128
    unsigned long long iter;  // x24
    unsigned long long v85;  // 4130
    unsigned long long v86;  // x13
    unsigned long long v87;  // x13
    char v88;  // x11
    double *node;  // x27
    unsigned long long v90;  // x25
    unsigned long v91;  // x21
    unsigned long long v92;  // x9
    unsigned long v93;  // x8
    unsigned long long v94;  // x8
    st_c27384_1 *v24;  // x28
    unsigned long long v95;  // 4125
    unsigned long long *v96;  // x19
    unsigned long v97;  // d0
    unsigned long v98;  // x8
    unsigned long long i;  // x9
    unsigned long long *v100;  // x19
    st_c27384_2 *v102;  // x10
    unsigned long long v103;  // x8
    unsigned long long v104;  // 4131
    unsigned long long v25;  // x3
    unsigned long long v105;  // 4133
    unsigned long long v106;  // x12
    unsigned long long v107;  // x12
    unsigned long long j;  // x26
    unsigned long v109;  // x9
    unsigned long v110;  // x14
    unsigned long long v111;  // x15
    unsigned long v112;  // x12
    unsigned long long v113;  // x13
    unsigned long long v114;  // x11
    unsigned long long v0;  // [bp-0xd8]
    st_c27384_0 *v1;  // [bp-0xd0]
    unsigned long long v2;  // [bp-0xc8]
    unsigned int v3;  // [bp-0xbc]
    st_c27384_0 *v4;  // [bp-0xb8]
    unsigned long long v5;  // [bp-0xb0]
    long long v6;  // [bp-0xa8]
    st_c27384_2 **v7;  // [bp-0xa0]
    unsigned int *v8;  // [bp-0x98]
    uint128_t v9;  // [bp-0x90]
    unsigned long long v10;  // [bp-0x80]
    unsigned long v11;  // [bp-0x78]
    unsigned long long *v12;  // [bp-0x70]
    unsigned long long v13;  // [bp-0x68]
    char *v14;  // [bp-0x10]
    char v15;  // [bp+0x0]

    v14 = &v15;
    v16 = a1->field_8;
    v8 = a1->field_0;
    v17 = v16 - a1->field_0;
    if (v17 >= 1537228672809129301)
    {
        a1 = v18;
        a0 = sub_c6b970(0, a1);
    }
    v19 = a0;
    v20 = v17 >> 2;
    v21 = (v20 + (v17 >> 1)) * 8;
    if (v21)
    {
        ptr1 = _malloc(v21);
        if (ptr1)
        {
            v9 = CONCAT(ptr1, v20);
            v10 = 0;
            if (v8 == v16)
            {
                v19->field_0 = v9;
                v19->field_10 = 0;
                return (unsigned long long)v9;
            }
LABEL_c2740c:
            iter = 0;
            v24 = a1->field_10;
            v7 = a1->field_18;
            v25 = 7237128888997146477;
            v26 = _mm_set1_epi32(-1);
            while (1)
            {
                while (1)
                {
                    v28 = 0;
                    v29 = v8[iter];
                    v30 = v24->field_28 ^ v25;
                    v31 = v29 | 0x400000000000000;
                    v32 = v24->field_28 ^ 8387220255154660723 ^ v31;
                    v33 = v30 + (v24->field_20 ^ 8317987319222330741);
                    v34 = v32 + (v24->field_20 ^ 7816392313619706465);
                    v35 = v33 ^ __ROL__(v30, 13);
                    v36 = v34 ^ __ROL__(v32, 16);
                    v37 = v36 + __ROL__(v33, 32);
                    v38 = v37 ^ __ROL__(v36, 21);
                    v39 = v34 + v35;
                    v40 = v39 ^ __ROL__(v35, 0x11);
                    v41 = (v37 ^ v31) + v40;
                    v42 = v38 + (__ROL__(v39, 32) ^ 0xff);
                    v43 = v41 ^ __ROL__(v40, 13);
                    v44 = v42 ^ __ROL__(v38, 16);
                    v45 = v43 + v42;
                    v46 = v44 + __ROL__(v41, 32);
                    v47 = v45 ^ __ROL__(v43, 0x11);
                    v48 = v46 ^ __ROL__(v44, 21);
                    v49 = v47 + v46;
                    v50 = v48 + __ROL__(v45, 32);
                    v51 = v49 ^ __ROL__(v47, 13);
                    v52 = v50 ^ __ROL__(v48, 16);
                    v53 = v51 + v50;
                    v54 = v52 + __ROL__(v49, 32);
                    v55 = (v53 ^ __ROL__(v51, 0x11)) + v54 ^ __ROL__(v53 ^ __ROL__(v51, 0x11), 13);
                    v56 = __ROL__((v54 ^ __ROL__(v52, 21)) + __ROL__(v53, 32) ^ __ROL__(v54 ^ __ROL__(v52, 21), 16), 21) ^ __ROL__(v55, 0x11) ^ __ROL__(v55 + (v54 ^ __ROL__(v52, 21)) + __ROL__(v53, 32), 32) ^ v55 + (v54 ^ __ROL__(v52, 21)) + __ROL__(v53, 32);
                    v57 = v24->field_0;
                    v58 = v24->field_8;
                    v59 = v56 >> 57 & 0xff | (v56 >> 57 & 0xff) * 0x100 | (v56 >> 57 & 0xff | (v56 >> 57 & 0xff) * 0x100) * 0x10000 | (v56 >> 57 & 0xff | (v56 >> 57 & 0xff) * 0x100 | (v56 >> 57 & 0xff | (v56 >> 57 & 0xff) * 0x100) * 0x10000) * 0x100000000;
                    v60 = v56 & v58;
                    v61 = *(long long *)((char *)v57 + v60);
                    v63 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v61, v59));
                    v64 = v63 & 0x8080808080808080;
                    if (!(v63 & 0x8080808080808080))
                    {
                        do
                        {
LABEL_c2759c:
                            v65 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v61, v26));
                            if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v65, v65), _mm_unpacklo_epi64(v65, v65)))))))))) & 1)
                                goto LABEL_c27b74;
                            v28 += 8;
                            v60 = v60 + v28 & v58;
                            v61 = *(long long *)((char *)v57 + v60);
                            v68 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v61, v59));
                            v64 = v68 & 0x8080808080808080;
                        } while (!(v68 & 0x8080808080808080));
                    }
                    while (1)
                    {
                        v69 = v64;
                        v70 = ((((((v69 & 0xaaaaaaaaaaaaaaaa) >> 1 | v69 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v69 & 0xaaaaaaaaaaaaaaaa) >> 1 | v69 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v69 & 0xaaaaaaaaaaaaaaaa) >> 1 | v69 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v69 & 0xaaaaaaaaaaaaaaaa) >> 1 | v69 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                        v71 = (((((((v69 & 0xaaaaaaaaaaaaaaaa) >> 1 | v69 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v69 & 0xaaaaaaaaaaaaaaaa) >> 1 | v69 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v69 & 0xaaaaaaaaaaaaaaaa) >> 1 | v69 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v69 & 0xaaaaaaaaaaaaaaaa) >> 1 | v69 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                        v72 = ((((v71 | v70) & 0xffff0000ffff0000) >> 16 | (v71 | v70) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v71 | v70) & 0xffff0000ffff0000) >> 16 | (v71 | v70) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                        if (!v72)
                            v73 = 64;
                        else
                            v73 = Clz(v72);
                        v74 = v60 + (v73 >> 3) & v58;
                        v75 = v57 + -(56 * v74);
                        if ((unsigned int)v29 == *(int *)((char *)v75 - 56))
                            break;
                        v76 = v69 - 1;
                        v64 = v76 & v69;
                        if (!(v76 & v69))
                            goto LABEL_c2759c;
                    }
                    v77 = 7905747460161236407 * ((long long)(v74 * 56) >> 3);
                    v78 = v57 + (v77 - 8 & v58);
                    v79 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(*(unsigned long long *)&*(double *)&v78->field_0, v26));
                    v80 = __double_as_longlong(v79);
                    v81 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(*(long long *)((char *)v57 + v77), v26));
                    v82 = __double_as_longlong(v81);
                    if (!v80)
                        v83 = 64;
                    else
                        v83 = Clz(v80);
                    v84 = ((((((v82 & 0xaaaaaaaaaaaaaaaa) >> 1 | v82 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v82 & 0xaaaaaaaaaaaaaaaa) >> 1 | v82 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v82 & 0xaaaaaaaaaaaaaaaa) >> 1 | v82 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v82 & 0xaaaaaaaaaaaaaaaa) >> 1 | v82 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                    v85 = (((((((v82 & 0xaaaaaaaaaaaaaaaa) >> 1 | v82 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v82 & 0xaaaaaaaaaaaaaaaa) >> 1 | v82 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v82 & 0xaaaaaaaaaaaaaaaa) >> 1 | v82 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v82 & 0xaaaaaaaaaaaaaaaa) >> 1 | v82 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                    v86 = ((((v85 | v84) & 0xffff0000ffff0000) >> 16 | (v85 | v84) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v85 | v84) & 0xffff0000ffff0000) >> 16 | (v85 | v84) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                    if (!v86)
                        v87 = 64;
                    else
                        v87 = Clz(v86);
                    if ((v87 >> 3) + (v83 >> 3) > 7)
                    {
                        v88 = 128;
                    }
                    else
                    {
                        v24->field_10 = v24->field_10 + 1;
                        v88 = 0xff;
                    }
                    *((char *)v57 + v77) = v88;
                    v78->field_8 = v88;
                    v24->field_18 = v24->field_18 - 1;
                    node = *(long long *)((char *)v75 - 48);
                    if (!node)
                    {
LABEL_c27b74:
                        v91 = 0;
LABEL_c27b78:
                        v94 = 0;
                        goto LABEL_c27b7c;
                    }
                    v90 = *(long long *)((char *)v75 - 40);
                    v91 = *(long long *)((char *)v75 - 24);
                    if (!v90)
                        break;
                    v92 = v90 * 4 + 11 & 0xfffffffffffffff8;
                    v93 = v90 + v92;
                    v94 = v93 + 9;
                    v95 = arm64g_calculate_condition(18, v93, 9, 0);
                    v27 = !(v95 & 1);
                    if (v91)
                    {
                        v6 = (char *)node - v92;
                        goto LABEL_c27690;
                    }
                    else if (v94)
                    {
                        v27 = v25;
                        _free();
                        v26 = _mm_set1_epi32(-1);
                        v25 = v27;
                        goto LABEL_c27b74;
                    }
                    else
                    {
                        v91 = 0;
LABEL_c27b7c:
                        v223 = ptr1 + 24 * iter;
                        *v223 = v94;
                        v223[1] = 8;
                        v223[2] = v91;
                        iter += 1;
                        if (iter == v20)
                        {
                            v19->field_0 = v9;
                            v19->field_10 = iter;
                            return (unsigned long long)v9;
                        }
                    }
                }
                if (!v91)
                    goto LABEL_c27b78;
LABEL_c27690:
                v96 = node + 1;
                v97 = __dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), *(unsigned long long *)&*node));
                v98 = __double_as_longlong(v97);
                i = v98 & 0x8080808080808080;
                v5 = v20;
                v100 = v96;
                if (!(v98 & 0x8080808080808080))
                {
                    do
                    {
                        v100 = v96 + 1;
                        node = (char *)node - 32;
                        i = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v96)) & 0x8080808080808080;
                        v96 = v100;
                    } while (!i);
                }
                v102 = *v7;
                if (!v102->field_18)
                {
                    sub_c73c64(&g_efc6c8);
                    __debugbreak();
                }
                v103 = 0;
                v104 = ((((((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                v105 = (((((((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                v106 = ((((v105 | v104) & 0xffff0000ffff0000) >> 16 | (v105 | v104) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v105 | v104) & 0xffff0000ffff0000) >> 16 | (v105 | v104) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                if (!v106)
                    v107 = 64;
                else
                    v107 = Clz(v106);
                j = i - 1 & i;
                v109 = *(int *)((char *)node - (v107 >> 1 & 60) - 4);
                v110 = v102->field_28 ^ v25;
                v111 = v109 | 0x400000000000000;
                v112 = v102->field_28 ^ 8387220255154660723 ^ v111;
                v113 = v110 + (v102->field_20 ^ 8317987319222330741);
                v114 = v112 + (v102->field_20 ^ 7816392313619706465);
                v115 = v113 ^ __ROL__(v110, 13);
                v116 = v114 ^ __ROL__(v112, 16);
                v117 = v116 + __ROL__(v113, 32);
                v118 = v117 ^ __ROL__(v116, 21);
                v119 = v91 - 1;
                v120 = v114 + v115;
                v121 = v120 ^ __ROL__(v115, 0x11);
                v122 = (v117 ^ v111) + v121;
                v123 = v118 + (__ROL__(v120, 32) ^ 0xff);
                v124 = v122 ^ __ROL__(v121, 13);
                v125 = v123 ^ __ROL__(v118, 16);
                v126 = v124 + v123;
                v127 = v125 + __ROL__(v122, 32);
                v128 = v126 ^ __ROL__(v124, 0x11);
                v129 = v127 ^ __ROL__(v125, 21);
                v130 = v128 + v127;
                v131 = v129 + __ROL__(v126, 32);
                v132 = v130 ^ __ROL__(v128, 13);
                v133 = v131 ^ __ROL__(v129, 16);
                v134 = v132 + v131;
                v135 = v133 + __ROL__(v130, 32);
                v136 = (v134 ^ __ROL__(v132, 0x11)) + v135 ^ __ROL__(v134 ^ __ROL__(v132, 0x11), 13);
                v137 = __ROL__((v135 ^ __ROL__(v133, 21)) + __ROL__(v134, 32) ^ __ROL__(v135 ^ __ROL__(v133, 21), 16), 21) ^ __ROL__(v136, 0x11) ^ __ROL__(v136 + (v135 ^ __ROL__(v133, 21)) + __ROL__(v134, 32), 32) ^ v136 + (v135 ^ __ROL__(v133, 21)) + __ROL__(v134, 32);
                v138 = v102->field_0;
                v139 = v102->field_8;
                v140 = v137 >> 57 & 0xff | (v137 >> 57 & 0xff) * 0x100 | (v137 >> 57 & 0xff | (v137 >> 57 & 0xff) * 0x100) * 0x10000 | (v137 >> 57 & 0xff | (v137 >> 57 & 0xff) * 0x100 | (v137 >> 57 & 0xff | (v137 >> 57 & 0xff) * 0x100) * 0x10000) * 0x100000000;
                v141 = v137 & v139;
                v142 = *(long long *)((char *)v138 + v141);
                v144 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v142, v140));
                v145 = v144 & 0x8080808080808080;
                if (!(v144 & 0x8080808080808080))
                {
                    do
                    {
LABEL_c27818:
                        v146 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v142, v26));
                        if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v146, v146), _mm_unpacklo_epi64(v146, v146)))))))))) & 1)
                        {
                            sub_c73c64(&g_efc6c8);
                            __debugbreak();
                        }
                        v103 += 8;
                        v141 = v141 + v103 & v139;
                        v142 = *(long long *)((char *)v138 + v141);
                        v149 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v142, v140));
                        v145 = v149 & 0x8080808080808080;
                    } while (!(v149 & 0x8080808080808080));
                }
                while (1)
                {
                    v150 = v145;
                    v151 = ((((((v150 & 0xaaaaaaaaaaaaaaaa) >> 1 | v150 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v150 & 0xaaaaaaaaaaaaaaaa) >> 1 | v150 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v150 & 0xaaaaaaaaaaaaaaaa) >> 1 | v150 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v150 & 0xaaaaaaaaaaaaaaaa) >> 1 | v150 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                    v152 = (((((((v150 & 0xaaaaaaaaaaaaaaaa) >> 1 | v150 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v150 & 0xaaaaaaaaaaaaaaaa) >> 1 | v150 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v150 & 0xaaaaaaaaaaaaaaaa) >> 1 | v150 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v150 & 0xaaaaaaaaaaaaaaaa) >> 1 | v150 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                    v153 = ((((v152 | v151) & 0xffff0000ffff0000) >> 16 | (v152 | v151) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v152 | v151) & 0xffff0000ffff0000) >> 16 | (v152 | v151) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                    if (!v153)
                        v154 = 64;
                    else
                        v154 = Clz(v153);
                    v155 = &v138[-2 * (v141 + (v154 >> 3) & v139)];
                    if ((unsigned int)v109 == *(int *)((char *)v155 - 16))
                        break;
                    v156 = v150 - 1;
                    v145 = v156 & v150;
                    if (!(v156 & v150))
                        goto LABEL_c27818;
                }
                v157 = 0;
                v158 = v119 + 1;
                v159 = arm64g_calculate_condition(50, v119, 1, 0);
                if (!(v159 & 1))
                    v158 = 0xffffffffffffffff;
                if (4 < v158)
                    v160 = v158;
                else
                    v160 = 4;
                if (v158 > 0x1fffffffffffffff || !(v1 = v19, v19 = v160 * 8, 0x7ffffffffffffff8 >= v19))
                    break;
                v161 = v91 - 1;
                v3 = v27;
                v2 = v90;
                v0 = ptr1;
                ptr = _malloc(v19);
                if (!ptr)
                    goto LABEL_c27cb4;
                *(long long *)ptr = *(long long *)((char *)v155 - 8);
                v163 = ptr;
                idx = 1;
                v11 = v160;
                v12 = ptr;
                v4 = ptr;
                v26 = _mm_set1_epi32(-1);
                v165 = v161;
                v27 = v161;
                while (1)
                {
                    v13 = idx;
                    if (!v165)
                        break;
                    v166 = v100;
                    if (!j)
                    {
                        do
                        {
                            v166 = v100 + 1;
                            node = (char *)node - 32;
                            j = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v100)) & 0x8080808080808080;
                        } while (!j);
                    }
                    v168 = *v7;
                    if (!v168->field_18)
                    {
                        sub_c73c64(&g_efc6c8);
                        __debugbreak();
                    }
                    v169 = 0;
                    v170 = ((((((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                    v171 = (((((((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((j & 0xaaaaaaaaaaaaaaaa) >> 1 | j * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                    v172 = ((((v171 | v170) & 0xffff0000ffff0000) >> 16 | (v171 | v170) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v171 | v170) & 0xffff0000ffff0000) >> 16 | (v171 | v170) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                    if (!v172)
                        v173 = 64;
                    else
                        v173 = Clz(v172);
                    j &= j - 1;
                    v174 = *(int *)((char *)node - (v173 >> 1 & 60) - 4);
                    v175 = v168->field_28 ^ 7237128888997146477;
                    v176 = v174 | 0x400000000000000;
                    v177 = v168->field_28 ^ 8387220255154660723 ^ v176;
                    v178 = v175 + (v168->field_20 ^ 8317987319222330741);
                    v179 = v177 + (v168->field_20 ^ 7816392313619706465);
                    v180 = v178 ^ __ROL__(v175, 13);
                    v181 = v179 ^ __ROL__(v177, 16);
                    v182 = v181 + __ROL__(v178, 32);
                    v183 = v182 ^ __ROL__(v181, 21);
                    v165 -= 1;
                    v184 = v179 + v180;
                    v185 = v184 ^ __ROL__(v180, 0x11);
                    v186 = (v182 ^ v176) + v185;
                    v187 = v183 + (__ROL__(v184, 32) ^ 0xff);
                    v188 = v186 ^ __ROL__(v185, 13);
                    v189 = v187 ^ __ROL__(v183, 16);
                    v190 = v188 + v187;
                    v191 = v189 + __ROL__(v186, 32);
                    v192 = v190 ^ __ROL__(v188, 0x11);
                    v193 = v191 ^ __ROL__(v189, 21);
                    v194 = v192 + v191;
                    v195 = v193 + __ROL__(v190, 32);
                    v196 = v194 ^ __ROL__(v192, 13);
                    v197 = v195 ^ __ROL__(v193, 16);
                    v198 = v196 + v195;
                    v199 = v197 + __ROL__(v194, 32);
                    v200 = (v198 ^ __ROL__(v196, 0x11)) + v199 ^ __ROL__(v198 ^ __ROL__(v196, 0x11), 13);
                    v201 = __ROL__((v199 ^ __ROL__(v197, 21)) + __ROL__(v198, 32) ^ __ROL__(v199 ^ __ROL__(v197, 21), 16), 21) ^ __ROL__(v200, 0x11) ^ __ROL__(v200 + (v199 ^ __ROL__(v197, 21)) + __ROL__(v198, 32), 32) ^ v200 + (v199 ^ __ROL__(v197, 21)) + __ROL__(v198, 32);
                    v202 = v168->field_0;
                    v203 = v168->field_8;
                    v204 = v201 >> 57 & 0xff | (v201 >> 57 & 0xff) * 0x100 | (v201 >> 57 & 0xff | (v201 >> 57 & 0xff) * 0x100) * 0x10000 | (v201 >> 57 & 0xff | (v201 >> 57 & 0xff) * 0x100 | (v201 >> 57 & 0xff | (v201 >> 57 & 0xff) * 0x100) * 0x10000) * 0x100000000;
                    v205 = v201 & v203;
                    v206 = *(long long *)((char *)v202 + v205);
                    v208 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v206, v204));
                    v209 = v208 & 0x8080808080808080;
                    if (!(v208 & 0x8080808080808080))
                    {
                        do
                        {
LABEL_c27a80:
                            v210 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v206, v26));
                            if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v210, v210), _mm_unpacklo_epi64(v210, v210)))))))))) & 1)
                            {
                                sub_c73c64(&g_efc6c8);
                                __debugbreak();
                            }
                            v169 += 8;
                            v205 = v205 + v169 & v203;
                            v206 = *(long long *)((char *)v202 + v205);
                            v213 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v206, v204));
                            v209 = v213 & 0x8080808080808080;
                        } while (!(v213 & 0x8080808080808080));
                    }
                    while (1)
                    {
                        v214 = v209;
                        v215 = ((((((v214 & 0xaaaaaaaaaaaaaaaa) >> 1 | v214 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v214 & 0xaaaaaaaaaaaaaaaa) >> 1 | v214 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v214 & 0xaaaaaaaaaaaaaaaa) >> 1 | v214 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v214 & 0xaaaaaaaaaaaaaaaa) >> 1 | v214 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                        v216 = (((((((v214 & 0xaaaaaaaaaaaaaaaa) >> 1 | v214 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v214 & 0xaaaaaaaaaaaaaaaa) >> 1 | v214 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v214 & 0xaaaaaaaaaaaaaaaa) >> 1 | v214 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v214 & 0xaaaaaaaaaaaaaaaa) >> 1 | v214 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                        v217 = ((((v216 | v215) & 0xffff0000ffff0000) >> 16 | (v216 | v215) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v216 | v215) & 0xffff0000ffff0000) >> 16 | (v216 | v215) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                        if (!v217)
                            v218 = 64;
                        else
                            v218 = Clz(v217);
                        v219 = &v202[-2 * (v205 + (v218 >> 3) & v203)];
                        if ((unsigned int)v174 == *(int *)((char *)v219 - 16))
                        {
                            if (idx == v11)
                            {
                                v27 = v165;
                                v221 = arm64g_calculate_condition(50, v165, 1, 0);
                                sub_c736c8();
                                v163 = v12;
                                v26 = _mm_set1_epi32(-1);
                                v165 = v27;
                            }
                            v163[idx] = *(long long *)((char *)v219 - 8);
                            idx += 1;
                            break;
                        }
                        v220 = v214 - 1;
                        v209 = v220 & v214;
                        if (!(v220 & v214))
                            goto LABEL_c27a80;
                    }
                }
                if (!(v3 & 1) && v2)
                {
                    _free(v6);
                    v26 = _mm_set1_epi32(-1);
                }
                v25 = 7237128888997146477;
                ptr1 = v0;
                v19 = v1;
                v20 = v5;
                v222 = ptr1 + 24 * iter;
                v222->field_0 = v11;
                v222->field_8 = v12;
                v222[1].field_0 = v91;
                iter += 1;
                if (iter == v20)
                {
                    v19->field_0 = v9;
                    v19->field_10 = iter;
                    return (unsigned long long)v9;
                }
            }
        }
        else
        {
            sub_c6b970(8, v21);
LABEL_c27cb4:
            v157 = 8;
            v4 = v19;
        }
        sub_c6b970(v157, v4);
        __debugbreak();
    }
    else
    {
        ptr1 = 8;
        v9 = CONCAT(8, 0);
        v10 = 0;
        if (v8 == v16)
        {
            v19->field_0 = v9;
            v19->field_10 = 0;
            return (unsigned long long)v9;
        }
        goto LABEL_c2740c;
    }
}
