/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a2198..0x9a29b0 (2072 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9a2198_0 {
    unsigned short *field_0;
    unsigned long long field_8;
} st_9a2198_0;

typedef struct st_9a2198_2 {
    unsigned short field_0;
} st_9a2198_2;

typedef struct st_9a2198_1 {
    char padding_0[1246];
    unsigned short field_4de;
    char padding_4e0[1234];
    char field_9b2;
    char padding_9b3[237];
    struct st_9a2198_2 *field_aa0;
    char padding_aa8[104];
    char field_b10;
} st_9a2198_1;


char sub_9a2198(st_9a2198_1 *a0, st_9a2198_0 *a1)
{
    st_9a2198_1 *v12;  // x0
    long long v13;  // x1
    unsigned long v19;  // cc_ndep
    unsigned long long v20;  // 4112
    unsigned long long v21;  // 4102
    unsigned long v22;  // cc_op
    unsigned long v23;  // cc_dep1
    unsigned long v24;  // cc_dep2
    unsigned long long v25;  // 4112
    unsigned long long v26;  // 4102
    long long v14;  // x2
    unsigned short *v27;  // x23
    char v28;  // x21
    unsigned long v29;  // x8
    char v30;  // x24
    char v31;  // x8
    unsigned long v32;  // cc_dep1
    unsigned long v33;  // cc_dep2
    unsigned long v15;  // x10
    unsigned long v34;  // x9
    unsigned long v35;  // x20
    unsigned long long v36;  // x28
    char v37;  // w9
    unsigned long long v38;  // 4112
    unsigned long long v39;  // 4102
    unsigned long long v40;  // 4112
    unsigned long long v41;  // 4102
    char v42;  // x0
    unsigned long long v43;  // x28
    char v16;  // x27
    char v44;  // x0
    st_9a2198_1 *v45;  // x0
    long long v46;  // x1
    long long v47;  // x2
    char idx;  // x9
    void* iter;  // x25
    long long v50;  // x26
    char v51;  // x20
    char v52;  // x27
    char v53;  // w28
    unsigned short *v17;  // x20
    char v54;  // x24
    char index;  // x8
    char v56;  // w20
    char v57;  // x27
    char v58;  // w28
    char v59;  // x24
    char v60;  // x8
    char v61;  // x27
    char v62;  // x24
    char v63;  // w28
    char v18;  // x22
    long long v64;  // x20
    char idx1;  // x8
    char v66;  // x27
    char v67;  // w28
    long long v68;  // x24
    char v69;  // x8
    char v70;  // x22
    long long v72;  // x1
    long long v73;  // x1
    char v0;  // [bp-0xb4], Other Possible Types: unsigned int
    char v1;  // [bp-0xb0]
    char v2;  // [bp-0xa8]
    char idx2;  // [bp-0xa0]
    char v4;  // [bp-0x98]
    char v5;  // [bp-0x90], Other Possible Types: long long
    long long *v6;  // [bp-0x88]
    void* v7;  // [bp-0x80], Other Possible Types: char
    char v8;  // [bp-0x78]
    uint128_t v9;  // [bp-0x70], Other Possible Types: char
    char *v10;  // [bp-0x10]
    char v11;  // [bp+0x0]

    v10 = &v11;
    *(unsigned short *)&a0->padding_4e0[8] = 0;
    if (*(int *)&a0->padding_4e0[40] && !(a0->field_b10 >> 1 & 1))
        return 1;
    if (*(long long *)&a0->padding_4e0[0])
    {
        sub_a368c8();
        sub_a369bc("ssl/statem/extensions_srvr.c", 849, "tls_parse_ctos_key_share");
        v12 = a0;
        v13 = 80;
        v14 = 786691;
    }
    else if (a1->field_8 >= 2 && !(v15 = *a1->field_0, v16 = (unsigned int)((v15 & 0xff00) >> 8) | (unsigned int)v15 * 0x100 & 0xff00ff00, a1->field_8 - 2 != v16))
    {
        v17 = a1->field_0 + 1;
        a1->field_0 = (char *)v17 + v16;
        a1->field_8 = 0;
        sub_967f90(a0, &v7, &v5);
        sub_968050(a0, &v6, &v4);
        v18 = *(long long *)&a0->padding_9b3[229];
        if (v18)
        {
            if (!v16)
            {
                v20 = arm64g_calculate_condition(v22, v23, v24, v19);
                v21 = arm64g_calculate_condition(19, (v20 & 1 ? a0->field_4de : 0x40000000), 0, 0);
                if (v21 & 1)
                    goto LABEL_9a24a0;
LABEL_9a2274:
                v27 = a0->field_aa0;
                v8 = 0;
                v28 = sub_a6bf4c(64, "ssl/statem/extensions_srvr.c", 663);
                if (v28)
                {
                    v2 = sub_a6bf4c(0x200, "ssl/statem/extensions_srvr.c", 668);
                    if (v2)
                    {
                        idx2 = 0;
                        v1 = 32;
                        while (1)
                        {
                            if (!v16)
                            {
                                if (v4)
                                {
                                    idx = 0;
                                    iter = (void*)v7;
                                    do
                                    {
                                        v50 = v6[idx];
                                        if (!(a0->field_9b2 >> 6 & 1))
                                        {
                                            v9 = 0;
                                            if (!v50)
                                                continue;
                                            v1 = idx;
                                            v51 = 0;
                                            v0 = 0;
                                            v52 = 0;
                                            v53 = 0;
                                            v54 = idx2;
                                            do
                                            {
                                                if (sub_9b1cd8(a0, *(short *)((char *)iter + 2 * v52), v28, idx2, 1, &v9) && sub_968218(a0, *(short *)((char *)iter + 2 * v52), 0x20004) && sub_968084(a0, *(short *)((char *)iter + 2 * v52), 772, 772, 0, 0))
                                                {
                                                    index = v9;
                                                    if (v54 > index)
                                                    {
                                                        v51 = *(short *)(v28 + index * 2);
                                                        v0 = index;
                                                        v54 = index;
                                                    }
                                                }
                                            } while ((v53 += 1, v52 = v53 & 0xffff, (unsigned long long)v50 > v52));
                                            if (!v51)
                                            {
                                                v56 = 0;
                                                v57 = 0;
                                                v58 = 0;
                                                v9 = 0;
                                                v59 = v18;
                                                do
                                                {
                                                    if (sub_9b1cd8(a0, *(short *)((char *)iter + 2 * v57), v27, v18, 1, &v9) && sub_968218(a0, *(short *)((char *)iter + 2 * v57), 0x20004) && sub_968084(a0, *(short *)((char *)iter + 2 * v57), 772, 772, 0, 0))
                                                    {
                                                        v60 = v9;
                                                        if (v59 > v60)
                                                        {
                                                            v56 = v27[v60];
                                                            v59 = v60;
                                                        }
                                                    }
                                                } while ((v58 += 1, v57 = v58 & 0xffff, (unsigned long long)v50 > v57));
                                                goto LABEL_9a2564;
                                            }
                                            else
                                            {
                                                v70 = v2;
                                                goto LABEL_9a28fc;
                                            }
                                            goto LABEL_9a28fc;
                                        }
                                        else
                                        {
                                            v9 = 0;
                                            v1 = idx;
                                            if (idx2)
                                            {
                                                v61 = 0;
                                                v0 = 0;
                                                v62 = 0;
                                                v63 = 0;
                                                v64 = v50;
                                                do
                                                {
                                                    if (sub_9b1cd8(a0, *(short *)(v28 + v62 * 2), iter, v50, 1, &v9) && sub_968218(a0, *(short *)(v28 + v62 * 2), 0x20004) && sub_968084(a0, *(short *)(v28 + v62 * 2), 772, 772, 0, 0))
                                                    {
                                                        idx1 = v9;
                                                        if ((unsigned long long)v64 > idx1)
                                                        {
                                                            v0 = v63 & 0xffff;
                                                            v61 = *(short *)((char *)iter + 2 * idx1);
                                                            v64 = idx1;
                                                        }
                                                    }
                                                } while ((v63 += 1, v62 = v63 & 0xffff, idx2 > v62));
                                                if (!v61)
                                                    goto LABEL_9a2794;
                                                v70 = v2;
LABEL_9a28fc:
                                                if (!sub_9a29b0(a0))
                                                {
                                                    sub_a6c2e4(v28, "ssl/statem/extensions_srvr.c", 994);
                                                    sub_a6c2e4(v70, "ssl/statem/extensions_srvr.c", 995);
                                                    return 0;
                                                }
                                                sub_a6c2e4(v28, "ssl/statem/extensions_srvr.c", 994);
                                                sub_a6c2e4(v70, "ssl/statem/extensions_srvr.c", 995);
                                                return 1;
                                            }
                                            else
                                            {
LABEL_9a2794:
                                                v56 = 0;
                                                v66 = 0;
                                                v67 = 0;
                                                v9 = 0;
                                                v68 = v50;
                                                do
                                                {
                                                    if (sub_9b1cd8(a0, v27[v66], iter, v50, 1, &v9) && sub_968218(a0, v27[v66], 0x20004) && sub_968084(a0, v27[v66], 772, 772, 0, 0))
                                                    {
                                                        v69 = v9;
                                                        if ((unsigned long long)v68 > v69)
                                                        {
                                                            v56 = *(short *)((char *)iter + 2 * v69);
                                                            v68 = v69;
                                                        }
                                                    }
                                                } while ((v67 += 1, v66 = v67 & 0xffff, v18 > v66));
LABEL_9a2564:
                                                idx = v1;
                                                if (v56)
                                                {
                                                    *(unsigned short *)&a0->padding_4e0[8] = v56;
                                                    sub_a6c2e4(v28, "ssl/statem/extensions_srvr.c", 994);
                                                    sub_a6c2e4(v2, "ssl/statem/extensions_srvr.c", 995);
                                                    return 1;
                                                }
                                            }
                                        }
                                    } while ((iter += v50 * 2, idx += 1, v4 > idx));
                                }
                                sub_a6c2e4(v28, "ssl/statem/extensions_srvr.c", 994);
                                sub_a6c2e4(v2, "ssl/statem/extensions_srvr.c", 995);
                                return 1;
                            }
                            if (v16 == 1 || (v16 & 0xfffffffffffffffe) == 2)
                            {
LABEL_9a2524:
                                sub_a368c8();
                                sub_a369bc("ssl/statem/extensions_srvr.c", 679, "extract_keyshares");
                                v45 = a0;
                                v46 = 50;
                                v47 = 159;
                                goto LABEL_9a2894;
                            }
                            v29 = v17[1];
                            v30 = (unsigned int)((v29 & 0xff00) >> 8) | (unsigned int)v29 * 0x100 & 0xff00ff00;
                            v31 = v16 - 4;
                            v16 = v31 - v30;
                            v32 = v31;
                            v33 = v30;
                            if (v31 < v30 || (v34 = *v17, v35 = v17 + 2, v9 = CONCAT(v30, v35), !v30))
                                goto LABEL_9a2524;
                            v36 = (unsigned int)((v34 & 0xff00) >> 8) | (unsigned int)v34 * 0x100 & 0xff00ff00;
                            v37 = a0->field_4de;
                            if (v37)
                            {
                                if (v31 == v30)
                                {
                                    v38 = arm64g_calculate_condition(4, v32, v33, 0);
                                    v39 = arm64g_calculate_condition(19, (v38 & 1 ? v36 & 0xffffffff : 0), (v38 & 1 ? v37 & 0xffff : 0), 0);
                                    if (v39 & 1)
                                        goto LABEL_9a286c;
                                }
                                else
                                {
                                    v40 = arm64g_calculate_condition(4, v32, v33, 0);
                                    v41 = arm64g_calculate_condition(16, (v40 & 1 ? v36 & 0xffffffff : 0), (v40 & 1 ? v37 & 0xffff : 0), 0);
                                    if (v41 & 1)
                                    {
LABEL_9a286c:
                                        sub_a368c8();
                                        v72 = 690;
LABEL_9a2884:
                                        sub_a369bc("ssl/statem/extensions_srvr.c", v72, "extract_keyshares");
                                        v45 = a0;
                                        v46 = 47;
                                        v47 = 108;
                                        goto LABEL_9a2894;
                                    }
                                }
                            }
                            if (!sub_9b1cd8(a0, v36, v27, v18, 0, &v8))
                            {
                                sub_a368c8();
                                v72 = 703;
                                goto LABEL_9a2884;
                            }
                            if (a0->field_4de)
                            {
                                v70 = v2;
                                if (sub_9a29b0(a0))
                                {
                                    sub_a6c2e4(v28, "ssl/statem/extensions_srvr.c", 994);
                                    sub_a6c2e4(v70, "ssl/statem/extensions_srvr.c", 995);
                                    return 1;
                                }
                                break;
                            }
                            v17 = v35 + v30;
                            if (!sub_9b1cd8(a0, v36, v7, v5, 1, 0) || !sub_968218(a0, v36, 0x20004) || !sub_968084(a0, v36, 772, 772, 0, 0) || !(*(unsigned short *)(v28 + idx2 * 2) = v36, *(uint128_t *)(v2 + idx2 * 16) = v9, idx2 += 1, idx2 == v1))
                                continue;
                            v42 = sub_a6c1b4(v28, v1 * 2 + 64, "ssl/statem/extensions_srvr.c", 749);
                            if (v42)
                            {
                                v43 = v42;
                                v44 = sub_a6c1b4(v2, v1 * 16 + 0x200, "ssl/statem/extensions_srvr.c", 758);
                                if (v44)
                                {
                                    v2 = v44;
                                    idx2 = v1;
                                    v1 = idx2 + 32;
                                    v28 = v43;
                                }
                                else
                                {
                                    sub_a368c8();
                                    sub_a369bc("ssl/statem/extensions_srvr.c", 760, "extract_keyshares");
                                    sub_9a58a4(a0, 80, 0xc0103, 0);
                                    v28 = v43;
LABEL_9a289c:
                                    v70 = v2;
                                    break;
                                }
                            }
                            else
                            {
                                sub_a368c8();
                                sub_a369bc("ssl/statem/extensions_srvr.c", 752, "extract_keyshares");
                                v45 = a0;
                                v46 = 80;
                                v47 = 786691;
LABEL_9a2894:
                                sub_9a58a4(v45, v46, v47, 0);
                                goto LABEL_9a289c;
                            }
                        }
                    }
                    else
                    {
                        sub_a368c8();
                        v73 = 670;
LABEL_9a2500:
                        sub_a369bc("ssl/statem/extensions_srvr.c", v73, "extract_keyshares");
                        sub_9a58a4(a0, 80, 0xc0103, 0);
                        v70 = 0;
                    }
                }
                else
                {
                    sub_a368c8();
                    v73 = 665;
                    goto LABEL_9a2500;
                }
                sub_a6c2e4(v28, "ssl/statem/extensions_srvr.c", 773);
                sub_a6c2e4(v70, "ssl/statem/extensions_srvr.c", 774);
                return 0;
            }
            v25 = arm64g_calculate_condition(v22, v23, v24, v19);
            v26 = arm64g_calculate_condition(16, (v25 & 1 ? a0->field_4de : 0x40000000), 0, 0);
            if (!(v26 & 1))
                goto LABEL_9a2274;
LABEL_9a24a0:
            sub_a368c8();
            sub_a369bc("ssl/statem/extensions_srvr.c", 881, "tls_parse_ctos_key_share");
            v12 = a0;
            v13 = 47;
            v14 = 108;
        }
        else
        {
            sub_a368c8();
            sub_a369bc("ssl/statem/extensions_srvr.c", 871, "tls_parse_ctos_key_share");
            v12 = a0;
            v13 = 109;
            v14 = 209;
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("ssl/statem/extensions_srvr.c", 854, "tls_parse_ctos_key_share");
        v12 = a0;
        v13 = 50;
        v14 = 159;
    }
    sub_9a58a4(v12, v13, v14, 0);
    return 0;
}
