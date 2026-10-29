/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1ff12c..0x1ff200 (212 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1ff12c_2 {
    struct st_1ff12c_1 *field_0;
    char padding_8[4];
    unsigned int field_c;
} st_1ff12c_2;

typedef struct st_1ff12c_4 {
    struct st_1ff12c_0 *field_0;
    struct st_1ff12c_5 *field_8;
    struct st_1ff12c_6 *field_10;
} st_1ff12c_4;

typedef struct st_1ff12c_6 {
    unsigned int field_0;
} st_1ff12c_6;

typedef struct st_1ff12c_1 {
    char field_0;
    char padding_1[1];
    char field_2;
    char field_3;
} st_1ff12c_1;

typedef struct st_1ff12c_5 {
    struct st_1ff12c_3 *field_0;
} st_1ff12c_5;

typedef struct st_1ff12c_3 {
    char padding_0[88];
    struct st_1ff12c_2 *field_58;
} st_1ff12c_3;

typedef struct st_1ff12c_0 {
    char field_0;
} st_1ff12c_0;

typedef struct st_1ff12c_8 {
    unsigned long long field_0;
} st_1ff12c_8;

typedef struct st_1ff12c_7 {
    char padding_0[192];
    struct st_1ff12c_8 *field_c0;
} st_1ff12c_7;

extern st_1ff12c_7 *g_f0d3d8;

char sub_1ff12c(st_1ff12c_4 *a0, st_1ff12c_1 *a1)
{
    unsigned int v4;  // w8
    st_1ff12c_3 *v5;  // x9
    st_1ff12c_0 **v0;  // [bp-0x20], Other Possible Types: char
    st_1ff12c_0 *v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = a1->field_0;
    if ((v4 & 254) == 8)
    {
        if (v4 == 8 && a1->field_3 == 1 && a1->field_2 < 0)
            return 0;
    }
    else
    {
        if (v4 != 7)
        {
            return 0;
        }
        else if (!(*(char *)a0->field_0 & 1))
        {
            return 0;
        }
    }
    *(st_1ff12c_1 **)*(long long *)(*(long long *)a0->field_8 + 88) = a1;
    v5 = *(long long *)a0->field_8;
    v5->field_58->field_c = v4;
    v5->field_58 = v5->field_58 + 1;
    *(int *)a0->field_10 = *(int *)a0->field_10 + 1;
    g_f0d3d8->field_c0();
}
