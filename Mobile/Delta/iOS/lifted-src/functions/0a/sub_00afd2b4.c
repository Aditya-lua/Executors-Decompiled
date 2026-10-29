/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xafd2b4..0xafd31c (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_dfdd28;

unsigned long long sub_afd2b4(long long a0, long long a1, unsigned long a2, unsigned int a3)
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

    if (a3 != 1143)
        return 0;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    v8 = sub_c68640();
    if (!(unsigned int)v8)
        return v8;
    v9 = sub_c68354(a0, 0xffffffff, &g_dfdd28, 10);
    if (!(unsigned int)v9)
        return v9;
    return sub_a69b58(a0, a1) != 0;
}
