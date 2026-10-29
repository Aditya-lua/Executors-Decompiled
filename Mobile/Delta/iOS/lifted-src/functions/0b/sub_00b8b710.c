/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb8b710..0xb8b79c (140 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b8b710_0 {
    uint128_t field_0;
    unsigned long long field_10;
} st_b8b710_0;

typedef struct st_b8b710_1 {
    uint128_t field_0;
    unsigned long long field_10;
    struct st_b8b710_2 *field_18;
} st_b8b710_1;

typedef struct st_b8b710_2 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
} st_b8b710_2;


double sub_b8b710(st_b8b710_1 *a0, uint128_t *a1, st_b8b710_0 *a2)
{
    uint128_t *ptr;  // x0
    uint128_t v3;  // q1
    uint128_t v4;  // q1
    uint128_t v5;  // q0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    ptr = _malloc(64);
    if (ptr)
    {
        v3 = a1[1];
        *ptr = *a1;
        ptr[1] = v3;
        v4 = a1[3];
        ptr[2] = a1[2];
        ptr[3] = v4;
        v5 = a2->field_0;
        a0->field_0 = v5;
        a0->field_10 = a2->field_10;
        a0->field_18 = ptr;
        return (unsigned long long)v5;
    }
    sub_c6ba70(8, 64);
    __debugbreak();
}
