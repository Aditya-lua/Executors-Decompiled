/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbb8704..0xbb89ec (744 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bb8704_1 {
    unsigned long long field_0;
    unsigned long long field_8;
} st_bb8704_1;

typedef struct st_bb8704_4 {
    struct st_bb8704_5 *field_0;
    unsigned long long field_8;
} st_bb8704_4;

typedef struct st_bb8704_2 {
    unsigned long long field_0;
    struct st_bb8704_0 *field_8;
    unsigned long long field_10;
} st_bb8704_2;

typedef struct st_bb8704_3 {
    unsigned long long field_0;
    char padding_8[16];
    double field_18;
} st_bb8704_3;

typedef struct st_bb8704_0 {
    char padding_0[24];
    unsigned long long field_18;
    char padding_20[8];
    struct st_bb8704_1 *field_28;
    unsigned long long field_30;
    char padding_38[8];
    long long field_40;
    unsigned long long field_48;
} st_bb8704_0;

typedef struct st_bb8704_5 {
    unsigned long long field_0;
} st_bb8704_5;

extern long long g_ef8e60;
extern long long g_ef8e78;

void sub_bb8704(void* a0, unsigned long long *a1, unsigned int a2, unsigned int a3, st_bb8704_4 *a4)
{
    unsigned long long v17;  // x24
    unsigned long long v18;  // x23
    double v27;  // d0
    unsigned int idx;  // x24
    unsigned long long *v29;  // x22
    unsigned long v30;  // x8
    unsigned int v31;  // x9
    unsigned long long *iter;  // x15
    unsigned int v33;  // x16
    unsigned long long v34;  // x0
    unsigned long long v35;  // x0
    unsigned long long v36;  // x0
    unsigned long long v19;  // x22
    __m128i v37;  // q2
    unsigned long v39;  // x1
    unsigned long long v40;  // x1
    unsigned long long v41;  // x1
    unsigned long long v42;  // 4128
    unsigned long long v43;  // 4130
    unsigned long long v44;  // x2
    unsigned long long v45;  // x2
    unsigned long long v46;  // x2
    unsigned long long v20;  // x21
    uint128_t v47;  // q2
    st_bb8704_2 *v49;  // x10
    st_bb8704_0 *v50;  // x10
    unsigned long v51;  // 4110
    unsigned long v52;  // cc_op
    unsigned long v53;  // cc_dep1
    unsigned long v54;  // cc_dep2
    unsigned long long v55;  // 4110
    unsigned long v56;  // 4110
    unsigned long long v21;  // x20
    unsigned long long v57;  // 4110
    unsigned long long v58;  // 4110
    unsigned long long v59;  // 4102
    unsigned long long v60;  // 4110
    unsigned long long v61;  // 4102
    unsigned int v62;  // x0
    unsigned long long v22;  // x19
    unsigned long long v23;  // x30
    unsigned int v24;  // w22
    unsigned long v25;  // x23
    st_bb8704_3 *v26;  // x10
    uint128_t v0;  // [bp-0xc0]
    uint128_t v1;  // [bp-0xb0]
    uint128_t v2;  // [bp-0xa0]
    uint128_t v3;  // [bp-0x90]
    uint128_t v4;  // [bp-0x80]
    uint128_t v5;  // [bp-0x70]
    uint128_t v6;  // [bp-0x60]
    uint128_t v7;  // [bp-0x50]
    unsigned long long v8;  // [bp-0x40]
    unsigned long long v9;  // [bp-0x38]
    unsigned long long v10;  // [bp-0x30]
    unsigned long long v11;  // [bp-0x28]
    unsigned long long v12;  // [bp-0x20]
    unsigned long long v13;  // [bp-0x18]
    char *v14;  // [bp-0x10]
    unsigned long long v15;  // [bp-0x8]
    char v16;  // [bp+0x0]

    v8 = v17;
    v9 = v18;
    v10 = v19;
    v11 = v20;
    v12 = v21;
    v13 = v22;
    v14 = &v16;
    v15 = v23;
    v24 = a3;
    v25 = a2;
    if (a1[5] <= v25 || (v26 = a1[4] + v25 * 32, v26->field_0 == 0x8000000000000000))
        v27 = nan;
    else
        v27 = v26->field_18;
    *(unsigned int *)&v6 = a2;
    *(unsigned long long *)((char *)&v4 + 8) = a1[7];
    v5 = CONCAT(__double_as_longlong(v27), a1[8]);
    *(unsigned long long *)&v4 = 0;
    sub_b9b9f0(&v0, &v4);
    if (*(unsigned long long *)&v1 == 1)
    {
        idx = *(long long *)*(unsigned long long *)((void*)&v0 + 8);
        v24 = *(int *)(*(unsigned long long *)((void*)&v0 + 8) + 12) == v24;
        if (*(unsigned long long *)&v0)
            goto LABEL_bb87b8;
    }
    else
    {
        idx = 0;
        if (*(unsigned long long *)&v0)
        {
LABEL_bb87b8:
            _free(*(unsigned long long *)((void*)&v0 + 8));
        }
    }
    if (idx & v24 & 1)
    {
        v29 = *(long long *)(idx + 8);
        v30 = *(long long *)(idx + 16);
        v31 = a4[1].field_8;
        iter = v29;
LABEL_bb8868:
        if (iter == &v29[9 * v30])
        {
            if (a1[5] <= v25 || (v49 = a1[4] + v25 * 32, v49->field_0 == 0x8000000000000000))
            {
                sub_c73c64(&g_ef8e60);
LABEL_bb89c0:
                __debugbreak();
            }
            if (v49->field_10 != 1 || !(v50 = v49->field_8, v50->field_18 == 15 && v50->field_30 == 1 && v50->field_48 == 1))
                goto LABEL_bb891c;
            if (v50->field_28->field_0 == 0x8000000000000000)
            {
                v51 = arm64g_calculate_condition(4, v50->field_48, 1, 0);
                v52 = 4;
                v53 = (v51 & 1 ? v31 : 0);
                v54 = v51 & 1;
                v55 = arm64g_calculate_condition(4, v53, v54, 0);
                if (!(v55 & 1))
                    goto LABEL_bb88fe;
LABEL_bb88fd:
                v58 = arm64g_calculate_condition(v52, v53, v54, 0);
                v59 = arm64g_calculate_condition(20, (v58 & 1 ? v30 : 0), v58 & 1, 0);
            }
            else
            {
                v56 = arm64g_calculate_condition(4, v50->field_48, 1, 0);
                v52 = 0;
                v53 = (v56 & 1 ? v31 : 0);
                v54 = v56 & 1;
                v57 = arm64g_calculate_condition(0, v53, v54, 0);
                if (v57 & 1)
                    goto LABEL_bb88fd;
LABEL_bb88fe:
                v60 = arm64g_calculate_condition(v52, v53, v54, 0);
                v61 = arm64g_calculate_condition(16, (v60 & 1 ? v30 : 0), v60 & 1, 0);
                if (v61 & 1 || v29[1] || v29[2] != v50->field_28->field_8)
                    goto LABEL_bb891c;
                sub_bb813c(&v0, v50->field_40);
                v62 = sub_bb9918(a4, *v29);
                if (v62)
                {
                    sub_bb813c(&v4, v62);
                    *(uint128_t *)a0 = v0;
                    *(uint128_t *)&a0[16] = v1;
                    *(uint128_t *)&a0[32] = v2;
                    *(uint128_t *)&a0[48] = v3;
                    *(uint128_t *)&a0[72] = v4;
                    *(uint128_t *)&a0[88] = v5;
                    *(uint128_t *)&a0[104] = v6;
                    *(uint128_t *)&a0[120] = v7;
                    *(unsigned long long **)&a0[64] = v29;
                    goto LABEL_bb8924;
                }
                else
                {
                    sub_c73d34("no entry found for keyassertion failed: then_changed && else_changedassertion failed: self.function.unconditional_edge(node).is_some()assertion failed: body != headerassertion failed: then_edge.target() == headercapacity overflowassertion failed: <Ix as IndexType>::max().index() == !0 || EdgeIndex::end() != edge_idxprefixCommentAssignWhileBlockCloselocalsSetListobject_localindexNotNegateLengthMutexLabelGenericForInitGenericForNextres_localsgeneratorstateGenericForRcLocalNumForInitcounterlimitNumForNextNumericForinitialassertion failed: <Ix as IndexType>::max().index() == !0 || NodeIndex::end() != node_idxUnconditionalBreakVarArgRepeatconditionblockIfthen_blockelse_blockGlobalRefNilBooleanNumberIntegerStringVectorvalueargumentsAddSubMulDivModPowConcatEqualLessThanOrEqualGreaterThanOrEqualGreaterThanAndOrparametersis_variadicLocalMethodCallTableLiteralIndexUnaryBinaryClosureSelectFilterMapmethodrightoperationByAddressReturnvalues @ Because the root is initialized to dominate itself, and is the first node in eve", 22, &g_ef8e78);
                    goto LABEL_bb89c0;
                }
            }
        }
        else if (v31)
        {
            v33 = 0;
            v34 = 5871781006564002453 * (*iter + 8);
            v35 = v34;
            while (1)
            {
                v36 = v35 & a4->field_8;
                v37 = *(long long *)((char *)a4->field_0 + v36);
                v39 = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v37, (uint128_t)(v34 >> 57 & 0xff | (v34 >> 57 & 0xff) * 0x100 | (v34 >> 57 & 0xff | (v34 >> 57 & 0xff) * 0x100) * 0x10000 | (v34 >> 57 & 0xff | (v34 >> 57 & 0xff) * 0x100 | (v34 >> 57 & 0xff | (v34 >> 57 & 0xff) * 0x100) * 0x10000) * 0x100000000)));
                v40 = v39 & 0x8080808080808080;
                if (v39 & 0x8080808080808080)
                {
                    do
                    {
                        v41 = v40;
                        v42 = ((((((v41 & 0xaaaaaaaaaaaaaaaa) >> 1 | v41 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v41 & 0xaaaaaaaaaaaaaaaa) >> 1 | v41 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v41 & 0xaaaaaaaaaaaaaaaa) >> 1 | v41 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v41 & 0xaaaaaaaaaaaaaaaa) >> 1 | v41 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                        v43 = (((((((v41 & 0xaaaaaaaaaaaaaaaa) >> 1 | v41 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v41 & 0xaaaaaaaaaaaaaaaa) >> 1 | v41 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((v41 & 0xaaaaaaaaaaaaaaaa) >> 1 | v41 * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((v41 & 0xaaaaaaaaaaaaaaaa) >> 1 | v41 * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                        v44 = ((((v43 | v42) & 0xffff0000ffff0000) >> 16 | (v43 | v42) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v43 | v42) & 0xffff0000ffff0000) >> 16 | (v43 | v42) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                        if (!v44)
                            v45 = 64;
                        else
                            v45 = Clz(v44);
                        if (*iter == *(long long *)((char *)a4->field_0 + -(72 * (v36 + (v45 >> 3) & a4->field_8)) - 72))
                        {
                            iter += 9;
                            goto LABEL_bb8868;
                        }
                    } while ((v46 = v41 - 1, v40 = v46 & v41, v46 & v41));
                }
                v47 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_cmpeq_epi8(v37, _mm_set1_epi8(-1)));
                if ((unsigned int)__dirty_unsupported_Iop_ZeroHI120ofV128(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)))), CatOddLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)))), CatEvenLanesV(CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))), CatOddLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)))), CatOddLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)))), CatEvenLanesV(CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))), CatEvenLanesV(_mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpackhi_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)))))))), _mm_max_epu8(_mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))))), CatEvenLanesV(CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)))), CatOddLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))))), CatEvenLanesV(CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)))), CatEvenLanesV(CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))), CatOddLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))))))), _mm_max_epu8(_mm_max_epu8(CatOddLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))))), CatEvenLanesV(CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)))), CatOddLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)))))), _mm_max_epu8(CatOddLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))))), CatEvenLanesV(CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)))), CatEvenLanesV(CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47))), CatEvenLanesV(_mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)), _mm_unpacklo_epi64(_mm_unpacklo_epi64(v47, v47), _mm_unpacklo_epi64(v47, v47)))))))))) & 1)
                    break;
                v33 += 8;
                v35 = v36 + v33;
            }
        }
    }
LABEL_bb891c:
    *(unsigned long long *)a0 = 12;
LABEL_bb8924:
    sub_b9a58c();
    return;
}
