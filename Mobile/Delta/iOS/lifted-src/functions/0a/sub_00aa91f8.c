/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaa91f8..0xaa9530 (824 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_aa91f8_1 {
    uint128_t field_0;
    uint128_t field_10;
    unsigned long long field_20;
    uint128_t field_28;
    uint128_t field_38;
    unsigned long long field_48;
    uint128_t field_50;
    uint128_t field_60;
    unsigned long long field_70;
} st_aa91f8_1;

typedef struct st_aa91f8_0 {
    char padding_0[56];
    struct st_aa91f8_0 *field_38;
} st_aa91f8_0;

extern char g_10002b0;

st_aa91f8_0 * sub_aa91f8(unsigned long a0, unsigned long a1, unsigned int a2, unsigned long a3)
{
    st_aa91f8_0 *v11;  // x0
    st_aa91f8_0 **v12;  // x21
    st_aa91f8_0 *v13;  // x0
    st_aa91f8_0 *v14;  // x19
    long long v15;  // x20
    st_aa91f8_1 *iter;  // x22
    long long v18;  // x0
    uint128_t v0;  // [bp-0x1f0]
    uint128_t v1;  // [bp-0x1e0]
    unsigned long v2;  // [bp-0x1d0]
    unsigned int v3;  // [bp-0x1c4]
    unsigned long v4;  // [bp-0x1c0]
    unsigned int v5;  // [bp-0x1b4]
    char v6;  // [bp-0x1b0]
    unsigned long v8;  // [bp-0x48]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v8 = *(long long *)&g_10002b0;
    v5 = a2;
    v4 = a3;
    v11 = sub_a6820c();
    v3 = 1;
    if (v11)
    {
        v12 = v11;
        v13 = sub_a51810();
        if (v13)
        {
            v14 = sub_a51d8c();
            sub_a51d08(v13);
            if (v14)
            {
                v15 = sub_a51fd0(v14);
                iter = &v6;
                if (sub_a6fbc4(v15, "cipher"))
                {
                    iter = &v6 + 40;
                    sub_a71618();
                }
                if (v12[9] && sub_a6fbc4(v15, "digest"))
                {
                    sub_a71618("digest", v12[9], 0);
                    iter->field_0 = v0;
                    iter->field_10 = v1;
                    iter->field_20 = v2;
                    iter = &(&iter->field_20)[1];
                }
                if (v12[10])
                {
                    sub_a71618("properties");
                    iter->field_20 = v2;
                    iter->field_0 = v0;
                    iter->field_10 = v1;
                    iter = &(&iter->field_20)[1];
                }
                if (sub_a6fbc4(v15, "mac"))
                {
                    sub_a71618("mac", "HMAC", 0);
                    iter->field_20 = v2;
                    iter->field_0 = v0;
                    iter->field_10 = v1;
                    iter = &(&iter->field_20)[1];
                }
                if (sub_a6fbc4(v15, "use_derivation_function"))
                {
                    sub_a6ffac("use_derivation_function", &v3);
                    iter->field_20 = v2;
                    iter->field_0 = v0;
                    iter->field_10 = v1;
                    iter = &(&iter->field_20)[1];
                }
                sub_a70404("reseed_requests", &v5);
                iter->field_20 = v2;
                iter->field_0 = v0;
                iter->field_10 = v1;
                v18 = sub_a70f00("reseed_time_interval", &v4);
                *(uint128_t *)&(&iter->field_20)[1] = v0;
                *(uint128_t *)((char *)&iter->field_28 + 8) = v1;
                *(unsigned long *)((char *)&iter->field_38 + 8) = v2;
                sub_a71bbc(v18, &v4);
                *(uint128_t *)&iter->field_48 = v0;
                iter->field_50 = v1;
                *(unsigned long *)&iter->field_60 = v2;
                if (!sub_a52014(v14, 0, 0, 0, 0, &v6))
                {
                    sub_a368c8();
                    sub_a369bc("crypto/rand/rand_lib.c", 718, "rand_new_drbg");
                    sub_a36abc(36, 108, 0);
                    sub_a51ef0(v14);
                }
                else
                {
                    if (*(long long *)&g_10002b0 == v8)
                        return v14;
                    ___stack_chk_fail();
                }
            }
            else
            {
                sub_a368c8();
                sub_a369bc("crypto/rand/rand_lib.c", 691, "rand_new_drbg");
                sub_a36abc(36, 143, 0);
                if (*(long long *)&g_10002b0 == v8)
                    return v14;
                ___stack_chk_fail();
            }
        }
        else
        {
            sub_a368c8();
            sub_a369bc("crypto/rand/rand_lib.c", 685, "rand_new_drbg");
            sub_a36abc(36, 144, 0);
        }
    }
    if (*(long long *)&g_10002b0 == v8)
        return 0;
    ___stack_chk_fail();
}
