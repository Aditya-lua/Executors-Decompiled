/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb489c8..0xb48b8c (452 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b489c8_1 {
    uint128_t field_0;
} st_b489c8_1;

typedef struct st_b489c8_0 {
    char padding_0[16];
    long long field_10;
    char padding_18[16];
    struct st_b489c8_1 *field_28;
    char padding_30[52];
    uint128_t field_64;
    char padding_74[4];
    struct st_b489c8_1 *field_78;
    uint128_t field_80;
    uint128_t field_90;
    uint128_t field_a0;
} st_b489c8_0;

typedef struct st_b489c8_2 {
    uint128_t field_0;
    char padding_10[4];
    struct st_b489c8_1 *field_14;
    uint128_t field_1c;
    uint128_t field_2c;
    uint128_t field_3c;
} st_b489c8_2;


uint128_t * sub_b489c8(st_b489c8_0 *a0, uint128_t *a1, uint128_t *a2)
{
    uint128_t *n;  // x21
    uint128_t *iter;  // x20
    uint128_t v15;  // q3
    uint128_t *v16;  // x1
    uint128_t *v17;  // x8
    uint128_t *v18;  // x22
    uint128_t v19;  // q0
    uint128_t v20;  // q2
    uint128_t *v22;  // w8
    unsigned long v23;  // cc_op
    unsigned long v24;  // cc_dep1
    uint128_t *v7;  // x8
    unsigned long v25;  // cc_dep2
    unsigned long v26;  // cc_ndep
    unsigned long long v27;  // 4112
    unsigned long long v28;  // 4102
    unsigned long long v29;  // 4112
    unsigned long long v30;  // 4102
    uint128_t *n1;  // x22
    st_b489c8_2 *v10;  // x21
    uint128_t v11;  // q0
    uint128_t *v12;  // x8
    uint128_t *v13;  // w21
    uint128_t v14;  // q1
    uint128_t v0;  // [bp-0x60]
    uint128_t *v1;  // [bp-0x48]
    uint128_t *v2;  // [bp-0x44]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    if (!a1)
        return 1;
    n = a2;
    if (!a2)
        return 1;
    iter = a1;
    v7 = *(long long *)((char *)&a0->field_64 + 8);
    if (v7)
    {
        n1 = -0x1 * v7 + 16;
        if (n >= n1)
        {
            v10 = (a0->padding_30)[1];
            _memcpy(v10 + v7, iter, n1);
            v11 = *(int128_t *)&(a0->padding_30)[1];
            v12 = a0->field_28;
            if (v12 == 16)
            {
                v13 = (uint128_t *)32;
            }
            else
            {
                v14 = v10->field_0;
                v13 = (uint128_t *)48;
            }
            v15 = a0->field_80;
            v16 = a0->padding_74;
            v1 = (uint128_t *)16;
            *v16 = v11 ^ *(int128_t *)a0->padding_74;
            v16[1] = v11 ^ v15;
            if (v12 != 16)
                a0->field_90 = v14 ^ a0->field_90;
            if (!sub_a4c6a0(a0->field_10))
            {
                return 0;
            }
            else if (v1 == v13)
            {
                *(unsigned long long *)((char *)&a0->field_64 + 8) = 0;
                iter += n1;
                n -= n1;
            }
            else
            {
                return 0;
            }
        }
    }
    if (n >= 16)
    {
        do
        {
            v17 = a0->field_28;
            if (v17 == 16)
            {
                v18 = 32;
            }
            else
            {
                v0 = *iter;
                v18 = 48;
            }
            v19 = *iter;
            v2 = (uint128_t *)16;
            v20 = a0->field_80;
            *(uint128_t *)a0->padding_74 = v19 ^ *(int128_t *)a0->padding_74;
            a0->field_80 = v19 ^ v20;
            if (v17 != 16)
                a0->field_90 = v0 ^ a0->field_90;
            v22 = v2;
            if (sub_a4c6a0(a0->field_10, a0->padding_74, &v2, a0->padding_74, v18))
            {
                v27 = arm64g_calculate_condition(v23 | 16, v24, v25, v26);
                v28 = arm64g_calculate_condition(19, (v27 & 1 ? (unsigned long long)v22 : 0), (v27 & 1 ? v18 & 0xffffffff : 0), 0);
                if (v28 & 1)
                    return 0;
            }
            else
            {
                v29 = arm64g_calculate_condition(v23 | 16, v24, v25, v26);
                v30 = arm64g_calculate_condition(16, (v29 & 1 ? (unsigned long long)v22 : 0), (v29 & 1 ? v18 & 0xffffffff : 0), 0);
                if (v30 & 1)
                    return 0;
            }
            iter += 1;
            n = (char *)n - 16;
        } while (15 < n);
    }
    if (!n)
        return 1;
    _memcpy(&a0->padding_0[*(long long *)((char *)&a0->field_64 + 8) + 100], iter, n);
    *(uint128_t **)((char *)&a0->field_64 + 8) = *(long long *)((char *)&a0->field_64 + 8) + (char *)n;
    return 1;
}
