/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa07c60..0xa07c88 (40 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_a07c60(unsigned long a0, unsigned long a1, unsigned long a2)
{
    unsigned long long v2;  // 4119
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = arm64g_calculate_condition(0x11, sub_a06334() & 0xffffffff, 1, 0);
    return !(v2 & 1);
}
