/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x81380..0x8144c (204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_81380(void* a0, void* a1, unsigned long long a2, long long a3)
{
    unsigned long long v2;  // x0
    unsigned long long v3;  // x8
    void* node;  // x10
    unsigned long long j;  // x8
    unsigned long long v14;  // x8
    void* v15;  // x9
    uint128_t *iter;  // x9
    uint128_t *iter1;  // x10
    unsigned long long i;  // x11
    unsigned long long v7;  // x11
    __m128i v8;  // q1
    unsigned long long v10;  // x10
    void* v11;  // x9
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_7cf2c(a3);
    if ((unsigned int)v2)
    {
        if (a2)
        {
            v3 = 0;
            if (a2 >= 8 && a0 - a1 >= 32)
            {
                v3 = a2 & 0xfffffffffffffff8;
                iter = a1 + 16;
                iter1 = a0 + 16;
                i = v3;
                do
                {
                    v7 = i;
                    v8 = *iter;
                    *(uint128_t *)((char *)iter1 - 16) = _mm_srli_epi32(*(int128_t *)((char *)iter - 16), 8);
                    *iter1 = _mm_srli_epi32(v8, 8);
                    iter += 2;
                    iter1 += 2;
                    i = v7 - 8;
                } while (i);
                if (v3 == a2)
                    return v2;
            }
            v10 = v3 * 4;
            v11 = a1 + v10;
            node = a0 + v10;
            j = a2 - v3;
            do
            {
                v14 = j;
                v15 = v11 + 4;
                *(int *)node = (unsigned int)(*(int *)v11) >> 8;
                node += 4;
                j = v14 - 1;
                v11 = v15;
            } while (j);
            return v2;
        }
        else
        {
            return v2;
        }
    }
}
