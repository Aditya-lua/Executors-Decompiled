/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xdd38..0xdd5c (36 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_dd38(unsigned int *a0, unsigned int *a1)
{
    unsigned long v0;  // cc_dep1
    unsigned long v1;  // cc_dep2
    unsigned long long v2;  // 4105

    v0 = *a0;
    v1 = *a1;
    if (*a0 == *a1)
    {
        v0 = a0[1];
        v1 = a1[1];
    }
    v2 = arm64g_calculate_condition(35, v0, v1, 0);
    return !(v2 & 1);
}
