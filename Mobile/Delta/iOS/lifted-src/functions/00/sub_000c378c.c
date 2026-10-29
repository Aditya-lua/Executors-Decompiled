/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc378c..0xc3c5c (1232 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c378c_2 {
    unsigned short field_0;
    char field_2;
    char field_3;
} st_c378c_2;

typedef struct st_c378c_0 {
    char field_0;
} st_c378c_0;

typedef struct st_c378c_1 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    unsigned long long field_40;
    unsigned long long field_48;
    unsigned long long field_50;
    unsigned long long field_58;
    unsigned long long field_60;
    unsigned long long field_68;
    unsigned long long field_70;
} st_c378c_1;

extern unsigned long long g_e6cc00;
extern unsigned long long g_e6cc10;
extern char g_10002b0;

long long sub_c378c(st_c378c_1 *a0)
{
    unsigned long long v18;  // x26
    unsigned long long v19;  // x25
    unsigned long long v28;  // x9
    st_c378c_2 *v118;  // x22
    char v119;  // x24
    unsigned long v120;  // x22
    unsigned long v121;  // x19
    st_c378c_2 *v122;  // x22
    char v123;  // x24
    unsigned long v124;  // x22
    unsigned long v125;  // x20
    st_c378c_2 *v126;  // x22
    char v127;  // x24
    unsigned long long v29;  // x7
    unsigned long v128;  // x22
    unsigned long long v129;  // x2
    unsigned short *v130;  // x3
    st_c378c_2 *v131;  // x22
    unsigned long long v132;  // x2
    unsigned long long v133;  // 4303
    unsigned long long v134;  // 4305
    unsigned long long v135;  // x7
    unsigned long v136;  // x22
    unsigned long long v137;  // x7
    unsigned long long v30;  // x19
    unsigned long v138;  // x7
    st_c378c_2 *v139;  // x23
    unsigned short *v140;  // x3
    unsigned long v141;  // x22
    unsigned long long v142;  // x2
    unsigned long long v143;  // 4189
    unsigned long long v144;  // 4191
    unsigned long long v145;  // x19
    unsigned long long v146;  // x19
    unsigned short *v147;  // x3
    unsigned long long v31;  // x20
    st_c378c_2 *v148;  // x22
    unsigned long v149;  // x22
    unsigned long long v150;  // x2
    unsigned long long v151;  // 4194
    unsigned long long v152;  // 4196
    unsigned long long v153;  // x20
    unsigned long long v154;  // x20
    unsigned short *v155;  // x3
    st_c378c_2 *v156;  // x22
    char v157;  // x23
    unsigned long long v32;  // x2
    unsigned long v158;  // x22
    unsigned long v159;  // x2
    unsigned long long v160;  // 4189
    unsigned long long v161;  // 4191
    unsigned long long v162;  // x2
    unsigned long long v163;  // x2
    __m128i v33;  // q2
    __m128i v34;  // q3
    unsigned short *v35;  // x4
    unsigned short *v36;  // x5
    unsigned short *v37;  // x3
    unsigned long long v20;  // x24
    __m128i v38;  // q1
    unsigned short *v39;  // x6
    unsigned long long *iter;  // x10
    unsigned long long *node;  // x11
    unsigned long long *iter1;  // x12
    unsigned long long *iter2;  // x13
    __m128i v44;  // q5
    __m128i v45;  // q4
    __m128i v46;  // q5
    __m128i v47;  // q4
    unsigned long long v21;  // x23
    __m128i v48;  // q5
    unsigned long v50;  // d4
    unsigned long long v51;  // x21
    unsigned long long v52;  // x22
    unsigned short *i;  // x3
    st_c378c_2 *v54;  // x22
    char v55;  // x24
    unsigned long v56;  // x22
    unsigned long long v57;  // x7
    unsigned long long v22;  // x22
    unsigned short *v58;  // x6
    st_c378c_2 *v59;  // x22
    char v60;  // x24
    unsigned long v61;  // x22
    unsigned long long v62;  // x19
    unsigned short *v63;  // x4
    st_c378c_2 *v64;  // x22
    char v65;  // x24
    unsigned long v66;  // x22
    unsigned long long v67;  // x20
    unsigned long long v23;  // x21
    st_c378c_2 *v68;  // x23
    unsigned short *v69;  // x5
    char v70;  // x22
    unsigned long v71;  // x23
    unsigned long long v72;  // x7
    unsigned short *v73;  // x6
    st_c378c_2 *v74;  // x22
    char v75;  // x24
    unsigned long v76;  // x22
    unsigned long long v77;  // x19
    unsigned long long v24;  // x20
    unsigned short *v78;  // x4
    st_c378c_2 *v79;  // x22
    char v80;  // x24
    unsigned long v81;  // x22
    unsigned long long v82;  // x20
    st_c378c_2 *v83;  // x23
    unsigned short *v84;  // x5
    char v85;  // x22
    unsigned long v86;  // x23
    unsigned long long v87;  // x7
    unsigned long long v25;  // x19
    unsigned short *v88;  // x6
    st_c378c_2 *v89;  // x22
    char v90;  // x24
    unsigned long v91;  // x22
    unsigned long long v92;  // x19
    unsigned short *v93;  // x4
    st_c378c_2 *v94;  // x22
    char v95;  // x24
    unsigned long v96;  // x22
    unsigned long long v97;  // x20
    unsigned long long v26;  // x30
    st_c378c_2 *v98;  // x23
    unsigned short *v99;  // x5
    char v100;  // x22
    unsigned long v101;  // x23
    unsigned long long v102;  // x7
    unsigned short *v103;  // x6
    st_c378c_2 *v104;  // x22
    char v105;  // x24
    unsigned long v106;  // x22
    unsigned long long v107;  // x19
    unsigned long long v27;  // x8
    unsigned short *v108;  // x4
    st_c378c_2 *v109;  // x22
    char v110;  // x24
    unsigned long v111;  // x22
    unsigned long long v112;  // x20
    st_c378c_2 *v113;  // x23
    unsigned short *v114;  // x5
    char v115;  // x22
    unsigned long v116;  // x23
    unsigned long v117;  // x7
    st_c378c_0 **v0;  // [bp-0x90], Other Possible Types: char
    st_c378c_0 *v1;  // [bp-0x88]
    uint256_t v2;  // [bp-0x80], Other Possible Types: unsigned long long *
    unsigned long long *v3;  // [bp-0x78]
    unsigned long long *v4;  // [bp-0x70]
    unsigned long long *v5;  // [bp-0x68]
    unsigned long v6;  // [bp-0x58]
    unsigned long long v7;  // [bp-0x50]
    unsigned long long v8;  // [bp-0x48]
    unsigned long long v9;  // [bp-0x40]
    unsigned long long v10;  // [bp-0x38]
    unsigned long long v11;  // [bp-0x30]
    unsigned long long v12;  // [bp-0x28]
    unsigned long long v13;  // [bp-0x20]
    unsigned long long v14;  // [bp-0x18]
    char *v15;  // [bp-0x10]
    unsigned long long v16;  // [bp-0x8]
    char v17;  // [bp+0x0]

    v7 = v18;
    v8 = v19;
    v9 = v20;
    v10 = v21;
    v11 = v22;
    v12 = v23;
    v13 = v24;
    v14 = v25;
    v15 = &v17;
    v16 = v26;
    v6 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    v27 = a0->field_60;
    v28 = a0->field_68;
    v29 = a0->field_40;
    v30 = a0->field_48;
    v31 = a0->field_50;
    v32 = a0->field_58;
    v33 = a0->field_20;
    v34 = a0->field_30;
    v35 = _mm_extract_epi64(v33, 1);
    v2 = CONCAT(a0->field_10, a0->field_0);
    v36 = _mm_cvtsi128_si64(v34);
    v37 = _mm_extract_epi64(v34, 1);
    v38 = (__m128i)_INSERT(_mm_unpackhi_epi64(v34, v34), 8, a0->field_70);
    v39 = _mm_cvtsi128_si64(v33);
    iter = *(unsigned long long *)&v2;
    node = *(unsigned long long *)((void*)&v2 + 8);
    iter1 = *(unsigned long long *)((void*)&v2 + 16);
    iter2 = *(unsigned long long *)((void*)&v2 + 24);
    v44 = (__m128i)_INSERT(__double_as_longlong(__longlong_as_double((_mm_cvtsi128_si64(_mm_unpacklo_epi64(_mm_unpackhi_epi64(v33, v33), v34)) - _mm_cvtsi128_si64(v33)) / 10)), 8, _mm_extract_epi64(_mm_sub_epi64(_mm_unpacklo_epi64(_mm_unpackhi_epi64(v33, v33), v34), v33), 1) / 10);
    v45 = _mm_xor_si128(CONCAT(((char *)iter - v28) / 7, ((char *)iter - v28) / 7), _mm_and_si128(_mm_xor_si128(CONCAT(((char *)iter - v28) / 7, ((char *)iter - v28) / 7), v44), ~CmpGTV(v44, CONCAT(((char *)iter - v28) / 7, ((char *)iter - v28) / 7))));
    v46 = (__m128i)_INSERT(__double_as_longlong(__longlong_as_double((_mm_cvtsi128_si64(v38) - _mm_cvtsi128_si64(v34)) / 10)), 8, _mm_extract_epi64(_mm_sub_epi64(v38, v34), 1) / 10);
    v47 = _mm_xor_si128(v45, _mm_and_si128(_mm_xor_si128(v45, v46), ~CmpGTV(v46, v45)));
    v48 = __dirty_unsupported_Iop_SliceV128(v47, v47, 8);
    v50 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_xor_si128(v47, _mm_and_si128(_mm_xor_si128(v47, v48), ~__dirty_unsupported_Iop_ZeroHI64ofV128(CmpGTV(v48, v47)))));
    v51 = __double_as_longlong(v50);
    if (v51)
    {
        v52 = 0;
        while ((unsigned long long)*(long long *)((char *)&v2 + v52 + 8) >= (unsigned long long)*(long long *)((char *)&v2 + v52))
        {
            i = v37;
            if (v52 == 16)
            {
                do
                {
                    v54 = v27 + (v29 >> 53) * 4;
                    v55 = v54->field_2;
                    v56 = v54->field_3;
                    *v39 = v54->field_0;
                    v57 = v29 << (v55 & 63);
                    v58 = (char *)v39 + v56;
                    v59 = v27 + (v30 >> 53) * 4;
                    v60 = v59->field_2;
                    v61 = v59->field_3;
                    *v35 = v59->field_0;
                    v62 = v30 << (v60 & 63);
                    v63 = (char *)v35 + v61;
                    v64 = v27 + (v31 >> 53) * 4;
                    v65 = v64->field_2;
                    v66 = v64->field_3;
                    *v36 = v64->field_0;
                    v67 = v31 << (v65 & 63);
                    v68 = v27 + (v57 >> 53) * 4;
                    v69 = (char *)v36 + v66;
                    v70 = v68->field_2;
                    v71 = v68->field_3;
                    *v58 = v68->field_0;
                    v72 = v57 << (v70 & 63);
                    v73 = (char *)v58 + v71;
                    v74 = v27 + (v62 >> 53) * 4;
                    v75 = v74->field_2;
                    v76 = v74->field_3;
                    *v63 = v74->field_0;
                    v77 = v62 << (v75 & 63);
                    v78 = (char *)v63 + v76;
                    v79 = v27 + (v67 >> 53) * 4;
                    v80 = v79->field_2;
                    v81 = v79->field_3;
                    *v69 = v79->field_0;
                    v82 = v67 << (v80 & 63);
                    v83 = v27 + (v72 >> 53) * 4;
                    v84 = (char *)v69 + v81;
                    v85 = v83->field_2;
                    v86 = v83->field_3;
                    *v73 = v83->field_0;
                    v87 = v72 << (v85 & 63);
                    v88 = (char *)v73 + v86;
                    v89 = v27 + (v77 >> 53) * 4;
                    v90 = v89->field_2;
                    v91 = v89->field_3;
                    *v78 = v89->field_0;
                    v92 = v77 << (v90 & 63);
                    v93 = (char *)v78 + v91;
                    v94 = v27 + (v82 >> 53) * 4;
                    v95 = v94->field_2;
                    v96 = v94->field_3;
                    *v84 = v94->field_0;
                    v97 = v82 << (v95 & 63);
                    v98 = v27 + (v87 >> 53) * 4;
                    v99 = (char *)v84 + v96;
                    v100 = v98->field_2;
                    v101 = v98->field_3;
                    *v88 = v98->field_0;
                    v102 = v87 << (v100 & 63);
                    v103 = (char *)v88 + v101;
                    v104 = v27 + (v92 >> 53) * 4;
                    v105 = v104->field_2;
                    v106 = v104->field_3;
                    *v93 = v104->field_0;
                    v107 = v92 << (v105 & 63);
                    v108 = (char *)v93 + v106;
                    v109 = v27 + (v97 >> 53) * 4;
                    v110 = v109->field_2;
                    v111 = v109->field_3;
                    *v99 = v109->field_0;
                    v112 = v97 << (v110 & 63);
                    v113 = v27 + (v102 >> 53) * 4;
                    v114 = (char *)v99 + v111;
                    v115 = v113->field_2;
                    v116 = v113->field_3;
                    *v103 = v113->field_0;
                    v117 = v102 << (v115 & 63);
                    v39 = (char *)v103 + v116;
                    v118 = v27 + (v107 >> 53) * 4;
                    v119 = v118->field_2;
                    v120 = v118->field_3;
                    *v108 = v118->field_0;
                    v121 = v107 << (v119 & 63);
                    v35 = (char *)v108 + v120;
                    v122 = v27 + (v112 >> 53) * 4;
                    v123 = v122->field_2;
                    v124 = v122->field_3;
                    *v114 = v122->field_0;
                    v125 = v112 << (v123 & 63);
                    v36 = (char *)v114 + v124;
                    v126 = v27 + (v32 >> 53) * 4;
                    v127 = v126->field_2;
                    v128 = v126->field_3;
                    *i = v126->field_0;
                    v129 = v32 << (v127 & 63);
                    v130 = (char *)i + v128;
                    v131 = v27 + (v129 >> 53) * 4;
                    v132 = v129 << (v131->field_2 & 63);
                    v133 = ((((((v117 & 0xaaaaaaaaaaaaaaaa) >> 1 | v117 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v117 & 0xaaaaaaaaaaaaaaaa) >> 1 | v117 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v117 & 0xaaaaaaaaaaaaaaaa) >> 1 | v117 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v117 & 0xaaaaaaaaaaaaaaaa) >> 1 | v117 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                    v134 = (((((((v117 & 0xaaaaaaaaaaaaaaaa) >> 1 | v117 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v117 & 0xaaaaaaaaaaaaaaaa) >> 1 | v117 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v117 & 0xaaaaaaaaaaaaaaaa) >> 1 | v117 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v117 & 0xaaaaaaaaaaaaaaaa) >> 1 | v117 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                    v135 = ((((v134 | v133) & 0xffff0000ffff0000) >> 16 | (v134 | v133) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v134 | v133) & 0xffff0000ffff0000) >> 16 | (v134 | v133) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                    v136 = v131->field_3;
                    if (!v135)
                        v137 = 64;
                    else
                        v137 = Clz(v135);
                    iter = (char *)iter - (v137 >> 3);
                    v138 = *iter;
                    *v130 = v131->field_0;
                    v29 = (v138 | 1) << ((char)v137 & 7 & 63);
                    v139 = v27 + (v132 >> 53) * 4;
                    v140 = (char *)v130 + v136;
                    v141 = v139->field_3;
                    v142 = v132 << (v139->field_2 & 63);
                    v143 = ((((((v121 & 0xaaaaaaaaaaaaaaaa) >> 1 | v121 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v121 & 0xaaaaaaaaaaaaaaaa) >> 1 | v121 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v121 & 0xaaaaaaaaaaaaaaaa) >> 1 | v121 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v121 & 0xaaaaaaaaaaaaaaaa) >> 1 | v121 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                    v144 = (((((((v121 & 0xaaaaaaaaaaaaaaaa) >> 1 | v121 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v121 & 0xaaaaaaaaaaaaaaaa) >> 1 | v121 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v121 & 0xaaaaaaaaaaaaaaaa) >> 1 | v121 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v121 & 0xaaaaaaaaaaaaaaaa) >> 1 | v121 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                    v145 = ((((v144 | v143) & 0xffff0000ffff0000) >> 16 | (v144 | v143) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v144 | v143) & 0xffff0000ffff0000) >> 16 | (v144 | v143) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                    if (!v145)
                        v146 = 64;
                    else
                        v146 = Clz(v145);
                    *v140 = v139->field_0;
                    node = (char *)node - (v146 >> 3);
                    v30 = (*node | 1) << ((char)v146 & 7 & 63);
                    v147 = (char *)v140 + v141;
                    v148 = v27 + (v142 >> 53) * 4;
                    v149 = v148->field_3;
                    v150 = v142 << (v148->field_2 & 63);
                    *v147 = v148->field_0;
                    v151 = ((((((v125 & 0xaaaaaaaaaaaaaaaa) >> 1 | v125 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v125 & 0xaaaaaaaaaaaaaaaa) >> 1 | v125 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v125 & 0xaaaaaaaaaaaaaaaa) >> 1 | v125 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v125 & 0xaaaaaaaaaaaaaaaa) >> 1 | v125 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                    v152 = (((((((v125 & 0xaaaaaaaaaaaaaaaa) >> 1 | v125 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v125 & 0xaaaaaaaaaaaaaaaa) >> 1 | v125 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v125 & 0xaaaaaaaaaaaaaaaa) >> 1 | v125 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v125 & 0xaaaaaaaaaaaaaaaa) >> 1 | v125 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                    v153 = ((((v152 | v151) & 0xffff0000ffff0000) >> 16 | (v152 | v151) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v152 | v151) & 0xffff0000ffff0000) >> 16 | (v152 | v151) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                    if (!v153)
                        v154 = 64;
                    else
                        v154 = Clz(v153);
                    iter1 = (char *)iter1 - (v154 >> 3);
                    v155 = (char *)v147 + v149;
                    v31 = (*iter1 | 1) << ((char)v154 & 7 & 63);
                    v156 = v27 + (v150 >> 53) * 4;
                    v157 = v156->field_2;
                    v158 = v156->field_3;
                    *v155 = v156->field_0;
                    v159 = v150 << (v157 & 63);
                    v160 = ((((((v159 & 0xaaaaaaaaaaaaaaaa) >> 1 | v159 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v159 & 0xaaaaaaaaaaaaaaaa) >> 1 | v159 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v159 & 0xaaaaaaaaaaaaaaaa) >> 1 | v159 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v159 & 0xaaaaaaaaaaaaaaaa) >> 1 | v159 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                    v161 = (((((((v159 & 0xaaaaaaaaaaaaaaaa) >> 1 | v159 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v159 & 0xaaaaaaaaaaaaaaaa) >> 1 | v159 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v159 & 0xaaaaaaaaaaaaaaaa) >> 1 | v159 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v159 & 0xaaaaaaaaaaaaaaaa) >> 1 | v159 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                    v162 = ((((v161 | v160) & 0xffff0000ffff0000) >> 16 | (v161 | v160) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v161 | v160) & 0xffff0000ffff0000) >> 16 | (v161 | v160) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                    if (!v162)
                        v163 = 64;
                    else
                        v163 = Clz(v162);
                    i = (char *)v155 + v158;
                    iter2 = (char *)iter2 - (v163 >> 3);
                    v32 = (*iter2 | 1) << ((char)v163 & 7 & 63);
                } while (i < (char *)v37 + 5 * v51);
                v2 = iter;
                v3 = node;
                v4 = iter1;
                v5 = iter2;
                goto *((void *)(g_e6cc10));
            }
        }
    }
    goto *((void *)(g_e6cc00));
}
