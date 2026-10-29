/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb74440..0xb748ac (1132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


double sub_b74440(uint128_t *a0, void* a1)
{
    unsigned long long v15;  // x0
    unsigned long long v16;  // x8
    unsigned long long v25;  // x11
    unsigned long long v26;  // x11
    unsigned long v27;  // x12
    unsigned long long v28;  // 4110
    unsigned long long *v29;  // x12
    unsigned long long v30;  // 4105
    unsigned long long v31;  // 4110
    unsigned long long v32;  // 4105
    unsigned long v33;  // cc_dep1
    unsigned long long v34;  // x9
    unsigned long long v17;  // x9
    unsigned long long v35;  // x23
    unsigned long long v36;  // x21
    unsigned long long v37;  // 4110
    unsigned long long v38;  // 4102
    unsigned long long v39;  // 4110
    unsigned long long v40;  // 4102
    unsigned long long v41;  // x0
    unsigned long long ptr;  // x0
    unsigned long long v43;  // x22
    unsigned long long idx;  // x21
    unsigned long long v18;  // x8
    unsigned long long v45;  // x0
    unsigned long v46;  // x9
    unsigned long long v47;  // x8
    unsigned long long v48;  // x10
    unsigned long long v49;  // x8
    unsigned long v50;  // x10
    unsigned long long v51;  // x9
    unsigned long long v52;  // x10
    unsigned long v53;  // cc_dep1
    unsigned long v54;  // cc_dep2
    unsigned long long v19;  // x9
    unsigned long v55;  // x11
    unsigned long long v56;  // x10
    unsigned long long v57;  // x11
    unsigned long v58;  // x12
    unsigned long long v59;  // 4110
    unsigned long long *v60;  // x12
    unsigned long long v61;  // 4105
    unsigned long long v62;  // 4110
    unsigned long long v63;  // 4105
    unsigned long v64;  // cc_op
    unsigned long v20;  // x10
    unsigned long v65;  // cc_dep1
    unsigned long v66;  // cc_dep2
    unsigned long v67;  // cc_ndep
    unsigned long long v68;  // 4110
    unsigned long long v69;  // 4102
    unsigned long long v70;  // 4110
    unsigned long long v21;  // x11
    unsigned long long v71;  // 4102
    unsigned long v72;  // d0
    unsigned long long v22;  // x10
    unsigned long v73;  // cc_op
    unsigned long v74;  // cc_dep1
    unsigned long v75;  // cc_dep2
    unsigned long v76;  // cc_ndep
    unsigned long long v77;  // 4110
    unsigned long long v78;  // 4102
    unsigned long v23;  // cc_dep2
    unsigned long long v79;  // 4110
    unsigned long long v80;  // 4102
    unsigned long v24;  // x10
    unsigned long v81;  // d0
    unsigned long v82;  // d0
    unsigned long v83;  // d0
    uint128_t v0;  // [bp-0x108]
    unsigned long long v1;  // [bp-0xf8]
    uint128_t v2;  // [bp-0xf0], Other Possible Types: unsigned long long
    uint128_t v3;  // [bp-0xe0]
    uint128_t v4;  // [bp-0xd0]
    uint128_t v5;  // [bp-0xc0]
    uint128_t v6;  // [bp-0xb0]
    uint128_t v7;  // [bp-0xa0]
    uint128_t v8;  // [bp-0x90]
    uint128_t v9;  // [bp-0x80]
    uint128_t v10;  // [bp-0x70]
    unsigned long long v11;  // [bp-0x60]
    unsigned long long v12;  // [bp-0x58]
    char *v13;  // [bp-0x10]
    char v14;  // [bp+0x0]

    v13 = &v14;
    v15 = sub_b748ac(a1);
    if (v15)
    {
        if (!(long long)a1[80])
            v16 = 0;
        else
            v16 = (unsigned long long)((long long)a1[104] - (long long)a1[88]) >> 3;
        v17 = (unsigned long long)((long long)a1[0x88] - (long long)a1[120]) >> 3;
        if (!(long long)a1[112])
            v17 = 0;
        v18 = v17 + v16;
        v19 = *(long long *)a1;
        if (v19 != 2)
        {
            if (v19 == 3)
                goto LABEL_b745ec;
            v20 = (int)a1[16];
            if (v19 != 1)
            {
                if (!(unsigned int)v20)
                    goto LABEL_b74558;
                v21 = (long long)a1[32];
                v22 = (long long)a1[24] != 0;
                v23 = 2;
                if (v21 != 2)
                    goto LABEL_b74568;
            }
            else if (v20 & 1)
            {
                v21 = (long long)a1[32];
                v22 = (long long)a1[24] != 0;
                if ((long long)a1[8])
                    v22 += 1;
                v23 = 2;
                if (v21 != 2)
                    goto LABEL_b74568;
            }
            else
            {
                v22 = (long long)a1[8] != 0;
                v21 = (long long)a1[32];
                v23 = 2;
                if (v21 != 2)
                {
LABEL_b74568:
                    v24 = (int)a1[48];
                    v23 = 1;
                    if (v21 == 1)
                    {
                        if (v24 & 1)
                        {
                            v25 = (long long)a1[56] != 0;
                            v21 = (long long)a1[40];
                            v23 = 0;
                            if ((long long)a1[40])
                                v25 += 1;
                            goto LABEL_b745cc;
                        }
                        else
                        {
                            v21 = (long long)a1[40];
LABEL_b745a4:
                            v23 = 0;
                            v25 = v21 != 0;
                            goto LABEL_b745cc;
                        }
                    }
                    else
                    {
                        if ((unsigned int)v24)
                        {
                            v21 = (long long)a1[56];
                            goto LABEL_b745a4;
                        }
                    }
                }
            }
        }
        else
        {
LABEL_b74558:
            v22 = 0;
            v21 = (long long)a1[32];
            v23 = 2;
            if (v21 != 2)
                goto LABEL_b74568;
        }
        v25 = 0;
LABEL_b745cc:
        v26 = 0;
        v27 = (long long)a1[64];
        if ((long long)a1[72] != v27)
        {
            v28 = arm64g_calculate_condition(20, v21, v23, 0);
            v29 = &v2;
            v30 = arm64g_calculate_condition(20, (v28 & 1 ? v27 : 0x40000000), 0, 0);
            if (!(v30 & 1))
                goto LABEL_b745e4;
        }
        else
        {
            v31 = arm64g_calculate_condition(20, v21, v23, 0);
            v29 = &v2;
            v32 = arm64g_calculate_condition(16, (v31 & 1 ? v27 : 0x40000000), 0, 0);
            if (!(v32 & 1))
            {
LABEL_b745e4:
                if (!v25 && !v22)
                {
LABEL_b745ec:
                    v29 = &v12;
                    v26 = v18;
                }
            }
        }
        *v29 = v26;
        v33 = v18;
        v34 = 3;
        if (3 < v18)
            v34 = v18;
        v35 = v34 + 1;
        v36 = v35 * 8;
        if (v18 <= 0x1ffffffffffffffe)
        {
            v37 = arm64g_calculate_condition(148, v33, 3, 0);
            v38 = arm64g_calculate_condition(148, (v37 & 1 ? v36 : 0x20000000), (v37 & 1 ? 0x7ffffffffffffff8 : 0), 0);
            if (v38 & 1)
                goto LABEL_b74630;
LABEL_b74620:
            v41 = 0;
        }
        else
        {
            v39 = arm64g_calculate_condition(148, v33, 3, 0);
            v40 = arm64g_calculate_condition(144, (v39 & 1 ? v36 : 0x20000000), (v39 & 1 ? 0x7ffffffffffffff8 : 0), 0);
            if (!(v40 & 1))
                goto LABEL_b74620;
LABEL_b74630:
            if (v36)
            {
                ptr = _malloc(v36);
                if (ptr)
                {
                    v43 = ptr;
                    goto LABEL_b74658;
                }
                else
                {
                    v41 = 8;
                }
            }
            else
            {
                v35 = 0;
                v43 = 8;
LABEL_b74658:
                *(unsigned long long *)v43 = v15;
                v0 = CONCAT(v43, v35);
                idx = 1;
                v1 = 1;
                v9 = (int128_t)a1[112];
                v10 = (int128_t)a1[128];
                v4 = (int128_t)a1[32];
                v5 = (int128_t)a1[48];
                v7 = (int128_t)a1[80];
                v8 = (int128_t)a1[96];
                v6 = (int128_t)a1[64];
                v2 = *(int128_t *)a1;
                v3 = (int128_t)a1[16];
                while (1)
                {
                    v45 = sub_b748ac(&v2);
                    if (!v45)
                        break;
                    if (idx != *(unsigned long long *)&v0)
                    {
LABEL_b74698:
                        *(unsigned long long *)(v43 + idx * 8) = v45;
                        idx += 1;
                        v1 = idx;
                    }
                    else
                    {
                        v46 = *(unsigned long long *)&v2;
                        v47 = *(unsigned long long *)((void*)&v8 + 8) - *(unsigned long long *)((void*)&v7 + 8) >> 3;
                        if (!*(unsigned long long *)&v7)
                            v47 = 0;
                        if (!*(unsigned long long *)&v9)
                            v48 = 0;
                        else
                            v48 = *(unsigned long long *)((void*)&v10 + 8) - *(unsigned long long *)((void*)&v9 + 8) >> 3;
                        v49 = v48 + v47;
                        if (v46 != 2)
                        {
                            if (v46 == 3)
                                goto LABEL_b747d0;
                            v50 = *(unsigned int *)&v3;
                            if (v46 == 1)
                            {
                                v51 = *(unsigned long long *)((void*)&v2 + 8) != 0;
                                if (v50 & 1)
                                {
                                    v52 = *(unsigned long long *)&v4;
                                    if (*(unsigned long long *)((void*)&v3 + 8))
                                        v51 += 1;
                                    v53 = v52;
                                    v54 = 2;
                                    if (v52 == 2)
                                        goto LABEL_b747ac;
                                    goto LABEL_b7476c;
                                }
                            }
                            else
                            {
                                if (!(v50 & 1))
                                    goto LABEL_b7475c;
                                v51 = *(unsigned long long *)((void*)&v3 + 8) != 0;
                            }
                            v52 = *(unsigned long long *)&v4;
                            v53 = v52;
                            v54 = 2;
                            if (v52 == 2)
                                goto LABEL_b747ac;
                            goto LABEL_b7476c;
                        }
                        else
                        {
LABEL_b7475c:
                            v51 = 0;
                            v52 = *(unsigned long long *)&v4;
                            v53 = v52;
                            v54 = 2;
                            if (v52 == 2)
                                goto LABEL_b747ac;
LABEL_b7476c:
                            v55 = *(unsigned int *)&v5;
                            v53 = v52;
                            v54 = 1;
                            if (v52 == 1)
                            {
                                v53 = *(unsigned long long *)((void*)&v4 + 8);
                                v54 = 0;
                                v56 = *(unsigned long long *)((void*)&v4 + 8) != 0;
                                if (v55 & 1)
                                {
                                    v53 = *(unsigned long long *)((void*)&v5 + 8);
                                    v54 = 0;
                                    if (*(unsigned long long *)((void*)&v5 + 8))
                                        v56 += 1;
                                    goto LABEL_b747b0;
                                }
                            }
                            if (v55 & 1)
                            {
                                v53 = *(unsigned long long *)((void*)&v5 + 8);
                                v54 = 0;
                                v56 = *(unsigned long long *)((void*)&v5 + 8) != 0;
                                goto LABEL_b747b0;
                            }
LABEL_b747ac:
                            v56 = 0;
LABEL_b747b0:
                            v57 = 0;
                            v58 = *(unsigned long long *)&v6;
                            if (*(unsigned long long *)((void*)&v6 + 8) != v58)
                            {
                                v59 = arm64g_calculate_condition(20, v53, v54, 0);
                                v60 = &v12;
                                v61 = arm64g_calculate_condition(20, (v59 & 1 ? v58 : 0x40000000), 0, 0);
                                if (v61 & 1)
                                    goto LABEL_b747d8;
                            }
                            else
                            {
                                v62 = arm64g_calculate_condition(20, v53, v54, 0);
                                v60 = &v12;
                                v63 = arm64g_calculate_condition(16, (v62 & 1 ? v58 : 0x40000000), 0, 0);
                                if (v63 & 1)
                                    goto LABEL_b747d8;
                            }
                            if (v56 || v51)
                                goto LABEL_b747d8;
LABEL_b747d0:
                            v60 = &v11;
                            v57 = v49;
LABEL_b747d8:
                            *v60 = v57;
                            sub_c6c0cc(&v0, idx, v49 + 1, 8, 8);
                            v43 = *(unsigned long long *)((void*)&v0 + 8);
                            goto LABEL_b74698;
                        }
                    }
                }
                if (*(unsigned long long *)&v7)
                {
                    v68 = arm64g_calculate_condition(v64 | 16, v65, v66, v67);
                    v69 = arm64g_calculate_condition(4, (v68 & 1 ? *(unsigned long long *)&v8 : 0x40000000), 0, 0);
                    if (!(v69 & 1))
                        goto LABEL_b74810;
                }
                else
                {
                    v70 = arm64g_calculate_condition(v64 | 16, v65, v66, v67);
                    v71 = arm64g_calculate_condition(0, (v70 & 1 ? *(unsigned long long *)&v8 : 0x40000000), 0, 0);
                    if (!(v71 & 1))
                    {
LABEL_b74810:
                        _free(*(unsigned long long *)&v7);
                    }
                }
                if (*(unsigned long long *)&v9 && *(unsigned long long *)&v10)
                    _free();
                *a0 = v0;
                *(unsigned long long *)&a0[1] = v1;
                return v72;
            }
        }
        sub_c6b970(v41, v36);
        __debugbreak();
    }
    else
    {
        *(unsigned long long *)a0 = 0;
        *(unsigned long long *)((char *)a0 + 8) = 8;
        *(unsigned long long *)&a0[1] = 0;
        if ((long long)a1[80])
        {
            v77 = arm64g_calculate_condition(v73 | 16, v74, v75, v76);
            v78 = arm64g_calculate_condition(4, (v77 & 1 ? (long long)a1[96] : 0x40000000), 0, 0);
            if (!(v78 & 1))
                goto LABEL_b7450c;
        }
        else
        {
            v79 = arm64g_calculate_condition(v73 | 16, v74, v75, v76);
            v80 = arm64g_calculate_condition(0, (v79 & 1 ? (long long)a1[96] : 0x40000000), 0, 0);
            if (!(v80 & 1))
            {
LABEL_b7450c:
                _free((long long)a1[80]);
            }
        }
        if (!(long long)a1[112])
        {
            return v83;
        }
        else if ((long long)a1[128])
        {
            _free();
            return v81;
        }
        else
        {
            return v82;
        }
    }
}
