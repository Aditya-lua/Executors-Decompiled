/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xe8f80..0xe9018 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01480;
extern unsigned short g_f01482;
extern unsigned short g_f01484;
extern unsigned short g_f01486;
extern unsigned long long g_f01510;
extern unsigned short g_f0dd60;
extern unsigned short g_f0dd62;
extern unsigned short g_f0dd64;
extern unsigned short g_f0dd66;

long long sub_e8f80(void)
{
    unsigned long v0;  // x0

    g_f0dd60 = 16170;
    g_f0dd62 = 29164;
    g_f0dd64 = 19122;
    g_f0dd66 = 58627;
    g_f01480 = g_f0dd60 ^ g_f01480;
    g_f01482 = g_f0dd62 ^ g_f01482;
    g_f01484 = g_f0dd64 ^ g_f01484;
    g_f01486 = g_f0dd66 ^ g_f01486;
    g_f01510 = g_f01510 ^ 16502115589891571498;
    return v0;
}
