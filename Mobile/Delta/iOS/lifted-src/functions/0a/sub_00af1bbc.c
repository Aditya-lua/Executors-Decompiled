/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf1bbc..0xaf1c48 (140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_af1bbc(long long *a0, unsigned long a1, unsigned long a2)
{
    long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!*a0)
    {
        v2 = sub_ad61b4(0);
        *a0 = v2;
        if (!v2)
        {
            sub_a368c8();
            sub_a369bc("crypto/x509/x509_cmp.c", 184, "ossl_x509_add_cert_new");
            sub_a36abc(11, 0x8000f, 0);
            return 0;
        }
    }
}
