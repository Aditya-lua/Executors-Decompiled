/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa47458..0xa47b7c (1828 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a47458_0 {
    char padding_0[120];
    void* field_78;
} st_a47458_0;

extern long long g_def0e0;
extern char g_10002b0;

unsigned long long sub_a47458(st_a47458_0 *a0, unsigned long long a1, unsigned long long a2, unsigned long long a3)
{
    unsigned long long v9;  // x19
    unsigned long long node;  // x24
    void* v19;  // x25
    uint128_t *v20;  // x26
    unsigned long long v21;  // x8
    uint128_t *v22;  // x9
    uint128_t v23;  // q0
    uint128_t v24;  // q1
    uint128_t v25;  // q0
    uint128_t v26;  // q1
    unsigned long long v27;  // x12
    double *v28;  // x9
    unsigned long long iter;  // x22
    unsigned long long *iter1;  // x10
    unsigned long long *iter2;  // x11
    unsigned long long v31;  // x12
    unsigned long v33;  // d0
    unsigned long long v35;  // 4124
    unsigned long long i;  // x9
    char *v37;  // x10
    char *v38;  // x11
    void* v12;  // x20
    char *v39;  // x8
    unsigned long long v40;  // x9
    char v42;  // x12
    unsigned long long v44;  // x8
    uint128_t v45;  // q0
    uint128_t v46;  // q1
    uint128_t *v47;  // x9
    uint128_t v48;  // q3
    unsigned long long v13;  // x23
    uint128_t v49;  // q0
    uint128_t v50;  // q1
    uint128_t v51;  // q3
    unsigned long long v52;  // x12
    double *v53;  // x9
    unsigned long long *v54;  // x10
    unsigned long long *v55;  // x11
    unsigned long long v56;  // x12
    uint128_t v57;  // q0
    unsigned long v58;  // d1
    unsigned long long v14;  // 4106
    unsigned long long v60;  // 4124
    unsigned long long j;  // x9
    char *v62;  // x10
    char *v63;  // x11
    char *v64;  // x8
    unsigned long long v65;  // x9
    char v66;  // x12
    long long v68;  // x28
    unsigned long long v15;  // x9
    unsigned long long v69;  // x26
    uint128_t *v70;  // x28
    uint128_t *v71;  // x22
    unsigned long long v72;  // x1
    unsigned long long v73;  // x0
    void* v74;  // x25
    void* v75;  // x25
    unsigned long long v76;  // 4127
    unsigned long long v77;  // 4114
    unsigned long long v78;  // x25
    uint128_t *v16;  // x0
    unsigned long long v79;  // w26
    void* v80;  // x25
    unsigned long long v81;  // w0
    uint128_t *v17;  // x27
    void* v18;  // x25
    unsigned long long v0;  // [bp-0x130]
    void* v1;  // [bp-0x128]
    uint128_t *v2;  // [bp-0x120]
    uint128_t *v3;  // [bp-0x118]
    uint128_t v4[8];  // [bp-0x110]
    char v5;  // [bp-0xd0]
    unsigned long v6;  // [bp-0x70]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v9 = a3;
    node = a2;
    iter = a1;
    v6 = *(long long *)&g_10002b0;
    v12 = a0->field_78;
    v13 = (long long)v12[200];
    if ((int)v12[188])
    {
LABEL_a474a8:
        if (!node)
        {
            v79 = v13 == v9;
            if ((int)v12[184])
            {
LABEL_a476f4:
                if ((long long)v12[168] & 15)
                    sub_aa4dc0(v12 + 208, &g_def0e0, 16 - ((long long)v12[168] & 15));
                *(unsigned int *)&v12[184] = 0;
            }
LABEL_a4771c:
            if ((long long)v12[176] & 15)
                sub_aa4dc0(v12 + 208, &g_def0e0, 16 - ((long long)v12[176] & 15));
            sub_aa4dc0(v12 + 208, v12 + 168, 16);
            v80 = v12 + 132;
            sub_aa4e98();
            *(unsigned int *)&v12[188] = 0;
            v81 = (unsigned int)sub_a50720(a0);
            if (!node || v79 & 1)
            {
                if (!v81 && sub_a66f20(v4, v80, (int)v12[192]))
                    goto LABEL_a47b38;
            }
            else
            {
                if (v81)
                {
                    *(int128_t *)iter = *(int128_t *)v80;
                }
                else
                {
                    if (sub_a66f20(v4, node, 16))
                    {
                        v73 = iter - v13;
                        v72 = v13;
                        goto LABEL_a47b34;
                    }
                    else
                    {
                        if (*(long long *)&g_10002b0 == v6)
                            return v9;
                        ___stack_chk_fail();
                    }
                }
            }
        }
        else if (iter)
        {
            if ((int)v12[184])
            {
                if ((long long)v12[168] & 15)
                    sub_aa4dc0(v12 + 208, &g_def0e0, 16 - ((long long)v12[168] & 15));
                *(unsigned int *)&v12[184] = 0;
            }
            *(unsigned long long *)&v12[200] = 0xffffffffffffffff;
            v77 = arm64g_calculate_condition(2, v13, 1, 0);
            v78 = v9;
            if (v77 & 1 || !(v78 = v13, v13 + 16 != v9))
            {
                if (sub_a50720(a0))
                {
                    sub_a46fec(a0, iter, node, v78);
                    sub_aa4dc0(v12 + 208, iter, v78);
                }
                else
                {
                    sub_aa4dc0(v12 + 208, node, v78);
                    sub_a46fec(a0, iter, node, v78);
                }
                *(unsigned long long *)&v12[176] = (long long)v12[176] + v78;
                if (v78 == v9)
                {
                    if (*(long long *)&g_10002b0 == v6)
                        return v9;
                    ___stack_chk_fail();
                }
                v79 = 0;
                iter += v78;
                node += v78;
                v13 = v78;
                if ((int)v12[184])
                    goto LABEL_a476f4;
                goto LABEL_a4771c;
            }
            goto LABEL_a47b38;
        }
        else
        {
            sub_aa4dc0(v12 + 208, node, v9);
            *(unsigned long long *)&v12[168] = (long long)v12[168] + v9;
            *(unsigned int *)&v12[184] = 1;
        }
    }
    else
    {
        if (!iter || (v14 = arm64g_calculate_condition(2, v13, 1, 0), v14 & 1))
        {
            v74 = v12;
            *(unsigned int *)&v74[32] = 0;
            v75 = v74 + 32;
            sub_9f0720(v12 + 48, &g_def0e0, 64, v12, v75);
            sub_aa4d60(v12 + 208, v12 + 48);
            *(unsigned int *)v75 = 1;
            *(unsigned int *)&v12[112] = 0;
            *(unsigned long long *)&v12[168] = 0;
            *(unsigned long long *)&v12[176] = 0;
            *(unsigned int *)&v12[188] = 1;
            v76 = arm64g_calculate_condition(2, v13, 1, 0);
            if (!(v76 & 1))
            {
                sub_aa4dc0(v12 + 208, v12 + 148, 13);
                *(unsigned long long *)&v12[168] = 13;
                *(unsigned int *)&v12[184] = 1;
                goto LABEL_a474a8;
            }
        }
        if (v13 + 16 != v9)
            goto LABEL_a47b38;
        v15 = -(unsigned int)v4 & 15;
        v16 = (char *)v4 + v15;
        v17 = v16 + 4;
        v18 = v12;
        *(unsigned int *)&v18[32] = 0;
        v19 = v18 + 32;
        v3 = v16;
        if (64 >= v13)
        {
            v0 = v15;
            v20 = v16 + 3;
            sub_9f0720(v16, &g_def0e0, 128, v12, v19);
            v1 = v19;
            sub_aa4d60(v19 + 176, v16);
            *(unsigned int *)&v12[112] = 0;
            v2 = v20;
            *v20 = (int128_t)v12[148];
            *(unsigned long long *)&v12[168] = 13;
            *(unsigned long long *)&v12[176] = v13;
            if (sub_a50720(a0))
            {
                if (v13)
                {
                    v21 = 0;
                    if (v13 >= 8 && iter - node >= 32)
                    {
                        if (32 > v13)
                        {
                            v21 = 0;
LABEL_a47928:
                            v27 = v21;
                            v21 = v13 & 120;
                            v28 = node + v27;
                            iter1 = &(&v5)[v27 + v0];
                            iter2 = iter + v27;
                            v31 = v27 - v21;
                            do
                            {
                                v33 = __dirty_unsupported_Iop_ZeroHI64ofV128(*(unsigned long long *)&*v28 ^ *(unsigned long long *)&*(double *)iter1);
                                *iter1 = v33;
                                iter1 += 1;
                                *iter2 = v33;
                                iter2 += 1;
                                v35 = arm64g_calculate_condition(18, v31, 8, 0);
                                v28 += 1;
                                v31 += 8;
                            } while (v35 & 1);
                            if (v13 == v21)
                                goto LABEL_a47a8c;
                        }
                        else
                        {
                            v21 = v13 & 96;
                            v22 = v3;
                            v23 = *(int128_t *)node ^ v22[4];
                            v24 = *(int128_t *)(node + 16) ^ v22[5];
                            v22[4] = v23;
                            v22[5] = v24;
                            *(uint128_t *)iter = v23;
                            *(uint128_t *)(iter + 16) = v24;
                            if (v21 != 32)
                            {
                                v25 = *(int128_t *)(node + 32) ^ v22[6];
                                v26 = *(int128_t *)(node + 48) ^ v22[7];
                                v22[6] = v25;
                                v22[7] = v26;
                                *(uint128_t *)(iter + 32) = v25;
                                *(uint128_t *)(iter + 48) = v26;
                            }
                            if (v13 == v21)
                                goto LABEL_a47a8c;
                            if (v13 & 24)
                                goto LABEL_a47928;
                        }
                    }
                    i = v13 - v21;
                    v37 = iter + v21;
                    v38 = &(&v5)[v0 + v21];
                    v39 = node + v21;
                    do
                    {
                        v40 = i;
                        v42 = *v38 ^ *v39;
                        *v38 = v42;
                        v38 += 1;
                        *v37 = v42;
                        v37 += 1;
                        v39 += 1;
                        i = v40 - 1;
                    } while (i);
                }
            }
            else
            {
                if (v13)
                {
                    v44 = 0;
                    if (v13 >= 8 && iter - node >= 32)
                    {
                        if (32 > v13)
                        {
                            v44 = 0;
LABEL_a47a04:
                            v52 = v44;
                            v44 = v13 & 120;
                            v53 = node + v52;
                            v54 = &(&v5)[v52 + v0];
                            v55 = iter + v52;
                            v56 = v52 - v44;
                            do
                            {
                                v57 = *(unsigned long long *)&*v53;
                                v53 += 1;
                                v58 = __dirty_unsupported_Iop_ZeroHI64ofV128(v57 ^ *(unsigned long long *)&*(double *)v54);
                                *v55 = v58;
                                v55 += 1;
                                *v54 = *(unsigned long long *)&v57;
                                v54 += 1;
                                v60 = arm64g_calculate_condition(18, v56, 8, 0);
                                v56 += 8;
                            } while (v60 & 1);
                            if (v13 == v44)
                                goto LABEL_a47a8c;
                        }
                        else
                        {
                            v44 = v13 & 96;
                            v45 = *(int128_t *)node;
                            v46 = *(int128_t *)(node + 16);
                            v47 = v3;
                            v48 = v47[5];
                            *(uint128_t *)iter = v45 ^ v47[4];
                            *(uint128_t *)(iter + 16) = v46 ^ v48;
                            v47[4] = v45;
                            v47[5] = v46;
                            if (v44 != 32)
                            {
                                v49 = *(int128_t *)(node + 32);
                                v50 = *(int128_t *)(node + 48);
                                v51 = v47[7];
                                *(uint128_t *)(iter + 32) = v49 ^ v47[6];
                                *(uint128_t *)(iter + 48) = v50 ^ v51;
                                v47[6] = v49;
                                v47[7] = v50;
                            }
                            if (v13 == v44)
                                goto LABEL_a47a8c;
                            if (v13 & 24)
                                goto LABEL_a47a04;
                        }
                    }
                    j = v13 - v44;
                    v62 = iter + v44;
                    v63 = &(&v5)[v0 + v44];
                    v64 = node + v44;
                    do
                    {
                        v65 = j;
                        v66 = *v64;
                        v64 += 1;
                        *v62 = *v63 ^ v66;
                        v62 += 1;
                        *v63 = v66;
                        v63 += 1;
                        j = v65 - 1;
                    } while (j);
                }
            }
LABEL_a47a8c:
            v68 = -(unsigned int)v13 & 15;
            _bzero((char *)v17 + v13, v68);
            v17 = (char *)v17 + v68 + v13;
            v69 = 128;
            v19 = v1;
            v70 = v2;
        }
        else
        {
            sub_9f0720(v16, &g_def0e0, 64, v12, v19);
            sub_aa4d60(v19 + 176, v16);
            *(unsigned int *)&v12[32] = 1;
            *(unsigned int *)&v12[112] = 0;
            sub_aa4dc0(v19 + 176, v12 + 148, 16);
            *(unsigned long long *)&v12[168] = 13;
            *(unsigned long long *)&v12[176] = v13;
            if (sub_a50720(a0))
            {
                sub_9f0720(iter, node, v13, v12, v19);
                sub_aa4dc0(v19 + 176, iter, v13);
            }
            else
            {
                sub_aa4dc0(v19 + 176, node, v13);
                sub_9f0720(iter, node, v13, v12, v19);
            }
            sub_aa4dc0(v19 + 176, &g_def0e0, -(unsigned int)v13 & 15);
            v69 = 64;
            v70 = v17;
        }
        v71 = iter + v13;
        *v17 = (int128_t)v19[0x88];
        sub_aa4dc0(v19 + 176, v70);
        sub_a66ec0(v3, v69);
        sub_aa4e98();
        *(unsigned long long *)&v12[200] = 0xffffffffffffffff;
        if (sub_a50720(a0))
        {
            *v71 = (int128_t)v12[132];
        }
        else if (sub_a66f20(v70, node + v13, 16))
        {
            v72 = v9 - 16;
            v73 = (char *)v71 - v9 + 16;
LABEL_a47b34:
            _bzero(v73, v72);
LABEL_a47b38:
            v9 = 0xffffffff;
        }
    }
    if (*(long long *)&g_10002b0 == v6)
        return v9;
    ___stack_chk_fail();
}
