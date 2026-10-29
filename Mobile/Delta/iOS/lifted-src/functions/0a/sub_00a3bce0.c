/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa3bce0..0xa3be44 (356 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a3bce0_0 {
    char padding_0[4];
    unsigned int field_4;
    unsigned int field_8;
    unsigned int field_c;
} st_a3bce0_0;


st_a3bce0_0 * sub_a3bce0(void* a0, st_a3bce0_0 *a1, unsigned long long a2)
{
    unsigned int v2;  // x24
    st_a3bce0_0 *iter;  // x23
    unsigned int v12;  // x9
    unsigned long long v4;  // x20
    unsigned int v5;  // w9
    unsigned long long v6;  // 4170
    unsigned long long v7;  // 4176
    unsigned long long v8;  // 4118
    unsigned long long v9;  // 4112
    st_a3bce0_0 *v10;  // x22
    unsigned int v11;  // x8
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a2)
        return 0;
    v2 = 0;
    iter = a1;
    do
    {
        v4 = a2;
        v5 = iter->field_4;
        v6 = arm64g_calculate_condition(0x11, v5, 1, 0);
        v7 = arm64g_calculate_condition(1, iter->field_8, 1, 0);
        if ((unsigned int)!(v6 & 1) == (unsigned int)!(v7 & 1) || !(v8 = arm64g_calculate_condition(1, iter->field_c, 1, 0), (v8 & 1 || (int)a0[12] & iter->field_c) && (v9 = arm64g_calculate_condition(1, v5, 1, 0), v9 & 1 || (int)a0[4] == v5 || (int)a0[8] == iter->field_8)))
            continue;
        if ((int)a0[16])
        {
            if ((int)a0[16] == iter[1].padding_0)
                return iter;
        }
        else
        {
            if ((long long)a0[24])
            {
                if ((iter->padding_0 | 2) != 2)
                    continue;
                if (!*(long long *)&iter[1].field_8 || sub_a6e200())
                {
                    if (!*(long long *)iter[2].padding_0 || sub_a6e200((long long)a0[32]))
                        continue;
                    v12 = 0;
                    v11 = (long long)a0[32];
                }
                else
                {
                    v11 = 0;
                    v12 = (long long)a0[24];
                }
                *(unsigned long long *)&a0[24] = v12;
                *(unsigned long long *)&a0[32] = v11;
                return iter;
            }
            else
            {
                if (!(long long)a0[40])
                    break;
                if (!iter->padding_0 || *(int *)a0 == iter->padding_0)
                {
                    v10 = &a1[4 * v2];
                    if (!*(long long *)&iter[2].field_8)
                    {
                        return v10;
                    }
                    else if (!sub_a6e200())
                    {
                        return v10;
                    }
                }
            }
        }
    } while ((v2 += 1, iter += 4, a2 = v4 - 1, v4 != 1));
    return 0;
}
