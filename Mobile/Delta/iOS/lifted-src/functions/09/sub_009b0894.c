/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9b0894..0x9b0ae8 (596 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9b0894_0 {
    char padding_0[128];
    struct st_9b0894_1 *field_80;
} st_9b0894_0;

typedef struct st_9b0894_3 {
    char padding_0[8];
    struct st_9b0894_2 *field_8;
} st_9b0894_3;

typedef struct st_9b0894_2 {
    char field_0;
    struct st_9b0894_1 *field_1;
    struct st_9b0894_1 *field_2;
    struct st_9b0894_1 *field_3;
} st_9b0894_2;

typedef struct st_9b0894_4 {
    char padding_0[24];
    struct st_9b0894_0 *field_18;
    char padding_20[88];
    struct st_9b0894_1 *field_78;
    char padding_80[44];
    unsigned int field_ac;
    char padding_b0[72];
    struct st_9b0894_3 *field_f8;
    unsigned long long field_100;
    struct st_9b0894_1 *field_108;
    char padding_110[480];
    unsigned long long field_2f0;
    struct st_9b0894_1 *field_2f8;
    char padding_300[504];
    struct st_9b0894_1 *field_4f8;
    char padding_500[1880];
    char field_c58;
    char padding_c59[223];
    unsigned long long field_d38;
} st_9b0894_4;

typedef struct st_9b0894_1 {
    unsigned long long field_0;
} st_9b0894_1;


int sub_9b0894(st_9b0894_4 *a0, st_9b0894_1 **a1)
{
    st_9b0894_2 *v2;  // x21
    unsigned long long *v3;  // w8
    unsigned long long v4;  // 4112
    unsigned long long v5;  // 4102
    unsigned long long v6;  // 4112
    unsigned long long v7;  // 4102
    unsigned long v8;  // x9
    st_9b0894_2 *v9;  // x10
    unsigned long long *v10;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_f8->field_8;
    while (1)
    {
        if (3 >= a0->field_108)
            a0->field_18->field_80();
        if (!(int)a0->field_78)
        {
            v3 = (unsigned long long *)v2->field_0;
            if (a0->field_ac != 1)
            {
                v4 = arm64g_calculate_condition(20, a0->field_108, 3, 0);
                v5 = arm64g_calculate_condition(19, (v4 & 1 ? v3 & 0xff : 0), 0, 0);
                if (v5 & 1)
                    break;
            }
            else
            {
                v6 = arm64g_calculate_condition(20, a0->field_108, 3, 0);
                v7 = arm64g_calculate_condition(16, (v6 & 1 ? v3 & 0xff : 0), 0, 0);
                if (v7 & 1)
                    break;
            }
            if (!(&v2->field_0)[1] && !(&v2->field_0)[2] && !(&v2->field_0)[3])
            {
                a0->field_108 = 0;
                if (a0->field_4f8)
                    a0->field_4f8();
            }
            else
            {
                v3 = (unsigned long long *)0;
                break;
            }
        }
        else
        {
            v3 = (unsigned long long *)v2->field_0;
            break;
        }
    }
    *(unsigned int *)a1 = (unsigned int)v3;
    *(unsigned int *)&a0->field_2f8 = v2->field_0;
    if (sub_993e5c(&a0->field_c58))
    {
        v8 = a0->field_d38 + 4;
        v9 = a0->field_f8->field_8;
        v10 = 4;
    }
    else
    {
        v10 = 0;
        v8 = (&v2->field_0)[1] * 0x10000 | (&v2->field_0)[2] * 0x100 | (&v2->field_0)[3];
        v9 = &(&a0->field_f8->field_8->field_0)[4];
    }
    a0->field_2f0 = v8;
    a0->field_100 = v9;
    a0->field_108 = v10;
    return 1;
}
