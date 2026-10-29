/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa79d8..0xaa7af0 (280 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aa79d8_0 {
    struct st_aa79d8_0 *field_0;
    struct st_aa79d8_0 *field_8;
    struct st_aa79d8_0 *field_10;
    char padding_18[8];
    struct st_aa79d8_0 *field_20;
    struct st_aa79d8_0 *field_28;
} st_aa79d8_0;

extern long long g_aa7af0;
extern long long g_aa7af8;

st_aa79d8_0 * sub_aa79d8(void)
{
    st_aa79d8_0 *v2;  // x19
    st_aa79d8_0 *v3;  // x0
    st_aa79d8_0 *v4;  // x0
    st_aa79d8_0 *v5;  // x0
    st_aa79d8_0 *v6;  // x0
    st_aa79d8_0 *v7;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(48, "crypto/property/property_string.c", 98);
    if (!v2)
        return v2;
    v3 = sub_a7c11c();
    v2->field_0 = v3;
    v4 = sub_a66520(sub_a66530(&g_aa7af0, &g_aa7af8), " ", "@", " ", "@");
    v2->field_8 = v4;
    v5 = sub_a66520(sub_a66530(&g_aa7af0, &g_aa7af8), " ", "@", " ", "@");
    v2->field_10 = v5;
    v6 = sub_ad61b4(v5, " ", "@", " ", "@");
    v2->field_20 = v6;
    v7 = sub_ad61b4(v6);
    v2->field_28 = v7;
    if (v3 && v6 && v7 && v4 && v5)
        return v2;
    sub_aa793c(v2);
    return 0;
}
