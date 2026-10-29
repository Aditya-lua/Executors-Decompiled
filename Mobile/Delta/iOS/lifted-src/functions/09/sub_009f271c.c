/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f271c..0x9f29cc (688 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_9f271c(void* a0, unsigned long long a1, unsigned long long a2)
{
    unsigned long long v7;  // 4118
    unsigned long long v8;  // x22
    unsigned long v17;  // cc_dep1
    void* v18;  // x9
    unsigned long long v19;  // x10
    unsigned long long v20;  // 4110
    unsigned long long v21;  // 4102
    unsigned long long v22;  // 4110
    unsigned long long v23;  // 4102
    unsigned long long v24;  // x9
    uint128_t *iter;  // x10
    unsigned long node;  // x11
    unsigned long long v9;  // x21
    unsigned long long l;  // x12
    unsigned long long v28;  // x12
    uint128_t v29;  // q1
    uint128_t v30;  // q3
    unsigned long long v32;  // x12
    unsigned long long *v33;  // x10
    unsigned long long *iter1;  // x11
    unsigned long long v35;  // x12
    unsigned long v36;  // d0
    unsigned long long v10;  // x20
    unsigned long long v38;  // 4125
    char *iter2;  // x10
    char *v40;  // x11
    unsigned long long j;  // x8
    unsigned long long v42;  // x8
    void* v44;  // x9
    unsigned long long v45;  // x8
    unsigned long long v46;  // x9
    unsigned long long v11;  // x19
    uint128_t *v47;  // x10
    unsigned long v48;  // x11
    unsigned long long k;  // x12
    unsigned long long v50;  // x12
    uint128_t v51;  // q1
    uint128_t v52;  // q3
    unsigned long long v54;  // x12
    unsigned long long *v55;  // x10
    unsigned long long *v56;  // x11
    unsigned long long v12;  // x30
    unsigned long long v57;  // x12
    unsigned long v58;  // d0
    unsigned long long v60;  // 4125
    char *v61;  // x10
    char *v62;  // x11
    unsigned long long i;  // x8
    unsigned long long v64;  // x8
    unsigned long long v13;  // x0
    unsigned long long v14;  // x20
    unsigned long v15;  // x8
    unsigned long long v16;  // x8
    unsigned long long v0;  // [bp-0x30]
    unsigned long long v1;  // [bp-0x28]
    unsigned long long v2;  // [bp-0x20]
    unsigned long long v3;  // [bp-0x18]
    char *v4;  // [bp-0x10]
    unsigned long long v5;  // [bp-0x8]
    char v6;  // [bp+0x0]

    v7 = arm64g_calculate_condition(1, (int)a0[0x88], 1, 0);
    if (v7 & 1)
        return 0;
    v0 = v8;
    v1 = v9;
    v2 = v10;
    v3 = v11;
    v4 = &v6;
    v5 = v12;
    v13 = sub_a50638(*(long long *)a0);
    if (!(unsigned int)v13)
        return v13;
    v14 = v13;
    if (a2)
        *(long long *)a2 = (int)v14;
    if (!a1)
        return 1;
    v15 = (int)a0[0x88];
    if ((unsigned int)v14 != (unsigned int)v15)
    {
        v44 = a0 + v15;
        *(char *)&v44[104] = 128;
        if ((int)(v14 - v15) > 1)
            _bzero(v44 + 105);
        if ((int)v14 >= 1)
        {
            v45 = v14 & 0xffffffff;
            if ((unsigned int)v14 < 8 || a0 + v45 + 104 > a1 && a1 + v45 > a0 + 40)
            {
                v46 = 0;
            }
            else
            {
                if (32 > (unsigned int)v14)
                {
                    v46 = 0;
LABEL_9f2908:
                    v54 = v46;
                    v46 = v45 & 0x7ffffff8;
                    v55 = v54 + a0 + 104;
                    v56 = a1 + v54;
                    v57 = v54 - v46;
                    do
                    {
                        v58 = __dirty_unsupported_Iop_ZeroHI64ofV128(*(unsigned long long *)&*(double *)v55 ^ *(unsigned long long *)&*(double *)((char *)v55 - 64));
                        *v56 = v58;
                        v56 += 1;
                        v55 += 1;
                        v60 = arm64g_calculate_condition(18, v57, 8, 0);
                        v57 += 8;
                    } while (v60 & 1);
                    if (v46 == v45)
                        goto LABEL_9f2870;
                }
                else
                {
                    v46 = v45 & 0x7fffffe0;
                    v47 = a0 + 120;
                    v48 = a1 + 16;
                    k = v46;
                    do
                    {
                        v50 = k;
                        v51 = *v47;
                        v52 = *(int128_t *)((char *)v47 - 64);
                        *(int128_t *)(v48 - 16) = *(int128_t *)((char *)v47 - 16) ^ *(int128_t *)((char *)v47 - 80);
                        *(uint128_t *)v48 = v51 ^ v52;
                        v47 += 2;
                        v48 += 32;
                        k = v50 - 32;
                    } while (k);
                    if (v46 == v45)
                        goto LABEL_9f2870;
                    if (v45 & 24)
                        goto LABEL_9f2908;
                }
            }
            v61 = a1 + v46;
            v62 = v46 + a0 + 104;
            i = v45 - v46;
            do
            {
                v64 = i;
                *v61 = *(v62 - 64) ^ *v62;
                v61 += 1;
                v62 += 1;
                i = v64 - 1;
            } while (i);
        }
    }
    else if ((int)v14 >= 1)
    {
        v16 = v14 & 0xffffffff;
        v17 = v14 & 0xffffffff;
        if ((unsigned int)v14 >= 8)
        {
            v18 = a0 + 8;
            v19 = a1 + v16;
            if (a1 < a0 + v16 + 104)
            {
                v20 = arm64g_calculate_condition(131, v17, 8, 0);
                v21 = arm64g_calculate_condition(52, (v20 & 1 ? v18 : 0x20000000), (v20 & 1 ? v19 : 0), 0);
                if (!(v21 & 1))
                    goto LABEL_9f27a0;
            }
            else
            {
                v22 = arm64g_calculate_condition(131, v17, 8, 0);
                v23 = arm64g_calculate_condition(48, (v22 & 1 ? v18 : 0x20000000), (v22 & 1 ? v19 : 0), 0);
                if (!(v23 & 1))
                {
LABEL_9f27a0:
                    if (32 > (unsigned int)v14)
                    {
                        v24 = 0;
                        goto LABEL_9f298c;
                    }
                    v24 = v16 & 0x7fffffe0;
                    iter = a0 + 120;
                    node = a1 + 16;
                    l = v24;
                    do
                    {
                        v28 = l;
                        v29 = *iter;
                        v30 = *(int128_t *)((char *)iter - 96);
                        *(int128_t *)(node - 16) = *(int128_t *)((char *)iter - 16) ^ *(int128_t *)((char *)iter - 112);
                        *(uint128_t *)node = v29 ^ v30;
                        iter += 2;
                        node += 32;
                        l = v28 - 32;
                    } while (l);
                    if (v24 == v16)
                        goto LABEL_9f2870;
                    if (v16 & 24)
                    {
LABEL_9f298c:
                        v32 = v24;
                        v24 = v16 & 0x7ffffff8;
                        v33 = v32 + a0 + 104;
                        iter1 = a1 + v32;
                        v35 = v32 - v24;
                        do
                        {
                            v36 = __dirty_unsupported_Iop_ZeroHI64ofV128(*(unsigned long long *)&*(double *)v33 ^ *(unsigned long long *)&*(double *)((char *)v33 - 96));
                            *iter1 = v36;
                            iter1 += 1;
                            v33 += 1;
                            v38 = arm64g_calculate_condition(18, v35, 8, 0);
                            v35 += 8;
                        } while (v38 & 1);
                        if (v24 == v16)
                            goto LABEL_9f2870;
                        goto LABEL_9f2844;
                    }
                }
            }
        }
        v24 = 0;
LABEL_9f2844:
        iter2 = a1 + v24;
        v40 = v24 + a0 + 104;
        j = v16 - v24;
        do
        {
            v42 = j;
            *iter2 = *(v40 - 96) ^ *v40;
            iter2 += 1;
            v40 += 1;
            j = v42 - 1;
        } while (j);
    }
LABEL_9f2870:
    if ((int)sub_a50654(*(long long *)a0, a1, a1, v14) <= 0)
    {
        sub_a66ec0(a1, (int)v14);
        return 0;
    }
    return 1;
}
