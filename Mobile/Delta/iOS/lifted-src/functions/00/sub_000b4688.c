/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb4688..0xb4c50 (1480 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b4688_2 {
    unsigned long long field_0;
    unsigned int field_8;
    unsigned int field_c;
    unsigned int *field_10;
} st_b4688_2;

typedef struct st_b4688_1 {
    char padding_0[8];
    unsigned long long field_8;
    unsigned int *field_10;
    unsigned int field_18;
    unsigned int field_1c;
    char padding_20[8];
    unsigned long long field_28;
    char padding_30[8];
    struct st_b4688_0 *field_38;
    unsigned long long field_40;
    char field_48;
    char padding_49[503];
    long long field_240;
    unsigned int field_248;
    unsigned int field_24c;
    unsigned int *field_250;
} st_b4688_1;

typedef struct st_b4688_0 {
    char field_0;
} st_b4688_0;

extern unsigned long long g_e6c4a8;
extern unsigned long long g_e6c4d0;
extern unsigned long long g_e6c4d8;

unsigned int * sub_b4688(st_b4688_1 *a0, unsigned long long *a1, unsigned int *a2, long long a3, unsigned int *a4)
{
    unsigned long v35;  // x8
    unsigned int v36;  // w20
    unsigned int **iter;  // x24
    char v46;  // x22
    unsigned long v47;  // x23
    unsigned long j;  // x25
    unsigned long long *v49;  // x26
    unsigned long v50;  // x25
    unsigned long long *v51;  // x26
    long long v52;  // x19
    unsigned long long v53;  // x0
    unsigned long long v54;  // x8
    unsigned int *v37;  // x22
    unsigned long v55;  // x14
    st_b4688_2 *v56;  // x8
    long long v57;  // x28
    unsigned long v58;  // x13
    unsigned long v59;  // x26
    unsigned long long v60;  // x15
    char v61;  // x8
    char *v62;  // x10
    char v63;  // x11
    unsigned int *node;  // x22
    unsigned long v38;  // x11
    unsigned int *i;  // x24
    unsigned int v66;  // w9
    unsigned int v67;  // w25
    unsigned int v68;  // w20
    unsigned long v69;  // cc_dep1
    unsigned long v70;  // cc_dep2
    unsigned long long v71;  // 4114
    unsigned long long v72;  // 4114
    unsigned int *v73;  // x0
    unsigned int *v74;  // x19
    char v39;  // x9
    unsigned int *v75;  // x0
    unsigned int *v76;  // x8
    unsigned int *v77;  // x23
    unsigned long v78;  // x21
    unsigned long v79;  // x25
    unsigned int *v80;  // x0
    unsigned int *v81;  // x19
    unsigned int *v82;  // x0
    unsigned int *v83;  // x8
    unsigned long v84;  // cc_dep1
    unsigned int *v40;  // x8
    unsigned long v85;  // cc_dep2
    unsigned int *v86;  // x10
    unsigned int *v87;  // x9
    unsigned long long v88;  // 4110
    unsigned long long v89;  // 4110
    unsigned long long v90;  // 4113
    unsigned int *v91;  // x8
    unsigned long long v92;  // 4110
    unsigned long long v93;  // 4110
    unsigned long long v94;  // x8
    long long v41;  // x23
    unsigned int v95;  // w16
    unsigned long v96;  // x15
    unsigned int *v97;  // x9
    unsigned int v98;  // w11
    char v99;  // x8
    char *v100;  // x9
    char v101;  // x10
    char v102;  // x8
    char *v103;  // x10
    unsigned long v104;  // x13
    long long v42;  // x26
    char v105;  // x11
    long long v44;  // x1
    unsigned int **v0;  // [bp-0x190]
    unsigned int *v1;  // [bp-0x188]
    long long v2;  // [bp-0x180]
    unsigned long long *v3;  // [bp-0x178]
    unsigned long long v4;  // [bp-0x170]
    unsigned long long v5;  // [bp-0x160]
    long long v6;  // [bp-0x158], Other Possible Types: unsigned long long
    unsigned long v7;  // [bp-0x150]
    unsigned int v8;  // [bp-0x13c]
    unsigned long long v9;  // [bp-0x130]
    unsigned long v10;  // [bp-0x128]
    unsigned int *v11;  // [bp-0x11c]
    st_b4688_2 *v12;  // [bp-0x118]
    unsigned long long v13;  // [bp-0x110]
    unsigned long v14;  // [bp-0x108]
    unsigned int *v15;  // [bp-0x100]
    unsigned int v16;  // [bp-0xf4]
    unsigned long long v17;  // [bp-0xf0]
    unsigned int *v18;  // [bp-0xe8]
    unsigned long v19;  // [bp-0xe0]
    unsigned int v20;  // [bp-0xd4]
    long long v21;  // [bp-0xd0]
    unsigned int *v22;  // [bp-0xc8]
    unsigned int *v23;  // [bp-0xc0]
    unsigned long v24;  // [bp-0xb8]
    unsigned int *v25;  // [bp-0xb0], Other Possible Types: long long
    unsigned int *v26;  // [bp-0xa8]
    long long v27;  // [bp-0xa0]
    unsigned int *v28;  // [bp-0x98]
    st_b4688_0 **v29;  // [bp-0x90], Other Possible Types: char
    st_b4688_0 *v30;  // [bp-0x88]
    unsigned int *v31;  // [bp-0x7c]
    char v32;  // [bp-0x78]
    char *v33;  // [bp-0x10]
    char v34;  // [bp+0x0]

    v33 = &v34;
    v25 = a3;
    v30 = &v29;
    v29 = &v30;
    v35 = a0->field_18;
    v36 = a0->field_1c;
    v28 = a2[3];
    if ((unsigned int)v35 > v36)
    {
        v18 = a0->field_10;
        v20 = v36;
        v37 = v28;
        if (v37 > a4)
            return a4;
    }
    else
    {
        v18 = 0;
        v20 = v35;
        v37 = v28;
        if (a4 < v37)
            return a4;
    }
    v38 = v35;
    v39 = a2[2];
    v7 = 1 << (v39 & 63);
    v40 = v18;
    v13 = (char *)v40 + v20;
    v19 = v38;
    v41 = v25;
    v27 = v41 + (char *)a4;
    v42 = v27 - 8;
    v3 = &a0->field_40;
    v12 = &a0->field_240;
    sub_b5210(sub_b440c(&v32, a2), a2, v37);
    v44 = v41 + (char *)v37;
    v1 = -v37;
    v16 = ~(0xffffffff << ((char)(a2[1] - v39) & 31));
    v0 = &a0->field_250;
    v8 = v36;
    v24 = a0->field_8;
    v17 = (char *)v40 + v38;
    v21 = a0->field_8 + v38;
    v2 = v42;
    while (1)
    {
        if ((unsigned long long)v42 <= (unsigned long long)v44)
            return v27 - v25;
        v31 = (unsigned int *)0;
        v6 = v44;
        v5 = sub_b44e0(&v32);
        v14 = v31;
        if ((unsigned int)v14)
        {
            iter = v0;
            v46 = a2[2];
            v47 = a0->field_28;
            j = v14;
            v49 = v3;
            do
            {
                v50 = j;
                v51 = v49 + 1;
                v52 = v6 + (char *)v1 + *v49;
                v53 = sub_77ccc(v52, v28, 0);
                v54 = (unsigned int)v53 & v16;
                *(long long *)((char *)iter - 16) = v52;
                *(unsigned int *)((char *)iter - 8) = v54;
                *(unsigned int *)((char *)iter - 4) = v53 >> 32;
                *iter = v47 + (v54 << (v46 & 63)) * 8;
                iter += 3;
                j = v50 - 1;
                v49 = v51;
            } while (j);
        }
        v4 = -v5;
        v55 = v24;
        if ((unsigned int)v14 > 0)
            break;
        v44 = v6 + v5;
        v42 = v2;
    }
    v56 = (char *)v12 + 0 * 24;
    v57 = v56->field_0;
    v58 = v56->field_8;
    v59 = v56->field_c;
    v60 = v57 - v55;
    if ((unsigned long long)v25 > (unsigned long long)v57)
    {
        v61 = a2[2];
        v62 = a0->field_38;
        v63 = v62[v58];
        *(unsigned long long *)(a0->field_28 + (v58 << (v61 & 63)) * 8 + v63 * 8) = v60 & 0xffffffff | (v59 * 0x100000000 | v59 >> 32) & 0xffffffff00000000;
        v62[v58] = v63 + 1 & (char)~(0xffffffff << (v61 & 31));
        goto *((void *)(g_e6c4a8));
    }
    else
    {
        v9 = v60;
        v10 = v58;
        v11 = (unsigned int *)0;
        node = v56->field_10;
        i = &node[2 * v7];
        if ((unsigned int)v19 > v8)
        {
            v26 = 0;
            v15 = 0;
            v22 = 0;
            v23 = 0;
            v66 = v20;
            do
            {
                if (node[1] != (unsigned int)v59 || !(v67 = *node, v67 > v66))
                    continue;
                v68 = v19;
                v69 = v67;
                v70 = v68;
                if (v67 < v68)
                {
                    v71 = arm64g_calculate_condition(0x33, v69, v70, 0);
                    if (!(v71 & 1))
                        goto LABEL_b4986;
                    goto LABEL_b4985;
                }
                else
                {
                    v72 = arm64g_calculate_condition(0x33, v69, v70, 0);
                    if (v72 & 1)
                    {
LABEL_b4985:
                        goto LABEL_b4986;
                    }
                    else
                    {
LABEL_b4986:
                        v73 = sub_84f30();
                        if (v73 < v28)
                        {
                            v66 = v20;
                        }
                        else
                        {
                            v74 = v73;
                            v75 = sub_b5264();
                            v76 = v74 + v75;
                            v66 = v20;
                            if (v76 > v15)
                            {
                                v22 = v75;
                                v23 = v74;
                                v15 = v76;
                                v26 = node;
                                v66 = v20;
                            }
                        }
                    }
                }
                node += 2;
            } while (i > node);
        }
        else
        {
            v26 = 0;
            v77 = 0;
            v22 = 0;
            v23 = 0;
            do
            {
                if (node[1] != (unsigned int)v59 || !(v78 = *node, (unsigned int)v78 > v20))
                    continue;
                v79 = v55;
                v80 = sub_7cdfc(v57, v55 + v78, v27);
                if (v80 < v28)
                {
                    v55 = v79;
                    continue;
                }
                v81 = v80;
                v82 = sub_b510c(v57, v25, v79 + v78, v21);
                v83 = v81 + v82;
                v84 = v83;
                v85 = v77;
                v55 = v24;
                if (v83 <= v77)
                {
                    v86 = v23;
                    v87 = v22;
                    v88 = arm64g_calculate_condition(148, v84, v85, 0);
                    if (!(v88 & 1))
                        goto LABEL_b4a7e;
                    goto LABEL_b4a7d;
                }
                else
                {
                    v86 = v81;
                    v87 = v22;
                    v89 = arm64g_calculate_condition(148, v84, v85, 0);
                    if (v89 & 1)
                    {
LABEL_b4a7d:
                        goto LABEL_b4a80;
                    }
                    else
                    {
LABEL_b4a7e:
                        v87 = v82;
LABEL_b4a80:
                        v22 = v87;
                        v23 = v86;
                        v90 = arm64g_calculate_condition(148, v84, v85, 0);
                        if (v90 & 1)
                        {
                            v77 = v77;
                            v91 = v26;
                            v92 = arm64g_calculate_condition(148, v84, v85, 0);
                            if (!(v92 & 1))
                                goto LABEL_b4a8e;
                            goto LABEL_b4a8d;
                        }
                        else
                        {
                            v77 = v83;
                            v91 = v26;
                            v93 = arm64g_calculate_condition(148, v84, v85, 0);
                            if (v93 & 1)
                            {
LABEL_b4a8d:
                                goto LABEL_b4a90;
                            }
                            else
                            {
LABEL_b4a8e:
                                v91 = node;
LABEL_b4a90:
                                v26 = v91;
                            }
                        }
                    }
                }
                node += 2;
            } while (i > node);
        }
        if (v26)
        {
            v94 = a1[3];
            v95 = v9;
            v96 = v10;
            if (v94 == a1[4])
            {
                goto *((void *)(g_e6c4d0));
            }
            else
            {
                v97 = *a1 + 12 * v94;
                v98 = *v26;
                v97[1] = (unsigned int)(unsigned int *)(v57 - (char *)v22 - v25);
                v97[2] = (unsigned int)v22 + (unsigned int)v23;
                *v97 = v95 - v98;
                a1[3] = v94 + 1;
                v99 = a2[2];
                v100 = a0->field_38;
                v101 = v100[v96];
                *(unsigned long long *)(a0->field_28 + (v96 << (v99 & 63)) * 8 + v101 * 8) = v95 | (v59 * 0x100000000 | v59 >> 32) & 0xffffffff00000000;
                v100[v96] = v101 + 1 & (char)~(0xffffffff << (v99 & 31));
                v25 = v57 + (char *)v23;
                if (v25 > v6 + v5)
                {
                    sub_b5210();
                    v6 = (char *)v25 + v4;
                    goto *((void *)(g_e6c4d8));
                }
                else
                {
                    goto *((void *)(g_e6c4a8));
                }
            }
        }
        else
        {
            v102 = a2[2];
            v103 = a0->field_38;
            v104 = v10;
            v105 = v103[v104];
            *(unsigned long long *)(a0->field_28 + (v104 << (v102 & 63)) * 8 + v105 * 8) = v9 & 0xffffffff | (v59 * 0x100000000 | v59 >> 32) & 0xffffffff00000000;
            v103[v104] = v105 + 1 & (char)~(0xffffffff << (v102 & 31));
            goto *((void *)(g_e6c4a8));
        }
    }
}
