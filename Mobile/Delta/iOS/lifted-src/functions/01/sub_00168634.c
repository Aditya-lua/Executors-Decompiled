/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x168634..0x1686b0 (124 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_168634_1 {
    char padding_0[24];
    unsigned int field_18;
} st_168634_1;

typedef struct st_168634_0 {
    char field_0;
} st_168634_0;

typedef struct st_168634_3 {
    unsigned long long field_0;
} st_168634_3;

typedef struct st_168634_2 {
    struct st_168634_3 *field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_168634_2;

extern st_168634_2 g_e6f648;

void sub_168634(st_168634_1 *a0)
{
    unsigned long long v6;  // 4106
    unsigned long long v7;  // x0
    st_168634_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_168634_0 *v1;  // [bp-0x38]
    st_168634_0 **v2;  // [bp-0x30], Other Possible Types: char
    st_168634_0 *v3;  // [bp-0x28]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    v3 = &v2;
    v2 = &v3;
    v6 = arm64g_calculate_condition(2, sub_167278(), 1, 0);
    if (v6 & 1)
    {
        a0->field_18 = 0xffffffff;
        return;
    }
    v7 = sub_167278(a0);
    (&g_e6f648.field_0)[v7]();
}
