/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xae2644..0xae282c (488 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_aef19c;

long long sub_ae2644(unsigned long a0, unsigned long long *a1, unsigned long a2)
{
    unsigned long v3;  // x0
    unsigned long v4;  // x21
    unsigned long v5;  // x0
    long long v7;  // x1
    unsigned long v8;  // x0
    long long v9;  // x1
    unsigned long v10;  // x0
    unsigned long v11;  // x20
    unsigned long v0;  // [bp-0x38]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = a2;
    if (*a1)
    {
        v3 = sub_aed0ec(0);
        if (v3)
        {
            v4 = v3;
            v5 = "keyid";
            if (!a1[1] && !a1[2])
                v5 = 0;
            if (sub_aeefc4(v5, v4, &v0))
            {
                sub_a6c2e4(v4, "crypto/x509/v3_akid.c", 58);
            }
            else
            {
                sub_a368c8(sub_a6c2e4(v4, "crypto/x509/v3_akid.c", 54), "crypto/x509/v3_akid.c", 54);
                v7 = 55;
                goto LABEL_ae27a4;
            }
            goto LABEL_ae26bc;
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/x509/v3_akid.c", 49, "i2v_AUTHORITY_KEYID");
            sub_a36abc(0x22, 0x8000d, 0);
        }
    }
    else
    {
LABEL_ae26bc:
        if (a1[1])
        {
            v8 = sub_aebc38(0);
            if (v8)
            {
                v0 = v8;
            }
            else
            {
                sub_a368c8();
                v7 = 63;
LABEL_ae27a4:
                sub_a369bc("crypto/x509/v3_akid.c", v7, "i2v_AUTHORITY_KEYID");
                v9 = 524299;
                goto LABEL_ae27e4;
            }
        }
        if (!a1[2])
            return v0;
        v10 = sub_aed0ec(0);
        if (v10)
        {
            v11 = v10;
            if (sub_aeefc4("serial", v11, &v0))
            {
                sub_a6c2e4(v11);
                return v0;
            }
            sub_a6c2e4(v11);
            if (!a2)
                goto LABEL_ae27f0;
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/x509/v3_akid.c", 71, "i2v_AUTHORITY_KEYID");
            v9 = 524301;
LABEL_ae27e4:
            sub_a36abc(0x22, v9, 0);
            if (!a2)
            {
LABEL_ae27f0:
                sub_ad6958(v0, &g_aef19c);
            }
        }
    }
    return 0;
}
