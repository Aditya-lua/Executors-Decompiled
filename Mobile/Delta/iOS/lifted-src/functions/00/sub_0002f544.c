/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2f544..0x2f558 (20 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_2f544(unsigned long a0)
{
    unsigned long long v0;  // x8

    if (!a0)
        v0 = 64;
    else
        v0 = Clz(a0);
    if (a0)
        return v0 ^ 63;
    return 0;
}
