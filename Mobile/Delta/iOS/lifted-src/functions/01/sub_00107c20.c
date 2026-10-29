/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x107c20..0x107cb8 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f015e0;
extern unsigned short g_f015e2;
extern unsigned short g_f015e4;
extern unsigned short g_f015e6;
extern unsigned long long g_f01720;
extern unsigned short g_f0e0f8;
extern unsigned short g_f0e0fa;
extern unsigned short g_f0e0fc;
extern unsigned short g_f0e0fe;

long long sub_107c20(void)
{
    unsigned long v0;  // x0

    g_f0e0f8 = 39101;
    g_f0e0fa = 1328;
    g_f0e0fc = 5020;
    g_f0e0fe = 62805;
    g_f015e0 = g_f0e0f8 ^ g_f015e0;
    g_f015e2 = g_f0e0fa ^ g_f015e2;
    g_f015e4 = g_f0e0fc ^ g_f015e4;
    g_f015e6 = g_f0e0fe ^ g_f015e6;
    g_f01720 = g_f01720 ^ 17678057473135646909;
    return v0;
}
