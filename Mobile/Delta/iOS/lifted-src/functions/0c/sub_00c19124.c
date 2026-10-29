/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc19124..0xc1a154 (4144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c19124_1 {
    char padding_0[24];
    char field_18;
    char padding_19[7];
    unsigned long long field_20;
    char padding_28[16];
    unsigned long long field_38;
    unsigned long long field_40;
    char padding_48[52];
    unsigned int field_7c;
    char padding_80[16];
    struct st_c19124_2 *field_90;
    unsigned long long field_98;
    unsigned long long field_a0;
} st_c19124_1;

typedef struct st_c19124_4 {
    unsigned long long field_0;
    char padding_8[16];
    unsigned int field_18;
} st_c19124_4;

typedef struct st_c19124_3 {
    unsigned long long field_0;
    char padding_8[20];
    unsigned int field_1c;
} st_c19124_3;

typedef struct st_c19124_0 {
    char padding_0[8];
    char field_8;
    char padding_9[7];
    unsigned long long field_10[2];
    char field_18;
    char padding_19[7];
    unsigned long long field_20;
} st_c19124_0;

typedef struct st_c19124_2 {
    unsigned long long field_0;
} st_c19124_2;

typedef struct st_c19124_5 {
    unsigned long long field_0[2];
    char field_8;
    char padding_9[7];
    char field_10[16];
    uint128_t field_20;
    uint128_t field_30;
    struct st_c19124_0 *field_40;
    struct st_c19124_0 *field_48;
} st_c19124_5;

extern long long g_efbcb0;
extern long long g_efbcc8;
extern long long g_efbce0;
extern long long g_efbe60;
extern long long g_efbe78;
extern long long g_efbec0;
extern long long g_efbed8;
extern long long g_efbef0;
extern long long g_efbf08;
extern long long g_efbf20;
extern long long g_efbf38;

unsigned long long sub_c19124(st_c19124_1 *a0, unsigned long long a1, long long a2, long long a3)
{
    unsigned long long v42;  // x24
    st_c19124_4 *v43;  // x10
    unsigned long long v52;  // x22
    unsigned long v143;  // x8
    unsigned long v144;  // x8
    st_c19124_0 *v145;  // x21
    unsigned long long v146;  // x9
    st_c19124_0 *v148;  // x8
    unsigned long v149;  // x8
    unsigned long v150;  // x9
    unsigned long long ptr;  // x0
    st_c19124_4 *v53;  // x10
    unsigned long long v152;  // x19
    unsigned int v54;  // w10
    unsigned long long v55;  // x8
    unsigned long idx;  // x11
    unsigned long long v57;  // x9
    unsigned long long v58;  // x9
    unsigned long long v59;  // x13
    unsigned long long *v60;  // x12
    unsigned long v61;  // x10
    unsigned int v44;  // w10
    __m128i v62;  // q0
    unsigned long long v63;  // x13
    __m128i v64;  // q2
    unsigned long v66;  // x14
    unsigned long long v67;  // x14
    __m128i v68;  // q2
    unsigned long v71;  // x14
    unsigned long v45;  // x20
    unsigned long long v72;  // x14
    unsigned long long v73;  // 4128
    unsigned long long v74;  // 4130
    unsigned long long v75;  // x15
    unsigned long long v76;  // x15
    unsigned long long v77;  // x15
    unsigned int *v78;  // x9
    unsigned long long idx1;  // x10
    unsigned long long v80;  // x12
    unsigned long long v81;  // x12
    unsigned long long v82;  // w25
    unsigned long long v83;  // x10
    unsigned int *v84;  // x11
    unsigned long long idx2;  // x12
    unsigned long long v86;  // x13
    unsigned long long v87;  // x14
    unsigned long long v88;  // x14
    unsigned long long v89;  // x26
    unsigned long long v90;  // x12
    long long v47;  // x0
    unsigned long long v93;  // w23
    unsigned long long v94;  // w0
    st_c19124_3 *v95;  // x8
    unsigned long long v96;  // x11
    unsigned long long iter;  // x12
    unsigned long v98;  // x8
    unsigned long long i;  // x9
    unsigned long long k;  // x13
    unsigned int *v101;  // x15
    unsigned long long *v48;  // x8
    unsigned long long v102;  // 4127
    st_c19124_3 *v103;  // x10
    unsigned long long v104;  // x10
    unsigned long long j;  // x11
    unsigned int *v106;  // x13
    unsigned long long v107;  // 4127
    unsigned long long *v108;  // x25
    void* v109;  // x21
    unsigned long long ptr1;  // x0
    st_c19124_5 *v111;  // x22
    unsigned long long v49;  // x21
    st_c19124_0 **v112;  // x23
    unsigned long long v113;  // 4106
    unsigned long long ptr2;  // x0
    st_c19124_0 **v115;  // x24
    unsigned long v116;  // cc_op
    unsigned long v117;  // cc_dep1
    unsigned long v118;  // cc_dep2
    unsigned long v119;  // cc_ndep
    unsigned long long v120;  // 4102
    unsigned long long v121;  // 4112
    st_c19124_4 *v50;  // x10
    unsigned long long v122;  // 4102
    unsigned long long v123;  // 4112
    unsigned long long v124;  // 4102
    st_c19124_0 *v125;  // x21
    uint128_t *v126;  // x25
    uint128_t v127;  // q1
    uint128_t v128;  // q1
    st_c19124_0 *v129;  // x8
    st_c19124_0 *v130;  // x28
    unsigned long long v131;  // x8
    unsigned int v51;  // w10
    unsigned long long *v132;  // x9
    unsigned long long v133;  // x10
    unsigned long long v134;  // x9
    unsigned long long *v135;  // x11
    unsigned long long v136;  // x8
    unsigned long long v137;  // x8
    uint128_t v138;  // q0
    unsigned long long v140;  // x8
    uint128_t v141;  // q0
    unsigned long long *v0;  // [bp-0x2e0]
    char v1;  // [bp-0x2d8], Other Possible Types: unsigned long long
    unsigned int *v2;  // [bp-0x2d0]
    unsigned long long v3;  // [bp-0x2c8]
    unsigned long v4;  // [bp-0x2c0]
    unsigned long long v5;  // [bp-0x2b8]
    unsigned int v6;  // [bp-0x2b0]
    unsigned long long v7;  // [bp-0x2ac]
    char v8;  // [bp-0x2a0]
    unsigned int *v9;  // [bp-0x298]
    unsigned long long v10;  // [bp-0x290]
    unsigned long v11;  // [bp-0x288]
    unsigned long long v12;  // [bp-0x280]
    unsigned int v13;  // [bp-0x278]
    unsigned long long v14;  // [bp-0x274]
    char v15;  // [bp-0x268]
    unsigned int *v16;  // [bp-0x260]
    unsigned long long v17;  // [bp-0x258]
    unsigned long v18;  // [bp-0x250]
    unsigned long long v19;  // [bp-0x248]
    unsigned int v20;  // [bp-0x240]
    unsigned long long v21;  // [bp-0x23c]
    uint128_t v22;  // [bp-0x230]
    unsigned long long v23;  // [bp-0x220]
    uint128_t v24;  // [bp-0x210]
    unsigned long long v25;  // [bp-0x200]
    uint248_t v26;  // [bp-0x1f0]
    uint248_t v27;  // [bp-0x1f0]
    uint128_t v28;  // [bp-0x1f0]
    unsigned long long v29;  // [bp-0x1e0]
    uint128_t v30;  // [bp-0x1d0]
    unsigned long long v31;  // [bp-0x1c0]
    uint128_t v32;  // [bp-0x1b8], Other Possible Types: uint384_t, uint320_t, unsigned long long
    uint384_t v33;  // [bp-0x1b8]
    unsigned long v34;  // [bp-0x1b8]
    unsigned long v35;  // [bp-0x1b0], Other Possible Types: unsigned long long
    unsigned long v36;  // [bp-0x1a8], Other Possible Types: unsigned long long
    unsigned long long v37;  // [bp-0x1a0]
    unsigned int v38;  // [bp-0x194]
    uint128_t v39;  // [bp-0x188]
    char *v40;  // [bp-0x10]
    char v41;  // [bp+0x0]

    v40 = &v41;
    v42 = a1 & 0xffffffff;
    if ((unsigned long long)*(long long *)&a0->padding_28[0] <= v42 || (v43 = a0->field_20 + v42 * 32, v43->field_0 == 0x8000000000000000))
        v44 = 0xffffffff;
    else
        v44 = v43->field_18;
    v4 = a0->field_38;
    v5 = a0->field_40;
    v6 = v44;
    v7 = 0xffffffffffffffff;
    sub_c27e78(&v1, &v4);
    if (sub_c1a154(a0, a1, a2, a3) & 1)
    {
        if (*(long long *)&a0[1].padding_0[0])
        {
            v45 = a0->field_98;
            if (v45)
            {
                _memset(a0->field_90, 0xff, v45 + 9);
                if (v45 >= 8)
                    v45 = (v45 + 1 >> 3) * 7;
            }
            else
            {
                v45 = 0;
            }
            a0->field_a0 = v45;
            *(unsigned long long *)&a0[1].padding_0[0] = 0;
        }
        if (*(int *)&a0->padding_48[48] == 1)
        {
            sub_c2b800(&a0->field_18, a0->field_7c, &a0->field_90);
        }
        else
        {
            v47 = &g_efbcb0;
            goto LABEL_c19a74;
        }
        goto LABEL_c192e0;
    }
    if (sub_c21dac(a0, a1) & 1)
        goto LABEL_c192e0;
    if (!v3)
    {
LABEL_c192ac:
        if (!v1)
            return 0;
        _free(v2);
        return 0;
    }
    if (v3 == 1)
    {
        v152 = sub_c22470(a0, a1, 1, *v2);
        goto LABEL_c19330;
    }
    if (v3 == 2)
    {
        sub_bd8d30(&v32, a0, a1);
        if (!*(unsigned long long *)&v32)
        {
            sub_c73c64(&g_efbcc8);
        }
        else if ((unsigned long long)*(long long *)&a0->padding_28[0] > v42 && !(v48 = a0->field_20 + v42 * 32, *v48 == 0x8000000000000000))
        {
            if (!v48[2])
            {
                v47 = &g_efbe78;
                goto LABEL_c19a74;
            }
            if (*(long long *)(v48[1] + 264 * v48[2] - 240) != 16)
                goto LABEL_c192ac;
            v49 = *(unsigned int *)((void*)&v32 + 12);
            if ((unsigned long long)*(long long *)&a0->padding_28[0] <= v49 || (v50 = a0->field_20 + v49 * 32, v50->field_0 == 0x8000000000000000))
                v51 = 0xffffffff;
            else
                v51 = v50->field_18;
            v52 = v38;
            v11 = a0->field_38;
            v12 = a0->field_40;
            v13 = v51;
            v14 = 0xffffffffffffffff;
            sub_c27e78(&v8, &v11);
            if ((unsigned long long)*(long long *)&a0->padding_28[0] <= v52 || (v53 = a0->field_20 + v52 * 32, v53->field_0 == 0x8000000000000000))
                v54 = 0xffffffff;
            else
                v54 = v53->field_18;
            v18 = a0->field_38;
            v19 = a0->field_40;
            v20 = v54;
            v21 = 0xffffffffffffffff;
            sub_c27e78(&v15, &v18);
            v55 = v10;
            idx = v55 - 1;
            if (1 < v55 || !(v57 = v17, v57 <= 1))
            {
                if (!*(long long *)&a0[1].padding_0[0])
                    goto LABEL_c1988c;
                v58 = 0;
                v59 = 5871781006564002453 * v42;
                v60 = a0->field_90;
                v61 = a0->field_98;
                v62 = v59 >> 57 & 0xff | (v59 >> 57 & 0xff) * 0x100 | (v59 >> 57 & 0xff | (v59 >> 57 & 0xff) * 0x100) * 0x10000 | (v59 >> 57 & 0xff | (v59 >> 57 & 0xff) * 0x100 | (v59 >> 57 & 0xff | (v59 >> 57 & 0xff) * 0x100) * 0x10000) * 0x100000000;
                v63 = v59 & v61;
                v64 = *(long long *)((char *)v60 + v63);
                v66 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v64, v62));
                v67 = v66 & 0x8080808080808080;
                if (!(v66 & 0x8080808080808080))
                    goto LABEL_c19444;
                while (1)
                {
                    v72 = v67;
                    v73 = ((((((v72 & 0xaaaaaaaaaaaaaaaa) >> 1 | v72 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v72 & 0xaaaaaaaaaaaaaaaa) >> 1 | v72 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v72 & 0xaaaaaaaaaaaaaaaa) >> 1 | v72 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v72 & 0xaaaaaaaaaaaaaaaa) >> 1 | v72 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                    v74 = (((((((v72 & 0xaaaaaaaaaaaaaaaa) >> 1 | v72 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v72 & 0xaaaaaaaaaaaaaaaa) >> 1 | v72 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v72 & 0xaaaaaaaaaaaaaaaa) >> 1 | v72 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v72 & 0xaaaaaaaaaaaaaaaa) >> 1 | v72 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                    v75 = ((((v74 | v73) & 0xffff0000ffff0000) >> 16 | (v74 | v73) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v74 | v73) & 0xffff0000ffff0000) >> 16 | (v74 | v73) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                    if (!v75)
                        v76 = 64;
                    else
                        v76 = Clz(v75);
                    if ((unsigned int)a1 == *(int *)((char *)v60 + -4 * (v63 + (v76 >> 3) & v61) - 4))
                        break;
                    v77 = v72 - 1;
                    v67 = v77 & v72;
                    if (!(v77 & v72))
                    {
                        do
                        {
LABEL_c19444:
                            v68 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v64, _mm_set1_epi8(-1)));
                            if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v68, v68), _mm_unpacklo_epi64(v68, v68)))))))))) & 1)
                                goto LABEL_c1988c;
                            v58 += 8;
                            v63 = v63 + v58 & v61;
                            v64 = *(long long *)((char *)v60 + v63);
                            v71 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v64, v62));
                            v67 = v71 & 0x8080808080808080;
                        } while (!(v71 & 0x8080808080808080));
                    }
                }
                v78 = v9;
                if (v55)
                {
                    idx1 = 0;
                    v80 = v55 * 4;
                    do
                    {
                        v81 = v80;
                        if (v78[idx1] == (unsigned int)a1)
                        {
                            v82 = 0;
                            v78[idx1] = v78[idx];
                            v10 = idx;
                            v83 = 1;
                            v55 = idx;
                            goto LABEL_c194ec;
                        }
                    } while ((idx1 += 1, v80 = v81 - 4, v81 != 4));
                }
                v83 = 0;
                v82 = 1;
