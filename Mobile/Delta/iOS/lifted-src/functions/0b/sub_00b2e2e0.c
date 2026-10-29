/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb2e2e0..0xb2e484 (420 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b2e2e0_1 {
    char padding_0[8];
    char field_8;
    char padding_9[23];
    unsigned long long field_20;
    char padding_28[128];
    long long field_a8;
    struct st_b2e2e0_0 *field_b0;
    struct st_b2e2e0_0 *field_b8;
    struct st_b2e2e0_0 *field_c0;
    struct st_b2e2e0_0 *field_c8;
    struct st_b2e2e0_0 *field_d0;
} st_b2e2e0_1;

typedef struct st_b2e2e0_0 {
    struct st_b2e2e0_0 *field_0;
} st_b2e2e0_0;


unsigned long long sub_b2e2e0(st_b2e2e0_1 *a0, st_b2e2e0_0 **a1)
{
    long long v4;  // x0
    unsigned long long v5;  // x0
    unsigned long long v6;  // x0
    unsigned long long v7;  // x0
    st_b2e2e0_0 **v8;  // x0
    unsigned long long v9;  // w0
    st_b2e2e0_0 **v0;  // [bp-0x40]
    st_b2e2e0_0 **v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = sub_9f2aec(a0->field_a8);
    v0 = 0;
    v1 = 0;
    if (!a1 || !*a1)
        return 1;
    if (sub_a6fbc4(a1, "entropy"))
    {
        v5 = sub_a71440();
        if (!(unsigned int)v5)
            return v5;
        sub_a6c2e4(a0->field_b0, "providers/implementations/kdfs/hmacdrbg_kdf.c", 196);
        a0->field_b0 = v1;
        a0->field_c0 = v0;
        *(unsigned int *)&a0->field_d0 = 0;
        v1 = 0;
    }
    if (sub_a6fbc4(a1, "nonce"))
    {
        v6 = sub_a71440();
        if (!(unsigned int)v6)
            return v6;
        sub_a6c2e4(a0->field_b8, "providers/implementations/kdfs/hmacdrbg_kdf.c", 207);
        a0->field_b8 = v1;
        a0->field_c8 = v0;
        *(unsigned int *)&a0->field_d0 = 0;
    }
    if (sub_a6fbc4(a1, "digest"))
    {
        v7 = sub_afe114(&a0->field_8, a1, v4);
        if (!(unsigned int)v7)
            return v7;
        v8 = sub_954340(&a0->field_8);
        if (!v8)
            return sub_afe4cc(a0, a1, "HMAC", 0, 0, v4);
        if (sub_a50b14())
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/kdfs/hmacdrbg_kdf.c", 222, "hmac_drbg_kdf_set_ctx_params");
            sub_a36abc(57, 183, 0);
            return 0;
        }
        v9 = (unsigned int)sub_a50ac8(v8);
        if (v9 < 1)
            return 0;
        a0->field_20 = v9;
        return sub_afe4cc(a0, a1, "HMAC", 0, 0, v4);
    }
    return 1;
}
