/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa084f8..0xa08514 (28 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_a084f8(void)
{
    unsigned long long v2;  // 4119
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = arm64g_calculate_condition(0x11, sub_a07d54() & 0xffffffff, 1, 0);
    return !(v2 & 1);
}
