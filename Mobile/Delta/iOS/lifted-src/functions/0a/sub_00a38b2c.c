/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa38b2c..0xa39100 (1492 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a38b2c_1 {
    unsigned int field_0;
    char padding_4[1538];
    uint128_t field_606;
} st_a38b2c_1;

typedef struct st_a38b2c_0 {
    char padding_0[15];
    uint128_t field_f;
} st_a38b2c_0;


unsigned int sub_a38b2c(long long a0, long long a1, unsigned long long a2)
{
    unsigned long long v13;  // x21
    long long iter;  // x19
    unsigned int v23;  // x24
    unsigned long v92;  // cc_dep1
    unsigned long v93;  // cc_dep2
    unsigned long v94;  // cc_ndep
    unsigned long long v95;  // x21
    unsigned long long v96;  // x0
    unsigned long v97;  // x19
    unsigned long v98;  // x25
    unsigned int v99;  // w8
    unsigned long v100;  // cc_op
    unsigned int v24;  // w9
    unsigned int v25;  // w8
    unsigned long v26;  // x8
    unsigned long long v27;  // x25
    unsigned long v28;  // x19
    unsigned int v29;  // x20
    unsigned int v30;  // w0
    unsigned int v31;  // w8
    unsigned int v32;  // w19
    long long v15;  // x23
    unsigned int v33;  // x26
    unsigned int v34;  // w8
    unsigned long long v35;  // x20
    unsigned int v36;  // x19
    void* v37;  // x23
    unsigned long long v38;  // x27
    unsigned long long v39;  // x24
    void* v40;  // x8
    unsigned int v41;  // x19
    void* v42;  // x21
    unsigned int idx;  // x22
    unsigned int v44;  // w0
    unsigned int v45;  // w8
    unsigned long long v46;  // 4112
    unsigned long long v47;  // 4106
    unsigned int v17;  // x27
    unsigned long long v48;  // 4112
    unsigned long long v49;  // 4106
    unsigned int v50;  // x9
    unsigned int v18;  // w9
    unsigned int v51;  // x11
    unsigned int v52;  // x10
    unsigned int v53;  // x12
    void* iter1;  // x13
    unsigned long long i;  // x14
    unsigned long long iter2;  // x15
    unsigned int v57;  // x14
    uint128_t v58;  // q1
    unsigned int v60;  // x12
    unsigned long v19;  // x8
    unsigned long long *v61;  // x13
    void* v63;  // x14
    unsigned long long v64;  // x15
    unsigned long long v67;  // 4112
    char *v68;  // x12
    unsigned long long v69;  // x10
    unsigned int v20;  // w9
    unsigned long long v71;  // 4120
    unsigned int v72;  // x8
    uint128_t *v73;  // x9
    unsigned long long j;  // x10
    unsigned long long node;  // x11
    unsigned int v76;  // x10
    unsigned int v21;  // x20
    uint128_t v77;  // q1
    unsigned long long v79;  // x11
    double *v80;  // x9
    unsigned long long *v81;  // x10
    unsigned long long v82;  // x11
    unsigned long long v85;  // 4112
    char *v86;  // x9
    unsigned int n;  // x24
    char *v87;  // x10
    unsigned long long k;  // x8
    unsigned int v89;  // x8
    st_a38b2c_1 *v0;  // [bp-0xb0]
    st_a38b2c_0 *v1;  // [bp-0xa8]
    long long v2;  // [bp-0xa0]
    long long v3;  // [bp-0x98]
    unsigned int v4;  // [bp-0x90]
    unsigned int v5;  // [bp-0x88]
    unsigned int v6;  // [bp-0x7c]
    unsigned int v7;  // [bp-0x78]
    unsigned int v8;  // [bp-0x74]
    unsigned long long v9;  // [bp-0x70]
    unsigned int v10;  // [bp-0x64]
    char *v11;  // [bp-0x10]
    char v12;  // [bp+0x0]

    v11 = &v12;
    if (!a1)
        return 0;
    v13 = a2;
    iter = a1;
    v15 = a0;
    idx = sub_975ffc();
    v17 = sub_9d500c(v15);
    if (!idx)
    {
        return 0;
    }
    else if (v17)
    {
        sub_9d3d58(v15, 15);
        if (*(int *)(idx + 16) != 2)
        {
            *(unsigned int *)(idx + 16) = 2;
            *(unsigned long long *)idx = 0;
            *(unsigned int *)(idx + 8) = 0;
            sub_a4b348(*(long long *)(idx + 32));
        }
        v18 = *(int *)idx;
        if ((int)v18 >= 1)
        {
            v19 = *(int *)(idx + 4);
            if ((int)v18 < (int)v19)
            {
                sub_a69928("assertion failed: ctx->buf_len >= ctx->buf_off", "crypto/evp/bio_b64.c", 141);
                sub_a69928("assertion failed: ctx->buf_off + i < (int)sizeof(ctx->buf)", "crypto/evp/bio_b64.c", 145);
            }
            v20 = v18 - v19;
            if ((int)v20 < (int)v13)
                v21 = v20;
            else
                v21 = v13 & 0xffffffff;
            if (1502 <= (int)(v21 + (unsigned int)v19))
                sub_a69928("assertion failed: ctx->buf_off + i < (int)sizeof(ctx->buf)", "crypto/evp/bio_b64.c", 145);
            n = v21;
            _memcpy(iter, idx + v19 + 40, n);
            iter += n;
            v23 = v21;
            v13 -= v23;
            v24 = *(int *)idx;
            v25 = *(int *)(idx + 4) + v23;
            *(unsigned int *)(idx + 4) = v25;
            if (v24 == v25)
                *(unsigned long long *)idx = 0;
        }
        else
        {
            v23 = 0;
        }
        v7 = *(int *)(idx + 24) & *(int *)(idx + 24) >> 31;
        v8 = (int)v13 > 0;
        if ((int)v13 >= 1)
        {
            v2 = v15;
            v3 = iter;
            v9 = idx + 0x606;
            v0 = idx + 16;
            v1 = idx + 1543;
            v4 = v17;
            while (1)
            {
                v6 = v13;
                v5 = v23;
                while (1)
                {
                    while (1)
                    {
                        if (*(int *)(idx + 24) < 1)
                            goto LABEL_a3909c;
                        v26 = *(int *)(idx + 8);
                        v27 = sub_9d3d84(v17, v9 + v26, 0x400 - v26);
                        if ((int)v27 >= 1)
                        {
                            v28 = *(int *)(idx + 8);
                            v29 = v27;
                        }
                        else
                        {
                            v30 = sub_9d3d68(v17, 8);
                            v28 = *(int *)(idx + 8);
                            v31 = v27;
                            if (!v30)
                            {
                                if (!(unsigned int)v28)
                                {
                                    if (0 <= (int)sub_a4b87c(*(long long *)(idx + 32), 0, &v10))
                                        v32 = v27;
                                    else
                                        v32 = 0xffffffff;
                                    sub_a4b348();
                                    v31 = v32;
                                    v28 = *(int *)(idx + 8);
                                }
                                *(unsigned int *)(idx + 24) = v31;
                            }
                            v7 = v31;
                            if (!(unsigned int)v28)
                                goto LABEL_a3909c;
                            v29 = 0;
                        }
                        v33 = v28 + v29;
                        *(unsigned int *)(idx + 8) = v33;
                        if (*(int *)(idx + 20))
                            break;
LABEL_a38df8:
                        if ((int)v27 < 1 || 0x400 <= (int)v33)
                            goto LABEL_a3900c;
                        if (!(v8 & 1))
                            goto LABEL_a3909c;
                    }
                    if (sub_9d3d68(v15, 0xffffffff) >> 8 & 1)
                        break;
                    if (!*(int *)(idx + 20))
                        goto LABEL_a38df8;
                    v10 = 0;
                    if ((int)v33 >= 1)
                    {
                        v34 = (unsigned int)v28 + v29;
                        v35 = (char *)v1 + v34 - 1;
                        v36 = v34 - 0;
                        v37 = 1543;
                        v38 = v9;
                        v39 = v38;
                        v40 = 0x606;
                        do
                        {
                            v41 = v36;
                            v42 = v40;
                            if (*(char *)v39 != 10)
                            {
                                v40 = v42;
                                continue;
                            }
                            if (*(int *)(idx + 12))
                            {
                                *(unsigned int *)(idx + 12) = 0;
                                v40 = v37;
                                continue;
                            }
                            v44 = sub_a4b358(*(long long *)(idx + 32), idx + 40, &v10, v38, v37 - v42);
                            sub_a4b348(*(long long *)(idx + 32));
                            v45 = v10;
                            if ((int)v44 <= 0)
                            {
                                v46 = arm64g_calculate_condition(v100 | 208, v92, v93, v94);
                                v40 = v37;
                                v47 = arm64g_calculate_condition(3, (v46 & 1 ? v45 : 0), 0, 0);
                                if (v47 & 1)
                                    continue;
                                goto LABEL_a38f2c;
                            }
                            else
                            {
                                v48 = arm64g_calculate_condition(v100 | 208, v92, v93, v94);
                                v40 = v37;
                                v49 = arm64g_calculate_condition(0, (v48 & 1 ? v45 : 0), 0, 0);
                                if (!(v49 & 1))
                                {
LABEL_a38f2c:
                                    *(unsigned int *)(idx + 20) = 0;
                                    v23 = v5;
                                    v15 = v2;
                                    if (v42 != 0x606 && (v33 = (unsigned int)(v33 - v42) + 0x606, v23 = v5, v15 = v2, (int)v33 >= 1))
                                    {
                                        v72 = 0;
                                        if (v33 >= 8 && v9 - v38 >= 32)
                                        {
                                            if (32 > v33)
                                            {
                                                v72 = 0;
                                            }
                                            else
                                            {
                                                v72 = v33 & 0x7fffffe0;
                                                v73 = v38 + 16;
                                                j = v72;
                                                node = v9;
                                                do
                                                {
                                                    v76 = j;
                                                    v77 = *v73;
                                                    *(int128_t *)node = *(int128_t *)((char *)v73 - 16);
                                                    *(uint128_t *)(node + 16) = v77;
                                                    node += 32;
                                                    v73 += 2;
                                                    j = v76 - 32;
                                                } while (j);
                                                v23 = v5;
                                                v15 = v2;
                                                if (v72 == v33)
                                                    goto LABEL_a39000;
                                                if (!(v33 & 24))
                                                    goto LABEL_a38fe0;
                                            }
                                            v79 = v72;
                                            v72 = v33 & 0x7ffffff8;
                                            v80 = v38 + v79;
                                            v81 = v9 + v79;
                                            v82 = v79 - v72;
                                            do
                                            {
                                                *(double *)v81 = *v80;
                                                v81 += 1;
                                                v85 = arm64g_calculate_condition(18, v82, 8, 0);
                                                v80 += 1;
                                                v82 += 8;
                                            } while (v85 & 1);
                                            v23 = v5;
                                            v15 = v2;
                                            if (v72 == v33)
                                                goto LABEL_a39000;
                                        }
LABEL_a38fe0:
                                        v86 = v9 + v72;
                                        v87 = v38 + v72;
                                        k = v33 - v72;
                                        do
                                        {
                                            v89 = k;
                                            *v86 = *v87;
                                            v86 += 1;
                                            k = v89 - 1;
                                            v87 += 1;
                                            v23 = v5;
                                            v15 = v2;
                                        } while (k);
                                        goto LABEL_a39000;
                                    }
                                    goto LABEL_a39000;
                                }
                            }
                        } while ((v38 = idx + v40, v37 += 1, v36 = v41 - 1, v39 += 1, v41 != 1));
                        v15 = v2;
                        v23 = v5;
                        if (!*(int *)(idx + 20))
                            break;
                        if (v40 == 0x606)
                        {
                            v13 = v6;
                            v17 = v4;
                            if (v33 == 0x400)
                            {
                                v50 = 0;
                                *(unsigned int *)(idx + 12) = 1;
                                goto LABEL_a38c78;
                            }
                        }
                        else
                        {
                            if (v38 == v35)
                            {
                                v50 = 0;
                                goto LABEL_a38c70;
                            }
                            v50 = v35 - v38;
                            if ((int)v50 < 1)
                            {
LABEL_a38c70:
                                v13 = v6;
                                v17 = v4;
                            }
                            else
                            {
                                v51 = 0;
                                v52 = v50 & 0x7fffffff;
                                if (v52 >= 8)
                                {
                                    v13 = v6;
                                    v17 = v4;
                                    if (v40 - 1511 < 32)
                                        goto LABEL_a38f0c;
                                    if (32 > v52)
                                    {
                                        v51 = 0;
                                        goto LABEL_a38ed8;
                                    }
                                    v53 = v50 & 31;
                                    v51 = v52 - v53;
                                    iter1 = v0 + v40;
                                    i = v51;
                                    iter2 = v9;
                                    do
                                    {
                                        v57 = i;
                                        v58 = *(int128_t *)iter1;
                                        *(int128_t *)iter2 = *(int128_t *)((char *)iter1 - 16);
                                        *(uint128_t *)(iter2 + 16) = v58;
                                        iter2 += 32;
                                        iter1 += 32;
                                        i = v57 - 32;
                                    } while (i);
                                    if (v53)
                                    {
                                        if (v53 < 8)
                                            goto LABEL_a38f0c;
LABEL_a38ed8:
                                        v60 = v50 & 7;
                                        v61 = v9 + v51;
                                        v63 = idx + v51 + v40;
                                        v64 = v51 + v60 - v52;
                                        do
                                        {
                                            *(double *)v61 = *(double *)v63;
                                            v61 += 1;
                                            v67 = arm64g_calculate_condition(18, v64, 8, 0);
                                            v63 += 8;
                                            v64 += 8;
                                        } while (v67 & 1);
                                        v51 = v52 - v60;
                                        if (v60)
                                            goto LABEL_a38f0c;
                                    }
                                }
                                else
                                {
                                    v13 = v6;
                                    v17 = v4;
LABEL_a38f0c:
                                    v68 = (char *)(idx + v51);
                                    v69 = v51 - v52;
                                    do
                                    {
                                        v68[0x606] = *(char *)(v68 + v40);
                                        v68 += 1;
                                        v71 = arm64g_calculate_condition(50, v69, 1, 0);
                                        v69 += 1;
                                    } while (v71 & 1);
                                }
                            }
LABEL_a38c78:
                            *(unsigned int *)(idx + 8) = v50;
                        }
                    }
                    if (!((int)v27 > 0 & v8 & 1))
                        goto LABEL_a3909c;
                }
LABEL_a39000:
                *(unsigned int *)(idx + 8) = 0;
                v13 = v6;
                v17 = v4;
LABEL_a3900c:
                v95 = v13;
                v96 = sub_a4b358(*(long long *)(idx + 32), idx + 40, idx, v9, v33);
                *(unsigned int *)(idx + 24) = v96;
                *(unsigned int *)(idx + 4) = 0;
                *(unsigned int *)(idx + 8) = 0;
                if (!(v96 >> 31 & 1))
                {
                    if (*(int *)idx < (int)v95)
                        v97 = *(int *)idx;
                    else
                        v97 = v95 & 0xffffffff;
                    v98 = (int)v97;
                    _memcpy();
                    *(unsigned int *)(idx + 4) = v97;
                    if ((unsigned int)v97 == *(int *)idx)
                        *(unsigned long long *)idx = 0;
                    v23 += v97;
                    v3 += v98;
                    v13 = v95 - v98;
                    v8 = (int)v95 > (int)v98;
                    if ((int)v98 >= (int)v95)
                        break;
                }
                else
                {
                    if (!*(int *)(idx + 20))
                        v99 = v96;
                    else
                        v99 = 0;
                    v7 = v99;
                    *(unsigned int *)idx = 0;
                    break;
                }
            }
        }
LABEL_a3909c:
        sub_9d5054(v15);
        if (v23)
            return v23 & 0xffffffff;
        return v7;
    }
    else
    {
        return 0;
    }
}
