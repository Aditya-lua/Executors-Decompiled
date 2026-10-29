/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb469d4..0xb46a80 (172 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b469d4_0 {
    struct st_b469d4_0 *field_0;
    char padding_8[48];
    struct st_b469d4_0 *field_38;
} st_b469d4_0;


st_b469d4_0 * sub_b469d4(st_b469d4_0 *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    st_b469d4_0 *v8;  // x0
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0)
        return 1;
    if (a0->field_0)
        return 1;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    if (a0->field_38)
        a0->field_38();
    v8 = sub_a7c11c();
    a0->field_0 = v8;
    if (!v8)
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/rands/drbg.c", 765, "ossl_drbg_enable_locking");
        sub_a36abc(57, 180, 0);
        return 0;
    }
    return 1;
}
