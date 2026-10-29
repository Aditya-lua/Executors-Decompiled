/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x174e94..0x174f2c (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02060;
extern unsigned short g_f02062;
extern unsigned short g_f02064;
extern unsigned short g_f02066;
extern unsigned long long g_f020e8;
extern unsigned short g_f0fdb0;
extern unsigned short g_f0fdb2;
extern unsigned short g_f0fdb4;
extern unsigned short g_f0fdb6;

long long sub_174e94(void)
{
    unsigned long v0;  // x0

    g_f0fdb0 = 6749;
    g_f0fdb2 = 51589;
    g_f0fdb4 = 28369;
    g_f0fdb6 = 53003;
    g_f02060 = g_f0fdb0 ^ g_f02060;
    g_f02062 = g_f0fdb2 ^ g_f02062;
    g_f02064 = g_f0fdb4 ^ g_f02064;
    g_f02066 = g_f0fdb6 ^ g_f02066;
    g_f020e8 = g_f020e8 ^ 14919140037903063645;
    return v0;
}
