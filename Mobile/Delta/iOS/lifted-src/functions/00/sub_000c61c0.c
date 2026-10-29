/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc61c0..0xc628c (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c61c0_1 {
    struct st_c61c0_2 *field_0;
    unsigned long long field_8;
} st_c61c0_1;

typedef struct st_c61c0_2 {
    long long field_0;
} st_c61c0_2;

typedef struct st_c61c0_0 {
    char field_0;
} st_c61c0_0;

extern unsigned long long g_e6d198;
extern unsigned long long g_e6d1a8;

void sub_c61c0(st_c61c0_1 *a0, unsigned int a1)
{
    unsigned long long v14;  // x24
    unsigned long long v15;  // x23
    unsigned long v23;  // cc_dep1
    unsigned long v24;  // cc_dep2
    unsigned long v25;  // cc_ndep
    unsigned long long v26;  // 4112
    unsigned long long v27;  // 4102
    unsigned long v28;  // cc_op
    unsigned long long v29;  // 4112
    unsigned long long v16;  // x22
    unsigned long long v30;  // 4102
    unsigned long long v17;  // x21
    unsigned long long v18;  // x20
    unsigned long long v19;  // x19
    unsigned long long v20;  // x30
    unsigned long long v21;  // x0
    unsigned int v22;  // w0
    st_c61c0_0 **v0;  // [bp-0x68], Other Possible Types: char
    st_c61c0_0 *v1;  // [bp-0x60]
    st_c61c0_0 **v2;  // [bp-0x58], Other Possible Types: char
    st_c61c0_0 *v3;  // [bp-0x50]
    unsigned int v4;  // [bp-0x44]
    unsigned long long v5;  // [bp-0x40]
    unsigned long long v6;  // [bp-0x38]
    unsigned long long v7;  // [bp-0x30]
    unsigned long long v8;  // [bp-0x28]
    unsigned long long v9;  // [bp-0x20]
    unsigned long long v10;  // [bp-0x18]
    char *v11;  // [bp-0x10]
    unsigned long long v12;  // [bp-0x8]
    char v13;  // [bp+0x0]

    v5 = v14;
    v6 = v15;
    v7 = v16;
    v8 = v17;
    v9 = v18;
    v10 = v19;
    v11 = &v13;
    v12 = v20;
    v1 = &v0;
    v0 = &v1;
    v3 = &v2;
    v2 = &v3;
    v4 = a1;
    v21 = sub_77ccc(&v4, 4, 0);
    v22 = sub_c4b98(*(long long *)&a0->field_0[v21 & a0->field_8 - 1]);
    if (v22 != a1)
    {
        v26 = arm64g_calculate_condition(v28 | 16, v23, v24, v25);
        v27 = arm64g_calculate_condition(19, (v26 & 1 ? v22 : 0x40000000), 0, 0);
        if (v27 & 1)
            goto LABEL_c6254;
    }
    else
    {
        v29 = arm64g_calculate_condition(v28 | 16, v23, v24, v25);
        v30 = arm64g_calculate_condition(16, (v29 & 1 ? v22 : 0x40000000), 0, 0);
        if (v30 & 1)
        {
LABEL_c6254:
            goto *((void *)(g_e6d1a8));
        }
    }
    goto *((void *)(g_e6d198));
}
