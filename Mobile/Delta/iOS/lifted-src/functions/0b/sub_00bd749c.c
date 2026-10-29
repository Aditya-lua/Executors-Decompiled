/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbd749c..0xbd7a64 (1480 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void sub_bd749c(unsigned long a0, unsigned long long a1, void* a2, unsigned long long a3, unsigned int a4)
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
    void* iter;  // x20
    unsigned long long v19;  // x8
    unsigned long long v46;  // x8
    void* iter1;  // x24
    void* v48;  // x8
    char *iter2;  // x9
    unsigned long v50;  // x10
    void* v51;  // x8
    unsigned long v52;  // x11
    void* v53;  // x24
    unsigned long v54;  // cc_dep1
    unsigned long v55;  // cc_dep2
    unsigned long long v20;  // w8
    void* v56;  // x12
    uint128_t v57;  // q1
    uint128_t v58;  // q0
    uint128_t v59;  // q2
    unsigned long long v60;  // 4110
    unsigned long long v61;  // 4102
    unsigned long long v62;  // 4110
    unsigned long long v63;  // 4102
    void* v64;  // x1
    unsigned long v65;  // x9
    char v21;  // x8
    unsigned long v66;  // x10
    unsigned long v67;  // cc_dep1
    unsigned long v68;  // cc_dep2
    void* v69;  // x11
    uint128_t v70;  // q1
    uint128_t v71;  // q0
    uint128_t v72;  // q2
    unsigned long long v73;  // 4110
    unsigned long long v74;  // 4102
    unsigned long long v75;  // 4110
    unsigned long long v22;  // x20
    unsigned long long v76;  // 4102
    unsigned long long *v77;  // x0
    unsigned long long v78;  // x8
    unsigned long long *v79;  // x13
    unsigned long long *v80;  // x13
    unsigned long long *v81;  // x12
    unsigned long long i;  // x9
    unsigned long long *v83;  // x13
    unsigned long long *v84;  // x13
    unsigned long long *v85;  // x12
    unsigned long long v23;  // x15
    unsigned long long v86;  // x24
    unsigned long long v87;  // x8
    unsigned long long v88;  // x11
    unsigned long long *node;  // x10
    unsigned long long *v90;  // x11
    unsigned long v91;  // x12
    unsigned long v92;  // x12
    unsigned long v93;  // x12
    unsigned long v94;  // x12
    unsigned long v95;  // x12
    unsigned long long v24;  // x27
    unsigned long v96;  // x12
    unsigned long v97;  // x12
    unsigned long v98;  // x12
    unsigned long v99;  // x12
    unsigned long long v100;  // x8
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
    v1 = a0 - 32;
    v2 = a0 + 72;
    v0 = a0 + 32;
    v3 = a0 - 72;
    v24 = 1;
    v25 = v16 - 0;
    v26 = a3;
    v27 = a3;
    if (v16 <= 0)
        goto LABEL_bd75bc;
    while (1)
    {
        v77 = a0 + 72 * v22;
        if (v6 > v25)
        {
LABEL_bd7578:
            if (a4 & 1)
            {
                if (v25 < 32)
                    v86 = v25;
                else
                    v86 = 32;
                sub_bd7acc();
                v29 = 1 | v86 * 2;
                v26 = a3;
                goto LABEL_bd776c;
            }
            else
            {
                if (v25 < v6)
                    v87 = v25;
                else
                    v87 = v6;
                v29 = v87 * 2;
                goto LABEL_bd776c;
            }
        }
        if (2 > v25)
        {
            v78 = v25;
            goto LABEL_bd7764;
        }
        if (v77[9] >= *v77)
        {
            if (v25 == 2)
            {
                v78 = 2;
                goto LABEL_bd7764;
            }
            else
            {
                v79 = v2 + 72 * v22;
                v78 = 2;
                v80 = v79;
                do
                {
                    v81 = v79 + 9;
                    if (v79[9] < *v80)
                        goto LABEL_bd7690;
                } while ((v78 += 1, v80 = v81, v79 = v81, v25 != v78));
            }
        }
        else
        {
            if (v25 == 2)
            {
                i = 1;
                v78 = 2;
                goto LABEL_bd76ac;
            }
            else
            {
                v83 = v2 + 72 * v22;
                v78 = 2;
                v84 = v83;
                do
                {
                    v85 = v83 + 9;
                    if (*v84 <= v83[9])
                        goto LABEL_bd7690;
                } while ((v78 += 1, v84 = v85, v83 = v85, v25 != v78));
            }
        }
        v78 = v25;
LABEL_bd7690:
        if (v78 < v6)
            goto LABEL_bd7578;
        if (*v77 <= v77[9] || (i = v78 >> 1, !i))
            goto LABEL_bd7764;
LABEL_bd76ac:
        v88 = v22 * 72;
        node = v1 + v88 + 72 * v78;
        v90 = v0 + v88;
        do
        {
            v91 = *(long long *)((char *)v90 - 32);
            *(long long *)((char *)v90 - 32) = *(long long *)((char *)node - 40);
            *(unsigned long *)((char *)node - 40) = v91;
            v92 = *(long long *)((char *)v90 - 24);
            *(long long *)((char *)v90 - 24) = *(long long *)((char *)node - 32);
            *(unsigned long *)((char *)node - 32) = v92;
            v93 = *(long long *)((char *)v90 - 16);
            *(long long *)((char *)v90 - 16) = *(long long *)((char *)node - 24);
            *(unsigned long *)((char *)node - 24) = v93;
            v94 = *(long long *)((char *)v90 - 8);
            *(long long *)((char *)v90 - 8) = *(long long *)((char *)node - 16);
            *(unsigned long *)((char *)node - 16) = v94;
            v95 = *v90;
            *v90 = *(long long *)((char *)node - 8);
            *(unsigned long *)((char *)node - 8) = v95;
            v96 = v90[1];
            v90[1] = *node;
            *node = v96;
            v97 = v90[2];
            v90[2] = node[1];
            node[1] = v97;
            v98 = v90[3];
            v90[3] = node[2];
            node[2] = v98;
            v99 = v90[4];
            v90[4] = node[3];
            node[3] = v99;
            node = (char *)node - 72;
            v90 += 9;
            i -= 1;
        } while (i);
LABEL_bd7764:
        v29 = 1 | v78 * 2;
LABEL_bd776c:
        v100 = v4 * (v22 * 2 + (v29 >> 1)) ^ v4 * (v22 * 2 - (v24 >> 1));
        if (!v100)
            v28 = 64;
        else
            v28 = Clz(v100);
        v27 = v26;
        if (v23 >= 2)
        {
LABEL_bd7794:
            v30 = v22 * 72;
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
                        goto LABEL_bd7840;
                    goto LABEL_bd7824;
                }
                else
                {
                    v43 = arm64g_calculate_condition(147, v34, v35, 0);
                    v44 = arm64g_calculate_condition(0, (v43 & 1 ? v40 : 0), 0, 0);
                    if (!(v44 & 1))
                    {
LABEL_bd7824:
                        iter = a0 + 72 * (v22 - v39);
                        if (v36 & 1)
                        {
                            if (!(v24 & 1))
                                goto LABEL_bd788c;
                            goto LABEL_bd7838;
                        }
                        else
                        {
                            sub_bd7acc();
                            v28 = v11;
                            if (v24 & 1)
                            {
LABEL_bd7838:
                                if (!v38)
                                    goto LABEL_bd77d0;
                                goto LABEL_bd78c8;
                            }
                            else
                            {
LABEL_bd788c:
                                sub_bd7acc();
                                v28 = v11;
                                if (!v38)
                                    goto LABEL_bd77d0;
LABEL_bd78c8:
                                if (v37)
                                {
                                    if (v38 < v37)
                                        v46 = v38;
                                    else
                                        v46 = v37;
                                    if (v27 >= v46)
                                    {
                                        v9 = v23;
                                        iter1 = iter + 72 * v37;
                                        _memcpy();
                                        v48 = a2 + v46 * 72;
                                        if (v37 > v38)
                                        {
                                            iter2 = v7;
                                            while (1)
                                            {
                                                v50 = *(long long *)((char *)v48 - 72);
                                                v51 = v48 - 72;
                                                v52 = *(long long *)((char *)iter1 - 72);
                                                v53 = iter1 - 72;
                                                v54 = v50;
                                                v55 = v52;
                                                if (v50 < v52)
                                                    v56 = v53;
                                                else
                                                    v56 = v51;
                                                *(int128_t *)iter2 = *(int128_t *)v56;
                                                v57 = (int128_t)v56[32];
                                                v58 = (int128_t)v56[48];
                                                v59 = (int128_t)v56[16];
                                                *(long long *)&iter2[64] = (long long)v56[64];
                                                *(uint128_t *)&iter2[32] = v57;
                                                *(uint128_t *)&iter2[48] = v58;
                                                *(uint128_t *)&iter2[16] = v59;
                                                iter1 = v53 + (v50 >= v52) * 72;
                                                v48 = v51 + (v52 > v50) * 72;
                                                iter2 -= 72;
                                                if (iter1 != iter)
                                                {
                                                    v60 = arm64g_calculate_condition(20, v54, v55, 0);
                                                    v61 = arm64g_calculate_condition(20, (v60 & 1 ? v48 : 0x40000000), (v60 & 1 ? a2 : 0), 0);
                                                    if (!(v61 & 1))
                                                        break;
                                                }
                                                else
                                                {
                                                    v62 = arm64g_calculate_condition(20, v54, v55, 0);
                                                    v63 = arm64g_calculate_condition(16, (v62 & 1 ? v48 : 0x40000000), (v62 & 1 ? a2 : 0), 0);
                                                    if (!(v63 & 1))
                                                        break;
                                                }
                                            }
                                            iter = iter1;
                                        }
                                        else
                                        {
                                            v64 = a2;
                                            while (1)
                                            {
                                                v65 = *(long long *)iter1;
                                                v66 = *(long long *)v64;
                                                v67 = v65;
                                                v68 = v66;
                                                if (v65 < v66)
                                                    v69 = iter1;
                                                else
                                                    v69 = v64;
                                                *(int128_t *)iter = *(int128_t *)v69;
                                                v70 = (int128_t)v69[32];
                                                v71 = (int128_t)v69[48];
                                                v72 = (int128_t)v69[16];
                                                *(long long *)&iter[64] = (long long)v69[64];
                                                *(uint128_t *)&iter[32] = v70;
                                                *(uint128_t *)&iter[48] = v71;
                                                *(uint128_t *)&iter[16] = v72;
                                                v64 += (v65 >= v66) * 72;
                                                iter1 += (v66 > v65) * 72;
                                                iter += 72;
                                                if (v64 != v48)
                                                {
                                                    v73 = arm64g_calculate_condition(20, v67, v68, 0);
                                                    v74 = arm64g_calculate_condition(20, (v73 & 1 ? iter1 : 0x40000000), (v73 & 1 ? v31 : 0), 0);
                                                    if (!(v74 & 1))
                                                        break;
                                                }
                                                else
                                                {
                                                    v75 = arm64g_calculate_condition(20, v67, v68, 0);
                                                    v76 = arm64g_calculate_condition(16, (v75 & 1 ? iter1 : 0x40000000), (v75 & 1 ? v31 : 0), 0);
                                                    if (!(v76 & 1))
                                                        break;
                                                }
                                            }
                                        }
                                        _memcpy(iter);
                                        v27 = a3;
                                        v23 = v9;
                                        v28 = v11;
                                    }
                                }
LABEL_bd77d0:
                                v24 = 1 | v39 * 2;
                                v22 = v10;
                                if (idx <= 1)
                                    goto LABEL_bd79c8;
                            }
                        }
                    }
                    else
                    {
LABEL_bd7840:
                        v24 = v39 * 2;
                        if (1 >= idx)
                        {
LABEL_bd79c8:
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
                    sub_bd7acc();
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
LABEL_bd75bc:
            v28 = 0;
            v29 = 1;
            v26 = v27;
            if (2 <= v23)
                goto LABEL_bd7794;
        }
    }
}
