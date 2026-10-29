/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa36720..0xa36768 (72 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a36720(unsigned long long *a0)
{
    unsigned long long v0;  // x8
    unsigned long long v1;  // x9
    unsigned long long v2;  // x10
    unsigned long long v3;  // x8

    v0 = *a0;
    v1 = (v0 * 0x20000000000 | v0 >> 23) & 0xfffffe00000001ff & 0x1ff;
    v2 = 2;
    if (0 > (int)v0)
        v1 = v2;
    v3 = v1 ^ v0;
    return 13 * (v3 - 19 * v3 / 19) ^ v3;
}
