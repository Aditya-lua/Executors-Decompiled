/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1c1080..0x1c1290 (528 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1c1080_0 {
    unsigned long long field_0;
    struct st_1c1080_1 *field_8;
} st_1c1080_0;

typedef struct st_1c1080_2 {
    unsigned long long field_0;
    char padding_8[16];
    struct st_1c1080_0 *field_18;
} st_1c1080_2;

typedef struct st_1c1080_3 {
    char padding_0[24];
    unsigned int field_18;
    char padding_1c[12];
    struct st_1c1080_0 *field_28;
    struct st_1c1080_2 *field_30;
    struct st_1c1080_0 *field_38;
} st_1c1080_3;

typedef struct st_1c1080_1 {
    unsigned long long field_0;
} st_1c1080_1;

extern char g_e6f9d0;
extern char g_e6fa00;
extern char g_e6fa38;
extern unsigned long long g_e70b08;

void sub_1c1080(st_1c1080_3 *a0, unsigned long a1, unsigned long a2)
{
    unsigned long long v12;  // x24
    unsigned long long v13;  // x23
    st_1c1080_2 *v22;  // x0
    unsigned int v23;  // w8
    unsigned int v24;  // x9
    unsigned long v25;  // cc_dep1
    unsigned long long v26;  // 4112
    unsigned long long v27;  // 4105
    unsigned long long v28;  // 4112
    unsigned long long v29;  // 4105
    unsigned long long v30;  // x8
    unsigned long long v14;  // x22
    unsigned long long v15;  // x21
    unsigned long long v16;  // x20
    unsigned long long v17;  // x19
    unsigned long long v18;  // x30
    unsigned long long *v19;  // x0
    st_1c1080_0 *v20;  // x0
    st_1c1080_0 *v21;  // x22
    unsigned long long *v0;  // [bp-0x58], Other Possible Types: unsigned int
    st_1c1080_0 *v1;  // [bp-0x50]
    st_1c1080_0 *v2;  // [bp-0x50], Other Possible Types: unsigned int
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
    v19 = operatornew(8);
    *v19 = &g_e6f9d0;
    v0 = v19;
    v20 = operatornew(16);
    v21 = v20;
    v21->field_0 = &g_e6fa38;
    v20->field_8 = v19;
    v1 = v21;
    v22 = operatornew(32);
    v22->field_0 = &g_e6fa00;
    *(unsigned long long *)&v22->padding_8[0] = 0;
    *(unsigned long long *)&v22->padding_8[8] = 0;
    v22->field_18 = v1;
    v2 = 0;
    sub_63c08(&v2, 0);
    v2 = (st_1c1080_0 *)*(int128_t *)&a0->field_28;
    a0->field_28 = v1;
    a0->field_30 = v22;
    sub_60b78(&v2);
    v0 = 0;
    a0->field_38 = a0->field_28;
    sub_63c08(&v0, 0);
    v23 = a0->field_18 & 496;
    v24 = 16;
    if (!(a0->field_18 & 496))
        v24 = 24;
    v25 = v23;
    if (v23 == 16)
        v24 = 48;
    if (v23 != 32)
    {
        v26 = arm64g_calculate_condition(19, v25, 16, 0);
        v27 = arm64g_calculate_condition(3, (v26 & 1 ? v23 : 0x40000000), (v26 & 1 ? 64 : 0), 0);
        if (!(v27 & 1))
            goto LABEL_1c116e;
LABEL_1c116d:
        v24 = 64;
    }
    else
    {
        v28 = arm64g_calculate_condition(19, v25, 16, 0);
        v29 = arm64g_calculate_condition(0, (v28 & 1 ? v23 : 0x40000000), (v28 & 1 ? 64 : 0), 0);
        if (v29 & 1)
            goto LABEL_1c116d;
LABEL_1c116e:
    }
    if (v23 == 128)
        v24 = 32;
    v30 = 56;
    if (v23 != 0x100)
        v30 = v24;
    goto *((void *)(*(long long *)((char *)&g_e70b08 + v30)));
}
