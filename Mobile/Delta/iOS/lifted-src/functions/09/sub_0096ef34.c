/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x96ef34..0x96f1fc (712 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_96ef34_2 {
    uint128_t field_0;
    uint128_t field_10;
    unsigned long long field_20;
    uint128_t field_28;
    uint128_t field_38;
    unsigned long long field_48;
    uint128_t field_50;
    uint128_t field_60;
    unsigned long long field_70;
} st_96ef34_2;

typedef struct st_96ef34_0 {
    char padding_0[8];
    struct st_96ef34_1 *field_8;
} st_96ef34_0;

typedef struct st_96ef34_1 {
    long long field_0;
    char padding_8[1128];
    long long field_470;
} st_96ef34_1;

extern char g_10002b0;

long long sub_96ef34(st_96ef34_0 *a0, long long a1, long long a2, long long a3, long long a4, long long a5)
{
    long long v12;  // x0
    long long *v13;  // x8
    long long v22;  // x19
    long long v14;  // x0
    long long v15;  // x20
    long long v16;  // w0
    unsigned long v17;  // x22
    st_96ef34_2 *v18;  // x27
    st_96ef34_2 *v19;  // x24
    long long v20;  // x0
    long long v21;  // w0
    uint128_t v0;  // [bp-0x1b8]
    uint128_t v1;  // [bp-0x1a8]
    unsigned long long v2;  // [bp-0x198]
    unsigned int v3;  // [bp-0x18c]
    char v4;  // [bp-0x188]
    uint128_t v5;  // [bp-0x160]
    uint128_t v6;  // [bp-0x150]
    unsigned long long v7;  // [bp-0x140]
    uint640_t v8;  // [bp-0x138]
    unsigned long v9;  // [bp-0x70]
    char *v10;  // [bp-0x10]
    char v11;  // [bp+0x0]

    v10 = &v11;
    v9 = *(long long *)&g_10002b0;
    v3 = 1;
    v12 = sub_a50a58(a1);
    v13 = &a0->field_8->field_0;
    v14 = sub_a537e4(*v13, "TLS13-KDF", v13[142]);
    v15 = sub_a53488(v14, "TLS13-KDF", v13[142]);
    sub_a53b90(v14);
    if (v15)
    {
        v16 = (unsigned int)sub_a50ac8(a1);
        if (v16 > 0)
        {
            v17 = v16;
            sub_a6ffac("mode", &v3);
            v18 = &v8;
            sub_a71618("digest", v12, 0);
            v5 = v0;
            v6 = v1;
            v7 = v2;
            if (a3)
            {
                sub_a71670("key", a3, a4);
                *(uint128_t *)&v8 = v0;
                *(uint128_t *)((char *)&v8 + 16) = v1;
                *(unsigned long long *)((char *)&v8 + 32) = v2;
                v18 = (char *)&v8 + 40;
            }
            if (a2)
            {
                v19 = &(&v18->field_20)[1];
                sub_a71670("salt", a2, v17);
                v18->field_0 = v0;
                v18->field_10 = v1;
                v18->field_20 = v2;
                v18 = v19;
            }
            sub_a71670("prefix", "tls13 ", 6);
            v18->field_20 = v2;
            v18->field_0 = v0;
            v18->field_10 = v1;
            v20 = sub_a71670("label", "derived", 7);
            *(uint128_t *)&(&v18->field_20)[1] = v0;
            *(uint128_t *)((char *)&v18->field_28 + 8) = v1;
            *(unsigned long long *)((char *)&v18->field_38 + 8) = v2;
            sub_a71bbc(v20, "derived", 7);
            *(uint128_t *)&v18->field_48 = v0;
            v18->field_50 = v1;
            *(unsigned long long *)&v18->field_60 = v2;
            v21 = (unsigned int)sub_a53798(v15, a5, v17, &v4);
            if (0 >= v21)
            {
                sub_a368c8();
                sub_a369bc("ssl/tls13_enc.c", 220, "tls13_generate_secret");
                sub_9a58a4(a0, 80, 0xc0103, 0);
            }
            v22 = v21 > 0;
            sub_a53588(v15);
        }
        else
        {
            sub_c614bc(a0, v15);
LABEL_96f1a8:
            v22 = 0;
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("ssl/tls13_enc.c", 186, "tls13_generate_secret");
        sub_9a58a4(a0, 80, 0xc0103, 0);
        goto LABEL_96f1a8;
    }
    if (*(long long *)&g_10002b0 == v9)
        return v22;
    ___stack_chk_fail();
}
