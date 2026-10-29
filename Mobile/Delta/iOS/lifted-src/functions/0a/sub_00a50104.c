/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa50104..0xa501f8 (244 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a50104_0 {
    char padding_0[8];
    long long field_8;
} st_a50104_0;

extern char g_10002b0;

unsigned long long sub_a50104(long long a0, st_a50104_0 *a1)
{
    unsigned long long v14;  // x0
    unsigned long long v15;  // x20
    unsigned long long v16;  // x2
    unsigned long long v18;  // x0
    uint128_t v0;  // [bp-0xd0]
    uint128_t v1;  // [bp-0xc0]
    unsigned long long v2;  // [bp-0xb0]
    unsigned long long v3;  // [bp-0xa8]
    char v4;  // [bp-0xa0]
    uint128_t v5;  // [bp-0x78]
    uint128_t v6;  // [bp-0x68]
    unsigned long long v7;  // [bp-0x58]
    uint128_t v8;  // [bp-0x50]
    uint128_t v9;  // [bp-0x40]
    unsigned long long v10;  // [bp-0x30]
    unsigned long v11;  // [bp-0x28]
    char *v12;  // [bp-0x10]
    char v13;  // [bp+0x0]

    v12 = &v13;
    v11 = *(long long *)&g_10002b0;
    v3 = 0;
    v14 = sub_9cf1e4(a1->field_8, &v3);
    if (!(v14 >> 31 & 1))
    {
        v15 = v14 & 0xffffffff;
        sub_a71670("alg_id_param", v3, v15);
        v16 = v15;
        v5 = v0;
        v6 = v1;
        v7 = v2;
        sub_a71bbc(sub_a71670("algorithm-id-params", v3, v16), v3, v16);
        v8 = v0;
        v9 = v1;
        v10 = v2;
        v18 = sub_a4dcac(a0, &v4);
    }
    else
    {
        v18 = 0xffffffff;
    }
    sub_a6c2e4(v3, "crypto/evp/evp_lib.c", 1261);
    if (*(long long *)&g_10002b0 == v11)
        return v18;
    ___stack_chk_fail();
}
