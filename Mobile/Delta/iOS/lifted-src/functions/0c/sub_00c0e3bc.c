/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc0e3bc..0xc0e424 (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long * sub_c0e3bc(unsigned long long *a0)
{
    unsigned long long *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!*a0)
        return a0;
    v2 = a0 + 1;
    if (a0[1])
        v2 = sub_c055f8(v2);
    if (!a0[5])
        return v2;
    return sub_c0461c();
}
