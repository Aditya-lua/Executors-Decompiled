/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb14c7c..0xb14f8c (784 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

long long sub_b14c7c(unsigned long a0, long long a1, unsigned long a2, unsigned long long *a3, unsigned long a4, unsigned long long *a5, unsigned long a6, unsigned long a7)
{
    long long *v26;  // x23
    uint128_t v0;  // [bp-0x4e8]
    uint128_t v1;  // [bp-0x4d8]
    unsigned long long v2;  // [bp-0x4c8]
    unsigned int v3;  // [bp-0x4bc]
    long long *v4;  // [bp-0x4b8]
    long long *v5;  // [bp-0x4b0]
    unsigned long v6;  // [bp-0x4a8]
    long long *v7;  // [bp-0x4a0]
    uint128_t v8;  // [bp-0x440]
    uint128_t v9;  // [bp-0x430]
    unsigned long long v10;  // [bp-0x420]
    uint128_t v11;  // [bp-0x418]
    uint128_t v12;  // [bp-0x408]
    unsigned long long v13;  // [bp-0x3f8]
    uint128_t v14;  // [bp-0x3f0]
    uint128_t v15;  // [bp-0x3e0]
    unsigned long long v16;  // [bp-0x3d0]
    uint128_t v17;  // [bp-0x3c8]
    uint128_t v18;  // [bp-0x3b8]
    unsigned long long v19;  // [bp-0x3a8]
    uint128_t v20;  // [bp-0x3a0]
    uint128_t v21;  // [bp-0x390]
    unsigned long long v22;  // [bp-0x380]
    unsigned long v23;  // [bp-0x68]
    char *v24;  // [bp-0x10]
    char v25;  // [bp+0x0]

    v24 = &v25;
    v23 = *(long long *)&g_10002b0;
    v5 = 0;
    v6 = a0;
    v4 = 0;
    sub_a36c8c();
    if (sub_9d043c(0, &v6, a1))
    {
        v7 = 0;
        sub_a36e70();
        a5();
    }
    sub_a36cd4();
    sub_a36c8c();
    v6 = a0;
    v26 = sub_9ca7fc(0, &v6, a1);
    sub_a36cd4(v26, &v6, a1);
    if (v26 && sub_9ca8cc(0, 0, 0, &v4, v26))
    {
        v3 = 2;
        sub_a99b48(&v7, 50, *v4, 0);
        sub_a71618("data-type", &v7, 0);
        sub_a71618("input-type", "DER", 0);
        v8 = v0;
        v9 = v1;
        v10 = v2;
        sub_a71618("data-structure", "PrivateKeyInfo", 0);
        v11 = v0;
        v12 = v1;
        v13 = v2;
        sub_a71670("data", a0, a1);
        v14 = v0;
        v15 = v1;
        v16 = v2;
        v17 = v0;
        v18 = v1;
        v19 = v2;
        sub_a71bbc(sub_a6ffac("type", &v3), &v3);
        v20 = v0;
        v21 = v1;
        v22 = v2;
        a3();
    }
    sub_9ca820(v26);
    sub_a6c2e4(v5, "providers/implementations/encode_decode/decode_epki2pki.c", 189);
    if (*(long long *)&g_10002b0 == v23)
        return 1;
    ___stack_chk_fail();
}
