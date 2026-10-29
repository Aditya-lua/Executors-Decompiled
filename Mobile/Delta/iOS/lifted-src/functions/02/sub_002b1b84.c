/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2b1b84..0x2b1c50 (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_f02d20;
extern char g_f02d28;
extern unsigned short g_f02d48;
extern unsigned short g_f02d4a;
extern unsigned short g_f02d4c;
extern unsigned short g_f02d4e;
extern unsigned short g_f02d50;
extern unsigned short g_f02d52;
extern unsigned short g_f02d54;
extern unsigned short g_f02d56;
extern unsigned long long g_f02d58;

long long sub_2b1b84(void)
{
    unsigned long v0;  // x0

    if (g_f02d28 & 1)
        return v0;
    g_f02d28 = 1;
    g_f02d4a = 61342;
    g_f02d4c = 58232;
    g_f02d4e = 59814;
    g_f02d50 = 1360;
    g_f02d48 = g_f02d4a ^ g_f02d48;
    g_f02d52 = g_f02d4c ^ g_f02d52;
    g_f02d54 = g_f02d4e ^ g_f02d54;
    g_f02d56 = g_f02d50 ^ g_f02d56;
    g_f02d58 = g_f02d58 ^ 383062871316688798;
    *(unsigned int *)&g_f02d20 = 0;
    return v0;
}
