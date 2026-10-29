/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x429728..0x429824 (252 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_429728_0 {
    char padding_0[8];
    void* field_8;
} st_429728_0;

typedef struct st_429728_1 {
    char field_0;
} st_429728_1;

extern unsigned long long g_e801f8;

void sub_429728(st_429728_0 *a0, unsigned long a1, unsigned long long *a2, unsigned long a3)
{
    unsigned long long v5;  // x30
    unsigned long long *v6;  // x9
    unsigned long long v15;  // 4110
    unsigned long long *j;  // x11
    unsigned long long v17;  // 4110
    unsigned long long v18;  // 4110
    unsigned long long v19;  // 4110
    unsigned long long v20;  // x12
    unsigned long long v21;  // x13
    unsigned long long v22;  // x10
    uint128_t *iter;  // x14
    uint128_t *node;  // x15
    void* v7;  // x2
    unsigned long long i;  // x16
    unsigned long long v26;  // x16
    uint128_t v27;  // q1
    unsigned long long *v29;  // x11
    unsigned long long *v8;  // x1
    void* iter1;  // x10
    unsigned long long *v10;  // x10
    unsigned long v11;  // cc_dep1
    unsigned long v12;  // cc_dep2
    unsigned long long v13;  // x12
    unsigned long long v14;  // x10
    st_429728_1 **v0;  // [bp-0x20], Other Possible Types: char
    st_429728_1 *v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    unsigned long long v3;  // [bp-0x8]
    char v4;  // [bp+0x0]

    v2 = &v4;
    v3 = v5;
    v6 = a2;
    v1 = &v0;
    v0 = &v1;
    v7 = a0->field_8;
    v8 = a1 + v7 - a3;
    iter1 = v7;
    if (v6 > v8)
    {
        v10 = v7 + a1 - a3 + 8;
        v11 = v6;
        v12 = v10;
        if (v10 < v6)
            v10 = v6;
        v13 = v10 + a3 + ~v7 - a1;
        v14 = a3 - a1;
        if (24 <= v13)
        {
            v15 = arm64g_calculate_condition(36, v11, v12, 0);
            j = v8;
            iter1 = v7;
            v17 = arm64g_calculate_condition(148, (v15 & 1 ? v14 : 0), (v15 & 1 ? 31 : 0), 0);
            if (!(v17 & 1))
                goto LABEL_4297a0;
        }
        else
        {
            v18 = arm64g_calculate_condition(36, v11, v12, 0);
            j = v8;
            iter1 = v7;
            v19 = arm64g_calculate_condition(144, (v18 & 1 ? v14 : 0), (v18 & 1 ? 31 : 0), 0);
            if (!(v19 & 1))
            {
LABEL_4297a0:
                v20 = (v13 >> 3) + 1;
                v21 = v20 & 0x3ffffffffffffffc;
                v22 = v21 * 8;
                j = (char *)v8 + v22;
                iter1 = v7 + v22;
                iter = v7 + 16;
                node = a1 + (char *)iter - a3;
                i = v21;
                do
                {
                    v26 = i;
                    v27 = *node;
                    *(int128_t *)((char *)iter - 16) = *(int128_t *)((char *)node - 16);
                    *iter = v27;
                    iter += 2;
                    node += 2;
                    i = v26 - 4;
                } while (i);
                if (v20 == v21)
                    goto LABEL_4297f8;
            }
        }
        do
        {
            v29 = j + 1;
            *(unsigned long long *)iter1 = *j;
            iter1 += 8;
            j = v29;
        } while (j < v6);
    }
LABEL_4297f8:
    a0->field_8 = iter1;
    (g_e801f8 - 0x6b3a3f00)();
}
