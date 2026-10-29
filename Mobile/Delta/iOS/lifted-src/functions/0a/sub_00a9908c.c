/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa9908c..0xa991e0 (340 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a9908c_1 {
    char padding_0[16];
    struct st_a9908c_2 *field_10;
} st_a9908c_1;

typedef struct st_a9908c_2 {
    unsigned long long field_0;
} st_a9908c_2;

typedef struct st_a9908c_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
} st_a9908c_0;

extern long long g_a98de0;
extern long long g_f09020;
extern unsigned int g_f12ef8;
extern long long g_f12f00;
extern st_a9908c_0 *g_f12f08;
extern long long g_f12f10;

unsigned long long * sub_a9908c(unsigned long a0, unsigned int a1, unsigned long a2)
{
    unsigned long v3;  // cc_op
    unsigned long v6;  // cc_ndep
    unsigned long long v7;  // 4112
    unsigned long long v8;  // 4102
    unsigned long v9;  // cc_dep1
    unsigned long v10;  // cc_dep2
    unsigned long long *v11;  // x0
    long long v12;  // x19
    unsigned long long *v14;  // x0
    int *v15;  // x20
    int v16;  // w0
    st_a9908c_1 *v17;  // x0
    unsigned long long *v18;  // x19
    unsigned long long v4;  // 4112
    unsigned long long v5;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (sub_a7c208(&g_f09020, &g_a98de0))
    {
        v4 = arm64g_calculate_condition(v3 | 16, v9, v10, v6);
        v5 = arm64g_calculate_condition(19, (v4 & 1 ? g_f12ef8 : 0x40000000), 0, 0);
        if (v5 & 1)
            goto LABEL_a990d8;
    }
    else
    {
        v7 = arm64g_calculate_condition(v3 | 16, v9, v10, v6);
        v8 = arm64g_calculate_condition(16, (v7 & 1 ? g_f12ef8 : 0x40000000), 0, 0);
        if (v8 & 1)
        {
LABEL_a990d8:
            v11 = sub_a6bf4c(24, "crypto/objects/o_names.c", 200);
            if (!v11)
                return v11;
            v12 = v11;
            *v11 = __dirty_unsupported_Iop_ZeroHI64ofV128((a1 | a1 * 0x100000000) & 0x8000ffff7fff);
            v11[1] = a0;
            v11[2] = a2;
            if (!sub_a7c198(g_f12f00))
            {
                sub_a6c2e4(v12, "crypto/objects/o_names.c", 210);
                return 0;
            }
            v14 = sub_a66794(g_f12f10, v12);
            if (v14)
            {
                v15 = v14;
                if (g_f12f08)
                {
                    v16 = sub_ad69e4(g_f12f08);
                    if (v16 > *v15)
                    {
                        v17 = sub_ad69f8(g_f12f08);
                        v17->field_10();
                    }
                }
                sub_a6c2e4(v15, "crypto/objects/o_names.c", 228);
LABEL_a9917c:
                v18 = 1;
            }
            else
            {
                if (!sub_a66e38(g_f12f10))
                    goto LABEL_a9917c;
                sub_a6c2e4(v12, "crypto/objects/o_names.c", 232);
                v18 = 0;
            }
            sub_a7c1b4(g_f12f00);
            return v18;
        }
    }
    return 0;
}
