/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9cf950..0x9cf9b4 (100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long * sub_9cf950(long long *a0)
{
    unsigned long long v3;  // x30
    long long *v4;  // x0
    char *v0;  // [bp-0x10]
    unsigned long long v1;  // [bp-0x8]
    char v2;  // [bp+0x0]

    if (a0)
    {
        v0 = &v2;
        v1 = v3;
        v4 = sub_a58d60(sub_a9976c(sub_a99eac(*a0)));
        if (!v4)
        {
            sub_a368c8();
            sub_a369bc("crypto/asn1/x_algor.c", 165, "ossl_x509_algor_get_md");
            sub_a36abc(13, 229, 0);
            return 0;
        }
        return (unsigned int)v4;
    }
}
