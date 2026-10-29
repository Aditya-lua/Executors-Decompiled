/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc5326c..0xc53378 (268 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c5326c_0 {
    char padding_0[96];
    unsigned long long field_60;
    char padding_68[80];
    unsigned long long field_b8;
    long long field_c0;
    char padding_c8[8];
    unsigned long long field_d0;
    long long field_d8;
    char padding_e0[8];
    unsigned long long field_e8;
    long long field_f0;
    char padding_f8[8];
    unsigned long long field_100;
    long long field_108;
    char padding_110[96];
    long long field_170;
} st_c5326c_0;


void sub_c5326c(char a0, st_c5326c_0 *a1)
{
    unsigned long v2;  // cc_op
    unsigned long v3;  // cc_dep1
    unsigned long long v6;  // 4110
    unsigned long long v7;  // 4102
    unsigned long v8;  // cc_dep2
    unsigned long v9;  // cc_ndep
    unsigned long long v10;  // 4102
    unsigned long long v11;  // 4102
    unsigned long long v4;  // 4110
    unsigned long long v5;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a0 == 82)
    {
        v4 = arm64g_calculate_condition(v2, v3, v8, v9);
        v5 = arm64g_calculate_condition(20, (v4 & 1 ? a1 : 0x40000000), 0, 0);
        if (!(v5 & 1))
            return;
    }
    else
    {
        v6 = arm64g_calculate_condition(v2, v3, v8, v9);
        v7 = arm64g_calculate_condition(16, (v6 & 1 ? a1 : 0x40000000), 0, 0);
        if (!(v7 & 1))
            return;
    }
    do
    {
        /* unsupported instruction */;
        /* unsupported instruction */;
        /* unsupported instruction */;
    } while (/* unsupported instruction */ ^ 1);
    v10 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
    if (!(v10 & 1))
    {
        /* unsupported instruction */;
        sub_c4c6d8(&a1[1].padding_0[72]);
    }
    do
    {
        /* unsupported instruction */;
        /* unsupported instruction */;
        /* unsupported instruction */;
    } while (/* unsupported instruction */ ^ 1);
    v11 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
    if (!(v11 & 1))
    {
        /* unsupported instruction */;
        sub_c53420(a1->field_170);
    }
    if (a1->field_60 != 47)
    {
        if (a1->field_b8)
            _free(a1->field_c0);
        if (a1->field_d0)
            _free(a1->field_d8);
        if (a1->field_e8)
            _free(a1->field_f0);
        if (a1->field_100)
            _free(a1->field_108);
    }
    _free();
    return;
}
