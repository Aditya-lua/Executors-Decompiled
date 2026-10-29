/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x96b4b0..0x96b598 (232 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_96b4b0_0 {
    struct st_96b4b0_1 *field_0;
    struct st_96b4b0_1 *field_8;
} st_96b4b0_0;

typedef struct st_96b4b0_1 {
    unsigned short field_0;
} st_96b4b0_1;


unsigned short * sub_96b4b0(st_96b4b0_0 *a0, st_96b4b0_1 **a1, st_96b4b0_1 **a2)
{
    unsigned short *v2;  // x22
    unsigned long long v3;  // x8
    unsigned long v6;  // cc_dep2
    unsigned long v7;  // cc_ndep
    unsigned long long v8;  // 4110
    unsigned long long v9;  // 4102
    unsigned long v10;  // cc_op
    unsigned long v11;  // cc_dep1
    unsigned short *v12;  // x0
    unsigned short *v13;  // x20
    unsigned short *v14;  // x8
    unsigned short *v15;  // x22
    unsigned short *v16;  // x9
    unsigned short *v17;  // x9
    unsigned long v18;  // x11
    unsigned long long v4;  // 4110
    unsigned long long v5;  // 4102
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0->field_8;
    v3 = v2 & 1;
    if (v2)
    {
        v4 = arm64g_calculate_condition(v10 | 16, v11, v6, v7);
        v5 = arm64g_calculate_condition(4, (v4 & 1 ? v3 : 0), 0, 0);
        if (v5 & 1)
            goto LABEL_96b4e0;
    }
    else
    {
        v8 = arm64g_calculate_condition(v10 | 16, v11, v6, v7);
        v9 = arm64g_calculate_condition(0, (v8 & 1 ? v3 : 0), 0, 0);
        if (v9 & 1)
        {
LABEL_96b4e0:
            v12 = sub_a6bf4c(v2, "ssl/t1_lib.c", 3525);
            if (!v12)
                return v12;
            v13 = v12;
            v14 = 0;
            v15 = v2 >> 1;
            v16 = a0->field_8;
            while (1)
            {
                v17 = (char *)v16 - 2;
                if (v16 < 2)
                    break;
                v18 = *(short *)a0->field_0;
                a0->field_0 = a0->field_0 + 1;
                a0->field_8 = v17;
                *(unsigned short *)((char *)v13 + 0x2 * v14) = (((((v18 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v18 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v18 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v18 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 48;
                v14 = (char *)v14 + 1;
                v16 = v17;
                if (v15 == v14)
                {
                    sub_a6c2e4(*a1, "ssl/t1_lib.c", 3535);
                    *a1 = v13;
                    *a2 = v15;
                    return 1;
                }
            }
            if (v15 == v14)
            {
                sub_a6c2e4(*a1, "ssl/t1_lib.c", 3535);
                *a1 = v13;
                *a2 = v15;
                return 1;
            }
            sub_a6c2e4(v13, "ssl/t1_lib.c", 3531);
        }
    }
    return 0;
}
