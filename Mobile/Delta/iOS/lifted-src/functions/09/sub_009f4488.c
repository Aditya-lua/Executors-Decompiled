/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f4488..0x9f4958 (1232 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9f4488_1 {
    unsigned long long field_0;
    struct st_9f4488_0 *field_8;
} st_9f4488_1;

typedef struct st_9f4488_2 {
    char padding_0[8];
    struct st_9f4488_3 *field_8;
} st_9f4488_2;

typedef struct st_9f4488_3 {
    unsigned short field_0;
} st_9f4488_3;

typedef struct st_9f4488_0 {
    char field_0;
} st_9f4488_0;


int sub_9f4488(st_9f4488_2 *a0, unsigned long long a1, st_9f4488_0 **a2, char *a3)
{
    char *v3;  // x25
    st_9f4488_0 **v4;  // x24
    unsigned long v13;  // cc_ndep
    char *node;  // x23
    unsigned long v15;  // x9
    unsigned int v16;  // w8
    unsigned short *v17;  // x10
    unsigned long v18;  // x9
    unsigned long v19;  // x26
    unsigned long v20;  // x8
    long long v21;  // w8
    long long v22;  // w9
    unsigned long long v5;  // x28
    char *v23;  // x9
    unsigned long v24;  // x11
    unsigned int v25;  // w10
    char *v26;  // x11
    char *v27;  // x10
    unsigned long v28;  // x11
    unsigned int v29;  // w9
    unsigned long v30;  // x12
    unsigned int v31;  // w13
    unsigned long v32;  // 4112
    unsigned long long v6;  // x0
    unsigned long long v33;  // 4102
    unsigned long v34;  // 4112
    unsigned long long v35;  // 4102
    char *v36;  // x10
    unsigned long v37;  // x12
    unsigned long long v38;  // x10
    char *v39;  // x10
    unsigned long long v40;  // w8
    char *v41;  // x1
    unsigned long long v42;  // x9
    st_9f4488_1 *v7;  // x19
    char *v43;  // x1
    char *iter;  // x2
    unsigned long v45;  // x12
    char *v46;  // x13
    unsigned int v47;  // w11
    unsigned long v48;  // cc_dep1
    unsigned int v49;  // w11
    unsigned long long v50;  // 4112
    unsigned long long v51;  // 4102
    unsigned long long v52;  // 4112
    unsigned long long v53;  // 4102
    st_9f4488_0 **v54;  // x28
    char *v55;  // x9
    unsigned long long v56;  // x24
    unsigned long long len;  // x0
    unsigned long long i;  // w8
    unsigned long v60;  // x10
    unsigned long v61;  // x9
    long long v62;  // x20
    unsigned long long iter1;  // x20
    long long v63;  // x21
    unsigned long v10;  // cc_op
    unsigned long v11;  // cc_dep1
    unsigned long v12;  // cc_dep2
    unsigned long long v0;  // [bp-0x64]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v3 = a3;
    v4 = a2;
    v5 = a1;
    v6 = sub_9ebce0();
    if (!v6)
        return v6;
    v7 = v6;
    if (sub_9ebd68(v7, _strlen(v3) + 1))
    {
        v0 = 0;
        iter1 = 0;
        while (1)
        {
            node = v3;
            while (1)
            {
                while (1)
                {
                    while (1)
                    {
                        v15 = *node;
                        v16 = (unsigned int)v15 & 0xff;
                        if (v15 >> 31 & 1)
                        {
LABEL_9f455c:
                            node += 1;
                            goto LABEL_9f4560;
                        }
                        v17 = a0->field_8;
                        v18 = v17[v15 & 0xff];
                        if (!(v18 >> 6 & 1))
                            break;
                        iter1 = (int)iter1;
                        v27 = node;
                        while (1)
                        {
                            v28 = v27[1];
                            v27 += 1;
                            v29 = (unsigned int)v28 & 0xff;
                            if (v28 >> 31 & 1)
                            {
                                v10 = 3;
                                v11 = v29;
                                v12 = v16;
                                if (v29 != v16)
                                    goto LABEL_9f4588;
                                v29 = v16;
                                goto LABEL_9f464c;
                            }
                            v30 = *(short *)&a0->field_8[v28 & 0xff];
                            v31 = (unsigned int)v30 & 8;
                            if (v29 != v16)
                            {
                                v32 = arm64g_calculate_condition(v10 | 16, v11, v12, v13);
                                v10 = 3;
                                v11 = (v32 & 1 ? v31 : 0);
                                v33 = arm64g_calculate_condition(19, v11, 0, 0);
                                if (!(v33 & 1))
                                    goto LABEL_9f45c0;
                                goto LABEL_9f464c;
                            }
                            else
                            {
                                v34 = arm64g_calculate_condition(v10 | 16, v11, v12, v13);
                                v10 = 0;
                                v11 = (v34 & 1 ? v31 : 0);
                                v35 = arm64g_calculate_condition(16, v11, 0, 0);
                                if (!(v35 & 1))
                                {
                                    v12 = 0;
LABEL_9f45c0:
                                    if (v30 >> 5 & 1 && !(v36 = node, v37 = v36[2], v27 = v36 + 2, v29 = (unsigned int)v37 & 0xff, v37 >> 31 & 1 || !((unsigned short)(*(short *)&a0->field_8[v37 & 0xff]) >> 3 & 1)))
                                    {
                                        v38 = 2;
                                        break;
                                    }
                                    v13 = 0;
LABEL_9f4588:
                                    *(char *)&v7->field_8[iter1] = v29;
                                    iter1 += 1;
                                    node = v27;
                                }
                                else
                                {
LABEL_9f464c:
                                    v38 = 1;
                                    break;
                                }
                            }
                        }
                        v39 = &node[v38];
                        v10 = 3;
                        v11 = v29;
                        v12 = v16;
                        v13 = 0;
                        if (v29 != v16)
                            node = v39;
                        else
                            node = v39 + 1;
                    }
                    if (!(v18 >> 10 & 1))
                        break;
                    iter1 = (int)iter1;
                    v23 = node;
                    while (1)
                    {
                        v24 = v23[1];
                        v23 += 1;
                        v25 = (unsigned int)v24 & 0xff;
                        if (!(v24 >> 31 & 1) && (unsigned short)(*(short *)&a0->field_8[v24 & 0xff]) >> 3 & 1)
                            break;
                        if (v25 == v16)
                        {
                            v26 = node;
                            if (v26[2] == v16)
                            {
                                v25 = v16;
                                v23 = v26 + 2;
                            }
                            else
                            {
                                v25 = v16;
                                break;
                            }
                        }
                        *(char *)&v7->field_8[iter1] = v25;
                        iter1 += 1;
                        node = v23;
                    }
                    v10 = 3;
                    v11 = v25;
                    v12 = v16;
                    v13 = 0;
                    if (v25 == v16)
                        node += 2;
                    else
                        node = v23;
                }
                if (!(v18 >> 5 & 1))
                    break;
                v20 = node[1];
                if (!(v20 >> 31 & 1) && v17[v20 & 0xff] >> 3 & 1)
                {
                    *(char *)&v7->field_8[(unsigned int)iter1] = 0;
                    sub_a6c2e4(*v4, "crypto/conf/conf_def.c", 790);
                    *v4 = v7->field_8;
                    sub_a6c2e4(v7, "crypto/conf/conf_def.c", 792);
                    return 1;
                }
                node += 2;
                v21 = (unsigned int)v20 & 0xff;
                if (v21 == 116)
                    v22 = 9;
                else
                    v22 = v21;
                if (v21 == 110)
                    v22 = 10;
                if (v21 == 114)
                    v22 = 13;
                v10 = 3;
                v11 = v21;
                v12 = 98;
                v13 = 0;
                if (v21 == 98)
                    v16 = 8;
                else
                    v16 = v22;
LABEL_9f4560:
                *(char *)&v7->field_8[(unsigned int)iter1] = v16;
                iter1 = (unsigned int)iter1 + 1;
            }
            if (v18 >> 3 & 1)
            {
                *(char *)&v7->field_8[(unsigned int)iter1] = 0;
                sub_a6c2e4(*v4, "crypto/conf/conf_def.c", 790);
                *v4 = v7->field_8;
                sub_a6c2e4(v7, "crypto/conf/conf_def.c", 792);
                return 1;
            }
            v10 = 3;
            v11 = v16;
            v12 = 36;
            v13 = 0;
            if (v16 != 36)
                goto LABEL_9f455c;
            v19 = node[1];
            if ((int)a0[1].field_8)
            {
                if ((unsigned int)v19 != 40)
                {
                    v10 = 3;
                    v11 = v19 & 0xff;
                    v12 = 123;
                    v13 = 0;
                    if ((unsigned int)v19 != 123)
                        goto LABEL_9f455c;
LABEL_9f46b8:
                    v40 = 125;
                }
                else
                {
LABEL_9f46b0:
                    v40 = 41;
                }
                v42 = 0;
                v43 = node;
                v19 = v43[2];
                v41 = v43 + 2;
                if (v19 >> 7 & 1)
                    goto LABEL_9f4780;
LABEL_9f46cc:
                iter = v41 + 2;
                do
                {
                    v45 = v17[v19 & 0xff];
                    if (!((unsigned int)v45 & 263) && (!(int)a0[1].field_8 || !(v45 >> 12 & 1)))
                    {
                        v46 = iter - 2;
                        if ((char)v19 == 58)
                        {
                            if (*(iter - 1) == 58)
                            {
                                *(iter - 2) = 0;
                                v19 = *iter;
                                if (!(v19 >> 31 & 1))
                                {
                                    do
                                    {
                                        v47 = *(short *)&a0->field_8[v19 & 0xff];
                                        v48 = v47 & 263;
                                        if (v47 & 263)
                                            continue;
                                        v49 = v47 & 0x1000;
                                        if ((int)a0[1].field_8)
                                        {
                                            v50 = arm64g_calculate_condition(25, v48, 0, 0);
                                            v51 = arm64g_calculate_condition(19, (v50 & 1 ? v49 : 0x40000000), 0, 0);
                                            if (!(v51 & 1))
                                                break;
                                        }
                                        else
                                        {
                                            v52 = arm64g_calculate_condition(25, v48, 0, 0);
                                            v53 = arm64g_calculate_condition(16, (v52 & 1 ? v49 : 0x40000000), 0, 0);
                                            if (!(v53 & 1))
                                                break;
                                        }
                                    } while ((v19 = iter[1], iter += 1, !(v19 >> 31 & 1)));
                                    v0 = 58;
                                    goto LABEL_9f4790;
                                }
                                else
                                {
                                    v0 = 58;
                                    goto LABEL_9f4790;
                                }
                            }
                            else
                            {
                                v19 = 58;
                            }
                        }
                        iter = v46;
                        v46 = 0;
                        goto LABEL_9f4790;
                    }
                } while ((v19 = *(iter - 1), iter += 1, !(v19 >> 31 & 1)));
                iter -= 2;
                goto LABEL_9f4788;
            }
            else
            {
                if ((unsigned int)v19 == 123)
                    goto LABEL_9f46b8;
                if ((unsigned int)v19 == 40)
                    goto LABEL_9f46b0;
                v40 = 0;
                v41 = node + 1;
                v42 = 1;
                if (!(v19 >> 7 & 1))
                    goto LABEL_9f46cc;
LABEL_9f4780:
                iter = v41;
                v46 = 0;
LABEL_9f4788:
            }
LABEL_9f4790:
            *iter = 0;
            v3 = iter;
            if (!(v42 & 1))
            {
                if (v40 == (char)v19)
                {
                    v3 = iter + 1;
                }
                else
                {
                    v62 = 0x66;
                    v63 = 738;
                    break;
                }
            }
            v54 = v4;
            v55 = v46;
            v56 = sub_9f2d14(a0);
            if (v55)
                *v55 = v0;
            *iter = v19;
            if (v56)
            {
                len = _strlen(v56);
                if (0x10000 < node - v3 + len + v7->field_0)
                {
                    v62 = 116;
                    v63 = 763;
                    break;
                }
                else if (sub_9ebee0(v7))
                {
                    i = *(char *)v56;
                    if (i)
                    {
                        v60 = (int)iter1;
                        v61 = v56 + 1;
                        v4 = v54;
                        do
                        {
                            *(char *)&v7->field_8[v60] = i;
                            v60 += 1;
                            i = *(char *)v61;
                            v61 += 1;
                            iter1 = (unsigned int)iter1 + 1;
                        } while (i);
                    }
                    else
                    {
                        v4 = v54;
                    }
                    *iter = v19;
                }
                else
                {
                    v62 = 524295;
                    v63 = 0x2ff;
                    break;
                }
            }
            else
            {
                v62 = 104;
                v63 = 758;
                break;
            }
        }
        sub_a368c8();
        sub_a369bc("crypto/conf/conf_def.c", v63, "str_copy");
        sub_a36abc(14, v62, 0);
    }
    sub_9ebcf4(v7);
    return 0;
}
