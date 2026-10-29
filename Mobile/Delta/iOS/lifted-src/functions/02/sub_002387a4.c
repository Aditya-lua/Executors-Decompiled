/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2387a4..0x238870 (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_f01200;
extern char g_f01208;
extern unsigned short g_f01278;
extern unsigned short g_f0127a;
extern unsigned short g_f0127c;
extern unsigned short g_f0127e;
extern unsigned short g_f01280;
extern unsigned long long g_f01288;
extern unsigned short g_f013ec;
extern unsigned short g_f013f0;
extern unsigned short g_f013f4;

long long sub_2387a4(void)
{
    unsigned long v0;  // x0

    if (g_f01208 & 1)
        return v0;
    g_f01208 = 1;
    g_f0127a = 35522;
    g_f0127c = 31872;
    g_f0127e = 7193;
    g_f01280 = 18198;
    g_f01278 = g_f0127a ^ g_f01278;
    g_f013ec = g_f0127c ^ g_f013ec;
    g_f013f0 = g_f0127e ^ g_f013f0;
    g_f013f4 = g_f01280 ^ g_f013f4;
    g_f01288 = g_f01288 ^ 5122312521969076930;
    *(unsigned int *)&g_f01200 = 0;
    return v0;
}
