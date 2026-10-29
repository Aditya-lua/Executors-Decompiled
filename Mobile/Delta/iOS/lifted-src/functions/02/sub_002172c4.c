/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2172c4..0x21735c (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02938;
extern unsigned short g_f0293a;
extern unsigned short g_f0293c;
extern unsigned short g_f0293e;
extern unsigned long long g_f02a48;
extern unsigned short g_f10f50;
extern unsigned short g_f10f52;
extern unsigned short g_f10f54;
extern unsigned short g_f10f56;

long long sub_2172c4(void)
{
    unsigned long v0;  // x0

    g_f10f50 = 49740;
    g_f10f52 = 54727;
    g_f10f54 = 35956;
    g_f10f56 = 51574;
    g_f02938 = g_f10f50 ^ g_f02938;
    g_f0293a = g_f10f52 ^ g_f0293a;
    g_f0293c = g_f10f54 ^ g_f0293c;
    g_f0293e = g_f10f56 ^ g_f0293e;
    g_f02a48 = g_f02a48 ^ 14516944882306105932;
    return v0;
}
