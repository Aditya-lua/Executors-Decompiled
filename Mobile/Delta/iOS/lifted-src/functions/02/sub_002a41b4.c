/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2a41b4..0x2a424c (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02ce8;
extern unsigned short g_f02cea;
extern unsigned short g_f02cec;
extern unsigned short g_f02cee;
extern unsigned long long g_f02d00;
extern unsigned short g_f11be8;
extern unsigned short g_f11bea;
extern unsigned short g_f11bec;
extern unsigned short g_f11bee;

long long sub_2a41b4(void)
{
    unsigned long v0;  // x0

    g_f11be8 = 4262;
    g_f11bea = 64669;
    g_f11bec = 63663;
    g_f11bee = 18094;
    g_f02ce8 = g_f11be8 ^ g_f02ce8;
    g_f02cea = g_f11bea ^ g_f02cea;
    g_f02cec = g_f11bec ^ g_f02cec;
    g_f02cee = g_f11bee ^ g_f02cee;
    g_f02d00 = g_f02d00 ^ 0x46aef8affc9d10a6;
    return v0;
}
