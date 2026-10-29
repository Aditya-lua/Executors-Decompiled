/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbd4538..0xbd4c28 (1776 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bd4538_0 {
    struct st_bd4538_1 *field_0;
    unsigned long long field_8;
} st_bd4538_0;

typedef struct st_bd4538_2 {
    unsigned long long field_0;
    char padding_8[20];
    unsigned int field_1c;
} st_bd4538_2;

typedef struct st_bd4538_1 {
    unsigned long long field_0;
} st_bd4538_1;

extern unsigned int g_efa2d0;
extern unsigned int g_efa2e8;

void sub_bd4538(st_bd4538_0 *a0, unsigned int idx, unsigned int a2, unsigned long a3)
{
    unsigned int ptr;  // x0
    unsigned int *v11;  // x21
    unsigned long v20;  // x20
    unsigned long v111;  // x10
    unsigned long long v112;  // x10
    unsigned long long v113;  // 4128
    unsigned long long v114;  // 4130
    unsigned int v115;  // x11
    unsigned long long v116;  // x11
    void* v117;  // x21
    unsigned long long v118;  // x11
    unsigned int v119;  // x10
    unsigned long long v21;  // x9
    unsigned int v120;  // x13
    unsigned int v121;  // x11
    unsigned long long *v122;  // x8
    unsigned long long v123;  // x9
    unsigned long long v124;  // x12
    __m128i v125;  // q0
    unsigned long v127;  // x14
    unsigned long long v128;  // x14
    __m128i v22;  // q0
    unsigned long long v130;  // 4128
    unsigned long long v131;  // 4130
    unsigned int v132;  // x10
    unsigned long long v133;  // x10
    __m128i v134;  // q1
    uint128_t v135;  // q0
    unsigned long v138;  // x14
    unsigned long long v139;  // x14
    unsigned long long v23;  // x9
    unsigned long long v140;  // 4128
    unsigned long long v141;  // 4130
    unsigned int v142;  // x15
    unsigned long long v143;  // x15
    unsigned long long v144;  // x15
    unsigned long long v145;  // 4102
    unsigned int index;  // x24
    unsigned long v147;  // x11
    unsigned long v149;  // x10
    __m128i v24;  // q1
    unsigned long long v150;  // 4137
    unsigned long long v151;  // 4139
    unsigned int v152;  // x10
    unsigned long long v153;  // x10
    char v154;  // x12
    __m128i v155;  // q1
    unsigned int *v156;  // x8
    unsigned long long v157;  // 4128
    unsigned long long v158;  // 4102
    unsigned long v26;  // x10
    unsigned long long v27;  // x10
    uint128_t v28;  // q1
    unsigned int v12;  // x24
    unsigned long v31;  // x10
    unsigned long long v32;  // x10
    unsigned int v33;  // x26
    unsigned long long v34;  // 4132
    unsigned long long v35;  // 4134
    unsigned int v36;  // x11
    unsigned long long v37;  // x11
    void* v38;  // x23
    unsigned long long v39;  // x11
    unsigned int v13;  // x14
    unsigned int v40;  // x8
    unsigned long long *v41;  // x10
    unsigned long v42;  // x9
    unsigned long long v43;  // x11
    __m128i v44;  // q0
    unsigned long v46;  // x12
    unsigned long long v47;  // x12
    __m128i v48;  // q0
    unsigned long long *v14;  // x22
    unsigned long v51;  // x12
    unsigned long long v52;  // x12
    unsigned long long v53;  // 4128
    unsigned long long v54;  // 4130
    unsigned int v55;  // x13
    unsigned long long v56;  // x13
    unsigned long long v57;  // x13
    unsigned int v58;  // x8
    unsigned long long *v59;  // x10
    unsigned long long v15;  // x25
    unsigned long v60;  // x9
    unsigned long long v61;  // x11
    __m128i v62;  // q0
    unsigned long v64;  // x12
    unsigned long long v65;  // x12
    __m128i v66;  // q0
    unsigned long v69;  // x12
    __m128i v16;  // q8
    unsigned long long v70;  // x12
    unsigned long long v71;  // 4128
    unsigned long long v72;  // 4130
    unsigned int v73;  // x13
    unsigned long long v74;  // x13
    unsigned long long v75;  // x13
    unsigned int v76;  // x8
    unsigned long long *v77;  // x10
    unsigned long long v78;  // x9
    unsigned long long v79;  // x11
    unsigned long v17;  // x28
    __m128i v80;  // q0
    unsigned long v82;  // x12
    unsigned long long v83;  // x12
    __m128i v84;  // q0
    unsigned long v87;  // x12
    unsigned long long v88;  // x12
    unsigned long long v89;  // 4128
    unsigned long v18;  // x27
    unsigned long long v90;  // 4130
    unsigned int v91;  // x13
    unsigned long long v92;  // x13
    unsigned long long v93;  // x13
    st_bd4538_2 *v94;  // x8
    unsigned long v95;  // x20
    unsigned long v96;  // x9
    unsigned int *v97;  // x8
    unsigned long v98;  // x23
    unsigned int v99;  // x8
    unsigned int v19;  // x8
    unsigned long long v100;  // x9
    __m128i v101;  // q0
    unsigned long long v103;  // x9
    __m128i v104;  // q1
    unsigned long v106;  // x10
    unsigned long long v107;  // x10
    uint128_t v108;  // q1
    unsigned long v0;  // [bp-0xb0]
    unsigned long long v1;  // [bp-0xa8]
    unsigned long v2;  // [bp-0xa0]
    unsigned long v3;  // [bp-0x98]
    unsigned long long v4;  // [bp-0x90]
    unsigned int v5;  // [bp-0x88]
    unsigned int *ptr1;  // [bp-0x80]
    unsigned long long v7;  // [bp-0x78]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    ptr = _malloc(4);
    if (ptr)
    {
        v11 = (unsigned int *)ptr;
        *(unsigned int *)ptr = a2;
        v12 = 1;
        v5 = 1;
        ptr1 = (unsigned int *)ptr;
        v13 = a0[1].field_8;
        v14 = a0->field_0;
        v15 = a0->field_8;
        v4 = 5871781006564002453 * (a3 + 8);
        v1 = v4 >> 57;
        v16 = v1 & 0xff | (v1 & 0xff) * 0x100 | (v1 & 0xff | (v1 & 0xff) * 0x100) * 0x10000 | (v1 & 0xff | (v1 & 0xff) * 0x100 | (v1 & 0xff | (v1 & 0xff) * 0x100) * 0x10000) * 0x100000000;
        v17 = *(long long *)(idx + 56);
        v18 = *(long long *)(idx + 64);
        v2 = *(long long *)(idx + 32);
        v3 = *(long long *)(idx + 40);
        while (1)
        {
            v12 -= 1;
            v7 = v12;
            if (!v13)
            {
                sub_c73c64(&g_efa2d0);
                __debugbreak();
            }
            v19 = 0;
            v20 = v11[v12];
            v21 = 5871781006564002453 * v20;
            v22 = v21 >> 57 & 0xff | (v21 >> 57 & 0xff) * 0x100 | (v21 >> 57 & 0xff | (v21 >> 57 & 0xff) * 0x100) * 0x10000 | (v21 >> 57 & 0xff | (v21 >> 57 & 0xff) * 0x100 | (v21 >> 57 & 0xff | (v21 >> 57 & 0xff) * 0x100) * 0x10000) * 0x100000000;
            v23 = v21 & v15;
            v24 = *(long long *)((char *)v14 + v23);
            v26 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v24, v22));
            v27 = v26 & 0x8080808080808080;
            if (!(v26 & 0x8080808080808080))
            {
                do
                {
LABEL_bd4648:
                    v28 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v24, _mm_set1_epi8(-1)));
                    if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v28, v28), _mm_unpacklo_epi64(v28, v28)))))))))) & 1)
                    {
                        sub_c73c64(&g_efa2d0);
                        __debugbreak();
                    }
                    v19 += 8;
                    v23 = v23 + v19 & v15;
                    v24 = *(long long *)((char *)v14 + v23);
                    v31 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v24, v22));
                    v27 = v31 & 0x8080808080808080;
                } while (!(v31 & 0x8080808080808080));
            }
            while (1)
            {
                v32 = v27;
                v33 = v13;
                v34 = ((((((v32 & 0xaaaaaaaaaaaaaaaa) >> 1 | v32 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v32 & 0xaaaaaaaaaaaaaaaa) >> 1 | v32 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v32 & 0xaaaaaaaaaaaaaaaa) >> 1 | v32 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v32 & 0xaaaaaaaaaaaaaaaa) >> 1 | v32 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                v35 = (((((((v32 & 0xaaaaaaaaaaaaaaaa) >> 1 | v32 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v32 & 0xaaaaaaaaaaaaaaaa) >> 1 | v32 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v32 & 0xaaaaaaaaaaaaaaaa) >> 1 | v32 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v32 & 0xaaaaaaaaaaaaaaaa) >> 1 | v32 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                v36 = ((((v35 | v34) & 0xffff0000ffff0000) >> 16 | (v35 | v34) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v35 | v34) & 0xffff0000ffff0000) >> 16 | (v35 | v34) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                if (!v36)
                    v37 = 64;
                else
                    v37 = Clz(v36);
                v38 = (char *)v14 + -(200 * (v23 + (v37 >> 3) & v15));
                if ((unsigned int)v20 == *(int *)((char *)v38 - 200))
                    break;
                v39 = v32 - 1;
                v27 = v39 & v32;
                v13 = v33;
                if (!(v39 & v32))
                    goto LABEL_bd4648;
            }
            if (*(long long *)((char *)v38 - 0x88))
            {
                v40 = 0;
                v41 = *(long long *)((char *)v38 - 160);
                v42 = *(long long *)((char *)v38 - 152);
                v43 = v4 & v42;
                v44 = *(long long *)((char *)v41 + v43);
                v46 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v44, v16));
                v47 = v46 & 0x8080808080808080;
                if (v46 & 0x8080808080808080)
                {
                    do
                    {
LABEL_bd46ac:
                        v52 = v47;
                        v53 = ((((((v52 & 0xaaaaaaaaaaaaaaaa) >> 1 | v52 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v52 & 0xaaaaaaaaaaaaaaaa) >> 1 | v52 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v52 & 0xaaaaaaaaaaaaaaaa) >> 1 | v52 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v52 & 0xaaaaaaaaaaaaaaaa) >> 1 | v52 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                        v54 = (((((((v52 & 0xaaaaaaaaaaaaaaaa) >> 1 | v52 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v52 & 0xaaaaaaaaaaaaaaaa) >> 1 | v52 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v52 & 0xaaaaaaaaaaaaaaaa) >> 1 | v52 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v52 & 0xaaaaaaaaaaaaaaaa) >> 1 | v52 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                        v55 = ((((v54 | v53) & 0xffff0000ffff0000) >> 16 | (v54 | v53) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v54 | v53) & 0xffff0000ffff0000) >> 16 | (v54 | v53) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                        if (!v55)
                            v56 = 64;
                        else
                            v56 = Clz(v55);
                        if (a3 == *(long long *)*(long long *)((char *)&v41[-1 * (v43 + (v56 >> 3) & v42)] - 8))
                            goto LABEL_bd4b58;
                    } while ((v57 = v52 - 1, v47 = v57 & v52, v57 & v52));
                }
                do
                {
                    v48 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v44, _mm_set1_epi8(-1)));
                    if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v48, v48), _mm_unpacklo_epi64(v48, v48)))))))))) & 1)
                        goto LABEL_bd4714;
                    v40 += 8;
                    v43 = v43 + v40 & v42;
                    v44 = *(long long *)((char *)v41 + v43);
                    v51 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v44, v16));
                    v47 = v51 & 0x8080808080808080;
                } while (!(v51 & 0x8080808080808080));
                goto LABEL_bd46ac;
            }
