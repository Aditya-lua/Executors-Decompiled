/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xe8310..0xe83a8 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01448;
extern unsigned short g_f0144a;
extern unsigned short g_f0144c;
extern unsigned short g_f0144e;
extern unsigned long long g_f014d8;
extern unsigned short g_f0dd28;
extern unsigned short g_f0dd2a;
extern unsigned short g_f0dd2c;
extern unsigned short g_f0dd2e;

long long sub_e8310(void)
{
    unsigned long v0;  // x0

    g_f0dd28 = 1635;
    g_f0dd2a = 13849;
    g_f0dd2c = 54137;
    g_f0dd2e = 2852;
    g_f01448 = g_f0dd28 ^ g_f01448;
    g_f0144a = g_f0dd2a ^ g_f0144a;
    g_f0144c = g_f0dd2c ^ g_f0144c;
    g_f0144e = g_f0dd2e ^ g_f0144e;
    g_f014d8 = g_f014d8 ^ 802999151130904163;
    return v0;
}
