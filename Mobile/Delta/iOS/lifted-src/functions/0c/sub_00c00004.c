/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc00004..0xc00070 (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_c00004(unsigned long long a0, unsigned long long a1)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x21
    unsigned long long v4;  // x21
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0 + 8;
    v3 = a1 + 1;
    while (1)
    {
        v4 = v3 - 1;
        if (v3 == 1)
            break;
        v2 += 40;
        sub_bfdf4c();
        v3 = v4;
    }
    return v2;
}
