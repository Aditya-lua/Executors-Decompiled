/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3c7e1c..0x3c8698 (2172 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3c7e1c_1 {
    struct st_3c7e1c_10 *field_0;
} st_3c7e1c_1;

typedef struct st_3c7e1c_10 {
    struct st_3c7e1c_1 *field_0;
} st_3c7e1c_10;

typedef struct st_3c7e1c_0 {
    char field_0;
} st_3c7e1c_0;

typedef struct st_3c7e1c_11 {
    unsigned long long field_0;
} st_3c7e1c_11;

extern st_3c7e1c_11 *g_f0b120;

unsigned long long sub_3c7e1c(long long a0, unsigned long long *a1, unsigned int *a2, unsigned long long a3, unsigned long long a4)
{
    unsigned long long v24;  // w27
    unsigned long long v25;  // w28
    unsigned long long v34;  // x28
    unsigned long long ptr;  // x20
    unsigned long v36;  // x8
    unsigned long v37;  // x9
    unsigned long long v38;  // x22
    unsigned long long i;  // x19
    unsigned long long v40;  // x23
    unsigned long v41;  // x25
    unsigned long long v42;  // x19
    unsigned long long v43;  // x25
    long long v26;  // x0
    unsigned long long l;  // x19
    unsigned long long v45;  // x19
    unsigned int v46;  // w26
    unsigned int v47;  // w25
    unsigned long long v48;  // x23
    unsigned long long v49;  // x0
    char *v50;  // x19
    unsigned long long j;  // w23
    char *iter;  // x25
    unsigned long long v53;  // w23
    unsigned long long v27;  // x23
    unsigned int v54;  // w19
    unsigned int v55;  // w0
    unsigned long long v56;  // w19
    unsigned long long v57;  // x22
    unsigned long long k;  // x23
    unsigned long long v60;  // w25
    unsigned long long v61;  // w8
    unsigned long long n;  // x26
    unsigned int v63;  // w0
    unsigned int v28;  // w25
    unsigned long long v64;  // w0
    unsigned int v65;  // w0
    unsigned int v66;  // w19
    unsigned int v67;  // w0
    void* iter1;  // x19
    unsigned long long n;  // x28
    unsigned long long v70;  // x28
    unsigned long long v71;  // x12
    unsigned long long v72;  // x8
    unsigned long long v73;  // w3
    unsigned long long v29;  // x19
    unsigned long long v74;  // w9
    unsigned int v75;  // w11
    unsigned long long v76;  // x12
    unsigned long long v77;  // x13
    unsigned long long v78;  // x16
    unsigned long v79;  // x22
    unsigned long long v80;  // w2
    unsigned long long v81;  // w2
    unsigned int v82;  // w9
    unsigned long long v83;  // x2
    unsigned int v30;  // w26
    unsigned long v84;  // x3
    unsigned long v85;  // cc_dep1
    unsigned long long v86;  // x4
    unsigned long v87;  // x5
    unsigned long long v88;  // w6
    unsigned long v89;  // x4
    unsigned long long v90;  // x4
    unsigned long long v91;  // x6
    unsigned long v92;  // 4110
    unsigned long v93;  // cc_op
    unsigned long long v31;  // w0
    unsigned long v94;  // cc_dep1
    unsigned long v95;  // cc_dep2
    unsigned long v96;  // 4110
    unsigned long long v97;  // 4114
    unsigned long long v98;  // x19
    uint128_t *node;  // x4
    uint128_t *iter2;  // x5
    unsigned long long i0;  // x6
    unsigned long long v102;  // x6
    uint128_t v103;  // q0
    unsigned long long v32;  // x0
    uint128_t v104;  // q1
    uint128_t v105;  // q3
    unsigned long long *v107;  // x6
    unsigned long long *v108;  // x7
    unsigned long long v109;  // x19
    unsigned long v110;  // d0
    unsigned long long v112;  // 4120
    char *v113;  // x4
    unsigned long long v33;  // x22
    char *v114;  // x5
    unsigned long long i1;  // w6
    char v116;  // x7
    unsigned long long m;  // w8
    unsigned long v118;  // x10
    unsigned long long v119;  // w8
    char v120;  // x11
    unsigned int v0;  // [bp-0xd0]
    unsigned int v1;  // [bp-0xcc]
    unsigned int v2;  // [bp-0xc8], Other Possible Types: unsigned long long
    unsigned int v3;  // [bp-0xc4]
    unsigned int v4;  // [bp-0xc0]
    unsigned int v5;  // [bp-0xbc]
    unsigned int v6;  // [bp-0xb4], Other Possible Types: unsigned long long
    unsigned long long *v7;  // [bp-0xb0], Other Possible Types: unsigned long long
    unsigned int *v8;  // [bp-0xa8], Other Possible Types: unsigned long long
    unsigned long long v9;  // [bp-0xa0]
    unsigned long long v10;  // [bp-0x9c]
    st_3c7e1c_0 **v11;  // [bp-0x98], Other Possible Types: char
    st_3c7e1c_0 *v12;  // [bp-0x90]
    char v14;  // [bp-0x88]
    char v15;  // [bp-0x87]
    char v16;  // [bp-0x86]
    unsigned long long v17;  // [bp-0x84]
    st_3c7e1c_0 **v18;  // [bp-0x80]
    char *v19;  // [bp-0x78]
    st_3c7e1c_10 **v20;  // [bp-0x70]
    st_3c7e1c_10 **v21;  // [bp-0x68]
    char *v22;  // [bp-0x10]
    char v23;  // [bp+0x0]

    v22 = &v23;
    v7 = a1;
    v8 = a2;
    v12 = &v11;
    v11 = &v12;
    v6 = sub_3d706c();
    v24 = (unsigned int)sub_3d706c(a0);
    v25 = (unsigned int)sub_3d706c(a0);
    v21 = &v20;
    v20 = &v21;
    v2 = sub_3d706c(a0);
    v1 = sub_3d706c(a0);
    v21 = &v20;
    v20 = &v21;
    v4 = sub_3d706c(a0);
    v3 = sub_3d706c(a0);
    v26 = sub_3d706c(a0);
    v21 = &v20;
    v20 = &v21;
    sub_3d706c(a0);
    sub_3d706c(a0);
    v21 = &v20;
    v20 = &v21;
    sub_3d706c(a0);
    sub_3d706c(a0);
    v21 = &v20;
    v20 = &v21;
    v27 = sub_3d706c(a0);
    v28 = sub_3d706c(a0);
    v21 = &v20;
    v20 = &v21;
    v29 = sub_3d706c(a0);
    v30 = sub_3d706c(a0);
    v31 = (unsigned int)sub_3d706c(a0);
    v17 = 0;
    v5 = sub_3d706c(a0);
    v14 = 0;
    v9 = v31;
    v10 = v24;
    if (v24)
    {
        v32 = sub_3c950c(v26, 0, &v17);
        if (!(unsigned int)v32)
            g_f0b120();
    }
    else
    {
        v32 = sub_3c950c();
        if (!(unsigned int)v32)
            g_f0b120();
    }
    v33 = (unsigned int)v27 & 0xffff0000 | ((unsigned int)v27 & 0xffff00ff | __ROL__(v28, 8) & 0xff00) & 0xffff;
    v34 = (unsigned int)v29 & 0xffff0000 | ((unsigned int)v29 & 0xffff00ff | __ROL__(v30, 8) & 0xff00) & 0xffff;
    *(unsigned int *)v7 = v33;
    *v8 = v34;
    if (a3)
        *(unsigned int *)a3 = v32;
    if (!sub_3cfce4(v33, v34, v32, 0))
        g_f0b120();
    ptr = sub_3d6ef0(v33, v34, v32, 0);
    if (ptr)
    {
        sub_3d44fc(a0, v6);
        if (!v10 && 7 >= v25 && !v17)
        {
            v6 = (unsigned int)v33;
            if ((unsigned int)v34)
            {
                v36 = v28 * 0x100;
                v37 = v30 * 0x100;
                v38 = v6 * v32;
                if (!(v5 >> 5 & 1))
                {
                    i = v37 + v29;
                    v40 = (v36 + v27) * v32;
                    v41 = ((unsigned int)i - 1) * v40;
                    do
                    {
                        v42 = i;
                        sub_3cebbc(a0, ptr + (int)v41, v38);
                        v41 -= v40;
                        i = v42 - 1;
                    } while (i);
                }
                else
                {
                    v43 = 0;
                    l = v37 + v29;
                    do
                    {
                        v45 = l;
                        sub_3cebbc(a0, ptr + (int)v43, v38);
                        v43 += (v36 + v27) * v32;
                        l = v45 - 1;
                    } while (l);
                }
            }
            goto LABEL_3c8600;
        }
        v46 = v3;
        v47 = v4;
        v48 = v47 & 0xffff0000 | (v47 & 0xffff00ff | __ROL__(v46, 8) & 0xff00) & 0xffff;
        if (v10)
        {
            if (!(unsigned int)v48)
            {
                _free(ptr);
                g_f0b120();
            }
            sub_3d44fc(a0, v2 | v1 * 0x100);
            v49 = sub_3ceae0(v48, v32, 0);
            if (!v49)
            {
                _free(ptr);
                g_f0b120();
            }
            v50 = v49;
            if (v17)
            {
                v2 = (unsigned int)v48;
                v0 = v34;
                v6 = (unsigned int)v33;
                j = v46 * 0x100 + v47;
                v7 = v50;
                iter = v50 + 2;
                do
                {
                    v53 = j;
                    v19 = &v18;
                    v20 = &v21;
                    v18 = &v19;
                    v21 = &v20;
                    v54 = sub_3d706c(a0);
                    v55 = sub_3d706c(a0);
                    *(iter - 2) = 2156535 * ((v55 * 0x40000000 | v55 >> 2) & 0xc000001f & 31) >> 18;
                    *(iter - 1) = 2156535 * (((v54 | v55 * 0x100) * 0x8000000 | (v54 | v55 * 0x100) >> 5) & 4160749599 & 31) >> 18;
                    *iter = 2156535 * (v54 & 31) >> 18;
                    iter = &iter[(unsigned int)v32];
                    j = v53 - 1;
                } while (j);
                v34 = v0;
                v56 = v9;
                v57 = v6 * v34;
                if ((unsigned int)v57)
                    goto LABEL_3c81fc;
            }
            else
            {
                if (!sub_3cebbc(a0, v50, v48 * v32))
                {
                    _free(ptr);
                    _free(v50);
                    g_f0b120();
                }
                v2 = (unsigned int)v48;
                v7 = v50;
                v56 = v9;
                v6 = (unsigned int)v33;
                v57 = v33 * v34;
                if ((unsigned int)v57)
                {
LABEL_3c81fc:
                    k = 0;
                    v60 = 0;
                    v8 = 0;
                    v61 = 1;
                    n = v32 & 0xffffffff;
                    v0 = v34;
                    do
                    {
                        if (v25 < 8)
                        {
LABEL_3c8260:
                            if (!v10)
                                goto LABEL_3c8300;
                            goto LABEL_3c8268;
                        }
                        else if (v60)
                        {
                            if (v8 != 0 & ~v61 & 1)
                                goto LABEL_3c837c;
                            goto LABEL_3c8260;
                        }
                        else
                        {
                            v63 = sub_3d706c(a0);
                            v60 = (v63 & 127) + 1;
                            v8 = v63 >> 7;
                            if (v10)
                            {
LABEL_3c8268:
                                if (v56 == 8)
                                {
                                    v64 = (unsigned int)sub_3d706c(a0);
                                    if (1 > (int)v32)
                                        continue;
                                }
                                else
                                {
                                    v21 = &v20;
                                    v20 = &v21;
                                    v65 = sub_3d706c(a0);
                                    v64 = v65 | sub_3d706c(a0) * 0x100;
                                    v56 = v9;
                                    if ((int)v32 < 1)
                                        continue;
                                }
                                _memcpy();
                                goto LABEL_3c8218;
                            }
                            else
                            {
LABEL_3c8300:
                                if (v17)
                                {
                                    v19 = &v18;
                                    v18 = &v19;
                                    v21 = &v20;
                                    v20 = &v21;
                                    v66 = sub_3d706c(a0);
                                    v67 = sub_3d706c(a0);
                                    v14 = 2156535 * (__ROL__(v67, 30) & 0xc000001f & 31) >> 18;
                                    v15 = 2156535 * (__ROL__(v66 | v67 * 0x100, 27) & 4160749599 & 31) >> 18;
                                    v56 = v9;
                                    v16 = 2156535 * (v66 & 31) >> 18;
LABEL_3c837c:
                                    if (1 > (int)v32)
                                        continue;
                                    goto LABEL_3c8218;
                                }
                                else
                                {
                                    if ((int)v32 < 1)
                                        continue;
                                    iter1 = &v14;
                                    n = n;
                                    do
                                    {
                                        v70 = n;
                                        *(char *)iter1 = sub_3d706c(a0);
                                        iter1 += 1;
                                        n = v70 - 1;
                                    } while (n);
                                    v34 = v0;
                                    v56 = v9;
                                    if (1 > (int)v32)
                                        continue;
LABEL_3c8218:
                                    _memcpy(ptr + k * v32, &v14, n);
                                }
                            }
                        }
                        v61 = 0;
                        k += 1;
                        v60 -= 1;
                    } while (k != v57);
                }
            }
        }
        else
        {
            v2 = (unsigned int)v48;
            v7 = 0;
            v56 = v9;
            v6 = (unsigned int)v33;
            v57 = v33 * v34;
            if ((unsigned int)v57)
                goto LABEL_3c81fc;
        }
        v71 = v6;
        if (!(v5 >> 5 & 1) && (unsigned int)v34)
        {
            v72 = v71 * v32;
            if ((int)v72 >= 1)
            {
                v73 = 0;
                v74 = 0;
                v75 = (unsigned int)v34 - 1;
                v76 = ptr + v72;
                v77 = v72 & 0x7fffffe0;
                v78 = v72 & 0x7ffffff8;
                v79 = ptr + 16;
                v80 = (unsigned int)v71 * v75 * (unsigned int)v32;
                v81 = v80;
                do
                {
                    v82 = v74;
                    v83 = v81;
                    v84 = v73;
                    v85 = v72 & 0xffffffff;
                    if (8 > (unsigned int)v72)
                    {
                        v86 = v83;
                        v87 = v84;
                        v88 = (unsigned int)v72;
                        goto LABEL_3c85cc;
                    }
                    v89 = v80 - v82 * (unsigned int)v72;
                    v90 = ptr + v89;
                    v91 = v76 + v84;
                    if (ptr + v84 < v76 + v89)
                    {
                        v92 = arm64g_calculate_condition(0x33, v85, 8, 0);
                        v93 = 4;
                        v94 = (v92 & 1 ? v90 : 0x20000000);
                        v95 = (v92 & 1 ? v91 : 0);
                    }
                    else
                    {
                        v96 = arm64g_calculate_condition(0x33, v85, 8, 0);
                        v93 = 0;
                        v94 = (v96 & 1 ? v90 : 0x20000000);
                        v95 = (v96 & 1 ? v91 : 0);
                    }
                    v86 = v83;
                    v87 = v84;
                    v88 = (unsigned int)v72;
                    v97 = arm64g_calculate_condition(v93 | 48, v94, v95, 0);
                    if (!(v97 & 1))
                    {
                        if (32 > (unsigned int)v72)
                        {
                            v98 = 0;
                        }
                        else
                        {
                            node = v79 + v83;
                            iter2 = v79 + v84;
                            i0 = v77;
                            do
                            {
                                v102 = i0;
                                v103 = *(int128_t *)((char *)iter2 - 16);
                                v104 = *iter2;
                                v105 = *node;
                                *(int128_t *)((char *)iter2 - 16) = *(int128_t *)((char *)node - 16);
                                *iter2 = v105;
                                *(uint128_t *)((char *)node - 16) = v103;
                                *node = v104;
                                node += 2;
                                iter2 += 2;
                                i0 = v102 - 32;
                            } while (i0);
                            if (v77 == v72)
                                continue;
                            v98 = v77;
                            if (!(v72 & 24))
                            {
                                v87 = v77 + v84;
                                v86 = v77 + v83;
                                v88 = (unsigned int)(v72 - v77);
                                goto LABEL_3c85cc;
                            }
                        }
                        v86 = v78 + v83;
                        v87 = v78 + v84;
                        v107 = ptr + v98 + v83;
                        v108 = ptr + v98 + v84;
                        v109 = -v78 + v98;
                        do
                        {
                            v110 = *(unsigned long *)&*(double *)v108;
                            *(double *)v108 = *(double *)v107;
                            v108 += 1;
                            *v107 = v110;
                            v107 += 1;
                            v112 = arm64g_calculate_condition(18, v109, 8, 0);
                            v109 += 8;
                        } while (v112 & 1);
                        v88 = (unsigned int)(v72 - v78);
                        if (v78 == v72)
                            continue;
                        goto LABEL_3c85cc;
                    }
                    else
                    {
LABEL_3c85cc:
                        v113 = ptr + v86;
                        v114 = ptr + v87;
                        i1 = v88 + 1;
                        do
                        {
                            v116 = *v114;
                            *v114 = *v113;
                            v114 += 1;
                            *v113 = v116;
                            v113 += 1;
                            i1 -= 1;
                        } while (1 < i1);
                    }
                } while ((v73 = (unsigned int)v84 + (unsigned int)v72, v81 = (unsigned int)(v83 - v72), v74 = v82 + 1, v82 != v75 >> 1));
            }
        }
        if (v7)
            _free();
LABEL_3c8600:
        if ((int)v32 >= 3 && !v17)
        {
            m = v6 * (unsigned int)v34;
            if (m)
            {
                v118 = ptr + 2;
                do
                {
                    v119 = m;
                    v120 = *(char *)(v118 - 2);
                    *(char *)(v118 - 2) = *(char *)v118;
                    *(char *)v118 = v120;
                    v118 += v32 & 0xffffffff;
                    m = v119 - 1;
                } while (m);
            }
        }
        if (!a4)
        {
            return ptr;
        }
        else if ((unsigned int)v32 != a4)
        {
            return sub_3cf884(ptr, v32);
        }
        else
        {
            return ptr;
        }
    }
    g_f0b120();
}
