/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc45680..0xc45864 (484 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void* * sub_c45680(void* *a0, void* iter, void* a2)
{
    unsigned int v0;  // w8
    unsigned long v1;  // cc_dep1
    unsigned long v10;  // cc_dep1
    void* v11;  // x9
    void* v12;  // x8
    unsigned long long v13;  // x10
    unsigned long long v14;  // 4110
    unsigned long long v15;  // 4102
    unsigned long long v16;  // 4110
    unsigned long long v17;  // 4102
    void* v18;  // x8
    unsigned long v19;  // x9
    void* v2;  // x8
    unsigned int *v20;  // w9
    unsigned int *v21;  // x11
    unsigned int *v22;  // w9
    unsigned int *v24;  // x12
    unsigned long v26;  // cc_dep1
    unsigned long v27;  // x8
    unsigned long v28;  // x10
    unsigned long long v29;  // x10
    unsigned long v3;  // x9
    unsigned long long v30;  // 4110
    unsigned long long v31;  // 4102
    unsigned long long v32;  // 4110
    unsigned long long v33;  // 4102
    unsigned long v34;  // 4112
    unsigned long v35;  // cc_op
    unsigned long v36;  // cc_dep1
    unsigned long v37;  // cc_dep2
    unsigned long long v38;  // 4119
    unsigned long v39;  // 4112
    unsigned int *v4;  // w9
    unsigned long long v40;  // 4119
    unsigned long long v41;  // 4112
    unsigned long long v42;  // 4102
    unsigned long long v43;  // 4112
    unsigned long long v44;  // 4102
    unsigned int *v5;  // x11
    unsigned int *v6;  // w9
    unsigned int *v8;  // x12

    if (3 < a2)
    {
        v0 = *(int *)iter;
        v1 = v0;
        if (-822415875 >= (int)v0)
        {
            if (-889275715 >= (int)v0)
            {
                switch (v0)
                {
                case 3199925962:
LABEL_c4576c:
                    v18 = a2 - 8;
                    if (a2 >= 8 && (v19 = (int)iter[4], (unsigned int)v19))
                    {
                        v20 = (unsigned int *)(unsigned int)((((((v19 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v19 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v19 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v19 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32);
                        v21 = iter + 8;
                        while (1)
                        {
                            v22 = v20;
                            if (v18 < 20)
                            {
                                v18 = 0;
                                v21 = 1;
                                v20 = (char *)v22 - 1;
                                if (v22 == 1)
                                    break;
                            }
                            else
                            {
                                v24 = v21;
                                v26 = *v24;
                                if (*v24 != 201326593)
                                {
                                    v20 = (char *)v22 - 1;
                                    v18 -= 20;
                                    v21 = v24 + 5;
                                    if (v22 == 1)
                                        break;
                                }
                                else
                                {
                                    v27 = v21[2];
                                    v28 = v21[3];
                                    v11 = (((((v27 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v27 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v27 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v27 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
                                    v12 = (((((v28 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v28 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v28 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v28 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
                                    v29 = a2 - v11;
                                    if (v11 <= a2)
                                    {
                                        v30 = arm64g_calculate_condition(35, v26, 201326593, 0);
                                        v31 = arm64g_calculate_condition(52, (v30 & 1 ? v29 : 0), (v30 & 1 ? v12 : 0), 0);
                                        if (v31 & 1)
                                        {
                                            *a0 = 0;
                                            return a0;
                                        }
                                    }
                                    else
                                    {
                                        v32 = arm64g_calculate_condition(35, v26, 201326593, 0);
                                        v33 = arm64g_calculate_condition(48, (v32 & 1 ? v29 : 0), (v32 & 1 ? v12 : 0), 0);
                                        if (v33 & 1)
                                        {
                                            *a0 = 0;
                                            return a0;
                                        }
                                    }
LABEL_c45850:
                                    a2 = v12;
                                    iter += v11;
                                    if (32 > a2)
                                        break;
                                    else
                                        goto LABEL_c4570c;
                                }
                            }
                        }
                    }
                    break;
                case 3216703178:
                    v2 = a2 - 8;
                    if (8 > a2)
                    {
                        *a0 = 0;
                        return a0;
                    }
                    v3 = (int)iter[4];
                    if ((unsigned int)v3)
                    {
                        v4 = (unsigned int *)(unsigned int)((((((v3 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v3 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v3 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v3 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32);
                        v5 = iter + 8;
                        while (1)
                        {
                            v6 = v4;
                            if (v2 < 32)
                            {
                                v2 = 0;
                                v5 = 1;
                                v4 = (char *)v6 - 1;
                                if (v6 == 1)
                                    break;
                            }
                            else
                            {
                                v8 = v5;
                                v10 = *v8;
                                if (*v8 != 201326593)
                                {
                                    v4 = (char *)v6 - 1;
                                    v2 -= 32;
                                    v5 = v8 + 8;
                                    if (v6 == 1)
                                        break;
                                }
                                else
                                {
                                    v11 = __builtin_bswap64(*(long long *)&v5[2]);
                                    v12 = __builtin_bswap64(*(long long *)&v5[4]);
                                    v13 = a2 - v11;
                                    if (v11 <= a2)
                                    {
                                        v14 = arm64g_calculate_condition(35, v10, 201326593, 0);
                                        v15 = arm64g_calculate_condition(132, (v14 & 1 ? v12 : 0x20000000), (v14 & 1 ? v13 : 0), 0);
                                        if (v15 & 1)
                                            break;
                                        else
                                            goto LABEL_c45850;
                                    }
                                    else
                                    {
                                        v16 = arm64g_calculate_condition(35, v10, 201326593, 0);
                                        v17 = arm64g_calculate_condition(128, (v16 & 1 ? v12 : 0x20000000), (v16 & 1 ? v13 : 0), 0);
                                        if (v17 & 1)
                                            break;
                                        else
                                            goto LABEL_c45850;
                                    }
                                }
                            }
                        }
                    }
                    break;
                default:
                    break;
                }
            }
            else
            {
                if (v0 == 0xcafebabe)
                    goto LABEL_c4576c;
                if (v0 != 3405691583)
                {
                    *a0 = 0;
                    return a0;
                }
            }
        }
        else
        {
            if (2 <= v0 + 17958194)
            {
                v34 = arm64g_calculate_condition(35, v1, 3472551421, 0);
                v35 = 3;
                v36 = (v34 & 1 ? v0 : 0x40000000);
                v37 = (v34 & 1 ? 0xcefaedfe : 0);
                v38 = arm64g_calculate_condition(19, v36, v37, 0);
                if (!(v38 & 1))
                    goto LABEL_c456fe;
LABEL_c456fd:
                v41 = arm64g_calculate_condition(v35 | 16, v36, v37, 0);
                v42 = arm64g_calculate_condition(19, (v41 & 1 ? v0 : 0x40000000), (v41 & 1 ? 0xcffaedfe : 0), 0);
                if (!(v42 & 1))
                    goto LABEL_c45704;
            }
            else
            {
                v39 = arm64g_calculate_condition(35, v1, 3472551421, 0);
                v35 = 0;
                v36 = (v39 & 1 ? v0 : 0x40000000);
                v37 = (v39 & 1 ? 0xcefaedfe : 0);
                v40 = arm64g_calculate_condition(16, v36, v37, 0);
                if (v40 & 1)
                    goto LABEL_c456fd;
LABEL_c456fe:
                v43 = arm64g_calculate_condition(v35 | 16, v36, v37, 0);
                v44 = arm64g_calculate_condition(16, (v43 & 1 ? v0 : 0x40000000), (v43 & 1 ? 0xcffaedfe : 0), 0);
                if (!(v44 & 1))
                {
LABEL_c45704:
                    if (a2 >= 32)
                    {
LABEL_c4570c:
                        if (*(int *)iter == 0xcffaedfe || *(int *)iter == 4277009103)
                        {
                            *a0 = iter;
                            a0[1] = iter;
                            a0[2] = a2;
                            return a0;
                        }
                    }
                }
            }
        }
    }
    *a0 = 0;
    return a0;
}
