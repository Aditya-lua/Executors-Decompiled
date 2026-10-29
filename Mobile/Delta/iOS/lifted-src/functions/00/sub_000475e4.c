/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x475e4..0x47694 (176 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_475e4_0 {
    char padding_0[8];
    unsigned int field_8;
    char padding_c[20];
    long long field_20;
} st_475e4_0;

typedef struct st_475e4_1 {
    char padding_0[32];
    struct st_475e4_2 *field_20;
    struct st_475e4_0 *field_28;
} st_475e4_1;

typedef struct st_475e4_2 {
    struct st_475e4_0 *field_0;
} st_475e4_2;

extern unsigned int g_f00d50;

void sub_475e4(long long *a0, st_475e4_1 *a1)
{
    unsigned long long v9;  // x24
    unsigned long long v10;  // x23
    unsigned long v19;  // cc_dep1
    unsigned long v20;  // cc_op
    unsigned long v21;  // cc_dep2
    unsigned long v22;  // cc_ndep
    unsigned long long v23;  // x24
    st_475e4_0 *v24;  // x20
    unsigned long long v25;  // 4112
    unsigned long long v26;  // 4102
    unsigned long long v27;  // 4112
    unsigned long long v28;  // 4102
    unsigned long long v11;  // x22
    long long v29;  // x21
    unsigned long long v12;  // x21
    unsigned long long v13;  // x20
    unsigned long long v14;  // x19
    unsigned long long v15;  // x30
    st_475e4_0 **iter;  // x22
    unsigned int v17;  // w8
    unsigned long long i;  // x24
    unsigned long long v0;  // [bp-0x40]
    unsigned long long v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    if (!a1->field_28)
        return;
    v0 = v9;
    v1 = v10;
    v2 = v11;
    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = &v8;
    v7 = v15;
    iter = a1->field_20;
    v17 = g_f00d50;
    i = a1->field_28 * 8;
    v19 = cc_dep1;
    do
    {
        v23 = i;
        v24 = *iter;
        if (v24)
        {
            v25 = arm64g_calculate_condition(v20 | 16, v19, v21, v22);
            v26 = arm64g_calculate_condition(19, (v25 & 1 ? v24->field_8 : 0), (v25 & 1 ? v17 : 0), 0);
            if (v26 & 1)
                continue;
        }
        else
        {
            v27 = arm64g_calculate_condition(v20 | 16, v19, v21, v22);
            v28 = arm64g_calculate_condition(16, (v27 & 1 ? v24->field_8 : 0), (v27 & 1 ? v17 : 0), 0);
            if (v28 & 1)
                continue;
        }
        v29 = sub_3b87c(a0, v24, 1);
        sub_3f5c4(a0, v24->field_20, v29, 0xffffffff);
        sub_2ad10(*a0, 2, v29, 0, 0);
        v17 = g_f00d50;
        iter += 1;
        i = v23 - 8;
        v20 = 4;
        v21 = 8;
        v22 = 0;
        v19 = v23;
    } while (i);
    return;
}
