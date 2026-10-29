/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc4b278..0xc4b75c (1252 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void sub_c4b278(unsigned long a0, unsigned long long a1, void* a2, unsigned long long a3, unsigned int a4)
{
    unsigned long long v16;  // x24
    unsigned long long v17;  // x19
    unsigned long long v26;  // x9
    unsigned long long v27;  // x10
    unsigned long long v28;  // x11
    unsigned long long v29;  // x8
    unsigned long long v30;  // x22
    unsigned long long idx;  // x28
    unsigned int v32;  // w8
    unsigned long v33;  // cc_dep1
    unsigned long v34;  // cc_dep2
    unsigned long v35;  // x8
    unsigned long long v18;  // x9
    unsigned long long v36;  // x25
    unsigned long long v37;  // x26
    unsigned long long v38;  // x19
    unsigned long v39;  // x9
    unsigned long long v40;  // 4110
    unsigned long long v41;  // 4102
    unsigned long long v42;  // 4110
    unsigned long long v43;  // 4102
    void* node;  // x21
    unsigned long long v45;  // x8
    unsigned long long v19;  // x8
    void* iter;  // x24
    void* v47;  // x8
    char *iter1;  // x9
    void* v49;  // x10
    void* v50;  // x11
    unsigned long v51;  // x8
    unsigned long v52;  // x12
    unsigned long v53;  // cc_dep1
    unsigned long v54;  // cc_dep2
    void* v55;  // x13
    unsigned long long v20;  // x8
    uint128_t v56;  // q0
    unsigned long long v57;  // 4110
    unsigned long long v58;  // 4102
    unsigned long long v59;  // 4110
    unsigned long long v60;  // 4102
    void* iter2;  // x1
    unsigned long v62;  // x9
    unsigned long v63;  // x10
    unsigned long v64;  // cc_dep1
    unsigned long v65;  // cc_dep2
    unsigned long long v21;  // w8
    void* v66;  // x11
    uint128_t v67;  // q0
    unsigned long long v68;  // 4110
    unsigned long long v69;  // 4102
    unsigned long long v70;  // 4110
    unsigned long long v71;  // 4102
    unsigned long long *v72;  // x0
    unsigned long long v73;  // x8
    unsigned long long v74;  // x10
    unsigned long long i;  // x9
    char v22;  // x8
    unsigned long long *v76;  // x12
    unsigned long long v77;  // x13
    unsigned long long *v78;  // x12
    unsigned long long *v79;  // x12
    unsigned long long v80;  // x13
    unsigned long long *v81;  // x12
    unsigned long long v82;  // x24
    unsigned long long v83;  // x8
    unsigned long long v84;  // x11
    uint128_t *v85;  // x10
    unsigned long long v23;  // x21
    uint128_t *v86;  // x11
    uint128_t v87;  // q0
    uint128_t v88;  // q1
    uint128_t v89;  // q3
    unsigned long long v90;  // x8
    unsigned long long index;  // x23
    unsigned long long v25;  // x27
    unsigned long v0;  // [bp-0x338]
    unsigned long v1;  // [bp-0x330]
    unsigned long v2;  // [bp-0x328]
    unsigned long v3;  // [bp-0x318]
    unsigned long long v4;  // [bp-0x310]
    unsigned long long v5;  // [bp-0x308]
    unsigned long long v6;  // [bp-0x300]
    char *v7;  // [bp-0x2f8]
    unsigned long long v8;  // [bp-0x2f0]
    unsigned long long v9;  // [bp-0x2e8]
    unsigned long long v10;  // [bp-0x2e0]
    unsigned long long v11;  // [bp-0x2c8]
    char v12;  // [bp-0x2c0]
    char v13;  // [bp-0xac]
    char *v14;  // [bp-0x10]
    char v15;  // [bp+0x0]

    v14 = &v15;
    v16 = a3;
    v17 = a1;
    v18 = 0x4000000000000000 / a1;
    if (a1 * v18 != 0x4000000000000000)
        v18 += 1;
    v4 = v18;
    if (0x1000 >= a1)
    {
        v19 = v17 - (v17 >> 1);
        if (v19 >= 64)
            v19 = 64;
    }
    else
    {
        v20 = v17 | 1;
        if (!v20)
            v21 = 64;
        else
            v21 = (unsigned int)Clz(v20);
        v22 = (((char)v21 ^ 63) & 1) + (char)((v21 ^ 63) >> 1);
        v19 = (1 << (v22 & 63)) + (v17 >> (v22 & 63)) >> 1;
    }
    v5 = v17;
    v6 = v19;
    v23 = 0;
    index = 0;
    v1 = a0 + 16;
    v2 = a0 + 80;
    v0 = a0 - 16;
    v3 = a0 - 32;
    v25 = 1;
    v9 = v16;
    v26 = v17 - 0;
    if (v17 <= 0)
        goto LABEL_c4b390;
    while (1)
    {
        v72 = a0 + v23 * 32;
        if (v6 > v26)
        {
LABEL_c4b354:
            if (a4 & 1)
            {
                if (v26 < 32)
                    v82 = v26;
                else
                    v82 = 32;
                sub_c4b75c();
                v28 = 1 | v82 * 2;
                v16 = v9;
                goto LABEL_c4b4b4;
            }
            else
            {
                if (v26 < v6)
                    v83 = v26;
                else
                    v83 = v6;
                v28 = v83 * 2;
                goto LABEL_c4b4b4;
            }
        }
        if (2 > v26)
        {
            v73 = v26;
            goto LABEL_c4b4ac;
        }
        v74 = v72[6];
        if (v72[2] > v74)
        {
            if (v26 == 2)
            {
                i = 1;
                v73 = 2;
                goto LABEL_c4b478;
            }
            else
            {
                v76 = v2 + v23 * 32;
                v73 = 2;
                v77 = v74;
                do
                {
                    v78 = v76 + 4;
                    if (v77 <= *v76)
                        goto LABEL_c4b45c;
                } while ((v73 += 1, v77 = *v76, v76 = v78, v26 != v73));
            }
        }
        else
        {
            if (v26 == 2)
            {
                v73 = 2;
                goto LABEL_c4b4ac;
            }
            else
            {
                v79 = v2 + v23 * 32;
                v73 = 2;
                v80 = v74;
                do
                {
                    v81 = v79 + 4;
                    if (*v79 < v80)
                        goto LABEL_c4b45c;
                } while ((v73 += 1, v80 = *v79, v79 = v81, v26 != v73));
            }
        }
        v73 = v26;
LABEL_c4b45c:
        if (v73 < v6)
            goto LABEL_c4b354;
        if (v72[2] <= v74 || (i = v73 >> 1, !i))
            goto LABEL_c4b4ac;
LABEL_c4b478:
        v84 = v23 * 32;
        v85 = v1 + v84;
        v86 = v0 + v84 + v73 * 32;
        do
        {
            v87 = *(int128_t *)((char *)v85 - 16);
            v88 = *v85;
            v89 = *v86;
            *(int128_t *)((char *)v85 - 16) = *(int128_t *)((char *)v86 - 16);
            *v85 = v89;
            *(uint128_t *)((char *)v86 - 16) = v87;
            *v86 = v88;
            v85 += 2;
            v86 = (char *)v86 - 32;
            i -= 1;
        } while (i);
LABEL_c4b4ac:
        v28 = 1 | v73 * 2;
LABEL_c4b4b4:
        v90 = v4 * (v23 * 2 + (v28 >> 1)) ^ v4 * (v23 * 2 - (v25 >> 1));
        if (!v90)
            v27 = 64;
        else
            v27 = Clz(v90);
        if (index >= 2)
        {
LABEL_c4b4dc:
            v29 = v23 * 32;
            v30 = a0 + v29;
            v7 = v3 + v29;
            v8 = v28;
            v10 = v23;
            v11 = v27;
            while (1)
            {
                idx = index - 1;
                v32 = (&v13)[2 + idx];
                v33 = v32 & 0xff;
                v34 = v27 & 0xffffffff;
                if (v32 < (unsigned int)v27)
                    break;
                v35 = *(long long *)&(&v12)[8 * idx];
                v36 = v35 >> 1;
                v37 = v25 >> 1;
                v38 = v36 + v37;
                v39 = ((unsigned int)v35 | (unsigned int)v25) & 1;
                if (v38 <= v16)
                {
                    v40 = arm64g_calculate_condition(147, v33, v34, 0);
                    v41 = arm64g_calculate_condition(4, (v40 & 1 ? v39 : 0), 0, 0);
                    if (v41 & 1)
                        goto LABEL_c4b588;
                    goto LABEL_c4b568;
                }
                else
                {
                    v42 = arm64g_calculate_condition(147, v33, v34, 0);
                    v43 = arm64g_calculate_condition(0, (v42 & 1 ? v39 : 0), 0, 0);
                    if (!(v43 & 1))
                    {
LABEL_c4b568:
                        node = a0 + (v23 - v38) * 32;
                        if (v35 & 1)
                        {
                            if (!(v25 & 1))
                                goto LABEL_c4b5c4;
                            goto LABEL_c4b57c;
                        }
                        else
                        {
                            sub_c4b75c();
                            if (v25 & 1)
                            {
LABEL_c4b57c:
                                v27 = v11;
                                if (!v37)
                                    goto LABEL_c4b514;
                                goto LABEL_c4b5f4;
                            }
                            else
                            {
LABEL_c4b5c4:
                                sub_c4b75c();
                                v27 = v11;
                                if (!v37)
                                    goto LABEL_c4b514;
LABEL_c4b5f4:
                                if (v36)
                                {
                                    if (v37 < v36)
                                        v45 = v37;
                                    else
                                        v45 = v36;
                                    if (v16 >= v45)
                                    {
                                        iter = node + v36 * 32;
                                        _memcpy();
                                        v47 = a2 + v45 * 32;
                                        if (v36 > v37)
                                        {
                                            iter1 = v7;
                                            while (1)
                                            {
                                                v49 = iter - 32;
                                                v50 = v47 - 32;
                                                v51 = *(long long *)((char *)v47 - 16);
                                                v52 = *(long long *)((char *)iter - 16);
                                                v53 = v51;
                                                v54 = v52;
                                                if (v51 < v52)
                                                    v55 = v49;
                                                else
                                                    v55 = v50;
                                                v56 = (int128_t)v55[16];
                                                *(int128_t *)iter1 = *(int128_t *)v55;
                                                *(uint128_t *)&iter1[16] = v56;
                                                iter1 -= 32;
                                                iter = v49 + (v51 >= v52) * 32;
                                                v47 = v50 + (v52 > v51) * 32;
                                                if (iter != node)
                                                {
                                                    v57 = arm64g_calculate_condition(20, v53, v54, 0);
                                                    v58 = arm64g_calculate_condition(20, (v57 & 1 ? v47 : 0x40000000), (v57 & 1 ? a2 : 0), 0);
                                                    if (!(v58 & 1))
                                                        break;
                                                }
                                                else
                                                {
                                                    v59 = arm64g_calculate_condition(20, v53, v54, 0);
                                                    v60 = arm64g_calculate_condition(16, (v59 & 1 ? v47 : 0x40000000), (v59 & 1 ? a2 : 0), 0);
                                                    if (!(v60 & 1))
                                                        break;
                                                }
                                            }
                                            node = iter;
                                        }
                                        else
                                        {
                                            iter2 = a2;
                                            while (1)
                                            {
                                                v62 = (long long)iter[16];
                                                v63 = (long long)iter2[16];
                                                v64 = v62;
                                                v65 = v63;
                                                if (v62 < v63)
                                                    v66 = iter;
                                                else
                                                    v66 = iter2;
                                                v67 = (int128_t)v66[16];
                                                *(int128_t *)node = *(int128_t *)v66;
                                                *(uint128_t *)&node[16] = v67;
                                                node += 32;
                                                iter2 += (v62 >= v63) * 32;
                                                iter += (v63 > v62) * 32;
                                                if (iter2 != v47)
                                                {
                                                    v68 = arm64g_calculate_condition(20, v64, v65, 0);
                                                    v69 = arm64g_calculate_condition(20, (v68 & 1 ? iter : 0x40000000), (v68 & 1 ? v30 : 0), 0);
                                                    if (!(v69 & 1))
                                                        break;
                                                }
                                                else
                                                {
                                                    v70 = arm64g_calculate_condition(20, v64, v65, 0);
                                                    v71 = arm64g_calculate_condition(16, (v70 & 1 ? iter : 0x40000000), (v70 & 1 ? v30 : 0), 0);
                                                    if (!(v71 & 1))
                                                        break;
                                                }
                                            }
                                        }
                                        _memcpy(node);
                                        v16 = v9;
                                        v27 = v11;
                                    }
                                }
LABEL_c4b514:
                                v25 = 1 | v38 * 2;
                                v23 = v10;
                                index = idx;
                                if (index <= 1)
                                    goto LABEL_c4b6bc;
                            }
                        }
                    }
                    else
                    {
LABEL_c4b588:
                        v25 = v38 * 2;
                        index = idx;
                        if (1 >= index)
                        {
LABEL_c4b6bc:
                            index = 1;
                            break;
                        }
                    }
                }
            }
            v17 = v5;
            v28 = v8;
        }
        while (1)
        {
            *(unsigned long long *)&(&v12)[8 * index] = v25;
            (&v13)[2 + index] = v27;
            if (v17 <= v23)
            {
                if (!(v25 & 1))
                {
                    sub_c4b75c();
                    return;
                }
                return;
            }
            index += 1;
            v23 += v28 >> 1;
            v25 = v28;
            v26 = v17 - v23;
            if (v17 > v23)
                break;
LABEL_c4b390:
            v27 = 0;
            v28 = 1;
            if (2 <= index)
                goto LABEL_c4b4dc;
        }
    }
}
