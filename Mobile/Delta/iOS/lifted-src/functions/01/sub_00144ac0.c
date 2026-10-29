/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x144ac0..0x144b58 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01d78;
extern unsigned short g_f01d7a;
extern unsigned short g_f01d7c;
extern unsigned short g_f01d7e;
extern unsigned long long g_f01da8;
extern unsigned short g_f0f3b0;
extern unsigned short g_f0f3b2;
extern unsigned short g_f0f3b4;
extern unsigned short g_f0f3b6;

long long sub_144ac0(void)
{
    unsigned long v0;  // x0

    g_f0f3b0 = 9079;
    g_f0f3b2 = 48158;
    g_f0f3b4 = 25419;
    g_f0f3b6 = 51620;
    g_f01d78 = g_f0f3b0 ^ g_f01d78;
    g_f01d7a = g_f0f3b2 ^ g_f01d7a;
    g_f01d7c = g_f0f3b4 ^ g_f01d7c;
    g_f01d7e = g_f0f3b6 ^ g_f01d7e;
    g_f01da8 = g_f01da8 ^ 14529847474733851511;
    return v0;
}
