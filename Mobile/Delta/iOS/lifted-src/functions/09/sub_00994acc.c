/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x994acc..0x994b28 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_994acc(unsigned long a0)
{
    unsigned long v2;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (*(long long *)(a0 + 4128) && sub_a4fdf4(sub_a2d030(*(long long *)(a0 + 4128))) == 2)
        v2 = sub_a50638(*(long long *)(a0 + 4128)) + 13;
    else
        v2 = 13;
    return v2 + *(long long *)(a0 + 4144) + *(long long *)(a0 + 4312);
}
