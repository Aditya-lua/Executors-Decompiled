/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2162ec..0x216384 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02918;
extern unsigned short g_f0291a;
extern unsigned short g_f0291c;
extern unsigned short g_f0291e;
extern unsigned long long g_f02a28;
extern unsigned short g_f10f30;
extern unsigned short g_f10f32;
extern unsigned short g_f10f34;
extern unsigned short g_f10f36;

long long sub_2162ec(void)
{
    unsigned long v0;  // x0

    g_f10f30 = 33695;
    g_f10f32 = 2502;
    g_f10f34 = 37234;
    g_f10f36 = 57152;
    g_f02918 = g_f10f30 ^ g_f02918;
    g_f0291a = g_f10f32 ^ g_f0291a;
    g_f0291c = g_f10f34 ^ g_f0291c;
    g_f0291e = g_f10f36 ^ g_f0291e;
    g_f02a28 = g_f02a28 ^ 16087017787943715743;
    return v0;
}
