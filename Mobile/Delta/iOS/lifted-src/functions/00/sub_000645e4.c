/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x645e4..0x6467c (152 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_645e4_1 {
    char padding_0[16];
    char *field_10;
    char *field_18;
    char padding_20[88];
    unsigned long long field_78;
    char padding_80[264];
    char field_188;
} st_645e4_1;

typedef struct st_645e4_0 {
    char field_0;
} st_645e4_0;


unsigned long long sub_645e4(st_645e4_1 *a0, unsigned long long a1)
{
    char *v4;  // x8
    unsigned long long v5;  // 4112
    st_645e4_0 **v0;  // [bp-0x20], Other Possible Types: char
    st_645e4_0 *v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (!a0->field_78)
        return 0xffffffff;
    v4 = a0->field_18;
    if (v4 <= a0->field_10)
        return 0xffffffff;
    v5 = arm64g_calculate_condition(1, a1 & 0xffffffff, 1, 0);
    if (v5 & 1)
    {
        a0->field_18 = v4 - 1;
        return sub_6312c(0xffffffff);
    }
    if (!(a0->field_188 >> 4 & 1) && *(v4 - 1) != ((unsigned int)a1 & 0xff))
        return 0xffffffff;
    a0->field_18 = v4 - 1;
    *(v4 - 1) = a1;
    return a1;
}
