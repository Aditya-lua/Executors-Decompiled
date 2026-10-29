/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf5df4..0xaf5e78 (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_af5df4(unsigned long a0, long long a1)
{
    long long v0;  // [bp-0x30]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (!sub_af8b00(a1))
    {
        sub_a368c8();
        sub_a369bc("crypto/x509/x509_vfy.c", 2838, "X509_STORE_CTX_set_default");
        v0 = a1;
        sub_a36abc(11, 121, "name=%s");
        return 0;
    }
}
