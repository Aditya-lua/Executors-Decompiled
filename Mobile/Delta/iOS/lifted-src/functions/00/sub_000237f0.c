/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x237f0..0x238d4 (228 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_237f0_2 {
    unsigned long long field_0;
    long long field_8;
} st_237f0_2;

typedef struct st_237f0_1 {
    char padding_0[128];
    unsigned int field_80;
    char padding_84[428];
    unsigned long long field_230;
    long long field_238;
} st_237f0_1;

typedef struct st_237f0_0 {
    char field_0;
} st_237f0_0;


unsigned long long sub_237f0(st_237f0_1 *a0, long long a1)
{
    unsigned long long v7;  // x0
    st_237f0_0 **v0;  // [bp-0x48], Other Possible Types: char
    st_237f0_0 *v1;  // [bp-0x40]
    st_237f0_2 *v2;  // [bp-0x38]
    long long v3;  // [bp-0x30]
    unsigned long long v4;  // [bp-0x28]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v1 = &v0;
    v0 = &v1;
    v2 = &a0->field_230;
    v3 = (long long)(a0->field_238 - a0->field_230) >> 3;
    v4 = 0;
    while (1)
    {
        while (a0->field_80 == 285)
        {
            sub_13dc0(a0, &v2, a1);
        }
        if (a0->field_80 != 284)
            break;
        sub_23628(a0, &v2);
    }
    v7 = sub_ef54(a0, &v2);
    sub_dd88(v2, v2->field_0 + v3 * 8, v2->field_8);
    return v7;
}
