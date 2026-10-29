/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb02b70..0xb02e40 (720 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b02b70_0 {
    long long field_0;
    char padding_8[24];
    char field_20;
    char padding_21[47];
    long long field_50;
    char padding_58[600];
    char field_2b0;
    char padding_2b1[175];
    unsigned int field_360;
    char field_364;
    char padding_365[3];
    long long field_368;
} st_b02b70_0;

extern unsigned long long g_b0391c;
extern unsigned long long g_b03940;

unsigned long long sub_b02b70(st_b02b70_0 *a0, char a1, unsigned long long a2, unsigned long long a3, unsigned long a4, char a5)
{
    unsigned int v13;  // w8
    unsigned long v14;  // cc_op
    unsigned long v17;  // cc_ndep
    unsigned long long v18;  // 4112
    unsigned long long v19;  // 4102
    unsigned long v20;  // cc_dep1
    unsigned long v21;  // cc_dep2
    unsigned long long v22;  // x26
    unsigned long long v23;  // x25
    unsigned long long v24;  // x24
    unsigned long long v25;  // x23
    unsigned long long v26;  // x22
    unsigned long long v27;  // x21
    unsigned long long v28;  // x20
    unsigned long long v29;  // x19
    unsigned long long v30;  // x30
    unsigned long v32;  // cc_dep1
    unsigned long long v33;  // x21
    unsigned long long v34;  // 4113
    unsigned long long v35;  // x22
    unsigned long long v36;  // 4105
    unsigned long long v37;  // 4105
    unsigned long long *v38;  // x23
    unsigned long long v39;  // x25
    st_b02b70_0 *v40;  // x24
    char v41;  // x19
    long long v42;  // x1
    unsigned long long v43;  // x0
    char v44;  // x0
    unsigned long long v15;  // 4112
    unsigned long long v16;  // 4102
    char v0;  // [bp-0x60]
    unsigned long v1;  // [bp-0x58]
    unsigned long long v2;  // [bp-0x50]
    unsigned long long v3;  // [bp-0x48]
    unsigned long long v4;  // [bp-0x40]
    unsigned long long v5;  // [bp-0x38]
    unsigned long long v6;  // [bp-0x30]
    unsigned long long v7;  // [bp-0x28]
    unsigned long long v8;  // [bp-0x20]
    unsigned long long v9;  // [bp-0x18]
    char *v10;  // [bp-0x10]
    unsigned long long v11;  // [bp-0x8]
    char v12;  // [bp+0x0]

    if (!(a0->field_364 & 1))
        return 0;
    v13 = a0->field_360;
    if (v13)
    {
        v15 = arm64g_calculate_condition(v14 | 16, v20, v21, v17);
        v16 = arm64g_calculate_condition(19, (v15 & 1 ? v13 : 0x40000000), (v15 & 1 ? 3 : 0), 0);
        if (!(v16 & 1))
            return 0;
    }
    else
    {
        v18 = arm64g_calculate_condition(v14 | 16, v20, v21, v17);
        v19 = arm64g_calculate_condition(16, (v18 & 1 ? v13 : 0x40000000), (v18 & 1 ? 3 : 0), 0);
        if (!(v19 & 1))
            return 0;
    }
    v2 = v22;
    v3 = v23;
    v4 = v24;
    v5 = v25;
    v6 = v26;
    v7 = v27;
    v8 = v28;
    v9 = v29;
    v10 = &v12;
    v11 = v30;
    if (v13 == 1)
    {
        if (sub_a96ab0(&a0->field_2b0, &a0->field_20, a0->field_50, a0->field_368) == 1)
            a0->field_360 = 2;
        else
            return 0;
    }
    if (!a5)
    {
        *(unsigned long long *)a2 = 0;
        return 1;
    }
    v32 = a1;
    if (!a1)
        v33 = 928;
    else
        v33 = 912;
    v34 = arm64g_calculate_condition(4, v32, 0, 0);
    if (v34 & 1)
    {
        v35 = 888;
        v36 = arm64g_calculate_condition(4, v32, 0, 0);
        if (!(v36 & 1))
            goto LABEL_b02c3e;
LABEL_b02c3d:
        v38 = &g_b0391c;
    }
    else
    {
        v35 = 880;
        v37 = arm64g_calculate_condition(4, v32, 0, 0);
        if (v37 & 1)
            goto LABEL_b02c3d;
LABEL_b02c3e:
        v38 = &g_b03940;
    }
    v0 = a5;
    v1 = a4;
    if (*(long long *)((char *)a0 + v35))
    {
        v39 = a3;
        v40 = a0;
        v41 = sub_b5c62c((char *)a0 + v33, (char *)v40 + v35, 16, &v1, &v0);
        a0 = v40;
        if (*(long long *)((char *)a0 + v35) != 16)
        {
            a3 = v39;
            if (!v41)
                goto LABEL_b02cc4;
LABEL_b02d54:
            if (v41 <= a3)
                v38();
            sub_a368c8();
            v42 = 188;
        }
        else if (15 >= v39)
        {
            sub_a368c8();
            v42 = 173;
        }
        else
        {
            v38();
        }
        sub_a369bc("providers/implementations/ciphers/cipher_aes_ocb.c", v42, "aes_ocb_block_update_internal");
        sub_a36abc(57, 106, 0);
        return 0;
    }
    v41 = a5 & 0xfffffffffffffff0;
    if (!v41)
    {
LABEL_b02cc4:
        if (v0)
        {
            v43 = sub_b5c6b4((char *)a0 + v33, (char *)a0 + v35, 16, &v1, &v0);
            if (!(unsigned int)v43)
                return v43;
            v44 = !v0;
        }
        else
        {
            v44 = 1;
        }
        *(unsigned long long *)a2 = 0;
        return v44;
    }
    goto LABEL_b02d54;
}
