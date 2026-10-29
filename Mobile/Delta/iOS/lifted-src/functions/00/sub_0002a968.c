/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2a968..0x2a9c4 (92 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_f0ca50;
extern char g_f0cc58;
extern char g_f0cc98;
extern char g_f0ccb8;

long long sub_2a968(void)
{
    if (g_f0ca50 & 1)
    {
        return 100;
    }
    else if (g_f0ccb8 & 1)
    {
        return 13;
    }
    else if (g_f0cc98 & 1)
    {
        return 12;
    }
    else if (g_f0cc58)
    {
        return 11;
    }
    else
    {
        return 9;
    }
}
