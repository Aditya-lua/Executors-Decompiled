/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb8c798..0xb8cc2c (1172 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


double sub_b8c798(uint128_t *a0, unsigned long long *a1)
{
    unsigned long long v28;  // x0
    unsigned long long v29;  // x8
    unsigned long long v38;  // 4110
    unsigned long long v39;  // 4105
    unsigned long long v40;  // x8
    unsigned long long v41;  // x10
    unsigned long long *v42;  // x11
    unsigned long long v43;  // x8
    unsigned long long v44;  // x9
    unsigned long long v45;  // 4110
    unsigned long long v46;  // 4105
    unsigned long long v47;  // 4110
    unsigned long long v30;  // x12
    unsigned long long v48;  // 4105
    unsigned long long v49;  // x8
    unsigned long long v50;  // x9
    unsigned long long v51;  // 4113
    unsigned long long v52;  // x21
    unsigned long long v53;  // x20
    unsigned long long ptr;  // x0
    unsigned long long *v55;  // x22
    unsigned long long idx;  // x20
    unsigned long long v57;  // x0
    unsigned long long v31;  // x9
    unsigned long long v58;  // x10
    unsigned long long v59;  // x12
    unsigned long long v60;  // x8
    unsigned long long v61;  // x9
    unsigned long v62;  // cc_dep1
    unsigned long long v63;  // x8
    unsigned long long v64;  // x11
    unsigned long long v65;  // 4110
    unsigned long long v66;  // 4105
    unsigned long long v67;  // x9
    unsigned long long v32;  // x10
    unsigned long long v68;  // 4110
    unsigned long long v69;  // 4105
    unsigned long long v70;  // x9
    unsigned long long v71;  // x10
    unsigned long long *v72;  // x10
    unsigned long long v73;  // x11
    unsigned long long v74;  // x8
    unsigned long long v75;  // x9
    unsigned long v76;  // cc_dep1
    unsigned long long v77;  // 4110
    unsigned long v33;  // cc_dep1
    unsigned long long v78;  // 4105
    unsigned long long v79;  // 4110
    unsigned long long v80;  // 4105
    unsigned long v81;  // d0
    unsigned long v82;  // d0
    unsigned long v83;  // d0
    unsigned long v84;  // d0
    unsigned long v85;  // d0
    unsigned long long v34;  // x9
    unsigned long long v35;  // 4110
    unsigned long long v36;  // 4105
    unsigned long long v37;  // x10
    unsigned long long v0;  // [bp-0x1c8]
    uint128_t v1;  // [bp-0x1b8]
    uint128_t v2;  // [bp-0x1a8]
    uint128_t v3;  // [bp-0x198]
    uint128_t v4;  // [bp-0x188]
    uint128_t v5;  // [bp-0x178]
    uint128_t v6;  // [bp-0x168]
    uint128_t v7;  // [bp-0x158]
    uint128_t v8;  // [bp-0x148]
    uint128_t v9;  // [bp-0x138]
    uint128_t v10;  // [bp-0x128]
    uint128_t v11;  // [bp-0x118]
    unsigned long long v12;  // [bp-0x108]
    unsigned long long v13;  // [bp-0x100]
    uint128_t v14;  // [bp-0xf0]
    uint128_t v15;  // [bp-0xe0]
    uint128_t v16;  // [bp-0xd0]
    uint128_t v17;  // [bp-0xc0]
    uint128_t v18;  // [bp-0xb0]
    uint128_t v19;  // [bp-0xa0]
    uint128_t v20;  // [bp-0x90]
    uint128_t v21;  // [bp-0x80]
    uint128_t v22;  // [bp-0x70]
    uint128_t v23;  // [bp-0x60]
    unsigned long long v24;  // [bp-0x50]
    unsigned long long v25;  // [bp-0x48]
    char *v26;  // [bp-0x10]
    char v27;  // [bp+0x0]

    v26 = &v27;
    v0 = 1;
    *(unsigned long long *)((char *)&v2 + 8) = 0;
    *(unsigned long long *)((char *)&v4 + 8) = a1[1];
    v5 = CONCAT(1, a1[1] + 24 * a1[2]);
    *(unsigned long long *)&v6 = 0;
    *(unsigned long long *)&v8 = 0;
    v10 = CONCAT(a1[4] + a1[5] * 64, a1[4]);
    v28 = sub_b73b74(&v0);
    if (v28)
    {
        v29 = *(unsigned int *)((void*)&v5 + 8);
        if (v0 == 1)
        {
            v30 = *(unsigned long long *)((void*)&v2 + 8);
            if (!*&(&v0)[1])
                v31 = 0;
            else
                v31 = (unsigned long long)v2 - (unsigned long long)v1 >> 3;
            v32 = (unsigned long long)v4 - (unsigned long long)v3 >> 3;
            v33 = v30;
            if (!v30)
                v32 = 0;
            v34 = v32 + v31;
            if (*(unsigned long long *)((void*)&v4 + 8))
            {
                v35 = arm64g_calculate_condition(20, v33, 0, 0);
                v36 = arm64g_calculate_condition(20, (v35 & 1 ? (unsigned long long)v5 : 0x40000000), (v35 & 1 ? *(unsigned long long *)((void*)&v4 + 8) : 0), 0);
                v37 = !(v36 & 1);
                if (v29 & 1)
                    goto LABEL_b8c848;
                goto LABEL_b8c944;
            }
            else
            {
                v38 = arm64g_calculate_condition(20, v33, 0, 0);
                v39 = arm64g_calculate_condition(16, (v38 & 1 ? (unsigned long long)v5 : 0x40000000), 0, 0);
                v37 = !(v39 & 1);
                if (!(v29 & 1))
                    goto LABEL_b8c944;
LABEL_b8c848:
                if (!(unsigned long long)v6)
                    v40 = 0;
                else
                    v40 = *(unsigned long long *)((void*)&v7 + 8) - *(unsigned long long *)((void*)&v6 + 8) >> 3;
                v41 = *(unsigned long long *)((void*)&v9 + 8) - *(unsigned long long *)((void*)&v8 + 8) >> 3;
                if (!(unsigned long long)v8)
                    v41 = 0;
                v37 = v41 + v40 + v34;
                v42 = &v25;
                v34 = v37;
            }
        }
        else if ((unsigned int)v29)
        {
            if (!(unsigned long long)v6)
                v43 = 0;
            else
                v43 = *(unsigned long long *)((void*)&v7 + 8) - *(unsigned long long *)((void*)&v6 + 8) >> 3;
            v44 = *(unsigned long long *)((void*)&v9 + 8) - *(unsigned long long *)((void*)&v8 + 8) >> 3;
            if (!(unsigned long long)v8)
                v44 = 0;
            v34 = v44 + v43;
            if ((unsigned long long)v10)
            {
                v45 = arm64g_calculate_condition(20, (unsigned long long)v8, 0, 0);
                v46 = arm64g_calculate_condition(20, (v45 & 1 ? *(unsigned long long *)((void*)&v10 + 8) : 0x40000000), (v45 & 1 ? (unsigned long long)v10 : 0), 0);
                v37 = !(v46 & 1);
            }
            else
            {
                v47 = arm64g_calculate_condition(20, (unsigned long long)v8, 0, 0);
                v48 = arm64g_calculate_condition(16, (v47 & 1 ? *(unsigned long long *)((void*)&v10 + 8) : 0x40000000), 0, 0);
                v37 = !(v48 & 1);
            }
LABEL_b8c944:
            v42 = &v13;
        }
        else
        {
            v34 = 0;
            v37 = 0;
            v42 = &v25;
        }
        v49 = 0;
        *v42 = v37;
        v50 = v34 + 1;
        v51 = arm64g_calculate_condition(50, v34, 1, 0);
        if (!(v51 & 1))
            v50 = 0xffffffffffffffff;
        if (4 < v50)
            v52 = v50;
        else
            v52 = 4;
        v53 = v52 * 8;
        if (v50 <= 0x1fffffffffffffff && 0x7ffffffffffffff8 >= v53)
        {
            ptr = _malloc(v53);
            if (ptr)
            {
                v55 = ptr;
                *(unsigned long long *)ptr = v28;
                v11 = CONCAT(ptr, v52);
                idx = 1;
                v12 = 1;
                v21 = v8;
                v22 = v9;
                v23 = v10;
                v17 = v4;
                v18 = v5;
                v19 = v6;
                v20 = v7;
                v13 = v0;
                v14 = v1;
                v15 = v2;
                v16 = v3;
                while (1)
                {
                    v57 = sub_b73b74(&v13);
                    if (!v57)
                        break;
                    if (idx != *(unsigned long long *)&v11)
                    {
LABEL_b8c9fc:
                        v55[idx] = v57;
                        idx += 1;
                        v12 = idx;
                    }
                    else
                    {
                        v58 = *(unsigned int *)((void*)&v18 + 8);
                        if (v13 == 1)
                        {
                            v59 = *(unsigned long long *)((void*)&v15 + 8);
                            if (!*&(&v13)[1])
                                v60 = 0;
                            else
                                v60 = (unsigned long long)v15 - (unsigned long long)v14 >> 3;
                            v61 = (unsigned long long)v17 - (unsigned long long)v16 >> 3;
                            v62 = v59;
                            if (!v59)
                                v61 = 0;
                            v63 = v61 + v60;
                            v64 = v18;
                            if (*(unsigned long long *)((void*)&v17 + 8))
                            {
                                v65 = arm64g_calculate_condition(20, v62, 0, 0);
                                v66 = arm64g_calculate_condition(20, (v65 & 1 ? v64 : 0x40000000), (v65 & 1 ? *(unsigned long long *)((void*)&v17 + 8) : 0), 0);
                                v67 = !(v66 & 1);
                                if (!(v58 & 1))
                                    goto LABEL_b8cb08;
                            }
                            else
                            {
                                v68 = arm64g_calculate_condition(20, v62, 0, 0);
                                v69 = arm64g_calculate_condition(16, (v68 & 1 ? v64 : 0x40000000), 0, 0);
                                v67 = !(v69 & 1);
                                if (!(v58 & 1))
                                    goto LABEL_b8cb08;
                            }
                            if (!(unsigned long long)v19)
                                v70 = 0;
                            else
                                v70 = *(unsigned long long *)((void*)&v20 + 8) - *(unsigned long long *)((void*)&v19 + 8) >> 3;
                            v71 = *(unsigned long long *)((void*)&v22 + 8) - *(unsigned long long *)((void*)&v21 + 8) >> 3;
                            if (!(unsigned long long)v21)
                                v71 = 0;
                            v63 += v71 + v70;
                            v72 = &v24;
                            v67 = v63;
                            goto LABEL_b8cb1c;
                        }
                        else
                        {
                            if ((unsigned int)v58)
                            {
                                v73 = v21;
                                if (!(unsigned long long)v19)
                                    v74 = 0;
                                else
                                    v74 = *(unsigned long long *)((void*)&v20 + 8) - *(unsigned long long *)((void*)&v19 + 8) >> 3;
                                v75 = *(unsigned long long *)((void*)&v22 + 8) - *(unsigned long long *)((void*)&v21 + 8) >> 3;
                                v76 = v73;
                                if (!v73)
                                    v75 = 0;
                                v63 = v75 + v74;
                                if ((unsigned long long)v23)
                                {
                                    v77 = arm64g_calculate_condition(20, v76, 0, 0);
                                    v78 = arm64g_calculate_condition(20, (v77 & 1 ? *(unsigned long long *)((void*)&v23 + 8) : 0x40000000), (v77 & 1 ? (unsigned long long)v23 : 0), 0);
                                    v67 = !(v78 & 1);
                                }
                                else
                                {
                                    v79 = arm64g_calculate_condition(20, v76, 0, 0);
                                    v80 = arm64g_calculate_condition(16, (v79 & 1 ? *(unsigned long long *)((void*)&v23 + 8) : 0x40000000), 0, 0);
                                    v67 = !(v80 & 1);
                                }
                            }
                            else
                            {
                                v63 = 0;
                                v67 = 0;
                                v72 = &v24;
LABEL_b8cb1c:
                                *v72 = v67;
                                sub_c6c0cc(&v11, idx, v63 + 1, 8, 8);
                                v55 = *(unsigned long long *)((void*)&v11 + 8);
                                goto LABEL_b8c9fc;
                            }
LABEL_b8cb08:
                            v72 = &v25;
                            goto LABEL_b8cb1c;
                        }
                    }
                }
                if (v13)
                {
                    if (*&(&v13)[1] && *(unsigned long long *)((void*)&v14 + 8))
                        _free();
                    if (*(unsigned long long *)((void*)&v15 + 8) && *(unsigned long long *)((void*)&v16 + 8))
                        _free();
                }
                if (*(unsigned long long *)((void*)&v18 + 8))
                {
                    if ((unsigned long long)v19 && (unsigned long long)v20)
                        _free();
                    if ((unsigned long long)v21 && (unsigned long long)v22)
                        _free();
                }
                *a0 = v11;
                *(unsigned long long *)&a0[1] = v12;
                return v81;
            }
            v49 = 8;
        }
        sub_c6b970(v49, v53);
        __debugbreak();
    }
    else
    {
        *(unsigned long long *)a0 = 0;
        *(unsigned long long *)((char *)a0 + 8) = 8;
        *(unsigned long long *)&a0[1] = 0;
        if (v0)
        {
            if (*&(&v0)[1] && *(unsigned long long *)((void*)&v1 + 8))
                _free();
            if (*(unsigned long long *)((void*)&v2 + 8) && *(unsigned long long *)((void*)&v3 + 8))
                _free();
        }
        if (!*(unsigned long long *)((void*)&v5 + 8))
            return v85;
        if ((unsigned long long)v6 && (unsigned long long)v7)
            _free();
        if (!(unsigned long long)v8)
        {
            return v84;
        }
        else if ((unsigned long long)v9)
        {
            _free();
            return v82;
        }
        else
        {
            return v83;
        }
    }
}
