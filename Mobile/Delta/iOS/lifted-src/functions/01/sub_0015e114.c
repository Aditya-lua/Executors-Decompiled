/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x15e114..0x15e1ac (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01ed0;
extern unsigned short g_f01ed2;
extern unsigned short g_f01ed4;
extern unsigned short g_f01ed6;
extern unsigned long long g_f01f30;
extern unsigned short g_f0f978;
extern unsigned short g_f0f97a;
extern unsigned short g_f0f97c;
extern unsigned short g_f0f97e;

long long sub_15e114(void)
{
    unsigned long v0;  // x0

    g_f0f978 = 1846;
    g_f0f97a = 10103;
    g_f0f97c = 44402;
    g_f0f97e = 57192;
    g_f01ed0 = g_f0f978 ^ g_f01ed0;
    g_f01ed2 = g_f0f97a ^ g_f01ed2;
    g_f01ed4 = g_f0f97c ^ g_f01ed4;
    g_f01ed6 = g_f0f97e ^ g_f01ed6;
    g_f01f30 = g_f01f30 ^ 16098307573835826998;
    return v0;
}
