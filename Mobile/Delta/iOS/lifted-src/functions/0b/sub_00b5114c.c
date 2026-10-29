/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb5114c..0xb51788 (1596 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b5114c_2 {
    char padding_0[16];
    long long field_10;
    unsigned short field_18;
    char padding_1a[6];
    long long field_20;
    char padding_28[64];
    unsigned short field_68;
    char padding_6a[70];
    unsigned int field_b0;
    unsigned int field_b4;
} st_b5114c_2;

extern char g_10002b0;

unsigned short sub_b5114c(unsigned short idx, unsigned short a1)
{
    st_b5114c_2 *v51;  // x22
    unsigned short v52;  // x0
    unsigned long v61;  // x20
    unsigned long long v62;  // 4116
    st_b5114c_2 *v63;  // x8
    unsigned int v64;  // w20
    unsigned long long v65;  // 4118
    st_b5114c_2 *v66;  // x8
    unsigned long long v67;  // 4116
    unsigned long long v68;  // 4112
    unsigned long long v69;  // 4112
    unsigned long long v70;  // x0
    unsigned short v53;  // x20
    unsigned short v71;  // x0
    unsigned short v72;  // x19
    unsigned short v73;  // x1
    unsigned short v54;  // x0
    unsigned short v55;  // x20
    st_b5114c_2 *v56;  // x8
    unsigned short v57;  // x20
    long long v58;  // x1
    unsigned short v59;  // x0
    unsigned long long num;  // x0
    unsigned long v0;  // [bp-0x300]
    unsigned long long v1;  // [bp-0x2f8]
    unsigned short *v2;  // [bp-0x2e8], Other Possible Types: unsigned short
    unsigned short v3;  // [bp-0x2e0]
    unsigned short *v4;  // [bp-0x2d8], Other Possible Types: unsigned short
    unsigned short v5;  // [bp-0x2d0]
    unsigned int v6;  // [bp-0x2c8]
    unsigned short v7;  // [bp-0x2c4]
    unsigned short v8;  // [bp-0x2c0]
    unsigned short v9;  // [bp-0x2b0]
    unsigned short v10;  // [bp-0x2a0]
    unsigned short v11;  // [bp-0x290]
    unsigned short v12;  // [bp-0x280]
    unsigned short v13;  // [bp-0x270]
    unsigned short v14;  // [bp-0x260]
    unsigned short v15;  // [bp-0x250]
    unsigned short v16;  // [bp-0x240]
    unsigned short v17;  // [bp-0x230]
    unsigned short v18;  // [bp-0x220]
    unsigned short v19;  // [bp-0x210]
    unsigned short v20;  // [bp-0x200]
    unsigned short v21;  // [bp-0x1f0]
    unsigned short v22;  // [bp-0x1e0]
    unsigned short v23;  // [bp-0x1d0]
    unsigned short v24;  // [bp-0x1c0]
    unsigned short v25;  // [bp-0x1b0]
    unsigned short v26;  // [bp-0x1a0]
    unsigned short v27;  // [bp-0x190]
    unsigned short v28;  // [bp-0x180]
    unsigned short v29;  // [bp-0x170]
    unsigned short v30;  // [bp-0x160]
    unsigned short v31;  // [bp-0x150]
    unsigned short v32;  // [bp-0x140]
    unsigned short v33;  // [bp-0x130]
    unsigned short v34;  // [bp-0x120]
    unsigned short v35;  // [bp-0x110]
    unsigned short v36;  // [bp-0x100]
    unsigned short v37;  // [bp-0xf0]
    unsigned short v38;  // [bp-0xe0]
    unsigned short v39;  // [bp-0xd0]
    unsigned short v40;  // [bp-0xc0]
    unsigned short v41;  // [bp-0xb0]
    unsigned short v42;  // [bp-0xa0]
    unsigned short v43;  // [bp-0x90]
    unsigned short v44;  // [bp-0x80]
    unsigned short v45;  // [bp-0x70]
    unsigned short v46;  // [bp-0x60]
    unsigned short v47;  // [bp-0x50]
    unsigned long v48;  // [bp-0x48]
    char *v49;  // [bp-0x10]
    char v50;  // [bp+0x0]

    v49 = &v50;
    v48 = *(long long *)&g_10002b0;
    v47 = 0;
    v45 = 0;
    v46 = 0;
    v43 = 0;
    v44 = 0;
    v4 = 0;
    v5 = 0;
    v41 = 0;
    v42 = 0;
    v39 = 0;
    v40 = 0;
    v37 = 0;
    v38 = 0;
    v35 = 0;
    v36 = 0;
    v33 = 0;
    v34 = 0;
    v31 = 0;
    v32 = 0;
    v29 = 0;
    v30 = 0;
    v28 = 0;
    v27 = 0;
    v25 = 0;
    v26 = 0;
    v23 = 0;
    v24 = 0;
    v2 = 0;
    v3 = 0;
    v21 = 0;
    v22 = 0;
    v19 = 0;
    v20 = 0;
    v17 = 0;
    v18 = 0;
    v15 = 0;
    v16 = 0;
    v14 = 0;
    v12 = 0;
    v13 = 0;
    v10 = 0;
    v11 = 0;
    v8 = 0;
    v9 = 0;
    if (idx)
    {
        if (a1 && *(long long *)a1)
        {
            v51 = (st_b5114c_2 *)idx;
            v6 = *(int *)(idx + 176);
            v7 = *(int *)(idx + 104);
            v52 = sub_a6fbc4(a1, "digest");
            if (v52)
            {
                v53 = sub_a6fbc4(a1, "properties");
                v5 = (unsigned short)&v44;
                idx = sub_a71220(v52, &v5, 50);
                if (idx && (!v53 || !(v4 = &v28, idx = sub_a71220(v53, &v4, 0x100), !idx)))
                    goto LABEL_b51268;
            }
            else
            {
LABEL_b51268:
                v54 = sub_a6fbc4(a1, "pad-mode");
                v7 = v7;
                if (!v54)
                {
LABEL_b513d4:
                    v59 = sub_a6fbc4(a1, "saltlen");
                    if (v59)
                    {
                        if (v7 != 6)
                        {
                            sub_a368c8();
                            sub_a369bc("providers/implementations/signature/rsa_sig.c", 1689, "rsa_set_ctx_params");
                            v57 = (unsigned short)"PSS saltlen can only be specified if PSS padding has been specified first";
                            v58 = 0x88;
                            goto LABEL_b516c8;
                        }
                        if (*(int *)(v59 + 8) != 4)
                        {
                            if (*(int *)(v59 + 8) == 1)
                            {
                                idx = sub_a6fc2c();
                                if (idx)
                                {
                                    num = v6;
                                    goto LABEL_b51418;
                                }
                                else
                                {
                                    if (*(long long *)&g_10002b0 == v48)
                                        return idx;
                                    ___stack_chk_fail();
                                }
                            }
LABEL_b5144c:
                            idx = 0;
                        }
                        else
                        {
                            v61 = *(long long *)(v59 + 16);
                            if (_strcmp(v61, "digest"))
                            {
                                if (_strcmp(v61, "max"))
                                {
                                    if (_strcmp(v61, "auto"))
                                    {
                                        if (_strcmp(v61, "auto-digestmax"))
                                        {
                                            num = _atoi(v61);
                                            v6 = num;
LABEL_b51418:
                                            v62 = arm64g_calculate_condition(193, num & 0xffffffff, 5, 0);
                                            v63 = v51;
                                            if (v62 & 1)
                                                goto LABEL_b51534;
                                            sub_a368c8();
                                            sub_a369bc("providers/implementations/signature/rsa_sig.c", 1722, "rsa_set_ctx_params");
                                            v58 = 112;
                                            goto LABEL_b516c4;
                                        }
                                        else
                                        {
                                            num = 0xfffffffc;
                                        }
                                    }
                                    else
                                    {
                                        num = 0xfffffffe;
                                    }
                                }
                                else
                                {
                                    num = 0xfffffffd;
                                }
                            }
                            else
                            {
                                num = 0xffffffff;
                            }
                            v6 = num;
                            v63 = v51;
LABEL_b51534:
                            v64 = v63->field_b4;
                            v65 = arm64g_calculate_condition(1, v64, 1, 0);
                            if (!(v65 & 1))
                            {
                                v66 = v51;
                                v67 = arm64g_calculate_condition(1, num & 0xffffffff, 4, 0);
                                if (!(v67 & 1))
                                {
                                    v68 = arm64g_calculate_condition(1, num & 0xffffffff, 1, 0);
                                    if (!(v68 & 1))
                                    {
                                        v69 = arm64g_calculate_condition(0x11, num & 0xffffffff, 2, 0);
                                        if (!(v69 & 1))
                                            goto LABEL_b5155c;
                                        if (!(num >> 31 & 1) && (int)v64 > (int)num)
                                        {
                                            sub_a368c8();
                                            sub_a369bc("providers/implementations/signature/rsa_sig.c", 1751, "rsa_set_ctx_params");
                                            v0 = v51->field_b4;
                                            v1 = v6;
                                            v57 = (unsigned short)"Should be more than %d, but would be set to %d";
LABEL_b51620:
                                            v58 = 172;
                                            goto LABEL_b516c8;
                                        }
                                    }
                                    else
                                    {
                                        if ((int)v64 > (int)sub_a50ac8(v66->field_20))
                                        {
                                            sub_a368c8();
                                            sub_a369bc("providers/implementations/signature/rsa_sig.c", 1740, "rsa_set_ctx_params");
                                            v70 = sub_a50ac8(v51->field_20);
                                            v0 = v51->field_b4;
                                            v1 = v70;
                                            v57 = (unsigned short)"Should be more than %d, but would be set to match digest size (%d)";
                                            goto LABEL_b51620;
                                        }
                                    }
                                }
                                else
                                {
LABEL_b5155c:
                                    if (!(v66->field_18 & 32800))
                                    {
                                        sub_a368c8();
                                        sub_a369bc("providers/implementations/signature/rsa_sig.c", 1733, "rsa_set_ctx_params");
                                        v57 = (unsigned short)"Cannot use autodetected salt length";
                                        v58 = 112;
                                        goto LABEL_b516c8;
                                    }
                                }
                            }
                            goto LABEL_b5162c;
                        }
                    }
                    else
                    {
LABEL_b5162c:
                        v71 = sub_a6fbc4(a1, "mgf1-digest");
                        if (v71)
                        {
                            v72 = sub_a6fbc4(a1, "mgf1-properties");
                            v3 = (unsigned short)&v24;
                            idx = sub_a71220(v71, &v3, 50);
                            if (idx && (!v72 || !(v2 = &v8, idx = sub_a71220(v72, &v2, 0x100), !idx)))
                            {
                                v7 = v7;
                                if (v7 == 6)
                                    goto LABEL_b516d8;
                                sub_a368c8();
                                sub_a369bc("providers/implementations/signature/rsa_sig.c", 1779, "rsa_set_ctx_params");
                                v58 = 167;
LABEL_b516c4:
                                v57 = 0;
LABEL_b516c8:
                                sub_a36abc(57, v58, v57);
                                idx = 0;
                            }
                        }
                        else
                        {
LABEL_b516d8:
                            v51->field_b0 = v6;
                            *(unsigned int *)&v51->field_68 = v7;
                            v73 = v5;
                            if (!v51->field_20 && !v73 && v7 == 6)
                            {
                                v73 = (unsigned short)"SHA1";
                                v5 = (unsigned short)"SHA1";
                            }
                            if (v3)
                            {
                                idx = sub_b521cc();
                                if (idx)
                                {
                                    v73 = v5;
                                }
                                else
                                {
                                    if (*(long long *)&g_10002b0 == v48)
                                        return idx;
                                    ___stack_chk_fail();
                                }
                            }
                            if (v73)
                            {
                                idx = sub_b52328();
                                if (idx)
                                    goto LABEL_b5173c;
                            }
                            else
                            {
                                idx = sub_b52614();
                                if (idx)
                                    goto LABEL_b5173c;
                            }
                        }
                    }
                }
                else if (*(int *)(v54 + 8) != 4)
                {
                    if (*(int *)(v54 + 8) != 1)
                        goto LABEL_b5144c;
                    idx = sub_a6fc2c();
                    if (idx)
                        goto LABEL_b5129c;
                }
                else
                {
                    v55 = *(long long *)(v54 + 16);
                    if (!v55)
                        goto LABEL_b5144c;
                    if (!_strcmp(v55, "pkcs1"))
                    {
                        v7 = 1;
                    }
                    else if (!_strcmp(v55, "none"))
                    {
                        v7 = 3;
                    }
                    else if (!_strcmp(v55, "x931"))
                    {
                        v7 = 5;
                    }
                    else if (_strcmp(v55, "pss"))
                    {
LABEL_b5129c:
                        goto LABEL_b5131c;
                    }
                    else
                    {
                        v7 = 6;
                    }
LABEL_b5131c:
                    v56 = v51;
                    if (v7 <= 3)
                    {
                        switch (v7)
                        {
                        case 1:
                            v57 = (unsigned short)"PKCS#1 padding not allowed with RSA-PSS";
                            break;
                        case 3:
                            v57 = (unsigned short)"No padding not allowed with RSA-PSS";
                            break;
                        default:
LABEL_b514e8:
                            sub_a368c8();
                            sub_a369bc("providers/implementations/signature/rsa_sig.c", 1677, "rsa_set_ctx_params");
                            v58 = 165;
                            goto LABEL_b516c4;
                        }
                        goto LABEL_b51398;
                    }
                    if (v7 == 4)
                    {
                        v57 = (unsigned short)"OAEP padding not allowed for signing / verifying";
                    }
                    else if (v7 != 5)
                    {
                        if (v7 != 6)
                            goto LABEL_b514e8;
                        if (v56->field_18 & 49200)
                            goto LABEL_b513d4;
                        v57 = (unsigned short)"PSS padding only allowed for sign and verify operations";
                    }
                    else
                    {
                        v57 = (unsigned short)"X.931 padding not allowed with RSA-PSS";
LABEL_b51398:
                        if (!sub_ab1cb0(v56->field_10, 0xf000))
                            goto LABEL_b513d4;
                    }
                    sub_a368c8();
                    sub_a369bc("providers/implementations/signature/rsa_sig.c", 1679, "rsa_set_ctx_params");
                    v58 = 165;
                    goto LABEL_b516c8;
                }
            }
        }
        else
        {
LABEL_b5173c:
            idx = 1;
        }
    }
    if (*(long long *)&g_10002b0 == v48)
        return idx;
    ___stack_chk_fail();
}
