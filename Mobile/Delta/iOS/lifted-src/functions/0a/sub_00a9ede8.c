/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa9ede8..0xa9ee5c (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_a9ede8(long long a0)
{
    unsigned long long v3;  // x0
    unsigned long long v4;  // x19
    unsigned int v5;  // w0
    unsigned long long v6;  // x0
    unsigned long long v0;  // [bp-0x28]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = 0;
    v3 = sub_a9f8e8(&v0);
    if (v3 >> 31 & 1)
        return 0xffffffff;
    v4 = v3;
    v5 = sub_9d3fec(a0, v0, v4);
    sub_a6c2e4(v0, "crypto/pem/pvkfmt.c", 630);
    if (v5 == (unsigned int)v4)
        v6 = v4 & 0xffffffff;
    else
        v6 = 0xffffffff;
    return v6;
}
