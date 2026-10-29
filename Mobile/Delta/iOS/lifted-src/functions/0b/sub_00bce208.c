/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xbce208..0xbce4a4 (668 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


char * sub_bce208(char *node, char *iter, unsigned long long a2)
{
    char *v13;  // x11
    unsigned long long *v14;  // x11
    char *v23;  // x12
    unsigned long long *v24;  // x11
    unsigned long long v25;  // x14
    char v26;  // x13
    char *j;  // w13
    char *iter1;  // x10
    char *v29;  // x0
    unsigned long long *v30;  // x11
    char *v31;  // x13
    char *v32;  // x12
    char *v15;  // x9
    unsigned long long *v33;  // x11
    char v34;  // x14
    char *k;  // w14
    unsigned long long *v36;  // x12
    char *v37;  // x13
    char *v38;  // x11
    unsigned long long *v39;  // x12
    char v40;  // x14
    char *l;  // w14
    char *v16;  // x12
    char *v43;  // x0
    unsigned long v44;  // cc_dep1
    unsigned long long v45;  // 4102
    unsigned long long v46;  // 4102
    char *iter2;  // x10
    unsigned long long *v18;  // x11
    unsigned long long v19;  // x14
    char v20;  // x13
    char *i;  // w13
    unsigned long long *v22;  // x11
    char *v0;  // [bp-0x90]
    char *v1;  // [bp-0x88]
    char *v2;  // [bp-0x80]
    char *v3;  // [bp-0x78]
    char *v4;  // [bp-0x70]
    char *v5;  // [bp-0x68]
    char *v6;  // [bp-0x60]
    char *v7;  // [bp-0x40]
    unsigned long long v8;  // [bp-0x38]
    unsigned long long v9;  // [bp-0x30]
    char *v10;  // [bp-0x28]
    char *v11;  // [bp-0x10]
    char v12;  // [bp+0x0]

    v11 = &v12;
    if (!node)
    {
LABEL_bce328:
        v0 = 0;
        v3 = 0;
        v43 = sub_bdb2fc(&v0);
        if (!v43)
            return v43;
LABEL_bce468:
        if (a2 < (unsigned long long)*(long long *)v43)
            return 0;
        v44 = a2;
        if (v43[16])
        {
            v45 = arm64g_calculate_condition(36, v44, *(long long *)&v43[8], 0);
            if (!(v45 & 1))
                return v43;
        }
        else
        {
            v46 = arm64g_calculate_condition(148, v44, *(long long *)&v43[8], 0);
            if (v46 & 1)
                return v43;
        }
        return 0;
    }
    v13 = 0;
    v6 = 2;
    v7 = 0;
    v8 = a2;
    v9 = a2;
    v10 = (char *)0;
    while (1)
    {
        if (1 >= v13)
        {
            if (!v13)
            {
                v14 = node + 8;
                v15 = *(short *)&node[538];
                v16 = v15 * 24;
                iter2 = 0xffffffffffffffff;
                do
                {
                    if (!v16)
                    {
                        v13 = 0;
                        goto LABEL_bce320;
                    }
                    v18 = v14 + 3;
                    v19 = v8;
                    if (*v14 <= v19)
                        v20 = v19 > *v14;
                    else
                        v20 = 0xff;
                    iter2 += 1;
                    v16 -= 24;
                    i = (char *)v20;
                    v14 = v18;
                } while (i == 1);
                if (i)
                {
                    v13 = 0;
                }
                else
                {
                    v15 = iter2 + 1;
                    if (iter)
                    {
                        v13 = 3;
                        goto LABEL_bce354;
                    }
                    else
                    {
LABEL_bce44c:
                        iter1 = node;
                        break;
                    }
                }
            }
            else
            {
                v22 = node + 8;
                v15 = *(short *)&node[538];
                v23 = v15 * 24;
                iter2 = 0xffffffffffffffff;
                do
                {
                    if (!v23)
                    {
                        v13 = 1;
                        goto LABEL_bce320;
                    }
                    v24 = v22 + 3;
                    v25 = v8;
                    if (*v22 <= v25)
                        v26 = v25 > *v22;
                    else
                        v26 = 0xff;
                    iter2 += 1;
                    v23 -= 24;
                    j = (char *)v26;
                    v22 = v24;
                } while (j == 1);
                if (!j)
                    v13 = 2;
                else
                    v13 = 1;
            }
            v15 = iter2;
        }
        else if (v13 != 2)
        {
            if (!iter)
                goto LABEL_bce328;
            v13 = 3;
            goto LABEL_bce24c;
        }
        else
        {
            v15 = *(short *)&node[538];
        }
LABEL_bce320:
        if (v15)
        {
            if (!iter)
                goto LABEL_bce44c;
LABEL_bce354:
            iter1 = node;
            do
            {
                v29 = node;
                node = *(long long *)(v29 + 0x8 * v15 + 544);
                if (1 >= v13)
                {
                    if (!v13)
                    {
                        v30 = node + 8;
                        v15 = *(short *)&node[538];
                        v31 = v15 * 24;
                        v32 = 0xffffffffffffffff;
                        do
                        {
                            if (!v31)
                            {
                                v13 = 0;
                                goto LABEL_bce360;
                            }
                            v33 = v30 + 3;
                            if (*v30 <= v8)
                                v34 = v8 > *v30;
                            else
                                v34 = 0xff;
                            v32 += 1;
                            v31 -= 24;
                            k = (char *)v34;
                            v30 = v33;
                        } while (k == 1);
                        if (!k)
                        {
                            v15 = v32 + 1;
                            v13 = 3;
                        }
                        else
                        {
                            v13 = 0;
                            v15 = v32;
                        }
                    }
                    else
                    {
                        v36 = node + 8;
                        v15 = *(short *)&node[538];
                        v37 = v15 * 24;
                        v38 = 0xffffffffffffffff;
                        do
                        {
                            if (!v37)
                                goto LABEL_bce430;
                            v39 = v36 + 3;
                            if (*v36 <= v8)
                                v40 = v8 > *v36;
                            else
                                v40 = 0xff;
                            v38 += 1;
                            v37 -= 24;
                            l = (char *)v40;
                            v36 = v39;
                        } while (l == 1);
                        v15 = v38;
                        if (!l)
                        {
                            v13 = 2;
                        }
                        else
                        {
LABEL_bce430:
                            v13 = 1;
                        }
                    }
                }
                else
                {
                    if (v13 == 2)
                        v15 = *(short *)&node[538];
                    else
                        v15 = 0;
                }
LABEL_bce360:
            } while ((iter1 = *(long long *)&iter1[544], iter -= 1, iter));
        }
        else if (!iter)
        {
            goto LABEL_bce328;
        }
LABEL_bce24c:
        node = *(long long *)&node[544];
        iter -= 1;
    }
    v0 = iter1;
    v1 = 0;
    v2 = 0;
    v3 = node;
    v4 = 0;
    v5 = v15;
    v43 = sub_bdb2fc(&v0);
    if (!v43)
        return v43;
    goto LABEL_bce468;
}
