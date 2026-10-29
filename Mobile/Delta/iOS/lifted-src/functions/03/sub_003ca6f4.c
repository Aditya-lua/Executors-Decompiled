/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3ca6f4..0x3cb15c (2664 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3ca6f4_1 {
    struct st_3ca6f4_0 *field_0;
} st_3ca6f4_1;

typedef struct st_3ca6f4_0 {
    char field_0;
} st_3ca6f4_0;

typedef struct st_3ca6f4_2 {
    unsigned long long field_0;
} st_3ca6f4_2;

extern st_3ca6f4_2 *g_f0b120;
extern char _NSHomeDirectory;
extern char g_1000001;

void sub_3ca6f4(long long a0, unsigned int *a1, int *a2, unsigned int a3, unsigned int a4, long long *a5, long long a6)
{
    unsigned int v17;  // w0
    unsigned int v18;  // w0
    unsigned long long v27;  // x22
    unsigned int v117;  // x10
    unsigned int i7;  // w10
    unsigned int v120;  // w10
    unsigned int v122;  // x8
    unsigned int v123;  // x12
    unsigned int *iter;  // x9
    unsigned int v125;  // x10
    unsigned long long i8;  // x10
    unsigned int v28;  // w0
    unsigned long iter1;  // x11
    unsigned int v128;  // x10
    unsigned int i9;  // w10
    unsigned int v131;  // w10
    unsigned long v133;  // cc_op
    unsigned long v134;  // cc_dep1
    unsigned long iter2;  // x8
    unsigned int v136;  // x21
    unsigned int v29;  // w0
    unsigned int v137;  // w11
    unsigned long long v138;  // 4112
    unsigned long long v139;  // 4102
    unsigned long long v140;  // 4112
    unsigned long long v141;  // 4102
    float v142;  // s1
    float v143;  // s2
    unsigned long node;  // x8
    unsigned int v145;  // x21
    unsigned int v146;  // w10
    unsigned int v30;  // w0
    float v147;  // s1
    float v148;  // s2
    int *v149;  // x20
    unsigned int *v150;  // x19
    unsigned int v151;  // x21
    unsigned int v152;  // w23
    unsigned int v153;  // x0
    unsigned int v31;  // w0
    unsigned long long v32;  // x24
    unsigned int v33;  // w0
    long long v34;  // w27
    unsigned int v35;  // w0
    unsigned int v19;  // w0
    unsigned int v39;  // w0
    unsigned int v40;  // w27
    unsigned int ptr;  // x0
    unsigned long v42;  // cc_op
    unsigned long v43;  // cc_dep1
    unsigned long v44;  // cc_dep2
    unsigned long v45;  // cc_ndep
    unsigned int v46;  // x19
    unsigned int v20;  // w0
    unsigned int v47;  // x21
    unsigned int v48;  // x9
    unsigned long long v49;  // x8
    unsigned long v50;  // x10
    unsigned long long j;  // x11
    unsigned int v52;  // x11
    unsigned int k;  // w9
    unsigned int v55;  // w9
    unsigned int v21;  // w0
    unsigned long v57;  // x1
    unsigned int v58;  // x8
    unsigned int v59;  // x9
    unsigned long v60;  // x10
    unsigned int l;  // x11
    unsigned int v62;  // x11
    unsigned int m;  // w8
    unsigned int v65;  // w8
    unsigned int v22;  // w0
    unsigned long v67;  // x1
    unsigned int v68;  // x8
    unsigned int v69;  // x9
    unsigned long v70;  // x10
    unsigned int n;  // x11
    unsigned int v72;  // x11
    unsigned int i0;  // w8
    unsigned int v75;  // w8
    unsigned long long v23;  // x8
    unsigned long v77;  // x1
    unsigned int v78;  // x8
    unsigned int v79;  // x9
    unsigned long v80;  // x10
    unsigned int i1;  // x12
    unsigned int v82;  // x12
    unsigned int i2;  // w8
    unsigned int v85;  // w8
    unsigned int v24;  // w0
    long long v87;  // x0
    long long v88;  // x0
    long long v89;  // x0
    unsigned int i;  // x25
    long long v91;  // w8
    unsigned long v92;  // 4112
    unsigned long v93;  // cc_op
    unsigned long v94;  // cc_dep1
    unsigned long v95;  // cc_dep2
    unsigned long v96;  // 4112
    unsigned int v25;  // w0
    unsigned long long v97;  // 4122
    unsigned long long v98;  // x8
    unsigned long v99;  // x27
    unsigned long v100;  // x28
    unsigned short *v101;  // x20
    unsigned int i3;  // w21
    unsigned int v103;  // w21
    unsigned short v104;  // x0
    char *v105;  // x20
    unsigned int i4;  // w21
    unsigned int v26;  // w0
    unsigned int v107;  // w21
    char v108;  // x0
    unsigned int i5;  // w19
    unsigned int v110;  // w19
    unsigned int v111;  // x8
    unsigned int v112;  // x12
    unsigned int *v113;  // x9
    unsigned int v114;  // x10
    unsigned long long i6;  // x10
    unsigned long v116;  // x11
    unsigned long long v0;  // [bp-0xf0]
    unsigned long long v1;  // [bp-0xe8]
    unsigned int v2;  // [bp-0xdc]
    unsigned long long v3;  // [bp-0xd8]
    unsigned int v4;  // [bp-0xd0]
    long long v5;  // [bp-0xcc]
    unsigned int v6;  // [bp-0xc8]
    unsigned int v7;  // [bp-0xc0]
    unsigned long long v8;  // [bp-0xa8]
    st_3ca6f4_0 **v9;  // [bp-0x90], Other Possible Types: char
    st_3ca6f4_0 *v10;  // [bp-0x88]
    st_3ca6f4_0 **v11;  // [bp-0x80], Other Possible Types: st_3ca6f4_1 **, char
    st_3ca6f4_0 *v12;  // [bp-0x78], Other Possible Types: st_3ca6f4_1 **
    st_3ca6f4_1 **v13;  // [bp-0x70]
    st_3ca6f4_1 **v14;  // [bp-0x68]
    char *v15;  // [bp-0x10]
    char v16;  // [bp+0x0]

    v15 = &v16;
    v10 = &v9;
    v9 = &v10;
    v12 = &v11;
    v11 = &v12;
    v13 = &v14;
    v14 = &v13;
    v17 = sub_3d706c();
    v18 = sub_3d706c(a0);
    v13 = &v14;
    v14 = &v13;
    v19 = sub_3d706c(a0);
    if ((sub_3d706c(a0) | v19 * 0x100 | v17 * 0x1000000 | v18 * 0x10000) != 943870035)
        g_f0b120();
    v13 = &v14;
    v14 = &v13;
    v20 = sub_3d706c(a0);
    if ((sub_3d706c(a0) | v20 * 0x100) != 1)
        g_f0b120();
    sub_3d44fc(a0, 6);
    v13 = &v14;
    v14 = &v13;
    v21 = sub_3d706c(a0);
    v22 = sub_3d706c(a0);
    v23 = v22 | v21 * 0x100;
    if ((unsigned int)v23 >= 0x11)
        g_f0b120();
    v8 = v23;
    v12 = &v11;
    v13 = &v14;
    v11 = &v12;
    v14 = &v13;
    v24 = sub_3d706c(a0);
    v25 = sub_3d706c(a0);
    v13 = &v14;
    v14 = &v13;
    v26 = sub_3d706c(a0);
    v12 = &v11;
    v13 = &v14;
    v11 = &v12;
    v27 = sub_3d706c(a0) | v26 * 0x100 | v24 * &_NSHomeDirectory | v25 * 0x10000;
    v14 = &v13;
    v28 = sub_3d706c(a0);
    v29 = sub_3d706c(a0);
    v13 = &v14;
    v14 = &v13;
    v30 = sub_3d706c(a0);
    v31 = sub_3d706c(a0);
    if (&g_1000001 > (int)v27)
    {
        v32 = v31 | v30 * 0x100 | v28 * &_NSHomeDirectory | v29 * 0x10000;
        if ((int)v32 < &g_1000001)
        {
            v13 = &v14;
            v14 = &v13;
            v33 = sub_3d706c(a0);
            v34 = sub_3d706c(a0) | v33 * 0x100;
            if (v34 != 8 && v34 != 16)
                g_f0b120();
            v13 = &v14;
            v14 = &v13;
            v35 = sub_3d706c(a0);
            if ((sub_3d706c(a0) | v35 * 0x100) != 3)
                g_f0b120();
            v5 = v34;
            sub_3d44fc(a0, sub_3ce984(a0));
            sub_3d44fc(a0, sub_3ce984(a0));
            sub_3d44fc(a0, sub_3ce984(a0));
            v39 = sub_3d6e70(a0);
            if (v39 >= 2)
                g_f0b120();
            v40 = v39;
            if (sub_3cfce4(4, v32, v27, 0))
            {
                if (a6 == 16 && v5 == 16 && !v40)
                {
                    ptr = sub_3d6ef0(8, v32, v27, 0);
                    *(unsigned int *)a5 = 16;
                }
                else
                {
                    ptr = _malloc((unsigned int)v32 * (unsigned int)v27 * 4);
                }
                v46 = v8;
                if (!ptr)
                    g_f0b120();
                v47 = v27 * v32;
                v6 = ptr;
                v2 = v32;
                if (!v40)
                {
                    i = 0;
                    v91 = v5;
                    if (a6 == 16)
                    {
                        v92 = arm64g_calculate_condition(v42, v43, v44, v45);
                        v93 = 3;
                        v94 = (v92 & 1 ? v91 : 0);
                        v95 = (v92 & 1 ? 16 : 0);
                    }
                    else
                    {
                        v96 = arm64g_calculate_condition(v42, v43, v44, v45);
                        v93 = 0;
                        v94 = (v96 & 1 ? v91 : 0);
                        v95 = (v96 & 1 ? 16 : 0);
                    }
                    v97 = arm64g_calculate_condition(v93 | 16, v94, v95, 0);
                    v4 = !(v97 & 1);
                    v98 = v47 & 0x7ffffffe;
                    v3 = v98;
                    v0 = v98 * 8;
                    v1 = v98 * 4;
                    v99 = ptr + 4;
                    v100 = ptr + 8;
                    v7 = v47;
                    do
                    {
                        if (v46 > i)
                        {
                            if (*(int *)a5 != 16)
                            {
                                v105 = (char *)(ptr + i);
                                if (v5 == 16)
                                {
                                    if ((int)v47 >= 1)
                                    {
                                        i4 = v7;
                                        do
                                        {
                                            v107 = i4;
                                            v13 = &v14;
                                            v14 = &v13;
                                            v108 = sub_3d706c(a0);
                                            sub_3d706c(a0);
                                            *v105 = v108;
                                            v105 += 4;
                                            i4 = v107 - 1;
                                        } while (i4);
                                    }
                                }
                                else
                                {
                                    i5 = v47;
                                    if ((int)v47 >= 1)
                                    {
                                        do
                                        {
                                            v110 = i5;
                                            *v105 = sub_3d706c(a0);
                                            v105 += 4;
                                            i5 = v110 - 1;
                                        } while (i5);
                                    }
                                }
                            }
                            else if ((int)v47 >= 1)
                            {
                                v101 = v6 + i * 2;
                                i3 = v7;
                                do
                                {
                                    v103 = i3;
                                    v13 = &v14;
                                    v14 = &v13;
                                    v104 = sub_3d706c(a0);
                                    *v101 = (unsigned short)sub_3d706c(a0) | v104 * 0x100;
                                    v101 += 4;
                                    i3 = v103 - 1;
                                } while (i3);
                            }
                        }
                        else
                        {
                            if (v4)
                            {
                                if (i != 3)
                                    v111 = 0;
                                else
                                    v111 = 0xffff;
                                if ((int)v47 < 1)
                                    continue;
                                v112 = v7;
                                v113 = v6 + i * 2;
                                if (v112 == 1)
                                {
                                    v114 = 0;
                                }
                                else
                                {
                                    v113 = (char *)v113 + v0;
                                    i6 = v3;
                                    v116 = v100;
                                    do
                                    {
                                        v117 = i6;
                                        *(unsigned short *)(v116 - 8) = v111;
                                        *(unsigned short *)v116 = v111;
                                        v116 += 16;
                                        i6 = v117 - 2;
                                    } while (i6);
                                    v114 = v3;
                                    if (v114 == v112)
                                        continue;
                                }
                                i7 = v7 - v114;
                                do
                                {
                                    v120 = i7;
                                    *(unsigned short *)v113 = v111;
                                    v113 += 2;
                                    i7 = v120 - 1;
                                } while (i7);
                            }
                            else
                            {
                                if (i != 3)
                                    v122 = 0;
                                else
                                    v122 = 0xff;
                                if ((int)v47 < 1)
                                    continue;
                                v123 = v7;
                                iter = (unsigned int *)(v6 + i);
                                if (v123 == 1)
                                {
                                    v125 = 0;
                                }
                                else
                                {
                                    iter = (char *)iter + v1;
                                    i8 = v3;
                                    iter1 = v99;
                                    do
                                    {
                                        v128 = i8;
                                        *(char *)(iter1 - 4) = v122;
                                        *(char *)iter1 = v122;
                                        iter1 += 8;
                                        i8 = v128 - 2;
                                    } while (i8);
                                    v125 = v3;
                                    if (v125 == v123)
                                        continue;
                                }
                                i9 = v7 - v125;
                                do
                                {
                                    v131 = i9;
                                    *(char *)iter = v122;
                                    iter += 1;
                                    i9 = v131 - 1;
                                } while (i9);
                            }
                        }
                        i += 1;
                        v99 += 1;
                        v100 += 2;
                        ptr = v6;
                        v47 = v7;
                        v46 = v8;
                    } while (i != 4);
                    goto LABEL_3cafc0;
                }
                sub_3d44fc(a0, (unsigned int)v27 * v22 * 2);
                if ((int)v47 < 1)
                {
                    v87 = v6;
                    if (!v46 || (v87 = v6, ptr = v87, sub_3d6f48(a0, v6, v47)))
                    {
                        v88 = v87;
                        if (v46 < 2 || (v88 = v6, ptr = v88, sub_3d6f48(a0, v87 + 1, v47)))
                        {
                            v89 = v88;
                            if (v46 < 3 || (v89 = v6, ptr = v89, sub_3d6f48(a0, v88 + 2, v47)))
                            {
                                ptr = v89;
                                if (v46 < 4 || !(ptr = v6, !sub_3d6f48(a0, v89 + 3, v47)))
                                    goto LABEL_3cafc0;
                            }
                        }
                    }
                }
                else if (v46)
                {
                    ptr = v6;
                    v46 = v8;
                    if (sub_3d6f48(a0, v6, v47))
                        goto LABEL_3cae50;
                }
                else
                {
                    if (v47 == 1)
                    {
                        v48 = 0;
                        ptr = v6;
                        v49 = ptr;
                    }
                    else
                    {
                        v48 = v47 & 0x7ffffffe;
                        ptr = v6;
                        v49 = ptr + v48 * 4;
                        v50 = ptr + 4;
                        j = v48;
                        do
                        {
                            v52 = j;
                            *(char *)(v50 - 4) = 0;
                            *(char *)v50 = 0;
                            v50 += 8;
                            j = v52 - 2;
                        } while (j);
                        if (v48 == v47)
                            goto LABEL_3cae50;
                    }
                    k = v47 - v48;
                    do
                    {
                        v55 = k;
                        *(char *)v49 = 0;
                        v49 += 4;
                        k = v55 - 1;
                    } while (k);
LABEL_3cae50:
                    v57 = ptr + 1;
                    if (v46 > 1)
                    {
                        ptr = v6;
                        if (sub_3d6f48(a0))
                            goto LABEL_3caebc;
                    }
                    else
                    {
                        v58 = v47 - 1;
                        if (v47 != 1)
                        {
                            v59 = v58 + 1;
                            v58 = v59 & 0x1fffffffe;
                            v57 += v58 * 4;
                            v60 = ptr + 5;
                            l = v58;
                            do
                            {
                                v62 = l;
                                *(char *)(v60 - 4) = 0;
                                *(char *)v60 = 0;
                                v60 += 8;
                                l = v62 - 2;
                            } while (l);
                            if (v59 == v58)
                                goto LABEL_3caebc;
                        }
                        m = v47 - v58;
                        do
                        {
                            v65 = m;
                            *(char *)v57 = 0;
                            v57 += 4;
                            m = v65 - 1;
                        } while (m);
LABEL_3caebc:
                        v67 = ptr + 2;
                        if (v46 > 2)
                        {
                            ptr = v6;
                            if (sub_3d6f48(a0))
                                goto LABEL_3caf28;
                        }
                        else
                        {
                            v68 = v47 - 1;
                            if (v47 != 1)
                            {
                                v69 = v68 + 1;
                                v68 = v69 & 0x1fffffffe;
                                v67 += v68 * 4;
                                v70 = ptr + 6;
                                n = v68;
                                do
                                {
                                    v72 = n;
                                    *(char *)(v70 - 4) = 0;
                                    *(char *)v70 = 0;
                                    v70 += 8;
                                    n = v72 - 2;
                                } while (n);
                                if (v69 == v68)
                                    goto LABEL_3caf28;
                            }
                            i0 = v47 - v68;
                            do
                            {
                                v75 = i0;
                                *(char *)v67 = 0;
                                v67 += 4;
                                i0 = v75 - 1;
                            } while (i0);
LABEL_3caf28:
                            v77 = ptr + 3;
                            if (v46 > 3)
                            {
                                ptr = v6;
                                if (sub_3d6f48(a0))
                                    goto LABEL_3cafc8;
                            }
                            else
                            {
                                v78 = v47 - 1;
                                if (v47 != 1)
                                {
                                    v79 = v78 + 1;
                                    v78 = v79 & 0x1fffffffe;
                                    v77 += v78 * 4;
                                    v80 = ptr + 7;
                                    i1 = v78;
                                    do
                                    {
                                        v82 = i1;
                                        *(char *)(v80 - 4) = 0xff;
                                        *(char *)v80 = 0xff;
                                        v80 += 8;
                                        i1 = v82 - 2;
                                    } while (i1);
                                    ptr = ptr;
                                    if (v79 == v78)
                                        goto LABEL_3cafc0;
                                }
                                i2 = v47 - v78;
                                do
                                {
                                    v85 = i2;
                                    *(char *)v77 = 0xff;
                                    v77 += 4;
                                    i2 = v85 - 1;
                                } while (i2);
LABEL_3cafc0:
                                if (v46 < 4)
                                    goto LABEL_3cb0f4;
LABEL_3cafc8:
                                if (*(int *)a5 == 16)
                                {
                                    v133 = 3;
                                    v134 = v47 & 0xffffffff;
                                    if ((int)v47 >= 1)
                                    {
                                        iter2 = ptr + 4;
                                        do
                                        {
                                            v136 = v47;
                                            v137 = *(short *)(iter2 + 2);
                                            if (v137)
                                            {
                                                v138 = arm64g_calculate_condition(v133 | 16, v134, 1, 0);
                                                v139 = arm64g_calculate_condition(3, (v138 & 1 ? v137 & 0xffff : 0x40000000), (v138 & 1 ? 0xffff : 0), 0);
                                                if (v139 & 1)
                                                    continue;
                                            }
                                            else
                                            {
                                                v140 = arm64g_calculate_condition(v133 | 16, v134, 1, 0);
                                                v141 = arm64g_calculate_condition(0, (v140 & 1 ? v137 & 0xffff : 0x40000000), (v140 & 1 ? 0xffff : 0), 0);
                                                if (v141 & 1)
                                                    continue;
                                            }
                                            v142 = 1.0f / ((float)v137 / 65535.0f);
                                            v143 = (1.0f - v142) * 65535.0f;
                                            *(short *)(iter2 - 4) = (int)((float)(unsigned int)(uint128_t)(unsigned short)*(short *)(iter2 - 4) * v142 + v143);
                                            *(short *)(iter2 - 2) = (int)((float)(unsigned int)(uint128_t)(unsigned short)*(short *)(iter2 - 2) * v142 + v143);
                                            *(short *)iter2 = (int)((float)(unsigned int)(uint128_t)(unsigned short)*(short *)iter2 * v142 + v143);
                                        } while ((iter2 += 8, v47 = v136 - 1, v133 = 4, v134 = v136, v136 != 1));
                                    }
                                }
                                else if ((int)v47 >= 1)
                                {
                                    node = ptr + 1;
                                    do
                                    {
                                        v145 = v47;
                                        v146 = *(char *)(node + 2);
                                        if (v146 && v146 != 0xff)
                                        {
                                            v147 = 1.0f / ((float)v146 / 255.0f);
                                            v148 = (1.0f - v147) * 255.0f;
                                            *(char *)(node - 1) = (int)((float)(unsigned int)(uint128_t)(char)*(char *)(node - 1) * v147 + v148);
                                            *(char *)node = (int)((float)(unsigned int)(uint128_t)(char)*(char *)node * v147 + v148);
                                            *(char *)(node + 1) = (int)((float)(unsigned int)(uint128_t)(char)*(char *)(node + 1) * v147 + v148);
                                        }
                                    } while ((node += 4, v47 = v145 - 1, v145 != 1));
                                }
LABEL_3cb0f4:
                                if (a4 & 0xfffffffb)
                                {
                                    v149 = a2;
                                    v150 = a1;
                                    v151 = a3;
                                    v152 = v2;
                                    if (*(int *)a5 == 16)
                                        v153 = sub_3cfd40();
                                    else
                                        v153 = sub_3cf884();
                                    if (!v153)
                                        return;
                                }
                                else
                                {
                                    v149 = a2;
                                    v150 = a1;
                                    v151 = a3;
                                    v152 = v2;
                                }
                                if (v151)
                                    *(unsigned int *)v151 = 4;
                                *v149 = v27;
                                *v150 = v152;
                                return;
                            }
                        }
                    }
                }
                _free(ptr);
                g_f0b120();
            }
        }
    }
    g_f0b120();
}
