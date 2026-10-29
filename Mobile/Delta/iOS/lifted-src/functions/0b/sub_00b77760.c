/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb77760..0xb77a64 (772 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b77760_3 {
    uint128_t field_0;
    struct st_b77760_2 *field_10;
} st_b77760_3;

typedef struct st_b77760_0 {
    char field_0[16];
    char field_1;
    char padding_2[14];
    uint128_t field_10;
} st_b77760_0;

typedef struct st_b77760_1 {
    struct st_b77760_2 *field_0;
    struct st_b77760_0 *field_8;
    struct st_b77760_2 *field_10;
    struct st_b77760_0 *field_18;
    struct st_b77760_2 *field_20;
    struct st_b77760_0 *field_28;
    struct st_b77760_2 *field_30;
    struct st_b77760_0 *field_38;
} st_b77760_1;

typedef struct st_b77760_2 {
    char field_0;
} st_b77760_2;

extern long long g_efb2e0;
extern long long g_efc680;

double sub_b77760(st_b77760_3 *a0, st_b77760_1 *a1)
{
    char *v4;  // x23
    char *v5;  // x20
    char *v14;  // x8
    unsigned long long v16;  // 4119
    char *iter;  // x24
    void* v18;  // x8
    st_b77760_0 *j;  // x9
    unsigned long long v20;  // x10
    uint128_t *v21;  // x13
    unsigned long long v22;  // x11
    uint128_t *iter1;  // x13
    char *v6;  // x24
    uint128_t *iter2;  // x9
    unsigned long long i;  // x14
    unsigned long long v26;  // x14
    uint128_t v27;  // q1
    st_b77760_0 *v30;  // x14
    char *v31;  // x8
    st_b77760_0 *v32;  // x9
    unsigned long long v33;  // x12
    char *v7;  // x8
    unsigned long long v34;  // x13
    char *v35;  // x10
    st_b77760_0 *k;  // x11
    uint128_t *node;  // x15
    uint128_t *v38;  // x14
    unsigned long long l;  // x16
    unsigned long long v40;  // x16
    uint128_t v41;  // q1
    unsigned long long v9;  // 4119
    char *v10;  // x0
    char *ptr;  // x0
    char *v12;  // x22
    char *v13;  // x2
    uint128_t v0;  // [bp-0x58]
    char *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = a1->field_0;
    v5 = a1->field_20;
    if (v4)
    {
        v6 = a1->field_18 - a1->field_8;
        if (!v5 || !(v7 = a1->field_38 - a1->field_28, v9 = arm64g_calculate_condition(0x22, v7, v6, 0), v6 += v7, v9 & 1))
        {
            if (v6 >= 0)
                goto LABEL_b777d8;
LABEL_b777b4:
            v10 = 0;
            goto LABEL_b777b8;
        }
        else
        {
            sub_c73b38("capacity overflowassertion failed: <Ix as IndexType>::max().index() == !0 || EdgeIndex::end() != edge_idxprefixCommentAssignWhileBlockCloselocalsSetListobject_localindexNotNegateLengthMutexLabelGenericForInitGenericForNextres_localsgeneratorstateGenericForRcLocalNumForInitcounterlimitNumForNextNumericForinitialassertion failed: <Ix as IndexType>::max().index() == !0 || NodeIndex::end() != node_idxUnconditionalBreakVarArgRepeatconditionblockIfthen_blockelse_blockGlobalRefNilBooleanNumberIntegerStringVectorvalueargumentsAddSubMulDivModPowConcatEqualLessThanOrEqualGreaterThanOrEqualGreaterThanAndOrparametersis_variadicLocalMethodCallTableLiteralIndexUnaryBinaryClosureSelectFilterMapmethodrightoperationByAddressReturnvalues @ Because the root is initialized to dominate itself, and is the first node in every path, there must exist a predecessor to this node that also has a dominator{recursion limit reached}?`fmt::Error`s should be impossible without a `fmt::Formatter`> , Cunsafe \" -fn() + : punycode{}.llvm.0[]::::", 35, &g_efb2e0);
        }
    }
    else
    {
        if (!v5)
        {
            v0 = CONCAT(1, 0);
            v1 = 0;
            goto LABEL_b77968;
        }
        v6 = a1->field_38 - a1->field_28;
        if (v6 < 0)
            goto LABEL_b777b4;
LABEL_b777d8:
        if (v6)
        {
            ptr = _malloc(v6);
            if (ptr)
            {
                v12 = ptr;
                v0 = CONCAT(ptr, v6);
                v1 = 0;
                if (!v4)
                    goto LABEL_b77930;
                goto LABEL_b777f8;
            }
            else
            {
                v10 = 1;
            }
LABEL_b777b8:
            sub_c6b970(v10, v6);
        }
        else
        {
            v12 = 1;
            v0 = CONCAT(1, 0);
            v1 = 0;
            if (!v4)
            {
LABEL_b77930:
                if (!v5)
                {
LABEL_b77968:
                    iter = 0;
LABEL_b7796c:
                    v1 = iter;
LABEL_b77984:
                    a0->field_0 = v0;
                    a0->field_10 = v1;
                    return (unsigned long long)v0;
                }
                if (a1->field_38 - a1->field_28 > v6)
                {
LABEL_b77948:
                    sub_c6c0cc(&v0, 0);
                    v12 = *(unsigned long long *)((void*)&v0 + 8);
                    iter = v1;
                    if (v4)
                    {
LABEL_b7782c:
                        v18 = a1->field_18;
                        j = a1->field_8;
                        if (j != v18)
                        {
                            v20 = v18 - j;
                            if (v20 >= 32 && !(v21 = iter + v12, v21 - j < 32))
                            {
                                v22 = v20 & 0xffffffffffffffe0;
                                iter = &iter[v22];
                                iter1 = v21 + 1;
                                iter2 = &j->field_1;
                                i = v20 & 0xffffffffffffffe0;
                                do
                                {
                                    v26 = i;
                                    v27 = *iter2;
                                    *(int128_t *)((char *)iter1 - 16) = *(int128_t *)((char *)iter2 - 16);
                                    *iter1 = v27;
                                    iter1 += 2;
                                    iter2 += 2;
                                    i = v26 - 32;
                                } while (i);
                                if (v20 == v22)
                                    goto LABEL_b778a8;
                                j = &j->field_0[v22];
                            }
                            do
                            {
                                *(char *)(v12 + iter) = j->field_0[0];
                                iter += 1;
                                j = &j->field_0[1];
                            } while (j != v18);
                        }
LABEL_b778a8:
                        if (a1->field_10)
                            _free(v4);
                    }
LABEL_b778b8:
                    if (!v5)
                        goto LABEL_b7796c;
                    v30 = a1->field_28;
                    v31 = a1->field_30;
                    v32 = a1->field_38;
                    if (v30 != v32)
                    {
                        v33 = v32 - v30;
                        if (v33 < 32 || 32 > iter + v12 - (char *)v30)
                        {
                            v35 = iter;
                            k = v30;
                        }
                        else
                        {
                            v34 = v33 & 0xffffffffffffffe0;
                            v35 = &iter[v34];
                            k = &v30->field_0[v34];
                            node = iter + v12 + 16;
                            v38 = &v30->field_1;
                            l = v33 & 0xffffffffffffffe0;
                            do
                            {
                                v40 = l;
                                v41 = *v38;
                                *(int128_t *)((char *)node - 16) = *(int128_t *)((char *)v38 - 16);
                                *node = v41;
                                node += 2;
                                v38 += 2;
                                l = v40 - 32;
                            } while (l);
                            if (v33 == v34)
                                goto LABEL_b77904;
                        }
                        do
                        {
                            *(char *)(v12 + v35) = k->field_0[0];
                            v35 += 1;
                            k = &k->field_0[1];
                        } while (k != v32);
LABEL_b77904:
                        v1 = v35;
                        if (!v31)
                        {
                            a0->field_0 = v0;
                            a0->field_10 = v1;
                            return (unsigned long long)v0;
                        }
                        goto LABEL_b7797c;
                    }
                    else
                    {
                        v1 = iter;
                        if (v31)
                        {
LABEL_b7797c:
                            _free(v5);
                        }
                    }
                    goto LABEL_b77984;
                }
LABEL_b77824:
                iter = 0;
                if (v4)
                    goto LABEL_b7782c;
                goto LABEL_b778b8;
            }
LABEL_b777f8:
            v13 = a1->field_18 - a1->field_8;
            if (!v5 || !(v14 = a1->field_38 - a1->field_28, v16 = arm64g_calculate_condition(0x22, v14, v13, 0), v13 += v14, v16 & 1))
            {
                if (v6 < v13)
                    goto LABEL_b77948;
                goto LABEL_b77824;
            }
            else
            {
                sub_c73b38("capacity overflowassertion failed: <Ix as IndexType>::max().index() == !0 || EdgeIndex::end() != edge_idxprefixCommentAssignWhileBlockCloselocalsSetListobject_localindexNotNegateLengthMutexLabelGenericForInitGenericForNextres_localsgeneratorstateGenericForRcLocalNumForInitcounterlimitNumForNextNumericForinitialassertion failed: <Ix as IndexType>::max().index() == !0 || NodeIndex::end() != node_idxUnconditionalBreakVarArgRepeatconditionblockIfthen_blockelse_blockGlobalRefNilBooleanNumberIntegerStringVectorvalueargumentsAddSubMulDivModPowConcatEqualLessThanOrEqualGreaterThanOrEqualGreaterThanAndOrparametersis_variadicLocalMethodCallTableLiteralIndexUnaryBinaryClosureSelectFilterMapmethodrightoperationByAddressReturnvalues @ Because the root is initialized to dominate itself, and is the first node in every path, there must exist a predecessor to this node that also has a dominator{recursion limit reached}?`fmt::Error`s should be impossible without a `fmt::Formatter`> , Cunsafe \" -fn() + : punycode{}.llvm.0[]::::", 35, &g_efc680);
            }
        }
    }
    __debugbreak();
}
