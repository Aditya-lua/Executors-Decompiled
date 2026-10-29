/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf160c..0xaf1728 (284 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int sub_af160c(unsigned long a0, unsigned int a1)
{
    unsigned int v3;  // x21
    unsigned int v4;  // w0
    unsigned int v5;  // x23
    long long *v6;  // x0
    unsigned int v7;  // x2
    long long v8;  // x1
    unsigned long long v0;  // [bp-0x50]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (a0 && a1)
    {
        v3 = *(long long *)a0;
        if (v3)
        {
            v4 = sub_ad69e4(v3);
            v5 = 0;
            do
            {
            } while ((v6 = sub_ad69f8(v3, v5), v5 += 1, sub_a9ae30(*(long long *)sub_ad69f8(v3, v5), *(long long *)a1)));
            if (v5)
            {
                sub_a368c8();
                sub_a369bc("crypto/x509/x509_att.c", 126, "X509at_add1_attr");
                v0 = sub_a9976c(sub_a99eac(*(long long *)a1));
                v7 = (unsigned int)"name=%s";
                v8 = 140;
            }
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/x509/x509_att.c", 122, "X509at_add1_attr");
        v8 = 786690;
        v7 = 0;
    }
    sub_a36abc(11, v8, v7);
    return 0;
}
