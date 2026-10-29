/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa0ad4..0xaa0c5c (392 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_aa0ad4(long long a0, long long a1, long long a2, long long a3, long long a4, unsigned int a5, unsigned long long a6, unsigned long long a7)
{
    unsigned long v5;  // x19
    unsigned int v6;  // w0
    long long v7;  // x1
    unsigned long long v0;  // [bp-0x80]
    unsigned long long v1;  // [bp-0x78]
    unsigned long v2;  // [bp-0x68]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v2 = 0;
    v5 = sub_9cf0ec();
    if (v5)
    {
        v6 = sub_9ccc7c(a4, &v2, a1);
        if (v2)
        {
            v0 = a6;
            v1 = a7;
            if (sub_aa0664(a0, a2, a3))
            {
                if (a5)
                    sub_a66ec0(v2, v6);
                sub_a6c2e4(v2, "crypto/pkcs12/p12_decr.c", 216);
                return v5;
            }
            sub_a368c8();
            sub_a369bc("crypto/pkcs12/p12_decr.c", 210, "PKCS12_item_i2d_encrypt_ex");
            sub_a36abc(35, 103, 0);
            sub_a6c2e4(v2, "crypto/pkcs12/p12_decr.c", 211);
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/pkcs12/p12_decr.c", 205, "PKCS12_item_i2d_encrypt_ex");
            v7 = 0x66;
LABEL_aa0be0:
            sub_a36abc(35, v7, 0);
        }
        sub_9cf0f4(v5);
        return 0;
    }
    sub_a368c8();
    sub_a369bc("crypto/pkcs12/p12_decr.c", 200, "PKCS12_item_i2d_encrypt_ex");
    v7 = 524301;
    goto LABEL_aa0be0;
}
