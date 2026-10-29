/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x13afc8..0x13b060 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01bd8;
extern unsigned short g_f01bda;
extern unsigned short g_f01bdc;
extern unsigned short g_f01bde;
extern unsigned long long g_f01cd8;
extern unsigned short g_f0ef10;
extern unsigned short g_f0ef12;
extern unsigned short g_f0ef14;
extern unsigned short g_f0ef16;

long long sub_13afc8(void)
{
    unsigned long v0;  // x0

    g_f0ef10 = 18586;
    g_f0ef12 = 24845;
    g_f0ef14 = 42091;
    g_f0ef16 = 58598;
    g_f01bd8 = g_f0ef10 ^ g_f01bd8;
    g_f01bda = g_f0ef12 ^ g_f01bda;
    g_f01bdc = g_f0ef14 ^ g_f01bdc;
    g_f01bde = g_f0ef16 ^ g_f01bde;
    g_f01cd8 = g_f01cd8 ^ 16494051466387736730;
    return v0;
}
