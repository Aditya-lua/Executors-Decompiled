/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xe7a08..0xe7aa0 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01460;
extern unsigned short g_f01462;
extern unsigned short g_f01464;
extern unsigned short g_f01466;
extern unsigned long long g_f014f0;
extern unsigned short g_f0dd40;
extern unsigned short g_f0dd42;
extern unsigned short g_f0dd44;
extern unsigned short g_f0dd46;

long long sub_e7a08(void)
{
    unsigned long v0;  // x0

    g_f0dd40 = 44381;
    g_f0dd42 = 31022;
    g_f0dd44 = 20400;
    g_f0dd46 = 64205;
    g_f01460 = g_f0dd40 ^ g_f01460;
    g_f01462 = g_f0dd42 ^ g_f01462;
    g_f01464 = g_f0dd44 ^ g_f01464;
    g_f01466 = g_f0dd46 ^ g_f01466;
    g_f014f0 = g_f014f0 ^ 18072188499073609053;
    return v0;
}
