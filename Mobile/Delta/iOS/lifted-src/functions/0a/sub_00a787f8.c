/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa787f8..0xa78844 (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void sub_a787f8(char *a0)
{
    unsigned long long v5;  // x20
    unsigned long long v6;  // x19
    unsigned long long v7;  // x30
    unsigned long long v0;  // [bp-0x20]
    unsigned long long v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    if (*a0 >> 1 & 1)
    {
        v0 = v5;
        v1 = v6;
        v2 = &v4;
        v3 = v7;
        if (!sub_c692a4())
            sub_a79e58(a0);
    }
}
