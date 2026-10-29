/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x12412c..0x1241c4 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f019f8;
extern unsigned short g_f019fa;
extern unsigned short g_f019fc;
extern unsigned short g_f019fe;
extern unsigned long long g_f01ae0;
extern unsigned short g_f0ea98;
extern unsigned short g_f0ea9a;
extern unsigned short g_f0ea9c;
extern unsigned short g_f0ea9e;

long long sub_12412c(void)
{
    unsigned long v0;  // x0

    g_f0ea98 = 6114;
    g_f0ea9a = 6199;
    g_f0ea9c = 61326;
    g_f0ea9e = 11196;
    g_f019f8 = g_f0ea98 ^ g_f019f8;
    g_f019fa = g_f0ea9a ^ g_f019fa;
    g_f019fc = g_f0ea9c ^ g_f019fc;
    g_f019fe = g_f0ea9e ^ g_f019fe;
    g_f01ae0 = g_f01ae0 ^ 3151657232823162850;
    return v0;
}
