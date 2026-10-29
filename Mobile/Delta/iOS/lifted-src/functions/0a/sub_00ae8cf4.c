/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xae8cf4..0xae8f94 (672 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ae8cf4_1 {
    unsigned int field_0;
    char padding_4[4];
    struct st_ae8cf4_0 *field_8;
} st_ae8cf4_1;

typedef struct st_ae8cf4_0 {
    unsigned int field_0;
    char padding_4[4];
    unsigned long long field_8;
} st_ae8cf4_0;

extern unsigned long long g_c7c2eb;

unsigned long long sub_ae8cf4(long long a0, long long a1, unsigned long long a2, unsigned long long a3)
{
    long long v6;  // x28
    long long v7;  // x20
    long long v16;  // x22
    unsigned long v17;  // cc_op
    unsigned long v18;  // cc_dep1
    unsigned long v19;  // cc_dep2
    unsigned long v20;  // cc_ndep
    unsigned long long v21;  // 4110
    unsigned long long v22;  // 4102
    unsigned long long v8;  // x0
    unsigned long long v23;  // 4110
    unsigned long long v24;  // 4102
    unsigned long v9;  // x25
    unsigned long long v25;  // x0
    unsigned long v26;  // x21
    st_ae8cf4_1 **v27;  // x26
    unsigned long v28;  // x8
    unsigned int v29;  // w9
    unsigned long v30;  // x27
    long long v31;  // x26
    long long v32;  // x0
    long long v33;  // x27
    st_ae8cf4_1 **v10;  // x21
    unsigned long long v34;  // 4110
    unsigned long long v35;  // 4102
    unsigned long long v36;  // 4110
    unsigned long long v37;  // 4102
    unsigned long long v38;  // x0
    unsigned long v11;  // x8
    unsigned int v12;  // w9
    unsigned long v13;  // x22
    long long v14;  // x21
    long long v15;  // x0
    unsigned long long v0;  // [bp-0x80], Other Possible Types: long long, unsigned long
    long long v1;  // [bp-0x78], Other Possible Types: unsigned long long
    unsigned long long v2;  // [bp-0x70]
    long long v3;  // [bp-0x68]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v6 = a1;
    v7 = a0;
    if ((int)sub_ad69e4() >= 1)
    {
        v1 = &g_c7c2eb;
        v2 = a3;
        v0 = a2;
        sub_9d524c(v6, "%*s%s:\n");
    }
    v8 = sub_ad69e4(v7);
    if ((int)v8 < 1)
        return v8;
    v9 = (unsigned int)a2 + 2;
    v10 = sub_ad69f8(v7, 0);
    v0 = v9;
    v1 = &g_c7c2eb;
    sub_9d524c(v6, "%*s");
    if (*v10->field_0 == 7)
    {
        v11 = *v10->field_8->field_0;
        if ((int)v11 < 4)
            v12 = v11;
        else
            v12 = 4;
        if ((int)v11 < 16)
            v13 = v12;
        else
            v13 = 16;
        v14 = sub_af02d8();
        v15 = sub_af02d8(*v10->field_8->field_8 + (int)v13, v11 - v13);
        v16 = v15;
        if (v14)
        {
            v21 = arm64g_calculate_condition(v17 | 16, v18, v19, v20);
            v22 = arm64g_calculate_condition(4, (v21 & 1 ? v15 : 0x40000000), 0, 0);
            if (!(v22 & 1))
                goto LABEL_ae8dec;
        }
        else
        {
            v23 = arm64g_calculate_condition(v17 | 16, v18, v19, v20);
            v24 = arm64g_calculate_condition(0, (v23 & 1 ? v15 : 0x40000000), 0, 0);
            if (!(v24 & 1))
            {
LABEL_ae8dec:
                v0 = v14;
                v1 = v16;
                sub_9d524c(v6, "IP:%s/%s");
            }
        }
        sub_a6c2e4(v14, "crypto/x509/v3_ncons.c", 247);
        sub_a6c2e4(v16, "crypto/x509/v3_ncons.c", 248);
    }
    else
    {
        sub_aec458(v6);
    }
    v25 = sub_ad69e4(v7);
    if ((int)v25 < 2)
        return v25;
    v26 = 1;
    v3 = v7;
    do
    {
        sub_9d4888(v6, "\n");
        v27 = sub_ad69f8(v7, v26);
        v0 = v9;
        v1 = &g_c7c2eb;
        sub_9d524c(v6, "%*s");
        if (*v27->field_0 == 7)
        {
            v28 = *v27->field_8->field_0;
            if ((int)v28 < 4)
                v29 = v28;
            else
                v29 = 4;
            if ((int)v28 < 16)
                v30 = v29;
            else
                v30 = 16;
            v31 = sub_af02d8();
            v32 = sub_af02d8(*v27->field_8->field_8 + (int)v30, v28 - v30);
            v33 = v32;
            if (v31)
            {
                v34 = arm64g_calculate_condition(v17 | 16, v18, v19, v20);
                v35 = arm64g_calculate_condition(4, (v34 & 1 ? v32 : 0x40000000), 0, 0);
                if (v35 & 1)
                    goto LABEL_ae8e60;
            }
            else
            {
                v36 = arm64g_calculate_condition(v17 | 16, v18, v19, v20);
                v37 = arm64g_calculate_condition(0, (v36 & 1 ? v32 : 0x40000000), 0, 0);
                if (v37 & 1)
                    goto LABEL_ae8e60;
            }
            v0 = v31;
            v1 = v33;
            sub_9d524c(v6, "IP:%s/%s");
LABEL_ae8e60:
            sub_a6c2e4(v31, "crypto/x509/v3_ncons.c", 247);
            sub_a6c2e4(v33, "crypto/x509/v3_ncons.c", 248);
            v7 = v3;
            continue;
        }
        else
        {
            sub_aec458(v6);
        }
    } while ((v26 = (unsigned int)v26 + 1, v38 = sub_ad69e4(v7), (int)v38 > (int)v26));
    return v38;
}
