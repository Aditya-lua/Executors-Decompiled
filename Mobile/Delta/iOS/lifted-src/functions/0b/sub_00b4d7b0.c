/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4d7b0..0xb4d88c (220 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b4d7b0_0 {
    struct st_b4d7b0_0 *field_0;
    char padding_8[16];
    unsigned int field_18;
    char padding_1c[348];
    struct st_b4d7b0_0 *field_178;
    struct st_b4d7b0_0 *field_180;
} st_b4d7b0_0;


st_b4d7b0_0 * sub_b4d7b0(st_b4d7b0_0 *a0, st_b4d7b0_0 *a1)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    st_b4d7b0_0 *v8;  // x0
    st_b4d7b0_0 *v9;  // x0
    st_b4d7b0_0 *v10;  // x0
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0)
        return a0;
    if (!a1 || !a1->field_0)
        return 1;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    if (sub_a6fbc4(a1, "nonce-type"))
    {
        v8 = sub_a6ffcc();
        if (!(unsigned int)v8)
            return v8;
    }
    if (a0->field_18 != 0x8000)
        return 1;
    v9 = sub_a6fbc4(a1, "signature");
    if (v9)
    {
        sub_a6c2e4(a0->field_178, "providers/implementations/signature/ecdsa_sig.c", 984);
        a0->field_178 = 0;
        a0->field_180 = 0;
        v10 = sub_a71440(v9, &a0->field_178, 0, &a0->field_180);
        if (!(unsigned int)v10)
        {
            return v10;
        }
        else if (!a0->field_180)
        {
            sub_a6c2e4(a0->field_178, "providers/implementations/signature/ecdsa_sig.c", 992);
            a0->field_178 = 0;
            return 0;
        }
    }
    return 1;
    return 1;
}
