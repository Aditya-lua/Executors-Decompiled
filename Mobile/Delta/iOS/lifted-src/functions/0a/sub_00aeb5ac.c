/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaeb5ac..0xaeb62c (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int sub_aeb5ac(unsigned long a0, void* a1, unsigned int a2)
{
    unsigned long v0;  // x8

    v0 = (int)a1[232];
    if (v0 >> 2 & 1 && !((char)a1[240] & 0x11111111))
        return 0;
    if (a2)
    {
        if (v0 >> 1 & 1 && !((char)((char)a1[236]) >> 2 & 1))
            return 0;
        if (!(v0 & 1))
        {
            if (!(~(unsigned int)v0 & 8256))
            {
                return 1;
            }
            else if (v0 >> 1 & 1)
            {
                return 1;
            }
            else if (!(v0 >> 3 & 1))
            {
                return 0;
            }
            else if ((int)a1[244] & 7)
            {
                return __ROL__((int)a1[244], 30) & 0xc0000001 & 1;
            }
            else
            {
                return 0;
            }
        }
        else
        {
            if (!(v0 >> 4 & 1))
                return 0;
        }
    }
    else
    {
        if (v0 >> 3 & 1 && !((char)((char)a1[244]) >> 6 & 1))
            return 0;
        if (v0 >> 1 & 1 && !((char)((char)a1[236]) >> 5 & 1))
            return 0;
    }
    return 1;
}
