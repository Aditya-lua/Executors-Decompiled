/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbcbf10..0xbcc024 (276 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bcbf10_0 {
    char padding_0[16];
    struct st_bcbf10_1 *field_10;
    char field_18;
    char padding_19[23];
    long long field_30;
} st_bcbf10_0;

typedef struct st_bcbf10_1 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
} st_bcbf10_1;

typedef struct st_bcbf10_2 {
    struct st_bcbf10_1 *field_0;
    struct st_bcbf10_1 *field_8;
    struct st_bcbf10_1 *field_10;
    uint128_t field_18;
    unsigned long long field_28;
    struct st_bcbf10_1 *field_30;
} st_bcbf10_2;


double sub_bcbf10(st_bcbf10_2 *a0, st_bcbf10_0 *a1)
{
    uint128_t *ptr;  // x0
    uint128_t *v8;  // x20
    uint128_t *v9;  // x22
    uint128_t *ptr1;  // x0
    uint128_t *v11;  // x23
    uint128_t *v0;  // [bp-0x88]
    uint128_t v1;  // [bp-0x80]
    uint128_t v2;  // [bp-0x70]
    uint128_t v3;  // [bp-0x60]
    uint128_t v4;  // [bp-0x50]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    ptr = _malloc(64);
    if (ptr)
    {
        v8 = ptr;
        sub_bcb990(&v1, a1->field_30);
        *v8 = v1;
        v8[1] = v2;
        v8[2] = v3;
        v8[3] = v4;
        v0 = v8;
        v9 = &a1->field_10->field_0;
        if (v9)
        {
            ptr1 = _malloc(v9);
            if (!ptr1)
            {
                sub_c6b970(1, v9);
                __debugbreak();
            }
            v11 = ptr1;
            _memcpy();
        }
        else
        {
            v11 = 1;
        }
        sub_b9e1f8(&v1, &a1->field_18);
        a0->field_0 = v9;
        a0->field_8 = v11;
        a0->field_10 = v9;
        *(uint128_t *)&(&a0->field_10)[1] = v1;
        *(unsigned long long *)((char *)&a0->field_18 + 8) = *(unsigned long long *)&v2;
        a0->field_28 = v0;
        return *(unsigned long long *)&v1;
    }
    sub_c6ba70(8, 64);
    sub_c6b970(1, v9);
    __debugbreak();
}