LABEL_bd4714:
            if (!*(long long *)((char *)v38 - 40))
                break;
            v58 = 0;
            v59 = *(long long *)((char *)v38 - 64);
            v60 = *(long long *)((char *)v38 - 56);
            v61 = v4 & v60;
            v62 = *(long long *)((char *)v59 + v61);
            v64 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v62, v16));
            v65 = v64 & 0x8080808080808080;
            if (!(v64 & 0x8080808080808080))
            {
                do
                {
LABEL_bd476c:
                    v66 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v62, _mm_set1_epi8(-1)));
                    if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v66, v66), _mm_unpacklo_epi64(v66, v66)))))))))) & 1)
                        goto LABEL_bd47a4;
                    v58 += 8;
                    v61 = v61 + v58 & v60;
                    v62 = *(long long *)((char *)v59 + v61);
                    v69 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v62, v16));
                    v65 = v69 & 0x8080808080808080;
                } while (!(v69 & 0x8080808080808080));
            }
            while (1)
            {
                v70 = v65;
                v71 = ((((((v70 & 0xaaaaaaaaaaaaaaaa) >> 1 | v70 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v70 & 0xaaaaaaaaaaaaaaaa) >> 1 | v70 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v70 & 0xaaaaaaaaaaaaaaaa) >> 1 | v70 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v70 & 0xaaaaaaaaaaaaaaaa) >> 1 | v70 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                v72 = (((((((v70 & 0xaaaaaaaaaaaaaaaa) >> 1 | v70 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v70 & 0xaaaaaaaaaaaaaaaa) >> 1 | v70 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v70 & 0xaaaaaaaaaaaaaaaa) >> 1 | v70 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v70 & 0xaaaaaaaaaaaaaaaa) >> 1 | v70 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                v73 = ((((v72 | v71) & 0xffff0000ffff0000) >> 16 | (v72 | v71) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v72 | v71) & 0xffff0000ffff0000) >> 16 | (v72 | v71) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                if (!v73)
                    v74 = 64;
                else
                    v74 = Clz(v73);
                if (a3 == *(long long *)((char *)&v59[-1 * (v61 + (v74 >> 3) & v60)] - 8))
                    break;
                v75 = v70 - 1;
                v65 = v75 & v70;
                if (!(v75 & v70))
                    goto LABEL_bd476c;
            }
LABEL_bd4b58:
            v13 = v33;
LABEL_bd4b5c:
            if (!v12)
            {
                if (v5)
                {
                    _free();
                    return;
                }
                return;
            }
        }
        do
        {
LABEL_bd47a4:
            /* unsupported instruction */;
            /* unsupported instruction */;
        } while (/* unsupported instruction */ ^ 1);
        if ((long long)/* unsupported instruction */ < 0)
            goto LABEL_bd4bd0;
        idx = a3;
        ptr = sub_bb081c(v38 - 64, idx);
        if (*(long long *)((char *)v38 - 72))
        {
            v76 = 0;
            v77 = *(long long *)((char *)v38 - 96);
            v78 = *(long long *)((char *)v38 - 88);
            v79 = v4 & v78;
            v80 = *(long long *)((char *)v77 + v79);
            v82 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v80, v16));
            v83 = v82 & 0x8080808080808080;
            if (v82 & 0x8080808080808080)
            {
LABEL_bd47f0:
                v13 = v33;
                do
                {
                    v88 = v83;
                    v89 = ((((((v88 & 0xaaaaaaaaaaaaaaaa) >> 1 | v88 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v88 & 0xaaaaaaaaaaaaaaaa) >> 1 | v88 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v88 & 0xaaaaaaaaaaaaaaaa) >> 1 | v88 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v88 & 0xaaaaaaaaaaaaaaaa) >> 1 | v88 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                    v90 = (((((((v88 & 0xaaaaaaaaaaaaaaaa) >> 1 | v88 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v88 & 0xaaaaaaaaaaaaaaaa) >> 1 | v88 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v88 & 0xaaaaaaaaaaaaaaaa) >> 1 | v88 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v88 & 0xaaaaaaaaaaaaaaaa) >> 1 | v88 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                    v91 = ((((v90 | v89) & 0xffff0000ffff0000) >> 16 | (v90 | v89) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v90 | v89) & 0xffff0000ffff0000) >> 16 | (v90 | v89) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                    if (!v91)
                        v92 = 64;
                    else
                        v92 = Clz(v91);
                    if (a3 == *(long long *)*(long long *)((char *)&v77[-1 * (v79 + (v92 >> 3) & v78)] - 8))
                        goto LABEL_bd4b5c;
                } while ((v93 = v88 - 1, v83 = v93 & v88, v93 & v88));
            }
            do
            {
                v84 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v80, _mm_set1_epi8(-1)));
                if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v84, v84), _mm_unpacklo_epi64(v84, v84)))))))))) & 1)
                    goto LABEL_bd485c;
                v76 += 8;
                v79 = v79 + v76 & v78;
                v80 = *(long long *)((char *)v77 + v79);
                v87 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v80, v16));
                v83 = v87 & 0x8080808080808080;
            } while (!(v87 & 0x8080808080808080));
            goto LABEL_bd47f0;
        }
        else
        {
LABEL_bd485c:
            if (v3 > v20)
            {
                v94 = v2 + v20 * 32;
                if (v94->field_0 == 0x8000000000000000)
                {
                    v95 = 0xffffffff;
                    v96 = 0xffffffff;
                    if (0xffffffff >= v18)
                        goto LABEL_bd48b8;
                }
                else
                {
                    v95 = v94->field_1c;
                    v96 = 0xffffffff;
                    if (0xffffffff >= v18)
                        goto LABEL_bd48b8;
                }
            }
            else
            {
                v95 = 0xffffffff;
                v96 = 0xffffffff;
                if (0xffffffff >= v18)
                    goto LABEL_bd48b8;
            }
        }
    }
    else
    {
        idx = 4;
        ptr = sub_c6ba70(4, 4);
LABEL_bd4bd0:
        sub_c769bc(ptr, idx);
        do
        {
            /* unsupported instruction */;
            /* unsupported instruction */;
            /* unsupported instruction */;
        } while (/* unsupported instruction */ ^ 1);
        v158 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
        if (!(v158 & 1))
        {
            /* unsupported instruction */;
            sub_b86a90(a3);
        }
        if (v5)
            _free(ptr1);
        __Unwind_Resume();
    }
    while (1)
    {
        v97 = v17 + 48 * v96;
        v0 = v97[8];
        v98 = v97[11];
        while (1)
        {
            v99 = 0;
            v100 = 5871781006564002453 * v98;
            v101 = v100 >> 57 & 0xff | (v100 >> 57 & 0xff) * 0x100 | (v100 >> 57 & 0xff | (v100 >> 57 & 0xff) * 0x100) * 0x10000 | (v100 >> 57 & 0xff | (v100 >> 57 & 0xff) * 0x100 | (v100 >> 57 & 0xff | (v100 >> 57 & 0xff) * 0x100) * 0x10000) * 0x100000000;
            v103 = v100 & v15;
            v104 = *(long long *)((char *)v14 + v103);
            v106 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v104, v101));
            v107 = v106 & 0x8080808080808080;
            if (!(v106 & 0x8080808080808080))
            {
                do
                {
LABEL_bd496c:
                    v108 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v104, _mm_set1_epi8(-1)));
                    if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v108, v108), _mm_unpacklo_epi64(v108, v108)))))))))) & 1)
                    {
                        sub_c73c64(0xefa2e8);
                        __debugbreak();
                    }
                    v99 += 8;
                    v103 = v103 + v99 & v15;
                    v104 = *(long long *)((char *)v14 + v103);
                    v111 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v104, v101));
                    v107 = v111 & 0x8080808080808080;
                } while (!(v111 & 0x8080808080808080));
            }
            while (1)
            {
                v112 = v107;
                ptr = (unsigned int)&g_efa2e8;
                v113 = ((((((v112 & 0xaaaaaaaaaaaaaaaa) >> 1 | v112 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v112 & 0xaaaaaaaaaaaaaaaa) >> 1 | v112 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v112 & 0xaaaaaaaaaaaaaaaa) >> 1 | v112 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v112 & 0xaaaaaaaaaaaaaaaa) >> 1 | v112 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                v114 = (((((((v112 & 0xaaaaaaaaaaaaaaaa) >> 1 | v112 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v112 & 0xaaaaaaaaaaaaaaaa) >> 1 | v112 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v112 & 0xaaaaaaaaaaaaaaaa) >> 1 | v112 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v112 & 0xaaaaaaaaaaaaaaaa) >> 1 | v112 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                v115 = ((((v114 | v113) & 0xffff0000ffff0000) >> 16 | (v114 | v113) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v114 | v113) & 0xffff0000ffff0000) >> 16 | (v114 | v113) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                if (!v115)
                    v116 = 64;
                else
                    v116 = Clz(v115);
                v117 = (char *)v14 + -(200 * (v103 + (v116 >> 3) & v15));
                if (v98 == *(int *)((char *)v117 - 200))
                    break;
                v118 = v112 - 1;
                v107 = v118 & v112;
                if (!(v118 & v112))
                    goto LABEL_bd496c;
            }
            do
            {
                /* unsupported instruction */;
                /* unsupported instruction */;
                v119 = /* unsupported instruction */ ^ 1;
            } while (v119);
            if ((long long)/* unsupported instruction */ < 0)
                goto LABEL_bd4bd0;
            if (!*(long long *)((char *)v117 - 16))
            {
                idx = 1;
                ptr = sub_c6e2f4(v117 - 32, 1, v117);
            }
            v120 = 0;
            v121 = 0;
            v122 = *(long long *)((char *)v117 - 32);
            v123 = *(long long *)((char *)v117 - 24);
            v124 = v4 & v123;
            v125 = *(long long *)((char *)v122 + v124);
            v127 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v125, v16));
            v128 = v127 & 0x8080808080808080;
            if (!(v127 & 0x8080808080808080))
            {
                do
                {
LABEL_bd4a14:
                    if (v120 == 1)
                    {
LABEL_bd4a38:
                        v134 = _mm_set1_epi32(-1);
                        v135 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v125, v134));
                        if (!((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v135, v135), _mm_unpacklo_epi64(v135, v135)))))))))) & 1))
                        {
                            v120 = 1;
                            goto LABEL_bd4a58;
                        }
                        v147 = *((char *)v122 + v119);
                        if (!(v147 >> 31 & 1))
                        {
                            v149 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v122));
                            v150 = ((((((v149 & 0xaaaaaaaaaaaaaaaa) >> 1 | v149 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v149 & 0xaaaaaaaaaaaaaaaa) >> 1 | v149 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v149 & 0xaaaaaaaaaaaaaaaa) >> 1 | v149 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v149 & 0xaaaaaaaaaaaaaaaa) >> 1 | v149 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                            v151 = (((((((v149 & 0xaaaaaaaaaaaaaaaa) >> 1 | v149 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v149 & 0xaaaaaaaaaaaaaaaa) >> 1 | v149 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v149 & 0xaaaaaaaaaaaaaaaa) >> 1 | v149 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v149 & 0xaaaaaaaaaaaaaaaa) >> 1 | v149 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                            v152 = ((((v151 | v150) & 0xffff0000ffff0000) >> 16 | (v151 | v150) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v151 | v150) & 0xffff0000ffff0000) >> 16 | (v151 | v150) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                            if (!v152)
                                v153 = 64;
                            else
                                v153 = Clz(v152);
                            v119 = v153 >> 3;
                            v147 = *((char *)v122 + v119);
                        }
                        v154 = v1;
                        *((char *)v122 + v119) = v154;
                        *((char *)v122 + (v123 & v119 - 8) + 8) = v154;
                        v155 = (__m128i)_INSERT(v134, 0, __longlong_as_double(v147 & 1));
                        *(__m128i *)((char *)v117 - 16) = _mm_sub_epi64(*(int128_t *)((char *)v117 - 16), v155);
                        *(unsigned long *)((char *)&v122[-1 * v119] - 8) = a3;
                        index = v7;
                        if (index != v5)
                            goto LABEL_bd4b04;
                        goto LABEL_bd4afc;
                    }
                    v119 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), v125));
                    if (v119)
                    {
                        v130 = ((((((v119 & 0xaaaaaaaaaaaaaaaa) >> 1 | v119 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v119 & 0xaaaaaaaaaaaaaaaa) >> 1 | v119 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v119 & 0xaaaaaaaaaaaaaaaa) >> 1 | v119 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v119 & 0xaaaaaaaaaaaaaaaa) >> 1 | v119 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                        v131 = (((((((v119 & 0xaaaaaaaaaaaaaaaa) >> 1 | v119 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v119 & 0xaaaaaaaaaaaaaaaa) >> 1 | v119 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v119 & 0xaaaaaaaaaaaaaaaa) >> 1 | v119 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v119 & 0xaaaaaaaaaaaaaaaa) >> 1 | v119 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                        v132 = ((((v131 | v130) & 0xffff0000ffff0000) >> 16 | (v131 | v130) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v131 | v130) & 0xffff0000ffff0000) >> 16 | (v131 | v130) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                        if (!v132)
                            v133 = 64;
                        else
                            v133 = Clz(v132);
                        v119 = v124 + (v133 >> 3) & v123;
                        goto LABEL_bd4a38;
                    }
                    v120 = 0;
LABEL_bd4a58:
                    v121 += 8;
                    v124 = v121 + v124 & v123;
                    v125 = *(long long *)((char *)v122 + v124);
                    v138 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v125, v16));
                    v128 = v138 & 0x8080808080808080;
                } while (!(v138 & 0x8080808080808080));
            }
            while (1)
            {
                v139 = v128;
                v140 = ((((((v139 & 0xaaaaaaaaaaaaaaaa) >> 1 | v139 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v139 & 0xaaaaaaaaaaaaaaaa) >> 1 | v139 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v139 & 0xaaaaaaaaaaaaaaaa) >> 1 | v139 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v139 & 0xaaaaaaaaaaaaaaaa) >> 1 | v139 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                v141 = (((((((v139 & 0xaaaaaaaaaaaaaaaa) >> 1 | v139 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v139 & 0xaaaaaaaaaaaaaaaa) >> 1 | v139 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v139 & 0xaaaaaaaaaaaaaaaa) >> 1 | v139 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v139 & 0xaaaaaaaaaaaaaaaa) >> 1 | v139 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                v142 = ((((v141 | v140) & 0xffff0000ffff0000) >> 16 | (v141 | v140) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v141 | v140) & 0xffff0000ffff0000) >> 16 | (v141 | v140) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                if (!v142)
                    v143 = 64;
                else
                    v143 = Clz(v142);
                if (a3 == *(long long *)((char *)&v122[-1 * (v124 + (v143 >> 3) & v123)] - 8))
                    break;
                v144 = v139 - 1;
                v128 = v144 & v139;
                if (!(v144 & v139))
                    goto LABEL_bd4a14;
            }
            do
            {
                /* unsupported instruction */;
                /* unsupported instruction */;
                /* unsupported instruction */;
            } while (/* unsupported instruction */ ^ 1);
            v145 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
            if (!(v145 & 1))
            {
                /* unsupported instruction */;
                ptr = sub_b86a90(a3);
            }
            index = v7;
            if (index != v5)
                goto LABEL_bd4b04;
LABEL_bd4afc:
            ptr = sub_c6c494(&v5);
LABEL_bd4b04:
            v11 = ptr1;
            v11[index] = v98;
            v12 = index + 1;
            v7 = v12;
            v96 = v0;
            if (v18 > v96)
                break;
LABEL_bd48b8:
            v0 = v96;
            do
            {
                if (v18 <= v95)
                    goto LABEL_bd4b58;
            } while ((v156 = v17 + 48 * v95, v95 = v156[9], v98 = v156[10], v157 = arm64g_calculate_condition(1, v98 & 0xffffffff, 1, 0), v157 & 1));
        }
    }
}
