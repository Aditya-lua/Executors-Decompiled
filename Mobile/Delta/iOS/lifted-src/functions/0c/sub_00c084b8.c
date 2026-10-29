/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc084b8..0xc085b8 (256 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void* sub_c084b8(void* a0, unsigned long long a1)
{
    unsigned long long iter;  // x10
    unsigned long v1;  // x11
    unsigned long long i;  // x12
    uint128_t v11;  // q0
    uint128_t v12;  // q1
    uint128_t v13;  // q2
    uint128_t v14;  // q3
    uint128_t v15;  // q0
    unsigned long long j;  // x8
    unsigned long long v18;  // x10
    void* node;  // x9
    unsigned long v2;  // x11
    unsigned long long *iter1;  // x10
    unsigned long long v21;  // x8
    unsigned long v22;  // x11
    unsigned long v3;  // x11
    unsigned long v4;  // x12
    unsigned long v5;  // x12
    unsigned long long v6;  // x8
    unsigned long long v7;  // x9
    uint128_t *iter2;  // x10
    uint128_t *v9;  // x11

    iter = 2;
    v1 = (long long)a0[8];
    v2 = v1;
    v3 = v1;
    if ((unsigned long long)*(long long *)a0 > v2)
    {
        do
        {
            v4 = *(long long *)((char *)a0 + 8 * iter);
            if (v2 <= (unsigned long long)*(long long *)((char *)a0 + 8 * iter))
                goto LABEL_c0850c;
        } while ((iter += 1, v2 = v4, a1 != iter));
    }
    else
    {
        while (1)
        {
            v5 = *(long long *)((char *)a0 + 8 * iter);
            if ((unsigned long long)*(long long *)((char *)a0 + 8 * iter) < v3)
                break;
            iter += 1;
            v3 = v5;
            if (a1 == iter)
                goto LABEL_c08514;
        }
LABEL_c0850c:
    }
LABEL_c08514:
    if ((unsigned long long)*(long long *)a0 <= v1)
        return a0;
    v6 = a1 >> 1;
    v7 = v6 & 0x7fffffffffffffc;
    iter2 = a0 + 16;
    v9 = a0 + a1 * 8 - 16;
    i = v6 & 0x7fffffffffffffc;
    do
    {
        v11 = *(int128_t *)((char *)iter2 - 16);
        v12 = *iter2;
        v13 = __dirty_unsupported_Iop_SliceV128(*v9, *v9, 8);
        v14 = __dirty_unsupported_Iop_SliceV128(*(int128_t *)((char *)v9 - 16), *(int128_t *)((char *)v9 - 16), 8);
        *(uint128_t *)((char *)iter2 - 16) = v13;
        *iter2 = v14;
        v15 = __dirty_unsupported_Iop_SliceV128(v11, v11, 8);
        *(uint128_t *)((char *)v9 - 16) = __dirty_unsupported_Iop_SliceV128(v12, v12, 8);
        *v9 = v15;
        iter2 += 2;
        v9 = (char *)v9 - 32;
        i -= 4;
    } while (i);
    j = v6 - v7;
    if (v6 == v7)
        return a0;
    v18 = a1 * 4 & 0xffffffffffffffe0;
    node = a0 + v18;
    iter1 = a0 - v18 + a1 * 8 - 8;
    do
    {
        v21 = j;
        v22 = *(long long *)node;
        *(unsigned long long *)node = *iter1;
        node += 8;
        *iter1 = v22;
        iter1 = (char *)iter1 - 8;
        j = v21 - 1;
    } while (j);
    return a0;
}
