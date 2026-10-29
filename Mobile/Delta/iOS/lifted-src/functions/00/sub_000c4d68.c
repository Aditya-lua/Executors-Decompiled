/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc4d68..0xc505c (756 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c4d68_0 {
    char field_0;
} st_c4d68_0;

extern unsigned long long g_e6cfc8;
extern unsigned long long g_e6d008;

long long sub_c4d68(long long a0, long long a1, unsigned long a2, long long *a3, long long *a4)
{
    long long idx;  // x26
    long long v8;  // x22
    unsigned int v17;  // w8
    unsigned int v18;  // w9
    long long v19;  // x0
    unsigned long long v20;  // 4106
    long long v21;  // x21
    unsigned long long v22;  // x10
    unsigned long long v23;  // x9
    long long v9;  // x9
    long long v10;  // x0
    unsigned long long v11;  // 4106
    long long v12;  // x24
    long long v13;  // x23
    unsigned long long v14;  // 4110
    long long v15;  // x21
    long long v16;  // x22
    long long *v0;  // [bp-0x90]
    long long *v1;  // [bp-0x88]
    st_c4d68_0 **v2;  // [bp-0x80], Other Possible Types: char
    st_c4d68_0 *v3;  // [bp-0x78]
    unsigned int v4;  // [bp-0x6c]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    idx = a0 + 0x7000;
    v3 = &v2;
    v2 = &v3;
    v8 = *a4;
    v9 = 5;
    if (!*(int *)(idx + 1432))
        v9 = 9;
    if ((unsigned long long)v9 > (unsigned long long)v8)
        return -0x48;
    v0 = a3;
    v1 = a4;
    v10 = sub_c4cb4();
    v11 = arm64g_calculate_condition(130, v10, 120, 0);
    if (v11 & 1)
    {
        return v10;
    }
    else if ((unsigned long long)v8 >= (unsigned long long)(v10 + 3))
    {
        v12 = v10;
        v13 = sub_c5e08(a0, *a3, v12);
        v14 = arm64g_calculate_condition(130, v13, 120, 0);
        if (v14 & 1)
            return v13;
        v15 = *a3 + v12;
        v16 = v8 - v12;
        v17 = *(int *)(idx + 1560);
        if (v17)
        {
            v18 = *(int *)(idx + 1272);
            if ((unsigned int)*(int *)(idx + 1272) < v17)
                v17 = v18;
            *(unsigned int *)(idx + 1272) = v17;
        }
        v19 = sub_cb470(v15, v16, &v4);
        v20 = arm64g_calculate_condition(130, v19, 120, 0);
        if (!(v20 & 1))
        {
            v21 = v15 + 3;
            if ((unsigned long long)v19 <= (unsigned long long)(v16 - 3))
            {
                v22 = 368;
                if (v4 == 2)
                    v22 = 280;
                if (!v4)
                    v22 = 432;
                v23 = 336;
                if (v4 != 1)
                    v23 = v22;
                goto *((void *)(*(long long *)((char *)&g_e6cfc8 + v23)));
            }
        }
        goto *((void *)(g_e6d008));
    }
    return -0x48;
}
