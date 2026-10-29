/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x95479c..0x9547f0 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_95479c(unsigned long a0, long long a1, int a2)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v8;  // x0
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (a2 == 0x101)
        return 1;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    v8 = sub_c68d5c(a1, a2, 1);
    if (!(unsigned int)v8)
        return v8;
    return sub_c6876c(a1, 3) != 0;
}
