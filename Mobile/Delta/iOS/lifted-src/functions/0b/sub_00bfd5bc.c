/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbfd5bc..0xbfd8e4 (808 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bfd5bc_0 {
    uint128_t field_0;
    unsigned long long field_10;
} st_bfd5bc_0;

typedef struct st_bfd5bc_1 {
    unsigned long long field_0;
    uint128_t field_8;
    uint128_t field_18;
    uint128_t field_28;
    unsigned long long field_38;
} st_bfd5bc_1;

extern long long g_efb2e0;
extern long long g_efc680;

double sub_bfd5bc(st_bfd5bc_0 *a0, void* a1)
{
    unsigned long v15;  // x8
    unsigned int v16;  // w9
    unsigned long v25;  // x22
    unsigned int v26;  // w8
    unsigned int v27;  // w9
    unsigned long long v28;  // x8
    unsigned long long *v29;  // x9
    unsigned long long node;  // x24
    unsigned long v31;  // x22
    unsigned long v32;  // x23
    unsigned int i;  // w25
    unsigned long long *iter;  // x26
    unsigned int v17;  // w10
    unsigned long long v35;  // x0
    unsigned long v36;  // x8
    st_bfd5bc_1 *v37;  // x9
    uint128_t v38;  // q0
    uint128_t v39;  // q1
    uint128_t v40;  // q2
    unsigned long long v18;  // x9
    unsigned long long *v19;  // x9
    unsigned long long v20;  // x0
    unsigned long long v21;  // x23
    unsigned long long v22;  // x22
    unsigned long long ptr;  // x0
    unsigned long long v24;  // x21
    uint128_t v0;  // [bp-0x128]
    unsigned long long v1;  // [bp-0x118]
    uint128_t v2;  // [bp-0x110], Other Possible Types: unsigned long long
    uint128_t v3;  // [bp-0x100]
    uint128_t v4;  // [bp-0xf0]
    uint128_t v5;  // [bp-0xe0]
    uint128_t v6;  // [bp-0xd0]
    unsigned long long v7;  // [bp-0xb8]
    uint128_t v8;  // [bp-0xb0], Other Possible Types: unsigned long long
    uint128_t v9;  // [bp-0xa0]
    uint128_t v10;  // [bp-0x90]
    uint128_t v11;  // [bp-0x80]
    uint128_t v12;  // [bp-0x70]
    char *v13;  // [bp-0x10]
    char v14;  // [bp+0x0]

    v13 = &v14;
    v15 = *(long long *)a1;
    if ((long long)a1[64])
    {
        v16 = (char)a1[72];
        v17 = (char)a1[73];
        if (v17 < v16)
            v18 = 0;
        else
            v18 = v17 - v16 & 0xffffffff;
        if (v15 == 13)
        {
            v2 = v18;
            v19 = &v8;
            v18 = 1;
        }
        else
        {
            if (v15 != 12)
                v18 += 1;
LABEL_bfd63c:
            v8 = 1;
            v19 = &v2;
        }
    }
    else if (v15 == 13)
    {
        v18 = 0;
        goto LABEL_bfd63c;
    }
    else
    {
        v18 = v15 != 12;
        goto LABEL_bfd63c;
    }
    *v19 = v18;
    if (v8 == 1)
    {
        v20 = 0;
        v21 = v2;
        if (v21 <= 0x3ffffffffffffff && !(v22 = v21 * 64, 0x7ffffffffffffff8 < v22))
        {
            if (!v22)
            {
                v21 = 0;
                v24 = 8;
                goto LABEL_bfd6a4;
            }
            ptr = _malloc(v22);
            if (ptr)
            {
                v24 = ptr;
LABEL_bfd6a4:
                v0 = CONCAT(v24, v21);
                v1 = 0;
                v2 = *(int128_t *)a1;
                v3 = (int128_t)a1[16];
                v4 = (int128_t)a1[32];
                v5 = (int128_t)a1[48];
                v6 = (int128_t)a1[64];
                v25 = *(unsigned long long *)&v2;
                if (*(unsigned long long *)&v6)
                {
                    v26 = *(char *)((void*)&v6 + 8);
                    v27 = *(char *)((void*)&v6 + 9);
                    if (v27 < v26)
                        v28 = 0;
                    else
                        v28 = v27 - v26 & 0xffffffff;
                    if (v25 == 13)
                    {
                        v7 = v28;
                        v29 = &v8;
                        v28 = 1;
                    }
                    else
                    {
                        if (v25 != 12)
                            v28 += 1;
LABEL_bfd71c:
                        v8 = 1;
                        v29 = &v7;
                    }
                }
                else if (v25 == 13)
                {
                    v28 = 0;
                    goto LABEL_bfd71c;
                }
                else
                {
                    v28 = v25 != 12;
                    goto LABEL_bfd71c;
                }
                *v29 = v28;
                if (v8 == 1)
                {
                    if (v21 >= v7)
                    {
                        node = 0;
                    }
                    else
                    {
                        sub_c6c0cc(&v0, 0);
                        v24 = *(unsigned long long *)((void*)&v0 + 8);
                        node = v1;
                    }
                    v9 = (int128_t)a1[16];
                    v10 = (int128_t)a1[32];
                    v11 = (int128_t)a1[48];
                    v12 = (int128_t)a1[64];
                    v8 = *(int128_t *)a1;
                    v31 = *(unsigned long long *)&v12;
                    if (v31)
                    {
                        v32 = *(char *)((void*)&v12 + 8);
                        i = *(char *)((void*)&v12 + 9);
                        if (i > (unsigned int)v32)
                        {
                            iter = v24 + node * 64 + 8;
                            do
                            {
                                v35 = sub_bfa154(v31, v32);
                                v32 += 1;
                                *(unsigned long long *)((char *)iter - 8) = 0;
                                *iter = v35;
                                node += 1;
                                iter += 8;
                            } while (i != ((unsigned int)v32 & 0xff));
                        }
                    }
                    v36 = *(unsigned long long *)&v8;
                    if (11 >= v36)
                    {
                        v37 = v24 + node * 64;
                        v37->field_0 = v36;
                        v38 = (int128_t)a1[8];
                        v39 = (int128_t)a1[24];
                        v40 = (int128_t)a1[40];
                        *(long long *)((char *)&v37->field_28 + 8) = (long long)a1[56];
                        *(uint128_t *)((char *)&v37->field_18 + 8) = v40;
                        *(uint128_t *)((char *)&v37->field_8 + 8) = v39;
                        *(uint128_t *)&(&v37->field_0)[1] = v38;
                        node += 1;
                    }
                    a0->field_0 = v0;
                    a0->field_10 = node;
                    return *(unsigned long long *)&v0;
                }
                sub_c73b38("capacity overflowassertion failed: <Ix as IndexType>::max().index() == !0 || EdgeIndex::end() != edge_idxprefixCommentAssignWhileBlockCloselocalsSetListobject_localindexNotNegateLengthMutexLabelGenericForInitGenericForNextres_localsgeneratorstateGenericForRcLocalNumForInitcounterlimitNumForNextNumericForinitialassertion failed: <Ix as IndexType>::max().index() == !0 || NodeIndex::end() != node_idxUnconditionalBreakVarArgRepeatconditionblockIfthen_blockelse_blockGlobalRefNilBooleanNumberIntegerStringVectorvalueargumentsAddSubMulDivModPowConcatEqualLessThanOrEqualGreaterThanOrEqualGreaterThanAndOrparametersis_variadicLocalMethodCallTableLiteralIndexUnaryBinaryClosureSelectFilterMapmethodrightoperationByAddressReturnvalues @ Because the root is initialized to dominate itself, and is the first node in every path, there must exist a predecessor to this node that also has a dominator{recursion limit reached}?`fmt::Error`s should be impossible without a `fmt::Formatter`> , Cunsafe \" -fn() + : punycode{}.llvm.0[]::::", 35, &g_efc680);
            }
            else
            {
                v20 = 8;
                goto LABEL_bfd690;
            }
        }
        else
        {
LABEL_bfd690:
            sub_c6b970(v20, v22);
        }
    }
    else
    {
        sub_c73b38("capacity overflowassertion failed: <Ix as IndexType>::max().index() == !0 || EdgeIndex::end() != edge_idxprefixCommentAssignWhileBlockCloselocalsSetListobject_localindexNotNegateLengthMutexLabelGenericForInitGenericForNextres_localsgeneratorstateGenericForRcLocalNumForInitcounterlimitNumForNextNumericForinitialassertion failed: <Ix as IndexType>::max().index() == !0 || NodeIndex::end() != node_idxUnconditionalBreakVarArgRepeatconditionblockIfthen_blockelse_blockGlobalRefNilBooleanNumberIntegerStringVectorvalueargumentsAddSubMulDivModPowConcatEqualLessThanOrEqualGreaterThanOrEqualGreaterThanAndOrparametersis_variadicLocalMethodCallTableLiteralIndexUnaryBinaryClosureSelectFilterMapmethodrightoperationByAddressReturnvalues @ Because the root is initialized to dominate itself, and is the first node in every path, there must exist a predecessor to this node that also has a dominator{recursion limit reached}?`fmt::Error`s should be impossible without a `fmt::Formatter`> , Cunsafe \" -fn() + : punycode{}.llvm.0[]::::", 35, &g_efb2e0);
    }
    __debugbreak();
}
