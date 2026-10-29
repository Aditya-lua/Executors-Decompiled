/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xe7aa0..0xe7b38 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01408;
extern unsigned short g_f0140a;
extern unsigned short g_f0140c;
extern unsigned short g_f0140e;
extern unsigned long long g_f01498;
extern unsigned short g_f0dce8;
extern unsigned short g_f0dcea;
extern unsigned short g_f0dcec;
extern unsigned short g_f0dcee;

long long sub_e7aa0(void)
{
    unsigned long v0;  // x0

    g_f0dce8 = 33176;
    g_f0dcea = 44058;
    g_f0dcec = 56703;
    g_f0dcee = 14008;
    g_f01408 = g_f0dce8 ^ g_f01408;
    g_f0140a = g_f0dcea ^ g_f0140a;
    g_f0140c = g_f0dcec ^ g_f0140c;
    g_f0140e = g_f0dcee ^ g_f0140e;
    g_f01498 = g_f01498 ^ 0x36b8dd7fac1a8198;
    return v0;
}
