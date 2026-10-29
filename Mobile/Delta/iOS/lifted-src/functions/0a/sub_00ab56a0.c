/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xab56a0..0xab5744 (164 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_ab56a0(unsigned short *a0, unsigned int a1, long long a2, unsigned int a3)
{
    unsigned short *v2;  // x0
    unsigned long n;  // x20
    long long *v4;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if ((int)a3 <= (int)(a1 - 11))
    {
        *a0 = 0x100;
        v2 = a0 + 1;
        n = a1 - a3 - 3;
        _memset(v2, 0xff, n);
        v4 = (char *)v2 + n;
        *(char *)v4 = 0;
        _memcpy((char *)v4 + 1, a2, a3);
        return 1;
    }
    sub_a368c8();
    sub_a369bc("crypto/rsa/rsa_pk1.c", 38, "RSA_padding_add_PKCS1_type_1");
    sub_a36abc(4, 110, 0);
    return 0;
}
