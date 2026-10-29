/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1bd7f8..0x1bd928 (304 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1bd7f8_6 {
    unsigned long long field_0;
    unsigned long long field_8;
    long long field_10;
} st_1bd7f8_6;

typedef struct st_1bd7f8_4 {
    char padding_0[8];
    unsigned long long field_8;
    char padding_10[8];
    struct st_1bd7f8_5 *field_18;
    char padding_20[8];
    unsigned int field_28;
} st_1bd7f8_4;

typedef struct st_1bd7f8_2 {
    char padding_0[40];
    struct st_1bd7f8_3 *field_28;
} st_1bd7f8_2;

typedef struct st_1bd7f8_3 {
    unsigned long long field_0;
} st_1bd7f8_3;

typedef struct st_1bd7f8_5 {
    struct st_1bd7f8_2 *field_0;
} st_1bd7f8_5;

typedef struct st_1bd7f8_1 {
    unsigned int field_0;
    char padding_4[12];
    unsigned long long field_10;
    unsigned long long field_18;
    unsigned long long field_20;
    char padding_28[40];
    unsigned long long field_50;
} st_1bd7f8_1;

typedef struct st_1bd7f8_0 {
    char field_0;
} st_1bd7f8_0;

extern unsigned long long g_e711c8;

void sub_1bd7f8(st_1bd7f8_4 *a0, st_1bd7f8_1 *a1)
{
    st_1bd7f8_6 *v4;  // x23
    long long v5;  // x22
    unsigned long long v6;  // x8
    unsigned long long v7;  // x8
    st_1bd7f8_0 **v0;  // [bp-0x60], Other Possible Types: char
    st_1bd7f8_0 *v1;  // [bp-0x58]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = a1->field_20 + (a0->field_28 - 1) * 24;
    if ((char)v4->field_10 != 1)
    {
        a1->field_0 = 0xfffffc1f;
        a1->field_50 = 0;
        return;
    }
    v5 = v4->field_8 - v4->field_0;
    v6 = a1->field_10;
    if (v5 > (long long)(a1->field_18 - v6))
    {
        v7 = 0;
        a1->field_0 = 0xfffffc1f;
    }
    else if (v5 >= 1)
    {
        (*(long long *)(*(long long *)a0->field_18 + 40))();
    }
    else
    {
        a1->field_0 = 0xfffffc1e;
        a1->field_10 = v6 + v5;
        v7 = a0->field_8;
    }
    a1->field_50 = v7;
    goto *((void *)(g_e711c8));
}
