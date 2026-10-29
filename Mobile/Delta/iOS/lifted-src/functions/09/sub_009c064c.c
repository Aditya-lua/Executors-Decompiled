/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c064c..0x9c0690 (68 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_9c064c(unsigned long long a0, unsigned long long a1)
{
    if (!(a1 >> 31 & 1))
    {
        if (!a0)
        {
            return a0;
        }
        else if (*(int *)a0 > (int)((a1 & 0xffffffff) >> 3) && *(long long *)(a0 + 8))
        {
            return (char)(*(char *)(*(long long *)(a0 + 8) + ((a1 & 0xffffffff) >> 3))) >> (7 & (char)~(unsigned int)a1 & 31) & 1;
        }
    }
    return 0;
}
