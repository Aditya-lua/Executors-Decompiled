/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc4f5a8..0xc4f82c (644 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_c4f5a8(unsigned long idx, unsigned long a1, unsigned long a2, unsigned int a3, unsigned long a4, unsigned long a5, unsigned long long *a6, unsigned long a7)
{
    unsigned int v0;  // x11
    unsigned long long v1;  // x9
    unsigned long long v10;  // x11
    unsigned long long v12;  // x9
    unsigned long long v13;  // x10
    unsigned long long v14;  // x10
    unsigned long long v15;  // 4110
    unsigned long long v16;  // 4102
    unsigned long long v17;  // 4110
    unsigned long long v18;  // 4102
    unsigned int v19;  // x10
    unsigned int v2;  // x10
    unsigned long long v20;  // x8
    unsigned int v21;  // x9
    unsigned long long v22;  // x12
    unsigned long long v23;  // x13
    unsigned long long v24;  // 4106
    char *v25;  // x8
    unsigned int v26;  // x10
    unsigned long long v27;  // x8
    unsigned int v28;  // x9
    unsigned long long v29;  // x12
    unsigned long long v3;  // x13
    unsigned long long v30;  // x13
    unsigned long long v31;  // 4106
    unsigned long long v32;  // x9
    unsigned int v33;  // w10
    unsigned long v34;  // cc_dep1
    unsigned long long v35;  // x10
    unsigned long v37;  // x12
    unsigned long long v38;  // x10
    unsigned long long v39;  // x10
    unsigned long long v4;  // x14
    unsigned long long v40;  // 4110
    unsigned long long v41;  // 4102
    unsigned long long v42;  // 4110
    unsigned long long v43;  // 4102
    unsigned long long v5;  // 4106
    void* v6;  // x9
    unsigned long long v7;  // x4
    unsigned int v8;  // w11
    unsigned long v9;  // cc_dep1

    if (!a7)
    {
        *(unsigned long long *)idx = 0;
        *(unsigned long long *)(idx + 8) = 0;
        return idx;
    }
    else if (a1 != 13)
    {
        if (a1 != 14)
        {
            if (a1 != 15)
            {
                *(unsigned long long *)idx = 0;
                *(unsigned long long *)(idx + 8) = 0;
                return idx;
            }
            else if (*(long long *)(a4 + 240))
            {
                v0 = a6[6];
                if (v0)
                {
                    v1 = a6[5];
                    if (v0 == 1)
                    {
                        v2 = 0;
                    }
                    else
                    {
                        v2 = 0;
                        do
                        {
                            v3 = v0 >> 1;
                            v4 = v3 + v2;
                            if (a2 >= (unsigned long long)*(long long *)(v1 + 456 * v4 + 448))
                                v2 = v4;
                        } while ((v0 -= v3, 1 < v0));
                    }
                    if (*(long long *)(v1 + 456 * v2 + 448) != a2)
                    {
                        v5 = arm64g_calculate_condition(36, *(long long *)(v1 + 456 * v2 + 448), a2, 0);
                        if (!(v5 & 1))
                            v2 += 1;
                        if (v2)
                        {
                            v6 = v1 + 456 * v2;
                            if (!(*(int *)((char *)v6 - 456) & 1))
                            {
                                v7 = a2 - *(long long *)((char *)v6 - 448);
                                if (a2 >= (unsigned long long)*(long long *)((char *)v6 - 448))
                                {
                                    v8 = *((char *)v6 - 383);
                                    v9 = v8 & 0xff;
                                    v10 = 4;
                                    if (v8 == 8)
                                        v10 = 12;
                                    v12 = *(long long *)((char *)v6 - 408);
                                    v13 = *(long long *)((char *)v6 - 400) - v12 + v10;
                                    v14 = v7 - v13;
                                    if (v13 <= v7)
                                    {
                                        v15 = arm64g_calculate_condition(35, v9, 8, 0);
                                        v16 = arm64g_calculate_condition(36, (v15 & 1 ? v14 : 0x20000000), (v15 & 1 ? v12 : 0), 0);
                                    }
                                    else
                                    {
                                        v17 = arm64g_calculate_condition(35, v9, 8, 0);
                                        v18 = arm64g_calculate_condition(32, (v17 & 1 ? v14 : 0x20000000), (v17 & 1 ? v12 : 0), 0);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            else
            {
                *(unsigned long long *)idx = 0;
                *(unsigned long long *)(idx + 8) = 0;
                return idx;
            }
        }
        else
        {
            if (!a3)
            {
                v26 = a6[4];
                if (v26)
                {
                    v27 = a6[3];
                    if (v26 == 1)
                    {
                        v28 = 0;
                    }
                    else
                    {
                        v28 = 0;
                        do
                        {
                            v29 = v26 >> 1;
                            v30 = v29 + v28;
                            if (a2 >= (unsigned long long)*(long long *)(v27 + 560 * v30 + 448))
                                v28 = v30;
                        } while ((v26 -= v29, 1 < v26));
                    }
                    if (*(long long *)(v27 + 560 * v28 + 448) != a2)
                    {
                        v31 = arm64g_calculate_condition(36, *(long long *)(v27 + 560 * v28 + 448), a2, 0);
                        if (!(v31 & 1))
                            v28 += 1;
                        if (v28)
                        {
                            v25 = v27 + 560 * v28 - 560;
LABEL_c4f7c0:
                            if (!(*(int *)v25 & 1))
                            {
                                v32 = a2 - *(long long *)&v25[8];
                                if (a2 >= (unsigned long long)*(long long *)&v25[8])
                                {
                                    v33 = v25[73];
                                    v34 = v33 & 0xff;
                                    v35 = 4;
                                    if (v33 == 8)
                                        v35 = 12;
                                    v37 = *(long long *)&v25[48];
                                    v38 = *(long long *)&v25[56] - v37 + v35;
                                    v39 = v32 - v38;
                                    if (v38 <= v32)
                                    {
                                        v40 = arm64g_calculate_condition(35, v34, 8, 0);
                                        v41 = arm64g_calculate_condition(52, (v40 & 1 ? v39 : 0x20000000), (v40 & 1 ? v37 : 0), 0);
                                    }
                                    else
                                    {
                                        v42 = arm64g_calculate_condition(35, v34, 8, 0);
                                        v43 = arm64g_calculate_condition(48, (v42 & 1 ? v39 : 0x20000000), (v42 & 1 ? v37 : 0), 0);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            else if (a3 == 1 && (v19 = a6[6], v19))
            {
                v20 = a6[5];
                if (v19 == 1)
                {
                    v21 = 0;
                }
                else
                {
                    v21 = 0;
                    do
                    {
                        v22 = v19 >> 1;
                        v23 = v22 + v21;
                        if (a2 >= (unsigned long long)*(long long *)(v20 + 456 * v23 + 448))
                            v21 = v23;
                    } while ((v19 -= v22, 1 < v19));
                }
                if (*(long long *)(v20 + 456 * v21 + 448) != a2)
                {
                    v24 = arm64g_calculate_condition(36, *(long long *)(v20 + 456 * v21 + 448), a2, 0);
                    if (!(v24 & 1))
                        v21 += 1;
                    if (v21)
                    {
                        v25 = v20 + 456 * v21 - 456;
                        goto LABEL_c4f7c0;
                    }
                }
            }
        }
        *(unsigned long long *)idx = 1;
        *(unsigned long long *)(idx + 8) = 58;
        return idx;
    }
}
