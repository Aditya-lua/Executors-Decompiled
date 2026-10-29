/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa625ec..0xa62e5c (2160 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a625ec_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned long long field_10;
    char padding_18[16];
    unsigned long long field_28;
    char padding_30[12];
    unsigned int field_3c;
    unsigned int field_40;
} st_a625ec_0;

extern char g_10002b0;

unsigned long long sub_a625ec(long long a0, st_a625ec_0 *a1, unsigned long long a2, unsigned long a3, unsigned long a4, unsigned long long a5, unsigned long a6, long long a7)
{
    unsigned long long v32;  // x24
    unsigned long long v33;  // x22
    unsigned long long v42;  // x0
    unsigned long long v43;  // x26
    unsigned long long v44;  // x0
    unsigned long long v45;  // x0
    unsigned long long v46;  // x26
    unsigned long long v47;  // x27
    unsigned long long v48;  // x28
    unsigned long long v49;  // x10
    unsigned long long v50;  // w8
    unsigned long long v51;  // w8
    unsigned long long v34;  // x20
    unsigned long v52;  // x20
    unsigned long v53;  // x24
    long long v54;  // x0
    unsigned long long v55;  // x20
    unsigned long long n;  // x20
    unsigned long long v57;  // w8
    unsigned long long v58;  // x9
    unsigned int v59;  // w8
    unsigned long v60;  // x10
    unsigned long long v61;  // x1
    unsigned long long v35;  // x28
    unsigned long long v62;  // x10
    unsigned long long v63;  // x11
    unsigned long long i;  // x8
    uint128_t *iter;  // x9
    uint128_t *node;  // x10
    unsigned long long v67;  // x8
    uint128_t v68;  // q1
    uint128_t v69;  // q3
    double *v71;  // x8
    unsigned long long v36;  // x8
    unsigned long long *iter1;  // x9
    unsigned long long v73;  // x10
    double *v74;  // x8
    unsigned long v75;  // d0
    unsigned long long v77;  // 4121
    unsigned long long j;  // x8
    char *iter2;  // x9
    char *v80;  // x10
    unsigned long long v81;  // x8
    unsigned long long v37;  // x19
    char *v82;  // x10
    unsigned long long v84;  // w0
    unsigned long v85;  // x20
    unsigned long long v86;  // w0
    unsigned long long v87;  // 4121
    unsigned long long v38;  // w0
    unsigned long long v39;  // x20
    unsigned long long v40;  // x28
    unsigned long long v41;  // x2
    long long v0;  // [bp-0x200]
    unsigned long long v1;  // [bp-0x1d8]
    long long v2;  // [bp-0x1d0]
    unsigned long long v3;  // [bp-0x1c8]
    unsigned long long v4;  // [bp-0x1bc]
    unsigned long long v5;  // [bp-0x1b8]
    uint128_t *v6;  // [bp-0x1b0]
    uint128_t *v7;  // [bp-0x1a8]
    unsigned long long v8;  // [bp-0x1a0]
    unsigned long long v9;  // [bp-0x198]
    unsigned long long v10;  // [bp-0x190]
    unsigned long long v11;  // [bp-0x188]
    long long v12;  // [bp-0x180]
    unsigned long long v13;  // [bp-0x178]
    long long v14;  // [bp-0x170]
    unsigned long long v15;  // [bp-0x168]
    unsigned long long v16;  // [bp-0x160]
    unsigned long long v17;  // [bp-0x158]
    unsigned long long v18;  // [bp-0x154]
    unsigned long long v19;  // [bp-0x150]
    unsigned long long v20;  // [bp-0x148]
    unsigned int v21;  // [bp-0x138]
    unsigned long long v22;  // [bp-0x134]
    char v23;  // [bp-0x130]
    char v24;  // [bp-0x110]
    uint512_t v25;  // [bp-0xf0]
    char v27;  // [bp-0xb0]
    unsigned long v29;  // [bp-0x70]
    char *v30;  // [bp-0x10]
    char v31;  // [bp+0x0]

    v30 = &v31;
    v32 = a5;
    v33 = 0;
    v29 = *(long long *)&g_10002b0;
    v21 = 0xffffffff;
    v22 = 0;
    if (!a2)
        v33 = a1->field_40;
    v34 = *(long long *)&a1->padding_18[8];
    v35 = a1->field_28;
    *(unsigned int *)a6 = 0;
    if (*(long long *)((char *)&a1[1].field_0 + 4))
    {
LABEL_a6265c:
        v37 = sub_a40ca8(a0);
        if (v37)
        {
            v38 = (unsigned int)sub_a50ac8(v37);
            if (v38 < 1)
                goto LABEL_a62858;
            if (!v32)
                v32 = v38 * 8;
            if (0x1ff >= a4)
            {
                v39 = 0;
                v40 = 0;
                *(unsigned int *)a6 = 0x20000;
            }
            else
            {
                v41 = v32 >> 3;
                if ((v32 & 0xffffffffffffffb8) != 160 && v41 != 32)
                    goto LABEL_a62748;
                v18 = v34 != 0;
                v20 = v41;
                if (!v34)
                {
LABEL_a62798:
                    v42 = sub_9dddcc(a0);
                    if (!v42)
                        goto LABEL_a62854;
                    v43 = v42;
                    sub_9de064();
                    v12 = sub_9de208(v43);
                    v44 = sub_9de208(v43);
                    v16 = sub_9de208(v43);
                    v13 = sub_9de208(v43);
                    v14 = sub_9de208(v43);
                    v19 = v43;
                    v45 = sub_9de208(v43);
                    if (v45 && !(v46 = v45, v11 = v44, v47 = a4 + 63 & 0xffffffffffffffc0, v48 = v47 - 1, !sub_9ea668(v46, sub_9e4624(), v48)))
                    {
                        if (a2)
                        {
                            v49 = v20;
                            if (a1->field_0 != 0 != (!a1->field_8))
                            {
                                v50 = (unsigned int)v33 & 1;
                                goto LABEL_a628d0;
                            }
                            else
                            {
                                v51 = 0x800;
                                goto LABEL_a62d60;
                            }
                            goto LABEL_a62d60;
                        }
                        if (v33 & 1 && (!v34 || *(int *)&a1->padding_30[0] < 0))
                        {
                            v51 = 0x200;
                            goto LABEL_a62d60;
                        }
                        v50 = (unsigned int)v33 & 1;
                        v49 = v20;
                        if (v33 >> 1 & 1 && (v49 = v20, !a1->field_10))
                        {
                            v51 = 0x400;
                            goto LABEL_a62d60;
                        }
LABEL_a628d0:
                        if (a1->field_0 && !v50)
                        {
                            v52 = a1->field_8;
                            v53 = a1->field_0;
                            goto LABEL_a628e4;
                        }
                        v17 = 0;
                        v15 = v49 - 1;
                        v1 = v46;
                        v2 = v48 / 160;
                        v3 = v47;
                        v4 = (unsigned int)v47 * 4 - 1;
                        v5 = v32 & 192;
                        v9 = v49 & 56;
                        v10 = v49 & 32;
                        v6 = (char *)&v25 + 16;
                        v7 = &v27 + 16;
                        v8 = -(((v32 * 0x400000000000000 | v32 >> 6) & 18158513697557839879 & 7) * 8);
                        while (1)
                        {
                            v54 = sub_9de514();
                            v55 = v18;
                            while (1)
                            {
                                if (!sub_9e804c(a7, 0, v17) || !(v55 & 1) && (int)sub_aa8658(v54, &v24, v20, 0) < 1)
                                    goto LABEL_a62df4;
                                v17 += 1;
                                n = v20;
                                ___memcpy_chk(&v23, &v24, n, 32);
                                ___memcpy_chk(&v27, &v24, n, 64);
                                v57 = (unsigned int)n;
                                v58 = v15;
                                do
                                {
                                    v59 = v57 - 1;
                                } while (v57 >= 1 && (v60 = (&v23)[v58] + 1, (&v23)[v58] = v60, v58 -= 1, v57 = v59, v60 >> 8 & 1));
                                if (!sub_a40abc(&v24, n, &v25, 0, v37, 0) || !sub_a40abc(&v23, v20, &v27, 0, v37, 0))
                                    goto LABEL_a62df4;
                                v61 = v20;
                                if ((int)v61 >= 1)
                                {
                                    if (64 > v32)
                                    {
                                        v62 = 0;
                                    }
                                    else
                                    {
                                        if (0x100 > v32)
                                        {
                                            v63 = 0;
                                        }
                                        else
                                        {
                                            i = v10;
                                            iter = v6;
                                            node = v7;
                                            do
                                            {
                                                v67 = i;
                                                v68 = *node;
                                                v69 = *iter;
                                                *(int128_t *)((char *)iter - 16) = *(int128_t *)((char *)node - 16) ^ *(int128_t *)((char *)iter - 16);
                                                *iter = v68 ^ v69;
                                                node += 2;
                                                iter += 2;
                                                i = v67 - 32;
                                            } while (i);
                                            if (v61 == v10)
                                                goto LABEL_a62c50;
                                            v62 = v10;
                                            v63 = v62;
                                            if (!v5)
                                                goto LABEL_a62c28;
                                        }
                                        v71 = &(&v27)[v63];
                                        iter1 = (char *)&v25 + v63;
                                        v73 = v8 + v63;
                                        do
                                        {
                                            v74 = v71 + 1;
                                            v75 = __dirty_unsupported_Iop_ZeroHI64ofV128(*(unsigned long long *)&*v71 ^ *(unsigned long long *)&*(double *)iter1);
                                            *iter1 = v75;
                                            iter1 += 1;
                                            v77 = arm64g_calculate_condition(18, v73, 8, 0);
                                            v71 = v74;
                                            v73 += 8;
                                        } while (v77 & 1);
                                        v62 = v9;
                                        if (v61 == v9)
                                            goto LABEL_a62c50;
                                    }
LABEL_a62c28:
                                    j = v61 - v62;
                                    iter2 = (char *)&v25 + v62;
                                    v80 = &(&v27)[v62];
                                    do
                                    {
                                        v81 = j;
                                        v82 = v80 + 1;
                                        *iter2 = *iter2 ^ *v80;
                                        iter2 += 1;
                                        j = v81 - 1;
                                        v80 = v82;
                                    } while (j);
                                }
LABEL_a62c50:
                                v25 |= 128;
                                *((char *)&v25 + v15) = *((char *)&v25 + v15) | 1;
                                if (!sub_9e4db0(&v25))
                                    goto LABEL_a62df4;
                                v84 = (unsigned int)sub_9e892c(v16, v19, a7);
                                if (0 < v84)
                                    break;
                                v55 = 0;
                                if (v84)
                                    goto LABEL_a62df4;
                            }
                            if (!sub_9e804c(a7, 2, 0) || !sub_9e804c(a7, 3, 0))
                                goto LABEL_a62df4;
                            v85 = v4;
                            if (!a2 && (v85 = *(int *)&a1->padding_30[0], v4 < (int)v85))
                            {
                                v51 = 0x1000;
                                goto LABEL_a62d60;
                            }
                            *(unsigned int *)&v0 = v3;
                            v86 = (unsigned int)sub_a62034(v19, v37, v85, v2, &v23, v20, v16, v13, v0, a7, &v22, a6);
                            if (0 < v86)
                                break;
                            v18 = 0;
                            v39 = 0;
                            v40 = 0;
                            v87 = arm64g_calculate_condition(0x11, v86, 1, 0);
                            if (!(v87 & 1))
                                goto LABEL_a62dfc;
                        }
                        if (!sub_9e804c(a7, 2, 1))
                            goto LABEL_a62df4;
                        if (a2)
                        {
LABEL_a62dd4:
                            v52 = v16;
                            v53 = v13;
                            v46 = v1;
                            if ((v33 & 3) != 1)
                            {
LABEL_a628e4:
                                v40 = sub_9e6c04();
                                if (v40 && sub_9e6cc0(v40, v53, v19))
                                {
                                    if (a2)
                                    {
                                        if (sub_9db58c(v46, v53, sub_9e4624()) && sub_9de520(v12, 0, v46, v52, v19) && sub_a624f0(v19, v40, v11, v14, v53, v12, v46, &v21) && sub_9e804c(a7, 3, 1))
                                        {
                                            if (v53 != a1->field_0)
                                            {
                                                sub_9e48d4(a1->field_0);
                                                a1->field_0 = sub_9e4b00(v53);
                                            }
                                            if (v52 != a1->field_8)
                                            {
                                                sub_9e48d4(a1->field_8);
                                                a1->field_8 = sub_9e4b00(v52);
                                            }
                                            if (v11 != a1->field_10)
                                            {
                                                sub_9e48d4(a1->field_10);
                                                v11 = sub_9e4b00(v11);
                                                a1->field_10 = v11;
                                            }
                                            if (a1->field_0)
                                            {
                                                v39 = 0;
                                                if (!a1->field_8 || !v11)
                                                    goto LABEL_a62dfc;
                                                if (sub_a60e3c(a1, &v24, v20, v22))
                                                {
                                                    a1->field_3c = v21;
                                                    goto LABEL_a62da4;
                                                }
                                            }
                                        }
                                    }
                                    else
                                    {
                                        if ((!(v33 >> 1 & 1) || sub_a62ed0(v19, v40, v53, v52, a1->field_10, v14, a6)) && sub_9e804c(a7, 3, 1))
                                            goto LABEL_a62da4;
                                    }
                                }
                                v39 = 0;
                            }
                            else
                            {
                                v40 = 0;
LABEL_a62da4:
                                if (!((unsigned int)v33 & 2))
                                    v39 = 1;
                                else
                                    v39 = 2;
                            }
                        }
                        else
                        {
                            if (v22 == (unsigned int)v85)
                            {
                                if (sub_9e5528(v13, a1->field_0))
                                {
                                    v51 = 0x2000;
                                    goto LABEL_a62d60;
                                }
                                goto LABEL_a62dd4;
                            }
                            else
                            {
                                v51 = 0x10000;
                            }
                            v40 = 0;
                            v39 = 0;
LABEL_a62d60:
                            *(unsigned int *)a6 = v51;
                        }
                    }
                    else
                    {
LABEL_a62df4:
                        v39 = 0;
                        v40 = 0;
                    }
LABEL_a62dfc:
                    sub_9de17c(v19);
                }
                else if (v20 > v35)
                {
                    v39 = 0;
                    v40 = 0;
                    *(unsigned int *)a6 = 0x40000;
                }
                else
                {
                    ___memcpy_chk(&v24, v34);
                    goto LABEL_a62798;
                }
            }
        }
        else
        {
LABEL_a62854:
            v39 = 0;
LABEL_a62858:
            v40 = 0;
        }
    }
    else
    {
        v36 = 160;
        if (0x7ff < a4)
            v36 = 0x100;
        if (!v32)
            v32 = v36;
        switch (v32)
        {
        case 160:
            goto LABEL_a6265c;
        case 256:
            goto LABEL_a6265c;
        case 224:
            goto LABEL_a6265c;
        default:
            v37 = 0;
            v40 = 0;
            v39 = 0;
LABEL_a62748:
            *(unsigned int *)a6 = 32;
            break;
        }
    }
    sub_9dded4();
    sub_9e6c64(v40);
    sub_a3f52c(v37);
    if (*(long long *)&g_10002b0 == v29)
        return v39;
    ___stack_chk_fail();
}
