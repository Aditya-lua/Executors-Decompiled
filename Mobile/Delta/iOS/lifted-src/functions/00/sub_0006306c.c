/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x6306c..0x63114 (168 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_6306c_1 {
    char padding_0[16];
    char *field_10;
    char *field_18;
    unsigned long long field_20;
    char padding_28[8];
    unsigned long long field_30;
    char padding_38[32];
    unsigned long long field_58;
    char field_60;
} st_6306c_1;

typedef struct st_6306c_0 {
    char field_0;
} st_6306c_0;


unsigned long long sub_6306c(st_6306c_1 *a0, unsigned long long a1)
{
    unsigned long v4;  // x8
    unsigned long v5;  // x9
    char *v6;  // x9
    unsigned long long v7;  // 4112
    st_6306c_0 **v0;  // [bp-0x20], Other Possible Types: char
    st_6306c_0 *v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = a0->field_58;
    v5 = a0->field_30;
    if (v5 > v4)
    {
        a0->field_58 = v5;
        v4 = v5;
    }
    v6 = a0->field_18;
    if (v6 <= a0->field_10)
        return 0xffffffff;
    v7 = arm64g_calculate_condition(1, a1 & 0xffffffff, 1, 0);
    if (v7 & 1)
    {
        a0->field_18 = v6 - 1;
        a0->field_20 = v4;
        return sub_6312c(0xffffffff);
    }
    if (!(a0->field_60 >> 4 & 1) && *(v6 - 1) != ((unsigned int)a1 & 0xff))
        return 0xffffffff;
    a0->field_18 = v6 - 1;
    a0->field_20 = v4;
    *(v6 - 1) = a1;
    return a1;
}
