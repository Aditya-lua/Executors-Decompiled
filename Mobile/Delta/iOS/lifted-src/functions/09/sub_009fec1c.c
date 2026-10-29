/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9fec1c..0x9fede0 (452 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9fec1c_0 {
    uint128_t field_0;
    uint128_t field_10;
    unsigned long long field_20;
    uint128_t field_28;
    uint128_t field_38;
    unsigned long long field_48;
} st_9fec1c_0;

extern char g_10002b0;

long long sub_9fec1c(long long a0, long long a1, long long a2, long long a3, long long a4, long long a5, long long a6, long long a7, unsigned long a8, long long a9)
{
    long long v13;  // x0
    long long v14;  // x0
    long long v15;  // x22
    st_9fec1c_0 *v16;  // x28
    long long v17;  // x0
    long long v18;  // x20
    uint128_t v0;  // [bp-0x160]
    uint128_t v1;  // [bp-0x150]
    unsigned long long v2;  // [bp-0x140]
    char v3;  // [bp-0x138]
    uint128_t v4;  // [bp-0x110]
    uint128_t v5;  // [bp-0x100]
    unsigned long long v6;  // [bp-0xf0]
    uint128_t v7;  // [bp-0xe8]
    uint128_t v8;  // [bp-0xd8]
    unsigned long long v9;  // [bp-0xc8]
    uint128_t v10;  // [bp-0xc0]
    unsigned long v11;  // [bp-0x70]
    char *v12;  // [bp-0x10]

    v12 = &a8;
    v11 = *(long long *)&g_10002b0;
    v13 = sub_a50a58(a7);
    v14 = sub_a537e4(a8, "X942KDF-ASN1", a9);
    if (v14)
    {
        v15 = sub_a53488();
        if (v15)
        {
            sub_a71618("digest", v13, 0);
            v16 = &v7;
            sub_a71670("key", a2, a3);
            v4 = v0;
            v5 = v1;
            v6 = v2;
            if (a5)
            {
                sub_a71670("ukm", a5, a6);
                v7 = v0;
                v8 = v1;
                v9 = v2;
                v16 = &v10;
            }
            v17 = sub_a71618("cekalg", a4, 0);
            v16->field_0 = v0;
            v16->field_10 = v1;
            v16->field_20 = v2;
            sub_a71bbc(v17, a4, 0);
            *(uint128_t *)&(&v16->field_20)[1] = v0;
            *(uint128_t *)((char *)&v16->field_28 + 8) = v1;
            *(unsigned long long *)((char *)&v16->field_38 + 8) = v2;
            v18 = (int)sub_a53798(v15, a0, a1, &v3) > 0;
        }
        else
        {
            v18 = 0;
        }
        sub_a53588(v15);
        sub_a53b90(v14);
    }
    else
    {
        v18 = 0;
    }
    if (*(long long *)&g_10002b0 == v11)
        return v18;
    ___stack_chk_fail();
}
