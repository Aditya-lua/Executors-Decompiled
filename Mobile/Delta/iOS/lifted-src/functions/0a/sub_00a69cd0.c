/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa69cd0..0xa6a078 (936 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a69cd0_0 {
    uint128_t field_0;
    uint128_t field_10;
    unsigned long long field_20;
    uint128_t field_28;
    uint128_t field_38;
    unsigned long long field_48;
    uint128_t field_50;
    uint128_t field_60;
    unsigned long long field_70;
} st_a69cd0_0;

extern char g_10002b0;

unsigned long long * sub_a69cd0(unsigned long long *a0, long long a1, long long a2, long long a3, unsigned long long a4, long long a5, long long a6, unsigned long long a7)
{
    unsigned long long *v16;  // x0
    unsigned long long *v17;  // x25
    st_a69cd0_0 *v26;  // x19
    long long v27;  // x0
    unsigned long long v28;  // x22
    unsigned long v29;  // x23
    unsigned long v30;  // x24
    unsigned long long v31;  // x25
    unsigned long long v32;  // x0
    unsigned long long v18;  // 4140
    unsigned long long v19;  // x26
    unsigned long long v20;  // x22
    unsigned long long v21;  // x0
    long long v22;  // x0
    unsigned long long v23;  // x22
    unsigned long long v24;  // x0
    unsigned long long v25;  // x23
    unsigned long long v0;  // [bp-0x188]
    unsigned long v1;  // [bp-0x180]
    long long v2;  // [bp-0x178]
    unsigned long long *v3;  // [bp-0x170]
    long long v4;  // [bp-0x168]
    uint128_t v5;  // [bp-0x160]
    uint128_t v6;  // [bp-0x150]
    unsigned long long v7;  // [bp-0x140]
    char v8;  // [bp-0x138]
    uint128_t v9;  // [bp-0x110]
    uint128_t v10;  // [bp-0x100]
    unsigned long long v11;  // [bp-0xf0]
    uint128_t v12;  // [bp-0xe8]
    unsigned long v13;  // [bp-0x70]
    char *v14;  // [bp-0x10]
    char v15;  // [bp+0x0]

    v14 = &v15;
    v13 = *(long long *)&g_10002b0;
    v16 = a0;
    if (v16)
    {
        v16 = sub_9e46a8(a1);
        if ((unsigned int)v16)
        {
            v17 = v16;
            v18 = arm64g_calculate_condition(177, v16 & 0xffffffff, 7, 0);
            v19 = (int)((v18 & 1 ? (unsigned int)v16 + 14 : (unsigned int)v16 + 7)) >> 3;
            v4 = (unsigned int)v19 * 3;
            v16 = sub_a6bffc(v4 + 8, "crypto/deterministic_nonce.c", 206);
            if (v16)
            {
                v3 = v16;
                *v16 = 0xffffffffffffffff;
                v0 = v16 + 1;
                v1 = (int)v19;
                v2 = v0 + v1;
                if (!(sub_9e5174(a2, v2 + v1, v19) >> 31 & 1))
                {
                    v20 = sub_9e4958();
                    if (v20 && sub_9e4db0(a3, a4, v20) && ((int)(unsigned int)(unsigned long long *)(8 * a4 - (char *)v17) < 1 || sub_9ea8ac(v20, v20)) && (sub_9e5528(v20, a1) >> 31 & 1 || sub_9db498(v20, v20, a1)))
                    {
                        v21 = sub_9e5174(v20, v2, v19);
                        sub_9e48d4(v20);
                        if (!(v21 >> 31 & 1))
                        {
                            v22 = sub_a537e4(a6, "HMAC-DRBG-KDF", a7);
                            v23 = sub_a53488(v22, "HMAC-DRBG-KDF", a7);
                            sub_a53b90(v22);
                            v24 = v23;
                            if (v24)
                            {
                                v25 = v24;
                                v26 = &v9;
                                sub_a71618("digest", a5, 0);
                                if (a7)
                                {
                                    sub_a71618("properties", a7, 0);
                                    v9 = v5;
                                    v10 = v6;
                                    v11 = v7;
                                    v26 = &v12;
                                }
                                sub_a71670("entropy", v2 + v1, v1);
                                v26->field_0 = v5;
                                v26->field_10 = v6;
                                v26->field_20 = v7;
                                v27 = sub_a71670("nonce", v2, v1);
                                *(uint128_t *)&(&v26->field_20)[1] = v5;
                                *(uint128_t *)((char *)&v26->field_28 + 8) = v6;
                                *(unsigned long long *)((char *)&v26->field_38 + 8) = v7;
                                sub_a71bbc(v27, v2, v1);
                                *(uint128_t *)&v26->field_48 = v5;
                                v26->field_50 = v6;
                                *(unsigned long long *)&v26->field_60 = v7;
                                v24 = v25;
                                if ((int)sub_a537c8(v25, &v8) <= 0)
                                    goto LABEL_a6a060;
                                v28 = v24;
                                if (sub_a53798(v24, v0, v1, 0))
                                {
                                    v29 = (unsigned int)v19 + 8;
                                    v30 = (unsigned int)v29 * 8 - 64;
                                    v31 = v30 - (char *)v17;
                                    while (sub_9e4db0(v3, v29, a0))
                                    {
                                        sub_9e5d14(a0, 4);
                                        sub_9e5778(a0, v30);
                                        if ((int)v31 >= 1 && !sub_9eaa84(a0, a0, v31))
                                            break;
                                        if (!sub_9e5c0c(a0, 0) && !sub_9e5c0c(a0, 1) && sub_9e53a8(a0, a1) >> 31 & 1)
                                        {
                                            v16 = 1;
                                            goto LABEL_a6a06c;
                                        }
                                        if (!sub_a53798(v28, v0, v1, 0))
                                            break;
                                    }
                                }
                                v16 = 0;
LABEL_a6a06c:
                                v32 = v28;
                                goto LABEL_a69f70;
                            }
                            else
                            {
LABEL_a6a060:
                                sub_a53588(v24);
                            }
                        }
                    }
                    else
                    {
                        sub_9e48d4(v20);
                    }
                }
                v32 = 0;
                v16 = 0;
LABEL_a69f70:
                sub_a53588(v32);
                sub_a6c4e8(v3, v4 + 8, "crypto/deterministic_nonce.c", 0xee);
            }
        }
    }
    if (*(long long *)&g_10002b0 == v13)
        return v16;
    ___stack_chk_fail();
}
