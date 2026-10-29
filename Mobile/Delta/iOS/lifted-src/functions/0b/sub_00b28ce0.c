/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb28ce0..0xb28e60 (384 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b28ce0_0 {
    unsigned long long field_0[2];
    void* field_8;
    void* field_10;
    char padding_18[8];
    void* field_20;
    void* field_28;
    void* field_30;
    char padding_38[8];
    void* field_40;
} st_b28ce0_0;


void* sub_b28ce0(st_b28ce0_0 *a0)
{
    void* v2;  // x19
    uint128_t v3;  // q0
    void* v4;  // x22
    void* v5;  // x22
    uint128_t v6;  // q1
    void* v7;  // x21
    void* v8;  // x8
    void* v9;  // x8
    void* v10;  // x0
    void* v11;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
    {
LABEL_b28e48:
        return 0;
    }
    v2 = sub_a6bffc(72, "providers/implementations/exchange/dh_exch.c", 297);
    if (!v2)
        return v2;
    v3 = *(int128_t *)&a0->field_8;
    *(unsigned long long [2])v2 = a0->field_0;
    v4 = v2;
    *(unsigned long long *)&v4[8] = 0;
    v5 = v4 + 8;
    v6 = *(int128_t *)a0->padding_18;
    *(uint128_t *)&v5[8] = v3;
    *(uint128_t *)&v5[24] = v6;
    *(int128_t *)&v5[40] = *(int128_t *)&a0->field_28;
    *(unsigned long long *)&v5[56] = 0;
    *(unsigned long long *)&v5[8] = 0;
    *(unsigned long long *)&v5[24] = 0;
    *(unsigned long long *)&v5[32] = 0;
    if (!a0->field_0[1])
    {
        v7 = 0;
        goto LABEL_b28d64;
    }
    if (sub_9ffbf8(a0->field_0[1]))
    {
        v7 = a0->field_0[1];
LABEL_b28d64:
        *(void* *)v5 = v7;
        if (!a0->field_8)
        {
            v8 = 0;
            goto LABEL_b28d84;
        }
        if (sub_9ffbf8(a0->field_8))
        {
            v8 = a0->field_8;
LABEL_b28d84:
            *(void* *)&v4[16] = v8;
            if (!a0->padding_18)
            {
                v9 = 0;
                goto LABEL_b28dac;
            }
            else if (sub_a40a98(a0->padding_18))
            {
                v9 = (void*)a0->padding_18;
LABEL_b28dac:
                *(void* *)&v5[24] = v9;
                if (!a0->field_20 || !a0->field_28 || (v10 = sub_a6dac4(), *(void* *)&v4[40] = v10, v10))
                {
                    if (a0->padding_38)
                    {
                        v11 = sub_a6d9b4(a0->padding_38, "providers/implementations/exchange/dh_exch.c", 332);
                        *(void* *)&v4[64] = v11;
                        if (v11)
                            return v4;
                    }
                    else
                    {
                        return v4;
                    }
                }
            }
        }
    }
    else
    {
        v7 = 0;
    }
    sub_a6c2e4(0, "providers/implementations/exchange/dh_exch.c", 280);
    sub_9ffb3c(v7);
    sub_9ffb3c((long long)v4[16]);
    sub_a3f52c((long long)v4[32]);
    sub_a6c4e8((long long)v4[40], (long long)v4[48], "providers/implementations/exchange/dh_exch.c", 284);
    sub_a6c2e4(v4, "providers/implementations/exchange/dh_exch.c", 286);
    goto LABEL_b28e48;
}
