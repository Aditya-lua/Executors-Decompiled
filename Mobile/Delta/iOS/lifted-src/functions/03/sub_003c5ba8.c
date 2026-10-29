/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3c5ba8..0x3c5c40 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f03820;
extern unsigned short g_f03822;
extern unsigned short g_f03824;
extern unsigned short g_f03826;
extern unsigned long long g_f03830;
extern unsigned short g_f11d18;
extern unsigned short g_f11d1a;
extern unsigned short g_f11d1c;
extern unsigned short g_f11d1e;

long long sub_3c5ba8(void)
{
    unsigned long v0;  // x0

    g_f11d18 = 51523;
    g_f11d1a = 31091;
    g_f11d1c = 46873;
    g_f11d1e = 41755;
    g_f03820 = g_f11d18 ^ g_f03820;
    g_f03822 = g_f11d1a ^ g_f03822;
    g_f03824 = g_f11d1c ^ g_f03824;
    g_f03826 = g_f11d1e ^ g_f03826;
    g_f03830 = g_f03830 ^ 11753188972593137987;
    return v0;
}
