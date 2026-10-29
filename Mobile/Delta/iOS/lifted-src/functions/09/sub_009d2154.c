/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9d2154..0x9d2280 (300 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9d2154_0 {
    unsigned int field_0;
    char padding_4[4];
    long long field_8;
    unsigned int field_10;
    int field_14;
} st_9d2154_0;

typedef struct st_9d2154_1 {
    char padding_0[64];
    struct st_9d2154_0 *field_40;
    long long field_48;
} st_9d2154_1;


long long sub_9d2154(st_9d2154_1 *a0, char *a1, unsigned int a2)
{
    char *v2;  // x20
    st_9d2154_0 *v3;  // x23
    unsigned long long v12;  // 4110
    unsigned long long v13;  // 4102
    unsigned long long v14;  // 4110
    unsigned long long v15;  // 4102
    unsigned int v16;  // x8
    unsigned int v17;  // w10
    unsigned int v18;  // w8
    unsigned long v4;  // x24
    unsigned int v5;  // x19
    unsigned int v6;  // x22
    unsigned int v7;  // x9
    unsigned long long v8;  // x10
    unsigned long long v9;  // x11
    unsigned int v10;  // w9
    unsigned long v11;  // cc_dep1
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a1;
    v3 = a0->field_40;
    v4 = a2 - 1;
    sub_9d3d58();
    v5 = 0;
    v6 = v3->field_10;
    while (1)
    {
        if (1 > (int)v6)
        {
            v6 = sub_9d3d84(a0->field_48, v3->field_8, v3->field_0);
            if ((int)v6 > 0)
            {
                v3->field_10 = v6;
                v3->field_14 = 0;
                continue;
            }
            else
            {
                sub_9d5054(a0);
                *v2 = 0;
                if (0 < (int)v5)
                {
                    v18 = v5;
                    break;
                }
                else
                {
                    v18 = v6;
                    break;
                }
            }
        }
        if ((int)v4 >= 1)
        {
            v7 = 0;
            v8 = v4 & 0xffffffff;
LABEL_9d21d0:
            v9 = v7;
            v10 = *(char *)(v3->field_8 + v3->field_14 + v7);
            v2[v9] = v10;
            v11 = v10 & 0xff;
            if (v10 == 10)
            {
                v7 = v9 + 1;
                v6 = v3->field_10;
                v2 = &v2[v7];
                v16 = 1;
                goto LABEL_9d2224;
            }
            v7 = v9 + 1;
            v6 = v3->field_10;
            if (v7 < v6)
            {
                v12 = arm64g_calculate_condition(179, v11, 10, 0);
                v13 = arm64g_calculate_condition(52, (v12 & 1 ? v7 : 0x20000000), (v12 & 1 ? v8 : 0), 0);
                goto LABEL_9d21f8;
                if (v13 & 1)
                    continue;
            }
            v14 = arm64g_calculate_condition(179, v11, 10, 0);
            v15 = arm64g_calculate_condition(48, (v14 & 1 ? v7 : 0x20000000), (v14 & 1 ? v8 : 0), 0);
            if (!(v15 & 1))
            {
LABEL_9d21f8:
                v16 = 0;
                v2 = &v2[v9 + 1];
                goto LABEL_9d2224;
            }
            goto LABEL_9d21d0;
        }
        else
        {
            v16 = 0;
            v7 = 0;
        }
LABEL_9d2224:
        v5 += v7;
        v6 -= v7;
        v17 = v3->field_14 + v7;
        v3->field_10 = v6;
        v3->field_14 = v17;
        if (v16 & 1 || !(v4 -= v7, (unsigned int)v4))
        {
            *v2 = 0;
            return v7 + v5;
        }
    }
    if (v6 & 0x80000000)
        return v18;
    return v5 & 0xffffffff;
}
