/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x13be3c..0x13bed4 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01c08;
extern unsigned short g_f01c0a;
extern unsigned short g_f01c0c;
extern unsigned short g_f01c0e;
extern unsigned long long g_f01d08;
extern unsigned short g_f0ef40;
extern unsigned short g_f0ef42;
extern unsigned short g_f0ef44;
extern unsigned short g_f0ef46;

long long sub_13be3c(void)
{
    unsigned long v0;  // x0

    g_f0ef40 = 13614;
    g_f0ef42 = 0xe7fe;
    g_f0ef44 = 40174;
    g_f0ef46 = 50231;
    g_f01c08 = g_f0ef40 ^ g_f01c08;
    g_f01c0a = g_f0ef42 ^ g_f01c0a;
    g_f01c0c = g_f0ef44 ^ g_f01c0c;
    g_f01c0e = g_f0ef46 ^ g_f01c0e;
    g_f01d08 = g_f01d08 ^ 0xc4379ceee7fe352e;
    return v0;
}
