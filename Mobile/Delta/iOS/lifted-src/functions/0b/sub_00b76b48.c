/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb76b48..0xb76d70 (552 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b76b48_0 {
    uint128_t field_0;
    unsigned int field_10;
} st_b76b48_0;


double sub_b76b48(st_b76b48_0 *a0, unsigned int *a1)
{
    unsigned int v5;  // x23
    unsigned long v6;  // x22
    unsigned int v15;  // x11
    unsigned long long v16;  // x8
    unsigned int v17;  // x9
    unsigned int v18;  // x10
    unsigned int node;  // x8
    uint128_t *iter;  // x11
    __m128i v21;  // q0
    unsigned long long i;  // x12
    unsigned long long v23;  // x12
    __m128i v24;  // q4
    unsigned int v7;  // x8
    unsigned long long j;  // x9
    unsigned long long v27;  // x10
    unsigned int v28;  // x9
    unsigned int v30;  // w9
    unsigned long long v8;  // x21
    unsigned int ptr;  // x0
    unsigned int v10;  // x21
    unsigned int v11;  // x20
    long long v12;  // x0
    unsigned long long v13;  // x8
    unsigned int v14;  // x9
    uint128_t v0;  // [bp-0x58], Other Possible Types: unsigned int
    long long v1;  // [bp-0x50]
    unsigned int v2;  // [bp-0x48]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v5 = *(long long *)&a1[4];
    v6 = *a1;
    if (!v5)
    {
        if (!(v6 & 1))
        {
            v0 = CONCAT(8, 0);
            v2 = 0;
            a0->field_0 = v0;
            *(unsigned long long *)&a0->field_10 = 0;
            return (unsigned long long)v0;
        }
        v7 = *(long long *)&a1[2] != 0;
        if (!v7)
        {
LABEL_b76c2c:
            ptr = 8;
            v0 = CONCAT(8, v7);
            v2 = 0;
            v10 = *(long long *)&a1[2];
            v11 = *(long long *)&a1[6];
            if (!v5)
            {
LABEL_b76c44:
                if (!(unsigned int)v6)
                {
                    a0->field_0 = v0;
                    *(unsigned long long *)&a0->field_10 = 0;
                    return (unsigned long long)v0;
                }
                if ((v10 != 0) > v7)
                {
LABEL_b76c58:
                    sub_c6c0cc(&v0, 0);
                    ptr = *(unsigned long long *)((void*)&v0 + 8);
                    v15 = v2;
                    if (v5)
                    {
LABEL_b76be0:
                        if (v5 != v11)
                        {
                            v16 = v11 - v5;
                            v17 = v16 >> 6;
                            if (0x100 > v16)
                            {
                                v18 = 0;
                                node = v15;
                            }
                            else
                            {
                                v18 = v17 & 0x3fffffffffffffc;
                                node = v15 + v18;
                                iter = ptr + v15 * 8 + 16;
                                v21 = _mm_set_epi64x(1, 0);
                                i = v17 & 0x3fffffffffffffc;
                                do
                                {
                                    v23 = i;
                                    v24 = _mm_add_epi64(CONCAT(v5, v5), _mm_slli_epi64(v21, 6));
                                    *(uint128_t *)((char *)iter - 16) = v24;
                                    *iter = _mm_add_epi64(v24, _mm_set1_epi64x(128));
                                    v21 = _mm_add_epi64(v21, _mm_set1_epi64x(4));
                                    iter += 2;
                                    i = v23 - 4;
                                } while (i);
                                if (v17 == v18)
                                    goto LABEL_b76d0c;
                            }
                            j = v17 - v18;
                            v27 = v5 + v18 * 64;
                            do
                            {
                                v28 = j;
                                *(unsigned long long *)(ptr + node * 8) = v27;
                                node += 1;
                                v27 += 64;
                                j = v28 - 1;
                            } while (j);
                            goto LABEL_b76d0c;
                        }
                    }
LABEL_b76c74:
                    node = v15;
LABEL_b76d0c:
                    if (!v10)
                        v30 = 0;
                    else
                        v30 = v6;
                    if (v30 == 1)
                        *(unsigned long long *)(ptr + node * 8) = v10;
                    a0->field_0 = v0;
                    *(unsigned long long *)&a0->field_10 = node;
                    return (unsigned long long)v0;
                }
LABEL_b76bd8:
                v15 = 0;
                if (v5)
                    goto LABEL_b76be0;
                goto LABEL_b76c74;
            }
LABEL_b76bb8:
            v13 = v11 - v5 >> 6;
            if (!v10)
                v14 = v13;
            else
                v14 = v13 + 1;
            if (!(v6 & 1))
                v14 = v13;
            if (v7 < v14)
                goto LABEL_b76c58;
            goto LABEL_b76bd8;
        }
    }
    else if (v6 & 1)
    {
        v7 = (unsigned long long)(*(long long *)&a1[6] - v5) >> 6;
        if (*(long long *)&a1[2])
            v7 += 1;
        if (!v7)
            goto LABEL_b76c2c;
    }
    else
    {
        v7 = (unsigned long long)(*(long long *)&a1[6] - v5) >> 6;
        if (!v7)
            goto LABEL_b76c2c;
    }
    v8 = v7 * 8;
    ptr = _malloc(v8);
    if (!ptr)
    {
        v12 = sub_c6b970(8, v8);
        if (v0)
            _free(v1);
        __Unwind_Resume(v12);
    }
    v0 = CONCAT(ptr, v7);
    v2 = 0;
    v10 = *(long long *)&a1[2];
    v11 = *(long long *)&a1[6];
    if (!v5)
        goto LABEL_b76c44;
    goto LABEL_b76bb8;
}
