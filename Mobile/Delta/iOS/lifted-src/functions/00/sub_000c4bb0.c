/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc4bb0..0xc4c40 (144 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


double sub_c4bb0(unsigned long long *a0, unsigned long long *a1)
{
    unsigned long index;  // x8
    unsigned long idx;  // x9
    unsigned long long v2;  // x10
    unsigned long long v3;  // x11
    unsigned long long v4;  // x10
    unsigned long long v5;  // d0

    index = (char *)&a0[3335] + 4;
    idx = a1 + 0xc00;
    *(int *)(index + 3516) = *(int *)(idx + 2740);
    v2 = a1[1];
    v3 = a1[2];
    a0[3737] = v2;
    a0[3738] = v2;
    v4 = v2 + v3;
    a0[3739] = v4;
    a0[3736] = v4;
    if (!*(int *)(idx + 2744))
    {
        *(unsigned int *)(index + 3316) = 0;
        *(unsigned int *)((char *)&a0[3750] + 4) = 0;
        return v5;
    }
    *a0 = a1 + 3;
    a0[1] = a1 + 773;
    a0[3750] = 4294967297;
    a0[2] = a1 + 516;
    a0[3] = a1 + 1286;
    *(int *)index = *(int *)(idx + 2100);
    *(int *)(index + 4) = *(int *)(idx + 2104);
    *(int *)((char *)&a0[3336] + 4) = *(int *)(idx + 2108);
    return 4294967297;
}
