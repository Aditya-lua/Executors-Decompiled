/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbe9174..0xbe9320 (428 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_be9174_0 {
    char padding_0[24];
    struct st_be9174_1 *field_18;
} st_be9174_0;

typedef struct st_be9174_2 {
    unsigned long long field_0[2];
    struct st_be9174_0 *field_8;
    char field_10[8];
    char field_12;
} st_be9174_2;

typedef struct st_be9174_1 {
    unsigned long long field_0;
} st_be9174_1;

typedef struct st_be9174_3 {
    struct st_be9174_2 *field_0;
    char field_8;
    char field_9;
} st_be9174_3;

extern unsigned long long g_efa758;

st_be9174_3 * sub_be9174(st_be9174_3 *a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long long *a4)
{
    st_be9174_2 *v8;  // x20
    unsigned long v9;  // x8
    unsigned long long v10;  // 4111
    uint128_t v0;  // [bp-0x90]
    char *v1;  // [bp-0x80]
    char v2;  // [bp-0x69]
    char *v3;  // [bp-0x68]
    unsigned long long v4;  // [bp-0x60]
    unsigned long v5;  // [bp-0x58]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    if (a0->field_8 & 1)
    {
        a0->field_8 = 1;
        a0->field_9 = 1;
        return a0;
    }
    v8 = a0->field_0;
    v9 = a0->field_9;
    if (*((char *)&v8->field_8 + 2) >= 0)
    {
        v10 = arm64g_calculate_condition(19, v9 & 0xff, 0, 0);
        (*(long long *)(v8->field_0[1] + 24))();
    }
    else if (!(v9 & 1))
    {
        (*(long long *)(v8->field_0[1] + 24))();
    }
    else
    {
        v2 = 1;
        v0 = (uint128_t)v8->field_0;
        v1 = &v2;
        v3 = &v0;
        v4 = &g_efa758;
        v5 = v8->field_8;
        if (sub_be8048(&v0) & 1 || sub_be8048(&v0, ": punycode{}.llvm.0[]::::{closure:#<>& *const ; (,_false{ {  } = 0x'..= | !nullstr()i8i16i32i64isizeu8u16u32u64usizef32f64!...", 2) & 1)
            return sub_be92d8();
        a4();
        return sub_be92d8();
    }
}
