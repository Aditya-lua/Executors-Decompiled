/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa09c4..0xaa0ad4 (272 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_aa09c4(unsigned long a0, long long a1, unsigned long a2, unsigned long a3, unsigned long a4, unsigned int a5, unsigned long long a6, unsigned long long a7)
{
    unsigned long v7;  // x20
    unsigned long long v0;  // [bp-0x50]
    unsigned long long v1;  // [bp-0x48]
    unsigned int v2;  // [bp-0x34]
    unsigned long v3;  // [bp-0x30]
    unsigned long v4;  // [bp-0x28]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v4 = 0;
    v2 = 0;
    if (a4)
    {
        v0 = a6;
        v1 = a7;
        if (sub_aa0664())
        {
            v3 = v4;
            v7 = sub_9cae2c(0, &v3, v2, a1);
            if (a5)
                sub_a66ec0(v4, v2);
            if (!v7)
            {
                sub_a368c8();
                sub_a369bc("crypto/pkcs12/p12_decr.c", 0xaa, "PKCS12_item_decrypt_d2i_ex");
                sub_a36abc(35, 101, 0);
            }
            sub_a6c2e4(v4, "crypto/pkcs12/p12_decr.c", 171);
            return v7;
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/pkcs12/p12_decr.c", 151, "PKCS12_item_decrypt_d2i_ex");
        sub_a36abc(35, 0xc0102, 0);
    }
    return 0;
}
