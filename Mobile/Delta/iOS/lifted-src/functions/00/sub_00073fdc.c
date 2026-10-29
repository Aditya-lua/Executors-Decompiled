/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x73fdc..0x740a4 (200 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_73fdc_0 {
    char padding_0[16];
    void* field_10;
} st_73fdc_0;


st_73fdc_0 * sub_73fdc(st_73fdc_0 *a0, void* iter, unsigned long a2)
{
    void* v0;  // x10
    void* node;  // x9
    unsigned long long v10;  // x12
    void* v11;  // x14
    unsigned long long *iter1;  // x10
    unsigned long long v13;  // x11
    void* v14;  // x14
    unsigned long long v16;  // 4112
    void* v17;  // x1
    void* v2;  // x8
    unsigned long long v3;  // x11
    uint128_t *iter2;  // x9
    uint128_t *v5;  // x12
    unsigned long long i;  // x13
    unsigned long long v7;  // x13
    uint128_t v8;  // q1

    v0 = a0->field_10;
    node = v0;
    if (a2)
    {
        v2 = v0 + a2;
        if (a2 >= 8 && v0 - iter >= 32)
        {
            if (32 > a2)
            {
                v3 = 0;
LABEL_74048:
                v10 = a2 & 0xfffffffffffffff8;
                node = v0 + v10;
                v11 = iter + v3;
                iter1 = v0 + v3;
                v13 = v3 - v10;
                do
                {
                    v14 = v11 + 8;
                    *(double *)iter1 = *(double *)v11;
                    iter1 += 1;
                    v16 = arm64g_calculate_condition(18, v13, 8, 0);
                    v13 += 8;
                    v11 = v14;
                } while (v16 & 1);
                iter += v10;
                if (v10 == a2)
                    goto LABEL_74098;
            }
            else
            {
                v3 = a2 & 0xffffffffffffffe0;
                iter2 = iter + 16;
                v5 = v0 + 16;
                i = v3;
                do
                {
                    v7 = i;
                    v8 = *iter2;
                    *(int128_t *)((char *)v5 - 16) = *(int128_t *)((char *)iter2 - 16);
                    *v5 = v8;
                    iter2 += 2;
                    v5 += 2;
                    i = v7 - 32;
                } while (i);
                if (v3 == a2)
                    goto LABEL_74098;
                if (a2 & 24)
                    goto LABEL_74048;
                iter += v3;
                node = v0 + v3;
            }
        }
        do
        {
            v17 = iter + 1;
            *(char *)node = *(char *)iter;
            node += 1;
            iter = v17;
        } while (node != v2);
LABEL_74098:
        node = v2;
    }
    a0->field_10 = node;
    return a0;
}
