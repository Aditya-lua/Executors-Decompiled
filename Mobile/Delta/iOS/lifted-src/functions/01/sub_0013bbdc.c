/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x13bbdc..0x13bc74 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01b98;
extern unsigned short g_f01b9a;
extern unsigned short g_f01b9c;
extern unsigned short g_f01b9e;
extern unsigned long long g_f01c98;
extern unsigned short g_f0eed0;
extern unsigned short g_f0eed2;
extern unsigned short g_f0eed4;
extern unsigned short g_f0eed6;

long long sub_13bbdc(void)
{
    unsigned long v0;  // x0

    g_f0eed0 = 19263;
    g_f0eed2 = 0x7300;
    g_f0eed4 = 44656;
    g_f0eed6 = 4218;
    g_f01b98 = g_f0eed0 ^ g_f01b98;
    g_f01b9a = g_f0eed2 ^ g_f01b9a;
    g_f01b9c = g_f0eed4 ^ g_f01b9c;
    g_f01b9e = g_f0eed6 ^ g_f01b9e;
    g_f01c98 = g_f01c98 ^ 1187453249754516287;
    return v0;
}
