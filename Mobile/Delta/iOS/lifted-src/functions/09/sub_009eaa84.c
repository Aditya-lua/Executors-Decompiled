/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9eaa84..0x9eac28 (420 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9eaa84_0 {
    void* field_0;
    unsigned long long field_8;
    unsigned int field_10;
} st_9eaa84_0;


unsigned long long sub_9eaa84(st_9eaa84_0 *a0, st_9eaa84_0 *a1, unsigned long long a2)
{
    int v2;  // w21
    unsigned long long v3;  // w19
    unsigned long long v12;  // x17
    uint128_t v13;  // q2
    uint128_t v14;  // q0
    uint128_t v15;  // q1
    unsigned long long v16;  // x16
    uint128_t *iter;  // x14
    uint128_t *node;  // x17
    __m128i v19;  // q3
    unsigned long long j;  // x2
    unsigned long long v21;  // x2
    unsigned long long v4;  // x9
    uint128_t v22;  // q4
    uint128_t v23;  // q5
    uint128_t v25;  // q5
    uint128_t v26;  // q6
    uint128_t v28;  // q7
    unsigned long v30;  // x14
    unsigned long long v31;  // x2
    void* v5;  // x8
    unsigned long long *iter1;  // x17
    unsigned long long i;  // x16
    unsigned long long *iter2;  // x13
    unsigned long long v35;  // x16
    void* v6;  // x13
    unsigned long v7;  // x14
    unsigned long long idx;  // x10
    unsigned long long v9;  // x11
    unsigned long long v10;  // x12
    unsigned long v11;  // x15
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = (long long)((a2 < 0 ? a2 + 63 : a2)) >> 6;
    v3 = (int)a1->field_8 - v2;
    if ((int)a1->field_8 > v2)
    {
        if (a0 != a1 && !sub_9e4cdc())
            return 0;
        v4 = a2 & 63;
        v5 = a0->field_0;
        v6 = a1->field_0;
        v7 = *(long long *)((char *)v6 + 8 * v2);
        idx = v3 - 1;
        if (v3 > 1)
        {
            v9 = -a2 & 63;
            v10 = -v9 | -v9 >> 8;
            v11 = v2;
            if (v3 < 7 || (v12 = v11 * 8, 32 > v5 - v6 - v12 - 8))
            {
                v16 = 0;
            }
            else
            {
                v13 = CONCAT(v7, v7);
                v14 = CONCAT(v9, v9);
                v15 = CONCAT(v10, v10);
                v16 = idx & 0x7ffffffc;
                iter = v12 + v6 + 24;
                node = v5 + 16;
                v19 = _mm_sub_epi64(_mm_setzero_si128(), CONCAT(v4, v4));
                j = v16;
                do
                {
                    v21 = j;
                    v22 = *(int128_t *)((char *)iter - 16);
                    v23 = __dirty_unsupported_Iop_SliceV128(v22, v13, 8);
                    v13 = *iter;
                    iter += 2;
                    v25 = __dirty_unsupported_Iop_Sh64Ux2(v23, v19);
                    v26 = __dirty_unsupported_Iop_Sh64Ux2(__dirty_unsupported_Iop_SliceV128(v13, v22, 8), v19);
                    v28 = __dirty_unsupported_Iop_Sh64Ux2(v13, v14);
                    *(uint128_t *)((char *)node - 16) = __dirty_unsupported_Iop_Sh64Ux2(v22, v14) & v15 | v25;
                    *node = v28 & v15 | v26;
                    node += 2;
                    j = v21 - 4;
                } while (j);
                v7 = *(unsigned long long *)((void*)&v13 + 8);
                v30 = v7;
                if (v16 == idx)
                    goto LABEL_9eab7c;
            }
            v31 = v16 * 8;
            iter1 = v5 + v31;
            i = idx - v16;
            iter2 = v31 + v11 * 8 + v6 + 8;
            do
            {
                v35 = i;
                v30 = *iter2;
                iter2 += 1;
                *iter1 = v30 << ((char)v9 & 63) & v10 | v7 >> ((char)v4 & 63);
                iter1 += 1;
                v7 = v30;
                i = v35 - 1;
            } while (i);
        }
        else
        {
            idx = 0;
            v30 = v7;
        }
LABEL_9eab7c:
        *(unsigned long *)((char *)v5 + 8 * idx) = v30 >> ((char)v4 & 63);
        a0->field_10 = a1->field_10;
        *(unsigned int *)&a0->field_8 = v3;
    }
    else
    {
        sub_9e5b4c();
    }
    return 1;
}
