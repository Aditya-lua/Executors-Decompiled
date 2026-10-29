/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa77b74..0xa77bd0 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a77b74_0 {
    struct st_a77b74_0 *field_0;
} st_a77b74_0;


st_a77b74_0 ** sub_a77b74(void)
{
    st_a77b74_0 **v2;  // x0
    st_a77b74_0 **v3;  // x8
    st_a77b74_0 **v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(16, "crypto/provider_conf.c", 32);
    if (!v2)
        return v2;
    v3 = sub_a7c11c();
    v4 = v2;
    *v4 = v3;
    if (v3)
        return v4;
    sub_a6c2e4(v4, "crypto/provider_conf.c", 39);
    return 0;
}
