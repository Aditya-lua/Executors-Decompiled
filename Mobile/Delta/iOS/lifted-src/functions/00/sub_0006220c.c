/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x6220c..0x62368 (348 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_6220c_1 {
    char padding_0[24];
    char field_18;
} st_6220c_1;

typedef struct st_6220c_3 {
    struct st_6220c_1 *field_0;
    struct st_6220c_1 *field_8;
    struct st_6220c_2 *field_10;
    char field_18;
} st_6220c_3;

typedef struct st_6220c_2 {
    struct st_6220c_3 *field_0;
    char padding_8[8];
    struct st_6220c_3 *field_10;
    char field_18;
} st_6220c_2;

typedef struct st_6220c_0 {
    char field_0;
} st_6220c_0;

extern unsigned long long g_e69e78;
extern unsigned long long g_e69e88;

void sub_6220c(st_6220c_3 *a0, st_6220c_3 *a1)
{
    st_6220c_2 *iter;  // x21
    st_6220c_3 *v5;  // x20
    char v6;  // x8
    char v7;  // x8
    st_6220c_0 **v0;  // [bp-0x50], Other Possible Types: char
    st_6220c_0 *v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    a1->field_18 = a1 == a0;
    if (a1 == a0)
        return;
    iter = a1->field_10;
    if (iter->field_18 & 1)
        return;
    v5 = iter->field_10;
    v6 = (char)v5->field_0;
    if (v6 != iter)
    {
        if (v6 && *(char *)(v6 + 24) != 1)
        {
            iter->field_18 = 1;
            v5->field_18 = v5 == a0;
            *(char *)(v6 + 24) = 1;
            goto *((void *)(g_e69e88));
        }
        if (iter->field_0 == a1)
        {
            sub_628f8(iter);
            iter = iter->field_10;
            v5 = iter->field_10;
        }
        iter->field_18 = 1;
        v5->field_18 = 0;
        sub_62074(v5);
        goto *((void *)(g_e69e78));
    }
    else
    {
        v7 = (char)v5->field_8;
        if (v7 && *(char *)(v7 + 24) != 1)
        {
            iter->field_18 = 1;
            v5->field_18 = v5 == a0;
            *(char *)(v7 + 24) = 1;
            goto *((void *)(g_e69e88));
        }
        if (iter->field_0 != a1)
        {
            sub_62074(iter);
            iter = iter->field_10;
            v5 = iter->field_10;
        }
        iter->field_18 = 1;
        v5->field_18 = 0;
        sub_628f8(v5);
        goto *((void *)(g_e69e78));
    }
}
