/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x113330..0x1133c8 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned short g_f01848;
extern unsigned short g_f0184a;
extern unsigned short g_f0184c;
extern unsigned short g_f0184e;
extern unsigned long long g_f018e0;
extern unsigned short g_f0e720;
extern unsigned short g_f0e722;
extern unsigned short g_f0e724;
extern unsigned short g_f0e726;

long long sub_113330(void)
{
    unsigned long v0;  // x0

    g_f0e720 = 18654;
    g_f0e722 = 19027;
    g_f0e724 = 13100;
    g_f0e726 = 20964;
    g_f01848 = g_f0e720 ^ g_f01848;
    g_f0184a = g_f0e722 ^ g_f0184a;
    g_f0184c = g_f0e724 ^ g_f0184c;
    g_f0184e = g_f0e726 ^ g_f0184e;
    g_f018e0 = g_f018e0 ^ 5900897677080742110;
    return v0;
}
