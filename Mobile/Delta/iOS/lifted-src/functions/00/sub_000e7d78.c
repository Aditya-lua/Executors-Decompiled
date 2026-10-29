/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xe7d78..0xe7e10 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01418;
extern unsigned short g_f0141a;
extern unsigned short g_f0141c;
extern unsigned short g_f0141e;
extern unsigned long long g_f014a8;
extern unsigned short g_f0dcf8;
extern unsigned short g_f0dcfa;
extern unsigned short g_f0dcfc;
extern unsigned short g_f0dcfe;

long long sub_e7d78(void)
{
    unsigned long v0;  // x0

    g_f0dcf8 = 57567;
    g_f0dcfa = 45483;
    g_f0dcfc = 56061;
    g_f0dcfe = 11219;
    g_f01418 = g_f0dcf8 ^ g_f01418;
    g_f0141a = g_f0dcfa ^ g_f0141a;
    g_f0141c = g_f0dcfc ^ g_f0141c;
    g_f0141e = g_f0dcfe ^ g_f0141e;
    g_f014a8 = g_f014a8 ^ 3158108546859262175;
    return v0;
}
