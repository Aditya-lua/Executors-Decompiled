/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf1458..0xaf1500 (168 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_af1458(unsigned long a0, unsigned long long a1)
{
    unsigned int v2;  // w0
    long long v3;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0)
    {
        v2 = sub_ad69e4();
        sub_a368c8();
        sub_a369bc("crypto/x509/x509_att.c", 63, "X509at_get_attr");
        v3 = 524550;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/x509/x509_att.c", 59, "X509at_get_attr");
        v3 = 786690;
    }
    sub_a36abc(11, v3, 0);
    return 0;
}
