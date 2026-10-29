/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x124328..0x1243c0 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01940;
extern unsigned short g_f01942;
extern unsigned short g_f01944;
extern unsigned short g_f01946;
extern unsigned long long g_f01a28;
extern unsigned short g_f0e9e0;
extern unsigned short g_f0e9e2;
extern unsigned short g_f0e9e4;
extern unsigned short g_f0e9e6;

long long sub_124328(void)
{
    unsigned long v0;  // x0

    g_f0e9e0 = 23205;
    g_f0e9e2 = 63591;
    g_f0e9e4 = 35929;
    g_f0e9e6 = 43270;
    g_f01940 = g_f0e9e0 ^ g_f01940;
    g_f01942 = g_f0e9e2 ^ g_f01942;
    g_f01944 = g_f0e9e4 ^ g_f01944;
    g_f01946 = g_f0e9e6 ^ g_f01946;
    g_f01a28 = g_f01a28 ^ 12179576560317586085;
    return v0;
}
