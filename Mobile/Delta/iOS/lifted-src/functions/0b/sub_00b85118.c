/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb85118..0xb85238 (288 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void* * sub_b85118(void* *a0, unsigned long long a1, void* a2)
{
    void* v3;  // x19
    unsigned long long v12;  // x15
    unsigned long long v13;  // x14
    __m128i v14;  // q2
    void* ptr;  // x8
    void* v5;  // x9
    void* v6;  // x10
    void* v7;  // x10
    unsigned long long j;  // x11
    void* v9;  // x12
    uint128_t *iter;  // x13
    unsigned long long i;  // x14
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v3 = a2 * 8;
    if (a2 > 0x1fffffffffffffff)
        sub_c6b970(0, v3);
    if (0x7ffffffffffffff8 >= v3)
    {
        if (v3)
        {
            ptr = _malloc(v3);
            v5 = a2;
            if (!ptr)
            {
                sub_c6b970(8, v3);
            }
            else if (!a2)
            {
                *a0 = v5;
                a0[1] = ptr;
                a0[2] = 0;
                return a0;
            }
        }
        else
        {
            v5 = 0;
            ptr = 8;
            if (!a2)
            {
                *a0 = 0;
                a0[1] = 8;
                a0[2] = 0;
                return a0;
            }
        }
        v6 = v3 - 8;
        if (24 > v6)
        {
            v7 = 0;
            j = a1;
        }
        else
        {
            v9 = (v6 >> 3) + 1;
            v7 = v9 & 0x3ffffffffffffffc;
            j = a1 + v7 * 8;
            iter = ptr + 16;
            i = v9 & 0x3ffffffffffffffc;
            v12 = a1;
            do
            {
                v13 = i;
                v14 = (__m128i)(CONCAT(v12, v12));
                *(uint128_t *)((char *)iter - 16) = _mm_add_epi64(v14, _mm_set_epi64x(8, 0));
                *iter = _mm_add_epi64(v14, _mm_set_epi64x(24, 16));
                v12 += 32;
                iter += 2;
                i = v13 - 4;
            } while (i);
            if (v9 == v7)
            {
                *a0 = v5;
                a0[1] = ptr;
                a0[2] = v7;
                return a0;
            }
        }
        do
        {
            *(unsigned long long *)((char *)ptr + 0x8 * v7) = j;
            v7 += 1;
            j += 8;
        } while (j != a1 + v3);
        *a0 = v5;
        a0[1] = ptr;
        a0[2] = v7;
        return a0;
    }
    sub_c6b970(0, v3);
}
