/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9ee090..0x9ee860 (2000 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9ee090_0 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    uint128_t field_40;
    uint128_t field_50;
    uint128_t field_60;
    uint128_t field_70;
    unsigned long long field_80;
} st_9ee090_0;

typedef struct st_9ee090_4 {
    uint128_t field_0;
    uint128_t field_10;
    unsigned int field_20;
} st_9ee090_4;

typedef struct st_9ee090_3 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    unsigned int field_40;
} st_9ee090_3;

typedef struct st_9ee090_2 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    uint128_t field_40;
    uint128_t field_50;
    unsigned int field_60;
} st_9ee090_2;

typedef struct st_9ee090_1 {
    unsigned int field_0;
    unsigned int field_4;
    unsigned int field_8;
    unsigned int field_c;
} st_9ee090_1;

extern st_9ee090_1 g_d34ee8;
extern st_9ee090_1 g_d352e8;
extern st_9ee090_1 g_d356e8;
extern st_9ee090_1 g_d35ae8;
extern char _NSHomeDirectory;
extern char g_10002b0;

double sub_9ee090(st_9ee090_0 *a0, unsigned long long a1, void* a2)
{
    unsigned long long v8;  // x8
    unsigned long long v9;  // x9
    unsigned long long v18;  // 4120
    unsigned int v108;  // w22
    unsigned int v109;  // w21
    unsigned int v110;  // w11
    unsigned int v111;  // w6
    unsigned int v112;  // w24
    unsigned int v113;  // w25
    unsigned int v114;  // w26
    unsigned int v115;  // w27
    unsigned int v116;  // w28
    unsigned int v117;  // w7
    void* iter;  // x10
    unsigned int v118;  // w11
    unsigned int v119;  // w14
    unsigned int v120;  // w4
    unsigned int v121;  // w25
    unsigned int v122;  // w4
    unsigned int v123;  // w22
    unsigned int v124;  // w24
    unsigned int v125;  // w26
    unsigned int v126;  // w26
    unsigned int v127;  // w5
    void* v20;  // x11
    unsigned int v128;  // w22
    unsigned int v129;  // w27
    unsigned int v130;  // w15
    unsigned int v131;  // w11
    unsigned int v132;  // w20
    unsigned int v133;  // w4
    unsigned int v134;  // w21
    unsigned int v135;  // w6
    unsigned int v136;  // w5
    unsigned int v137;  // w24
    unsigned long long i;  // x8
    unsigned int v138;  // w22
    unsigned int v139;  // w25
    unsigned int v140;  // w27
    unsigned int v141;  // w1
    unsigned int v142;  // w11
    unsigned int v143;  // w22
    unsigned int v144;  // w5
    unsigned int v145;  // w25
    unsigned int v146;  // w4
    unsigned int v147;  // w23
    unsigned long long v22;  // x8
    __m128i v148;  // q0
    uint128_t v149;  // q3
    uint128_t v150;  // q4
    __m128i v151;  // q1
    st_9ee090_2 *v152;  // x8
    __m128i v153;  // q16
    __m128i v154;  // q1
    __m128i v155;  // q5
    __m128i v156;  // q6
    __m128i v157;  // q17
    void* v23;  // x11
    st_9ee090_3 *v158;  // x8
    __m128i v159;  // q2
    st_9ee090_4 *v160;  // x8
    unsigned long long v25;  // w8
    unsigned int v26;  // w15
    unsigned int v27;  // w14
    __m128i v10;  // q1
    unsigned long index;  // x4
    unsigned int v29;  // w17
    unsigned int v30;  // w1
    unsigned int v31;  // w16
    unsigned int v32;  // w2
    unsigned int v33;  // w5
    unsigned int v34;  // w19
    unsigned int v35;  // w7
    unsigned long idx;  // x11
    unsigned int v37;  // w3
    __m128i v11;  // q0
    unsigned int v38;  // w20
    unsigned int *v39;  // x13
    unsigned int v40;  // w4
    unsigned int *j;  // x13
    unsigned int v42;  // w6
    unsigned int v43;  // w21
    unsigned int v44;  // w4
    unsigned int v45;  // w7
    unsigned int v46;  // w5
    unsigned int v47;  // w15
    unsigned long long v12;  // x12
    unsigned int v48;  // w1
    unsigned int v49;  // w2
    unsigned int v50;  // w22
    unsigned int v51;  // w20
    unsigned int v52;  // w19
    unsigned int v53;  // w23
    unsigned int v54;  // w3
    unsigned int v55;  // w24
    unsigned int v56;  // w25
    unsigned int v57;  // w27
    void* v13;  // x10
    unsigned int v58;  // w28
    unsigned int v59;  // w17
    unsigned int v60;  // w11
    unsigned int v61;  // w16
    unsigned int v62;  // w23
    unsigned int v63;  // w21
    unsigned int v64;  // w25
    unsigned int v65;  // w14
    unsigned int v66;  // w27
    unsigned int v67;  // w28
    uint128_t *node;  // x11
    unsigned int v68;  // w7
    unsigned int v69;  // w16
    unsigned int v70;  // w2
    unsigned int v71;  // w3
    unsigned int v72;  // w23
    unsigned int v73;  // w24
    unsigned int v74;  // w25
    unsigned int v75;  // w14
    unsigned int v76;  // w3
    unsigned int v77;  // w21
    unsigned long long v15;  // x12
    unsigned int v78;  // w22
    unsigned int v79;  // w27
    unsigned int v80;  // w19
    unsigned int v81;  // w4
    unsigned int v82;  // w20
    unsigned int v83;  // w6
    unsigned int v84;  // w1
    unsigned int v85;  // w7
    unsigned int v86;  // w15
    unsigned int v87;  // w17
    void* v16;  // x10
    unsigned int v88;  // w26
    unsigned int v89;  // w28
    unsigned int v90;  // w11
    unsigned int v91;  // w1
    unsigned int v92;  // w5
    unsigned int v93;  // w22
    unsigned int v94;  // w21
    unsigned int v95;  // w24
    unsigned int v96;  // w3
    unsigned int v97;  // w15
    unsigned int v98;  // w16
    unsigned int v99;  // w1
    unsigned int v100;  // w2
    unsigned int v101;  // w15
    unsigned int v102;  // w5
    unsigned int v103;  // w17
    unsigned int v104;  // w3
    unsigned int v105;  // w16
    unsigned int v106;  // w20
    unsigned int v107;  // w19
    uint1024_t v0;  // [bp-0x130]
    unsigned long long v1;  // [bp-0xb0]
    unsigned long long v2;  // [bp-0xa0]
    unsigned long long v3;  // [bp-0x90]
    unsigned long long v4;  // [bp-0x80]
    unsigned long v5;  // [bp-0x70]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v5 = *(long long *)&g_10002b0;
    v1 = 0;
    v2 = 0;
    v3 = 0;
    v4 = 0;
    if (a1 >= 1)
    {
        if (a1 < 16)
            v8 = a1;
        else
            v8 = 16;
        if (4 > a1)
        {
            v9 = 0;
        }
        else if (16 > a1)
        {
            v9 = 0;
LABEL_9ee140:
            v12 = v9;
            v9 = v8 & 28;
            v13 = a2 + v12;
            node = (char *)&v1 + 4 * v12;
            v15 = v12 - v9;
            do
            {
                v16 = v13 + 4;
                *node = _mm_srli_epi32(_mm_unpacklo_epi16(_mm_setzero_si128(), _mm_srli_epi16(_mm_unpacklo_epi8(_mm_setzero_si128(), *(int *)v13), 8)), 16);
                node += 1;
                v18 = arm64g_calculate_condition(18, v15, 4, 0);
                v15 += 4;
                v13 = v16;
            } while (v18 & 1);
            if (v9 == v8)
                goto LABEL_9ee198;
        }
        else
        {
            v9 = v8 & 16;
            v10 = _mm_srli_epi16(_mm_unpacklo_epi8(_mm_setzero_si128(), *(int128_t *)a2), 8);
            v11 = _mm_srli_epi16(_mm_unpackhi_epi8(_mm_setzero_si128(), *(int128_t *)a2), 8);
            v3 = (unsigned long long)_mm_srli_epi32(_mm_unpacklo_epi16(_mm_setzero_si128(), v11), 16);
            v4 = (unsigned long long)_mm_srli_epi32(_mm_unpackhi_epi16(_mm_setzero_si128(), v11), 16);
            v1 = (unsigned long long)_mm_srli_epi32(_mm_unpacklo_epi16(_mm_setzero_si128(), v10), 16);
            v2 = (unsigned long long)_mm_srli_epi32(_mm_unpackhi_epi16(_mm_setzero_si128(), v10), 16);
            if (v9 == v8)
                goto LABEL_9ee198;
            if (v8 & 12)
                goto LABEL_9ee140;
        }
        iter = (char *)&v1 + 4 * v9;
        v20 = a2 + v9;
        i = v8 - v9;
        do
        {
            v22 = i;
            v23 = v20 + 1;
            *(unsigned int *)iter = *(char *)v20;
            iter += 4;
            i = v22 - 1;
            v20 = v23;
        } while (i);
LABEL_9ee198:
        v25 = 11 > a1;
    }
    else
    {
        v25 = 1;
    }
    *(unsigned int *)&a0->field_80 = v25;
    v26 = *(unsigned int *)((void*)&v1 + 4) * 0x10000 | (unsigned int)v1 * &_NSHomeDirectory | *(unsigned int *)((void*)&v1 + 8) * 0x100 | *(unsigned int *)((void*)&v1 + 12);
    v27 = *(unsigned int *)((void*)&v2 + 4) * 0x10000 | (unsigned int)v2 * &_NSHomeDirectory | *(unsigned int *)((void*)&v2 + 8) * 0x100 | *(unsigned int *)((void*)&v2 + 12);
    index = (unsigned int)v3;
    v29 = *(unsigned int *)((void*)&v3 + 4);
    v30 = *(unsigned int *)((void*)&v3 + 8);
    v31 = *(unsigned int *)((void*)&v3 + 12);
    v32 = v29 * 0x10000 | (unsigned int)index * &_NSHomeDirectory | v30 * 0x100 | v31;
    v33 = v4;
    v34 = *(unsigned int *)((void*)&v4 + 4);
    v35 = *(unsigned int *)((void*)&v4 + 8);
    idx = *(unsigned int *)((void*)&v4 + 12);
    v37 = v34 * 0x10000 | v33 * &_NSHomeDirectory | v35 * 0x100 | (unsigned int)idx;
    v38 = (&g_d352e8.field_0)[idx];
    v39 = &v0;
    v40 = (&g_d356e8.field_0)[index];
    do
    {
        j = v39;
        v42 = (&g_d34ee8.field_0)[v34] ^ v26 ^ v38 ^ (&g_d356e8.field_0)[v33] ^ (&g_d35ae8.field_0)[v35] ^ v40;
        v43 = __ROL__(v42, 24) & 0xff0000ff & 0xff;
        v44 = __ROL__(v42, 16) & 0xffff00ff & 0xff;
        v45 = v42 >> 24;
        v46 = (&g_d356e8.field_0)[v44];
        v47 = v42 & 0xff;
        v48 = (&g_d34ee8.field_0)[v45] ^ v32 ^ (&g_d352e8.field_0)[v43] ^ (&g_d35ae8.field_0)[v47] ^ (&g_d35ae8.field_0)[v30] ^ v46;
        v49 = v48 & 0xff;
        v50 = __ROL__(v48, 24) & 0xff0000ff & 0xff;
        v51 = __ROL__(v48, 16) & 0xffff00ff & 0xff;
        v52 = v48 >> 24;
        v53 = (&g_d352e8.field_0)[v50] ^ (&g_d356e8.field_0)[v51];
        v54 = v37 ^ (&g_d34ee8.field_0)[v29] ^ (&g_d34ee8.field_0)[v49] ^ v53 ^ (&g_d35ae8.field_0)[v52];
        v55 = v54 & 0xff;
        v56 = __ROL__(v54, 16) & 0xffff00ff & 0xff;
        v57 = v54 >> 24;
        v58 = (&g_d34ee8.field_0)[__ROL__(v54, 24) & 0xff0000ff & 0xff];
        v59 = v27 ^ (&g_d356e8.field_0)[v55] ^ (&g_d35ae8.field_0)[v57] ^ (&g_d352e8.field_0)[v31] ^ v58 ^ (&g_d352e8.field_0)[v56];
        v60 = (&g_d35ae8.field_0)[v50];
        v61 = v53 ^ (&g_d35ae8.field_0)[v52] ^ (&g_d352e8.field_0)[v55];
        v62 = (&g_d356e8.field_0)[v47];
        v63 = (&g_d35ae8.field_0)[v43];
        v64 = (&g_d356e8.field_0)[v56];
        *j = (&g_d34ee8.field_0)[v57] ^ (&g_d356e8.field_0)[v49] ^ (&g_d34ee8.field_0)[v43] ^ (&g_d352e8.field_0)[v56] ^ v60;
        j[1] = v61 ^ v58;
        v65 = v59 >> 24;
        v66 = (&g_d35ae8.field_0)[v45];
        v67 = (&g_d34ee8.field_0)[__ROL__(v59, 24) & 0xff0000ff & 0xff];
        v68 = (&g_d352e8.field_0)[v59 & 0xff];
        v69 = (&g_d34ee8.field_0)[v51] ^ (&g_d352e8.field_0)[v49] ^ (&g_d356e8.field_0)[v52] ^ (&g_d356e8.field_0)[v45] ^ v60 ^ v54;
        v70 = v69 & 0xff;
        v71 = (&g_d35ae8.field_0)[v65];
        v72 = v69 >> 24;
        v73 = (&g_d352e8.field_0)[__ROL__(v69, 24) & 0xff0000ff & 0xff];
        v74 = __ROL__(v69, 16) & 0xffff00ff & 0xff;
        v75 = (&g_d34ee8.field_0)[v72] ^ (&g_d356e8.field_0)[v74] ^ (&g_d35ae8.field_0)[v70] ^ v42 ^ v63 ^ v73;
        v76 = v75 & 0xff;
        v77 = __ROL__(v75, 16) & 0xffff00ff & 0xff;
        v78 = v75 >> 24;
        v79 = (&g_d352e8.field_0)[__ROL__(v75, 24) & 0xff0000ff & 0xff] ^ (&g_d34ee8.field_0)[v76];
        v80 = (&g_d356e8.field_0)[v77] ^ (&g_d35ae8.field_0)[v78] ^ (&g_d34ee8.field_0)[v44] ^ v48 ^ v79;
        v81 = v80 & 0xff;
        v82 = __ROL__(v80, 24) & 0xff0000ff & 0xff;
        v83 = __ROL__(v80, 16) & 0xffff00ff & 0xff;
        v84 = v80 >> 24;
        v85 = (&g_d34ee8.field_0)[v82] ^ (&g_d352e8.field_0)[v83] ^ (&g_d356e8.field_0)[v81] ^ (&g_d35ae8.field_0)[v84] ^ (&g_d352e8.field_0)[v47] ^ v59;
        v86 = v85 & 0xff;
        v87 = __ROL__(v85, 24) & 0xff0000ff & 0xff;
        v88 = __ROL__(v85, 16) & 0xffff00ff & 0xff;
        v89 = (&g_d34ee8.field_0)[v70];
        j[2] = (&g_d352e8.field_0)[__ROL__(v59, 16) & 0xffff00ff & 0xff] ^ (&g_d34ee8.field_0)[v65] ^ v62 ^ v64 ^ v63;
        j[3] = v67 ^ v68 ^ v66 ^ v71 ^ v46;
        v90 = (&g_d356e8.field_0)[v85 >> 24];
        v91 = (&g_d356e8.field_0)[v84];
        v92 = v89 ^ (&g_d34ee8.field_0)[v84] ^ v73 ^ (&g_d35ae8.field_0)[v88];
        v93 = (&g_d352e8.field_0)[v72] ^ (&g_d34ee8.field_0)[v74] ^ (&g_d356e8.field_0)[v87];
        v94 = (&g_d352e8.field_0)[v78] ^ (&g_d34ee8.field_0)[v77] ^ (&g_d356e8.field_0)[v82];
        v95 = (&g_d35ae8.field_0)[v86] ^ (&g_d352e8.field_0)[v88];
        v96 = (&g_d35ae8.field_0)[v81] ^ (&g_d35ae8.field_0)[v76];
        j[6] = (&g_d35ae8.field_0)[v83] ^ (&g_d356e8.field_0)[v70] ^ v79 ^ v91;
        j[7] = v94 ^ v96;
        v97 = (&g_d34ee8.field_0)[v88] ^ (&g_d352e8.field_0)[v86];
        v98 = (&g_d35ae8.field_0)[v87] ^ v69;
        j[4] = v92 ^ v90;
        j[5] = v93 ^ v95;
        v99 = v97 ^ v98 ^ v90 ^ v91;
        v100 = __ROL__(v99, 24) & 0xff0000ff & 0xff;
        v101 = __ROL__(v99, 16) & 0xffff00ff & 0xff;
        v102 = v99 >> 24;
        v103 = (&g_d352e8.field_0)[v100];
        v104 = v99 & 0xff;
        v105 = (&g_d34ee8.field_0)[v102] ^ (&g_d356e8.field_0)[v101] ^ (&g_d35ae8.field_0)[v104] ^ (&g_d35ae8.field_0)[v82] ^ v80 ^ v103;
        v106 = v105 & 0xff;
        v107 = __ROL__(v105, 24) & 0xff0000ff & 0xff;
        v108 = __ROL__(v105, 16) & 0xffff00ff & 0xff;
        v109 = v105 >> 24;
        v110 = (&g_d352e8.field_0)[v107] ^ (&g_d34ee8.field_0)[v106];
        v111 = (&g_d356e8.field_0)[v108] ^ (&g_d35ae8.field_0)[v109] ^ (&g_d34ee8.field_0)[v83] ^ v85 ^ v110;
        v112 = v111 & 0xff;
        v113 = __ROL__(v111, 24) & 0xff0000ff & 0xff;
        v114 = __ROL__(v111, 16) & 0xffff00ff & 0xff;
        v115 = v111 >> 24;
        v116 = (&g_d34ee8.field_0)[v104];
        v117 = (&g_d34ee8.field_0)[v113] ^ (&g_d352e8.field_0)[v114] ^ (&g_d356e8.field_0)[v112] ^ (&g_d35ae8.field_0)[v115] ^ (&g_d352e8.field_0)[v81] ^ v75;
        v118 = v117 >> 24;
        v119 = (&g_d352e8.field_0)[v109];
        v120 = (&g_d356e8.field_0)[v113];
        v121 = (&g_d356e8.field_0)[v118];
        v122 = (&g_d34ee8.field_0)[v114];
        v123 = (&g_d34ee8.field_0)[v108];
        v124 = (&g_d35ae8.field_0)[v112];
        v125 = (&g_d35ae8.field_0)[__ROL__(v117, 16) & 0xffff00ff & 0xff];
        v126 = (&g_d34ee8.field_0)[v101];
        v127 = (&g_d352e8.field_0)[v102];
        v128 = (&g_d356e8.field_0)[__ROL__(v117, 24) & 0xff0000ff & 0xff];
        v129 = (&g_d35ae8.field_0)[v117 & 0xff];
        v130 = (&g_d35ae8.field_0)[v107];
        v131 = (&g_d352e8.field_0)[v118];
        v26 = (&g_d352e8.field_0)[v106] ^ (&g_d356e8.field_0)[v109] ^ (&g_d356e8.field_0)[v102] ^ v123 ^ v130 ^ v111;
        v132 = __ROL__(v26, 24) & 0xff0000ff & 0xff;
        v133 = v26 >> 24;
        v134 = v26 & 0xff;
        v135 = (&g_d356e8.field_0)[__ROL__(v26, 16) & 0xffff00ff & 0xff];
        v27 = (&g_d34ee8.field_0)[v133] ^ (&g_d352e8.field_0)[v132] ^ (&g_d35ae8.field_0)[v134] ^ (&g_d35ae8.field_0)[v100] ^ v99 ^ v135;
        v136 = v27 & 0xff;
        v137 = __ROL__(v27, 24) & 0xff0000ff & 0xff;
        v138 = (&g_d34ee8.field_0)[v136];
        j[10] = (&g_d356e8.field_0)[v115] ^ (&g_d35ae8.field_0)[v114] ^ (&g_d356e8.field_0)[v100] ^ v110;
        j[11] = v119 ^ v120 ^ v124 ^ v123 ^ v130;
        v139 = (&g_d356e8.field_0)[__ROL__(v27, 16) & 0xffff00ff & 0xff];
        v140 = (&g_d35ae8.field_0)[v27 >> 24];
        v141 = v138 ^ (&g_d352e8.field_0)[v137];
        j[8] = v116 ^ v121 ^ v125 ^ v122 ^ v103;
        j[9] = v127 ^ v128 ^ v129 ^ v131 ^ v126;
        v32 = v141 ^ v139 ^ v140 ^ v105 ^ v126;
        v31 = v32 & 0xff;
        v30 = (v32 * &_NSHomeDirectory | v32 >> 8) & 0xff0000ff & 0xff;
        v142 = (&g_d34ee8.field_0)[v30];
        v143 = v32 >> 24;
        v29 = (v32 * 0x10000 | v32 >> 16) & 0xffff00ff & 0xff;
        v37 = (&g_d356e8.field_0)[v31] ^ (&g_d35ae8.field_0)[v143] ^ (&g_d352e8.field_0)[v104] ^ v117 ^ v142 ^ (&g_d352e8.field_0)[v29];
        v144 = (&g_d352e8.field_0)[v31] ^ (&g_d352e8.field_0)[v136] ^ v139 ^ v140;
        v35 = (v37 * &_NSHomeDirectory | v37 >> 8) & 0xff0000ff & 0xff;
        v34 = (v37 * 0x10000 | v37 >> 16) & 0xffff00ff & 0xff;
        v33 = v37 >> 24;
        j[12] = (&g_d34ee8.field_0)[v143] ^ (&g_d356e8.field_0)[v136] ^ (&g_d35ae8.field_0)[v137] ^ (&g_d34ee8.field_0)[v134] ^ (&g_d352e8.field_0)[v29];
        j[13] = v144 ^ v142;
        v145 = (&g_d34ee8.field_0)[v35];
        v38 = (&g_d352e8.field_0)[v37 & 0xff];
        v146 = (&g_d35ae8.field_0)[v133];
        v147 = (&g_d35ae8.field_0)[v34];
        v40 = (&g_d356e8.field_0)[v143];
        j[14] = (&g_d352e8.field_0)[v34] ^ (&g_d34ee8.field_0)[v33] ^ (&g_d356e8.field_0)[v134] ^ (&g_d35ae8.field_0)[v132] ^ v40;
        j[15] = v145 ^ v146 ^ v147 ^ v38 ^ v135;
        v39 = j + 16;
    } while (j == &v0);
    v148 = *(uint128_t *)&v0;
    v149 = CONCAT(133143986207, 133143986207);
    v150 = CONCAT(68719476752, 68719476752);
    v151 = _mm_xor_si128(v150, _mm_and_si128(*(uint128_t *)((void*)&v0 + 64), v149));
    *(__m128i *)&a0->field_10 = _mm_unpackhi_epi32(v148, v151);
    *(__m128i *)&a0->field_0 = _mm_unpacklo_epi32(v148, v151);
    v152 = &a0->field_20;
    v153 = *(uint128_t *)((void*)&v0 + 32);
    v154 = *(uint128_t *)((void*)&v0 + 48);
    v155 = *(uint128_t *)((void*)&v0 + 16);
    v156 = _mm_xor_si128(v150, _mm_and_si128(*(uint128_t *)((void*)&v0 + 80), v149));
    *(__m128i *)&v152->field_10 = _mm_unpackhi_epi32(v155, v156);
    *(__m128i *)&v152->field_0 = _mm_unpacklo_epi32(v155, v156);
    v157 = _mm_xor_si128(v150, _mm_and_si128(*(uint128_t *)((void*)&v0 + 96), v149));
    v158 = &a0->field_40;
    *(__m128i *)&v158->field_10 = _mm_unpackhi_epi32(v153, v157);
    *(__m128i *)&v158->field_0 = _mm_unpacklo_epi32(v153, v157);
    v159 = _mm_xor_si128(v150, _mm_and_si128(*(uint128_t *)((void*)&v0 + 112), v149));
    v160 = &a0->field_60;
    *(__m128i *)&v160->field_10 = _mm_unpackhi_epi32(v154, v159);
    *(__m128i *)&v160->field_0 = _mm_unpacklo_epi32(v154, v159);
    if (*(long long *)&g_10002b0 == v5)
        return (unsigned long long)((*(uint128_t *)((void*)&v0 + 112) & v149) >> 0);
    ___stack_chk_fail();
}
