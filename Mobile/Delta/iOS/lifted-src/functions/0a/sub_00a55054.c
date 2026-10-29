/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa55054..0xa551d4 (384 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

long long sub_a55054(long long a0, long long a1, unsigned long a2, unsigned long a3)
{
    unsigned long long *v29;  // x8
    unsigned long v30;  // x21
    uint128_t v0;  // [bp-0x1d8]
    uint128_t v1;  // [bp-0x1c8]
    unsigned long v2;  // [bp-0x1b8]
    uint128_t v3;  // [bp-0x1b0]
    uint128_t v4;  // [bp-0x1a0]
    uint128_t v5;  // [bp-0x190]
    uint128_t v6;  // [bp-0x180]
    uint128_t v7;  // [bp-0x170]
    uint128_t v8;  // [bp-0x160]
    unsigned int v9;  // [bp-0x150]
    uint128_t v10;  // [bp-0x140]
    uint128_t v11;  // [bp-0x130]
    uint128_t v12;  // [bp-0x120]
    uint128_t v13;  // [bp-0x110]
    uint128_t v14;  // [bp-0x100]
    uint128_t v15;  // [bp-0xf0]
    unsigned int v16;  // [bp-0xe0]
    char v17;  // [bp-0xd0]
    char v18;  // [bp-0xb0]
    uint128_t v19;  // [bp-0xa8]
    uint128_t v20;  // [bp-0x98]
    unsigned long v21;  // [bp-0x88]
    uint128_t v22;  // [bp-0x80]
    uint128_t v23;  // [bp-0x70]
    unsigned long v24;  // [bp-0x60]
    unsigned long v25;  // [bp-0x58]
    char *v26;  // [bp-0x10]
    char v27;  // [bp+0x0]

    v26 = &v27;
    v25 = *(long long *)&g_10002b0;
    v16 = 0;
    v14 = 0;
    v15 = 0;
    v12 = 0;
    v13 = 0;
    v10 = 0;
    v11 = 0;
    v9 = 0;
    v7 = 0;
    v8 = 0;
    v5 = 0;
    v6 = 0;
    v3 = 0;
    v4 = 0;
    sub_a71618("default-digest", &v10, 100);
    v19 = v0;
    v20 = v1;
    v21 = v2;
    sub_a71bbc(sub_a71618("mandatory-digest", &v3, 100), &v3, 100);
    v22 = v0;
    v23 = v1;
    v24 = v2;
    if (!sub_a55b74(a0, a1, &v17))
    {
        v30 = 0;
    }
    else if (sub_a6fc18(&v19))
    {
        v29 = &v21;
        v30 = 2;
        goto LABEL_a55170;
    }
    else if (sub_a6fc18(&v17))
    {
        v29 = &v18;
        v30 = 1;
LABEL_a55170:
        sub_a6db20();
    }
    else
    {
        v30 = 0xfffffffe;
    }
    if (*(long long *)&g_10002b0 == v25)
        return v30;
    ___stack_chk_fail();
}
