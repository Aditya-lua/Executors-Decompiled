/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x20b7c..0x20b98 (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_20b7c(unsigned int *a0)
{
    unsigned int v0;  // w8
    unsigned long v1;  // x8

    v0 = *a0 - 270;
    if (v0 < 8)
        v1 = v0;
    else
        v1 = 0;
    return v1 | (8 > v0) * 0x100000000;
}
