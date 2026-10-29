/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc5b94..0xc5e08 (628 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c5b94_0 {
    char field_0;
} st_c5b94_0;

extern char g_10002b0;

unsigned long long sub_c5b94(long long a0, long long a1, unsigned long a2)
{
    long long v9;  // x22
    unsigned long long v10;  // x0
    long long v19;  // x21
    unsigned long long v20;  // x0
    unsigned long long v21;  // 4106
    unsigned int *v22;  // x8
    unsigned long long v23;  // x9
    unsigned long v24;  // x11
    unsigned long long v25;  // x0
    unsigned long v26;  // x9
    long long idx;  // x10
    unsigned long v28;  // x11
    unsigned long long v11;  // 4106
    unsigned long v29;  // x11
    unsigned long long v12;  // x23
    long long v13;  // x21
    unsigned long long v14;  // x0
    unsigned long long v15;  // 4106
    long long v16;  // x21
    unsigned long long v17;  // x0
    unsigned long long v18;  // 4106
    long long v0;  // [bp-0xe0]
    st_c5b94_0 **v1;  // [bp-0xd0], Other Possible Types: char
    st_c5b94_0 *v2;  // [bp-0xc8]
    char v3;  // [bp-0xbc]
    unsigned int v4;  // [bp-0xb8]
    char v5;  // [bp-0xb2]
    unsigned long v6;  // [bp-0x48]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v6 = *(long long *)&g_10002b0;
    v2 = &v1;
    v1 = &v2;
    if (a2 >= 9 && !(v9 = a1 + 8, v10 = sub_bfef4(a0 + 10264, v9, a2 - 8, a0, 0x2818, 0), v11 = arm64g_calculate_condition(130, v10, 120, 0), v11 & 1))
    {
        v12 = a1 + a2;
        v13 = v9 + v10;
        v4 = 31;
        v14 = sub_76814(&v5, &v4, &v3, v13, v12 - v13);
        v15 = arm64g_calculate_condition(130, v14, 120, 0);
        if (v15 & 1 || 31 < v4 || 8 < v3)
            goto LABEL_c5d7c;
        v0 = 0;
        sub_cb1fc(a0 + 4104, &v5);
        v16 = v13 + v14;
        v4 = 52;
        v17 = sub_76814(&v5, &v4, &v3, v16, v12 - v16);
        v18 = arm64g_calculate_condition(0x22, v17, 0x77, 0);
        if (v18 & 1 || 52 < v4 || 9 < v3)
            goto LABEL_c5d7c;
        v0 = 0;
        sub_cb1fc(a0 + 6160, &v5);
        v19 = v16 + v17;
        v4 = 35;
        v20 = sub_76814(&v5, &v4, &v3, v19, v12 - v19);
        v21 = arm64g_calculate_condition(0x22, v20, 0x77, 0);
        if (v21 & 1 || 35 < v4 || 9 < v3 || (v0 = 0, sub_cb1fc(a0, &v5), v22 = v19 + v20, v23 = v22 + 3, v23 > v12))
            goto LABEL_c5d7c;
        v24 = *v22;
        v25 = 0xffffffffffffffe2;
        if ((unsigned int)v24)
        {
            v26 = v12 - v23;
            if (v26 >= v24)
            {
                idx = a0 + 0x6000;
                *(unsigned int *)(idx + 2076) = v24;
                v28 = v22[1];
                if ((unsigned int)v28 && v26 >= v28)
                {
                    *(unsigned int *)(idx + 2080) = v28;
                    v29 = v22[2];
                    if ((unsigned int)v29 && v26 >= v29)
                    {
                        *(unsigned int *)(idx + 2084) = v29;
                        v25 = (char *)v22 - a1 + 12;
                    }
                }
            }
        }
    }
    else
    {
LABEL_c5d7c:
        v25 = 0xffffffffffffffe2;
    }
    if (*(long long *)&g_10002b0 == v6)
        return v25;
    ___stack_chk_fail();
}
