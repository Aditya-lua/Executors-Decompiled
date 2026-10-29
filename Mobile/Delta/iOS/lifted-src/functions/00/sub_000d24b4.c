/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xd24b4..0xd254c (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f012ae;
extern unsigned short g_f012b0;
extern unsigned short g_f012b2;
extern unsigned short g_f012b4;
extern unsigned long long g_f012e0;
extern unsigned short g_f0dc72;
extern unsigned short g_f0dc74;
extern unsigned short g_f0dc76;
extern unsigned short g_f0dc78;

long long sub_d24b4(void)
{
    unsigned long v0;  // x0

    g_f0dc72 = 32876;
    g_f0dc74 = 18101;
    g_f0dc76 = 13222;
    g_f0dc78 = 8785;
    g_f012ae = g_f0dc72 ^ g_f012ae;
    g_f012b0 = g_f0dc74 ^ g_f012b0;
    g_f012b2 = g_f0dc76 ^ g_f012b2;
    g_f012b4 = g_f0dc78 ^ g_f012b4;
    g_f012e0 = g_f012e0 ^ 2472814459647000684;
    return v0;
}
