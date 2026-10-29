/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1d677c..0x1d6814 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f026a0;
extern unsigned short g_f026a2;
extern unsigned short g_f026a4;
extern unsigned short g_f026a6;
extern unsigned long long g_f026b8;
extern unsigned short g_f10b90;
extern unsigned short g_f10b92;
extern unsigned short g_f10b94;
extern unsigned short g_f10b96;

long long sub_1d677c(void)
{
    unsigned long v0;  // x0

    g_f10b90 = 52536;
    g_f10b92 = 25661;
    g_f10b94 = 29799;
    g_f10b96 = 36246;
    g_f026a0 = g_f10b90 ^ g_f026a0;
    g_f026a2 = g_f10b92 ^ g_f026a2;
    g_f026a4 = g_f10b94 ^ g_f026a4;
    g_f026a6 = g_f10b96 ^ g_f026a6;
    g_f026b8 = g_f026b8 ^ 10202469993266662712;
    return v0;
}
