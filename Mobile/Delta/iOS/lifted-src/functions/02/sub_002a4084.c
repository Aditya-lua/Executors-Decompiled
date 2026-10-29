/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2a4084..0x2a411c (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02cf0;
extern unsigned short g_f02cf2;
extern unsigned short g_f02cf4;
extern unsigned short g_f02cf6;
extern unsigned long long g_f02d08;
extern unsigned short g_f11bf0;
extern unsigned short g_f11bf2;
extern unsigned short g_f11bf4;
extern unsigned short g_f11bf6;

long long sub_2a4084(void)
{
    unsigned long v0;  // x0

    g_f11bf0 = 34649;
    g_f11bf2 = 15732;
    g_f11bf4 = 30575;
    g_f11bf6 = 16700;
    g_f02cf0 = g_f11bf0 ^ g_f02cf0;
    g_f02cf2 = g_f11bf2 ^ g_f02cf2;
    g_f02cf4 = g_f11bf4 ^ g_f02cf4;
    g_f02cf6 = g_f11bf6 ^ g_f02cf6;
    g_f02d08 = g_f02d08 ^ 4700763430724077401;
    return v0;
}
