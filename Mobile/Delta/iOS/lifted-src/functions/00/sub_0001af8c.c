/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1af8c..0x1b120 (404 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1af8c_4 {
    char padding_0[12];
    unsigned int field_c;
    char padding_10[16];
    struct st_1af8c_5 *field_20;
} st_1af8c_4;

typedef struct st_1af8c_2 {
    char padding_0[8];
    unsigned int field_8;
    char field_c;
    char padding_d[19];
    struct st_1af8c_1 *field_20;
} st_1af8c_2;

typedef struct st_1af8c_1 {
    unsigned long long field_0;
    char padding_8[40];
    char field_30;
} st_1af8c_1;

typedef struct st_1af8c_5 {
    unsigned long long field_0;
} st_1af8c_5;

typedef struct st_1af8c_0 {
    char field_0;
} st_1af8c_0;

extern unsigned long long g_e62a70;
extern unsigned long long g_e62a78;
extern unsigned int g_f00b40;
extern long long g_f0ca50;
extern char g_10002b0;

unsigned long long sub_1af8c(long long a0, st_1af8c_2 *a1)
{
    st_1af8c_4 *v10;  // x0
    st_1af8c_4 *v11;  // x21
    unsigned long long v12;  // x0
    unsigned long v0;  // [bp-0x70]
    unsigned long v1;  // [bp-0x68]
    st_1af8c_0 **v2;  // [bp-0x60], Other Possible Types: char
    st_1af8c_0 *v3;  // [bp-0x58]
    unsigned long v4;  // [bp-0x50]
    st_1af8c_2 **v5;  // [bp-0x48]
    st_1af8c_2 *v6;  // [bp-0x40]
    unsigned long v7;  // [bp-0x38]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v7 = *(long long *)&g_10002b0;
    v3 = &v2;
    v2 = &v3;
    if (a1->field_8 == g_f00b40 && a1->field_20->field_30 == 1)
    {
        v6 = a1;
        v4 = sub_19088(a0, &v6, 1);
        v5 = &v6;
        v0 = a1->field_20->field_0;
    }
    else if ((char)g_f0ca50 == 1)
    {
        v10 = sub_21544(a0, a1);
        if (v10)
        {
            v11 = v10;
            v6 = a1;
            v4 = sub_19088(a0, &v6, 1);
            v5 = &v6;
            v0 = *(long long *)v11->field_20;
            v1 = v11->field_c + 1;
            sub_11094(a0, &a1->field_c, &v4, "'%s' refers to a class and cannot be used as a variable name (defined on line %d)");
            goto *((void *)(g_e62a70));
        }
        else
        {
            goto *((void *)(g_e62a78));
        }
    }
    else
    {
        v6 = a1;
        v4 = sub_19088(a0, &v6, 1);
        v5 = &v6;
    }
    v12 = sub_11094(a0, &a1->field_c, &v4);
    if (*(long long *)&g_10002b0 == v7)
        return v12;
    ___stack_chk_fail();
    __debugbreak();
}
