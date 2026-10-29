/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x554d4..0x555a8 (212 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_554d4_2 {
    char padding_0[32];
    struct st_554d4_1 *field_20;
} st_554d4_2;

typedef struct st_554d4_0 {
    char field_0;
} st_554d4_0;

typedef struct st_554d4_1 {
    char padding_0[8];
    unsigned int field_8;
} st_554d4_1;

extern unsigned long long g_e68ed8;
extern unsigned long long g_e68ee0;
extern unsigned int g_f00b50;

void sub_554d4(unsigned long a0, st_554d4_2 *a1, unsigned long a2, long long a3)
{
    unsigned long long v9;  // x22
    unsigned long long v10;  // x21
    unsigned long long v15;  // 4112
    unsigned long long v16;  // 4102
    unsigned long v17;  // cc_op
    unsigned long v18;  // cc_dep1
    unsigned long v19;  // cc_dep2
    unsigned long v20;  // cc_ndep
    unsigned long long v21;  // 4112
    unsigned long long v22;  // 4102
    unsigned long long v11;  // x20
    unsigned long long v12;  // x19
    unsigned long long v13;  // x30
    st_554d4_1 *v14;  // x20
    st_554d4_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_554d4_0 *v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    v2 = v9;
    v3 = v10;
    v4 = v11;
    v5 = v12;
    v6 = &v8;
    v7 = v13;
    v1 = &v0;
    v0 = &v1;
    v14 = a1->field_20;
    if (v14)
    {
        v15 = arm64g_calculate_condition(v17 | 16, v18, v19, v20);
        v16 = arm64g_calculate_condition(3, (v15 & 1 ? v14->field_8 : 0), (v15 & 1 ? g_f00b50 : 0), 0);
        if (v16 & 1)
            goto LABEL_5553c;
    }
    else
    {
        v21 = arm64g_calculate_condition(v17 | 16, v18, v19, v20);
        v22 = arm64g_calculate_condition(0, (v21 & 1 ? v14->field_8 : 0), (v21 & 1 ? g_f00b50 : 0), 0);
        if (v22 & 1)
        {
LABEL_5553c:
            if (!sub_37060() && sub_1935c(&v14[2].field_8, "vector"))
                sub_1935c(a1 + 1, a3);
            goto *((void *)(g_e68ed8));
        }
    }
    goto *((void *)(g_e68ee0));
}
