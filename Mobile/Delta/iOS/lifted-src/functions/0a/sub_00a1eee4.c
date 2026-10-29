/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa1eee4..0xa1f024 (320 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a1eee4(long long a0, long long a1, unsigned long a2, unsigned int *a3, long long a4, long long a5, unsigned long a6, long long a7)
{
    unsigned long v5;  // x0
    unsigned long v6;  // x0
    unsigned long v7;  // x19
    long long v8;  // x1
    unsigned long v0;  // [bp-0x58]
    unsigned long v1;  // [bp-0x50]
    unsigned long v2;  // [bp-0x48]
    char *v3;  // [bp-0x10]
    long long v4;  // [bp+0x0]

    v3 = &v4;
    v1 = 0;
    v2 = a2;
    v0 = 0;
    if (a2)
    {
        if (a6)
        {
            *a3 = 0;
            v5 = sub_a1f024(a4, 0, &v1, &v0, a0, a1, a5, a6, a7, v4);
            if (!(unsigned int)v5)
                return v5;
            v6 = sub_a1ffd8(a0, a1, v1, v0, a4);
            if (v6)
            {
                *a3 = sub_a03638();
                sub_a16990(v6);
                v7 = 1;
            }
            else
            {
                v7 = 0;
            }
            sub_9e4838(v1);
            sub_9e4838(v0);
            return v7;
        }
        sub_a368c8();
        sub_a369bc("crypto/ec/ecdsa_ossl.c", 110, "ossl_ecdsa_deterministic_sign");
        v8 = 151;
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/ec/ecdsa_ossl.c", 106, "ossl_ecdsa_deterministic_sign");
        v8 = 786690;
    }
    sub_a36abc(16, v8, 0);
    return 0;
}
