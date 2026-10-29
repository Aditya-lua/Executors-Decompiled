/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e5748..0x9e5778 (48 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9e5748_0 {
    unsigned long long field_0;
} st_9e5748_0;


unsigned long long sub_9e5748(st_9e5748_0 **a0, unsigned long long a1)
{
    if (a1 >> 31 & 1)
    {
        return 0;
    }
    else if ((int)a0[1] > (int)((unsigned int)a1 >> 6))
    {
        return (int)((unsigned long long)(*(long long *)&(*a0)[(unsigned int)a1 >> 6]) >> ((char)a1 & 63)) & 1;
    }
    else
    {
        return 0;
    }
}
