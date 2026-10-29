/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaeb4a4..0xaeb524 (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_aeb4a4(unsigned long a0, void* a1, unsigned long long a2)
{
    unsigned long v0;  // x8

    v0 = (int)a1[232];
    if (v0 >> 2 & 1 && !((char)((char)a1[240]) >> 1 & 1))
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
        if (v0 >> 1 & 1 && !((char)a1[236] & 0x88888888))
            return 0;
        if (v0 >> 3 & 1 && (char)a1[244] >= 0)
            return 0;
    }
    return 1;
}
