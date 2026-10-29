/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xecbf8..0xecc90 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01540;
extern unsigned short g_f01542;
extern unsigned short g_f01544;
extern unsigned short g_f01546;
extern unsigned long long g_f01570;
extern unsigned short g_f0dfd0;
extern unsigned short g_f0dfd2;
extern unsigned short g_f0dfd4;
extern unsigned short g_f0dfd6;

long long sub_ecbf8(void)
{
    unsigned long v0;  // x0

    g_f0dfd0 = 24954;
    g_f0dfd2 = 18457;
    g_f0dfd4 = 11428;
    g_f0dfd6 = 25159;
    g_f01540 = g_f0dfd0 ^ g_f01540;
    g_f01542 = g_f0dfd2 ^ g_f01542;
    g_f01544 = g_f0dfd4 ^ g_f01544;
    g_f01546 = g_f0dfd6 ^ g_f01546;
    g_f01570 = g_f01570 ^ 7081678023159275898;
    return v0;
}
