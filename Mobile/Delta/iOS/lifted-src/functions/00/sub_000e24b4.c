/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xe24b4..0xe2504 (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

unsigned long long sub_e24b4(unsigned long a0, unsigned long long a1)
{
    if (184467440737095516 >= a1)
        return ((a1 * 20 | a1 * 5 >> 62) & 0x3ffffffffffffffc & 0x3fffffffffffffff) / 25;
    return (a1 >> 2) / 25 * 80;
}
