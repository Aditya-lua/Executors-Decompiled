/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x13b190..0x13b228 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01b88;
extern unsigned short g_f01b8a;
extern unsigned short g_f01b8c;
extern unsigned short g_f01b8e;
extern unsigned long long g_f01c88;
extern unsigned short g_f0eec0;
extern unsigned short g_f0eec2;
extern unsigned short g_f0eec4;
extern unsigned short g_f0eec6;

long long sub_13b190(void)
{
    unsigned long v0;  // x0

    g_f0eec0 = 60536;
    g_f0eec2 = 49537;
    g_f0eec4 = 45298;
    g_f0eec6 = 7007;
    g_f01b88 = g_f0eec0 ^ g_f01b88;
    g_f01b8a = g_f0eec2 ^ g_f01b8a;
    g_f01b8c = g_f0eec4 ^ g_f01b8c;
    g_f01b8e = g_f0eec6 ^ g_f01b8e;
    g_f01c88 = g_f01c88 ^ 1972489718486658168;
    return v0;
}
