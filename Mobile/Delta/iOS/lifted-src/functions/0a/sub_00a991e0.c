/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa991e0..0xa992cc (236 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a991e0_1 {
    char padding_0[16];
    struct st_a991e0_2 *field_10;
} st_a991e0_1;

typedef struct st_a991e0_2 {
    unsigned long long field_0;
} st_a991e0_2;

typedef struct st_a991e0_0 {
    int field_0;
} st_a991e0_0;

extern long long g_a98de0;
extern long long g_f09020;
extern unsigned int g_f12ef8;
extern long long g_f12f00;
extern st_a991e0_0 *g_f12f08;
extern long long g_f12f10;

int * sub_a991e0(unsigned long long a0, unsigned int a1)
{
    unsigned long v5;  // cc_op
    unsigned long v8;  // cc_ndep
    unsigned long long v9;  // 4112
    unsigned long long v10;  // 4102
    unsigned long v11;  // cc_dep1
    unsigned long v12;  // cc_dep2
    int *v13;  // x0
    int *v14;  // x19
    unsigned int v15;  // w0
    st_a991e0_1 *v16;  // x0
    unsigned long long v6;  // 4112
    unsigned long long v7;  // 4102
    unsigned int v0;  // [bp-0x48]
    unsigned long long v1;  // [bp-0x40]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    if (sub_a7c208(&g_f09020, &g_a98de0))
    {
        v6 = arm64g_calculate_condition(v5 | 16, v11, v12, v8);
        v7 = arm64g_calculate_condition(19, (v6 & 1 ? g_f12ef8 : 0x40000000), 0, 0);
        if (v7 & 1)
            goto LABEL_a9922c;
    }
    else
    {
        v9 = arm64g_calculate_condition(v5 | 16, v11, v12, v8);
        v10 = arm64g_calculate_condition(16, (v9 & 1 ? g_f12ef8 : 0x40000000), 0, 0);
        if (v10 & 1)
        {
LABEL_a9922c:
            v13 = sub_a7c198(g_f12f00);
            if (!(unsigned int)v13)
                return v13;
            v1 = a0;
            v0 = a1 & 0xffff7fff;
            v14 = sub_a66994(g_f12f10, &v0);
            if (v14)
            {
                if (g_f12f08)
                {
                    v15 = sub_ad69e4(g_f12f08);
                    if ((int)v15 > *v14)
                    {
                        v16 = sub_ad69f8(g_f12f08);
                        v16->field_10();
                    }
                }
                sub_a6c2e4(v14, "crypto/objects/o_names.c", 272);
                v14 = 1;
            }
            sub_a7c1b4(g_f12f00);
            return v14;
        }
    }
    return 0;
}
