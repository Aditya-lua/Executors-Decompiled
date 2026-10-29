/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xcfbc..0xd108 (332 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_cfbc_1 {
    struct st_cfbc_0 *field_0;
    unsigned long long field_8;
    unsigned int field_10;
    unsigned int field_14;
    unsigned int field_18;
} st_cfbc_1;

typedef struct st_cfbc_2 {
    unsigned int field_0;
    unsigned long long field_4;
    unsigned long long field_c;
    unsigned int field_14;
    unsigned long long field_18;
} st_cfbc_2;

typedef struct st_cfbc_3 {
    struct st_cfbc_4 *field_0;
} st_cfbc_3;

typedef struct st_cfbc_4 {
    struct st_cfbc_3 *field_0;
} st_cfbc_4;

typedef struct st_cfbc_0 {
    char field_0;
} st_cfbc_0;


st_cfbc_1 * sub_cfbc(st_cfbc_1 *a0, unsigned long long *a1, unsigned int a2)
{
    unsigned long v4;  // x11
    char *v5;  // x9
    unsigned int v14;  // w13
    unsigned int v15;  // w13
    unsigned long long v16;  // 4112
    unsigned long long v17;  // 4102
    unsigned long long v18;  // 4112
    unsigned long long v19;  // 4102
    unsigned long v20;  // x10
    unsigned long long v21;  // x12
    unsigned long long v22;  // x12
    st_cfbc_2 *v23;  // x8
    unsigned long v6;  // x10
    unsigned int v7;  // w14
    unsigned long v8;  // x12
    unsigned int v9;  // w13
    unsigned long v10;  // x11
    unsigned long v11;  // cc_dep1
    unsigned long v12;  // cc_dep2
    unsigned int v13;  // w11
    st_cfbc_0 **v0;  // [bp-0x20], Other Possible Types: char
    st_cfbc_0 *v1;  // [bp-0x18]
    st_cfbc_4 **v2;  // [bp-0x10]
    st_cfbc_4 **v3;  // [bp-0x8]

    v1 = &v0;
    v0 = &v1;
    v4 = a0->field_10 + 1;
    a0->field_10 = v4;
    v2 = &v3;
    v3 = &v2;
    v5 = a0->field_0;
    v6 = a0->field_8;
    while (1)
    {
        if (v6 <= v4)
            goto LABEL_d07c;
        if (v5[v4] - 48 < 10)
            goto LABEL_cff8;
        else
            goto LABEL_d01c;
LABEL_d01c:
        if (94 < v5[v4])
        {
            switch (v7)
            {
            case 95:
                break;
            case 101:
                v8 = (unsigned int)v4 + 1;
                a0->field_10 = v8;
                if (v6 <= v8)
                    goto LABEL_d064;
                goto LABEL_d048;
            default:
LABEL_d07c:
                v8 = v4;
                v10 = v8 & 0xffffffff;
                v11 = v6;
                v12 = v10;
                if (v10 >= v6)
                {
                    v10 = v8;
                    v20 = a0->field_14;
                    v21 = v10 - a0->field_18;
                    v22 = *a1;
                    v23->field_0 = 280;
                    *(unsigned long long *)&(&v23->field_0)[1] = v22;
                    *(unsigned long long *)((char *)&v23->field_4 + 4) = v20 | v21 * 0x100000000;
                    *(unsigned int *)((char *)&v23->field_c + 4) = v10 - a2;
                    *(char **)&v23->field_14 = &v5[a2];
                    return a0;
                }
                while (1)
                {
LABEL_d0a4:
                    v13 = v5[v10];
                    v14 = (char)v13;
                    v15 = v14 - 48;
                    if (26 <= (v14 | 32) - 97)
                    {
                        v16 = arm64g_calculate_condition(36, v11, v12, 0);
                        v17 = arm64g_calculate_condition(0x33, (v16 & 1 ? v15 : 0), (v16 & 1 ? 10 : 0), 0);
                        if (v17 & 1)
                            goto LABEL_d090;
                    }
                    else
                    {
                        v18 = arm64g_calculate_condition(36, v11, v12, 0);
                        v19 = arm64g_calculate_condition(48, (v18 & 1 ? v15 : 0), (v18 & 1 ? 10 : 0), 0);
                        if (v19 & 1)
                            goto LABEL_d090;
                    }
                    if (v13 != 95)
                    {
                        v10 = v8;
                        v20 = a0->field_14;
                        v21 = v10 - a0->field_18;
                        v22 = *a1;
                        v23->field_0 = 280;
                        *(unsigned long long *)&(&v23->field_0)[1] = v22;
                        *(unsigned long long *)((char *)&v23->field_4 + 4) = v20 | v21 * 0x100000000;
                        *(unsigned int *)((char *)&v23->field_c + 4) = v10 - a2;
                        *(char **)&v23->field_14 = &v5[a2];
                        return a0;
                    }
LABEL_d090:
                    v10 = (unsigned int)v8 + 1;
                    a0->field_10 = v10;
                    v8 = v10;
                    v11 = v6;
                    v12 = v10;
                    if (v6 <= v10)
                    {
                        v20 = a0->field_14;
                        v21 = v10 - a0->field_18;
                        v22 = *a1;
                        v23->field_0 = 280;
                        *(unsigned long long *)&(&v23->field_0)[1] = v22;
                        *(unsigned long long *)((char *)&v23->field_4 + 4) = v20 | v21 * 0x100000000;
                        *(unsigned int *)((char *)&v23->field_c + 4) = v10 - a2;
                        *(char **)&v23->field_14 = &v5[a2];
                        return a0;
                    }
                }
            }
            goto LABEL_cff8;
        }
        else
        {
            switch (v7)
            {
            case 46:
LABEL_cff8:
                v4 = (unsigned int)v4 + 1;
                a0->field_10 = v4;
                v2 = &v3;
                v3 = &v2;
                continue;
            case 69:
                v8 = (unsigned int)v4 + 1;
                a0->field_10 = v8;
                if (v6 <= v8)
                    goto LABEL_d064;
LABEL_d048:
                v9 = v5[v8];
                if (v9 == 43 || v9 == 45)
                {
                    v8 = (unsigned int)v4 + 2;
                    a0->field_10 = v8;
                }
LABEL_d064:
                v10 = v8 & 0xffffffff;
                v11 = v6;
                v12 = v10;
                if (v10 < v6)
                    break;
                goto LABEL_d0d0__3;
            default:
LABEL_d07c:
                v8 = v4;
                v10 = v8 & 0xffffffff;
                v11 = v6;
                v12 = v10;
                if (v10 >= v6)
                {
                    v10 = v8;
                    v20 = a0->field_14;
                    v21 = v10 - a0->field_18;
                    v22 = *a1;
                    v23->field_0 = 280;
                    *(unsigned long long *)&(&v23->field_0)[1] = v22;
                    *(unsigned long long *)((char *)&v23->field_4 + 4) = v20 | v21 * 0x100000000;
                    *(unsigned int *)((char *)&v23->field_c + 4) = v10 - a2;
                    *(char **)&v23->field_14 = &v5[a2];
                    return a0;
                }
                break;
            }
            goto LABEL_d0a4;
        }
    }
    v10 = v8;
LABEL_d0d0__3:
    v20 = a0->field_14;
    v21 = v10 - a0->field_18;
    v22 = *a1;
    v23->field_0 = 280;
    *(unsigned long long *)&(&v23->field_0)[1] = v22;
    *(unsigned long long *)((char *)&v23->field_4 + 4) = v20 | v21 * 0x100000000;
    *(unsigned int *)((char *)&v23->field_c + 4) = v10 - a2;
    *(char **)&v23->field_14 = &v5[a2];
    return a0;
}
