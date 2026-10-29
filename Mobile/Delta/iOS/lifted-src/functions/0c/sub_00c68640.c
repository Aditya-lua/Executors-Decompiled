/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc68640..0xc68684 (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_c68640(unsigned long a0, unsigned long long a1)
{
    unsigned long long v2;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!(a1 >> 31 & 1))
    {
        if (30 >= (unsigned int)a1)
        {
            v2 = sub_a69c94();
            if (!(unsigned int)v2)
                return v2;
        }
        else
        {
            return 0;
        }
    }
    return sub_a69c94() != 0;
}
