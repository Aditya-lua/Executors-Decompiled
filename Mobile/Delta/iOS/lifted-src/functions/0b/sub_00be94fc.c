/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbe94fc..0xbe96cc (464 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_e07ff9;
extern long long g_efa740;

void* sub_be94fc(void* a0, unsigned long long a1)
{
    unsigned long long index;  // x20
    unsigned long long v3;  // x10
    unsigned long long j;  // x10
    unsigned int v13;  // w11
    unsigned long long v14;  // x12
    unsigned long long v15;  // x13
    uint128_t v16;  // q0
    uint128_t *iter;  // x8
    __m128i v18;  // q1
    unsigned long long i;  // x15
    uint128_t v20;  // q4
    uint128_t v21;  // q2
    unsigned long long node;  // x8
    uint128_t v22;  // q4
    uint128_t v23;  // q3
    unsigned int *v24;  // x13
    unsigned int *v25;  // x12
    unsigned int *v26;  // x12
    unsigned long long v5;  // x11
    unsigned long long idx;  // x9
    unsigned long long v7;  // 4125
    unsigned long long v8;  // x21
    unsigned long long v9;  // x12
    unsigned long long v10;  // w10
    unsigned long long v11;  // x9
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (0x500 > a1)
    {
        index = a1 >> 5;
        v3 = (long long)a0[160];
        if (v3)
        {
            node = v3 - 1;
            v5 = (v3 + index) * 4 - 4;
            do
            {
                if (41 <= v3)
                    sub_c73c94(node, 40, &g_efa740);
                idx = index + node;
                if (40 <= idx)
                {
                    sub_c73c94(idx, 40, &g_efa740);
                    sub_c73c94(node, 40, &g_efa740);
                }
                *(int *)((char *)a0 + v5) = *(int *)((char *)a0 + 4 * node);
                node -= 1;
                v5 -= 4;
                v7 = arm64g_calculate_condition(18, node, 1, 0);
            } while (v7 & 1);
        }
        v8 = a1 & 31;
        if (index)
        {
            _bzero();
            a0 = a0;
        }
        v9 = (long long)a0[160];
        node = v9 + index;
        if (v8)
        {
            idx = node - 1;
            if (39 < idx)
            {
                sub_c73c94(idx, 40, &g_efa740);
                sub_c73c94(node, 40, &g_efa740);
            }
            v10 = (unsigned int)(*(int *)((char *)a0 + 4 * idx)) >> ((char)-(unsigned int)v8 & 31);
            v11 = v9 + index;
            if (v10)
            {
                if (39 >= node)
                {
                    *(unsigned int *)((char *)a0 + 4 * node) = v10;
                    v11 = node + 1;
                }
                else
                {
                    sub_c73c94(node, 40, &g_efa740);
                }
            }
            j = index + 1;
            if (node > j)
            {
                v13 = 32 - (unsigned int)v8;
                v14 = v9 - 1;
                if (v14 >= 8)
                {
                    v15 = v14 & 0xfffffffffffffff8;
                    v16 = CONCAT(v8 & 0xffffffff | (v8 & 0xffffffff) * 0x100000000, v8 & 0xffffffff | (v8 & 0xffffffff) * 0x100000000);
                    iter = a0 + node * 4 - 16;
                    v18 = _mm_sub_epi32(_mm_setzero_si128(), CONCAT(v13 | v13 * 0x100000000, v13 | v13 * 0x100000000));
                    i = v14 & 0xfffffffffffffff8;
                    do
                    {
                        v20 = __dirty_unsupported_Iop_Sh32Ux4(*(int128_t *)((char *)iter - 4), v18);
                        v21 = __dirty_unsupported_Iop_Sh32Ux4(*iter, v16);
                        v22 = __dirty_unsupported_Iop_Sh32Ux4(*(int128_t *)((char *)iter - 20), v18);
                        v23 = __dirty_unsupported_Iop_Sh32Ux4(*(int128_t *)((char *)iter - 16), v16);
                        *(uint128_t *)((char *)iter - 16) = v22 | v23;
                        *iter = v20 | v21;
                        iter = (char *)iter - 32;
                        i -= 8;
                    } while (i);
                    node -= v15;
                    if (v14 == v15)
                        goto LABEL_be9664;
                }
                v24 = a0 + node * 4 - 4;
                v25 = v24;
                do
                {
                    node -= 1;
                    v26 = (char *)v25 - 4;
                    *v24 = (unsigned int)(*(int *)((char *)v25 - 4)) >> ((char)v13 & 31) | *v24 << ((char)v8 & 31);
                    v25 = v26;
                    v24 = v26;
                } while (j < node);
            }
LABEL_be9664:
            *(int *)((char *)a0 + 4 * index) = *(int *)((char *)a0 + 4 * index) << ((char)v8 & 31);
        }
        else
        {
            v11 = node;
        }
        *(unsigned long long *)&a0[160] = v11;
        return a0;
    }
    sub_c73c80(&g_e07ff9, 29, &g_efa740);
    sub_c73c94(idx, 40, &g_efa740);
    sub_c73c94(node, 40, &g_efa740);
}
