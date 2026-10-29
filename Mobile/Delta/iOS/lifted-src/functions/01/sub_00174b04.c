/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x174b04..0x174b9c (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02020;
extern unsigned short g_f02022;
extern unsigned short g_f02024;
extern unsigned short g_f02026;
extern unsigned long long g_f020a8;
extern unsigned short g_f0fd70;
extern unsigned short g_f0fd72;
extern unsigned short g_f0fd74;
extern unsigned short g_f0fd76;

long long sub_174b04(void)
{
    unsigned long v0;  // x0

    g_f0fd70 = 0xff42;
    g_f0fd72 = 34944;
    g_f0fd74 = 30939;
    g_f0fd76 = 64159;
    g_f02020 = g_f0fd70 ^ g_f02020;
    g_f02022 = g_f0fd72 ^ g_f02022;
    g_f02024 = g_f0fd74 ^ g_f02024;
    g_f02026 = g_f0fd76 ^ g_f02026;
    g_f020a8 = g_f020a8 ^ 0xfa9f78db8880ff42;
    return v0;
}
