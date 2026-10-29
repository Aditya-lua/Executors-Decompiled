/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x98ff60..0x990050 (240 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_98ff60_0 {
    char *field_0;
    unsigned long long field_8;
} st_98ff60_0;

extern char _NSHomeDirectory;

unsigned long long sub_98ff60(st_98ff60_0 *a0, unsigned long long *a1)
{
    unsigned long long v7;  // x22
    unsigned long long v8;  // x21
    unsigned long v16;  // cc_dep1
    unsigned long v17;  // cc_dep2
    unsigned long v18;  // cc_ndep
    unsigned long long v19;  // 4110
    unsigned long long v20;  // 4102
    unsigned long v21;  // cc_op
    unsigned long long v22;  // 4110
    unsigned long long v9;  // x20
    unsigned long long v23;  // 4102
    unsigned long long v24;  // x11
    unsigned long long v25;  // x11
    unsigned long long v26;  // x11
    unsigned long long v27;  // x11
    unsigned long long v28;  // x11
    unsigned long long v10;  // x19
    unsigned long long v29;  // x11
    unsigned long long v30;  // x11
    unsigned long long v11;  // x30
    unsigned long long v12;  // x20
    unsigned long long v13;  // x0
    char *v14;  // x10
    unsigned long long v15;  // x9
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    if (!a0->field_8)
        return 0;
    v0 = v7;
    v1 = v8;
    v2 = v9;
    v3 = v10;
    v4 = &v6;
    v5 = v11;
    v12 = 1 << (*a0->field_0 >> 6 & 63);
    if (a0->field_8 < v12)
        return 0;
    v13 = sub_a7b0d8(a0->field_0);
    v14 = &a0->field_0[v12];
    v15 = a0->field_8 - v12;
    a0->field_0 = v14;
    a0->field_8 = v15;
    if (v13 == 27)
    {
        v19 = arm64g_calculate_condition(v21, v16, v17, v18);
        v20 = arm64g_calculate_condition(36, (v19 & 1 ? v15 : 0), (v19 & 1 ? 8 : 0), 0);
        if (v20 & 1)
        {
            v24 = *v14 * 0x100000000000000;
            *a1 = v24;
            v25 = v24 | v14[1] * 0x1000000000000;
            *a1 = v25;
            v26 = v25 | v14[2] * 0x10000000000;
            *a1 = v26;
            v27 = v26 | v14[3] * 0x100000000;
            *a1 = v27;
            v28 = v27 | v14[4] * &_NSHomeDirectory;
            *a1 = v28;
            v29 = v28 | v14[5] * 0x10000;
            *a1 = v29;
            v30 = v29 | v14[6] * 0x100;
            *a1 = v30;
            *a1 = v30 | v14[7];
            a0->field_0 = v14 + 8;
            a0->field_8 = v15 - 8;
            return 1;
        }
    }
    else
    {
        v22 = arm64g_calculate_condition(v21, v16, v17, v18);
        v23 = arm64g_calculate_condition(32, (v22 & 1 ? v15 : 0), (v22 & 1 ? 8 : 0), 0);
        if (v23 & 1)
        {
            v24 = *v14 * 0x100000000000000;
            *a1 = v24;
            v25 = v24 | v14[1] * 0x1000000000000;
            *a1 = v25;
            v26 = v25 | v14[2] * 0x10000000000;
            *a1 = v26;
            v27 = v26 | v14[3] * 0x100000000;
            *a1 = v27;
            v28 = v27 | v14[4] * &_NSHomeDirectory;
            *a1 = v28;
            v29 = v28 | v14[5] * 0x10000;
            *a1 = v29;
            v30 = v29 | v14[6] * 0x100;
            *a1 = v30;
            *a1 = v30 | v14[7];
            a0->field_0 = v14 + 8;
            a0->field_8 = v15 - 8;
            return 1;
        }
    }
    return 0;
}
