/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb2220..0xb2c6c (2636 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b2220_1 {
    void* field_0;
    void* field_4;
} st_b2220_1;

typedef struct st_b2220_2 {
    void* field_0;
    void* field_4;
    void* field_6;
} st_b2220_2;

typedef struct st_b2220_4 {
    char padding_0[8];
    void* field_8;
    char padding_10[8];
    unsigned int field_18;
    char padding_1c[12];
    unsigned int field_28;
    unsigned int field_2c;
    char padding_30[4];
    unsigned int field_34;
    char padding_38[8];
    unsigned int field_40;
    char padding_44[28];
    unsigned long long field_60;
    char padding_68[152];
    unsigned int field_100;
    char padding_104[8];
    unsigned int field_10c;
    unsigned int field_110;
    char padding_114[24];
    void* field_12c;
} st_b2220_4;

typedef struct st_b2220_5 {
    struct st_b2220_6 *field_0;
} st_b2220_5;

typedef struct st_b2220_6 {
    struct st_b2220_5 *field_0;
} st_b2220_6;

typedef struct st_b2220_3 {
    unsigned long long field_0;
    struct st_b2220_2 *field_8;
    char padding_10[8];
    uint128_t *field_18;
    char padding_20[40];
    void* field_48;
    unsigned int field_4c;
} st_b2220_3;

typedef struct st_b2220_0 {
    char field_0;
} st_b2220_0;


void* sub_b2220(st_b2220_4 *a0, st_b2220_3 *a1, st_b2220_1 *a2, void* iter, unsigned long a4)
{
    unsigned long long v31;  // x28
    unsigned long long v32;  // x27
    unsigned long long v41;  // x30
    unsigned long v131;  // 4112
    unsigned long v132;  // cc_op
    unsigned long v133;  // cc_dep1
    unsigned long v134;  // 4112
    unsigned long long v135;  // 4114
    void* v136;  // w9
    void* v137;  // w10
    unsigned long v138;  // cc_dep1
    void* v139;  // w8
    unsigned long long v140;  // 4112
    void* v42;  // x24
    unsigned long long v141;  // 4112
    unsigned long long v142;  // 4112
    unsigned long long v143;  // 4108
    unsigned long long v144;  // 4112
    unsigned long long v145;  // 4108
    void* v146;  // w9
    st_b2220_1 *v43;  // x5
    void* v44;  // x26
    void* v45;  // x13
    void* v46;  // x14
    unsigned long v47;  // x8
    unsigned long long v48;  // x12
    unsigned int v49;  // w9
    unsigned int v50;  // w9
    unsigned long long v33;  // x26
    void* v51;  // w6
    void* v52;  // w7
    unsigned long v53;  // cc_dep1
    unsigned long v54;  // cc_dep2
    unsigned int v55;  // w10
    unsigned int v56;  // w9
    unsigned long iter1;  // x9
    unsigned long long v58;  // 4112
    unsigned long long v59;  // 4108
    unsigned long long v60;  // 4112
    unsigned long long v34;  // x25
    unsigned long long v61;  // 4108
    unsigned int v62;  // w8
    void* v63;  // w19
    void* v64;  // x28
    void* v65;  // x8
    void* v66;  // x10
    void* v67;  // w11
    void* v68;  // w11
    void* v69;  // w10
    unsigned long long v70;  // x13
    unsigned long long v35;  // x24
    char v71;  // x14
    char v72;  // x15
    unsigned int *v73;  // x16
    unsigned int v74;  // w17
    void* v75;  // w10
    unsigned int v76;  // w2
    unsigned long long v77;  // x2
    void* v78;  // w10
    unsigned long long v79;  // x2
    unsigned int v80;  // w2
    unsigned long long v36;  // x23
    void* v81;  // w10
    unsigned long long v82;  // x2
    unsigned int v83;  // w2
    void* v84;  // x25
    void* v85;  // x20
    void* v86;  // x22
    void* v87;  // x22
    unsigned long long v88;  // x8
    void* v89;  // x26
    void* v90;  // x19
    unsigned long long v37;  // x22
    void* v91;  // w13
    st_b2220_4 *v92;  // x22
    unsigned int v93;  // w8
    unsigned long v94;  // x8
    unsigned int v95;  // w8
    unsigned int v96;  // w8
    void* v97;  // x8
    unsigned long long v98;  // x9
    void* v99;  // x8
    void* v100;  // x23
    unsigned long long v38;  // x21
    void* v101;  // x8
    void* v102;  // x28
    st_b2220_4 *v103;  // x22
    uint128_t *v104;  // x9
    uint128_t *node;  // x9
    uint128_t *v106;  // x10
    uint128_t *v107;  // x10
    st_b2220_2 *v108;  // x8
    void* v109;  // x0
    unsigned int v110;  // w1
    unsigned long long v39;  // x20
    unsigned int *v111;  // x6
    void* v112;  // x9
    unsigned long long v113;  // x9
    unsigned int v114;  // w10
    unsigned long v115;  // x8
    void* v116;  // x9
    void* v117;  // w10
    void* v118;  // w10
    void* j;  // w9
    char v120;  // x14
    unsigned long long v40;  // x19
    unsigned long long v121;  // x12
    void* v122;  // w9
    unsigned long long v123;  // x15
    unsigned int v124;  // w15
    unsigned long long v125;  // x8
    void* v126;  // x24
    st_b2220_2 *v127;  // x8
    void* v128;  // x9
    unsigned long v129;  // cc_dep1
    unsigned long long v130;  // x10
    void* v0;  // [bp-0xe4]
    void* v1;  // [bp-0xe0]
    void* v2;  // [bp-0xdc]
    st_b2220_1 *v3;  // [bp-0xd8]
    unsigned long long v4;  // [bp-0xd0]
    unsigned int *v5;  // [bp-0xc8]
    unsigned int v6;  // [bp-0xbc]
    void* v7;  // [bp-0xb8]
    void* v8;  // [bp-0xa8]
    unsigned int v9;  // [bp-0x9c]
    void* i;  // [bp-0x98]
    st_b2220_0 **v11;  // [bp-0x90], Other Possible Types: char
    st_b2220_0 *v12;  // [bp-0x88]
    char v13;  // [bp-0x80]
    st_b2220_0 **v14;  // [bp-0x80]
    st_b2220_0 *v15;  // [bp-0x78], Other Possible Types: unsigned long
    st_b2220_6 **v16;  // [bp-0x70]
    st_b2220_6 **v17;  // [bp-0x68]
    unsigned long long v18;  // [bp-0x60]
    unsigned long long v19;  // [bp-0x58]
    unsigned long long v20;  // [bp-0x50]
    unsigned long long v21;  // [bp-0x48]
    unsigned long long v22;  // [bp-0x40]
    unsigned long long v23;  // [bp-0x38]
    unsigned long long v24;  // [bp-0x30]
    unsigned long long v25;  // [bp-0x28]
    unsigned long long v26;  // [bp-0x20]
    unsigned long long v27;  // [bp-0x18]
    char *v28;  // [bp-0x10]
    unsigned long long v29;  // [bp-0x8]
    char v30;  // [bp+0x0]

    v18 = v31;
    v19 = v32;
    v20 = v33;
    v21 = v34;
    v22 = v35;
    v23 = v36;
    v24 = v37;
    v25 = v38;
    v26 = v39;
    v27 = v40;
    v28 = &v30;
    v29 = v41;
    v42 = iter;
    v43 = a2;
    v12 = &v11;
    v11 = &v12;
    v44 = iter + a4;
    v45 = v44 - 16;
    v46 = a0->field_8;
    v47 = a0->field_18;
    v48 = v46 + v47;
    v49 = a0->field_110;
    if (a0->field_110 >= 6)
        v49 = 6;
    if (4 >= v49)
        v49 = 4;
    v50 = a0->field_10c;
    v6 = v50;
    if (v50 >= 6)
        v50 = 6;
    if (4 >= v50)
        v50 = 4;
    v9 = v50;
    v51 = (void*)(int)a2->field_0;
    v52 = (void*)*(int *)((char *)&a2->field_0 + 4);
    v4 = v48;
    v53 = v42 & 0xffffffff;
    v54 = v48 & 0xffffffff;
    if ((unsigned int)v42 == (unsigned int)v48)
        iter += 1;
    v55 = iter - v46;
    v56 = 1 << ((char)a0->field_100 & 31);
    iter1 = a0->field_2c;
    if (v56 < (unsigned int)(v55 - v47))
    {
        v58 = arm64g_calculate_condition(131, v53, v54, 0);
        v59 = arm64g_calculate_condition(3, (v58 & 1 ? a0->field_28 : 0), 0, 0);
        if (!(v59 & 1))
            goto LABEL_b22e2;
LABEL_b22e1:
        v62 = v55 - v56;
    }
    else
    {
        v60 = arm64g_calculate_condition(131, v53, v54, 0);
        v61 = arm64g_calculate_condition(0, (v60 & 1 ? a0->field_28 : 0), 0, 0);
        if (v61 & 1)
            goto LABEL_b22e1;
LABEL_b22e2:
        v62 = v47;
    }
    v63 = (void*)(v55 - v62);
    if (v63 < v52)
        v64 = 0;
    else
        v64 = v52;
    if (v63 < v51)
        v65 = 0;
    else
        v65 = v51;
    *(unsigned int *)&(a0->padding_114)[1] = 0;
    v17 = &v16;
    v16 = &v17;
    v8 = v46;
    v66 = v46 + iter1;
    v67 = (void*)(unsigned int)(v45 - v66);
    if (8 <= v67 + 1)
        v68 = (void*)8;
    else
        v68 = v67 + 1;
    i = v45;
    if (v45 < v66)
        v69 = (void*)0;
    else
        v69 = v68;
    if (v69 + (unsigned int)iter1 > (unsigned int)iter1)
    {
        v70 = a0->field_60;
        v71 = 24 - a0->field_34;
        v72 = 56 - a0->field_34;
        v73 = &a0->field_40;
        v74 = v6;
        if (4 >= v74)
        {
            do
            {
                v75 = v69;
                if (v49 == 4)
                {
                    v76 = (2654435761 * *(int *)((char *)v8 + iter1) ^ (unsigned int)v70) >> (v71 & 31);
                }
                else
                {
                    if (v49 == 5)
                        v77 = 0xcf1bbcdcbb000000 * *(long long *)((char *)v8 + iter1);
                    else
                        v77 = 0xcf1bbcdcbf9b0000 * *(long long *)((char *)v8 + iter1);
                    v76 = (v77 ^ v70) >> (v72 & 63);
                }
            } while ((v73[iter1 & 7] = v76, iter1 += 1, v69 = v75 - 1, v75 != 1));
        }
        else if (v74 == 5)
        {
            do
            {
                v78 = v69;
                if (v49 == 6)
                {
                    v79 = 0xcf1bbcdcbf9b0000 * *(long long *)((char *)v8 + iter1);
                    goto LABEL_b2448;
                }
                else if (v49 == 5)
                {
                    v79 = 0xcf1bbcdcbb000000 * *(long long *)((char *)v8 + iter1);
LABEL_b2448:
                    v80 = (v79 ^ v70) >> (v72 & 63);
                    continue;
                }
                else
                {
                    v80 = (2654435761 * *(int *)((char *)v8 + iter1) ^ (unsigned int)v70) >> (v71 & 31);
                }
            } while ((v73[iter1 & 7] = v80, iter1 += 1, v69 = v78 - 1, v78 != 1));
        }
        else
        {
            do
            {
                v81 = v69;
                if (v49 == 6)
                {
                    v82 = 0xcf1bbcdcbf9b0000 * *(long long *)((char *)v8 + iter1);
                    goto LABEL_b24ec;
                }
                else if (v49 == 5)
                {
                    v82 = 0xcf1bbcdcbb000000 * *(long long *)((char *)v8 + iter1);
LABEL_b24ec:
                    v83 = (v82 ^ v70) >> (v72 & 63);
                    continue;
                }
                else
                {
                    v83 = (2654435761 * *(int *)((char *)v8 + iter1) ^ (unsigned int)v70) >> (v71 & 31);
                }
            } while ((v73[iter1 & 7] = v83, iter1 += 1, v69 = v81 - 1, v81 != 1));
        }
    }
    if (i > iter)
    {
        v0 = v63;
        v1 = v52;
        v2 = v51;
        v3 = v43;
        v84 = v44 - 32;
        v5 = &a0->field_40;
        v7 = v44;
        do
        {
            v85 = v65;
            if ((unsigned int)v65 && (v86 = iter, v87 = v86 + 1, v88 = v85 & 0xffffffff, *(int *)((char *)v87 - v88) == (int)v86[1]))
            {
                v89 = sub_7cdfc(iter + 5, iter + 5 + -v88, v44) + 4;
                v90 = v85;
                v85 = v64;
                v91 = (void*)1;
                iter = v87;
                goto LABEL_b25f4;
            }
            v15 = 0x3b9ac9ff;
            v17 = &v16;
            v16 = &v17;
            if (v49 != 6)
            {
                v92 = a0;
                if (v49 == 5)
                {
                    v93 = v9;
                    if (v93 == 6)
                    {
                        v89 = sub_9761c(v92, iter, v44, &v15);
                        v94 = v15;
                        if (v89)
                            v91 = (void*)(unsigned int)v94;
                        else
                            v91 = (void*)1;
                        if (3 < v89)
                            goto LABEL_b2a64;
                        goto LABEL_b2818;
                    }
                    else if (v93 == 5)
                    {
                        v89 = sub_b2c6c();
                        v94 = v15;
                        switch (v89)
                        {
                        case 0:
                            v91 = (void*)1;
                            break;
                        default:
                            v91 = (void*)(unsigned int)v94;
                        }
                        if (3 < v89)
                            goto LABEL_b2a64;
                        goto LABEL_b2818;
                    }
                    else
                    {
                        v89 = sub_9c6f0();
                        v94 = v15;
                        if (v89)
                            v91 = (void*)(unsigned int)v94;
                        else
                            v91 = (void*)1;
                        if (v89 <= 3)
                            goto LABEL_b2818;
                    }
                }
                else
                {
                    v95 = v9;
                    if (v95 == 6)
                    {
                        v89 = sub_a13fc(v92, iter, v44, &v15);
                        v94 = v15;
                        if (v89)
                            v91 = (void*)(unsigned int)v94;
                        else
                            v91 = (void*)1;
                        if (v89 <= 3)
                            goto LABEL_b2818;
                    }
                    else if (v95 == 5)
                    {
                        v89 = sub_aa624();
                        v94 = v15;
                        if (v89)
                            v91 = (void*)(unsigned int)v94;
                        else
                            v91 = (void*)1;
                        if (v89 > 3)
                            goto LABEL_b2a64;
                        goto LABEL_b2818;
                    }
                    else
                    {
                        v89 = sub_a6954();
                        v94 = v15;
                        if (v89)
                            v91 = (void*)(unsigned int)v94;
                        else
                            v91 = (void*)1;
                        if (v89 <= 3)
                            goto LABEL_b2818;
                    }
                }
            }
            else
            {
                v96 = v9;
                v92 = a0;
                if (v96 == 6)
                {
                    v89 = sub_a0ee4(v92, iter, v44, &v15);
                    v94 = v15;
                    if (v89)
                        v91 = (void*)(unsigned int)v94;
                    else
                        v91 = (void*)1;
                    if (v89 > 3)
                        goto LABEL_b2a64;
LABEL_b2818:
                    v97 = iter - v42;
                    iter = iter + (v97 >> 8) + 1;
                    *(unsigned int *)&(v92->padding_114)[1] = v97 > 0x7ff;
                    v65 = v85;
                    goto LABEL_b299c;
                }
                else if (v96 == 5)
                {
                    v89 = sub_a4c34();
                    v94 = v15;
                    if (v89)
                        v91 = (void*)(unsigned int)v94;
                    else
                        v91 = (void*)1;
                    if (v89 > 3)
                        goto LABEL_b2a64;
                    goto LABEL_b2818;
                }
                else
                {
                    v89 = sub_97130();
                    v94 = v15;
                    if (v89)
                        v91 = (void*)(unsigned int)v94;
                    else
                        v91 = (void*)1;
                    if (v89 <= 3)
                        goto LABEL_b2818;
                }
            }
LABEL_b2a64:
            if (v94 >= 4)
            {
                if (iter > v42 && iter - v94 + 3 > v4)
                {
                    v98 = 2 - v94;
                    v99 = iter;
                    do
                    {
                        v100 = iter;
                        v101 = v99 - 1;
                        if (*((char *)v99 - 1) != *((char *)iter + v98))
                            goto LABEL_b2b14;
                    } while ((v89 += 1, v101 > v42 && (iter = v101, v99 = v101, v4 < v100 + v98)));
                }
                else
                {
LABEL_b2b14:
                    v101 = iter;
                }
                v90 = v91 - 3;
                iter = v101;
            }
            else
            {
                v90 = v85;
                v85 = v64;
            }
LABEL_b25f4:
            v102 = iter - v42;
            v17 = &v16;
            v16 = &v17;
            if (iter > v84)
            {
                sub_82208(a1->field_18, v42, iter, v84);
                v103 = a0;
            }
            else
            {
                *a1->field_18 = *(int128_t *)v42;
                v104 = a1->field_18;
                v103 = a0;
                if (v102 > 16)
                {
                    v104[1] = (int128_t)v42[16];
                    if (v102 >= 33)
                    {
                        node = v104 + 2;
                        v106 = v42 + 48;
                        do
                        {
                            *node = *(int128_t *)((char *)v106 - 16);
                            v107 = v106 + 2;
                            node[1] = *v106;
                            node += 2;
                            v106 = v107;
                        } while (node < v104 + v102);
                    }
                }
                else
                {
                    a1->field_18 = v104 + v102;
                    v108 = a1->field_8;
                    v109 = v8;
                    v110 = v6;
                    v111 = v5;
                    *(unsigned short *)((char *)&v108->field_0 + 4) = (unsigned short)v102;
                    *(unsigned int *)&v108->field_0 = (unsigned int)v91;
                    v112 = v89 - 3;
                    if (v112 >= 0x10000)
                        goto LABEL_b29f4;
LABEL_b268c:
                    *(unsigned short *)((char *)&v108->field_0 + 6) = (unsigned short)v112;
                    a1->field_8 = &v108->field_4;
                    if (!*(int *)&(v103->padding_114)[1])
                        goto LABEL_b283c;
                    goto LABEL_b26a0;
                }
            }
            a1->field_18 = a1->field_18 + v102;
            v108 = a1->field_8;
            v109 = v8;
            v110 = v6;
            v111 = v5;
            if (0x10000 > v102)
            {
                *(unsigned short *)((char *)&v108->field_0 + 4) = (unsigned short)v102;
                *(unsigned int *)&v108->field_0 = (unsigned int)v91;
                v112 = v89 - 3;
                if (0x10000 <= v112)
                    goto LABEL_b29f4;
                goto LABEL_b268c;
            }
            v113 = (char *)v108 - a1->field_0;
            *(unsigned int *)&a1->field_48 = 1;
            *(unsigned int *)((char *)&a1->field_48 + 4) = v113 >> 3;
            *(unsigned short *)((char *)&v108->field_0 + 4) = (unsigned short)v102;
            *(unsigned int *)&v108->field_0 = (unsigned int)v91;
            v112 = v89 - 3;
            if (v112 < 0x10000)
                goto LABEL_b268c;
LABEL_b29f4:
            v114 = (char *)v108 - a1->field_0 >> 3;
            *(unsigned int *)&a1->field_48 = 2;
            *(unsigned int *)((char *)&a1->field_48 + 4) = v114;
            *(unsigned short *)((char *)&v108->field_0 + 6) = (unsigned short)v112;
            a1->field_8 = &v108->field_4;
            if (!*(int *)&(v103->padding_114)[1])
                goto LABEL_b283c;
LABEL_b26a0:
            v115 = v103->field_2c;
            v15 = &v13;
            v14 = &v15;
            v116 = v109 + v115;
            v117 = (void*)(unsigned int)(i - v116);
            if (8 <= v117 + 1)
                v118 = (void*)8;
            else
                v118 = v117 + 1;
            if (i < v116)
                j = (void*)0;
            else
                j = v118;
            if (j + (unsigned int)v115 > (unsigned int)v115)
            {
                v120 = v103->field_34;
                v121 = v103->field_60;
                do
                {
                    v122 = j;
                    if (v49 == 6)
                    {
                        v123 = 0xcf1bbcdcbf9b0000 * *(long long *)((char *)v109 + v115);
                    }
                    else if (v49 == 5)
                    {
                        v123 = 0xcf1bbcdcbb000000 * *(long long *)((char *)v109 + v115);
                    }
                    else
                    {
                        v124 = (2654435761 * *(int *)((char *)v109 + v115) ^ (unsigned int)v121) >> ((char)(24 - v120) & 31);
                        continue;
                    }
                    v124 = (v123 ^ v121) >> ((char)(56 - v120) & 63);
                    v17 = &v16;
                    v16 = &v17;
                    v111[v115 & 7] = v124;
                    v115 += 1;
                    j = v122 - 1;
                } while (j);
            }
            *(unsigned int *)&(v103->padding_114)[1] = 0;
LABEL_b283c:
            iter += v89;
            if (i >= iter)
            {
                v44 = v7;
                if ((unsigned int)v85)
                {
                    do
                    {
                        v64 = v90;
                        v90 = v85;
                        v125 = v85 & 0xffffffff;
                        if (*(int *)iter != *(int *)((char *)iter - v125))
                        {
                            v42 = iter;
                            v65 = v64;
                            v64 = v90;
                            break;
                        }
                        v126 = sub_7cdfc(iter + 4, iter + 4 + -v125, v44);
                        v17 = &v16;
                        v16 = &v17;
                        if (iter > v84)
                            sub_82208(a1->field_18, iter, iter, v84);
                        else
                            *a1->field_18 = *(int128_t *)iter;
                        v127 = a1->field_8;
                        *(unsigned short *)((char *)&v127->field_0 + 4) = 0;
                        *(unsigned int *)&v127->field_0 = 1;
                        v128 = v126 + 1;
                        v129 = v128;
                        if (0x10000 <= v128)
                        {
                            v130 = (char *)v127 - a1->field_0;
                            *(unsigned int *)&a1->field_48 = 2;
                            *(unsigned int *)((char *)&a1->field_48 + 4) = v130 >> 3;
                        }
                        *(unsigned short *)((char *)&v127->field_0 + 6) = (unsigned short)v128;
                        a1->field_8 = &v127->field_4;
                        iter += v126 + 4;
                        if (iter <= i)
                        {
                            v131 = arm64g_calculate_condition(148, v129, 0x10000, 0);
                            v132 = 3;
                            v133 = (v131 & 1 ? v64 & 0xffffffff : 0x40000000);
                        }
                        else
                        {
                            v134 = arm64g_calculate_condition(148, v129, 0x10000, 0);
                            v132 = 0;
                            v133 = (v134 & 1 ? v64 & 0xffffffff : 0x40000000);
                        }
                        v85 = v64;
                        v42 = iter;
                        v65 = v90;
                        v135 = arm64g_calculate_condition(v132 | 16, v133, 0, 0);
                    } while (v135 & 1);
                }
                else
                {
                    v42 = iter;
                    v65 = v90;
                    v64 = v85;
                    goto LABEL_b259c;
                }
            }
            else
            {
                v42 = iter;
                v65 = v90;
                v64 = v85;
            }
LABEL_b299c:
            v44 = v7;
LABEL_b259c:
        } while (i > iter);
        v43 = v3;
        v52 = v1;
        v51 = v2;
        v63 = v0;
    }
    if (v63 < v51)
        v136 = v51;
    else
        v136 = (void*)0;
    if (v63 < v52)
        v137 = v52;
    else
        v137 = (void*)0;
    v138 = v65 & 0xffffffff;
    if ((unsigned int)v65)
    {
        v139 = (void*)(unsigned int)v65;
        v140 = arm64g_calculate_condition(19, v138, 0, 0);
        if (!(v140 & 1))
            goto LABEL_b2c36;
LABEL_b2c35:
        v142 = arm64g_calculate_condition(19, v138, 0, 0);
        v143 = arm64g_calculate_condition(131, (v142 & 1 ? (unsigned long long)v51 : 0), (v142 & 1 ? (unsigned long long)v63 : 0), 0);
        if (!(v143 & 1))
            goto LABEL_b2c3a;
LABEL_b2c39:
        v146 = v51;
    }
    else
    {
        v139 = v136;
        v141 = arm64g_calculate_condition(19, v138, 0, 0);
        if (v141 & 1)
            goto LABEL_b2c35;
LABEL_b2c36:
        v144 = arm64g_calculate_condition(19, v138, 0, 0);
        v145 = arm64g_calculate_condition(128, (v144 & 1 ? (unsigned long long)v51 : 0), (v144 & 1 ? (unsigned long long)v63 : 0), 0);
        if (v145 & 1)
            goto LABEL_b2c39;
LABEL_b2c3a:
        v146 = v137;
    }
    if ((unsigned int)v64)
        v146 = (void*)(unsigned int)v64;
    *(unsigned int *)&v43->field_0 = (unsigned int)v139;
    *(unsigned int *)((char *)&v43->field_0 + 4) = (unsigned int)v146;
    return v44 - v42;
}
