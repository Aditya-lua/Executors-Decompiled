/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa7b03c..0xa7b0d8 (156 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


char * sub_a7b03c(char *a0, unsigned long long a1)
{
    if (64 > a1)
    {
        *a0 = a1;
        return a0;
    }
    else if (0x4000 > a1)
    {
        *a0 = (char)a1 * 0 | (char)(a1 >> 8) | 64;
        a0[1] = a1;
        return a0;
    }
    else if (a1 <= 0x3fffffff)
    {
        *a0 = (char)a1 * 0 | (char)(a1 >> 24) | 128;
        a0[1] = a1 >> 16;
        a0[2] = a1 >> 8;
        a0[3] = a1;
        return a0;
    }
    else
    {
        *a0 = (char)(a1 >> 56) | 192;
        a0[1] = a1 >> 48;
        a0[2] = a1 >> 40;
        a0[3] = a1 >> 32;
        a0[4] = a1 >> 24;
        a0[5] = a1 >> 16;
        a0[6] = a1 >> 8;
        a0[7] = a1;
        return a0;
    }
}
