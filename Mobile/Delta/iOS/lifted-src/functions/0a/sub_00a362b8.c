/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa362b8..0xa362f8 (64 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_f128e4;

unsigned long long sub_a362b8(unsigned long a0, unsigned long long a1)
{
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a1)
        a1 = &g_f128e4;
    sub_a3601c();
    return a1;
}
