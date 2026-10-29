/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc54718..0xc549d4 (700 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void* sub_c54718(void* a0, void* a1, unsigned long a2)
{
    void* v0;  // x9
    unsigned long v1;  // x10
    unsigned long long v10;  // x9
    unsigned long long v11;  // x11
    void* v12;  // x13
    void* v13;  // x11
    char v14;  // x14
    unsigned long long v15;  // 4115
    unsigned long v16;  // cc_dep1
    unsigned long v17;  // cc_dep2
    char v18;  // x15
    void* v19;  // x13
    void* v2;  // x12
    unsigned long long v20;  // x14
    void* v21;  // x16
    char v22;  // x12
    unsigned int v23;  // w3
    unsigned long long v24;  // 4112
    unsigned long long v25;  // 4102
    unsigned long long v26;  // 4112
    unsigned long long v27;  // 4102
    unsigned long long v28;  // x8
    unsigned long long v29;  // 4120
    unsigned long v3;  // x8
    unsigned long long v30;  // x16
    char v31;  // x17
    char v32;  // x1
    void* v33;  // x8
    char v34;  // w13
    char v35;  // x13
    char v36;  // x15
    void* v4;  // x12
    char v5;  // x11
    unsigned long long v6;  // 4134
    unsigned long long v7;  // 4112
    char v8;  // x11
    char v9;  // x10

    v0 = *(long long *)a1;
    v1 = (long long)a1[8];
    if (v1 <= 3)
    {
        *(unsigned long long *)a0 = 19;
        *(void* *)&a0[8] = v0;
        *(char *)&a0[41] = 3;
        return a0;
    }
    v2 = v0;
    v3 = *(int *)v2;
    v4 = v2 + 4;
    v5 = v1 - 4;
    *(void* *)a1 = v4;
    *(unsigned long long *)&a1[8] = v5;
    v6 = arm64g_calculate_condition(49, v3 & 0xffffffff, 16, 0);
    if (!(v6 & 1))
    {
        v7 = arm64g_calculate_condition(1, v3 & 0xffffffff, 1, 0);
        if (!(v7 & 1))
        {
            *(unsigned long long *)a0 = 16;
            *(void* *)&a0[8] = v0;
            *(char *)&a0[41] = 3;
            return a0;
        }
        if (v5 <= 7)
        {
            *(unsigned long long *)a0 = 19;
            *(void* *)&a0[8] = v4;
            *(char *)&a0[41] = 3;
            return a0;
        }
        v8 = v1 - 12;
        v4 = v0 + 12;
        *(void* *)a1 = v4;
        *(unsigned long long *)&a1[8] = v8;
        v9 = (char)v0[11] * 0x100000000000000 | ((int)v0[4] * 0x100 | ((short)v0[8] | (char)v0[10] * 0x10000) * 0x10000000000) >> 8;
        v10 = 8;
        v11 = v8 - v9;
        if (v9 <= v8)
            goto LABEL_c5477c;
    }
    else
    {
        v10 = 4;
        v9 = v3;
        v11 = v5 - v3;
        if (v5 >= v3)
        {
LABEL_c5477c:
            *(void* *)a1 = v4 + v9;
            *(unsigned long long *)&a1[8] = v11;
            if (v9 > 1)
            {
                v12 = v4;
                v13 = *(short *)v12;
                if (((unsigned int)v13 & 0xfffe) != 2)
                {
                    *(char *)a0 = 0x11;
                    *(void* *)&a0[8] = v13;
                    *(char *)&a0[41] = 3;
                    return a0;
                }
                v14 = v9 - 2;
                v15 = arm64g_calculate_condition(49, v3 & 0xffffffff, 16, 0);
                if (!(v15 & 1))
                {
                    v16 = v14;
                    v17 = 7;
                    if (v14 <= 7)
                    {
                        *(char *)a0 = 19;
                        memset(a0 + 1, 0, 7);
                        *(void* *)&a0[8] = v12 + 2;
                        *(char *)&a0[41] = 3;
                        return a0;
                    }
                    v18 = v9 - 10;
                    v19 = v4 + 10;
                    v20 = (char)v4[9] * 0x100000000000000 | ((int)v4[2] * 0x100 | ((short)v4[6] | (char)v4[8] * 0x10000) * 0x10000000000) >> 8;
                }
                else
                {
                    v16 = v14;
                    v17 = 3;
                    if (v14 <= 3)
                    {
                        *(char *)a0 = 19;
                        memset(a0 + 1, 0, 7);
                        *(void* *)&a0[8] = v12 + 2;
                        *(char *)&a0[41] = 3;
                        return a0;
                    }
                    v18 = v9 - 6;
                    v19 = v4 + 6;
                    v20 = (int)v4[2];
                }
                if (v18)
                {
                    v21 = v19;
                    v22 = *(char *)v21;
                    v23 = v22 & 15;
                    if ((v22 - 1 & 0xff) < ((v22 ^ v22 - 1 & 0xff) & 0xff))
                    {
                        v24 = arm64g_calculate_condition(132, v16, v17, 0);
                        v25 = arm64g_calculate_condition(19, (v24 & 1 ? v23 : 0x40000000), 0, 0);
                        if (v25 & 1)
                            goto LABEL_c548f0;
                    }
                    else
                    {
                        v26 = arm64g_calculate_condition(132, v16, v17, 0);
                        v27 = arm64g_calculate_condition(16, (v26 & 1 ? v23 : 0x40000000), 0, 0);
                        if (v27 & 1)
                        {
LABEL_c548f0:
                            if (v18 == 1)
                            {
                                *(unsigned short *)a0 = 19;
                                *(unsigned short *)&a0[6] = 0;
                                *(unsigned int *)&a0[2] = 0;
                                *(void* *)&a0[8] = v21 + 1;
                                *(char *)&a0[41] = 3;
                                return a0;
                            }
                            else if ((char)v19[1])
                            {
                                *(char *)a0 = 0x44;
                                *(char *)&a0[41] = 3;
                                return a0;
                            }
                            else
                            {
                                v29 = arm64g_calculate_condition(129, v3 & 0xffffffff, 0x11, 0);
                                if (v29 & 1)
                                    v30 = 16;
                                else
                                    v30 = 8;
                                if (!(v22 >> 31 & 1))
                                {
                                    v31 = v22 * 2;
                                    if (v31)
                                    {
                                        v32 = v18 - 2;
                                        v33 = v19 + 2;
                                        v34 = (unsigned int)v30 + (unsigned int)v10 - v31 * (unsigned int)((v30 + v10) / v31);
                                        if (!v34)
                                            v35 = 0;
                                        else
                                            v35 = v31 - v34;
                                        v36 = v35;
                                        if (v36 <= v32)
                                        {
                                            *(void* *)a0 = v33 + v36;
                                            *(unsigned long long *)&a0[8] = v32 - v36;
                                            *(unsigned long *)&a0[16] = a2;
                                            *(unsigned long long *)&a0[24] = v9;
                                            *(unsigned long long *)&a0[32] = v20;
                                            *(char *)&a0[40] = v22;
                                            *(char *)&a0[41] = v10;
                                            *(unsigned short *)&a0[42] = (unsigned short)v13;
                                            return a0;
                                        }
                                        *(char *)a0 = 19;
                                        *(void* *)&a0[8] = v33;
                                        *(char *)&a0[41] = 3;
                                        return a0;
                                    }
                                }
                                *(char *)a0 = 25;
                                *(char *)&a0[1] = v22;
                                *(char *)&a0[41] = 3;
                                return a0;
                            }
                        }
                    }
                    v28 = 25;
                }
                else
                {
                    v22 = 0;
                    v28 = 19;
                }
                *(char *)a0 = v28;
                *(char *)&a0[1] = v22;
                *(unsigned short *)&a0[6] = 0;
                *(unsigned int *)&a0[2] = 0;
                *(void* *)&a0[8] = v19;
                *(char *)&a0[41] = 3;
                return a0;
            }
        }
    }
    *(unsigned long long *)a0 = 19;
    *(void* *)&a0[8] = v4;
    *(char *)&a0[41] = 3;
    return a0;
}
