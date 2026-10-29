/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaafbcc..0xaafbf4 (40 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aafbcc_0 {
    char padding_0[40];
    long long field_28;
} st_aafbcc_0;


int sub_aafbcc(st_aafbcc_0 *a0)
{
    unsigned int v2;  // w0
    unsigned long long v3;  // 4129
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9e46a8(a0->field_28);
    v3 = arm64g_calculate_condition(177, v2, 7, 0);
    return (int)((v3 & 1 ? v2 + 14 : v2 + 7)) >> 3;
}
