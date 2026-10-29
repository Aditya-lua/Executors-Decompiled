/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1dd48c..0x1dd6a4 (536 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1dd48c_3 {
    char padding_0[2];
    char field_2;
    char padding_3[77];
    struct st_1dd48c_2 *field_50;
    char padding_58[32];
    unsigned long long field_78;
} st_1dd48c_3;

typedef struct st_1dd48c_1 {
    char field_0;
    char padding_1[2];
    char field_3;
    char padding_4[20];
    unsigned long long field_18;
} st_1dd48c_1;

typedef struct st_1dd48c_2 {
    unsigned long long field_0;
    unsigned long long field_8;
    char padding_10[16];
    struct st_1dd48c_3 *field_20;
} st_1dd48c_2;

typedef struct st_1dd48c_0 {
    char field_0;
} st_1dd48c_0;

typedef struct st_1dd48c_5 {
    unsigned long long field_0;
} st_1dd48c_5;

typedef struct st_1dd48c_4 {
    char padding_0[88];
    struct st_1dd48c_5 *field_58;
    char padding_60[8];
    struct st_1dd48c_5 *field_68;
} st_1dd48c_4;

extern st_1dd48c_4 *g_f0d3d8;
extern unsigned long long g_f0d528;

void sub_1dd48c(st_1dd48c_3 *a0, st_1dd48c_1 *a1, unsigned long a2)
{
    unsigned long long v15;  // x28
    unsigned long long v16;  // x27
    unsigned long long v25;  // x30
    unsigned int v26;  // w8
    unsigned long v27;  // cc_op
    unsigned long v28;  // cc_dep1
    unsigned long v29;  // cc_dep2
    unsigned long v30;  // cc_ndep
    unsigned long long v31;  // 4112
    unsigned long long v32;  // 4102
    unsigned long long v17;  // x26
    unsigned long long v33;  // 4112
    unsigned long long v34;  // 4102
    unsigned long long v18;  // x25
    unsigned long v35;  // x8
    st_1dd48c_2 *v36;  // x9
    unsigned long long v19;  // x24
    unsigned long long v20;  // x23
    unsigned long long v21;  // x22
    unsigned long long v22;  // x21
    unsigned long long v23;  // x20
    unsigned long long v24;  // x19
    st_1dd48c_0 **v0;  // [bp-0x80], Other Possible Types: char
    st_1dd48c_0 *v1;  // [bp-0x78]
    unsigned long long v2;  // [bp-0x60]
    unsigned long long v3;  // [bp-0x58]
    unsigned long long v4;  // [bp-0x50]
    unsigned long long v5;  // [bp-0x48]
    unsigned long long v6;  // [bp-0x40]
    unsigned long long v7;  // [bp-0x38]
    unsigned long long v8;  // [bp-0x30]
    unsigned long long v9;  // [bp-0x28]
    unsigned long long v10;  // [bp-0x20]
    unsigned long long v11;  // [bp-0x18]
    char *v12;  // [bp-0x10]
    unsigned long long v13;  // [bp-0x8]
    char v14;  // [bp+0x0]

    v2 = v15;
    v3 = v16;
    v4 = v17;
    v5 = v18;
    v6 = v19;
    v7 = v20;
    v8 = v21;
    v9 = v22;
    v10 = v23;
    v11 = v24;
    v12 = &v14;
    v13 = v25;
    v1 = &v0;
    v0 = &v1;
    v26 = a1->field_0;
    if (v26 != 15)
    {
        v31 = arm64g_calculate_condition(v27 | 16, v28, v29, v30);
        v32 = arm64g_calculate_condition(19, (v31 & 1 ? v26 & 0xff : 0x40000000), (v31 & 1 ? 8 : 0), 0);
        if (!(v32 & 1))
            goto LABEL_1dd4d8;
    }
    else
    {
        v33 = arm64g_calculate_condition(v27 | 16, v28, v29, v30);
        v34 = arm64g_calculate_condition(16, (v33 & 1 ? v26 & 0xff : 0x40000000), (v33 & 1 ? 8 : 0), 0);
        if (!(v34 & 1))
        {
LABEL_1dd4d8:
            if (a1->field_3 & 1 || a1->field_18)
                goto LABEL_1dd504;
        }
    }
    sub_d5c30(a0, g_f0d528 + 4447);
LABEL_1dd504:
    if (a0->field_50->field_8 >= a0->field_50->field_0)
        g_f0d3d8->field_68();
    v35 = a0->field_2;
    if (v35 >> 2 & 1)
    {
        v36 = a0->field_50;
        a0->field_2 = (char)v35 & 251;
        a0->field_78 = v36->field_20;
        v36->field_20 = a0;
    }
    g_f0d3d8->field_58();
}
