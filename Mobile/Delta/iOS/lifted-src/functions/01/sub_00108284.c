/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x108284..0x10831c (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01650;
extern unsigned short g_f01652;
extern unsigned short g_f01654;
extern unsigned short g_f01656;
extern unsigned long long g_f01790;
extern unsigned short g_f0e168;
extern unsigned short g_f0e16a;
extern unsigned short g_f0e16c;
extern unsigned short g_f0e16e;

long long sub_108284(void)
{
    unsigned long v0;  // x0

    g_f0e168 = 36492;
    g_f0e16a = 52629;
    g_f0e16c = 534;
    g_f0e16e = 43282;
    g_f01650 = g_f0e168 ^ g_f01650;
    g_f01652 = g_f0e16a ^ g_f01652;
    g_f01654 = g_f0e16c ^ g_f01654;
    g_f01656 = g_f0e16e ^ g_f01656;
    g_f01790 = g_f01790 ^ 12182802238952279692;
    return v0;
}
