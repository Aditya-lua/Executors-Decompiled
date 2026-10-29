/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2aeaa0..0x2aeb18 (120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2aeaa0_1 {
    char padding_0[20];
    unsigned int field_14;
    char field_18;
    char padding_19[7];
    unsigned long long field_20;
    unsigned long long field_28;
    unsigned long long field_30;
    char field_38;
    char padding_39[7];
    unsigned long long field_40;
} st_2aeaa0_1;

typedef struct st_2aeaa0_0 {
    char field_0;
} st_2aeaa0_0;


st_2aeaa0_1 * sub_2aeaa0(st_2aeaa0_1 *a0)
{
    unsigned long long v4;  // x9
    unsigned long long *v5;  // x8
    unsigned long long v6;  // 4118
    st_2aeaa0_0 **v0;  // [bp-0x20], Other Possible Types: char
    st_2aeaa0_0 *v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v4 = a0->field_28;
    v5 = &a0->field_28;
    v0 = &v1;
    *((char *)v5 - 16) = 1;
    *(long long *)((char *)v5 - 8) = *(long long *)((char *)v5 - 8) - 1;
    if (v4 || (v4 = a0->field_30, v5 = &a0->field_30, v4))
        *v5 = v4 - 1;
    v6 = arm64g_calculate_condition(1, a0->field_14, 1, 0);
    if (!(v6 & 1))
        a0 = sub_c84c(&a0->field_38, a0->field_40 - 1);
    return a0;
}
