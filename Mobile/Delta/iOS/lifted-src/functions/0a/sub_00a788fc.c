/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa788fc..0xa78980 (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a788fc_0 {
    char padding_0[32];
    long long field_20;
    char padding_28[32];
    char field_48;
} st_a788fc_0;


st_a788fc_0 * sub_a788fc(void)
{
    st_a788fc_0 *v2;  // x0
    st_a788fc_0 *v3;  // x19
    st_a788fc_0 *v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6820c();
    if (!v2)
    {
        sub_a368c8();
        sub_a369bc("crypto/provider_core.c", 335, "get_provider_store");
        sub_a36abc(15, 0xc0103, 0);
        return 0;
    }
    v3 = v2;
    v4 = sub_a7c198(v2->field_20);
    if (!(unsigned int)v4)
        return v4;
    v3->field_48 = v3->field_48 & 254;
    sub_a7c1b4(v3->field_20);
    return 1;
}
