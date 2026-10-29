/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9df71c..0x9dfcdc (1472 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

unsigned long long sub_9df71c(unsigned long long a0, long long a1, unsigned long long a2, long long a3, long long a4)
{
    unsigned long long v6;  // x21
    unsigned long long v7;  // w0
    unsigned long long v16;  // w27
    unsigned long long v17;  // x0
    unsigned long long v18;  // x0
    unsigned long long v19;  // x23
    unsigned long v20;  // x22
    unsigned long long v21;  // w26
    unsigned long long v22;  // 4119
    unsigned long long v23;  // w0
    unsigned long long v24;  // x27
    unsigned long long v25;  // x25
    unsigned long long v8;  // w26
    unsigned long long v26;  // w0
    unsigned long long v27;  // x8
    unsigned long v28;  // cc_dep1
    unsigned long long v29;  // 4109
    unsigned long long v30;  // 4109
    unsigned long long v31;  // w0
    unsigned long v32;  // cc_dep1
    unsigned long long v33;  // x27
    unsigned long long v34;  // 4108
    unsigned long long v35;  // 4108
    long long v9;  // x22
    unsigned long long v36;  // w0
    unsigned long v37;  // cc_dep1
    unsigned long long v38;  // x27
    unsigned long long v39;  // 4109
    unsigned long long v40;  // 4109
    unsigned long long v41;  // w0
    unsigned long v42;  // cc_dep1
    unsigned long long v43;  // 4108
    unsigned long long v44;  // 4108
    unsigned long long v45;  // x23
    long long v10;  // x1
    unsigned long v46;  // x9
    unsigned long long v48;  // 4128
    unsigned long long v11;  // x8
    unsigned long long v12;  // w24
    unsigned long long v13;  // w8
    unsigned long long *iter;  // x25
    unsigned long long v15;  // w27
    char v0;  // [bp-0x1b0]
    unsigned long long v1;  // [bp-0x170]
    unsigned long long v2;  // [bp-0x168]
    unsigned long v3;  // [bp-0x70]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v6 = a2;
    v3 = *(long long *)&g_10002b0;
    if (sub_9e48c8(a2, 4) || sub_9e48c8(a1, 4) || sub_9e48c8(a3, 4))
    {
        sub_a368c8();
        sub_a369bc("crypto/bn/bn_exp.c", 183, "BN_mod_exp_recp");
        sub_a36abc(3, 0xc0101, 0);
        v11 = 0;
    }
    else
    {
        v7 = (unsigned int)sub_9e46a8(v6);
        if (v7)
        {
            v8 = v7;
            sub_9e986c(&v0);
            sub_9de064(a4);
            v9 = sub_9de208(a4);
            v1 = sub_9de208(a4);
            if (v1)
            {
                if (*(int *)(a3 + 16))
                {
                    if (sub_9e4c34(v9, a3))
                    {
                        *(unsigned int *)(v9 + 16) = 0;
                        v10 = v9;
                        goto LABEL_9df88c;
                    }
                }
                else
                {
                    v10 = a3;
LABEL_9df88c:
                    if ((int)sub_9e98ec(&v0, v10, a4) >= 1 && sub_9e5dac(v1, a1, a3, a4))
                    {
                        if (sub_9e4828(v1))
                        {
                            sub_9e5b4c(a0);
                            v11 = 1;
                            goto LABEL_9dfcbc;
                        }
                        if (v8 > 671)
                        {
                            v12 = 6;
                            goto LABEL_9df950;
                        }
                        v13 = v8;
                        if (v8 > 239)
                        {
                            v12 = 5;
                            goto LABEL_9df950;
                        }
                        if (v13 > 79)
                        {
                            v12 = 4;
                            goto LABEL_9df950;
                        }
                        else
                        {
                            if (v13 >= 24)
                            {
                                v12 = 3;
LABEL_9df950:
                                if (sub_9e9948(v9, v1, v1, &v0, a4))
                                {
                                    iter = &v2;
                                    v15 = 2;
                                    do
                                    {
                                        v16 = v15;
                                        v17 = sub_9de208(a4);
                                        *iter = v17;
                                        if (!v17 || !sub_9e9948())
                                            goto LABEL_9dfcb8;
                                    } while ((iter += 1, v15 = v16 + 1, !(v16 >> ((char)(v12 - 1) & 31))));
                                    goto LABEL_9df9bc;
                                }
                            }
                            else
                            {
                                v12 = 1;
LABEL_9df9bc:
                                if (a0 != v6 || (v18 = sub_9de208(a4), v18 && !(v6 = v18, !sub_9e4c34())))
                                {
                                    if (sub_9e4d58(a0, 1))
                                    {
                                        v19 = 0;
                                        v20 = v8 - 1;
                                        v21 = 1;
                                        while (1)
                                        {
                                            if (!sub_9e5748(v6, v20))
                                            {
                                                if (v19 & 1 && !sub_9e9948(a0, a0, a0, &v0, a4))
                                                    break;
                                                v20 = (unsigned int)v20 - 1;
                                                v11 = 1;
                                                v22 = arm64g_calculate_condition(1, v20 & 0xffffffff, 1, 0);
                                                if (v22 & 1)
                                                    goto LABEL_9dfcbc;
                                            }
                                            else
                                            {
                                                if (v12 <= 1)
                                                {
                                                    v24 = 0;
                                                    v45 = 0;
                                                    goto LABEL_9dfb44;
                                                }
                                                if ((int)v20 >= 1)
                                                {
                                                    v23 = (unsigned int)sub_9e5748(v6);
                                                    v24 = v23 != 0;
                                                    if (v23)
                                                        v25 = 3;
                                                    else
                                                        v25 = 1;
                                                    if ((unsigned int)v20 != 1)
                                                    {
                                                        v26 = (unsigned int)sub_9e5748(v6, (unsigned int)v20 - 2);
                                                        if (v23)
                                                            v27 = 1;
                                                        else
                                                            v27 = 2;
                                                        v28 = v26;
                                                        if (!v26)
                                                        {
                                                            v24 &= 1;
                                                            v29 = arm64g_calculate_condition(3, v28, 0, 0);
                                                            if (!(v29 & 1))
                                                                goto LABEL_9dfa8a;
                                                            goto LABEL_9dfa89;
                                                        }
                                                        else
                                                        {
                                                            v24 = 2;
                                                            v30 = arm64g_calculate_condition(3, v28, 0, 0);
                                                            if (v30 & 1)
                                                            {
LABEL_9dfa89:
                                                                v25 &= 0xffffffff;
                                                                goto LABEL_9dfa8c;
                                                            }
                                                            else
                                                            {
LABEL_9dfa8a:
                                                                v25 = ((unsigned int)v25 << (v27 & 31)) + 1;
LABEL_9dfa8c:
                                                                if (v12 != 3 && (int)v20 >= 3)
                                                                {
                                                                    v31 = (unsigned int)sub_9e5748(v6);
                                                                    v32 = v31;
                                                                    if (!v31)
                                                                    {
                                                                        v33 = v24 & 0xffffffff;
                                                                        v34 = arm64g_calculate_condition(3, v32, 0, 0);
                                                                        if (!(v34 & 1))
                                                                            goto LABEL_9dfabe;
                                                                        goto LABEL_9dfabd;
                                                                    }
                                                                    else
                                                                    {
                                                                        v33 = 3;
                                                                        v35 = arm64g_calculate_condition(3, v32, 0, 0);
                                                                        if (v35 & 1)
                                                                        {
LABEL_9dfabd:
                                                                            v25 &= 0xffffffff;
                                                                            goto LABEL_9dfac0;
                                                                        }
                                                                        else
                                                                        {
LABEL_9dfabe:
                                                                            v25 = (unsigned int)v25 << (((char)v24 ^ 3) & 31) | 1;
LABEL_9dfac0:
                                                                            v24 = v33;
                                                                            if (v12 != 4 && (v24 = v33, (unsigned int)v20 != 3))
                                                                            {
                                                                                v36 = (unsigned int)sub_9e5748(v6, (unsigned int)v20 - 4);
                                                                                v37 = v36;
                                                                                if (!v36)
                                                                                {
                                                                                    v38 = v33 & 0xffffffff;
                                                                                    v39 = arm64g_calculate_condition(3, v37, 0, 0);
                                                                                    if (!(v39 & 1))
                                                                                        goto LABEL_9dfaf2;
                                                                                    goto LABEL_9dfaf1;
                                                                                }
                                                                                else
                                                                                {
                                                                                    v38 = 4;
                                                                                    v40 = arm64g_calculate_condition(3, v37, 0, 0);
                                                                                    if (v40 & 1)
                                                                                    {
LABEL_9dfaf1:
                                                                                        v25 &= 0xffffffff;
                                                                                        goto LABEL_9dfaf4;
                                                                                    }
                                                                                    else
                                                                                    {
LABEL_9dfaf2:
                                                                                        v25 = ((unsigned int)v25 << ((char)(4 - (unsigned int)v33) & 31)) + 1;
LABEL_9dfaf4:
                                                                                        v24 = v38;
                                                                                        if (v12 != 5 && (v24 = v38, (int)v20 >= 5))
                                                                                        {
                                                                                            v41 = (unsigned int)sub_9e5748(v6);
                                                                                            v42 = v41;
                                                                                            if (!v41)
                                                                                            {
                                                                                                v24 = v38 & 0xffffffff;
                                                                                                v43 = arm64g_calculate_condition(3, v42, 0, 0);
                                                                                                if (!(v43 & 1))
                                                                                                    goto LABEL_9dfb26;
                                                                                                goto LABEL_9dfb25;
                                                                                            }
                                                                                            else
                                                                                            {
                                                                                                v24 = 5;
                                                                                                v44 = arm64g_calculate_condition(3, v42, 0, 0);
                                                                                                if (v44 & 1)
                                                                                                {
LABEL_9dfb25:
                                                                                                    v25 &= 0xffffffff;
                                                                                                    goto LABEL_9dfb28;
                                                                                                }
                                                                                                else
                                                                                                {
LABEL_9dfb26:
                                                                                                    v25 = (unsigned int)v25 << ((char)(5 - (unsigned int)v38) & 31) | 1;
LABEL_9dfb28:
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
                                                    v24 = 0;
                                                    v25 = 1;
                                                }
                                                v45 = (long long)(v25 * 0x100000000) >> 63 & 0xffffffff80000000 | __ROL__(v25, 63) & 0x800000007fffffff & 0x7fffffff;
LABEL_9dfb44:
                                                if (...)
                                                    break;
                                                v21 = 0;
                                                v46 = ~(unsigned int)v24;
                                                v19 = 1;
                                                v11 = 1;
                                                v48 = arm64g_calculate_condition(81, v46 & 0xffffffff, v20 & 0xffffffff, 0);
                                                v20 += v46;
                                                if (!(v48 & 1))
                                                    goto LABEL_9dfcbc;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
LABEL_9dfcb8:
            v11 = 0;
LABEL_9dfcbc:
            sub_9de17c(a4);
            sub_9e989c(&v0);
        }
        else if (sub_9e5b58(a3, 1))
        {
            sub_9e5b4c(a0);
            v11 = 1;
        }
        else
        {
            if (*(long long *)&g_10002b0 == v3)
                return sub_9e4d58();
            ___stack_chk_fail();
        }
    }
    if (*(long long *)&g_10002b0 == v3)
        return v11;
    ___stack_chk_fail();
}
