/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2b1c50..0x2b1d1c (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_f02d10;
extern char g_f02d18;
extern unsigned short g_f02d30;
extern unsigned short g_f02d32;
extern unsigned short g_f02d34;
extern unsigned short g_f02d36;
extern unsigned short g_f02d38;
extern unsigned short g_f02d3a;
extern unsigned short g_f02d3c;
extern unsigned short g_f02d3e;
extern unsigned long long g_f02d40;

long long sub_2b1c50(void)
{
    unsigned long v0;  // x0

    if (g_f02d18 & 1)
        return v0;
    g_f02d18 = 1;
    g_f02d32 = 1076;
    g_f02d34 = 9401;
    g_f02d36 = 28008;
    g_f02d38 = 5544;
    g_f02d30 = g_f02d32 ^ g_f02d30;
    g_f02d3a = g_f02d34 ^ g_f02d3a;
    g_f02d3c = g_f02d36 ^ g_f02d3c;
    g_f02d3e = g_f02d38 ^ g_f02d3e;
    g_f02d40 = g_f02d40 ^ 1560617564944008244;
    *(unsigned int *)&g_f02d10 = 0;
    return v0;
}
