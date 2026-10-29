/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xe7ce0..0xe7d78 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01468;
extern unsigned short g_f0146a;
extern unsigned short g_f0146c;
extern unsigned short g_f0146e;
extern unsigned long long g_f014f8;
extern unsigned short g_f0dd48;
extern unsigned short g_f0dd4a;
extern unsigned short g_f0dd4c;
extern unsigned short g_f0dd4e;

long long sub_e7ce0(void)
{
    unsigned long v0;  // x0

    g_f0dd48 = 17648;
    g_f0dd4a = 45863;
    g_f0dd4c = 52848;
    g_f0dd4e = 62810;
    g_f01468 = g_f0dd48 ^ g_f01468;
    g_f0146a = g_f0dd4a ^ g_f0146a;
    g_f0146c = g_f0dd4c ^ g_f0146c;
    g_f0146e = g_f0dd4e ^ g_f0146e;
    g_f014f8 = g_f014f8 ^ 17679670270633657584;
    return v0;
}
