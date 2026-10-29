/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2166b0..0x216748 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f029c8;
extern unsigned short g_f029ca;
extern unsigned short g_f029cc;
extern unsigned short g_f029ce;
extern unsigned long long g_f02ad8;
extern unsigned short g_f10fe0;
extern unsigned short g_f10fe2;
extern unsigned short g_f10fe4;
extern unsigned short g_f10fe6;

long long sub_2166b0(void)
{
    unsigned long v0;  // x0

    g_f10fe0 = 31336;
    g_f10fe2 = 9689;
    g_f10fe4 = 30187;
    g_f10fe6 = 26473;
    g_f029c8 = g_f10fe0 ^ g_f029c8;
    g_f029ca = g_f10fe2 ^ g_f029ca;
    g_f029cc = g_f10fe4 ^ g_f029cc;
    g_f029ce = g_f10fe6 ^ g_f029ce;
    g_f02ad8 = g_f02ad8 ^ 7451616711273970280;
    return v0;
}
