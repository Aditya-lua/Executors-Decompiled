/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9fd594..0x9fd688 (244 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9fd594_0 {
    char padding_0[32];
    unsigned long long field_20;
} st_9fd594_0;

extern long long g_e8d440;

char * sub_9fd594(st_9fd594_0 *a0, long long a1)
{
    char *v14;  // x8
    unsigned int v15;  // w9
    unsigned long long v20;  // 4112
    unsigned long v21;  // cc_op
    unsigned long v22;  // cc_dep1
    unsigned long v23;  // cc_dep2
    unsigned long v24;  // cc_ndep
    unsigned long v25;  // 4110
    unsigned long long v26;  // 4112
    unsigned long long v16;  // 4139
    unsigned long long v27;  // 4112
    unsigned long long v28;  // 4102
    unsigned long long v29;  // 4112
    unsigned long long v30;  // 4102
    char *v31;  // x19
    unsigned long v17;  // 4110
    unsigned long v18;  // cc_op
    unsigned long v19;  // cc_dep1
    char v0;  // [bp-0x8c], Other Possible Types: unsigned int
    char *v1;  // [bp-0x88]
    unsigned int v2;  // [bp-0x80]
    char v3;  // [bp-0x78]
    unsigned long long v4;  // [bp-0x70]
    char *v5;  // [bp-0x68], Other Possible Types: unsigned long
    char *v6;  // [bp-0x60]
    char v7;  // [bp-0x58]
    char v8;  // [bp-0x50]
    char v9;  // [bp-0x48]
    unsigned long v10;  // [bp-0x40]
    char *v11;  // [bp-0x38]
    char *v12;  // [bp-0x10]
    char v13;  // [bp+0x0]

    v12 = &v13;
    v5 = 0;
    v6 = 0;
    v1 = 0;
    sub_a60d24(&a0->padding_0[8], &v7, &v8, &v9);
    v10 = a0->field_20;
    sub_a60ed4(&a0->padding_0[8], &v3, &v1, &v0);
    v14 = 0;
    v15 = (unsigned int)v1;
    v2 = v15;
    v16 = arm64g_calculate_condition(0x11, v0, 1, 0);
    if (v16 & 1)
    {
        v17 = arm64g_calculate_condition(v21 | 16, v22, v23, v24);
        v18 = 4;
        v19 = (v17 & 1 ? v3 : 0x40000000);
        v20 = arm64g_calculate_condition(20, v19, 0, 0);
        if (!(v20 & 1))
            goto LABEL_9fd60a;
LABEL_9fd609:
        v27 = arm64g_calculate_condition(v18 | 16, v19, 0, 0);
        v28 = arm64g_calculate_condition(179, (v27 & 1 ? v15 : 0x80000000), v27 & 1, 0);
        if (!(v28 & 1))
            goto LABEL_9fd610;
    }
    else
    {
        v25 = arm64g_calculate_condition(v21 | 16, v22, v23, v24);
        v18 = 0;
        v19 = (v25 & 1 ? v3 : 0x40000000);
        v26 = arm64g_calculate_condition(16, v19, 0, 0);
        if (v26 & 1)
            goto LABEL_9fd609;
LABEL_9fd60a:
        v29 = arm64g_calculate_condition(v18 | 16, v19, 0, 0);
        v30 = arm64g_calculate_condition(176, (v29 & 1 ? v15 : 0x80000000), v29 & 1, 0);
        if (!(v30 & 1))
        {
LABEL_9fd610:
            v4 = 8;
            v5 = &v2;
            v6 = sub_9e4958();
            if (!v6)
            {
                return 0;
            }
            else if (sub_9e4d58())
            {
                v14 = &v5;
            }
            else
            {
                sub_9e48d4(v6);
                return 0;
            }
        }
    }
    v11 = v14;
    v31 = sub_9ccc7c(&v7, a1, &g_e8d440);
    sub_9e48d4(v6);
    return v31;
}
