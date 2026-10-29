/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbe660c..0xbe66c0 (180 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_be660c(unsigned long long *a0)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x22
    unsigned long long v4;  // x22
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0[1];
    v3 = (a0[3] - a0[1] >> 6) + 1;
    while (1)
    {
        v4 = v3 - 1;
        if (v3 == 1)
            break;
        v2 += 64;
        sub_be6008();
        v3 = v4;
    }
    if (!a0[2])
        return v2;
    return _free();
}
