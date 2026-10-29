/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa2de80..0xa2df2c (172 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a2de80_0 {
    struct st_a2de80_0 *field_0;
    struct st_a2de80_0 *field_8;
} st_a2de80_0;

extern long long g_a2df2c;
extern long long g_a2dfd4;

st_a2de80_0 * sub_a2de80(void)
{
    st_a2de80_0 *v2;  // x19
    st_a2de80_0 *v3;  // x0
    st_a2de80_0 *v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bf4c(16, "crypto/encode_decode/decoder_pkey.c", 765);
    if (!v2)
        return v2;
    v3 = sub_a7c11c();
    v2->field_0 = v3;
    if (v3)
    {
        v4 = sub_a66520(sub_a66530(&g_a2df2c, &g_a2dfd4), " ", "@", " ", "@");
        v2->field_8 = v4;
        if (v4)
            return v2;
        sub_a7c1d0(v2->field_0);
    }
    sub_a6c2e4(v2, "crypto/encode_decode/decoder_pkey.c");
    return 0;
}
