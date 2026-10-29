/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa3f11c..0xa3f218 (252 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a3f11c_0 {
    char field_0;
    char padding_1[119];
    struct st_a3f11c_1 *field_78;
} st_a3f11c_0;

typedef struct st_a3f11c_1 {
    unsigned int field_0;
} st_a3f11c_1;

extern char g_10002b0;

unsigned long long sub_a3f11c(st_a3f11c_0 *a0, unsigned int a1)
{
    unsigned int v11;  // w8
    unsigned long v12;  // cc_dep1
    unsigned int v13;  // w8
    unsigned long long v14;  // 4112
    unsigned long long v15;  // 4102
    unsigned long long v16;  // 4112
    unsigned long long v17;  // 4102
    unsigned long long v18;  // x0
    uint128_t v0;  // [bp-0xa8]
    uint128_t v1;  // [bp-0x98]
    unsigned long long v2;  // [bp-0x88]
    unsigned int v3;  // [bp-0x7c]
    char v4;  // [bp-0x78]
    uint128_t v5;  // [bp-0x50]
    uint128_t v6;  // [bp-0x40]
    unsigned long long v7;  // [bp-0x30]
    unsigned long v8;  // [bp-0x28]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v8 = *(long long *)&g_10002b0;
    v3 = a1;
    if (!a0 || (v11 = a0->field_0, v12 = v11 & 6, !(v11 & 6)))
    {
        sub_a368c8();
        sub_a369bc("crypto/evp/dh_ctrl.c", 22, "dh_paramgen_check");
        sub_a36abc(6, 147, 0);
        v18 = 0xfffffffe;
    }
    else if (!*(long long *)&a0->padding_1[31])
    {
        v13 = *(int *)a0->field_78;
        if (v13 != 920)
        {
            v14 = arm64g_calculate_condition(25, v12, 0, 0);
            v15 = arm64g_calculate_condition(19, (v14 & 1 ? v13 : 0x40000000), (v14 & 1 ? 28 : 0), 0);
            if (v15 & 1)
                goto LABEL_a3f20c;
            goto LABEL_a3f16c;
        }
        else
        {
            v16 = arm64g_calculate_condition(25, v12, 0, 0);
            v17 = arm64g_calculate_condition(16, (v16 & 1 ? v13 : 0x40000000), (v16 & 1 ? 28 : 0), 0);
            if (!(v17 & 1))
                goto LABEL_a3f16c;
LABEL_a3f20c:
            v18 = 0xffffffff;
        }
    }
    else
    {
LABEL_a3f16c:
        sub_a71bbc(sub_a6ffac("safeprime-generator", &v3), &v3);
        v5 = v0;
        v6 = v1;
        v7 = v2;
        v18 = sub_a5df54(a0, &v4);
    }
    if (*(long long *)&g_10002b0 == v8)
        return v18;
    ___stack_chk_fail();
}
