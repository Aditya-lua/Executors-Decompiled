/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa5f84..0xaa61cc (584 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_aa61cc;
extern long long g_aa6bd0;

char * sub_aa5f84(long long a0, char *a1)
{
    unsigned long long v13;  // x26
    unsigned long long v14;  // x25
    char *v23;  // x19
    char *v24;  // x23
    char *v25;  // x23
    char *v26;  // x23
    char *v27;  // x21
    char *v28;  // x25
    char *v29;  // x25
    char *v30;  // x23
    char *v31;  // w21
    char *v32;  // x23
    unsigned long long v15;  // x24
    char *v33;  // x20
    long long v34;  // x2
    long long v35;  // x1
    unsigned long long v16;  // x23
    unsigned long long v17;  // x22
    unsigned long long v18;  // x21
    unsigned long long v19;  // x20
    unsigned long long v20;  // x19
    unsigned long long v21;  // x30
    char *v22;  // x0
    char *v0;  // [bp-0x60]
    char *v1;  // [bp-0x58]
    unsigned long long v2;  // [bp-0x50]
    unsigned long long v3;  // [bp-0x48]
    unsigned long long v4;  // [bp-0x40]
    unsigned long long v5;  // [bp-0x38]
    unsigned long long v6;  // [bp-0x30]
    unsigned long long v7;  // [bp-0x28]
    unsigned long long v8;  // [bp-0x20]
    unsigned long long v9;  // [bp-0x18]
    char *v10;  // [bp-0x10]
    unsigned long long v11;  // [bp-0x8]
    char v12;  // [bp+0x0]

    if (!a1)
        return 0;
    v2 = v13;
    v3 = v14;
    v4 = v15;
    v5 = v16;
    v6 = v17;
    v7 = v18;
    v8 = v19;
    v9 = v20;
    v10 = &v12;
    v11 = v21;
    v22 = sub_ad6270(&g_aa61cc);
    if (!v22)
        return v22;
    v23 = v22;
    v24 = a1 - 1;
    do
    {
        v25 = v24;
        v26 = v25 + 1;
        v24 = v26;
    } while (sub_a6994c(v25[1], 8));
    v1 = v26;
    if (*v26)
    {
        while (1)
        {
            v27 = sub_a6bf4c(24, "crypto/property/property_parse.c", 361);
            if (!v27)
            {
                sub_a6c2e4(v27, "crypto/property/property_parse.c", 399);
                sub_ad6958(v23, &g_aa6bd0);
                return 0;
            }
            *(unsigned long long *)&v27[16] = 0;
            v27[12] = v27[12] & 254;
            if (!sub_aa61ec(a0, &v1, v27))
            {
                sub_a6c2e4(v27, "crypto/property/property_parse.c", 399);
                sub_ad6958(v23, &g_aa6bd0);
                return 0;
            }
            *(unsigned int *)&v27[8] = 0;
            if (*(int *)v27)
            {
                if (*v1 == 61)
                {
                    do
                    {
                        v28 = v1;
                        v29 = v28 + 1;
                        v1 = v29;
                    } while (sub_a6994c(v28[1], 8));
                    v1 = v29;
                    if (!sub_aa63c0(a0, &v1, v27, 1))
                    {
                        sub_a368c8();
                        sub_a369bc("crypto/property/property_parse.c", 376, "ossl_parse_property");
                        v0 = v26;
                        v34 = "HERE-->%s";
                        v35 = 107;
LABEL_aa6180:
                        sub_a36abc(55, v35, v34);
                        sub_a6c2e4(v27, "crypto/property/property_parse.c", 399);
                        sub_ad6958(v23, &g_aa6bd0);
                        return 0;
                    }
                }
                else
                {
                    *(unsigned int *)&v27[4] = 0;
                    *(unsigned int *)&v27[16] = 1;
                }
                if (!sub_ad68a0(v23, v27))
                {
                    sub_a6c2e4(v27, "crypto/property/property_parse.c", 399);
                    sub_ad6958(v23, &g_aa6bd0);
                    return 0;
                }
                v30 = v1;
                v31 = (char *)*v30;
                if (v31 == 44)
                {
                    do
                    {
                        v32 = v30;
                        v26 = v32 + 1;
                        v30 = v26;
                    } while (sub_a6994c(v32[1], 8));
                    v1 = v26;
                }
                else
                {
                    if (v31)
                    {
                        sub_a368c8();
                        sub_a369bc("crypto/property/property_parse.c", 392, "ossl_parse_property");
                        v0 = v30;
                        sub_a36abc(55, 110, "HERE-->%s");
                        sub_a6c2e4(0, "crypto/property/property_parse.c", 399);
                        sub_ad6958(v23, &g_aa6bd0);
                        return 0;
                    }
                    break;
                }
            }
            else
            {
                sub_a368c8();
                sub_a369bc("crypto/property/property_parse.c", 370, "ossl_parse_property");
                v0 = v26;
                v34 = "Unknown name HERE-->%s";
                v35 = 108;
                goto LABEL_aa6180;
            }
        }
    }
    v33 = sub_aa6a3c(a0, v23);
    sub_a6c2e4(0, "crypto/property/property_parse.c", 399);
    sub_ad6958(v23, &g_aa6bd0);
    return v33;
}
