/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x228400..0x228498 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02bd0;
extern unsigned short g_f02bd2;
extern unsigned short g_f02bd4;
extern unsigned short g_f02bd6;
extern unsigned long long g_f02c60;
extern unsigned short g_f11530;
extern unsigned short g_f11532;
extern unsigned short g_f11534;
extern unsigned short g_f11536;

long long sub_228400(void)
{
    unsigned long v0;  // x0

    g_f11530 = 61825;
    g_f11532 = 7917;
    g_f11534 = 42114;
    g_f11536 = 1366;
    g_f02bd0 = g_f11530 ^ g_f02bd0;
    g_f02bd2 = g_f11532 ^ g_f02bd2;
    g_f02bd4 = g_f11534 ^ g_f02bd4;
    g_f02bd6 = g_f11536 ^ g_f02bd6;
    g_f02c60 = g_f02c60 ^ 384675696958370177;
    return v0;
}
