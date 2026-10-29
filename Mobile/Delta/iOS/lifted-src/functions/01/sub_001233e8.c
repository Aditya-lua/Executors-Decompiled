/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1233e8..0x123480 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f019c0;
extern unsigned short g_f019c2;
extern unsigned short g_f019c4;
extern unsigned short g_f019c6;
extern unsigned long long g_f01aa8;
extern unsigned short g_f0ea60;
extern unsigned short g_f0ea62;
extern unsigned short g_f0ea64;
extern unsigned short g_f0ea66;

long long sub_1233e8(void)
{
    unsigned long v0;  // x0

    g_f0ea60 = 23642;
    g_f0ea62 = 54762;
    g_f0ea64 = 30801;
    g_f0ea66 = 20958;
    g_f019c0 = g_f0ea60 ^ g_f019c0;
    g_f019c2 = g_f0ea62 ^ g_f019c2;
    g_f019c4 = g_f0ea64 ^ g_f019c4;
    g_f019c6 = g_f0ea66 ^ g_f019c6;
    g_f01aa8 = g_f01aa8 ^ 5899284854778518618;
    return v0;
}
