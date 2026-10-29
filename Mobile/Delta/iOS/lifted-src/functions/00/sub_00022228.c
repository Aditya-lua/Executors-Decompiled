/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x22228..0x223d4 (428 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_22228_1 {
    char padding_0[88];
    long long field_58;
    char field_60;
    char padding_61[31];
    unsigned int field_80;
    unsigned long long field_84;
    char padding_8c[76];
    long long field_d8;
} st_22228_1;

typedef struct st_22228_0 {
    char field_0;
} st_22228_0;

extern unsigned int g_f00b70;
extern unsigned int g_f00ed0;

void* sub_22228(st_22228_1 *a0, unsigned long a1, long long a2)
{
    long long v10;  // x0
    void* v11;  // x20
    unsigned long long v20;  // 4110
    unsigned long long v21;  // 4102
    unsigned long long v22;  // 4110
    unsigned long long v23;  // 4102
    void* v12;  // x1
    void* v13;  // x22
    void* v14;  // x23
    void* v15;  // x0
    void* v16;  // x8
    void* v17;  // x8
    unsigned long v18;  // cc_dep1
    void* v19;  // x8
    st_22228_0 **v0;  // [bp-0x90], Other Possible Types: char
    st_22228_0 *v1;  // [bp-0x88]
    void* v2;  // [bp-0x80], Other Possible Types: unsigned long
    unsigned long long v3;  // [bp-0x78]
    char v4;  // [bp-0x60]
    char v5;  // [bp-0x58]
    unsigned long long v6;  // [bp-0x50]
    unsigned long v7;  // [bp-0x48]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v1 = &v0;
    v0 = &v1;
    v7 = *(long long *)&(&a0->field_80)[1];
    sub_f8d0();
    sub_2207c(a0, "method name", &v7);
    v2 = a1;
    v3 = v6;
    v10 = sub_404c(*(long long *)&a0->padding_8c[72], 80);
    sub_6148(v10, &v2, a2, &v4, &v5, &v7, 58);
    if ((char)a0->field_58 == 1)
    {
        v11 = sub_404c(*(long long *)&a0->padding_8c[72], 48);
        *(unsigned long *)v11 = 0xffffffffffffffff;
        *(void* *)&v11[8] = 0xffffffffffffffff;
        *(unsigned long long *)&v11[16] = 0;
        *(unsigned long long *)&v11[24] = 0;
        *(unsigned long *)&v11[32] = 0xffffffffffffffff;
        *(void* *)&v11[40] = 0xffffffffffffffff;
        if (a0->field_80 == 60)
            goto LABEL_22304;
    }
    else
    {
        v11 = 0;
        if (a0->field_80 == 60)
        {
LABEL_22304:
            sub_b1a4(&a0->field_60);
            if ((unsigned int)v2 == 60)
            {
                v12 = v11;
                v13 = sub_23cd0(a0, v12, 0);
                v14 = v12;
                goto LABEL_22340;
            }
        }
    }
    v13 = 0;
    v14 = 0;
LABEL_22340:
    v15 = sub_146a8(a0, v10, 1);
    if ((char)a0->field_58 == 1)
    {
        v2 = v15;
        v16 = sub_158b8(&a0[5].padding_0[24], &v2);
        if (v16)
        {
            v17 = (long long)v16[8];
            if (*(int *)(long long)v16[8] != g_f00ed0)
                v17 = 0;
            *(void* *)&v17[40] = v11;
        }
    }
    v18 = (int)v15[8];
    if ((int)v15[8] == g_f00b70)
        v19 = v15;
    else
        v19 = 0;
    if (v19)
    {
        v20 = arm64g_calculate_condition(19, v18, g_f00b70, 0);
        v21 = arm64g_calculate_condition(4, (v20 & 1 ? v14 : 0x40000000), 0, 0);
        if (v21 & 1)
            return v15;
    }
    else
    {
        v22 = arm64g_calculate_condition(19, v18, g_f00b70, 0);
        v23 = arm64g_calculate_condition(0, (v22 & 1 ? v14 : 0x40000000), 0, 0);
        if (v23 & 1)
            return v15;
    }
    *(void* *)&v19[40] = v13;
    *(void* *)&v19[48] = v14;
    return v15;
}
