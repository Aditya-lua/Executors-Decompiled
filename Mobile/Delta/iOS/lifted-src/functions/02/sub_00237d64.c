/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x237d64..0x237dfc (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02cd0;
extern unsigned short g_f02cd2;
extern unsigned short g_f02cd4;
extern unsigned short g_f02cd6;
extern unsigned long long g_f02cd8;
extern unsigned short g_f11800;
extern unsigned short g_f11802;
extern unsigned short g_f11804;
extern unsigned short g_f11806;

long long sub_237d64(void)
{
    unsigned long v0;  // x0

    g_f11800 = 16876;
    g_f11802 = 12758;
    g_f11804 = 31853;
    g_f11806 = 22278;
    g_f02cd0 = g_f11800 ^ g_f02cd0;
    g_f02cd2 = g_f11802 ^ g_f02cd2;
    g_f02cd4 = g_f11804 ^ g_f02cd4;
    g_f02cd6 = g_f11806 ^ g_f02cd6;
    g_f02cd8 = g_f02cd8 ^ 6270836339589399020;
    return v0;
}
