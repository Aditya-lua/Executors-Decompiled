/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1fb6dc..0x1fb7dc (256 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1fb6dc_1 {
    char padding_0[24];
    uint128_t field_18;
    uint128_t field_28;
    uint128_t field_38;
    uint128_t field_48;
    uint128_t field_58;
    uint128_t field_68;
} st_1fb6dc_1;

typedef struct st_1fb6dc_2 {
    char padding_0[8];
    unsigned long long field_8;
    char padding_10[8];
    unsigned long long field_18;
    char padding_20[16];
    struct st_1fb6dc_1 *field_30;
    char padding_38[16];
    char field_48;
    char padding_49[23];
    char field_60;
    char padding_61[71];
    unsigned long long field_a8;
} st_1fb6dc_2;

typedef struct st_1fb6dc_0 {
    char field_0;
} st_1fb6dc_0;


unsigned long long sub_1fb6dc(st_1fb6dc_2 *a0, unsigned int a1, unsigned int a2, unsigned int a3)
{
    unsigned long long v4;  // x0
    unsigned long v5;  // x20
    uint128_t v14;  // q1
    uint128_t v15;  // q2
    unsigned long long i;  // x14
    unsigned long long v17;  // x14
    unsigned long long *node;  // x9
    unsigned long long j;  // x10
    unsigned long long v21;  // x10
    st_1fb6dc_1 *v6;  // x9
    unsigned long long v7;  // x8
    unsigned long long v8;  // x10
    unsigned long long v9;  // x11
    unsigned long long v10;  // x12
    uint128_t v11;  // q2
    uint128_t v12;  // q0
    uint128_t *iter;  // x13
    st_1fb6dc_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_1fb6dc_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    sub_1f8994(&a0->field_48, a2);
    v4 = sub_1f9da4(&a0->field_60, a3);
    if (a1 < 2)
    {
        a0->field_18 = 0;
        a0->field_8 = 0;
        return v4;
    }
    v5 = a1;
    v4 = sub_1f9f64(&a0->field_30, v5);
    v6 = a0->field_30;
    v7 = a0->field_a8;
    if (5 > a1)
    {
        v8 = 1;
    }
    else
    {
        v9 = v5 - 1;
        v10 = v9 & 0xfffffffffffffffc;
        v8 = v10 | 1;
        v11 = __double_as_longlong(__longlong_as_double(v7));
        v12 = _INSERT(v11, 8, *(unsigned long long *)&*(unsigned long long *)(void*)&v11);
        iter = (char *)&v6->field_38 + 8;
        v14 = *(unsigned long long *)&*(unsigned long long *)(void*)&v11 * 0x10000000000000000;
        v15 = *(unsigned long long *)&v11;
        i = v10;
        do
        {
            v17 = i;
            *(uint128_t *)((char *)iter - 48) = v12;
            *(uint128_t *)((char *)iter - 32) = v14;
            *(uint128_t *)((char *)iter - 16) = v15;
            *iter = v12;
            iter[1] = v14;
            iter[2] = v15;
            iter += 6;
            i = v17 - 4;
        } while (i);
        if (v9 == v10)
        {
            a0->field_18 = 0;
            a0->field_8 = 0;
            return v4;
        }
    }
    node = &(v6->padding_0)[v8 + 16];
    j = v5 - v8;
    do
    {
        v21 = j;
        *(unsigned long long *)((char *)node - 16) = v7;
        *(unsigned long long *)((char *)node - 8) = v7;
        *node = 0;
        node += 3;
        j = v21 - 1;
    } while (j);
    a0->field_18 = 0;
    a0->field_8 = 0;
    return v4;
}
