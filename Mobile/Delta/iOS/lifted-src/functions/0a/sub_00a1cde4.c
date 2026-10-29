/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa1cde4..0xa1d928 (2884 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a1cde4_3 {
    struct st_a1cde4_0 *field_0;
    char padding_8[16];
    long long field_18;
    char padding_20[128];
    struct st_a1cde4_2 *field_a0;
} st_a1cde4_3;

typedef struct st_a1cde4_0 {
    char padding_0[216];
    struct st_a1cde4_1 *field_d8;
} st_a1cde4_0;

typedef struct st_a1cde4_2 {
    char padding_0[8];
    unsigned long long field_8;
    char padding_10[8];
    long long field_18;
    unsigned long long field_20;
    unsigned long long field_28;
} st_a1cde4_2;

typedef struct st_a1cde4_1 {
    unsigned long long field_0;
} st_a1cde4_1;


unsigned long long sub_a1cde4(st_a1cde4_3 *a0, unsigned long long a1, long long a2, unsigned long long idx, long long *a4, unsigned long long a5, long long a6)
{
    long long v19;  // x28
    unsigned long long v20;  // x0
    unsigned long long v29;  // x26
    unsigned long long v30;  // x27
    unsigned long long v31;  // x25
    unsigned long long v32;  // x28
    unsigned long long v33;  // x22
    unsigned long long v34;  // x23
    unsigned long long v35;  // x19
    unsigned long long v36;  // x8
    unsigned long long i;  // x20
    unsigned long long v38;  // x27
    unsigned long long idx1;  // x27
    unsigned long long v39;  // 4136
    unsigned long long v40;  // x21
    unsigned long long v41;  // x23
    unsigned long long v42;  // x24
    unsigned long long v43;  // x22
    unsigned long long v44;  // x20
    unsigned long long v45;  // x19
    long long v46;  // x0
    unsigned int v47;  // w0
    unsigned long long v48;  // x8
    unsigned int v22;  // w0
    unsigned long long v49;  // x26
    long long v50;  // x0
    unsigned long long v51;  // x19
    unsigned long long v52;  // x0
    st_a1cde4_3 *v53;  // x26
    unsigned long v54;  // x1
    unsigned long long v55;  // x0
    unsigned long long v56;  // x19
    unsigned long long v57;  // x0
    unsigned long long v58;  // x8
    unsigned long long v23;  // x8
    unsigned long long idx2;  // x22
    unsigned long v60;  // x20
    unsigned long iter;  // x25
    unsigned long long v62;  // x0
    unsigned long long v63;  // x26
    unsigned long long v64;  // x8
    unsigned long long v65;  // x0
    long long v66;  // x2
    unsigned long long v67;  // x10
    unsigned long long *node;  // x20
    unsigned long long v24;  // x10
    unsigned long long k;  // x21
    unsigned long long v70;  // x19
    unsigned long long v71;  // x22
    unsigned long long v72;  // x22
    unsigned long long v73;  // x0
    unsigned long long v74;  // x19
    unsigned long v75;  // x20
    unsigned long v76;  // x20
    unsigned long long v77;  // x22
    unsigned long long v78;  // x22
    unsigned long long v25;  // x12
    unsigned long v79;  // x20
    unsigned long v80;  // x20
    unsigned long v81;  // x19
    unsigned long v82;  // x19
    char v26;  // x8
    unsigned long long v27;  // x24
    long long v28;  // x1
    unsigned long long v0;  // [bp-0x100]
    unsigned long long v1;  // [bp-0xf0]
    unsigned long long v2;  // [bp-0xe8]
    unsigned long long v3;  // [bp-0xe0]
    unsigned long long v4;  // [bp-0xd8]
    long long *v5;  // [bp-0xd0]
    unsigned long long v6;  // [bp-0xc4]
    unsigned long long j;  // [bp-0xc0]
    unsigned long long v8;  // [bp-0xb8]
    unsigned long long v9;  // [bp-0xb0]
    unsigned long long index;  // [bp-0xa8]
    unsigned long long v11;  // [bp-0xa0]
    st_a1cde4_3 *v12;  // [bp-0x98]
    unsigned long long v13;  // [bp-0x90]
    unsigned long long *v14;  // [bp-0x88], Other Possible Types: unsigned long long
    unsigned long long v15;  // [bp-0x80]
    unsigned long long v16;  // [bp-0x70]
    char *v17;  // [bp-0x10]
    char v18;  // [bp+0x0]

    v17 = &v18;
    v19 = a2;
    if (!sub_9e4828(*(long long *)&a0->padding_8[8]) && !sub_9e4828(a0->field_18))
    {
        if (!idx && v19 && *(long long *)&a0->padding_8[8] != v19)
            goto LABEL_a1cf2c;
        if (v19 || idx != 1)
            goto LABEL_a1ce38;
        if (*(long long *)a5 != *(long long *)&a0->padding_8[8])
        {
LABEL_a1cf2c:
        }
        else
        {
LABEL_a1cf5c:
            v14 = a5;
            v4 = 0;
            v5 = a4;
            v12 = a0;
            v9 = 0;
            index = 0;
            v25 = 0;
            v3 = 0;
            v6 = 0;
            v27 = 0;
            v8 = 1;
            goto LABEL_a1cf84;
        }
        goto LABEL_a1cf84;
    }
LABEL_a1ce38:
    if (!v19)
        goto LABEL_a1cf5c;
    v20 = sub_c4c40(a0);
    if (!v20)
    {
        sub_a368c8();
        sub_a369bc("crypto/ec/ec_mult.c", 464, "ossl_ec_wNAF_mul");
        v28 = 113;
        goto LABEL_a1cec8;
    }
    idx1 = a0->field_a0;
    v12 = a0;
    v4 = v20;
    v5 = a4;
    v14 = a5;
    if (!idx1 || !*(long long *)(idx1 + 16) || sub_a1afd8(a0, v20, *(long long *)*(long long *)(idx1 + 32), a6))
    {
        v9 = 0;
        index = 0;
        v3 = 0;
        v8 = 0;
        v25 = 1;
        v6 = 1;
        v27 = 1;
        goto LABEL_a1cf84;
    }
    v22 = sub_9e46a8(v19);
    v9 = *(long long *)(idx1 + 8);
    v23 = v22 / *(long long *)(idx1 + 8);
    v24 = *(long long *)(idx1 + 16);
    if (v24 <= v23 + 1)
        v25 = v24;
    else
        v25 = v23 + 1;
    v26 = *(long long *)(idx1 + 24) - 1;
    if (*(long long *)(idx1 + 40) == v24 << (v26 & 63))
    {
        index = idx1;
        v6 = 0;
        v27 = 0;
        v8 = 1;
        v3 = 1 << (v26 & 63);
LABEL_a1cf84:
        v11 = v25;
        j = v25 + idx;
        v34 = j * 8;
        v30 = sub_a6bf4c(v34, "crypto/ec/ec_mult.c", 505);
        v35 = sub_a6bf4c(v34, "crypto/ec/ec_mult.c", 506);
        v31 = sub_a6bf4c(v34 + 8, "crypto/ec/ec_mult.c", 508);
        v33 = sub_a6bf4c(v34, "crypto/ec/ec_mult.c", 509);
        v15 = v35;
        if (v31)
        {
            v29 = 0;
            *(unsigned long long *)v31 = 0;
            if (!v30 || !v35 || !v33)
            {
                v32 = 0;
                goto LABEL_a1d2bc;
            }
            v0 = a1;
            v13 = v30;
            v2 = v33;
            v36 = idx;
            i = v27 + v36;
            v38 = v31;
            v1 = i;
            v39 = arm64g_calculate_condition(2, v27, v36, 0);
            if (!(v39 & 1))
            {
                v40 = 0;
                v41 = 0;
                v42 = 0;
                v43 = 1;
                do
                {
                    v44 = i;
                    v45 = v43 - 1;
                    v46 = v19;
                    if (v36 > v45)
                        v46 = *(long long *)(v14 + v40);
                    v47 = sub_9e46a8(v46);
                    if (v47 <= 19)
                        v48 = 1;
                    else
                        v48 = 2;
                    if (69 < v47)
                        v48 = 3;
                    if (299 < v47)
                        v48 = 4;
                    if (799 < v47)
                        v48 = 5;
                    if (1999 < v47)
                        v49 = 6;
                    else
                        v49 = v48;
                    *(unsigned long long *)(v13 + v40) = v49;
                    *(unsigned long long *)(v38 + v40 + 8) = 0;
                    v50 = v19;
                    if (idx > v45)
                        v50 = *(long long *)(v14 + v40);
                    v51 = v15;
                    v52 = sub_9e403c(v50, v49, v51 + v40);
                    *(unsigned long long *)(v38 + v40) = v52;
                    if (!v52)
                    {
                        v29 = 0;
                        v32 = 0;
                        v33 = v2;
                        v31 = v38;
                        v30 = v13;
                        goto LABEL_a1d2bc;
                    }
                    v41 += 1 << ((char)(v49 - 1) & 63);
                    if (v42 < (unsigned long long)*(long long *)(v51 + v40))
                        v42 = *(long long *)(v51 + v40);
                    v40 += 8;
                    v43 += 1;
                    i = v44 - 1;
                    v36 = idx;
                } while (i);
            }
            else
            {
                v42 = 0;
                v41 = 0;
            }
            v31 = v38;
            if (!v11)
            {
                v33 = v2;
                v53 = v12;
                v30 = v13;
                goto LABEL_a1d538;
            }
            v33 = v2;
            v53 = v12;
            if (!index)
            {
                v30 = v13;
                if (!(v6 & 1))
                {
                    sub_a368c8();
                    sub_a369bc("crypto/ec/ec_mult.c", 543, "ossl_ec_wNAF_mul");
                    sub_a36abc(16, 0xc0103, 0);
                    goto LABEL_a1d2b0;
                }
                goto LABEL_a1d538;
            }
            v16 = 0;
            if (!(v8 & 1))
            {
                sub_a368c8();
                sub_a369bc("crypto/ec/ec_mult.c", 552, "ossl_ec_wNAF_mul");
                sub_a36abc(16, 0xc0103, 0);
LABEL_a1d3bc:
                v29 = 0;
                v32 = 0;
                v30 = v13;
                goto LABEL_a1d2bc;
            }
            v54 = *(long long *)(index + 24);
            *(unsigned long *)(v13 + idx * 8) = v54;
            v55 = sub_9e403c(v19, v54, &v16);
            if (!v55)
                goto LABEL_a1d3bc;
            v56 = v55;
            if (v16 <= v42)
            {
                v67 = idx;
                *(unsigned long long *)(v31 + v67 * 8) = v56;
                j = v67 + 1;
                *(unsigned long long *)(v31 + j * 8) = 0;
                *(unsigned long long *)(v15 + v67 * 8) = v16;
                *(long long *)(v33 + v67 * 8) = *(long long *)(index + 32);
                goto LABEL_a1d534;
            }
            v57 = v9;
            if (v57 * v11 > v16)
            {
                v58 = (v57 + v16 - 1) / v57;
                if (v58 > (unsigned long long)*(long long *)(index + 16))
                {
                    sub_a368c8();
                    sub_a369bc("crypto/ec/ec_mult.c", 595, "ossl_ec_wNAF_mul");
                    sub_a36abc(16, 0xc0103, 0);
                    sub_a6c2e4(v56, "crypto/ec/ec_mult.c", 596);
                    goto LABEL_a1d3bc;
                }
                else
                {
                    j = v58 + idx;
                }
            }
            idx2 = idx;
            if (j > idx2)
            {
                v60 = *(long long *)(index + 32);
                v14 = j - 1;
                v11 = v3 * 8;
                iter = v31 + idx2 * 8 + 8;
                do
                {
                    if (v14 > idx2)
                    {
                        *(unsigned long long *)(v15 + idx2 * 8) = v57;
                        if (v16 >= v57)
                        {
                            v16 -= v57;
                        }
                        else
                        {
                            sub_a368c8();
                            sub_a369bc("crypto/ec/ec_mult.c", 610, "ossl_ec_wNAF_mul");
                            sub_a36abc(16, 0xc0103, 0);
                            v65 = v56;
                            v66 = 611;
LABEL_a1d8ac:
                            sub_a6c2e4(v65, "crypto/ec/ec_mult.c", v66);
                            v33 = v2;
                            v31 = v38;
                            goto LABEL_a1d3bc;
                        }
                    }
                    else
                    {
                        v57 = v16;
                        *(unsigned long long *)(v15 + idx2 * 8) = v57;
                    }
                    *(unsigned long long *)iter = 0;
                    v62 = sub_a6bf4c(v57, "crypto/ec/ec_mult.c", 623);
                    *(unsigned long long *)(iter - 8) = v62;
                    if (!v62)
                    {
                        v65 = v56;
                        v66 = 625;
                        goto LABEL_a1d8ac;
                    }
                    v63 = *(long long *)(v15 + idx2 * 8);
                    _memcpy();
                    if (!*(long long *)v60)
                    {
                        sub_a368c8();
                        sub_a369bc("crypto/ec/ec_mult.c", 633, "ossl_ec_wNAF_mul");
                        sub_a36abc(16, 0xc0103, 0);
                        v65 = v56;
                        v66 = 634;
                        goto LABEL_a1d8ac;
                    }
                    *(unsigned long *)(v2 + idx2 * 8) = v60;
                    v64 = idx2 + 1;
                    if (v42 < v63)
                        v42 = v63;
                    v57 = v9;
                    v60 += v11;
                    iter += 8;
                    idx2 = v64;
                } while (j != v64);
            }
            sub_a6c2e4(v56, "crypto/ec/ec_mult.c", 641);
            v33 = v2;
            v31 = v38;
LABEL_a1d534:
            v30 = v13;
LABEL_a1d538:
            v32 = sub_a6bf4c(v41 * 8 + 8, "crypto/ec/ec_mult.c", 651);
            if (v32)
            {
                v14 = v32 + v41 * 8;
                *v14 = 0;
                node = v32;
                if (v1)
                {
                    k = 0;
                    node = v32;
                    do
                    {
                        v70 = v33;
                        *(unsigned long long **)(v33 + k * 8) = node;
                        v71 = 1;
                        do
                        {
                            v72 = v71;
                            v73 = sub_a1a56c(v53);
                            *node = v73;
                            if (!v73)
                            {
                                v29 = 0;
                                v33 = v70;
                                goto LABEL_a1d2bc;
                            }
                        } while ((node += 1, v71 = v72 + 1, !(v72 >> ((char)(*(long long *)(v30 + k * 8) - 1) & 63))));
                        k += 1;
                        v33 = v70;
                    } while (k != v1);
                }
                if (node != v14)
                {
                    sub_a368c8();
                    sub_a369bc("crypto/ec/ec_mult.c", 668, "ossl_ec_wNAF_mul");
                    sub_a36abc(16, 0xc0103, 0);
                    goto LABEL_a1d5fc;
                }
                v12 = v53;
                v29 = sub_a1a56c(v53);
                if (v29)
                {
                    if (v1)
                    {
                        v74 = 0;
                        while (1)
                        {
                            v75 = *(long long *)(v33 + v74 * 8);
                            if (idx > v74)
                            {
                                if (!sub_a1a654(*(long long *)v75, v5[v74]))
                                    break;
                            }
                            else
                            {
                                if (!sub_a1a654(*(long long *)v75, v4))
                                    break;
                            }
                            if ((unsigned long long)*(long long *)(v30 + v74 * 8) >= 2)
                            {
                                if (!sub_a1b690(v12, v29, *(long long *)v75, a6))
                                    goto LABEL_a1d91c;
                                v76 = v75 + 8;
                                v77 = 2;
                                do
                                {
                                    v78 = v77;
                                    if (!sub_a1b598(v12, *(long long *)v76, *(long long *)(v76 - 8), v29, a6))
                                        goto LABEL_a1d91c;
                                } while ((v77 = v78 + 1, v76 += 8, !(v78 >> ((char)(*(long long *)(v30 + v74 * 8) - 1) & 63))));
                            }
                            v74 += 1;
                            v33 = v2;
                            if (v74 == v1)
                                goto LABEL_a1d6d8;
                        }
                    }
                    else
                    {
LABEL_a1d6d8:
                        if (v12->field_0->field_d8)
                            v12->field_0->field_d8();
LABEL_a1d91c:
                        v33 = v2;
LABEL_a1d2bc:
                        sub_a1a254(v29);
                        sub_a6c2e4(v30, "crypto/ec/ec_mult.c", 774);
                        sub_a6c2e4(v15, "crypto/ec/ec_mult.c", 775);
                        if (v31)
                        {
                            if (*(long long *)v31)
                            {
                                v79 = v31 + 8;
                                do
                                {
                                    v80 = v79;
                                    sub_a6c2e4();
                                    v79 = v80 + 8;
                                } while (*(long long *)v80);
                            }
                            sub_a6c2e4(v31, "crypto/ec/ec_mult.c", 782);
                        }
                        if (v32)
                        {
                            if (*(long long *)v32)
                            {
                                v81 = v32 + 8;
                                do
                                {
                                    v82 = v81;
                                    sub_a1a298();
                                    v81 = v82 + 8;
                                } while (*(long long *)v82);
                            }
                            sub_a6c2e4(v32, "crypto/ec/ec_mult.c", 788);
                        }
                        sub_a6c2e4(v33, "crypto/ec/ec_mult.c", 790);
                        return 0;
                    }
                }
            }
            else
            {
LABEL_a1d5fc:
                v29 = 0;
            }
        }
        else
        {
LABEL_a1d2b0:
            v29 = 0;
            v32 = 0;
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/ec/ec_mult.c", 491, "ossl_ec_wNAF_mul");
        v28 = 786691;
LABEL_a1cec8:
        sub_a36abc(16, v28, 0);
        v29 = 0;
        v30 = 0;
        v31 = 0;
        v15 = 0;
        v32 = 0;
        v33 = 0;
    }
    goto LABEL_a1d2bc;
}
