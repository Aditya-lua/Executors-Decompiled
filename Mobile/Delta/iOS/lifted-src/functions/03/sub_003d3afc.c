/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3d3afc..0x3d3c30 (308 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3d3afc_0 {
    unsigned long long field_0;
} st_3d3afc_0;

extern st_3d3afc_0 *g_f0b120;

unsigned long long sub_3d3afc(void* a0, unsigned long a1, unsigned long a2, unsigned long a3)
{
    unsigned long v2;  // x21
    unsigned long long ptr;  // x19
    unsigned long long v13;  // x11
    void* v14;  // x9
    unsigned int *v15;  // x10
    unsigned long long v16;  // x11
    __m128i v18;  // q0
    unsigned long long v4;  // x8
    unsigned long long v22;  // 4125
    char *node;  // x9
    void* v24;  // x10
    unsigned long long j;  // x8
    unsigned long long v26;  // x8
    uint128_t *v5;  // x9
    unsigned long iter;  // x10
    unsigned long long i;  // x11
    unsigned long long v8;  // x11
    __m128i v9;  // q3
    __m128i v10;  // q2
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a3 * a1 * a2;
    ptr = _malloc((int)v2);
    if (ptr)
    {
        if ((int)v2 >= 1)
        {
            if (4 > (unsigned int)v2)
            {
                v4 = 0;
            }
            else if (32 > (unsigned int)v2)
            {
                v4 = 0;
LABEL_3d3bc0:
                v13 = v4;
                v4 = v2 & 0x7ffffffc;
                v14 = a0 + v13 * 2;
                v15 = ptr + v13;
                v16 = v13 - v4;
                do
                {
                    v18 = __dirty_unsupported_Iop_ZeroHI64ofV128(_mm_srli_epi16(*(unsigned long long *)&*(double *)v14, 8));
                    *v15 = __dirty_unsupported_Iop_ZeroHI64ofV128(CatEvenLanesV(_mm_unpacklo_epi64(v18, v18), _mm_unpacklo_epi64(v18, v18)));
                    v22 = arm64g_calculate_condition(18, v16, 4, 0);
                    v14 += 8;
                    v15 += 1;
                    v16 += 4;
                } while (v22 & 1);
                if (v4 == v2)
                {
                    _free(a0);
                    return ptr;
                }
            }
            else
            {
                v4 = v2 & 0x7fffffe0;
                v5 = a0 + 32;
                iter = ptr + 16;
                i = v4;
                do
                {
                    v8 = i;
                    v9 = *v5;
                    v10 = v5[1];
                    *(__m128i *)(iter - 16) = CatOddLanesV(*(int128_t *)((char *)v5 - 16), *(int128_t *)((char *)v5 - 32));
                    *(__m128i *)iter = CatOddLanesV(v10, v9);
                    iter += 32;
                    v5 += 4;
                    i = v8 - 32;
                } while (i);
                if (v4 == v2)
                {
                    _free(a0);
                    return ptr;
                }
                if (v2 & 28)
                    goto LABEL_3d3bc0;
            }
            node = ptr + v4;
            v24 = a0 + v4 * 2;
            j = v2 - v4;
            do
            {
                v26 = j;
                *node = (char)v24[1];
                node += 1;
                v24 += 2;
                j = v26 - 1;
            } while (j);
            _free(a0);
            return ptr;
        }
        else
        {
            _free(a0);
            return ptr;
        }
    }
    g_f0b120();
}
