/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2aa0a8..0x2aa110 (104 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2aa0a8_1 {
    char padding_0[80];
    char field_50;
    char padding_51[55];
    unsigned int field_88;
    char padding_8c[4];
    unsigned long long field_90;
} st_2aa0a8_1;

typedef struct st_2aa0a8_0 {
    char padding_0[56];
    unsigned int field_38;
    char padding_3c[4];
    unsigned long long field_40;
} st_2aa0a8_0;

typedef struct st_2aa0a8_2 {
    char field_0;
} st_2aa0a8_2;


st_2aa0a8_0 * sub_2aa0a8(st_2aa0a8_1 *a0)
{
    unsigned long long v4;  // 4110
    st_2aa0a8_1 *v5;  // x0
    st_2aa0a8_2 **v0;  // [bp-0x30], Other Possible Types: char
    st_2aa0a8_2 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a0->field_88 != 46)
    {
        v4 = arm64g_calculate_condition(2, a0->field_90, 1, 0);
        if (!(v4 & 1))
        {
            v5 = a0;
            *(char *)sub_9c78(&a0->field_50) = 46;
            a0 = v5;
        }
    }
    return &a0->field_50;
}
