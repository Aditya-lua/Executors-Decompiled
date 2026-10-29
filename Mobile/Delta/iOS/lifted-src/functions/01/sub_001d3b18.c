/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1d3b18..0x1d3bb0 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02558;
extern unsigned short g_f0255a;
extern unsigned short g_f0255c;
extern unsigned short g_f0255e;
extern unsigned long long g_f02620;
extern unsigned short g_f10810;
extern unsigned short g_f10812;
extern unsigned short g_f10814;
extern unsigned short g_f10816;

long long sub_1d3b18(void)
{
    unsigned long v0;  // x0

    g_f10810 = 15023;
    g_f10812 = 38299;
    g_f10814 = 10169;
    g_f10816 = 27885;
    g_f02558 = g_f10810 ^ g_f02558;
    g_f0255a = g_f10812 ^ g_f0255a;
    g_f0255c = g_f10814 ^ g_f0255c;
    g_f0255e = g_f10816 ^ g_f0255e;
    g_f02620 = g_f02620 ^ 7848973403609053871;
    return v0;
}
