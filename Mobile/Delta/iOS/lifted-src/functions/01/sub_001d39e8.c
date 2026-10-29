/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1d39e8..0x1d3a80 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02540;
extern unsigned short g_f02542;
extern unsigned short g_f02544;
extern unsigned short g_f02546;
extern unsigned long long g_f02608;
extern unsigned short g_f107f8;
extern unsigned short g_f107fa;
extern unsigned short g_f107fc;
extern unsigned short g_f107fe;

long long sub_1d39e8(void)
{
    unsigned long v0;  // x0

    g_f107f8 = 36773;
    g_f107fa = 22729;
    g_f107fc = 43903;
    g_f107fe = 32068;
    g_f02540 = g_f107f8 ^ g_f02540;
    g_f02542 = g_f107fa ^ g_f02542;
    g_f02544 = g_f107fc ^ g_f02544;
    g_f02546 = g_f107fe ^ g_f02546;
    g_f02608 = g_f02608 ^ 9026528116596117413;
    return v0;
}
