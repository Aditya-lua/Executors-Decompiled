/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x954800..0x954824 (36 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_f04e98;

long long sub_954800(unsigned int a0)
{
    if (a0 >= 167)
        return 0;
    return &(&g_f04e98)[(unsigned int)(166 - a0) * 80];
}
