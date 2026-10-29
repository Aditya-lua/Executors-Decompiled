/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f7c2c..0x9f7ddc (432 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9f7c2c_0 {
    char padding_0[40];
    long long field_28;
    unsigned long long field_30;
    long long field_38;
    unsigned long long field_40;
} st_9f7c2c_0;


unsigned long long sub_9f7c2c(st_9f7c2c_0 *a0, long long a1, unsigned long long a2)
{
    unsigned long long v4;  // x23
    unsigned long long v5;  // 4112
    unsigned long long v15;  // w0
    unsigned long long v6;  // w20
    unsigned long long v7;  // x0
    unsigned long long v8;  // x24
    unsigned long long v9;  // 4113
    unsigned long long v10;  // 4118
    unsigned long long v11;  // x23
    unsigned long long v12;  // x22
    unsigned long long v13;  // x1
    unsigned long long v0;  // [bp-0x50]
    unsigned long long v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v0 = 0;
    v1 = 0;
    v4 = sub_af26f0(a1, 952, 0xffffffff);
    if (v4 >> 31 & 1)
    {
        v5 = arm64g_calculate_condition(1, v4 & 0xffffffff, 1, 0);
        if (!(v5 & 1))
        {
LABEL_9f7c8c:
            v6 = 0;
LABEL_9f7c90:
            v8 = sub_af26f0(a1, 951, 0xffffffff);
            if (v8 >> 31 & 1 || !(v9 = arm64g_calculate_condition(169, sub_af26f0(a1, 951, v8) & (unsigned int)v4, 0, 0), v9 & 1))
            {
                v10 = arm64g_calculate_condition(1, v8 & 0xffffffff, 1, 0);
                if (v10 & 1)
                    v11 = v4 & 0xffffffff;
                else
                    v11 = v8 & 0xffffffff;
                if (v11 >> 31 & 1)
                {
                    v12 = 0;
                    v15 = 0;
LABEL_9f7d74:
                    sub_afc404(v12);
                    sub_a6c2e4(a0->field_28, "crypto/ct/ct_sct_ctx.c", 184);
                    a0->field_28 = v1;
                    a0->field_30 = v6;
                    sub_a6c2e4(a0->field_38, "crypto/ct/ct_sct_ctx.c", 188);
                    a0->field_38 = v0;
                    a0->field_40 = v15;
                    return 1;
                }
                v12 = sub_afc410(a1);
                if (v12)
                {
                    v13 = v11;
                    sub_afa308(sub_af2700(v12, v13), v13);
                    if (sub_9f7ddc(v12, a2) && (v15 = (unsigned int)sub_afc5f0(v12, &v0), 1 <= v15))
                        goto LABEL_9f7d74;
                    goto LABEL_9f7d20;
                }
            }
        }
        else
        {
            if (!a2 && !(v7 = sub_afc3f8(a1, &v1), v6 = (unsigned int)v7, v7 >> 31 & 1))
                goto LABEL_9f7c90;
        }
    }
    else if (!(!(sub_af26f0(a1, 952, v4) >> 31 & 1)))
    {
        goto LABEL_9f7c8c;
    }
    v12 = 0;
LABEL_9f7d20:
    sub_a6c2e4(v1, "crypto/ct/ct_sct_ctx.c", 194);
    sub_a6c2e4(v0, "crypto/ct/ct_sct_ctx.c", 195);
    sub_afc404(v12);
    return 0;
}
