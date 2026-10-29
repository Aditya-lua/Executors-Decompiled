/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x13b650..0x13b6e8 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01c28;
extern unsigned short g_f01c2a;
extern unsigned short g_f01c2c;
extern unsigned short g_f01c2e;
extern unsigned long long g_f01d28;
extern unsigned short g_f0ef60;
extern unsigned short g_f0ef62;
extern unsigned short g_f0ef64;
extern unsigned short g_f0ef66;

long long sub_13b650(void)
{
    unsigned long v0;  // x0

    g_f0ef60 = 54075;
    g_f0ef62 = 920;
    g_f0ef64 = 38883;
    g_f0ef66 = 44653;
    g_f01c28 = g_f0ef60 ^ g_f01c28;
    g_f01c2a = g_f0ef62 ^ g_f01c2a;
    g_f01c2c = g_f0ef64 ^ g_f01c2c;
    g_f01c2e = g_f0ef66 ^ g_f01c2e;
    g_f01d28 = g_f01d28 ^ 12568869136334639931;
    return v0;
}
