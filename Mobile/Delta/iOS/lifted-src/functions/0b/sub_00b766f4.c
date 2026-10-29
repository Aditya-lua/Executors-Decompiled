/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb766f4..0xb76800 (268 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_b766f4(void* *a0, unsigned long long a1, unsigned long long a2)
{
    unsigned long long v2;  // x24
    unsigned long long v3;  // x21
    unsigned long long i;  // x12
    unsigned long long v13;  // x12
    __m128i v14;  // q2
    void* v4;  // x23
    unsigned long long v5;  // x22
    void* ptr;  // x0
    unsigned long long v7;  // x8
    void* v8;  // x8
    unsigned long long j;  // x9
    void* v10;  // x10
    uint128_t *iter;  // x11
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a2 - a1;
    if (a2 == a1)
    {
        *a0 = 0;
        a0[1] = 8;
        a0[2] = 0;
        return 8;
    }
    v3 = a1;
    v4 = 12297829382473034411 * (v2 >> 3);
    v5 = v4 * 8;
    ptr = _malloc(v5);
    if (ptr)
    {
        v7 = v2 - 24;
        if (72 > v7)
        {
            v8 = 0;
            j = v3;
        }
        else
        {
            v10 = v7 / 24 + 1;
            v8 = v10 & 0x1ffffffffffffffc;
            j = v3 + 24 * v8;
            iter = ptr + 16;
            i = v10 & 0x1ffffffffffffffc;
            do
            {
                v13 = i;
                v14 = (__m128i)(CONCAT(v3, v3));
                *(uint128_t *)((char *)iter - 16) = _mm_add_epi64(v14, _mm_set_epi64x(24, 0));
                *iter = _mm_add_epi64(v14, _mm_set_epi64x(72, 48));
                v3 += 96;
                iter += 2;
                i = v13 - 4;
            } while (i);
            if (v10 == v8)
            {
                *a0 = v4;
                a0[1] = ptr;
                a0[2] = v8;
                return (unsigned int)ptr;
            }
        }
        do
        {
            *(unsigned long long *)((char *)ptr + 0x8 * v8) = j;
            v8 += 1;
            j += 24;
        } while (j != a2);
        *a0 = v4;
        a0[1] = ptr;
        a0[2] = v8;
        return (unsigned int)ptr;
    }
    sub_c6b970(8, v5);
}
