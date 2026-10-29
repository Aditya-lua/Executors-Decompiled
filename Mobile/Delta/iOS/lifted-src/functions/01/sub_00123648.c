/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x123648..0x1236e0 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f019b8;
extern unsigned short g_f019ba;
extern unsigned short g_f019bc;
extern unsigned short g_f019be;
extern unsigned long long g_f01aa0;
extern unsigned short g_f0ea58;
extern unsigned short g_f0ea5a;
extern unsigned short g_f0ea5c;
extern unsigned short g_f0ea5e;

long long sub_123648(void)
{
    unsigned long v0;  // x0

    g_f0ea58 = 62663;
    g_f0ea5a = 19178;
    g_f0ea5c = 63889;
    g_f0ea5e = 22352;
    g_f019b8 = g_f0ea58 ^ g_f019b8;
    g_f019ba = g_f0ea5a ^ g_f019ba;
    g_f019bc = g_f0ea5c ^ g_f019bc;
    g_f019be = g_f0ea5e ^ g_f019be;
    g_f01aa0 = g_f01aa0 ^ 6291803081859069127;
    return v0;
}
