/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xe8a80..0xe8b18 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01470;
extern unsigned short g_f01472;
extern unsigned short g_f01474;
extern unsigned short g_f01476;
extern unsigned long long g_f01500;
extern unsigned short g_f0dd50;
extern unsigned short g_f0dd52;
extern unsigned short g_f0dd54;
extern unsigned short g_f0dd56;

long long sub_e8a80(void)
{
    unsigned long v0;  // x0

    g_f0dd50 = 62468;
    g_f0dd52 = 64479;
    g_f0dd54 = 19761;
    g_f0dd56 = 61416;
    g_f01470 = g_f0dd50 ^ g_f01470;
    g_f01472 = g_f0dd52 ^ g_f01472;
    g_f01474 = g_f0dd54 ^ g_f01474;
    g_f01476 = g_f0dd56 ^ g_f01476;
    g_f01500 = g_f01500 ^ 0xefe84d31fbdff404;
    return v0;
}
