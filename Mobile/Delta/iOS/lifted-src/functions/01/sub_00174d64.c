/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x174d64..0x174dfc (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02018;
extern unsigned short g_f0201a;
extern unsigned short g_f0201c;
extern unsigned short g_f0201e;
extern unsigned long long g_f020a0;
extern unsigned short g_f0fd68;
extern unsigned short g_f0fd6a;
extern unsigned short g_f0fd6c;
extern unsigned short g_f0fd6e;

long long sub_174d64(void)
{
    unsigned long v0;  // x0

    g_f0fd68 = 991;
    g_f0fd6a = 61761;
    g_f0fd6c = 64028;
    g_f0fd6e = 0x11;
    g_f02018 = g_f0fd68 ^ g_f02018;
    g_f0201a = g_f0fd6a ^ g_f0201a;
    g_f0201c = g_f0fd6c ^ g_f0201c;
    g_f0201e = g_f0fd6e ^ g_f0201e;
    g_f020a0 = g_f020a0 ^ 5060076817679327;
    return v0;
}
