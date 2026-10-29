/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x216878..0x216910 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02940;
extern unsigned short g_f02942;
extern unsigned short g_f02944;
extern unsigned short g_f02946;
extern unsigned long long g_f02a50;
extern unsigned short g_f10f58;
extern unsigned short g_f10f5a;
extern unsigned short g_f10f5c;
extern unsigned short g_f10f5e;

long long sub_216878(void)
{
    unsigned long v0;  // x0

    g_f10f58 = 20944;
    g_f10f5a = 0x2900;
    g_f10f5c = 2868;
    g_f10f5e = 50180;
    g_f02940 = g_f10f58 ^ g_f02940;
    g_f02942 = g_f10f5a ^ g_f02942;
    g_f02944 = g_f10f5c ^ g_f02944;
    g_f02946 = g_f10f5e ^ g_f02946;
    g_f02a50 = g_f02a50 ^ 14124426649994809808;
    return v0;
}
