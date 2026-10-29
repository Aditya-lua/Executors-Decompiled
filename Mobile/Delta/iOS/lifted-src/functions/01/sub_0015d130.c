/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x15d130..0x15d1c8 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01e80;
extern unsigned short g_f01e82;
extern unsigned short g_f01e84;
extern unsigned short g_f01e86;
extern unsigned long long g_f01ee0;
extern unsigned short g_f0f928;
extern unsigned short g_f0f92a;
extern unsigned short g_f0f92c;
extern unsigned short g_f0f92e;

long long sub_15d130(void)
{
    unsigned long v0;  // x0

    g_f0f928 = 41813;
    g_f0f92a = 7803;
    g_f0f92c = 47610;
    g_f0f92e = 5601;
    g_f01e80 = g_f0f928 ^ g_f01e80;
    g_f01e82 = g_f0f92a ^ g_f01e82;
    g_f01e84 = g_f0f92c ^ g_f01e84;
    g_f01e86 = g_f0f92e ^ g_f01e86;
    g_f01ee0 = g_f01ee0 ^ 1576745828460766037;
    return v0;
}
