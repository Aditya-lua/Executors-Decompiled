/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc5ff0..0xc6020 (48 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c5ff0_0 {
    char padding_0[4];
    unsigned int field_4;
} st_c5ff0_0;


unsigned long long sub_c5ff0(st_c5ff0_0 *a0, unsigned long long a1)
{
    unsigned long long v0;  // x0
    unsigned long v1;  // x8
    unsigned long long v2;  // x10
    unsigned long long v3;  // 4115

    v0 = 0xffffffffffffffb8;
    if (a1 < 8)
        return 0xffffffffffffffb8;
    v1 = a0->field_4;
    v2 = v1 + 8;
    if (a1 >= v2)
        v0 = v2;
    v3 = arm64g_calculate_condition(129, v1 & 0xffffffff, 9, 0);
    if (!(v3 & 1))
        return v0;
    return 0xfffffffffffffff2;
}
