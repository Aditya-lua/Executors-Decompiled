/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f9eb8..0x1f9f2c (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1f9eb8_1 {
    unsigned int field_0;
    char padding_4[28];
    unsigned long long field_20;
} st_1f9eb8_1;

typedef struct st_1f9eb8_0 {
    char field_0;
} st_1f9eb8_0;

extern unsigned long long g_e794a0;
extern unsigned long long g_e794a8;

long long sub_1f9eb8(unsigned long long *a0, unsigned long a1)
{
    st_1f9eb8_1 *v2;  // x12
    unsigned long v3;  // cc_op
    unsigned long v6;  // cc_ndep
    unsigned long long v7;  // 4110
    unsigned long long v8;  // 4102
    unsigned long v9;  // cc_dep1
    unsigned long v10;  // cc_dep2
    unsigned long long v4;  // 4110
    unsigned long long v5;  // 4102
    st_1f9eb8_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_1f9eb8_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    v2 = *a0 + 40 * a1;
    if (v2->field_0 == 3)
    {
        v4 = arm64g_calculate_condition(v3, v9, v10, v6);
        v5 = arm64g_calculate_condition(4, (v4 & 1 ? v2->field_20 : 0), 0, 0);
        if (v5 & 1)
            goto LABEL_1f9f08;
    }
    else
    {
        v7 = arm64g_calculate_condition(v3, v9, v10, v6);
        v8 = arm64g_calculate_condition(0, (v7 & 1 ? v2->field_20 : 0), 0, 0);
        if (v8 & 1)
        {
LABEL_1f9f08:
            goto *((void *)(g_e794a8));
        }
    }
    goto *((void *)(g_e794a0));
}
