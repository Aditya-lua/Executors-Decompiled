/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1ecfcc..0x1ed0ac (224 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1ecfcc_1 {
    long long field_0;
    unsigned long long field_8;
} st_1ecfcc_1;

typedef struct st_1ecfcc_0 {
    char field_0;
} st_1ecfcc_0;


unsigned long long * sub_1ecfcc(unsigned long long *a0, unsigned long a1, unsigned long long a2, st_1ecfcc_1 *a3)
{
    unsigned long long v4;  // x9
    unsigned long long v5;  // 4102
    unsigned long long v6;  // x8
    unsigned long long v7;  // x10
    unsigned long long v8;  // x8
    st_1ecfcc_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_1ecfcc_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    v4 = a3->field_8;
    if (v4 > a2)
    {
        sub_1f2e20(a0, a2 + a1, v4 - a2);
    }
    else
    {
        v5 = arm64g_calculate_condition(36, v4, a2, 0);
        if (v5 & 1)
            goto LABEL_1ed074;
        v6 = a0[1];
        v7 = a2 + a1;
        if (v6 != v7)
        {
            v8 = *a0 + 40 * a1;
            _memmove(v8 + 40 * v4, v8 + 40 * a2, (v6 - v7) * 40);
            v4 = a3->field_8;
            v6 = a0[1];
        }
        a0[1] = v4 - a2 + v6;
    }
    v4 = a3->field_8;
LABEL_1ed074:
    if (v4)
        _memmove(*a0 + 40 * a1, a3->field_0, v4 * 40);
    return a0;
}
