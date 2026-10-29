/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb43fd0..0xb44144 (372 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b43fd0_0 {
    unsigned long long field_0[2];
    long long field_8;
    uint128_t field_10;
    unsigned long long field_20[2];
    void* field_28;
    void* field_30;
    char padding_38[8];
    uint128_t field_40;
    uint128_t field_50;
    uint128_t field_60;
    uint128_t field_70;
    uint128_t field_80;
    uint128_t field_90;
} st_b43fd0_0;


void* sub_b43fd0(st_b43fd0_0 *a0)
{
    void* v2;  // x0
    void* v3;  // x20
    uint128_t v12;  // q4
    void* v13;  // x8
    void* v14;  // x19
    void* v4;  // x8
    void* v5;  // x0
    uint128_t v6;  // q0
    uint128_t v7;  // q1
    uint128_t v8;  // q3
    uint128_t v9;  // q0
    uint128_t v10;  // q0
    uint128_t v11;  // q1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!sub_a2f9e0())
    {
        return 0;
    }
    else if (sub_a2f9e0())
    {
        v2 = sub_a6bffc(160, "providers/implementations/macs/hmac_prov.c", 83);
        if (v2)
        {
            v3 = v2;
            v4 = sub_a64420();
            v5 = v3;
            *(void* *)&v3[8] = v4;
            if (v4)
            {
                v6 = a0->field_50;
                v7 = a0->field_60;
                v8 = *(int128_t *)a0->padding_38;
                *(uint128_t *)&v5[96] = a0->field_40;
                *(uint128_t *)&v5[112] = v6;
                v9 = a0->field_70;
                *(uint128_t *)&v5[128] = v7;
                *(uint128_t *)&v5[144] = v9;
                v10 = (uint128_t)a0->field_20;
                v11 = *(int128_t *)&a0->field_28;
                v12 = *(int128_t *)&a0->field_8;
                *(uint128_t *)&v5[32] = a0->field_10;
                *(uint128_t *)&v5[48] = v10;
                *(uint128_t *)&v5[64] = v11;
                *(uint128_t *)&v5[80] = v8;
                *(unsigned long long [2])v5 = a0->field_0;
                *(uint128_t *)&v5[16] = v12;
                *(unsigned long long *)&v5[32] = 0;
                *(unsigned long long *)&v5[40] = 0;
                *(void* *)&v5[8] = v4;
                *(unsigned long long *)&v5[16] = 0;
                *(unsigned long long *)&v5[24] = 0;
                if (sub_a64530(v4, a0->field_0[1]) && sub_afe05c(v3 + 16, &a0->field_8))
                {
                    if (!*(long long *)((char *)&a0->field_10 + 8))
                        return v3;
                    v13 = sub_a6bf4c();
                    *(void* *)&v3[40] = v13;
                    if (!v13)
                    {
                        v14 = v3;
                        sub_a644c4((long long)v14[8]);
                        sub_afe028(v14 + 16);
                        sub_a6c4e8((long long)v14[40], (long long)v14[48], "providers/implementations/macs/hmac_prov.c", 101);
                        sub_a6c2e4();
                        return 0;
                    }
                    else if (a0->field_20[0])
                    {
                        _memcpy(v13, *(long long *)((char *)&a0->field_10 + 8));
                    }
                    else
                    {
                        return v3;
                    }
                    return v3;
                }
                sub_a644c4((long long)v3[8]);
                sub_afe028(v3 + 16);
                sub_a6c4e8((long long)v3[40], (long long)v3[48], "providers/implementations/macs/hmac_prov.c", 101);
                sub_a6c2e4();
                return 0;
            }
        }
        sub_a6c2e4();
        return 0;
    }
    else
    {
        return 0;
    }
}
