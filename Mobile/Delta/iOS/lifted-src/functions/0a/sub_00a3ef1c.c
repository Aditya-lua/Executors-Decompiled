/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa3ef1c..0xa3f01c (256 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a3ef1c_0 {
    char field_0;
    char padding_1[119];
    struct st_a3ef1c_1 *field_78;
} st_a3ef1c_0;

typedef struct st_a3ef1c_1 {
    unsigned int field_0;
} st_a3ef1c_1;

extern char g_10002b0;

unsigned long long sub_a3ef1c(st_a3ef1c_0 *a0, unsigned int a1)
{
    unsigned int v10;  // w8
    unsigned long v11;  // cc_dep1
    unsigned int v12;  // w8
    unsigned long long v13;  // 4112
    unsigned long long v14;  // 4102
    unsigned long long v15;  // 4112
    unsigned long long v16;  // 4102
    unsigned long long v17;  // x0
    uint128_t v0;  // [bp-0xa8]
    uint128_t v1;  // [bp-0x98]
    unsigned long long v2;  // [bp-0x88]
    char v3;  // [bp-0x78]
    uint128_t v4;  // [bp-0x50]
    uint128_t v5;  // [bp-0x40]
    unsigned long long v6;  // [bp-0x30]
    unsigned long v7;  // [bp-0x28]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v7 = *(long long *)&g_10002b0;
    if (!a0 || (v10 = a0->field_0, v11 = v10 & 6, !(v10 & 6)))
    {
        sub_a368c8();
        sub_a369bc("crypto/evp/dh_ctrl.c", 22, "dh_paramgen_check");
        sub_a36abc(6, 147, 0);
        v17 = 0xfffffffe;
    }
    else if (!*(long long *)&a0->padding_1[31])
    {
        v12 = *(int *)a0->field_78;
        if (v12 != 920)
        {
            v13 = arm64g_calculate_condition(25, v11, 0, 0);
            v14 = arm64g_calculate_condition(19, (v13 & 1 ? v12 : 0x40000000), (v13 & 1 ? 28 : 0), 0);
            if (v14 & 1)
                goto LABEL_a3f010;
            goto LABEL_a3ef70;
        }
        else
        {
            v15 = arm64g_calculate_condition(25, v11, 0, 0);
            v16 = arm64g_calculate_condition(16, (v15 & 1 ? v12 : 0x40000000), (v15 & 1 ? 28 : 0), 0);
            if (!(v16 & 1))
                goto LABEL_a3ef70;
LABEL_a3f010:
            v17 = 0xffffffff;
        }
    }
    else
    {
LABEL_a3ef70:
        sub_a71bbc(sub_a70ed8("pbits", &/* unsupported instruction */), &/* unsupported instruction */);
        v4 = v0;
        v5 = v1;
        v6 = v2;
        v17 = sub_a5df54(a0, &v3);
    }
    if (*(long long *)&g_10002b0 == v7)
        return v17;
    ___stack_chk_fail();
}
