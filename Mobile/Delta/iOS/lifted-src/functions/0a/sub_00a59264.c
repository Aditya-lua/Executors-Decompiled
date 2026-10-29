/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa59264..0xa59470 (524 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_c7c2eb;
extern char g_10002b0;

long long sub_a59264(long long a0, long long a1, long long a2, long long a3, unsigned int a4, long long a5, int a6, long long a7, unsigned long a8, unsigned long a9)
{
    long long v23;  // x26
    long long v24;  // w25
    unsigned long long v33;  // 4105
    unsigned long long v34;  // 4110
    unsigned long long v35;  // 4105
    long long v36;  // x0
    long long v37;  // x22
    long long v38;  // x1
    long long v40;  // x19
    long long v25;  // x24
    long long v26;  // x0
    unsigned long v27;  // cc_op
    unsigned long v28;  // cc_dep1
    unsigned long v29;  // cc_dep2
    unsigned long v30;  // cc_ndep
    unsigned long long v31;  // 4112
    unsigned long long v32;  // 4110
    uint128_t v0;  // [bp-0x190]
    uint128_t v1;  // [bp-0x180]
    unsigned long long v2;  // [bp-0x170]
    unsigned int v3;  // [bp-0x168]
    unsigned int v4;  // [bp-0x164]
    char v5;  // [bp-0x160]
    uint128_t v6;  // [bp-0x138]
    uint128_t v7;  // [bp-0x128]
    unsigned long long v8;  // [bp-0x118]
    uint128_t v9;  // [bp-0x110]
    uint128_t v10;  // [bp-0x100]
    unsigned long long v11;  // [bp-0xf0]
    uint128_t v12;  // [bp-0xe8]
    uint128_t v13;  // [bp-0xd8]
    unsigned long long v14;  // [bp-0xc8]
    uint128_t v15;  // [bp-0xc0]
    uint128_t v16;  // [bp-0xb0]
    unsigned long long v17;  // [bp-0xa0]
    uint128_t v18;  // [bp-0x98]
    uint128_t v19;  // [bp-0x88]
    unsigned long long v20;  // [bp-0x78]
    unsigned long v21;  // [bp-0x70]
    char *v22;  // [bp-0x10]

    v22 = &a8;
    v23 = a2;
    v24 = a1;
    v25 = a0;
    v21 = *(long long *)&g_10002b0;
    v3 = 1;
    v4 = a4;
    v26 = sub_a50a58(a5);
    if (v25)
    {
        v27 = 1;
        v28 = v24;
        v29 = 1;
        v30 = 0;
        v31 = arm64g_calculate_condition(0x11, v24, 1, 0);
        if (!(v31 & 1))
            v24 = (unsigned int)_strlen(v25);
    }
    else
    {
        v24 = 0;
        v25 = &g_c7c2eb;
    }
    if (!a3)
    {
        v32 = arm64g_calculate_condition(v27, v28, v29, v30);
        v33 = arm64g_calculate_condition(4, (v32 & 1 ? v23 : 0), 0, 0);
        if (!(v33 & 1))
            goto LABEL_a592fa;
LABEL_a592f9:
        v23 = &g_c7c2eb;
    }
    else
    {
        v34 = arm64g_calculate_condition(v27, v28, v29, v30);
        v35 = arm64g_calculate_condition(0, (v34 & 1 ? v23 : 0), 0, 0);
        if (v35 & 1)
            goto LABEL_a592f9;
LABEL_a592fa:
    }
    v36 = sub_a537e4();
    if (v36)
    {
        v37 = sub_a53488();
        sub_a53b90(v36);
        if (!v37)
            goto LABEL_a5942c;
        sub_a71670("pass", v25, v24);
        sub_a6ffac("pkcs5", &v3);
        v6 = v0;
        v7 = v1;
        v8 = v2;
        sub_a71670("salt", v23, a3);
        v9 = v0;
        v10 = v1;
        v11 = v2;
        sub_a6ffac("iter", &v4);
        v12 = v0;
        v13 = v1;
        v14 = v2;
        v38 = v26;
        v15 = v0;
        v16 = v1;
        v17 = v2;
        sub_a71bbc(sub_a71618("digest", v38, 0), v38, 0);
        v18 = v0;
        v19 = v1;
        v20 = v2;
        v40 = sub_a53798(v37, a7, a6, &v5) == 1;
        sub_a53588(v37);
    }
    else
    {
LABEL_a5942c:
        v40 = 0;
    }
    if (*(long long *)&g_10002b0 == v21)
        return v40;
    ___stack_chk_fail();
}
