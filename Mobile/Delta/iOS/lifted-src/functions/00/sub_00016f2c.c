/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x16f2c..0x16f34 (8 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_16f2c(unsigned long long a0, unsigned long long a1)
{
    if (a1 & 63)
        return a0 << (char)(64 - (a1 & 63)) | a0 >> ((char)a1 & 63);
    return a0;
}
