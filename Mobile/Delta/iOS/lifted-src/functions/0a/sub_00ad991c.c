/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xad991c..0xad99a8 (140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ad991c_0 {
    char padding_0[16];
    struct st_ad991c_0 *field_10;
    struct st_ad991c_0 *field_18;
} st_ad991c_0;


st_ad991c_0 * sub_ad991c(void)
{
    st_ad991c_0 *v2;  // x19
    st_ad991c_0 *v3;  // x0
    st_ad991c_0 *v4;  // x20
    st_ad991c_0 *v5;  // x0
    st_ad991c_0 *v6;  // x21
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(32, "crypto/thread/internal.c", 129);
    if (!v2)
        return v2;
    v3 = sub_ad9324();
    v4 = v2;
    v4->field_10 = v3;
    v5 = sub_ad9428(v3);
    v6 = v2;
    v6->field_18 = v5;
    if (v3 && v5)
        return v2;
    sub_ad93e4(&v4->field_10);
    sub_ad94ec(&v6->field_18);
    sub_a6c2e4(v2, "crypto/thread/internal.c", 156);
    return 0;
}
