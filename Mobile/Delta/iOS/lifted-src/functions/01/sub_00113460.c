/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x113460..0x1134f8 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01870;
extern unsigned short g_f01872;
extern unsigned short g_f01874;
extern unsigned short g_f01876;
extern unsigned long long g_f01908;
extern unsigned short g_f0e748;
extern unsigned short g_f0e74a;
extern unsigned short g_f0e74c;
extern unsigned short g_f0e74e;

long long sub_113460(void)
{
    unsigned long v0;  // x0

    g_f0e748 = 46830;
    g_f0e74a = 28653;
    g_f0e74c = 44266;
    g_f0e74e = 13991;
    g_f01870 = g_f0e748 ^ g_f01870;
    g_f01872 = g_f0e74a ^ g_f01872;
    g_f01874 = g_f0e74c ^ g_f01874;
    g_f01876 = g_f0e74e ^ g_f01876;
    g_f01908 = g_f01908 ^ 3938306522058962670;
    return v0;
}
