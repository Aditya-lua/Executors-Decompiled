/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1f7d6c..0x1f7e80 (276 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1f7d6c_1 {
    uint128_t *field_0;
    unsigned long long field_8;
} st_1f7d6c_1;

typedef struct st_1f7d6c_0 {
    char field_0;
} st_1f7d6c_0;

extern char g_cd6d08;
extern char g_cd6d18;
extern unsigned int g_d0a170[4];

int sub_1f7d6c(unsigned long a0, st_1f7d6c_1 *a1, unsigned long long a2)
{
    unsigned long long v4;  // w19
    unsigned long long v5;  // 4164
    uint128_t *iter;  // x13
    unsigned long long j;  // x14
    unsigned long long v16;  // x14
    uint128_t v17;  // q1
    unsigned long long v19;  // x12
    unsigned int *v20;  // x8
    unsigned int *node;  // x9
    unsigned long long i;  // x10
    unsigned long long v23;  // x10
    unsigned long long v6;  // w8
    unsigned long long v26;  // 4130
    unsigned int *v7;  // x8
    unsigned long long v8;  // x20
    unsigned long v9;  // x8
    uint128_t *v10;  // x9
    unsigned long long v11;  // x12
    unsigned long long v12;  // x11
    unsigned long long iter1;  // x12
    st_1f7d6c_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_1f7d6c_0 *v1;  // [bp-0x38]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = a2;
    v1 = &v0;
    v0 = &v1;
    v5 = arm64g_calculate_condition(1, a2, 1, 0);
    if (!(v5 & 1))
    {
        if (v4 == 47)
            v6 = 8;
        else
            v6 = v4;
        v7 = &g_d0a170[2 * v6];
        v8 = v7[1] * 2;
        sub_1fb614();
        if ((unsigned int)v8)
        {
            v9 = *v7 * 2;
            v10 = a1->field_0;
            if ((unsigned int)v8 < 8 || (v11 = v9 * 4, 32 > (char *)v10 - v11 - 13462792))
            {
                v12 = 0;
            }
            else
            {
                v12 = v8 & 0xfffffff8;
                iter1 = &(&g_cd6d18)[v11];
                iter = v10 + 1;
                j = v12;
                do
                {
                    v16 = j;
                    v17 = *(int128_t *)iter1;
                    *(int128_t *)((char *)iter - 16) = *(int128_t *)(iter1 - 16);
                    *iter = v17;
                    iter1 += 32;
                    iter += 2;
                    j = v16 - 8;
                } while (j);
                if (v12 == v8)
                {
                    v26 = arm64g_calculate_condition(1, v4, 1, 0);
                    return !(v26 & 1);
                }
            }
            v19 = v12 * 4;
            v20 = &(&g_cd6d08)[4 * v9 + v19];
            node = (char *)v10 + v19;
            i = v8 - v12;
            do
            {
                v23 = i;
                *node = *v20;
                node += 1;
                v20 += 1;
                i = v23 - 1;
            } while (i);
        }
    }
    else
    {
        a1->field_8 = 0;
    }
    v26 = arm64g_calculate_condition(1, v4, 1, 0);
    return !(v26 & 1);
}
