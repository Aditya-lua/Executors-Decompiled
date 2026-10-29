/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9ea6d0..0x9ea8ac (476 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9ea6d0_0 {
    unsigned long long field_0;
    unsigned int field_8;
    char padding_c[4];
    unsigned int field_10;
} st_9ea6d0_0;


int sub_9ea6d0(st_9ea6d0_0 *a0, st_9ea6d0_0 *a1, unsigned long long a2)
{
    int v2;  // w23
    unsigned long long v3;  // x0
    unsigned long long v12;  // x14
    unsigned long v13;  // x16
    unsigned long v14;  // x16
    unsigned long v15;  // x15
    unsigned long long v16;  // x2
    unsigned long long v17;  // x17
    unsigned long long v18;  // x1
    unsigned long long v19;  // x14
    uint128_t v20;  // q4
    uint128_t v21;  // q0
    unsigned long v4;  // x8
    uint128_t v22;  // q1
    unsigned long long v23;  // x3
    uint128_t *v24;  // x16
    uint128_t *iter;  // x2
    __m128i v26;  // q2
    unsigned long long j;  // x3
    uint128_t v28;  // q3
    uint128_t *v29;  // x16
    uint128_t v30;  // q5
    unsigned long long v5;  // x9
    uint128_t v33;  // q4
    uint128_t v34;  // q7
    uint128_t v35;  // q5
    uint128_t v36;  // q16
    uint128_t v37;  // q4
    unsigned long long idx;  // x14
    unsigned long long v6;  // w15
    unsigned long long v7;  // x11
    unsigned long long v8;  // x12
    unsigned long long v9;  // x13
    unsigned long long v10;  // x0
    unsigned long long *v11;  // x10
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = (long long)((a2 < 0 ? a2 + 63 : a2)) >> 6;
    v3 = sub_9e4cdc();
    if (v3)
    {
        v4 = a1->field_8;
        if ((unsigned int)v4)
        {
            v5 = a2 & 63;
            v6 = -a2;
            v7 = v6 & 63;
            v8 = -v7 | -v7 >> 8;
            v9 = a1->field_0;
            v10 = a0->field_0;
            v11 = v10 + v2 * 8;
            v12 = (int)v4 * 8;
            v13 = *(long long *)(v9 + v12 - 8);
            *(unsigned long long *)((char *)v11 + v12) = v13 >> ((char)v6 & 63) & v8;
            v14 = v13;
            if ((int)v4 >= 2)
            {
                v15 = v2;
                if ((unsigned int)v4 < 7 || (v16 = v15 * 8, 32 > v9 - v10 - v16 - 8))
                {
                    v19 = v4;
                }
                else
                {
                    v17 = v4 - 1;
                    v18 = v17 & 0xfffffffffffffffc;
                    v19 = v4 - v18;
                    v20 = CONCAT(v13, v13);
                    v21 = CONCAT(v5, v5);
                    v22 = CONCAT(v8, v8);
                    v23 = v4 * 8;
                    v24 = v23 + v9 - 40;
                    iter = v16 + v10 + v23 - 16;
                    v26 = _mm_sub_epi64(_mm_setzero_si128(), CONCAT(v7, v7));
                    j = v18;
                    do
                    {
                        v28 = *v24;
                        v29 = (char *)v24 - 32;
                        v30 = __dirty_unsupported_Iop_SliceV128(v24[1], v24[1], 8);
                        v20 = __dirty_unsupported_Iop_SliceV128(v28, v28, 8);
                        v33 = __dirty_unsupported_Iop_Sh64Ux2(__dirty_unsupported_Iop_SliceV128(v30, v20, 8), v21);
                        v34 = __dirty_unsupported_Iop_Sh64Ux2(__dirty_unsupported_Iop_SliceV128(v20, v30, 8), v21);
                        v35 = __dirty_unsupported_Iop_Sh64Ux2(v30, v26);
                        v36 = __dirty_unsupported_Iop_Sh64Ux2(v20, v26);
                        v37 = __dirty_unsupported_Iop_SliceV128(v35 & v22 | v33, v35 & v22 | v33, 8);
                        *(uint128_t *)((char *)iter - 16) = __dirty_unsupported_Iop_SliceV128(v36 & v22 | v34, v36 & v22 | v34, 8);
                        *iter = v37;
                        iter = (char *)iter - 32;
                        j -= 4;
                        v24 = v29;
                    } while (j);
                    v13 = *(unsigned long long *)&*(unsigned long long *)(void*)&v28;
                    v14 = v13;
                    if (v17 == v18)
                        goto LABEL_9ea7bc;
                }
                do
                {
                    idx = v19;
                    v14 = *(long long *)(v9 - 16 + idx * 8);
                    *(unsigned long *)(v10 + v15 * 8 - 8 + idx * 8) = v14 >> ((char)v7 & 63) & v8 | v13 << ((char)v5 & 63);
                    v19 = idx - 1;
                    v13 = v14;
                } while (2 < idx);
            }
LABEL_9ea7bc:
            *v11 = v14 << ((char)v5 & 63);
        }
        else
        {
            *(unsigned long long *)(a0->field_0 + v2 * 8) = 0;
        }
        if (a2 + 63 >= 127)
        {
            _bzero();
            v4 = a1->field_8;
        }
        a0->field_10 = a1->field_10;
        a0->field_8 = v2 + 1 + (unsigned int)v4;
        v3 = 1;
    }
    return v3;
}
