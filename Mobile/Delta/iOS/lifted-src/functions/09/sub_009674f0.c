/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9674f0..0x96783c (844 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9674f0_0 {
    char padding_0[8];
    struct st_9674f0_1 *field_8;
} st_9674f0_0;

typedef struct st_9674f0_1 {
    long long field_0;
    char padding_8[1128];
    long long field_470;
} st_9674f0_1;

extern char g_10002b0;

long long sub_9674f0(st_9674f0_0 *a0, long long a1, long long a2, long long a3, long long a4, long long a5, long long a6, long long a7, unsigned long a8, long long a9, long long a10, long long a11, long long a12, long long a13)
{
    long long v27;  // w24
    long long v28;  // x0
    long long v29;  // x0
    long long v30;  // x20
    uint128_t v0;  // [bp-0x1d8]
    uint128_t v1;  // [bp-0x1c8]
    unsigned long long v2;  // [bp-0x1b8]
    char v3;  // [bp-0x1b0]
    uint128_t v4;  // [bp-0x188]
    uint128_t v5;  // [bp-0x178]
    unsigned long long v6;  // [bp-0x168]
    uint128_t v7;  // [bp-0x160]
    uint128_t v8;  // [bp-0x150]
    unsigned long long v9;  // [bp-0x140]
    uint128_t v10;  // [bp-0x138]
    uint128_t v11;  // [bp-0x128]
    unsigned long long v12;  // [bp-0x118]
    uint128_t v13;  // [bp-0x110]
    uint128_t v14;  // [bp-0x100]
    unsigned long long v15;  // [bp-0xf0]
    uint128_t v16;  // [bp-0xe8]
    uint128_t v17;  // [bp-0xd8]
    unsigned long long v18;  // [bp-0xc8]
    uint128_t v19;  // [bp-0xc0]
    uint128_t v20;  // [bp-0xb0]
    unsigned long long v21;  // [bp-0xa0]
    uint128_t v22;  // [bp-0x98]
    uint128_t v23;  // [bp-0x88]
    unsigned long long v24;  // [bp-0x78]
    unsigned long v25;  // [bp-0x70]
    char *v26;  // [bp-0x10]

    v26 = &a8;
    v27 = a13;
    v25 = *(long long *)&g_10002b0;
    v28 = sub_95a6e4();
    if (v28)
    {
        v29 = sub_a537e4(a0->field_8->field_0, "TLS1-PRF", a0->field_8->field_470);
        if (v29)
        {
            v30 = sub_a53488();
            sub_a53b90(v29);
            if (v30)
            {
                v27 = v27;
                sub_a71618("digest", sub_a50a58(v28), 0);
                sub_a71670("secret", a9, a10);
                v4 = v0;
                v5 = v1;
                v6 = v2;
                sub_a71670("seed", a1, a2);
                v7 = v0;
                v8 = v1;
                v9 = v2;
                sub_a71670("seed", a3, a4);
                v10 = v0;
                v11 = v1;
                v12 = v2;
                sub_a71670("seed", a5, a6);
                v13 = v0;
                v14 = v1;
                v15 = v2;
                sub_a71670("seed", a7, a8);
                v16 = v0;
                v17 = v1;
                v18 = v2;
                v19 = v0;
                v20 = v1;
                v21 = v2;
                sub_a71bbc(sub_a71670("seed", 0, 0), 0, 0);
                v22 = v0;
                v23 = v1;
                v24 = v2;
                if (sub_a53798(v30, a11, a12, &v3))
                {
                    sub_a53588(v30);
                    if (*(long long *)&g_10002b0 == v25)
                        return 1;
                    ___stack_chk_fail();
                }
            }
        }
        else
        {
            v30 = 0;
        }
        sub_a368c8();
        if (v27)
        {
            sub_a369bc("ssl/t1_enc.c", 82, "tls1_PRF");
            sub_9a58a4(a0, 80, 0xc0103, 0);
        }
        else
        {
            sub_a369bc("ssl/t1_enc.c", 84, "tls1_PRF");
            sub_a36abc(20, 0xc0103, 0);
        }
        sub_a53588(v30);
    }
    else
    {
        sub_a368c8();
        if (v27)
        {
            sub_a369bc("ssl/t1_enc.c", 44, "tls1_PRF");
            sub_9a58a4(a0, 80, 0xc0103, 0);
        }
        else
        {
            sub_a369bc("ssl/t1_enc.c", 46, "tls1_PRF");
            sub_a36abc(20, 0xc0103, 0);
        }
    }
    if (*(long long *)&g_10002b0 == v25)
        return 0;
    ___stack_chk_fail();
}
