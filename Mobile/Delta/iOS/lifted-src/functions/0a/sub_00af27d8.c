/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf27d8..0xaf2910 (312 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_af27d8_0 {
    unsigned int field_0;
    char padding_4[4];
    struct st_af27d8_0 *field_8;
    struct st_af27d8_0 *field_10;
    struct st_af27d8_0 *field_18;
    char padding_20[96];
    char field_80;
    char padding_81[15];
    unsigned int field_90;
    char padding_94[4];
    struct st_af27d8_0 *field_98;
} st_af27d8_0;

extern long long g_af2910;

st_af27d8_0 * sub_af27d8(void)
{
    st_af27d8_0 *v2;  // x19
    long long v3;  // x20
    st_af27d8_0 *v4;  // x0
    st_af27d8_0 *v5;  // x0
    st_af27d8_0 *v6;  // x0
    st_af27d8_0 *v7;  // x0
    long long v8;  // x21
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(160, "crypto/x509/x509_lu.c", 184);
    if (!v2)
        return v2;
    v3 = 524303;
    v4 = sub_ad6270(&g_af2910);
    v2->field_8 = v4;
    if (v4)
    {
        v2->field_0 = 1;
        v5 = sub_ad61b4();
        v2->field_10 = v5;
        if (v5)
        {
            v6 = sub_af82c4();
            v2->field_18 = v6;
            if (!v6)
            {
                v3 = 524299;
                v8 = 199;
            }
            else if (sub_a6a660(4, v2, &v2->field_80))
            {
                v7 = sub_a7c11c();
                v2->field_98 = v7;
                if (v7)
                {
                    /* unsupported instruction */;
                    v2->field_90 = 1;
                    return v2;
                }
                v8 = 209;
            }
            else
            {
                v8 = 203;
            }
        }
        else
        {
            v8 = 194;
        }
    }
    else
    {
        v8 = 189;
    }
    sub_a368c8();
    sub_a369bc("crypto/x509/x509_lu.c", v8, "X509_STORE_new");
    sub_a36abc(11, v3, 0);
    sub_af82fc(v2->field_18);
    sub_ad6020(v2->field_8);
    sub_ad6020(v2->field_10);
    sub_a7c1d0(v2->field_98);
    sub_a6c2e4(v2, "crypto/x509/x509_lu.c", 222);
    return 0;
}
