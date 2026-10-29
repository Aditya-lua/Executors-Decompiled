/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa6ee78..0xa6eed4 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a6ee78_0 {
    char padding_0[16];
    struct st_a6ee78_0 *field_10;
} st_a6ee78_0;


st_a6ee78_0 * sub_a6ee78(void)
{
    st_a6ee78_0 *v2;  // x0
    st_a6ee78_0 *v3;  // x8
    st_a6ee78_0 *v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(24, "crypto/param_build.c", 93);
    if (!v2)
        return v2;
    v3 = sub_ad61b4();
    v4 = v2;
    v4->field_10 = v3;
    if (v3)
        return v4;
    sub_a6c2e4(v4, "crypto/param_build.c", 98);
    return 0;
}
