/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x14f524..0x14f5bc (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01de0;
extern unsigned short g_f01de2;
extern unsigned short g_f01de4;
extern unsigned short g_f01de6;
extern unsigned long long g_f01e30;
extern unsigned short g_f0f7a0;
extern unsigned short g_f0f7a2;
extern unsigned short g_f0f7a4;
extern unsigned short g_f0f7a6;

long long sub_14f524(void)
{
    unsigned long v0;  // x0

    g_f0f7a0 = 62546;
    g_f0f7a2 = 19808;
    g_f0f7a4 = 54018;
    g_f0f7a6 = 33491;
    g_f01de0 = g_f0f7a0 ^ g_f01de0;
    g_f01de2 = g_f0f7a2 ^ g_f01de2;
    g_f01de4 = g_f0f7a4 ^ g_f01de4;
    g_f01de6 = g_f0f7a6 ^ g_f01de6;
    g_f01e30 = g_f01e30 ^ 9427110451858175058;
    return v0;
}
