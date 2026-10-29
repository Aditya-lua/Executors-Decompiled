/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb51a8c..0xb51b2c (160 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b51a8c_0 {
    struct st_b51a8c_0 *field_0;
    char padding_8[16];
    unsigned int field_18;
    char padding_1c[156];
    struct st_b51a8c_0 *field_b8;
    struct st_b51a8c_0 *field_c0;
} st_b51a8c_0;


st_b51a8c_0 * sub_b51a8c(st_b51a8c_0 *a0, st_b51a8c_0 *a1)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long long v9;  // x20
    unsigned long long v10;  // x19
    unsigned long long v11;  // x30
    st_b51a8c_0 *v12;  // x0
    st_b51a8c_0 **v13;  // x20
    st_b51a8c_0 *v14;  // x0
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (!a0)
        return a0;
    if (!a1 || !a1->field_0)
        return 1;
    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    if (a0->field_18 != 0x8000)
        return 1;
    v12 = sub_a6fbc4(a1, "signature");
    if (v12)
    {
        v13 = &a0->field_b8;
        sub_a6c2e4(a0->field_b8, "providers/implementations/signature/rsa_sig.c", 2019);
        *v13 = 0;
        a0->field_c0 = 0;
        v14 = sub_a71440(v12, v13, 0, &a0->field_c0);
        if (!(unsigned int)v14)
            return v14;
    }
    return 1;
    return 1;
}
