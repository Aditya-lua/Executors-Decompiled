/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1bb564..0x1bb94c (1000 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1bb564_3 {
    char padding_0[28];
    unsigned int field_1c;
    unsigned int field_20;
    char padding_24[4];
    void* field_28;
} st_1bb564_3;

typedef struct st_1bb564_0 {
    char field_0;
} st_1bb564_0;

extern unsigned long long g_e70e60;

void* sub_1bb564(st_1bb564_3 *a0, unsigned long a1, unsigned long a2, unsigned long long a3, unsigned int a4, char a5)
{
    void* v21;  // x19
    void* v22;  // x8
    unsigned long long v31;  // 4112
    unsigned long long v32;  // 4105
    unsigned long long v33;  // 4115
    unsigned long long v34;  // 4115
    unsigned long long v35;  // x8
    void* v23;  // x20
    void* v24;  // x22
    unsigned int v25;  // w8
    unsigned long v26;  // cc_dep1
    unsigned long long v27;  // x9
    unsigned long long v28;  // 4123
    unsigned long long v29;  // 4112
    unsigned long long v30;  // 4105
    unsigned long long v0;  // [bp-0x130]
    unsigned long v1;  // [bp-0x128]
    void* v2;  // [bp-0x114]
    st_1bb564_0 **v3;  // [bp-0x110], Other Possible Types: char
    st_1bb564_0 *v4;  // [bp-0x108]
    void* v5;  // [bp-0x100], Other Possible Types: void* *
    void* v6;  // [bp-0xf8]
    void* v7;  // [bp-0xe8]
    void* v8;  // [bp-0xd8]
    void* v9;  // [bp-0xc8]
    void* v10;  // [bp-0xb8]
    void* v11;  // [bp-0xab]
    unsigned long v12;  // [bp-0xa0]
    unsigned long v13;  // [bp-0x98]
    void* v14;  // [bp-0x90]
    void* v15;  // [bp-0x88]
    void* v16;  // [bp-0x80]
    void* v17;  // [bp-0x78]
    void* *v18;  // [bp-0x70], Other Possible Types: unsigned long
    char *v19;  // [bp-0x10]
    char v20;  // [bp+0x0]

    v19 = &v20;
    v4 = &v3;
    v3 = &v4;
    v15 = 0;
    v16 = 0;
    v17 = 0;
    v21 = a0->field_28;
    if (!v21)
    {
        v5 = &v15;
        sub_1afcb8(&v5);
        return 0;
    }
    v12 = a2;
    v13 = a2;
    v14 = (void*)0;
    v5 = (void*)0;
    v6 = (void*)0;
    v7 = (void*)0;
    v8 = (void*)0;
    v9 = (void*)0;
    v10 = (void*)0;
    v11 = 0;
    sub_1c6930(&v15, &v5);
    v0 = a3;
    v18 = &v9;
    sub_14fdc(&v18);
    v18 = &v7 + 1;
    sub_127c0(&v18);
    v22 = v16;
    *(unsigned int *)((char *)v22 - 96) = 0;
    *(unsigned long *)((char *)v22 - 88) = a1;
    *(unsigned long *)((char *)v22 - 80) = a1;
    *(unsigned long *)((char *)v22 - 72) = a2;
    sub_1b2f60(v22 - 64, a0->field_1c, &v12);
    sub_1be870(v16 - 40, a0->field_20);
    v1 = a2;
    v2 = (void*)(unsigned int)(a2 - a1);
    v23 = v16;
    *(void* *)((char *)v23 - 16) = v21;
    *(unsigned int *)((char *)v23 - 8) = a4;
    *((char *)v23 - 4) = a5;
    v24 = v23;
    if (*(long long *)((char *)v24 - 16))
        (*(long long *)(*(long long *)*(long long *)((char *)v24 - 16) + 16))();
    v25 = *(int *)((char *)v24 - 96);
    v26 = v25;
    v27 = 32;
    v28 = arm64g_calculate_condition(1, v25, 1000, 0);
    if (v28 & 1)
        v27 = 48;
    if (2 <= v25 + 995)
    {
        v29 = arm64g_calculate_condition(33, v26, 1000, 0);
        v30 = arm64g_calculate_condition(3, (v29 & 1 ? v25 : 0x40000000), (v29 & 1 ? 0xfffffc21 : 0), 0);
        if (!(v30 & 1))
            goto LABEL_1bb716;
LABEL_1bb715:
        v27 = 64;
    }
    else
    {
        v31 = arm64g_calculate_condition(33, v26, 1000, 0);
        v32 = arm64g_calculate_condition(0, (v31 & 1 ? v25 : 0x40000000), (v31 & 1 ? 0xfffffc21 : 0), 0);
        if (v32 & 1)
            goto LABEL_1bb715;
LABEL_1bb716:
    }
    v33 = arm64g_calculate_condition(1, v25, 992, 0);
    if (v33 & 1)
        v27 = 8;
    v34 = arm64g_calculate_condition(1, v25, 993, 0);
    if (v34 & 1)
        v35 = 120;
    else
        v35 = v27;
    goto *((void *)(*(long long *)((char *)&g_e70e60 + v35)));
}
