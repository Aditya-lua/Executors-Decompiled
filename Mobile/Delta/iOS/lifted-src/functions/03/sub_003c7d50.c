/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3c7d50..0x3c7e1c (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_f01310;
extern char g_f01318;
extern unsigned short g_f01330;
extern unsigned short g_f01334;
extern unsigned short g_f01338;
extern unsigned long long g_f01340;
extern unsigned short g_f01b4c;
extern unsigned short g_f01b50;
extern unsigned short g_f01b54;
extern unsigned short g_f01b58;
extern unsigned short g_f01e70;

long long sub_3c7d50(void)
{
    unsigned long v0;  // x0

    if (g_f01318 & 1)
        return v0;
    g_f01318 = 1;
    g_f01b4c = 26398;
    g_f01334 = 38862;
    g_f01b50 = 32587;
    g_f01338 = 51660;
    g_f01330 = g_f01b4c ^ g_f01330;
    g_f01b54 = g_f01334 ^ g_f01b54;
    g_f01e70 = g_f01b50 ^ g_f01e70;
    g_f01b58 = g_f01338 ^ g_f01b58;
    g_f01340 = g_f01340 ^ 14541137259518650142;
    *(unsigned int *)&g_f01310 = 0;
    return v0;
}
