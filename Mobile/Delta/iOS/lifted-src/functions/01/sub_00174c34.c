/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x174c34..0x174ccc (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02040;
extern unsigned short g_f02042;
extern unsigned short g_f02044;
extern unsigned short g_f02046;
extern unsigned long long g_f020c8;
extern unsigned short g_f0fd90;
extern unsigned short g_f0fd92;
extern unsigned short g_f0fd94;
extern unsigned short g_f0fd96;

long long sub_174c34(void)
{
    unsigned long v0;  // x0

    g_f0fd90 = 19856;
    g_f0fd92 = 8583;
    g_f0fd94 = 29661;
    g_f0fd96 = 58581;
    g_f02040 = g_f0fd90 ^ g_f02040;
    g_f02042 = g_f0fd92 ^ g_f02042;
    g_f02044 = g_f0fd94 ^ g_f02044;
    g_f02046 = g_f0fd96 ^ g_f02046;
    g_f020c8 = g_f020c8 ^ 16489213004274421136;
    return v0;
}
