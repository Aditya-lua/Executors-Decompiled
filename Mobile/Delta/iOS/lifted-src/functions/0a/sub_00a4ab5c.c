/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa4ab5c..0xa4ab98 (60 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_e9d050;

long long sub_a4ab5c(unsigned long long a0)
{
    unsigned long long *v0;  // x8
    unsigned long long v1;  // x9
    unsigned long long v2;  // x9

    if (a0 < 1)
        return 0;
    v0 = &g_e9d050;
    v1 = 82;
    while (1)
    {
        v2 = v1;
        if (*(int *)v0 == a0)
            return *(long long *)((char *)v0 - 8);
        v0 += 2;
        v1 = v2 - 1;
        if (v2 == 1)
            return 0;
    }
}
