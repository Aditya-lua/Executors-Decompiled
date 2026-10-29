/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1aec04..0x1aec78 (116 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1aec04_2 {
    char padding_0[8];
    unsigned long long field_8;
    char field_10;
} st_1aec04_2;

typedef struct st_1aec04_1 {
    unsigned int field_0;
    char padding_4[12];
    struct st_1aec04_0 *field_10;
    struct st_1aec04_0 *field_18;
    char padding_20[48];
    unsigned long long field_50;
    char field_58;
} st_1aec04_1;

typedef struct st_1aec04_0 {
    char field_0;
} st_1aec04_0;


st_1aec04_2 * sub_1aec04(st_1aec04_2 *a0, st_1aec04_1 *a1)
{
    unsigned int v2;  // w9
    unsigned long v3;  // cc_dep1
    unsigned int v4;  // w8
    unsigned long long v5;  // 4112
    unsigned long long v6;  // 4102
    unsigned long long v7;  // 4112
    unsigned long long v8;  // 4102
    st_1aec04_0 **v0;  // [bp-0x10], Other Possible Types: char
    st_1aec04_0 *v1;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    if (a1->field_10 == a1->field_18 && !(a1->field_58 >> 1 & 1))
    {
        a1->field_0 = 0xfffffc1e;
        a1->field_50 = a0->field_8;
        return a0;
    }
    v2 = a0->field_10;
    v3 = v2 & 0xff;
    if (v2 == 1)
    {
        v4 = *(char *)a1->field_10;
        if (v4 != 13)
        {
            v5 = arm64g_calculate_condition(19, v3, 1, 0);
            v6 = arm64g_calculate_condition(19, (v5 & 1 ? v4 & 0xff : 0x40000000), (v5 & 1 ? 10 : 0), 0);
            if (!(v6 & 1))
            {
                a1->field_0 = 0xfffffc1e;
                a1->field_50 = a0->field_8;
                return a0;
            }
        }
        else
        {
            v7 = arm64g_calculate_condition(19, v3, 1, 0);
            v8 = arm64g_calculate_condition(16, (v7 & 1 ? v4 & 0xff : 0x40000000), (v7 & 1 ? 10 : 0), 0);
            if (!(v8 & 1))
            {
                a1->field_0 = 0xfffffc1e;
                a1->field_50 = a0->field_8;
                return a0;
            }
        }
    }
    a1->field_0 = 0xfffffc1f;
    a1->field_50 = 0;
    return a0;
}
