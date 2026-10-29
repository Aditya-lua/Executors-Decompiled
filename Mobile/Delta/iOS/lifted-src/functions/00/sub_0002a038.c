/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2a038..0x2a0dc (164 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2a038_0 {
    char padding_0[8];
    void* field_8;
} st_2a038_0;


st_2a038_0 * sub_2a038(st_2a038_0 *a0, unsigned long long a1, char *a2)
{
    void* v0;  // x11
    void* node;  // x10
    unsigned long long v10;  // x13
    unsigned long long *iter;  // x11
    unsigned long long v12;  // x12
    unsigned long long v14;  // 4109
    void* v2;  // x8
    char v3;  // x9
    unsigned long long v4;  // x12
    uint128_t v5;  // q0
    uint128_t *iter1;  // x10
    unsigned long long i;  // x13
    unsigned long long v8;  // x13

    v0 = a0->field_8;
    node = v0;
    if (a1)
    {
        v2 = v0 + a1;
        v3 = *a2;
        if (a1 >= 8)
        {
            if (32 > a1)
            {
                v4 = 0;
LABEL_2a094:
                v10 = a1 & 0xfffffffffffffff8;
                node = v0 + v10;
                iter = v0 + v4;
                v12 = v4 - v10;
                do
                {
                    *iter = v3 | v3 * 0x100 | (v3 | v3 * 0x100) * 0x10000 | (v3 | v3 * 0x100 | (v3 | v3 * 0x100) * 0x10000) * 0x100000000;
                    iter += 1;
                    v14 = arm64g_calculate_condition(18, v12, 8, 0);
                    v12 += 8;
                } while (v14 & 1);
                if (v10 == a1)
                    goto LABEL_2a0d0;
            }
            else
            {
                v4 = a1 & 0xffffffffffffffe0;
                v5 = CONCAT(v3 | v3 * 0x100 | (v3 | v3 * 0x100) * 0x10000 | (v3 | v3 * 0x100 | (v3 | v3 * 0x100) * 0x10000) * 0x100000000, v3 | v3 * 0x100 | (v3 | v3 * 0x100) * 0x10000 | (v3 | v3 * 0x100 | (v3 | v3 * 0x100) * 0x10000) * 0x100000000);
                iter1 = v0 + 16;
                i = v4;
                do
                {
                    v8 = i;
                    *(uint128_t *)((char *)iter1 - 16) = v5;
                    *iter1 = v5;
                    iter1 += 2;
                    i = v8 - 32;
                } while (i);
                if (v4 == a1)
                    goto LABEL_2a0d0;
                if (a1 & 24)
                    goto LABEL_2a094;
                node = v0 + v4;
            }
        }
        do
        {
            *(char *)node = v3;
            node += 1;
        } while (node != v2);
LABEL_2a0d0:
        node = v2;
    }
    a0->field_8 = node;
    return a0;
}
