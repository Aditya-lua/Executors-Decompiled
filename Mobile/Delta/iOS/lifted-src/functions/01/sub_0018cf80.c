/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x18cf80..0x18d018 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02218;
extern unsigned short g_f0221a;
extern unsigned short g_f0221c;
extern unsigned short g_f0221e;
extern unsigned long long g_f02328;
extern unsigned short g_f10150;
extern unsigned short g_f10152;
extern unsigned short g_f10154;
extern unsigned short g_f10156;

long long sub_18cf80(void)
{
    unsigned long v0;  // x0

    g_f10150 = 8836;
    g_f10152 = 34661;
    g_f10154 = 43506;
    g_f10156 = 41841;
    g_f02218 = g_f10150 ^ g_f02218;
    g_f0221a = g_f10152 ^ g_f0221a;
    g_f0221c = g_f10154 ^ g_f0221c;
    g_f0221e = g_f10156 ^ g_f0221e;
    g_f02328 = g_f02328 ^ 11777381359669289604;
    return v0;
}
