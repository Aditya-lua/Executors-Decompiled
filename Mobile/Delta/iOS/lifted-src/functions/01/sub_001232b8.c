/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1232b8..0x123350 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f019b0;
extern unsigned short g_f019b2;
extern unsigned short g_f019b4;
extern unsigned short g_f019b6;
extern unsigned long long g_f01a98;
extern unsigned short g_f0ea50;
extern unsigned short g_f0ea52;
extern unsigned short g_f0ea54;
extern unsigned short g_f0ea56;

long long sub_1232b8(void)
{
    unsigned long v0;  // x0

    g_f0ea50 = 1876;
    g_f0ea52 = 25563;
    g_f0ea54 = 31446;
    g_f0ea56 = 23747;
    g_f019b0 = g_f0ea50 ^ g_f019b0;
    g_f019b2 = g_f0ea52 ^ g_f019b2;
    g_f019b4 = g_f0ea54 ^ g_f019b4;
    g_f019b6 = g_f0ea56 ^ g_f019b6;
    g_f01a98 = g_f01a98 ^ 6684321333164836692;
    return v0;
}
