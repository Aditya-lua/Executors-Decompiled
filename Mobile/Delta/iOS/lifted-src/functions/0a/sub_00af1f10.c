/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf1f10..0xaf1ff4 (228 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_af1f10(unsigned long a0)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // 4112
    unsigned long long v4;  // 4112
    long long v5;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0)
    {
        v2 = sub_a5a588();
        if (v2 >> 31 & 1)
        {
            v3 = arm64g_calculate_condition(1, v2 & 0xffffffff, 2, 0);
            if (!(v3 & 1))
            {
                v4 = arm64g_calculate_condition(0x11, v2 & 0xffffffff, 1, 0);
                if (v4 & 1)
                    return 0;
                sub_a368c8();
                sub_a369bc("crypto/x509/x509_cmp.c", 416, "ossl_x509_check_private_key");
                v5 = 115;
            }
            else
            {
                sub_a368c8();
                sub_a369bc("crypto/x509/x509_cmp.c", 419, "ossl_x509_check_private_key");
                v5 = 117;
            }
        }
        else if ((unsigned int)v2 == 1)
        {
            return (unsigned int)v2;
        }
        else if (!(unsigned int)v2)
        {
            sub_a368c8();
            sub_a369bc("crypto/x509/x509_cmp.c", 413, "ossl_x509_check_private_key");
            v5 = 116;
        }
        else
        {
            return 0;
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/x509/x509_cmp.c", 406, "ossl_x509_check_private_key");
        v5 = 786690;
    }
    sub_a36abc(11, v5, 0);
    return 0;
}
