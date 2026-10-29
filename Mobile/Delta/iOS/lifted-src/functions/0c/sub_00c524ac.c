/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc524ac..0xc529d4 (1320 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void sub_c524ac(unsigned long a0, unsigned long long a1, void* a2, unsigned long long a3, unsigned int a4)
{
    unsigned long long v16;  // x19
    unsigned long long v17;  // x9
    unsigned long long v26;  // x3
    unsigned long long v27;  // x3
    unsigned long long v28;  // x10
    unsigned long long v29;  // x11
    unsigned long long v30;  // x8
    unsigned long long v31;  // x23
    unsigned long long idx;  // x28
    unsigned int v33;  // w8
    unsigned long v34;  // cc_dep1
    unsigned long v35;  // cc_dep2
    unsigned long long v18;  // x8
    unsigned long v36;  // x8
    unsigned long long v37;  // x25
    unsigned long long v38;  // x26
    unsigned long long v39;  // x22
    unsigned long v40;  // x9
    unsigned long long v41;  // 4110
    unsigned long long v42;  // 4102
    unsigned long long v43;  // 4110
    unsigned long long v44;  // 4102
    void* node;  // x20
    unsigned long long v19;  // x8
    unsigned long long v46;  // x8
    void* iter;  // x24
    void* v48;  // x8
    char *iter1;  // x9
    unsigned long v50;  // x10
    void* v51;  // x8
    unsigned long v52;  // x11
    void* v53;  // x24
    unsigned long v54;  // cc_dep1
    unsigned long v55;  // cc_dep2
    unsigned long long v20;  // w8
    void* v56;  // x12
    unsigned long v57;  // x13
    unsigned long long v58;  // 4110
    unsigned long long v59;  // 4102
    unsigned long long v60;  // 4110
    unsigned long long v61;  // 4102
    void* iter2;  // x1
    unsigned long v63;  // x9
    unsigned long v64;  // x10
    unsigned long v65;  // cc_dep1
    char v21;  // x8
    unsigned long v66;  // cc_dep2
    void* v67;  // x11
    unsigned long v68;  // x12
    unsigned long long v69;  // 4110
    unsigned long long v70;  // 4102
    unsigned long long v71;  // 4110
    unsigned long long v72;  // 4102
    unsigned long long *v73;  // x0
    unsigned long long v74;  // x8
    unsigned long long v75;  // x10
    unsigned long long v22;  // x20
    unsigned long long i;  // x9
    unsigned long long *v77;  // x12
    unsigned long long v78;  // x13
    unsigned long long *v79;  // x12
    unsigned long long *v80;  // x12
    unsigned long long v81;  // x13
    unsigned long long *v82;  // x12
    unsigned long long v83;  // x24
    unsigned long long v84;  // x8
    unsigned long long v85;  // x11
    unsigned long long v23;  // x15
    void* v86;  // x10
    void* v87;  // x11
    uint128_t v88;  // q0
    unsigned long v89;  // x12
    unsigned long long v90;  // x8
    unsigned long long v24;  // x27
    unsigned long long v25;  // x9
    unsigned long v0;  // [bp-0x340]
    unsigned long v1;  // [bp-0x338]
    unsigned long v2;  // [bp-0x330]
    unsigned long v3;  // [bp-0x320]
    unsigned long long v4;  // [bp-0x318]
    unsigned long long v5;  // [bp-0x310]
    unsigned long long v6;  // [bp-0x308]
    char *v7;  // [bp-0x300]
    unsigned long long v8;  // [bp-0x2f8]
    unsigned long long v9;  // [bp-0x2e8]
    unsigned long long v10;  // [bp-0x2e0]
    unsigned long long v11;  // [bp-0x2c8]
    char v12;  // [bp-0x2c0]
    char v13;  // [bp-0xac]
    char *v14;  // [bp-0x10]
    char v15;  // [bp+0x0]

    v14 = &v15;
    v16 = a1;
    v17 = 0x4000000000000000 / a1;
    if (a1 * v17 != 0x4000000000000000)
        v17 += 1;
    v4 = v17;
    if (0x1000 >= a1)
    {
        v18 = v16 - (v16 >> 1);
        if (v18 >= 64)
            v18 = 64;
    }
    else
    {
        v19 = v16 | 1;
        if (!v19)
            v20 = 64;
        else
            v20 = (unsigned int)Clz(v19);
        v21 = (((char)v20 ^ 63) & 1) + (char)((v20 ^ 63) >> 1);
        v18 = (1 << (v21 & 63)) + (v16 >> (v21 & 63)) >> 1;
    }
    v5 = v16;
    v6 = v18;
    v22 = 0;
    v23 = 0;
    v1 = a0 + 16;
    v2 = a0 + 48;
    v0 = a0 - 8;
    v3 = a0 - 24;
    v24 = 1;
    v25 = v16 - 0;
    v26 = a3;
    v27 = a3;
    if (v16 <= 0)
        goto LABEL_c525cc;
    while (1)
    {
        v73 = a0 + 24 * v22;
        if (v6 > v25)
        {
LABEL_c52588:
            if (a4 & 1)
            {
                if (v25 < 32)
                    v83 = v25;
                else
                    v83 = 32;
                sub_c529d4();
                v29 = 1 | v83 * 2;
                v26 = a3;
                goto LABEL_c526fc;
            }
            else
            {
                if (v25 < v6)
                    v84 = v25;
                else
                    v84 = v6;
                v29 = v84 * 2;
                goto LABEL_c526fc;
            }
        }
        if (2 > v25)
        {
            v74 = v25;
            goto LABEL_c526f4;
        }
        v75 = v73[3];
        if (*v73 > v75)
        {
            if (v25 == 2)
            {
                i = 1;
                v74 = 2;
                goto LABEL_c526b4;
            }
            else
            {
                v77 = v2 + 24 * v22;
                v74 = 2;
                v78 = v75;
                do
                {
                    v79 = v77 + 3;
                    if (v78 <= *v77)
                        goto LABEL_c52698;
                } while ((v74 += 1, v78 = *v77, v77 = v79, v25 != v74));
            }
        }
        else
        {
            if (v25 == 2)
            {
                v74 = 2;
                goto LABEL_c526f4;
            }
            else
            {
                v80 = v2 + 24 * v22;
                v74 = 2;
                v81 = v75;
                do
                {
                    v82 = v80 + 3;
                    if (*v80 < v81)
                        goto LABEL_c52698;
                } while ((v74 += 1, v81 = *v80, v80 = v82, v25 != v74));
            }
        }
        v74 = v25;
LABEL_c52698:
        if (v74 < v6)
            goto LABEL_c52588;
        if (*v73 <= v75 || (i = v74 >> 1, !i))
            goto LABEL_c526f4;
LABEL_c526b4:
        v85 = v22 * 24;
        v86 = v1 + v85;
        v87 = v0 + v85 + 24 * v74;
        do
        {
            v88 = *(int128_t *)((char *)v86 - 16);
            *(int128_t *)((char *)v86 - 16) = *(int128_t *)((char *)v87 - 16);
            *(uint128_t *)((char *)v87 - 16) = v88;
            v89 = *(long long *)v86;
            *(long long *)v86 = *(long long *)v87;
            v86 += 24;
            *(unsigned long *)v87 = v89;
            v87 -= 24;
            i -= 1;
        } while (i);
LABEL_c526f4:
        v29 = 1 | v74 * 2;
LABEL_c526fc:
        v90 = v4 * (v22 * 2 + (v29 >> 1)) ^ v4 * (v22 * 2 - (v24 >> 1));
        if (!v90)
            v28 = 64;
        else
            v28 = Clz(v90);
        v27 = v26;
        if (v23 >= 2)
        {
LABEL_c52724:
            v30 = v22 * 24;
            v31 = a0 + v30;
            v7 = v3 + v30;
            v8 = v29;
            v11 = v28;
            v10 = v22;
            while (1)
            {
                idx = v23 - 1;
                v33 = (&v13)[2 + idx];
                v34 = v33 & 0xff;
                v35 = v28 & 0xffffffff;
                if (v33 < (unsigned int)v28)
                    break;
                v23 = idx;
                v36 = *(long long *)&(&v12)[8 * idx];
                v37 = v36 >> 1;
                v38 = v24 >> 1;
                v39 = v37 + v38;
                v40 = ((unsigned int)v36 | (unsigned int)v24) & 1;
                if (v39 <= v27)
                {
                    v41 = arm64g_calculate_condition(147, v34, v35, 0);
                    v42 = arm64g_calculate_condition(4, (v41 & 1 ? v40 : 0), 0, 0);
                    if (v42 & 1)
                        goto LABEL_c527d0;
                    goto LABEL_c527b4;
                }
                else
                {
                    v43 = arm64g_calculate_condition(147, v34, v35, 0);
                    v44 = arm64g_calculate_condition(0, (v43 & 1 ? v40 : 0), 0, 0);
                    if (!(v44 & 1))
                    {
LABEL_c527b4:
                        node = a0 + 24 * (v22 - v39);
                        if (v36 & 1)
                        {
                            if (!(v24 & 1))
                                goto LABEL_c5281c;
                            goto LABEL_c527c8;
                        }
                        else
                        {
                            sub_c529d4();
                            v28 = v11;
                            if (v24 & 1)
                            {
LABEL_c527c8:
                                if (!v38)
                                    goto LABEL_c52760;
                                goto LABEL_c52858;
                            }
                            else
                            {
LABEL_c5281c:
                                sub_c529d4();
                                v28 = v11;
                                if (!v38)
                                    goto LABEL_c52760;
LABEL_c52858:
                                if (v37)
                                {
                                    if (v38 < v37)
                                        v46 = v38;
                                    else
                                        v46 = v37;
                                    if (v27 >= v46)
                                    {
                                        v9 = v23;
                                        iter = node + 24 * v37;
                                        _memcpy();
                                        v48 = a2 + v46 * 24;
                                        if (v37 > v38)
                                        {
                                            iter1 = v7;
                                            while (1)
                                            {
                                                v50 = *(long long *)((char *)v48 - 24);
                                                v51 = v48 - 24;
                                                v52 = *(long long *)((char *)iter - 24);
                                                v53 = iter - 24;
                                                v54 = v50;
                                                v55 = v52;
                                                if (v50 < v52)
                                                    v56 = v53;
                                                else
                                                    v56 = v51;
                                                v57 = (long long)v56[16];
                                                *(int128_t *)iter1 = *(int128_t *)v56;
                                                *(unsigned long *)&iter1[16] = v57;
                                                iter = v53 + (v50 >= v52) * 24;
                                                v48 = v51 + (v52 > v50) * 24;
                                                iter1 -= 24;
                                                if (iter != node)
                                                {
                                                    v58 = arm64g_calculate_condition(20, v54, v55, 0);
                                                    v59 = arm64g_calculate_condition(20, (v58 & 1 ? v48 : 0x40000000), (v58 & 1 ? a2 : 0), 0);
                                                    if (!(v59 & 1))
                                                        break;
                                                }
                                                else
                                                {
                                                    v60 = arm64g_calculate_condition(20, v54, v55, 0);
                                                    v61 = arm64g_calculate_condition(16, (v60 & 1 ? v48 : 0x40000000), (v60 & 1 ? a2 : 0), 0);
                                                    if (!(v61 & 1))
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
                                                v63 = *(long long *)iter;
                                                v64 = *(long long *)iter2;
                                                v65 = v63;
                                                v66 = v64;
                                                if (v63 < v64)
                                                    v67 = iter;
                                                else
                                                    v67 = iter2;
                                                v68 = (long long)v67[16];
                                                *(int128_t *)node = *(int128_t *)v67;
                                                *(unsigned long *)&node[16] = v68;
                                                iter2 += (v63 >= v64) * 24;
                                                iter += (v64 > v63) * 24;
                                                node += 24;
                                                if (iter2 != v48)
                                                {
                                                    v69 = arm64g_calculate_condition(20, v65, v66, 0);
                                                    v70 = arm64g_calculate_condition(20, (v69 & 1 ? iter : 0x40000000), (v69 & 1 ? v31 : 0), 0);
                                                    if (!(v70 & 1))
                                                        break;
                                                }
                                                else
                                                {
                                                    v71 = arm64g_calculate_condition(20, v65, v66, 0);
                                                    v72 = arm64g_calculate_condition(16, (v71 & 1 ? iter : 0x40000000), (v71 & 1 ? v31 : 0), 0);
                                                    if (!(v72 & 1))
                                                        break;
                                                }
                                            }
                                        }
                                        _memcpy(node);
                                        v27 = a3;
                                        v23 = v9;
                                        v28 = v11;
                                    }
                                }
LABEL_c52760:
                                v24 = 1 | v39 * 2;
                                v22 = v10;
                                if (idx <= 1)
                                    goto LABEL_c52938;
                            }
                        }
                    }
                    else
                    {
LABEL_c527d0:
                        v24 = v39 * 2;
                        if (1 >= idx)
                        {
LABEL_c52938:
                            v23 = 1;
                            break;
                        }
                    }
                }
            }
            v16 = v5;
            v29 = v8;
            v26 = v27;
        }
        while (1)
        {
            *(unsigned long long *)&(&v12)[8 * v23] = v24;
            (&v13)[2 + v23] = v28;
            if (v16 <= v22)
            {
                if (!(v24 & 1))
                {
                    sub_c529d4();
                    return;
                }
                return;
            }
            v23 += 1;
            v22 += v29 >> 1;
            v24 = v29;
            v25 = v16 - v22;
            v27 = v26;
            if (v16 > v22)
                break;
LABEL_c525cc:
            v28 = 0;
            v29 = 1;
            v26 = v27;
            if (2 <= v23)
                goto LABEL_c52724;
        }
    }
}
