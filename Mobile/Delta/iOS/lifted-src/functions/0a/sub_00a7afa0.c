/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa7afa0..0xa7b03c (156 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


char * sub_a7afa0(char *a0, unsigned long long a1, unsigned int a2)
{
    switch (a2)
    {
    case 4:
        *a0 = 128 | (128 | (char)(__ROL__((unsigned int)a1, 8)) & 63) & 63;
        a0[1] = a1 >> 16;
        a0[2] = a1 >> 8;
        a0[3] = a1;
        return a0;
    case 2:
        *a0 = 64 | (64 | (char)(__ROL__((unsigned int)a1, 24)) & 63) & 63;
        a0[1] = a1;
        return a0;
    case 1:
        *a0 = a1;
        return a0;
    default:
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
