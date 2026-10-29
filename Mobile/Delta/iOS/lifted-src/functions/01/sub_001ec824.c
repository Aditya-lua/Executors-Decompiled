/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1ec824..0x1eca24 (512 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1ec824_1 {
    void* field_0;
    unsigned long long field_8;
} st_1ec824_1;

typedef struct st_1ec824_2 {
    struct st_1ec824_3 *field_0;
    unsigned long long field_8;
    char padding_10[8];
    unsigned long long field_18;
} st_1ec824_2;

typedef struct st_1ec824_3 {
    unsigned int field_0;
} st_1ec824_3;

typedef struct st_1ec824_0 {
    char field_0;
} st_1ec824_0;


long long sub_1ec824(st_1ec824_1 *a0, st_1ec824_2 *a1)
{
    unsigned int v8;  // w21
    unsigned long j;  // x21
    unsigned long v18;  // x10
    __m128i v19;  // q1
    unsigned long idx;  // x9
    unsigned int v22;  // w0
    unsigned long index;  // x8
    unsigned long idx1;  // x23
    unsigned int i;  // w24
    unsigned long node;  // x25
    unsigned long v13;  // x26
    unsigned int v14;  // w0
    void* v15;  // x8
    uint128_t *iter;  // x9
    unsigned long k;  // x10
    __m128i v0;  // [bp-0x90]
    st_1ec824_0 **v1;  // [bp-0x78], Other Possible Types: char
    st_1ec824_0 *v2;  // [bp-0x70]
    unsigned long v3;  // [bp-0x68]
    unsigned long v4;  // [bp-0x60]
    unsigned long v5;  // [bp-0x58]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v2 = &v1;
    v3 = 0;
    v1 = &v2;
    if (a0->field_8 < a1->field_8)
        v8 = a0->field_8;
    else
        v8 = a1->field_8;
    v4 = 0;
    v5 = 0;
    sub_1f10ac();
    sub_1eccac(&v3);
    if (sub_1eca80(a1) && sub_1eca80(a0))
        sub_1fb59c(a0);
    if (v8 < 3)
        return sub_1f2420(a0);
    j = 2;
    do
    {
        idx1 = j - 1;
        i = *(int *)&a1->field_0[idx1];
        node = *(int *)&a1->field_0[j];
        if (i > (unsigned int)node)
        {
            if (j >= 8)
            {
                v13 = j & 0x7ffffffffffffff8;
                v0 = (__m128i)(CONCAT(j & 0xffffffff | (j & 0xffffffff) * 0x100000000, j & 0xffffffff | (j & 0xffffffff) * 0x100000000));
                do
                {
                    v14 = sub_1f3f34(a0, a1->field_18 + (node & 0xffffffff) * 4, j);
                    if ((unsigned int)*(int *)((char *)a0->field_0 + 4 * idx1) <= v14)
                    {
                        node += j;
                    }
                    else
                    {
                        sub_1ed8d8(&a0[1].field_8, v14, j);
                        v15 = a0->field_0;
                        iter = v15 + 16;
                        k = v13;
                        do
                        {
                            v18 = k;
                            v19 = *iter;
                            *(uint128_t *)((char *)iter - 16) = _mm_sub_epi32(*(int128_t *)((char *)iter - 16), v0);
                            *iter = _mm_sub_epi32(v19, v0);
                            iter += 2;
                            k = v18 - 8;
                        } while (k);
                        idx = v13;
                        if (j != idx)
                        {
                            do
                            {
                                *(unsigned int *)((char *)v15 + 4 * idx) = *(int *)((char *)v15 + 4 * idx) - j;
                                idx += 1;
                            } while (j != idx);
                        }
                    }
                } while (i > (unsigned int)node);
            }
            else
            {
                do
                {
                    v22 = sub_1f3f34(a0, a1->field_18 + (node & 0xffffffff) * 4, j);
                    if ((unsigned int)*(int *)((char *)a0->field_0 + 4 * idx1) <= v22)
                    {
                        node += j;
                    }
                    else
                    {
                        sub_1ed8d8(&a0[1].field_8, v22, j);
                        index = 0;
                        do
                        {
                            *(unsigned int *)((char *)a0->field_0 + 4 * index) = *(int *)((char *)a0->field_0 + 4 * index) - j;
                            index += 1;
                        } while (j != index);
                    }
                } while (i > (unsigned int)node);
            }
        }
    } while ((j += 1, j != v8));
    return sub_1f2420(a0);
}
