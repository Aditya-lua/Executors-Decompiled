/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a94bc..0x1a9c08 (1868 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1a94bc_0 {
    char padding_0[16];
    struct st_1a94bc_1 *field_10;
} st_1a94bc_0;

typedef struct st_1a94bc_6 {
    char padding_0[8];
    uint128_t field_8;
    unsigned long long field_18;
} st_1a94bc_6;

typedef struct st_1a94bc_2 {
    char padding_0[32];
    unsigned int field_20;
    char padding_24[4];
    struct st_1a94bc_3 *field_28;
} st_1a94bc_2;

typedef struct st_1a94bc_3 {
    struct st_1a94bc_0 *field_0;
} st_1a94bc_3;

typedef struct st_1a94bc_1 {
    unsigned long long field_0;
} st_1a94bc_1;

typedef struct st_1a94bc_4 {
    unsigned int field_0;
    char padding_4[76];
    struct st_1a94bc_3 *field_50;
} st_1a94bc_4;

typedef struct st_1a94bc_7 {
    char padding_0[88];
    unsigned int field_58;
    char field_5c;
} st_1a94bc_7;

typedef struct st_1a94bc_5 {
    char field_0;
} st_1a94bc_5;

extern unsigned long long g_e71a70;

st_1a94bc_0 ** sub_1a94bc(st_1a94bc_2 *a0, unsigned long long a1, unsigned long long a2, unsigned long long a3, unsigned int a4, char a5)
{
    st_1a94bc_0 **v20;  // x19
    unsigned long long *v21;  // x10
    unsigned long long v30;  // x9
    st_1a94bc_7 *v31;  // x9
    st_1a94bc_4 *v32;  // x20
    unsigned int v33;  // w8
    unsigned long long v34;  // x9
    unsigned long long v35;  // 4123
    unsigned long long v36;  // 4115
    unsigned long v37;  // cc_dep1
    unsigned long long v38;  // 4116
    unsigned long long v39;  // x9
    unsigned long long v22;  // x8
    unsigned long long v40;  // 4123
    unsigned long long v41;  // 4123
    unsigned long long v42;  // 4112
    unsigned long long v43;  // 4105
    unsigned long long v44;  // 4112
    unsigned long long v45;  // 4105
    unsigned long long v46;  // 4116
    unsigned long long v47;  // x8
    unsigned long long v48;  // 4116
    unsigned long idx;  // x9
    unsigned long long v24;  // x8
    st_1a94bc_6 *v25;  // x8
    unsigned long v26;  // x8
    unsigned long long *v27;  // x10
    unsigned long long v28;  // x9
    unsigned long index;  // x11
    unsigned long long v0;  // [bp-0x150]
    unsigned long long v1;  // [bp-0x148]
    st_1a94bc_0 **v2;  // [bp-0x140]
    st_1a94bc_0 **v3;  // [bp-0x134]
    unsigned long long v4;  // [bp-0x130]
    st_1a94bc_5 **v5;  // [bp-0x120], Other Possible Types: char
    st_1a94bc_5 *v6;  // [bp-0x118]
    st_1a94bc_0 **v7;  // [bp-0x110], Other Possible Types: st_1a94bc_5 *, st_1a94bc_3 **
    st_1a94bc_0 **v8;  // [bp-0x108]
    st_1a94bc_0 **v9;  // [bp-0xf8]
    st_1a94bc_0 **v10;  // [bp-0xe8]
    st_1a94bc_0 **v11;  // [bp-0xd8]
    st_1a94bc_0 **v12;  // [bp-0xc8]
    st_1a94bc_0 **v13;  // [bp-0xbb]
    st_1a94bc_0 **v14;  // [bp-0xb0]
    st_1a94bc_0 **v15;  // [bp-0xa0]
    st_1a94bc_0 **v16;  // [bp-0x90]
    st_1a94bc_5 **v17;  // [bp-0x70], Other Possible Types: st_1a94bc_3 **, unsigned long
    char *v18;  // [bp-0x10]
    char v19;  // [bp+0x0]

    v18 = &v19;
    v6 = &v5;
    v5 = &v6;
    v15 = (st_1a94bc_0 **)0;
    v16 = (st_1a94bc_0 **)0;
    v14 = (st_1a94bc_0 **)0;
    v20 = a0->field_28;
    if (!v20)
    {
        sub_1c3620(&v14);
        return 0;
    }
    v7 = (st_1a94bc_0 **)0;
    v8 = (st_1a94bc_0 **)0;
    v9 = (st_1a94bc_0 **)0;
    v10 = (st_1a94bc_0 **)0;
    v11 = (st_1a94bc_0 **)0;
    v12 = (st_1a94bc_0 **)0;
    v13 = 0;
    sub_1a6e7c(&v14, &v7);
    v0 = a3;
    v17 = &v11;
    sub_14fdc(&v17);
    v17 = &v9 + 1;
    sub_127c0(&v17);
    v7 = &v17;
    v17 = &v7;
    v21 = *(unsigned long long *)((void*)&v14 + 8);
    v22 = *(unsigned long long *)((void*)&v16 + 8) + (unsigned long long)v16 - 1;
    idx = (v22 >> 1) / 21;
    v24 = (v22 - 42 * idx) * 96;
    *(unsigned int *)(v21[idx] + v24) = 0;
    v25 = v21[idx] + v24;
    *(uint128_t *)(v25->padding_0)[1] = CONCAT(a1, a1);
    *(unsigned long long *)((char *)&v25->field_8 + 8) = a2;
    sub_1be870(&v25[1].field_8, a0->field_20);
    v1 = a2;
    v2 = 0;
    v3 = (st_1a94bc_0 **)0;
    v4 = a1;
    v7 = &v17;
    v17 = &v7;
    v26 = *(unsigned long long *)((void*)&v16 + 8);
    v27 = *(unsigned long long *)((void*)&v14 + 8);
    v28 = v26 + (unsigned long long)v16 - 1;
    index = (v28 >> 1) / 21;
    v30 = (v28 - 42 * index) * 96;
    *(st_1a94bc_0 ***)(v27[index] + v30 + 80) = v20;
    v31 = v27[index] + v30;
    v31->field_58 = a4;
    v31->field_5c = a5;
    v7 = &v17;
    v17 = &v7;
    v32 = *(long long *)(*(unsigned long long *)((void*)&v14 + 8) + (v26 + (unsigned long long)v16 - 1 >> 1) / 21 * 8) + 96 * (v26 + (unsigned long long)v16 - 1 - 42 * (v26 + (unsigned long long)v16 - 1 >> 1) / 21);
    if (v32->field_50)
        (*(long long *)(*(long long *)v32->field_50 + 16))();
    v33 = v32->field_0;
    v34 = 0x88;
    v35 = arm64g_calculate_condition(1, v33, 1000, 0);
    if (v35 & 1)
        v34 = 216;
    v36 = arm64g_calculate_condition(1, v33, 999, 0);
    if (v36 & 1)
        v34 = 48;
    v37 = v33;
    v38 = arm64g_calculate_condition(1, v33, 995, 0);
    if (v38 & 1)
    {
        v39 = 144;
        v40 = arm64g_calculate_condition(0x11, v33, 991, 0);
        if (!(v40 & 1))
            goto LABEL_1a9796;
LABEL_1a9795:
        v42 = arm64g_calculate_condition(0x11, v37, 995, 0);
        v43 = arm64g_calculate_condition(3, (v42 & 1 ? v33 : 0x40000000), (v42 & 1 ? 0xfffffc1e : 0), 0);
        if (!(v43 & 1))
            goto LABEL_1a979a;
LABEL_1a9799:
        v39 = 48;
    }
    else
    {
        v39 = v34;
        v41 = arm64g_calculate_condition(0x11, v33, 991, 0);
        if (v41 & 1)
            goto LABEL_1a9795;
LABEL_1a9796:
        v44 = arm64g_calculate_condition(0x11, v37, 995, 0);
        v45 = arm64g_calculate_condition(0, (v44 & 1 ? v33 : 0x40000000), (v44 & 1 ? 0xfffffc1e : 0), 0);
        if (v45 & 1)
            goto LABEL_1a9799;
LABEL_1a979a:
    }
    v46 = arm64g_calculate_condition(1, v33, 992, 0);
    if (v46 & 1)
        v39 = 240;
    v47 = 104;
    v48 = arm64g_calculate_condition(1, v33, 993, 0);
    if (!(v48 & 1))
        v47 = v39;
    goto *((void *)(*(long long *)((char *)&g_e71a70 + v47)));
}
