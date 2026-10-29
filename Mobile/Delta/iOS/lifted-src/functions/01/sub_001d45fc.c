/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1d45fc..0x1d4694 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02528;
extern unsigned short g_f0252a;
extern unsigned short g_f0252c;
extern unsigned short g_f0252e;
extern unsigned long long g_f025f0;
extern unsigned short g_f107e0;
extern unsigned short g_f107e2;
extern unsigned short g_f107e4;
extern unsigned short g_f107e6;

long long sub_1d45fc(void)
{
    unsigned long v0;  // x0

    g_f107e0 = 55547;
    g_f107e2 = 7686;
    g_f107e4 = 12090;
    g_f107e6 = 36252;
    g_f02528 = g_f107e0 ^ g_f02528;
    g_f0252a = g_f107e2 ^ g_f0252a;
    g_f0252c = g_f107e4 ^ g_f0252c;
    g_f0252e = g_f107e6 ^ g_f0252e;
    g_f025f0 = g_f025f0 ^ 10204082782373075195;
    return v0;
}
