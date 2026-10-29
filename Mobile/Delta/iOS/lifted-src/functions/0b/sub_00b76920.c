/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb76920..0xb76b48 (552 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b76920_0 {
    uint128_t field_0;
    unsigned long long field_10;
} st_b76920_0;


double sub_b76920(st_b76920_0 *a0, unsigned long long *a1)
{
    unsigned long long v5;  // x23
    unsigned long long v6;  // x22
    unsigned long long index;  // x11
    unsigned long long v16;  // w8
    unsigned long long v17;  // w8
    unsigned long long v18;  // x8
    unsigned long long v19;  // x9
    unsigned long long v20;  // x10
    unsigned long long idx;  // x8
    uint128_t *iter;  // x11
    __m128i v23;  // q0
    unsigned long long i;  // x12
    unsigned long long v7;  // x24
    unsigned long long v25;  // x12
    __m128i v26;  // q4
    unsigned long long j;  // x9
    unsigned long long v29;  // x10
    unsigned long long v30;  // x9
    unsigned long long v8;  // x21
    unsigned long long ptr;  // x0
    unsigned long long v10;  // x21
    unsigned long long v11;  // x20
    long long v12;  // x0
    unsigned long long v13;  // x8
    uint128_t v0;  // [bp-0x58], Other Possible Types: unsigned long long
    long long v1;  // [bp-0x50]
    unsigned long long v2;  // [bp-0x48]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v5 = *a1;
    v6 = a1[2];
    if (v5 == 1)
    {
        v7 = a1[1] != 0;
        if (v6)
            v7 += a1[3] - v6 >> 6;
        if (v7)
        {
LABEL_b76970:
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
            v10 = a1[1];
            v11 = a1[3];
            if (!(unsigned int)v5)
                goto LABEL_b76a24;
LABEL_b76994:
            v13 = v10 != 0;
            if (v6)
                v13 += v11 - v6 >> 6;
            if (v7 < v13)
                goto LABEL_b76a38;
            goto LABEL_b769b4;
        }
        goto LABEL_b76a0c;
    }
    else
    {
        if (v6)
        {
            v7 = a1[3] - v6 >> 6;
            if (v7)
                goto LABEL_b76970;
LABEL_b76a0c:
            ptr = 8;
            v0 = CONCAT(8, v7);
            v2 = 0;
            v10 = a1[1];
            v11 = a1[3];
            if ((unsigned int)v5)
                goto LABEL_b76994;
LABEL_b76a24:
            if (!v6)
            {
                idx = 0;
            }
            else if (v11 - v6 >> 6 <= v7)
            {
LABEL_b769b4:
                index = 0;
                if (!v10)
                    v16 = 0;
                else
                    v16 = (unsigned int)v5;
                if (v16 == 1)
                    goto LABEL_b769c8;
                goto LABEL_b769d0;
            }
            else
            {
LABEL_b76a38:
                sub_c6c0cc(&v0, 0);
                ptr = *(unsigned long long *)((void*)&v0 + 8);
                index = v2;
                if (!v10)
                    v17 = 0;
                else
                    v17 = (unsigned int)v5;
                if (v17 == 1)
                {
LABEL_b769c8:
                    *(unsigned long long *)(ptr + index * 8) = v10;
                    index += 1;
                }
LABEL_b769d0:
                if (v6 && v6 != v11)
                {
                    v18 = v11 - v6;
                    v19 = v18 >> 6;
                    if (0x100 > v18)
                    {
                        v20 = 0;
                        idx = index;
                    }
                    else
                    {
                        v20 = v19 & 0x3fffffffffffffc;
                        idx = index + v20;
                        iter = ptr + index * 8 + 16;
                        v23 = _mm_set_epi64x(1, 0);
                        i = v19 & 0x3fffffffffffffc;
                        do
                        {
                            v25 = i;
                            v26 = _mm_add_epi64(CONCAT(v6, v6), _mm_slli_epi64(v23, 6));
                            *(uint128_t *)((char *)iter - 16) = v26;
                            *iter = _mm_add_epi64(v26, _mm_set1_epi64x(128));
                            v23 = _mm_add_epi64(v23, _mm_set1_epi64x(4));
                            iter += 2;
                            i = v25 - 4;
                        } while (i);
                        if (v19 == v20)
                        {
                            a0->field_0 = v0;
                            a0->field_10 = idx;
                            return (unsigned long long)v0;
                        }
                    }
                    j = v19 - v20;
                    v29 = v6 + v20 * 64;
                    do
                    {
                        v30 = j;
                        *(unsigned long long *)(ptr + idx * 8) = v29;
                        idx += 1;
                        v29 += 64;
                        j = v30 - 1;
                    } while (j);
                }
                else
                {
                    idx = index;
                }
            }
        }
        else
        {
            idx = 0;
            v0 = CONCAT(8, 0);
            v2 = 0;
        }
        a0->field_0 = v0;
        a0->field_10 = idx;
        return (unsigned long long)v0;
    }
}
