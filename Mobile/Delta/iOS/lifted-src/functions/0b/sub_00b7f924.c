/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb7f924..0xb7fa48 (292 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b7f924_0 {
    uint128_t field_0;
    unsigned long long field_10;
} st_b7f924_0;

extern long long g_efc848;

unsigned long long sub_b7f924(unsigned long long *a0, unsigned long a1, unsigned long a2)
{
    unsigned long long v6;  // x21
    unsigned long long v7;  // 4159
    st_b7f924_0 *v8;  // x8
    uint128_t v0;  // [bp-0x68]
    unsigned long long v1;  // [bp-0x58]
    uint128_t v2;  // [bp-0x50]
    unsigned long long v3;  // [bp-0x40]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v0 = CONCAT(a2, a1);
    v1 = 0xffffffffffffffff;
    v6 = a0[2];
    v7 = arm64g_calculate_condition(1, v6 & 0xffffffff, 1, 0);
    if (!(v7 & 1))
    {
        v2 = v0;
        v3 = v1;
        if (v6 == *a0)
            sub_c6c3c4(a0);
        v8 = a0[1] + 24 * v6;
        v8->field_0 = v0;
        v8->field_10 = v1;
        a0[2] = v6 + 1;
        return v6;
    }
    sub_c73c80("assertion failed: <Ix as IndexType>::max().index() == !0 || NodeIndex::end() != node_idxUnconditionalBreakVarArgRepeatconditionblockIfthen_blockelse_blockGlobalRefNilBooleanNumberIntegerStringVectorvalueargumentsAddSubMulDivModPowConcatEqualLessThanOrEqualGreaterThanOrEqualGreaterThanAndOrparametersis_variadicLocalMethodCallTableLiteralIndexUnaryBinaryClosureSelectFilterMapmethodrightoperationByAddressReturnvalues @ Because the root is initialized to dominate itself, and is the first node in every path, there must exist a predecessor to this node that also has a dominator{recursion limit reached}?`fmt::Error`s should be impossible without a `fmt::Formatter`> , Cunsafe \" -fn() + : punycode{}.llvm.0[]::::{closure:#<>& *const ; (,_false{ {  } = 0x\'..= | !nullstr()i8i16i32i64isizeu8u16u32u64usizef32f64!...", 88, &g_efc848);
    __debugbreak();
}
