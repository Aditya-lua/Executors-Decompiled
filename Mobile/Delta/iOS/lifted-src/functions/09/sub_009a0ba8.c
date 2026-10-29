/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a0ba8..0x9a0d50 (424 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9a0ba8_1 {
    long long field_0;
    struct st_9a0ba8_0 *field_8;
} st_9a0ba8_1;

typedef struct st_9a0ba8_2 {
    char padding_0[32];
    struct st_9a0ba8_0 *field_20;
    char padding_28[8];
    unsigned long long field_30;
} st_9a0ba8_2;

typedef struct st_9a0ba8_0 {
    char padding_0[1];
    char field_1;
    char padding_2[14];
    unsigned long long field_10;
    char padding_18[8];
    unsigned long long field_20;
    char padding_28[8];
    unsigned long long field_30;
} st_9a0ba8_0;

extern char g_9a0e00;

st_9a0ba8_0 * sub_9a0ba8(st_9a0ba8_0 **a0, st_9a0ba8_1 *a1)
{
    unsigned long long v11;  // x26
    unsigned long long v12;  // x25
    st_9a0ba8_0 *v21;  // x8
    st_9a0ba8_0 *v22;  // x23
    st_9a0ba8_0 *v23;  // x24
    st_9a0ba8_0 *v24;  // w9
    long long *v25;  // x26
    st_9a0ba8_0 *v26;  // x0
    st_9a0ba8_2 *v27;  // x25
    unsigned long long v28;  // x0
    unsigned long v29;  // cc_op
    unsigned long v30;  // cc_dep1
    unsigned long long v13;  // x24
    unsigned long v31;  // cc_dep2
    unsigned long v32;  // cc_ndep
    unsigned long v33;  // 4110
    unsigned long v34;  // cc_op
    unsigned long v35;  // cc_dep1
    unsigned long v36;  // 4110
    unsigned long long v14;  // x23
    unsigned long long v37;  // 4107
    st_9a0ba8_0 **v38;  // x10
    st_9a0ba8_0 *v39;  // x0
    st_9a0ba8_0 *v40;  // x8
    st_9a0ba8_0 *v41;  // x21
    unsigned long long *v42;  // x23
    unsigned long long v15;  // x22
    unsigned long long v16;  // x21
    unsigned long long v17;  // x20
    unsigned long long v18;  // x19
    unsigned long long v19;  // x30
    st_9a0ba8_0 *v20;  // x0
    unsigned long long v0;  // [bp-0x50]
    unsigned long long v1;  // [bp-0x48]
    unsigned long long v2;  // [bp-0x40]
    unsigned long long v3;  // [bp-0x38]
    unsigned long long v4;  // [bp-0x30]
    unsigned long long v5;  // [bp-0x28]
    unsigned long long v6;  // [bp-0x20]
    unsigned long long v7;  // [bp-0x18]
    char *v8;  // [bp-0x10]
    unsigned long long v9;  // [bp-0x8]
    char v10;  // [bp+0x0]

    if (!a1->field_8)
        return 1;
    v0 = v11;
    v1 = v12;
    v2 = v13;
    v3 = v14;
    v4 = v15;
    v5 = v16;
    v6 = v17;
    v7 = v18;
    v8 = &v10;
    v9 = v19;
    v20 = sub_a6dac4(a1->field_0, a1->field_8 * 56, "ssl/statem/extensions_cust.c", 308);
    *a0 = v20;
    if (!v20)
        return v20;
    v21 = a1->field_8;
    a0[1] = v21;
    if (!v21)
        return 1;
    v22 = 0;
    v23 = 0;
    v24 = (st_9a0ba8_0 *)0;
    do
    {
        if (*(long long *)&(v22->padding_0)[a1->field_0 + 16] == &g_9a0e00)
        {
            if (!v24)
            {
                v25 = &(v22->padding_0)[a1->field_0];
                v26 = sub_a6dac4(v25[4], 24, "ssl/statem/extensions_cust.c", 290);
                v27 = *a0 + v22;
                v27->field_20 = v26;
                v28 = sub_a6dac4(v25[6], 16, "ssl/statem/extensions_cust.c", 292);
                v27->field_30 = v28;
                if (v27->field_20)
                {
                    v33 = arm64g_calculate_condition(v29 | 16, v30, v31, v32);
                    v34 = 4;
                    v35 = (v33 & 1 ? v28 : 0x40000000);
                }
                else
                {
                    v36 = arm64g_calculate_condition(v29 | 16, v30, v31, v32);
                    v34 = 0;
                    v35 = (v36 & 1 ? v28 : 0x40000000);
                }
                v37 = arm64g_calculate_condition(v34 | 16, v35, 0, 0);
                v24 = (st_9a0ba8_0 *)(unsigned int)!(v37 & 1);
                v21 = a1->field_8;
            }
            else
            {
                v38 = *a0 + v22;
                v38[4] = 0;
                v38[6] = 0;
            }
        }
    } while ((v23 = &v23->field_1, v22 += 1, v21 > v23));
    if (v24)
    {
        v39 = *a0;
        v40 = a0[1];
        if (a0[1])
        {
            v41 = 0;
            v42 = &*a0->field_30;
            do
            {
                if (*(long long *)((char *)v42 - 32) == &g_9a0e00)
                {
                    sub_a6c2e4(*(long long *)((char *)v42 - 16), "ssl/statem/extensions_cust.c", 382);
                    sub_a6c2e4(*v42, "ssl/statem/extensions_cust.c", 383);
                    v40 = a0[1];
                }
            } while ((v41 = &v41->field_1, v42 += 7, v40 > v41));
            v39 = *a0;
        }
        sub_a6c2e4(v39, "ssl/statem/extensions_cust.c", 385);
        *a0 = 0;
        a0[1] = 0;
        return 0;
    }
    return 1;
}
