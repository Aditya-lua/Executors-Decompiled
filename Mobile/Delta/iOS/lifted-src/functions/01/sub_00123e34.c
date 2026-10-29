/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x123e34..0x123ecc (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01948;
extern unsigned short g_f0194a;
extern unsigned short g_f0194c;
extern unsigned short g_f0194e;
extern unsigned long long g_f01a30;
extern unsigned short g_f0e9e8;
extern unsigned short g_f0e9ea;
extern unsigned short g_f0e9ec;
extern unsigned short g_f0e9ee;

long long sub_123e34(void)
{
    unsigned long v0;  // x0

    g_f0e9e8 = 50760;
    g_f0e9ea = 1631;
    g_f0e9ec = 2841;
    g_f0e9ee = 41876;
    g_f01948 = g_f0e9e8 ^ g_f01948;
    g_f0194a = g_f0e9ea ^ g_f0194a;
    g_f0194c = g_f0e9ec ^ g_f0194c;
    g_f0194e = g_f0e9ee ^ g_f0194e;
    g_f01a30 = g_f01a30 ^ 11787058326844458568;
    return v0;
}
