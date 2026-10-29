/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa1508..0xaa15f8 (240 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aa1508_0 {
    char padding_0[8];
    long long field_8;
} st_aa1508_0;


st_aa1508_0 ** sub_aa1508(st_aa1508_0 *a0)
{
    long long v3;  // x0
    st_aa1508_0 **v4;  // x0
    st_aa1508_0 **v5;  // x19
    long long v6;  // x0
    st_aa1508_0 **v7;  // x20
    long long v0;  // [bp-0x28]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = sub_9c9ef4();
    v4 = sub_9c5520(v3, a0->field_8);
    if (v4)
    {
        v5 = v4;
        sub_9cf830(&v0, 0, 0, *v4);
        if (sub_a99eac(v0) == 69)
        {
            v6 = sub_9c9edc();
            v7 = sub_9c5520(v6, *v5->field_8);
            sub_9c9f00(v5);
            return v7;
        }
        sub_a368c8();
        sub_a369bc("crypto/pkcs12/p12_mutl.c", 96, "PBMAC1_get1_pbkdf2_param");
        sub_a36abc(35, 0x80106, 0);
        sub_9c9f00(v5);
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/pkcs12/p12_mutl.c", 90, "PBMAC1_get1_pbkdf2_param");
        sub_a36abc(35, 0x80106, 0);
    }
    return 0;
}
