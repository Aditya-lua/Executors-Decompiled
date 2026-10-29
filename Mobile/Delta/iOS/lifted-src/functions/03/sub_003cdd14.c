/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3cdd14..0x3cdd74 (96 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_3cdd14(unsigned int a0, unsigned long long a1)
{
    unsigned long long v0;  // 4125

    if (2 > (unsigned int)a1 + 1)
    {
        return 1;
    }
    else if ((int)((unsigned int)a1 ^ a0) >= 0)
    {
        return (int)(0x7fff / (unsigned int)a1) >= (int)a0;
    }
    else if (!(a1 >> 31 & 1))
    {
        v0 = arm64g_calculate_condition(177, a0, 0x8000 / a1 & 0xffffffff, 0);
        return !(v0 & 1);
    }
    else
    {
        return (int)(0x8000 / -(unsigned int)a1) >= (int)a0;
    }
}
