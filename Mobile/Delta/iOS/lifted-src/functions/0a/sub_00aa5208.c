/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa5208..0xaa52b4 (172 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aa5208_0 {
    unsigned long long field_0;
    struct st_aa5208_0 *field_8;
    struct st_aa5208_0 *field_10;
    struct st_aa5208_0 *field_18;
} st_aa5208_0;

extern long long g_aa5318;

st_aa5208_0 * sub_aa5208(unsigned long a0)
{
    st_aa5208_0 *v2;  // x19
    st_aa5208_0 *v3;  // x0
    st_aa5208_0 *v4;  // x0
    st_aa5208_0 *v5;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(48, "crypto/property/property.c", 247);
    if (!v2)
        return v2;
    v2->field_0 = a0;
    v3 = sub_a7b3e8();
    v2->field_8 = v3;
    if (v3)
    {
        v4 = sub_a7c11c();
        v2->field_10 = v4;
        if (v4)
        {
            v5 = sub_a7c11c();
            v2->field_18 = v5;
            if (v5)
                return v2;
        }
        if (v2->field_8)
            sub_a7b61c(v2->field_8, &g_aa5318, v2);
    }
    sub_a7b3fc();
    sub_a7c1d0(v2->field_10);
    sub_a7c1d0(v2->field_18);
    sub_a6c2e4(v2, "crypto/property/property.c", 268);
    return 0;
}
