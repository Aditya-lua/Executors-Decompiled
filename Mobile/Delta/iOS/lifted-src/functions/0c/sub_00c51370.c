/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc51370..0xc51fac (3132 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c51370_2 {
    char padding_0[1];
    char field_1;
} st_c51370_2;

typedef struct st_c51370_1 {
    char padding_0[8];
    unsigned long long field_8;
    void* field_10;
} st_c51370_1;

typedef struct st_c51370_0 {
    void* field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    unsigned long long field_18;
    void* field_20;
    unsigned long long field_28;
    unsigned int field_30;
    char field_34;
} st_c51370_0;


st_c51370_1 * sub_c51370(st_c51370_1 *a0, st_c51370_0 *a1, unsigned long a2, unsigned long a3, unsigned long long a4)
{
    unsigned long i;  // x24
    unsigned long long v9;  // x25
    void* v18;  // x12
    unsigned long long v19;  // x15
    unsigned long long v20;  // x19
    unsigned long long v21;  // x17
    unsigned long v22;  // x2
    void* v23;  // x10
    unsigned long long v24;  // x8
    unsigned long long v25;  // x3
    unsigned long v10;  // x16
    unsigned long long iter;  // x22
    unsigned long long v28;  // x26
    void* v29;  // x20
    unsigned long v30;  // x21
    void* v31;  // x20
    unsigned long long iter1;  // x20
    void* node;  // x21
    unsigned long long v34;  // x27
    unsigned long long v35;  // x6
    st_c51370_2 *v36;  // x28
    void* v11;  // x23
    unsigned long v37;  // x5
    char *v38;  // x28
    unsigned long long v39;  // x25
    unsigned long long v40;  // w23
    unsigned long v41;  // x5
    unsigned long long v42;  // 4118
    unsigned long long v43;  // x25
    void* v44;  // x24
    unsigned long long v45;  // x26
    unsigned long long v46;  // w23
    unsigned long v12;  // x11
    unsigned long v47;  // x5
    unsigned long long v48;  // 4118
    unsigned long long v49;  // x23
    unsigned long long v50;  // x5
    unsigned long long v51;  // x5
    unsigned long long v52;  // x5
    unsigned long long v53;  // x25
    unsigned long long v54;  // x27
    st_c51370_2 *v55;  // x28
    unsigned long v56;  // x5
    unsigned long long v13;  // 4134
    unsigned long v57;  // x28
    unsigned long long v58;  // x6
    unsigned long long v59;  // w23
    unsigned long long v60;  // x7
    unsigned long v61;  // x5
    unsigned long long v62;  // 4118
    unsigned long long v63;  // x24
    unsigned long long v64;  // x23
    void* v65;  // x6
    unsigned long long v66;  // x25
    unsigned long long v14;  // 4136
    st_c51370_2 *v67;  // x28
    unsigned long v68;  // x5
    unsigned long long v69;  // x6
    unsigned long long v70;  // w23
    unsigned long v71;  // x5
    unsigned long long v72;  // 4118
    unsigned long long v73;  // x6
    unsigned long long v74;  // x23
    void* v75;  // x7
    unsigned long long v76;  // x5
    unsigned int v15;  // w8
    unsigned long long v77;  // x6
    void* v78;  // x7
    unsigned long long v79;  // 4102
    unsigned long long v80;  // x19
    unsigned long v81;  // x5
    unsigned long long v82;  // 4118
    unsigned long long v83;  // x6
    void* v84;  // x19
    void* v85;  // x22
    unsigned long long v86;  // x25
    unsigned long long v16;  // w13
    unsigned long long v87;  // x5
    void* v88;  // x22
    unsigned long long v89;  // x5
    void* v90;  // x22
    unsigned long long v91;  // x5
    unsigned long v92;  // cc_dep1
    unsigned long v93;  // cc_dep2
    unsigned long long v94;  // 4104
    unsigned long long v95;  // 4104
    unsigned long long v17;  // x14
    unsigned long long v0;  // [bp-0x78]
    unsigned long long v1;  // [bp-0x78]
    unsigned long long v2;  // [bp-0x70]
    unsigned long long v3;  // [bp-0x70]
    unsigned long long v4;  // [bp-0x68]
    unsigned long long v5;  // [bp-0x68]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    i = a1->field_28;
    if (i)
    {
        v9 = 0;
        v10 = a1->field_18;
        v11 = a1->field_20;
        v12 = a1->field_30;
        v13 = ((v12 * 0x100000000 & 0xaaaaaaaaaaaaaaaa) >> 1 | v12 * 0x200000000 & 0xaaaaaaaaaaaaaaaa) * 4 & 0xcccccccccccccccc;
        v14 = (((v12 * 0x100000000 & 0xaaaaaaaaaaaaaaaa) >> 1 | v12 * 0x200000000 & 0xaaaaaaaaaaaaaaaa) & 0xcccccccccccccccc) >> 2;
        v15 = ((((((((v14 | v13) & 0xf0f0f0f0f0f0f0f0) >> 4 | (v14 | v13) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8 | (((v14 | v13) & 0xf0f0f0f0f0f0f0f0) >> 4 | (v14 | v13) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | (((((v14 | v13) & 0xf0f0f0f0f0f0f0f0) >> 4 | (v14 | v13) * 16 & 0xf0f0f0f0f0f0f0f0) & 0xff00ff00ff00ff00) >> 8 | (((v14 | v13) & 0xf0f0f0f0f0f0f0f0) >> 4 | (v14 | v13) * 16 & 0xf0f0f0f0f0f0f0f0) * 0x100 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 32;
        if (!(v15 * 0x100000000))
            v16 = 32;
        else
            v16 = (unsigned int)Clz(v15 * 0x100000000);
        v17 = 0xffffffffffffffff >> ((char)-((unsigned int)v12 * 8) & 56 & 63);
        v18 = a1->field_0;
        v19 = a1->field_8;
        v20 = a1->field_10;
        v21 = v19 - v10;
        v22 = a1->field_34;
        v23 = v18 + v10;
        v24 = v12 & 0xff;
        v25 = v17 & 0xfffffffffffffffe;
        do
        {
            if (!(v22 & 1))
            {
                if ((((unsigned int)v12 ^ (unsigned int)v12 - 1) & 0xff) <= ((unsigned int)v12 - 1 & 0xff))
                {
                    a1->field_20 = 1;
                    a1->field_28 = 0;
                    a0->field_8 = (25 | (v12 * 0x100 | v12 >> 56) & 0xff00) & 0xffff;
                    a0->field_10 = iter;
                    *(unsigned long long *)a0->padding_0 = 2;
                    return a0;
                }
                if (1 >= v16)
                {
                    if (!v16)
                    {
                        v88 = v11;
                        v86 = *(char *)v88;
                        iter = v88 + 1;
                        a1->field_20 = iter;
                        a1->field_28 = i - 1;
                        if (i == 1)
                        {
                            a1->field_20 = 1;
                            a1->field_28 = 0;
                            a0->field_8 = 19;
                            a0->field_10 = iter;
                            *(unsigned long long *)a0->padding_0 = 2;
                            return a0;
                        }
                        iter1 = i - 2;
                        node = v11 + 2;
                        a1->field_20 = node;
                        a1->field_28 = iter1;
                        iter = (char)v11[1];
                    }
                    else if (v16 != 1)
                    {
                        a1->field_20 = 1;
                        a1->field_28 = 0;
                        a0->field_8 = (25 | (v12 * 0x100 | v12 >> 56) & 0xff00) & 0xffff;
                        a0->field_10 = iter;
                        *(unsigned long long *)a0->padding_0 = 2;
                        return a0;
                    }
                    else if (i != 1)
                    {
                        v85 = v11;
                        v86 = *(short *)v85;
                        iter = v85 + 2;
                        v87 = i - 2;
                        a1->field_20 = iter;
                        a1->field_28 = v87;
                        if (v87 <= 1)
                        {
                            a1->field_20 = 1;
                            a1->field_28 = 0;
                            a0->field_8 = 19;
                            a0->field_10 = iter;
                            *(unsigned long long *)a0->padding_0 = 2;
                            return a0;
                        }
                        iter1 = i - 4;
                        node = v11 + 4;
                        a1->field_20 = node;
                        a1->field_28 = iter1;
                        iter = (short)v11[2];
                    }
                    else
                    {
                        a1->field_20 = 1;
                        a1->field_28 = 0;
                        a0->field_8 = 19;
                        a0->field_10 = v11;
                        *(unsigned long long *)a0->padding_0 = 2;
                        return a0;
                    }
                }
                else
                {
                    if (v16 != 2)
                    {
                        if (v16 != 3)
                        {
                            a1->field_20 = 1;
                            a1->field_28 = 0;
                            a0->field_8 = (25 | (v12 * 0x100 | v12 >> 56) & 0xff00) & 0xffff;
                            a0->field_10 = iter;
                            *(unsigned long long *)a0->padding_0 = 2;
                            return a0;
                        }
                        else if (i > 7)
                        {
                            v89 = i - 8;
                            iter = v11 + 8;
                            a1->field_20 = iter;
                            a1->field_28 = v89;
                            if (v89 < 8)
                            {
                                a1->field_20 = 1;
                                a1->field_28 = 0;
                                a0->field_8 = 19;
                                a0->field_10 = iter;
                                *(unsigned long long *)a0->padding_0 = 2;
                                return a0;
                            }
                            v86 = (char)v11[7] * 0x100000000000000 | (*(int *)v11 | ((short)v11[4] | (char)v11[6] * 0x10000) * 0x100000000) & 0xffffffffffffff;
                            iter1 = i - 16;
                            node = v11 + 16;
                            a1->field_20 = node;
                            a1->field_28 = iter1;
                            iter = (char)v11[15] * 0x100000000000000 | ((int)v11[8] * 0x100 | ((short)v11[12] | (char)v11[14] * 0x10000) * 0x10000000000) >> 8;
                        }
                        else
                        {
                            a1->field_20 = 1;
                            a1->field_28 = 0;
                            a0->field_8 = 19;
                            a0->field_10 = v11;
                            *(unsigned long long *)a0->padding_0 = 2;
                            return a0;
                        }
                    }
                    else
                    {
                        if (i > 3)
                        {
                            v90 = v11;
                            v86 = *(int *)v90;
                            iter = v90 + 4;
                            v91 = i - 4;
                            a1->field_20 = iter;
                            a1->field_28 = v91;
                            if (v91 <= 3)
                            {
                                a1->field_20 = 1;
                                a1->field_28 = 0;
                                a0->field_8 = 19;
                                a0->field_10 = iter;
                                *(unsigned long long *)a0->padding_0 = 2;
                                return a0;
                            }
                            iter1 = i - 8;
                            node = v11 + 8;
                            a1->field_20 = node;
                            a1->field_28 = iter1;
                            iter = (int)v11[4];
                        }
                        else
                        {
                            a1->field_20 = 1;
                            a1->field_28 = 0;
                            a0->field_8 = 19;
                            a0->field_10 = v11;
                            *(unsigned long long *)a0->padding_0 = 2;
                            return a0;
                        }
                    }
                }
                if (!iter && !v86)
                {
                    a1->field_20 = 1;
                    a1->field_28 = 0;
                    *(unsigned long long *)a0->padding_0 = 0;
                    return a0;
                }
                v92 = v86;
                v93 = v17;
                if (v86 == v17)
                {
                    v34 = iter;
                    v9 = v34 >> 8;
                    v94 = arm64g_calculate_condition(4, v92, v93, 0);
                    if (v94 & 1)
                        goto LABEL_c51ccc;
                }
                else
                {
                    v34 = v86;
                    v9 = v34 >> 8;
                    v95 = arm64g_calculate_condition(4, v92, v93, 0);
                    if (v95 & 1)
                        goto LABEL_c51ccc;
                }
                if (v25 <= v20)
                    goto LABEL_c51cd4;
                goto LABEL_c51674;
            }
            v28 = i - 1;
            v29 = v11;
            v30 = *(char *)v29;
            v31 = v29 + 1;
            if ((int)v30 <= 3)
            {
                if ((int)v30 <= 1)
                {
                    v79 = arm64g_calculate_condition(19, v30 & 0xff, 1, 0);
                    if (!(v79 & 1))
                    {
                        switch (v28)
                        {
                        case 0:
                            a1->field_20 = 1;
                            a1->field_28 = 0;
                            a0->field_8 = 19;
                            a0->field_10 = v31;
                            *(unsigned long long *)a0->padding_0 = 2;
                            return a0;
                        default:
                            v80 = 0;
                            iter = 0;
                            iter1 = i - 2;
                            node = v11 + 2;
                            while (1)
                            {
                                v81 = *((char *)node - 1);
                                if ((unsigned int)iter == 63 && 1 < (unsigned int)v81)
                                    break;
                                v80 |= (v81 & 127) << ((char)iter & 63);
                                if (v81 >> 7 & 1)
                                {
                                    node += 1;
                                    iter = (unsigned int)iter + 7;
                                    iter1 -= 1;
                                    v82 = arm64g_calculate_condition(18, iter1, 1, 0);
                                    if (!(v82 & 1))
                                    {
                                        v31 = v11 + i;
                                        a1->field_20 = v31;
                                        a1->field_28 = 0;
                                        a1->field_20 = 1;
                                        a1->field_28 = 0;
                                        a0->field_8 = 19;
                                        a0->field_10 = v31;
                                        *(unsigned long long *)a0->padding_0 = 2;
                                        return a0;
                                    }
                                }
                                else
                                {
                                    a1->field_20 = node;
                                    a1->field_28 = iter1;
                                    if (v19 < v10)
                                    {
                                        a0->field_8 = 19;
                                        a0->field_10 = v18;
                                        *(unsigned long long *)a0->padding_0 = 2;
                                        return a0;
                                    }
                                    v83 = v24 * v80;
                                    iter = v21 - v83;
                                    if (v21 < v83)
                                    {
                                        a0->field_8 = 19;
                                        a0->field_10 = v23;
                                        *(unsigned long long *)a0->padding_0 = 2;
                                        return a0;
                                    }
                                    if ((((unsigned int)v12 ^ (unsigned int)v12 - 1) & 0xff) > ((unsigned int)v12 - 1 & 0xff))
                                    {
                                        v9 = v80 >> 8;
                                        v84 = v23 + v83;
                                        if (1 >= v16)
                                        {
                                            if (v16)
                                            {
                                                if (v16 == 1)
                                                {
                                                    if (iter > 1)
                                                    {
                                                        v34 = *(short *)v84;
                                                        goto LABEL_c51ccc;
                                                    }
                                                    else
                                                    {
                                                        a0->field_8 = 19;
                                                        a0->field_10 = v84;
                                                        *(unsigned long long *)a0->padding_0 = 2;
                                                        return a0;
                                                    }
                                                }
                                                else
                                                {
                                                    a0->field_8 = 25 | v24 * 0x100;
                                                    a0->field_10 = v23;
                                                    *(unsigned long long *)a0->padding_0 = 2;
                                                    return a0;
                                                }
                                            }
                                            else
                                            {
                                                if (v21 != v83)
                                                {
                                                    v34 = *(char *)v84;
                                                    goto LABEL_c51ccc;
                                                }
                                                else
                                                {
                                                    a0->field_8 = 19;
                                                    a0->field_10 = v84;
                                                    *(unsigned long long *)a0->padding_0 = 2;
                                                    return a0;
                                                }
                                            }
                                        }
                                        else
                                        {
                                            if (v16 != 2)
                                            {
                                                if (v16 == 3)
                                                {
                                                    if (iter > 7)
                                                    {
                                                        v34 = (char)v84[7] * 0x100000000000000 | (*(int *)v84 * 0x100 | ((short)v84[4] | (char)v84[6] * 0x10000) * 0x10000000000) >> 8;
                                                        goto LABEL_c51ccc;
                                                    }
                                                    else
                                                    {
                                                        a0->field_8 = 19;
                                                        a0->field_10 = v84;
                                                        *(unsigned long long *)a0->padding_0 = 2;
                                                        return a0;
                                                    }
                                                }
                                                else
                                                {
                                                    a0->field_8 = 25 | v24 * 0x100;
                                                    a0->field_10 = v23;
                                                    *(unsigned long long *)a0->padding_0 = 2;
                                                    return a0;
                                                }
                                            }
                                            else
                                            {
                                                if (iter > 3)
                                                {
                                                    v34 = *(int *)v84;
                                                    goto LABEL_c51ccc;
                                                }
                                                else
                                                {
                                                    a0->field_8 = 19;
                                                    a0->field_10 = v84;
                                                    *(unsigned long long *)a0->padding_0 = 2;
                                                    return a0;
                                                }
                                            }
                                        }
                                    }
                                    else
                                    {
                                        a0->field_8 = 25 | v24 * 0x100;
                                        a0->field_10 = v23;
                                        *(unsigned long long *)a0->padding_0 = 2;
                                        return a0;
                                    }
                                }
                            }
                        }
                    }
                    else if (!(unsigned int)v30)
                    {
                        a1->field_20 = 1;
                        a1->field_28 = 0;
                        *(unsigned long long *)a0->padding_0 = 0;
                        return a0;
                    }
                    else
                    {
                        a1->field_20 = 1;
                        a1->field_28 = 0;
                        a0->field_8 = 24 | (v9 & 0xffffffffffff00 | v30) * 0x100;
                        a0->field_10 = iter;
                        *(unsigned long long *)a0->padding_0 = 2;
                        return a0;
                    }
                    goto LABEL_c51e38;
                }
                if ((unsigned int)v30 != 2)
                {
                    if ((unsigned int)v30 != 3)
                    {
                        a1->field_20 = 1;
                        a1->field_28 = 0;
                        a0->field_8 = 24 | (v9 & 0xffffffffffff00 | v30) * 0x100;
                        a0->field_10 = iter;
                        *(unsigned long long *)a0->padding_0 = 2;
                        return a0;
                    }
                    else if (v28)
                    {
                        iter = 0;
                        v53 = 0;
                        w30 = 0;
                        iter1 = i - 3;
                        node = v11 + 3;
                        v54 = i - 1;
                    }
                    else
                    {
                        a1->field_20 = 1;
                        a1->field_28 = 0;
                        a0->field_8 = 19;
                        a0->field_10 = v31;
                        *(unsigned long long *)a0->padding_0 = 2;
                        return a0;
                    }
                    while (1)
                    {
                        v55 = v11 + iter;
                        v56 = v55->field_1;
                        v57 = &v55->field_1;
                        if (w30 == 63 && 1 < (unsigned int)v56)
                            goto LABEL_c51e38;
                        v58 = v54 - 1;
                        v53 |= (v56 & 127) << ((char)w30 & 63);
                        if (!(v56 >> 7 & 1))
                            break;
                        w30 = w30 + 7;
                        iter += 1;
                        iter1 -= 1;
                        node += 1;
                        v54 = v58;
                        if (v28 == iter)
                        {
                            v31 = v11 + i;
                            a1->field_20 = v31;
                            a1->field_28 = 0;
                            a1->field_20 = 1;
                            a1->field_28 = 0;
                            a0->field_8 = 19;
                            a0->field_10 = v31;
                            *(unsigned long long *)a0->padding_0 = 2;
                            return a0;
                        }
                    }
                    iter = v57 + 1;
                    a1->field_20 = iter;
                    a1->field_28 = v58;
                    if (!v58)
                    {
                        a1->field_20 = 1;
                        a1->field_28 = 0;
                        a0->field_8 = 19;
                        a0->field_10 = iter;
                        *(unsigned long long *)a0->padding_0 = 2;
                        return a0;
                    }
                    iter = 0;
                    v59 = 0;
                    v60 = v4;
                    do
                    {
                        v61 = *((char *)node - 1);
                        if (v59 == 63 && 1 < (unsigned int)v61)
                            goto LABEL_c51e94;
                        iter |= (v61 & 127) << ((char)v59 & 63);
                        if (!(v61 >> 7 & 1))
                        {
                            a1->field_20 = node;
                            a1->field_28 = iter1;
                            if (v19 < v10)
                            {
                                a0->field_8 = 19;
                                a0->field_10 = v18;
                                *(unsigned long long *)a0->padding_0 = 2;
                                return a0;
                            }
                            v63 = v24 * v53;
                            v64 = v21 - v63;
                            if (v21 < v63)
                            {
                                a0->field_8 = 19;
                                a0->field_10 = v23;
                                *(unsigned long long *)a0->padding_0 = 2;
                                return a0;
                            }
                            if ((((unsigned int)v12 ^ (unsigned int)v12 - 1) & 0xff) > ((unsigned int)v12 - 1 & 0xff))
                            {
                                v65 = v23 + v63;
                                if (1 >= v16)
                                {
                                    if (v16)
                                    {
                                        if (v16 != 1)
                                        {
                                            a0->field_8 = 25 | v24 * 0x100;
                                            a0->field_10 = v23;
                                            *(unsigned long long *)a0->padding_0 = 2;
                                            return a0;
                                        }
                                        else if (v64 > 1)
                                        {
                                            v45 = *(short *)v65;
                                        }
                                        else
                                        {
                                            a0->field_8 = 19;
                                            a0->field_10 = v65;
                                            *(unsigned long long *)a0->padding_0 = 2;
                                            return a0;
                                        }
                                    }
                                    else
                                    {
                                        if (v21 != v63)
                                        {
                                            v45 = *(char *)v65;
                                        }
                                        else
                                        {
                                            a0->field_8 = 19;
                                            a0->field_10 = v65;
                                            *(unsigned long long *)a0->padding_0 = 2;
                                            return a0;
                                        }
                                    }
                                }
                                else
                                {
                                    if (v16 != 2)
                                    {
                                        if (v16 != 3)
                                        {
                                            a0->field_8 = 25 | v24 * 0x100;
                                            a0->field_10 = v23;
                                            *(unsigned long long *)a0->padding_0 = 2;
                                            return a0;
                                        }
                                        else if (v64 > 7)
                                        {
                                            v45 = (char)v65[7] * 0x100000000000000 | (*(int *)v65 * 0x100 | ((short)v65[4] | (char)v65[6] * 0x10000) * 0x10000000000) >> 8;
                                        }
                                        else
                                        {
                                            a0->field_8 = 19;
                                            a0->field_10 = v65;
                                            *(unsigned long long *)a0->padding_0 = 2;
                                            return a0;
                                        }
                                    }
                                    else
                                    {
                                        if (v64 > 3)
                                        {
                                            v45 = *(int *)v65;
                                        }
                                        else
                                        {
                                            a0->field_8 = 19;
                                            a0->field_10 = v65;
                                            *(unsigned long long *)a0->padding_0 = 2;
                                            return a0;
                                        }
                                    }
                                }
                                v9 = v53 >> 8;
                                v49 = v45 + iter & v17;
                                v5 = iter;
                                goto LABEL_c51ba0;
                            }
LABEL_c51f58:
                            a0->field_8 = 25 | v24 * 0x100;
                            a0->field_10 = v23;
                            *(unsigned long long *)a0->padding_0 = 2;
                            return a0;
                        }
                    } while ((node += 1, v59 += 7, iter1 -= 1, v62 = arm64g_calculate_condition(18, iter1, 1, 0), v62 & 1));
                }
                else
                {
                    if (!v28)
                    {
                        a1->field_20 = 1;
                        a1->field_28 = 0;
                        a0->field_8 = 19;
                        a0->field_10 = v31;
                        *(unsigned long long *)a0->padding_0 = 2;
                        return a0;
                    }
                    iter = 0;
                    v66 = 0;
                    w30 = 0;
                    iter1 = i - 3;
                    node = v11 + 3;
                    v54 = i - 1;
                    while (1)
                    {
                        v67 = v11 + iter;
                        v68 = v67->field_1;
                        v57 = &v67->field_1;
                        if (w30 == 63 && 1 < (unsigned int)v68)
                            goto LABEL_c51e38;
                        v69 = v54 - 1;
                        v66 |= (v68 & 127) << ((char)w30 & 63);
                        if (!(v68 >> 7 & 1))
                            break;
                        w30 = w30 + 7;
                        iter += 1;
                        iter1 -= 1;
                        node += 1;
                        v54 = v69;
                        if (v28 == iter)
                        {
                            v31 = v11 + i;
                            a1->field_20 = v31;
                            a1->field_28 = 0;
                            a1->field_20 = 1;
                            a1->field_28 = 0;
                            a0->field_8 = 19;
                            a0->field_10 = v31;
                            *(unsigned long long *)a0->padding_0 = 2;
                            return a0;
                        }
                    }
                    iter = v57 + 1;
                    a1->field_20 = iter;
                    a1->field_28 = v69;
                    if (!v69)
                    {
                        a1->field_20 = 1;
                        a1->field_28 = 0;
                        a0->field_8 = 19;
                        a0->field_10 = iter;
                        *(unsigned long long *)a0->padding_0 = 2;
                        return a0;
                    }
                    iter = 0;
                    v70 = 0;
                    v60 = v2;
                    do
                    {
                        v71 = *((char *)node - 1);
                        if (v70 == 63 && 1 < (unsigned int)v71)
                        {
LABEL_c51e94:
                            a1->field_20 = 1;
                            a1->field_28 = 0;
                            a0->field_8 = 6;
                            a0->field_10 = v60;
                            *(unsigned long long *)a0->padding_0 = 2;
                            return a0;
                        }
                        iter |= (v71 & 127) << ((char)v70 & 63);
                        if (!(v71 >> 7 & 1))
                        {
                            a1->field_20 = node;
                            a1->field_28 = iter1;
                            if (v19 < v10)
                            {
                                a0->field_8 = 19;
                                a0->field_10 = v18;
                                *(unsigned long long *)a0->padding_0 = 2;
                                return a0;
                            }
                            v73 = v24 * v66;
                            v74 = v21 - v73;
                            if (v21 < v73)
                            {
                                a0->field_8 = 19;
                                a0->field_10 = v23;
                                *(unsigned long long *)a0->padding_0 = 2;
                                return a0;
                            }
                            if ((((unsigned int)v12 ^ (unsigned int)v12 - 1) & 0xff) <= ((unsigned int)v12 - 1 & 0xff))
                            {
                                a0->field_8 = 25 | v24 * 0x100;
                                a0->field_10 = v23;
                                *(unsigned long long *)a0->padding_0 = 2;
                                return a0;
                            }
                            v75 = v23 + v73;
                            if (1 >= v16)
                            {
                                if (v16)
                                {
                                    if (v16 == 1)
                                    {
                                        if (v74 > 1)
                                        {
                                            v45 = *(short *)v75;
                                            goto LABEL_c51d78;
                                        }
                                        else
                                        {
                                            a0->field_8 = 19;
                                            a0->field_10 = v75;
                                            *(unsigned long long *)a0->padding_0 = 2;
                                            return a0;
                                        }
                                    }
                                }
                                else
                                {
                                    if (v21 != v73)
                                    {
                                        v45 = *(char *)v75;
                                        goto LABEL_c51d78;
                                    }
                                    else
                                    {
                                        a0->field_8 = 19;
                                        a0->field_10 = v75;
                                        *(unsigned long long *)a0->padding_0 = 2;
                                        return a0;
                                    }
                                }
                            }
                            else
                            {
                                if (v16 == 2)
                                {
                                    if (v74 <= 3)
                                    {
                                        a0->field_8 = 19;
                                        a0->field_10 = v75;
                                        *(unsigned long long *)a0->padding_0 = 2;
                                        return a0;
                                    }
                                    v45 = *(int *)v75;
LABEL_c51d78:
                                    v76 = v24 * iter;
                                    v77 = v21 - v76;
                                    if (v21 < v76)
                                    {
                                        a0->field_8 = 19;
                                        a0->field_10 = v23;
                                        *(unsigned long long *)a0->padding_0 = 2;
                                        return a0;
                                    }
                                    v9 = v66 >> 8;
                                    v78 = v23 + v76;
                                    if (1 >= v16)
                                    {
                                        if (!v16)
                                        {
                                            if (v21 != v76)
                                            {
                                                v49 = *(char *)v78;
                                            }
                                            else
                                            {
                                                a0->field_8 = 19;
                                                a0->field_10 = v78;
                                                *(unsigned long long *)a0->padding_0 = 2;
                                                return a0;
                                            }
                                        }
                                        else
                                        {
                                            if (v77 > 1)
                                            {
                                                v49 = *(short *)v78;
                                            }
                                            else
                                            {
                                                a0->field_8 = 19;
                                                a0->field_10 = v78;
                                                *(unsigned long long *)a0->padding_0 = 2;
                                                return a0;
                                            }
                                        }
                                    }
                                    else
                                    {
                                        if (v16 == 2)
                                        {
                                            if (v77 > 3)
                                            {
                                                v49 = *(int *)v78;
                                            }
                                            else
                                            {
                                                a0->field_8 = 19;
                                                a0->field_10 = v78;
                                                *(unsigned long long *)a0->padding_0 = 2;
                                                return a0;
                                            }
                                        }
                                        else
                                        {
                                            if (v77 >= 8)
                                            {
                                                v49 = (char)v78[7] * 0x100000000000000 | (*(int *)v78 * 0x100 | ((short)v78[4] | (char)v78[6] * 0x10000) * 0x10000000000) >> 8;
                                            }
                                            else
                                            {
                                                a0->field_8 = 19;
                                                a0->field_10 = v78;
                                                *(unsigned long long *)a0->padding_0 = 2;
                                                return a0;
                                            }
                                        }
                                    }
                                    v3 = iter;
LABEL_c51ba0:
                                    if (v25 > v45 && v49 > v45)
                                    {
                                        *(unsigned long long *)a0->padding_0 = 1;
                                        a0->field_8 = v45;
                                        a0->field_10 = v49;
                                        return a0;
                                    }
                                    goto LABEL_c51cd4;
                                }
                                else if (v16 == 3)
                                {
                                    if (v74 > 7)
                                    {
                                        v45 = (char)v75[7] * 0x100000000000000 | (*(int *)v75 * 0x100 | ((short)v75[4] | (char)v75[6] * 0x10000) * 0x10000000000) >> 8;
                                        goto LABEL_c51d78;
                                    }
                                    else
                                    {
                                        a0->field_8 = 19;
                                        a0->field_10 = v75;
                                        *(unsigned long long *)a0->padding_0 = 2;
                                        return a0;
                                    }
                                }
                            }
                            goto LABEL_c51f58;
                        }
                    } while ((node += 1, v70 += 7, iter1 -= 1, v72 = arm64g_calculate_condition(18, iter1, 1, 0), v72 & 1));
                }
                iter = v57 + v54;
                a1->field_20 = iter;
                a1->field_28 = 0;
                a1->field_20 = 1;
                a1->field_28 = 0;
                a0->field_8 = 19;
                a0->field_10 = iter;
                *(unsigned long long *)a0->padding_0 = 2;
                return a0;
            }
            if (5 >= (int)v30)
            {
                if ((unsigned int)v30 == 4)
                {
                    if (!v28)
                    {
                        a1->field_20 = 1;
                        a1->field_28 = 0;
                        a0->field_8 = 19;
                        a0->field_10 = v31;
                        *(unsigned long long *)a0->padding_0 = 2;
                        return a0;
                    }
                    iter = 0;
                    v34 = 0;
                    w30 = 0;
                    iter1 = i - 3;
                    node = v11 + 3;
                    v35 = i - 1;
                    while (1)
                    {
                        v36 = v11 + iter;
                        v37 = v36->field_1;
                        v38 = &v36->field_1;
                        if (w30 == 63 && 1 < (unsigned int)v37)
                            break;
                        v39 = v35 - 1;
                        v34 |= (v37 & 127) << ((char)w30 & 63);
                        if (v37 >> 7 & 1)
                        {
                            w30 = w30 + 7;
                            iter += 1;
                            iter1 -= 1;
                            node += 1;
                            v35 = v39;
                            if (v28 == iter)
                            {
                                v31 = v11 + i;
                                a1->field_20 = v31;
                                a1->field_28 = 0;
                                a1->field_20 = 1;
                                a1->field_28 = 0;
                                a0->field_8 = 19;
                                a0->field_10 = v31;
                                *(unsigned long long *)a0->padding_0 = 2;
                                return a0;
                            }
                        }
                        else
                        {
                            iter = v38 + 1;
                            a1->field_20 = iter;
                            a1->field_28 = v39;
                            if (!v39)
                            {
                                a1->field_20 = 1;
                                a1->field_28 = 0;
                                a0->field_8 = 19;
                                a0->field_10 = iter;
                                *(unsigned long long *)a0->padding_0 = 2;
                                return a0;
                            }
                            iter = 0;
                            v40 = 0;
                            while (1)
                            {
                                v41 = *((char *)node - 1);
                                if (v40 == 63 && 1 < (unsigned int)v41)
                                {
                                    a1->field_20 = 1;
                                    a1->field_28 = 0;
                                    a0->field_8 = 6;
                                    a0->field_10 = v1;
                                    *(unsigned long long *)a0->padding_0 = 2;
                                    return a0;
                                }
                                iter |= (v41 & 127) << ((char)v40 & 63);
                                if (!(v41 >> 7 & 1))
                                    break;
                                node += 1;
                                v40 += 7;
                                iter1 -= 1;
                                v42 = arm64g_calculate_condition(18, iter1, 1, 0);
                                if (!(v42 & 1))
                                {
                                    iter = &v38[v35];
                                    a1->field_20 = iter;
                                    a1->field_28 = 0;
                                    a1->field_20 = 1;
                                    a1->field_28 = 0;
                                    a0->field_8 = 19;
                                    a0->field_10 = iter;
                                    *(unsigned long long *)a0->padding_0 = 2;
                                    return a0;
                                }
                            }
                            a1->field_20 = node;
                            a1->field_28 = iter1;
                            v9 = v34 >> 8;
                            v0 = iter;
                            if (v20 >= v25)
                                goto LABEL_c51cd4;
LABEL_c51674:
                            v45 = v20 + v34 & v17;
                            v49 = v20 + iter & v17;
                            goto LABEL_c51ba0;
                        }
                    }
LABEL_c51e38:
                    a1->field_20 = 1;
                    a1->field_28 = 0;
                    a0->field_8 = 6;
                    a0->field_10 = iter;
                    *(unsigned long long *)a0->padding_0 = 2;
                    return a0;
                }
                if ((unsigned int)v30 != 5)
                {
                    a1->field_20 = 1;
                    a1->field_28 = 0;
                    a0->field_8 = 24 | (v9 & 0xffffffffffff00 | v30) * 0x100;
                    a0->field_10 = iter;
                    *(unsigned long long *)a0->padding_0 = 2;
                    return a0;
                }
                if ((((unsigned int)v12 ^ (unsigned int)v12 - 1) & 0xff) <= ((unsigned int)v12 - 1 & 0xff))
                {
                    a1->field_20 = 1;
                    a1->field_28 = 0;
                    a0->field_8 = 25 | v24 * 0x100;
                    a0->field_10 = iter;
                    *(unsigned long long *)a0->padding_0 = 2;
                    return a0;
                }
                if (1 >= v16)
                {
                    if (v16)
                    {
                        if (v16 != 1)
                        {
                            a1->field_20 = 1;
                            a1->field_28 = 0;
                            a0->field_8 = 25 | v24 * 0x100;
                            a0->field_10 = iter;
                            *(unsigned long long *)a0->padding_0 = 2;
                            return a0;
                        }
                        else if (v28 > 1)
                        {
                            iter1 = i - 3;
                            node = v11 + 3;
                            a1->field_20 = node;
                            a1->field_28 = iter1;
                            v34 = (short)v11[1];
                            v9 = v34 >> 8;
                        }
                        else
                        {
                            a1->field_20 = 1;
                            a1->field_28 = 0;
                            a0->field_8 = 19;
                            a0->field_10 = v31;
                            *(unsigned long long *)a0->padding_0 = 2;
                            return a0;
                        }
                    }
                    else
                    {
                        if (v28)
                        {
                            iter1 = i - 2;
                            node = v11 + 2;
                            a1->field_20 = node;
                            a1->field_28 = iter1;
                            v34 = (char)v11[1];
                            v9 = v34 >> 8;
                        }
                        else
                        {
                            a1->field_20 = 1;
                            a1->field_28 = 0;
                            a0->field_8 = 19;
                            a0->field_10 = v31;
                            *(unsigned long long *)a0->padding_0 = 2;
                            return a0;
                        }
                    }
                }
                else
                {
                    if (v16 != 2)
                    {
                        if (v16 != 3)
                        {
LABEL_c51ec8:
                            a1->field_20 = 1;
                            a1->field_28 = 0;
                            a0->field_8 = 25 | v24 * 0x100;
                            a0->field_10 = iter;
                            *(unsigned long long *)a0->padding_0 = 2;
                            return a0;
                        }
                        else if (v28 > 7)
                        {
                            iter1 = i - 9;
                            node = v11 + 9;
                            a1->field_20 = node;
                            a1->field_28 = iter1;
                            v34 = (char)v11[8] * 0x100000000000000 | ((int)v11[1] * 0x100 | ((short)v11[5] | (char)v11[7] * 0x10000) * 0x10000000000) >> 8;
                            v9 = v34 >> 8;
                        }
                        else
                        {
                            a1->field_20 = 1;
                            a1->field_28 = 0;
                            a0->field_8 = 19;
                            a0->field_10 = v31;
                            *(unsigned long long *)a0->padding_0 = 2;
                            return a0;
                        }
                    }
                    else
                    {
                        if (v28 > 3)
                        {
                            iter1 = i - 5;
                            node = v11 + 5;
                            a1->field_20 = node;
                            a1->field_28 = iter1;
                            v34 = (int)v11[1];
                            v9 = v34 >> 8;
                        }
                        else
                        {
                            a1->field_20 = 1;
                            a1->field_28 = 0;
                            a0->field_8 = 19;
                            a0->field_10 = v31;
                            *(unsigned long long *)a0->padding_0 = 2;
                            return a0;
                        }
                    }
                }
LABEL_c51ccc:
                a1->field_10 = v34;
                v20 = v34;
            }
            else
            {
                if ((unsigned int)v30 == 6)
                {
                    if ((((unsigned int)v12 ^ (unsigned int)v12 - 1) & 0xff) <= ((unsigned int)v12 - 1 & 0xff))
                    {
                        a1->field_20 = 1;
                        a1->field_28 = 0;
                        a0->field_8 = 25 | v24 * 0x100;
                        a0->field_10 = iter;
                        *(unsigned long long *)a0->padding_0 = 2;
                        return a0;
                    }
                    if (1 >= v16)
                    {
                        if (v16)
                        {
                            if (v16 == 1)
                            {
                                if (v28 > 1)
                                {
                                    v50 = i - 3;
                                    iter = v11 + 3;
                                    a1->field_20 = iter;
                                    a1->field_28 = v50;
                                    if (v50 <= 1)
                                    {
                                        a1->field_20 = 1;
                                        a1->field_28 = 0;
                                        a0->field_8 = 19;
                                        a0->field_10 = iter;
                                        *(unsigned long long *)a0->padding_0 = 2;
                                        return a0;
                                    }
                                    v45 = (short)v11[1];
                                    iter1 = i - 5;
                                    node = v11 + 5;
                                    a1->field_20 = node;
                                    a1->field_28 = iter1;
                                    iter = (short)v11[3];
                                    goto LABEL_c51b98;
                                }
                                else
                                {
                                    a1->field_20 = 1;
                                    a1->field_28 = 0;
                                    a0->field_8 = 19;
                                    a0->field_10 = v31;
                                    *(unsigned long long *)a0->padding_0 = 2;
                                    return a0;
                                }
                            }
                        }
                        else
                        {
                            if (v28)
                            {
                                iter = v11 + 2;
                                a1->field_20 = iter;
                                a1->field_28 = i - 2;
                                if (i == 2)
                                {
                                    a1->field_20 = 1;
                                    a1->field_28 = 0;
                                    a0->field_8 = 19;
                                    a0->field_10 = iter;
                                    *(unsigned long long *)a0->padding_0 = 2;
                                    return a0;
                                }
                                v45 = (char)v11[1];
                                iter1 = i - 3;
                                node = v11 + 3;
                                a1->field_20 = node;
                                a1->field_28 = iter1;
                                iter = (char)v11[2];
                                goto LABEL_c51b98;
                            }
                            else
                            {
                                a1->field_20 = 1;
                                a1->field_28 = 0;
                                a0->field_8 = 19;
                                a0->field_10 = v31;
                                *(unsigned long long *)a0->padding_0 = 2;
                                return a0;
                            }
                        }
                    }
                    else
                    {
                        if (v16 == 2)
                        {
                            if (v28 <= 3)
                            {
                                a1->field_20 = 1;
                                a1->field_28 = 0;
                                a0->field_8 = 19;
                                a0->field_10 = v31;
                                *(unsigned long long *)a0->padding_0 = 2;
                                return a0;
                            }
                            v52 = i - 5;
                            iter = v11 + 5;
                            a1->field_20 = iter;
                            a1->field_28 = v52;
                            if (v52 <= 3)
                            {
                                a1->field_20 = 1;
                                a1->field_28 = 0;
                                a0->field_8 = 19;
                                a0->field_10 = iter;
                                *(unsigned long long *)a0->padding_0 = 2;
                                return a0;
                            }
                            v45 = (int)v11[1];
                            iter1 = i - 9;
                            node = v11 + 9;
                            a1->field_20 = node;
                            a1->field_28 = iter1;
                            iter = (int)v11[5];
LABEL_c51b98:
                            v9 = v45 >> 8;
                            v49 = iter;
                            goto LABEL_c51ba0;
                        }
                        else if (v16 == 3)
                        {
                            if (v28 > 7)
                            {
                                v51 = i - 9;
                                iter = v11 + 9;
                                a1->field_20 = iter;
                                a1->field_28 = v51;
                                if (v51 <= 7)
                                {
                                    a1->field_20 = 1;
                                    a1->field_28 = 0;
                                    a0->field_8 = 19;
                                    a0->field_10 = iter;
                                    *(unsigned long long *)a0->padding_0 = 2;
                                    return a0;
                                }
                                v45 = (char)v11[8] * 0x100000000000000 | ((int)v11[1] | ((short)v11[5] | (char)v11[7] * 0x10000) * 0x100000000) & 0xffffffffffffff;
                                iter1 = i - 0x11;
                                node = v11 + 0x11;
                                a1->field_20 = node;
                                a1->field_28 = iter1;
                                iter = (char)v11[16] * 0x100000000000000 | ((int)v11[9] * 0x100 | ((short)v11[13] | (char)v11[15] * 0x10000) * 0x10000000000) >> 8;
                                goto LABEL_c51b98;
                            }
                            else
                            {
                                a1->field_20 = 1;
                                a1->field_28 = 0;
                                a0->field_8 = 19;
                                a0->field_10 = v31;
                                *(unsigned long long *)a0->padding_0 = 2;
                                return a0;
                            }
                        }
                    }
                    goto LABEL_c51ec8;
                }
                if ((unsigned int)v30 != 7)
                {
                    a1->field_20 = 1;
                    a1->field_28 = 0;
                    a0->field_8 = 24 | (v9 & 0xffffffffffff00 | v30) * 0x100;
                    a0->field_10 = iter;
                    *(unsigned long long *)a0->padding_0 = 2;
                    return a0;
                }
                if ((((unsigned int)v12 ^ (unsigned int)v12 - 1) & 0xff) <= ((unsigned int)v12 - 1 & 0xff))
                {
                    a1->field_20 = 1;
                    a1->field_28 = 0;
                    a0->field_8 = 25 | v24 * 0x100;
                    a0->field_10 = iter;
                    *(unsigned long long *)a0->padding_0 = 2;
                    return a0;
                }
                if (1 >= v16)
                {
                    if (v16)
                    {
                        if (v16 != 1)
                        {
                            a1->field_20 = 1;
                            a1->field_28 = 0;
                            a0->field_8 = 25 | v24 * 0x100;
                            a0->field_10 = iter;
                            *(unsigned long long *)a0->padding_0 = 2;
                            return a0;
                        }
                        else if (v28 > 1)
                        {
                            v43 = i - 3;
                            v44 = v11 + 3;
                            a1->field_20 = v44;
                            a1->field_28 = v43;
                            v45 = (short)v11[1];
                            goto LABEL_c51ad4;
                        }
                        else
                        {
                            a1->field_20 = 1;
                            a1->field_28 = 0;
                            a0->field_8 = 19;
                            a0->field_10 = v31;
                            *(unsigned long long *)a0->padding_0 = 2;
                            return a0;
                        }
                    }
                    else
                    {
                        if (v28)
                        {
                            v43 = i - 2;
                            v44 = v11 + 2;
                            a1->field_20 = v44;
                            a1->field_28 = v43;
                            v45 = (char)v11[1];
                            goto LABEL_c51ad4;
                        }
                        else
                        {
                            a1->field_20 = 1;
                            a1->field_28 = 0;
                            a0->field_8 = 19;
                            a0->field_10 = v31;
                            *(unsigned long long *)a0->padding_0 = 2;
                            return a0;
                        }
                    }
                }
                if (v16 == 2)
                {
                    if (v28 <= 3)
                    {
                        a1->field_20 = 1;
                        a1->field_28 = 0;
                        a0->field_8 = 19;
                        a0->field_10 = v31;
                        *(unsigned long long *)a0->padding_0 = 2;
                        return a0;
                    }
                    v43 = i - 5;
                    v44 = v11 + 5;
                    a1->field_20 = v44;
                    a1->field_28 = v43;
                    v45 = (int)v11[1];
LABEL_c51ad4:
                    if (v43)
                    {
                        iter = 0;
                        v46 = 0;
                        iter1 = v43 - 1;
                        node = v44 + 1;
                        do
                        {
                            v47 = *((char *)node - 1);
                            if (v46 == 63 && 1 < (unsigned int)v47)
                            {
                                a1->field_20 = node;
                                a1->field_20 = 1;
                                a1->field_28 = 0;
                                a0->field_8 = 6;
                                a0->field_10 = a4;
                                *(unsigned long long *)a0->padding_0 = 2;
                                return a0;
                            }
                            iter |= (v47 & 127) << ((char)v46 & 63);
                            if (!(v47 >> 7 & 1))
                            {
                                a1->field_20 = node;
                                a1->field_28 = iter1;
                                v9 = v45 >> 8;
                                v49 = v17 & iter + v45;
                                goto LABEL_c51ba0;
                            }
                        } while ((node += 1, v46 += 7, iter1 -= 1, v48 = arm64g_calculate_condition(18, iter1, 1, 0), v48 & 1));
                        v44 += v43;
                        a1->field_20 = v44;
                        a1->field_28 = 0;
                    }
                    a1->field_20 = 1;
                    a1->field_28 = 0;
                    a0->field_8 = 19;
                    a0->field_10 = v44;
                    *(unsigned long long *)a0->padding_0 = 2;
                    return a0;
                }
                else if (v16 == 3)
                {
                    if (v28 > 7)
                    {
                        v43 = i - 9;
                        v44 = v11 + 9;
                        a1->field_20 = v44;
                        a1->field_28 = v43;
                        v45 = (char)v11[8] * 0x100000000000000 | ((int)v11[1] * 0x100 | ((short)v11[5] | (char)v11[7] * 0x10000) * 0x10000000000) >> 8;
                        goto LABEL_c51ad4;
                    }
                    else
                    {
                        a1->field_20 = 1;
                        a1->field_28 = 0;
                        a0->field_8 = 19;
                        a0->field_10 = v31;
                        *(unsigned long long *)a0->padding_0 = 2;
                        return a0;
                    }
                }
                goto LABEL_c51ec8;
            }
LABEL_c51cd4:
            i = iter1;
        } while (i);
    }
    *(unsigned long long *)a0->padding_0 = 0;
    return a0;
}
