/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa9b704..0xa9b770 (108 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_c7c2eb;

long long sub_a9b704(unsigned long a0, long long a1, long long a2, unsigned long long a3)
{
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v0 = a3;
    v1 = &g_c7c2eb;
    if ((int)sub_9d524c(a2, "%*s") < 1)
        return 0;
    return (int)sub_9c9acc(a2, a1, 4) > 0;
}
