/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa50354..0xa5062c (728 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a50354_0 {
    char padding_0[4];
    unsigned int field_4;
    unsigned int field_8;
    unsigned int field_c;
    unsigned long long field_10;
    char padding_18[152];
    unsigned long long field_b0;
} st_a50354_0;

extern char g_1000000;
extern char g_10002b0;

long long sub_a50354(st_a50354_0 *a0)
{
    unsigned int v42;  // w0
    unsigned long v43;  // x8
    uint128_t v0;  // [bp-0x228]
    uint128_t v1;  // [bp-0x218]
    unsigned long long v2;  // [bp-0x208]
    unsigned int v3;  // [bp-0x1fc]
    unsigned long v4;  // [bp-0x1f8]
    unsigned long v5;  // [bp-0x1f0]
    unsigned long v6;  // [bp-0x1e8]
    unsigned int v7;  // [bp-0x1dc]
    unsigned long v8;  // [bp-0x1d8]
    unsigned long v9;  // [bp-0x1d0]
    char v10;  // [bp-0x1c8]
    uint128_t v11;  // [bp-0x1a0]
    uint128_t v12;  // [bp-0x190]
    unsigned long long v13;  // [bp-0x180]
    uint128_t v14;  // [bp-0x178]
    uint128_t v15;  // [bp-0x168]
    unsigned long long v16;  // [bp-0x158]
    uint128_t v17;  // [bp-0x150]
    uint128_t v18;  // [bp-0x140]
    unsigned long long v19;  // [bp-0x130]
    uint128_t v20;  // [bp-0x128]
    uint128_t v21;  // [bp-0x118]
    unsigned long long v22;  // [bp-0x108]
    uint128_t v23;  // [bp-0x100]
    uint128_t v24;  // [bp-0xf0]
    unsigned long long v25;  // [bp-0xe0]
    uint128_t v26;  // [bp-0xd8]
    uint128_t v27;  // [bp-0xc8]
    unsigned long long v28;  // [bp-0xb8]
    uint128_t v29;  // [bp-0xb0]
    uint128_t v30;  // [bp-0xa0]
    unsigned long long v31;  // [bp-0x90]
    uint128_t v32;  // [bp-0x88]
    uint128_t v33;  // [bp-0x78]
    unsigned long long v34;  // [bp-0x68]
    uint128_t v35;  // [bp-0x60]
    uint128_t v36;  // [bp-0x50]
    unsigned long long v37;  // [bp-0x40]
    unsigned long v38;  // [bp-0x38]
    char *v39;  // [bp-0x10]
    char v40;  // [bp+0x0]

    v39 = &v40;
    v38 = *(long long *)&g_10002b0;
    v8 = 0;
    v9 = 0;
    v7 = 0;
    v5 = 0;
    v6 = 0;
    v4 = 0;
    v3 = 0;
    sub_a70ed8("blocksize", &v5);
    sub_a70ed8("ivlen", &v6);
    v11 = v0;
    v12 = v1;
    v13 = v2;
    sub_a70ed8("keylen", &v4);
    v14 = v0;
    v15 = v1;
    v16 = v2;
    sub_a70404("mode", &v3);
    v17 = v0;
    v18 = v1;
    v19 = v2;
    sub_a6ffac("aead", (char *)&v9 + 4);
    v20 = v0;
    v21 = v1;
    v22 = v2;
    sub_a6ffac("custom-iv", &v9);
    v23 = v0;
    v24 = v1;
    v25 = v2;
    sub_a6ffac("cts", (char *)&v8 + 4);
    v26 = v0;
    v27 = v1;
    v28 = v2;
    sub_a6ffac("tls-multi", &v8);
    v29 = v0;
    v30 = v1;
    v31 = v2;
    v32 = v0;
    v33 = v1;
    v34 = v2;
    sub_a71bbc(sub_a6ffac("has-randkey", &v7), &v7);
    v35 = v0;
    v36 = v1;
    v37 = v2;
    v42 = sub_a525c8(a0, &v10);
    if ((int)v42 >= 1)
    {
        a0->field_4 = v5;
        a0->field_8 = v4;
        a0->field_c = v6;
        v43 = v3;
        a0->field_10 = v43;
        if (*(unsigned int *)((void*)&v9 + 4))
        {
            v43 |= 0x200000;
            a0->field_10 = v43;
        }
        if ((unsigned int)v9)
        {
            v43 |= 16;
            a0->field_10 = v43;
        }
        if (*(unsigned int *)((void*)&v8 + 4))
        {
            v43 |= 0x4000;
            a0->field_10 = v43;
        }
        if ((unsigned int)v8)
        {
            v43 |= 0x400000;
            a0->field_10 = v43;
        }
        if (a0->field_b0)
        {
            v43 |= 0x100000;
            a0->field_10 = v43;
        }
        if (v7)
            a0->field_10 = v43 | 0x200;
        if (sub_a6fbc4(sub_a4dd90(a0), "algorithm-id-params"))
            a0->field_10 = a0->field_10 | &g_1000000;
    }
    if (*(long long *)&g_10002b0 == v38)
        return (int)v42 > 0;
    ___stack_chk_fail((int)v42 > 0);
}
