/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x201a0..0x202ac (268 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_201a0_1 {
    char padding_0[216];
    long long field_d8;
} st_201a0_1;

typedef struct st_201a0_0 {
    char field_0;
} st_201a0_0;


unsigned long long sub_201a0(st_201a0_1 *a0, void* a1, long long a2)
{
    void* v4;  // x0
    unsigned long long v5;  // x8
    void* v14;  // x10
    unsigned long long v15;  // x11
    unsigned long long v18;  // 4112
    void* node;  // x9
    void* v20;  // x10
    unsigned long long j;  // x8
    unsigned long long v22;  // x8
    uint128_t *iter;  // x9
    uint128_t *iter1;  // x10
    unsigned long long i;  // x11
    unsigned long long v9;  // x11
    uint128_t v10;  // q1
    unsigned long long v12;  // x11
    void* iter2;  // x9
    st_201a0_0 **v0;  // [bp-0x30], Other Possible Types: char
    st_201a0_0 *v1;  // [bp-0x28]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    if (!a2)
        return 0;
    v4 = sub_404c(a0->field_d8, a2);
    v5 = 0;
    if ((unsigned long long)a2 >= 8 && v4 - a1 >= 32)
    {
        if (32 > (unsigned long long)a2)
        {
            v5 = 0;
LABEL_20250:
            v12 = v5;
            v5 = a2 & 0xfffffffffffffff8;
            iter2 = v4 + v12;
            v14 = a1 + v12;
            v15 = v12 - v5;
            do
            {
                *(double *)iter2 = *(double *)v14;
                iter2 += 8;
                v18 = arm64g_calculate_condition(18, v15, 8, 0);
                v14 += 8;
                v15 += 8;
            } while (v18 & 1);
            if (v5 == a2)
                return (unsigned int)v4;
        }
        else
        {
            v5 = a2 & 0xffffffffffffffe0;
            iter = v4 + 16;
            iter1 = a1 + 16;
            i = v5;
            do
            {
                v9 = i;
                v10 = *iter1;
                *(int128_t *)((char *)iter - 16) = *(int128_t *)((char *)iter1 - 16);
                *iter = v10;
                iter += 2;
                iter1 += 2;
                i = v9 - 32;
            } while (i);
            if (v5 == a2)
                return (unsigned int)v4;
            if (a2 & 24)
                goto LABEL_20250;
        }
    }
    node = v4 + v5;
    v20 = a1 + v5;
    j = a2 - v5;
    do
    {
        v22 = j;
        *(char *)node = *(char *)v20;
        node += 1;
        j = v22 - 1;
        v20 += 1;
    } while (j);
    return (unsigned int)v4;
}
