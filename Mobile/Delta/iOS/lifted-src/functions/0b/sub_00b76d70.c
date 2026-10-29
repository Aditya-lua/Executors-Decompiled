/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb76d70..0xb76eb4 (324 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_b76d70(void* *a0, long long a1, long long a2)
{
    unsigned long long v2;  // x20
    unsigned long long v3;  // 4140
    unsigned long long i;  // x13
    unsigned long long v13;  // x13
    __m128i v14;  // q5
    unsigned long long v16;  // x11
    long long v4;  // x19
    unsigned long long v5;  // x19
    void* ptr;  // x0
    long long v7;  // x11
    void* j;  // x9
    void* v9;  // x10
    __m128i v10;  // q0
    uint128_t *iter;  // x12
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a2 - a1;
    v3 = arm64g_calculate_condition(146, v2, 16, 0);
    if (!(v3 & 1))
    {
        a1 = v4;
        a0 = sub_c6b970(0, a1);
    }
    if (a2 == a1)
    {
        *a0 = 0;
        a0[1] = 8;
        a0[2] = 0;
        return (unsigned int)a0;
    }
    v5 = v2 >> 1;
    if (v2 > 14)
    {
        ptr = _malloc(v5);
    }
    else
    {
        ptr = 0;
        if (_posix_memalign(&ptr, 8, v5))
            sub_c6b970(8, v5);
    }
    if (ptr)
    {
        v7 = a1;
        j = v2 >> 4;
        if (64 > v2)
        {
            v9 = 0;
        }
        else
        {
            v9 = j & 0xffffffffffffffc;
            v10 = _mm_set_epi64x(1, 0);
            iter = ptr + 16;
            i = j & 0xffffffffffffffc;
            do
            {
                v13 = i;
                v14 = _mm_add_epi64(CONCAT(v7, v7), _mm_slli_epi64(v10, 4));
                *(uint128_t *)((char *)iter - 16) = _mm_add_epi64(v14, _mm_set1_epi64x(8));
                *iter = _mm_add_epi64(v14, _mm_set1_epi64x(40));
                v10 = _mm_add_epi64(v10, _mm_set1_epi64x(4));
                iter += 2;
                i = v13 - 4;
            } while (i);
            if (j == v9)
            {
                *a0 = j;
                a0[1] = ptr;
                a0[2] = v9;
                return (unsigned int)a0;
            }
        }
        v16 = v7 + v9 * 16 + 8;
        do
        {
            *(unsigned long long *)((char *)ptr + 0x8 * v9) = v16;
            v9 += 1;
            v16 += 16;
        } while (j != v9);
        *a0 = j;
        a0[1] = ptr;
        a0[2] = v9;
        return (unsigned int)a0;
    }
    sub_c6b970(8, v5);
}
