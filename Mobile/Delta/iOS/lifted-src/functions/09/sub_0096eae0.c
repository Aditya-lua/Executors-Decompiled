/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x96eae0..0x96ede8 (776 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_96eae0_0 {
    uint128_t field_0;
    uint128_t field_10;
    unsigned long long field_20;
} st_96eae0_0;

extern char g_10002b0;

long long sub_96eae0(unsigned long a0, unsigned long a1, long long a2, long long a3, long long a4, long long a5, long long a6, long long a7, unsigned long a8, long long a9, long long a10)
{
    long long v23;  // x23
    long long v24;  // x0
    long long v25;  // x19
    long long v26;  // w0
    st_96eae0_0 *v27;  // x22
    long long v28;  // w20
    long long v29;  // x0
    uint128_t v0;  // [bp-0x1b8]
    uint128_t v1;  // [bp-0x1a8]
    unsigned long long v2;  // [bp-0x198]
    unsigned int v3;  // [bp-0x18c]
    char v4;  // [bp-0x188]
    uint128_t v5;  // [bp-0x160]
    uint128_t v6;  // [bp-0x150]
    unsigned long long v7;  // [bp-0x140]
    uint128_t v8;  // [bp-0x138]
    uint128_t v9;  // [bp-0x128]
    unsigned long long v10;  // [bp-0x118]
    uint128_t v11;  // [bp-0x110]
    uint128_t v12;  // [bp-0x100]
    unsigned long long v13;  // [bp-0xf0]
    uint128_t v14;  // [bp-0xe8]
    uint128_t v15;  // [bp-0xd8]
    unsigned long long v16;  // [bp-0xc8]
    uint128_t v17;  // [bp-0xc0]
    uint128_t v18;  // [bp-0xb0]
    unsigned long long v19;  // [bp-0xa0]
    uint128_t v20;  // [bp-0x98]
    unsigned long v21;  // [bp-0x70]
    char *v22;  // [bp-0x10]

    v22 = &a8;
    v21 = *(long long *)&g_10002b0;
    v23 = sub_a537e4();
    v3 = 2;
    v24 = sub_a50a58(a2);
    v25 = sub_a53488(v23);
    sub_a53b90(v23);
    if (v25)
    {
        if ((unsigned long long)a5 >= 250)
        {
            if (a10)
            {
                sub_a368c8();
                sub_a369bc("ssl/tls13_enc.c", 59, "tls13_hkdf_expand_ex");
                sub_a36abc(20, 367, 0);
            }
            sub_a53588(v25);
            goto LABEL_96ebac;
        }
        v26 = (unsigned int)sub_a50ac8(a2);
        if (v26 > 0)
        {
            sub_a6ffac("mode", &v3);
            sub_a71618("digest", v24, 0);
            v5 = v0;
            v6 = v1;
            v7 = v2;
            sub_a71670("key", a3, v26);
            v8 = v0;
            v9 = v1;
            v10 = v2;
            sub_a71670("prefix", "tls13 ", 6);
            v11 = v0;
            v12 = v1;
            v13 = v2;
            v27 = &v17;
            sub_a71670("label", a4, a5);
            v14 = v0;
            v15 = v1;
            v16 = v2;
            if (a6)
            {
                sub_a71670("data", a6, a7);
                v17 = v0;
                v18 = v1;
                v19 = v2;
                v27 = &v20;
            }
            sub_a71bbc();
            v27->field_0 = v0;
            v27->field_10 = v1;
            v27->field_20 = v2;
            v28 = (unsigned int)sub_a53798(v25, a8, a9, &v4);
            sub_a53588(v25);
            if (a10 && 0 >= v28)
            {
                sub_a368c8();
                sub_a369bc("ssl/tls13_enc.c", 94, "tls13_hkdf_expand_ex");
                sub_a36abc(20, 0xc0103, 0);
            }
            v29 = v28 > 0;
        }
        else
        {
            sub_a53588(v25);
            if (a10)
            {
                sub_a368c8();
                sub_a369bc("ssl/tls13_enc.c", 0x44, "tls13_hkdf_expand_ex");
                sub_a36abc(20, 0xc0103, 0);
                goto LABEL_96ebac;
            }
        }
    }
    else
    {
LABEL_96ebac:
        v29 = 0;
    }
    if (*(long long *)&g_10002b0 == v21)
        return v29;
    ___stack_chk_fail();
}
