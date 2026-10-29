/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1e8a84..0x1e8b1c (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f027b8;
extern unsigned short g_f027ba;
extern unsigned short g_f027bc;
extern unsigned short g_f027be;
extern unsigned long long g_f027e0;
extern unsigned short g_f10dc8;
extern unsigned short g_f10dca;
extern unsigned short g_f10dcc;
extern unsigned short g_f10dce;

long long sub_1e8a84(void)
{
    unsigned long v0;  // x0

    g_f10dc8 = 10796;
    g_f10dca = 59734;
    g_f10dcc = 51336;
    g_f10dce = 52974;
    g_f027b8 = g_f10dc8 ^ g_f027b8;
    g_f027ba = g_f10dca ^ g_f027ba;
    g_f027bc = g_f10dcc ^ g_f027bc;
    g_f027be = g_f10dce ^ g_f027be;
    g_f027e0 = g_f027e0 ^ 14911075906626136620;
    return v0;
}
