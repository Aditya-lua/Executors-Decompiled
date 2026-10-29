/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2c906c..0x2c9138 (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_f01320;
extern char g_f01328;
extern unsigned short g_f01348;
extern unsigned short g_f0134a;
extern unsigned short g_f0134c;
extern unsigned short g_f0134e;
extern unsigned short g_f01350;
extern unsigned short g_f01352;
extern unsigned short g_f01354;
extern unsigned short g_f01356;
extern unsigned long long g_f01358;

long long sub_2c906c(void)
{
    unsigned long v0;  // x0

    if (g_f01328 & 1)
        return v0;
    g_f01328 = 1;
    g_f0134a = 3272;
    g_f0134c = 53781;
    g_f0134e = 64393;
    g_f01350 = 47476;
    g_f01348 = g_f0134a ^ g_f01348;
    g_f01352 = g_f0134c ^ g_f01352;
    g_f01354 = g_f0134e ^ g_f01354;
    g_f01356 = g_f01350 ^ g_f01356;
    g_f01358 = g_f01358 ^ 13363582563668790472;
    *(unsigned int *)&g_f01320 = 0;
    return v0;
}
