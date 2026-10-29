/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x67f40..0x67f54 (20 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_67f40(unsigned long long a0)
{
    if (0 > (int)a0)
        return 2;
    return (a0 * 0x20000000000 | a0 >> 23) & 0xfffffe00000001ff & 0x1ff & 0xffffffff;
}
