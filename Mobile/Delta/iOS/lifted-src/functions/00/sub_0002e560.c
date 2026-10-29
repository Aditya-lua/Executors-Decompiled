/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2e560..0x2e5e8 (136 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2e560_1 {
    char padding_0[48];
    struct st_2e560_2 *field_30;
    char padding_38[88];
    char field_90;
    char padding_91[95];
    char field_f0;
} st_2e560_1;

typedef struct st_2e560_2 {
    unsigned int field_0;
} st_2e560_2;

typedef struct st_2e560_0 {
    char field_0;
} st_2e560_0;

extern unsigned int g_7fffff;

int sub_2e560(st_2e560_1 *a0, unsigned long long idx, unsigned int a2)
{
    unsigned int v5;  // w8
    unsigned long long v6;  // 4119
    st_2e560_0 **v0;  // [bp-0x28], Other Possible Types: char
    st_2e560_0 *v1;  // [bp-0x20]
    unsigned int v2;  // [bp-0x14]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v0 = &v1;
    v5 = a2 + ~(unsigned int)idx;
    if (v5 == (short)v5)
    {
        *(unsigned int *)&a0->field_30[idx] = *(int *)&a0->field_30[idx] | v5 * 0x10000;
    }
    else
    {
        v6 = arm64g_calculate_condition(83, v5, 0, 0);
        if (!(v6 & 1))
            v5 = -v5;
        if (v5 > &g_7fffff)
            return 0;
        a0->field_f0 = 1;
    }
    v2 = a2;
    sub_f2b8(&a0->field_90, &(unsigned int)idx);
    return 1;
}
