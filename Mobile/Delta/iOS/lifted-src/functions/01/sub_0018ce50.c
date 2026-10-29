/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x18ce50..0x18cee8 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02160;
extern unsigned short g_f02162;
extern unsigned short g_f02164;
extern unsigned short g_f02166;
extern unsigned long long g_f02270;
extern unsigned short g_f10098;
extern unsigned short g_f1009a;
extern unsigned short g_f1009c;
extern unsigned short g_f1009e;

long long sub_18ce50(void)
{
    unsigned long v0;  // x0

    g_f10098 = 4040;
    g_f1009a = 689;
    g_f1009c = 18116;
    g_f1009e = 8379;
    g_f02160 = g_f10098 ^ g_f02160;
    g_f02162 = g_f1009a ^ g_f02162;
    g_f02164 = g_f1009c ^ g_f02164;
    g_f02166 = g_f1009e ^ g_f02166;
    g_f02270 = g_f02270 ^ 2358556637531279304;
    return v0;
}
