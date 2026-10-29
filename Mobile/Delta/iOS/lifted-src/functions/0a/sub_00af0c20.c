/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xaf0c20..0xaf1040 (1056 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned long long sub_af0c20(char *a0, unsigned long long a1, char *a2, unsigned long long a3, unsigned long long a4)
{
    unsigned long long v2;  // x19
    char *v3;  // x20
    unsigned long long v12;  // w8
    unsigned long v13;  // cc_dep1
    unsigned long long v14;  // w8
    unsigned int v15;  // w9
    unsigned long long v16;  // 4112
    unsigned long long v17;  // 4102
    unsigned long long v18;  // 4112
    unsigned long long v19;  // 4102
    unsigned long v20;  // cc_dep1
    unsigned int v21;  // w8
    unsigned long long v4;  // x28
    unsigned long long v22;  // 4112
    unsigned long long v23;  // 4102
    unsigned long long v24;  // 4112
    unsigned long long v25;  // 4102
    unsigned long long v26;  // x24
    unsigned long long v27;  // x21
    unsigned long long v28;  // x8
    char *v29;  // x10
    char *v30;  // x9
    unsigned long long v31;  // w12
    char *v5;  // x23
    unsigned long long v32;  // w11
    unsigned int v33;  // w12
    unsigned int v34;  // w11
    unsigned long long v36;  // 4112
    unsigned long v37;  // x8
    unsigned long long v38;  // x9
    unsigned long v39;  // x11
    unsigned int v40;  // w13
    unsigned long long v41;  // w12
    unsigned long long v6;  // x26
    unsigned int v42;  // w13
    unsigned int v43;  // w12
    unsigned long long v45;  // 4109
    unsigned long long v46;  // w8
    unsigned long long v47;  // x0
    char *v48;  // x9
    unsigned long long v49;  // x10
    unsigned long v50;  // cc_op
    unsigned long long v51;  // w10
    unsigned long long v7;  // w25
    unsigned long long v52;  // x10
    unsigned long long v53;  // x10
    unsigned long long v54;  // w11
    unsigned int v55;  // w13
    unsigned long long v56;  // 4112
    unsigned long long v57;  // 4102
    unsigned long long v58;  // 4112
    unsigned long long v59;  // 4102
    unsigned long v60;  // cc_dep1
    unsigned long long v61;  // x12
    unsigned long long v8;  // x27
    unsigned int v62;  // w12
    unsigned long long v63;  // 4112
    unsigned long long v64;  // 4102
    unsigned long long v65;  // 4112
    unsigned long long v66;  // 4102
    char *v67;  // x10
    unsigned long long v68;  // x9
    char *iter;  // x8
    unsigned long long v71;  // x19
    char *v9;  // x24
    unsigned long long v72;  // w10
    unsigned long long v73;  // w9
    unsigned int v74;  // w10
    unsigned int v75;  // w9
    unsigned long long i;  // x21
    unsigned long long v11;  // x21
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a3;
    v3 = a2;
    v4 = a1;
    v5 = a0;
    if (a3 >= 2)
    {
        if (v4 && *v3 != 46)
            goto LABEL_af0c70;
    }
    else
    {
        if (v4)
        {
LABEL_af0c70:
            v6 = 0;
            v7 = 0;
            v8 = 1;
            v9 = v5;
            i = v4;
            do
            {
                v11 = i;
                v12 = *v9;
                v13 = v12 & 0xff;
                if (v12 == 42)
                {
                    if (v11 == 1)
                    {
                        v14 = 1;
                        if (!v6)
                            goto LABEL_af0d20;
                        else
                            goto LABEL_af0dd4;
                    }
                    else
                    {
                        v14 = v9[1] == 46;
                        if (v6)
                            goto LABEL_af0dd4;
                        else
                            goto LABEL_af0d20;
                    }
LABEL_af0d20:
                    if ((unsigned int)v8 & 8 || v7 || (unsigned int)a4 & 4 && !(v8 & 1 & v14 & 1) || !(v8 & 1) && !(v14 & 1))
                        goto LABEL_af0dd4;
                    v7 = 0;
                    v8 = (unsigned int)v8 & 0xfffffff6;
                    v6 = v9;
                    continue;
                }
                v15 = (v12 & 223) - 65;
                if (10 <= v12 - 48)
                {
                    v16 = arm64g_calculate_condition(35, v13, 42, 0);
                    v17 = arm64g_calculate_condition(131, (v16 & 1 ? v15 : 0), (v16 & 1 ? 25 : 0), 0);
                    if (v17 & 1)
                        goto LABEL_af0d58;
                    goto LABEL_af0cd8;
                }
                else
                {
                    v18 = arm64g_calculate_condition(35, v13, 42, 0);
                    v19 = arm64g_calculate_condition(128, (v18 & 1 ? v15 : 0), (v18 & 1 ? 25 : 0), 0);
                    if (!(v19 & 1))
                    {
LABEL_af0cd8:
                        if (v8 & 1 && v11 >= 4)
                        {
                            if (!sub_a6e258(v9, "xn--", 4))
                                v8 = 8;
                            else
                                v8 &= 0xffffffff;
                        }
                        v8 = (unsigned int)v8 & 0xfffffffa;
                        continue;
                    }
                    else
                    {
LABEL_af0d58:
                        v20 = v12 & 0xff;
                        if (v12 != 45)
                        {
                            v21 = (unsigned int)v8 & 5;
                            if (v12 == 46)
                            {
                                v22 = arm64g_calculate_condition(3, v20, 45, 0);
                                v23 = arm64g_calculate_condition(19, (v22 & 1 ? v21 : 0), 0, 0);
                                if (v23 & 1)
                                    goto LABEL_af0dd4;
                                else
                                    goto LABEL_af0d74;
                            }
                            else
                            {
                                v24 = arm64g_calculate_condition(3, v20, 45, 0);
                                v25 = arm64g_calculate_condition(16, (v24 & 1 ? v21 : 0), 0, 0);
                                if (v25 & 1)
                                    goto LABEL_af0dd4;
                                else
                                    goto LABEL_af0d74;
                            }
LABEL_af0d74:
                            v7 += 1;
                            v8 = 1;
                            continue;
                        }
                        else
                        {
                            if (v8 & 1)
                                goto LABEL_af0dd4;
                            v8 = (unsigned int)v8 | 4;
                        }
                    }
                }
                v9 += 1;
                i = v11 - 1;
            } while (i);
            if (!((unsigned int)v8 & 5) && v7 >= 2 && v6)
            {
                v26 = v6 - v5;
                v27 = &v5[v4 + ~v6];
                if (v2 < v27 + v26)
                    return 0;
                if (v26)
                {
                    v28 = &v5[-1 * v6];
                    v29 = v5;
                    v30 = v3;
                    do
                    {
                        v31 = *v29;
                        if (!v31)
                            return 0;
                        v32 = *v30;
                        if (v31 != v32)
                        {
                            if (v31 - 65 < 26)
                                v33 = v31 | 32;
                            else
                                v33 = v31 & 0xff;
                            if (v32 - 65 < 26)
                                v34 = v32 | 32;
                            else
                                v34 = v32 & 0xff;
                            if (v33 != v34)
                                return 0;
                        }
                        v29 += 1;
                        v30 += 1;
                        v36 = arm64g_calculate_condition(0x22, v28, 1, 0);
                        v28 += 1;
                    } while (!(v36 & 1));
                }
                v37 = v6 + 1;
                if (v27)
                {
                    v38 = v6 - &v5[v4] + 1;
                    v39 = v37;
                    do
                    {
                        v40 = v3[v38 + v2];
                        if (!v40)
                            return 0;
                        v41 = *(char *)v39;
                        if (v40 != v41)
                        {
                            if (v40 - 65 < 26)
                                v42 = v40 | 32;
                            else
                                v42 = v40 & 0xff;
                            if (v41 - 65 < 26)
                                v43 = v41 | 32;
                            else
                                v43 = v41 & 0xff;
                            if (v42 != v43)
                                return 0;
                        }
                        v39 += 1;
                        v45 = arm64g_calculate_condition(0x22, v38, 1, 0);
                        v38 += 1;
                    } while (!(v45 & 1));
                }
                if (!v26 && *(char *)v37 == 46)
                {
                    if (v2 == v27)
                        return 0;
                    v46 = __ROL__((unsigned int)a4, 29) & 3758096385 & 1;
                }
                else
                {
                    if (v2 >= 4)
                    {
                        v47 = sub_a6e258(v3, "xn--", 4);
                        if (!(unsigned int)v47)
                            return v47;
                    }
                    v46 = 0;
                }
                v48 = &v3[v26];
                v49 = v2 - v27;
                if (&v3[v49] != v48 + 1)
                {
                    v50 = 4;
                    if (v49 == v26)
                        return 1;
                }
                else if (v49 == v26 || !(v51 = *v48, v50 = 3, v49 = v51 & 0xff, v26 = 42, v51 != 42))
                {
                    return 1;
                }
                v52 = v2 - v4 + 1;
                while (1)
                {
                    v53 = v52;
                    v54 = *v48;
                    v55 = v54 - 65;
                    if (10 <= v54 - 48)
                    {
                        v56 = arm64g_calculate_condition(v50 | 32, v49, v26, 0);
                        v57 = arm64g_calculate_condition(0x33, (v56 & 1 ? v55 : 0), (v56 & 1 ? 26 : 0), 0);
                        if (!(v57 & 1))
                            goto LABEL_af1020;
                    }
                    else
                    {
                        v58 = arm64g_calculate_condition(v50 | 32, v49, v26, 0);
                        v59 = arm64g_calculate_condition(48, (v58 & 1 ? v55 : 0), (v58 & 1 ? 26 : 0), 0);
                        if (!(v59 & 1))
                        {
LABEL_af1020:
                            v60 = v54 & 0xff;
                            if (v54 != 46)
                                v61 = 0;
                            else
                                v61 = v46;
                            if (!(v61 & 1))
                            {
                                v62 = v54 - 97;
                                if (v54 != 45)
                                {
                                    v63 = arm64g_calculate_condition(19, v60, 46, 0);
                                    v64 = arm64g_calculate_condition(147, (v63 & 1 ? v62 : 0), (v63 & 1 ? 25 : 0), 0);
                                    if (!(v64 & 1))
                                        break;
                                }
                                else
                                {
                                    v65 = arm64g_calculate_condition(19, v60, 46, 0);
                                    v66 = arm64g_calculate_condition(144, (v65 & 1 ? v62 : 0), (v65 & 1 ? 25 : 0), 0);
                                    if (!(v66 & 1))
                                        break;
                                }
                            }
                        }
                    }
                    v48 += 1;
                    v52 = v53 - 1;
                    v50 = 4;
                    v26 = 1;
                    v49 = v53;
                    if (v49 == 1)
                        return 1;
                }
                goto LABEL_af0ee0;
            }
        }
    }
LABEL_af0dd4:
    if (a4 >> 15 & 1)
    {
        v67 = v5;
        v68 = v4;
        if (v68 > v2)
        {
            iter = &v5[v4 + -1 * v2];
            v67 = v5;
            v68 = v4;
            do
            {
                if (!*v67 || *v67 == 46 & (unsigned int)a4 >> 4 & 1)
                    goto LABEL_af0e70;
            } while ((v67 += 1, v68 -= 1, v2 < v68));
        }
        else
        {
LABEL_af0e70:
            iter = v67;
            if (v68 != v2)
                goto LABEL_af0e7c;
        }
    }
    else
    {
LABEL_af0e7c:
        iter = v5;
        if (v4 != v2)
        {
LABEL_af0ee0:
            return 0;
        }
    }
    if (!v2)
        return 1;
    while (1)
    {
        v71 = v2;
        v72 = *iter;
        if (!v72)
            return 0;
        v73 = *v3;
        if (v72 != v73)
        {
            if (v72 - 65 < 26)
                v74 = v72 | 32;
            else
                v74 = v72 & 0xff;
            if (v73 - 65 < 26)
                v75 = v73 | 32;
            else
                v75 = v73 & 0xff;
            if (v74 != v75)
                return 0;
        }
        iter += 1;
        v3 += 1;
        v2 = v71 - 1;
        if (v71 == 1)
            return 1;
    }
}
