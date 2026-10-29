/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x15d8d0..0x15d968 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01ea0;
extern unsigned short g_f01ea2;
extern unsigned short g_f01ea4;
extern unsigned short g_f01ea6;
extern unsigned long long g_f01f00;
extern unsigned short g_f0f948;
extern unsigned short g_f0f94a;
extern unsigned short g_f0f94c;
extern unsigned short g_f0f94e;

long long sub_15d8d0(void)
{
    unsigned long v0;  // x0

    g_f0f948 = 41442;
    g_f0f94a = 23701;
    g_f0f94c = 46328;
    g_f0f94e = 23;
    g_f01ea0 = g_f0f948 ^ g_f01ea0;
    g_f01ea2 = g_f0f94a ^ g_f01ea2;
    g_f01ea4 = g_f0f94c ^ g_f01ea4;
    g_f01ea6 = g_f0f94e ^ g_f01ea6;
    g_f01f00 = g_f01f00 ^ 6672903262544354;
    return v0;
}
