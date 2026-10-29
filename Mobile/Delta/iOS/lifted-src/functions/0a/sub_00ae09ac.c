/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xae09ac..0xae11d0 (2084 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ae09ac_0 {
    struct st_ae09ac_0 *field_0;
    struct st_ae09ac_0 *field_8;
} st_ae09ac_0;

typedef struct st_ae09ac_1 {
    char padding_0[8];
    unsigned long long field_8;
    struct st_ae09ac_0 *field_10;
} st_ae09ac_1;

extern long long g_adf878;
extern long long g_ae04f0;
extern char g_10002b0;

st_ae09ac_0 * sub_ae09ac(unsigned long a0, unsigned long a1, long long a2)
{
    long long v15;  // x25
    st_ae09ac_0 *v16;  // x28
    st_ae09ac_0 *v26;  // x20
    st_ae09ac_0 *v27;  // x8
    st_ae09ac_0 *v28;  // x26
    long long v29;  // x27
    st_ae09ac_0 *v30;  // x25
    unsigned long long v31;  // x22
    st_ae09ac_0 *v32;  // w27
    unsigned long long v33;  // x25
    st_ae09ac_0 **v34;  // x24
    st_ae09ac_0 *v17;  // x23
    unsigned int v35;  // w0
    st_ae09ac_0 *v36;  // x22
    long long v37;  // x22
    st_ae09ac_0 *v38;  // x27
    unsigned long long v39;  // x0
    st_ae09ac_0 *v40;  // x0
    st_ae09ac_0 *v41;  // x24
    st_ae09ac_0 *v42;  // x8
    st_ae09ac_0 *v43;  // x9
    st_ae09ac_0 *v44;  // x0
    st_ae09ac_1 *v18;  // x21
    long long v45;  // x1
    long long v46;  // x1
    long long v47;  // x1
    st_ae09ac_0 *v19;  // x22
    st_ae09ac_0 *v20;  // x19
    unsigned int v21;  // w28
    long long v22;  // x24
    st_ae09ac_0 *v23;  // x0
    unsigned long v0;  // [bp-0xe0], Other Possible Types: unsigned long long
    unsigned long v1;  // [bp-0xd8]
    unsigned long long v2;  // [bp-0xd0]
    st_ae09ac_0 *v3;  // [bp-0xc8]
    st_ae09ac_1 *v4;  // [bp-0xb8]
    st_ae09ac_0 *v5;  // [bp-0xb0]
    st_ae09ac_0 *v6;  // [bp-0xa8]
    st_ae09ac_0 *v7;  // [bp-0xa0]
    unsigned int v8;  // [bp-0x94]
    st_ae09ac_0 **v9;  // [bp-0x90], Other Possible Types: unsigned long
    char v10;  // [bp-0x88]
    char v11;  // [bp-0x78]
    unsigned long v12;  // [bp-0x68]
    char *v13;  // [bp-0x10]
    char v14;  // [bp+0x0]

    v13 = &v14;
    v15 = a2;
    v12 = *(long long *)&g_10002b0;
    v16 = sub_ad6270(&g_ae04f0);
    if (v16)
    {
        if ((int)sub_ad69e4(v15) >= 1)
        {
            v17 = 0;
            v5 = v16;
            do
            {
                v18 = sub_ad69f8(v15, v17);
                if (!sub_aefce4(v18->field_8, "IPv4"))
                {
                    v19 = v16;
                    v28 = 1;
                    v21 = 4;
                    v22 = "0123456789.";
                    goto LABEL_ae0b68;
                }
                if (!sub_aefce4(v18->field_8, "IPv6"))
                {
                    v19 = v16;
                    v28 = 2;
                    v21 = 16;
                    v22 = "0123456789.:abcdefABCDEF";
LABEL_ae0b68:
                    v26 = sub_a6d9b4(v18->field_10, "crypto/x509/v3_addr.c", 985);
                    v27 = 0;
                    if (!v26)
                        goto LABEL_ae0e74;
                    goto LABEL_ae0c28;
                }
                if (sub_aefce4(v18->field_8, "IPv4-SAFI"))
                {
                    if (sub_aefce4(v18->field_8, "IPv6-SAFI"))
                    {
                        sub_a368c8();
                        sub_a369bc("crypto/x509/v3_addr.c", 950, "v2i_IPAddrBlocks");
                        v0 = v18->field_8;
                        sub_a36abc(0x22, 115, "%s");
                        v26 = 0;
                        goto LABEL_ae1168;
                    }
                    v19 = v16;
                    v20 = 2;
                    v21 = 16;
                    v22 = "0123456789.:abcdefABCDEF";
                    v23 = v18->field_10;
                    if (!v23)
                        goto LABEL_ae0eec;
                }
                else
                {
                    v19 = v16;
                    v20 = 1;
                    v21 = 4;
                    v22 = "0123456789.";
                    v23 = v18->field_10;
                    if (!v23)
                    {
LABEL_ae0eec:
                        sub_a368c8(v23);
                        sub_a369bc("crypto/x509/v3_addr.c", 972, "v2i_IPAddrBlocks");
                        sub_a36abc(0x22, 124, 0);
LABEL_ae0f18:
                        v26 = 0;
                        v16 = v19;
                        goto LABEL_ae1168;
                    }
                }
                v8 = _strtoul(v23, &v9, 0);
                v9 = (char *)v9 + _strspn(v9, " \t");
                if (0xff >= v8 && !(v9 = (char *)v9 + 1, *(char *)v9 != 58))
                {
                    v9 += _strspn(v9, " \t");
                    v26 = sub_a6d9b4(v9, "crypto/x509/v3_addr.c", 983);
                    v27 = &v8;
                    v28 = v20;
                    if (!v26)
                    {
LABEL_ae0e74:
                        v16 = v19;
                        goto LABEL_ae1168;
                    }
LABEL_ae0c28:
                    v7 = v27;
                    if (_strcmp(v26, "inherit"))
                    {
                        v4 = v18;
                        v29 = _strspn(v26, v22);
                        v30 = (char *)v26 + (int)v29;
                        v31 = _strspn(v30, " \t") + v29;
                        v32 = (st_ae09ac_0 *)*((char *)v26 + v31);
                        *(char *)&v30->field_0 = 0;
                        v6 = v26;
                        if (sub_af0158(&v11, v26) != v21)
                        {
                            sub_a368c8();
                            v45 = 1011;
                            goto LABEL_ae1098;
                        }
                        switch (v32)
                        {
                        case 0:
                            v16 = v5;
                            if (!sub_adf9c0(v16, v28, v7, &v11, v21 * 8))
                            {
                                sub_a368c8();
                                v47 = 1057;
                                goto LABEL_ae114c;
                            }
                            break;
                        case 45:
                            v33 = v31 + 1;
                            v26 = v6;
                            v37 = v33 + _strspn((char *)v26 + v33, " \t");
                            v38 = (char *)v26 + (int)v37;
                            v39 = _strspn(v38, v22);
                            if (!(unsigned int)v39 || *((char *)v26 + v37 + v39))
                            {
                                sub_a368c8();
                                sub_a369bc("crypto/x509/v3_addr.c", 1036, "v2i_IPAddrBlocks");
                                sub_a36abc(0x22, 116, 0);
                                v2 = ", value=";
                                v3 = v4->field_10;
                                v0 = "name=";
                                v1 = v4->field_8;
                                sub_a364a0(4);
                                v16 = v5;
                                goto LABEL_ae1168;
                            }
                            if (sub_af0158(&v10, v38) != v21)
                            {
                                sub_a368c8();
                                v45 = 1041;
LABEL_ae1098:
                                sub_a369bc("crypto/x509/v3_addr.c", v45, "v2i_IPAddrBlocks");
                                v46 = 166;
LABEL_ae10a4:
                                sub_a36abc(0x22, v46, 0);
                                v2 = ", value=";
                                v3 = v4->field_10;
                                v0 = "name=";
                                v1 = v4->field_8;
                                sub_a364a0(4);
                                v16 = v5;
                                goto LABEL_ae1164;
                            }
                            v16 = v5;
                            if (1 <= (int)_memcmp(&v11, &v10, v21))
                            {
                                sub_a368c8();
                                sub_a369bc("crypto/x509/v3_addr.c", 1046, "v2i_IPAddrBlocks");
                                sub_a36abc(0x22, 116, 0);
                                v2 = ", value=";
                                v3 = v4->field_10;
                                v0 = "name=";
                                v1 = v4->field_8;
                                sub_a364a0(4);
                                goto LABEL_ae1164;
                            }
                            if (!sub_adfbdc(v16, v28, v7, &v11, &v10))
                            {
                                sub_a368c8();
                                v47 = 1051;
LABEL_ae114c:
                                sub_a369bc("crypto/x509/v3_addr.c", v47, "v2i_IPAddrBlocks");
                                sub_a36abc(0x22, 0x80022, 0);
LABEL_ae1164:
                                v26 = v6;
                                goto LABEL_ae1168;
                            }
                            break;
                        case 47:
                            v34 = (char *)v6 + (int)v33;
                            v35 = _strtoul(v34, &v9, 10);
                            v36 = v5;
                            if (v9 == v34 || *(char *)v9 || v21 * 8 < v35)
                            {
                                sub_a368c8();
                                sub_a369bc("crypto/x509/v3_addr.c", 0x3ff, "v2i_IPAddrBlocks");
                                sub_a36abc(0x22, 116, 0);
                                v2 = ", value=";
                                v3 = v4->field_10;
                                v0 = "name=";
                                v1 = v4->field_8;
                                sub_a364a0(4);
                                v26 = v6;
                                v16 = v36;
                                goto LABEL_ae1168;
                            }
                            v16 = v36;
                            if (!sub_adf9c0(v36, v28, v7, &v11))
                            {
                                sub_a368c8();
                                v47 = 0x404;
                                goto LABEL_ae114c;
                            }
                            break;
                        default:
                            sub_a368c8();
                            sub_a369bc("crypto/x509/v3_addr.c", 1062, "v2i_IPAddrBlocks");
                            v46 = 116;
                            goto LABEL_ae10a4;
                        }
                        v26 = v6;
                        continue;
                    }
                    else
                    {
                        v16 = v19;
                        v40 = sub_adf884(v19, v28, v7);
                        if (!v40 || (v41 = v40, v42 = v40->field_8, !v42))
                        {
LABEL_ae0e20:
                            sub_a368c8();
                            sub_a369bc("crypto/x509/v3_addr.c", 996, "v2i_IPAddrBlocks");
                            sub_a36abc(0x22, 165, 0);
                            v2 = ", value=";
                            v3 = v18->field_10;
                            v0 = "name=";
                            v1 = v18->field_8;
                            sub_a364a0(4);
                            goto LABEL_ae1168;
                        }
                        v43 = v42->field_8;
                        if ((int)v42->field_0)
                        {
                            if ((int)v42->field_0 == 1)
                            {
                                if (v43)
                                    goto LABEL_ae0e20;
                            }
                            else
                            {
                                if (v43)
                                    goto LABEL_ae0df8;
                            }
                        }
                        else
                        {
                            if (v43)
                                goto LABEL_ae0dfc;
                        }
                        v44 = sub_9cf1a8();
                        v41->field_8->field_8 = v44;
                        if (!v44)
                            goto LABEL_ae0e20;
                        v42 = v41->field_8;
LABEL_ae0df8:
                        *(unsigned int *)&v42->field_0 = 0;
LABEL_ae0dfc:
                    }
                }
                else
                {
                    sub_a368c8();
                    sub_a369bc("crypto/x509/v3_addr.c", 978, "v2i_IPAddrBlocks");
                    sub_a36abc(0x22, 164, 0);
                    v2 = ", value=";
                    v3 = v18->field_10;
                    v0 = "name=";
                    v1 = v18->field_8;
                    sub_a364a0(4);
                    goto LABEL_ae0f18;
                }
            } while ((sub_a6c2e4(v26, "crypto/x509/v3_addr.c"), v17 = (unsigned int)v17 + 1, (int)sub_ad69e4(v15) > (int)(unsigned int)v17));
        }
        if (!sub_ae0684(v16))
        {
            v26 = 0;
LABEL_ae1168:
            sub_a6c2e4(v26, "crypto/x509/v3_addr.c", 1079);
            sub_ad6958(v16, &g_adf878);
            v16 = 0;
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("crypto/x509/v3_addr.c", 928, "v2i_IPAddrBlocks");
        sub_a36abc(0x22, 0x8000f, 0);
    }
    if (*(long long *)&g_10002b0 == v12)
        return v16;
    ___stack_chk_fail();
}
