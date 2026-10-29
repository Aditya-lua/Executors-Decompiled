/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1e89ec..0x1e8a84 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f027d0;
extern unsigned short g_f027d2;
extern unsigned short g_f027d4;
extern unsigned short g_f027d6;
extern unsigned long long g_f027f8;
extern unsigned short g_f10de0;
extern unsigned short g_f10de2;
extern unsigned short g_f10de4;
extern unsigned short g_f10de6;

long long sub_1e89ec(void)
{
    unsigned long v0;  // x0

    g_f10de0 = 34806;
    g_f10de2 = 10911;
    g_f10de4 = 17609;
    g_f10de6 = 48791;
    g_f027d0 = g_f10de0 ^ g_f027d0;
    g_f027d2 = g_f10de2 ^ g_f027d2;
    g_f027d4 = g_f10de4 ^ g_f027d4;
    g_f027d6 = g_f10de6 ^ g_f027d6;
    g_f027f8 = g_f027f8 ^ 13733521219483830262;
    return v0;
}
