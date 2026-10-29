/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa39bb0..0xa39c48 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a39bb0_0 {
    char padding_0[8];
    unsigned int field_8;
    char padding_c[4];
    unsigned int field_10;
    char padding_14[4];
    struct st_a39bb0_0 *field_18;
    unsigned long long field_20;
    unsigned long long field_28;
} st_a39bb0_0;


st_a39bb0_0 * sub_a39bb0(long long a0)
{
    st_a39bb0_0 *v2;  // x0
    st_a39bb0_0 *v3;  // x21
    st_a39bb0_0 *v4;  // x0
    unsigned long v5;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(0x1150, "crypto/evp/bio_enc.c", 0x44);
    if (!v2)
        return 0;
    v3 = v2;
    v4 = sub_a4bc70();
    v3->field_18 = v4;
    if (v4)
    {
        v3->field_8 = 1;
        v3->field_10 = 1;
        v5 = v3 + 7;
        v3->field_20 = v5;
        v3->field_28 = v5;
        sub_9d3d24(a0, v3);
        sub_9d3d2c(a0, 1);
        return 1;
    }
    sub_a6c2e4(v3, "crypto/evp/bio_enc.c", 73);
    return 0;
}