LABEL_c194ec:
                v84 = v16;
                idx2 = v17;
                if (idx2)
                {
                    v86 = 0;
                    v87 = idx2 * 4;
                    do
                    {
                        v88 = v87;
                        if (v84[v86] == (unsigned int)a1)
                        {
                            idx2 -= 1;
                            v84[v86] = v84[idx2];
                            v17 = idx2;
                            v89 = 1;
                            goto LABEL_c19534;
                        }
                    } while ((v86 += 1, v87 = v88 - 4, v88 != 4));
                }
                v89 = 0;
                v82 = 1;
LABEL_c19534:
                if (!(v83 & 1) && v55 != 1)
                    goto LABEL_c1988c;
                if (v89 & 1)
                {
                    if (v55 != idx2)
                        goto LABEL_c1988c;
                    if (!idx2)
                        goto LABEL_c1957c;
                }
                else
                {
                    if (idx2 != 1 || v55 != 1)
                        goto LABEL_c1988c;
                }
                do
                {
                    v90 = idx2;
                    if (*v78 != *v84)
                        goto LABEL_c1988c;
                } while ((idx2 = v90 - 1, v78 += 1, v84 += 1, v90 != 1));
LABEL_c1957c:
                if ((unsigned int)v83)
                    v93 = (unsigned int)sub_c231f0(a0, a1, v49);
                else
                    v93 = 0;
                if ((unsigned int)v89)
                    v94 = (unsigned int)sub_c231f0(a0, a1, v52);
                else
                    v94 = 0;
                if ((v93 | v94) != 1)
                    goto LABEL_c1988c;
                if ((v82 | v93 & v94) & 1)
                    goto LABEL_c195d0;
                sub_c73c80("assertion failed: then_changed && else_changedassertion failed: self.function.unconditional_edge(node).is_some()assertion failed: body != headerassertion failed: then_edge.target() == headercapacity overflowassertion failed: <Ix as IndexType>::max().index() == !0 || EdgeIndex::end() != edge_idxprefixCommentAssignWhileBlockCloselocalsSetListobject_localindexNotNegateLengthMutexLabelGenericForInitGenericForNextres_localsgeneratorstateGenericForRcLocalNumForInitcounterlimitNumForNextNumericForinitialassertion failed: <Ix as IndexType>::max().index() == !0 || NodeIndex::end() != node_idxUnconditionalBreakVarArgRepeatconditionblockIfthen_blockelse_blockGlobalRefNilBooleanNumberIntegerStringVectorvalueargumentsAddSubMulDivModPowConcatEqualLessThanOrEqualGreaterThanOrEqualGreaterThanAndOrparametersis_variadicLocalMethodCallTableLiteralIndexUnaryBinaryClosureSelectFilterMapmethodrightoperationByAddressReturnvalues @ Because the root is initialized to dominate itself, and is the first node in every path, there must ex", 46, &g_efbec0);
            }
            else if (v55 == v57 && (!v55 || *v9 == *v16))
            {
LABEL_c195d0:
                if ((unsigned long long)*(long long *)&a0->padding_28[0] <= v49 || (v95 = a0->field_20 + v49 * 32, v95->field_0 == 0x8000000000000000))
                    v96 = 0xffffffff;
                else
                    v96 = v95->field_1c;
                iter = 0;
                v98 = a0->field_38;
                i = a0->field_40;
                k = 0xffffffff;
                if (0xffffffff < i)
                    goto LABEL_c1963c;
                while (i > v96)
                {
                    v101 = v98 + 48 * v96;
                    v96 = v101[9];
                    v102 = arm64g_calculate_condition(1, v101[10], 1, 0);
                    if (!(v102 & 1) && !(iter += 1, i <= k))
                    {
                        do
                        {
LABEL_c1963c:
                            k = *(int *)(v98 + 48 * k + 32);
                            iter += 1;
                        } while (k < i);
                    }
                }
                if (iter != 1)
                    goto LABEL_c1988c;
                if ((unsigned long long)*(long long *)&a0->padding_28[0] <= v52 || (v103 = a0->field_20 + v52 * 32, v103->field_0 == 0x8000000000000000))
                    v104 = 0xffffffff;
                else
                    v104 = v103->field_1c;
                for (j = 0; i > v104; j += 1)
                {
                    v106 = v98 + 48 * v104;
                    v104 = v106[9];
                    v107 = arm64g_calculate_condition(1, v106[10], 1, 0);
                }
                if (j != 1)
                    goto LABEL_c1988c;
                sub_bd8578(&v32, a0, v49);
                if (*(unsigned long long *)&v32 == 0x8000000000000000)
                {
                    sub_c73c64(&g_efbed8);
                    __debugbreak();
                }
                v22 = v32;
                v23 = v36;
                sub_bd8578(&v32, a0, v52);
                if (*(unsigned long long *)&v32 == 0x8000000000000000)
                {
                    sub_c73c64(&g_efbef0);
                    __debugbreak();
                }
                v24 = v32;
                v25 = v36;
                if ((unsigned long long)*(long long *)&a0->padding_28[0] <= v42 || !(v108 = a0->field_20 + v42 * 32, *v108 != 0x8000000000000000))
                {
                    sub_c73c64(&g_efbf08);
                    __debugbreak();
                }
                if (!v108[2])
                {
                    sub_c73c64(&g_efbf20);
                    __debugbreak();
                }
                v109 = v108[1] + 264 * v108[2];
                if (*(long long *)((char *)v109 - 240) != 16)
                {
                    sub_c73c64(&g_efbf38);
                    __debugbreak();
                }
                *(uint128_t *)((char *)&v26 + 7) = v22;
                *(unsigned long long *)((char *)&v26 + 23) = v23;
                v32 = _INSERT(CONCAT(v32, 0), 0, 1);
                *((char *)&v32 + 8) = 0;
                *(uint128_t *)((char *)&v32 + 9) = *(uint128_t *)&v26;
                *(uint128_t *)((char *)&v32 + 24) = *(uint128_t *)((void*)&v26 + 15);
                ptr1 = _malloc(40);
                if (!ptr1)
                {
                    sub_c6ba70(8, 40);
                    __debugbreak();
                }
                v111 = v109 - 232;
                *(uint128_t *)ptr1 = *(uint128_t *)&v32;
                *(uint128_t *)(ptr1 + 16) = *(uint128_t *)((void*)&v32 + 16);
                *(unsigned long long *)(ptr1 + 32) = *(unsigned long long *)((void*)&v32 + 32);
                v112 = v109 - 168;
                do
                {
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                } while (/* unsupported instruction */ ^ 1);
                v0 = v108;
                v113 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                if (!(v113 & 1))
                {
                    /* unsupported instruction */;
                    sub_b869ec(v112);
                }
                *v112 = ptr1;
                *(uint128_t *)((char *)&v26 + 7) = v24;
                v27 = _INSERT(v26, 23, v25);
                v32 = _INSERT(CONCAT(v32, 0), 0, 1);
                *((char *)&v32 + 8) = 0;
                *(uint128_t *)((char *)&v32 + 9) = *(uint128_t *)&v27;
                v33 = _INSERT(v32, 24, *(uint128_t *)((void*)&v27 + 15));
                ptr2 = _malloc(40);
                if (!ptr2)
                {
                    sub_c6ba70(8, 40);
                    __debugbreak();
                }
                *(uint128_t *)ptr2 = *(uint128_t *)&v33;
                *(uint128_t *)(ptr2 + 16) = *(uint128_t *)((void*)&v33 + 16);
                *(unsigned long long *)(ptr2 + 32) = *(unsigned long long *)((void*)&v33 + 32);
                v115 = v109 - 160;
                do
                {
                    /* unsupported instruction */;
                    v116 = 4;
                    v117 = /* unsupported instruction */;
                    v118 = 1;
                    v119 = 0;
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                } while (/* unsupported instruction */ ^ 1);
                v120 = arm64g_calculate_condition(20, v117, 1, 0);
                if (!(v120 & 1))
                {
                    /* unsupported instruction */;
                    sub_b869ec(v115);
                }
                *(unsigned long long *)((char *)v109 - 160) = ptr2;
                if (*(long long *)((char *)v109 - 232) == 8)
                {
                    v121 = arm64g_calculate_condition(v116, v117, v118, v119);
                    v122 = arm64g_calculate_condition(3, (v121 & 1 ? *((char *)v109 - 216) : 0), 0, 0);
                    if (v122 & 1)
                        goto LABEL_c198e4;
                    goto LABEL_c19884;
                }
                v123 = arm64g_calculate_condition(v116, v117, v118, v119);
                v124 = arm64g_calculate_condition(0, (v123 & 1 ? *((char *)v109 - 216) : 0), 0, 0);
                if (!(v124 & 1))
                {
LABEL_c19884:
                    v125 = *v112;
                    goto LABEL_c19954;
                }
LABEL_c198e4:
                v126 = sub_b800f8();
                sub_c234c4(&v33, *(long long *)((char *)v109 - 224));
                *v126 = *(uint128_t *)&v33;
                v126[1] = *(uint128_t *)((void*)&v33 + 16);
                v126[2] = *(uint128_t *)((void*)&v33 + 32);
                v126[3] = v39;
                sub_c172f8(v111);
                v127 = v126[1];
                *(uint128_t *)v111->field_0 = *v126;
                *(uint128_t *)&v111->field_8 = v127;
                v128 = v126[3];
                *(uint128_t *)&v111->field_10[8] = v126[2];
                v111->field_20 = v128;
                _free(v126);
                v129 = *v112;
                v125 = *v115;
                *v112 = v125;
                *v115 = v129;
LABEL_c19954:
                /* unsupported instruction */;
                /* unsupported instruction */;
                if (!/* unsupported instruction */)
                {
                    /* unsupported instruction */;
                    if (!(/* unsupported instruction */ ^ 1))
                        goto LABEL_c1996c;
                }
                else
                {
                    /* unsupported instruction */;
                }
                sub_c7573c(&v125->field_8);
LABEL_c1996c:
                v130 = *v115;
                /* unsupported instruction */;
                /* unsupported instruction */;
                if (!/* unsupported instruction */)
                {
                    /* unsupported instruction */;
                    if (!(/* unsupported instruction */ ^ 1))
                        goto LABEL_c19988;
                }
                else
                {
                    /* unsupported instruction */;
                }
                sub_c7573c(&v130->field_8);
LABEL_c19988:
                v131 = *(long long *)&v125->field_18;
                if (v131)
                {
                    v132 = v125->field_10[1] + 264 * v131;
                    if (*(long long *)((char *)v132 - 240) == 27)
                        v133 = (char *)v132 - 264;
                    else
                        v133 = 0;
                }
                else
                {
                    v133 = 0;
                }
                v134 = *(long long *)&v130->field_18;
                if (v134 && v133 && !(v135 = v130->field_10[1] + 264 * v134, *(long long *)((char *)v135 - 240) != 27))
                {
                    if (*(long long *)(v133 + 16))
                    {
                        if (*(long long *)((char *)v135 - 248))
                        {
                            if (v134 <= v131)
                                v136 = v131 > v134;
                            else
                                v136 = 0xff;
                            if (!v136)
                                goto LABEL_c19bbc;
                            if (v136 == 1)
                            {
                                v137 = *(long long *)&v130->field_18;
                                v138 = (uint128_t)v130->field_10;
                                v130->field_10[0] = 0;
                                v130->field_10[1] = 8;
                                *(unsigned long long *)&v130->field_18 = 0;
                                v28 = (uint128_t)v125->field_10;
                                v29 = *(long long *)&v125->field_18;
                                *(uint128_t *)v125->field_10 = v138;
                                *(unsigned long long *)&v125->field_18 = v137;
                                sub_c234c4(&v33, v111);
                                sub_b7fa90(&v33, sub_b7f8bc(&v33, 0), 0, 0);
                                sub_c172f8(v111);
                                goto LABEL_c19ae4;
                            }
                        }
                        v30 = (uint128_t)v130->field_10;
                        v31 = *(long long *)&v130->field_18;
                        v130->field_10[0] = 0;
                        v130->field_10[1] = 8;
                        *(unsigned long long *)&v130->field_18 = 0;
                        goto LABEL_c19bc4;
                    }
                    else
                    {
                        if (*(long long *)((char *)v135 - 248))
                        {
                            v140 = *(long long *)&v130->field_18;
                            v141 = (uint128_t)v130->field_10;
                            v130->field_10[0] = 0;
                            v130->field_10[1] = 8;
                            *(unsigned long long *)&v130->field_18 = 0;
                            v28 = (uint128_t)v125->field_10;
                            v29 = *(long long *)&v125->field_18;
                            *(uint128_t *)v125->field_10 = v141;
                            *(unsigned long long *)&v125->field_18 = v140;
                            sub_c234c4(&v33, v111);
                            sub_b7fa90(&v33, sub_b7f8bc(&v33, 0), 0, 0);
                            sub_c172f8(v111);
                        }
                        else
                        {
                            if (v131)
                            {
                                v143 = v131 - 1;
                                *(unsigned long *)&v125->field_18 = v143;
                                _memcpy(&v33, v125->field_10[1] + 264 * v143, 264);
                                if (*(unsigned long long *)((void*)&v33 + 24) != 33)
                                    sub_c1629c(&v33);
                            }
                            if (*(long long *)&v130->field_18)
                            {
                                v144 = *(long long *)&v130->field_18 - 1;
                                *(unsigned long *)&v130->field_18 = v144;
                                _memcpy(&v33, v130->field_10[1] + 264 * v144, 264);
                                if (*(unsigned long long *)((void*)&v33 + 24) != 33)
                                    sub_c1629c(&v33);
                            }
                            goto LABEL_c19bbc;
                        }
LABEL_c19ae4:
                        *(uint128_t *)v111->field_0 = *(uint128_t *)&v33;
                        *(uint128_t *)&v111->field_8 = *(uint128_t *)((void*)&v33 + 16);
                        *(uint128_t *)&v111->field_10[8] = *(uint128_t *)((void*)&v33 + 32);
                        v111->field_20 = v39;
                        v30 = v28;
                        v31 = v29;
                        goto LABEL_c19bc4;
                    }
                }
LABEL_c19bbc:
                *(unsigned long long *)&v30 = 0x8000000000000000;
                do
                {
LABEL_c19bc4:
                    /* unsupported instruction */;
                    if (/* unsupported instruction */ != 1)
                    {
                        /* unsupported instruction */;
                        sub_c75418(&v130->field_8);
                        break;
                    }
                } while ((/* unsupported instruction */, /* unsupported instruction */, /* unsupported instruction */ ^ 1));
                do
                {
                    /* unsupported instruction */;
                    if (/* unsupported instruction */ != 1)
                    {
                        /* unsupported instruction */;
                        sub_c75418(&v125->field_8);
                        break;
                    }
                } while ((/* unsupported instruction */, /* unsupported instruction */, /* unsupported instruction */ ^ 1));
                v145 = *v112;
                /* unsupported instruction */;
                /* unsupported instruction */;
                if (!/* unsupported instruction */)
                {
                    /* unsupported instruction */;
                    if (!(/* unsupported instruction */ ^ 1))
                        goto LABEL_c19c08;
                }
                else
                {
                    /* unsupported instruction */;
                }
                sub_c7573c(&v145->field_8);
LABEL_c19c08:
                while (1)
                {
                    /* unsupported instruction */;
                    if (/* unsupported instruction */ != 1)
                        break;
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                    if (!(/* unsupported instruction */ ^ 1))
                    {
                        v146 = 1;
                        if (!*(long long *)&v145->field_18)
                            goto LABEL_c19d64;
                        goto LABEL_c19c28;
                    }
                }
                v146 = 0;
                /* unsupported instruction */;
                if (*(long long *)&v145->field_18)
                {
LABEL_c19c28:
                    if (!(v146 & 1))
                        sub_c75418();
                }
                else
                {
LABEL_c19d64:
                    if (!(v146 & 1))
                        sub_c75418();
                    sub_c234c4(&v33, v111);
                    sub_b7fa90(&v33, sub_b7f8bc(&v33, 0), 0, 0);
                    sub_c172f8(v111);
                    *(uint128_t *)v111->field_0 = *(uint128_t *)&v33;
                    *(uint128_t *)&v111->field_8 = *(uint128_t *)((void*)&v33 + 16);
                    *(uint128_t *)&v111->field_10[8] = *(uint128_t *)((void*)&v33 + 32);
                    v111->field_20 = v39;
                    v148 = *v112;
                    *v112 = *v115;
                    *v115 = v148;
                }
                v149 = *(unsigned long long *)&v30;
                if (v149 != 0x8000000000000000)
                {
                    v150 = *(unsigned long long *)((void*)&v30 + 8);
                    v34 = v150;
                    v35 = v150;
                    v36 = v149;
                    v37 = v150 + 264 * v31;
                    sub_c28314(v0, &v34);
                }
                if (v10)
                {
                    ptr = _malloc(40);
                    if (ptr)
                    {
                        *(unsigned int *)ptr = *v9;
                        *(unsigned long long *)(ptr + 8) = 0;
                        *(unsigned long long *)(ptr + 16) = 8;
                        *(unsigned long long *)(ptr + 24) = 0;
                        *(char *)(ptr + 32) = 0;
                        v32 = 1;
                        v35 = ptr;
                        v36 = 1;
                        sub_bd9184(&v28, a0, a1, &v32);
                        sub_c179c8(&v28);
                        goto LABEL_c19ea8;
                    }
                    else
                    {
                        sub_c6ba70(8, 40);
                    }
                }
                else
                {
                    sub_bd8948(&v34, a0, a1);
                    sub_c179c8(&v34);
LABEL_c19ea8:
                    sub_c22470(a0, a1);
                    if (v15)
                        _free(v16);
                    if (v8)
                    {
                        _free(v9);
                        if (!v1)
                            return 1;
                        _free(v2);
                        return 1;
                    }
LABEL_c192e0:
                    if (!v1)
                        return 1;
                    _free(v2);
                    return 1;
                }
            }
            else
            {
LABEL_c1988c:
                if (v15)
                    _free(v16);
                if (v8)
                    _free(v9);
                if (!(sub_c23a08(a0, a1, v49, v52, 0) & 1))
                {
                    v152 = sub_c23a08(a0, a1, v52, v49, 1);
LABEL_c19330:
                    if (!v1)
                        return v152;
                    _free(v2);
                    return v152;
                }
                goto LABEL_c192e0;
            }
        }
        else
        {
            v47 = &g_efbe60;
LABEL_c19a74:
            sub_c73c64(v47);
        }
    }
    else
    {
        sub_c73c80("internal error: entered unreachable codefile name contained an unexpected NUL byte<unnamed>__rust_end_short_backtrace__rust_begin_short_backtraces", 40, &g_efbce0);
    }
    __debugbreak();
}
