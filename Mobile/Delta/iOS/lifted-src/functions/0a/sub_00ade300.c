/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xade300..0xaded90 (2704 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ade300_4 {
    char padding_0[8];
    long long field_8;
} st_ade300_4;

typedef struct st_ade300_6 {
    struct st_ade300_7 *field_0;
    struct st_ade300_5 *field_8;
} st_ade300_6;

typedef struct st_ade300_8 {
    char padding_0[8];
    struct st_ade300_5 *field_8;
} st_ade300_8;

typedef struct st_ade300_1 {
    struct st_ade300_0 *field_0;
    long long field_8;
} st_ade300_1;

typedef struct st_ade300_5 {
    char padding_0[16];
    unsigned int field_10;
} st_ade300_5;

typedef struct st_ade300_0 {
    char padding_0[16];
    unsigned long long field_10;
} st_ade300_0;

typedef struct st_ade300_2 {
    char padding_0[24];
    unsigned long long field_18;
} st_ade300_2;

typedef struct st_ade300_3 {
    char padding_0[32];
    long long field_20;
    char padding_28[16];
    unsigned int field_38;
} st_ade300_3;

typedef struct st_ade300_7 {
    char field_0;
} st_ade300_7;


unsigned long long sub_ade300(unsigned long a0, unsigned long a1, long long a2, long long a3, unsigned int a4)
{
    unsigned long long v5;  // x0
    unsigned long long v6;  // w19
    unsigned long long v15;  // x0
    unsigned long long v101;  // x22
    char *v102;  // x21
    char *v103;  // x26
    unsigned long long v104;  // x0
    unsigned long long *node;  // x19
    unsigned long long i;  // w24
    unsigned long long v107;  // x25
    unsigned long long v108;  // x22
    long long v109;  // x0
    long long v110;  // x23
    unsigned long long v16;  // x24
    unsigned long long v111;  // x0
    unsigned long long v112;  // x0
    unsigned long long v113;  // x21
    unsigned long long v114;  // x23
    unsigned long long v115;  // x19
    unsigned long long v116;  // x23
    long long v117;  // x25
    unsigned long long v118;  // x0
    unsigned long long v119;  // x0
    unsigned long long v120;  // x25
    unsigned long v17;  // x1
    unsigned long v121;  // x2
    st_ade300_7 **v122;  // x24
    unsigned long long v123;  // x0
    long long v18;  // x0
    unsigned long long v19;  // x0
    st_ade300_2 *v20;  // x0
    unsigned long v21;  // cc_dep1
    unsigned long long v22;  // x8
    unsigned long long v23;  // x9
    unsigned long long v24;  // 4110
    unsigned long long v7;  // w21
    unsigned long long v25;  // 4108
    unsigned long long v26;  // 4110
    unsigned long long v27;  // 4108
    unsigned long long v28;  // x24
    unsigned long long v29;  // x0
    unsigned long long v30;  // x0
    st_ade300_3 *v31;  // x26
    unsigned long long v32;  // x0
    unsigned long v33;  // x28
    unsigned long long v34;  // x25
    unsigned long long v8;  // w8
    unsigned int *iter;  // x19
    unsigned long v36;  // x28
    unsigned long v37;  // x1
    long long v38;  // x27
    unsigned long long v39;  // x26
    long long *v40;  // x25
    unsigned int v42;  // w8
    unsigned long long v43;  // w9
    long long v44;  // x10
    unsigned long v9;  // x20
    unsigned long v45;  // cc_op
    unsigned long v46;  // cc_dep1
    unsigned long v47;  // cc_dep2
    unsigned long v48;  // cc_ndep
    unsigned long v49;  // 4110
    unsigned long v50;  // cc_op
    unsigned long v51;  // cc_dep1
    unsigned long v52;  // cc_dep2
    unsigned long long v53;  // 4108
    unsigned long long v10;  // 4102
    unsigned long v54;  // 4110
    unsigned long long v55;  // 4108
    unsigned long v56;  // cc_ndep
    unsigned long long v57;  // w8
    long long v58;  // x9
    unsigned long long v59;  // 4110
    unsigned long long v60;  // 4108
    unsigned long long idx;  // x20
    unsigned long long v61;  // 4110
    unsigned long long v62;  // 4108
    unsigned long long v63;  // w8
    unsigned long long *v64;  // x24
    unsigned long long *v65;  // x23
    unsigned long long *v66;  // x23
    st_ade300_1 *v67;  // x19
    unsigned long long v68;  // x26
    st_ade300_1 *v69;  // x21
    st_ade300_4 *v70;  // x27
    unsigned long long v12;  // x25
    unsigned long long v71;  // w19
    unsigned long long v72;  // x25
    long long v73;  // x28
    st_ade300_1 *v74;  // x21
    unsigned long long v75;  // x26
    void* *v76;  // x27
    unsigned long long v77;  // x0
    unsigned long long v78;  // x28
    unsigned long v79;  // x25
    unsigned long long v80;  // w0
    unsigned long v13;  // x26
    unsigned long v81;  // x19
    unsigned long long v82;  // x25
    unsigned long long v83;  // x28
    unsigned long long v84;  // x0
    unsigned long v85;  // x24
    unsigned long long v86;  // w0
    unsigned long long v87;  // w19
    unsigned long v88;  // x25
    st_ade300_6 *v89;  // x0
    unsigned long long *v90;  // x19
    long long v14;  // x0
    unsigned long v91;  // x24
    unsigned long long v92;  // w0
    unsigned long long v93;  // w21
    unsigned long v94;  // x25
    st_ade300_8 *v95;  // x0
    unsigned long long *v96;  // x21
    unsigned long long v97;  // x0
    unsigned long long index;  // x8
    unsigned long long v99;  // x0
    long long v100;  // x27
    unsigned int v0;  // [bp-0x70], Other Possible Types: unsigned long long
    unsigned int v1;  // [bp-0x6c], Other Possible Types: unsigned long long
    unsigned long long v2;  // [bp-0x68]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v2 = 0;
    *(unsigned long long *)a0 = 0;
    *(unsigned int *)a1 = 0;
    v5 = sub_ad69e4(a2);
    if (!(a4 & 0x100))
        v6 = (unsigned int)v5;
    else
        v6 = 0;
    if (!(a4 & 0x200))
        v7 = (unsigned int)v5;
    else
        v7 = 0;
    if (!(a4 & 0x400))
        v8 = (unsigned int)v5;
    else
        v8 = 0;
    v9 = (unsigned int)v5 - 1;
    if ((int)v5 < 1)
        return 0;
    v10 = arm64g_calculate_condition(19, v5 & 0xffffffff, 1, 0);
    if (!(v10 & 1))
    {
        sub_ade218(0);
        return 1;
    }
    v12 = v5;
    v1 = v8;
    v0 = (unsigned int)v5 - 2;
    v13 = v9;
    do
    {
        v13 = (unsigned int)v13 - 1;
        v14 = sub_ad69f8(a2, v13);
        sub_aea738(v14, 0xffffffff, 0);
        v15 = sub_add754(v14);
        if (!v15)
            return v15;
    } while (0 < (int)v13);
    v16 = 1;
    do
    {
        if (0 >= v6 && v16 >> 1 & 1)
            break;
        v9 = (unsigned int)v9 - 1;
        v17 = v9;
        v18 = sub_ad69f8(a2, v17);
        v19 = sub_aeb448(v18, v17);
        if (v19 >> 11 & 1)
            return 0xffffffff;
        v20 = sub_add754(v18);
        if (v16 & 1)
        {
            if (!*(long long *)&v20->padding_0[8])
                v16 = 2;
            else
                v16 &= 0xffffffff;
        }
        v21 = v6;
        if (v6 < 1)
            continue;
        v22 = v6 + (((unsigned int)v19 * 0x8000000 | (unsigned int)v19 >> 5) & 4160749569 & 1) - 1;
        v23 = v20->field_18;
        if ((long long)v23 < (long long)v22)
        {
            v24 = arm64g_calculate_condition(179, v21, 1, 0);
            v25 = arm64g_calculate_condition(194, (v24 & 1 ? v23 : 0x40000000), v24 & 1, 0);
            if (!(v25 & 1))
                goto LABEL_ade446;
            goto LABEL_ade445;
        }
        else
        {
            v26 = arm64g_calculate_condition(179, v21, 1, 0);
            v27 = arm64g_calculate_condition(192, (v26 & 1 ? v23 : 0x40000000), v26 & 1, 0);
            if (v27 & 1)
            {
LABEL_ade445:
                v6 = (unsigned int)v23;
                goto LABEL_ade448;
            }
            else
            {
LABEL_ade446:
                v6 = (unsigned int)v22;
LABEL_ade448:
            }
        }
    } while ((int)v9 > 0);
    if (!v6)
        v28 = (unsigned int)v16 | 4;
    else
        v28 = v16 & 0xffffffff;
    if (!(v28 & 1))
    {
        idx = 0;
        goto LABEL_ade460;
    }
    v29 = sub_a6bffc(64, "crypto/x509/pcy_tree.c", 177);
    if (!v29)
        return v29;
    idx = v29;
    *(unsigned long long *)(v29 + 8) = 1000;
    v30 = sub_a6bffc((v12 * 32 | v12 >> 59) & 0x1fffffffe0 & 0x1fffffffff, "crypto/x509/pcy_tree.c", 190);
    *(unsigned long long *)(idx + 16) = v30;
    if (!v30)
    {
        sub_a6c2e4(idx, "crypto/x509/pcy_tree.c", 191);
        return 0;
    }
    v31 = v30;
    *(unsigned int *)(idx + 24) = v12;
    v32 = sub_addbd8(0, sub_a99624(746), 0);
    v33 = v0;
    if (!v32)
    {
LABEL_aded2c:
        sub_ade218(idx);
        return 0;
    }
    v34 = v32;
    if (!sub_addf68(v31, v34, 0, idx, 1))
    {
        sub_addb74(v34);
        sub_ade218(idx);
        return 0;
    }
    iter = &v31->field_38;
    do
    {
        v36 = v33;
        v37 = v36;
        v38 = sub_ad69f8(a2, v37);
        v39 = sub_aeb448(v38, v37);
        v40 = sub_add754(v38);
        if (!sub_af3b1c(v38))
        {
            sub_ade218(idx);
            return 0;
        }
        *(long long *)((char *)iter - 24) = v38;
        if (!*v40)
            *iter = *iter | 0x200;
        v42 = __ROL__((unsigned int)v39, 27) & 4160749569 & 1;
        if (v7)
        {
            v43 = v7 + v42 - 1;
            v44 = v40[2];
            if (v44 < v43)
            {
                v49 = arm64g_calculate_condition(v45 | 176, v46, v47, v48);
                v50 = 2;
                v51 = (v49 & 1 ? v44 : 0x40000000);
                v52 = v49 & 1;
                v53 = arm64g_calculate_condition(194, v51, v52, 0);
                if (!(v53 & 1))
                    goto LABEL_ade592;
            }
            else
            {
                v54 = arm64g_calculate_condition(v50 | 176, v51, v52, v48);
                v50 = 0;
                v51 = (v54 & 1 ? v44 : 0x40000000);
                v52 = v54 & 1;
                v55 = arm64g_calculate_condition(192, v51, v52, 0);
                if (!(v55 & 1))
                {
LABEL_ade592:
                    v7 = v43;
                    v56 = 0;
LABEL_ade594:
                    goto LABEL_ade5b8;
                }
            }
            v7 = (int)v44;
            goto LABEL_ade594;
        }
        else
        {
            if ((unsigned int)v36 && v39 >> 5 & 1)
            {
                v7 = 0;
            }
            else
            {
                v7 = 0;
                *iter = *iter | 0x200;
            }
LABEL_ade5b8:
            if (v1)
            {
                v57 = v1 + v42 - 1;
                v58 = v40[4];
                if (v58 < v57)
                {
                    v59 = arm64g_calculate_condition(v50 | 176, v51, v52, v56);
                    v60 = arm64g_calculate_condition(194, (v59 & 1 ? v58 : 0x40000000), v59 & 1, 0);
                    if (!(v60 & 1))
                        goto LABEL_ade512;
                }
                else
                {
                    v61 = arm64g_calculate_condition(v50 | 176, v51, v52, v56);
                    v62 = arm64g_calculate_condition(192, (v61 & 1 ? v58 : 0x40000000), v61 & 1, 0);
                    if (!(v62 & 1))
                    {
LABEL_ade512:
LABEL_ade514:
                        v1 = v57;
                        continue;
                    }
                }
                v57 = (int)v58;
                goto LABEL_ade514;
            }
            else
            {
                v1 = 0;
                *iter = *iter | 0x400;
            }
        }
    } while ((iter += 8, v33 = (unsigned int)v36 - 1, (int)v36 > 0));
LABEL_ade460:
    if (v28 >> 2 & 1)
    {
        *(unsigned int *)a1 = 1;
        if (v28 >> 1 & 1)
        {
            sub_ade218(idx);
            return 0xfffffffe;
        }
    }
    else if (v28 >> 1 & 1)
    {
        sub_ade218(idx);
        return 1;
    }
    v1 = v28;
    v63 = *(int *)(idx + 24);
    v64 = *(long long *)(idx + 16);
    if (v63 >= 2)
    {
        v0 = 1;
        v65 = v64;
    }
    else
    {
LABEL_adea18:
        v100 = a3;
        v101 = *(long long *)((char *)&v64[4 * v63] - 16);
        v102 = idx + 40;
        v103 = v102;
        if (v101)
        {
            v104 = *(long long *)v102;
            if (v104 || (v104 = sub_adde58(0), *(unsigned long long *)v102 = v104, v104))
            {
                if (!(sub_ad66d4(v104, v101) >> 31 & 1) || sub_ad68a0(*(long long *)v102, v101))
                {
                    v103 = &v2;
                    v100 = a3;
                    goto LABEL_adea6c;
                }
            }
        }
        else
        {
LABEL_adea6c:
            if (*(int *)(idx + 24) >= 2)
            {
                node = *(long long *)(idx + 16);
                i = 1;
                do
                {
                    v107 = node[2];
                    if (!v107)
                        break;
                    if ((int)sub_ad69e4(node[5]) >= 1)
                    {
                        v108 = 0;
                        do
                        {
                            v109 = sub_ad69f8(node[5], v108);
                            if (*(long long *)(v109 + 8) != v107)
                                continue;
                            v110 = v109;
                            v111 = *(long long *)v103;
                            if (v111 || (v111 = sub_adde58(0), *(unsigned long long *)v103 = v111, v111))
                            {
                                if (sub_ad66d4(v111, v110) >> 31 & 1 && !sub_ad68a0(*(long long *)v103, v110))
                                    goto LABEL_adeb18;
                            }
                            else
                            {
LABEL_adeb18:
                                if (v103 != &v2)
                                {
                                    sub_ade218(idx);
                                    return 0;
                                }
                                sub_ad6020(v2);
                                v2 = 0;
                                sub_ade218(idx);
                                return 0;
                            }
                        } while ((v108 = (unsigned int)v108 + 1, (int)sub_ad69e4(node[5]) > (int)v108));
                    }
                    node += 4;
                    i += 1;
                } while (*(int *)(idx + 24) > i);
            }
            if (v103 != &v2)
            {
                v112 = *(long long *)v102;
                v2 = v112;
            }
            else
            {
                v112 = v2;
            }
            sub_ad6ae4(v112);
            if ((int)sub_ad69e4(v100) >= 1)
            {
                v113 = *(long long *)(*(long long *)(idx + 16) + *(int *)(idx + 24) * 32 - 16);
                if ((int)sub_ad69e4(v100) >= 1)
                {
                    v114 = 0;
                    do
                    {
                        if (sub_a99eac(sub_ad69f8(v100, v114), v114) == 746)
                        {
                            v115 = 0;
                            *(unsigned int *)(idx + 56) = *(int *)(idx + 56) | 2;
                            goto LABEL_aded14;
                        }
                    } while ((v114 = (unsigned int)v114 + 1, (int)v114 < (int)sub_ad69e4(v100)));
                }
                if ((int)sub_ad69e4(v100) >= 1)
                {
                    v116 = 0;
                    do
                    {
                        v117 = sub_ad69f8(v100, v116);
                        v118 = sub_adde80(v2, v117);
                        if (!v118)
                        {
                            if (!v113)
                                continue;
                            v119 = sub_addbd8(0, v117, *(int *)*(long long *)v113 & 16);
                            if (!v119)
                                goto LABEL_aded10;
                            v120 = v119;
                            v121 = *(long long *)(v113 + 8);
                            *(long long *)(v119 + 16) = *(long long *)(*(long long *)v113 + 16);
                            *(unsigned int *)v119 = 12;
                            v118 = sub_addf68(0, v120, v121, idx, 1);
                            if (!v118)
                            {
                                sub_addb74(v120);
LABEL_aded10:
                                v115 = 1;
                                goto LABEL_aded14;
                            }
                        }
                        v122 = v118;
                        v123 = *(long long *)(idx + 48);
                        if (v123 || (v123 = sub_ad61b4(0), *(unsigned long long *)(idx + 48) = v123, v123))
                        {
                            if (!sub_ad68a0(v123, v122))
                                goto LABEL_adecb8;
                        }
                        else
                        {
LABEL_adecb8:
                            if (*v122 && (char)(*(char *)*v122) >> 3 & 1)
                            {
                                sub_a6c2e4(v122, "crypto/x509/pcy_tree.c", 625);
                                goto LABEL_aded10;
                            }
                        }
                    } while ((v116 = (unsigned int)v116 + 1, (int)sub_ad69e4(v100) > (int)v116));
                }
            }
            v115 = 0;
LABEL_aded14:
            if (v103 == &v2)
                sub_ad6020(v2);
            if (!(v115 & 1))
            {
                if (v1 >> 2 & 1 && (int)sub_ad69e4(sub_addcf0(idx)) <= 0)
                {
                    sub_ade218(idx);
                    return 0xfffffffe;
                }
                *(unsigned long long *)a0 = idx;
                return 1;
            }
        }
        goto LABEL_aded2c;
    }
    while (1)
    {
        v66 = v65 + 4;
        v67 = sub_add754(v65[4]);
        if ((int)sub_ad69e4(v67->field_8) >= 1)
        {
            v68 = 0;
            do
            {
                v69 = v67;
                v70 = sub_ad69f8(v67->field_8, v68);
                if ((int)sub_ad69e4(v64[1]) >= 1)
                {
                    v71 = 0;
                    v72 = 0;
                    do
                    {
                        v73 = sub_ad69f8(v64[1], v72);
                        if (sub_ade178(v64, v73, v70->field_8))
                        {
                            if (sub_addf68(v66, v70, v73, idx, 0))
                            {
                                v71 = 1;
                            }
                            else
                            {
                                sub_ade218(idx);
                                return 0;
                            }
                        }
                    } while ((v72 = (unsigned int)v72 + 1, (int)sub_ad69e4(v64[1]) > (int)v72));
                    if (v71)
                        continue;
                }
                if (v64[2] && !sub_addf68(v66, v70))
                    goto LABEL_aded2c;
            } while ((v68 = (unsigned int)v68 + 1, v67 = v69, (int)sub_ad69e4(v69->field_8) > (int)v68));
        }
        if (!((char)(*((char *)&v64[7] + 1)) >> 1 & 1))
        {
            v74 = v67;
            if ((int)sub_ad69e4(v64[1]) >= 1)
            {
                v75 = 0;
                do
                {
                    v76 = sub_ad69f8(v64[1], v75);
                    if (!((char)(*((char *)&v64[3] + 1)) >> 2 & 1) && *(char *)*v76 & 1)
                    {
                        v79 = (long long)(*v76)[24];
                        v80 = (unsigned int)sub_ad69e4(v79);
                        if ((int)v76[2] != v80)
                        {
                            v81 = v79;
                            if ((int)sub_ad69e4(v79) >= 1)
                            {
                                v82 = 0;
                                do
                                {
                                    v83 = sub_ad69f8(v81, v82);
                                    if (!sub_addec4(v66, v76, v83))
                                    {
                                        if (!v83)
                                            v83 = (long long)(*v76)[8];
                                        v84 = sub_addbd8(0, v83, *(int *)*v76 & 16);
                                        if (!v84)
                                        {
                                            sub_ade218(idx);
                                            return 0;
                                        }
                                        v78 = v84;
                                        *(unsigned long long *)(v84 + 16) = v74->field_0->field_10;
                                        *(unsigned int *)v84 = *(int *)v84 | 4;
                                        if (!sub_addf68(v66, v78, v76, idx, 1))
                                        {
                                            sub_addb74(v78);
                                            sub_ade218(idx);
                                            return 0;
                                        }
                                    }
                                } while ((v82 = (unsigned int)v82 + 1, (int)sub_ad69e4(v81) > (int)v82));
                            }
                        }
                    }
                    else if (!(int)v76[2])
                    {
                        v77 = sub_addbd8(0, (long long)(*v76)[8], *(int *)*v76 & 16);
                        if (!v77)
                        {
                            sub_ade218(idx);
                            return 0;
                        }
                        v78 = v77;
                        *(unsigned long long *)(v77 + 16) = v74->field_0->field_10;
                        *(unsigned int *)v77 = *(int *)v77 | 4;
                        if (!sub_addf68(v66, v78, v76, idx, 1))
                        {
                            sub_addb74(v78);
                            sub_ade218(idx);
                            return 0;
                        }
                    }
                } while ((v75 = (unsigned int)v75 + 1, (int)sub_ad69e4(v64[1]) > (int)v75));
            }
            goto LABEL_ade8a8;
            goto LABEL_aded2c;
        }
        else
        {
LABEL_ade8a8:
            if ((char)(*((char *)&v64[7] + 1)) >> 2 & 1)
            {
                v85 = v64[5];
                v86 = (unsigned int)sub_ad69e4(v85);
                if (v86 >= 1)
                {
                    v87 = v86 + 1;
                    do
                    {
                        v88 = v87 - 2;
                        v89 = sub_ad69f8(v85, v88);
                        if (*(char *)v89->field_0 & 3)
                        {
                            v89->field_8->field_10 = v89->field_8->field_10 - 1;
                            sub_a6c2e4();
                            sub_ad664c(v85, v88);
                        }
                    } while ((v87 -= 1, v87 > 1));
                }
            }
            v90 = v66;
        }
        while (1)
        {
            v91 = *(long long *)((char *)v90 - 24);
            v92 = (unsigned int)sub_ad69e4(v91);
            if (v92 >= 1)
            {
                v93 = v92 + 1;
                do
                {
                    v94 = v93 - 2;
                    v95 = sub_ad69f8(v91, v94);
                    if (!*(int *)&v95[1].padding_0[0])
                    {
                        v95->field_8->field_10 = v95->field_8->field_10 - 1;
                        sub_a6c2e4();
                        sub_ad664c(v91, v94);
                    }
                } while ((v93 -= 1, v93 > 1));
            }
            v96 = (char *)v90 - 32;
            v97 = *(long long *)((char *)v90 - 16);
            if (!v97)
            {
LABEL_ade940:
                v90 = v96;
                if (v90 == *(long long *)(idx + 16))
                {
                    sub_ade218(idx);
                    if (!(v1 & 4))
                        v99 = 1;
                    else
                        v99 = ~1;
                    return v99;
                }
            }
            else
            {
                if (!*(int *)(v97 + 16))
                {
                    index = *(long long *)(v97 + 8);
                    if (index)
                        *(int *)(index + 16) = *(int *)(index + 16) - 1;
                    sub_a6c2e4();
                    *(unsigned long long *)((char *)v90 - 16) = 0;
                    goto LABEL_ade940;
                }
                v90 = v96;
                if (v96 == *(long long *)(idx + 16))
                {
                    v63 = *(int *)(idx + 24);
                    v64 = v66;
                    v0 += 1;
                    v65 = v66;
                    if (v0 >= v63)
                    {
                        v64 = *(long long *)(idx + 16);
                        goto LABEL_adea18;
                    }
                }
            }
        }
    }
}
