/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3e8a4..0x3ec0c (872 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3e8a4_1 {
    long long field_0;
    int field_8;
    char padding_c[212];
    char field_e0;
    char padding_e1[1307];
    unsigned int field_5fc;
    char padding_600[16];
    long long field_610;
    char padding_618[24];
    unsigned long long field_630;
    unsigned long long field_638;
    char padding_640[32];
    unsigned long long field_660;
    unsigned long long field_668;
    char padding_670[8];
    char field_678;
    char padding_679[7];
    unsigned long long field_680;
} st_3e8a4_1;

typedef struct st_3e8a4_2 {
    char padding_0[32];
    long long field_20;
    long long field_28;
    long long field_30;
    unsigned long long field_38;
    long long field_40;
} st_3e8a4_2;

typedef struct st_3e8a4_0 {
    char field_0;
} st_3e8a4_0;

extern unsigned int g_f0cd38;
extern unsigned int g_f0cd58;

unsigned long long sub_3e8a4(st_3e8a4_1 *a0, st_3e8a4_2 *a1)
{
    unsigned long long v9;  // x0
    unsigned long long v10;  // x27
    long long v19;  // x0
    long long v20;  // x21
    long long v21;  // x23
    unsigned long long v11;  // x21
    long long v12;  // x0
    unsigned long long v13;  // x0
    unsigned int v14;  // w26
    char v15;  // x28
    long long v16;  // x0
    long long v17;  // x0
    long long v18;  // x0
    unsigned long v0;  // [bp-0x98]
    unsigned int v1;  // [bp-0x8c]
    st_3e8a4_0 **v2;  // [bp-0x88], Other Possible Types: char
    st_3e8a4_0 *v3;  // [bp-0x80]
    long long v4;  // [bp-0x78]
    long long v5;  // [bp-0x70]
    unsigned long long v6;  // [bp-0x68]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v3 = &v2;
    v2 = &v3;
    v1 = a0->field_5fc;
    if (a0->field_8 < 2 || !sub_4663c(a0, a1->field_30) || !sub_4663c(a0, a1->field_28) || a1->field_38 && !sub_4663c(a0) || (v9 = sub_3c9bc(a0, a1, g_f0cd38, g_f0cd58), !(v9 & 1)))
    {
        v0 = a0->field_668;
        v10 = a0->field_660;
        v4 = (long long)(a0->field_638 - a0->field_630) >> 3;
        v5 = v4;
        v6 = 0;
        sub_15798(&a0->field_678, &v4);
        *(char *)&a0->field_610 = 1;
        v11 = sub_3b87c(a0, a1, 3);
        v12 = sub_2b4f8(a0->field_0);
        v13 = sub_34930(&a0->field_e0, &a1->field_20);
        v14 = (unsigned int)v11 + 2;
        if (v13 && *(char *)(v13 + 16) == 1)
            v15 = sub_3b87c(a0, a1, 1);
        else
            v15 = v14;
        sub_47e48(a0, a1->field_28, v14 & 0xff, 1);
        sub_47e48(a0, a1->field_30, v11, 1);
        if (a1->field_38)
            sub_47e48(a0);
        else
            sub_2ad10(a0->field_0, 4, (unsigned int)v11 + 1 & 0xff, 1, 0);
        v16 = sub_2bc4c(a0->field_0);
        sub_2fdb0(a0->field_0, 56, v11, 0);
        v17 = sub_2bc4c(a0->field_0);
        if (v14 != v15)
            sub_2ad10(a0->field_0, 6, v15, v14 & 0xff, 0);
        sub_3f5c4(a0, a1->field_20, v15, v12);
        sub_38924(a0, a1->field_40);
        sub_3b76c(a0, v4);
        sub_46278(a0, v4);
        sub_395b0(a0, a1);
        v18 = sub_2bc4c(a0->field_0);
        v19 = sub_2bc4c(a0->field_0);
        sub_2fdb0(a0->field_0, 57, v11, 0);
        v20 = sub_2bc4c(a0->field_0);
        sub_41380(a0, a1, v16, v20);
        sub_41380(a0, a1, v19, v17);
        v21 = (long long)(v0 - v10) >> 4;
        sub_39680(a0, a1, v21, v20, v18);
        sub_39b70(&a0->field_660, v21);
        v9 = sub_c84c(&a0->field_678, a0->field_680 - 24);
    }
    a0->field_5fc = v1;
    return v9;
}
