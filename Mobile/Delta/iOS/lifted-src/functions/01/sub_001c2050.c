/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1c2050..0x1c2528 (1240 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1c2050_3 {
    char padding_0[28];
    unsigned int field_1c;
    unsigned int field_20;
    char padding_24[4];
    void* field_28;
} st_1c2050_3;

typedef struct st_1c2050_0 {
    char field_0;
} st_1c2050_0;

extern unsigned long long g_e71b90;

void* sub_1c2050(st_1c2050_3 *a0, unsigned long a1, unsigned long a2, unsigned long long a3, unsigned int a4, char a5)
{
    void* v28;  // x20
    void* v29;  // x8
    unsigned long long v38;  // 4112
    unsigned long long v39;  // 4106
    unsigned long long v40;  // 4116
    unsigned long long v41;  // 4115
    unsigned long long v42;  // x8
    void* v30;  // x19
    void* v31;  // x28
    unsigned int v32;  // w8
    unsigned long v33;  // cc_dep1
    unsigned long long v34;  // x9
    unsigned long long v35;  // 4123
    unsigned long long v36;  // 4112
    unsigned long long v37;  // 4106
    unsigned long long v0;  // [bp-0x1a8]
    unsigned long v1;  // [bp-0x1a0]
    void* v2;  // [bp-0x198]
    st_1c2050_0 **v3;  // [bp-0x180], Other Possible Types: char
    st_1c2050_0 *v4;  // [bp-0x178]
    void* v5;  // [bp-0x170], Other Possible Types: void* *, unsigned long
    void* v6;  // [bp-0x168]
    void* v7;  // [bp-0x158]
    void* v8;  // [bp-0x148]
    void* v9;  // [bp-0x138]
    void* v10;  // [bp-0x128]
    void* v11;  // [bp-0x11b]
    unsigned long v12;  // [bp-0x108]
    unsigned long v13;  // [bp-0x100]
    void* v14;  // [bp-0xf8]
    void* v15;  // [bp-0xf0], Other Possible Types: void* *
    void* v16;  // [bp-0xe8]
    void* v17;  // [bp-0xd8]
    void* v18;  // [bp-0xc8]
    void* v19;  // [bp-0xb8]
    void* v20;  // [bp-0xa8]
    void* v21;  // [bp-0x9b]
    void* v22;  // [bp-0x90]
    void* v23;  // [bp-0x88]
    void* v24;  // [bp-0x80]
    void* *v25;  // [bp-0x78], Other Possible Types: unsigned long
    char *v26;  // [bp-0x10]
    char v27;  // [bp+0x0]

    v26 = &v27;
    v4 = &v3;
    v3 = &v4;
    v22 = 0;
    v23 = 0;
    v24 = 0;
    v15 = (void*)0;
    v16 = (void*)0;
    v17 = (void*)0;
    v18 = (void*)0;
    v19 = (void*)0;
    v20 = (void*)0;
    v21 = 0;
    v28 = a0->field_28;
    if (!v28)
    {
        v5 = &v19;
        sub_14fdc(&v5);
        v5 = &v17 + 1;
        sub_127c0(&v5);
        v15 = &v22;
        sub_1afcb8(&v15);
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
    sub_1c6930(&v22, &v5);
    v0 = a3;
    v25 = &v9;
    sub_14fdc(&v25);
    v25 = &v7 + 1;
    sub_127c0(&v25);
    v29 = v23;
    *(unsigned int *)((char *)v29 - 96) = 0;
    *(unsigned long *)((char *)v29 - 88) = a1;
    *(unsigned long *)((char *)v29 - 80) = a1;
    *(unsigned long *)((char *)v29 - 72) = a2;
    sub_1b2f60(v29 - 64, a0->field_1c, &v12);
    sub_1be870(v23 - 40, a0->field_20);
    v1 = a2;
    v2 = 0;
    v30 = v23;
    *(void* *)((char *)v30 - 16) = v28;
    *(unsigned int *)((char *)v30 - 8) = a4;
    *((char *)v30 - 4) = a5;
    v31 = v30;
    if (*(long long *)((char *)v31 - 16))
        (*(long long *)(*(long long *)*(long long *)((char *)v31 - 16) + 16))();
    v32 = *(int *)((char *)v31 - 96);
    v33 = v32;
    v34 = 248;
    v35 = arm64g_calculate_condition(1, v32, 1000, 0);
    if (v35 & 1)
        v34 = 160;
    if (2 <= v32 + 995)
    {
        v36 = arm64g_calculate_condition(33, v33, 1000, 0);
        v37 = arm64g_calculate_condition(3, (v36 & 1 ? v32 : 0x40000000), (v36 & 1 ? 0xfffffc21 : 0), 0);
        if (!(v37 & 1))
            goto LABEL_1c221a;
LABEL_1c2219:
        v34 = 104;
    }
    else
    {
        v38 = arm64g_calculate_condition(33, v33, 1000, 0);
        v39 = arm64g_calculate_condition(0, (v38 & 1 ? v32 : 0x40000000), (v38 & 1 ? 0xfffffc21 : 0), 0);
        if (v39 & 1)
            goto LABEL_1c2219;
LABEL_1c221a:
    }
    v40 = arm64g_calculate_condition(1, v32, 992, 0);
    if (v40 & 1)
        v34 = 224;
    v41 = arm64g_calculate_condition(1, v32, 993, 0);
    if (v41 & 1)
        v42 = 24;
    else
        v42 = v34;
    goto *((void *)(*(long long *)((char *)&g_e71b90 + v42)));
}
