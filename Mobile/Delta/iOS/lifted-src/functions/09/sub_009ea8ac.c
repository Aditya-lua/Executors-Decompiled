/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9ea8ac..0x9eaa84 (472 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9ea8ac_0 {
    char padding_0[8];
    uint128_t field_8;
    uint128_t field_18;
} st_9ea8ac_0;


unsigned long long sub_9ea8ac(void* a0, void* a1, unsigned long long a2)
{
    unsigned long long v2;  // x21
    unsigned long long v3;  // w19
    st_9ea8ac_0 *v12;  // x16
    unsigned long long v13;  // x15
    uint128_t v14;  // q2
    uint128_t v15;  // q0
    uint128_t v16;  // q1
    uint128_t *iter;  // x14
    uint128_t *node;  // x16
    __m128i v19;  // q3
    unsigned long long j;  // x17
    unsigned long long v21;  // x17
    unsigned long long v4;  // x19
    uint128_t v22;  // q4
    uint128_t v23;  // q5
    uint128_t v25;  // q5
    uint128_t v26;  // q6
    uint128_t v28;  // q7
    unsigned long v30;  // x14
    unsigned long long v31;  // x17
    unsigned long long v5;  // x9
    unsigned long long *iter1;  // x16
    unsigned long long i;  // x15
    unsigned long long *iter2;  // x13
    unsigned long long v35;  // x15
    void* v6;  // x8
    void* v7;  // x13
    unsigned long v8;  // x14
    unsigned long long idx;  // x10
    unsigned long long v10;  // x11
    unsigned long long v11;  // x12
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (a2 >> 31 & 1)
    {
        sub_a368c8();
        sub_a369bc("crypto/bn/bn_shift.c", 155, "BN_rshift");
        sub_a36abc(3, 0x77, 0);
        return 0;
    }
    v2 = (unsigned int)a2 >> 6;
    v3 = (unsigned int)((int)a1[8] - v2);
    if ((int)a1[8] <= (int)v2)
    {
        sub_9e5b4c();
        goto LABEL_9ea9e8;
    }
    else if (a0 == a1 || sub_9e4cdc())
    {
        v5 = (unsigned int)a2 & 63;
        v6 = *(long long *)a0;
        v7 = *(long long *)a1;
        v8 = *(long long *)((char *)v7 + 8 * (v2 & 0xffffffff));
        idx = v3 - 1;
        if (v3 > 1)
        {
            v10 = -(unsigned int)a2 & 63;
            v11 = -v10 | -v10 >> 8;
            if (v3 < 7 || (v12 = v2 * 8 + v7, 32 > v6 - v12 - 8))
            {
                v13 = 0;
            }
            else
            {
                v13 = idx & 0x7ffffffc;
                v14 = CONCAT(v8, v8);
                v15 = CONCAT(v10, v10);
                v16 = CONCAT(v11, v11);
                iter = (char *)&v12->field_8 + 8;
                node = v6 + 16;
                v19 = _mm_sub_epi64(_mm_setzero_si128(), CONCAT(v5, v5));
                j = v13;
                do
                {
                    v21 = j;
                    v22 = *(int128_t *)((char *)iter - 16);
                    v23 = __dirty_unsupported_Iop_SliceV128(v22, v14, 8);
                    v14 = *iter;
                    iter += 2;
                    v25 = __dirty_unsupported_Iop_Sh64Ux2(v23, v19);
                    v26 = __dirty_unsupported_Iop_Sh64Ux2(__dirty_unsupported_Iop_SliceV128(v14, v22, 8), v19);
                    v28 = __dirty_unsupported_Iop_Sh64Ux2(v14, v15);
                    *(uint128_t *)((char *)node - 16) = __dirty_unsupported_Iop_Sh64Ux2(v22, v15) & v16 | v25;
                    *node = v28 & v16 | v26;
                    node += 2;
                    j = v21 - 4;
                } while (j);
                v8 = *(unsigned long long *)((void*)&v14 + 8);
                v30 = v8;
                if (v13 == idx)
                    goto LABEL_9ea9d4;
            }
            v31 = v13 * 8;
            iter1 = v6 + v31;
            i = idx - v13;
            iter2 = v31 + v2 * 8 + v7 + 8;
            do
            {
                v35 = i;
                v30 = *iter2;
                iter2 += 1;
                *iter1 = v30 << ((char)v10 & 63) & v11 | v8 >> ((char)v5 & 63);
                iter1 += 1;
                v8 = v30;
                i = v35 - 1;
            } while (i);
        }
        else
        {
            idx = 0;
            v30 = v8;
        }
LABEL_9ea9d4:
        *(unsigned long *)((char *)v6 + 8 * idx) = v30 >> ((char)v5 & 63);
        *(int *)&a0[16] = (int)a1[16];
        *(unsigned int *)&a0[8] = v3;
LABEL_9ea9e8:
        v4 = 1;
    }
    else
    {
        v4 = 0;
    }
    sub_9e5708();
    return v4;
}
