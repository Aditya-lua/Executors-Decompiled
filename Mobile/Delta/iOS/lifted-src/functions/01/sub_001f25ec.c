/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f25ec..0x1f2e20 (2100 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1f25ec_1 {
    unsigned long long field_0;
    uint128_t field_8;
} st_1f25ec_1;

typedef struct st_1f25ec_2 {
    unsigned int field_0;
} st_1f25ec_2;

typedef struct st_1f25ec_0 {
    char field_0;
} st_1f25ec_0;

extern unsigned long long g_e77a50;

uint128_t sub_1f25ec(unsigned long a0, unsigned long a1, st_1f25ec_1 *a2, st_1f25ec_2 **a3, unsigned int *a4, unsigned long a5)
{
    unsigned int *v26;  // x8
    unsigned int v27;  // w9
    unsigned long long v36;  // 4113
    unsigned long long v37;  // 4112
    unsigned long long v38;  // 4106
    unsigned long long v39;  // 4112
    unsigned long long v40;  // 4106
    unsigned long long v41;  // x9
    unsigned long long v28;  // x11
    unsigned long v29;  // cc_dep1
    unsigned long v30;  // 4112
    unsigned long v31;  // cc_op
    unsigned long v32;  // cc_dep1
    unsigned long v33;  // cc_dep2
    unsigned long long v34;  // 4113
    unsigned long v35;  // 4112
    uint128_t v0;  // [bp-0x1c0]
    uint128_t v1;  // [bp-0x1b0]
    uint128_t v2;  // [bp-0x1a0]
    uint128_t v3;  // [bp-0x190]
    st_1f25ec_0 **v4;  // [bp-0x178], Other Possible Types: char
    st_1f25ec_0 *v5;  // [bp-0x170]
    uint128_t v6;  // [bp-0x150]
    uint128_t v7;  // [bp-0x140]
    uint128_t v8;  // [bp-0x130]
    uint128_t v9;  // [bp-0x120]
    unsigned long v10;  // [bp-0x110]
    unsigned int v11;  // [bp-0x100]
    unsigned int v12;  // [bp-0xfc]
    uint128_t v13;  // [bp-0xf8]
    uint128_t v14;  // [bp-0xe8]
    unsigned long v15;  // [bp-0xd8]
    unsigned long v16;  // [bp-0xd0]
    unsigned long v17;  // [bp-0xc8]
    unsigned long v18;  // [bp-0xb0]
    unsigned long v19;  // [bp-0xa8]
    unsigned long v20;  // [bp-0xa0]
    unsigned long v21;  // [bp-0x98]
    unsigned long v22;  // [bp-0x90]
    unsigned long v23;  // [bp-0x88]
    char *v24;  // [bp-0x10]
    char v25;  // [bp+0x0]

    v24 = &v25;
    v5 = &v4;
    v4 = &v5;
    v21 = 0;
    v22 = 0;
    v23 = 0;
    v18 = 0;
    v19 = 0;
    v20 = 0;
    v15 = 0;
    v16 = 0;
    v17 = 0;
    v10 = 0;
    v8 = 0;
    v9 = 0;
    v3 = 1;
    v2 = 0x10000000100000001;
    v1 = 18;
    v0 = 19;
    v6 = 0;
    v7 = 0;
    a2->field_0 = 0;
    *(unsigned int *)&(&a2->field_0)[1] = 1;
    v26 = *a3;
    if (v26 != a4)
    {
        v27 = *v26;
        if (v27 != 41 && v27 != 124)
        {
            v22 = 0;
            v19 = 0;
            *a3 = v26 + 1;
            v11 = 0;
            v12 = v27;
            v14 = v3;
            v13 = v2;
            v28 = 448;
            if (v27 == 40)
                v28 = 16;
            if (v27 == 91)
                v28 = 296;
            if (v27 == 92)
                v28 = 648;
            if (v27 == 46)
                v28 = 728;
            if (v27 == 94)
                v28 = 744;
            v29 = v27;
            if (v27 == 36)
                v28 = 72;
            if ((v27 & 0xfffffffe) != 42)
            {
                v30 = arm64g_calculate_condition(19, v29, 36, 0);
                v31 = 3;
                v32 = (v30 & 1 ? v27 : 0x40000000);
                v33 = (v30 & 1 ? 63 : 0);
                v34 = arm64g_calculate_condition(19, v32, v33, 0);
                if (!(v34 & 1))
                    goto LABEL_1f2766;
LABEL_1f2765:
                v37 = arm64g_calculate_condition(v31 | 16, v32, v33, 0);
                v38 = arm64g_calculate_condition(3, (v37 & 1 ? v27 : 0x40000000), (v37 & 1 ? 123 : 0), 0);
                if (!(v38 & 1))
                    goto LABEL_1f276e;
LABEL_1f276d:
                v28 = 280;
            }
            else
            {
                v35 = arm64g_calculate_condition(19, v29, 36, 0);
                v31 = 0;
                v32 = (v35 & 1 ? v27 : 0x40000000);
                v33 = (v35 & 1 ? 63 : 0);
                v36 = arm64g_calculate_condition(16, v32, v33, 0);
                if (v36 & 1)
                    goto LABEL_1f2765;
LABEL_1f2766:
                v39 = arm64g_calculate_condition(v31 | 16, v32, v33, 0);
                v40 = arm64g_calculate_condition(0, (v39 & 1 ? v27 : 0x40000000), (v39 & 1 ? 123 : 0), 0);
                if (v40 & 1)
                    goto LABEL_1f276d;
LABEL_1f276e:
            }
            if (v27 == 125)
                v28 = 304;
            v41 = 248;
            if (v27 != 93)
                v41 = v28;
            goto *((void *)(*(long long *)((char *)&g_e77a50 + v41)));
        }
    }
    sub_1eccac(&v9);
    sub_1eccac((char *)&v7 + 8);
    sub_1eccac(&v6);
    sub_1eccac(&v15);
    sub_1eccac(&v18);
    sub_1eccac(&v21);
    return 1;
}
