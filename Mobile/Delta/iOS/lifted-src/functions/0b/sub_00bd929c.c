/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbd929c..0xbd954c (688 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bd929c_1 {
    unsigned long long field_0;
    char padding_8[16];
    unsigned int field_18;
} st_bd929c_1;

typedef struct st_bd929c_2 {
    unsigned long long field_0;
    char padding_8[20];
    unsigned int field_1c;
} st_bd929c_2;

typedef struct st_bd929c_0 {
    char padding_0[8];
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
    unsigned long long field_20;
    unsigned long long field_28;
    char padding_30[8];
    unsigned long long field_38;
    char padding_40[4];
    unsigned int field_44;
} st_bd929c_0;

extern unsigned long long g_bef1c8;
extern long long g_cb9ef5;
extern long long g_efc770;
extern long long g_efc788;
extern long long g_efc7a0;
extern long long g_efc7b8;

double sub_bd929c(st_bd929c_0 *a0, unsigned int a1, unsigned int a2, uint128_t *a3)
{
    unsigned long v8;  // x20
    unsigned long long v9;  // 4193
    unsigned long v18;  // x9
    unsigned long v19;  // x10
    unsigned long v20;  // x11
    unsigned long long v21;  // x12
    void* v22;  // x10
    unsigned long long v23;  // 4141
    st_bd929c_1 *v24;  // x11
    st_bd929c_2 *v25;  // x12
    unsigned int v26;  // w10
    unsigned long long v27;  // 4155
    unsigned long v10;  // x21
    uint128_t *v28;  // x8
    void* v11;  // x26
    unsigned long v12;  // x27
    long long v13;  // x25
    uint128_t v14;  // q0
    uint128_t v15;  // q1
    unsigned long v16;  // x8
    unsigned long long v17;  // 4116
    uint320_t v0;  // [bp-0xb0], Other Possible Types: uint384_t
    uint384_t v1;  // [bp-0xb0], Other Possible Types: uint320_t
    uint320_t v2;  // [bp-0x90], Other Possible Types: unsigned long long
    unsigned long v3;  // [bp-0x78]
    char *v4;  // [bp-0x70]
    unsigned long long v5;  // [bp-0x68]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v0 = _INSERT(*(uint320_t *)&v0, 0, 9223372036854775809);
    v8 = a0->field_44;
    v9 = arm64g_calculate_condition(1, v8 & 0xffffffff, 1, 0);
    if (!(v9 & 1))
    {
        v10 = a0->field_28;
        if (v10 > v8)
        {
            v11 = a0->field_20 + (unsigned int)v8 * 48;
            v12 = *(long long *)v11;
            v13 = (long long)v11[8];
            v14 = *a3;
            v15 = a3[1];
            *(uint128_t *)v11 = v14;
            *(uint128_t *)&v11[16] = v15;
            a0->field_44 = (int)v11[32];
            *(unsigned int *)&v11[40] = a1;
            *(unsigned int *)&v11[44] = a2;
            if (v12 != 0x8000000000000000)
            {
                sub_b9f1a4(v13);
                if (v12)
                    _free(v13);
            }
            v2 = v0;
            v16 = v8;
            goto LABEL_bd9374;
        }
        else
        {
            sub_c73c94(v8, v10, &g_efc7a0);
        }
    }
    else
    {
        v16 = a0->field_28;
        v17 = arm64g_calculate_condition(1, v16 & 0xffffffff, 1, 0);
        if (!(v17 & 1))
        {
            v14 = *a3;
            v1 = _INSERT(v0, 0, v14);
            *(uint128_t *)((char *)&v1 + 16) = a3[1];
            v2 = 0xffffffffffffffff;
            v1 = _INSERT(CONCAT(v1, 0), 40, a1);
            v2 = _INSERT(v1, 44, a2);
            if (*(unsigned long long *)&v2 != 9223372036854775809)
            {
                v11 = &v2;
                v10 = v16;
LABEL_bd9374:
                v18 = a1;
                v19 = a2;
                if (v18 < v19)
                    v20 = v19;
                else
                    v20 = v18;
                if (a0->field_10 <= v20)
                    goto LABEL_bd94a4;
                v21 = a0->field_8;
                if (a1 == a2)
                {
                    v22 = v21 + v19 * 32;
                    if (*(long long *)v22 != 0x8000000000000000)
                    {
                        *(long long *)&v11[32] = (long long)v22[24];
                        *(unsigned int *)&v22[24] = v16;
                        *(unsigned int *)&v22[28] = v16;
                        a0->field_38 = a0->field_38 + 1;
                        v23 = arm64g_calculate_condition(0x11, v8 & 0xffffffff, 1, 0);
                        if (v23 & 1)
                            return (unsigned long long)v14;
                        goto LABEL_bd9424;
                    }
                }
                else
                {
                    v24 = v21 + v18 * 32;
                    if (v24->field_0 != 0x8000000000000000 && !(v25 = v21 + v19 * 32, v18 = v19, v25->field_0 == 0x8000000000000000))
                    {
                        v26 = v25->field_1c;
                        *(unsigned int *)&v11[32] = v24->field_18;
                        *(unsigned int *)&v11[36] = v26;
                        v24->field_18 = v16;
                        v25->field_1c = v16;
                        a0->field_38 = a0->field_38 + 1;
                        v27 = arm64g_calculate_condition(0x11, v8 & 0xffffffff, 1, 0);
                        if (v27 & 1)
                            return (unsigned long long)v14;
LABEL_bd9424:
                        if (v10 == a0->field_18)
                            sub_c6c2f4(&a0->field_18);
                        v28 = a0->field_20 + 48 * v10;
                        *v28 = *(uint128_t *)&v0;
                        v28[1] = *(uint128_t *)((void*)&v0 + 16);
                        v14 = v2;
                        v28[2] = v14;
                        a0->field_28 = v10 + 1;
                        return (unsigned long long)v14;
                    }
                }
            }
            else
            {
                sub_c73c64(&g_efc788);
LABEL_bd94a4:
                v18 = v20;
            }
            v3 = v18;
            v4 = &v3;
            v5 = &g_bef1c8;
            sub_c73b38(&g_cb9ef5, &v4, &g_efc7b8);
        }
        else
        {
            sub_c73c80("assertion failed: <Ix as IndexType>::max().index() == !0 || EdgeIndex::end() != edge_idxprefixCommentAssignWhileBlockCloselocalsSetListobject_localindexNotNegateLengthMutexLabelGenericForInitGenericForNextres_localsgeneratorstateGenericForRcLocalNumForInitcounterlimitNumForNextNumericForinitialassertion failed: <Ix as IndexType>::max().index() == !0 || NodeIndex::end() != node_idxUnconditionalBreakVarArgRepeatconditionblockIfthen_blockelse_blockGlobalRefNilBooleanNumberIntegerStringVectorvalueargumentsAddSubMulDivModPowConcatEqualLessThanOrEqualGreaterThanOrEqualGreaterThanAndOrparametersis_variadicLocalMethodCallTableLiteralIndexUnaryBinaryClosureSelectFilterMapmethodrightoperationByAddressReturnvalues @ Because the root is initialized to dominate itself, and is the first node in every path, there must exist a predecessor to this node that also has a dominator{recursion limit reached}?`fmt::Error`s should be impossible without a `fmt::Formatter`> , Cunsafe \" -fn() + : punycode{}.llvm.0[]::::{closure:#<>& *co", 88, &g_efc770);
        }
    }
    __debugbreak();
}
