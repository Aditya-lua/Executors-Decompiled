/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc4fa38..0xc50020 (1512 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void sub_c4fa38(unsigned long a0, unsigned long long a1, void* a2, unsigned long long a3, unsigned int a4)
{
    unsigned long long v17;  // x24
    unsigned long long v18;  // x19
    unsigned long long v27;  // x8
    unsigned long long v28;  // x12
    unsigned long long v29;  // x11
    unsigned long long v30;  // x8
    unsigned long long index;  // x28
    unsigned long v32;  // x8
    unsigned long long v33;  // x25
    unsigned long long v34;  // x26
    unsigned long long v35;  // x19
    unsigned long long v36;  // 4167
    unsigned long long v19;  // x9
    void* iter;  // x22
    unsigned long long v38;  // x8
    unsigned long long v39;  // x8
    unsigned long long v40;  // x8
    void* iter1;  // x24
    unsigned long long n;  // x27
    void* v43;  // x8
    char *iter2;  // x9
    void* v45;  // x11
    void* v46;  // x10
    unsigned long long v20;  // x8
    unsigned long long v47;  // x8
    void* v48;  // x12
    unsigned long long v49;  // 4151
    unsigned int v50;  // w13
    unsigned int v51;  // w8
    uint128_t v52;  // q1
    unsigned long long v53;  // 4174
    void* v54;  // x1
    unsigned long long v55;  // 4188
    unsigned int v56;  // w11
    unsigned long long v21;  // x8
    unsigned int v57;  // w9
    unsigned long long v58;  // x9
    void* v59;  // x11
    uint128_t v60;  // q1
    uint128_t v61;  // q1
    unsigned long long *v62;  // x0
    unsigned long v63;  // x10
    unsigned long v64;  // x9
    unsigned long v65;  // x12
    unsigned long long v66;  // 4140
    unsigned long long v22;  // x8
    unsigned long long v67;  // x10
    unsigned long long v68;  // x9
    unsigned long long *v69;  // x11
    unsigned long v70;  // x13
    unsigned long long v71;  // 4137
    unsigned long long *v72;  // x11
    unsigned long long *v73;  // x11
    unsigned long v74;  // x12
    unsigned long long v75;  // 4141
    unsigned long long i;  // x8
    unsigned int v23;  // w8
    unsigned long long v77;  // x11
    uint128_t *node;  // x10
    uint128_t *v79;  // x11
    uint128_t v80;  // q0
    uint128_t v81;  // q1
    uint128_t v82;  // q3
    unsigned long long v83;  // x8
    unsigned long long v24;  // x22
    unsigned long long idx;  // x23
    unsigned long long v26;  // x27
    unsigned long v0;  // [bp-0x338]
    unsigned long v1;  // [bp-0x330]
    unsigned long v2;  // [bp-0x328]
    unsigned long v3;  // [bp-0x320]
    unsigned long v4;  // [bp-0x310]
    unsigned long long v5;  // [bp-0x308]
    unsigned long long v6;  // [bp-0x300]
    unsigned long long v7;  // [bp-0x2f8]
    char *v8;  // [bp-0x2f0]
    unsigned long long v9;  // [bp-0x2e8]
    unsigned long long v10;  // [bp-0x2e0]
    unsigned long long v11;  // [bp-0x2d8]
    unsigned long long v12;  // [bp-0x2c8]
    char v13;  // [bp-0x2c0]
    char v14;  // [bp-0xac]
    char *v15;  // [bp-0x10]
    char v16;  // [bp+0x0]

    v15 = &v16;
    v17 = a3;
    v18 = a1;
    v19 = 0x4000000000000000 / a1;
    v5 = (a1 * v19 == 0x4000000000000000 ? v19 : v19 + 1);
    if (0x1000 >= a1)
    {
        v20 = v18 - (v18 >> 1);
        v21 = (v20 < 64 ? v20 : 64);
    }
    else
    {
        v22 = v18 | 1;
        v23 = (unsigned int)(!v22 ? 64 : Clz(v22)) ^ 63;
        v21 = (1 << (((char)v23 & 1) + (char)(v23 >> 1) & 63)) + (v18 >> (((char)v23 & 1) + (char)(v23 >> 1) & 63)) >> 1;
    }
    v6 = v18;
    v7 = v21;
    v24 = 0;
    idx = 0;
    v2 = a0 + 16;
    v3 = a0 + 64;
    v0 = a0 + 80;
    v1 = a0 - 16;
    v4 = a0 - 32;
    v26 = 1;
    v10 = v17;
    v27 = v18 - 0;
    if (v18 <= 0)
        goto LABEL_c4fb20;
    else
        goto LABEL_c4fb34;
    while (1)
    {
        index = idx - 1;
        if ((&v14)[2 + index] < (unsigned int)v28)
        {
LABEL_c4ff98:
            v18 = v6;
            v29 = v9;
            break;
        }
        v32 = *(long long *)&(&v13)[8 * index];
        v33 = v32 >> 1;
        v34 = v26 >> 1;
        v35 = v33 + v34;
        v36 = arm64g_calculate_condition((v35 <= v17 ? 4 : 0), (v35 <= v17 ? ((unsigned int)v32 | (unsigned int)v26) & 1 : 0), 0, 0);
        if (!(v36 & 1))
        {
            iter = a0 + (v24 - v35) * 32;
            if (!(v32 & 1))
            {
                v38 = v33 | 1;
                sub_c50020(iter, v33, a2, v17, (unsigned int)(!v38 ? 64 : Clz(v38)) * 2 ^ 126, 0);
                v28 = v12;
                if (!(v26 & 1))
                    goto LABEL_c4fe40;
            }
            else if (!(v26 & 1))
            {
LABEL_c4fe40:
                v39 = v34 | 1;
                sub_c50020(iter + v33 * 32, v34, a2, v17, (unsigned int)(!v39 ? 64 : Clz(v39)) * 2 ^ 126, 0);
                v28 = v12;
                if (v34)
                {
LABEL_c4fe70:
                    if (v33)
                    {
                        v40 = (v34 < v33 ? v34 : v33);
                        if (v17 >= v40)
                        {
                            iter1 = iter + v33 * 32;
                            n = v40 * 32;
                            _memcpy(a2, (v34 < v33 ? iter1 : iter), n);
                            v43 = a2 + n;
                            if (v33 > v34)
                            {
                                iter2 = v8;
                                do
                                {
                                    v45 = iter1 - 32;
                                    v46 = v43 - 32;
                                    if ((unsigned long long)*(long long *)((char *)v43 - 16) < (unsigned long long)*(long long *)((char *)iter1 - 16))
                                    {
                                        v47 = 1;
                                        v48 = v45;
                                    }
                                    else
                                    {
                                        v49 = arm64g_calculate_condition(132, *(long long *)((char *)v43 - 16), *(long long *)((char *)iter1 - 16), 0);
                                        v50 = !(v49 & 1);
                                        v51 = (unsigned long long)*(long long *)v45 > (unsigned long long)*(long long *)v46;
                                        v47 = v50 & v51;
                                        v48 = (v50 & v51 ? v45 : v46);
                                    }
                                    v52 = (int128_t)v48[16];
                                    *(int128_t *)iter2 = *(int128_t *)v48;
                                    *(uint128_t *)&iter2[16] = v52;
                                    iter2 -= 32;
                                    iter1 = v45 + (~(unsigned int)v47 & 1) * 32;
                                    v43 = v46 + (v47 & 1) * 32;
                                    v53 = arm64g_calculate_condition((iter1 != iter ? 4 : 0), (iter1 != iter ? v43 : 0x40000000), (iter1 != iter ? a2 : 0), 0);
                                } while (!(v53 & 1));
                                iter = iter1;
                            }
                            else
                            {
                                v54 = a2;
                                do
                                {
                                    if ((unsigned long long)(long long)v54[16] <= (unsigned long long)(long long)iter1[16])
                                    {
                                        v55 = arm64g_calculate_condition(132, (long long)iter1[16], (long long)v54[16], 0);
                                        v56 = !(v55 & 1);
                                        v57 = (unsigned long long)*(long long *)v54 > (unsigned long long)*(long long *)iter1;
                                        v58 = v56 & v57;
                                        v59 = (v56 & v57 ? iter1 : v54);
                                        v60 = (int128_t)v59[16];
                                        *(int128_t *)iter = *(int128_t *)v59;
                                        *(uint128_t *)&iter[16] = v60;
                                        iter += 32;
                                        v54 += ((unsigned int)v58 ^ 1) * 32;
                                        if (v54 == v43)
                                            break;
                                    }
                                    else
                                    {
                                        v58 = 1;
                                        v61 = (int128_t)iter1[16];
                                        *(int128_t *)iter = *(int128_t *)iter1;
                                        *(uint128_t *)&iter[16] = v61;
                                        iter += 32;
                                        if (v54 == v43)
                                            break;
                                    }
                                } while ((iter1 += v58 * 32, iter1 != a0 + v30));
                            }
                            _memcpy(iter);
                            v17 = v10;
                            v28 = v12;
                        }
                    }
                }
LABEL_c4fd90:
                v26 = 1 | v35 * 2;
                v24 = v11;
                idx = index;
                if (idx > 1)
                    continue;
                goto LABEL_c4ff94;
            }
            if (v34)
                goto LABEL_c4fe70;
            goto LABEL_c4fd90;
        }
        else
        {
            v26 = v35 * 2;
            idx = index;
            if (1 >= idx)
            {
LABEL_c4ff94:
                idx = 1;
                goto LABEL_c4ff98;
            }
        }
    }
    while (1)
    {
        *(unsigned long long *)&(&v13)[8 * idx] = v26;
        (&v14)[2 + idx] = v28;
        if (v24 >= v18)
        {
            if (!(v26 & 1))
            {
                sub_c50020();
                return;
            }
            return;
        }
        idx += 1;
        v24 += v29 >> 1;
        v26 = v29;
        v27 = v18 - v24;
        if (v24 >= v18)
        {
LABEL_c4fb20:
            v28 = 0;
            v29 = 1;
            if (2 > idx)
                continue;
        }
LABEL_c4fb34:
        v62 = a0 + v24 * 32;
        if (v7 > v27)
        {
LABEL_c4fb48:
            if (a4 & 1)
            {
                sub_c50020();
                v29 = 1 | (v27 < 32 ? v27 : 32) * 2;
                v17 = v10;
                goto LABEL_c4fd28;
            }
            else
            {
                v29 = (v27 < v7 ? v27 : v7) * 2;
                goto LABEL_c4fd28;
            }
        }
        else if (v27 >= 2)
        {
            v63 = v62[6];
            v64 = v62[2];
            if (v63 >= v64 && (v65 = v62[4], v66 = arm64g_calculate_condition((v63 <= v64 ? 4 : 0) | 48, (v63 <= v64 ? v62[4] : 0x20000000), (v63 <= v64 ? *v62 : 0), 0), !(v66 & 1)))
            {
                if (v27 == 2)
                {
                    v67 = 0;
                    v68 = 2;
                    goto LABEL_c4fcdc;
                }
                else
                {
                    v69 = v0 + v24 * 32;
                    v68 = 2;
                    while (1)
                    {
                        v70 = *v69;
                        if (v70 < v63 || !(v71 = arm64g_calculate_condition((v70 <= v63 ? 4 : 0) | 48, (v70 <= v63 ? *(long long *)((char *)v69 - 16) : 0x20000000), (v70 <= v63 ? v65 : 0), 0), !(v71 & 1)))
                            break;
                        v72 = v69 + 4;
                        v68 += 1;
                        v65 = *(long long *)((char *)v69 - 16);
                        v63 = v70;
                        v69 = v72;
                        if (v27 == v68)
                        {
                            v67 = 0;
                            v68 = v27;
                            if (v27 >= v7)
                                goto LABEL_c4fcdc;
                            goto LABEL_c4fb48;
                        }
                    }
                    v67 = 0;
                    goto LABEL_c4fcdc;
                }
            }
            else
            {
                if (v27 == 2)
                {
                    v67 = 1;
                    v68 = 2;
                    goto LABEL_c4fcdc;
                }
                else
                {
                    v73 = v3 + v24 * 32;
                    v68 = 2;
                    do
                    {
                        v74 = v73[2];
                        if (v74 >= v63 && (v75 = arm64g_calculate_condition((v74 <= v63 ? 4 : 0) | 48, (v74 <= v63 ? *v73 : 0x20000000), (v74 <= v63 ? *(long long *)((char *)v73 - 32) : 0), 0), !(v75 & 1)))
                        {
                            v67 = 1;
                            if (v68 >= v7)
                                goto LABEL_c4fcdc;
                            goto LABEL_c4fb48;
                        }
                    } while ((v68 += 1, v73 += 4, v63 = v74, v27 != v68));
                    v67 = 1;
                    v68 = v27;
LABEL_c4fcdc:
                    if (v67 & 1)
                    {
                        i = v68 >> 1;
                        if (i)
                        {
                            v77 = v24 * 32;
                            node = v2 + v77;
                            v79 = v1 + v77 + v68 * 32;
                            do
                            {
                                v80 = *(int128_t *)((char *)node - 16);
                                v81 = *node;
                                v82 = *v79;
                                *(int128_t *)((char *)node - 16) = *(int128_t *)((char *)v79 - 16);
                                *node = v82;
                                *(uint128_t *)((char *)v79 - 16) = v80;
                                *v79 = v81;
                                node += 2;
                                v79 = (char *)v79 - 32;
                                i -= 1;
                            } while (i);
                        }
                    }
                    v27 = v68;
                    goto LABEL_c4fd20;
                }
            }
            goto LABEL_c4fb48;
        }
        else
        {
LABEL_c4fd20:
            v29 = 1 | v27 * 2;
LABEL_c4fd28:
            v83 = v5 * (v24 * 2 + (v29 >> 1)) ^ v5 * (v24 * 2 - (v26 >> 1));
            v28 = (!v83 ? 64 : Clz(v83));
        }
    }
}
