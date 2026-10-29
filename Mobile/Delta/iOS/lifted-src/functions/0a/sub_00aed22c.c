/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaed22c..0xaed2c0 (148 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aed22c_0 {
    unsigned int field_0;
    char padding_4[4];
    struct st_aed22c_0 *field_8;
} st_aed22c_0;


st_aed22c_0 * sub_aed22c(unsigned long a0, unsigned long a1, long long a2)
{
    st_aed22c_0 *v3;  // x0
    st_aed22c_0 *v4;  // x8
    st_aed22c_0 *v5;  // x0
    char v0;  // [bp-0x28], Other Possible Types: unsigned long long
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = sub_9cf0ec();
    if (v3)
    {
        v4 = sub_a6df78(a2, &v0);
        v5 = v3;
        v5->field_8 = v4;
        if (v4)
        {
            v5->field_0 = v0;
            return v5;
        }
        sub_9cf0f4(v5);
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/x509/v3_skid.c", 40, "s2i_ASN1_OCTET_STRING");
        sub_a36abc(0x22, 0x8000d, 0);
    }
    return 0;
}
