/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf2f6c..0xaf2fc8 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_af2f6c(void)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_af2fc8())
    {
        sub_a368c8();
        sub_a369bc("crypto/x509/x509_lu.c", 432, "X509_STORE_add_cert");
        sub_a36abc(11, 0x8000b, 0);
        return 0;
    }
    return 1;
}
