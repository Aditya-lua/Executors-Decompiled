/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a1e58..0x1a1ef0 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02428;
extern unsigned short g_f0242a;
extern unsigned short g_f0242c;
extern unsigned short g_f0242e;
extern unsigned long long g_f02490;
extern unsigned short g_f10600;
extern unsigned short g_f10602;
extern unsigned short g_f10604;
extern unsigned short g_f10606;

long long sub_1a1e58(void)
{
    unsigned long v0;  // x0

    g_f10600 = 28288;
    g_f10602 = 49720;
    g_f10604 = 22352;
    g_f10606 = 15340;
    g_f02428 = g_f10600 ^ g_f02428;
    g_f0242a = g_f10602 ^ g_f0242a;
    g_f0242c = g_f10604 ^ g_f0242c;
    g_f0242e = g_f10606 ^ g_f0242e;
    g_f02490 = g_f02490 ^ 4317922147108941440;
    return v0;
}
