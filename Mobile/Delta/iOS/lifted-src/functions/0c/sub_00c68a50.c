/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc68a50..0xc68d10 (704 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c68a50_0 {
    char field_0;
    char padding_1[7];
    unsigned long long field_8;
} st_c68a50_0;


int sub_c68a50(void* a0, void* a1, unsigned long long a2)
{
    unsigned long v3;  // x8
    unsigned long long v4;  // x22
    unsigned long long v14;  // x10
    unsigned long long v15;  // x11
    unsigned long long v16;  // x12
    unsigned long long v17;  // x8
    unsigned long long v18;  // x9
    unsigned long long j;  // x9
    unsigned long long v21;  // x23
    unsigned long long k;  // x9
    unsigned long v5;  // x9
    unsigned long long v23;  // x11
    unsigned long long v24;  // x9
    unsigned long long v25;  // x10
    unsigned long v27;  // x8
    unsigned long long v28;  // x0
    st_c68a50_0 *iter;  // x8
    unsigned long v6;  // x11
    void* v7;  // x9
    unsigned long long v8;  // x10
    unsigned long i;  // x2
    st_c68a50_0 *v10;  // x8
    unsigned long v11;  // x2
    unsigned long long v12;  // x9
    unsigned long long v0;  // [bp-0x48]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = (long long)a0[24];
    v4 = v3 - (long long)a1[24];
    if (v3 == (long long)a1[24])
    {
        v5 = (int)a1[32];
        if (v5 & 1)
        {
            return 0;
        }
        else if (v5 >> 1 & 1)
        {
            if (a2)
            {
                v6 = (long long)a1[16];
                v7 = a1 + 8;
                v8 = (long long)a0[16] - v6;
                if (v8 == (long long)a1[8])
                {
                    *(unsigned long long *)&a0[16] = v8;
                    *(unsigned long *)&a0[24] = v3 - v6;
                }
                *(unsigned long long *)v7 = 0;
                *(unsigned long long *)&v7[8] = 0;
            }
            else
            {
                return 0;
            }
        }
    }
    i = (long long)a1[16];
    if (i)
    {
        v10 = (long long)a0[8];
        if ((long long)a0[8] || *(long long *)a0 && !(v10 = *(long long *)(*(long long *)a0 + 8), !v10))
        {
            if (!((char)((char)a1[32]) >> 2 & 1))
            {
                do
                {
                    v11 = i;
                    v12 = v4;
                    *(&(&v10->field_0)[a1[8] + v11] - 1) = v12;
                    v4 >>= 8;
                    i = v11 - 1;
                } while (i);
                if (0xff < v12)
                    return 0;
            }
            else
            {
                v14 = 1;
                v15 = 2;
                v16 = 4;
                if (v4 > 0x3fffffff)
                    v16 = ((v4 <= 0x3fffffffffffffff) * 8 | (char)(v4 <= 0x3fffffffffffffff) >> 61) & 0x7fffffff8 & 0x7ffffffff;
                if (v4 >= 0x4000)
                    v15 = v16;
                if (v4 >= 64)
                    v14 = v15;
                if (v14 > i)
                    return 0;
                sub_a7afa0(&(&v10->field_0)[a1[8]], v4);
            }
        }
    }
    else if ((char)a0[48] & 1 && *(long long *)a1)
    {
        if (v4)
        {
            if (v4 < 0x100)
                goto LABEL_c68cbc;
            v17 = 0;
            v18 = v4;
            do
            {
                j = v18;
                v17 += 1;
                v18 = j >> 8;
            } while (0x10000 <= j);
            if (7 < v17)
                return 0;
            v21 = v17 + 1;
            goto LABEL_c68b44;
        }
        else if (!((char)((char)a1[32]) >> 1 & 1))
        {
LABEL_c68cbc:
            v21 = 1;
LABEL_c68b44:
            if (!sub_c68684(a0, v21, &v0))
                return 0;
            *(__m128i *)&a0[16] = _mm_add_epi64((int128_t)a0[16], CONCAT(v21, v21));
            if (v0)
            {
                k = v21;
                v23 = v4;
                do
                {
                    v24 = k;
                    v25 = v23;
                    *(char *)(v0 - 1 + v24) = v25;
                    v23 >>= 8;
                    k = v24 - 1;
                } while (k);
                if (0xff < v25)
                    return 0;
            }
            if (v4 >= 128)
            {
                if ((long long)a0[40])
                {
                    v27 = (long long)a0[24];
                    if ((long long)a0[32] == v27)
                        return 0;
                    if (*(long long *)a0 && *(long long *)*(long long *)a0 == v27)
                    {
                        if (1 >= v27)
                            v27 = 1;
                        v28 = sub_9ebd68();
                        if (!v28)
                            return v28;
                    }
                    iter = (long long)a0[8];
                    if ((long long)a0[8] || (iter = *(long long *)a0, iter && !(iter = iter->field_8, !iter)))
                    {
                        if (!((char)a0[48] & 1))
                            iter = &(&iter->field_0)[a0[16]];
                        else
                            iter = &(&iter->field_0)[a0[32] + ~(long long)a0[16]];
                    }
                    *(__m128i *)&a0[16] = _mm_add_epi64((int128_t)a0[16], _mm_set1_epi64x(1));
                    if (iter)
                        iter->field_0 = (char)v21 | 128;
                }
                else
                {
                    return 0;
                }
            }
        }
    }
    if (a2)
    {
        *(long long *)&a0[40] = *(long long *)a1;
        sub_a6c2e4(a1, "crypto/packet.c", 314);
    }
    return 1;
}
