/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7f214..0x7f400 (492 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_7f214_1 {
    char padding_0[936];
    unsigned int field_3a8;
} st_7f214_1;

typedef struct st_7f214_0 {
    char field_0;
} st_7f214_0;

extern unsigned long long g_e6b7d8;
extern unsigned long long g_e6b818;
extern unsigned long long g_e6b828;

void sub_7f214(st_7f214_1 *a0, unsigned long a1, unsigned long a2, unsigned long a3, unsigned long a4, unsigned long a5)
{
    unsigned long long v11;  // x24
    unsigned long long v12;  // x23
    unsigned long v21;  // cc_dep1
    unsigned long long v22;  // 4108
    unsigned long long v23;  // 4108
    unsigned long long v13;  // x22
    unsigned long long v14;  // x21
    unsigned long long v15;  // x20
    unsigned long long v16;  // x19
    unsigned long long v17;  // x30
    unsigned long long v18;  // x0
    unsigned long long *v19;  // x8
    unsigned long long v20;  // 4109
    st_7f214_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_7f214_0 *v1;  // [bp-0x48]
    unsigned long long v2;  // [bp-0x40]
    unsigned long long v3;  // [bp-0x38]
    unsigned long long v4;  // [bp-0x30]
    unsigned long long v5;  // [bp-0x28]
    unsigned long long v6;  // [bp-0x20]
    unsigned long long v7;  // [bp-0x18]
    char *v8;  // [bp-0x10]
    unsigned long long v9;  // [bp-0x8]
    char v10;  // [bp+0x0]

    v2 = v11;
    v3 = v12;
    v4 = v13;
    v5 = v14;
    v6 = v15;
    v7 = v16;
    v8 = &v10;
    v9 = v17;
    v1 = &v0;
    v0 = &v1;
    v18 = sub_814e8();
    v19 = &g_e6b818;
    v20 = arm64g_calculate_condition(146, v18, 120, 0);
    if (!(v20 & 1))
    {
        goto *((void *)(g_e6b818));
    }
    else if (v18 == 1)
    {
        v21 = a0->field_3a8;
        if (a0->field_3a8)
        {
            v22 = arm64g_calculate_condition(3, v21, 0, 0);
            if (!(v22 & 1))
                goto LABEL_7f296;
LABEL_7f295:
            v19 = &g_e6b828;
        }
        else
        {
            v23 = arm64g_calculate_condition(3, v21, 0, 0);
            if (v23 & 1)
                goto LABEL_7f295;
LABEL_7f296:
        }
        goto *((void *)(*v19));
    }
    else
    {
        goto *((void *)(g_e6b7d8));
    }
}
