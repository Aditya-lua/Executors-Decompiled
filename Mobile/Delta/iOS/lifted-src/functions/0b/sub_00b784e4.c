/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb784e4..0xb7854c (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_b784e4(unsigned long long a0, unsigned long long a1)
{
    unsigned long long v2;  // x21
    unsigned long long v3;  // x21
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a1 + 1;
    while (1)
    {
        v3 = v2 - 1;
        if (v2 == 1)
            break;
        a0 += 64;
        sub_b728e8();
        v2 = v3;
    }
    return a0;
}
