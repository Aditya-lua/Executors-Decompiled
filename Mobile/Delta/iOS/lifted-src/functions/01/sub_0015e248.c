/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x15e248..0x15e2e0 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01e88;
extern unsigned short g_f01e8a;
extern unsigned short g_f01e8c;
extern unsigned short g_f01e8e;
extern unsigned long long g_f01ee8;
extern unsigned short g_f0f930;
extern unsigned short g_f0f932;
extern unsigned short g_f0f934;
extern unsigned short g_f0f936;

long long sub_15e248(void)
{
    unsigned long v0;  // x0

    g_f0f930 = 5944;
    g_f0f932 = 40795;
    g_f0f934 = 14522;
    g_f0f936 = 4207;
    g_f01e88 = g_f0f930 ^ g_f01e88;
    g_f01e8a = g_f0f932 ^ g_f01e8a;
    g_f01e8c = g_f0f934 ^ g_f01e8c;
    g_f01e8e = g_f0f936 ^ g_f01e8e;
    g_f01ee8 = g_f01ee8 ^ 1184227601210349368;
    return v0;
}
