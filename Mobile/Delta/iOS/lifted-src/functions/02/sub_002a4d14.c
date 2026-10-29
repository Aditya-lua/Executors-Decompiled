/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2a4d14..0x2a4e80 (364 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2a4d14_5 {
    char padding_0[8];
    struct st_2a4d14_4 *field_8;
} st_2a4d14_5;

typedef struct st_2a4d14_4 {
    struct st_2a4d14_3 *field_0;
    char padding_8[4];
    unsigned int field_c;
} st_2a4d14_4;

typedef struct st_2a4d14_3 {
    char padding_0[2];
    char field_2;
} st_2a4d14_3;

typedef struct st_2a4d14_2 {
    char padding_0[24];
    struct st_2a4d14_1 *field_18;
} st_2a4d14_2;

typedef struct st_2a4d14_1 {
    char padding_0[48];
    unsigned long long field_30;
} st_2a4d14_1;

typedef struct st_2a4d14_6 {
    char padding_0[2];
    char field_2;
    char padding_3[5];
    struct st_2a4d14_2 *field_8;
    char padding_10[24];
    struct st_2a4d14_5 *field_28;
    char padding_30[16];
    struct st_2a4d14_5 *field_40;
} st_2a4d14_6;

typedef struct st_2a4d14_0 {
    char field_0;
} st_2a4d14_0;

typedef struct st_2a4d14_7 {
    char padding_0[1408];
    unsigned long long field_580;
} st_2a4d14_7;

typedef struct st_2a4d14_9 {
    unsigned long long field_0;
} st_2a4d14_9;

typedef struct st_2a4d14_8 {
    char padding_0[96];
    struct st_2a4d14_7 *field_60;
} st_2a4d14_8;

extern st_2a4d14_8 *g_f0d198;
extern st_2a4d14_9 *g_f0d378;

unsigned int sub_2a4d14(st_2a4d14_6 *a0, unsigned int a1)
{
    st_2a4d14_5 *iter;  // x8
    st_2a4d14_5 *v7;  // x9
    unsigned long long v16;  // 4102
    unsigned int node;  // w11
    unsigned long v9;  // cc_dep1
    unsigned long v10;  // cc_dep2
    unsigned long long v11;  // 4102
    unsigned long long v12;  // 4102
    unsigned long v13;  // cc_dep1
    unsigned long v14;  // cc_dep2
    unsigned long long v15;  // 4102
    st_2a4d14_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_2a4d14_0 *v1;  // [bp-0x28]
    st_2a4d14_0 **v2;  // [bp-0x20]
    char *v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    if (a0->field_8->field_18->field_30 != g_f0d198->field_60->field_580)
        g_f0d378();
    iter = a0->field_40;
    v7 = a0->field_28;
    if ((unsigned int)(iter - v7 >> 4) * 2863311531 > a1)
    {
        if (v7 > iter)
            return 0;
        node = 0;
        if (a0->field_2 >= 0)
        {
            do
            {
                if (iter->field_8->field_c == 8)
                {
                    v3 = &v2;
                    v2 = &v3;
                    if (iter->field_8->field_0->field_2 >> 5 & 1 || (v3 = &v2, v2 = &v3, iter->field_8->field_0->field_2 >> 4 & 1))
                    {
                    }
                    else
                    {
                        v9 = node;
                        v10 = a1;
                        if (node == a1)
                        {
                            v11 = arm64g_calculate_condition(19, v9, v10, 0);
                            if (!(v11 & 1))
                                g_f0d378();
                        }
                        else
                        {
                            node += 1;
                            v12 = arm64g_calculate_condition(19, v9, v10, 0);
                            if (!(v12 & 1))
                                g_f0d378();
                        }
                    }
                }
            } while ((iter = (char *)iter - 48, iter >= v7));
        }
        else
        {
            while (1)
            {
                if (iter->field_8->field_c == 8)
                {
                    v3 = &v2;
                    v2 = &v3;
                    if (!(iter->field_8->field_0->field_2 >> 5 & 1))
                    {
                        v13 = node;
                        v14 = a1;
                        if (node == a1)
                        {
                            v15 = arm64g_calculate_condition(19, v13, v14, 0);
                            if (!(v15 & 1))
                                g_f0d378();
                        }
                        else
                        {
                            node += 1;
                            v16 = arm64g_calculate_condition(19, v13, v14, 0);
                            if (!(v16 & 1))
                                g_f0d378();
                        }
                    }
                }
                iter = (char *)iter - 48;
                if (iter < v7)
                    return 0;
            }
        }
        return 0;
    }
    g_f0d378();
}
