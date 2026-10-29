/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x123ecc..0x123f64 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01998;
extern unsigned short g_f0199a;
extern unsigned short g_f0199c;
extern unsigned short g_f0199e;
extern unsigned long long g_f01a80;
extern unsigned short g_f0ea38;
extern unsigned short g_f0ea3a;
extern unsigned short g_f0ea3c;
extern unsigned short g_f0ea3e;

long long sub_123ecc(void)
{
    unsigned long v0;  // x0

    g_f0ea38 = 27146;
    g_f0ea3a = 11628;
    g_f0ea3c = 65173;
    g_f0ea3e = 27930;
    g_f01998 = g_f0ea38 ^ g_f01998;
    g_f0199a = g_f0ea3a ^ g_f0199a;
    g_f0199c = g_f0ea3c ^ g_f0199c;
    g_f0199e = g_f0ea3e ^ g_f0199e;
    g_f01a80 = g_f01a80 ^ 7861876016194284042;
    return v0;
}
