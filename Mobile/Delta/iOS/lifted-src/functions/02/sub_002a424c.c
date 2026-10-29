/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2a424c..0x2a4318 (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_f02330;
extern char g_f02338;
extern unsigned short g_f02350;
extern unsigned short g_f02352;
extern unsigned short g_f02354;
extern unsigned short g_f02358;
extern unsigned short g_f0235a;
extern unsigned short g_f0235c;
extern unsigned long long g_f02360;
extern unsigned short g_f02504;
extern unsigned short g_f02508;

long long sub_2a424c(void)
{
    unsigned long v0;  // x0

    if (g_f02338 & 1)
        return v0;
    g_f02338 = 1;
    g_f02352 = 52758;
    g_f02504 = 43731;
    g_f0235a = 63782;
    g_f02508 = 0xceff;
    g_f02350 = g_f02352 ^ g_f02350;
    g_f02354 = g_f02504 ^ g_f02354;
    g_f02358 = g_f0235a ^ g_f02358;
    g_f0235c = g_f02508 ^ g_f0235c;
    g_f02360 = g_f02360 ^ 0xcefff926aad3ce16;
    *(unsigned int *)&g_f02330 = 0;
    return v0;
}
