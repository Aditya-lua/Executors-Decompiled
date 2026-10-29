/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1e5b90..0x1e5c5c (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_f023a8;
extern char g_f023b0;
extern unsigned short g_f023d0;
extern unsigned short g_f023d2;
extern unsigned short g_f023d4;
extern unsigned short g_f023d6;
extern unsigned short g_f023d8;
extern unsigned short g_f023da;
extern unsigned short g_f023dc;
extern unsigned short g_f023de;
extern unsigned long long g_f023e0;

long long sub_1e5b90(void)
{
    unsigned long v0;  // x0

    if (g_f023b0 & 1)
        return v0;
    g_f023b0 = 1;
    g_f023d2 = 17708;
    g_f023d4 = 14669;
    g_f023d6 = 58644;
    g_f023d8 = 30679;
    g_f023d0 = g_f023d2 ^ g_f023d0;
    g_f023da = g_f023d4 ^ g_f023da;
    g_f023dc = g_f023d6 ^ g_f023dc;
    g_f023de = g_f023d8 ^ g_f023de;
    g_f023e0 = g_f023e0 ^ 8635622685529687340;
    *(unsigned int *)&g_f023a8 = 0;
    return v0;
}
