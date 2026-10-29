/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa007ac..0xa00934 (392 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a007ac_1 {
    int field_0;
    char padding_4[4];
    unsigned long long field_8;
} st_a007ac_1;

typedef struct st_a007ac_0 {
    char padding_0[104];
    struct st_a007ac_0 *field_68;
    char padding_70[80];
    unsigned long long field_c0;
} st_a007ac_0;


st_a007ac_0 * sub_a007ac(long long a0, long long a1)
{
    st_a007ac_0 *v8;  // w0
    unsigned int v9;  // w8
    unsigned long v13;  // cc_dep1
    unsigned long v14;  // cc_dep2
    unsigned long v15;  // cc_ndep
    unsigned long long v16;  // 4112
    unsigned long long v17;  // 4102
    unsigned long v18;  // cc_op
    st_a007ac_0 *v19;  // x19
    unsigned long long v10;  // 4128
    st_a007ac_0 *v20;  // x21
    long long v21;  // x20
    long long v22;  // x22
    st_a007ac_1 *v23;  // x8
    st_a007ac_0 *v24;  // x0
    unsigned long long v11;  // 4112
    unsigned long long v12;  // 4102
    char v0;  // [bp-0x58]
    st_a007ac_1 *v1;  // [bp-0x50]
    unsigned int v2;  // [bp-0x48]
    char v3;  // [bp-0x44]
    unsigned long v4;  // [bp-0x40]
    char v5;  // [bp-0x38]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v8 = (st_a007ac_0 *)(unsigned int)sub_afbf08(0, &v5, &v3, &v0, a1);
    if (!v8)
        return v8;
    sub_9cf830(0, &v2, &v1, v0);
    v9 = v2;
    v10 = arm64g_calculate_condition(0x11, v9, 1, 0);
    if (v10 & 1)
    {
        v11 = arm64g_calculate_condition(v18 | 16, v13, v14, v15);
        v12 = arm64g_calculate_condition(19, (v11 & 1 ? v9 : 0x40000000), (v11 & 1 ? 5 : 0), 0);
        if (v12 & 1)
            goto LABEL_a00824;
LABEL_a00804:
        v19 = sub_a01fc8();
        if (v19)
            goto LABEL_a00850;
        v20 = 0;
        v21 = 524298;
        v22 = 57;
    }
    else
    {
        v16 = arm64g_calculate_condition(v18 | 16, v13, v14, v15);
        v17 = arm64g_calculate_condition(16, (v16 & 1 ? v9 : 0x40000000), (v16 & 1 ? 5 : 0), 0);
        if (!(v17 & 1))
            goto LABEL_a00804;
LABEL_a00824:
        if (v9 == 16)
        {
            v23 = v1;
            v4 = v23->field_8;
            v19 = sub_a01408(0, &v4, v23->field_0);
            if (v19)
            {
LABEL_a00850:
                v20 = sub_9cf104(0, &v5, v3);
                if (v20)
                {
                    v24 = sub_9c1c08(v20, 0);
                    v19->field_68 = v24;
                    if (v24)
                    {
                        v19->field_c0 = v19->field_c0 + 1;
                        sub_9cf124(v20);
                        sub_a5ab14(a0, 116, v19);
                        return 1;
                    }
                    v21 = 108;
                    v22 = 71;
                }
                else
                {
                    v21 = 104;
                    v22 = 66;
                }
            }
            else
            {
                v20 = 0;
                v21 = 104;
                v22 = 0x33;
            }
        }
        else
        {
            v20 = 0;
            v19 = 0;
            v21 = 105;
            v22 = 61;
        }
    }
    sub_a368c8();
    sub_a369bc("crypto/dsa/dsa_ameth.c", v22, "dsa_pub_decode");
    sub_a36abc(10, v21, 0);
    sub_9cf124(v20);
    sub_a01fd4(v19);
    return 0;
}
