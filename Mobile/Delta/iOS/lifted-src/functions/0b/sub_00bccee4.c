/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbccee4..0xbcd140 (604 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bccee4_4 {
    struct st_bccee4_0 *field_0;
    struct st_bccee4_2 *field_8;
} st_bccee4_4;

typedef struct st_bccee4_2 {
    struct st_bccee4_3 *field_0;
    unsigned long long field_8;
    char padding_10[8];
    unsigned long long field_18;
} st_bccee4_2;

typedef struct st_bccee4_5 {
    unsigned long long field_0;
    unsigned long long field_8;
    struct st_bccee4_3 *field_10;
    char padding_18[8];
    unsigned long long field_20;
} st_bccee4_5;

typedef struct st_bccee4_1 {
    unsigned int field_0;
} st_bccee4_1;

typedef struct st_bccee4_0 {
    char padding_0[8];
    unsigned long long field_8;
    unsigned long long field_10;
    char padding_18[8];
    struct st_bccee4_1 *field_20;
    unsigned long long field_28;
} st_bccee4_0;

typedef struct st_bccee4_3 {
    unsigned long long field_0;
} st_bccee4_3;

extern long long g_ef9630;

unsigned long long sub_bccee4(st_bccee4_5 *a0, st_bccee4_4 *a1)
{
    st_bccee4_0 *v2;  // x21
    st_bccee4_2 *v3;  // x22
    unsigned long long v12;  // x12
    unsigned long long v13;  // x12
    unsigned long long v14;  // x20
    unsigned long long v15;  // x9
    unsigned long long v16;  // x12
    unsigned long long *v17;  // x11
    unsigned long long v18;  // x10
    __m128i v19;  // q0
    unsigned long long v20;  // x12
    __m128i v21;  // q1
    unsigned long v4;  // x9
    unsigned long v23;  // x13
    unsigned long long v24;  // x13
    uint128_t v25;  // q1
    unsigned long v28;  // x13
    unsigned long long v29;  // x13
    unsigned long long v30;  // 4128
    unsigned long long v31;  // 4130
    unsigned long v5;  // x8
    unsigned long long v32;  // x14
    unsigned long long v33;  // x14
    void* v34;  // x14
    unsigned long long v35;  // x14
    unsigned long v36;  // x9
    unsigned long long k;  // x9
    unsigned long long iter;  // x10
    unsigned int *v39;  // x11
    unsigned long long j;  // x12
    unsigned long long v41;  // x13
    unsigned long long i;  // x10
    unsigned int *v42;  // x14
    unsigned long long v43;  // 4126
    unsigned long long v44;  // 4102
    unsigned long long v45;  // 4102
    unsigned long long *v7;  // x11
    unsigned long long *v8;  // x11
    unsigned long long v10;  // 4131
    unsigned long long v11;  // 4133
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a1->field_0;
    v3 = a1->field_8;
    while (1)
    {
        do
        {
            v4 = a0->field_20;
            if (!v4)
                return 0;
            v5 = a0->field_0;
            i = a0->field_8;
            if (!i)
            {
                v7 = a0->field_10;
                do
                {
                    v8 = v7 + 1;
                    v5 -= 128;
                    i = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v7)) & 0x8080808080808080;
                    v7 = v8;
                } while (!i);
                a0->field_10 = v8;
                a0->field_0 = v5;
            }
            v10 = ((((((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
            v11 = (((((((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
            v12 = ((((v11 | v10) & 0xffff0000ffff0000) >> 16 | (v11 | v10) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v11 | v10) & 0xffff0000ffff0000) >> 16 | (v11 | v10) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
            if (!v12)
                v13 = 64;
            else
                v13 = Clz(v12);
            a0->field_8 = i - 1 & i;
            a0->field_20 = v4 - 1;
            v14 = *(long long *)(v5 - (v13 * 2 & 240) - 16);
            do
            {
                /* unsupported instruction */;
                /* unsupported instruction */;
            } while (/* unsupported instruction */ ^ 1);
            if ((long long)/* unsupported instruction */ < 0)
            {
                sub_c769bc();
                do
                {
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                    /* unsupported instruction */;
                } while (/* unsupported instruction */ ^ 1);
                v45 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
                if (!(v45 & 1))
                {
                    /* unsupported instruction */;
                    sub_b86a90(v14);
                }
                __Unwind_Resume();
            }
            if (!v3->field_18)
            {
                sub_c73d34("no entry found for keyassertion failed: then_changed && else_changedassertion failed: self.function.unconditional_edge(node).is_some()assertion failed: body != headerassertion failed: then_edge.target() == headercapacity overflowassertion failed: <Ix as IndexType>::max().index() == !0 || EdgeIndex::end() != edge_idxprefixCommentAssignWhileBlockCloselocalsSetListobject_localindexNotNegateLengthMutexLabelGenericForInitGenericForNextres_localsgeneratorstateGenericForRcLocalNumForInitcounterlimitNumForNextNumericForinitialassertion failed: <Ix as IndexType>::max().index() == !0 || NodeIndex::end() != node_idxUnconditionalBreakVarArgRepeatconditionblockIfthen_blockelse_blockGlobalRefNilBooleanNumberIntegerStringVectorvalueargumentsAddSubMulDivModPowConcatEqualLessThanOrEqualGreaterThanOrEqualGreaterThanAndOrparametersis_variadicLocalMethodCallTableLiteralIndexUnaryBinaryClosureSelectFilterMapmethodrightoperationByAddressReturnvalues @ Because the root is initialized to dominate itself, and is the first node in eve", 22, &g_ef9630);
                __debugbreak();
            }
            v15 = 0;
            v16 = 5871781006564002453 * (v14 + 8);
            v17 = v3->field_0;
            v18 = v3->field_8;
            v19 = v16 >> 57 & 0xff | (v16 >> 57 & 0xff) * 0x100 | (v16 >> 57 & 0xff | (v16 >> 57 & 0xff) * 0x100) * 0x10000 | (v16 >> 57 & 0xff | (v16 >> 57 & 0xff) * 0x100 | (v16 >> 57 & 0xff | (v16 >> 57 & 0xff) * 0x100) * 0x10000) * 0x100000000;
            v20 = v16 & v18;
            v21 = *(long long *)((char *)v17 + v20);
            v23 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v21, v19));
            v24 = v23 & 0x8080808080808080;
            if (!(v23 & 0x8080808080808080))
            {
                do
                {
LABEL_bccfec:
                    v25 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v21, _mm_set1_epi8(-1)));
                    if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v25, v25), _mm_unpacklo_epi64(v25, v25)))))))))) & 1)
                    {
                        sub_c73d34("no entry found for keyassertion failed: then_changed && else_changedassertion failed: self.function.unconditional_edge(node).is_some()assertion failed: body != headerassertion failed: then_edge.target() == headercapacity overflowassertion failed: <Ix as IndexType>::max().index() == !0 || EdgeIndex::end() != edge_idxprefixCommentAssignWhileBlockCloselocalsSetListobject_localindexNotNegateLengthMutexLabelGenericForInitGenericForNextres_localsgeneratorstateGenericForRcLocalNumForInitcounterlimitNumForNextNumericForinitialassertion failed: <Ix as IndexType>::max().index() == !0 || NodeIndex::end() != node_idxUnconditionalBreakVarArgRepeatconditionblockIfthen_blockelse_blockGlobalRefNilBooleanNumberIntegerStringVectorvalueargumentsAddSubMulDivModPowConcatEqualLessThanOrEqualGreaterThanOrEqualGreaterThanAndOrparametersis_variadicLocalMethodCallTableLiteralIndexUnaryBinaryClosureSelectFilterMapmethodrightoperationByAddressReturnvalues @ Because the root is initialized to dominate itself, and is the first node in eve", 22, &g_ef9630);
                        __debugbreak();
                    }
                    v15 += 8;
                    v20 = v20 + v15 & v18;
                    v21 = *(long long *)((char *)v17 + v20);
                    v28 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v21, v19));
                    v24 = v28 & 0x8080808080808080;
                } while (!(v28 & 0x8080808080808080));
            }
            while (1)
            {
                v29 = v24;
                v30 = ((((((v29 & 0xaaaaaaaaaaaaaaaa) >> 1 | v29 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v29 & 0xaaaaaaaaaaaaaaaa) >> 1 | v29 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v29 & 0xaaaaaaaaaaaaaaaa) >> 1 | v29 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v29 & 0xaaaaaaaaaaaaaaaa) >> 1 | v29 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                v31 = (((((((v29 & 0xaaaaaaaaaaaaaaaa) >> 1 | v29 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v29 & 0xaaaaaaaaaaaaaaaa) >> 1 | v29 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v29 & 0xaaaaaaaaaaaaaaaa) >> 1 | v29 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v29 & 0xaaaaaaaaaaaaaaaa) >> 1 | v29 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                v32 = ((((v31 | v30) & 0xffff0000ffff0000) >> 16 | (v31 | v30) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v31 | v30) & 0xffff0000ffff0000) >> 16 | (v31 | v30) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                if (!v32)
                    v33 = 64;
                else
                    v33 = Clz(v32);
                v34 = &v17[-2 * (v20 + (v33 >> 3) & v18)];
                if (v14 == *(long long *)((char *)v34 - 16))
                    break;
                v35 = v29 - 1;
                v24 = v35 & v29;
                if (!(v35 & v29))
                    goto LABEL_bccfec;
            }
            v36 = *(int *)((char *)v34 - 8);
            if (v2->field_10 > v36)
            {
                k = *(int *)(v2->field_8 + v36 * 16 + 8);
                iter = 0;
                v39 = v2->field_20;
                j = v2->field_28;
                v41 = 0xffffffff;
                if (j <= k)
                    goto LABEL_bcd080;
                goto LABEL_bcd06c;
            }
            else
            {
                k = 0xffffffff;
                iter = 0;
                v39 = v2->field_20;
                j = v2->field_28;
                v41 = 0xffffffff;
                if (j <= 0xffffffff)
                    goto LABEL_bcd080;
                goto LABEL_bcd06c;
            }
            do
            {
                v42 = &v39[4 * v41];
                v41 = v42[1];
                v43 = arm64g_calculate_condition(1, v42[2], 1, 0);
                if (!(v43 & 1) && !(iter += 1, j <= k))
                {
                    do
                    {
LABEL_bcd06c:
                        k = v39[4 * k];
                        iter += 1;
                    } while (k < j);
                }
LABEL_bcd080:
            } while (j > v41);
            if (!iter)
                return v14;
            do
            {
                /* unsupported instruction */;
                /* unsupported instruction */;
                /* unsupported instruction */;
            } while (/* unsupported instruction */ ^ 1);
            v44 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
        } while (v44 & 1);
        /* unsupported instruction */;
        sub_b86a90(v14);
    }
}
