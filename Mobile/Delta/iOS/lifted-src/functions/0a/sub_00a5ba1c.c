/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa5ba1c..0xa5baec (208 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a5ba1c_0 {
    struct st_a5ba1c_0 *field_0;
    char padding_8[40];
    unsigned int field_30;
    char padding_34[4];
    struct st_a5ba1c_0 *field_38;
    char padding_40[8];
    unsigned int field_48;
} st_a5ba1c_0;


st_a5ba1c_0 * sub_a5ba1c(void)
{
    st_a5ba1c_0 *v2;  // x19
    st_a5ba1c_0 *v3;  // x0
    long long v4;  // x20
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(152, "crypto/evp/p_lib.c", 1502);
    if (!v2)
        return v2;
    v2->field_0 = 0;
    /* unsupported instruction */;
    v2->field_30 = 1;
    v3 = sub_a7c11c();
    v2->field_38 = v3;
    if (v3)
    {
        v2->field_48 = 1;
        if (sub_a6a660(0x11, v2, (char *)&v2[1].field_0 + 4))
            return v2;
        v4 = 1522;
    }
    else
    {
        v4 = 1515;
    }
    sub_a368c8();
    sub_a369bc("crypto/evp/p_lib.c", v4, "EVP_PKEY_new");
    sub_a36abc(6, 0x8000f, 0);
    sub_a7c1d0(v2->field_38);
    sub_a6c2e4(v2, "crypto/evp/p_lib.c", 1531);
    return 0;
}
