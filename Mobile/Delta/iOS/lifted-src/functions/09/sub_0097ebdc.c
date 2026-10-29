/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97ebdc..0x97ed78 (412 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_97ebdc_1 {
    char padding_0[160];
    long long field_a0;
    char padding_a8[8];
    unsigned long long field_b0;
    char padding_b8[152];
    unsigned short field_150;
} st_97ebdc_1;

typedef struct st_97ebdc_0 {
    char padding_0[88];
    long long field_58;
} st_97ebdc_0;


unsigned short sub_97ebdc(unsigned long a0, unsigned short a1)
{
    st_97ebdc_1 *v8;  // x8
    unsigned long long v17;  // 4112
    unsigned long long v18;  // 4102
    unsigned short v19;  // x19
    unsigned short v9;  // x9
    unsigned int v10;  // w10
    unsigned short v11;  // w0
    unsigned short v12;  // x8
    unsigned long v13;  // cc_dep1
    unsigned short v14;  // w9
    unsigned long long v15;  // 4112
    unsigned long long v16;  // 4102
    st_97ebdc_0 *v0;  // [bp-0x68]
    st_97ebdc_1 *v1;  // [bp-0x50]
    unsigned long v2;  // [bp-0x48], Other Possible Types: unsigned short
    unsigned short v3;  // [bp-0x2c]
    char v4;  // [bp-0x28]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    if (!sub_97f48c())
        return 0;
    sub_ad9384(sub_c4ba8(v0->field_58));
    v8 = v1;
    if (!(v8->field_150 & 1))
    {
LABEL_97ec1c:
        v19 = 0;
    }
    else if (v2)
    {
        v9 = *(long long *)(v2 + 128);
        if (!*(long long *)(v2 + 128))
        {
LABEL_97ecb0:
            goto LABEL_97ed14;
        }
        goto LABEL_97ec3c;
    }
    else if (sub_97f904(&v0, 1))
    {
        v8 = v1;
        v2 = v8->field_b0;
        v9 = *(long long *)(v8->field_b0 + 128);
        if (!*(long long *)(v8->field_b0 + 128))
            goto LABEL_97ecb0;
LABEL_97ec3c:
        if (a1)
        {
            v3 = 0;
            v10 = *(char *)(v9 + 258);
            if (3 > v10 - 1)
            {
                v11 = sub_986278(*(long long *)(v9 + 120), &v4, &v3);
                v12 = v4;
                v13 = v11;
                if (!v11)
                    v12 = 0;
                v14 = v3;
                if (!v12)
                {
                    v15 = arm64g_calculate_condition(3, v13, 0, 0);
                    v16 = arm64g_calculate_condition(19, (v15 & 1 ? v14 : 0x40000000), 0, 0);
                    goto LABEL_97ed38;
                }
                else
                {
                    v17 = arm64g_calculate_condition(3, v13, 0, 0);
                    v18 = arm64g_calculate_condition(16, (v17 & 1 ? v14 : 0x40000000), 0, 0);
                    if (v18 & 1 || v12)
                        goto LABEL_97ed38;
                    v8 = v1;
LABEL_97ed2c:
                    if (sub_9773a0(v8->field_a0))
                        goto LABEL_97ed38;
                    v19 = sub_977368(v1->field_a0) != 0;
                }
            }
            else
            {
                if (v10 != 5)
                    goto LABEL_97ed2c;
LABEL_97ed38:
                v19 = 1;
            }
        }
        else
        {
            v3 = 0;
            if (2 < *(char *)(v9 + 258) - 1)
                goto LABEL_97ec1c;
            if (!sub_986278(*(long long *)(v9 + 120), &v4, &v3))
                v19 = 0;
            else
                v19 = *(unsigned int *)&v4;
        }
    }
    else
    {
LABEL_97ed14:
        sub_97c738(&v0);
        v19 = 0;
    }
    sub_ad93b4(sub_c4ba8(v0->field_58));
    return v19;
}
