/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x215ff4..0x21608c (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f029b8;
extern unsigned short g_f029ba;
extern unsigned short g_f029bc;
extern unsigned short g_f029be;
extern unsigned long long g_f02ac8;
extern unsigned short g_f10fd0;
extern unsigned short g_f10fd2;
extern unsigned short g_f10fd4;
extern unsigned short g_f10fd6;

long long sub_215ff4(void)
{
    unsigned long v0;  // x0

    g_f10fd0 = 51986;
    g_f10fd2 = 56137;
    g_f10fd4 = 30826;
    g_f10fd6 = 29262;
    g_f029b8 = g_f10fd0 ^ g_f029b8;
    g_f029ba = g_f10fd2 ^ g_f029ba;
    g_f029bc = g_f10fd4 ^ g_f029bc;
    g_f029be = g_f10fd6 ^ g_f029be;
    g_f02ac8 = g_f02ac8 ^ 8236653168848128786;
    return v0;
}
