/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x14f980..0x14fa18 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01dd8;
extern unsigned short g_f01dda;
extern unsigned short g_f01ddc;
extern unsigned short g_f01dde;
extern unsigned long long g_f01e28;
extern unsigned short g_f0f798;
extern unsigned short g_f0f79a;
extern unsigned short g_f0f79c;
extern unsigned short g_f0f79e;

long long sub_14f980(void)
{
    unsigned long v0;  // x0

    g_f0f798 = 42959;
    g_f0f79a = 45920;
    g_f0f79c = 21570;
    g_f0f79e = 34886;
    g_f01dd8 = g_f0f798 ^ g_f01dd8;
    g_f01dda = g_f0f79a ^ g_f01dda;
    g_f01ddc = g_f0f79c ^ g_f01ddc;
    g_f01dde = g_f0f79e ^ g_f01dde;
    g_f01e28 = g_f01e28 ^ 9819628682981976015;
    return v0;
}
