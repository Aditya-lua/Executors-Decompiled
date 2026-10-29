/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xecc90..0xecd28 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01530;
extern unsigned short g_f01532;
extern unsigned short g_f01534;
extern unsigned short g_f01536;
extern unsigned long long g_f01560;
extern unsigned short g_f0dfc0;
extern unsigned short g_f0dfc2;
extern unsigned short g_f0dfc4;
extern unsigned short g_f0dfc6;

long long sub_ecc90(void)
{
    unsigned long v0;  // x0

    g_f0dfc0 = 20020;
    g_f0dfc2 = 60838;
    g_f0dfc4 = 12075;
    g_f0dfc6 = 27948;
    g_f01530 = g_f0dfc0 ^ g_f01530;
    g_f01532 = g_f0dfc2 ^ g_f01532;
    g_f01534 = g_f0dfc4 ^ g_f01534;
    g_f01536 = g_f0dfc6 ^ g_f01536;
    g_f01560 = g_f01560 ^ 7866714514826612276;
    return v0;
}
