/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbc2fd0..0xbc3024 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long * sub_bc2fd0(unsigned long long *a0)
{
    unsigned long long *v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0;
    if (v2[4])
        v2 = _free(a0[3] - (a0[4] * 8 + 15 & 0xfffffffffffffff8));
    if (!*a0)
        return v2;
    return _free();
}
