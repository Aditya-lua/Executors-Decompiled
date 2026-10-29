/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3cb15c..0x3cb9f4 (2200 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3cb15c_0 {
    char field_0;
} st_3cb15c_0;

typedef struct st_3cb15c_1 {
    unsigned long long field_0;
} st_3cb15c_1;

extern char g_454247;
extern st_3cb15c_1 *g_f0b120;
extern char g_1000001;
extern char g_10002b0;

unsigned int sub_3cb15c(long long a0, unsigned int *a1, unsigned int *a2, unsigned int a3, unsigned int a4)
{
    unsigned int *ptr;  // x24
    unsigned long v20;  // cc_op
    unsigned int iter;  // x27
    unsigned long v108;  // x26
    unsigned int v109;  // w28
    unsigned long long v110;  // x25
    char v111;  // x0
    unsigned int v112;  // x8
    unsigned long v113;  // x10
    unsigned int v114;  // x9
    char *iter1;  // x10
    unsigned long long i2;  // x11
    unsigned long v26;  // cc_dep1
    unsigned long long v117;  // x11
    char *iter2;  // x10
    unsigned int i3;  // w8
    unsigned int v121;  // w8
    char *v123;  // x28
    unsigned long long v124;  // x25
    unsigned long long j;  // x27
    unsigned int *v126;  // x26
    unsigned long v27;  // cc_dep2
    long long v127;  // x25
    unsigned int v128;  // x27
    unsigned int i4;  // x25
    unsigned long v28;  // cc_ndep
    unsigned long v29;  // 4110
    unsigned long long v30;  // 4102
    unsigned int v31;  // w9
    unsigned long long v32;  // 4112
    unsigned long long v33;  // 4102
    unsigned long long v34;  // 4112
    unsigned long long v35;  // 4102
    unsigned int v36;  // w20
    unsigned int v37;  // x9
    unsigned long long v38;  // 4112
    unsigned long long v39;  // 4102
    unsigned long long v40;  // 4112
    unsigned long long v41;  // 4102
    unsigned long long num;  // x20
    char *v43;  // x8
    unsigned int i;  // w9
    unsigned long long num1;  // x0
    unsigned long long v46;  // x21
    unsigned long v47;  // x22
    unsigned int v48;  // x0
    unsigned int ptr1;  // x23
    unsigned int v50;  // x28
    unsigned long long v51;  // w25
    unsigned long long v52;  // w26
    unsigned long v53;  // x27
    unsigned int v54;  // x28
    unsigned int v55;  // w27
    unsigned long long v56;  // x25
    unsigned long v21;  // 4110
    char v57;  // x0
    unsigned int v58;  // x8
    unsigned long v59;  // x10
    unsigned int v60;  // x9
    char *node;  // x10
    unsigned long long k;  // x11
    unsigned long long v63;  // x11
    char *v65;  // x10
    unsigned int l;  // w8
    unsigned long v22;  // cc_op
    unsigned int v67;  // w8
    char *v69;  // x27
    unsigned long long v70;  // x25
    unsigned int v71;  // x27
    unsigned long v72;  // x26
    unsigned int v73;  // w28
    unsigned long long v74;  // x25
    char v75;  // x0
    unsigned int v76;  // x8
    unsigned long v23;  // cc_dep1
    unsigned long v77;  // x10
    unsigned int v78;  // x9
    char *v79;  // x10
    unsigned long long m;  // x11
    unsigned long long v81;  // x11
    char *v83;  // x10
    unsigned int n;  // w8
    unsigned int v85;  // w8
    unsigned long v24;  // cc_dep2
    char *v87;  // x28
    unsigned long long v88;  // x25
    unsigned int v89;  // x27
    unsigned long v90;  // x26
    unsigned int v91;  // w28
    unsigned long long v92;  // x25
    char v93;  // x0
    unsigned int v94;  // x8
    unsigned long v95;  // x10
    unsigned int v96;  // x9
    unsigned long long v25;  // 4102
    char *v97;  // x10
    unsigned long long i0;  // x11
    unsigned long long v99;  // x11
    char *v101;  // x10
    unsigned int i1;  // w8
    unsigned int v103;  // w8
    char *v105;  // x28
    unsigned long long v106;  // x25
    unsigned long long v0;  // [bp-0x4c8]
    unsigned long long v1;  // [bp-0x4c0]
    unsigned long long v2;  // [bp-0x4b8]
    unsigned int v3;  // [bp-0x4b0]
    unsigned long long v4;  // [bp-0x4a8]
    long long v5;  // [bp-0x4a0]
    unsigned long v6;  // [bp-0x498]
    st_3cb15c_0 **v7;  // [bp-0x490], Other Possible Types: char
    st_3cb15c_0 *v8;  // [bp-0x488]
    char v9;  // [bp-0x480]
    char v10;  // [bp-0x47f]
    char v11;  // [bp-0x47e]
    char v12;  // [bp-0x47d]
    char v13;  // [bp-0x47c]
    char *v14;  // [bp-0x478], Other Possible Types: unsigned long
    char v15[1024];  // [bp-0x470]
    unsigned long v16;  // [bp-0x70]
    char *v17;  // [bp-0x10]
    char v18;  // [bp+0x0]

    v17 = &v18;
    ptr = a2;
    v16 = *(long long *)&g_10002b0;
    v8 = &v7;
    v7 = &v8;
    sub_3cee9c();
    if (*(unsigned long long *)v15 == 5638868765947084579)
    {
        v21 = arm64g_calculate_condition(v20, v26, v27, v28);
        v22 = 4;
        v23 = (v21 & 1 ? *(unsigned long long *)((void*)v15 + 3) : 0);
        v24 = (v21 & 1 ? 19495776774865985 : 0);
        v25 = arm64g_calculate_condition(4, v23, v24, 0);
        if (!(v25 & 1))
            goto LABEL_3cb1ec;
    }
    else
    {
        v29 = arm64g_calculate_condition(v20, v26, v27, v28);
        v22 = 0;
        v23 = (v29 & 1 ? *(unsigned long long *)((void*)v15 + 3) : 0);
        v24 = (v29 & 1 ? 19495776774865985 : 0);
        v30 = arm64g_calculate_condition(0, v23, v24, 0);
        if (!(v30 & 1))
        {
LABEL_3cb1ec:
            v31 = *(unsigned int *)((void*)v15 + 3);
            if (*(unsigned int *)v15 == 1196572451)
            {
                v32 = arm64g_calculate_condition(v22, v23, v24, 0);
                v33 = arm64g_calculate_condition(3, (v32 & 1 ? v31 : 0), (v32 & 1 ? &g_454247 : 0), 0);
                if (!(v33 & 1))
                    g_f0b120();
            }
            else
            {
                v34 = arm64g_calculate_condition(v22, v23, v24, 0);
                v35 = arm64g_calculate_condition(0, (v34 & 1 ? v31 : 0), (v34 & 1 ? &g_454247 : 0), 0);
                if (!(v35 & 1))
                    g_f0b120();
            }
        }
    }
    sub_3cee9c(a0, v15);
    if (*&v15[0])
    {
        v36 = 0;
        do
        {
            if (!(*(unsigned long long *)v15 ^ 3692199908960522054) && !(*(unsigned long long *)((void*)v15 + 8) ^ 7814413257030118706) && !(*(unsigned long long *)((void*)v15 + 15) ^ 28537169087784300))
                v36 = 1;
        } while ((sub_3cee9c(), *&v15[0]));
        if (v36)
        {
            sub_3cee9c(a0, v15);
            v37 = *&v15[2];
            if (*(unsigned short *)v15 == 22829)
            {
                v38 = arm64g_calculate_condition(v20, v26, v27, v28);
                v39 = arm64g_calculate_condition(19, (v38 & 1 ? v37 : 0), (v38 & 1 ? 32 : 0), 0);
                if (!(v39 & 1))
                    goto LABEL_3cb2e4;
            }
            else
            {
                v40 = arm64g_calculate_condition(v20, v26, v27, v28);
                v41 = arm64g_calculate_condition(16, (v40 & 1 ? v37 : 0), (v40 & 1 ? 32 : 0), 0);
                if (!(v41 & 1))
                {
LABEL_3cb2e4:
                    v14 = &v15[3];
                    num = _strtol(&v15[3], &v14, 10);
                    v43 = v14;
                    i = v15[3];
                    if (i == 32)
                    {
                        do
                        {
                            i = v43[1];
                            v43 += 1;
                        } while (i == 32);
                    }
                    v14 = v43;
                    if (i == 43 && v43[1] == 88 && v43[2] == 32)
                    {
                        v14 = v43 + 3;
                        num1 = _strtol(v14, 0, 10);
                        if (&g_1000001 > (int)num)
                        {
                            v46 = num1;
                            if (&g_1000001 > (int)v46)
                            {
                                *a1 = v46;
                                *ptr = num;
                                if (a3)
                                    *(unsigned int *)a3 = 3;
                                if (!a4)
                                    v47 = 3;
                                else
                                    v47 = a4;
                                if (sub_3d391c())
                                {
                                    v48 = sub_3d3c30(v46, num, v47, 4);
                                    if (v48)
                                    {
                                        ptr1 = v48;
                                        if (0xffff8008 > (unsigned int)v46 - 0x8000)
                                        {
                                            ptr = 0;
                                            while (1)
                                            {
                                                while (1)
                                                {
LABEL_3cb99c:
                                                    i4 = 0;
                                                    if ((int)num <= (int)(unsigned int)ptr)
                                                        break;
                                                    for (; (int)v46 > (int)i4; i4 += 1)
                                                    {
LABEL_3cb9b0:
                                                        sub_3cebbc(a0, &v13, 4);
                                                        sub_3d1c2c(ptr1 + ptr * v46 * v47 * 4 + v47 * i4 * 4, &v13, v47);
                                                        v48 = ptr1;
                                                    }
                                                    ptr = (unsigned int)ptr + 1;
                                                }
LABEL_3cb420:
                                                if (*(long long *)&g_10002b0 == v16)
                                                    break;
                                                v48 = ___stack_chk_fail();
                                            }
                                            return v48;
                                        }
                                        if ((int)num < 1)
                                            goto LABEL_3cb420;
                                        v50 = 0;
                                        ptr = 0;
                                        v3 = num & 0x7fffffff;
                                        v4 = v46 & 0x7fffffff;
                                        v1 = (long long)(v47 * 0x100000000) >> 63 & 0xfffffffc00000000 | __ROL__(v47, 2) & 0x3fffffffc & 0x3ffffffff;
                                        v2 = (unsigned int)v4 * (unsigned int)v47 * 4;
                                        v5 = v48;
                                        while (1)
                                        {
                                            v51 = (unsigned int)sub_3d706c(a0);
                                            v52 = (unsigned int)sub_3d706c(a0);
                                            v53 = (char)sub_3d706c(a0);
                                            if (v51 != 2 || v52 != 2 || v53 >> 31 & 1)
                                            {
                                                v9 = v51;
                                                v10 = v52;
                                                v11 = v53;
                                                v12 = sub_3d706c(a0);
                                                sub_3d1c2c(ptr1, &v9, v47);
                                                _free(ptr);
                                                ptr = 0;
                                                i4 = 1;
                                                goto LABEL_3cb9b0;
                                            }
                                            if ((sub_3d706c(a0) | (unsigned int)v53 * 0x100) != (unsigned int)v46)
                                            {
                                                _free(ptr1);
                                                _free(ptr);
                                                g_f0b120();
                                            }
                                            v0 = v50;
                                            if (!ptr && (ptr = sub_3ceae0(v46, 4, 0), !ptr))
                                                break;
                                            v54 = 0;
                                            v55 = v46;
                                            do
                                            {
                                                v56 = sub_3d706c(a0);
                                                if ((unsigned int)v56 > 128)
                                                {
                                                    v57 = sub_3d706c(a0);
                                                    v58 = (unsigned int)v56 & 127;
                                                    if (v55 >= v58)
                                                    {
                                                        if (!v58)
                                                            continue;
                                                        v59 = v54;
                                                        if (v58 == 1)
                                                        {
                                                            v60 = 0;
                                                            v54 = v59;
                                                        }
                                                        else
                                                        {
                                                            v60 = v58 & 126;
                                                            v54 = v60 + v59;
                                                            node = (char *)&ptr[v59] + 1;
                                                            k = v60;
                                                            do
                                                            {
                                                                v63 = k;
                                                                *(node - 4) = v57;
                                                                *node = v57;
                                                                node += 8;
                                                                k = v63 - 2;
                                                            } while (k);
                                                            if (v60 == v58)
                                                                continue;
                                                        }
                                                        v65 = &ptr[v54];
                                                        l = v58 - v60;
                                                        do
                                                        {
                                                            v67 = l;
                                                            v54 += 1;
                                                            *v65 = v57;
                                                            v65 += 4;
                                                            l = v67 - 1;
                                                        } while (l);
                                                    }
                                                    goto LABEL_3cb8c8;
                                                }
                                                else if ((unsigned int)v56 && v55 >= (unsigned int)v56)
                                                {
                                                    v69 = &ptr[v54];
                                                    v54 += v56;
                                                    do
                                                    {
                                                        v70 = v56;
                                                        *v69 = sub_3d706c(a0);
                                                        v69 += 4;
                                                        v56 = (unsigned int)v70 - 1;
                                                    } while ((unsigned int)v70 != 1);
                                                }
                                                else
                                                {
LABEL_3cb8c8:
                                                    _free(ptr1);
                                                    _free(ptr);
                                                    g_f0b120();
                                                }
                                            } while ((v55 = v46 - v54, (int)v46 > (int)v54));
                                            v71 = 0;
                                            v72 = (char *)ptr + 1;
                                            v6 = (char *)&ptr[1] + 1;
                                            v73 = v46;
                                            do
                                            {
                                                v74 = sub_3d706c(a0);
                                                if ((unsigned int)v74 > 128)
                                                {
                                                    v75 = sub_3d706c(a0);
                                                    v76 = (unsigned int)v74 & 127;
                                                    if (v73 < v76)
                                                        goto LABEL_3cb8c8;
                                                    if (!v76)
                                                        continue;
                                                    v77 = v71;
                                                    if (v76 == 1)
                                                    {
                                                        v78 = 0;
                                                        v71 = v77;
                                                    }
                                                    else
                                                    {
                                                        v78 = v76 & 126;
                                                        v71 = v78 + v77;
                                                        v79 = v6 + v77 * 4;
                                                        m = v78;
                                                        do
                                                        {
                                                            v81 = m;
                                                            *(v79 - 4) = v75;
                                                            *v79 = v75;
                                                            v79 += 8;
                                                            m = v81 - 2;
                                                        } while (m);
                                                        if (v78 == v76)
                                                            continue;
                                                    }
                                                    v83 = v72 + v71 * 4;
                                                    n = v76 - v78;
                                                    do
                                                    {
                                                        v85 = n;
                                                        v71 += 1;
                                                        *v83 = v75;
                                                        v83 += 4;
                                                        n = v85 - 1;
                                                    } while (n);
                                                }
                                                else
                                                {
                                                    if (!(unsigned int)v74 || v73 < (unsigned int)v74)
                                                        goto LABEL_3cb8c8;
                                                    v87 = v72 + v71 * 4;
                                                    v71 += v74;
                                                    do
                                                    {
                                                        v88 = v74;
                                                        *v87 = sub_3d706c(a0);
                                                        v87 += 4;
                                                        v74 = (unsigned int)v88 - 1;
                                                    } while ((unsigned int)v88 != 1);
                                                }
                                            } while ((v73 = v46 - v71, (int)v46 > (int)v71));
                                            v89 = 0;
                                            v90 = (char *)ptr + 2;
                                            v6 = (char *)&ptr[1] + 2;
                                            v91 = v46;
                                            do
                                            {
                                                v92 = sub_3d706c(a0);
                                                if ((unsigned int)v92 > 128)
                                                {
                                                    v93 = sub_3d706c(a0);
                                                    v94 = (unsigned int)v92 & 127;
                                                    if (v91 < v94)
                                                        goto LABEL_3cb8c8;
                                                    if (!v94)
                                                        continue;
                                                    v95 = v89;
                                                    if (v94 == 1)
                                                    {
                                                        v96 = 0;
                                                        v89 = v95;
                                                    }
                                                    else
                                                    {
                                                        v96 = v94 & 126;
                                                        v89 = v96 + v95;
                                                        v97 = v6 + v95 * 4;
                                                        i0 = v96;
                                                        do
                                                        {
                                                            v99 = i0;
                                                            *(v97 - 4) = v93;
                                                            *v97 = v93;
                                                            v97 += 8;
                                                            i0 = v99 - 2;
                                                        } while (i0);
                                                        if (v96 == v94)
                                                            continue;
                                                    }
                                                    v101 = v90 + v89 * 4;
                                                    i1 = v94 - v96;
                                                    do
                                                    {
                                                        v103 = i1;
                                                        v89 += 1;
                                                        *v101 = v93;
                                                        v101 += 4;
                                                        i1 = v103 - 1;
                                                    } while (i1);
                                                }
                                                else
                                                {
                                                    if (!(unsigned int)v92 || v91 < (unsigned int)v92)
                                                        goto LABEL_3cb8c8;
                                                    v105 = v90 + v89 * 4;
                                                    v89 += v92;
                                                    do
                                                    {
                                                        v106 = v92;
                                                        *v105 = sub_3d706c(a0);
                                                        v105 += 4;
                                                        v92 = (unsigned int)v106 - 1;
                                                    } while ((unsigned int)v106 != 1);
                                                }
                                            } while ((v91 = v46 - v89, (int)v46 > (int)v89));
                                            iter = 0;
                                            v108 = (char *)ptr + 3;
                                            v6 = (char *)&ptr[1] + 3;
                                            v109 = v46;
                                            do
                                            {
                                                v110 = sub_3d706c(a0);
                                                if ((unsigned int)v110 > 128)
                                                {
                                                    v111 = sub_3d706c(a0);
                                                    v112 = (unsigned int)v110 & 127;
                                                    if (v109 < v112)
                                                        goto LABEL_3cb8c8;
                                                    if (!v112)
                                                        continue;
                                                    v113 = iter;
                                                    if (v112 == 1)
                                                    {
                                                        v114 = 0;
                                                        iter = v113;
                                                    }
                                                    else
                                                    {
                                                        v114 = v112 & 126;
                                                        iter = v114 + v113;
                                                        iter1 = v6 + v113 * 4;
                                                        i2 = v114;
                                                        do
                                                        {
                                                            v117 = i2;
                                                            *(iter1 - 4) = v111;
                                                            *iter1 = v111;
                                                            iter1 += 8;
                                                            i2 = v117 - 2;
                                                        } while (i2);
                                                        if (v114 == v112)
                                                            continue;
                                                    }
                                                    iter2 = v108 + iter * 4;
                                                    i3 = v112 - v114;
                                                    do
                                                    {
                                                        v121 = i3;
                                                        iter += 1;
                                                        *iter2 = v111;
                                                        iter2 += 4;
                                                        i3 = v121 - 1;
                                                    } while (i3);
                                                }
                                                else
                                                {
                                                    if (!(unsigned int)v110 || v109 < (unsigned int)v110)
                                                        goto LABEL_3cb8c8;
                                                    v123 = v108 + iter * 4;
                                                    iter += v110;
                                                    do
                                                    {
                                                        v124 = v110;
                                                        *v123 = sub_3d706c(a0);
                                                        v123 += 4;
                                                        v110 = (unsigned int)v124 - 1;
                                                    } while ((unsigned int)v124 != 1);
                                                }
                                            } while ((v109 = v46 - iter, (int)v46 > (int)iter));
                                            j = v4;
                                            v126 = ptr;
                                            v127 = v5;
                                            do
                                            {
                                                v128 = j;
                                                sub_3d1c2c(v127, v126, v47);
                                                v126 += 1;
                                                v127 += v1;
                                                j = v128 - 1;
                                            } while (j);
                                            v50 = v0 + 1;
                                            v5 += v2;
                                            if (v50 == v3)
                                            {
                                                _free(ptr);
                                                v48 = ptr1;
                                                goto LABEL_3cb420;
                                            }
                                            continue;
                                            goto LABEL_3cb99c;
                                        }
                                        _free(ptr1);
                                    }
                                    g_f0b120();
                                }
                            }
                        }
                        g_f0b120();
                    }
                }
            }
            g_f0b120();
        }
    }
    g_f0b120();
}
