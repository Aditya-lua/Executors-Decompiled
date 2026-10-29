/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1081ec..0x108284 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01638;
extern unsigned short g_f0163a;
extern unsigned short g_f0163c;
extern unsigned short g_f0163e;
extern unsigned long long g_f01778;
extern unsigned short g_f0e150;
extern unsigned short g_f0e152;
extern unsigned short g_f0e154;
extern unsigned short g_f0e156;

long long sub_1081ec(void)
{
    unsigned long v0;  // x0

    g_f0e150 = 17522;
    g_f0e152 = 36428;
    g_f0e154 = 34256;
    g_f0e156 = 47465;
    g_f01638 = g_f0e150 ^ g_f01638;
    g_f0163a = g_f0e152 ^ g_f0163a;
    g_f0163c = g_f0e154 ^ g_f0163c;
    g_f0163e = g_f0e156 ^ g_f0163e;
    g_f01778 = g_f01778 ^ 13360356900358341746;
    return v0;
}
