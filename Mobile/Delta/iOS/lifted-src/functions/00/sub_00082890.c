/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x82890..0x828cc (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_82890(unsigned long long a0)
{
    unsigned long long v0;  // x9

    if (0xff00ff00ff00feff < a0)
        return 0xffffffffffffffb8;
    v0 = 0x20000 - a0 >> 11;
    if (a0 >= 0x20000)
        v0 = 0;
    if (!(a0 + (a0 >> 8) + v0))
        return 0xffffffffffffffb8;
    return a0 + (a0 >> 8) + v0;
}
