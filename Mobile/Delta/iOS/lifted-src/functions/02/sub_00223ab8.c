/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x223ab8..0x223b90 (216 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_223ab8_1 {
    unsigned long long field_0;
    void* field_8;
    void* field_10;
    unsigned long long field_18;
    unsigned long long field_20[2];
    char field_28;
    char padding_29[7];
    unsigned int field_30;
    unsigned int field_34;
} st_223ab8_1;

typedef struct st_223ab8_0 {
    char field_0;
} st_223ab8_0;


st_223ab8_1 * sub_223ab8(st_223ab8_1 *a0, st_223ab8_1 *a1)
{
    void* v4;  // x21
    st_223ab8_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_223ab8_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (a1 == a0)
        return a0;
    v4 = a1->field_20;
    if (!a1->field_20[0])
    {
        sub_e11fc();
        return a0;
    }
    sub_d294c();
    *(int128_t *)&a0->field_8 = *(int128_t *)&a1->field_8;
    a0->field_0 = a1->field_0;
    a0->field_18 = a1->field_18;
    a0->field_20[0] = a1->field_20[0];
    a0->field_20[1] = a1->field_20[1];
    *(int *)&a0->field_28 = *(int *)&a1->field_28;
    *(int *)&a0->padding_29[3] = *(int *)&a1->padding_29[3];
    a1->field_8 = v4;
    a1->field_10 = v4;
    a1->field_18 = 0;
    *(uint128_t *)a1->field_20 = __double_as_longlong(0) * 0x10000000000000000;
    *(double *)&a1->field_28 = 1.6e-322;
    return a0;
}
