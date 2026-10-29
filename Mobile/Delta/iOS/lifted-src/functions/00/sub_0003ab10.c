/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3ab10..0x3ad90 (640 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3ab10_1 {
    long long field_0;
    char padding_8[1524];
    unsigned int field_5fc;
} st_3ab10_1;

typedef struct st_3ab10_2 {
    char padding_0[12];
    char field_c;
    char padding_d[19];
    long long field_20;
    long long field_28;
} st_3ab10_2;

typedef struct st_3ab10_0 {
    char field_0;
} st_3ab10_0;


unsigned long long sub_3ab10(st_3ab10_1 *a0, st_3ab10_2 *a1, long long a2)
{
    double v9;  // d0
    unsigned long long v10;  // 4115
    unsigned long long v19;  // x0
    int v20;  // w23
    long long v21;  // x22
    long long v22;  // x22
    long long v23;  // x23
    unsigned long long v11;  // 4115
    unsigned long long v12;  // 4102
    unsigned long long v13;  // 4102
    unsigned long v14;  // x24
    unsigned long v15;  // x25
    unsigned long long v16;  // x0
    long long v17;  // x23
    char v18;  // x0
    st_3ab10_0 **v0;  // [bp-0x98], Other Possible Types: char
    st_3ab10_0 *v1;  // [bp-0x90]
    unsigned int v2;  // [bp-0x88]
    unsigned int v3;  // [bp-0x84]
    double v4;  // [bp-0x80]
    st_3ab10_1 *v5;  // [bp-0x60]
    unsigned int v6;  // [bp-0x58]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v1 = &v0;
    v0 = &v1;
    v5 = a0;
    v6 = a0->field_5fc;
    sub_46ce0();
    v9 = v4;
    if (v2 == 3)
    {
        v10 = arm64g_calculate_condition(160, (((((char)(CmpF(__double_as_longlong(v9), 1.0)) >> 5 & 3 | v9 < 1.0) ^ 1) * 0x4000000000000000 - 1 >> 61) + 1 - isnan(v9)) * 0x10000000, 0, 0);
        if (!(v10 & 1))
            goto LABEL_3ab7e;
LABEL_3ab7d:
        v12 = arm64g_calculate_condition(144, (((((char)(CmpF(__double_as_longlong(v9), 256.0)) >> 5 & 3 | v9 < 256.0) ^ 1) * 0x4000000000000000 - 1 >> 61) + 1 - isnan(v9)) * 0x10000000, 0, 0);
        if (v12 & 1)
            goto LABEL_3ac1c;
LABEL_3ab84:
        if (v2 != 7)
            goto LABEL_3ac84;
        v14 = __double_as_longlong(v9);
        v15 = v3;
        v16 = sub_2df40(a0->field_0, v14, v15);
        if (v16 >> 31 & 1)
        {
            sub_45808(&a1->field_c, "Exceeded constant limit; simplify the code to compile");
            __debugbreak();
        }
        v17 = sub_385b8(a0, a1->field_20, &v5);
        sub_395b0(a0, a1->field_28);
        v18 = sub_2ffe8(v14, v15);
        sub_2ad10(a0->field_0, 15, a2, v17, v18);
        sub_31514(a0->field_0, v16);
        v19 = sub_46e8c(a0, a1->field_20, v17, 4, 2);
    }
    else
    {
        v11 = arm64g_calculate_condition(160, 0x80000000, 0, 0);
        if (v11 & 1)
            goto LABEL_3ab7d;
LABEL_3ab7e:
        v13 = arm64g_calculate_condition(144, 0x20000000, 0, 0);
        if (!(v13 & 1))
            goto LABEL_3ab84;
LABEL_3ac1c:
        v20 = (int)v9;
        if (v9 == (double)v20)
        {
            v21 = sub_385b8(a0, a1->field_20, &v5);
            sub_395b0(a0, a1->field_28);
            sub_2ad10(a0->field_0, 0x11, a2, v21, v20 - 1 & 0xff);
            v19 = sub_46e8c(a0, a1->field_20, v21, 4, 1);
        }
        else
        {
LABEL_3ac84:
            v22 = sub_385b8(a0, a1->field_20, &v5);
            v23 = sub_385b8(a0, a1->field_28, &v5);
            sub_2ad10(a0->field_0, 13, a2, v22, v23);
            sub_46e8c(a0, a1->field_20, v22, 4, 1);
            v19 = sub_46e8c(a0, a1->field_28, v23, 2, 1);
        }
    }
    v5->field_5fc = v6;
    return v19;
}
