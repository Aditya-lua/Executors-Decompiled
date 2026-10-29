/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf2b00..0xaf2c74 (372 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_af2b00_0 {
    char padding_0[16];
    long long field_10;
} st_af2b00_0;

typedef struct st_af2b00_1 {
    struct st_af2b00_1 *field_0;
    struct st_af2b00_1 *field_8;
    struct st_af2b00_1 *field_10;
    struct st_af2b00_0 *field_18;
} st_af2b00_1;


st_af2b00_1 * sub_af2b00(st_af2b00_0 *a0, st_af2b00_1 *a1)
{
    long long v2;  // x21
    st_af2b00_1 *v3;  // x22
    st_af2b00_1 *v4;  // x0
    st_af2b00_1 *v5;  // x0
    st_af2b00_1 *v6;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_10;
    if ((int)sub_ad69e4(v2) >= 1)
    {
        v3 = 0;
        do
        {
            v4 = sub_ad69f8(v2, v3);
            if (v4->field_8 == a1)
                return v4;
        } while ((v3 = (unsigned int)v3 + 1, (int)(unsigned int)v3 < (int)sub_ad69e4(v2)));
    }
    v5 = sub_a6bffc(32, "crypto/x509/x509_lu.c", 20);
    if (v5)
    {
        v5->field_8 = a1;
        if (a1->field_8)
            a1->field_8();
        v5->field_18 = a0;
        v6 = v5;
        if (sub_ad68a0(a0->field_10, v6))
            return v6;
        sub_a368c8();
        sub_a369bc("crypto/x509/x509_lu.c", 292, "X509_STORE_add_lookup");
        sub_a36abc(11, 0x8000f, 0);
        if (v6->field_8 && v6->field_8->field_10)
            v6->field_8->field_10();
        sub_a6c2e4(v6, "crypto/x509/x509_lu.c", 39);
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/x509/x509_lu.c", 284, "X509_STORE_add_lookup");
        sub_a36abc(11, 0x8000b, 0);
    }
    return 0;
}
