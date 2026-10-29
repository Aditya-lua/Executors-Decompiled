/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xcdd28..0xce304 (1500 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_cdd28_0 {
    char field_0;
} st_cdd28_0;


unsigned long long sub_cdd28(unsigned long long a0, unsigned long long idx, unsigned long long a2, unsigned long long a3, unsigned long long a4, unsigned long long a5, unsigned long long a6, unsigned long long a7)
{
    unsigned long long v24;  // w8
    unsigned int v25;  // w8
    unsigned int v34;  // w0
    unsigned long long v35;  // w0
    unsigned long long v36;  // w0
    unsigned long long v37;  // x23
    unsigned long long iter;  // x19
    unsigned long long v39;  // x26
    unsigned long long v40;  // x20
    unsigned long long v41;  // x20
    unsigned long long v42;  // x21
    unsigned long long v43;  // x20
    unsigned long long v44;  // x0
    unsigned long v45;  // cc_dep1
    unsigned long long v46;  // 4105
    unsigned long long v47;  // 4105
    unsigned long long v48;  // x24
    unsigned long long v49;  // x19
    unsigned long long v50;  // x0
    unsigned long v51;  // cc_dep1
    unsigned long long v52;  // 4105
    unsigned long long v53;  // 4105
    unsigned long long v54;  // x20
    unsigned long long v55;  // w0
    unsigned long long v56;  // 4107
    unsigned long long v57;  // 4107
    unsigned long long v58;  // x20
    uint128_t v28;  // q0
    unsigned long long v29;  // w0
    unsigned long long v30;  // w0
    unsigned long long v31;  // w0
    unsigned long long v32;  // w0
    unsigned long long v33;  // w0
    unsigned long long v0;  // [bp-0x16c]
    unsigned long long v1;  // [bp-0x168]
    unsigned long long v2;  // [bp-0x164]
    unsigned long long v3;  // [bp-0x160]
    unsigned long long v4;  // [bp-0x15c]
    unsigned long long v5;  // [bp-0x158]
    unsigned long long v6;  // [bp-0x154]
    st_cdd28_0 **v7;  // [bp-0x120], Other Possible Types: char
    st_cdd28_0 *v8;  // [bp-0x118]
    char v9;  // [bp-0x110]
    char v10;  // [bp-0x108]
    char v11;  // [bp-0x100], Other Possible Types: unsigned long
    char v12;  // [bp-0xf8]
    uint128_t v13;  // [bp-0xf0]
    uint128_t v14;  // [bp-0xe0], Other Possible Types: char
    uint128_t v15;  // [bp-0xd0]
    uint128_t v16;  // [bp-0xc0]
    uint128_t v17;  // [bp-0xb0], Other Possible Types: char
    uint128_t v18;  // [bp-0xa0], Other Possible Types: char
    uint128_t v19;  // [bp-0x90]
    uint128_t v20;  // [bp-0x80]
    unsigned long v21;  // [bp-0x70]
    char *v22;  // [bp-0x10]
    unsigned long long v23;  // [bp+0x0]

    v22 = &v23;
    v8 = &v7;
    v7 = &v8;
    if (!a0)
        return 0xffffff9a;
    if (sub_cd068() || sub_ce304(a0, *(long long *)(a0 + 96), &v12))
    {
        v24 = 0xffffffff;
    }
    else
    {
        if (v12 == 33639248)
            v24 = 0;
        else
            v24 = 0xffffff99;
    }
    v6 = v24;
    v5 = (unsigned int)sub_ce450(a0, *(long long *)(a0 + 96), &v13);
    v4 = (unsigned int)sub_ce450(a0, *(long long *)(a0 + 96), (char *)&v13 + 8);
    v3 = (unsigned int)sub_ce450(a0, *(long long *)(a0 + 96), &v14);
    v2 = (unsigned int)sub_ce450(a0, *(long long *)(a0 + 96), &v14 + 8);
    v1 = (unsigned int)sub_ce304(a0, *(long long *)(a0 + 96), &v15);
    v25 = *(unsigned int *)&v15;
    v28 = _INSERT(__dirty_unsupported_Iop_Sh32Ux4(CONCAT(v25 | v25 * 0x100000000, v25 | v25 * 0x100000000), 0xfffffff0fffffff5fffffffbffffffff), 0, __dirty_unsupported_Iop_Sh32Ux4(__float_as_int(__int_as_float(v25)), 0x100000000b0000000500000001));
    v21 = CONCAT((v25 >> 25) + 1980, (__ROL__(v25, 11) & 0xfffff80f & 15) - 1);
    v20 = v28 & 0x1f0000001f0000003f0000003e;
    v0 = (unsigned int)sub_ce304(a0, *(long long *)(a0 + 96), (char *)&v15 + 8);
    v29 = (unsigned int)sub_ce304(a0, *(long long *)(a0 + 96), &v11);
    *(char *)&v16 = v11;
    v30 = (unsigned int)sub_ce304(a0, *(long long *)(a0 + 96), &v11);
    *((char *)&v16 + 8) = v11;
    v31 = (unsigned int)sub_ce450(a0, *(long long *)(a0 + 96), &v17);
    v32 = (unsigned int)sub_ce450(a0, *(long long *)(a0 + 96), &v17 + 8);
    v33 = (unsigned int)sub_ce450(a0, *(long long *)(a0 + 96), &v18);
    v34 = sub_ce450(a0, *(long long *)(a0 + 96), &v18 + 8);
    v35 = (unsigned int)sub_ce450(a0, *(long long *)(a0 + 96), &v19);
    v36 = (unsigned int)sub_ce304(a0, *(long long *)(a0 + 96), (char *)&v19 + 8);
    if (...)
        v37 = v6;
    else
        v37 = 0xffffffff;
    iter = *(unsigned long long *)&v17;
    if (a3)
    {
        v39 = a6;
        if (!(unsigned int)v37)
        {
            v40 = a4;
            v41 = v40;
            if (v41 > iter)
            {
                *(char *)(a3 + iter) = 0;
                v41 = iter;
            }
            v37 = 0;
            if (v40 && iter)
                (*(long long *)(a0 + 8))();
            iter -= v41;
        }
        v42 = *(unsigned long long *)((void*)&v17 + 8);
        if (a5)
            goto LABEL_cdffc;
    }
    else
    {
        v39 = a6;
        v42 = *(unsigned long long *)((void*)&v17 + 8);
        if (a5)
        {
LABEL_cdffc:
            if (!(unsigned int)v37)
            {
                if (v42 < v39)
                    v43 = v42;
                else
                    v43 = v39;
                if (iter)
                {
                    v44 = sub_cd068(a0, *(long long *)(a0 + 96), iter, 1);
                    v45 = v44;
                    if (v44)
                    {
                        iter = iter;
                        v46 = arm64g_calculate_condition(4, v45, 0, 0);
                        if (!(v46 & 1))
                            goto LABEL_ce02a;
LABEL_ce029:
                        v37 = 0;
                    }
                    else
                    {
                        iter = 0;
                        v47 = arm64g_calculate_condition(4, v45, 0, 0);
                        if (v47 & 1)
                            goto LABEL_ce029;
LABEL_ce02a:
                        v37 = 0xffffffff;
                    }
                    if (v39)
                        goto LABEL_ce05c;
                }
                else
                {
                    v37 = 0;
                    if (v39)
                    {
LABEL_ce05c:
                        if (v42)
                            (*(long long *)(a0 + 8))();
                    }
                }
                v48 = v42 - v43 + iter;
                if (!(unsigned int)v37)
                {
LABEL_ce08c:
                    if (v42)
                    {
                        v49 = v48 - v42;
                        if (v48 == v42)
                        {
                            v48 = 0;
                            v37 = 0;
                        }
                        else
                        {
                            v50 = sub_cd068(a0, *(long long *)(a0 + 96), v49, 1);
                            v51 = v50;
                            if (v50)
                            {
                                v48 = v49;
                                v52 = arm64g_calculate_condition(4, v51, 0, 0);
                                if (!(v52 & 1))
                                    goto LABEL_ce0c2;
LABEL_ce0c1:
                                v37 = 0;
                            }
                            else
                            {
                                v48 = 0;
                                v53 = arm64g_calculate_condition(4, v51, 0, 0);
                                if (v53 & 1)
                                    goto LABEL_ce0c1;
LABEL_ce0c2:
                                v37 = 0xffffffff;
                            }
                        }
                        v54 = 0;
                        do
                        {
                            v55 = (unsigned int)sub_ce450(a0, *(long long *)(a0 + 96), &v10);
                            if (!sub_ce450(a0, *(long long *)(a0 + 96), &v9) && !v55)
                                v37 &= 0xffffffff;
                            else
                                v37 = 0xffffffff;
                            if (v10 != 1)
                            {
                                v57 = arm64g_calculate_condition(4, sub_cd068(a0, *(long long *)(a0 + 96), v9, 1), 0, 0);
                                if (!(v57 & 1))
                                    goto LABEL_ce0d6;
                                goto LABEL_ce0d5;
                            }
                            if (*(unsigned long long *)((void*)&v16 + 8) != 0xffffffff)
                            {
                                if (*(unsigned long long *)&v16 == 0xffffffff)
                                    goto LABEL_ce1a0;
                                goto LABEL_ce144;
                            }
                            else
                            {
                                if (!sub_ce39c(a0, *(long long *)(a0 + 96), (char *)&v16 + 8))
                                    v37 &= 0xffffffff;
                                else
                                    v37 = 0xffffffff;
                                if (*(unsigned long long *)&v16 != 0xffffffff)
                                {
LABEL_ce144:
                                    if (v11 == 0xffffffff)
                                        goto LABEL_ce1c4;
                                    goto LABEL_ce150;
                                }
                                else
                                {
LABEL_ce1a0:
                                    if (!sub_ce39c(a0, *(long long *)(a0 + 96), &v16))
                                        v37 &= 0xffffffff;
                                    else
                                        v37 = 0xffffffff;
                                    if (v11 != 0xffffffff)
                                    {
LABEL_ce150:
                                        if (*(unsigned long long *)((void*)&v18 + 8) != 0xffff)
                                            continue;
                                        goto LABEL_ce1e8;
                                    }
                                    else
                                    {
LABEL_ce1c4:
                                        if (!sub_ce39c(a0, *(long long *)(a0 + 96), &v11))
                                            v37 &= 0xffffffff;
                                        else
                                            v37 = 0xffffffff;
                                        if (*(unsigned long long *)((void*)&v18 + 8) != 0xffff)
                                            continue;
LABEL_ce1e8:
                                        v56 = arm64g_calculate_condition(3, sub_ce304(a0, *(long long *)(a0 + 96), &v18 + 8) & 0xffffffff, 0, 0);
                                        if (v56 & 1)
                                        {
LABEL_ce0d5:
                                            v37 &= 0xffffffff;
                                            continue;
                                        }
                                        else
                                        {
LABEL_ce0d6:
                                            v37 = 0xffffffff;
                                        }
                                    }
                                }
                            }
                        } while ((v54 = v54 + v9 + 4, *(unsigned long long *)((void*)&v17 + 8) > v54));
                    }
                }
LABEL_ce200:
                if (a7 && !(unsigned int)v37)
                {
                    v58 = *(unsigned long long *)&v18;
                    if (v23 > v58)
                        *(char *)(a7 + v58) = 0;
                    if (v48)
                    {
                        if (!sub_cd068(a0, *(long long *)(a0 + 96), v48, 1))
                            v37 = 0;
                        else
                            v37 = 0xffffffff;
                        if (v23)
                            goto LABEL_ce258;
                    }
                    else
                    {
                        v37 = 0;
                        if (v23)
                        {
LABEL_ce258:
                            if (v58)
                                (*(long long *)(a0 + 8))();
                        }
                    }
                }
                if (idx && !(unsigned int)v37)
                {
                    *(uint128_t *)(idx + 96) = v19;
                    *(uint128_t *)(idx + 112) = v20;
                    *(unsigned long *)(idx + 128) = v21;
                    *(uint128_t *)(idx + 32) = v15;
                    *(uint128_t *)(idx + 48) = v16;
                    *(uint128_t *)(idx + 64) = v17;
                    *(uint128_t *)(idx + 80) = v18;
                    *(uint128_t *)idx = v13;
                    *(uint128_t *)(idx + 16) = v14;
                }
                if (a2 && !(unsigned int)v37)
                    *(unsigned long *)a2 = v11;
                return v37;
            }
        }
    }
    v48 = v42 + iter;
    if (!(unsigned int)v37)
        goto LABEL_ce08c;
    goto LABEL_ce200;
}
