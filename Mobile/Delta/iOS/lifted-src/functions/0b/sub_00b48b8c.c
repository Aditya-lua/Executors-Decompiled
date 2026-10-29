/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb48b8c..0xb48f78 (1004 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b48b8c_2 {
    char padding_0[16];
    unsigned long long field_10;
    unsigned int field_18;
} st_b48b8c_2;

typedef struct st_b48b8c_1 {
    char padding_0[24];
    long long field_18;
} st_b48b8c_1;

typedef struct st_b48b8c_0 {
    char padding_0[16];
    unsigned long long field_10;
    char field_18;
    char padding_19[15];
    unsigned long long field_28;
    unsigned int field_30;
} st_b48b8c_0;

extern char g_424345;
extern long long g_dfe640;

unsigned long long sub_b48b8c(void* a0, long long a1)
{
    st_b48b8c_0 *v3;  // x25
    long long v4;  // x21
    st_b48b8c_2 *v13;  // x25
    unsigned long long v14;  // x24
    st_b48b8c_0 *v15;  // x23
    unsigned long v16;  // x24
    unsigned long long v17;  // x0
    long long v18;  // x21
    long long v19;  // x22
    unsigned long long v20;  // x0
    st_b48b8c_0 *v21;  // x8
    unsigned long v22;  // x8
    unsigned long long v5;  // x23
    unsigned long v23;  // x8
    unsigned long long v6;  // x0
    unsigned long v7;  // x22
    unsigned long long v8;  // x0
    st_b48b8c_1 *v9;  // x24
    unsigned long v10;  // x23
    long long v11;  // x1
    unsigned long long v12;  // x0
    unsigned long long v0;  // [bp-0x54]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = (long long)a0[240];
    v4 = sub_9f2aec((long long)a0[8]);
    if (sub_a6fbc4(a1, "use_derivation_function") && sub_a6fc2c())
    {
        v5 = 0;
        v3->field_30 = v0 != 0;
    }
    else
    {
        v5 = 1;
    }
    v6 = sub_a6fbc4(a1, "properties");
    if (!v6)
    {
        v7 = "provider=default";
        goto LABEL_b48c2c;
    }
    if (*(int *)(v6 + 8) != 4)
        return 0;
    v7 = *(long long *)(v6 + 16);
LABEL_b48c2c:
    v8 = sub_a6fbc4(a1, "cipher");
    if (!v8)
    {
        if (v5 & 1)
            return sub_b47088(a0, a1);
LABEL_b48d4c:
        v15 = (long long)a0[240];
        if (*(long long *)&v15->padding_19[7])
        {
            v16 = sub_9e4290(*(long long *)&v15->padding_19[7]);
            v15->field_28 = v16;
            v17 = *(long long *)&v15->padding_0[0];
            if (!v17)
            {
                v17 = sub_a4bc70(0);
                *(unsigned long long *)&v15->padding_0[0] = v17;
            }
            v18 = 524294;
            if (*(long long *)&v15->padding_0[8])
            {
                if (v17)
                    goto LABEL_b48dd4;
                v19 = 576;
            }
            else
            {
                v20 = sub_a4bc70();
                *(unsigned long long *)&v15->padding_0[8] = v20;
                v17 = *(long long *)&v15->padding_0[0];
                v19 = 576;
                if (v17 && v20)
                {
LABEL_b48dd4:
                    v17 = sub_a4c694();
                    if ((unsigned int)v17 && !(v17 = sub_a4c694(*(long long *)&v15->padding_0[8], *(long long *)&v15->padding_19[7], 0, 0, 0, 1), !(unsigned int)v17))
                    {
                        *(unsigned int *)&a0[120] = (unsigned int)v16 * 8;
                        *(unsigned long *)&a0[224] = v16 + 16;
                        if (v15->field_30)
                        {
                            v17 = v15->field_10;
                            if (v17 || !(v17 = sub_a4bc70(0), v15->field_10 = v17, !v17))
                            {
                                v17 = sub_a4c694(v17, *(long long *)&v15->field_18, 0, &g_dfe640, 0, 1);
                                if ((unsigned int)v17)
                                    goto LABEL_b48e5c;
                                v18 = 205;
                                v19 = 621;
                            }
                            else
                            {
                                v19 = 615;
                            }
                        }
                        else
                        {
LABEL_b48e5c:
                            v21 = (long long)a0[240];
                            *(unsigned long long *)&a0[128] = 0x10000;
                            if (v21->field_30)
                            {
                                *(uint128_t *)&a0[0x88] = 0x7fffffff0000000000000000;
                                *(uint128_t *)&a0[152] = 0x7fffffff0000000000000000;
                                *(uint128_t *)&a0[168] = CONCAT(0x7fffffff, 0x7fffffff);
                                v22 = v21->field_28;
                                if (v22)
                                {
                                    *(unsigned long *)&a0[0x88] = v22;
                                    *(unsigned long *)&a0[152] = v22 >> 1;
                                }
                            }
                            else
                            {
                                if (v21->field_28)
                                    v23 = (long long)a0[224];
                                else
                                    v23 = 0x7fffffff;
                                *(unsigned long *)&a0[0x88] = v23;
                                *(unsigned long *)&a0[144] = v23;
                                *(unsigned long long *)&a0[152] = 0;
                                *(unsigned long long *)&a0[160] = 0;
                                *(unsigned long *)&a0[168] = v23;
                                *(unsigned long *)&a0[176] = v23;
                            }
                            return sub_b47088(a0, a1);
                        }
                    }
                    else
                    {
                        v18 = 208;
                        v19 = 584;
                    }
                }
            }
            sub_a368c8(v17);
            sub_a369bc("providers/implementations/rands/drbg_ctr.c", v19, "drbg_ctr_init");
            sub_a36abc(57, v18, 0);
            sub_a4bca0(*(long long *)&v15->padding_0[0]);
            sub_a4bca0(*(long long *)&v15->padding_0[8]);
            *(unsigned long long *)&v15->padding_0[0] = 0;
            *(unsigned long long *)&v15->padding_0[8] = 0;
            return 0;
        }
        sub_a368c8(0);
        sub_a369bc("providers/implementations/rands/drbg_ctr.c", 567, "drbg_ctr_init");
        v11 = 155;
        goto LABEL_b48f18;
        goto LABEL_b48f18;
    }
    else if (*(int *)(v8 + 8) == 4 && (unsigned long long)*(long long *)(v8 + 24) >= 3)
    {
        v9 = v8;
        v10 = *(long long *)(v8 + 16);
        if (sub_a6e200("CTR", v10 + *(long long *)(v8 + 24) - 3))
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/rands/drbg_ctr.c", 764, "drbg_ctr_set_ctx_params_locked");
            v11 = 206;
        }
        else
        {
            v12 = sub_a6da14(v10, v9->field_18, "providers/implementations/rands/drbg_ctr.c", 0x2ff);
            if (!v12)
                return v12;
            *(unsigned int *)(v12 + v9->field_18 - 3) = (unsigned int)&g_424345;
            v13 = &v3->field_18;
            v14 = v12;
            sub_a4bbe4(*(long long *)&v3->field_18);
            sub_a4bbe4(*(long long *)&v13->padding_0[8]);
            *(unsigned long long *)&v13->padding_0[0] = 0;
            *(unsigned long long *)&v13->padding_0[8] = 0;
            *(unsigned long long *)&v13->padding_0[8] = sub_a4e104(v4, v10, v7);
            *(unsigned long long *)&v13->padding_0[0] = sub_a4e104(v4, v14, v7);
            sub_a6c2e4(v14, "providers/implementations/rands/drbg_ctr.c", 781);
            if (*(long long *)&v13->padding_0[8] && *(long long *)&v13->padding_0[0])
                goto LABEL_b48d4c;
            sub_a368c8();
            sub_a369bc("providers/implementations/rands/drbg_ctr.c", 783, "drbg_ctr_set_ctx_params_locked");
            v11 = 207;
        }
LABEL_b48f18:
        sub_a36abc(57, v11, 0);
    }
    return 0;
}
