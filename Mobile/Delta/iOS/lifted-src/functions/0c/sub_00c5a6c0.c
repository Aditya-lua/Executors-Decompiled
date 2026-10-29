/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc5a6c0..0xc5abf0 (1328 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void sub_c5a6c0(unsigned long a0, unsigned long long a1, void* a2, unsigned long long a3, unsigned int a4)
{
    unsigned long long v16;  // x19
    unsigned long long v17;  // x9
    unsigned long long v26;  // x3
    unsigned long long v27;  // x3
    unsigned int v28;  // x10
    unsigned int v29;  // x11
    unsigned long long v30;  // x8
    unsigned long long v31;  // x23
    unsigned int idx;  // x28
    unsigned int v33;  // w8
    unsigned long v34;  // cc_dep1
    unsigned long v35;  // cc_dep2
    unsigned int v18;  // x8
    unsigned long v36;  // x8
    unsigned int v37;  // x25
    unsigned int v38;  // x26
    unsigned long long v39;  // x22
    unsigned long v40;  // x9
    unsigned long long v41;  // 4110
    unsigned long long v42;  // 4102
    unsigned long long v43;  // 4110
    unsigned long long v44;  // 4102
    void* node;  // x20
    unsigned int v19;  // x8
    unsigned long long v46;  // x8
    void* iter;  // x24
    void* v48;  // x8
    char *iter1;  // x9
    void* v50;  // x10
    void* v51;  // x11
    unsigned long v52;  // x8
    unsigned long v53;  // x12
    unsigned long v54;  // cc_dep1
    unsigned long v55;  // cc_dep2
    unsigned int v20;  // w8
    void* v56;  // x13
    unsigned long v57;  // x14
    uint128_t v58;  // q0
    unsigned long long v59;  // 4110
    unsigned long long v60;  // 4102
    unsigned long long v61;  // 4110
    unsigned long long v62;  // 4102
    void* iter2;  // x1
    unsigned long v64;  // x9
    unsigned long v65;  // x10
    char v21;  // x8
    unsigned long v66;  // cc_dep1
    unsigned long v67;  // cc_dep2
    void* v68;  // x11
    unsigned long v69;  // x12
    uint128_t v70;  // q0
    unsigned long long v71;  // 4110
    unsigned long long v72;  // 4102
    unsigned long long v73;  // 4110
    unsigned long long v74;  // 4102
    unsigned long long *v75;  // x0
    unsigned int v22;  // x20
    unsigned int v76;  // x8
    unsigned long long v77;  // x10
    unsigned int i;  // x9
    unsigned long long *v79;  // x12
    unsigned long long v80;  // x13
    unsigned long long *v81;  // x12
    unsigned long long *v82;  // x12
    unsigned long long v83;  // x13
    unsigned long long *v84;  // x12
    unsigned int v85;  // x24
    unsigned int v23;  // x15
    unsigned long long v86;  // x8
    unsigned long long v87;  // x11
    void* v88;  // x10
    void* v89;  // x11
    uint128_t v90;  // q0
    uint128_t v91;  // q1
    uint128_t v92;  // q3
    unsigned long v93;  // x12
    unsigned int v94;  // x8
    unsigned int v24;  // x27
    unsigned int v25;  // x9
    unsigned long v0;  // [bp-0x340]
    unsigned long v1;  // [bp-0x338]
    unsigned long v2;  // [bp-0x330]
    unsigned long v3;  // [bp-0x320]
    unsigned long long v4;  // [bp-0x318]
    unsigned int v5;  // [bp-0x310]
    unsigned int v6;  // [bp-0x308]
    char *v7;  // [bp-0x300]
    unsigned int v8;  // [bp-0x2f8]
    unsigned int v9;  // [bp-0x2e8]
    unsigned int v10;  // [bp-0x2e0]
    unsigned int v11;  // [bp-0x2c8]
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
            v20 = Clz(v19);
        v21 = (((char)v20 ^ 63) & 1) + (char)((v20 ^ 63) >> 1);
        v18 = (1 << (v21 & 63)) + (v16 >> (v21 & 63)) >> 1;
    }
    v5 = v16;
    v6 = v18;
    v22 = 0;
    v23 = 0;
    v1 = a0 + 32;
    v2 = a0 + 96;
    v0 = a0 - 8;
    v3 = a0 - 40;
    v24 = 1;
    v25 = v16 - 0;
    v26 = a3;
    v27 = a3;
    if (v16 <= 0)
        goto LABEL_c5a7e0;
    while (1)
    {
        v75 = a0 + 40 * v22;
        if (v6 > v25)
        {
LABEL_c5a79c:
            if (a4 & 1)
            {
                if (v25 < 32)
                    v85 = v25;
                else
                    v85 = 32;
                sub_c5abf0();
                v29 = 1 | v85 * 2;
                v26 = a3;
                goto LABEL_c5a910;
            }
            else
            {
                if (v25 < v6)
                    v86 = v25;
                else
                    v86 = v6;
                v29 = v86 * 2;
                goto LABEL_c5a910;
            }
        }
        if (2 > v25)
        {
            v76 = v25;
            goto LABEL_c5a908;
        }
        v77 = v75[7];
        if (v75[2] > v77)
        {
            if (v25 == 2)
            {
                i = 1;
                v76 = 2;
                goto LABEL_c5a8c8;
            }
            else
            {
                v79 = v2 + 40 * v22;
                v76 = 2;
                v80 = v77;
                do
                {
                    v81 = v79 + 5;
                    if (v80 <= *v79)
                        goto LABEL_c5a8ac;
                } while ((v76 += 1, v80 = *v79, v79 = v81, v25 != v76));
            }
        }
        else
        {
            if (v25 == 2)
            {
                v76 = 2;
                goto LABEL_c5a908;
            }
            else
            {
                v82 = v2 + 40 * v22;
                v76 = 2;
                v83 = v77;
                do
                {
                    v84 = v82 + 5;
                    if (*v82 < v83)
                        goto LABEL_c5a8ac;
                } while ((v76 += 1, v83 = *v82, v82 = v84, v25 != v76));
            }
        }
        v76 = v25;
LABEL_c5a8ac:
        if (v76 < v6)
            goto LABEL_c5a79c;
        if (v75[2] <= v77 || (i = v76 >> 1, !i))
            goto LABEL_c5a908;
LABEL_c5a8c8:
        v87 = v22 * 40;
        v88 = v1 + v87;
        v89 = v0 + v87 + 40 * v76;
        do
        {
            v90 = *(int128_t *)((char *)v88 - 32);
            v91 = *(int128_t *)((char *)v88 - 16);
            v92 = *(int128_t *)((char *)v89 - 16);
            *(int128_t *)((char *)v88 - 32) = *(int128_t *)((char *)v89 - 32);
            *(uint128_t *)((char *)v88 - 16) = v92;
            v93 = *(long long *)v88;
            *(long long *)v88 = *(long long *)v89;
            v88 += 40;
            *(uint128_t *)((char *)v89 - 32) = v90;
            *(uint128_t *)((char *)v89 - 16) = v91;
            *(unsigned long *)v89 = v93;
            v89 -= 40;
            i -= 1;
        } while (i);
LABEL_c5a908:
        v29 = 1 | v76 * 2;
LABEL_c5a910:
        v94 = v4 * (v22 * 2 + (v29 >> 1)) ^ v4 * (v22 * 2 - (v24 >> 1));
        if (!v94)
            v28 = 64;
        else
            v28 = Clz(v94);
        v27 = v26;
        if (v23 >= 2)
        {
LABEL_c5a938:
            v30 = v22 * 40;
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
                if (v33 < v28)
                    break;
                v23 = idx;
                v36 = *(long long *)&(&v12)[8 * idx];
                v37 = v36 >> 1;
                v38 = v24 >> 1;
                v39 = v37 + v38;
                v40 = ((unsigned int)v36 | v24) & 1;
                if (v39 <= v27)
                {
                    v41 = arm64g_calculate_condition(147, v34, v35, 0);
                    v42 = arm64g_calculate_condition(4, (v41 & 1 ? v40 : 0), 0, 0);
                    if (v42 & 1)
                        goto LABEL_c5a9e4;
                    goto LABEL_c5a9c8;
                }
                else
                {
                    v43 = arm64g_calculate_condition(147, v34, v35, 0);
                    v44 = arm64g_calculate_condition(0, (v43 & 1 ? v40 : 0), 0, 0);
                    if (!(v44 & 1))
                    {
LABEL_c5a9c8:
                        node = a0 + 40 * (v22 - v39);
                        if (v36 & 1)
                        {
                            if (!(v24 & 1))
                                goto LABEL_c5aa30;
                            goto LABEL_c5a9dc;
                        }
                        else
                        {
                            sub_c5abf0();
                            v28 = v11;
                            if (v24 & 1)
                            {
LABEL_c5a9dc:
                                if (!v38)
                                    goto LABEL_c5a974;
                                goto LABEL_c5aa6c;
                            }
                            else
                            {
LABEL_c5aa30:
                                sub_c5abf0();
                                v28 = v11;
                                if (!v38)
                                    goto LABEL_c5a974;
LABEL_c5aa6c:
                                if (v37)
                                {
                                    if (v38 < v37)
                                        v46 = v38;
                                    else
                                        v46 = v37;
                                    if (v27 >= v46)
                                    {
                                        v9 = v23;
                                        iter = node + 40 * v37;
                                        _memcpy();
                                        v48 = a2 + v46 * 40;
                                        if (v37 > v38)
                                        {
                                            iter1 = v7;
                                            while (1)
                                            {
                                                v50 = iter - 40;
                                                v51 = v48 - 40;
                                                v52 = *(long long *)((char *)v48 - 24);
                                                v53 = *(long long *)((char *)iter - 24);
                                                v54 = v52;
                                                v55 = v53;
                                                if (v52 < v53)
                                                    v56 = v50;
                                                else
                                                    v56 = v51;
                                                v57 = (long long)v56[32];
                                                v58 = (int128_t)v56[16];
                                                *(int128_t *)iter1 = *(int128_t *)v56;
                                                *(uint128_t *)&iter1[16] = v58;
                                                *(unsigned long *)&iter1[32] = v57;
                                                iter = v50 + (v52 >= v53) * 40;
                                                v48 = v51 + (v53 > v52) * 40;
                                                iter1 -= 40;
                                                if (iter != node)
                                                {
                                                    v59 = arm64g_calculate_condition(20, v54, v55, 0);
                                                    v60 = arm64g_calculate_condition(20, (v59 & 1 ? v48 : 0x40000000), (v59 & 1 ? a2 : 0), 0);
                                                    if (!(v60 & 1))
                                                        break;
                                                }
                                                else
                                                {
                                                    v61 = arm64g_calculate_condition(20, v54, v55, 0);
                                                    v62 = arm64g_calculate_condition(16, (v61 & 1 ? v48 : 0x40000000), (v61 & 1 ? a2 : 0), 0);
                                                    if (!(v62 & 1))
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
                                                v64 = (long long)iter[16];
                                                v65 = (long long)iter2[16];
                                                v66 = v64;
                                                v67 = v65;
                                                if (v64 < v65)
                                                    v68 = iter;
                                                else
                                                    v68 = iter2;
                                                v69 = (long long)v68[32];
                                                v70 = (int128_t)v68[16];
                                                *(int128_t *)node = *(int128_t *)v68;
                                                *(uint128_t *)&node[16] = v70;
                                                *(unsigned long *)&node[32] = v69;
                                                iter2 += (v64 >= v65) * 40;
                                                iter += (v65 > v64) * 40;
                                                node += 40;
                                                if (iter2 != v48)
                                                {
                                                    v71 = arm64g_calculate_condition(20, v66, v67, 0);
                                                    v72 = arm64g_calculate_condition(20, (v71 & 1 ? iter : 0x40000000), (v71 & 1 ? v31 : 0), 0);
                                                    if (!(v72 & 1))
                                                        break;
                                                }
                                                else
                                                {
                                                    v73 = arm64g_calculate_condition(20, v66, v67, 0);
                                                    v74 = arm64g_calculate_condition(16, (v73 & 1 ? iter : 0x40000000), (v73 & 1 ? v31 : 0), 0);
                                                    if (!(v74 & 1))
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
LABEL_c5a974:
                                v24 = 1 | v39 * 2;
                                v22 = v10;
                                if (idx <= 1)
                                    goto LABEL_c5ab54;
                            }
                        }
                    }
                    else
                    {
LABEL_c5a9e4:
                        v24 = v39 * 2;
                        if (1 >= idx)
                        {
LABEL_c5ab54:
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
                    sub_c5abf0();
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
LABEL_c5a7e0:
            v28 = 0;
            v29 = 1;
            v26 = v27;
            if (2 <= v23)
                goto LABEL_c5a938;
        }
    }
}
