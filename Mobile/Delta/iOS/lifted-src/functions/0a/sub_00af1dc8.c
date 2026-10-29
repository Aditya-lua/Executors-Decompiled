/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf1dc8..0xaf1e94 (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_af1dc8(unsigned int *a0, long long a1, unsigned long long a2)
{
    unsigned long long v2;  // w0
    unsigned int v3;  // w23
    long long v4;  // x0
    unsigned int v5;  // x0
    unsigned long long v6;  // x0
    unsigned long long v7;  // 4124
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = (unsigned int)sub_ad69e4(a1);
    v3 = v2 - 1;
    if (v2 < 1)
        return 1;
    do
    {
        v4 = sub_ad69f8();
        v5 = *(long long *)a0;
        if (!v5)
        {
            v5 = sub_ad61b4(0);
            *(unsigned long long *)a0 = v5;
            if (!v5)
            {
                sub_a368c8();
                sub_a369bc("crypto/x509/x509_cmp.c", 184, "ossl_x509_add_cert_new");
                sub_a36abc(11, 0x8000f, 0);
                return 0;
            }
        }
        v6 = sub_af1c48(v5, v4, a2);
        if (!(unsigned int)v6)
            return v6;
        v3 -= 1;
        v7 = arm64g_calculate_condition(0x11, v3, 1, 0);
    } while (v7 & 1);
    return 1;
}
