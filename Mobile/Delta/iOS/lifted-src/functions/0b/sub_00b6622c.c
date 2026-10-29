/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb6622c..0xb662d8 (172 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_b6622c(unsigned long long *a0)
{
    unsigned long long v2;  // x19
    unsigned long v3;  // x23
    unsigned long long v4;  // x23
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0[1];
    v3 = a0[2] + 1;
    while (1)
    {
        v4 = v3 - 1;
        if (v3 == 1)
            break;
        v2 += 176;
        sub_bffdfc();
        v3 = v4;
    }
    if (!*a0)
        return v2;
    return _free();
}
