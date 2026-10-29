/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xe86e4..0xe877c (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01428;
extern unsigned short g_f0142a;
extern unsigned short g_f0142c;
extern unsigned short g_f0142e;
extern unsigned long long g_f014b8;
extern unsigned short g_f0dd08;
extern unsigned short g_f0dd0a;
extern unsigned short g_f0dd0c;
extern unsigned short g_f0dd0e;

long long sub_e86e4(void)
{
    unsigned long v0;  // x0

    g_f0dd08 = 51158;
    g_f0dd0a = 50168;
    g_f0dd0c = 55418;
    g_f0dd0e = 8430;
    g_f01428 = g_f0dd08 ^ g_f01428;
    g_f0142a = g_f0dd0a ^ g_f0142a;
    g_f0142c = g_f0dd0c ^ g_f0142c;
    g_f0142e = g_f0dd0e ^ g_f0142e;
    g_f014b8 = g_f014b8 ^ 2373072075456301014;
    return v0;
}
