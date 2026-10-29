/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2a411c..0x2a41b4 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02ce0;
extern unsigned short g_f02ce2;
extern unsigned short g_f02ce4;
extern unsigned short g_f02ce6;
extern unsigned long long g_f02cf8;
extern unsigned short g_f11be0;
extern unsigned short g_f11be2;
extern unsigned short g_f11be4;
extern unsigned short g_f11be6;

long long sub_2a411c(void)
{
    unsigned long v0;  // x0

    g_f11be0 = 40978;
    g_f11be2 = 15925;
    g_f11be4 = 31212;
    g_f11be6 = 19489;
    g_f02ce0 = g_f11be0 ^ g_f02ce0;
    g_f02ce2 = g_f11be2 ^ g_f02ce2;
    g_f02ce4 = g_f11be4 ^ g_f02ce4;
    g_f02ce6 = g_f11be6 ^ g_f02ce6;
    g_f02cf8 = g_f02cf8 ^ 5485799876676919314;
    return v0;
}
