/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x137a6c..0x137b50 (228 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_137a6c_4 {
    struct st_137a6c_3 *field_0;
    char padding_8[4];
    unsigned int field_c;
} st_137a6c_4;

typedef struct st_137a6c_6 {
    struct st_137a6c_7 *field_0;
    struct st_137a6c_7 *field_8;
    struct st_137a6c_8 *field_10;
} st_137a6c_6;

typedef struct st_137a6c_3 {
    char field_0;
    char padding_1[2];
    char field_3;
    char padding_4[20];
    struct st_137a6c_1 *field_18;
} st_137a6c_3;

typedef struct st_137a6c_8 {
    unsigned int field_0;
} st_137a6c_8;

typedef struct st_137a6c_1 {
    char padding_0[64];
    struct st_137a6c_2 *field_40;
} st_137a6c_1;

typedef struct st_137a6c_2 {
    unsigned long long field_0;
} st_137a6c_2;

typedef struct st_137a6c_7 {
    struct st_137a6c_1 *field_0;
} st_137a6c_7;

typedef struct st_137a6c_5 {
    char padding_0[88];
    struct st_137a6c_4 *field_58;
} st_137a6c_5;

typedef struct st_137a6c_0 {
    char field_0;
} st_137a6c_0;

typedef struct st_137a6c_9 {
    char padding_0[192];
    struct st_137a6c_2 *field_c0;
} st_137a6c_9;

extern st_137a6c_9 *g_f0d3d8;

char sub_137a6c(st_137a6c_6 *a0, st_137a6c_3 *a1)
{
    st_137a6c_1 *v6;  // x8
    st_137a6c_5 *v7;  // x8
    st_137a6c_4 *v8;  // x9
    st_137a6c_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_137a6c_0 *v1;  // [bp-0x28]
    st_137a6c_0 **v2;  // [bp-0x20], Other Possible Types: char
    st_137a6c_0 *v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    if (a1->field_0 != 8)
    {
        return 0;
    }
    else if (!(a1->field_3 & 1))
    {
        v3 = &v2;
        v2 = &v3;
        v6 = a1->field_18;
        if (v6->field_40 && (*(long long *)v6->field_40 & 15) == 11 && (char)v6->padding_0[2] >= 0)
            return 0;
        if (v6 != *(long long *)a0->field_0)
            return 0;
        v7 = *(long long *)a0->field_8;
        v8 = v7->field_58;
        v8->field_0 = a1;
        v8->field_c = 8;
        v7->field_58 = v7->field_58 + 1;
        *(int *)a0->field_10 = *(int *)a0->field_10 + 1;
        g_f0d3d8->field_c0();
    }
    else
    {
        return 0;
    }
}
