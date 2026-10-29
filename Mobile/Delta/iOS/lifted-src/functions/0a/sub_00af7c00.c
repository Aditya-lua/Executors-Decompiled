/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf7c00..0xaf7ec0 (704 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_af7c00_3 {
    char padding_0[168];
    long long field_a8;
} st_af7c00_3;

typedef struct st_af7c00_2 {
    char padding_0[32];
    struct st_af7c00_0 *field_20;
    char padding_28[144];
    struct st_af7c00_1 *field_b8;
} st_af7c00_2;

typedef struct st_af7c00_1 {
    char padding_0[232];
    unsigned int field_e8;
} st_af7c00_1;

typedef struct st_af7c00_0 {
    char padding_0[25];
    char field_19;
} st_af7c00_0;


unsigned long long sub_af7c00(st_af7c00_2 *a0, void* a1, long long *a2, unsigned int *a3, int *a4, unsigned int *a5, long long a6)
{
    int v8;  // w26
    unsigned int v9;  // x20
    unsigned long long v14;  // 4102
    unsigned long v15;  // cc_op
    unsigned long v16;  // cc_dep1
    unsigned long v17;  // cc_dep2
    unsigned long v18;  // cc_ndep
    unsigned long long v19;  // 4112
    unsigned long long v20;  // 4102
    unsigned int v10;  // x28
    long long v21;  // x0
    unsigned long long v22;  // x0
    unsigned int v23;  // x24
    st_af7c00_3 *v24;  // x0
    st_af7c00_3 *v25;  // x25
    long long v11;  // x23
    long long v26;  // x0
    int v12;  // w0
    unsigned long long v13;  // 4112
    unsigned int v0;  // [bp-0x84]
    unsigned int v1;  // [bp-0x80]
    char v2;  // [bp-0x78], Other Possible Types: unsigned int
    char v3;  // [bp-0x74]
    unsigned int v4;  // [bp-0x70]
    unsigned int v5;  // [bp-0x64]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v8 = *a4;
    v4 = 0;
    if ((int)sub_ad69e4(a6) >= 1)
    {
        v1 = 0;
        v9 = 0;
        v10 = 0;
        v0 = 0;
        do
        {
            v11 = sub_ad69f8(a6, v10);
            v5 = *a5;
            v12 = sub_af7648(a0, &v4, &v5, v11, a0->field_b8);
            if (v8 <= v12)
            {
                v13 = arm64g_calculate_condition(v15 | 160, v16, v17, v18);
                v14 = arm64g_calculate_condition(3, (v13 & 1 ? v12 : 0x40000000), 0, 0);
                if (v14 & 1)
                    continue;
            }
            else
            {
                v19 = arm64g_calculate_condition(v15 | 160, v16, v17, v18);
                v20 = arm64g_calculate_condition(0, (v19 & 1 ? v12 : 0x40000000), 0, 0);
                if (v20 & 1)
                    continue;
            }
            if (v12 != v8 || !v9 || (v21 = sub_975ff4(v9), sub_9c5048(&v3, &v2, sub_975ff4(v9), sub_975ff4(v11)) && (0 < v3 || (int)v2 > 0)))
            {
                v1 = v4;
                v0 = v5;
                v8 = v12;
                v9 = v11;
            }
        } while ((v10 += 1, (int)sub_ad69e4(a6) > (int)v10));
        if (v9)
        {
            v22 = sub_af8b80(v9);
            if (!(unsigned int)v22)
                return v22;
            sub_af99a8(*(long long *)a1);
            *(unsigned long long *)a1 = v9;
            *(unsigned long long *)a3 = v1;
            *a4 = v8;
            *a5 = v0;
            sub_af99a8(*a2);
            *a2 = 0;
            if (a0->field_20->field_19 >> 5 & 1 && (*(int *)(v9 + 132) | a0->field_b8->field_e8) >> 12 & 1)
            {
                if ((int)sub_ad69e4(a6) >= 1)
                {
                    v23 = 0;
                    do
                    {
                        v24 = sub_ad69f8(a6, v23);
                        if (v24->field_a8 && *(long long *)(v9 + 160) && (v25 = v24, v26 = sub_9ffdd0(v9), !sub_af1860(sub_9ffdd0(v9), sub_9ffdd0(v25)) && sub_af4f9c(v25, v9, 90) && sub_af4f9c(v25, v9, 770) && 0 >= (int)sub_9c0ffc(v25->field_a8, *(long long *)(v9 + 160)) && *(long long *)&v25->padding_0[160] && (int)sub_9c0ffc(*(long long *)&v25->padding_0[160], *(long long *)(v9 + 160)) >= 1))
                        {
                            if (sub_af8b80(v25))
                            {
                                *a2 = v25;
                                if (!sub_af7af4(a0, v25, 0))
                                    return v8 > 447;
                                *a4 = *a4 | 2;
                                return v8 > 447;
                            }
                            break;
                        }
                    } while ((v23 += 1, (int)sub_ad69e4(a6) > (int)v23));
                }
                *a2 = 0;
            }
        }
    }
    return v8 > 447;
}
