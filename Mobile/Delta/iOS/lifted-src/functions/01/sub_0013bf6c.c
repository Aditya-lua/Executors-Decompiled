/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x13bf6c..0x13c004 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01c58;
extern unsigned short g_f01c5a;
extern unsigned short g_f01c5c;
extern unsigned short g_f01c5e;
extern unsigned long long g_f01d58;
extern unsigned short g_f0ef90;
extern unsigned short g_f0ef92;
extern unsigned short g_f0ef94;
extern unsigned short g_f0ef96;

long long sub_13bf6c(void)
{
    unsigned long v0;  // x0

    g_f0ef90 = 20847;
    g_f0ef92 = 40202;
    g_f0ef94 = 36966;
    g_f0ef96 = 36286;
    g_f01c58 = g_f0ef90 ^ g_f01c58;
    g_f01c5a = g_f0ef92 ^ g_f01c5a;
    g_f01c5c = g_f0ef94 ^ g_f01c5c;
    g_f01c5e = g_f0ef96 ^ g_f01c5e;
    g_f01d58 = g_f01d58 ^ 10213759775318626671;
    return v0;
}
