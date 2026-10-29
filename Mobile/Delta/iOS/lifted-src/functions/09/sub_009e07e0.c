/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9e07e0..0x9e0e6c (1676 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9e07e0_0 {
    char padding_0[16];
    unsigned int field_10;
} st_9e07e0_0;

extern char g_10002b0;

unsigned long long sub_9e07e0(long long a0, long long a1, long long a2, st_9e07e0_0 *a3, long long a4, long long a5, long long a6, unsigned long long a7)
{
    st_9e07e0_0 *v14;  // x26
    long long v15;  // x21
    long long v24;  // x21
    unsigned long long *iter;  // x27
    unsigned long long v26;  // w22
    unsigned long long v27;  // w22
    unsigned long long v28;  // x0
    unsigned long long v29;  // w21
    st_9e07e0_0 *v30;  // x26
    unsigned long long v31;  // x27
    unsigned long long *node;  // x25
    unsigned long long v33;  // w22
    unsigned long long v16;  // w20
    unsigned long long v34;  // w22
    unsigned long long v35;  // x0
    long long v36;  // x21
    unsigned long v37;  // x22
    unsigned long long v38;  // w28
    unsigned long long v39;  // x27
    unsigned long long v40;  // x26
    unsigned long long v41;  // x25
    unsigned long long v42;  // w20
    unsigned long long v43;  // x21
    unsigned long long v17;  // w0
    unsigned long long v44;  // x21
    unsigned long v45;  // x20
    unsigned int i;  // w22
    unsigned long long v47;  // w28
    unsigned long long v48;  // x21
    unsigned long long v49;  // x21
    unsigned long v50;  // x20
    unsigned int j;  // w22
    unsigned long long v18;  // w22
    long long v19;  // x27
    unsigned long long v20;  // x9
    unsigned long long v21;  // x0
    unsigned long long v22;  // x20
    unsigned long long v23;  // w22
    unsigned long long v0;  // [bp-0x2ac]
    unsigned long long v1;  // [bp-0x2a8]
    unsigned long long v2;  // [bp-0x2a4]
    long long v3;  // [bp-0x2a0]
    unsigned long long v4;  // [bp-0x294]
    long long v5;  // [bp-0x288], Other Possible Types: unsigned long long
    unsigned long long v6;  // [bp-0x280]
    unsigned long long v7;  // [bp-0x270]
    unsigned long long v8;  // [bp-0x268]
    long long v9;  // [bp-0x170]
    unsigned long long v10;  // [bp-0x168]
    unsigned long v11;  // [bp-0x70]
    char *v12;  // [bp-0x10]
    char v13;  // [bp+0x0]

    v12 = &v13;
    v14 = a3;
    v15 = a1;
    v11 = *(long long *)&g_10002b0;
    if (sub_9e5c70(a5))
    {
        v16 = (unsigned int)sub_9e46a8(a2);
        v17 = (unsigned int)sub_9e46a8(a4);
        if (v16 || v17)
        {
            v18 = v17;
            if (v17 < v16)
                v17 = v16;
            v4 = v17;
            sub_9de064();
            v5 = sub_9de208(a6);
            v3 = sub_9de208(a6);
            v19 = sub_9de208(a6);
            v9 = v19;
            v7 = sub_9de208(a6);
            if (!v7)
            {
                v31 = 0;
                if (a7)
                    goto LABEL_9e0df4;
                goto LABEL_9e0df0;
            }
            v20 = a7;
            if (a7)
            {
                if (v16 <= 671)
                    goto LABEL_9e097c;
                goto LABEL_9e093c;
            }
            v21 = sub_9e6c04();
            if (!v21)
            {
                v31 = 0;
                goto LABEL_9e0df0;
            }
            v6 = v21;
            if (!sub_9e6cc0())
            {
                v31 = 0;
                goto LABEL_9e0df0;
            }
            v20 = v6;
            if (671 < v16)
            {
LABEL_9e093c:
                v22 = 6;
                goto LABEL_9e09b0;
            }
LABEL_9e097c:
            if (v16 > 239)
            {
                v22 = 5;
            }
            else if (v16 > 79)
            {
                v22 = 4;
            }
            else if (23 < v16)
            {
                v22 = 3;
            }
            else
            {
                v22 = 1;
            }
LABEL_9e09b0:
            if (v18 > 671)
            {
                v23 = 6;
            }
            else if (v18 > 239)
            {
                v23 = 5;
            }
            else if (v18 > 79)
            {
                v23 = 4;
            }
            else if (23 < v18)
            {
                v23 = 3;
            }
            else
            {
                v23 = 1;
            }
            v6 = v20;
            if (!*(int *)(v15 + 16) && !(v24 = v15, !(sub_9e53a8(v24, a5) >> 31 & 1)) || !(v24 = v19, !sub_9de520(0, v24, v15, a5, a6)))
            {
                if (sub_9e4828(v24))
                {
LABEL_9e0a34:
                    sub_9e5b4c(a0);
                    v31 = 1;
                    goto LABEL_9e0de4;
                }
                if (!sub_9e5ca4(v19, v24, v6, a6))
                    goto LABEL_9e0de0;
                v2 = v23;
                if ((unsigned int)v22 >= 2)
                {
                    if (sub_9e66ec(v5, v19, v19, v6, a6))
                    {
                        iter = &v10;
                        v26 = 2;
                        do
                        {
                            v27 = v26;
                            v28 = sub_9de208(a6);
                            *iter = v28;
                            if (!v28 || !sub_9e66ec())
                                goto LABEL_9e0de0;
                        } while ((iter += 1, v26 = v27 + 1, !(v27 >> ((char)((unsigned int)v22 - 1) & 31))));
                        goto LABEL_9e0ac4;
                    }
                    goto LABEL_9e0de0;
                }
LABEL_9e0ac4:
                if (v14->field_10 || !(sub_9e53a8(v14, a5) >> 31 & 1))
                {
                    v30 = v7;
                    v29 = v2;
                    if (sub_9de520(0, v7, v14, a5, a6))
                        goto LABEL_9e0b14;
                    goto LABEL_9e0de0;
                }
                v29 = v2;
                v30 = v14;
LABEL_9e0b14:
                if (sub_9e4828(v30))
                    goto LABEL_9e0a34;
                if (!sub_9e5ca4(v7, v30, v6, a6))
                    goto LABEL_9e0de0;
                if (v29 >= 2)
                {
                    if (sub_9e66ec(v5, v7, v7, v6, a6))
                    {
                        node = &v8;
                        v33 = 2;
                        do
                        {
                            v34 = v33;
                            v35 = sub_9de208(a6);
                            *node = v35;
                            if (!v35 || !sub_9e66ec())
                                goto LABEL_9e0de0;
                        } while ((node += 1, v33 = v34 + 1, !(v34 >> ((char)(v2 - 1) & 31))));
                        goto LABEL_9e0ba0;
                    }
                    goto LABEL_9e0de0;
                }
LABEL_9e0ba0:
                v36 = v3;
                if (!sub_9e5ca4(v36, sub_9e4624(), v6, a6))
                    goto LABEL_9e0de0;
                v37 = v4;
                if ((int)v37 >= 1)
                {
                    v38 = 0;
                    v39 = 0;
                    v0 = 0;
                    v1 = 0;
                    v40 = v37 - v22;
                    v41 = v37 - v2;
                    *(unsigned int *)&v5 = 1;
                    while (1)
                    {
                        v42 = (unsigned int)v37;
                        if (!(unsigned int)v5 && !sub_9e66ec(v36, v36, v36, v6, a6))
                            break;
                        v37 = v42 - 1;
                        if ((unsigned int)v39)
                        {
                            if (!v38)
                                goto LABEL_9e0d08;
                            goto LABEL_9e0c34;
                        }
                        if (sub_9e5748(a2, v37))
                        {
                            v4 = (unsigned int)v37;
                            v43 = v40;
                            do
                            {
                                v44 = v43;
                                v43 = (unsigned int)v44 + 1;
                            } while (!sub_9e5748(a2, v44));
                            v2 = v42;
                            v45 = v42 - 2;
                            i = (unsigned int)v43 - 2;
                            v1 = (unsigned int)v43 - 1;
                            v39 = 1;
                            if ((int)v45 > (int)i)
                            {
                                v36 = v3;
                                do
                                {
                                    v39 = sub_9e5748(a2, v45) != 0 | (unsigned int)v39 * 2;
                                    v45 = (unsigned int)v45 - 1;
                                } while ((int)i < (int)v45);
                            }
                            else
                            {
                                v36 = v3;
                            }
                            v37 = v4;
                            v42 = v2;
                            if (!v38)
                                goto LABEL_9e0d08;
                            goto LABEL_9e0c34;
                        }
                        v39 = 0;
                        if (v38)
                        {
LABEL_9e0c34:
                            v47 = v38;
                            v31 = v39;
                            if ((unsigned int)v31)
                                goto LABEL_9e0c38;
                        }
                        else
                        {
LABEL_9e0d08:
                            if (sub_9e5748(a4, v37))
                            {
                                v4 = (unsigned int)v37;
                                v48 = v41;
                                do
                                {
                                    v49 = v48;
                                    v48 = (unsigned int)v49 + 1;
                                } while (!sub_9e5748(a4, v49));
                                v2 = v42;
                                v50 = v42 - 2;
                                j = (unsigned int)v48 - 2;
                                v0 = (unsigned int)v48 - 1;
                                v38 = 1;
                                if ((int)v50 > (int)j)
                                {
                                    v36 = v3;
                                    do
                                    {
                                        v38 = sub_9e5748(a4, v50) != 0 | v38 * 2;
                                        v50 = (unsigned int)v50 - 1;
                                    } while ((int)j < (int)v50);
                                }
                                else
                                {
                                    v36 = v3;
                                }
                                v37 = v4;
                                v42 = v2;
                                v47 = v38;
                                v31 = v39;
                                if ((unsigned int)v31)
                                    goto LABEL_9e0c38;
                            }
                            else
                            {
                                v38 = 0;
                                v47 = 0;
                                v31 = v39;
                                if ((unsigned int)v31)
                                {
LABEL_9e0c38:
                                    v47 = v38;
                                    v31 = v39;
                                    if ((unsigned int)v37 == v1 && !(v31 = 0, *(unsigned int *)&v5 = 0, v47 = v38, sub_9e66ec(v36, v36, (&v9)[(int)((unsigned int)v39) >> 1], v6, a6)))
                                        goto LABEL_9e0de4;
                                }
                            }
                        }
                        v39 = v31;
                        v38 = v47;
                        if (!v38 || !(v38 = v47, (unsigned int)v37 == v0 && (v38 = 0, *(unsigned int *)&v5 = 0, !sub_9e66ec(v36, v36, (&v7)[(long long)(v47) >> 1], v6, a6))))
                        {
                            v40 = (unsigned int)v40 - 1;
                            v41 = (unsigned int)v41 - 1;
                            if (v42 <= 1)
                                goto LABEL_9e0e38;
                        }
                        else
                        {
                            v31 = 0;
                            goto LABEL_9e0de4;
                        }
                    }
                    goto LABEL_9e0de0;
                }
                else
                {
LABEL_9e0e38:
                    v31 = sub_9e6ae4(a0, v36, v6, a6) != 0;
                    if (!a7)
                        goto LABEL_9e0df0;
                }
            }
            else
            {
LABEL_9e0de0:
                v31 = 0;
LABEL_9e0de4:
                if (a7)
                    goto LABEL_9e0df4;
LABEL_9e0df0:
                sub_9e6c64();
            }
LABEL_9e0df4:
            sub_9de17c(a6);
LABEL_9e0dfc:
            if (*(long long *)&g_10002b0 == v11)
                return v31;
        }
        ___stack_chk_fail();
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/bn/bn_exp2.c", 35, "BN_mod_exp2_mont");
        sub_a36abc(3, 0x66, 0);
        v31 = 0;
        goto LABEL_9e0dfc;
    }
}
