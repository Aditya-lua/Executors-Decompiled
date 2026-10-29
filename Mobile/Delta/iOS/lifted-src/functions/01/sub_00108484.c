/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x108484..0x1084b8 (52 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00c10;
extern char g_f00c18;
extern unsigned int g_f0c948;

long long sub_108484(void)
{
    unsigned long v0;  // x0

    if (!(g_f00c18 & 1))
    {
        g_f00c18 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00c10 = g_f0c948;
    }
    return v0;
}
