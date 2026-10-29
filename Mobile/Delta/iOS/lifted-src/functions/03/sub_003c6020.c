/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3c6020..0x3c60ec (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_f02398;
extern char g_f023a0;
extern unsigned short g_f023b8;
extern unsigned short g_f023bc;
extern unsigned short g_f023c0;
extern unsigned long long g_f023c8;
extern unsigned short g_f0290c;
extern unsigned short g_f02910;
extern unsigned short g_f038dc;
extern unsigned short g_f038e0;
extern unsigned short g_f038e8;

long long sub_3c6020(void)
{
    unsigned long v0;  // x0

    if (g_f023a0 & 1)
        return v0;
    g_f023a0 = 1;
    g_f038dc = 31890;
    g_f023bc = 1686;
    g_f038e0 = 26845;
    g_f023c0 = 34863;
    g_f023b8 = g_f038dc ^ g_f023b8;
    g_f0290c = g_f023bc ^ g_f0290c;
    g_f02910 = g_f038e0 ^ g_f02910;
    g_f038e8 = g_f023c0 ^ g_f038e8;
    g_f023c8 = g_f023c8 ^ 9813177411571186834;
    *(unsigned int *)&g_f02398 = 0;
    return v0;
}
