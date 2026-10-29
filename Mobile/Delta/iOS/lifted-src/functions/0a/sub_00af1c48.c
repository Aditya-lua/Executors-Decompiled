/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf1c48..0xaf1d68 (288 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_af1c48(long long a0, unsigned long long a1, unsigned long long a2)
{
    unsigned long long v2;  // x22
    unsigned long long v3;  // w0
    unsigned long long v4;  // x0
    long long v5;  // x21
    long long v6;  // x19
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a0)
    {
        v5 = 786690;
        v6 = 193;
    }
    else if (a1)
    {
        if (a2 >> 2 & 1 && (int)sub_ad69e4(a0) >= 1)
        {
            v2 = 0;
            do
            {
                if (!sub_af1a9c(sub_ad69f8(a0, v2), a1))
                    return 1;
            } while ((v2 = (unsigned int)v2 + 1, (int)v2 < (int)sub_ad69e4(a0)));
        }
        if (a2 >> 3 & 1)
        {
            v3 = (unsigned int)sub_af4154(a1, 0);
            if (v3)
                return v3 > 0;
        }
        if (a2 & 1)
        {
            v4 = sub_af3b1c(a1);
            if (!(unsigned int)v4)
                return v4;
        }
        if (sub_ad64b4(a0, a1, (__ROL__((unsigned int)a2, 31) & 0x80000001 & 1) - 1))
            return 1;
        v5 = 524303;
        if (a2 & 1)
            sub_afc404(a1);
        v6 = 222;
    }
    else
    {
        return 0;
    }
    sub_a368c8();
    sub_a369bc("crypto/x509/x509_cmp.c", v6, "X509_add_cert");
    sub_a36abc(11, v5, 0);
    return 0;
}
