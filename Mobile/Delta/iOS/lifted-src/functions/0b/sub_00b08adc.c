/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb08adc..0xb09230 (1876 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern long long g_dfe294;
extern char g_10002b0;

unsigned long long sub_b08adc(void* a0, unsigned long long index, long long *a2, unsigned long long idx, unsigned long long a4)
{
    unsigned long long iter;  // x20
    unsigned long long v6;  // x23
    uint128_t v15;  // q1
    uint128_t v16;  // q3
    uint128_t v17;  // q0
    uint128_t v18;  // q1
    uint128_t v19;  // q3
    unsigned long long v20;  // x12
    double *v21;  // x9
    unsigned long long *node;  // x10
    unsigned long long *iter1;  // x11
    unsigned long long v24;  // x12
    unsigned long v7;  // x8
    uint128_t v25;  // q0
    unsigned long v26;  // d1
    unsigned long long v28;  // 4124
    unsigned long long i;  // x9
    char *iter2;  // x10
    char *v31;  // x11
    char *v32;  // x8
    unsigned long long v33;  // x9
    char v34;  // x12
    unsigned long long v8;  // 4106
    unsigned long long v36;  // x8
    uint128_t v37;  // q0
    uint128_t v38;  // q1
    uint128_t v39;  // q0
    uint128_t v40;  // q1
    unsigned long long v41;  // x12
    double *v42;  // x9
    unsigned long long *v43;  // x10
    unsigned long long *v44;  // x11
    unsigned long v9;  // x27
    unsigned long long v45;  // x12
    unsigned long v47;  // d0
    unsigned long long v49;  // 4124
    unsigned long long j;  // x9
    char *v51;  // x10
    char *v52;  // x11
    char *v53;  // x8
    unsigned long long v54;  // x9
    uint128_t *v10;  // x25
    char v56;  // x12
    long long v58;  // x27
    unsigned long long v59;  // x27
    uint128_t *v60;  // x22
    unsigned long long v62;  // 4137
    unsigned long long v63;  // 4114
    unsigned long long v64;  // x25
    uint128_t *v11;  // x28
    uint128_t *v12;  // x26
    unsigned long long v13;  // x8
    uint128_t v14;  // q0
    uint128_t v0[8];  // [bp-0x110]
    char v1;  // [bp-0xd0]
    unsigned long v2;  // [bp-0x70]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    iter = a4;
    v2 = *(long long *)&g_10002b0;
    v6 = (long long)a0[832];
    v7 = (char)a0[816];
    if (!(v7 >> 1 & 1))
    {
        if (index)
        {
            v8 = arm64g_calculate_condition(2, v6, 1, 0);
            if (!(v8 & 1))
            {
                if (v6 + 16 == iter)
                {
                    v9 = -(unsigned int)v0 & 15;
                    v10 = (char *)v0 + v9;
                    v11 = v10 + 4;
                    *(unsigned int *)&a0[416] = 0;
                    if (64 >= v6)
                    {
                        v12 = v10 + 3;
                        sub_9f0720(v10, &g_dfe294, 128, a0 + 384, a0 + 416);
                        sub_aa4d60(a0 + 504, v10);
                        *(unsigned int *)&a0[496] = 0;
                        *v12 = (int128_t)a0[780];
                        *(unsigned long long *)&a0[800] = 13;
                        *(unsigned long long *)&a0[808] = v6;
                        if (!((char)((char)a0[108]) >> 1 & 1))
                        {
                            if (v6)
                            {
                                v13 = 0;
                                if (v6 >= 8 && index - idx >= 32)
                                {
                                    if (32 > v6)
                                    {
                                        v13 = 0;
LABEL_b09014:
                                        v20 = v13;
                                        v13 = v6 & 120;
                                        v21 = idx + v20;
                                        node = &(&v1)[v20 + v9];
                                        iter1 = index + v20;
                                        v24 = v20 - v13;
                                        do
                                        {
                                            v25 = *(unsigned long long *)&*v21;
                                            v21 += 1;
                                            v26 = __dirty_unsupported_Iop_ZeroHI64ofV128(v25 ^ *(unsigned long long *)&*(double *)node);
                                            *iter1 = v26;
                                            iter1 += 1;
                                            *node = *(unsigned long long *)&v25;
                                            node += 1;
                                            v28 = arm64g_calculate_condition(18, v24, 8, 0);
                                            v24 += 8;
                                        } while (v28 & 1);
                                        if (v6 == v13)
                                            goto LABEL_b09164;
                                    }
                                    else
                                    {
                                        v13 = v6 & 96;
                                        v14 = *(int128_t *)idx;
                                        v15 = *(int128_t *)(idx + 16);
                                        v16 = v10[5];
                                        *(uint128_t *)index = v14 ^ v10[4];
                                        *(uint128_t *)(index + 16) = v15 ^ v16;
                                        v10[4] = v14;
                                        v10[5] = v15;
                                        if (v13 != 32)
                                        {
                                            v17 = *(int128_t *)(idx + 32);
                                            v18 = *(int128_t *)(idx + 48);
                                            v19 = v10[7];
                                            *(uint128_t *)(index + 32) = v17 ^ v10[6];
                                            *(uint128_t *)(index + 48) = v18 ^ v19;
                                            v10[6] = v17;
                                            v10[7] = v18;
                                        }
                                        if (v6 == v13)
                                            goto LABEL_b09164;
                                        if (v6 & 24)
                                            goto LABEL_b09014;
                                    }
                                }
                                i = v6 - v13;
                                iter2 = index + v13;
                                v31 = &(&v1)[v9 + v13];
                                v32 = idx + v13;
                                do
                                {
                                    v33 = i;
                                    v34 = *v32;
                                    v32 += 1;
                                    *iter2 = *v31 ^ v34;
                                    iter2 += 1;
                                    *v31 = v34;
                                    v31 += 1;
                                    i = v33 - 1;
                                } while (i);
                            }
                        }
                        else
                        {
                            if (v6)
                            {
                                v36 = 0;
                                if (v6 >= 8 && index - idx >= 32)
                                {
                                    if (32 > v6)
                                    {
                                        v36 = 0;
LABEL_b090e4:
                                        v41 = v36;
                                        v36 = v6 & 120;
                                        v42 = idx + v41;
                                        v43 = &(&v1)[v41 + v9];
                                        v44 = index + v41;
                                        v45 = v41 - v36;
                                        do
                                        {
                                            v47 = __dirty_unsupported_Iop_ZeroHI64ofV128(*(unsigned long long *)&*v42 ^ *(unsigned long long *)&*(double *)v43);
                                            *v43 = v47;
                                            v43 += 1;
                                            *v44 = v47;
                                            v44 += 1;
                                            v49 = arm64g_calculate_condition(18, v45, 8, 0);
                                            v42 += 1;
                                            v45 += 8;
                                        } while (v49 & 1);
                                        if (v6 == v36)
                                            goto LABEL_b09164;
                                    }
                                    else
                                    {
                                        v36 = v6 & 96;
                                        v37 = *(int128_t *)idx ^ v10[4];
                                        v38 = *(int128_t *)(idx + 16) ^ v10[5];
                                        v10[4] = v37;
                                        v10[5] = v38;
                                        *(uint128_t *)index = v37;
                                        *(uint128_t *)(index + 16) = v38;
                                        if (v36 != 32)
                                        {
                                            v39 = *(int128_t *)(idx + 32) ^ v10[6];
                                            v40 = *(int128_t *)(idx + 48) ^ v10[7];
                                            v10[6] = v39;
                                            v10[7] = v40;
                                            *(uint128_t *)(index + 32) = v39;
                                            *(uint128_t *)(index + 48) = v40;
                                        }
                                        if (v6 == v36)
                                            goto LABEL_b09164;
                                        if (v6 & 24)
                                            goto LABEL_b090e4;
                                    }
                                }
                                j = v6 - v36;
                                v51 = index + v36;
                                v52 = &(&v1)[v9 + v36];
                                v53 = idx + v36;
                                do
                                {
                                    v54 = j;
                                    v56 = *v52 ^ *v53;
                                    *v52 = v56;
                                    v52 += 1;
                                    *v51 = v56;
                                    v51 += 1;
                                    v53 += 1;
                                    j = v54 - 1;
                                } while (j);
                            }
                        }
LABEL_b09164:
                        v58 = -(unsigned int)v6 & 15;
                        _bzero((char *)v11 + v6, v58);
                        v11 = (char *)v11 + v58 + v6;
                        v59 = 128;
                    }
                    else
                    {
                        sub_9f0720(v10, &g_dfe294, 64, a0 + 384, a0 + 416);
                        sub_aa4d60(a0 + 504, v10);
                        *(unsigned int *)&a0[416] = 1;
                        *(unsigned int *)&a0[496] = 0;
                        sub_aa4dc0(a0 + 504, a0 + 780, 16);
                        *(unsigned long long *)&a0[800] = 13;
                        *(unsigned long long *)&a0[808] = v6;
                        if (!((char)((char)a0[108]) >> 1 & 1))
                        {
                            sub_aa4dc0(a0 + 504, idx, v6);
                            sub_9f0720(index, idx, v6, a0 + 384, a0 + 416);
                        }
                        else
                        {
                            sub_9f0720(index, idx, v6, a0 + 384, a0 + 416);
                            sub_aa4dc0(a0 + 504, index, v6);
                        }
                        sub_aa4dc0(a0 + 504, &g_dfe294, -(unsigned int)v6 & 15);
                        v59 = 64;
                        v12 = v11;
                    }
                    v60 = index + v6;
                    *v11 = (int128_t)a0[800];
                    sub_aa4dc0(a0 + 504, v12);
                    sub_a66ec0(v10, v59);
                    sub_aa4e98();
                    *(unsigned long long *)&a0[832] = 0xffffffffffffffff;
                    if ((char)((char)a0[108]) >> 1 & 1)
                    {
                        *v60 = (int128_t)a0[764];
                    }
                    else if (!sub_a66f20(v12, idx + v6, 16))
                    {
                        iter -= 16;
                    }
                    else if (iter >= 0x11)
                    {
                        _bzero((char *)v60 - iter + 16, iter - 16);
                        if (*(long long *)&g_10002b0 == v2)
                            return 0;
                        ___stack_chk_fail();
                    }
                    else
                    {
                        if (*(long long *)&g_10002b0 == v2)
                            return 0;
                        ___stack_chk_fail();
                    }
                    *a2 = iter;
                    if (*(long long *)&g_10002b0 == v2)
                        return 1;
                    ___stack_chk_fail();
                }
                else
                {
                    if (*(long long *)&g_10002b0 == v2)
                        return 0;
                    ___stack_chk_fail();
                }
            }
        }
        *(unsigned int *)&a0[416] = 0;
        sub_9f0720(a0 + 432, &g_dfe294, 64, a0 + 384, a0 + 416);
        sub_aa4d60(a0 + 504, a0 + 432);
        *(unsigned int *)&a0[416] = 1;
        *(unsigned int *)&a0[496] = 0;
        *(uint128_t *)&a0[800] = 0;
        v7 = (char)a0[816] | 2;
        *(char *)&a0[816] = v7;
        v62 = arm64g_calculate_condition(2, v6, 1, 0);
        if (!(v62 & 1))
        {
            sub_aa4dc0(a0 + 504, a0 + 780, 13);
            *(unsigned long long *)&a0[800] = 13;
            v7 = (char)a0[816] | 1;
            *(char *)&a0[816] = v7;
        }
    }
    if (!idx)
    {
        if (v7 & 1)
        {
            if ((long long)a0[800] & 15)
            {
                sub_aa4dc0(a0 + 504, &g_dfe294, 16 - ((long long)a0[800] & 15));
                v7 = (char)a0[816];
            }
            *(char *)&a0[816] = (char)v7 & 254;
        }
        if ((long long)a0[808] & 15)
            sub_aa4dc0(a0 + 504, &g_dfe294, 16 - ((long long)a0[808] & 15));
        sub_aa4dc0(a0 + 504, a0 + 800, 16);
        sub_aa4e98();
        *(char *)&a0[816] = (char)a0[816] & 253;
        if (!((char)((char)a0[108]) >> 1 & 1))
        {
            if (!sub_a66f20(v0, a0 + 764, (long long)a0[824]))
            {
                *a2 = iter;
                if (*(long long *)&g_10002b0 == v2)
                    return 1;
                ___stack_chk_fail();
            }
        }
        else
        {
            *a2 = iter;
            if (*(long long *)&g_10002b0 == v2)
                return 1;
            ___stack_chk_fail();
        }
    }
    else if (index)
    {
        if (v7 & 1)
        {
            if ((long long)a0[800] & 15)
            {
                sub_aa4dc0(a0 + 504, &g_dfe294, 16 - ((long long)a0[800] & 15));
                v7 = (char)a0[816];
            }
            *(char *)&a0[816] = (char)v7 & 254;
        }
        *(unsigned long long *)&a0[832] = 0xffffffffffffffff;
        v63 = arm64g_calculate_condition(2, v6, 1, 0);
        v64 = iter;
        if (v63 & 1 || !(v64 = v6, v6 + 16 != iter))
        {
            if ((char)((char)a0[108]) >> 1 & 1)
                (*(long long *)((long long)a0[360] + 8))();
            sub_aa4dc0(a0 + 504, idx, v64);
            (*(long long *)((long long)a0[360] + 8))();
        }
    }
    else if (!(long long)a0[808])
    {
        sub_aa4dc0(a0 + 504, idx, iter);
        *(unsigned long long *)&a0[800] = (long long)a0[800] + iter;
        *(char *)&a0[816] = (char)a0[816] | 1;
        *a2 = iter;
        if (*(long long *)&g_10002b0 == v2)
            return 1;
        ___stack_chk_fail();
    }
    *a2 = 0;
    if (*(long long *)&g_10002b0 == v2)
        return 0;
    ___stack_chk_fail();
}
