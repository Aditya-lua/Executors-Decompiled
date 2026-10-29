/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb31020..0xb31164 (324 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b31020_0 {
    unsigned long long field_0;
    struct st_b31020_0 *field_8;
    struct st_b31020_0 *field_10;
    long long field_18;
    struct st_b31020_0 *field_20;
    char field_28;
    char padding_29[7];
    uint128_t field_30;
    uint128_t field_40;
    struct st_b31020_0 *field_50;
} st_b31020_0;

typedef struct st_b31020_1 {
    unsigned long long field_0;
    struct st_b31020_0 *field_8;
    long long field_10;
    long long field_18;
    long long field_20;
    long long field_28;
    uint128_t field_30;
    uint128_t field_40;
    struct st_b31020_0 *field_50;
} st_b31020_1;


st_b31020_0 * sub_b31020(st_b31020_1 *a0)
{
    st_b31020_0 *v4;  // x19
    st_b31020_0 *v5;  // x0
    uint128_t v6;  // q1
    uint128_t v0;  // [bp-0x50]
    uint128_t v1;  // [bp-0x40]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    if (!sub_a2f9e0())
        return 0;
    v4 = sub_a6bffc(88, "providers/implementations/kdfs/scrypt.c", 65);
    if (!v4)
        return v4;
    v4->field_0 = a0->field_0;
    v0 = 0x401000000000000000000001;
    v1 = 0x80000000000100000;
    v4->field_30 = 0x80000000000100000;
    v4->field_40 = 0x401000000000000000000001;
    if ((!a0->field_50 || sub_a40a98(a0->field_50)) && (!a0->field_8 || (v5 = sub_a6d9b4(a0->field_8, "providers/implementations/kdfs/scrypt.c", 111), v4->field_8 = v5, v5)) && sub_afe694(a0->field_20, a0->field_28, &v4->field_20, &v4->field_28) && sub_afe694(a0->field_10, a0->field_18, &v4->field_10, &v4->field_18))
    {
        v6 = a0->field_40;
        v4->field_30 = a0->field_30;
        v4->field_40 = v6;
        v4->field_50 = a0->field_50;
        return v4;
    }
    sub_a6c2e4(v4->field_8, "providers/implementations/kdfs/scrypt.c", 83);
    sub_a3f52c(v4->field_50);
    sub_a6c2e4(v4->field_20, "providers/implementations/kdfs/scrypt.c", 94);
    v4->field_20 = 0;
    sub_a6c4e8(v4->field_10, v4->field_18, "providers/implementations/kdfs/scrypt.c", 96);
    v4->field_10 = 0;
    v4->field_30 = v1;
    v4->field_40 = v0;
    sub_a6c2e4(v4, "providers/implementations/kdfs/scrypt.c", 86);
    return 0;
}
