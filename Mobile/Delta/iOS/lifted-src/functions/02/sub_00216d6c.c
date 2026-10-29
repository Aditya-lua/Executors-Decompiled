/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x216d6c..0x216e04 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02a10;
extern unsigned short g_f02a12;
extern unsigned short g_f02a14;
extern unsigned short g_f02a16;
extern unsigned long long g_f02b20;
extern unsigned short g_f11028;
extern unsigned short g_f1102a;
extern unsigned short g_f1102c;
extern unsigned short g_f1102e;

long long sub_216d6c(void)
{
    unsigned long v0;  // x0

    g_f11028 = 15302;
    g_f1102a = 28085;
    g_f1102c = 60067;
    g_f1102e = 13922;
    g_f02a10 = g_f11028 ^ g_f02a10;
    g_f02a12 = g_f1102a ^ g_f02a12;
    g_f02a14 = g_f1102c ^ g_f02a14;
    g_f02a16 = g_f1102e ^ g_f02a16;
    g_f02b20 = g_f02b20 ^ 3918952613406915526;
    return v0;
}
