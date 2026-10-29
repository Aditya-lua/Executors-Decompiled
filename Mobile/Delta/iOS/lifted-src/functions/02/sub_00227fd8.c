/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x227fd8..0x228070 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02be0;
extern unsigned short g_f02be2;
extern unsigned short g_f02be4;
extern unsigned short g_f02be6;
extern unsigned long long g_f02c70;
extern unsigned short g_f11540;
extern unsigned short g_f11542;
extern unsigned short g_f11544;
extern unsigned short g_f11546;

long long sub_227fd8(void)
{
    unsigned long v0;  // x0

    g_f11540 = 45672;
    g_f11542 = 55868;
    g_f11544 = 41478;
    g_f11546 = 64113;
    g_f02be0 = g_f11540 ^ g_f02be0;
    g_f02be2 = g_f11542 ^ g_f02be2;
    g_f02be4 = g_f11544 ^ g_f02be4;
    g_f02be6 = g_f11546 ^ g_f02be6;
    g_f02c70 = g_f02c70 ^ 18046383332165202536;
    return v0;
}
