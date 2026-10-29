/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc04ea8..0xc04f70 (200 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_c04ea8(unsigned long long *a0)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x22
    unsigned long long v4;  // x22
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0[1];
    v3 = 1 + 3353953467947191203 * (a0[3] - a0[1] >> 4);
    while (1)
    {
        v4 = v3 - 1;
        if (v3 == 1)
            break;
        v2 += 176;
        sub_b66864();
        v3 = v4;
    }
    if (!a0[2])
        return v2;
    return _free();
}
