/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf4e7c..0xaf4f9c (288 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_af4e7c(unsigned long long a0, long long a1)
{
    unsigned long long v2;  // x21
    unsigned long long v3;  // x0
    unsigned long v4;  // x21
    unsigned long long v5;  // w0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0 && !sub_a5a164(a0))
        return 1;
    if ((int)sub_ad69e4(a1) >= 1)
    {
        v2 = 0;
        do
        {
            v3 = sub_af1e94(sub_ad69f8(a1, v2), v2);
            if (!v3)
            {
                sub_a368c8();
                sub_a369bc("crypto/x509/x509_vfy.c", 2156, "X509_get_pubkey_parameters");
                sub_a36abc(11, 108, 0);
                return 0;
            }
            if (!sub_a5a164())
            {
                while (1)
                {
                    v4 = (unsigned int)v2 - 1;
                    if (1 > (int)v2)
                        break;
                    v5 = (unsigned int)sub_a59d8c(sub_af1e94(sub_ad69f8(a1, v4), v4), v3);
                    v2 = v4;
                    if (!v5)
                        return v5;
                }
                if (!a0)
                    return 1;
                return (unsigned int)sub_a59d8c();
            }
            v2 = (unsigned int)v2 + 1;
        } while ((int)v2 < (int)sub_ad69e4(a1));
    }
    sub_a368c8();
    sub_a369bc("crypto/x509/x509_vfy.c", 2164, "X509_get_pubkey_parameters");
    sub_a36abc(11, 107, 0);
    return 0;
}
