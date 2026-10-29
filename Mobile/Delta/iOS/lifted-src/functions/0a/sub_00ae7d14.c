/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xae7d14..0xae7d94 (128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern unsigned long long g_c7c2eb;

long long sub_ae7d14(unsigned long a0, long long a1, long long a2, unsigned long long a3)
{
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v0 = a3;
    v1 = &g_c7c2eb;
    if ((int)sub_9d524c(a2, "%*s") >= 1 && (int)sub_aec458(a2, a1) >= 1)
        return (int)sub_9d4888(a2, "\n") > 0;
    return 0;
}
