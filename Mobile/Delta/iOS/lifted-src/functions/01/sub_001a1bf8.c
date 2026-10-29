/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a1bf8..0x1a1c90 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02400;
extern unsigned short g_f02402;
extern unsigned short g_f02404;
extern unsigned short g_f02406;
extern unsigned long long g_f02468;
extern unsigned short g_f105d8;
extern unsigned short g_f105da;
extern unsigned short g_f105dc;
extern unsigned short g_f105de;

long long sub_1a1bf8(void)
{
    unsigned long v0;  // x0

    g_f105d8 = 14496;
    g_f105da = 48826;
    g_f105dc = 56726;
    g_f105de = 22312;
    g_f02400 = g_f105d8 ^ g_f02400;
    g_f02402 = g_f105da ^ g_f02402;
    g_f02404 = g_f105dc ^ g_f02404;
    g_f02406 = g_f105de ^ g_f02406;
    g_f02468 = g_f02468 ^ 6280513319882864800;
    return v0;
}
