/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x49b08..0x49b3c (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f01020;
extern char g_f01028;
extern unsigned int g_f0c94c;

long long sub_49b08(void)
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
