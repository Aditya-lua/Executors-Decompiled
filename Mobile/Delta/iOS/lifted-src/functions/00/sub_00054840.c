/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x54840..0x5490c (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_54840_1 {
    char padding_0[8];
    struct st_54840_1 *field_8;
} st_54840_1;

typedef struct st_54840_0 {
    char field_0;
} st_54840_0;

extern unsigned long long g_e68ef8;
extern unsigned long long g_e68f10;
extern unsigned long long g_e68f28;
extern unsigned int g_f00d80;

void sub_54840(long long a0, unsigned long a1)
{
    unsigned long long v6;  // x30
    st_54840_1 *v7;  // x0
    unsigned long v12;  // cc_op
    unsigned long v13;  // cc_dep1
    unsigned long v14;  // cc_dep2
    unsigned long v15;  // cc_ndep
    unsigned long v16;  // 4112
    unsigned long long v17;  // 4115
    unsigned long v8;  // 4112
    unsigned long v9;  // cc_op
    unsigned long v10;  // cc_dep1
    unsigned long v11;  // cc_dep2
    st_54840_0 **v0;  // [bp-0x28], Other Possible Types: char
    st_54840_0 *v1;  // [bp-0x20]
    unsigned long v2;  // [bp-0x18]
    char *v3;  // [bp-0x10]
    unsigned long long v4;  // [bp-0x8]
    char v5;  // [bp+0x0]

    v3 = &v5;
    v4 = v6;
    v1 = &v0;
    v0 = &v1;
    v2 = a1;
    v7 = sub_158b8(a0 + 192, &v2);
    if (v7)
    {
        if (v7->field_8)
        {
            v8 = arm64g_calculate_condition(v12 | 16, v13, v14, v15);
            v9 = 3;
            v10 = (v8 & 1 ? (int)v7->field_8->field_8 : 0);
            v11 = (v8 & 1 ? g_f00d80 : 0);
        }
        else
        {
            v16 = arm64g_calculate_condition(v12 | 16, v13, v14, v15);
            v9 = 0;
            v10 = (v16 & 1 ? (int)v7->field_8->field_8 : 0);
            v11 = (v16 & 1 ? g_f00d80 : 0);
        }
        v17 = arm64g_calculate_condition(v9, v10, v11, 0);
        if (!(v17 & 1))
            goto *((void *)(g_e68ef8));
        else
            goto *((void *)(g_e68f10));
    }
    else
    {
        goto *((void *)(g_e68f28));
    }
}
