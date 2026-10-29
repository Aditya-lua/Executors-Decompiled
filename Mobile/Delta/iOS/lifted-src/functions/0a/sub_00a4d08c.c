/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa4d08c..0xa4d3c8 (828 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a4d08c_0 {
    char padding_0[18];
    char field_12;
    char padding_13[21];
    struct st_a4d08c_1 *field_28;
} st_a4d08c_0;

typedef struct st_a4d08c_1 {
    unsigned long long field_0;
} st_a4d08c_1;


char sub_a4d08c(void* a0, long long a1, unsigned long a2, long long ptr, unsigned int a4)
{
    unsigned int v2;  // w23
    char iter;  // w9
    unsigned long v12;  // 4110
    unsigned long v13;  // cc_op
    unsigned long v14;  // cc_dep1
    unsigned long v15;  // cc_dep2
    unsigned long v16;  // 4110
    unsigned long long v17;  // 4123
    char v19;  // w8
    char v21;  // w24
    st_a4d08c_0 *v4;  // x8
    char v22;  // w23
    unsigned long v23;  // cc_dep1
    unsigned long v24;  // x10
    unsigned long v25;  // x11
    unsigned long v26;  // x12
    unsigned long v27;  // 4110
    unsigned long v28;  // cc_op
    unsigned long v29;  // cc_dep1
    unsigned long v30;  // cc_dep2
    unsigned long v31;  // 4110
    char v5;  // w26
    unsigned long long v32;  // 4118
    unsigned long v6;  // cc_dep1
    unsigned long v7;  // x10
    long long v8;  // x11
    unsigned long v9;  // x12
    unsigned long v10;  // x13
    unsigned long v11;  // x14
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a4;
    iter = v2;
    if (sub_a50de8())
    {
        if ((int)v2 >= 1)
        {
            iter = v2 >> 3;
            if (v2 & 7)
                iter += 1;
            if (0x7ffffff6 >= v2)
                iter = v2 + 7 >> 3;
        }
        else if (v2)
        {
            iter = v2 >> 3;
            if (v2 & 7)
                iter += 1;
        }
        else
        {
            v4 = *(long long *)a0;
            if (!(v4->field_12 >> 4 & 1))
            {
                *(unsigned int *)a2 = 0;
                return 1;
            }
            iter = 0;
            v5 = *(int *)&v4->padding_0[4];
LABEL_a4d22c:
            v23 = v5;
            if (v5 != 1)
                v4->field_28();
            v24 = a1 - ptr;
            v25 = iter;
            v26 = -v25;
            if (v25 <= v24)
            {
                v27 = arm64g_calculate_condition(35, v23, 1, 0);
                v28 = 4;
                v29 = (v27 & 1 ? v24 : 0x20000000);
                v30 = (v27 & 1 ? v26 : 0);
            }
            else
            {
                v31 = arm64g_calculate_condition(35, v23, 1, 0);
                v28 = 0;
                v29 = (v31 & 1 ? v24 : 0x20000000);
                v30 = (v31 & 1 ? v26 : 0);
            }
            v32 = arm64g_calculate_condition(v28 | 128, v29, v30, 0);
            if (a1 == ptr)
            {
                v4->field_28();
            }
            else if (iter >= 1)
            {
                if (v32 & 1)
                {
                    sub_a368c8();
                    sub_a369bc("crypto/evp/evp_enc.c", 899, "evp_EncryptDecryptUpdate");
                    sub_a36abc(6, 162, 0);
                    return 0;
                }
                v4->field_28();
            }
            else
            {
                v4->field_28();
            }
        }
    }
    v4 = *(long long *)a0;
    v5 = *(int *)&v4->padding_0[4];
    if (!(v4->field_12 >> 4 & 1))
    {
        v6 = v2;
        if ((int)v2 <= 0)
        {
            *(unsigned int *)a2 = 0;
            return 1;
        }
        v7 = (int)a0[20];
        v8 = a1 + v7;
        v9 = v8 - ptr;
        v10 = iter;
        v11 = -v10;
        if (v10 <= v9)
        {
            v12 = arm64g_calculate_condition(35, v6, 0, 0);
            v13 = 4;
            v14 = (v12 & 1 ? v9 : 0x20000000);
            v15 = (v12 & 1 ? v11 : 0);
        }
        else
        {
            v16 = arm64g_calculate_condition(35, v6, 0, 0);
            v13 = 0;
            v14 = (v16 & 1 ? v9 : 0x20000000);
            v15 = (v16 & 1 ? v11 : 0);
        }
        v17 = arm64g_calculate_condition(v13 | 128, v14, v15, 0);
        if (iter >= 1 && v8 != ptr && v17 & 1)
        {
            sub_a368c8();
            sub_a369bc("crypto/evp/evp_enc.c", 916, "evp_EncryptDecryptUpdate");
            sub_a36abc(6, 162, 0);
            return 0;
        }
        if ((unsigned int)v7)
        {
            if (33 > v5)
            {
                v19 = v5 - v7;
                if (v19 > (int)v2)
                {
                    _memcpy(a0 + v7 + 56, ptr, v2);
                    *(unsigned int *)&a0[20] = (int)a0[20] + v2;
                    *(unsigned int *)a2 = 0;
                    return 1;
                }
                if ((int)(v2 - v19 & -v5) > (int)(v5 ^ 0x7fffffff))
                {
                    sub_a368c8();
                    sub_a369bc("crypto/evp/evp_enc.c", 948, "evp_EncryptDecryptUpdate");
                    sub_a36abc(6, 202, 0);
                    return 0;
                }
                _memcpy(a0 + 56 + v7, ptr, v19);
                (*(long long *)(*(long long *)a0 + 40))();
            }
            else
            {
                sub_a69928("assertion failed: bl <= (int)sizeof(ctx->buf)", "crypto/evp/evp_enc.c", 930);
            }
        }
        else
        {
            if (!((int)a0[132] & v2))
            {
                v4->field_28();
            }
            else if (33 > v5)
            {
                *(unsigned int *)a2 = 0;
                v21 = v2 & v5 - 1;
                v22 = v2 - v21;
                if (v22 >= 1)
                    (*(long long *)(*(long long *)a0 + 40))();
                if (v21)
                    _memcpy(a0 + 56, ptr + v22, v21);
                *(unsigned int *)&a0[20] = v21;
                return 1;
            }
            else
            {
                sub_a69928("assertion failed: bl <= (int)sizeof(ctx->buf)", "crypto/evp/evp_enc.c", 930);
            }
        }
    }
    goto LABEL_a4d22c;
}
