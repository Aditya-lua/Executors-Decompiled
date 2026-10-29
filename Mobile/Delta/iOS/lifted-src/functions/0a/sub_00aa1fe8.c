/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa1fe8..0xaa2188 (416 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_aa1fe8(long long a0, long long a1, long long a2, long long a3, long long a4, long long a5, long long a6, long long a7, unsigned long a8, long long a9)
{
    long long v1;  // x25
    long long v2;  // x23
    long long v3;  // x24
    long long v4;  // x27
    unsigned long long v5;  // 4195
    long long v6;  // x26
    long long v7;  // x1
    long long v8;  // x0
    long long v9;  // x0
    long long v10;  // x1
    char *v0;  // [bp-0x10]

    v0 = &a8;
    v1 = a6;
    v2 = a5;
    v3 = a4;
    v4 = a1;
    v5 = arm64g_calculate_condition(1, a0 & 0xffffffff, 1, 0);
    if (v5 & 1)
    {
        if (v4)
        {
            v6 = 0xffffffff;
            goto LABEL_aa2090;
        }
        else
        {
            sub_a368c8();
            v7 = 27;
            goto LABEL_aa2150;
        }
    }
    v6 = a0;
    sub_a36c8c();
    if (sub_a513e8(1, v6, 0, 0, 0))
    {
        sub_a36e70();
        if (v4)
        {
LABEL_aa2090:
            v8 = sub_9c9f0c(v4, v1, v3, v2, 0, v6, a8);
            if (v8)
                goto LABEL_aa20a0;
LABEL_aa20f0:
            sub_a368c8();
            sub_a369bc("crypto/pkcs12/p12_p8e.c", 48, "PKCS8_encrypt_ex");
            v10 = 524301;
        }
        else
        {
            sub_a368c8();
            v7 = 37;
LABEL_aa2150:
            sub_a369bc("crypto/pkcs12/p12_p8e.c", v7, "PKCS8_encrypt_ex");
            v10 = 786690;
        }
        sub_a36abc(35, v10, 0);
        return 0;
    }
    sub_a36cd4();
    v8 = sub_9c9e18(v6, v1, v3, v2, a8);
    if (v8)
    {
LABEL_aa20a0:
        v9 = sub_aa2188(a2, a3, a7, v8, a8, a9);
        if (v9)
            return v9;
        sub_9cf6c8(v8);
        return 0;
    }
    goto LABEL_aa20f0;
}
