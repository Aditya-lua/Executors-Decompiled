/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1c3db0..0x1c3e08 (88 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1c3db0_1 {
    unsigned int field_0;
    char padding_4[4];
    unsigned long long field_8;
} st_1c3db0_1;

typedef struct st_1c3db0_0 {
    char field_0;
} st_1c3db0_0;


long long sub_1c3db0(long long a0, st_1c3db0_1 *a1, unsigned long a2)
{
    unsigned long long v4;  // 4158
    long long v5;  // x0
    st_1c3db0_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_1c3db0_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = arm64g_calculate_condition(1, a1->field_0, 1, 0);
    if (v4 & 1)
    {
        return a0;
    }
    else if (a1->field_8)
    {
        v5 = sub_1aec78(a0 + 920);
        a1->field_8 = 0;
        return v5;
    }
    else
    {
        return a0;
    }
}
