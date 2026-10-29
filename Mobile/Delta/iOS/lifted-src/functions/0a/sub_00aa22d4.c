/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa22d4..0xaa231c (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int sub_aa22d4(long long *a0)
{
    unsigned long long v2;  // 4118
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = arm64g_calculate_condition(33, sub_a99eac(*a0) - 155, 3, 0);
    if (v2 & 1)
        return sub_a99eac();
    return 0xffffffff;
}
