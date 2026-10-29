/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e0e6c..0x9e1750 (2276 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9e0e6c_0 {
    long long field_0;
} st_9e0e6c_0;


unsigned long long sub_9e0e6c(unsigned long long a0, long long a1, long long a2, long long a3, unsigned long a4)
{
    long long v10;  // x28
    long long v11;  // x26
    unsigned long long v20;  // x20
    unsigned long long v21;  // x20
    long long v22;  // x0
    long long v23;  // x1
    long long v24;  // x2
    long long v25;  // x24
    unsigned long long v26;  // x23
    unsigned long long v27;  // w8
    unsigned int v28;  // w0
    st_9e0e6c_0 **v29;  // x24
    long long v12;  // x20
    long long v30;  // x0
    long long v31;  // x1
    long long v32;  // x2
    unsigned int v33;  // w0
    long long v34;  // x23
    long long v35;  // x24
    long long v36;  // x0
    long long v37;  // x20
    long long v38;  // x26
    long long v39;  // x28
    long long v13;  // x0
    long long v40;  // x0
    long long v41;  // x27
    long long v42;  // x25
    unsigned long long v43;  // x0
    long long v44;  // x23
    long long v45;  // x9
    unsigned long long v46;  // x24
    unsigned int v47;  // w10
    unsigned long long v48;  // x8
    long long v49;  // x24
    long long v14;  // x25
    long long v50;  // x23
    unsigned long long v51;  // x25
    long long v52;  // x20
    long long v53;  // x27
    long long v54;  // x23
    long long v55;  // x20
    unsigned long long v56;  // x8
    unsigned long long v15;  // x0
    unsigned long long v16;  // x27
    unsigned long long v17;  // x0
    unsigned long long v18;  // x20
    long long v19;  // x23
    unsigned int v0;  // [bp-0xa8]
    unsigned long long v1;  // [bp-0xa4]
    long long v2;  // [bp-0xa0]
    long long v3;  // [bp-0x98], Other Possible Types: unsigned int
    st_9e0e6c_0 **v4;  // [bp-0x90], Other Possible Types: long long
    unsigned long long v5;  // [bp-0x88]
    unsigned long long v6;  // [bp-0x80]
    char v7;  // [bp-0x78]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    if (!sub_9e5b58(a2, 1) && !sub_9e4828(a2))
    {
        v5 = a0;
        *(unsigned int *)a4 = 0;
        if (!sub_9e48c8(a1, 4) && !sub_9e48c8(a2, 4))
        {
            sub_9de064(a3);
            v10 = sub_9de208(a3);
            v11 = sub_9de208(a3);
            v12 = sub_9de208(a3);
            v4 = sub_9de208(a3);
            v13 = sub_9de208(a3);
            v14 = sub_9de208(a3);
            v15 = sub_9de208(a3);
            if (!v15)
            {
                v18 = 0;
                goto LABEL_9e16ec;
            }
            v16 = v15;
            v17 = v5;
            if (!v17)
            {
                v17 = sub_9e4958(v17);
                if (!v17)
                {
                    sub_9e48d4(0);
                    sub_9de17c(a3);
                    return 0;
                }
            }
            v6 = v17;
            if (sub_9e4d58(v12, 1) && !(sub_9e5b4c(v14), !sub_9e4c34(v11, a1) || !sub_9e4c34(v10, a2) || (*(unsigned int *)(v10 + 16) = 0, (*(int *)(v11 + 16) || !(sub_9e53a8(v11, v10) >> 31 & 1)) && !sub_9e5dac(v11, v11, v10, a3))))
            {
                if (sub_9e5c70(a2) && 0x800 >= (int)sub_9e46a8(a2))
                {
                    if (sub_9e4828(v11))
                        goto LABEL_9e1414;
                    v19 = v12;
                    v20 = 0;
                    while (1)
                    {
                        if (sub_9e5748(v11, v20))
                        {
                            if ((unsigned int)v20 && !sub_9ea8ac(v11, v11, v20))
                                break;
                            v21 = 0;
                            while (!sub_9e5748(v10, v21))
                            {
                                if (sub_9e5c70(v14) && !sub_9db3d8(v14, v14, a2) || !(v21 = (unsigned int)v21 + 1, sub_9ea50c(v14, v14)))
                                    goto LABEL_9e16e8;
                            }
                            if ((unsigned int)v21 && !sub_9ea8ac(v10, v10, v21))
                                break;
                            if (!(sub_9e53a8(v11, v10) >> 31 & 1))
                            {
                                if (!sub_9db3d8(v19, v19, v14))
                                    break;
                                v22 = v11;
                                v23 = v11;
                                v24 = v10;
                                goto LABEL_9e12d0;
                            }
                            if (!sub_9db3d8(v14, v14, v19))
                                break;
                            v22 = v10;
                            v23 = v10;
                            v24 = v11;
LABEL_9e12d0:
                            if (!sub_9db498(v22, v23, v24))
                                break;
                            v20 = 0;
                            if (sub_9e4828(v11))
                                goto LABEL_9e1414;
                        }
                        else
                        {
                            v25 = v19;
                            if (sub_9e5c70(v19) && !sub_9db3d8(v25, v25, a2) || !(v20 = (unsigned int)v20 + 1, sub_9ea50c(v25, v25)))
                                break;
                        }
                    }
                }
                else
                {
                    if (!sub_9e4828(v11))
                    {
                        v3 = v13;
                        v26 = 0xffffffff;
                        v27 = 1;
                        do
                        {
                            v2 = v12;
                            v1 = v27;
                            v28 = sub_9e46a8(v10);
                            if (v28 == sub_9e46a8(v11))
                            {
                                v29 = v4;
                                if (!sub_9e4d58(v29, 1))
                                    goto LABEL_9e16e8;
                                v30 = v3;
                                v12 = v10;
                                v31 = v10;
                                v10 = v11;
                                v32 = v11;
                                goto LABEL_9e150c;
                            }
                            else
                            {
                                v33 = sub_9e46a8(v10);
                                v29 = v4;
                                if (v33 != sub_9e46a8(v11) + 1)
                                {
                                    v12 = v10;
                                    v10 = v11;
                                    if (sub_9de520(v29))
                                        goto LABEL_9e1630;
                                    goto LABEL_9e16e8;
                                }
                                v0 = v26;
                                v34 = v11;
                                if (!sub_9ea45c(v16, v11))
                                    goto LABEL_9e16e8;
                                v12 = v10;
                                if (sub_9e53a8(v10, v16) >> 31 & 1)
                                {
                                    if (sub_9e4d58(v29, 1) && !(v10 = v34, v26 = v0, !sub_9db58c(v3, v12, v34)))
                                        goto LABEL_9e1630;
                                    goto LABEL_9e16e8;
                                }
                                if (!(sub_9db58c(v3, v12, v16)) || !(v10 = v34, v26 = v0, sub_9db29c(v29, v16, v34)))
                                    goto LABEL_9e16e8;
                                if (!(sub_9e53a8(v12, v29) >> 31 & 1))
                                {
                                    if (!sub_9e4d58(v29, 3))
                                        goto LABEL_9e16e8;
                                    v30 = v3;
                                    v31 = v30;
                                    v32 = v10;
LABEL_9e150c:
                                    if (sub_9db58c(v30, v31, v32))
                                        goto LABEL_9e1630;
                                    goto LABEL_9e16e8;
                                }
                                else
                                {
                                    if (!sub_9e4d58(v29, 2))
                                        goto LABEL_9e16e8;
LABEL_9e1630:
                                    if (sub_9e5b90(v29))
                                    {
                                        v35 = v2;
                                        if (sub_9db29c(v12, v35, v14))
                                            continue;
                                    }
                                    else
                                    {
                                        if (sub_9e5bc4(v29, 2))
                                        {
                                            if (sub_9ea45c(v12, v2))
                                                goto LABEL_9e16d0;
                                            else
                                                goto LABEL_9e16e8;
                                        }
                                        else if (sub_9e5bc4(v29, 4))
                                        {
                                            if (sub_9ea668(v12, v2, 2))
                                                goto LABEL_9e16d0;
                                            else
                                                goto LABEL_9e16e8;
                                        }
                                        else
                                        {
                                            v36 = v12;
                                            if ((int)v29[1] == 1)
                                                if (sub_9e4c34(v36, v2) && sub_9ebbfc(v12, *(long long *)*v29))
                                                    goto LABEL_9e16d0;
                                                else
                                                    goto LABEL_9e16e8;
                                            else
                                                if (!sub_9e7dc8(v36, v29, v2, a3))
        goto LABEL_9e16e8;
    else
        goto LABEL_9e16d0;
                                        }
LABEL_9e16d0:
                                        v35 = v2;
                                        if (sub_9db29c(v12, v12, v14))
                                            goto LABEL_9e1498;
                                        else
                                            goto LABEL_9e16e8;
                                    }
                                }
                            }
LABEL_9e1498:
                            v11 = v3;
                            v27 = (unsigned int)v26;
                            v26 = v1;
                            v3 = v14;
                            v14 = v35;
                        } while (!sub_9e4828(v11));
                        v14 = v35;
                        if (!(v26 >> 31 & 1))
                        {
LABEL_9e1428:
                            if (!sub_9e5b90(v10))
                            {
                                *(unsigned int *)a4 = 1;
                                v18 = v6;
                                goto LABEL_9e16ec;
                            }
                            else if (*(int *)(v14 + 16) || !(sub_9e53a8(v14, a2) >> 31 & 1))
                            {
                                v18 = v6;
                                if (sub_9e5dac(v18, v14, a2, a3))
                                {
                                    sub_9de17c(a3);
                                    return v18;
                                }
                            }
                            else
                            {
                                v18 = v6;
                                if (sub_9e4c34(v18, v14))
                                {
                                    sub_9de17c(a3);
                                    return v18;
                                }
                            }
                            goto LABEL_9e16ec;
                        }
                    }
LABEL_9e1414:
                    if (sub_9db58c(v14, a2, v14))
                        goto LABEL_9e1428;
                }
            }
LABEL_9e16e8:
            v18 = v6;
LABEL_9e16ec:
            if (v5)
            {
                sub_9de17c(a3);
                return 0;
            }
            sub_9e48d4(v18);
            sub_9de17c(a3);
            return 0;
        }
        sub_9de064(a3);
        v37 = sub_9de208(a3);
        v38 = sub_9de208(a3);
        v39 = sub_9de208(a3);
        v40 = sub_9de208(a3);
        v41 = sub_9de208(a3);
        v42 = sub_9de208(a3);
        if (sub_9de208(a3))
        {
            v43 = v5;
            if (v43 || !(v43 = sub_9e4958(v43), !v43))
            {
                v6 = v43;
                if (sub_9e4d58(v39, 1) && !(sub_9e5b4c(v42), !sub_9e4c34(v38, a1) || !sub_9e4c34(v37, a2)))
                {
                    *(unsigned int *)(v37 + 16) = 0;
                    if (*(int *)(v38 + 16) || !(sub_9e53a8(v38, v37) >> 31 & 1))
                    {
                        sub_991a38(&v7);
                        sub_9e5cb4(&v7, v38, 4);
                        if (sub_9e5dac(v38, &v7, v37, a3))
                            goto LABEL_9e1008;
                        goto LABEL_9e13cc;
                    }
                    else
                    {
LABEL_9e1008:
                        if (sub_9e4828(v38))
                        {
                            v44 = v37;
                            v45 = v42;
                            v46 = v5;
                            goto LABEL_9e1020;
                        }
                        else
                        {
                            v4 = v42;
                            v2 = v40;
                            v47 = 0xffffffff;
                            v48 = 1;
                        }
                        do
                        {
                            v3 = v47;
                            v49 = v39;
                            v50 = v38;
                            v39 = v37;
                            v51 = v48;
                            sub_991a38(&v7);
                            sub_9e5cb4(&v7, v37, 4);
                            v52 = v41;
                            v53 = v50;
                            if (!sub_9de520(v2, v41, &v7, v50, a3) || !(v54 = v49, sub_9e7dc8(v39, v2, v49, a3) && sub_9db29c(v39, v39, v4)))
                                goto LABEL_9e13cc;
                            v38 = v52;
                            v48 = v3;
                            v47 = v51;
                            v37 = v53;
                            v41 = v4;
                            v4 = v54;
                        } while (!sub_9e4828(v52));
                        v45 = v54;
                        v46 = v5;
                        v44 = v53;
                        if (!(v51 >> 31 & 1))
                            goto LABEL_9e103c;
LABEL_9e1020:
                        if (!sub_9db58c(v45, a2, v45))
                            goto LABEL_9e13f4;
LABEL_9e103c:
                        v55 = v45;
                        if (sub_9e5b90(v44))
                        {
                            v56 = v6;
                            if (*(int *)(v55 + 16) || (v56 = v6, !(sub_9e53a8(v55, a2) >> 31 & 1)))
                            {
                                if (sub_9e5dac(v56))
                                {
                                    *(unsigned int *)a4 = 0;
                                    sub_9de17c(a3);
                                    return v6;
                                }
                            }
                            else
                            {
                                if (sub_9e4c34(v56))
                                {
                                    *(unsigned int *)a4 = 0;
                                    sub_9de17c(a3);
                                    return v6;
                                }
                            }
                        }
                        else
                        {
                            *(unsigned int *)a4 = 1;
                        }
LABEL_9e13f4:
                        if (v46)
                        {
                            v6 = 0;
                            sub_9de17c(a3);
                            return v6;
                        }
                    }
                }
                else
                {
LABEL_9e13cc:
                    if (v5)
                    {
                        v6 = 0;
                        sub_9de17c(a3);
                        return v6;
                    }
                }
            }
        }
        else if (v5)
        {
            v6 = 0;
            sub_9de17c(a3);
            return v6;
        }
        sub_9e48d4();
        v6 = 0;
        sub_9de17c(a3);
        return v6;
    }
    *(unsigned int *)a4 = 1;
    return 0;
}
