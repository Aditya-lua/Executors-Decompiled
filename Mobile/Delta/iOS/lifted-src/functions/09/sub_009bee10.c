/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9bee10..0x9bef70 (352 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9bee10_0 {
    char field_0[24];
    char field_8;
} st_9bee10_0;

extern char g_d2ae00;

double sub_9bee10(unsigned long a0, unsigned int a1, uint128_t *iter, unsigned int a3)
{
    uint128_t *v2;  // x0
    __m128i v3;  // q0
    long long v12;  // x0
    long long j;  // x0
    __m128i v14;  // q16
    void* v4;  // x0
    unsigned long long v5;  // x8
    unsigned long long v6;  // x8
    unsigned long long v7;  // 4102
    long long i;  // x0
    st_9bee10_0 *v9;  // x0
    uint128_t v10;  // q6
    long long v11;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = sub_9bedc0();
    v3 = *v2;
    v4 = sub_9bf020(v2 + 1);
    v6 = &(&g_d2ae00)[v5];
    if (!a3)
    {
        *iter = v3;
    }
    else
    {
        *iter = _mm_and_si128(PermV(v3, _mm_and_si128(*(int128_t *)v6, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), *(int128_t *)v6));
        v6 ^= 48;
    }
    if (192 >= a1)
    {
        v7 = arm64g_calculate_condition(3, a1, 192, 0);
        if (!(v7 & 1))
        {
            for (i = 10; sub_9befa0(i - 1); i = sub_9bf040());
        }
        else
        {
            v9 = v4 - 8;
            v3 = *(int128_t *)&v9->field_0[0];
            sub_9bf020(v9);
            v10 = _INSERT(*(int128_t *)&v9->field_0[0], 0, 0);
            v11 = 4;
            while (1)
            {
                v3 = __dirty_unsupported_Iop_SliceV128(v3, v10, 8);
                v12 = sub_9bf040(sub_9befa0(v11 - 1));
                if (!sub_9befa0(sub_9bf040(sub_9bef70(v12))))
                    break;
                v11 = sub_9bef70(sub_9bf040());
            }
        }
    }
    else
    {
        v3 = *(int128_t *)v4;
        sub_9bf020();
        for (j = 7; sub_9befa0(sub_9bf040(j - 1)); j = sub_9befb8(sub_9bf040()))
        {
            v3 = CatOddLanesV(_mm_unpackhi_epi64(v3, v3), _mm_unpackhi_epi64(v3, v3));
        }
    }
    if (!a3)
    {
        iter += 2;
        v3 = _mm_and_si128(PermV(v3, _mm_and_si128(*(int128_t *)v6, _mm_set1_epi32(0xf0f0f0f))), CmpGTV(_mm_set1_epi8(16), *(int128_t *)v6));
    }
    sub_9bf020();
    *(uint128_t *)((char *)iter - 16) = _mm_xor_si128(v14, v3);
    return 0;
}
