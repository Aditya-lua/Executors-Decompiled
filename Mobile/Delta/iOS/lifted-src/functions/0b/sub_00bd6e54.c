/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbd6e54..0xbd7114 (704 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_bd6e54_0 {
    void* field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
} st_bd6e54_0;


void sub_bd6e54(st_bd6e54_0 *a0, unsigned long a1, unsigned long long *a2)
{
    unsigned long v5;  // x23
    unsigned long v6;  // x2
    uint128_t v15;  // q0
    uint128_t v16;  // q1
    unsigned long long i;  // x13
    unsigned long long v18;  // x13
    __m128i v19;  // q3
    __m128i v20;  // q5
    unsigned long long *node;  // x9
    unsigned long long v23;  // x8
    unsigned long long v7;  // 4164
    unsigned long long v25;  // x22
    unsigned long v26;  // x22
    unsigned long long v8;  // x8
    void* v9;  // x1
    unsigned long long v10;  // x8
    unsigned long long v11;  // x10
    unsigned long long j;  // x8
    unsigned long long v13;  // x11
    uint128_t *iter;  // x12
    st_bd6e54_0 *v0;  // [bp-0x68]
    unsigned long long v1;  // [bp-0x60]
    unsigned long long v2;  // [bp-0x58]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v5 = a0->field_8;
    v6 = v5 + 1;
    v7 = arm64g_calculate_condition(50, v5, 1, 0);
    if (!(v7 & 1))
    {
        v8 = 0;
    }
    else
    {
        v9 = a0->field_0;
        v10 = v6 >> 3;
        if (v6 & 7)
            v10 += 1;
        if (4 > v10)
        {
            v11 = 0;
            j = v10;
        }
        else
        {
            v13 = v10 & 0x3ffffffffffffffc;
            v11 = v13 * 8;
            j = v10 & 3;
            iter = v9 + 16;
            v15 = CONCAT(0x7f7f7f7f7f7f7f7f, 0x7f7f7f7f7f7f7f7f);
            v16 = CONCAT(0x101010101010101, 0x101010101010101);
            i = v10 & 0x3ffffffffffffffc;
            do
            {
                v18 = i;
                v19 = *iter;
                v20 = _mm_or_si128(*iter, v15);
                *(uint128_t *)((char *)iter - 16) = _mm_add_epi64(_mm_and_si128(v16, ~_mm_srli_epi64(*(int128_t *)((char *)iter - 16), 7)), _mm_or_si128(*(int128_t *)((char *)iter - 16), v15));
                *iter = _mm_add_epi64(_mm_and_si128(v16, ~_mm_srli_epi64(v19, 7)), v20);
                iter += 2;
                i = v18 - 4;
            } while (i);
            if (v10 == v13)
                goto LABEL_bd6f30;
        }
        node = v9 + v11;
        do
        {
            v23 = j;
            *node = (0x101010101010101 & ~(*node >> 7)) + (*node | 0x7f7f7f7f7f7f7f7f);
            node += 1;
            j = v23 - 1;
        } while (j);
LABEL_bd6f30:
        if (8 > v6)
            _memmove(v9 + 8);
        else
            *(long long *)((char *)v9 + v6) = *(long long *)v9;
        v25 = 0;
        v1 = 0;
        v2 = 8;
        v0 = a0;
        do
        {
            v26 = v25;
            if (*((char *)a0->field_0 + v26) == 128)
                a2();
        } while ((v25 = v26 + 1, v26 != v5));
        v8 = a0->field_8;
        if (v8 >= 8)
            v8 = (v8 + 1 >> 3) * 7;
    }
    a0->field_10 = v8 - a0->field_18;
    return;
}
