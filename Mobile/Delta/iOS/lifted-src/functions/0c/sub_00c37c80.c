/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc37c80..0xc37df8 (376 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c37c80_2 {
    unsigned long long field_0;
    struct st_c37c80_1 *field_8;
    struct st_c37c80_1 *field_10;
} st_c37c80_2;

typedef struct st_c37c80_0 {
    unsigned long long field_0;
    struct st_c37c80_1 *field_8;
    long long field_10;
} st_c37c80_0;

typedef struct st_c37c80_1 {
    uint128_t field_0;
    uint128_t field_10;
    uint128_t field_20;
    uint128_t field_30;
} st_c37c80_1;


long long sub_c37c80(st_c37c80_2 *a0, st_c37c80_0 *a1)
{
    uint128_t *v7;  // x23
    unsigned long long v8;  // x9
    unsigned long long v9;  // 4166
    long long v10;  // x22
    uint128_t *ptr;  // x0
    uint128_t *v12;  // x21
    uint128_t *ptr1;  // x0
    uint128_t *v14;  // x23
    uint128_t *v0;  // [bp-0x88]
    uint128_t v1;  // [bp-0x80]
    uint128_t v2;  // [bp-0x70]
    uint128_t v3;  // [bp-0x60]
    uint128_t v4;  // [bp-0x50]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v7 = &a1->field_8->field_0;
    v8 = a1->field_0 ^ 0x8000000000000000;
    v9 = arm64g_calculate_condition(0x44, a1->field_0, 0, 0);
    if (!(v9 & 1))
        v8 = 1;
    if (v8 == 2)
    {
        v10 = a1->field_10;
        ptr = _malloc(64);
        if (!ptr)
        {
            a1 = 64;
            a0 = sub_c6ba70(8, 64);
LABEL_c37d94:
            sub_c769bc(a0, a1);
            sub_c6ba70(8, 64);
            __debugbreak();
        }
        v12 = ptr;
        sub_c370dc(&v1, v7);
        *v12 = v1;
        v12[1] = v2;
        v12[2] = v3;
        v12[3] = v4;
        v0 = v12;
        ptr1 = _malloc(64);
        if (!ptr1)
        {
            sub_c6ba70(8, 64);
            __debugbreak();
        }
        v14 = ptr1;
        sub_c370dc(&v1, v10);
        *v14 = v1;
        v14[1] = v2;
        v14[2] = v3;
        v14[3] = v4;
        a0->field_8 = v0;
        a0->field_10 = v14;
        a0->field_0 = 9223372036854775810;
    }
    else if (v8 == 1)
    {
        sub_b9ea80(a0, v7, a1->field_10);
    }
    else
    {
        do
        {
            /* unsupported instruction */;
            /* unsupported instruction */;
        } while (/* unsupported instruction */ ^ 1);
        if ((long long)/* unsupported instruction */ < 0)
            goto LABEL_c37d94;
        a0->field_0 = 0x8000000000000000;
        a0->field_8 = v7;
    }
    return sub_c370dc(a0 + 1, a1 + 1);
}
