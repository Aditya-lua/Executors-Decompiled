/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x18cee8..0x18cf80 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02130;
extern unsigned short g_f02132;
extern unsigned short g_f02134;
extern unsigned short g_f02136;
extern unsigned long long g_f02240;
extern unsigned short g_f10068;
extern unsigned short g_f1006a;
extern unsigned short g_f1006c;
extern unsigned short g_f1006e;

long long sub_18cee8(void)
{
    unsigned long v0;  // x0

    g_f10068 = 41268;
    g_f1006a = 35890;
    g_f1006c = 20042;
    g_f1006e = 16746;
    g_f02130 = g_f10068 ^ g_f02130;
    g_f02132 = g_f1006a ^ g_f02132;
    g_f02134 = g_f1006c ^ g_f02134;
    g_f02136 = g_f1006e ^ g_f02136;
    g_f02240 = g_f02240 ^ 4713666042083320116;
    return v0;
}
