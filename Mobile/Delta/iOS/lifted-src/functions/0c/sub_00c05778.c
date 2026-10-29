/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc05778..0xc05840 (200 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_c05778(unsigned long long *a0)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x22
    unsigned long long v4;  // x22
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0[1];
    v3 = 1 + 1117984489315730401 * (a0[3] - a0[1] >> 3);
    while (1)
    {
        v4 = v3 - 1;
        if (v3 == 1)
            break;
        v2 += 264;
        sub_c04758();
        v3 = v4;
    }
    if (!a0[2])
        return v2;
    return _free();
}
