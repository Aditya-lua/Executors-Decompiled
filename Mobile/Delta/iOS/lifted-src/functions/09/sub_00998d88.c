/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x998d88..0x998dd4 (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_998d88(unsigned long long *a0)
{
    unsigned long long v0;  // x10
    unsigned long long v1;  // x9
    unsigned long long v2;  // x0
    unsigned long long *v3;  // x8
    unsigned long long v4;  // x9
    unsigned long long *v5;  // x8

    v0 = a0[507];
    v1 = a0[506] - v0;
    if (a0[506] <= v0)
        return 0;
    v2 = 0;
    v3 = &a0[9 * v0 + 219];
    do
    {
        v4 = v1;
    } while (*(int *)((char *)v3 - 4) == 23 && (v5 = v3 + 9, v2 += *v3, v1 = v4 - 1, v3 += 9, v4 != 1));
    return v2;
}
