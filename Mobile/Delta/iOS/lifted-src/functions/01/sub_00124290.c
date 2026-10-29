/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x124290..0x124328 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f019a0;
extern unsigned short g_f019a2;
extern unsigned short g_f019a4;
extern unsigned short g_f019a6;
extern unsigned long long g_f01a88;
extern unsigned short g_f0ea40;
extern unsigned short g_f0ea42;
extern unsigned short g_f0ea44;
extern unsigned short g_f0ea46;

long long sub_124290(void)
{
    unsigned long v0;  // x0

    g_f0ea40 = 61325;
    g_f0ea42 = 36139;
    g_f0ea44 = 32086;
    g_f0ea46 = 26536;
    g_f019a0 = g_f0ea40 ^ g_f019a0;
    g_f019a2 = g_f0ea42 ^ g_f019a2;
    g_f019a4 = g_f0ea44 ^ g_f019a4;
    g_f019a6 = g_f0ea46 ^ g_f019a6;
    g_f01a88 = g_f01a88 ^ 7469357792683093901;
    return v0;
}
