/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x11378c..0x113824 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01860;
extern unsigned short g_f01862;
extern unsigned short g_f01864;
extern unsigned short g_f01866;
extern unsigned long long g_f018f8;
extern unsigned short g_f0e738;
extern unsigned short g_f0e73a;
extern unsigned short g_f0e73c;
extern unsigned short g_f0e73e;

long long sub_11378c(void)
{
    unsigned long v0;  // x0

    g_f0e738 = 0x7f88;
    g_f0e73a = 2333;
    g_f0e73c = 44911;
    g_f0e73e = 16780;
    g_f01860 = g_f0e738 ^ g_f01860;
    g_f01862 = g_f0e73a ^ g_f01862;
    g_f01864 = g_f0e73c ^ g_f01864;
    g_f01866 = g_f0e73e ^ g_f01866;
    g_f018f8 = g_f018f8 ^ 0x418caf6f091d7f88;
    return v0;
}
