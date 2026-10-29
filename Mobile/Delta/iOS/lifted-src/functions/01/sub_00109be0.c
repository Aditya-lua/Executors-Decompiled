/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x109be0..0x109c78 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f015f8;
extern unsigned short g_f015fa;
extern unsigned short g_f015fc;
extern unsigned short g_f015fe;
extern unsigned long long g_f01738;
extern unsigned short g_f0e110;
extern unsigned short g_f0e112;
extern unsigned short g_f0e114;
extern unsigned short g_f0e116;

long long sub_109be0(void)
{
    unsigned long v0;  // x0

    g_f0e110 = 18775;
    g_f0e112 = 51313;
    g_f0e114 = 36830;
    g_f0e116 = 58621;
    g_f015f8 = g_f0e110 ^ g_f015f8;
    g_f015fa = g_f0e112 ^ g_f015fa;
    g_f015fc = g_f0e114 ^ g_f015fc;
    g_f015fe = g_f0e116 ^ g_f015fe;
    g_f01738 = g_f01738 ^ 16500502796763744599;
    return v0;
}
