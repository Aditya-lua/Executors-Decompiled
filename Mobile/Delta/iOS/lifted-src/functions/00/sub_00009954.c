/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9954..0x9984 (48 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f01020;
extern char g_f01028;
extern unsigned int g_f0c94c;

long long sub_9954(void)
{
    unsigned long v0;  // x0

    if (!(g_f01028 & 1))
    {
        g_f01028 = 1;
        g_f0c94c = g_f0c94c + 1;
        g_f01020 = g_f0c94c;
    }
    return v0;
}
