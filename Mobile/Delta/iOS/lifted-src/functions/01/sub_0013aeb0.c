/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x13aeb0..0x13af48 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01ba0;
extern unsigned short g_f01ba2;
extern unsigned short g_f01ba4;
extern unsigned short g_f01ba6;
extern unsigned long long g_f01ca0;
extern unsigned short g_f0eed8;
extern unsigned short g_f0eeda;
extern unsigned short g_f0eedc;
extern unsigned short g_f0eede;

long long sub_13aeb0(void)
{
    unsigned long v0;  // x0

    g_f0eed8 = 63138;
    g_f0eeda = 960;
    g_f0eedc = 11568;
    g_f0eede = 2824;
    g_f01ba0 = g_f0eed8 ^ g_f01ba0;
    g_f01ba2 = g_f0eeda ^ g_f01ba2;
    g_f01ba4 = g_f0eedc ^ g_f01ba4;
    g_f01ba6 = g_f0eede ^ g_f01ba6;
    g_f01ca0 = g_f01ca0 ^ 794935018475550370;
    return v0;
}
