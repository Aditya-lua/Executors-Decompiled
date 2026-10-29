/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x13b8b0..0x13b948 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01bf8;
extern unsigned short g_f01bfa;
extern unsigned short g_f01bfc;
extern unsigned short g_f01bfe;
extern unsigned long long g_f01cf8;
extern unsigned short g_f0ef30;
extern unsigned short g_f0ef32;
extern unsigned short g_f0ef34;
extern unsigned short g_f0ef36;

long long sub_13b8b0(void)
{
    unsigned long v0;  // x0

    g_f0ef30 = 65239;
    g_f0ef32 = 34830;
    g_f0ef34 = 40815;
    g_f0ef36 = 53020;
    g_f01bf8 = g_f0ef30 ^ g_f01bf8;
    g_f01bfa = g_f0ef32 ^ g_f01bfa;
    g_f01bfc = g_f0ef34 ^ g_f01bfc;
    g_f01bfe = g_f0ef36 ^ g_f01bfe;
    g_f01cf8 = g_f01cf8 ^ 14923978566571851479;
    return v0;
}
