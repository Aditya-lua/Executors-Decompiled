/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xac2c4c..0xac2c58 (12 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

unsigned int * sub_ac2c4c(unsigned int *a0, unsigned long a1)
{
    *a0 = (((((a1 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | a1 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((a1 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | a1 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
    return a0;
}
