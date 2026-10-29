/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xadcf50..0xadd110 (448 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_adcf50_0 {
    char padding_0[24];
    long long field_18;
} st_adcf50_0;

extern long long g_9cfddc;

unsigned long long sub_adcf50(st_adcf50_0 *a0, long long a1, int a2, unsigned long a3, unsigned long a4)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x19
    unsigned long long v4;  // x21
    unsigned long long v5;  // x22
    unsigned long long *v6;  // x0
    long long v7;  // x1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a2 == 1)
    {
        v2 = sub_9d8180(a1, "r");
        if (v2)
        {
            v3 = sub_a9b94c();
            sub_9d3c28(v2);
            if (v3)
            {
                if ((int)sub_ad69e4(v3) >= 1)
                {
                    v4 = 0;
                    v5 = 0;
                    do
                    {
                        v6 = sub_ad69f8(v3, v5);
                        if (*v6)
                        {
                            if (sub_af2f6c(a0->field_18))
                            {
                                v4 = (unsigned int)v4 + 1;
                            }
                            else
                            {
                                sub_ad6958(v3, &g_9cfddc);
                                return 0;
                            }
                        }
                        if (v6[1])
                        {
                            if (sub_af311c(a0->field_18))
                            {
                                v4 = (unsigned int)v4 + 1;
                            }
                            else
                            {
                                sub_ad6958(v3, &g_9cfddc);
                                return 0;
                            }
                        }
                        v5 = (unsigned int)v5 + 1;
                    } while ((int)sub_ad69e4(v3) > (int)v5);
                    if ((unsigned int)v4)
                    {
                        sub_ad6958(v3, &g_9cfddc);
                        return v4;
                    }
                }
                sub_a368c8();
                sub_a369bc("crypto/x509/by_file.c", 275, "X509_load_cert_crl_file_ex");
                sub_a36abc(11, 0x88, 0);
                sub_ad6958(v3, &g_9cfddc);
                return 0;
            }
            sub_a368c8();
            sub_a369bc("crypto/x509/by_file.c", 254, "X509_load_cert_crl_file_ex");
            v7 = 524297;
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/x509/by_file.c", 248, "X509_load_cert_crl_file_ex");
            v7 = 524320;
        }
        sub_a36abc(11, v7, 0);
        return 0;
    }
}
