/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e53a8..0x9e5528 (384 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9e53a8_0 {
    struct st_9e53a8_1 *field_0;
    unsigned int field_8;
    char padding_c[8];
    char field_14;
} st_9e53a8_0;

typedef struct st_9e53a8_1 {
    unsigned long long field_0;
} st_9e53a8_1;


unsigned long long sub_9e53a8(st_9e53a8_0 *a0, char a1)
{
    unsigned long long *v0;  // x11
    unsigned long long *v1;  // x8
    unsigned long long *iter;  // x13
    unsigned long long *node;  // x14
    unsigned long long v12;  // x12
    unsigned long v13;  // x15
    unsigned long v14;  // x16
    unsigned long v15;  // x17
    unsigned int v16;  // w1
    unsigned int v17;  // w15
    unsigned long long *v19;  // x11
    unsigned long v2;  // x9
    unsigned long long j;  // w12
    unsigned long long v21;  // w12
    unsigned long long *v22;  // x11
    unsigned int v23;  // w13
    unsigned long long *v25;  // x8
    unsigned long long k;  // w9
    unsigned long long v27;  // w9
    unsigned long long v28;  // x0
    unsigned long long *v29;  // x8
    unsigned long v3;  // x10
    unsigned int v30;  // w10
    unsigned long v4;  // x9
    unsigned long long v5;  // 4110
    unsigned long v6;  // x9
    unsigned long v7;  // x10
    unsigned long long i;  // x12
    char v9;  // x0

    if (!a0 || !a1)
        return (!a1) - (!a0);
    v0 = a0->field_0;
    v1 = *(long long *)a1;
    if (!(a0->field_14 >> 2 & 1) && !((char)(*(char *)(a1 + 20)) >> 2 & 1))
    {
        v2 = a0->field_8;
        v3 = *(int *)(a1 + 8);
        if ((unsigned int)v2 != (unsigned int)v3)
            return v2 - v3;
        do
        {
            v4 = v2;
            if ((int)v4 < 1)
                return 0;
        } while ((v2 = v4 - 1, *(long long *)((char *)&v0[v4] - 8) == *(long long *)((char *)&v1[v4] - 8)));
        v5 = arm64g_calculate_condition(132, *(long long *)((char *)&v0[v4] - 8), *(long long *)((char *)&v1[v4] - 8), 0);
        if (!(v5 & 1))
            return 0xfffffffe;
        return 1;
    }
    v6 = a0->field_8;
    v7 = *(int *)(a1 + 8);
    if ((int)v6 < (int)v7)
        i = v6 & 0xffffffff;
    else
        i = v7 & 0xffffffff;
    if ((int)i >= 1)
    {
        v9 = 0;
        iter = v0;
        node = v1;
        do
        {
            v12 = i;
            v13 = *iter;
            iter += 1;
            v14 = *node;
            node += 1;
            v15 = v14 ^ v13;
            v16 = (long long)((v13 - v14 ^ v14 | v15) ^ v13) >> 63;
            v17 = (long long)((v14 - v13 ^ v13 | v15) ^ v14) >> 63;
            v9 = ~v17 & (~v16 & v9 | v16) | v17 & 1;
            i = v12 - 1;
        } while (i);
        if ((int)v7 < (int)v6)
            goto LABEL_9e5470;
    }
    else
    {
        v9 = 0;
        if ((int)v6 > (int)v7)
        {
LABEL_9e5470:
            v19 = &v0[v7];
            j = (unsigned int)(v6 - v7);
            do
            {
                v21 = j;
                v22 = v19 + 1;
                v23 = (long long)(*v19 - 1 & ~*v19) >> 63;
                v9 = ~v23 & 1 | v23 & v9;
                v19 = v22;
                j = v21 - 1;
            } while (j);
        }
    }
    if ((int)v7 <= (int)v6)
        return v9;
    v25 = &v1[v6];
    k = (unsigned int)(v7 - v6);
    do
    {
        v27 = k;
        v28 = v9;
        v29 = v25 + 1;
        v30 = (long long)(*v25 - 1 & ~*v25) >> 63;
        v9 = ~v30 | v30 & (unsigned int)v28;
        v25 = v29;
        k = v27 - 1;
    } while (k);
    return ~v30 | v30 & (unsigned int)v28;
    return (!a1) - (!a0);
}
