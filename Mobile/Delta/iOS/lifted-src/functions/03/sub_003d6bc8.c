/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3d6bc8..0x3d6e2c (612 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3d6bc8_1 {
    char padding_0[16];
    int field_10;
    char padding_14[12];
    void* field_20;
    unsigned long long field_28;
    void* field_30;
} st_3d6bc8_1;

typedef struct st_3d6bc8_0 {
    char field_0;
} st_3d6bc8_0;

typedef struct st_3d6bc8_3 {
    unsigned long long field_0;
} st_3d6bc8_3;

typedef struct st_3d6bc8_2 {
    unsigned int field_0;
    unsigned int field_4;
    unsigned int field_8;
    unsigned int field_c;
} st_3d6bc8_2;

extern st_3d6bc8_2 g_d0dbf8;
extern st_3d6bc8_2 g_d0dc74;
extern st_3d6bc8_2 g_d0dcf0;
extern st_3d6bc8_2 g_d0dd70;
extern st_3d6bc8_3 *g_f0b120;

unsigned long long sub_3d6bc8(st_3d6bc8_1 *a0)
{
    void* iter;  // x20
    unsigned long long v5;  // x0
    char *v14;  // x8
    unsigned long long v15;  // x10
    unsigned long long v16;  // x11
    void* v17;  // x9
    unsigned long long i;  // x13
    unsigned long long v19;  // x13
    uint128_t *v20;  // x14
    uint128_t v21;  // q1
    unsigned long v23;  // x21
    unsigned long long v6;  // x0
    char *v24;  // x8
    unsigned long v7;  // x8
    unsigned long v8;  // x21
    unsigned long long v9;  // 4124
    unsigned int v10;  // w0
    unsigned long v11;  // x28
    long long v12;  // x28
    unsigned long long v13;  // x0
    st_3d6bc8_0 **v0;  // [bp-0x70], Other Possible Types: char
    st_3d6bc8_0 *v1;  // [bp-0x68]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v1 = &v0;
    v0 = &v1;
    iter = a0->field_20;
    while (1)
    {
        v5 = sub_3cecf0(a0, &a0[1].padding_0[4]);
        if (0xff >= (int)v5)
        {
            if (v5 >> 31 & 1)
                break;
            if (iter >= a0->field_30)
            {
                v6 = sub_3cf0fc(a0, iter, 1);
                if (!(unsigned int)v6)
                    return v6;
                iter = a0->field_20;
            }
            *(char *)iter = v5;
            iter += 1;
        }
        else if ((unsigned int)v5 != 0x100)
        {
            if (285 < (unsigned int)v5)
                break;
            v7 = (unsigned int)v5 - 0x101;
            v8 = (&g_d0dbf8.field_0)[v7 & 0xffffffff];
            v9 = arm64g_calculate_condition(50, v7 - 28, 20, 0);
            if (!(v9 & 1))
                v8 += sub_3d37fc(a0, (&g_d0dc74.field_0)[v7]);
            v10 = sub_3cecf0(a0, &a0[37].padding_0[8]);
            if (29 < v10)
                break;
            v11 = (&g_d0dcf0.field_0)[v10];
            if (v10 >= 4)
                v11 += sub_3d37fc(a0, (&g_d0dd70.field_0)[v10]);
            v12 = (int)v11;
            if (iter - a0->field_28 >= v12)
            {
                if ((int)v8 > a0->field_30 - iter)
                {
                    v13 = sub_3cf0fc(a0, iter, v8);
                    if (!(unsigned int)v13)
                        return v13;
                    iter = a0->field_20;
                }
                v14 = iter - v12;
                if ((int)v12 != 1)
                {
                    if (!(unsigned int)v8)
                        continue;
                    if ((unsigned int)v8 >= 32 && (unsigned int)v12 >= 32)
                    {
                        v15 = v8 & 0xffffffff;
                        v16 = v15 & 0xffffffe0;
                        v8 -= v16;
                        v14 = &v14[v16];
                        v17 = iter + v16;
                        i = v16;
                        do
                        {
                            v19 = i;
                            v20 = iter + -v12;
                            v21 = v20[1];
                            *(uint128_t *)iter = *v20;
                            *(uint128_t *)&iter[16] = v21;
                            iter += 32;
                            i = v19 - 32;
                        } while (i);
                        iter = v17;
                        if (v16 == v15)
                            continue;
                    }
                    else
                    {
                        v17 = iter;
                    }
                    do
                    {
                        v23 = v8;
                        v24 = v14 + 1;
                        *(char *)v17 = *v14;
                        iter = v17 + 1;
                        v8 = (unsigned int)v23 - 1;
                        v17 = iter;
                        v14 = v24;
                    } while ((unsigned int)v23 != 1);
                }
                else if ((unsigned int)v8)
                {
                    _memset(iter, *v14, v8 & 0xffffffff);
                    iter = iter + (unsigned int)v8 - 1 + 1;
                }
            }
            else
            {
                break;
            }
        }
        else
        {
            a0->field_20 = iter;
            if (!*(int *)&a0->padding_14[0] || 16 <= a0->field_10)
                return 1;
            break;
        }
    }
    g_f0b120();
}
