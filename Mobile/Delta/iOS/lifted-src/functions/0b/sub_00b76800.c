/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb76800..0xb76920 (288 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


int sub_b76800(void* *a0, unsigned long long a1, unsigned long long a2)
{
    unsigned long long v2;  // x23
    unsigned long long v3;  // x21
    unsigned long long i;  // x13
    unsigned long long v13;  // x13
    __m128i v14;  // q2
    unsigned long long v4;  // x22
    void* ptr;  // x0
    void* v6;  // x8
    unsigned long long v7;  // x9
    void* v8;  // x9
    unsigned long long j;  // x10
    void* v10;  // x11
    uint128_t *iter;  // x12
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
    v4 = v2 >> 3;
    if (v2 > 56)
    {
        ptr = _malloc(v4);
    }
    else
    {
        ptr = 0;
        if (_posix_memalign(&ptr, 8, v4))
            sub_c6b970(8, v4);
    }
    if (ptr)
    {
        v6 = v2 >> 6;
        v7 = v2 - 64;
        if (192 > v7)
        {
            v8 = 0;
            j = v3;
        }
        else
        {
            v10 = (v7 >> 6) + 1;
            v8 = v10 & 0x7fffffffffffffc;
            j = v3 + v8 * 64;
            iter = ptr + 16;
            i = v10 & 0x7fffffffffffffc;
            do
            {
                v13 = i;
                v14 = (__m128i)(CONCAT(v3, v3));
                *(uint128_t *)((char *)iter - 16) = _mm_add_epi64(v14, _mm_set_epi64x(64, 0));
                *iter = _mm_add_epi64(v14, _mm_set_epi64x(192, 128));
                v3 += 0x100;
                iter += 2;
                i = v13 - 4;
            } while (i);
            if (v10 == v8)
            {
                *a0 = v6;
                a0[1] = ptr;
                a0[2] = v8;
                return (unsigned int)ptr;
            }
        }
        do
        {
            *(unsigned long long *)((char *)ptr + 0x8 * v8) = j;
            v8 += 1;
            j += 64;
        } while (j != a2);
        *a0 = v6;
        a0[1] = ptr;
        a0[2] = v8;
        return (unsigned int)ptr;
    }
    sub_c6b970(8, v4);
}
