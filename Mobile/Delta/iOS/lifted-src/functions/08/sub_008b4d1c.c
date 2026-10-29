/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x8b4d1c..0x8b4d48 (44 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_8b4d1c(unsigned long long *a0)
{
    unsigned long long v0;  // x8
    unsigned long long v1;  // x9

    v0 = a0[2] - a0[1];
    if (a0[2] == a0[1])
        return 0;
    v1 = v0 * 128;
    return (v1 ^ 0xfffffffffffffffe) + v1 + v0 * 64 | 1;
}
