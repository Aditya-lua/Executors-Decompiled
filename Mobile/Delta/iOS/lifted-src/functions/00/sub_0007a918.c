/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7a918..0x7a930 (24 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_7a918(unsigned int a0)
{
    unsigned int v0;  // w8

    if (!(a0 * 0x100000000))
        v0 = 32;
    else
        v0 = Clz(a0 * 0x100000000);
    if (a0 >= 165)
        return 189 - v0;
    return a0;
}
