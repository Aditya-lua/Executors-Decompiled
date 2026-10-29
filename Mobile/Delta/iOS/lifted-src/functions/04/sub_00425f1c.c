/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x425f1c..0x425fa8 (140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_425f1c(unsigned long a0, unsigned long long a1)
{
    unsigned long long v0;  // w8
    unsigned long long v1;  // x0
    unsigned long long v2;  // x0
    unsigned long long v3;  // x1

    if (10 > a1)
        return 1;
    v0 = 1;
    v1 = 2;
    while (1)
    {
        v2 = v1;
        v3 = a1;
        if (v3 <= 99)
        {
            return v2;
        }
        else if (v3 <= 999)
        {
            return (v0 & 2) + (unsigned int)v2 + (-(unsigned int)v2 | 0xfffffffd) + 2;
        }
        else if (v3 >> 4 > 624)
        {
            a1 = v3 / 10000;
            v0 += 4;
            v1 = (unsigned int)v2 + 4;
            if (3125 > v3 >> 5)
                return (unsigned int)v2 + 3;
        }
        else
        {
            return (unsigned int)v2 + 2;
        }
    }
}
