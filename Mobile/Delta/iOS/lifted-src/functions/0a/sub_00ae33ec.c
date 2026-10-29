/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xae33ec..0xae390c (1312 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ae33ec_0 {
    struct st_ae33ec_0 *field_0;
    struct st_ae33ec_0 *field_8;
} st_ae33ec_0;

typedef struct st_ae33ec_1 {
    char padding_0[8];
    unsigned long long field_8;
    struct st_ae33ec_0 *field_10;
} st_ae33ec_1;

extern long long g_eb5810;
extern long long g_eb5898;

st_ae33ec_0 * sub_ae33ec(unsigned long a0, unsigned long a1, long long a2)
{
    long long v9;  // x20
    st_ae33ec_0 *v10;  // x19
    unsigned long long v19;  // x0
    unsigned long v20;  // x23
    unsigned long long v21;  // x8
    unsigned long long v22;  // x26
    unsigned long v23;  // x25
    st_ae33ec_0 *v24;  // x0
    st_ae33ec_0 *v25;  // x26
    st_ae33ec_0 *v26;  // x24
    long long v27;  // x1
    long long v28;  // x1
    st_ae33ec_0 *v11;  // x21
    long long v29;  // x1
    st_ae33ec_1 *v12;  // x24
    st_ae33ec_0 *v13;  // w0
    st_ae33ec_0 *v14;  // w23
    st_ae33ec_0 *v15;  // x27
    unsigned long long v16;  // x23
    st_ae33ec_0 *v17;  // x0
    st_ae33ec_0 *v18;  // x0
    unsigned long long v0;  // [bp-0xa0]
    unsigned long v1;  // [bp-0x98]
    unsigned long long v2;  // [bp-0x90]
    st_ae33ec_0 *v3;  // [bp-0x88]
    st_ae33ec_0 *v4;  // [bp-0x78]
    st_ae33ec_0 *v5;  // [bp-0x6c]
    st_ae33ec_0 *v6;  // [bp-0x68]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v9 = a2;
    v6 = 0;
    v10 = sub_9cde20(&g_eb5898);
    if (!v10)
    {
        sub_a368c8();
        sub_a369bc("crypto/x509/v3_asid.c", 504, "v2i_ASIdentifiers");
        sub_a36abc(0x22, 0x80022, 0);
        return v10;
    }
    if ((int)sub_ad69e4(v9) >= 1)
    {
        v11 = 0;
        v4 = v10;
        while (1)
        {
            v12 = sub_ad69f8(v9, v11);
            v13 = (st_ae33ec_0 *)(unsigned int)sub_aefce4(v12->field_8, "AS");
            if (v13)
            {
                if (!sub_aefce4(v12->field_8, "RDI"))
                {
                    v14 = (st_ae33ec_0 *)1;
                    v15 = v12->field_10;
                    if (!v15)
                        goto LABEL_ae36c4;
                    goto LABEL_ae34dc;
                }
                else
                {
                    sub_a368c8();
                    sub_a369bc("crypto/x509/v3_asid.c", 520, "v2i_ASIdentifiers");
                    v28 = 115;
                    goto LABEL_ae3894;
                }
                goto LABEL_ae3894;
            }
            v14 = (st_ae33ec_0 *)0;
            v15 = v12->field_10;
            if (!v15)
            {
LABEL_ae36c4:
                sub_a368c8();
                sub_a369bc("crypto/x509/v3_asid.c", 526, "v2i_ASIdentifiers");
                v27 = 116;
                goto LABEL_ae36e8;
            }
LABEL_ae34dc:
            if (!_strcmp(v15, "inherit"))
            {
                v16 = ((v13 != 0) * 8 | (char)(v13 != 0) >> 61) & 0x7fffffff8 & 0x7ffffffff;
                if (*(long long *)((char *)v10 + v16))
                {
                    if (!*(int *)*(long long *)((char *)v10 + v16))
                        goto LABEL_ae3478;
                    goto LABEL_ae3870;
                }
                v17 = sub_9cde20(&g_eb5810);
                *(st_ae33ec_0 **)((char *)v10 + v16) = v17;
                if (!v17)
                    goto LABEL_ae3870;
                v18 = sub_9cf1a8();
                *(st_ae33ec_0 **)(*(long long *)((char *)v10 + v16) + 8) = v18;
                if (v18)
                {
                    *(unsigned int *)*(long long *)((char *)v10 + v16) = 0;
LABEL_ae3478:
                    v11 = (unsigned int)v11 + 1;
                    if ((int)sub_ad69e4(v9) <= (int)(unsigned int)v11)
                        goto LABEL_ae36a8;
                }
                else
                {
                    sub_9cd960(*(long long *)((char *)v10 + v16), &g_eb5810);
                    *(unsigned long long *)((char *)v10 + v16) = 0;
LABEL_ae3870:
                    sub_a368c8();
                    sub_a369bc("crypto/x509/v3_asid.c", 536, "v2i_ASIdentifiers");
                    v28 = 165;
LABEL_ae3894:
                    sub_a36abc(0x22, v28, 0);
                    v2 = ", value=";
                    v3 = v12->field_10;
                    v0 = "name=";
                    v1 = v12->field_8;
                    sub_a364a0(4);
                    break;
                }
            }
            else
            {
                v5 = v14;
                v19 = _strspn(v15, "0123456789");
                v20 = (int)v19;
                if (*((char *)v15 + v20))
                {
                    v21 = _strspn((char *)v15 + v20, " \t") + v19;
                    if (*((char *)v15 + v21) == 45)
                    {
                        v22 = _strspn((char *)v15 + ((long long)(v21 * 0x100000000 + 0x100000000) >> 32), " \t") + ((long long)(v21 * 0x100000000 + 0x100000000) >> 32);
                        v23 = (int)v22;
                        if (!*((char *)v15 + v22 + _strspn((char *)v15 + v23, "0123456789")))
                        {
                            v24 = sub_a6d9b4(v15, "crypto/x509/v3_asid.c", 574);
                            if (!v24)
                                goto LABEL_ae37c8;
                            *((char *)v24 + v20) = 0;
                            v25 = v24;
                            v6 = sub_aef470(0, v25);
                            v26 = sub_aef470(0, (char *)v25 + v23);
                            sub_a6c2e4(v25, "crypto/x509/v3_asid.c", 580);
                            if (v6 && v26)
                            {
                                if (1 > (int)sub_9c0ffc())
                                {
                                    v10 = v4;
                                    goto LABEL_ae3620;
                                }
                                else
                                {
                                    sub_a368c8();
                                    sub_a369bc("crypto/x509/v3_asid.c", 586, "v2i_ASIdentifiers");
                                    v29 = 116;
                                }
                            }
                            else
                            {
                                sub_a368c8(v6);
                                sub_a369bc("crypto/x509/v3_asid.c", 582, "v2i_ASIdentifiers");
                                v29 = 524322;
                            }
                            sub_a36abc(0x22, v29, 0);
                            v10 = v4;
                            goto LABEL_ae38c4;
                        }
                        else
                        {
                            sub_a368c8();
                            sub_a369bc("crypto/x509/v3_asid.c", 559, "v2i_ASIdentifiers");
                            sub_a36abc(0x22, 163, 0);
                            v2 = ", value=";
                            v3 = v12->field_10;
                            v0 = "name=";
                            v1 = v12->field_8;
                            sub_a364a0(4);
LABEL_ae37c8:
                            v26 = 0;
                            v10 = v4;
                            goto LABEL_ae38c4;
                        }
                    }
                    else
                    {
                        sub_a368c8();
                        sub_a369bc("crypto/x509/v3_asid.c", 551, "v2i_ASIdentifiers");
                        v28 = 162;
                        goto LABEL_ae3894;
                    }
                }
                else if (sub_aef870(v12, &v6))
                {
                    v26 = 0;
LABEL_ae3620:
                    if (sub_ae2df0(v10, v5, v6, v26))
                    {
                        v6 = 0;
                        goto LABEL_ae3478;
                    }
                    else
                    {
                        sub_a368c8();
                        sub_a369bc("crypto/x509/v3_asid.c", 591, "v2i_ASIdentifiers");
                        sub_a36abc(0x22, 0x80022, 0);
                        goto LABEL_ae38c4;
                    }
                }
                else
                {
                    sub_a368c8();
                    sub_a369bc("crypto/x509/v3_asid.c", 570, "v2i_ASIdentifiers");
                    v27 = 524322;
LABEL_ae36e8:
                    sub_a36abc(0x22, v27, 0);
                    break;
                }
                goto LABEL_ae3894;
            }
        }
    }
    else
    {
LABEL_ae36a8:
        if (sub_ae3058(v10->field_0) && sub_ae3058(v10->field_8))
            return v10;
    }
    v26 = 0;
LABEL_ae38c4:
    sub_9cd960(v10, &g_eb5898);
    sub_9cf124(v6);
    sub_9cf124(v26);
    return 0;
}
