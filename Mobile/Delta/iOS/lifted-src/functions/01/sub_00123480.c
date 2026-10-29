/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x123480..0x123518 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01a00;
extern unsigned short g_f01a02;
extern unsigned short g_f01a04;
extern unsigned short g_f01a06;
extern unsigned long long g_f01ae8;
extern unsigned short g_f0eaa0;
extern unsigned short g_f0eaa2;
extern unsigned short g_f0eaa4;
extern unsigned short g_f0eaa6;

long long sub_123480(void)
{
    unsigned long v0;  // x0

    g_f0eaa0 = 41077;
    g_f0eaa2 = 33327;
    g_f0eaa4 = 28239;
    g_f0eaa6 = 9802;
    g_f01a00 = g_f0eaa0 ^ g_f01a00;
    g_f01a02 = g_f0eaa2 ^ g_f01a02;
    g_f01a04 = g_f0eaa4 ^ g_f01a04;
    g_f01a06 = g_f0eaa6 ^ g_f01a06;
    g_f01ae8 = g_f01ae8 ^ 2759139009483481205;
    return v0;
}
