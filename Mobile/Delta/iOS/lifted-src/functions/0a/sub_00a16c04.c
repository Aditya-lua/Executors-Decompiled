/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa16c04..0xa16c50 (76 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_e8ef48;
extern unsigned long long g_e8ef58;
extern unsigned long long g_e8ef68;

long long sub_a16c04(unsigned int a0)
{
    switch (a0)
    {
    case 0:
        return g_e8ef48;
    case 16384:
        return g_e8ef68;
    case 8192:
        return g_e8ef58;
    default:
        return 0;
    }
}
