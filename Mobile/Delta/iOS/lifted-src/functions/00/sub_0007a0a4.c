/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x7a0a4..0x7a428 (900 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_7a0a4_0 {
    char field_0;
} st_7a0a4_0;


long long sub_7a0a4(char *a0, unsigned int a1, char *a2, unsigned int a3, unsigned int a4, unsigned int a5, unsigned long a6, long long a7, unsigned long a8, long long a9, unsigned int a10, unsigned int a11)
{
    unsigned int v6;  // w26
    unsigned int v7;  // w27
    unsigned long long v16;  // 4112
    unsigned long v17;  // 4110
    unsigned long v18;  // cc_dep1
    unsigned long long v19;  // 4105
    unsigned long long v20;  // 4112
    unsigned int v21;  // w24
    long long v22;  // x27
    unsigned int v23;  // x0
    unsigned long long v24;  // 4106
    long long v25;  // x24
    long long v8;  // x0
    unsigned int v26;  // w8
    unsigned int v27;  // x8
    long long v28;  // x0
    unsigned long long v29;  // 4106
    long long v30;  // x0
    unsigned long long v31;  // 4106
    unsigned long v32;  // x24
    long long v33;  // x28
    unsigned long long v34;  // x0
    unsigned long long v35;  // x0
    long long v9;  // x28
    unsigned int v36;  // x9
    unsigned int v37;  // x9
    unsigned long v10;  // x25
    unsigned long v11;  // cc_dep1
    unsigned long v12;  // 4110
    unsigned long v13;  // cc_dep1
    unsigned long long v14;  // 4105
    unsigned long v15;  // x26
    unsigned int v0;  // [bp-0x8c]
    st_7a0a4_0 **v1;  // [bp-0x78], Other Possible Types: char
    st_7a0a4_0 *v2;  // [bp-0x70]
    unsigned int v3;  // [bp-0x68]
    unsigned int v4;  // [bp-0x64]
    char *v5;  // [bp-0x10]

    v5 = &a8;
    v6 = a5;
    v7 = a4;
    v2 = &v1;
    v1 = &v2;
    v4 = a4;
    v8 = sub_7ad24(a7, &a8, 8);
    if (993 > a8 >> 3)
        return -0x42;
    v9 = v8;
    if (!a1)
    {
        return 0;
    }
    else if (!a3)
    {
        return 0;
    }
    else if (a3 > 0x20000)
    {
        return -0x48;
    }
    else if (v6 > 12)
    {
        return -0x2c;
    }
    else if (v7 > 0xff)
    {
        return -0x2e;
    }
    else
    {
        v10 = a11;
        if (!v7)
        {
            v7 = 0xff;
            v4 = 0xff;
        }
        v11 = v6;
        if (!v6)
            v6 = 11;
        if ((unsigned int)v10 & 4)
        {
            v12 = arm64g_calculate_condition(19, v11, 0, 0);
            v13 = (v12 & 1 ? a10 : 0x40000000);
            v14 = arm64g_calculate_condition(20, v13, 0, 0);
            v15 = !(v14 & 1);
            v16 = arm64g_calculate_condition(4, v13, 0, 0);
            if (!(v16 & 1))
                goto LABEL_7a1ac;
        }
        else
        {
            v17 = arm64g_calculate_condition(19, v11, 0, 0);
            v18 = (v17 & 1 ? a10 : 0x40000000);
            v19 = arm64g_calculate_condition(16, v18, 0, 0);
            v15 = !(v19 & 1);
            v20 = arm64g_calculate_condition(0, v18, 0, 0);
            if (!(v20 & 1))
            {
LABEL_7a1ac:
                if (*(int *)a10 == 2)
                    goto LABEL_7a40c;
            }
        }
        v0 = v6;
        if (a3 < 0xa000 || !(v10 >> 3 & 1) || (v3 = v7, v21 = sub_79064(v9, &v3, a2, 0x1000), v3 = v7, (sub_79064(v9, &v3, &a2[a3] - 0x1000, 0x1000) & 0xffffffff) + (sub_79064(v9, &v3, a2, 0x1000) & 0xffffffff) >= 69))
        {
            v22 = v9;
            v23 = sub_794c0(v9, &v4, a2, a3, v9 + 3080, 0x1000);
            v24 = arm64g_calculate_condition(130, v23, 120, 0);
            if (v24 & 1)
                return v23;
            if (v23 == a3)
            {
                *a0 = *a2;
                return 1;
            }
            if (v23 > (unsigned long long)((a3 >> 7) + 4))
            {
                v25 = v22;
                if (a10)
                {
                    v26 = *(int *)a10;
                    if (v26 != 1)
                    {
LABEL_7a2cc:
                        if (v26)
                            v27 = v15 & 0xffffffff;
                        else
                            v27 = 1;
                        if (!(v27 & 1))
                            return sub_7c2a8();
                    }
                    else if (sub_79cf0(a9, v25, v4))
                    {
                        v25 = v22;
                        if (!(v15 & 1))
                            return sub_7c2a8();
                    }
                    else
                    {
                        v26 = 0;
                        *(unsigned int *)a10 = 0;
                        v25 = v22;
                        goto LABEL_7a2cc;
                    }
                }
                v28 = sub_7a7d4(v25 + 0x400, v25, v4, sub_79b58(v0, a3, v4, v25 + 3080, 0x1300, v25 + 0x400, v25, v10), v25 + 3080, 0x1300);
                v29 = arm64g_calculate_condition(130, v28, 120, 0);
                if (v29 & 1)
                    return v28;
                v30 = sub_7a930(a0, a1, v22 + 0x400, v4, v28, v22 + 3080, 748);
                v31 = arm64g_calculate_condition(130, v30, 120, 0);
                if (v31 & 1)
                    return v30;
                if (a10)
                {
                    if (*(int *)a10)
                    {
                        v32 = v4;
                        v33 = v30;
                        v34 = sub_79df8(a9, v22, v32);
                        v35 = sub_79df8(v22 + 0x400, v22, v32);
                        v36 = v33 + 12;
                        if (a3 <= v36)
                        {
                            return sub_7c2a8();
                        }
                        else if (v35 + v33 >= v34)
                        {
                            return sub_7c2a8();
                        }
                    }
                    else
                    {
                        v36 = v30 + 12;
                    }
                    if (a3 > v36)
                    {
                        v37 = a9;
                        *(unsigned int *)a10 = 0;
LABEL_7a3ec:
                        if (v37)
                            _memcpy(v37, v22 + 0x400, 0x808);
LABEL_7a40c:
                        return sub_7c2a8();
                    }
                }
                else
                {
                    v37 = a9;
                    if ((unsigned long long)(v30 + 12) < a3)
                        goto LABEL_7a3ec;
                }
            }
        }
        return 0;
    }
}
