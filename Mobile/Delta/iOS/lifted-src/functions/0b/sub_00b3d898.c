/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb3d898..0xb3d980 (232 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b3d898_0 {
    long long field_0;
    unsigned int field_8;
    char padding_c[4];
    long long field_10;
    long long field_18;
} st_b3d898_0;


st_b3d898_0 * sub_b3d898(unsigned long a0, unsigned int a1, long long a2)
{
    long long v2;  // x0
    st_b3d898_0 *v3;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9f2aec();
    if (!sub_a2f9e0(v2))
        return 0;
    v3 = sub_a6bffc(56, "providers/implementations/keymgmt/mac_legacy_kmgmt.c", 380);
    if (!v3)
        return v3;
    v3->field_0 = v2;
    v3->field_8 = a1;
    if (sub_b3d4f0(v3, a2))
    {
        if (!sub_afde7c(v3 + 1, a2, v3->field_0))
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/keymgmt/mac_legacy_kmgmt.c", 444, "cmac_gen_set_params");
            sub_a36abc(57, 0x80106, 0);
        }
        else
        {
            return v3;
        }
    }
    sub_a6d4c0(v3->field_10, v3->field_18, "providers/implementations/keymgmt/mac_legacy_kmgmt.c", 522);
    sub_afdddc(v3 + 1);
    sub_a6c2e4(v3, "providers/implementations/keymgmt/mac_legacy_kmgmt.c", 524);
    return 0;
}
