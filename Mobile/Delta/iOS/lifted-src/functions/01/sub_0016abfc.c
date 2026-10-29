/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x16abfc..0x16ac94 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01ff0;
extern unsigned short g_f01ff2;
extern unsigned short g_f01ff4;
extern unsigned short g_f01ff6;
extern unsigned long long g_f01ff8;
extern unsigned short g_f0fcf8;
extern unsigned short g_f0fcfa;
extern unsigned short g_f0fcfc;
extern unsigned short g_f0fcfe;

long long sub_16abfc(void)
{
    unsigned long v0;  // x0

    g_f0fcf8 = 53710;
    g_f0fcfa = 1540;
    g_f0fcfc = 32863;
    g_f0fcfe = 6990;
    g_f01ff0 = g_f0fcf8 ^ g_f01ff0;
    g_f01ff2 = g_f0fcfa ^ g_f01ff2;
    g_f01ff4 = g_f0fcfc ^ g_f01ff4;
    g_f01ff6 = g_f0fcfe ^ g_f01ff6;
    g_f01ff8 = g_f01ff8 ^ 1967651232818713038;
    return v0;
}
