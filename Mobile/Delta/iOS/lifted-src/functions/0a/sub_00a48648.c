/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa48648..0xa486c8 (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_a48648(unsigned long a0, unsigned int a1, unsigned long a2, long long a3)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v8;  // x0
    unsigned long long v9;  // x20
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (a1 != 6)
        return 0xffffffff;
    v0 = v5;
    v1 = v6;
    v2 = &v4;
    v3 = v7;
    v8 = sub_a50904();
    if (v8 >> 31 & 1)
        return 0;
    v9 = v8;
    if ((int)sub_aa8634(a3, v9) >= 1)
    {
        sub_9fc200(a3);
        if ((unsigned int)v9 < 16)
            return 1;
        sub_9fc200(a3 + 8);
        if ((unsigned int)v9 >= 24)
            sub_9fc200(a3 + 16);
        return 1;
    }
    return 0;
}
