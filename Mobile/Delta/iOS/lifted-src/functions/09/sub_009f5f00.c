/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f5f00..0x9f5f24 (36 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_f127e8;

unsigned long long sub_9f5f00(unsigned long a0, unsigned long long *a1, unsigned long long *a2)
{
    unsigned long long *v0;  // x8
    unsigned long long v1;  // x0

    v0 = g_f127e8 + 24 * a0;
    *a1 = *v0;
    v1 = v0[1];
    *a2 = v0[2];
    return v1;
}
