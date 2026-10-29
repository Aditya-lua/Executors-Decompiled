/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc639ec..0xc63d0c (800 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c639ec_0 {
    char padding_0[8];
    unsigned long long field_8;
} st_c639ec_0;

typedef struct st_c639ec_1 {
    unsigned int field_0;
    char padding_4[4];
    char field_8;
    char field_9;
    char padding_a[19];
    char field_1d;
} st_c639ec_1;

extern char g_c63b20;
extern char g_d286b0;

unsigned long long sub_c639ec(st_c639ec_0 *a0, unsigned long a1, st_c639ec_1 *a2, unsigned long long idx)
{
    unsigned long long v4;  // x22
    unsigned long long v5;  // x0
    unsigned long long v14;  // 4102
    unsigned long long v15;  // 4118
    unsigned long long v16;  // x0
    unsigned long long v17;  // x0
    unsigned long long v18;  // x0
    unsigned long long v19;  // x0
    unsigned long long v20;  // w0
    unsigned long long v21;  // x0
    unsigned long long v22;  // x0
    unsigned long long v23;  // 4118
    unsigned long v6;  // x8
    unsigned int v7;  // w10
    unsigned long v8;  // x11
    unsigned int v9;  // w9
    unsigned long v10;  // cc_dep1
    unsigned long long v11;  // 4110
    unsigned long long v12;  // 4102
    unsigned long long v13;  // 4110
    char v0;  // [bp-0x50], Other Possible Types: unsigned long
    unsigned long v1;  // [bp-0x48]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = sub_a6e990();
    v5 = sub_c68eb8(a0, &v1);
    if (!(unsigned int)v5)
        return v5;
    if (idx)
    {
        if (a0->field_8)
        {
            *(uint128_t *)idx = 0;
            *(uint128_t *)(idx + 16) = 0;
        }
        else
        {
            return 0;
        }
    }
    v6 = a2->field_0;
    if (v6 >> 14 & 1)
        return 0;
    v7 = (unsigned int)v6 & 0xff;
    v8 = a2->field_8;
    v9 = ((unsigned int)v6 * 0x400000 | (unsigned int)v6 >> 10) & 0xffc0000f & 15;
    v10 = v7;
    if (v7 == 5)
    {
        if (v8 == a1)
        {
            v11 = arm64g_calculate_condition(3, v10, 5, 0);
            v12 = arm64g_calculate_condition(132, (v11 & 1 ? a1 : 0x20000000), (v11 & 1 ? 20 : 0), 0);
            if (!(v12 & 1))
                goto LABEL_c63a68;
        }
        else
        {
            v13 = arm64g_calculate_condition(3, v10, 5, 0);
            v14 = arm64g_calculate_condition(128, (v13 & 1 ? a1 : 0x20000000), (v13 & 1 ? 20 : 0), 0);
            if (!(v14 & 1))
            {
LABEL_c63a68:
                v15 = arm64g_calculate_condition(49, v9 - 5, 4, 0);
                if (!(v15 & 1))
                {
                    v16 = sub_991a18();
                    if (!(unsigned int)v16)
                        return v16;
                    v17 = sub_a6ebd4(a0, &a2->field_9, a1);
                    if (!(unsigned int)v17)
                        return v17;
                    v18 = sub_c68eb8(a0, &v0);
                    if (!(unsigned int)v18)
                        return v18;
                    v19 = sub_991a24();
                    if (!(unsigned int)v19)
                        return v19;
                    if (*(long long *)&a2[2].padding_a[2])
                    {
                        v20 = (unsigned int)sub_991a2c();
                        v21 = v20 != 0;
                        if (!idx)
                            return v21;
                        if (!v20)
                            return v21;
                    }
                    else if (!idx)
                    {
                        return 1;
                    }
                    *(unsigned long long *)idx = v4;
                    *(unsigned long long *)(idx + 8) = v0 - v1 + v4 + 4;
                    v22 = sub_a6e990(a0);
                    *(unsigned long long *)(idx + 16) = v22 + *(long long *)&a2[2].padding_a[2] - *(long long *)(idx + 8);
                    *(unsigned long *)(idx + 24) = v4 + v0 - v1;
                    return 1;
                }
            }
        }
    }
    else
    {
        if (20 >= (unsigned int)v8 && a2->field_1d <= 20 && (((unsigned int)v6 & 253) == 4 || !(v23 = arm64g_calculate_condition(49, v9 - 5, 4, 0), v23 & 1)))
        {
            if (5 < ((unsigned int)v6 & 0xff) - 1)
                return 0;
            goto *((void *)(&(&g_c63b20)[4 * *(&(&g_d286b0)[(unsigned int)v6 & 0xff] - 1)]));
        }
    }
    return 0;
}
