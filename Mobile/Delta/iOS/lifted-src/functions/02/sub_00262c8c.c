/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x262c8c..0x262d4c (192 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_262c8c_1 {
    char padding_0[259];
    char field_103;
    char padding_104[124];
    unsigned long long field_180;
    char padding_188[472];
    char field_360;
    char padding_361[543];
    unsigned long long field_580;
} st_262c8c_1;

typedef struct st_262c8c_4 {
    char padding_0[8];
    struct st_262c8c_3 *field_8;
} st_262c8c_4;

typedef struct st_262c8c_3 {
    char padding_0[24];
    unsigned long long field_18;
} st_262c8c_3;

typedef struct st_262c8c_0 {
    char field_0;
} st_262c8c_0;

typedef struct st_262c8c_2 {
    char padding_0[96];
    struct st_262c8c_1 *field_60;
} st_262c8c_2;

extern st_262c8c_2 *g_f0d198;

unsigned int sub_262c8c(st_262c8c_4 *a0)
{
    st_262c8c_1 *v4;  // x8
    st_262c8c_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_262c8c_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = g_f0d198->field_60;
    if (v4->field_103 >> 4 & 1)
        return 0xffffffff;
    if (!(v4->field_360 & 1) && *(long long *)&v4[1].padding_0[248] && v4->field_580 && *(long long *)(a0->field_8->field_18 + 48) == v4->field_580 && a0[5].padding_0 != *(long long *)&v4[1].padding_0[248])
    {
        sub_d5c30();
        v4 = g_f0d198->field_60;
    }
    return (((unsigned int)v4->field_180 * 32 | (unsigned int)(v4->field_180 >> 59)) & 0xffffffe1 & 1) - 1;
}
