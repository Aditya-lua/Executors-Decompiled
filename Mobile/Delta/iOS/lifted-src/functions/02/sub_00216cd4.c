/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x216cd4..0x216d6c (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f029b0;
extern unsigned short g_f029b2;
extern unsigned short g_f029b4;
extern unsigned short g_f029b6;
extern unsigned long long g_f02ac0;
extern unsigned short g_f10fc8;
extern unsigned short g_f10fca;
extern unsigned short g_f10fcc;
extern unsigned short g_f10fce;

long long sub_216cd4(void)
{
    unsigned long v0;  // x0

    g_f10fc8 = 27838;
    g_f10fca = 24714;
    g_f10fcc = 63914;
    g_f10fce = 30656;
    g_f029b0 = g_f10fc8 ^ g_f029b0;
    g_f029b2 = g_f10fca ^ g_f029b2;
    g_f029b4 = g_f10fcc ^ g_f029b4;
    g_f029b6 = g_f10fce ^ g_f029b6;
    g_f02ac0 = g_f02ac0 ^ 8629171396201311422;
    return v0;
}
