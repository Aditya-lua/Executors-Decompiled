/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaed2c0..0xaed400 (320 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

long long sub_aed2c0(long long a0)
{
    long long v9;  // x0
    long long v10;  // x19
    long long v11;  // x0
    long long v0;  // [bp-0x98]
    long long v1;  // [bp-0x90]
    unsigned int v2;  // [bp-0x88]
    int v3;  // [bp-0x84]
    long long v4;  // [bp-0x80]
    char v5;  // [bp-0x78]
    unsigned long v6;  // [bp-0x38]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v6 = *(long long *)&g_10002b0;
    if (!a0)
    {
        sub_a368c8();
        sub_a369bc("crypto/x509/v3_skid.c", 66, "ossl_x509_pubkey_hash");
        sub_a36abc(0x22, 114, 0);
    }
    else if (sub_afbf48(&v0, &v1, a0))
    {
        v9 = sub_a40ca8(v0, "SHA1", v1);
        if (v9)
        {
            v10 = v9;
            v11 = sub_9cf0ec();
            if (v11)
            {
                v9 = v11;
                sub_afbf08(0, &v4, &v3, 0, a0);
                if (sub_a40abc(v4, v3, &v5, &v2, v10, 0) && sub_9c026c(v9, &v5, v2))
                {
                    sub_a3f52c(v10);
                    if (*(long long *)&g_10002b0 == v6)
                        return v9;
                    ___stack_chk_fail();
                }
                sub_a3f52c(v10);
                sub_9cf0f4(v9);
            }
            else
            {
                sub_a3f52c(v10);
            }
        }
        else
        {
            if (*(long long *)&g_10002b0 == v6)
                return v9;
            ___stack_chk_fail();
        }
    }
    if (*(long long *)&g_10002b0 == v6)
        return 0;
    ___stack_chk_fail();
}
