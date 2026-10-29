/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa4fe6c..0xa50060 (500 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a4fe6c_0 {
    char padding_0[8];
    unsigned long long field_8;
} st_a4fe6c_0;

extern char g_10002b0;

unsigned long long sub_a4fe6c(long long a0, st_a4fe6c_0 *a1)
{
    unsigned long v20;  // cc_dep1
    unsigned long v21;  // cc_dep2
    unsigned long v22;  // cc_ndep
    unsigned long v23;  // 4110
    unsigned long v24;  // cc_op
    unsigned long long v25;  // 4108
    unsigned long v26;  // x23
    unsigned long v28;  // 4110
    unsigned long v29;  // cc_dep1
    unsigned long long v30;  // 4105
    unsigned long long v31;  // w8
    unsigned long long v32;  // 4112
    unsigned long v33;  // 4110
    unsigned long v34;  // cc_dep1
    unsigned long long v35;  // 4105
    unsigned long long v36;  // 4112
    unsigned long long v37;  // x21
    unsigned long long v38;  // w9
    void* v39;  // x23
    unsigned long long v40;  // x22
    unsigned long long v41;  // x0
    unsigned long v17;  // 4110
    unsigned long v18;  // cc_op
    unsigned long v19;  // cc_dep1
    unsigned long v0;  // [bp-0x108]
    uint128_t v1;  // [bp-0x100]
    uint128_t v2;  // [bp-0xf0]
    unsigned long long v3;  // [bp-0xe0]
    unsigned long v4;  // [bp-0xd8], Other Possible Types: unsigned long long
    char v5;  // [bp-0xd0]
    uint128_t v6;  // [bp-0xa8]
    uint128_t v7;  // [bp-0x98]
    unsigned long long v8;  // [bp-0x88]
    uint128_t v9;  // [bp-0x80]
    uint128_t v10;  // [bp-0x70]
    unsigned long long v11;  // [bp-0x60]
    unsigned long v12;  // [bp-0x58]
    char *v13;  // [bp-0x10]
    char v14;  // [bp+0x0]

    v13 = &v14;
    v12 = *(long long *)&g_10002b0;
    v4 = 0;
    sub_a71670("alg_id_param", 0, 0);
    v6 = v1;
    v7 = v2;
    v8 = v3;
    sub_a71bbc(sub_a71670("algorithm-id-params", 0, 0), 0, 0);
    v9 = v1;
    v10 = v2;
    v11 = v3;
    if (sub_a4dd70(a0, &v5))
    {
        if (sub_a6fc18(&v5))
        {
            v17 = arm64g_calculate_condition(v24 | 16, v20, v21, v22);
            v18 = 4;
            v19 = (v17 & 1 ? /* unsupported instruction */ : 0x40000000);
        }
        else
        {
            v23 = arm64g_calculate_condition(v24 | 16, v20, v21, v22);
            v18 = 0;
            v19 = (v23 & 1 ? /* unsupported instruction */ : 0x40000000);
        }
        v25 = arm64g_calculate_condition(v18 | 16, v19, 0, 0);
        v26 = !(v25 & 1);
        if (sub_a6fc18())
        {
            v28 = arm64g_calculate_condition(v24 | 16, v20, v21, v22);
            v29 = (v28 & 1 ? v8 : 0x40000000);
            v30 = arm64g_calculate_condition(20, v29, 0, 0);
            v31 = (unsigned int)!(v30 & 1);
            v32 = arm64g_calculate_condition(20, v29, 0, 0);
            if (!(v32 & 1))
                goto LABEL_a4ff4c;
        }
        else
        {
            v33 = arm64g_calculate_condition(v24 | 16, v20, v21, v22);
            v34 = (v33 & 1 ? v8 : 0x40000000);
            v35 = arm64g_calculate_condition(16, v34, 0, 0);
            v31 = (unsigned int)!(v35 & 1);
            v36 = arm64g_calculate_condition(16, v34, 0, 0);
            if (!(v36 & 1))
            {
LABEL_a4ff4c:
                if (v26 & 1)
                    goto LABEL_a4ff50;
            }
        }
        v37 = 0xffffffff;
        if ((unsigned int)v26)
            v38 = 0xffffffff;
        else
            v38 = 0;
        v4 = a1->field_8;
        if (!v31)
            v38 = 1;
        v39 = &(&v5)[v38 * 40];
        v40 = (long long)v39[32];
        v41 = sub_a6bf4c();
        if (v41)
        {
            v0 = v41;
            sub_a71670(*(long long *)v39, v41, v40);
            *(uint128_t *)v39 = v1;
            *(uint128_t *)&v39[16] = v2;
            *(unsigned long long *)&v39[32] = v3;
            if (sub_a4dd70(a0, &v5) && sub_a6fc18(v39) && sub_9cf1d8(&v4, &v0, (int)v40))
            {
                a1->field_8 = v4;
                v37 = 1;
            }
            else
            {
                v37 = 0xffffffff;
            }
        }
    }
    else
    {
LABEL_a4ff50:
        v41 = 0;
        v37 = 0xffffffff;
    }
    sub_a6c2e4(v41, "crypto/evp/evp_lib.c", 1328);
    if (*(long long *)&g_10002b0 == v12)
        return v37;
    ___stack_chk_fail();
}
