/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa016b0..0xa018c8 (536 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a016b0_1 {
    int field_0;
    char padding_4[4];
    unsigned long long field_8;
} st_a016b0_1;

typedef struct st_a016b0_0 {
    char padding_0[4];
    unsigned int field_4;
} st_a016b0_0;


st_a016b0_0 * sub_a016b0(long long a0)
{
    st_a016b0_0 *v9;  // x19
    unsigned long v13;  // cc_dep1
    unsigned long v14;  // cc_dep2
    unsigned long v15;  // cc_ndep
    unsigned long long v16;  // 4112
    unsigned long long v17;  // 4102
    unsigned long v18;  // cc_op
    st_a016b0_1 *v19;  // x8
    unsigned int v10;  // w9
    st_a016b0_0 *v20;  // x20
    st_a016b0_0 *v21;  // x21
    long long v22;  // x24
    st_a016b0_0 *v23;  // x23
    st_a016b0_0 *v24;  // x22
    long long v25;  // x0
    long long v26;  // x0
    long long v27;  // x25
    unsigned long long v11;  // 4112
    unsigned long long v12;  // 4102
    char v0;  // [bp-0x78]
    st_a016b0_1 *v1;  // [bp-0x70]
    unsigned int v2;  // [bp-0x68]
    char v3;  // [bp-0x64]
    unsigned long v4;  // [bp-0x60]
    char v5;  // [bp-0x58]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    if (!sub_9ca8cc(0, &v5, &v3, &v0, a0))
        return 0;
    sub_9cf830(0, &v2, &v1, v0);
    v9 = sub_9cf104(0, &v5, v3);
    if (!v9)
    {
LABEL_a01728:
        v20 = 0;
        goto LABEL_a01738;
    }
    v10 = v2;
    if (v9->field_4 != 258)
    {
        v11 = arm64g_calculate_condition(v18 | 16, v13, v14, v15);
        v12 = arm64g_calculate_condition(3, (v11 & 1 ? v10 : 0), (v11 & 1 ? 16 : 0), 0);
        if (v12 & 1)
            goto LABEL_a017c0;
        goto LABEL_a01728;
    }
    v16 = arm64g_calculate_condition(v18 | 16, v13, v14, v15);
    v17 = arm64g_calculate_condition(0, (v16 & 1 ? v10 : 0), (v16 & 1 ? 16 : 0), 0);
    if (!(v17 & 1))
        goto LABEL_a01728;
LABEL_a017c0:
    v19 = v1;
    v4 = v19->field_8;
    v20 = sub_a01408(0, &v4, v19->field_0);
    if (!v20)
    {
        v23 = 0;
        v24 = 0;
        v21 = 0;
LABEL_a01738:
        v22 = 104;
        v27 = 182;
        goto LABEL_a01740;
    }
    v21 = sub_9e4988();
    if (!v21 || !sub_9c1c08(v9, v21))
    {
        v23 = 0;
        v24 = 0;
        v22 = 109;
        v27 = 154;
        goto LABEL_a01740;
    }
    v22 = 524291;
    v23 = sub_9e4958();
    if (!v23)
    {
        v24 = 0;
        v27 = 159;
        goto LABEL_a01740;
    }
    v24 = sub_9dde10();
    if (v24)
    {
        v25 = sub_c4c40(v20);
        v26 = sub_9ffdd0(v20);
        sub_9e5d14(v21, 4);
        if (!sub_9dea6c(v23, v26, v21, v25, v24))
        {
            v22 = 109;
            v27 = 171;
LABEL_a01740:
            sub_a368c8();
            sub_a369bc("crypto/dsa/dsa_backend.c", v27, "ossl_dsa_key_from_pkcs8");
            sub_a36abc(10, v22, 0);
            sub_9e48d4(v21);
            sub_9e48d4(v23);
            sub_a01fd4(v20);
            v20 = 0;
        }
        else if (!sub_a02150(v20, v23, v21))
        {
            v22 = 786691;
            v27 = 175;
            goto LABEL_a01740;
        }
    }
    else
    {
        v27 = 163;
        goto LABEL_a01740;
    }
    sub_9dded4(v24);
    sub_9c7a84(v9);
    return v20;
}
