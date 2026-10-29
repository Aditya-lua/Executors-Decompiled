/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaeb138..0xaeb174 (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_f099a8;

unsigned long long sub_aeb138(unsigned long long a0)
{
    if (a0 >> 31 & 1)
    {
        return 0;
    }
    else if (9 >= (unsigned int)a0)
    {
        return &(&g_f099a8)[(unsigned int)a0 * 48];
    }
}
