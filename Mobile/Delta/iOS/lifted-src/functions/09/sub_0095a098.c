/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x95a098..0x95a0d8 (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_d27b50;

long long sub_95a098(unsigned long a0, unsigned long long *a1)
{
    if (a1[210] + 9 <= a0)
    {
        return 0;
    }
    else if (a0 >= 9)
    {
        return a1[44] + a0 * 8 - 72;
    }
    else
    {
        return &(&g_d27b50)[8 * a0];
    }
}
