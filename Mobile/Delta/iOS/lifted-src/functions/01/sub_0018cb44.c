/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x18cb44..0x18cbdc (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f02150;
extern unsigned short g_f02152;
extern unsigned short g_f02154;
extern unsigned short g_f02156;
extern unsigned long long g_f02260;
extern unsigned short g_f10088;
extern unsigned short g_f1008a;
extern unsigned short g_f1008c;
extern unsigned short g_f1008e;

long long sub_18cb44(void)
{
    unsigned long v0;  // x0

    g_f10088 = 10017;
    g_f1008a = 28432;
    g_f1008c = 18759;
    g_f1008e = 11168;
    g_f02150 = g_f10088 ^ g_f02150;
    g_f02152 = g_f1008a ^ g_f02152;
    g_f02154 = g_f1008c ^ g_f02154;
    g_f02156 = g_f1008e ^ g_f02156;
    g_f02260 = g_f02260 ^ 3143593111059441441;
    return v0;
}
