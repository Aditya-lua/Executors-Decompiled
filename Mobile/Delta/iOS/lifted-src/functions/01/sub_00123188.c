/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x123188..0x123220 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01978;
extern unsigned short g_f0197a;
extern unsigned short g_f0197c;
extern unsigned short g_f0197e;
extern unsigned long long g_f01a60;
extern unsigned short g_f0ea18;
extern unsigned short g_f0ea1a;
extern unsigned short g_f0ea1c;
extern unsigned short g_f0ea1e;

long long sub_123188(void)
{
    unsigned long v0;  // x0

    g_f0ea18 = 6620;
    g_f0ea1a = 35874;
    g_f0ea1c = 924;
    g_f0ea1e = 33509;
    g_f01978 = g_f0ea18 ^ g_f01978;
    g_f0197a = g_f0ea1a ^ g_f0197a;
    g_f0197c = g_f0ea1c ^ g_f0197c;
    g_f0197e = g_f0ea1e ^ g_f0197e;
    g_f01a60 = g_f01a60 ^ 9431948965498198492;
    return v0;
}
