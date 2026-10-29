/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc590e0..0xc595ac (1228 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


void sub_c590e0(unsigned long a0, unsigned long long a1, void* a2, unsigned long long a3, unsigned int a4)
{
    unsigned long long v14;  // x24
    unsigned long long v15;  // x19
    unsigned long long v24;  // x9
    unsigned long long v25;  // x10
    unsigned long long v26;  // x11
    unsigned long long v27;  // x8
    unsigned long long v28;  // x22
    unsigned long long idx;  // x28
    unsigned int v30;  // w8
    unsigned long v31;  // cc_dep1
    unsigned long v32;  // cc_dep2
    unsigned long v33;  // x8
    unsigned long long v16;  // x9
    unsigned long long v34;  // x25
    unsigned long long v35;  // x26
    unsigned long long v36;  // x19
    unsigned long v37;  // x9
    unsigned long long v38;  // 4110
    unsigned long long v39;  // 4102
    unsigned long long v40;  // 4110
    unsigned long long v41;  // 4102
    void* iter;  // x21
    unsigned long long v43;  // x8
    unsigned long long v17;  // x8
    void* node;  // x24
    void* v45;  // x8
    uint128_t *iter1;  // x9
    unsigned long v47;  // x10
    void* v48;  // x8
    unsigned long v49;  // x11
    void* v50;  // x24
    unsigned long v51;  // cc_dep1
    unsigned long v52;  // cc_dep2
    void* v53;  // x12
    unsigned long long v18;  // x8
    unsigned long long v54;  // 4110
    unsigned long long v55;  // 4102
    unsigned long long v56;  // 4110
    unsigned long long v57;  // 4102
    void* iter2;  // x1
    unsigned long v59;  // x9
    unsigned long v60;  // x10
    unsigned long v61;  // cc_dep1
    unsigned long v62;  // cc_dep2
    void* v63;  // x11
    unsigned long long v19;  // w8
    unsigned long long v64;  // 4110
    unsigned long long v65;  // 4102
    unsigned long long v66;  // 4110
    unsigned long long v67;  // 4102
    void* v68;  // x0
    unsigned long long v69;  // x8
    unsigned long v70;  // x10
    unsigned long long i;  // x9
    unsigned long long *v72;  // x12
    unsigned long v73;  // x13
    char v20;  // x8
    unsigned long long *v74;  // x12
    unsigned long long *v75;  // x12
    unsigned long v76;  // x13
    unsigned long long *v77;  // x12
    unsigned long long v78;  // x24
    unsigned long long v79;  // x8
    uint128_t *v80;  // x10
    void* v81;  // x0
    unsigned long long v82;  // x9
    uint128_t v83;  // q0
    unsigned long long v21;  // x21
    unsigned long long v85;  // x8
    unsigned long long index;  // x23
    unsigned long long v23;  // x27
    unsigned long v0;  // [bp-0x328]
    unsigned long long v1;  // [bp-0x318]
    unsigned long long v2;  // [bp-0x310]
    unsigned long v3;  // [bp-0x308]
    unsigned long long v4;  // [bp-0x300]
    uint128_t *v5;  // [bp-0x2f8]
    unsigned long long v6;  // [bp-0x2f0]
    unsigned long long v7;  // [bp-0x2e8]
    unsigned long long v8;  // [bp-0x2e0]
    unsigned long long v9;  // [bp-0x2c8]
    char v10;  // [bp-0x2c0]
    char v11;  // [bp-0xac]
    char *v12;  // [bp-0x10]
    char v13;  // [bp+0x0]

    v12 = &v13;
    v14 = a3;
    v15 = a1;
    v16 = 0x4000000000000000 / a1;
    if (a1 * v16 != 0x4000000000000000)
        v16 += 1;
    v1 = v16;
    if (0x1000 >= a1)
    {
        v17 = v15 - (v15 >> 1);
        if (v17 >= 64)
            v17 = 64;
    }
    else
    {
        v18 = v15 | 1;
        if (!v18)
            v19 = 64;
        else
            v19 = (unsigned int)Clz(v18);
        v20 = (((char)v19 ^ 63) & 1) + (char)((v19 ^ 63) >> 1);
        v17 = (1 << (v20 & 63)) + (v15 >> (v20 & 63)) >> 1;
    }
    v4 = v17;
    v21 = 0;
    index = 0;
    v0 = a0 + 32;
    v2 = v15;
    v3 = a0 - 16;
    v23 = 1;
    v7 = v14;
    v24 = v15 - 0;
    if (v15 <= 0)
        goto LABEL_c591ec;
    while (1)
    {
        v68 = a0 + v21 * 16;
        if (v4 > v24)
        {
LABEL_c591b0:
            if (a4 & 1)
            {
                if (v24 < 32)
                    v78 = v24;
                else
                    v78 = 32;
                sub_c595ac();
                v26 = 1 | v78 * 2;
                v14 = v7;
                goto LABEL_c5930c;
            }
            else
            {
                if (v24 < v4)
                    v79 = v24;
                else
                    v79 = v4;
                v26 = v79 * 2;
                goto LABEL_c5930c;
            }
        }
        if (2 > v24)
        {
            v69 = v24;
            goto LABEL_c59304;
        }
        v70 = (long long)v68[16];
        if ((unsigned long long)*(long long *)v68 > v70)
        {
            if (v24 == 2)
            {
                i = 1;
                v69 = 2;
                goto LABEL_c592d4;
            }
            else
            {
                v72 = v0 + v21 * 16;
                v69 = 2;
                v73 = v70;
                do
                {
                    v74 = v72 + 2;
                    if (v73 <= *v72)
                        goto LABEL_c592b8;
                } while ((v69 += 1, v73 = *v72, v72 = v74, v24 != v69));
            }
        }
        else
        {
            if (v24 == 2)
            {
                v69 = 2;
                goto LABEL_c59304;
            }
            else
            {
                v75 = v0 + v21 * 16;
                v69 = 2;
                v76 = v70;
                do
                {
                    v77 = v75 + 2;
                    if (*v75 < v76)
                        goto LABEL_c592b8;
                } while ((v69 += 1, v76 = *v75, v75 = v77, v24 != v69));
            }
        }
        v69 = v24;
LABEL_c592b8:
        if (v69 < v4)
            goto LABEL_c591b0;
        if ((unsigned long long)*(long long *)v68 <= v70 || (i = v69 >> 1, !i))
            goto LABEL_c59304;
LABEL_c592d4:
        v80 = v3 + v69 * 16 + v21 * 16;
        v81 = v68;
        do
        {
            v82 = i;
            v83 = *(int128_t *)v68;
            v68 += 16;
            *(uint128_t *)v81 = *v80;
            *v80 = v83;
            v80 = (char *)v80 - 16;
            v81 = v68;
            i = v82 - 1;
        } while (i);
LABEL_c59304:
        v26 = 1 | v69 * 2;
LABEL_c5930c:
        v85 = v1 * (v21 * 2 + (v26 >> 1)) ^ v1 * (v21 * 2 - (v23 >> 1));
        if (!v85)
            v25 = 64;
        else
            v25 = Clz(v85);
        if (index >= 2)
        {
LABEL_c59334:
            v27 = v21 * 16;
            v28 = a0 + v27;
            v5 = v3 + v27;
            v6 = v26;
            v8 = v21;
            v9 = v25;
            while (1)
            {
                idx = index - 1;
                v30 = (&v11)[2 + idx];
                v31 = v30 & 0xff;
                v32 = v25 & 0xffffffff;
                if (v30 < (unsigned int)v25)
                    break;
                v33 = *(long long *)&(&v10)[8 * idx];
                v34 = v33 >> 1;
                v35 = v23 >> 1;
                v36 = v34 + v35;
                v37 = ((unsigned int)v33 | (unsigned int)v23) & 1;
                if (v36 <= v14)
                {
                    v38 = arm64g_calculate_condition(147, v31, v32, 0);
                    v39 = arm64g_calculate_condition(4, (v38 & 1 ? v37 : 0), 0, 0);
                    if (v39 & 1)
                        goto LABEL_c593e0;
                    goto LABEL_c593c0;
                }
                else
                {
                    v40 = arm64g_calculate_condition(147, v31, v32, 0);
                    v41 = arm64g_calculate_condition(0, (v40 & 1 ? v37 : 0), 0, 0);
                    if (!(v41 & 1))
                    {
LABEL_c593c0:
                        iter = a0 + (v21 - v36) * 16;
                        if (v33 & 1)
                        {
                            if (!(v23 & 1))
                                goto LABEL_c5941c;
                            goto LABEL_c593d4;
                        }
                        else
                        {
                            sub_c595ac();
                            if (v23 & 1)
                            {
LABEL_c593d4:
                                v25 = v9;
                                if (!v35)
                                    goto LABEL_c5936c;
                                goto LABEL_c5944c;
                            }
                            else
                            {
LABEL_c5941c:
                                sub_c595ac();
                                v25 = v9;
                                if (!v35)
                                    goto LABEL_c5936c;
LABEL_c5944c:
                                if (v34)
                                {
                                    if (v35 < v34)
                                        v43 = v35;
                                    else
                                        v43 = v34;
                                    if (v14 >= v43)
                                    {
                                        node = iter + v34 * 16;
                                        _memcpy();
                                        v45 = a2 + v43 * 16;
                                        if (v34 > v35)
                                        {
                                            iter1 = v5;
                                            while (1)
                                            {
                                                v47 = *(long long *)((char *)v45 - 16);
                                                v48 = v45 - 16;
                                                v49 = *(long long *)((char *)node - 16);
                                                v50 = node - 16;
                                                v51 = v47;
                                                v52 = v49;
                                                if (v47 < v49)
                                                    v53 = v50;
                                                else
                                                    v53 = v48;
                                                *iter1 = *(int128_t *)v53;
                                                iter1 = (char *)iter1 - 16;
                                                node = v50 + (v47 >= v49) * 16;
                                                v45 = v48 + (v49 > v47) * 16;
                                                if (node != iter)
                                                {
                                                    v54 = arm64g_calculate_condition(20, v51, v52, 0);
                                                    v55 = arm64g_calculate_condition(20, (v54 & 1 ? v45 : 0x40000000), (v54 & 1 ? a2 : 0), 0);
                                                    if (!(v55 & 1))
                                                        break;
                                                }
                                                else
                                                {
                                                    v56 = arm64g_calculate_condition(20, v51, v52, 0);
                                                    v57 = arm64g_calculate_condition(16, (v56 & 1 ? v45 : 0x40000000), (v56 & 1 ? a2 : 0), 0);
                                                    if (!(v57 & 1))
                                                        break;
                                                }
                                            }
                                            iter = node;
                                        }
                                        else
                                        {
                                            iter2 = a2;
                                            while (1)
                                            {
                                                v59 = *(long long *)node;
                                                v60 = *(long long *)iter2;
                                                v61 = v59;
                                                v62 = v60;
                                                if (v59 < v60)
                                                    v63 = node;
                                                else
                                                    v63 = iter2;
                                                *(int128_t *)iter = *(int128_t *)v63;
                                                iter += 16;
                                                iter2 += (v59 >= v60) * 16;
                                                node += (v60 > v59) * 16;
                                                if (iter2 != v45)
                                                {
                                                    v64 = arm64g_calculate_condition(20, v61, v62, 0);
                                                    v65 = arm64g_calculate_condition(20, (v64 & 1 ? node : 0x40000000), (v64 & 1 ? v28 : 0), 0);
                                                    if (!(v65 & 1))
                                                        break;
                                                }
                                                else
                                                {
                                                    v66 = arm64g_calculate_condition(20, v61, v62, 0);
                                                    v67 = arm64g_calculate_condition(16, (v66 & 1 ? node : 0x40000000), (v66 & 1 ? v28 : 0), 0);
                                                    if (!(v67 & 1))
                                                        break;
                                                }
                                            }
                                        }
                                        _memcpy(iter);
                                        v14 = v7;
                                        v25 = v9;
                                    }
                                }
LABEL_c5936c:
                                v23 = 1 | v36 * 2;
                                v21 = v8;
                                index = idx;
                                if (index <= 1)
                                    goto LABEL_c5950c;
                            }
                        }
                    }
                    else
                    {
LABEL_c593e0:
                        v23 = v36 * 2;
                        index = idx;
                        if (1 >= index)
                        {
LABEL_c5950c:
                            index = 1;
                            break;
                        }
                    }
                }
            }
            v15 = v2;
            v26 = v6;
        }
        while (1)
        {
            *(unsigned long long *)&(&v10)[8 * index] = v23;
            (&v11)[2 + index] = v25;
            if (v15 <= v21)
            {
                if (!(v23 & 1))
                {
                    sub_c595ac();
                    return;
                }
                return;
            }
            index += 1;
            v21 += v26 >> 1;
            v23 = v26;
            v24 = v15 - v21;
            if (v15 > v21)
                break;
LABEL_c591ec:
            v25 = 0;
            v26 = 1;
            if (2 <= index)
                goto LABEL_c59334;
        }
    }
}
