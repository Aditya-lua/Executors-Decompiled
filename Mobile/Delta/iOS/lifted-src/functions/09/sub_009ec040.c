/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9ec040..0x9ec168 (296 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


char * sub_9ec040(char *a0, void* a1, unsigned long long a2)
{
    unsigned long long iter;  // x8
    unsigned long long v1;  // x9
    void* v10;  // x10
    double *v11;  // x11
    unsigned long long l;  // x12
    unsigned long long v13;  // x13
    double *v14;  // x11
    unsigned long v15;  // d0
    unsigned long iter1;  // x8
    unsigned long long i;  // x9
    unsigned long long v18;  // x9
    void* v19;  // x10
    uint128_t *v2;  // x10
    unsigned long long j;  // x8
    char *iter2;  // x9
    char *v23;  // x0
    unsigned long long v24;  // x8
    char v25;  // x10
    uint128_t *node;  // x11
    unsigned long long k;  // x12
    uint128_t v5;  // q0
    uint128_t v6;  // q0
    uint128_t v7;  // q1
    unsigned long long v9;  // x13

    if (a1)
    {
        if (a2)
        {
            iter = &a0[a2];
            if (a2 < 8 || a1 + a2 > a0 && iter > a1)
            {
                v1 = 0;
                v10 = a1;
            }
            else if (32 > a2)
            {
                v1 = 0;
LABEL_9ec118:
                v9 = v1;
                v1 = a2 & 0xfffffffffffffff8;
                iter -= v1;
                v10 = a1 + v1;
                v11 = a1 + v9;
                l = v9 - v1;
                v13 = &a0[-1 * v9] - 8;
                do
                {
                    v14 = v11 + 1;
                    v15 = __dirty_unsupported_Iop_ZeroHI64ofV128(__dirty_unsupported_Iop_Reverse8sIn64_x2(*(unsigned long long *)&*v11));
                    *(unsigned long *)(v13 + a2) = v15;
                    v13 -= 8;
                    l += 8;
                    v11 = v14;
                } while (l);
                if (v1 == a2)
                    return a0;
            }
            else
            {
                v1 = a2 & 0xffffffffffffffe0;
                v2 = a1 + 16;
                node = &a0[a2] - 16;
                k = v1;
                do
                {
                    v5 = __dirty_unsupported_Iop_Reverse8sIn64_x2(*(int128_t *)((char *)v2 - 16));
                    v6 = __dirty_unsupported_Iop_SliceV128(v5, v5, 8);
                    v7 = __dirty_unsupported_Iop_Reverse8sIn64_x2(*v2);
                    *(uint128_t *)((char *)node - 16) = __dirty_unsupported_Iop_SliceV128(v7, v7, 8);
                    *node = v6;
                    v2 += 2;
                    node = (char *)node - 32;
                    k -= 32;
                } while (k);
                if (v1 == a2)
                    return a0;
                if (a2 & 24)
                    goto LABEL_9ec118;
                v10 = a1 + v1;
                iter -= v1;
            }
            iter1 = iter - 1;
            i = a2 - v1;
            do
            {
                v18 = i;
                v19 = v10 + 1;
                *(char *)iter1 = *(char *)v10;
                iter1 -= 1;
                i = v18 - 1;
                v10 = v19;
            } while (i);
            return a0;
        }
        else
        {
            return a0;
        }
    }
    else
    {
        if (a2 >= 2)
        {
            j = a2 >> 1;
            iter2 = &a0[a2] - 1;
            do
            {
                v23 = a0;
                v24 = j;
                v25 = *iter2;
                *iter2 = *v23;
                iter2 -= 1;
                *v23 = v25;
                j = v24 - 1;
                a0 = v23 + 1;
            } while (j);
            return v23 + 1;
        }
        else
        {
            return a0;
        }
    }
}
