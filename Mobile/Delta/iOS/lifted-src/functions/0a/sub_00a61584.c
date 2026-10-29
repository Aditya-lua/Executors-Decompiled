/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa61584..0xa61e58 (2260 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a61584_0 {
    unsigned long long field_0;
    unsigned long long field_8;
    unsigned int field_10;
    char padding_14[36];
    unsigned int field_38;
    char padding_3c[4];
    unsigned int field_40;
} st_a61584_0;


unsigned int sub_a61584(long long a0, st_a61584_0 *a1, unsigned int a2, unsigned int a3, unsigned int a4, unsigned long long a5, long long a6, long long a7)
{
    unsigned long long v18;  // x23
    unsigned int v19;  // w28
    unsigned long long v28;  // x28
    unsigned int v29;  // x24
    long long v30;  // x0
    long long v31;  // x1
    unsigned int v32;  // x2
    long long v33;  // x0
    unsigned long v34;  // x23
    unsigned int v35;  // w8
    unsigned long v36;  // x9
    unsigned long v37;  // x24
    unsigned int v20;  // x8
    unsigned int v38;  // x25
    unsigned int v39;  // x24
    unsigned int v40;  // w8
    unsigned int v41;  // x8
    long long v42;  // x24
    unsigned long long v43;  // x0
    unsigned int v44;  // w8
    unsigned long v45;  // cc_op
    unsigned long v46;  // cc_dep1
    unsigned long v47;  // cc_dep2
    unsigned int v21;  // x23
    unsigned long v48;  // cc_ndep
    unsigned int v49;  // w26
    unsigned long long v50;  // 4118
    unsigned int v51;  // w28
    unsigned int v53;  // w0
    unsigned long long v54;  // 4112
    unsigned long long v55;  // 4110
    unsigned long long v56;  // 4112
    unsigned long long v57;  // 4110
    unsigned int v22;  // x22
    unsigned int v23;  // x21
    unsigned int v24;  // x20
    unsigned int v25;  // x0
    unsigned int v26;  // w8
    unsigned int v27;  // w0
    long long v0;  // [bp-0xf0], Other Possible Types: unsigned long long
    unsigned long v1;  // [bp-0xe8]
    long long v2;  // [bp-0xd0], Other Possible Types: unsigned int
    unsigned int v3;  // [bp-0xc4]
    unsigned int v4;  // [bp-0xc0], Other Possible Types: unsigned long
    unsigned long n;  // [bp-0xb8]
    long long v6;  // [bp-0xb0]
    unsigned long v7;  // [bp-0xa8]
    unsigned int v8;  // [bp-0xa0]
    long long v9;  // [bp-0x98], Other Possible Types: unsigned long long
    unsigned int v10;  // [bp-0x90]
    long long v11;  // [bp-0x88]
    long long v12;  // [bp-0x80]
    unsigned int v13;  // [bp-0x70]
    unsigned int v14;  // [bp-0x6c]
    unsigned int v15;  // [bp-0x68]
    char *v16;  // [bp-0x10]
    char v17;  // [bp+0x0]

    v16 = &v17;
    v18 = a5;
    v19 = 0;
    v15 = 0;
    v14 = 0;
    if (!a2)
        v19 = a1->field_40;
    *(unsigned int *)a6 = 0;
    if (!*(long long *)((char *)&a1[1].field_0 + 4))
    {
        v20 = 160;
        if (0x7ff < a4)
            v20 = 0x100;
        if (!v18)
            v18 = v20;
        switch (v18)
        {
        case 160:
            goto LABEL_a615e4;
        case 256:
            goto LABEL_a615e4;
        case 224:
            goto LABEL_a615e4;
        default:
            v21 = 0;
            v22 = 0;
            v23 = 0;
            v24 = 0;
            v25 = 0;
            v26 = 32;
            break;
        }
        goto LABEL_a61788;
    }
LABEL_a615e4:
    v25 = sub_a40ca8(a0);
    v24 = v25;
    if (!v25)
    {
        v38 = 0;
        v21 = 0;
        v22 = 0;
        v23 = 0;
        v39 = 0;
        goto LABEL_a6178c;
    }
    v27 = sub_a50ac8(v24);
    if ((int)v27 < 1)
    {
        v38 = 0;
        v21 = 0;
        v22 = 0;
        v23 = 0;
        v25 = 0;
        v39 = 0;
        goto LABEL_a6178c;
    }
    v13 = v19;
    v28 = v27 * 8;
    if (!v18)
        v29 = v28;
    else
        v29 = v18;
    if (a4 <= v29)
    {
LABEL_a6176c:
        v21 = 0;
        v22 = 0;
        v23 = 0;
        v25 = 0;
        v26 = 0x20000;
        goto LABEL_a61788;
    }
    if (a3)
    {
        if (a3 == 1)
        {
            if ((a4 != 0x400 || v29 != 160) && (a4 != 0x800 || v29 != 224 && v29 != 0x100))
            {
                sub_a368c8();
                sub_a369bc("crypto/ffc/ffc_params_generate.c", 77, "ffc_validate_LN");
                v30 = 5;
                v31 = 127;
                goto LABEL_a6167c;
            }
            goto LABEL_a6183c;
        }
        goto LABEL_a6176c;
    }
    if (v29 >= 513)
    {
        sub_a368c8();
        sub_a369bc("crypto/ffc/ffc_params_generate.c", 82, "ffc_validate_LN");
        v0 = v29;
        v32 = (unsigned int)"N is %zu, but the maximum supported N is 512";
        v30 = 10;
        v31 = 114;
LABEL_a61768:
        sub_a36abc(v30, v31, v32);
        goto LABEL_a6176c;
    }
    if ((a4 < 0xc00 || 0xff >= v29) && (a4 < 0x800 || 223 >= v29) && (a4 < 0x400 || v29 <= 159))
    {
        sub_a368c8();
        sub_a369bc("crypto/ffc/ffc_params_generate.c", 94, "ffc_validate_LN");
        v30 = 10;
        v31 = 114;
LABEL_a6167c:
        v32 = 0;
        goto LABEL_a61768;
    }
LABEL_a6183c:
    v25 = sub_a3f728();
    v23 = v25;
    if (!v25)
    {
        v38 = 0;
        v21 = 0;
        v22 = 0;
        v39 = 0;
        goto LABEL_a6178c;
    }
    v25 = sub_9dddcc(a0);
    v22 = v25;
    if (!v25)
    {
LABEL_a618e0:
        v38 = 0;
        v21 = 0;
        v39 = 0;
        goto LABEL_a6178c;
    }
    sub_9de064(v22);
    v10 = sub_9de208(v22);
    v12 = sub_9de208(v22);
    v11 = sub_9de208(v22);
    v9 = sub_9de208(v22);
    v33 = sub_9de208(v22);
    v25 = v33;
    if (!v25)
        goto LABEL_a618e0;
    v25 = *(long long *)&a1->padding_14[12];
    if (!*(long long *)&a1->padding_14[20])
        v34 = v27;
    else
        v34 = *(long long *)&a1->padding_14[20];
    if (a2)
    {
        if (!a1->field_0 != (a1->field_8 != 0))
        {
            v35 = v13 & 1;
            goto LABEL_a6192c;
        }
        else
        {
            v21 = 0;
            v26 = 0x800;
            goto LABEL_a61788;
        }
        goto LABEL_a61788;
    }
    if (v13 & 1 && (!v25 || *(int *)&a1->padding_14[28] < 0))
    {
        v21 = 0;
        goto LABEL_a61a9c;
    }
    v36 = v13;
    v35 = (unsigned int)v36 & 1;
    if (v36 >> 1 & 1 && !*(long long *)&a1->field_10)
    {
        v21 = 0;
        v26 = 0x400;
        goto LABEL_a61788;
    }
LABEL_a6192c:
    v8 = v25;
    v6 = v33;
    if (a1->field_0 && !v35)
    {
        v7 = a1->field_0;
        n = v34;
        v21 = 0;
        v37 = a1->field_8;
        goto LABEL_a61950;
    }
    v7 = sub_9de208(v22);
    v4 = sub_9de208(v22);
    if (!v4)
    {
        v38 = 0;
        v21 = 0;
        goto LABEL_a61e44;
    }
    if (v29 > v34 * 8)
    {
        v38 = 0;
        v21 = 0;
        v39 = 0;
        *(unsigned int *)a6 = 0x40000;
        goto LABEL_a61e48;
    }
    n = v34;
    v21 = sub_a6bf4c(v34, "crypto/ffc/ffc_params_generate.c", 653);
    if (!v21)
    {
LABEL_a61e40:
        v38 = 0;
        goto LABEL_a61e44;
    }
    v25 = v8;
    if (v25)
    {
        v3 = a4 * 4 - 1;
        if (a2)
            goto LABEL_a61b80;
        v40 = *(int *)&a1->padding_14[28];
        if ((int)v40 <= (int)v3)
            goto LABEL_a61b7c;
        v26 = 0x1000;
        goto LABEL_a61788;
    }
    if (a2)
    {
        v25 = sub_a6bf4c(n, "crypto/ffc/ffc_params_generate.c", 664);
        if (v25)
        {
            v8 = v25;
            v40 = a4 * 4 - 1;
LABEL_a61b7c:
            v3 = v40;
LABEL_a61b80:
            v2 = a4 - 1;
            if (!sub_9ea668(v9, sub_9e4624(), v2))
                goto LABEL_a61e40;
            v9 = v29 >> 3;
            v41 = *(long long *)&a1->padding_14[12];
            v2 /= (int)v28;
            v42 = v4;
            v25 = v8;
        }
        else
        {
            v38 = 0;
            v39 = 0;
            goto LABEL_a6178c;
        }
    }
    else
    {
        v25 = 0;
LABEL_a61a9c:
        v26 = 0x200;
        v38 = 0;
        v39 = 0;
LABEL_a61788:
        *(unsigned int *)a6 = v26;
        goto LABEL_a6178c;
    }
    while (1)
    {
        v0 = a6;
        if (!sub_a61e58(v22, v42, v24, v9, v25, n, v25 != v41, &v15, v0, a7))
            goto LABEL_a61e40;
        if (!a2 && sub_9e5528(v42, a1->field_8))
            break;
        if (!sub_9e804c(a7, 2, 0) || !sub_9e804c(a7, 3, 0))
            goto LABEL_a61e40;
        _memcpy(v21, v8, n);
        *(unsigned int *)&v0 = a4;
        v42 = v4;
        v43 = sub_a62034(v22, v24, v3, v2, v21, n, v42, v7, v0, a7, &v15 + 1, a6);
        if (0 < (int)v43)
        {
            if (sub_9e804c(a7, 2, 1) && (a2 || *&(&v15)[1] == v3 && !sub_9e5528(v7, a1->field_0)))
            {
                v44 = v13 & 3;
                v45 = 3;
                v46 = v44;
                v47 = 1;
                v48 = 0;
                if (v44 == 1)
                {
                    v49 = 0;
                    v38 = 0;
                    v39 = 0;
LABEL_a61dcc:
                    if (!v39)
                    {
                        v54 = arm64g_calculate_condition(v45, v46, v47, v48);
                        v55 = arm64g_calculate_condition(3, (v54 & 1 ? v49 : 0x40000000), 0, 0);
                        if (!(v55 & 1))
                            goto LABEL_a61dda;
LABEL_a61dd9:
                        v39 = 1;
                    }
                    else
                    {
                        v56 = arm64g_calculate_condition(v45, v46, v47, v48);
                        v57 = arm64g_calculate_condition(0, (v56 & 1 ? v49 : 0x40000000), 0, 0);
                        if (v57 & 1)
                            goto LABEL_a61dd9;
LABEL_a61dda:
                        v39 = 2;
                    }
                    goto LABEL_a61e48;
                }
                else
                {
                    v37 = v4;
LABEL_a61950:
                    v38 = sub_9e6c04();
                    if (!v38 || !sub_9e6cc0(v38, v7, v22) || v13 >> 1 & 1 && !sub_a62ed0(v22, v38, v7, v37, *(long long *)&a1->field_10, v6, a6) || !sub_9db58c(v12, v7, sub_9e4624()) || !sub_9de520(v11, 0, v12, v37, v22))
                    {
LABEL_a61e44:
                        v39 = 0;
                        goto LABEL_a61e48;
                    }
                    else if (v8 && (v50 = arm64g_calculate_condition(1, a1->field_38, 1, 0), !(v50 & 1)))
                    {
                        v0 = v8;
                        v1 = n;
                        v51 = v13;
                        if (sub_a62344(v22, v38, v24, v10, v6, v7, v11))
                        {
                            v4 = v37;
                            if (a2)
                            {
                                v39 = 1;
                                goto LABEL_a61cb4;
                            }
                            if (sub_9e5528(v10, *(long long *)&a1->field_10))
                            {
                                v39 = 0;
                                *(unsigned int *)a6 = 0x8000;
                                goto LABEL_a61e48;
                            }
                            else
                            {
                                v39 = 1;
                                v51 = v13;
LABEL_a61cb4:
                                if (sub_9e804c(a7, 3, 1))
                                {
                                    v49 = v51 & 2;
                                    if (!a2)
                                        goto LABEL_a61dcc;
                                    if (v7 != a1->field_0)
                                    {
                                        sub_9e48d4(a1->field_0);
                                        a1->field_0 = sub_9e4b00(v7);
                                    }
                                    if (v4 != a1->field_8)
                                    {
                                        sub_9e48d4(a1->field_8);
                                        a1->field_8 = sub_9e4b00(v4);
                                    }
                                    if (v10 != *(long long *)&a1->field_10)
                                    {
                                        sub_9e48d4(*(long long *)&a1->field_10);
                                        v10 = sub_9e4b00(v10);
                                        *(unsigned long long *)&a1->field_10 = v10;
                                    }
                                    if (a1->field_0 && a1->field_8 && v10 && !(v53 = sub_a60e3c(a1, v8, n, *&(&v15)[1]), !sub_a60e3c(a1, v8, n, *&(&v15)[1])))
                                    {
                                        *(unsigned int *)a1->padding_3c = v14;
                                        goto LABEL_a61dcc;
                                    }
                                }
                                goto LABEL_a61e44;
                            }
                        }
                        else
                        {
                            v39 = 0;
                            *(unsigned int *)a6 = 0x400;
                            goto LABEL_a61e48;
                        }
                    }
                    else
                    {
                        v4 = v37;
                        if (a2)
                        {
                            v39 = 0;
                            v51 = v13;
                            if (sub_a624f0(v22, v38, v10, v6, v7, v11, v12, &v14))
                                goto LABEL_a61cb4;
                            goto LABEL_a61e48;
                        }
                        else
                        {
                            v39 = 0;
                            v51 = v13;
                            goto LABEL_a61cb4;
                        }
                    }
                }
            }
            goto LABEL_a61e40;
        }
        if (v43 >> 31 & 1)
            goto LABEL_a61e40;
        v41 = *(long long *)&a1->padding_14[12];
        v25 = v8;
        if (v25 == v41)
        {
            v26 = 1;
            goto LABEL_a61788;
        }
    }
    v38 = 0;
    v39 = 0;
    *(unsigned int *)a6 = 0x4000;
LABEL_a61e48:
    v25 = v8;
LABEL_a6178c:
    if (v25 != *(long long *)&a1->padding_14[12])
        sub_a6c2e4();
    sub_a6c2e4(v21, "crypto/ffc/ffc_params_generate.c", 805);
    if (v22)
        sub_9de17c(v22);
    sub_9dded4(v22);
    sub_9e6c64(v38);
    sub_a3f73c(v23);
    sub_a3f52c(v24);
    return v39;
}
