/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2aa6a8..0x2aa758 (176 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2aa6a8_1 {
    char padding_0[20];
    unsigned int field_14;
    char field_18;
    char padding_19[7];
    unsigned long long field_20[2];
    char field_28;
    char padding_29[7];
    unsigned long long field_30;
} st_2aa6a8_1;

typedef struct st_2aa6a8_0 {
    char field_0;
} st_2aa6a8_0;


long long sub_2aa6a8(st_2aa6a8_1 *a0)
{
    unsigned long v5;  // x0
    unsigned long long v6;  // 4122
    unsigned long long v7;  // 4117
    unsigned long v8;  // x0
    unsigned long long v9;  // x8
    st_2aa6a8_0 **v0;  // [bp-0x38], Other Possible Types: char
    st_2aa6a8_0 *v1;  // [bp-0x30]
    char v2;  // [bp-0x21]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v0 = &v1;
    *(__m128i *)a0->field_20 = _mm_add_epi64(a0->field_20, _mm_set1_epi64x(1));
    if (a0->field_18 == 1)
    {
        a0->field_18 = 0;
        v5 = a0->field_14;
        v6 = arm64g_calculate_condition(0x11, v5 & 0xffffffff, 1, 0);
        if (!(v6 & 1))
            return v5;
    }
    else
    {
        v5 = sub_2a74f8(a0);
        a0->field_14 = v5;
        v7 = arm64g_calculate_condition(1, v5 & 0xffffffff, 1, 0);
        if (v7 & 1)
            return v5;
    }
    v2 = v5;
    sub_30594(&a0->field_30, &v2);
    v8 = a0->field_14;
    if ((unsigned int)v8 == 10)
    {
        v9 = *(long long *)&a0->field_28;
        a0->field_20[1] = 0;
        *(unsigned long long *)&a0->field_28 = v9 + 1;
        return v8;
    }
    return v8;
}
