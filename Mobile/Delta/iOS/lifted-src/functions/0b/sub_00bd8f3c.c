/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbd8f3c..0xbd9184 (584 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bd8f3c_0 {
    char padding_0[24];
    unsigned long long field_18;
    unsigned long long field_20;
    unsigned long long field_28;
    char padding_30[24];
    unsigned long long field_48;
    char padding_50[8];
    unsigned int field_58;
} st_bd8f3c_0;

extern long long g_efc848;

long long sub_bd8f3c(st_bd8f3c_0 *a0)
{
    unsigned long v9;  // x19
    unsigned long long v10;  // 4156
    long long v19;  // x23
    long long v20;  // x23
    unsigned long v21;  // x19
    unsigned long long v22;  // 4143
    uint128_t *v23;  // x8
    unsigned long v11;  // x1
    unsigned long long v12;  // x9
    void* v13;  // x11
    unsigned long v14;  // x10
    unsigned long v15;  // x8
    unsigned long long v16;  // 4162
    unsigned long long v17;  // 4112
    long long v18;  // x22
    long long v0;  // [bp-0x98]
    unsigned long long v1;  // [bp-0x90]
    long long v2;  // [bp-0x88]
    uint128_t v3;  // [bp-0x80]
    long long v4;  // [bp-0x70]
    uint128_t v5;  // [bp-0x60]
    uint128_t v6;  // [bp-0x50]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v9 = a0->field_58;
    v10 = arm64g_calculate_condition(1, v9 & 0xffffffff, 1, 0);
    if (!(v10 & 1))
    {
        v0 = 0;
        v1 = 8;
        v2 = 0;
        v11 = a0->field_28;
        if (v11 > v9)
        {
            v12 = a0->field_20;
            v13 = v12 + v9 * 32;
            v3 = *(int128_t *)v13;
            v4 = (long long)v13[16];
            *(unsigned long long *)v13 = 0;
            *(unsigned long long *)&v13[8] = 8;
            *(unsigned long long *)&v13[16] = 0;
            v14 = (int)v13[24];
            v15 = (int)v13[28];
            *(unsigned long *)&v13[24] = 0xffffffffffffffff;
            v16 = arm64g_calculate_condition(1, v15 & 0xffffffff, 1, 0);
            if (v16 & 1)
            {
LABEL_bd8fc0:
                v17 = arm64g_calculate_condition(1, v14 & 0xffffffff, 1, 0);
                if (!(v17 & 1))
                {
                    if (v11 > v14)
                    {
                        *(unsigned int *)(v12 + v14 * 32 + 28) = v15;
                        goto LABEL_bd8fd8;
                    }
                    else
                    {
                        v15 = v14;
                        goto LABEL_bd90f0;
                    }
                }
                else
                {
LABEL_bd8fd8:
                    a0->field_58 = v14;
                    a0->field_48 = a0->field_48 + 1;
                    v18 = *(unsigned long long *)&v3;
                    if (v18 == -0x8000000000000000)
                        return v9;
                    v19 = v4 + 1;
                    while (1)
                    {
                        v20 = v19 - 1;
                        if (v19 == 1)
                            break;
                        sub_b9a8fc();
                        v19 = v20;
                    }
                    if (!v18)
                        return v9;
                    _free(*(unsigned long long *)((void*)&v3 + 8));
                    return v9;
                }
                goto LABEL_bd90f0;
            }
            else if (v11 > v15)
            {
                *(unsigned int *)(v12 + v15 * 32 + 24) = v14;
                goto LABEL_bd8fc0;
            }
            else
            {
LABEL_bd90f0:
                sub_c73c94(v15);
            }
        }
        else
        {
            sub_c73c94(v9);
        }
    }
    else
    {
        a0->field_48 = a0->field_48 + 1;
        v5 = CONCAT(8, 0);
        v6 = CONCAT(0xffffffffffffffff, 0);
        v21 = a0->field_28;
        v22 = arm64g_calculate_condition(1, v21 & 0xffffffff, 1, 0);
        if (!(v22 & 1))
        {
            if (v21 == a0->field_18)
            {
                sub_c737b0(&a0->field_18);
                a0 = a0;
            }
            v23 = a0->field_20 + v21 * 32;
            *v23 = v5;
            v23[1] = v6;
            a0->field_28 = v21 + 1;
            return v21;
        }
        sub_c73c80("assertion failed: <Ix as IndexType>::max().index() == !0 || NodeIndex::end() != node_idxUnconditionalBreakVarArgRepeatconditionblockIfthen_blockelse_blockGlobalRefNilBooleanNumberIntegerStringVectorvalueargumentsAddSubMulDivModPowConcatEqualLessThanOrEqualGreaterThanOrEqualGreaterThanAndOrparametersis_variadicLocalMethodCallTableLiteralIndexUnaryBinaryClosureSelectFilterMapmethodrightoperationByAddressReturnvalues @ Because the root is initialized to dominate itself, and is the first node in every path, there must exist a predecessor to this node that also has a dominator{recursion limit reached}?`fmt::Error`s should be impossible without a `fmt::Formatter`> , Cunsafe \" -fn() + : punycode{}.llvm.0[]::::{closure:#<>& *const ; (,_false{ {  } = 0x\'..= | !nullstr()i8i16i32i64isizeu8u16u32u64usizef32f64!...", 88, &g_efc848);
    }
    __debugbreak();
}
