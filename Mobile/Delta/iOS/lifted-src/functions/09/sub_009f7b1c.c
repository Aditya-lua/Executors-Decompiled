/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f7b1c..0x9f7b98 (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9f7b1c_0 {
    char padding_0[80];
    unsigned long long field_50;
    struct st_9f7b1c_0 *field_58;
} st_9f7b1c_0;


st_9f7b1c_0 * sub_9f7b1c(unsigned long a0, st_9f7b1c_0 *a1)
{
    st_9f7b1c_0 *v2;  // x0
    st_9f7b1c_0 *v3;  // x8
    st_9f7b1c_0 *v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(96, "crypto/ct/ct_sct_ctx.c", 25);
    if (!v2)
        return v2;
    v2->field_50 = a0;
    if (!a1)
        return v2;
    v3 = sub_a6d9b4(a1, "crypto/ct/ct_sct_ctx.c", 32);
    v4 = v2;
    v4->field_58 = v3;
    if (v3)
        return v4;
    sub_a6c2e4(v4, "crypto/ct/ct_sct_ctx.c", 0x22);
    return 0;
}
