/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x13b2c0..0x13b358 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01c18;
extern unsigned short g_f01c1a;
extern unsigned short g_f01c1c;
extern unsigned short g_f01c1e;
extern unsigned long long g_f01d18;
extern unsigned short g_f0ef50;
extern unsigned short g_f0ef52;
extern unsigned short g_f0ef54;
extern unsigned short g_f0ef56;

long long sub_13b2c0(void)
{
    unsigned long v0;  // x0

    g_f0ef50 = 19460;
    g_f0ef52 = 20751;
    g_f0ef54 = 39522;
    g_f0ef56 = 47442;
    g_f01c18 = g_f0ef50 ^ g_f01c18;
    g_f01c1a = g_f0ef52 ^ g_f01c1a;
    g_f01c1c = g_f0ef54 ^ g_f01c1c;
    g_f01c1e = g_f0ef56 ^ g_f01c1e;
    g_f01d18 = g_f01d18 ^ 13353905592164371460;
    return v0;
}
