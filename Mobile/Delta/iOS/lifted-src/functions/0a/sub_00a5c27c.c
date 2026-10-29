/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa5c27c..0xa5c2c0 (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_a5c27c(unsigned long long a0, unsigned int *a1)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v8;  // x0
    unsigned long long v9;  // x0
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (*a1)
        return a0;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    v8 = sub_a998f4();
    *a1 = v8;
    if ((unsigned int)v8)
        return v8;
    v9 = sub_a99a1c(a0);
    *a1 = v9;
    return v9;
}
