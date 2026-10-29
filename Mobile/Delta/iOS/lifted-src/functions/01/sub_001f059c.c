/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f059c..0x1f0654 (184 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1f059c_2 {
    struct st_1f059c_1 *field_0;
    long long field_8;
} st_1f059c_2;

typedef struct st_1f059c_1 {
    unsigned int field_0;
} st_1f059c_1;

typedef struct st_1f059c_0 {
    char field_0;
} st_1f059c_0;

extern unsigned long long g_e78a00;
extern unsigned long long g_e78a38;

int sub_1f059c(unsigned long a0, st_1f059c_2 *a1, st_1f059c_1 **a2, unsigned int *a3)
{
    unsigned int *v2;  // x9
    unsigned int v3;  // w12
    unsigned int v4;  // w13
    unsigned long v5;  // cc_dep1
    unsigned int v6;  // w13
    unsigned long long v7;  // 4112
    unsigned long long v8;  // 4102
    unsigned long long v9;  // 4112
    unsigned long long v10;  // 4102
    st_1f059c_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_1f059c_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    v2 = *a2;
    a1->field_0 = v2;
    if (v2 == a3)
    {
        a1->field_8 = (long long)(a3 - a1->field_0) >> 2;
        return 0;
    }
    v3 = *v2;
    v4 = v3 - 65;
    v5 = v4;
    if (v4 >= 26)
    {
        v6 = v3 - 97;
        if (v3 != 95)
        {
            v7 = arm64g_calculate_condition(19, v5, 26, 0);
            v8 = arm64g_calculate_condition(0x33, (v7 & 1 ? v6 : 0), (v7 & 1 ? 26 : 0), 0);
            if (!(v8 & 1))
                goto LABEL_1f05f4;
        }
        else
        {
            v9 = arm64g_calculate_condition(19, v5, 26, 0);
            v10 = arm64g_calculate_condition(48, (v9 & 1 ? v6 : 0), (v9 & 1 ? 26 : 0), 0);
            if (!(v10 & 1))
            {
LABEL_1f05f4:
                if (9 < v3 - 48)
                    goto *((void *)(g_e78a38));
            }
        }
    }
    goto *((void *)(g_e78a00));
}
