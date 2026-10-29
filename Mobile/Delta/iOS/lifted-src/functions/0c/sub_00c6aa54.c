/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xc6aa54..0xc6b29c (2120 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_c6aa54_1 {
    char field_0[13];
    char field_5;
} st_c6aa54_1;

extern unsigned long long g_b55cd4;
extern unsigned long long g_b55d68;
extern unsigned long long g_b55e20;
extern unsigned long long g_b55f44;
extern char g_10002b0;

unsigned long long sub_c6aa54(long long a0, long long a1, unsigned long long a2, st_c6aa54_1 *a3, long long a4, unsigned long a5, unsigned long a6, long long a7, unsigned long a8, char a9)
{
    unsigned long long v34;  // w0
    unsigned long long *v35;  // x28
    unsigned long long v44;  // x27
    unsigned long long v45;  // x10
    unsigned long long v46;  // x20
    unsigned long long v47;  // x8
    unsigned long long v48;  // x19
    unsigned long long v49;  // x9
    unsigned long long v50;  // x9
    unsigned long long v51;  // x10
    unsigned long v52;  // cc_dep1
    unsigned long v53;  // cc_dep2
    unsigned long long v36;  // x21
    unsigned long long v54;  // x22
    unsigned long long v55;  // 4104
    unsigned long long v56;  // 4104
    long long v57;  // x1
    unsigned long long v59;  // x24
    char v60;  // x25
    char v61;  // x28
    char v62;  // x21
    unsigned long long n;  // x23
    unsigned long long v37;  // x12
    char *v64;  // x8
    unsigned long long v65;  // x9
    unsigned long long v66;  // x23
    unsigned long long n1;  // x19
    char *v68;  // x8
    unsigned long long v69;  // x23
    st_c6aa54_1 *v70;  // x9
    long long v71;  // x1
    unsigned long v72;  // x2
    unsigned long long n2;  // x26
    unsigned long i;  // x21
    unsigned long v75;  // x21
    unsigned long long v76;  // x12
    unsigned long long v77;  // x8
    st_c6aa54_1 *v78;  // x1
    long long v79;  // x0
    unsigned long long v80;  // 4144
    unsigned long long v81;  // x10
    unsigned long long v82;  // x11
    unsigned long long v83;  // x28
    unsigned long long v39;  // x13
    unsigned long long v84;  // x19
    unsigned long long v85;  // x8
    unsigned long long j;  // x8
    unsigned int v87;  // w11
    unsigned int v88;  // w24
    char *v89;  // x14
    unsigned long long v90;  // w14
    unsigned int v91;  // w15
    unsigned int v92;  // w15
    unsigned int v93;  // w14
    unsigned long long v40;  // x9
    unsigned long long v94;  // x19
    unsigned long long v95;  // x0
    unsigned long long v96;  // x2
    unsigned long long v97;  // w0
    unsigned long long v41;  // x8
    unsigned long long v42;  // w11
    unsigned long long v43;  // x14
    long long v0;  // [bp-0x3e0]
    unsigned long long v1;  // [bp-0x3d8]
    unsigned int v2;  // [bp-0x3cc]
    long long v3;  // [bp-0x3c8]
    unsigned long long v4;  // [bp-0x3c0]
    unsigned long long v5;  // [bp-0x3a4]
    unsigned long long v6;  // [bp-0x3a0]
    unsigned long long *v7;  // [bp-0x398]
    char *v8;  // [bp-0x390]
    unsigned long long v9;  // [bp-0x388]
    unsigned long v10;  // [bp-0x380], Other Possible Types: unsigned long long
    unsigned long long v11;  // [bp-0x378]
    unsigned long long v12;  // [bp-0x370]
    unsigned long long v13;  // [bp-0x368]
    unsigned long long v14;  // [bp-0x360]
    unsigned long long v15;  // [bp-0x354]
    unsigned long long v16;  // [bp-0x350]
    unsigned long long *v17;  // [bp-0x348]
    unsigned long long v18;  // [bp-0x330]
    unsigned long long v19;  // [bp-0x328]
    unsigned short v20;  // [bp-0x320]
    char v21;  // [bp-0x310]
    unsigned long long v22;  // [bp-0x2a0]
    unsigned long long v23;  // [bp-0x290]
    unsigned long long v24;  // [bp-0x280]
    unsigned long long v25;  // [bp-0x270]
    unsigned long v26;  // [bp-0x260]
    unsigned long v27;  // [bp-0x25b]
    char v28;  // [bp-0x253]
    char v29;  // [bp-0x1e0]
    char v30[136];  // [bp-0x1d0]
    char v31;  // [bp-0x148]
    unsigned long v32;  // [bp-0x70]
    char *v33;  // [bp-0x10]

    v33 = &a8;
    v32 = *(long long *)&g_10002b0;
    if (a6 <= 0xfffff)
    {
        v34 = (unsigned int)sub_a509f4();
        if (v34)
        {
            if ((int)sub_a7d710(&v31) >= 1)
            {
                v0 = a1;
                v1 = a2;
                v35 = "\"";
                v36 = 1;
                v37 = 16;
                n2 = 64;
                v39 = 8;
                v40 = 48;
                v15 = 1;
                v41 = &g_b55cd4;
                goto LABEL_c6abd4;
            }
        }
        else
        {
            if (sub_b55fd4())
            {
                if ((int)sub_aac61c(&v31) >= 1)
                {
                    v0 = a1;
                    v1 = a2;
                    v35 = "\"";
                    v36 = 1;
                    v37 = 20;
                    sub_b55ffc();
                    v15 = 1;
                    v41 = &g_b55d68;
                    goto LABEL_c6abd4;
                }
            }
            else
            {
                if (sub_b55fd4())
                {
                    if ((int)sub_ac03b0(&v31) >= 1)
                    {
                        v0 = a1;
                        v1 = a2;
                        v37 = 28;
                        sub_b55ffc();
                        v15 = 1;
                        goto LABEL_c6abcc;
                    }
                }
                else
                {
                    if (sub_b55fd4())
                    {
                        if ((int)sub_ac03e4(&v31) >= 1)
                        {
                            v0 = a1;
                            v1 = a2;
                            v15 = 0;
                            v37 = 32;
                            sub_b55ffc();
                            v35 = "\"";
                            v36 = 1;
LABEL_c6abcc:
                            v41 = &g_b55e20;
                            goto LABEL_c6abd4;
                        }
                    }
                    else
                    {
                        if (sub_b55fd4())
                        {
                            if ((int)sub_ac23e0(&v31) >= 1)
                            {
                                v0 = a1;
                                v1 = a2;
                                v15 = 0;
                                v37 = 48;
                                goto LABEL_c6b230;
                            }
                        }
                        else
                        {
                            if (sub_b55fd4())
                            {
                                if ((int)sub_ac2420(&v31) >= 1)
                                {
                                    v0 = a1;
                                    v1 = a2;
                                    v15 = 0;
                                    v37 = 64;
                                    v35 = "\"";
                                    v36 = 0;
LABEL_c6b230:
                                    n2 = 128;
                                    v39 = 16;
                                    v40 = 40;
                                    v41 = &g_b55f44;
LABEL_c6abd4:
                                    v14 = v41;
                                    v42 = a9;
                                    v43 = a8 + v40 + 11;
                                    if (!v42)
                                        v44 = 13;
                                    else
                                        v44 = v43;
                                    v5 = v42;
                                    v4 = v40;
                                    v11 = v43;
                                    if (v42)
                                        v45 = 2;
                                    else
                                        v45 = ((unsigned int)v37 + (unsigned int)n2 + 0xff) / n2 + 1;
                                    v18 = v39;
                                    v10 = v39 - 1;
                                    v46 = v44 + a6;
                                    v47 = (v10 + n2 - v37 + v46) / n2;
                                    v48 = v44 + a5;
                                    if (!v5)
                                        v49 = v45;
                                    else
                                        v49 = v45 + 1;
                                    v50 = v49;
                                    v12 = v48;
                                    v13 = v45;
                                    v51 = v47 - v45;
                                    v52 = v47;
                                    v53 = v50;
                                    if (v50 < v47)
                                    {
                                        v54 = n2 * v51;
                                        v55 = arm64g_calculate_condition(132, v52, v53, 0);
                                        if (!(v55 & 1))
                                            goto LABEL_c6ac66;
LABEL_c6ac65:
                                    }
                                    else
                                    {
                                        v54 = 0;
                                        v56 = arm64g_calculate_condition(132, v52, v53, 0);
                                        if (v56 & 1)
                                            goto LABEL_c6ac65;
LABEL_c6ac66:
                                        v51 = 0;
                                    }
                                    v19 = v51;
                                    v16 = v37;
                                    if (!v5)
                                    {
                                        ___memset_chk(&v29, 0, n2, 128);
                                        if (128 >= a8)
                                        {
                                            v57 = a7;
                                            sub_b55fdc(___memcpy_chk(&v29, v57), v57);
                                            if (!(v36 & 1))
                                                sub_b55fb0();
                                            v35();
                                        }
                                    }
                                    else
                                    {
                                        v17 = v35;
                                        v2 = v36;
                                        v3 = a7;
                                        v59 = v48 * 8;
                                        v60 = v59 >> 8;
                                        v61 = v59 >> 16;
                                        v62 = v59 >> 24;
                                        if (v34)
                                        {
                                            n = v18;
                                            ___memset_chk(&v30[120], 0, n, 16);
                                            v64 = &v30[120 + n];
                                            *(v64 - 5) = v62;
                                            *(v64 - 6) = v61;
                                            *(v64 - 7) = v60;
                                            v65 = n - 8;
                                        }
                                        else
                                        {
                                            v66 = v18;
                                            n1 = v66 - 4;
                                            ___memset_chk(&v30[120], 0, n1, 16);
                                            v30[120 + n1] = v62;
                                            v68 = &v30[120 + v66];
                                            *(v68 - 3) = v61;
                                            *(v68 - 2) = v60;
                                            v65 = v10;
                                        }
                                        v30[120 + v65] = v59;
                                        if (v54)
                                        {
                                            v69 = v54 / n2;
                                            if (!v5)
                                            {
                                                v70 = a3;
                                                v71 = a4;
                                                v26 = *(long long *)&v70->field_0[0];
                                                v27 = *(long long *)&v70->field_0[5];
                                                v72 = n2 - 13;
                                                sub_b56018(___memcpy_chk(&v28, v71, v72, 115), v71, v72, 115);
                                                if (v69 >= 2)
                                                {
                                                    i = v69 - 1;
                                                    do
                                                    {
                                                        v75 = i;
                                                        sub_b5600c();
                                                        i = v75 - 1;
                                                    } while (i);
                                                }
                                                goto LABEL_c6ae58;
                                            }
                                            else if (v11 > n2)
                                            {
                                                v17();
                                            }
                                        }
                                        else
                                        {
LABEL_c6ae58:
                                            v24 = 0;
                                            v25 = 0;
                                            v22 = 0;
                                            v23 = 0;
                                            v76 = v19;
                                            v77 = v13;
                                            v13 = v76 + v77;
                                            v78 = a3;
                                            v79 = a4;
                                            v80 = arm64g_calculate_condition(0x22, v76, v77, 0);
                                            if (!(v80 & 1))
                                            {
                                                v81 = v18;
                                                v82 = v12;
                                                v83 = v82 & n2 - 1;
                                                v12 = v82 / n2;
                                                v84 = n2 - v81;
                                                v85 = v16;
                                                v18 = v85 & 96;
                                                v8 = &v21;
                                                v6 = v85 & 24;
                                                v7 = &v23;
                                                v10 = v85 & 120;
                                                v9 = -v10;
                                                v11 = (v82 + v81) / n2;
                                                j = 0;
                                                v87 = (long long)((v76 ^ v12) - 1 & ~(v76 ^ v12)) >> 63;
                                                v19 = v76;
                                                v88 = (long long)((v76 ^ v11) - 1 & ~(v76 ^ v11)) >> 63;
                                                do
                                                {
                                                    if (v44 > v54)
                                                    {
                                                        v89 = &v78->field_0[v54];
                                                        goto LABEL_c6af44;
                                                    }
                                                    else if (v46 > v54)
                                                    {
                                                        v89 = v79 + v54 - v44;
LABEL_c6af44:
                                                        v90 = *v89;
                                                        continue;
                                                    }
                                                    else
                                                    {
                                                        v90 = 0;
                                                    }
                                                    v91 = v87 & 0xff & ~(unsigned int)((long long)(j - v83 | v83) >> 63);
                                                    if (0 <= (long long)(j - (v83 + 1) | v83 + 1))
                                                        v92 = ~v87;
                                                    else
                                                        v92 = 0xffffffff;
                                                    v93 = v92 & (v87 | ~v88) & (~v91 & v90 | v91 & 128);
                                                    if (j >= v84)
                                                        v93 = ~(v88 & 0xff) & v93 | v88 & 0xff & v30[120 + j + -1 * v84];
                                                    v54 += 1;
                                                    *((char *)&v20 + j) = v93;
                                                    j += 1;
                                                } while (j != n2);
                                                v17();
                                            }
                                            else
                                            {
                                                v94 = sub_a3f728(v79, v78);
                                                if (v94 && (int)sub_a3fe04(v94, a0, 0) >= 1)
                                                {
                                                    if (v5)
                                                    {
                                                        ___memset_chk(&v29, 92, v4, 128);
                                                        if ((int)sub_a3fe10(v94, v3, a8) >= 1)
                                                        {
                                                            v95 = v94;
                                                            v96 = v4;
LABEL_c6b15c:
                                                            if ((int)sub_a3fe10(v95, &v29, v96) >= 1 && (int)sub_a3fe10(v94, &v22, v16) >= 1)
                                                            {
                                                                v97 = (unsigned int)sub_a3ff18(v94, v0, &v20);
                                                                if (!v1)
                                                                {
                                                                    sub_a3f73c(v94);
                                                                    if (*(long long *)&g_10002b0 == v32)
                                                                        return 1;
                                                                    ___stack_chk_fail();
                                                                }
                                                                else if (v97)
                                                                {
                                                                    *(unsigned long long *)v1 = v20;
                                                                    sub_a3f73c(v94);
                                                                    if (*(long long *)&g_10002b0 == v32)
                                                                        return 1;
                                                                    ___stack_chk_fail();
                                                                }
                                                                else
                                                                {
                                                                    sub_a3f73c(v94);
                                                                    if (*(long long *)&g_10002b0 == v32)
                                                                        return 1;
                                                                    ___stack_chk_fail();
                                                                }
                                                            }
                                                        }
                                                    }
                                                    else
                                                    {
                                                        sub_b55fdc();
                                                        if (!(v2 & 1))
                                                            sub_b55fb0();
                                                        v95 = v94;
                                                        v96 = n2;
                                                        goto LABEL_c6b15c;
                                                    }
                                                }
                                                sub_a3f73c(v94);
                                                if (*(long long *)&g_10002b0 == v32)
                                                    return 0;
                                                ___stack_chk_fail();
                                            }
                                        }
                                    }
                                }
                            }
                            else
                            {
                                if (a2)
                                {
                                    *(unsigned long long *)a2 = 0;
                                    if (*(long long *)&g_10002b0 == v32)
                                        return 0;
                                    ___stack_chk_fail();
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    if (*(long long *)&g_10002b0 == v32)
        return 0;
    ___stack_chk_fail();
}
