/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x227f40..0x227fd8 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02bf8;
extern unsigned short g_f02bfa;
extern unsigned short g_f02bfc;
extern unsigned short g_f02bfe;
extern unsigned long long g_f02c88;
extern unsigned short g_f11558;
extern unsigned short g_f1155a;
extern unsigned short g_f1155c;
extern unsigned short g_f1155e;

long long sub_227f40(void)
{
    unsigned long v0;  // x0

    g_f11558 = 9314;
    g_f1155a = 6502;
    g_f1155c = 7736;
    g_f1155e = 59930;
    g_f02bf8 = g_f11558 ^ g_f02bf8;
    g_f02bfa = g_f1155a ^ g_f02bfa;
    g_f02bfc = g_f1155c ^ g_f02bfc;
    g_f02bfe = g_f1155e ^ g_f02bfe;
    g_f02c88 = g_f02c88 ^ 16868828580562740322;
    return v0;
}
