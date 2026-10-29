/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x13b520..0x13b5b8 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01bc0;
extern unsigned short g_f01bc2;
extern unsigned short g_f01bc4;
extern unsigned short g_f01bc6;
extern unsigned long long g_f01cc0;
extern unsigned short g_f0eef8;
extern unsigned short g_f0eefa;
extern unsigned short g_f0eefc;
extern unsigned short g_f0eefe;

long long sub_13b520(void)
{
    unsigned long v0;  // x0

    g_f0eef8 = 31152;
    g_f0eefa = 44994;
    g_f0eefc = 10281;
    g_f0eefe = 62782;
    g_f01bc0 = g_f0eef8 ^ g_f01bc0;
    g_f01bc2 = g_f0eefa ^ g_f01bc2;
    g_f01bc4 = g_f0eefc ^ g_f01bc4;
    g_f01bc6 = g_f0eefe ^ g_f01bc6;
    g_f01cc0 = g_f01cc0 ^ 17671606147355933104;
    return v0;
}
