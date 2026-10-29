/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x98a750..0x98a778 (40 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_98a750(long long *a0)
{
    unsigned long long v2;  // 4131
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = arm64g_calculate_condition(33, *(int *)(sub_965af4(*a0) + 836) - 1, 2, 0);
    return !(v2 & 1);
}
