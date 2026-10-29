/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d02f0..0x9d03c8 (216 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9d02f0_0 {
    char padding_0[8];
    struct st_9d02f0_0 *field_8;
    struct st_9d02f0_0 *field_10;
    long long field_18;
    char padding_20[8];
    long long field_28;
    struct st_9d02f0_0 *field_30;
} st_9d02f0_0;


st_9d02f0_0 * sub_9d02f0(void)
{
    st_9d02f0_0 *v2;  // x19
    st_9d02f0_0 *v3;  // x20
    st_9d02f0_0 *v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_a6bffc(80, "crypto/asn1/x_pkey.c", 20);
    if (!v2)
        return v2;
    v3 = sub_9cf6bc();
    v2->field_8 = v3;
    v4 = sub_9cf0ec(v3);
    v2->field_10 = v4;
    if (v3 && v4)
        return v2;
    sub_9cf6c8(v3);
    sub_9cf0f4(v4);
    sub_a5a4c8(v2->field_18);
    if ((int)v2->field_30)
        sub_a6c2e4(v2->field_28, "crypto/asn1/x_pkey.c", 44);
    sub_a368c8(sub_a6c2e4(v2, "crypto/asn1/x_pkey.c", 45), "crypto/asn1/x_pkey.c", 45);
    sub_a369bc("crypto/asn1/x_pkey.c", 28, "X509_PKEY_new");
    sub_a36abc(13, 0x8000d, 0);
    return 0;
}
