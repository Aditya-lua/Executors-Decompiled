/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc53eb0..0xc53f50 (160 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_c53eb0(long long *a0)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (*a0)
        _free(a0[1]);
    if (a0[3] != -0x8000000000000000)
    {
        if (a0[3])
            _free(a0[4]);
        if (a0[6])
            _free(a0[7]);
    }
    v2 = sub_c54038(a0[11], a0[12]);
    if (!a0[12])
        return v2;
    return _free();
}
