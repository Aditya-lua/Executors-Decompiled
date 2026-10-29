/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa54814..0xa54918 (260 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a54814_0 {
    char padding_0[96];
    long long field_60;
    long long field_68;
    char padding_70[24];
    unsigned int field_88;
    unsigned int field_8c;
    long long field_90;
} st_a54814_0;

extern char g_10002b0;

st_a54814_0 * sub_a54814(st_a54814_0 *a0)
{
    st_a54814_0 *v18;  // x0
    st_a54814_0 *v20;  // x0
    uint128_t v0;  // [bp-0x110]
    uint128_t v1;  // [bp-0x100]
    unsigned long long v2;  // [bp-0xf0]
    long long v3;  // [bp-0xe4]
    long long v4;  // [bp-0xe0]
    char v5;  // [bp-0xd8]
    uint128_t v6;  // [bp-0xb0]
    uint128_t v7;  // [bp-0xa0]
    unsigned long long v8;  // [bp-0x90]
    uint128_t v9;  // [bp-0x88]
    uint128_t v10;  // [bp-0x78]
    unsigned long long v11;  // [bp-0x68]
    uint128_t v12;  // [bp-0x60]
    uint128_t v13;  // [bp-0x50]
    unsigned long long v14;  // [bp-0x40]
    unsigned long v15;  // [bp-0x38]
    char *v16;  // [bp-0x10]
    char v17;  // [bp+0x0]

    v16 = &v17;
    v15 = *(long long *)&g_10002b0;
    v18 = a0;
    if (v18->field_68)
    {
        v4 = 0;
        v3 = 0;
        sub_a6ffac("bits", (char *)&v4 + 4);
        sub_a6ffac("security-bits", &v4);
        v6 = v0;
        v7 = v1;
        v8 = v2;
        v9 = v0;
        v10 = v1;
        v11 = v2;
        sub_a71bbc(sub_a6ffac("max-size", &v3), &v3);
        v12 = v0;
        v13 = v1;
        v14 = v2;
        v20 = sub_a55b74(a0->field_60, a0->field_68, &v5);
        v18 = v20;
        if ((unsigned int)v18)
        {
            a0->field_8c = v4;
            *(int *)&a0->field_90 = v3;
            a0->field_88 = *(unsigned int *)((void*)&v4 + 4);
            v18 = v20;
        }
    }
    if (*(long long *)&g_10002b0 == v15)
        return v18;
    ___stack_chk_fail();
}
