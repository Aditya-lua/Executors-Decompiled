/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb9bc1c..0xb9bff4 (984 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


double sub_b9bc1c(uint128_t *a0, void* a1)
{
    unsigned long long v15;  // x8
    unsigned long long v16;  // x9
    void* v25;  // x9
    unsigned long long j;  // x21
    unsigned long long v27;  // 4102
    unsigned long long v28;  // x8
    unsigned long long v29;  // 4130
    unsigned long v30;  // cc_dep1
    unsigned long long v31;  // x22
    unsigned long long v32;  // x21
    unsigned long long v33;  // 4110
    unsigned long long v34;  // 4102
    unsigned long i;  // x10
    unsigned long long v35;  // 4110
    unsigned long long v36;  // 4102
    unsigned long long v37;  // x0
    unsigned long long ptr;  // x0
    unsigned long v39;  // cc_op
    unsigned long long v40;  // cc_dep1
    unsigned long long v41;  // cc_dep2
    unsigned long v42;  // cc_ndep
    unsigned long long v43;  // x8
    unsigned long v44;  // x9
    unsigned long long *v18;  // x11
    unsigned long long l;  // x10
    unsigned long long v46;  // x11
    unsigned long v47;  // x11
    unsigned long long v49;  // 4131
    unsigned long long v50;  // 4133
    unsigned long long v51;  // x12
    unsigned long long v52;  // x12
    void* v53;  // x9
    unsigned long long m;  // x20
    unsigned long long *v19;  // x11
    unsigned long long v55;  // 4102
    unsigned long long v56;  // x20
    unsigned long long v57;  // 4113
    uint128_t *v58;  // x8
    unsigned long v59;  // x21
    unsigned long long n;  // x24
    unsigned long long v61;  // x23
    unsigned long v62;  // x23
    unsigned long long v64;  // 4131
    unsigned long long v65;  // 4133
    unsigned long v66;  // x9
    unsigned long long v67;  // 4110
    unsigned long long v68;  // 4102
    unsigned long long v69;  // 4110
    unsigned long long v70;  // 4102
    uint128_t v71;  // q0
    unsigned long k;  // x24
    unsigned long long *v73;  // x23
    unsigned long long *v74;  // x23
    unsigned long long v21;  // 4131
    unsigned long long v76;  // 4131
    unsigned long long v77;  // 4133
    unsigned long long v22;  // 4133
    unsigned long long v23;  // x12
    unsigned long long v24;  // x12
    uint128_t v0;  // [bp-0xd8]
    unsigned long long v1;  // [bp-0xc8]
    uint128_t v2;  // [bp-0xc0], Other Possible Types: uint256_t
    uint128_t v3;  // [bp-0xb0]
    unsigned long v4;  // [bp-0xa8]
    uint128_t v5;  // [bp-0xa0], Other Possible Types: unsigned long long
    unsigned long v6;  // [bp-0x98]
    uint128_t v7;  // [bp-0x90]
    uint128_t v8;  // [bp-0x80]
    unsigned long v9;  // [bp-0x70]
    uint256_t v10;  // [bp-0x60]
    uint128_t v11;  // [bp-0x60]
    unsigned long v12;  // [bp-0x50]
    char *v13;  // [bp-0x10]
    char v14;  // [bp+0x0]

    v13 = &v14;
    v15 = (long long)a1[56];
    if (v15)
    {
        v16 = (long long)a1[24];
        i = (long long)a1[32];
        if (!i)
        {
            v18 = (long long)a1[40];
            do
            {
                v19 = v18 + 1;
                v16 -= 320;
                i = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v18)) & 0x8080808080808080;
                v18 = v19;
            } while (!i);
            *(unsigned long long **)&a1[40] = v19;
            *(unsigned long long *)&a1[24] = v16;
        }
        v21 = ((((((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
        v22 = (((((((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((i & 0xaaaaaaaaaaaaaaaa) >> 1 | i * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
        v23 = ((((v22 | v21) & 0xffff0000ffff0000) >> 16 | (v22 | v21) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v22 | v21) & 0xffff0000ffff0000) >> 16 | (v22 | v21) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
        if (!v23)
            v24 = 64;
        else
            v24 = Clz(v23);
        *(unsigned long *)&a1[32] = i - 1 & i;
        v25 = v16 + (unsigned int)-(v24 >> 3) * 40;
        j = v15 - 1;
        *(unsigned long long *)&a1[56] = j;
        if (*(long long *)((char *)v25 - 40))
        {
            v12 = *(long long *)((char *)v25 - 8);
            v11 = *(int128_t *)((char *)v25 - 24);
            do
            {
                /* unsupported instruction */;
                /* unsupported instruction */;
                /* unsupported instruction */;
            } while (/* unsupported instruction */ ^ 1);
            v27 = arm64g_calculate_condition(20, /* unsupported instruction */, 1, 0);
            if (!(v27 & 1))
            {
                /* unsupported instruction */;
                sub_b86a90();
            }
            j = (long long)a1[56];
            if (*(long long *)((char *)v25 - 32))
            {
                *(long long *)&v2 = *(long long *)((char *)v25 - 32);
                *(uint128_t *)((char *)&v2 + 8) = v11;
                *(unsigned long *)((char *)&v2 + 24) = v12;
                v28 = j + 1;
                v29 = arm64g_calculate_condition(50, j, 1, 0);
                if (!(v29 & 1))
                    v28 = 0xffffffffffffffff;
                v30 = v28;
                if (4 < v28)
                    v31 = v28;
                else
                    v31 = 4;
                v32 = v31 * 32;
                if (v28 <= 0x7ffffffffffffff)
                {
                    v33 = arm64g_calculate_condition(4, v30, 4, 0);
                    v34 = arm64g_calculate_condition(148, (v33 & 1 ? v32 : 0x20000000), (v33 & 1 ? 0x7ffffffffffffff8 : 0), 0);
                    if (v34 & 1)
                        goto LABEL_b9bdc8;
LABEL_b9bd18:
                    v37 = 0;
                }
                else
                {
                    v35 = arm64g_calculate_condition(4, v30, 4, 0);
                    v36 = arm64g_calculate_condition(144, (v35 & 1 ? v32 : 0x20000000), (v35 & 1 ? 0x7ffffffffffffff8 : 0), 0);
                    if (!(v36 & 1))
                        goto LABEL_b9bd18;
LABEL_b9bdc8:
                    ptr = _malloc(v32);
                    if (ptr)
                    {
                        *(uint128_t *)ptr = *(uint128_t *)&v2;
                        *(uint128_t *)(ptr + 16) = *(uint128_t *)((void*)&v2 + 16);
                        v0 = CONCAT(ptr, v31);
                        v1 = 1;
                        v2 = *(int128_t *)a1;
                        v3 = (int128_t)a1[16];
                        v5 = (int128_t)a1[32];
                        v7 = (int128_t)a1[48];
                        while (1)
                        {
                            v43 = *(unsigned long long *)((void*)&v7 + 8);
                            if (!v43)
                                break;
                            v44 = *(unsigned long long *)((void*)&v3 + 8);
                            l = *(unsigned long long *)&v5;
                            if (!l)
                            {
                                v46 = *(unsigned long long *)((void*)&v5 + 8);
                                do
                                {
                                    v47 = v46 + 8;
                                    v44 -= 320;
                                    l = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v46)) & 0x8080808080808080;
                                    v46 = v47;
                                } while (!l);
                                *(unsigned long *)((char *)&v5 + 8) = v47;
                                *(unsigned long *)((char *)&v3 + 8) = v44;
                            }
                            v49 = ((((((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                            v50 = (((((((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((l & 0xaaaaaaaaaaaaaaaa) >> 1 | l * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                            v51 = ((((v50 | v49) & 0xffff0000ffff0000) >> 16 | (v50 | v49) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32 | (((v50 | v49) & 0xffff0000ffff0000) >> 16 | (v50 | v49) * 0x10000 & 0xffff0000ffff0000) * 0x100000000 & 0xffffffff00000000;
                            if (!v51)
                                v52 = 64;
                            else
                                v52 = Clz(v51);
                            v53 = v44 + (unsigned int)-(v52 >> 3) * 40;
                            m = v43 - 1;
                            *(unsigned long long *)&v5 = l - 1 & l;
                            *(unsigned long long *)((char *)&v7 + 8) = m;
                            if (*(long long *)((char *)v53 - 40))
                            {
                                v9 = *(long long *)((char *)v53 - 8);
                                v8 = *(int128_t *)((char *)v53 - 24);
                                do
                                {
                                    /* unsupported instruction */;
                                    v39 = 4;
                                    v40 = /* unsupported instruction */;
                                    v41 = 1;
                                    v42 = 0;
                                    /* unsupported instruction */;
                                    /* unsupported instruction */;
                                } while (/* unsupported instruction */ ^ 1);
                                v55 = arm64g_calculate_condition(20, v40, 1, 0);
                                if (!(v55 & 1))
                                {
                                    /* unsupported instruction */;
                                    sub_b86a90();
                                }
                                if (*(long long *)((char *)v53 - 32))
                                {
                                    v10 = _INSERT(CONCAT(v11, 0), 0, *(long long *)((char *)v53 - 32));
                                    *(uint128_t *)((char *)&v10 + 8) = v8;
                                    *(unsigned long *)((char *)&v10 + 24) = v9;
                                    v56 = v1;
                                    v41 = v0;
                                    v39 = 4;
                                    v42 = 0;
                                    v40 = v56;
                                    if (v40 == (unsigned long long)v0)
                                    {
                                        v57 = arm64g_calculate_condition(50, *(unsigned long long *)((void*)&v7 + 8), 1, 0);
                                        sub_c736c8();
                                    }
                                    v58 = *(unsigned long long *)((void*)&v0 + 8) + v56 * 32;
                                    *v58 = *(uint128_t *)&v10;
                                    v58[1] = *(uint128_t *)((void*)&v10 + 16);
                                    v1 = v56 + 1;
                                }
                                else
                                {
                                    m = *(unsigned long long *)((void*)&v7 + 8);
                                    goto LABEL_b9befc;
                                }
                            }
                            else
                            {
LABEL_b9befc:
                                if (m)
                                {
                                    v59 = *(unsigned long long *)((void*)&v3 + 8);
                                    n = *(unsigned long long *)&v5;
                                    v61 = *(unsigned long long *)((void*)&v5 + 8);
                                    do
                                    {
                                        if (!n)
                                        {
                                            do
                                            {
                                                v62 = v61 + 8;
                                                v59 -= 320;
                                                n = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v61)) & 0x8080808080808080;
                                                v61 = v62;
                                            } while (!n);
                                            v6 = v62;
                                            v4 = v59;
                                            v61 = v62;
                                        }
                                        v64 = ((((((n & 0xaaaaaaaaaaaaaaaa) >> 1 | n * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((n & 0xaaaaaaaaaaaaaaaa) >> 1 | n * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((n & 0xaaaaaaaaaaaaaaaa) >> 1 | n * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((n & 0xaaaaaaaaaaaaaaaa) >> 1 | n * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                                        v65 = (((((((n & 0xaaaaaaaaaaaaaaaa) >> 1 | n * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((n & 0xaaaaaaaaaaaaaaaa) >> 1 | n * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((n & 0xaaaaaaaaaaaaaaaa) >> 1 | n * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((n & 0xaaaaaaaaaaaaaaaa) >> 1 | n * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                                        n &= n - 1;
                                        m -= 1;
                                        v5 = n;
                                        *(unsigned long long *)((char *)&v7 + 8) = m;
                                        sub_b98fd0();
                                    } while (m);
                                }
                            }
                        }
                        v66 = *(unsigned long long *)((void*)&v2 + 8);
                        if (*(unsigned long long *)&v2)
                        {
                            v67 = arm64g_calculate_condition(v39 | 16, v40, v41, v42);
                            v68 = arm64g_calculate_condition(4, (v67 & 1 ? v66 : 0x40000000), 0, 0);
                            if (!(v68 & 1))
                                goto LABEL_b9bf70;
                        }
                        else
                        {
                            v69 = arm64g_calculate_condition(v39 | 16, v40, v41, v42);
                            v70 = arm64g_calculate_condition(0, (v69 & 1 ? v66 : 0x40000000), 0, 0);
                            if (!(v70 & 1))
                            {
LABEL_b9bf70:
                                _free(*(unsigned long long *)&v3);
                            }
                        }
                        *a0 = v0;
                        *(unsigned long long *)&a0[1] = v1;
                        return (unsigned long long)v0;
                    }
                    v37 = 8;
                }
                sub_c6b970(v37, v32);
                __debugbreak();
            }
        }
        *(unsigned long long *)a0 = 0;
        *(unsigned long long *)((char *)a0 + 8) = 8;
        *(unsigned long long *)&a0[1] = 0;
        if (j)
        {
            k = (long long)a1[32];
            v73 = (long long)a1[40];
            do
            {
                v74 = v73;
                if (!k)
                {
                    do
                    {
                        v73 = v74 + 1;
                        k = (unsigned long long)__dirty_unsupported_Iop_ZeroHI64ofV128(~_mm_cmpgt_epi8(_mm_setzero_si128(), (uint128_t)*(unsigned long long *)&*(double *)v74)) & 0x8080808080808080;
                        v74 = v73;
                    } while (!k);
                }
                v76 = ((((((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00;
                v77 = (((((((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) & 0xf0f0f0f0f0f0f0f0) >> 4 | ((((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2 | ((k & 0xaaaaaaaaaaaaaaaa) >> 1 | k * 2 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8;
                k &= k - 1;
                j -= 1;
                sub_b98fd0();
            } while (j);
        }
    }
    else
    {
        *(unsigned long long *)a0 = 0;
        *(unsigned long long *)((char *)a0 + 8) = 8;
        *(unsigned long long *)&a0[1] = 0;
    }
    if (!*(long long *)a1)
    {
        return (unsigned long long)v71;
    }
    else if ((long long)a1[8])
    {
        _free();
        return (unsigned long long)v71;
    }
    else
    {
        return (unsigned long long)v71;
    }
}
