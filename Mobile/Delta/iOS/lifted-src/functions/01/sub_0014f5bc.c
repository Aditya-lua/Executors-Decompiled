/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x14f5bc..0x14f654 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01e08;
extern unsigned short g_f01e0a;
extern unsigned short g_f01e0c;
extern unsigned short g_f01e0e;
extern unsigned long long g_f01e58;
extern unsigned short g_f0f7c8;
extern unsigned short g_f0f7ca;
extern unsigned short g_f0f7cc;
extern unsigned short g_f0f7ce;

long long sub_14f5bc(void)
{
    unsigned long v0;  // x0

    g_f0f7c8 = 2675;
    g_f0f7ca = 19942;
    g_f0f7cc = 19648;
    g_f0f7ce = 26519;
    g_f01e08 = g_f0f7c8 ^ g_f01e08;
    g_f01e0a = g_f0f7ca ^ g_f01e0a;
    g_f01e0c = g_f0f7cc ^ g_f01e0c;
    g_f01e0e = g_f0f7ce ^ g_f01e0e;
    g_f01e58 = g_f01e58 ^ 7464519296214239859;
    return v0;
}
