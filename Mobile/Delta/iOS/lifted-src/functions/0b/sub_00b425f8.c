/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb425f8..0xb42670 (120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b425f8_0 {
    char padding_0[8];
    unsigned long long field_8;
} st_b425f8_0;


st_b425f8_0 * sub_b425f8(unsigned long a0, unsigned long a1, unsigned long a2)
{
    long long v2;  // x0
    st_b425f8_0 *v3;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9f2aec();
    if (sub_a2f9e0(v2))
    {
        v3 = sub_a6bffc(128, "providers/implementations/keymgmt/slh_dsa_kmgmt.c", 282);
        if (!v3)
            return v3;
        v3->field_8 = v2;
        if (sub_b426d0())
            return v3;
        sub_a6c2e4(v3, "providers/implementations/keymgmt/slh_dsa_kmgmt.c", 285);
    }
    return 0;
}
