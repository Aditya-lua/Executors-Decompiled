/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb3eddc..0xb3ef14 (312 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b3eddc_0 {
    struct st_b3eddc_0 *field_0;
    struct st_b3eddc_0 *field_8;
    long long field_10;
    char field_18;
    char padding_19[63];
    struct st_b3eddc_0 *field_58;
} st_b3eddc_0;


st_b3eddc_0 * sub_b3eddc(st_b3eddc_0 *a0, st_b3eddc_0 *a1)
{
    unsigned long long v8;  // x22
    unsigned long long v9;  // x21
    unsigned long long v10;  // x20
    unsigned long long v11;  // x19
    unsigned long long v12;  // x30
    st_b3eddc_0 *v13;  // x0
    st_b3eddc_0 *v14;  // x0
    st_b3eddc_0 *v15;  // x20
    long long v0;  // [bp-0x38]
    unsigned long long v1;  // [bp-0x30]
    unsigned long long v2;  // [bp-0x28]
    unsigned long long v3;  // [bp-0x20]
    unsigned long long v4;  // [bp-0x18]
    char *v5;  // [bp-0x10]
    unsigned long long v6;  // [bp-0x8]
    char v7;  // [bp+0x0]

    if (!a0)
        return a0;
    if (!a1 || !a1->field_0)
        return 1;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = v11;
    v5 = &v7;
    v6 = v12;
    v13 = sub_a6fbc4(a1, "properties");
    if (v13)
    {
        if ((int)v13->field_8 == 4)
        {
            sub_a6c2e4(a0->field_8, "providers/implementations/keymgmt/ml_kem_kmgmt.c", 700);
            v14 = sub_a6d9b4(v13->field_10, "providers/implementations/keymgmt/ml_kem_kmgmt.c", 701);
            a0->field_8 = v14;
            if (!v14)
                return v14;
        }
        else
        {
            return 0;
        }
    }
    if (!sub_a6fbc4(a1, "seed"))
        return 1;
    v0 = 64;
    v15 = &a0->field_18;
    a0->field_58 = v15;
    if (!sub_a71440() || v0 != 64)
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/keymgmt/ml_kem_kmgmt.c", 715, "ml_kem_gen_set_params");
        sub_a36abc(57, 154, 0);
        sub_a66ec0(v15, 64);
        a0->field_58 = 0;
        return 0;
    }
    return 1;
    return 1;
}
