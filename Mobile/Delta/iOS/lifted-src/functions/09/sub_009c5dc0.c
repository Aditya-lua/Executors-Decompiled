/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c5dc0..0x9c5df4 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_f08398[4];

unsigned long long sub_9c5dc0(unsigned long long a0)
{
    if (a0 >> 31 & 1)
    {
        return 0;
    }
    else if (14 >= (unsigned int)a0)
    {
        return g_f08398[a0 & 0xffffffff];
    }
}
