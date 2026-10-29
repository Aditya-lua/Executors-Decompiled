/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc4d20..0xc4d68 (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_c4d20(long long a0, long long a1)
{
    unsigned long long v5;  // x30
    long long v6;  // x0
    long long v7;  // x8
    char v0;  // [bp-0x40]
    unsigned int v1;  // [bp-0x2c]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v2 = &v4;
    v3 = v5;
    v6 = sub_c52e8(&v0, a0, a1, 0);
    if (v1 == 1)
        v7 = 0;
    else
        v7 = v0;
    if (v6)
        return -0x2;
    return v7;
}
