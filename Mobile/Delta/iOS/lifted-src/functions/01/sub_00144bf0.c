/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x144bf0..0x144c88 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01d80;
extern unsigned short g_f01d82;
extern unsigned short g_f01d84;
extern unsigned short g_f01d86;
extern unsigned long long g_f01db0;
extern unsigned short g_f0f3b8;
extern unsigned short g_f0f3ba;
extern unsigned short g_f0f3bc;
extern unsigned short g_f0f3be;

long long sub_144bf0(void)
{
    unsigned long v0;  // x0

    g_f0f3b8 = 36842;
    g_f0f3ba = 31334;
    g_f0f3bc = 57867;
    g_f0f3be = 50225;
    g_f01d80 = g_f0f3b8 ^ g_f01d80;
    g_f01d82 = g_f0f3ba ^ g_f01d82;
    g_f01d84 = g_f0f3bc ^ g_f01d84;
    g_f01d86 = g_f0f3be ^ g_f01d86;
    g_f01db0 = g_f01db0 ^ 14137329244218757098;
    return v0;
}
