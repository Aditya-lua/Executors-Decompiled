/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4a594..0xb4a944 (944 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b4a594_1 {
    char padding_0[8];
    long long field_8;
    char padding_10[104];
    unsigned int field_78;
    char padding_7c[12];
    unsigned long long field_88;
    char padding_90[8];
    unsigned long long field_98;
    char padding_a0[64];
    unsigned long long field_e0;
    char padding_e8[8];
    struct st_b4a594_0 *field_f0;
} st_b4a594_1;

typedef struct st_b4a594_0 {
    char padding_0[32];
    unsigned long long field_20;
} st_b4a594_0;

extern char g_10002b0;

unsigned int sub_b4a594(st_b4a594_1 *a0, long long a1)
{
    st_b4a594_0 *v15;  // x21
    long long v16;  // x22
    unsigned int v25;  // x0
    unsigned int v26;  // x0
    long long v27;  // x23
    unsigned int v28;  // w0
    unsigned long v29;  // x8
    unsigned int v30;  // w9
    unsigned int v31;  // w9
    unsigned long long v32;  // x8
    unsigned int v17;  // x23
    unsigned int v18;  // x8
    unsigned int v19;  // x23
    long long v20;  // x1
    unsigned int v21;  // x0
    unsigned int v22;  // x1
    long long v24;  // x1
    uint128_t v0;  // [bp-0x118]
    uint128_t v1;  // [bp-0x108]
    unsigned long long v2;  // [bp-0xf8]
    unsigned int v3;  // [bp-0xf0]
    unsigned int v4;  // [bp-0xe8]
    char v5;  // [bp-0xe0]
    uint128_t v6;  // [bp-0xb8]
    uint128_t v7;  // [bp-0xa8]
    unsigned long long v8;  // [bp-0x98]
    uint128_t v9;  // [bp-0x90]
    uint128_t v10;  // [bp-0x80]
    unsigned long long v11;  // [bp-0x70]
    unsigned long v12;  // [bp-0x68]
    char *v13;  // [bp-0x10]
    char v14;  // [bp+0x0]

    v13 = &v14;
    v12 = *(long long *)&g_10002b0;
    v15 = a0->field_f0;
    v16 = sub_9f2aec(a0->field_8);
    v17 = sub_a6fbc4(a1, "properties");
    sub_a36c8c(v17, "properties");
    if (v17 && *(int *)(v17 + 8) == 4)
        v18 = *(long long *)(v17 + 16);
    else
        v18 = 0;
    v3 = 0;
    v4 = 0;
    if (!v18)
        v18 = (unsigned int)"provider=default";
    if (v15)
    {
        v19 = sub_a6fbc4(a1, "digest");
        if (!v19)
        {
            sub_a368c8();
            v24 = 452;
            goto LABEL_b4a728;
        }
        if (sub_a71bcc(v19, &v4))
        {
            v19 = sub_a40ca8(v16, *(long long *)(v19 + 16), v18);
            if (v19)
            {
                sub_a3f52c(0);
                if (!sub_a6fbc4(a1, "mac"))
                {
                    v3 = (unsigned int)"HMAC";
                }
                else if (!sub_a71bcc())
                {
                    sub_a368c8();
                    sub_a369bc("providers/implementations/rands/drbg_hmac.c", 460, "drbg_fetch_algs_from_prov");
                    v20 = 138;
                    goto LABEL_b4a734;
                }
                sub_a57f0c(*(long long *)&v15->padding_0[0]);
                *(unsigned long long *)&v15->padding_0[0] = 0;
                v21 = sub_a58724(v16, v3, v18);
                if (v21)
                {
                    *(unsigned long long *)&v15->padding_0[0] = sub_a57e48();
                    sub_a58aa4(v21);
                    sub_a71618("digest", v4, 0);
                    v22 = v18;
                    v6 = v0;
                    v7 = v1;
                    v8 = v2;
                    sub_a71bbc(sub_a71618("properties", v22, 0), v22, 0);
                    v9 = v0;
                    v10 = v1;
                    v11 = v2;
                    if (sub_a58410(*(long long *)&v15->padding_0[0], &v5))
                    {
                        sub_a36e70();
                        sub_afe214(&v15->padding_0[8], v19);
LABEL_b4a77c:
                        v26 = sub_954340(&v15->padding_0[8]);
                        if (v26)
                        {
                            v27 = v26;
                            v25 = sub_b47104(a0, v16, v27);
                            if (!v25)
                            {
                                if (*(long long *)&g_10002b0 == v12)
                                    return v25;
                                ___stack_chk_fail();
                            }
                            if (!*(long long *)&v15->padding_0[0])
                                goto LABEL_b4a7ec;
                            v28 = sub_a50ac8(v27);
                            if ((int)v28 >= 1)
                            {
                                v29 = v28;
                                v15->field_20 = v29;
                                v30 = v28 * 8;
                                if (!(v30 & 0x7fffff00))
                                    v31 = v30 & 0x7fffffc0;
                                else
                                    v31 = 0x100;
                                a0->field_78 = v31;
                                a0->field_e0 = v29;
                                v32 = v31 >> 3;
                                a0->field_88 = v32;
                                a0->field_98 = v32 >> 1;
                                goto LABEL_b4a7ec;
                            }
                            else
                            {
                                v25 = 0;
                            }
                        }
                        else
                        {
LABEL_b4a7ec:
                            v25 = sub_b47088(a0, a1);
                        }
LABEL_b4a7f8:
                        if (*(long long *)&g_10002b0 == v12)
                            return v25;
                        ___stack_chk_fail();
                    }
                    else
                    {
                        sub_a368c8();
                        sub_a369bc("providers/implementations/rands/drbg_hmac.c", 478, "drbg_fetch_algs_from_prov");
                        sub_a36abc(57, 151, 0);
                        sub_a57f0c(*(long long *)&v15->padding_0[0]);
                        *(unsigned long long *)&v15->padding_0[0] = 0;
                    }
                }
            }
            else
            {
                sub_a368c8();
                v24 = 447;
LABEL_b4a728:
                sub_a369bc("providers/implementations/rands/drbg_hmac.c", v24, "drbg_fetch_algs_from_prov");
                v20 = 122;
LABEL_b4a734:
                sub_a36abc(57, v20, 0);
            }
        }
        else
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/rands/drbg_hmac.c", 439, "drbg_fetch_algs_from_prov");
            sub_a36abc(57, 138, 0);
            v19 = 0;
        }
    }
    else
    {
        v19 = 0;
    }
    sub_a36cd4();
    sub_a3f52c(v19);
    v25 = sub_afe114(&v15->padding_0[8], a1, v16);
    if (v25 && (v25 = sub_afe4cc(v15, a1, 0, 0, 0, v16), v25))
        goto LABEL_b4a77c;
    goto LABEL_b4a7f8;
}
