/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x933744..0x933794 (80 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00b70;
extern char g_f00b78;
extern unsigned int g_f0c948;

long long sub_933744(void)
{
    unsigned long v1;  // x0

    if (!~((g_f00b78 ^ 254) + g_f00b78 + (~g_f00b78 & 1)))
    {
        g_f00b78 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00b70 = g_f0c948;
        return v1;
    }
    return v1;
}
