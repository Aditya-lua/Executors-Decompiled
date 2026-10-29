/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9f326c..0x9f417c (3856 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9f326c_1 {
    char padding_0[1];
    char field_1;
    char field_2;
} st_9f326c_1;

typedef struct st_9f326c_0 {
    char padding_0[8];
    unsigned short field_8;
} st_9f326c_0;

extern char g_10002b0;

unsigned short sub_9f326c(void* a0, unsigned short a1, unsigned short *a2)
{
    unsigned short *v13;  // x20
    unsigned short v14;  // x22
    unsigned short *v23;  // x25
    unsigned short v113;  // x0
    unsigned short v114;  // x8
    unsigned long v115;  // x10
    unsigned short v116;  // x8
    unsigned long v117;  // x10
    char *v118;  // x10
    char *v119;  // x11
    unsigned long v120;  // x12
    char *v121;  // x12
    char *v122;  // x12
    unsigned long long len;  // x0
    unsigned short v123;  // x8
    unsigned long v124;  // x14
    char *v125;  // x13
    char *v126;  // x12
    unsigned long v127;  // x12
    long long v128;  // x24
    unsigned short v129;  // x0
    unsigned short v130;  // x0
    unsigned long v131;  // x8
    unsigned long long v132;  // x9
    unsigned short v25;  // w8
    unsigned long v133;  // x10
    unsigned short v134;  // x26
    unsigned long long len1;  // x0
    long long v136;  // x20
    unsigned short v137;  // x0
    unsigned short v138;  // x24
    unsigned short v139;  // x25
    unsigned short v140;  // w0
    long long v141;  // x1
    long long v142;  // x1
    unsigned long v26;  // cc_dep1
    long long v143;  // x1
    unsigned long long v144;  // x0
    unsigned long v27;  // 4112
    unsigned long v28;  // cc_op
    unsigned long v29;  // cc_dep1
    unsigned long v30;  // cc_dep2
    unsigned long long v31;  // 4102
    unsigned long v32;  // 4112
    unsigned long v15;  // x26
    unsigned long long v33;  // 4102
    unsigned short v34;  // w8
    unsigned long n;  // x26
    unsigned short v36;  // x0
    unsigned short v37;  // x26
    unsigned short v38;  // x0
    unsigned short v39;  // x9
    unsigned long long v40;  // x9
    unsigned int v41;  // w11
    unsigned long long v42;  // 4112
    unsigned short idx;  // x21
    unsigned long long v43;  // 4102
    unsigned long long v44;  // 4112
    unsigned long long v45;  // 4102
    unsigned short v46;  // w8
    char *v47;  // x27
    unsigned long v48;  // cc_dep1
    char *v49;  // x9
    unsigned short v50;  // x11
    unsigned short v51;  // x8
    unsigned long v52;  // cc_op
    unsigned short v17;  // x23
    unsigned long v53;  // cc_dep2
    unsigned long v54;  // x11
    unsigned long long v55;  // x8
    unsigned short v56;  // x9
    char *node;  // x10
    unsigned long v58;  // x12
    unsigned long v59;  // x12
    unsigned short *v60;  // x11
    unsigned long v61;  // x12
    char *v62;  // x12
    unsigned short v18;  // x28
    char *v63;  // x12
    unsigned short v64;  // x9
    char *v65;  // x10
    unsigned long v66;  // x14
    unsigned short v67;  // x13
    unsigned long v68;  // x14
    unsigned int v69;  // w15
    unsigned long v70;  // 4112
    unsigned long long v71;  // 4102
    unsigned long v72;  // 4112
    unsigned short v19;  // w26
    unsigned long long v73;  // 4102
    unsigned short v74;  // x13
    char *v75;  // x10
    unsigned long long v76;  // 4105
    char *v77;  // x13
    char *v78;  // x12
    unsigned long v79;  // x10
    char *v80;  // x12
    unsigned short v81;  // x14
    char *v82;  // x10
    unsigned short v20;  // x20
    unsigned long long v83;  // 4105
    unsigned short *v84;  // x9
    char *iter;  // x3
    unsigned long v86;  // x10
    unsigned long v87;  // x10
    char *v88;  // x25
    unsigned long v89;  // x8
    unsigned long v90;  // x25
    char *v91;  // x24
    unsigned short iter1;  // x26
    unsigned short v21;  // w27
    unsigned long v93;  // x10
    unsigned short v94;  // x20
    unsigned long v95;  // x8
    char *v96;  // x26
    unsigned long long v97;  // x9
    unsigned long v98;  // x10
    char *v99;  // x28
    unsigned short v100;  // x25
    unsigned short v101;  // x0
    st_9f326c_0 *v102;  // x2
    unsigned short *ptr;  // x24
    char *v103;  // x24
    unsigned long v104;  // x8
    unsigned long long v105;  // x9
    unsigned long v106;  // x10
    unsigned short ptr1;  // x0
    st_9f326c_1 *v108;  // x24
    char *v109;  // x24
    unsigned long v110;  // x8
    unsigned long long v111;  // x9
    unsigned long v112;  // x10
    unsigned long long v0;  // [bp-0xd0]
    char *v1;  // [bp-0xc8]
    unsigned short v2;  // [bp-0xb8]
    unsigned short v3;  // [bp-0xb0], Other Possible Types: unsigned long long
    unsigned long v4;  // [bp-0xa8]
    unsigned short v5;  // [bp-0xa0]
    unsigned short v6;  // [bp-0x98]
    unsigned short v7;  // [bp-0x90]
    unsigned short v8;  // [bp-0x88]
    unsigned short v9;  // [bp-0x80]
    unsigned long v10;  // [bp-0x68]
    char *v11;  // [bp-0x10]
    char v12;  // [bp+0x0]

    v11 = &v12;
    v13 = a2;
    v14 = a1;
    v10 = *(long long *)&g_10002b0;
    v7 = 0;
    v8 = 0;
    v15 = (long long)a0[16];
    v6 = 0;
    idx = sub_9ebce0();
    if (!idx)
    {
        sub_a368c8();
        sub_a369bc("crypto/conf/conf_def.c", 233, "def_load_bio");
        v143 = 524295;
        goto LABEL_9f3da0;
    }
    v17 = sub_a6d9b4("default", "crypto/conf/conf_def.c", 237);
    v8 = v17;
    if (!v17)
    {
LABEL_9f3de4:
        v18 = 0;
        v100 = 0;
        goto LABEL_9f3e30;
    }
    if (!sub_9f2df0(a0))
    {
        sub_a368c8();
        sub_a369bc("crypto/conf/conf_def.c", 242, "def_load_bio");
        v143 = 524302;
LABEL_9f3da0:
        sub_a36abc(14, v143, 0);
        v18 = 0;
        v100 = 0;
        v17 = 0;
        goto LABEL_9f3e30;
    }
    v17 = sub_9f3078(a0, v17);
    if (!v17)
    {
        sub_a368c8();
        sub_a369bc("crypto/conf/conf_def.c", 248, "def_load_bio");
        sub_a36abc(14, 103, 0);
        goto LABEL_9f3de4;
    }
    v4 = v15;
    v5 = (unsigned short)v13;
    if (sub_9ebd68(idx, 0x200))
    {
        v3 = v17;
        v17 = 0;
        v18 = 0;
        v19 = 1;
    }
    else
    {
        v17 = 0;
        v18 = 0;
LABEL_9f3df8:
        sub_a368c8();
        sub_a369bc("crypto/conf/conf_def.c", 0x100, "def_load_bio");
LABEL_9f3e20:
LABEL_9f3e24:
        sub_a36abc();
LABEL_9f3e28:
        v100 = 0;
LABEL_9f3e2c:
        v15 = v4;
        v13 = (unsigned short *)v5;
LABEL_9f3e30:
        sub_9ebcf4(idx);
        sub_a6c2e4(v8, "crypto/conf/conf_def.c", 571);
        if ((int)sub_ad69e4(v17) >= 1)
        {
            do
            {
                v144 = sub_ad692c(v17);
                sub_9d3d34(v14);
                v14 = v144;
            } while (0 < (int)sub_ad69e4(v17));
        }
        sub_ad6020(v17);
        sub_a6c2e4(v7, "crypto/conf/conf_def.c", 584);
        if (v6)
            sub_a6d93c(&v6);
        if (v13)
            *(unsigned long long *)v13 = v18;
        v0 = v18;
        sub_9d5b44(&v9, 24, "%ld");
        v0 = "line ";
        v1 = &v9;
        sub_a364a0(2);
        if (v15 != (long long)a0[16])
        {
            sub_9f4e20((long long)a0[16]);
            *(unsigned long long *)&a0[16] = 0;
        }
        if (v100)
        {
            sub_a6c2e4(*(long long *)(v100 + 8), "crypto/conf/conf_def.c", 597);
            sub_a6c2e4(*(long long *)(v100 + 16), "crypto/conf/conf_def.c", 598);
            sub_a6c2e4(v100, "crypto/conf/conf_def.c", 599);
        }
        v140 = 0;
LABEL_9f3f3c:
        if (*(long long *)&g_10002b0 == v10)
            return v140;
        ___stack_chk_fail();
    }
    while (1)
    {
        v20 = 0;
        v21 = 0;
        while (1)
        {
            ptr = *(long long *)(idx + 8) + v20;
            v23 = ptr;
            *(char *)v23 = 0;
            if (v14 && sub_9d4abc(v14, ptr, 0x1ff) >> 31 & 1)
                goto LABEL_9f3e28;
            *((char *)&ptr[0xff] + 1) = 0;
            len = _strlen(ptr);
            v25 = v19 & (int)len > 2;
            v26 = v25;
            if (v25 == 1)
            {
                if (*ptr == 48111)
                {
                    v27 = arm64g_calculate_condition(3, v26, 1, 0);
                    v28 = 3;
                    v29 = (v27 & 1 ? (char)ptr[1] : 0);
                    v30 = (v27 & 1 ? 191 : 0);
                    v31 = arm64g_calculate_condition(3, v29, v30, 0);
                    if (v31 & 1)
                        goto LABEL_9f339c;
                }
                else
                {
                    v32 = arm64g_calculate_condition(3, v26, 1, 0);
                    v28 = 0;
                    v29 = (v32 & 1 ? (char)ptr[1] : 0);
                    v30 = (v32 & 1 ? 191 : 0);
                    v33 = arm64g_calculate_condition(0, v29, v30, 0);
                    if (v33 & 1)
                    {
LABEL_9f339c:
                        n = (unsigned int)len - 3;
                        _memmove(ptr, (char *)&v23[1] + 1, n);
                        *((char *)ptr + n) = 0;
                        len = n;
                        goto LABEL_9f33b8;
                    }
                }
                v34 = 1;
                goto LABEL_9f34b8;
            }
LABEL_9f33b8:
            v34 = (unsigned int)len != 0;
            if (!(v21 & 1) && !(v34 & 1))
            {
                if (v6)
                {
                    v36 = sub_9f42a0(v7, &v6);
                    if (v36)
                        goto LABEL_9f340c;
                    sub_a6c2e4(v7, "crypto/conf/conf_def.c", 293);
                    v7 = 0;
                }
                v36 = sub_ad692c(v17);
                if (!v36)
                    goto LABEL_9f3f74;
LABEL_9f340c:
                v37 = v36;
                sub_9d3d34(v14);
                if (sub_9d4abc(v37, ptr, 0x1ff) >> 31 & 1)
                {
                    v14 = v37;
                    goto LABEL_9f3e2c;
                }
                while (1)
                {
                    *((char *)&ptr[0xff] + 1) = 0;
                    len = _strlen(ptr);
                    if ((unsigned int)len)
                    {
                        v34 = 1;
                        v14 = v37;
                        goto LABEL_9f34ac;
                    }
                    if (!v6)
                    {
LABEL_9f3430:
                        v38 = sub_ad692c(v17);
                        if (!v38)
                            break;
                        else
                            goto LABEL_9f343c;
                        goto LABEL_9f343c;
                    }
                    else
                    {
                        v38 = sub_9f42a0(v7, &v6);
                        if (v38)
                        {
LABEL_9f343c:
                            v14 = v38;
                            sub_9d3d34(v37);
                            v37 = v14;
                            if (sub_9d4abc(v14, ptr, 0x1ff) >> 31 & 1)
                                goto LABEL_9f3e28;
                        }
                        else
                        {
                            sub_a6c2e4(v7, "crypto/conf/conf_def.c", 293);
                            v7 = 0;
                            goto LABEL_9f3430;
                        }
                    }
                }
LABEL_9f3f74:
                sub_9ebcf4(idx);
                sub_a6c2e4(v8, "crypto/conf/conf_def.c", 561);
                sub_ad6020(v17);
                v140 = 1;
                goto LABEL_9f3f3c;
            }
            else
            {
LABEL_9f34ac:
                v39 = len;
                v28 = 3;
                v29 = len & 0xffffffff;
                v30 = 1;
                if ((int)len < 1)
                    goto LABEL_9f34dc;
LABEL_9f34b8:
                v40 = len & 0xffffffff;
                do
                {
                    v39 = v40;
                    v41 = *((char *)ptr + v39 - 1);
                    if (v41 != 13)
                    {
                        v42 = arm64g_calculate_condition(v28 | 16, v29, v30, 0);
                        v43 = arm64g_calculate_condition(19, (v42 & 1 ? v41 & 0xff : 0x40000000), (v42 & 1 ? 10 : 0), 0);
                        if (!(v43 & 1))
                            continue;
                    }
                    else
                    {
                        v44 = arm64g_calculate_condition(v28 | 16, v29, v30, 0);
                        v45 = arm64g_calculate_condition(16, (v44 & 1 ? v41 & 0xff : 0x40000000), (v44 & 1 ? 10 : 0), 0);
                        if (v45 & 1)
                            goto LABEL_9f34dc;
                    }
                } while ((v40 = v39 - 1, v28 = 4, v29 = v39, v30 = 1, 1 < v39));
                v39 = 0;
LABEL_9f34dc:
                if (v34 && v39 == (unsigned int)len)
                {
                    v20 += len;
                    goto LABEL_9f34ec;
                }
                else
                {
                    *((char *)ptr + v39) = 0;
                    v18 += 1;
                    v46 = v39 + v20;
                    v47 = *(long long *)(idx + 8);
                    v48 = v46;
                    if (v46 >= 1 && !(v49 = &v47[v46], v50 = *(v49 - 1), v50 < 0 || !((unsigned short)(*(short *)((long long)a0[8] + v50 * 2)) >> 5 & 1) || (v20 = v46 - 1, v48 = v46, v46 != 1 && !(v51 = *(v49 - 2), v51 < 0 || !((unsigned short)(*(short *)((long long)a0[8] + v51 * 2)) >> 5 & 1)))))
                    {
LABEL_9f34ec:
                        v21 = 1;
                        goto LABEL_9f39cc;
                    }
                    else
                    {
                        v52 = 3;
                        v53 = 1;
                        v54 = *v47;
                        v55 = v54 & 0xff;
                        v13 = (unsigned short *)v5;
                        v56 = v55;
                        node = v47;
                        if (!(v54 >> 31 & 1))
                        {
                            v56 = v55;
                            node = v47;
                            do
                            {
                                v58 = *(short *)((long long)a0[8] + v56 * 2);
                                if (v58 >> 11 & 1)
                                    goto LABEL_9f3658;
                            } while (v58 >> 4 & 1 && !(v59 = node[1], node += 1, v56 = v59 & 0xff, v59 >> 31 & 1));
                        }
                    }
                }
            }
            while (1)
            {
                if (v56 >> 7 & 1)
                {
LABEL_9f3568:
                    v62 = node + 1;
                    goto LABEL_9f356c;
                }
                v60 = (long long)a0[8];
                v61 = v60[v56];
                if (v61 >> 7 & 1)
                    break;
                if (v61 >> 10 & 1)
                {
                    while (1)
                    {
                        v77 = node;
                        v78 = node;
                        v79 = v78[1];
                        v80 = v78 + 1;
                        v81 = v79 & 0xff;
                        if (!(v79 >> 31 & 1) && v60[v81] >> 3 & 1)
                            break;
                        node = v80;
                        if (v81 == v56 && (v82 = v77, node = v82 + 2, v82[2] != v56))
                        {
                            v81 = v56;
                            break;
                        }
                    }
                    v75 = v77 + 2;
                    v48 = v81;
                    v53 = v56;
                    v83 = arm64g_calculate_condition(4, v48, v53, 0);
                    node = v80;
                    if (!(v83 & 1))
                        goto LABEL_9f3652;
                    goto LABEL_9f3651;
                }
                if (!(v61 >> 6 & 1))
                {
                    if (!(v61 >> 5 & 1))
                    {
                        if (v61 >> 3 & 1)
                            goto LABEL_9f3660;
                        goto LABEL_9f3568;
                    }
                    else
                    {
                        v63 = node;
                        v64 = v63[1];
                        v62 = v63 + 1;
                        if (v64 < 0 || !(v60[v64] >> 3 & 1))
                        {
                            v62 = node + 2;
                            goto LABEL_9f356c;
                        }
                    }
                }
                while (1)
                {
                    v65 = node;
                    v66 = node[1];
                    node += 1;
                    v67 = v66 & 0xff;
                    if (v66 >> 31 & 1)
                    {
                        v52 = 4;
                        v48 = v67;
                        v53 = v56;
                        if (v67 != v56)
                            continue;
                        v67 = v56;
LABEL_9f3648:
                        v75 = v65 + 2;
                        v48 = v67;
                        v53 = v56;
                        v76 = arm64g_calculate_condition(4, v48, v53, 0);
                        if (v76 & 1)
                        {
LABEL_9f3651:
                            v62 = v75;
                            goto LABEL_9f3654;
                        }
                        else
                        {
LABEL_9f3652:
                            v62 = node;
                            v52 = 4;
LABEL_9f3654:
LABEL_9f356c:
                            v56 = *v62;
                            node = v62;
                            break;
                        }
                    }
                    else
                    {
                        v68 = v60[v67];
                        v69 = (unsigned int)v68 & 8;
                        if (v67 != v56)
                        {
                            v70 = arm64g_calculate_condition(v52 | 16, v48, v53, 0);
                            v52 = 3;
                            v48 = (v70 & 1 ? v69 : 0);
                            v71 = arm64g_calculate_condition(19, v48, 0, 0);
                            if (v71 & 1)
                                goto LABEL_9f3648;
                        }
                        else
                        {
                            v72 = arm64g_calculate_condition(v52 | 16, v48, v53, 0);
                            v52 = 0;
                            v48 = (v72 & 1 ? v69 : 0);
                            v73 = arm64g_calculate_condition(16, v48, 0, 0);
                            if (v73 & 1)
                                goto LABEL_9f3648;
                        }
                        v53 = 0;
                        if (v68 >> 5 & 1 && (v74 = v65[2], v62 = v65 + 2, node = v62, v74 >= 0 && (node = v62, v60[v74] >> 3 & 1)))
                            goto LABEL_9f356c;
                    }
                }
            }
LABEL_9f3658:
            *node = 0;
            v55 = *v47;
LABEL_9f3660:
            if (!(v55 >> 7 & 1))
                break;
LABEL_9f369c:
            v88 = sub_9f4410(a0, v47);
            v89 = *v88;
            if ((unsigned int)v89 == 58 && v88[1] == 58)
            {
                *v88 = 0;
                v90 = v88 + 2;
                v88 = sub_9f4410(a0, v90);
                v89 = *v88;
                v91 = v47;
                v47 = v90;
            }
            else
            {
                v91 = (char *)v8;
            }
            if (!(v89 >> 7 & 1))
            {
                iter1 = (unsigned short)v88;
                do
                {
                } while ((*(short *)((long long)a0[8] + (v89 & 0xffffffff) * 2) & 24) == 16 && (v93 = *(char *)(iter1 + 1), iter1 += 1, v89 = (unsigned int)v93 & 0xff, !(v93 >> 31 & 1)));
                v94 = (unsigned int)v89 == 61;
            }
            else
            {
                v94 = 0;
                iter1 = (unsigned short)v88;
            }
            if (_strncmp(v47, ".pragma", 7))
            {
                if (!_strncmp(v47, ".include", 8))
                {
                    if (iter1 != v47 + 8)
                        v114 = 0;
                    else
                        v114 = v94 ^ 1;
                    if (v114 & 1)
                        goto LABEL_9f3ff0;
                    goto LABEL_9f39fc;
                }
                if (!(v94 & 1))
                {
LABEL_9f3ff0:
                    sub_a368c8();
                    sub_a369bc("crypto/conf/conf_def.c", 524, "def_load_bio");
                    v0 = iter1;
                    goto LABEL_9f3e24;
                }
                *v88 = 0;
                v95 = *(char *)(iter1 + 1);
                v96 = iter1 + 1;
                v2 = v18;
                if (!(v95 >> 31 & 1))
                {
                    v97 = v95 & 0xff;
                    do
                    {
                        v13 = (unsigned short *)v5;
                    } while ((*(short *)((long long)a0[8] + v97 * 2) & 24) == 16 && (v98 = v96[1], v96 += 1, v97 = v98 & 0xff, v13 = (unsigned short *)v5, !(v98 >> 31 & 1)));
                }
                else
                {
                    v13 = (unsigned short *)v5;
                }
                v99 = v91;
                sub_9f4958(a0, v96);
                v100 = sub_a6bf4c(24, "crypto/conf/conf_def.c", 533);
                if (!v100 || (v101 = sub_a6d9b4(v47, "crypto/conf/conf_def.c", 535), v102 = (st_9f326c_0 *)v100, *(unsigned long long *)&v102[1].padding_0[6] = 0, *(unsigned long long *)&v102->field_8 = v101, !v101 || (v103 = v99, !sub_9f4488(a0, v99))))
                {
                    v15 = v4;
                    v18 = v2;
                    goto LABEL_9f3e30;
                }
                v15 = v4;
                v18 = v2;
                if (_strcmp(v103, v8) && !sub_9f2bf4(a0, v103) && !sub_9f3078(a0, v103))
                {
                    sub_a368c8();
                    sub_a369bc("crypto/conf/conf_def.c", 548, "def_load_bio");
                    v141 = 103;
LABEL_9f4050:
                    sub_a36abc(14, v141, 0);
                    goto LABEL_9f3e30;
                }
                if (sub_9f2c74(a0))
                    goto LABEL_9f39c4;
                sub_a368c8();
                sub_a369bc("crypto/conf/conf_def.c", 554, "def_load_bio");
                v141 = 524302;
                goto LABEL_9f4050;
            }
            else
            {
                if (iter1 != v47 + 7)
                {
                    if (!v94)
                        goto LABEL_9f38c8;
                }
                else
                {
                    if (!(v94 & 1))
                    {
                        if (_strncmp() || iter1 == v47 + 15)
                            goto LABEL_9f3ff0;
LABEL_9f39fc:
                        v9 = 0;
                        v130 = sub_a6ac44("OPENSSL_CONF_INCLUDE");
                        if (!v130)
                            v130 = (long long)a0[32];
                        if (*(char *)iter1 == 61)
                        {
                            v131 = *(char *)(iter1 + 1);
                            iter1 += 1;
                            if (!(v131 >> 31 & 1))
                            {
                                v132 = v131 & 0xff;
                                do
                                {
                                } while ((*(short *)((long long)a0[8] + v132 * 2) & 24) == 16 && (v133 = *(char *)(iter1 + 1), iter1 += 1, v132 = v133 & 0xff, !(v133 >> 31 & 1)));
                            }
                        }
                        sub_9f4958(a0, iter1);
                        if (!sub_9f4488(a0, v91, &v9, iter1))
                        {
LABEL_9f416c:
                            v15 = v4;
                            v13 = (unsigned short *)v5;
LABEL_9f4170:
                            v100 = 0;
                            goto LABEL_9f3e30;
                        }
                        v134 = v9;
                        if (!v130 || *(char *)v134 == 47)
                        {
                            v138 = v134;
                        }
                        else
                        {
                            len1 = _strlen(v130);
                            v136 = len1 + _strlen(v134);
                            v137 = sub_a6bf4c(v136 + 2, "crypto/conf/conf_def.c", 471);
                            if (v137)
                            {
                                v138 = v137;
                                sub_a6db20();
                                if (!*(char *)v138 || *(char *)(v138 + _strlen(v138) - 1) != 47)
                                    sub_a6db94(v138, "/", v136 + 2);
                                sub_a6db94(v138, v134, v136 + 2);
                                sub_a6c2e4(v134, "crypto/conf/conf_def.c", 481);
                            }
                            else
                            {
                                sub_a6c2e4(v134, "crypto/conf/conf_def.c", 473);
                                goto LABEL_9f416c;
                            }
                        }
                        if ((int)a0[28] && *(char *)v138 != 47)
                        {
                            sub_a368c8();
                            sub_a369bc("crypto/conf/conf_def.c", 488, "def_load_bio");
                            sub_a36abc(14, 125, 0);
                            sub_a6c2e4(v138, "crypto/conf/conf_def.c", 489);
                            goto LABEL_9f416c;
                        }
                        v139 = sub_9f4a58(v138, &v6, &v7);
                        if (v138 != v7)
                            sub_a6c2e4(v138, "crypto/conf/conf_def.c", 498);
                        if (!v139)
                            goto LABEL_9f3b94;
                        if (v17 || !(v17 = sub_ad61b4(), !v17))
                        {
                            if (sub_ad68a0(v17, v14))
                            {
                                v14 = v139;
                                goto LABEL_9f3b94;
                            }
                            else
                            {
                                sub_a368c8();
                                v142 = 515;
                                goto LABEL_9f4148;
                            }
                        }
                        else
                        {
                            sub_a368c8();
                            v142 = 509;
LABEL_9f4148:
                            sub_a369bc("crypto/conf/conf_def.c", v142, "def_load_bio");
                            sub_a36abc(14, 0x8000f, 0);
                            sub_9d3c28(v139);
                            goto LABEL_9f416c;
                        }
                    }
                }
                v104 = *(char *)(iter1 + 1);
                iter1 += 1;
                if (!(v104 >> 31 & 1))
                {
                    v105 = v104 & 0xff;
                    do
                    {
                        v13 = (unsigned short *)v5;
                    } while ((*(short *)((long long)a0[8] + v105 * 2) & 24) == 16 && (v106 = *(char *)(iter1 + 1), iter1 += 1, v105 = v106 & 0xff, v13 = (unsigned short *)v5, !(v106 >> 31 & 1)));
                    goto LABEL_9f38d4;
                }
LABEL_9f38c8:
                v13 = (unsigned short *)v5;
LABEL_9f38d4:
                sub_9f4958(a0, iter1);
                ptr1 = _strchr(iter1, 58);
                if (!ptr1 || ptr1 == iter1 || (v108 = (st_9f326c_1 *)ptr1, v109 = &v108->field_1, !v108->field_1))
                {
                    sub_a368c8();
                    sub_a369bc("crypto/conf/conf_def.c", 405, "def_load_bio");
                    sub_a36abc(14, 122, 0);
LABEL_9f3fe4:
                    v100 = 0;
                    v15 = v4;
                    goto LABEL_9f3e30;
                }
                *(char *)v108->padding_0 = 0;
                sub_9f4958(a0, iter1);
                v110 = v108->field_1;
                if (!(v110 >> 31 & 1))
                {
                    v111 = v110 & 0xff;
                    do
                    {
                    } while ((*(short *)((long long)a0[8] + v111 * 2) & 24) == 16 && (v112 = v109[1], v109 += 1, v111 = v112 & 0xff, !(v112 >> 31 & 1)));
                }
                if (_strcmp(iter1, "dollarid") && _strcmp(iter1, "abspath") && !_strcmp(iter1, "includedir"))
                {
                    sub_a6c2e4((long long)a0[32], "crypto/conf/conf_def.c", 427);
                    v113 = sub_a6d9b4(v109, "crypto/conf/conf_def.c", 428);
                    *(unsigned long long *)&a0[32] = v113;
                    if (!v113)
                        goto LABEL_9f3fe4;
                    goto LABEL_9f39c4;
                }
                if (!sub_9f49a4(v109))
                    goto LABEL_9f3fe4;
LABEL_9f39c4:
                v21 = 0;
                v20 = 0;
LABEL_9f39cc:
                v19 = 0;
                if (!sub_9ebd68(idx, v20 + 0x200))
                    goto LABEL_9f3df8;
            }
        }
        v84 = (long long)a0[8];
        iter = v47 + 1;
        while (1)
        {
            v86 = v84[v55];
            if (((unsigned int)v86 & 24) != 16)
                break;
            v87 = *iter;
            iter += 1;
            v55 = v87 & 0xff;
            if (v87 >> 31 & 1)
                goto LABEL_9f3698;
        }
        if (v86 >> 3 & 1)
            goto LABEL_9f39c4;
        if (v55 != 91)
        {
LABEL_9f3698:
            v47 = iter - 1;
            goto LABEL_9f369c;
        }
        else
        {
            v115 = *iter;
            v116 = v115 & 0xff;
            v15 = v4;
            if (!(v115 >> 31 & 1))
            {
                do
                {
                } while ((v84[v116] & 24) == 16 && (v117 = iter[1], iter += 1, v116 = v117 & 0xff, !(v117 >> 31 & 1)));
            }
            while (1)
            {
                v118 = iter;
                if (!(v116 >> 7 & 1))
                {
                    v119 = v118;
                    do
                    {
                        v120 = v84[v116];
                        if (v120 >> 5 & 1)
                        {
                            v122 = v119;
                            v123 = v122[1];
                            v121 = v122 + 1;
                            if (v123 < 0 || !(v84[v123] >> 3 & 1))
                                v121 = v119 + 2;
                        }
                        else if ((unsigned int)v120 & 775 || v120 >> 12 & 1 && (int)a0[24])
                        {
                            v121 = v119 + 1;
                            continue;
                        }
                        else if ((v84[v116] >> 3 & 3) == 2)
                        {
                            v126 = v119 + 1;
                            do
                            {
                                v125 = v126;
                                v127 = *v126;
                                v116 = v127 & 0xff;
                            } while (!(v127 >> 31 & 1) && (v126 = v125 + 1, (v84[v116] & 24) == 16));
                            v121 = v119;
                            if (!v116)
                                goto LABEL_9f405c;
                            goto LABEL_9f3c8c;
                        }
                        else
                        {
                            v121 = v119;
                            v125 = v119;
                            if (!v116)
                                goto LABEL_9f405c;
                            goto LABEL_9f3c8c;
                        }
                    } while ((v124 = *v121, v116 = v124 & 0xff, v119 = v121, v125 = v121, !(v124 >> 31 & 1)));
                    goto LABEL_9f3c8c;
                }
                else
                {
                    v121 = v118;
                    v125 = v118;
                }
                if (!v116)
                    goto LABEL_9f405c;
LABEL_9f3c8c:
                if (v116 == 93)
                    break;
                iter = v125;
                if (v118 == v125)
                {
LABEL_9f405c:
                    sub_a368c8();
                    sub_a369bc("crypto/conf/conf_def.c", 366, "def_load_bio");
                    sub_a36abc(14, 100, 0);
                    v100 = 0;
                    goto LABEL_9f3e30;
                }
            }
            *v121 = 0;
            if (!sub_9f4488(a0, 0, &v8))
                goto LABEL_9f4170;
            v128 = v8;
            v129 = sub_9f2bf4(a0, v128);
            if (v129)
            {
                v3 = v129;
                goto LABEL_9f3b94;
            }
            v3 = sub_9f3078(a0, v128);
            if (!v3)
            {
                sub_a368c8();
                sub_a369bc("crypto/conf/conf_def.c", 375, "def_load_bio");
                goto LABEL_9f3e20;
            }
        }
LABEL_9f3b94:
        v19 = 0;
        if (!sub_9ebd68(idx, 0x200))
            goto LABEL_9f3df8;
    }
}
