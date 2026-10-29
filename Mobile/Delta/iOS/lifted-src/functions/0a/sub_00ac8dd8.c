/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xac8dd8..0xac8f78 (416 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_ac8dd8(long long a0, long long a1, unsigned long a2, int a3, long long a4)
{
    unsigned long v5;  // x24
    unsigned long v6;  // x20
    unsigned long long v7;  // x0
    long long v8;  // x1
    long long v9;  // x1
    unsigned long v0;  // [bp-0x58]
    unsigned long v1;  // [bp-0x50]
    unsigned long v2;  // [bp-0x48]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v0 = 0;
    v1 = a2;
    v2 = sub_a1697c();
    if (!v2)
    {
        sub_a368c8();
        sub_a369bc("crypto/sm2/sm2_sign.c", 516, "ossl_sm2_internal_verify");
        v9 = 524330;
        goto LABEL_ac8ec4;
    }
    v5 = a3;
    if (!sub_a169d8(&v2, &v1, v5))
    {
        sub_a368c8();
        v8 = 520;
        goto LABEL_ac8eb8;
    }
    if (sub_a03638(v2, &v0) != a3 || _memcmp(a2, v0, v5))
    {
        sub_a368c8();
        v8 = 526;
LABEL_ac8eb8:
        sub_a369bc("crypto/sm2/sm2_sign.c", v8, "ossl_sm2_internal_verify");
        v9 = 104;
LABEL_ac8ec4:
        sub_a36abc(53, v9, 0);
        v6 = 0;
        goto LABEL_ac8ed0;
    }
    else
    {
        v6 = sub_9e4db0(a0, a1, 0);
        if (v6)
        {
            v7 = sub_ac8958(a4, v2, v6);
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/sm2/sm2_sign.c", 532, "ossl_sm2_internal_verify");
            sub_a36abc(53, 0x80003, 0);
LABEL_ac8ed0:
            v7 = 0xffffffff;
        }
    }
    sub_a6c2e4(v0, "crypto/sm2/sm2_sign.c", 539);
    sub_9e48d4(v6);
    sub_a16990(v2);
    return v7;
}
