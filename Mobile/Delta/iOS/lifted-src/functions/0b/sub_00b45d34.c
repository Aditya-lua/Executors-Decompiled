/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb45d34..0xb45d90 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b45d34_0 {
    struct st_b45d34_0 *field_0;
} st_b45d34_0;


st_b45d34_0 ** sub_b45d34(void)
{
    st_b45d34_0 **v2;  // x0
    st_b45d34_0 **v3;  // x8
    st_b45d34_0 **v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(16, "providers/implementations/rands/drbg.c", 273);
    if (!v2)
        return v2;
    v3 = sub_a7c11c();
    v4 = v2;
    *v4 = v3;
    if (v3)
        return v4;
    sub_a6c2e4(v4, "providers/implementations/rands/drbg.c", 280);
    return 0;
}
