/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x167180..0x16723c (188 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_167180_0 {
    char field_0;
} st_167180_0;

typedef struct st_167180_4 {
    unsigned long long field_0;
} st_167180_4;

typedef struct st_167180_1 {
    char padding_0[257];
    char field_101;
} st_167180_1;

typedef struct st_167180_3 {
    char padding_0[288];
    struct st_167180_4 *field_120;
} st_167180_3;

typedef struct st_167180_2 {
    char padding_0[96];
    struct st_167180_1 *field_60;
} st_167180_2;

extern st_167180_2 *g_f0d198;
extern st_167180_3 *g_f0d3d8;

char sub_167180(long long a0)
{
    char v6;  // x0
    char v7;  // x0
    unsigned long v11;  // cc_dep1
    unsigned long v12;  // cc_dep2
    unsigned long v13;  // cc_ndep
    unsigned long long v14;  // 4112
    unsigned long long v15;  // 4102
    unsigned long v16;  // cc_op
    unsigned int v8;  // w0
    unsigned long long v9;  // 4112
    unsigned long long v10;  // 4102
    st_167180_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_167180_0 *v1;  // [bp-0x38]
    st_167180_0 **v2;  // [bp-0x30], Other Possible Types: char
    st_167180_0 *v3;  // [bp-0x28]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    v3 = &v2;
    v2 = &v3;
    if (g_f0d198->field_60->field_101 >> 2 & 1)
    {
        v6 = sub_165428(a0, 1);
        if (v6)
        {
            v7 = *(long long *)(v6 + 24);
            if (v7)
            {
                v8 = sub_165598(v7);
                if (*(long long *)(v7 + 88))
                {
                    v9 = arm64g_calculate_condition(v16 | 16, v11, v12, v13);
                    v10 = arm64g_calculate_condition(179, (v9 & 1 ? v8 : 0x80000000), v9 & 1, 0);
                    if (v10 & 1)
                        return 0;
                }
                else
                {
                    v14 = arm64g_calculate_condition(v16 | 16, v11, v12, v13);
                    v15 = arm64g_calculate_condition(176, (v14 & 1 ? v8 : 0x80000000), v14 & 1, 0);
                    if (v15 & 1)
                        return 0;
                }
                g_f0d3d8->field_120();
            }
        }
    }
    sub_c60d88(a0);
}
