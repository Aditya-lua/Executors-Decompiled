/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3e65c..0x3e838 (476 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3e65c_1 {
    char padding_0[8];
    unsigned int field_8;
    char padding_c[20];
    struct st_3e65c_2 *field_20;
    unsigned long long field_28;
} st_3e65c_1;

typedef struct st_3e65c_2 {
    void* field_0;
} st_3e65c_2;

typedef struct st_3e65c_0 {
    char field_0;
} st_3e65c_0;

extern unsigned long long g_e67540;
extern unsigned long long g_e67558;
extern unsigned int g_f00c20;

void sub_3e65c(long long a0, st_3e65c_1 *a1)
{
    unsigned long long v9;  // x22
    unsigned long long v10;  // x21
    unsigned long long v15;  // 4102
    unsigned long v16;  // cc_op
    unsigned long v17;  // cc_dep1
    unsigned long v18;  // cc_dep2
    unsigned long v19;  // cc_ndep
    unsigned long long v20;  // 4110
    unsigned long long v21;  // 4102
    unsigned long long v11;  // x20
    unsigned long long v12;  // x19
    unsigned long long v13;  // x30
    unsigned long long v14;  // 4110
    st_3e65c_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_3e65c_0 *v1;  // [bp-0x38]
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
    if (a1->field_8 == g_f00c20)
    {
        v14 = arm64g_calculate_condition(v16, v17, v18, v19);
        v15 = arm64g_calculate_condition(20, (v14 & 1 ? a1 : 0x40000000), 0, 0);
        if (v15 & 1)
            goto LABEL_3e6c8;
    }
    else
    {
        v20 = arm64g_calculate_condition(v16, v17, v18, v19);
        v21 = arm64g_calculate_condition(16, (v20 & 1 ? a1 : 0x40000000), 0, 0);
        if (v21 & 1)
        {
LABEL_3e6c8:
            if (a1->field_28)
                sub_3e65c(a0, *(long long *)a1->field_20); /* do not return */
            goto *((void *)(g_e67558));
        }
    }
    goto *((void *)(g_e67540));
}
