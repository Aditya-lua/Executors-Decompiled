/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x228238..0x2282d0 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02b90;
extern unsigned short g_f02b92;
extern unsigned short g_f02b94;
extern unsigned short g_f02b96;
extern unsigned long long g_f02c20;
extern unsigned short g_f114f0;
extern unsigned short g_f114f2;
extern unsigned short g_f114f4;
extern unsigned short g_f114f6;

long long sub_228238(void)
{
    unsigned long v0;  // x0

    g_f114f0 = 54886;
    g_f114f2 = 22944;
    g_f114f4 = 44679;
    g_f114f6 = 12522;
    g_f02b90 = g_f114f0 ^ g_f02b90;
    g_f02b92 = g_f114f2 ^ g_f02b92;
    g_f02b94 = g_f114f4 ^ g_f02b94;
    g_f02b96 = g_f114f6 ^ g_f02b96;
    g_f02c20 = g_f02c20 ^ 3524821554718365286;
    return v0;
}
