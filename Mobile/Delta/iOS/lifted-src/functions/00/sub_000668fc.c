/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x668fc..0x669b4 (184 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_668fc_0 {
    char padding_0[8];
    void* field_8;
} st_668fc_0;

typedef struct st_668fc_1 {
    char field_0;
} st_668fc_1;


long long sub_668fc(st_668fc_0 *a0, unsigned long a1, char *a2, unsigned long a3)
{
    void* v4;  // x9
    void* node;  // x10
    unsigned long long v14;  // x13
    uint128_t *iter;  // x14
    uint128_t *iter1;  // x15
    unsigned long long i;  // x16
    unsigned long long v18;  // x16
    uint128_t v19;  // q1
    char *j;  // x11
    unsigned long v7;  // cc_dep1
    unsigned long long v8;  // x12
    unsigned long long v9;  // x13
    unsigned long long v10;  // 4110
    unsigned long long v11;  // 4102
    unsigned long long v12;  // 4110
    unsigned long long v13;  // 4102
    st_668fc_1 **v0;  // [bp-0x20], Other Possible Types: char
    st_668fc_1 *v1;  // [bp-0x18]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = a0->field_8;
    node = v4;
    j = a1 + v4 - a3;
    v7 = j;
    if (a2 <= j)
    {
        a0->field_8 = node;
        v1 = &v0;
        v0 = &v1;
        return sub_6505c(v4 - (v4 - a3));
    }
    v8 = &a2[a3 + -1 * a1] - v4;
    v9 = a3 - a1;
    if (32 <= v8)
    {
        v10 = arm64g_calculate_condition(36, v7, a2, 0);
        v11 = arm64g_calculate_condition(148, (v10 & 1 ? v9 : 0), (v10 & 1 ? 31 : 0), 0);
        if (!(v11 & 1))
            goto LABEL_66940;
    }
    else
    {
        v12 = arm64g_calculate_condition(36, v7, a2, 0);
        v13 = arm64g_calculate_condition(144, (v12 & 1 ? v9 : 0), (v12 & 1 ? 31 : 0), 0);
        if (!(v13 & 1))
        {
LABEL_66940:
            v14 = v8 & 0xffffffffffffffe0;
            j = &j[v14];
            node = v4 + v14;
            iter = v4 + 16;
            iter1 = a1 + (char *)iter - a3;
            i = v14;
            do
            {
                v18 = i;
                v19 = *iter1;
                *(int128_t *)((char *)iter - 16) = *(int128_t *)((char *)iter1 - 16);
                *iter = v19;
                iter += 2;
                iter1 += 2;
                i = v18 - 32;
            } while (i);
            if (v8 == v14)
            {
                a0->field_8 = node;
                v1 = &v0;
                v0 = &v1;
                return sub_6505c(v4 - (v4 - a3));
            }
        }
    }
    do
    {
        *(char *)node = *j;
        node += 1;
        j += 1;
    } while (j < a2);
    a0->field_8 = node;
    v1 = &v0;
    v0 = &v1;
    return sub_6505c(v4 - (v4 - a3));
}
