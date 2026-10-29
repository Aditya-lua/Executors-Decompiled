/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x15e2e0..0x15e378 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01e78;
extern unsigned short g_f01e7a;
extern unsigned short g_f01e7c;
extern unsigned short g_f01e7e;
extern unsigned long long g_f01ed8;
extern unsigned short g_f0f920;
extern unsigned short g_f0f922;
extern unsigned short g_f0f924;
extern unsigned short g_f0f926;

long long sub_15e2e0(void)
{
    unsigned long v0;  // x0

    g_f0f920 = 57282;
    g_f0f922 = 40043;
    g_f0f924 = 0x3b3b;
    g_f0f926 = 6996;
    g_f01e78 = g_f0f920 ^ g_f01e78;
    g_f01e7a = g_f0f922 ^ g_f01e7a;
    g_f01e7c = g_f0f924 ^ g_f01e7c;
    g_f01e7e = g_f0f926 ^ g_f01e7e;
    g_f01ed8 = g_f01ed8 ^ 1969264064281173954;
    return v0;
}
