/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x254e7c..0x254f08 (140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_254e7c_5 {
    char padding_0[8];
    struct st_254e7c_4 *field_8;
} st_254e7c_5;

typedef struct st_254e7c_4 {
    char padding_0[24];
    struct st_254e7c_3 *field_18;
} st_254e7c_4;

typedef struct st_254e7c_3 {
    char padding_0[48];
    unsigned long long field_30;
} st_254e7c_3;

typedef struct st_254e7c_0 {
    char field_0;
} st_254e7c_0;

typedef struct st_254e7c_1 {
    char padding_0[259];
    char field_103;
    char padding_104[1148];
    unsigned long long field_580;
} st_254e7c_1;

typedef struct st_254e7c_2 {
    char padding_0[96];
    struct st_254e7c_1 *field_60;
} st_254e7c_2;

extern st_254e7c_2 *g_f0d198;

unsigned int sub_254e7c(st_254e7c_5 *a0)
{
    st_254e7c_0 **v0;  // [bp-0x20], Other Possible Types: char
    st_254e7c_0 *v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (g_f0d198->field_60->field_103 >> 4 & 1)
    {
        return 0xffffffff;
    }
    else if (a0->field_8->field_18->field_30 != g_f0d198->field_60->field_580)
    {
        return 0xffffffff;
    }
    else if ((char)a0->padding_0[2] >= 0)
    {
        return 0xffffffff;
    }
    else
    {
        sub_d5c30();
        return 0xffffffff;
    }
}
