/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x98b274..0x98b2a0 (44 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_98b274_0 {
    char padding_0[480];
    unsigned long long field_1e0;
} st_98b274_0;


st_98b274_0 * sub_98b274(st_98b274_0 *a0, unsigned long a1)
{
    unsigned long long v0;  // x8
    unsigned long long v1;  // 4110
    unsigned long long v2;  // x10
    unsigned long long v3;  // x8
    unsigned long long v4;  // x9

    v0 = a0->field_1e0;
    v1 = arm64g_calculate_condition(2, v0, 1, 0);
    if (v1 & 1)
        return a0;
    v2 = a1 * 3;
    v3 = v0 + v2;
    v4 = 0xfffffffffffffffe;
    if (v2 >= ~v0)
        v3 = v4;
    a0->field_1e0 = v3;
    return a0;
}
