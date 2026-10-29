/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2275ec..0x227684 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02c10;
extern unsigned short g_f02c12;
extern unsigned short g_f02c14;
extern unsigned short g_f02c16;
extern unsigned long long g_f02ca0;
extern unsigned short g_f11570;
extern unsigned short g_f11572;
extern unsigned short g_f11574;
extern unsigned short g_f11576;

long long sub_2275ec(void)
{
    unsigned long v0;  // x0

    g_f11570 = 56124;
    g_f11572 = 18344;
    g_f11574 = 39547;
    g_f11576 = 55746;
    g_f02c10 = g_f11570 ^ g_f02c10;
    g_f02c12 = g_f11572 ^ g_f02c12;
    g_f02c14 = g_f11574 ^ g_f02c14;
    g_f02c16 = g_f11576 ^ g_f02c16;
    g_f02ca0 = g_f02ca0 ^ 15691273905986132796;
    return v0;
}
