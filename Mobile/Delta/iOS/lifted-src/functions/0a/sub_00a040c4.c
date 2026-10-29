/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa040c4..0xa04184 (192 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a040c4_0 {
    struct st_a040c4_0 *field_0;
    struct st_a040c4_0 *field_8;
    unsigned int field_10;
    char padding_14[36];
    struct st_a040c4_0 *field_38;
} st_a040c4_0;


st_a040c4_0 * sub_a040c4(void)
{
    st_a040c4_0 *v2;  // x19
    st_a040c4_0 *v3;  // x0
    st_a040c4_0 *v4;  // x0
    st_a040c4_0 *v5;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(72, "crypto/dso/dso_lib.c", 0x11);
    if (!v2)
        return v2;
    v3 = sub_ad61b4();
    v2->field_8 = v3;
    if (!v3)
    {
        sub_a368c8();
        sub_a369bc("crypto/dso/dso_lib.c", 23, "DSO_new_method");
        sub_a36abc(37, 0x8000f, 0);
        sub_a6c2e4(v2, "crypto/dso/dso_lib.c", 24);
        return 0;
    }
    v4 = sub_a03a10();
    v5 = v2;
    v5->field_0 = v4;
    /* unsupported instruction */;
    v5->field_10 = 1;
    if (!v4->field_38)
        return v2;
    v4->field_38();
}
