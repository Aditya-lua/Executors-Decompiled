/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1ecec4..0x1ecfcc (264 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1ecec4_1 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned int field_18;
    char padding_1c[4];
    char field_20;
    char padding_21[199];
    unsigned long long field_e8;
    unsigned long long field_f0;
} st_1ecec4_1;

typedef struct st_1ecec4_0 {
    char field_0;
} st_1ecec4_0;


long long sub_1ecec4(st_1ecec4_1 *a0, st_1ecec4_1 *a1)
{
    unsigned long v6;  // x9
    long long v7;  // x0
    unsigned long v8;  // x9
    st_1ecec4_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_1ecec4_0 *v1;  // [bp-0x38]
    st_1ecec4_0 **v2;  // [bp-0x30], Other Possible Types: char
    st_1ecec4_0 *v3;  // [bp-0x28]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    if (a1->field_f0 != a1->field_e8)
    {
        v6 = a0->field_f0;
        if (v6 != a0->field_e8)
        {
            if (a0->field_0 != a1->field_0)
            {
                return 0;
            }
            else if (a0->field_8 != a1->field_8)
            {
                return 0;
            }
            else if (a0->field_10 != a1->field_10)
            {
                return 0;
            }
            else if (a0->field_18 == a1->field_18)
            {
                v7 = sub_1f8448(&a0->field_20, 0);
                v3 = &v2;
                v2 = &v3;
                return !sub_1f0ccc(v7, sub_1f8448(&a1->field_20, 0));
            }
            else
            {
                return 0;
            }
        }
        v8 = v6;
    }
    else
    {
        v8 = a0->field_e8;
        v6 = a0->field_f0;
    }
    return v6 - v8 == a1->field_f0 - a1->field_e8;
}
