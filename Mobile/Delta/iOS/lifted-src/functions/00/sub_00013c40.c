/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x13c40..0x13d5c (284 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_13c40_2 {
    unsigned long long field_0;
    long long field_8;
} st_13c40_2;

typedef struct st_13c40_3 {
    struct st_13c40_4 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
} st_13c40_3;

typedef struct st_13c40_4 {
    unsigned long long field_0;
} st_13c40_4;

typedef struct st_13c40_5 {
    struct st_13c40_6 *field_0;
} st_13c40_5;

typedef struct st_13c40_6 {
    struct st_13c40_5 *field_0;
} st_13c40_6;

typedef struct st_13c40_1 {
    char padding_0[1088];
    unsigned long long field_440;
    long long field_448;
} st_13c40_1;

typedef struct st_13c40_0 {
    char field_0;
} st_13c40_0;


unsigned long long sub_13c40(st_13c40_1 *a0, st_13c40_3 *a1)
{
    unsigned long long i;  // x21
    unsigned long long v10;  // x22
    unsigned long long v11;  // x0
    st_13c40_0 **v0;  // [bp-0x88], Other Possible Types: char
    st_13c40_0 *v1;  // [bp-0x80]
    st_13c40_2 *v2;  // [bp-0x78]
    long long v3;  // [bp-0x70]
    unsigned long long v4;  // [bp-0x68]
    st_13c40_6 **v5;  // [bp-0x60]
    st_13c40_6 **v6;  // [bp-0x58]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v1 = &v0;
    v0 = &v1;
    v2 = &a0->field_440;
    v3 = (long long)(a0->field_448 - a0->field_440) >> 3;
    v4 = 0;
    if (a1->field_10)
    {
        i = 0;
        v10 = 32;
        do
        {
            v5 = &v6;
            v6 = &v5;
            sub_f2b8(v2, *(long long *)a1->field_0 + 48 * a1->field_8 + v10);
            v4 += 1;
            i += 1;
            v10 += 48;
        } while (i < a1->field_10);
    }
    v11 = sub_ef54(a0, &v2);
    sub_dd88(v2, v2->field_0 + v3 * 8, v2->field_8);
    return v11;
}
