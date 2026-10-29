/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb297c0..0xb2990c (332 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b297c0_0 {
    unsigned long long field_0[2];
    void* field_8;
    void* field_10;
    char padding_18[8];
    void* field_20;
    void* field_28;
    void* field_30;
} st_b297c0_0;


void* sub_b297c0(st_b297c0_0 *a0)
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
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
    {
LABEL_b298f4:
        return 0;
    }
    v2 = sub_a6bffc(64, "providers/implementations/exchange/ecdh_exch.c", 195);
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
    *(unsigned long long *)&v5[8] = 0;
    *(unsigned long long *)&v5[24] = 0;
    *(unsigned long long *)&v5[32] = 0;
    if (!a0->field_0[1])
    {
        v7 = 0;
        goto LABEL_b29840;
    }
    if (sub_a18cf0(a0->field_0[1]))
    {
        v7 = a0->field_0[1];
LABEL_b29840:
        *(void* *)v5 = v7;
        if (!a0->field_8)
        {
            v8 = 0;
            goto LABEL_b29860;
        }
        if (sub_a18cf0(a0->field_8))
        {
            v8 = a0->field_8;
LABEL_b29860:
            *(void* *)&v4[16] = v8;
            if (!a0->padding_18)
            {
                v9 = 0;
                goto LABEL_b29888;
            }
            else if (sub_a40a98(a0->padding_18))
            {
                v9 = (void*)a0->padding_18;
LABEL_b29888:
                *(void* *)&v5[24] = v9;
                if (!a0->field_20)
                {
                    return v4;
                }
                else if (a0->field_28)
                {
                    v10 = sub_a6dac4();
                    *(void* *)&v4[40] = v10;
                    if (v10)
                        return v4;
                }
                else
                {
                    return v4;
                }
            }
        }
    }
    else
    {
        v7 = 0;
    }
    sub_a18c08(v7);
    sub_a18c08((long long)v4[16]);
    sub_a3f52c((long long)v4[32]);
    sub_a6c4e8((long long)v4[40], (long long)v4[48], "providers/implementations/exchange/ecdh_exch.c", 182);
    sub_a6c2e4(v4, "providers/implementations/exchange/ecdh_exch.c", 184);
    goto LABEL_b298f4;
}
