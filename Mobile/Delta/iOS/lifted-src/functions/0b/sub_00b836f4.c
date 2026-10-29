/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb836f4..0xb837cc (216 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b836f4_2 {
    uint128_t field_0;
    unsigned long long field_10;
} st_b836f4_2;

typedef struct st_b836f4_0 {
    uint128_t field_0;
    uint128_t field_10;
    unsigned long long field_20;
} st_b836f4_0;

typedef struct st_b836f4_1 {
    uint128_t field_0;
    unsigned long long field_10;
    uint128_t field_18;
    unsigned long long field_28;
    struct st_b836f4_0 *field_30;
} st_b836f4_1;


double sub_b836f4(st_b836f4_1 *a0, st_b836f4_2 *a1, st_b836f4_2 *a2, st_b836f4_2 *a3)
{
    st_b836f4_0 *ptr;  // x0
    uint128_t v5;  // q0
    uint248_t v0;  // [bp-0x77]
    uint320_t v1;  // [bp-0x58]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    *(uint128_t *)((char *)&v0 + 7) = a3->field_0;
    *(unsigned long long *)((char *)&v0 + 23) = a3->field_10;
    *(unsigned long long *)&v1 = 1;
    *((char *)&v1 + 8) = 0;
    *(uint128_t *)((char *)&v1 + 9) = *(uint128_t *)&v0;
    *(uint128_t *)((char *)&v1 + 24) = *(uint128_t *)((void*)&v0 + 15);
    ptr = _malloc(40);
    if (ptr)
    {
        ptr->field_0 = *(uint128_t *)&v1;
        ptr->field_10 = *(uint128_t *)((void*)&v1 + 16);
        ptr->field_20 = *(unsigned long long *)((void*)&v1 + 32);
        a0->field_0 = a1->field_0;
        a0->field_10 = a1->field_10;
        v5 = a2->field_0;
        *(uint128_t *)&(&a0->field_10)[1] = v5;
        *(unsigned long long *)((char *)&a0->field_18 + 8) = a2->field_10;
        a0->field_28 = ptr;
        return (unsigned long long)v5;
    }
    sub_c6ba70(8, 40);
    __debugbreak();
}
