/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4dc3fc..0x4dc454 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned int g_f00db0;
extern char g_f00db8;
extern unsigned int g_f0c948;

long long sub_4dc3fc(void)
{
    unsigned int v0;  // w11
    unsigned long v2;  // x0

    v0 = (1 & ~g_f00db8) + (g_f00db8 ^ 0xfffffffe);
    if ((-((v0 & g_f00db8 + 1) * 2) & 254) == ((v0 ^ g_f00db8 + 1) & 0xff))
    {
        g_f00db8 = 1;
        g_f0c948 = g_f0c948 + 1;
        g_f00db0 = g_f0c948;
    }
    return v2;
}
