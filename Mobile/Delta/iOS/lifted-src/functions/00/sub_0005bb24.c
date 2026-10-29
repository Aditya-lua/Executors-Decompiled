/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x5bb24..0x5bb44 (32 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_f011d0;

unsigned long long * sub_5bb24(unsigned long long *a0)
{
    a0[262] = &g_f011d0;
    if (!*a0)
        return a0;
    goto *((void *)(*a0));
}
