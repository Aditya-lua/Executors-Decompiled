/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x97d480..0x97d6b8 (568 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_97d480_0 {
    char padding_0[120];
    long long field_78;
    char padding_80[32];
    long long field_a0;
    char padding_a8[176];
    unsigned int field_158;
} st_97d480_0;


unsigned long long sub_97d480(long long a0, unsigned long long a1, unsigned long long a2, long long a3)
{
    char v8;  // x8
    unsigned int v9;  // w9
    unsigned long v16;  // cc_dep2
    unsigned long v17;  // cc_ndep
    unsigned long v18;  // 4112
    unsigned long v19;  // cc_op
    unsigned long v20;  // cc_dep1
    unsigned long v21;  // cc_op
    unsigned long v22;  // cc_dep1
    unsigned long v23;  // 4112
    unsigned long long v10;  // x0
    unsigned long long v24;  // 4105
    char v11;  // x8
    unsigned long long v12;  // x0
    char v13;  // x0
    unsigned int v15;  // w8
    char v0;  // [bp-0x6c]
    char v1;  // [bp-0x68]
    st_97d480_0 *v2;  // [bp-0x50]
    char v3;  // [bp-0x48]
    char v4;  // [bp-0x40]
    char v5;  // [bp-0x3c]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    if (!sub_97f48c())
        return 0;
    if (72 >= (int)a1)
    {
        if ((int)a1 > 39)
        {
            if ((unsigned int)a1 - 40 < 2)
                return 0;
            if ((unsigned int)a1 == 52)
                return 0;
            goto LABEL_97d55c;
        }
        else if ((unsigned int)a1 != 16)
        {
            if ((unsigned int)a1 != 33)
                goto LABEL_97d55c;
            if (!v5)
            {
                if (!v4)
                    v2->field_158 = v2->field_158 | (unsigned int)a2;
                v8 = v3;
                if (v8)
                {
                    if (!(*(char *)(v8 + 0x88) & 4))
                        v9 = a2;
                    else
                        v9 = (unsigned int)a2 & 0xfffffffe;
                    v10 = *(int *)(v8 + 168) | v9;
                    *(unsigned int *)(v8 + 168) = v10;
                    return v10;
                }
                goto LABEL_97d69c;
            }
        }
        else if (!v5)
        {
            sub_979ba4(v2->field_a0, a3);
            return sub_95f0c4(v2->field_78, 16, a2, a3);
        }
    }
    else
    {
        if (124 >= (int)a1)
        {
            if ((unsigned int)a1 == 73)
            {
                v15 = v0;
                if (sub_97cfd8(a0, a3, &v0))
                {
                    v18 = arm64g_calculate_condition(v21 | 16, v22, v16, v17);
                    v19 = 3;
                    v20 = (v18 & 1 ? v15 : 0);
                }
                else
                {
                    v23 = arm64g_calculate_condition(v21 | 16, v22, v16, v17);
                    v19 = 0;
                    v20 = (v23 & 1 ? v15 : 0);
                }
                v24 = arm64g_calculate_condition(v19 | 16, v20, 0, 0);
                return !(v24 & 1);
            }
            if ((unsigned int)a1 == 74)
            {
                if (!sub_97cf34(a0))
                    v13 = 0xffffffffffffffff;
                else
                    v13 = 0;
                return v13;
            }
            if ((unsigned int)a1 != 78)
                goto LABEL_97d55c;
            if (!v5)
            {
                if (!v4)
                    v2->field_158 = v2->field_158 & ~(unsigned int)a2;
                v11 = v3;
                if (v11)
                {
                    v12 = *(int *)(v11 + 168) & ~(unsigned int)a2;
                    *(unsigned int *)(v11 + 168) = v12;
                    return v12;
                }
LABEL_97d69c:
                return v2->field_158;
            }
        }
        else
        {
            if ((unsigned int)a1 - 125 < 2)
                return 0;
LABEL_97d55c:
            if (!v5)
                return sub_960a40(v2, a1, a2, a3, 1);
        }
    }
    sub_97c738(&v1);
    return 0;
}
