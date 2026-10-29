/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x21608c..0x216124 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f029d8;
extern unsigned short g_f029da;
extern unsigned short g_f029dc;
extern unsigned short g_f029de;
extern unsigned long long g_f02ae8;
extern unsigned short g_f10ff0;
extern unsigned short g_f10ff2;
extern unsigned short g_f10ff4;
extern unsigned short g_f10ff6;

long long sub_21608c(void)
{
    unsigned long v0;  // x0

    g_f10ff0 = 15055;
    g_f10ff2 = 6088;
    g_f10ff4 = 29540;
    g_f10ff6 = 23684;
    g_f029d8 = g_f10ff0 ^ g_f029d8;
    g_f029da = g_f10ff2 ^ g_f029da;
    g_f029dc = g_f10ff4 ^ g_f029dc;
    g_f029de = g_f10ff6 ^ g_f029de;
    g_f02ae8 = g_f02ae8 ^ 6666580222148098767;
    return v0;
}
