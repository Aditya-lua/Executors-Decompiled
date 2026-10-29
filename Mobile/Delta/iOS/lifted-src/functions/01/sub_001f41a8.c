/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f41a8..0x1f4240 (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1f41a8_2 {
    struct st_1f41a8_1 *field_0;
    unsigned long long field_8;
} st_1f41a8_2;

typedef struct st_1f41a8_1 {
    unsigned int field_0;
    unsigned int field_4;
} st_1f41a8_1;

typedef struct st_1f41a8_0 {
    char field_0;
} st_1f41a8_0;

extern unsigned long long g_e79258;
extern unsigned long long g_e79288;

void sub_1f41a8(st_1f41a8_2 *a0, unsigned int a1)
{
    unsigned long long v2;  // x9
    st_1f41a8_1 *v3;  // x10
    unsigned long long v12;  // 4102
    unsigned long long v4;  // x11
    unsigned long v5;  // cc_op
    unsigned long long v6;  // cc_dep1
    unsigned long long v7;  // cc_dep2
    unsigned long v8;  // cc_ndep
    unsigned long long v9;  // 4112
    unsigned long long v10;  // 4102
    unsigned long long v11;  // 4112
    st_1f41a8_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_1f41a8_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    if (a0->field_8)
    {
        v2 = 0;
        v3 = a0->field_0;
        v4 = -a0->field_8;
        while (1)
        {
            if (v3->field_0 == 9)
            {
                v9 = arm64g_calculate_condition(v5, v6, v7, v8);
                v10 = arm64g_calculate_condition(3, (v9 & 1 ? v3->field_4 : 0), (v9 & 1 ? a1 : 0), 0);
                if (v10 & 1)
                    break;
            }
            else
            {
                v11 = arm64g_calculate_condition(v5, v6, v7, v8);
                v12 = arm64g_calculate_condition(0, (v11 & 1 ? v3->field_4 : 0), (v11 & 1 ? a1 : 0), 0);
                if (v12 & 1)
                    break;
            }
            v7 = v2 - 1;
            v3 += 5;
            v5 = 4;
            v8 = 0;
            v2 = v7;
            v6 = v4;
            if (v6 == v2)
                goto *((void *)(g_e79258));
        }
        goto *((void *)(g_e79288));
    }
    else
    {
        goto *((void *)(g_e79258));
    }
}
