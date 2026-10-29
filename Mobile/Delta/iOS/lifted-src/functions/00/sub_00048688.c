/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x48688..0x48a2c (932 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_48688_1 {
    char padding_0[8];
    unsigned int field_8;
    char padding_c[16];
    unsigned int field_1c;
    long long field_20;
    long long field_28;
} st_48688_1;

typedef struct st_48688_0 {
    char field_0;
} st_48688_0;

extern unsigned long long g_e65b48;
extern unsigned long long g_e65b98;
extern unsigned int g_f00bd0;

unsigned long long sub_48688(long long a0, st_48688_1 **a1)
{
    unsigned long long v4;  // x0
    st_48688_1 *v5;  // x21
    unsigned long v8;  // cc_dep2
    unsigned long v9;  // cc_ndep
    unsigned long long v10;  // 4112
    unsigned long long v11;  // 4102
    unsigned long v12;  // cc_op
    unsigned long v13;  // cc_dep1
    unsigned long long v6;  // 4112
    unsigned long long v7;  // 4102
    st_48688_0 **v0;  // [bp-0x78], Other Possible Types: char
    st_48688_0 *v1;  // [bp-0x70]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = sub_39b14(a0 + 264, a1[4]);
    if ((unsigned int)v4)
    {
        if (a1[6])
            return sub_38924(a0);
        return v4;
    }
    v5 = a1[4];
    if (v5)
    {
        v6 = arm64g_calculate_condition(v12 | 16, v13, v8, v9);
        v7 = arm64g_calculate_condition(3, (v6 & 1 ? v5->field_8 : 0), (v6 & 1 ? g_f00bd0 : 0), 0);
        if (v7 & 1)
            goto LABEL_48734;
    }
    else
    {
        v10 = arm64g_calculate_condition(v12 | 16, v13, v8, v9);
        v11 = arm64g_calculate_condition(0, (v10 & 1 ? v5->field_8 : 0), (v10 & 1 ? g_f00bd0 : 0), 0);
        if (v11 & 1)
        {
LABEL_48734:
            if (v5->field_1c != 14)
            {
                goto *((void *)(g_e65b98));
            }
            else if (sub_39b14(a0 + 264, v5->field_28))
            {
                sub_4716c(a0, v5->field_20);
                if (a1[6])
                    sub_38924(a0);
                goto *((void *)(g_e65b48));
            }
            else
            {
                goto *((void *)(g_e65b98));
            }
        }
    }
    goto *((void *)(g_e65b98));
}
