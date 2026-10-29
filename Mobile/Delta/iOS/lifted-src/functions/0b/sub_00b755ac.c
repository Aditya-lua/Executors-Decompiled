/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb755ac..0xb7598c (992 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


double sub_b755ac(uint128_t *a0, void* a1)
{
    unsigned long long v14;  // x0
    unsigned long v15;  // x8
    unsigned long v24;  // cc_op
    unsigned long v25;  // cc_dep1
    unsigned long v26;  // cc_dep2
    unsigned long v27;  // 4110
    unsigned long long v28;  // 4108
    unsigned long long v29;  // x9
    unsigned long long v31;  // x10
    unsigned long v32;  // x23
    unsigned long long v33;  // x21
    unsigned long long v16;  // x9
    unsigned long long ptr;  // x0
    unsigned long long v35;  // x22
    unsigned long long idx;  // x21
    unsigned long long v37;  // x0
    unsigned long v38;  // x9
    unsigned long long v39;  // x8
    unsigned long long v40;  // x9
    unsigned long long v41;  // x10
    unsigned long long *v42;  // x9
    unsigned long long v43;  // x10
    unsigned long long v17;  // x10
    unsigned long long v44;  // x11
    unsigned long long v45;  // x8
    unsigned long long v46;  // x9
    unsigned long v47;  // cc_dep1
    unsigned long v48;  // 4110
    unsigned long v49;  // cc_op
    unsigned long v50;  // cc_dep1
    unsigned long v51;  // cc_dep2
    unsigned long v52;  // 4110
    unsigned long long v53;  // 4108
    unsigned long long v18;  // x9
    unsigned long v54;  // cc_op
    unsigned long v55;  // cc_dep1
    unsigned long v56;  // cc_dep2
    unsigned long v57;  // cc_ndep
    unsigned long long v58;  // 4110
    unsigned long long v59;  // 4102
    unsigned long long *v19;  // x10
    unsigned long long v60;  // 4110
    unsigned long long v61;  // 4102
    unsigned long long v20;  // x11
    unsigned long v62;  // d0
    unsigned long v63;  // cc_op
    unsigned long v64;  // cc_dep1
    unsigned long v65;  // cc_dep2
    unsigned long v66;  // cc_ndep
    unsigned long long v67;  // 4110
    unsigned long long v68;  // 4102
    unsigned long long v21;  // x9
    unsigned long long v69;  // 4110
    unsigned long long v70;  // 4102
    unsigned long long v22;  // x8
    unsigned long v71;  // d0
    unsigned long v72;  // d0
    unsigned long v73;  // d0
    unsigned long v74;  // d0
    unsigned long v23;  // 4110
    uint128_t v0;  // [bp-0xe8]
    unsigned long long v1;  // [bp-0xd8]
    uint128_t v2;  // [bp-0xd0], Other Possible Types: unsigned long long
    uint128_t v3;  // [bp-0xc0]
    uint128_t v4;  // [bp-0xb0]
    uint128_t v5;  // [bp-0xa0]
    uint128_t v6;  // [bp-0x90]
    uint128_t v7;  // [bp-0x80]
    uint128_t v8;  // [bp-0x70]
    unsigned long v9;  // [bp-0x60]
    unsigned long long v10;  // [bp-0x50]
    unsigned long long v11;  // [bp-0x48]
    char *v12;  // [bp-0x10]
    char v13;  // [bp+0x0]

    v12 = &v13;
    v14 = sub_b7598c(a1);
    if (v14)
    {
        v15 = *(int *)a1;
        if ((long long)a1[88])
        {
            if (v15 & 1)
            {
                if (!(long long)a1[8])
                    v16 = 0;
                else
                    v16 = (unsigned long long)((long long)a1[32] - (long long)a1[16]) >> 3;
                v17 = (unsigned long long)((long long)a1[64] - (long long)a1[48]) >> 3;
                if (!(long long)a1[40])
                    v17 = 0;
                v18 = v17 + v16 + ((unsigned long long)((long long)a1[112] - (long long)a1[96]) >> 3);
            }
            else
            {
                v18 = (unsigned long long)((long long)a1[112] - (long long)a1[96]) >> 3;
            }
            v19 = &v11;
            v20 = v18;
        }
        else if ((unsigned int)v15)
        {
            v21 = (unsigned long long)((long long)a1[32] - (long long)a1[16]) >> 3;
            if (!(long long)a1[8])
                v21 = 0;
            v22 = (unsigned long long)((long long)a1[64] - (long long)a1[48]) >> 3;
            if (!(long long)a1[40])
                v22 = 0;
            v18 = v22 + v21;
            if ((long long)a1[72])
            {
                v23 = arm64g_calculate_condition(20, (long long)a1[40], 0, 0);
                v24 = 4;
                v25 = (v23 & 1 ? (long long)a1[80] : 0x40000000);
                v26 = (v23 & 1 ? (long long)a1[72] : 0);
            }
            else
            {
                v27 = arm64g_calculate_condition(20, (long long)a1[40], 0, 0);
                v24 = 0;
                v25 = (v27 & 1 ? (long long)a1[80] : 0x40000000);
                v26 = 0;
            }
            v28 = arm64g_calculate_condition(v24 | 16, v25, v26, 0);
            v20 = !(v28 & 1);
            v19 = &v2;
        }
        else
        {
            v18 = 0;
            v20 = 0;
            v19 = &v11;
        }
        v29 = v18;
        *v19 = v20;
        v31 = 3;
        if (3 < v29)
            v31 = v29;
        if (0x1ffffffffffffffe < v29)
        {
            sub_c6b970(0, v33);
            __debugbreak();
        }
        v32 = v31 + 1;
        v33 = v32 * 8;
        if (0x7ffffffffffffff8 >= v33)
        {
            if (v33)
            {
                ptr = _malloc(v33);
                if (!ptr)
                {
                    sub_c6b970(8, v33);
                    __debugbreak();
                }
                v35 = ptr;
            }
            else
            {
                v32 = 0;
                v35 = 8;
            }
            *(unsigned long long *)v35 = v14;
            v0 = CONCAT(v35, v32);
            idx = 1;
            v1 = 1;
            v6 = (int128_t)a1[64];
            v7 = (int128_t)a1[80];
            v8 = (int128_t)a1[96];
            v9 = (long long)a1[112];
            v2 = *(int128_t *)a1;
            v3 = (int128_t)a1[16];
            v4 = (int128_t)a1[32];
            v5 = (int128_t)a1[48];
            while (1)
            {
                v37 = sub_b7598c(&v2);
                if (!v37)
                    break;
                if (idx == *(unsigned long long *)&v0)
                {
                    v38 = *(unsigned int *)&v2;
                    if (*(unsigned long long *)((void*)&v7 + 8))
                    {
                        v39 = v9 - *(unsigned long long *)&v8 >> 3;
                        if (v38 & 1)
                        {
                            if (!*(unsigned long long *)((void*)&v2 + 8))
                                v40 = 0;
                            else
                                v40 = *(unsigned long long *)&v4 - *(unsigned long long *)&v3 >> 3;
                            v41 = *(unsigned long long *)&v6 - *(unsigned long long *)&v5 >> 3;
                            if (!*(unsigned long long *)((void*)&v4 + 8))
                                v41 = 0;
                            v39 = v40 + v39 + v41;
                        }
                        v42 = &v10;
                        v43 = v39;
                    }
                    else if (v38 & 1)
                    {
                        v44 = *(unsigned long long *)((void*)&v4 + 8);
                        if (!*(unsigned long long *)((void*)&v2 + 8))
                            v45 = 0;
                        else
                            v45 = *(unsigned long long *)&v4 - *(unsigned long long *)&v3 >> 3;
                        v46 = *(unsigned long long *)&v6 - *(unsigned long long *)&v5 >> 3;
                        v47 = v44;
                        if (!v44)
                            v46 = 0;
                        v39 = v46 + v45;
                        if (*(unsigned long long *)((void*)&v6 + 8))
                        {
                            v48 = arm64g_calculate_condition(20, v47, 0, 0);
                            v49 = 4;
                            v50 = (v48 & 1 ? *(unsigned long long *)&v7 : 0x40000000);
                            v51 = (v48 & 1 ? *(unsigned long long *)((void*)&v6 + 8) : 0);
                        }
                        else
                        {
                            v52 = arm64g_calculate_condition(20, v47, 0, 0);
                            v49 = 0;
                            v50 = (v52 & 1 ? *(unsigned long long *)&v7 : 0x40000000);
                            v51 = 0;
                        }
                        v53 = arm64g_calculate_condition(v49 | 16, v50, v51, 0);
                        v43 = !(v53 & 1);
                        v42 = &v11;
                    }
                    else
                    {
                        v39 = 0;
                        v43 = 0;
                        v42 = &v10;
                    }
                    *v42 = v43;
                    sub_c6c0cc(&v0, idx, v39 + 1, 8, 8);
                    v35 = *(unsigned long long *)((void*)&v0 + 8);
                }
                *(unsigned long long *)(v35 + idx * 8) = v37;
                idx += 1;
                v1 = idx;
            }
            if (*(unsigned long long *)((void*)&v7 + 8))
            {
                v58 = arm64g_calculate_condition(v54 | 16, v55, v56, v57);
                v59 = arm64g_calculate_condition(4, (v58 & 1 ? *(unsigned long long *)((void*)&v8 + 8) : 0x40000000), 0, 0);
                if (!(v59 & 1))
                    goto LABEL_b758d8;
            }
            else
            {
                v60 = arm64g_calculate_condition(v54 | 16, v55, v56, v57);
                v61 = arm64g_calculate_condition(0, (v60 & 1 ? *(unsigned long long *)((void*)&v8 + 8) : 0x40000000), 0, 0);
                if (!(v61 & 1))
                {
LABEL_b758d8:
                    _free(*(unsigned long long *)((void*)&v7 + 8));
                }
            }
            if (*(unsigned long long *)&v2)
            {
                if (*(unsigned long long *)((void*)&v2 + 8) && *(unsigned long long *)((void*)&v3 + 8))
                    _free();
                if (*(unsigned long long *)((void*)&v4 + 8) && *(unsigned long long *)((void*)&v5 + 8))
                    _free();
            }
            *a0 = v0;
            *(unsigned long long *)&a0[1] = v1;
            return v62;
        }
        sub_c6b970(0, v33);
        __debugbreak();
    }
    else
    {
        *(unsigned long long *)a0 = 0;
        *(unsigned long long *)((char *)a0 + 8) = 8;
        *(unsigned long long *)&a0[1] = 0;
        if ((long long)a1[88])
        {
            v67 = arm64g_calculate_condition(v63 | 16, v64, v65, v66);
            v68 = arm64g_calculate_condition(4, (v67 & 1 ? (long long)a1[104] : 0x40000000), 0, 0);
            if (!(v68 & 1))
                goto LABEL_b75650;
        }
        else
        {
            v69 = arm64g_calculate_condition(v63 | 16, v64, v65, v66);
            v70 = arm64g_calculate_condition(0, (v69 & 1 ? (long long)a1[104] : 0x40000000), 0, 0);
            if (!(v70 & 1))
            {
LABEL_b75650:
                _free((long long)a1[88]);
            }
        }
        if (!*(long long *)a1)
            return v74;
        if ((long long)a1[8] && (long long)a1[24])
            _free();
        if (!(long long)a1[40])
        {
            return v73;
        }
        else if ((long long)a1[56])
        {
            _free();
            return v71;
        }
        else
        {
            return v72;
        }
    }
}
