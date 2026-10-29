/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaad32c..0xaad4a0 (372 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_aad32c(long long a0, long long *a1)
{
    long long v6;  // x0
    long long v10;  // x20
    long long v11;  // x21
    unsigned long v0;  // [bp-0x48]
    unsigned long v1;  // [bp-0x40]
    char v2;  // [bp-0x38], Other Possible Types: unsigned int
    unsigned int v3;  // [bp-0x34]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v0 = 0;
    v1 = 0;
    if (sub_a99eac(*a1) != 912)
        return 0;
    v6 = sub_aaefc4(a1);
    v3 = 0;
    if (sub_aaf01c(v6, &v0, &v1, &v2, &v3))
    {
        if ((int)v2 < 0)
        {
            v10 = 150;
            v11 = 596;
            goto LABEL_aad404;
        }
        else if (v3 != 1)
        {
            v10 = 139;
            v11 = 604;
LABEL_aad404:
            sub_a368c8();
            sub_a369bc("crypto/rsa/rsa_ameth.c", v11, "rsa_pss_verify_param");
            sub_a36abc(4, v10, 0);
        }
        else if ((int)sub_a50ac8(v0) >= 1)
        {
            sub_af3b3c(a0, sub_9c7b68(v0), 912);
            sub_aadf28(v6);
            return 1;
        }
    }
    sub_aadf28(v6);
    return 0;
}
