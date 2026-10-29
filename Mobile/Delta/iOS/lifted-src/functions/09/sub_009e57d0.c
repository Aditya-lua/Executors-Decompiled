/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e57d0..0x9e5858 (136 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9e57d0_0 {
    unsigned long long field_0;
} st_9e57d0_0;


unsigned long long sub_9e57d0(st_9e57d0_0 **a0, unsigned long long a1)
{
    unsigned int v0;  // w8
    unsigned long long v1;  // w9
    unsigned long v2;  // x9
    unsigned long long v3;  // w8

    if (a1 >> 31 & 1)
        return 0;
    v0 = (unsigned int)a1 >> 6;
    if ((int)a0[1] <= (int)v0)
        return 0;
    v1 = (unsigned int)a1 & 63;
    if (v1)
    {
        *(unsigned long long *)&(*a0)[v0] = *(long long *)&(*a0)[v0] & ~(0xffffffffffffffff << ((char)v1 & 63));
        v0 += 1;
    }
    else
    {
        *(unsigned int *)&a0[1] = v0;
        if ((unsigned int)a1 < 64)
        {
            *(unsigned int *)&a0[2] = 0;
            return 1;
        }
    }
    v2 = (char *)&(*a0)[v0] - 8;
    while (1)
    {
        v3 = v0;
        if (*(long long *)v2)
        {
            *(unsigned int *)&a0[1] = v3;
            return 1;
        }
        v0 = v3 - 1;
        v2 -= 8;
        if (1 >= v3)
        {
            *(unsigned int *)&a0[1] = 0;
            *(unsigned int *)&a0[2] = 0;
            return 1;
        }
    }
}
