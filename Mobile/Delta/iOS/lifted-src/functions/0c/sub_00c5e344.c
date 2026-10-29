/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc5e344..0xc5e398 (84 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_c5e344(unsigned long a0, unsigned long a1, unsigned long long a2)
{
    unsigned long long count;  // x0
    unsigned long long v3;  // 4114
    unsigned long long v4;  // 4117
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    count = _write();
    v3 = arm64g_calculate_condition(18, count, 1, 0);
    if (!(v3 & 1))
        ___error();
    v4 = arm64g_calculate_condition(18, count, 1, 0);
    return !(v4 & 1);
}
