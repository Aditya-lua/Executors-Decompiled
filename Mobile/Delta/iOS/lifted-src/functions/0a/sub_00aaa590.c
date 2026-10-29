/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaaa590..0xaaa6c0 (304 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

void sub_aaa590(char *a0, char *a1, unsigned long long a2, long long a3, void* a4, unsigned int *a5, unsigned long long a6)
{
    unsigned long long iter;  // x22
    char *iter1;  // x23
    char *node;  // x24
    unsigned long long v7;  // x25
    char *v8;  // x24
    char v9;  // x8
    char v10;  // x8
    char v11;  // x9
    __m128i v0;  // [bp-0x70]
    unsigned long v1;  // [bp-0x58]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    iter = a2;
    iter1 = a1;
    node = a0;
    v1 = *(long long *)&g_10002b0;
    v7 = *a5 & 7;
    if (a6)
    {
        if (iter)
        {
            do
            {
                if (!v7)
                {
                    v0 = _mm_srli_epi64(_mm_unpacklo_epi32(_mm_setzero_si128(), *(unsigned long long *)&*(double *)a4), 32);
                    sub_aaa148(&v0, a3);
                    *(int *)a4 = _mm_cvtsi128_si64(v0);
                    *(int *)&a4[4] = _mm_extract_epi64(v0, 1);
                }
                v8 = node + 1;
                v9 = *((char *)a4 + v7) ^ *node;
                *iter1 = v9;
                iter1 += 1;
                *((char *)a4 + v7) = v9;
                v7 = (unsigned int)v7 + 1 & 7;
                iter -= 1;
                node = v8;
            } while (iter);
        }
    }
    else
    {
        if (iter)
        {
            do
            {
                if (!v7)
                {
                    v0 = _mm_srli_epi64(_mm_unpacklo_epi32(_mm_setzero_si128(), *(unsigned long long *)&*(double *)a4), 32);
                    sub_aaa148(&v0, a3);
                    *(int *)a4 = _mm_cvtsi128_si64(v0);
                    *(int *)&a4[4] = _mm_extract_epi64(v0, 1);
                }
                v10 = *node;
                node += 1;
                v11 = *((char *)a4 + v7);
                *((char *)a4 + v7) = v10;
                *iter1 = v11 ^ v10;
                iter1 += 1;
                v7 = (unsigned int)v7 + 1 & 7;
                iter -= 1;
            } while (iter);
        }
    }
    *a5 = v7;
    if (*(long long *)&g_10002b0 == v1)
        return;
    ___stack_chk_fail();
}
