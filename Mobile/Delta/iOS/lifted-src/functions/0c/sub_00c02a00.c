/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc02a00..0xc02acc (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void sub_c02a00(unsigned long long *a0, long long a1)
{
    unsigned long long i;  // x23
    unsigned long long v10;  // x23
    char v0;  // [bp-0x78]
    long long *v1;  // [bp-0x70]
    unsigned long v2;  // [bp-0x68]
    unsigned long v3;  // [bp-0x60]
    unsigned long v4;  // [bp-0x58]
    unsigned long v5;  // [bp-0x50]
    unsigned long long v6;  // [bp-0x48]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v3 = 1;
    v4 = a0[6];
    v5 = a0[4];
    v6 = a0[4] + a0[5] * 64;
    sub_b76920(&v0, &v3);
    for (i = 0; v2 * 8 != i; i = v10)
    {
        sub_c01690(a1, *(long long *)((char *)v1 + i));
        v10 = i + 8;
        sub_c0190c(*(long long *)((char *)v1 + i), a1);
    }
    if (!v0)
        return;
    _free();
    return;
}
