/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf1d68..0xaf1dc8 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_af1d68(unsigned long a0)
{
    unsigned long v0;  // [bp-0x18]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = a0;
    if (!a0)
    {
        sub_a368c8();
        sub_a369bc("crypto/x509/x509_cmp.c", 232, "X509_add_certs");
        sub_a36abc(11, 0xc0102, 0);
        return 0;
    }
    return sub_af1dc8(&v0);
}
