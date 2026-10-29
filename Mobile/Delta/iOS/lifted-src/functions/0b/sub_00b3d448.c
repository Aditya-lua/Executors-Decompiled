/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb3d448..0xb3d4f0 (168 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b3d448_0 {
    unsigned long long field_0;
    unsigned int field_8;
    char padding_c[4];
    long long field_10;
    long long field_18;
} st_b3d448_0;


st_b3d448_0 * sub_b3d448(unsigned long a0, unsigned int a1, unsigned long a2)
{
    long long v2;  // x0
    st_b3d448_0 *v3;  // x0
    st_b3d448_0 *v4;  // x20
    st_b3d448_0 *v5;  // x19
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
    v4 = v3;
    if (sub_b3d4f0())
        return v4;
    v5 = v4;
    sub_a6d4c0(v4->field_10, v4->field_18, "providers/implementations/keymgmt/mac_legacy_kmgmt.c", 522);
    sub_afdddc(v5 + 1);
    sub_a6c2e4(v5, "providers/implementations/keymgmt/mac_legacy_kmgmt.c", 524);
    return 0;
}
