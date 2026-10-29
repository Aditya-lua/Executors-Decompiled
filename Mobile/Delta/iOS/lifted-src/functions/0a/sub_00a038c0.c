/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa038c0..0xa03a04 (324 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_a038c0(unsigned long a0, long long a1, long long a2, unsigned long a3, int a4, long long a5)
{
    int v5;  // w19
    unsigned long v6;  // x25
    int v7;  // w0
    long long *v8;  // x23
    unsigned long long v9;  // x20
    long long *v0;  // [bp-0x68]
    unsigned long v1;  // [bp-0x60]
    long long *v2;  // [bp-0x58]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v5 = a4;
    v0 = 0;
    v1 = a3;
    v2 = sub_a6bffc(16, "crypto/dsa/dsa_sign.c", 36);
    if (!v2)
        return 0xffffffff;
    v6 = v5;
    if (sub_a03544(&v2, &v1, v6))
    {
        v7 = sub_a03638(v2, &v0);
        v8 = v0;
        if (v7 != v5)
        {
            v9 = 0xffffffff;
            v5 = v7;
        }
        else if (_memcmp(a3, v8, v6))
        {
            v9 = 0xffffffff;
        }
        else
        {
            v9 = sub_a03a04(a1, a2, v2, a5);
            v8 = v0;
        }
    }
    else
    {
        v8 = 0;
        v5 = -0x1;
        v9 = 0xffffffff;
    }
    sub_a6c4e8(v8, v5, "crypto/dsa/dsa_sign.c", 214);
    if (!v2)
        return v9;
    sub_9e4838(*v2);
    sub_9e4838(v2[1]);
    sub_a6c2e4(v2, "crypto/dsa/dsa_sign.c", 47);
    return v9;
}
