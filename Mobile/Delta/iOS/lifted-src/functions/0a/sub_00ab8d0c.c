/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xab8d0c..0xab8e28 (284 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_ab8d0c(unsigned long a0, unsigned long long a1, unsigned int a2, long long a3, unsigned int *a4, long long a5)
{
    unsigned long long v6;  // x24
    unsigned int v7;  // w0
    unsigned long v8;  // x22
    unsigned long v9;  // x0
    unsigned long v10;  // x23
    unsigned int v11;  // w0
    unsigned long v12;  // x19
    unsigned long v0;  // [bp-0x60]
    unsigned int v1;  // [bp-0x58]
    long long v2;  // [bp-0x54]
    unsigned long long v3;  // [bp-0x50]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = a2;
    v2 = 4;
    v3 = a1;
    v6 = sub_9cf0e0(&v1, 0);
    v7 = sub_aafbcc(a5);
    if ((int)v6 > (int)(v7 - 11))
    {
        sub_a368c8();
        sub_a369bc("crypto/rsa/rsa_saos.c", 39, "RSA_sign_ASN1_OCTET_STRING");
        sub_a36abc(4, 112, 0);
        return 0;
    }
    v8 = v7 + 1;
    v9 = sub_a6bf4c(v8, "crypto/rsa/rsa_saos.c", 42);
    if (!v9)
        return v9;
    v10 = v9;
    v0 = v9;
    sub_9cf0e0(&v1, &v0);
    v11 = sub_aafc00(v6, v10, a3, a5, 1);
    if ((int)v11 >= 1)
    {
        *a4 = v11;
        v12 = 1;
    }
    else
    {
        v12 = 0;
    }
    sub_a6c4e8(v10, v8, "crypto/rsa/rsa_saos.c", 53);
    return v12;
}
