/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x144b58..0x144bf0 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01d90;
extern unsigned short g_f01d92;
extern unsigned short g_f01d94;
extern unsigned short g_f01d96;
extern unsigned long long g_f01dc0;
extern unsigned short g_f0f3c8;
extern unsigned short g_f0f3ca;
extern unsigned short g_f0f3cc;
extern unsigned short g_f0f3ce;

long long sub_144b58(void)
{
    unsigned long v0;  // x0

    g_f0f3c8 = 36913;
    g_f0f3ca = 64292;
    g_f0f3cc = 57225;
    g_f0f3ce = 47436;
    g_f01d90 = g_f0f3c8 ^ g_f01d90;
    g_f01d92 = g_f0f3ca ^ g_f01d92;
    g_f01d94 = g_f0f3cc ^ g_f01d94;
    g_f01d96 = g_f0f3ce ^ g_f01d96;
    g_f01dc0 = g_f01dc0 ^ 13352292778963669041;
    return v0;
}
