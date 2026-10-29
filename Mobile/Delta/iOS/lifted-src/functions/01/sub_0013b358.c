/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x13b358..0x13b3f0 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01c00;
extern unsigned short g_f01c02;
extern unsigned short g_f01c04;
extern unsigned short g_f01c06;
extern unsigned long long g_f01d00;
extern unsigned short g_f0ef38;
extern unsigned short g_f0ef3a;
extern unsigned short g_f0ef3c;
extern unsigned short g_f0ef3e;

long long sub_13b358(void)
{
    unsigned long v0;  // x0

    g_f0ef38 = 40266;
    g_f0ef3a = 5830;
    g_f0ef3c = 7727;
    g_f0ef3e = 51626;
    g_f01c00 = g_f0ef38 ^ g_f01c00;
    g_f01c02 = g_f0ef3a ^ g_f01c02;
    g_f01c04 = g_f0ef3c ^ g_f01c04;
    g_f01c06 = g_f0ef3e ^ g_f01c06;
    g_f01d00 = g_f01d00 ^ 14531460335258737994;
    return v0;
}
