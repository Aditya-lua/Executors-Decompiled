/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa1fa20..0xa1fb10 (240 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_a1fa20(unsigned long a0, long long a1, long long a2, unsigned long a3, int a4, long long a5)
{
    unsigned long v5;  // x25
    unsigned long v6;  // x22
    unsigned long long v7;  // x0
    unsigned long v0;  // [bp-0x68]
    unsigned long v1;  // [bp-0x60]
    unsigned long v2;  // [bp-0x58]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v0 = 0;
    v1 = a3;
    v2 = sub_a1697c();
    if (!v2)
        return 0xffffffff;
    v5 = a4;
    if (sub_a169d8(&v2, &v1, v5))
    {
        v6 = v0;
        if (sub_a03638(v2, &v0) != a4 || _memcmp(a3, v6, v5))
            goto LABEL_a1fad0;
        v7 = sub_a200d4(a1, a2, v2, a5);
        v6 = v0;
    }
    else
    {
        v6 = 0;
LABEL_a1fad0:
        v7 = 0xffffffff;
    }
    sub_a6c2e4(v6, "crypto/ec/ecdsa_ossl.c", 439);
    sub_a16990(v2);
    return v7;
}
