/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1d664c..0x1d66e4 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f026a8;
extern unsigned short g_f026aa;
extern unsigned short g_f026ac;
extern unsigned short g_f026ae;
extern unsigned long long g_f026c0;
extern unsigned short g_f10b98;
extern unsigned short g_f10b9a;
extern unsigned short g_f10b9c;
extern unsigned short g_f10b9e;

long long sub_1d664c(void)
{
    unsigned long v0;  // x0

    g_f10b98 = 19867;
    g_f10b9a = 12837;
    g_f10b9c = 62246;
    g_f10b9e = 34851;
    g_f026a8 = g_f10b98 ^ g_f026a8;
    g_f026aa = g_f10b9a ^ g_f026aa;
    g_f026ac = g_f10b9c ^ g_f026ac;
    g_f026ae = g_f10b9e ^ g_f026ae;
    g_f026c0 = g_f026c0 ^ 9809951758718684571;
    return v0;
}
