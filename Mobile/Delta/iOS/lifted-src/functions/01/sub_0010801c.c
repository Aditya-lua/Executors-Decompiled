/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x10801c..0x1080b4 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01620;
extern unsigned short g_f01622;
extern unsigned short g_f01624;
extern unsigned short g_f01626;
extern unsigned long long g_f01760;
extern unsigned short g_f0e138;
extern unsigned short g_f0e13a;
extern unsigned short g_f0e13c;
extern unsigned short g_f0e13e;

long long sub_10801c(void)
{
    unsigned long v0;  // x0

    g_f0e138 = 31512;
    g_f0e13a = 19187;
    g_f0e13c = 2449;
    g_f0e13e = 51649;
    g_f01620 = g_f0e138 ^ g_f01620;
    g_f01622 = g_f0e13a ^ g_f01622;
    g_f01624 = g_f0e13c ^ g_f01624;
    g_f01626 = g_f0e13e ^ g_f01626;
    g_f01760 = g_f01760 ^ 14537911591761050392;
    return v0;
}
