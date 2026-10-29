/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x98af2c..0x98aff4 (200 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_98af2c_0 {
    char padding_0[40];
    struct st_98af2c_1 *field_28;
} st_98af2c_0;

typedef struct st_98af2c_2 {
    struct st_98af2c_0 *field_0;
    char padding_8[56];
    unsigned long long field_40;
    unsigned long long field_48;
} st_98af2c_2;

typedef struct st_98af2c_1 {
    unsigned long long field_0;
} st_98af2c_1;


unsigned int sub_98af2c(st_98af2c_2 *a0, unsigned long a1, unsigned long long a2)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x8
    unsigned long long v8;  // 4110
    unsigned long v9;  // cc_op
    unsigned long v10;  // cc_dep1
    unsigned long v11;  // cc_dep2
    unsigned long v12;  // cc_ndep
    unsigned long v13;  // 4110
    unsigned long long v14;  // 4110
    unsigned long long v15;  // 4110
    unsigned long long v16;  // 4102
    unsigned long long v17;  // 4110
    unsigned long long v18;  // 4102
    unsigned long v4;  // 4110
    unsigned long v5;  // cc_op
    unsigned long v6;  // cc_dep1
    unsigned long v7;  // cc_dep2
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_40;
    if (v2)
    {
        v3 = a0->field_48;
        if (a2 <= v3)
        {
            v4 = arm64g_calculate_condition(v9 | 32, v10, v11, v12);
            v5 = 4;
            v6 = (v4 & 1 ? a0 : 0);
            v7 = (v4 & 1 ? /* unsupported instruction */ : 0);
            v8 = arm64g_calculate_condition(4, v6, v7, 0);
            if (!(v8 & 1))
                goto LABEL_98af56;
LABEL_98af55:
            v15 = arm64g_calculate_condition(v5, v6, v7, 0);
            v16 = arm64g_calculate_condition(132, (v15 & 1 ? v3 : 0x20000000), (v15 & 1 ? v2 : 0), 0);
            if (!(v16 & 1))
                goto LABEL_98af5c;
        }
        else
        {
            v13 = arm64g_calculate_condition(v9 | 32, v10, v11, v12);
            v5 = 0;
            v6 = (v13 & 1 ? a0 : 0);
            v7 = (v13 & 1 ? /* unsupported instruction */ : 0);
            v14 = arm64g_calculate_condition(0, v6, v7, 0);
            if (v14 & 1)
                goto LABEL_98af55;
LABEL_98af56:
            v17 = arm64g_calculate_condition(v5, v6, v7, 0);
            v18 = arm64g_calculate_condition(128, (v17 & 1 ? v3 : 0x20000000), (v17 & 1 ? v2 : 0), 0);
            if (!(v18 & 1))
            {
LABEL_98af5c:
                if (v3 != a2)
                {
                    a0->field_48 = v3 - a2;
                    return 1;
                }
                a0->field_0->field_28();
            }
        }
    }
    sub_c63768(a0);
    return 0xfffffffe;
}
