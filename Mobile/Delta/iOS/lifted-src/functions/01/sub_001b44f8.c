/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1b44f8..0x1b4658 (352 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1b44f8_5 {
    char padding_0[8];
    unsigned long long field_8;
} st_1b44f8_5;

typedef struct st_1b44f8_1 {
    char padding_0[16];
    char field_10;
} st_1b44f8_1;

typedef struct st_1b44f8_4 {
    unsigned long long field_0;
} st_1b44f8_4;

typedef struct st_1b44f8_2 {
    char padding_0[48];
    unsigned long long field_30;
    unsigned long long field_38;
    char field_40;
    char padding_41[7];
    unsigned long long field_48;
    unsigned long long field_50;
    char field_58;
    char padding_59[7];
    char field_60;
} st_1b44f8_2;

typedef struct st_1b44f8_3 {
    struct st_1b44f8_4 *field_0;
    struct st_1b44f8_4 *field_8;
    char padding_10[8];
    unsigned long long field_18;
    unsigned long long field_20;
    char padding_28[8];
    unsigned long long field_30;
    unsigned long long field_38;
    char field_40;
    char padding_41[7];
    unsigned long long field_48;
    unsigned long long field_50;
    char field_58;
    char padding_59[7];
    char field_60;
    char padding_61[7];
    unsigned long long field_68;
} st_1b44f8_3;

typedef struct st_1b44f8_0 {
    char field_0;
} st_1b44f8_0;


st_1b44f8_1 * sub_1b44f8(st_1b44f8_3 *a0, unsigned long a1, unsigned long a2, st_1b44f8_2 *a3, unsigned long a4)
{
    st_1b44f8_1 *v4;  // x0
    unsigned long long v5;  // x24
    unsigned long long v6;  // x26
    unsigned long long i;  // x23
    unsigned long long *v8;  // x0
    st_1b44f8_5 *v9;  // x0
    unsigned long long *v10;  // x9
    unsigned long long *v11;  // x10
    unsigned long long v12;  // x8
    st_1b44f8_0 **v0;  // [bp-0x60], Other Possible Types: char
    st_1b44f8_0 *v1;  // [bp-0x58]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = sub_1c460c();
    v5 = a1 - a3->field_30;
    if (a0->field_8 != a0->field_0)
    {
        v6 = 0;
        i = 0;
        do
        {
            v8 = sub_1bc4cc(a3, i);
            *(unsigned long long *)((char *)a0->field_0 + v6) = v5 + *v8;
            v9 = sub_1bc4cc(a3, i);
            *(unsigned long long *)((char *)a0->field_0 + v6 + 8) = v5 + v9->field_8;
            v4 = sub_1bc4cc(a3, i);
            v10 = a0->field_0;
            v11 = a0->field_8;
            *((char *)v10 + v6 + 16) = v4->field_10;
            i += 1;
            v6 += 24;
        } while (i < ((long long)(v11 - v10) >> 3) * 12297829382473034411);
    }
    a0->field_18 = a2;
    a0->field_20 = a2;
    a0->padding_28[0] = 0;
    v12 = v5 + a3->field_30;
    a0->field_30 = v12;
    a0->field_38 = v5 + a3->field_38;
    a0->field_40 = a3->field_40;
    a0->field_48 = v5 + a3->field_48;
    a0->field_50 = v5 + a3->field_50;
    a0->field_58 = a3->field_58;
    if (!(a4 & 1))
        a0->field_68 = v12;
    a0->field_60 = a3->field_60;
    return v4;
}
