/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x165944..0x165a10 (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_165944_1 {
    unsigned long long field_0;
    uint128_t field_8;
    uint128_t field_18;
    uint128_t field_28;
    char field_38[24];
    unsigned long long field_40[2];
    char field_48;
    char padding_49[7];
    char field_50;
    char field_51;
    char padding_52[2];
    unsigned int field_54;
    unsigned long long field_58;
    unsigned int field_60;
} st_165944_1;

typedef struct st_165944_0 {
    char field_0;
} st_165944_0;


st_165944_1 * sub_165944(st_165944_1 *a0, long long a1, unsigned int a2, long long a3, unsigned int a4)
{
    st_165944_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_165944_0 *v1;  // [bp-0x38]
    uint128_t v2;  // [bp-0x30], Other Possible Types: char
    uint128_t v3;  // [bp-0x30]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    a0->field_0 = 850045863;
    *(uint128_t *)&(&a0->field_0)[1] = 0;
    *(uint128_t *)((char *)&a0->field_8 + 8) = 0;
    *(uint128_t *)((char *)&a0->field_18 + 8) = 0;
    *(uint128_t *)((char *)&a0->field_28 + 8) = 0;
    *(unsigned long long *)&a0->field_38[8] = 0;
    a0->field_38[16] = 1;
    a0->field_38[0x11] = a2 != 0;
    *(unsigned int *)&a0->field_38[20] = 0;
    a0->field_40[0] = 0;
    *(unsigned int *)&a0->field_40[1] = a4;
    a0->field_40[0] = sub_91ed04(a3);
    sub_611d8(&v2, a1);
    v3 = *(int128_t *)&a0->field_38[0];
    *(uint128_t *)&a0->field_38[0] = v2;
    sub_611fc(&v3);
    return a0;
}
