/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb29fb8..0xb2a0cc (276 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b29fb8_1 {
    uint128_t field_0;
    struct st_b29fb8_0 *field_10;
} st_b29fb8_1;

typedef struct st_b29fb8_0 {
    unsigned long long field_0[2];
    struct st_b29fb8_0 *field_8;
    struct st_b29fb8_0 *field_10;
} st_b29fb8_0;


st_b29fb8_0 * sub_b29fb8(st_b29fb8_1 *a0)
{
    st_b29fb8_0 *v2;  // x0
    st_b29fb8_0 *v3;  // x0
    st_b29fb8_0 *v4;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
        return 0;
    v2 = sub_a6bffc(24, "providers/implementations/exchange/ecx_exch.c", 159);
    if (!v2)
        return v2;
    *(uint128_t *)v2->field_0 = a0->field_0;
    v2->field_8 = a0->field_10;
    v3 = v2;
    if (!v3->field_0[1] || (v4 = v2, v3 = v4, sub_a2a930(v2->field_0[1])))
    {
        if (!v3->field_8)
            return v3;
        v4 = v3;
        if (sub_a2a930(v3->field_8))
            return v4;
        sub_a368c8();
        sub_a369bc("providers/implementations/exchange/ecx_exch.c", 171, "ecx_dupctx");
        sub_a36abc(57, 0xc0103, 0);
        sub_a2a8a4(v4->field_0[1]);
    }
    else
    {
        sub_a368c8(v3);
        sub_a369bc("providers/implementations/exchange/ecx_exch.c", 165, "ecx_dupctx");
        sub_a36abc(57, 0xc0103, 0);
    }
    sub_a6c2e4(v4, "providers/implementations/exchange/ecx_exch.c");
    return 0;
}
