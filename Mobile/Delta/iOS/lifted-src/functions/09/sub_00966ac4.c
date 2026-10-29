/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x966ac4..0x966c04 (320 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_966ac4_0 {
    struct st_966ac4_0 *field_0;
    char padding_8[584];
    struct st_966ac4_0 *field_250;
    char padding_258[88];
    struct st_966ac4_0 *field_2b0;
    char padding_2b8[200];
    struct st_966ac4_0 *field_380;
    struct st_966ac4_0 *field_388;
    struct st_966ac4_0 *field_390;
} st_966ac4_0;

typedef struct st_966ac4_1 {
    char padding_0[48];
    long long field_30;
    char padding_38[8];
    struct st_966ac4_0 *field_40;
    struct st_966ac4_0 *field_48;
    char padding_50[24];
    struct st_966ac4_0 *field_68;
    char padding_70[544];
    struct st_966ac4_0 *field_290;
    struct st_966ac4_0 *field_298;
    char padding_2a0[80];
    struct st_966ac4_0 *field_2f0;
    struct st_966ac4_0 *field_2f8;
    char padding_300[192];
    struct st_966ac4_0 *field_3c0;
    struct st_966ac4_0 *field_3c8;
    struct st_966ac4_0 *field_3d0;
    struct st_966ac4_0 *field_3d8;
    char padding_3e0[16];
    long long field_3f0;
} st_966ac4_1;


st_966ac4_0 * sub_966ac4(st_966ac4_1 *a0, st_966ac4_0 *a1, st_966ac4_0 *a2)
{
    st_966ac4_0 *v2;  // x21
    st_966ac4_0 *v3;  // x22
    st_966ac4_0 *v4;  // x10
    st_966ac4_0 *v5;  // x9
    st_966ac4_0 *v6;  // w8
    st_966ac4_0 *v7;  // x12
    st_966ac4_0 *v8;  // x11
    st_966ac4_0 *v9;  // x23
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    if (!a1 || !a1->field_250 || a2 && !sub_a7c198(a0->field_3f0))
        return 0;
    v2 = sub_a66b6c(a0->field_30, a1);
    if (v2)
    {
        v3 = sub_a66994(a0->field_30, v2);
        v4 = v3->field_390;
        if (v4)
        {
            v5 = v3->field_388;
            v6 = a2;
            if (v5)
            {
                v7 = &a0->field_48;
                v8 = &a0->field_40;
                if (v4 != v7)
                {
                    if (v5 != v8)
                    {
                        v4->field_388 = v5;
                        v3->field_388->field_390 = v4;
                    }
                    else
                    {
                        v8->field_0 = v4;
                        v4->field_388 = v8;
                    }
                }
                else
                {
                    if (v5 != v8)
                    {
                        v7->field_0 = v5;
                        v5->field_390 = v7;
                    }
                    else
                    {
                        v8->field_0 = 0;
                        *(unsigned long long *)&v8->padding_8[0] = 0;
                    }
                }
                v3->field_390 = 0;
                *(uint128_t *)&v3->field_380 = 0;
            }
            v9 = 1;
        }
        else
        {
            v9 = 1;
            v6 = a2;
        }
    }
    else
    {
        v3 = 0;
        v9 = 0;
        v6 = a2;
    }
    *(unsigned int *)&a1->field_2b0 = 1;
    if (v6)
        sub_a7c1b4(a0->field_3f0);
    if (a0->field_68)
    {
        a0->field_68();
    }
    else if (v2)
    {
        sub_9662a0(v3);
        return v9;
    }
    return 0;
}
