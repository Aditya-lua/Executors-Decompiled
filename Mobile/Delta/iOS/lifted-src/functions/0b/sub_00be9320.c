/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbe9320..0xbe94fc (476 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_be9320_0 {
    unsigned int field_0;
    char field_4;
    char padding_5[155];
    unsigned long long field_a0;
} st_be9320_0;

extern long long g_efa740;

double sub_be9320(st_be9320_0 *a0, unsigned int *a1, long long a2)
{
    long long v12;  // x8
    unsigned long long v13;  // x11
    unsigned long long idx;  // x8
    unsigned int *v23;  // x4
    unsigned long long v24;  // x3
    unsigned long long v26;  // x5
    long long v27;  // x8
    unsigned long long v28;  // x8
    unsigned long long v29;  // x12
    unsigned int *v30;  // x1
    unsigned int *v31;  // x1
    unsigned long long v14;  // x10
    unsigned long long v32;  // x15
    unsigned int *v33;  // x1
    unsigned long long v34;  // x17
    unsigned long long j;  // x2
    st_be9320_0 *v36;  // x3
    unsigned long long v37;  // x2
    unsigned long long v39;  // x4
    long long v40;  // x9
    unsigned long long v41;  // x9
    unsigned long long index;  // x9
    st_be9320_0 *v16;  // x13
    st_be9320_0 *v17;  // x13
    unsigned long long v18;  // x15
    st_be9320_0 *v19;  // x13
    unsigned long long v20;  // x17
    unsigned long long i;  // x3
    unsigned long long v0;  // [bp-0xb0]
    unsigned long long v1;  // [bp-0xa0]
    unsigned long long v2;  // [bp-0x90]
    unsigned long long v3;  // [bp-0x80]
    unsigned long long v4;  // [bp-0x70]
    unsigned long long v5;  // [bp-0x60]
    unsigned long long v6;  // [bp-0x50]
    unsigned long long v7;  // [bp-0x40]
    unsigned long long v8;  // [bp-0x30]
    unsigned long long v9;  // [bp-0x20]
    char *v10;  // [bp-0x10]
    char v11;  // [bp+0x0]

    v10 = &v11;
    v8 = 0;
    v9 = 0;
    v6 = 0;
    v7 = 0;
    v4 = 0;
    v5 = 0;
    v2 = 0;
    v3 = 0;
    v0 = 0;
    v1 = 0;
    v12 = a0->field_a0;
    if ((unsigned long long)a2 > (unsigned long long)v12)
    {
        v13 = 0;
        v14 = 0;
        index = a2 * 4;
        v16 = a0;
        while (1)
        {
            v17 = v16;
            if (v17 == &(&a0->field_0)[v12])
                break;
            v18 = v13;
            v19 = &v17->field_4;
            v13 += 1;
            v16 = v19;
            if (v17->field_0)
            {
                v20 = 0;
                i = index;
                idx = v18;
                v23 = a1;
                do
                {
                    v24 = i;
                    if (40 <= idx)
                    {
                        sub_c73c94(idx, 40, &g_efa740);
                        sub_c73c94(index, 40, &g_efa740);
                    }
                    v26 = v20 + *(int *)((char *)&v0 + 4 * idx) + *v23 * v17->field_0;
                    v20 = v26 >> 32;
                    *(unsigned int *)((char *)&v0 + 4 * idx) = v26;
                    idx += 1;
                    i = v24 - 4;
                    v23 += 1;
                } while (i);
                v27 = a2;
                if (v20)
                {
                    idx = v18 + a2;
                    if (40 <= idx)
                    {
                        sub_c73c94(idx, 40, &g_efa740);
                        sub_c73c94(index, 40, &g_efa740);
                    }
                    *(unsigned int *)((char *)&v0 + 4 * idx) = v20;
                    v27 = a2 + 1;
                }
                v28 = v27 + v18;
                if (v28 >= v14)
                    v14 = v28;
                v16 = v19;
            }
        }
    }
    else if (41 > (unsigned long long)v12)
    {
        v29 = 0;
        v14 = 0;
        v30 = a1;
        while (1)
        {
            v31 = v30;
            if (v31 == &a1[a2])
                break;
            v32 = v29;
            v33 = v31 + 1;
            v29 += 1;
            v30 = v33;
            if (*v31)
            {
                v34 = 0;
                j = v12 * 4;
                index = v32;
                v36 = a0;
                do
                {
                    v37 = j;
                    if (40 <= index)
                        sub_c73c94(index, 40, &g_efa740);
                    v39 = v34 + *(int *)((char *)&v0 + 4 * index) + v36->field_0 * *v31;
                    v34 = v39 >> 32;
                    *(unsigned int *)((char *)&v0 + 4 * index) = v39;
                    index += 1;
                    j = v37 - 4;
                    v36 = &v36->field_4;
                } while (j);
                v40 = v12;
                if (v34)
                {
                    index = v32 + v12;
                    if (40 <= index)
                        sub_c73c94(index, 40, &g_efa740);
                    *(unsigned int *)((char *)&v0 + 4 * index) = v34;
                    v40 = v12 + 1;
                }
                v41 = v40 + v32;
                if (v41 >= v14)
                    v14 = v41;
                v30 = v33;
            }
        }
    }
    else
    {
        sub_c73bb0(0, v12, 40, &g_efa740);
        sub_c73c94(v12, 40, &g_efa740);
        sub_c73c94(index, 40, &g_efa740);
    }
    *(uint128_t *)&a0->padding_5[91] = v6;
    *(uint128_t *)&a0->padding_5[107] = v7;
    *(uint128_t *)&a0->padding_5[123] = v8;
    *(uint128_t *)&a0->padding_5[139] = v9;
    *(uint128_t *)&a0->padding_5[27] = v2;
    *(uint128_t *)&a0->padding_5[43] = v3;
    *(uint128_t *)&a0->padding_5[59] = v4;
    *(uint128_t *)&a0->padding_5[75] = v5;
    *(uint128_t *)&a0->field_0 = v0;
    *(uint128_t *)&a0->padding_5[11] = v1;
    a0->field_a0 = v14;
    return v0;
}
