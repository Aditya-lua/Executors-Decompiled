/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4dd8..0xb5094 (700 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b4dd8_1 {
    char padding_0[272];
    unsigned int field_110;
    char padding_114[4];
    unsigned int field_118;
    char padding_11c[4];
    struct st_b4dd8_2 *field_120;
} st_b4dd8_1;

typedef struct st_b4dd8_2 {
    char padding_0[8];
    unsigned long long field_8;
    char padding_10[8];
    unsigned long long field_18;
} st_b4dd8_2;

typedef struct st_b4dd8_0 {
    char field_0;
} st_b4dd8_0;

extern unsigned long long g_e6c6d0;

void sub_b4dd8(unsigned long long *a0, st_b4dd8_1 *a1, unsigned long a2, unsigned long a3, long long a4, long long a5, unsigned long a6)
{
    unsigned long long v19;  // x28
    unsigned long long v20;  // x27
    unsigned long long v29;  // x30
    long long v30;  // x0
    unsigned long long *v31;  // x25
    unsigned long v32;  // cc_dep1
    unsigned long long v33;  // x22
    unsigned long long v34;  // 4110
    unsigned long long v35;  // 4102
    unsigned long long v36;  // 4110
    unsigned long long v37;  // 4102
    unsigned long long v21;  // x26
    unsigned long long v22;  // x25
    unsigned long long v23;  // x24
    unsigned long long v24;  // x23
    unsigned long long v25;  // x22
    unsigned long long v26;  // x21
    unsigned long long v27;  // x20
    unsigned long long v28;  // x19
    unsigned long long v0;  // [bp-0xa0]
    unsigned long long v1;  // [bp-0x98]
    unsigned long long *v2;  // [bp-0x90]
    unsigned int v3;  // [bp-0x84]
    st_b4dd8_0 **v4;  // [bp-0x80], Other Possible Types: char
    st_b4dd8_0 *v5;  // [bp-0x78]
    unsigned long long v6;  // [bp-0x60]
    unsigned long long v7;  // [bp-0x58]
    unsigned long long v8;  // [bp-0x50]
    unsigned long long v9;  // [bp-0x48]
    unsigned long long v10;  // [bp-0x40]
    unsigned long long v11;  // [bp-0x38]
    unsigned long long v12;  // [bp-0x30]
    unsigned long long v13;  // [bp-0x28]
    unsigned long long v14;  // [bp-0x20]
    unsigned long long v15;  // [bp-0x18]
    char *v16;  // [bp-0x10]
    unsigned long long v17;  // [bp-0x8]
    char v18;  // [bp+0x0]

    v6 = v19;
    v7 = v20;
    v8 = v21;
    v9 = v22;
    v10 = v23;
    v11 = v24;
    v12 = v25;
    v13 = v26;
    v14 = v27;
    v15 = v28;
    v16 = &v18;
    v17 = v29;
    v5 = &v4;
    v4 = &v5;
    v3 = a1->field_110;
    v30 = sub_7d9f4(a1);
    v31 = sub_828cc(a1->field_118, a4, v30);
    v32 = a1->field_118;
    if (a1->field_118 > 6)
    {
        a1->field_120 = a0;
        v31();
    }
    v33 = a5 + a6;
    v0 = v33 - 32;
    v1 = v33;
    v2 = v31;
    if (a0[1] < a0[3])
    {
        v34 = arm64g_calculate_condition(0x33, v32, 6, 0);
        v35 = arm64g_calculate_condition(36, (v34 & 1 ? a5 : 0x20000000), (v34 & 1 ? v33 : 0), 0);
        if (v35 & 1)
            goto LABEL_b5040;
    }
    else
    {
        v36 = arm64g_calculate_condition(0x33, v32, 6, 0);
        v37 = arm64g_calculate_condition(32, (v36 & 1 ? a5 : 0x20000000), (v36 & 1 ? v33 : 0), 0);
        if (v37 & 1)
        {
LABEL_b5040:
            sub_b522c(a1, a5);
            sub_b5094(a1, a5);
            v2();
        }
    }
    if (sub_b4448(a0, v33 - a5, v3))
    {
        sub_b522c(a1, a5);
        sub_b5094(a1, a5);
        v2();
    }
    goto *((void *)(g_e6c6d0));
}
