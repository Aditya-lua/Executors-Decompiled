/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa94a84..0xa94aac (40 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_a95e90;
extern unsigned long long g_a960e0;
extern unsigned int g_f0d568;

long long sub_a94a84(void)
{
    unsigned long long v0;  // x9
    unsigned long long v1;  // x10

    v0 = &g_a960e0;
    v1 = &g_a95e90;
    if (!(g_f0d568 & 32))
        v0 = v1;
    goto *((void *)(v0));
}
