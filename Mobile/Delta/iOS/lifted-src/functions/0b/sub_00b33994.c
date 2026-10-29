/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb33994..0xb33bfc (616 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b33994_2 {
    struct st_b33994_0 *field_0;
    unsigned long long field_8;
    struct st_b33994_0 *field_10;
    unsigned long long field_18;
} st_b33994_2;

typedef struct st_b33994_0 {
    struct st_b33994_0 *field_0;
    char padding_8[8];
    struct st_b33994_0 *field_10;
    struct st_b33994_0 *field_18;
} st_b33994_0;

typedef struct st_b33994_1 {
    long long field_0;
    char field_8;
    char padding_9[7];
    struct st_b33994_0 *field_10;
    struct st_b33994_0 *field_18;
    long long field_20;
    struct st_b33994_0 *field_28;
    unsigned long long field_30;
} st_b33994_1;


st_b33994_0 * sub_b33994(st_b33994_1 *a0, st_b33994_0 *a1)
{
    st_b33994_0 *v6;  // x20
    long long v7;  // x0
    st_b33994_0 *v16;  // x0
    st_b33994_0 *v17;  // x8
    unsigned long v18;  // x22
    unsigned long long v19;  // 4115
    st_b33994_0 *v20;  // x0
    long long v8;  // x21
    st_b33994_0 *v9;  // x0
    st_b33994_0 **v10;  // x0
    st_b33994_0 *v11;  // x4
    st_b33994_0 *v12;  // x1
    st_b33994_0 *v13;  // x0
    st_b33994_2 *v14;  // x23
    st_b33994_0 *v15;  // x0
    st_b33994_0 *v0;  // [bp-0x60]
    st_b33994_0 *v1;  // [bp-0x58]
    st_b33994_0 *v2;  // [bp-0x50]
    st_b33994_0 *v3;  // [bp-0x48]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v6 = a1;
    v7 = sub_9f2aec(a0->field_0);
    if (!v6 || !v6->field_0)
    {
LABEL_b33be0:
        return 1;
    }
    v8 = v7;
    v9 = sub_a6fbc4(v6, "digest");
    if (v9)
    {
        if (sub_a6e200(v9->field_10, "MD5-SHA1"))
        {
            sub_a57f0c(a0->field_10);
            a0->field_10 = 0;
            v10 = &a0->field_8;
            v11 = 0;
            v12 = v6;
        }
        else if (sub_afe4cc(&a0->field_8, v6, "HMAC", 0, "MD5", v8))
        {
            v11 = "SHA1";
            v10 = &a0->field_10;
            v12 = v6;
        }
        else
        {
            return 0;
        }
        if (!sub_afe4cc(v10, v12, "HMAC", 0, v11, v8) || !(v1 = 0, v2 = 0, v3 = 0, sub_afe114(&v1, v6, v8)))
            return 0;
        if (sub_a50b14(sub_954340(&v1)))
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/kdfs/tls1_prf.c", 330, "kdf_tls1_prf_set_ctx_params");
            sub_a36abc(57, 183, 0);
            sub_afe028(&v1);
        }
        else
        {
            sub_afe028(&v1);
            goto LABEL_b33adc;
        }
        return 0;
    }
LABEL_b33adc:
    v13 = sub_a6fbc4(v6, "secret");
    if (v13)
    {
        v14 = &a0->field_18;
        sub_a6c4e8(a0->field_18, v14->field_8, "providers/implementations/kdfs/tls1_prf.c", 346);
        v14->field_0 = 0;
        v15 = sub_a71440(v13, v14, 0, &v14->field_8);
        if (!(unsigned int)v15)
            return v15;
    }
    v16 = sub_a6fbc4(v6, "seed");
    if (v16)
    {
        do
        {
            if (v16->field_18 && v16->field_10)
            {
                v0 = 0;
                v1 = 0;
                if (!sub_a71cdc())
                    return 0;
                v17 = v0;
                v18 = a0->field_30 + (char *)v17;
                v19 = arm64g_calculate_condition(0x22, a0->field_30, v17, 0);
                if (v19 & 1)
                    return 0;
                v20 = sub_a6c304(a0->field_28);
                if (!v20)
                    return 0;
                a0->field_28 = v20;
                if (v0)
                    _memcpy((char *)v20 + a0->field_30, v1);
                a0->field_30 = v18;
            }
        } while ((v16 = sub_a6fbc4(v16[1].padding_8, "seed"), v16));
    }
    goto LABEL_b33be0;
}
