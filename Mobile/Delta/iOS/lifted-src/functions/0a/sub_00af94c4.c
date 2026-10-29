/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf94c4..0xaf9544 (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_af94c4(unsigned long a0, long long a1, long long a2, long long a3)
{
    unsigned long long v4;  // x0
    unsigned long long v5;  // x0
    unsigned long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = 0;
    v4 = sub_9c0690();
    if (!(v4 >> 31 & 1))
    {
        v0 = *(long long *)(v1 + 8);
        v5 = sub_9c93f4(a1, &v0, v4 & 0xffffffff, a2, a3);
    }
    else
    {
        v5 = 0;
    }
    sub_9ebcf4(v1);
    return v5;
}
