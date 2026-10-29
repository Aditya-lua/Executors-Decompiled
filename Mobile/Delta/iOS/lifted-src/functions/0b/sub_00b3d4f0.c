/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb3d4f0..0xb3d5a0 (176 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b3d4f0_0 {
    char padding_0[8];
    unsigned int field_8;
    char padding_c[4];
    struct st_b3d4f0_0 *field_10;
    long long field_18;
} st_b3d4f0_0;


st_b3d4f0_0 * sub_b3d4f0(st_b3d4f0_0 *a0, long long a1)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    st_b3d4f0_0 *v8;  // x0
    st_b3d4f0_0 *v9;  // x0
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (!a0)
        return a0;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    v8 = sub_a6fbc4(a1, "priv");
    if (!v8)
        return 1;
    if (v8->field_8 == 5)
    {
        v9 = sub_a6c610(v8->field_18, "providers/implementations/keymgmt/mac_legacy_kmgmt.c", 425);
        a0->field_10 = v9;
        if (!v9)
            return v9;
        _memcpy();
        a0->field_18 = v8->field_18;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/keymgmt/mac_legacy_kmgmt.c", 422, "mac_gen_set_params");
        sub_a36abc(57, 0x80106, 0);
        return 0;
    }
    return 1;
}
