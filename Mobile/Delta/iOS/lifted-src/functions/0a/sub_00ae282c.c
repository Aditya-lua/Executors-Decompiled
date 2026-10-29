/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xae282c..0xae2db4 (1416 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ae282c_0 {
    char padding_0[8];
    unsigned long long field_8;
} st_ae282c_0;


unsigned int sub_ae282c(unsigned long a0, unsigned long long a1, long long a2)
{
    unsigned long long v6;  // x0
    unsigned int v7;  // w22
    unsigned int v16;  // w0
    unsigned int v17;  // w8
    unsigned long v18;  // cc_op
    unsigned long v19;  // cc_dep1
    unsigned long v20;  // cc_dep2
    unsigned long v21;  // cc_ndep
    unsigned long long v22;  // 4112
    unsigned long long v23;  // 4102
    unsigned int index;  // x25
    unsigned long long v24;  // 4112
    unsigned long long v25;  // 4102
    long long v26;  // x2
    long long v27;  // x1
    unsigned int v9;  // w27
    unsigned long long v28;  // x0
    unsigned int v29;  // x20
    unsigned int v10;  // x26
    unsigned int idx;  // x23
    unsigned int v31;  // x22
    unsigned int v32;  // x21
    unsigned int v33;  // w19
    unsigned long long v34;  // x0
    unsigned int v35;  // w8
    unsigned int v11;  // x24
    unsigned int v36;  // x24
    unsigned int v37;  // x21
    unsigned int v38;  // x0
    st_ae282c_0 *v12;  // x23
    unsigned int v13;  // x28
    unsigned long v14;  // x21
    unsigned int v15;  // w0
    unsigned long v0;  // [bp-0x90]
    unsigned int v1;  // [bp-0x88]
    unsigned long long v2;  // [bp-0x78]
    unsigned int v3;  // [bp-0x68]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v6 = sub_ad69e4(a2);
    v7 = v6;
    index = sub_ae262c(v6);
    if (!index)
    {
        v29 = 0;
        goto LABEL_ae28a0;
    }
    if (v7 == 1)
    {
        if (!_strcmp(*(long long *)(sub_ad69f8(a2, 0) + 8), "none"))
            return index;
LABEL_ae28b4:
        v2 = a1;
        v9 = 0;
        v10 = 0;
        v11 = 0;
        do
        {
            v12 = sub_ad69f8(a2, v11);
            v13 = (unsigned int)v12[1].padding_0;
            if (v13 && _strcmp(v13, "always"))
            {
                sub_a368c8();
                sub_a369bc("crypto/x509/v3_akid.c", 123, "v2i_AUTHORITY_KEYID");
                v0 = v12->field_8;
                v1 = (unsigned int)v12[1].padding_0;
                v26 = "name=%s option=%s";
                v27 = 120;
                goto LABEL_ae2b70;
            }
            v14 = v12->field_8;
            v15 = _strcmp(v14, "keyid");
            if (!v15 && !v9)
            {
                if (!v13)
                {
                    v9 = 1;
                    goto LABEL_ae28dc;
                }
                else
                {
                    v9 = 2;
                    goto LABEL_ae28dc;
                }
            }
            v16 = _strcmp(v14, "issuer");
            v17 = v10;
            if (!v16)
            {
                v22 = arm64g_calculate_condition(v18, v19, v20, v21);
                v23 = arm64g_calculate_condition(19, (v22 & 1 ? v17 : 0), 0, 0);
                if (v23 & 1)
                    goto LABEL_ae2ae4;
            }
            else
            {
                v24 = arm64g_calculate_condition(v18, v19, v20, v21);
                v25 = arm64g_calculate_condition(16, (v24 & 1 ? v17 : 0), 0, 0);
                if (v25 & 1)
                {
LABEL_ae2ae4:
                    v28 = _strcmp(v14, "none");
                    sub_a368c8(v28, "none");
                    if (v16 && v15 && (unsigned int)v28)
                    {
                        sub_a369bc("crypto/x509/v3_akid.c", 142, "v2i_AUTHORITY_KEYID");
                        v0 = v12->field_8;
                        v26 = "name=%s";
                        v27 = 172;
                    }
                    else
                    {
                        sub_a369bc("crypto/x509/v3_akid.c", 138, "v2i_AUTHORITY_KEYID");
                        v0 = v12->field_8;
                        v26 = "name=%s";
                        v27 = 171;
                    }
LABEL_ae2b70:
                    sub_a36abc(0x22, v27, v26);
                    v29 = 0;
                    goto LABEL_ae2b80;
                }
            }
            if (!v13)
                v10 = 1;
            else
                v10 = 2;
LABEL_ae28dc:
        } while ((v11 += 1, v7 != v11));
    }
    else
    {
        if ((int)v7 >= 1)
            goto LABEL_ae28b4;
        v2 = a1;
        v10 = 0;
        v9 = 0;
    }
    idx = v2;
    if (!idx)
    {
        sub_a368c8();
        sub_a369bc("crypto/x509/v3_akid.c", 152, "v2i_AUTHORITY_KEYID");
        sub_a36abc(0x22, 0xc0102, 0);
        v29 = 0;
        v31 = 0;
        goto LABEL_ae2b88;
    }
    if (*(char *)idx & 1)
        return index;
    v31 = *(long long *)(idx + 8);
    if (!v31)
    {
        sub_a368c8();
        sub_a369bc("crypto/x509/v3_akid.c", 156, "v2i_AUTHORITY_KEYID");
        sub_a36abc(0x22, 121, 0);
        v29 = 0;
        goto LABEL_ae2b84;
    }
    v32 = *(long long *)(idx + 16);
    v33 = v32 == v31;
    sub_a36c8c();
    if (*(long long *)(idx + 56))
        v33 = sub_af1ea4(*(long long *)(idx + 16)) != 0;
    sub_a36cd4();
    if (v9 != 2 && (v9 != 1 || v33 & 1))
    {
        v29 = 0;
    }
    else
    {
        v34 = sub_af26f0(v31, 82, 0xffffffff);
        if (!(v34 >> 31 & 1) && sub_af26f8(v31, v34) && (v32 != v31 || v33 & 1))
        {
            v29 = sub_ae8248();
            if (!v29)
            {
LABEL_ae2b80:
                v31 = 0;
LABEL_ae2b84:
                idx = 0;
                v37 = 0;
LABEL_ae2b88:
                goto LABEL_ae2b8c;
            }
            if (!sub_9c7b68(v29))
            {
                sub_9cf0f4(v29);
                goto LABEL_ae2c70;
            }
        }
        else
        {
LABEL_ae2c70:
            if (v32 != v31 || !*(long long *)(idx + 56))
            {
                v29 = 0;
            }
            else
            {
                v3 = 0;
                if (sub_afb1e4(&v3))
                    v29 = sub_aed2c0(v3);
                else
                    v29 = 0;
                sub_afb050(v3);
            }
            if (v9 == 2)
            {
                index = index;
                if (v29)
                {
LABEL_ae2a08:
                    v35 = v10;
                    if (v35 != 2)
                    {
                        if (v35 != 1 & 1 | v33 & 1)
                        {
                            *(unsigned long long *)(index + 8) = 0;
                            *(unsigned long long *)(index + 16) = 0;
                            *(unsigned long long *)index = v29;
                            return index;
                        }
                        else if (v29)
                        {
                            *(unsigned long long *)(index + 8) = 0;
                            *(unsigned long long *)(index + 16) = 0;
                            *(unsigned long long *)index = v29;
                            return index;
                        }
                    }
                    v37 = sub_afa39c(sub_97725c(v31));
                    idx = sub_9c0ff8(sub_12738(v31));
                    if (v37 && idx)
                    {
                        v36 = sub_ad61b4();
                        if (v36 && !(v38 = sub_ae75a4(), !v38))
                        {
                            v31 = v38;
                            if (sub_ad68a0(v36, v31))
                            {
                                *(unsigned int *)v31 = 4;
                                *(unsigned long long *)(v31 + 8) = v37;
                                *(unsigned long long *)(index + 8) = v36;
                                *(unsigned long long *)(index + 16) = idx;
                                *(unsigned long long *)index = v29;
                                return index;
                            }
                            sub_a368c8();
                            sub_a369bc("crypto/x509/v3_akid.c", 214, "v2i_AUTHORITY_KEYID");
                            sub_a36abc(0x22, 0x8000f, 0);
                        }
                        else
                        {
                            sub_a368c8();
                            sub_a369bc("crypto/x509/v3_akid.c", 210, "v2i_AUTHORITY_KEYID");
                            sub_a36abc(0x22, 0x8000d, 0);
                            v31 = 0;
                        }
                    }
                    else
                    {
                        sub_a368c8();
                        sub_a369bc("crypto/x509/v3_akid.c", 202, "v2i_AUTHORITY_KEYID");
                        sub_a36abc(0x22, 122, 0);
                        v31 = 0;
                    }
                }
                else
                {
                    sub_a368c8();
                    sub_a369bc("crypto/x509/v3_akid.c", 193, "v2i_AUTHORITY_KEYID");
                    sub_a36abc(0x22, 123, 0);
                    v37 = 0;
LABEL_ae28a0:
                    v31 = 0;
                    idx = 0;
                }
LABEL_ae2b8c:
                sub_ad6020();
                sub_ae75b0(v31);
                sub_afa390(v37);
                sub_9cf124(idx);
                sub_9cf0f4(v29);
                sub_ae2638(index);
            }
        }
    }
    goto LABEL_ae2a08;
}
