/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xf8d0..0xfa4c (380 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_f8d0_1 {
    char padding_0[1];
    long long field_1;
    char padding_9[87];
    char field_60;
    char padding_61[31];
    unsigned int field_80;
    uint128_t field_84;
    char padding_94[4];
    struct st_f8d0_0 *field_98;
    char padding_a0[64];
    char field_e0;
    char padding_e1[23];
    char field_f8;
    char padding_f9[23];
    char field_110;
} st_f8d0_1;

typedef struct st_f8d0_0 {
    char field_0;
} st_f8d0_0;


unsigned int * sub_f8d0(st_f8d0_1 *a0)
{
    unsigned int *v7;  // x0
    unsigned long v8;  // cc_op
    unsigned long long v17;  // 4102
    char *v18;  // x24
    unsigned long long v19;  // x27
    unsigned long long v20;  // x25
    unsigned long v9;  // cc_dep1
    unsigned long v10;  // cc_dep2
    unsigned long v11;  // cc_ndep
    unsigned int v12;  // w8
    unsigned int v13;  // w8
    unsigned long long v14;  // 4112
    unsigned long long v15;  // 4102
    unsigned long long v16;  // 4112
    st_f8d0_0 **v0;  // [bp-0xa0], Other Possible Types: char
    st_f8d0_0 *v1;  // [bp-0x98]
    char v2;  // [bp-0x90], Other Possible Types: unsigned int
    uint128_t v3;  // [bp-0x8c]
    char v4;  // [bp-0x78]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v1 = &v0;
    v0 = &v1;
    v7 = sub_be90(&a0->padding_9[80], 0, 1);
    while (1)
    {
        v12 = *v7 - 282;
        v13 = 1 << ((char)v12 & 31) & 35;
        if (v12 <= 5)
        {
            v14 = arm64g_calculate_condition(v8 | 144, v9, v10, v11);
            v15 = arm64g_calculate_condition(3, (v14 & 1 ? v13 : 0x40000000), 0, 0);
            if (v15 & 1)
                return v7;
        }
        else
        {
            v16 = arm64g_calculate_condition(v8 | 144, v9, v10, v11);
            v17 = arm64g_calculate_condition(0, (v16 & 1 ? v13 : 0x40000000), 0, 0);
            if (v17 & 1)
                return v7;
        }
        if ((a0->padding_0)[1] == 1)
        {
            v2 = *(int *)&a0->padding_61[24];
            v3 = *(int128_t *)&a0->padding_61[28];
            v7 = sub_217dc(&a0->padding_a0[48], &v2);
        }
        if (*(int *)&a0->padding_61[24] != 282)
        {
            if (*(int *)&a0->padding_61[24] == 287)
                return v7;
        }
        else
        {
            if (sub_b19c(&a0->padding_61[24]))
            {
                v18 = *(long long *)((char *)&a0->field_84 + 8);
                if (*v18 == 33)
                {
                    v19 = sub_b19c(&a0->padding_61[24]) & 0xffffffff;
                    do
                    {
                        v20 = v19;
                    } while (v19 && (v19 = v20 - 1, sub_9e8c(*(&v18[v20] - 1)) & 1));
                    v2 = a0->padding_f9[7];
                    *(int128_t *)(&v2 | 4) = *(int128_t *)&a0->padding_61[28];
                    sub_181f0(&v4, v18 + 1, &v18[v20 & 0xffffffff], (v20 & 0xffffffff) - 1);
                    sub_18c60(&a0->padding_e1[7], &v2);
                }
            }
        }
        v7 = sub_be90(&a0->padding_9[80], 0, 0);
    }
}
