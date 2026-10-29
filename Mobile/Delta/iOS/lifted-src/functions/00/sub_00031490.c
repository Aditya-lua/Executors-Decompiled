/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x31490..0x31514 (132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_31490_2 {
    uint128_t field_0;
    uint128_t field_10;
    unsigned long long field_20;
} st_31490_2;

typedef struct st_31490_1 {
    long long field_0;
    long long field_8;
    char padding_10[8];
    uint128_t field_18;
    uint128_t field_28;
    unsigned long long field_38;
} st_31490_1;

typedef struct st_31490_0 {
    char field_0;
} st_31490_0;


st_31490_1 * sub_31490(st_31490_1 *ptr, st_31490_2 *a1, long long a2)
{
    unsigned long long v4;  // x8
    uint128_t v5;  // q0
    long long v6;  // x0
    st_31490_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_31490_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    memset(ptr, 0, 24);
    v4 = a1->field_20;
    v5 = a1->field_10;
    *(uint128_t *)(ptr->padding_10)[1] = a1->field_0;
    *(uint128_t *)((char *)&ptr->field_18 + 8) = v5;
    *(unsigned long long *)((char *)&ptr->field_28 + 8) = v4;
    if (!a2)
        return ptr;
    v6 = operatornew(a2 * 48);
    ptr->field_0 = v6;
    ptr->field_8 = a2;
    sub_319f8(v6, a2, a1);
    return ptr;
}
