/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x174908..0x1749a0 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02030;
extern unsigned short g_f02032;
extern unsigned short g_f02034;
extern unsigned short g_f02036;
extern unsigned long long g_f020b8;
extern unsigned short g_f0fd80;
extern unsigned short g_f0fd82;
extern unsigned short g_f0fd84;
extern unsigned short g_f0fd86;

long long sub_174908(void)
{
    unsigned long v0;  // x0

    g_f0fd80 = 46249;
    g_f0fd82 = 19463;
    g_f0fd84 = 30300;
    g_f0fd86 = 61370;
    g_f02030 = g_f0fd80 ^ g_f02030;
    g_f02032 = g_f0fd82 ^ g_f02032;
    g_f02034 = g_f0fd84 ^ g_f02034;
    g_f02036 = g_f0fd86 ^ g_f02036;
    g_f020b8 = g_f020b8 ^ 17274249459517600937;
    return v0;
}
