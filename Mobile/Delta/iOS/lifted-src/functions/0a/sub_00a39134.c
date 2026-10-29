/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa39134..0xa39388 (596 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a39134_0 {
    unsigned int field_0;
    unsigned int field_4;
    char padding_8[24];
    long long field_20;
} st_a39134_0;


unsigned long long sub_a39134(long long a0, unsigned long long a1, long long a2, long long a3)
{
    st_a39134_0 *v2;  // x21
    unsigned long long v3;  // x0
    unsigned long v12;  // x8
    unsigned long v13;  // x9
    unsigned long long v5;  // x0
    unsigned int v6;  // w0
    unsigned long long v8;  // x0
    unsigned long v9;  // x8
    unsigned long v10;  // x9
    unsigned long long v11;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_975ffc();
    v3 = sub_9d500c(a0);
    if (!v2)
    {
        return 0;
    }
    else if (v3)
    {
        if (a1 > 10)
        {
            if (12 >= a1)
            {
                if (a1 == 11)
                {
                    while (1)
                    {
                        while (v2->field_0 != v2->field_4)
                        {
                            v5 = sub_a3869c(a0, 0, 0);
                            if (v5 >> 31 & 1)
                                return (int)v5;
                        }
                        if (!(sub_9d3d68(a0, 0xffffffff) >> 8 & 1))
                        {
                            if (!*(int *)&v2->padding_8[8] || !sub_9c7b68(v2->field_20))
                                break;
                            v2->field_4 = 0;
                            sub_a4b1f4(v2->field_20, v2 + 1, v2);
                        }
                        else
                        {
                            if (!*(int *)&v2->padding_8[0])
                                break;
                            v6 = sub_a4b258(v2 + 1, &v2[38].padding_8[14]);
                            v2->field_4 = 0;
                            *(unsigned int *)&v2->padding_8[0] = 0;
                            v2->field_0 = v6;
                        }
                    }
                    v8 = sub_9d46fc(v3, 11, a2, a3);
                    sub_9d5054(a0);
                    return v8;
                }
                else if (a1 == 12)
                {
                    return 1;
                }
LABEL_a39214:
            }
            else
            {
                switch (a1)
                {
                case 13:
                    v9 = v2->field_0;
                    v10 = v2->field_4;
                    if ((int)v9 < (int)v10)
                    {
                        sub_a69928("assertion failed: ctx->buf_len >= ctx->buf_off", "crypto/evp/bio_b64.c", 458);
                        sub_a69928("assertion failed: ctx->buf_len >= ctx->buf_off", "crypto/evp/bio_b64.c", 467);
                    }
                    v11 = arm64g_calculate_condition(19, v9 & 0xffffffff, v10 & 0xffffffff, 0);
                    if (!(v11 & 1) && *(int *)&v2->padding_8[8] && sub_9c7b68(v2->field_20))
                        return 1;
                    if (0 < (int)(v9 - v10))
                        return v9 - v10;
                    break;
                case 101:
                    sub_9d3d58(a0, 15);
                    v8 = sub_9d46fc(v3, 101, a2, a3);
                    sub_9d5054(a0);
                    return v8;
                default:
                    goto LABEL_a39214;
                }
            }
        }
        else
        {
            if (a1 == 1)
            {
                *(unsigned int *)&v2->padding_8[16] = 1;
                *(double *)&v2->padding_8[8] = 2.121995791e-314;
            }
            else if (a1 != 2)
            {
                if (a1 != 10)
                    goto LABEL_a39214;
                v12 = v2->field_0;
                v13 = v2->field_4;
                if ((int)v12 < (int)v13)
                    sub_a69928("assertion failed: ctx->buf_len >= ctx->buf_off", "crypto/evp/bio_b64.c", 467);
                if (0 < (int)(v12 - v13))
                    return v12 - v13;
            }
            else if (*(int *)&v2->padding_8[16] < 1)
            {
                return 1;
            }
        }
        return sub_9d46fc();
    }
    else
    {
        return 0;
    }
}
