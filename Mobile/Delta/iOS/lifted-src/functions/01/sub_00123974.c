/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x123974..0x123a0c (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01938;
extern unsigned short g_f0193a;
extern unsigned short g_f0193c;
extern unsigned short g_f0193e;
extern unsigned long long g_f01a20;
extern unsigned short g_f0e9d8;
extern unsigned short g_f0e9da;
extern unsigned short g_f0e9dc;
extern unsigned short g_f0e9de;

long long sub_123974(void)
{
    unsigned long v0;  // x0

    g_f0e9d8 = 48434;
    g_f0e9da = 13934;
    g_f0e9dc = 3480;
    g_f0e9de = 44665;
    g_f01938 = g_f0e9d8 ^ g_f01938;
    g_f0193a = g_f0e9da ^ g_f0193a;
    g_f0193c = g_f0e9dc ^ g_f0193c;
    g_f0193e = g_f0e9de ^ g_f0193e;
    g_f01a20 = g_f01a20 ^ 12572094782180867378;
    return v0;
}
