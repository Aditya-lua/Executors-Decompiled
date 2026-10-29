/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb955f0..0xb956bc (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b955f0_2 {
    uint128_t field_0;
    unsigned long long field_10;
} st_b955f0_2;

typedef struct st_b955f0_0 {
    uint128_t field_0;
    uint128_t field_10;
    unsigned long long field_20;
} st_b955f0_0;

typedef struct st_b955f0_1 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
    struct st_b955f0_0 *field_40;
} st_b955f0_1;


double sub_b955f0(st_b955f0_1 *a0, uint128_t *a1, st_b955f0_2 *a2)
{
    st_b955f0_0 *ptr;  // x0
    uint128_t v9;  // q1
    uint128_t v10;  // q0
    uint128_t v11;  // q1
    uint128_t v0;  // [bp-0xb0]
    uint128_t v1;  // [bp-0xa0]
    uint128_t v2;  // [bp-0x90]
    uint128_t v3;  // [bp-0x80]
    uint248_t v4;  // [bp-0x67]
    uint320_t v5;  // [bp-0x48]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v0 = *a1;
    v1 = a1[1];
    v2 = a1[2];
    v3 = a1[3];
    *(uint128_t *)((char *)&v4 + 7) = a2->field_0;
    *(unsigned long long *)((char *)&v4 + 23) = a2->field_10;
    *(unsigned long long *)&v5 = 1;
    *((char *)&v5 + 8) = 0;
    *(uint128_t *)((char *)&v5 + 9) = *(uint128_t *)&v4;
    *(uint128_t *)((char *)&v5 + 24) = *(uint128_t *)((void*)&v4 + 15);
    ptr = _malloc(40);
    if (ptr)
    {
        ptr->field_0 = *(uint128_t *)&v5;
        ptr->field_10 = *(uint128_t *)((void*)&v5 + 16);
        ptr->field_20 = *(unsigned long long *)((void*)&v5 + 32);
        v9 = a1[1];
        a0->field_0 = *a1;
        a0->field_10 = v9;
        v10 = a1[2];
        v11 = a1[3];
        a0->field_20 = v10;
        a0->field_30 = v11;
        a0->field_40 = ptr;
        return *(unsigned long long *)&v10;
    }
    sub_c6ba70(8, 40);
    __debugbreak();
}
