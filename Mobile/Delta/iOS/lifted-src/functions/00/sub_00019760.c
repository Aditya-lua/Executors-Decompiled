/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x19760..0x198d8 (376 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_19760_1 {
    char padding_0[128];
    unsigned int field_80;
    uint128_t field_84;
} st_19760_1;

typedef struct st_19760_0 {
    char field_0;
} st_19760_0;

extern unsigned long long g_e63190;

long long sub_19760(st_19760_1 *a0)
{
    unsigned long long v12;  // x24
    unsigned long long v13;  // x23
    unsigned long v20;  // cc_dep2
    unsigned long v21;  // cc_ndep
    unsigned long long v22;  // 4112
    unsigned long long v23;  // 4105
    unsigned long v24;  // cc_op
    unsigned long v25;  // cc_dep1
    unsigned long long v26;  // 4112
    unsigned long long v27;  // 4105
    unsigned long long v14;  // x22
    unsigned long long v28;  // x9
    unsigned long long v15;  // x21
    unsigned long long v29;  // x8
    unsigned long long v16;  // x20
    unsigned long long v17;  // x19
    unsigned long long v18;  // x30
    unsigned int v19;  // w8
    st_19760_0 **v0;  // [bp-0x98], Other Possible Types: char
    st_19760_0 *v1;  // [bp-0x90]
    uint128_t v2;  // [bp-0x50]
    unsigned long long v3;  // [bp-0x40]
    unsigned long long v4;  // [bp-0x38]
    unsigned long long v5;  // [bp-0x30]
    unsigned long long v6;  // [bp-0x28]
    unsigned long long v7;  // [bp-0x20]
    unsigned long long v8;  // [bp-0x18]
    char *v9;  // [bp-0x10]
    unsigned long long v10;  // [bp-0x8]
    char v11;  // [bp+0x0]

    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = v15;
    v7 = v16;
    v8 = v17;
    v9 = &v11;
    v10 = v18;
    v1 = &v0;
    v0 = &v1;
    v2 = *(int128_t *)&(&a0->field_80)[1];
    v19 = a0->field_80;
    if (v19 != 279)
    {
        v22 = arm64g_calculate_condition(v24 | 16, v25, v20, v21);
        v23 = arm64g_calculate_condition(3, (v22 & 1 ? v19 : 0x40000000), (v22 & 1 ? 269 : 0), 0);
        if (!(v23 & 1))
            goto LABEL_197aa;
LABEL_197a9:
        v28 = 0;
    }
    else
    {
        v26 = arm64g_calculate_condition(v24 | 16, v25, v20, v21);
        v27 = arm64g_calculate_condition(0, (v26 & 1 ? v19 : 0x40000000), (v26 & 1 ? 269 : 0), 0);
        if (v27 & 1)
            goto LABEL_197a9;
        v28 = 56;
LABEL_197aa:
    }
    v29 = 8;
    if (v19 == 278)
        v28 = v29;
    goto *((void *)(*(long long *)((char *)&g_e63190 + v28)));
}
