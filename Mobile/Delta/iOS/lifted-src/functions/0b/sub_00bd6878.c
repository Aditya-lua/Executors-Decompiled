/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbd6878..0xbd6de0 (1384 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bd6878_2 {
    char padding_0[8];
    struct st_bd6878_0 *field_8;
} st_bd6878_2;

typedef struct st_bd6878_0 {
    char padding_0[24];
    struct st_bd6878_1 *field_18;
} st_bd6878_0;

typedef struct st_bd6878_1 {
    unsigned long long field_0;
} st_bd6878_1;

extern long long g_be522c;

long long sub_bd6878(unsigned long long *a0, st_bd6878_2 *a1)
{
    long long v3;  // x8
    unsigned long long v4;  // 4163
    unsigned long v0;  // [bp-0x58]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = 4;
    v4 = arm64g_calculate_condition(0x44, *a0, 0, 0);
    if (v4 & 1)
        v3 = *a0 ^ 0x8000000000000000;
    if (2 >= v3)
    {
        if (!v3)
        {
            goto *((void *)(a1->field_8->field_18));
        }
        else if (v3 == 1)
        {
            a1->field_8->field_18();
        }
        else
        {
            a1->field_8->field_18();
        }
    }
    else
    {
        if (v3 == 3)
        {
            a1->field_8->field_18();
        }
        else if (v3 == 4)
        {
            a1->field_8->field_18();
        }
        else
        {
            v0 = a0 + 2;
            return sub_be9930(a1, "VectorvalueargumentsAddSubMulDivModPowConcatEqualLessThanOrEqualGreaterThanOrEqualGreaterThanAndOrparametersis_variadicLocalMethodCallTableLiteralIndexUnaryBinaryClosureSelectFilterMapmethodrightoperationByAddressReturnvalues @ Because the root is initialized to dominate itself, and is the first node in every path, there must exist a predecessor to this node that also has a dominator{recursion limit reached}?`fmt::Error`s should be impossible without a `fmt::Formatter`> , Cunsafe \" -fn() + : punycode{}.llvm.0[]::::{closure:#<>& *const ; (,_false{ {  } = 0x\'..= | !nullstr()i8i16i32i64isizeu8u16u32u64usizef32f64!...", a0 + 1, (char *)&a0[1] + 4, &v0, &g_be522c);
        }
    }
}
