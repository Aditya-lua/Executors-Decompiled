/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x15d7d0..0x15d868 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01e98;
extern unsigned short g_f01e9a;
extern unsigned short g_f01e9c;
extern unsigned short g_f01e9e;
extern unsigned long long g_f01ef8;
extern unsigned short g_f0f940;
extern unsigned short g_f0f942;
extern unsigned short g_f0f944;
extern unsigned short g_f0f946;

long long sub_15d7d0(void)
{
    unsigned long v0;  // x0

    g_f0f940 = 11903;
    g_f0f942 = 56618;
    g_f0f944 = 13880;
    g_f0f946 = 1418;
    g_f01e98 = g_f0f940 ^ g_f01e98;
    g_f01e9a = g_f0f942 ^ g_f01e9a;
    g_f01e9c = g_f0f944 ^ g_f01e9c;
    g_f01e9e = g_f0f946 ^ g_f01e9e;
    g_f01ef8 = g_f01ef8 ^ 399191134832307839;
    return v0;
}
