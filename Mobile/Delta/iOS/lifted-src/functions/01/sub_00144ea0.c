/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x144ea0..0x144f38 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01d68;
extern unsigned short g_f01d6a;
extern unsigned short g_f01d6c;
extern unsigned short g_f01d6e;
extern unsigned long long g_f01d98;
extern unsigned short g_f0f3a0;
extern unsigned short g_f0f3a2;
extern unsigned short g_f0f3a4;
extern unsigned short g_f0f3a6;

long long sub_144ea0(void)
{
    unsigned long v0;  // x0

    g_f0f3a0 = 16944;
    g_f0f3a2 = 49071;
    g_f0f3a4 = 26057;
    g_f0f3a6 = 54409;
    g_f01d68 = g_f0f3a0 ^ g_f01d68;
    g_f01d6a = g_f0f3a2 ^ g_f01d6a;
    g_f01d6c = g_f0f3a4 ^ g_f01d6c;
    g_f01d6e = g_f0f3a6 ^ g_f01d6e;
    g_f01d98 = g_f01d98 ^ 15314883925028848176;
    return v0;
}
