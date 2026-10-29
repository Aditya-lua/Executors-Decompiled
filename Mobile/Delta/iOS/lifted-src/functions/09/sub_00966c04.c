/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x966c04..0x966d14 (272 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_966c04_0 {
    char padding_0[64];
    struct st_966c04_0 *field_40;
    struct st_966c04_0 *field_48;
    char padding_50[664];
    unsigned long long field_2e8;
    char padding_2f0[56];
    unsigned long long field_328;
    unsigned long long field_330;
    char padding_338[72];
    struct st_966c04_0 *field_380;
    struct st_966c04_0 *field_388;
    struct st_966c04_0 *field_390;
    char padding_398[40];
    struct st_966c04_0 *field_3c0;
    struct st_966c04_0 *field_3c8;
    struct st_966c04_0 *field_3d0;
    struct st_966c04_0 *field_3d8;
} st_966c04_0;


st_966c04_0 * sub_966c04(st_966c04_0 *a0, st_966c04_0 *a1)
{
    st_966c04_0 *v0;  // x8
    st_966c04_0 *v1;  // x9
    st_966c04_0 *v2;  // x11
    st_966c04_0 *v3;  // x10
    st_966c04_0 *iter;  // x8
    st_966c04_0 *v5;  // x9
    unsigned long v6;  // x10
    st_966c04_0 *v7;  // x11
    st_966c04_0 *v8;  // x9
    st_966c04_0 *v9;  // x8

    v0 = a1->field_390;
    if (v0)
    {
        v1 = a1->field_388;
        if (v1)
        {
            v2 = &a0->field_48;
            v3 = &a0->field_40;
            if (v0 != v2)
            {
                if (v1 != v3)
                {
                    v0->field_388 = v1;
                    a1->field_388->field_390 = v0;
                }
                else
                {
                    *(st_966c04_0 **)&v3->padding_0[0] = v0;
                    v0->field_388 = v3;
                }
            }
            else
            {
                if (v1 != v3)
                {
                    *(st_966c04_0 **)&v2->padding_0[0] = v1;
                    v1->field_390 = v2;
                }
                else
                {
                    *(unsigned long long *)&v3->padding_0[0] = 0;
                    *(unsigned long long *)&v3->padding_0[8] = 0;
                }
            }
            a1->field_390 = 0;
            *(uint128_t *)&a1->field_380 = 0;
        }
    }
    iter = a0->field_40;
    v5 = &a0->field_40;
    if (!iter)
    {
        a0->field_48 = a1;
        v9 = &a0->field_48;
        *(st_966c04_0 **)(&v9->padding_0[0] - 8) = a1;
        a1->field_388 = v5;
        a1->field_390 = v9;
        a1->field_380 = a0;
        return a0;
    }
    v6 = a1->field_2e8;
    if (iter->field_2e8 > v6)
    {
        v7 = a0->field_48;
        v5 = &a0->field_48;
        if (v7->field_2e8 > v6)
        {
            a1->field_388 = v7;
            v7->field_390 = a1;
            a1->field_390 = v5;
        }
        else
        {
            while (1)
            {
                iter = iter->field_390;
                if (iter == v5)
                    break;
                if (v6 >= iter->field_2e8)
                {
                    a1->field_390 = iter;
                    v8 = iter->field_388;
                    a1->field_388 = v8;
                    v8->field_390 = a1;
                    iter->field_388 = a1;
                    break;
                }
            }
            a1->field_380 = a0;
            return a0;
        }
    }
    else
    {
        a1->field_390 = iter;
        iter->field_388 = a1;
        a1->field_388 = v5;
    }
    *(st_966c04_0 **)&v5->padding_0[0] = a1;
    a1->field_380 = a0;
    return a0;
}
