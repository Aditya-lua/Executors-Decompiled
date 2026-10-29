/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9defb0..0x9df71c (1900 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9defb0_0 {
    unsigned long long field_0;
    uint128_t field_8;
    uint128_t field_18;
} st_9defb0_0;

typedef struct st_9defb0_1 {
    struct st_9defb0_0 *field_0;
    int field_8;
} st_9defb0_1;

extern char g_10002b0;

unsigned int sub_9defb0(long long a0, long long a1, long long a2, st_9defb0_1 *a3, long long a4, long long a5)
{
    long long v7;  // x20
    long long v8;  // x28
    unsigned int *node;  // x28
    unsigned int v18;  // w21
    unsigned int v19;  // w21
    unsigned int v20;  // x0
    unsigned long v21;  // x27
    st_9defb0_1 *v22;  // x27
    st_9defb0_1 *v23;  // x24
    st_9defb0_0 *v24;  // x8
    st_9defb0_0 *v25;  // x9
    unsigned int v26;  // x10
    unsigned int v9;  // x0
    unsigned long long v27;  // x11
    unsigned long long v28;  // x12
    uint128_t *iter;  // x13
    uint128_t *iter1;  // x14
    unsigned long long i;  // x15
    unsigned int v32;  // x15
    uint128_t v33;  // q1
    unsigned long long v35;  // x11
    unsigned long long *iter2;  // x9
    unsigned int v10;  // w0
    unsigned long long *v37;  // x8
    unsigned long long j;  // x10
    unsigned int v39;  // x10
    st_9defb0_1 *v42;  // x8
    unsigned int v43;  // x24
    unsigned long v44;  // x25
    unsigned int v45;  // w26
    unsigned long long v46;  // 4118
    unsigned int v11;  // w25
    unsigned int v47;  // w0
    unsigned int v48;  // x27
    unsigned int v49;  // x10
    unsigned int v50;  // w0
    unsigned int v51;  // w10
    unsigned int v52;  // x8
    unsigned long v53;  // cc_dep1
    unsigned long long v54;  // 4109
    unsigned long long v55;  // 4109
    unsigned int v56;  // w0
    long long v12;  // x0
    unsigned int v57;  // w10
    unsigned long v58;  // cc_dep1
    unsigned int v59;  // x27
    unsigned long long v60;  // 4108
    unsigned long long v61;  // 4108
    unsigned int v62;  // w0
    unsigned int v63;  // w10
    unsigned long v64;  // cc_dep1
    unsigned int v65;  // x27
    unsigned long long v66;  // 4109
    long long v13;  // x24
    unsigned long long v67;  // 4109
    unsigned int v68;  // w0
    unsigned int v69;  // w10
    unsigned long v70;  // cc_dep1
    unsigned long long v71;  // 4108
    unsigned long long v72;  // 4108
    unsigned int v73;  // x24
    unsigned int v74;  // x26
    unsigned int v75;  // x20
    unsigned long v76;  // x8
    unsigned int v14;  // x21
    unsigned long long v78;  // 4131
    long long v15;  // x28
    unsigned int v16;  // w28
    unsigned int v0;  // [bp-0x184]
    st_9defb0_1 *v1;  // [bp-0x178]
    unsigned int v2;  // [bp-0x170]
    unsigned int v3;  // [bp-0x168]
    unsigned long v4;  // [bp-0x70]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v7 = a5;
    v8 = a1;
    v4 = *(long long *)&g_10002b0;
    if (!sub_9e5c70(a3))
    {
        sub_a368c8();
        sub_a369bc("crypto/bn/bn_exp.c", 327, "BN_mod_exp_mont");
        sub_a36abc(3, 0x66, 0);
        v9 = 0;
    }
    else if (0x100000 > a3->field_8 && (sub_9e48c8(a2, 4) || sub_9e48c8(v8, 4) || sub_9e48c8(a3, 4)))
    {
        v9 = sub_9dfcdc(a0, v8, a2, a3, a4, v7);
        if (v9)
        {
            sub_9e5708(a0);
            v9 = 1;
        }
    }
    else
    {
        v10 = sub_9e46a8(a2);
        if (v10)
        {
            v11 = v10;
            sub_9de064(a4);
            v12 = sub_9de208(a4);
            v1 = sub_9de208(a4);
            v2 = sub_9de208(a4);
            if (!v2)
            {
                v9 = 0;
                v14 = 0;
                if (v7)
                    goto LABEL_9df6c0;
                goto LABEL_9df6b8;
            }
            v13 = v2;
            v14 = v7;
            if (!v14 && (v14 = sub_9e6c04(), !v14 || !sub_9e6cc0(v14, a3, a4)))
            {
                v9 = 0;
                goto LABEL_9df6b8;
            }
            if (!*(int *)(v8 + 16) && !(v15 = v8, !(sub_9e53a8(v15, a3) >> 31 & 1)) || (v15 = v13, sub_9e5dac(v15, v8, a3, a4)))
            {
                if (!sub_9e6bf4(v13, v15, v14, a4))
                    goto LABEL_9df6b0;
                if ((int)v11 > 671)
                {
                    v16 = 6;
                    goto LABEL_9df210;
                }
                if ((int)v11 > 239)
                {
                    v16 = 5;
                    goto LABEL_9df210;
                }
                if ((int)v11 > 79)
                {
                    v16 = 4;
                    goto LABEL_9df210;
                }
                if ((int)v11 >= 24)
                {
                    v16 = 3;
LABEL_9df210:
                    if (sub_9e671c(v12, v13, v13, v14, a4))
                    {
                        v0 = v16;
                        node = &v3;
                        v18 = 2;
                        while (1)
                        {
                            v19 = v18;
                            v20 = sub_9de208(a4);
                            *(unsigned long long *)node = v20;
                            if (!v20 || !sub_9e671c())
                                break;
                            node += 2;
                            v18 = v19 + 1;
                            if (v19 >> ((char)(v16 - 1) & 31))
                                goto LABEL_9df2a8;
                        }
                        v9 = 0;
                        if (v7)
                            goto LABEL_9df6c0;
                        goto LABEL_9df6b8;
                    }
                    goto LABEL_9df6b0;
                }
                v0 = 1;
LABEL_9df2a8:
                v21 = a3->field_8;
                if (*(long long *)((char *)&(&a3->field_0->field_0)[v21] - 8) >= 0)
                {
                    v22 = v1;
                    if (sub_9e6bf4(v22, sub_9e4624(), v14, a4))
                        goto LABEL_9df398;
                    goto LABEL_9df6b0;
                }
                v23 = v1;
                if (!sub_9e4cdc(v23, v21))
                    goto LABEL_9df6b0;
                v24 = a3->field_0;
                v25 = v23->field_0;
                v25->field_0 = -v24->field_0;
                if ((int)v21 >= 2)
                {
                    v26 = 1;
                    if ((unsigned int)v21 >= 5 && v25 - v24 >= 32)
                    {
                        v27 = v21 - 1;
                        v28 = v27 & 0xfffffffffffffffc;
                        v26 = v28 | 1;
                        iter = (char *)&v24->field_8 + 8;
                        iter1 = (char *)&v25->field_8 + 8;
                        i = v28;
                        do
                        {
                            v32 = i;
                            v33 = *iter;
                            *(int128_t *)((char *)iter1 - 16) = ~*(int128_t *)((char *)iter - 16);
                            *iter1 = ~v33;
                            iter += 2;
                            iter1 += 2;
                            i = v32 - 4;
                        } while (i);
                        if (v27 == v28)
                            goto LABEL_9df38c;
                    }
                    v35 = v26 * 8;
                    iter2 = (char *)v25 + v35;
                    v37 = (char *)v24 + v35;
                    j = v21 - v26;
                    do
                    {
                        v39 = j;
                        *iter2 = ~*v37;
                        iter2 += 1;
                        v37 += 1;
                        j = v39 - 1;
                    } while (j);
                }
LABEL_9df38c:
                v42 = v1;
                v42->field_8 = v21;
                v22 = v42;
LABEL_9df398:
                v43 = 0;
                v44 = v11 - 1;
                v45 = 1;
                while (1)
                {
                    while (!sub_9e5748(a2, v44))
                    {
                        if (v43 & 1 && !sub_9e671c(v22, v22, v22, v14, a4))
                            goto LABEL_9df6b0;
                        v46 = arm64g_calculate_condition(1, (unsigned int)v44 - 1, 1, 0);
                        if (v46 & 1)
                            goto LABEL_9df68c;
                    }
                    if (v0 <= 1)
                    {
                        v48 = 0;
                        v73 = 0;
                        goto LABEL_9df528;
                    }
                    if ((int)v44 >= 1)
                    {
                        v47 = sub_9e5748(a2);
                        v48 = v47 != 0;
                        if (v47)
                            v49 = 3;
                        else
                            v49 = 1;
                        if ((unsigned int)v44 != 1)
                        {
                            v50 = sub_9e5748(a2, (unsigned int)v44 - 2);
                            v51 = v49;
                            if (v47)
                                v52 = 1;
                            else
                                v52 = 2;
                            v53 = v50;
                            if (!v50)
                            {
                                v48 &= 1;
                                v54 = arm64g_calculate_condition(3, v53, 0, 0);
                                if (!(v54 & 1))
                                    goto LABEL_9df456;
                                goto LABEL_9df455;
                            }
                            else
                            {
                                v48 = 2;
                                v55 = arm64g_calculate_condition(3, v53, 0, 0);
                                if (v55 & 1)
                                {
LABEL_9df455:
                                    v49 = v51;
                                    goto LABEL_9df458;
                                }
                                else
                                {
LABEL_9df456:
                                    v49 = (v51 << (v52 & 31)) + 1;
LABEL_9df458:
                                    if (v0 != 3 && (int)v44 >= 3)
                                    {
                                        v56 = sub_9e5748(a2);
                                        v57 = v49;
                                        v58 = v56;
                                        if (!v56)
                                        {
                                            v59 = v48 & 0xffffffff;
                                            v60 = arm64g_calculate_condition(3, v58, 0, 0);
                                            if (!(v60 & 1))
                                                goto LABEL_9df492;
                                            goto LABEL_9df491;
                                        }
                                        else
                                        {
                                            v59 = 3;
                                            v61 = arm64g_calculate_condition(3, v58, 0, 0);
                                            if (v61 & 1)
                                            {
LABEL_9df491:
                                                v49 = v57;
                                                goto LABEL_9df494;
                                            }
                                            else
                                            {
LABEL_9df492:
                                                v49 = v57 << (((char)v48 ^ 3) & 31) | 1;
LABEL_9df494:
                                                v48 = v59;
                                                if (v0 != 4 && (v48 = v59, (unsigned int)v44 != 3))
                                                {
                                                    v62 = sub_9e5748(a2, (unsigned int)v44 - 4);
                                                    v63 = v49;
                                                    v64 = v62;
                                                    if (!v62)
                                                    {
                                                        v65 = v59 & 0xffffffff;
                                                        v66 = arm64g_calculate_condition(3, v64, 0, 0);
                                                        if (!(v66 & 1))
                                                            goto LABEL_9df4ce;
                                                        goto LABEL_9df4cd;
                                                    }
                                                    else
                                                    {
                                                        v65 = 4;
                                                        v67 = arm64g_calculate_condition(3, v64, 0, 0);
                                                        if (v67 & 1)
                                                        {
LABEL_9df4cd:
                                                            v49 = v63;
                                                            goto LABEL_9df4d0;
                                                        }
                                                        else
                                                        {
LABEL_9df4ce:
                                                            v49 = (v63 << ((char)(4 - v59) & 31)) + 1;
LABEL_9df4d0:
                                                            v48 = v65;
                                                            if (v0 != 5 && (v48 = v65, (int)v44 >= 5))
                                                            {
                                                                v68 = sub_9e5748(a2);
                                                                v69 = v49;
                                                                v70 = v68;
                                                                if (!v68)
                                                                {
                                                                    v48 = v65 & 0xffffffff;
                                                                    v71 = arm64g_calculate_condition(3, v70, 0, 0);
                                                                    if (!(v71 & 1))
                                                                        goto LABEL_9df50a;
                                                                    goto LABEL_9df509;
                                                                }
                                                                else
                                                                {
                                                                    v48 = 5;
                                                                    v72 = arm64g_calculate_condition(3, v70, 0, 0);
                                                                    if (v72 & 1)
                                                                    {
LABEL_9df509:
                                                                        v49 = v69;
                                                                        goto LABEL_9df50c;
                                                                    }
                                                                    else
                                                                    {
LABEL_9df50a:
                                                                        v49 = v69 << ((char)(5 - v65) & 31) | 1;
LABEL_9df50c:
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    else
                    {
                        v48 = 0;
                        v49 = 1;
                    }
                    v73 = (long long)(v49 * 0x100000000) >> 63 & 0xffffffff80000000 | __ROL__(v49, 63) & 0x800000007fffffff & 0x7fffffff;
LABEL_9df528:
                    if (!(v45 & 1) && 0 <= (int)v48)
                        break;
LABEL_9df654:
                    if (!sub_9e671c(v1, v1, *(long long *)&(&v2)[2 * v73], v14, a4))
                        goto LABEL_9df6b0;
                    v45 = 0;
                    v76 = ~v48;
                    v43 = 1;
                    v22 = v1;
                    v78 = arm64g_calculate_condition(81, v76 & 0xffffffff, v44 & 0xffffffff, 0);
                    v44 += v76;
                    if (!(v78 & 1))
                    {
LABEL_9df68c:
                        v9 = sub_9e6ae4(a0, v22, v14, a4) != 0;
                        if (v7)
                            goto LABEL_9df6c0;
                        goto LABEL_9df6b8;
                    }
                }
                if (!sub_9e671c(v1, v1, v1, v14, a4))
                    goto LABEL_9df6b0;
                if (!v48)
                    goto LABEL_9df654;
                if (!sub_9e671c(v1, v1, v1, v14, a4))
                    goto LABEL_9df6b0;
                if (v48 == 1)
                    goto LABEL_9df654;
                if (!sub_9e671c(v1, v1, v1, v14, a4))
                    goto LABEL_9df6b0;
                if (v48 == 2)
                    goto LABEL_9df654;
                if (!sub_9e671c(v1, v1, v1, v14, a4))
                    goto LABEL_9df6b0;
                if (v48 == 3)
                    goto LABEL_9df654;
                if (!sub_9e671c(v1, v1, v1, v14, a4))
                    goto LABEL_9df6b0;
                if (v48 == 4)
                    goto LABEL_9df654;
                if (!sub_9e671c(v1, v1, v1, v14, a4))
                    goto LABEL_9df6b0;
                if (v48 == 5)
                    goto LABEL_9df654;
                v74 = v7;
                v75 = v14;
                if (sub_9e671c(v1, v1, v1, v14, a4))
                {
                    v14 = v75;
                    v7 = v74;
                    if (sub_9e671c(v1, v1, v1, v75, a4))
                        goto LABEL_9df654;
                    goto LABEL_9df6b0;
                }
                else
                {
                    v9 = 0;
                    v14 = v75;
                    if (!v74)
                    {
LABEL_9df6b8:
                        sub_9e6c64(v14);
                        goto LABEL_9df6c0;
                    }
                }
            }
            else
            {
LABEL_9df6b0:
                v9 = 0;
                if (v7)
                    goto LABEL_9df6c0;
                goto LABEL_9df6b8;
            }
LABEL_9df6c0:
            sub_9de17c(a4);
        }
        else if (sub_9e5b58(a3, 1))
        {
            sub_9e5b4c(a0);
            v9 = 1;
        }
        else if (*(long long *)&g_10002b0 != v4)
        {
            ___stack_chk_fail();
        }
    }
    if (*(long long *)&g_10002b0 == v4)
        return v9;
    ___stack_chk_fail();
}
