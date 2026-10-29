/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3d66bc..0x3d66d0 (20 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_3d66bc(unsigned int a0)
{
    if (a0 > 0xff)
        return (char)~((int)(a0) >> 31);
    return (char)a0;
}
