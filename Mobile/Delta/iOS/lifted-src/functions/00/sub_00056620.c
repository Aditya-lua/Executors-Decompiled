/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x56620..0x56704 (228 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_56620_4 {
    char padding_0[8];
    unsigned int field_8;
    char padding_c[4];
    char field_10;
} st_56620_4;

typedef struct st_56620_1 {
    unsigned long long field_0;
} st_56620_1;

typedef struct st_56620_3 {
    struct st_56620_1 *field_0;
} st_56620_3;

typedef struct st_56620_0 {
    char field_0;
} st_56620_0;

typedef struct st_56620_2 {
    struct st_56620_3 *field_0;
    unsigned int field_8;
} st_56620_2;

extern unsigned int g_f00b40;
extern unsigned int g_f00b50;

st_56620_4 * sub_56620(long long *a0, st_56620_2 *a1)
{
    st_56620_4 *v4;  // x0
    st_56620_4 *v5;  // x0
    st_56620_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_56620_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a1 && a1->field_8 == g_f00b40)
    {
        sub_56810(a0[2], &a1[2].field_8);
        v4 = sub_3f3c0(a0[2], &a1[2].field_8);
        v4->field_10 = 1;
        return v4;
    }
    if (a1 && a1->field_8 == g_f00b50)
    {
        sub_567ac(a0[1], &a1[2].field_8);
        v5 = sub_fb84(a0[1], &a1[2].field_8);
        v5->field_8 = 2;
        return v5;
    }
    (*(long long *)a1->field_0)();
}
