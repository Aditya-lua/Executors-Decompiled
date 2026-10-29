/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc15a4c..0xc1629c (2128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c15a4c_6 {
    char padding_0[8];
    struct st_c15a4c_5 *field_8;
    unsigned long long field_10;
} st_c15a4c_6;

typedef struct st_c15a4c_4 {
    unsigned long long field_0;
    char padding_8[16];
    unsigned int field_18;
} st_c15a4c_4;

typedef struct st_c15a4c_5 {
    char padding_0[24];
    unsigned long long field_18;
} st_c15a4c_5;

typedef struct st_c15a4c_3 {
    unsigned long long field_0;
    char padding_8[20];
    unsigned int field_1c;
} st_c15a4c_3;

typedef struct st_c15a4c_0 {
    unsigned long long field_0;
    char padding_8[32];
    unsigned int field_28;
    unsigned int field_2c;
} st_c15a4c_0;

extern unsigned long long g_bef1c8;
extern long long g_cb9d9f;
extern long long g_efbcf8;
extern long long g_efbd10;
extern long long g_efbd28;
extern long long g_efbd40;
extern long long g_efbd58;
extern long long g_efbd70;
extern long long g_efbd88;

double sub_c15a4c(void* a0, unsigned long a1)
{
    unsigned long long i;  // x8
    unsigned long long v20;  // x10
    unsigned long long m;  // x13
    unsigned int *v30;  // x15
    unsigned long long v31;  // 4127
    st_c15a4c_4 *v32;  // x10
    unsigned long long j;  // x10
    unsigned long long v34;  // x11
    unsigned long long *v36;  // x21
    unsigned long long ptr;  // x22
    unsigned long long n;  // x24
    unsigned long long v21;  // x9
    unsigned long v39;  // x25
    unsigned long long k;  // x22
    st_c15a4c_6 *v42;  // x23
    void* v43;  // x27
    unsigned long v44;  // x28
    unsigned long long v45;  // x24
    unsigned long long ptr1;  // x0
    unsigned long long v47;  // x22
    unsigned long long v48;  // x20
    st_c15a4c_0 *v22;  // x10
    void* v49;  // x8
    unsigned long long iter;  // x9
    void* v51;  // x8
    void* v52;  // x8
    unsigned long long v54;  // x11
    unsigned long long v55;  // x12
    void* v56;  // x8
    unsigned long v57;  // x20
    unsigned long long v58;  // x10
    unsigned long v23;  // x25
    __m128i v59;  // q8
    __m128i v60;  // q1
    unsigned long long v61;  // x21
    __m128i v62;  // q9
    unsigned long v64;  // x8
    unsigned long long v65;  // x26
    unsigned long long v66;  // x11
    unsigned long long v68;  // x8
    unsigned long long v24;  // x26
    unsigned long long v69;  // 4128
    unsigned long long v70;  // 4130
    unsigned long long v71;  // x8
    unsigned long long v72;  // x8
    uint128_t v73;  // q0
    unsigned long v76;  // x8
    unsigned long long v77;  // x26
    unsigned long long v78;  // 4132
    unsigned long long v25;  // x20
    unsigned long long v79;  // 4134
    unsigned long long v80;  // x8
    unsigned long long v81;  // x8
    void* v82;  // x25
    unsigned long long v83;  // x8
    unsigned long long v84;  // x22
    unsigned long v85;  // x8
    unsigned long v87;  // x8
    unsigned long long v88;  // 4137
    st_c15a4c_3 *v26;  // x11
    unsigned long long v89;  // 4139
    unsigned long long v90;  // x8
    unsigned long long v91;  // x8
    __m128i v92;  // q1
    void* v93;  // x8
    unsigned long long ptr2;  // x0
    unsigned long long v95;  // x20
    st_c15a4c_5 *v96;  // x22
    unsigned long long v97;  // x8
    long long v98;  // x0
    unsigned long long v27;  // x11
    unsigned long long node;  // x12
    unsigned long long v0;  // [bp-0x220]
    unsigned long long v1;  // [bp-0x218]
    unsigned long long v2;  // [bp-0x210]
    unsigned long long v3;  // [bp-0x208]
    unsigned long v4;  // [bp-0x200]
    unsigned long long v5;  // [bp-0x1f8]
    unsigned long long v6;  // [bp-0x1f0]
    char v7;  // [bp-0x1e8]
    uint128_t v8;  // [bp-0x1d0]
    unsigned long long v9;  // [bp-0x1c0]
    unsigned long long v10;  // [bp-0x1b8]
    uint128_t v11;  // [bp-0x1b0], Other Possible Types: unsigned long long *, char, unsigned long, unsigned long long
    unsigned long long v12;  // [bp-0x1a8]
    uint128_t v13;  // [bp-0x1a0], Other Possible Types: unsigned long long
    unsigned long long v14;  // [bp-0x198]
    uint128_t v15;  // [bp-0xa0]
    uint128_t v16;  // [bp-0x90]
    char *v17;  // [bp-0x10]
    char v18;  // [bp+0x0]

    v17 = &v18;
    i = (long long)a0[64];
    v20 = a1 & 0xffffffff;
    if (i > v20 && !(v21 = (long long)a0[56], v22 = v21 + (unsigned int)v20 * 48, v22->field_0 == 0x8000000000000000))
    {
        v23 = a1;
        v24 = v22->field_28;
        v25 = v22->field_2c;
        if (!v22->padding_8[16])
        {
            if ((unsigned long long)(long long)a0[40] > v25)
            {
                v26 = (long long)a0[32] + v25 * 32;
                if (v26->field_0 == 0x8000000000000000)
                {
                    v27 = 0xffffffff;
                    node = 0;
                    m = 0xffffffff;
                    if (i > 0xffffffff)
                        goto LABEL_c15b48;
                }
                else
                {
                    v27 = v26->field_1c;
                    node = 0;
                    m = 0xffffffff;
                    if (0xffffffff < i)
                        goto LABEL_c15b48;
                }
            }
            else
            {
                v27 = 0xffffffff;
                node = 0;
                m = 0xffffffff;
                if (i > 0xffffffff)
                    goto LABEL_c15b48;
            }
            while (i > v27)
            {
                v30 = v21 + 48 * v27;
                v27 = v30[9];
                v31 = arm64g_calculate_condition(1, v30[10], 1, 0);
                if (!(v31 & 1) && !(node += 1, i <= m))
                {
                    do
                    {
LABEL_c15b48:
                        m = *(int *)(v21 + 48 * m + 32);
                        node += 1;
                    } while (m < i);
                }
            }
            if (node != 1)
                goto LABEL_c15cac;
            if ((unsigned long long)(long long)a0[40] <= v24 || !(v32 = (long long)a0[32] + v24 * 32, v32->field_0 != 0x8000000000000000))
            {
                j = 0xffffffff;
                v34 = 0;
                if (i <= 0xffffffff)
                    goto LABEL_c15bb0;
            }
            else
            {
                j = v32->field_18;
                v34 = 0;
                if (j >= i)
                    goto LABEL_c15bb0;
            }
            do
            {
                j = *(int *)(v21 + 48 * j + 32);
                v34 += 1;
            } while (j < i);
LABEL_c15bb0:
            if (v34 != 1)
            {
                sub_c73c80("assertion failed: self.function.successor_blocks(source).count() == 1no entry found for keyassertion failed: then_changed && else_changedassertion failed: self.function.unconditional_edge(node).is_some()assertion failed: body != headerassertion failed: then_edge.target() == headercapacity overflowassertion failed: <Ix as IndexType>::max().index() == !0 || EdgeIndex::end() != edge_idxprefixCommentAssignWhileBlockCloselocalsSetListobject_localindexNotNegateLengthMutexLabelGenericForInitGenericForNextres_localsgeneratorstateGenericForRcLocalNumForInitcounterlimitNumForNextNumericForinitialassertion failed: <Ix as IndexType>::max().index() == !0 || NodeIndex::end() != node_idxUnconditionalBreakVarArgRepeatconditionblockIfthen_blockelse_blockGlobalRefNilBooleanNumberIntegerStringVectorvalueargumentsAddSubMulDivModPowConcatEqualLessThanOrEqualGreaterThanOrEqualGreaterThanAndOrparametersis_variadicLocalMethodCallTableLiteralIndexUnaryBinaryClosureSelectFilterMapmethodrightoperationByAddressReturnvalues @ Because the", 69, &g_efbd40);
                sub_c73c64(&g_efbd10);
                __debugbreak();
            }
            sub_bd8948(&v7, a0, v25);
            sub_bd8578(&v11, a0, v25);
            if (*(unsigned long long *)&v11 == 0x8000000000000000)
            {
                sub_c73c64(&g_efbd10);
                __debugbreak();
            }
            v8 = v11;
            v9 = v13;
            if ((unsigned long long)(long long)a0[40] > v24 && !(v36 = (long long)a0[32] + v24 * 32, *v36 == 0x8000000000000000))
            {
                ptr = *(unsigned long long *)((void*)&v8 + 8);
                n = v9 * 264;
                v11 = ptr;
                v12 = ptr;
                v13 = *(unsigned long long *)&v8;
                v14 = ptr + n;
                v39 = v36[2];
                if (*v36 - v39 < v9)
                {
                    sub_c736c8(v36, v39, v9, 8, 264);
                    v39 = v36[2];
                }
                else if (!v9)
                {
                    goto LABEL_c15c60;
                }
                _memcpy(v36[1] + 264 * v39, ptr, n);
LABEL_c15c60:
                v36[2] = v39 + v9;
                if (v13)
                    _free(ptr);
                sub_bd9184(&v11, a0, v24, &v7);
                for (k = v13 + 1; k != 1; k -= 1)
                {
                    sub_c2a8d0();
                }
                if (!v11)
                    return *(unsigned long long *)&v11;
                _free(v12);
                return *(unsigned long long *)&v11;
            }
            sub_c73c64(&g_efbd28);
        }
        else
        {
LABEL_c15cac:
            v10 = v25;
            v11 = &v10;
            v12 = &g_bef1c8;
            sub_b71ea8(&v8, &g_cb9d9f, &v11);
            if ((unsigned long long)(long long)a0[40] <= v25 || (v42 = (long long)a0[32] + v25 * 32, v42->padding_0 == 0x8000000000000000))
                goto LABEL_c16190;
            if (v42->field_10 && v42->field_8->field_18 == 18)
                goto LABEL_c16004;
            v43 = 0x517cc1b727220a95;
            v44 = *(unsigned long long *)((void*)&v8 + 8);
            v45 = v9;
            v6 = v25;
            if (v45)
            {
                ptr1 = _malloc(v45);
                if (!ptr1)
                    goto LABEL_c161ac;
                v47 = ptr1;
                _memcpy();
                if (v45 >= 8)
                {
                    v48 = 0;
                    v49 = v47;
                    iter = v45;
                    do
                    {
                        v51 = v49 + 8;
                        v48 = 5871781006564002453 * (*(long long *)v49 ^ __ROL__(v48, 5));
                        iter -= 8;
                        v49 = v51;
                    } while (7 < iter);
                    if (iter <= 3)
                        goto LABEL_c15dd8;
LABEL_c15d7c:
                    v52 = v51 + 4;
                    v48 = 5871781006564002453 * (*(int *)v51 ^ __ROL__(v48, 5));
                    iter -= 4;
                    if (1 < iter)
                        goto LABEL_c15de4;
LABEL_c15d98:
                    if (iter)
                        goto LABEL_c15df8;
                }
                else
                {
                    v48 = 0;
                    iter = v45;
                    v51 = v47;
                    if (3 < v45)
                        goto LABEL_c15d7c;
LABEL_c15dd8:
                    v52 = v51;
                    if (iter <= 1)
                        goto LABEL_c15d98;
LABEL_c15de4:
                    v48 = 5871781006564002453 * (*(short *)v52 ^ __ROL__(v48, 5));
                    v52 += 2;
                    if (iter != 2)
                    {
LABEL_c15df8:
                        v48 = 5871781006564002453 * (*(char *)v52 ^ __ROL__(v48, 5));
                    }
                }
            }
            else
            {
                v48 = 0;
                v47 = 1;
            }
            v5 = v24;
            if (!(long long)a0[192])
                goto LABEL_c16110;
            while (1)
            {
                v54 = 0;
                v55 = 0;
                v56 = v43 * (__ROL__(v48, 5) ^ 0xff);
                v43 = (long long)a0[176];
                v57 = (long long)a0[184];
                v58 = v56 >> 57;
                v59 = v58 & 0xff | (v58 & 0xff) * 0x100 | (v58 & 0xff | (v58 & 0xff) * 0x100) * 0x10000 | (v58 & 0xff | (v58 & 0xff) * 0x100 | (v58 & 0xff | (v58 & 0xff) * 0x100) * 0x10000) * 0x100000000;
                v60 = _mm_set1_epi32(-1);
                v61 = v56 & v57;
                v62 = *(long long *)((char *)v43 + v61);
                v64 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v62, v59));
                v65 = v64 & 0x8080808080808080;
                if (v64 & 0x8080808080808080)
                {
LABEL_c15e4c:
                    v3 = v58;
                    v4 = v44;
                    v1 = v54;
                    v2 = v55;
                }
                else
                {
                    do
                    {
LABEL_c15ea8:
                        v66 = v0;
                        if (v54 != 1)
                        {
                            v68 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), v62));
                            if (v68)
                            {
                                v69 = ((((((v68 & 0xaaaaaaaaaaaaaaaa) >> 1 | v68 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v68 & 0xaaaaaaaaaaaaaaaa) >> 1 | v68 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v68 & 0xaaaaaaaaaaaaaaaa) >> 1 | v68 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v68 & 0xaaaaaaaaaaaaaaaa) >> 1 | v68 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                v70 = (((((((v68 & 0xaaaaaaaaaaaaaaaa) >> 1 | v68 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v68 & 0xaaaaaaaaaaaaaaaa) >> 1 | v68 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v68 & 0xaaaaaaaaaaaaaaaa) >> 1 | v68 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v68 & 0xaaaaaaaaaaaaaaaa) >> 1 | v68 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                v71 = ((((v70 | v69) & 0xffff0000ffff0000) >> 16 | (v70 | v69) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v70 | v69) & 0xffff0000ffff0000) >> 16 | (v70 | v69) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                if (!v71)
                                    v72 = 64;
                                else
                                    v72 = Clz(v71);
                                v66 = v61 + (v72 >> 3) & v57;
                            }
                            else
                            {
                                v54 = 0;
                                continue;
                            }
                        }
                        v73 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v62, v60));
                        if (!((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v73, v73), _mm_unpacklo_epi64(v73, v73)))))))))) & 1))
                        {
                            v0 = v66;
                            v54 = 1;
                        }
                        else
                        {
                            v85 = *((char *)v43 + v66);
                            if (!(v85 >> 31 & 1))
                            {
                                v87 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v43));
                                v88 = ((((((v87 & 0xaaaaaaaaaaaaaaaa) >> 1 | v87 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v87 & 0xaaaaaaaaaaaaaaaa) >> 1 | v87 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v87 & 0xaaaaaaaaaaaaaaaa) >> 1 | v87 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v87 & 0xaaaaaaaaaaaaaaaa) >> 1 | v87 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                v89 = (((((((v87 & 0xaaaaaaaaaaaaaaaa) >> 1 | v87 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v87 & 0xaaaaaaaaaaaaaaaa) >> 1 | v87 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v87 & 0xaaaaaaaaaaaaaaaa) >> 1 | v87 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v87 & 0xaaaaaaaaaaaaaaaa) >> 1 | v87 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                v90 = ((((v89 | v88) & 0xffff0000ffff0000) >> 16 | (v89 | v88) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v89 | v88) & 0xffff0000ffff0000) >> 16 | (v89 | v88) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                                if (!v90)
                                    v91 = 64;
                                else
                                    v91 = Clz(v90);
                                v66 = v91 >> 3;
                                v85 = *((char *)v43 + v66);
                            }
                            *((char *)v43 + v66) = v58;
                            *((char *)v43 + (v57 & v66 - 8) + 8) = v58;
                            v92 = (__m128i)_INSERT(CONCAT(0xffffffffffffffff, 0xffffffffffffffff), 0, __longlong_as_double(v85 & 1));
                            *(__m128i *)&a0[192] = _mm_sub_epi64((int128_t)a0[192], v92);
                            v93 = v43 - v66 * 32;
                            *(unsigned long long *)((char *)v93 - 32) = v45;
                            *(unsigned long long *)((char *)v93 - 24) = v47;
                            *(unsigned long long *)((char *)v93 - 16) = v45;
                            v24 = v5;
                            *(unsigned int *)((char *)v93 - 8) = v6;
                            if (!v45)
                            {
                                v84 = 1;
                                goto LABEL_c15fac;
                            }
                            goto LABEL_c15f90;
                        }
                        v55 += 8;
                        v61 = v55 + v61 & v57;
                        v62 = *(long long *)((char *)v43 + v61);
                        v76 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v62, v59));
                        v65 = v76 & 0x8080808080808080;
                    } while (!(v76 & 0x8080808080808080));
                    goto LABEL_c15e4c;
                }
                while (1)
                {
                    v77 = v65;
                    v44 = v23;
                    v78 = ((((((v77 & 0xaaaaaaaaaaaaaaaa) >> 1 | v77 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v77 & 0xaaaaaaaaaaaaaaaa) >> 1 | v77 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v77 & 0xaaaaaaaaaaaaaaaa) >> 1 | v77 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v77 & 0xaaaaaaaaaaaaaaaa) >> 1 | v77 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                    v79 = (((((((v77 & 0xaaaaaaaaaaaaaaaa) >> 1 | v77 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v77 & 0xaaaaaaaaaaaaaaaa) >> 1 | v77 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v77 & 0xaaaaaaaaaaaaaaaa) >> 1 | v77 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v77 & 0xaaaaaaaaaaaaaaaa) >> 1 | v77 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                    v80 = ((((v79 | v78) & 0xffff0000ffff0000) >> 16 | (v79 | v78) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v79 | v78) & 0xffff0000ffff0000) >> 16 | (v79 | v78) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                    if (!v80)
                        v81 = 64;
                    else
                        v81 = Clz(v80);
                    v82 = v43 - (v61 + (v81 >> 3) & v57) * 32;
                    if (v45 == *(long long *)((char *)v82 - 16) && !_memcmp(v47, *(long long *)((char *)v82 - 24), v45))
                        break;
                    v83 = v77 - 1;
                    v65 = v83 & v77;
                    v23 = v44;
                    v58 = v3;
                    v44 = v4;
                    v54 = v1;
                    v55 = v2;
                    v60 = _mm_set1_epi32(-1);
                    if (!(v83 & v77))
                        goto LABEL_c15ea8;
                }
                *(unsigned int *)((char *)v82 - 8) = v6;
                if (v45)
                {
                    _free(v47);
                    v23 = v44;
                    v44 = v4;
                    v24 = v5;
                }
                else
                {
                    v84 = 1;
                    v24 = v5;
                    v23 = v44;
                    goto LABEL_c15fac;
                }
LABEL_c15f90:
                ptr2 = _malloc(v45);
                if (!ptr2)
                    break;
                v84 = ptr2;
                _memcpy();
LABEL_c15fac:
                v11 = v45;
                v12 = v84;
                v13 = v45;
                v14 = 18;
                v95 = v42->field_10;
                if (v95 == v42->padding_0)
                    sub_c6c42c(v42);
                v96 = v42->field_8;
                if (v95)
                    _memmove(&v96[8].padding_0[8], v96, v95 * 264);
                _memcpy(v96, &v11, 264);
                v42->field_10 = v95 + 1;
LABEL_c16004:
                v47 = sub_bd8f3c(a0);
                v97 = v47 & 0xffffffff;
                if ((unsigned long long)(long long)a0[40] > v97 && !(v42 = (long long)a0[32] + v97 * 32, v42->padding_0 == 0x8000000000000000))
                {
                    v11 = v8;
                    v13 = CONCAT(0x11, v9);
                    v48 = v42->field_10;
                    if (v48 == v42->padding_0)
                        sub_c6c42c(v42);
                    _memcpy((char *)v42->field_8 + 264 * v48, &v11, 264);
                    v42->field_10 = v48 + 1;
                    sub_bd9618(&v11, a0 + 24, v23);
                    if (*(unsigned long long *)&v11 != 0x8000000000000000)
                    {
                        v15 = v11;
                        v16 = v13;
                        sub_c2bc00(a0 + 24, v24, v47, &v15);
                        return *(unsigned long long *)&v11;
                    }
                    sub_c73c64(&g_efbd88);
LABEL_c16110:
                    sub_c76150();
                }
                else
                {
                    v98 = &g_efbd70;
                    goto LABEL_c161a4;
                }
            }
LABEL_c161ac:
            sub_c6b970(1, v45);
        }
    }
    else
    {
        sub_c73c64(&g_efbcf8);
LABEL_c16190:
        v98 = &g_efbd58;
LABEL_c161a4:
        sub_c73c64(v98);
    }
    __debugbreak();
}
