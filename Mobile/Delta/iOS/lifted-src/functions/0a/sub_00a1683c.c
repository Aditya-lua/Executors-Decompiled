/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa1683c..0xa1697c (320 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a1683c_0 {
    struct st_a1683c_0 *field_0;
    char padding_8[16];
    long long field_18;
    struct st_a1683c_0 *field_20;
    char padding_28[12];
    unsigned int field_34;
} st_a1683c_0;


st_a1683c_0 * sub_a1683c(st_a1683c_0 *a0, st_a1683c_0 *a1)
{
    st_a1683c_0 *v2;  // x20
    st_a1683c_0 *v3;  // x21
    st_a1683c_0 *v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0 && a0->field_20)
    {
        v2 = sub_a1d9f8(a0->field_18);
        if (!a1)
        {
            return v2;
        }
        else if (v2)
        {
            v3 = a1->field_0;
            if (v3 || (v4 = sub_a6bf4c(v2, "crypto/ec/ec_asn1.c", 1160), a1->field_0 = v4, v4))
            {
                if (sub_a1d9f8(a0->field_18, a0->field_20, a0->field_34))
                {
                    if (!v3)
                        return v2;
                    a1->field_0 = a1->field_0 + v2;
                    return v2;
                }
                else
                {
                    sub_a368c8();
                    sub_a369bc("crypto/ec/ec_asn1.c", 1166, "i2o_ECPublicKey");
                    sub_a36abc(16, 0x80010, 0);
                    if (!v3)
                    {
                        sub_a6c2e4(a1->field_0, "crypto/ec/ec_asn1.c", 1168);
                        a1->field_0 = 0;
                        return 0;
                    }
                }
            }
        }
        else
        {
            return v2;
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/ec/ec_asn1.c", 1148, "i2o_ECPublicKey");
        sub_a36abc(16, 0xc0102, 0);
    }
    return 0;
}
