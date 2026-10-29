/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x10a78..0x10c04 (396 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_10a78_3 {
    unsigned long long field_0;
    long long field_8;
} st_10a78_3;

typedef struct st_10a78_2 {
    char padding_0[20];
    unsigned long long field_14;
    long long field_1c;
} st_10a78_2;

typedef struct st_10a78_1 {
    char padding_0[128];
    unsigned int field_80;
    unsigned long long field_84;
    char padding_8c[28];
    unsigned long long field_a8;
    char padding_b0[40];
    long long field_d8;
    char padding_e0[52];
    unsigned int field_114;
    char padding_118[304];
    unsigned long long field_248;
    long long field_250;
} st_10a78_1;

typedef struct st_10a78_5 {
    struct st_10a78_6 *field_0;
} st_10a78_5;

typedef struct st_10a78_6 {
    struct st_10a78_5 *field_0;
} st_10a78_6;

typedef struct st_10a78_0 {
    char field_0;
} st_10a78_0;


long long sub_10a78(st_10a78_1 *a0)
{
    unsigned long v12;  // x21
    long long v13;  // x0
    st_10a78_0 **v0;  // [bp-0xa0], Other Possible Types: char
    st_10a78_0 *v1;  // [bp-0x98]
    st_10a78_6 **v2;  // [bp-0x90], Other Possible Types: unsigned long
    st_10a78_3 **v3;  // [bp-0x88]
    st_10a78_6 **v4;  // [bp-0x80], Other Possible Types: unsigned long
    unsigned long v5;  // [bp-0x78]
    st_10a78_2 *v6;  // [bp-0x70]
    st_10a78_3 *v7;  // [bp-0x68]
    long long v8;  // [bp-0x60]
    unsigned long long v9;  // [bp-0x58]
    char *v10;  // [bp-0x10]
    char v11;  // [bp+0x0]

    v10 = &v11;
    v1 = &v0;
    v0 = &v1;
    v7 = &a0->padding_118[296];
    v8 = (long long)(a0->field_248 - *(long long *)&a0->padding_118[296]) >> 3;
    v9 = 0;
    v12 = *(long long *)&a0->padding_8c[24];
    do
    {
        if (sub_1184c() & 1)
            break;
        sub_16844(a0, "block");
        v6 = sub_1ddc8(a0);
        *(int *)&a0->padding_e0[44] = *(int *)&a0->padding_e0[44];
        if (a0->field_80 == 59)
        {
            sub_f8d0(a0);
            *((char *)&v6->field_14 + 4) = 1;
            *(long long *)&(v6->padding_0)[1] = *(long long *)&a0->padding_8c[24];
        }
        v4 = &v2;
        v2 = &v4;
        sub_103a8(v7, &v6);
        v9 += 1;
    } while (!sub_20f00(v6));
    v4 = v12;
    v5 = *(long long *)&(&a0->field_80)[1];
    v2 = sub_ef54(a0, &v7);
    v3 = &v7;
    v13 = sub_404c(*(long long *)&a0->padding_b0[32], 56);
    sub_67b4(v13, &v4, &v2, 1);
    sub_dd88(v7, v7->field_0 + v8 * 8, v7->field_8);
    return v13;
}
