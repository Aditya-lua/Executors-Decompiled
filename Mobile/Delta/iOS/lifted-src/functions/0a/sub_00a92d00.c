/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa92d00..0xa92eec (492 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void sub_a92d00(void* a0, void* a1, unsigned long long a2, unsigned long a3, void* a4, unsigned long long *a5)
{
    void* v2;  // x8
    void* v3;  // x8
    unsigned long long v12;  // x10
    unsigned long long iter;  // x24
    uint128_t *node;  // x9
    uint128_t *iter1;  // x8
    uint128_t *iter2;  // x10
    uint128_t v8;  // q1
    uint128_t v9;  // q3
    unsigned long long v10;  // x9
    unsigned long long v11;  // x9
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a2)
    {
        return;
    }
    else if (a2 >= 16)
    {
        v2 = a4;
        *(long long *)a1 = *(long long *)v2 ^ *(long long *)a0;
        *(long long *)&a1[8] = (long long)v2[8] ^ (long long)a0[8];
        a5();
    }
    else
    {
        v3 = a4;
        iter = a2;
        if (31 < iter && a1 - a0 >= 32 && a1 - v3 >= 32)
        {
            node = a0 + 16;
            iter1 = v3 + 16;
            iter2 = a1 + 16;
            while (1)
            {
                v8 = *node;
                v9 = *iter1;
                *(int128_t *)((char *)iter2 - 16) = *(int128_t *)((char *)node - 16) ^ *(int128_t *)((char *)iter1 - 16);
                *iter2 = v8 ^ v9;
                node += 2;
                iter1 += 2;
                iter2 += 2;
            }
        }
        v10 = 0;
        do
        {
            *((char *)a1 + v10) = *((char *)v3 + v10) ^ *((char *)a0 + v10);
            v10 += 1;
        } while (iter != v10);
        if (14 < v10 - 1)
            a5();
        if (8 >= iter && a1 - v3 > 31)
        {
            v11 = 16 - iter;
            v12 = v11 & 24;
            *(long long *)((char *)a1 + iter) = *(long long *)((char *)v3 + iter);
            if (v12 != 8)
                *(long long *)((char *)a1 + iter + 8) = *(long long *)((char *)v3 + iter + 8);
            iter += v12;
            if (v11 == v12)
                a5();
        }
        do
        {
            *((char *)a1 + iter) = *((char *)v3 + iter);
            iter += 1;
        } while (iter != 16);
        a5();
    }
}
