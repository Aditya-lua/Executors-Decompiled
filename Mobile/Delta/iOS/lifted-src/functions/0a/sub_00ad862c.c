/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xad862c..0xad9168 (2876 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_ad862c_2 {
    unsigned int field_0;
    char padding_4[4];
    void* field_8;
} st_ad862c_2;

typedef struct st_ad862c_3 {
    unsigned int field_0;
    unsigned int field_4;
    unsigned int field_8;
    unsigned int field_c;
} st_ad862c_3;

extern unsigned long long g_ad77bc;
extern unsigned long long g_ad7838;
extern char g_c7c2eb;
extern st_ad862c_3 g_df9bb0;
extern uint128_t g_eb45a8;
extern uint128_t g_eb45b8;
extern uint128_t g_eb45c8;
extern uint128_t g_eb45d8;
extern uint128_t g_eb45e8;
extern char g_10002b0;

unsigned int sub_ad862c(long long a0, st_ad862c_2 *a1)
{
    void* v24;  // x27
    unsigned int v25;  // x20
    unsigned int v34;  // w8
    unsigned int v35;  // x23
    unsigned int v36;  // w26
    unsigned int v37;  // w26
    unsigned int v38;  // x0
    unsigned int v40;  // x24
    unsigned int v41;  // x25
    unsigned int v42;  // x23
    unsigned int v43;  // w8
    long long v26;  // x21
    long long v47;  // x24
    unsigned int v48;  // w23
    unsigned long long *v49;  // x8
    unsigned int v50;  // x0
    long long v51;  // x24
    unsigned int v52;  // x0
    unsigned int v53;  // x0
    long long v27;  // x22
    unsigned int v55;  // w8
    unsigned int v56;  // w0
    unsigned int v57;  // x0
    unsigned int v59;  // x0
    unsigned int v60;  // x23
    unsigned int v61;  // x0
    unsigned int v63;  // x0
    unsigned int v28;  // x0
    long long v64;  // x22
    unsigned int v65;  // x2
    long long v66;  // x1
    unsigned int v67;  // x28
    unsigned int v68;  // x23
    unsigned int v69;  // x25
    unsigned int v70;  // x26
    unsigned int v71;  // x24
    unsigned int v72;  // w0
    char *v73;  // x21
    unsigned int v29;  // x0
    unsigned int v74;  // x2
    unsigned int v30;  // x0
    unsigned int v31;  // x23
    unsigned int v32;  // x24
    unsigned int v33;  // x0
    char *v0;  // [bp-0x560], Other Possible Types: unsigned long long
    char *v1;  // [bp-0x558]
    unsigned int v2;  // [bp-0x550]
    unsigned int v3;  // [bp-0x540]
    unsigned int v4;  // [bp-0x530]
    unsigned int v5;  // [bp-0x520]
    unsigned int v6;  // [bp-0x510]
    unsigned int v7;  // [bp-0x4f4]
    unsigned int v8;  // [bp-0x4f0]
    unsigned int v9;  // [bp-0x4e8]
    unsigned int v10;  // [bp-0x4e0]
    unsigned int v11;  // [bp-0x4d8]
    uint128_t v12;  // [bp-0x4d0], Other Possible Types: unsigned int
    uint128_t v13;  // [bp-0x4c0]
    uint128_t v14;  // [bp-0x4b0]
    uint128_t v15;  // [bp-0x4a0]
    uint128_t v16;  // [bp-0x490]
    unsigned int v17;  // [bp-0x478], Other Possible Types: unsigned long long
    char v18;  // [bp-0x478]
    unsigned int v19;  // [bp-0x470]
    unsigned int v20;  // [bp-0x468]
    unsigned long v21;  // [bp-0x70]
    char *v22;  // [bp-0x10]
    char v23;  // [bp+0x0]

    v22 = &v23;
    v21 = *(long long *)&g_10002b0;
    v24 = a1->field_8;
    v25 = sub_ad7e54((long long)v24[8]);
    v26 = sub_a7a42c(v25);
    v27 = (long long)v24[48];
    v5 = 0;
    v6 = 0;
    v3 = 0;
    v4 = 0;
    v2 = 0;
    if ((!sub_a6fbc4(a0, "type") || (v28 = sub_a6fc2c(), v28)) && (!sub_a6fbc4(a0, "data-type") || (v28 = sub_a71bcc(), v28)))
    {
        v29 = sub_a6fbc4(a0, "data");
        if ((!v29 || sub_a71cdc() || (v28 = sub_a71bcc(v29, &v4), v28)) && (!sub_a6fbc4(a0, "data-structure") || (v28 = sub_a71bcc(), v28)) && (!sub_a6fbc4(a0, "input-type") || (v28 = sub_a71bcc(), v28)) && (!sub_a6fbc4(a0, "reference") || (v28 = sub_a71cdc(), v28)) && (!sub_a6fbc4(a0, "desc") || !(v28 = sub_a71bcc(), !v28)))
        {
            sub_a36c8c();
            if (!*(long long *)&a1->field_0 && v2 == 1)
            {
                v30 = v4;
                if (v30)
                {
                    v31 = sub_a6d9b4(v30, "crypto/store/store_result.c", 181);
                    if (!v31)
                    {
                        v32 = 0;
                    }
                    else if (*(unsigned long long *)((void*)&v6 + 8))
                    {
                        v32 = sub_a6d9b4(*(unsigned long long *)((void*)&v6 + 8), "crypto/store/store_result.c", 183);
                        if (v32)
                            goto LABEL_ad880c;
                    }
                    else
                    {
                        v32 = 0;
LABEL_ad880c:
                        v33 = sub_ad76e4(v31);
                        *(unsigned long long *)&a1->field_0 = v33;
                        if (v33)
                        {
                            sub_ad7760();
                            goto LABEL_ad8824;
                        }
                    }
                    sub_a6c2e4(v31, "crypto/store/store_result.c", 185);
                    v30 = sub_a6c2e4(v32, "crypto/store/store_result.c", 186);
                }
            }
            else
            {
LABEL_ad8824:
                v30 = sub_a36c8c(sub_a36cd4());
                if (*(long long *)&a1->field_0)
                {
LABEL_ad8834:
                    sub_a36c8c(sub_a36cd4());
                    if (*(long long *)&a1->field_0 || !(v55 = v2, v2 == 3 || !v2))
                    {
LABEL_ad8844:
                        sub_a36c8c(sub_a36cd4());
                        if (!*(long long *)&a1->field_0 && (v2 | 4) == 4)
                        {
                            v59 = sub_af999c(0, &v4 + 2, v5);
                            if (v59)
                            {
                                v60 = v59;
                                v2 = 4;
                                if (sub_af99b4())
                                {
                                    v61 = sub_ad79ac(v60);
                                    *(unsigned long long *)&a1->field_0 = v61;
                                    goto LABEL_ad8d44;
                                }
                                else
                                {
                                    sub_af99a8(v60);
                                }
                            }
                            v60 = 0;
                            v61 = *(long long *)&a1->field_0;
LABEL_ad8d44:
                            if (!v61)
                                sub_af99a8(v60);
                        }
                        sub_a36c8c(sub_a36cd4());
                        if (!*(long long *)&a1->field_0 && !v2)
                        {
                            v63 = sub_aa02fc(0, &v4 + 2, v5);
                            if (v63)
                            {
                                v64 = v63;
                                v9 = 0;
                                v10 = 0;
                                v8 = 0;
                                v2 = 0xffffffff;
                                if (!sub_aa14f8() || sub_aa1c50(v64, 0, 0))
                                {
                                    goto LABEL_ad88b8;
                                }
                                else
                                {
                                    if (sub_aa1c50(v64, &g_c7c2eb, 0))
                                        goto LABEL_ad88b8;
                                    v14 = g_eb45c8;
                                    v15 = g_eb45d8;
                                    v16 = g_eb45e8;
                                    v12 = g_eb45a8;
                                    v13 = g_eb45b8;
                                    if (!sub_a76f7c(&v18, 0x400, &v11, &v12, 0, v24 + 72))
                                    {
                                        sub_a368c8();
                                        sub_a369bc("crypto/store/store_result.c", 592, "try_pkcs12");
                                        v66 = 114;
                                        v65 = 0;
                                        goto LABEL_ad9158;
                                    }
                                    (&v18)[v11] = 0;
                                    if (sub_aa1c50(v64, &v18, v11))
                                    {
LABEL_ad88b8:
                                        if (sub_aa0f38(v64))
                                        {
                                            v68 = sub_ad61b4();
                                            if (!v68)
                                            {
                                                v69 = 0;
                                                v70 = 0;
                                                v71 = 0;
                                                v67 = 0;
                                            }
                                            else if (!v10 || !(v69 = sub_ad78b4(v10), !v69 || (v10 = 0, !sub_ad68a0(v68, v69))))
                                            {
                                                if (!v9 || (v70 = sub_ad7930(v9), v70 && !(v9 = 0, !sub_ad68a0(v68, v70))))
                                                {
                                                    do
                                                    {
                                                        v72 = sub_ad69e4(v8);
                                                        v67 = (int)v72 > 0;
                                                        if ((int)v72 < 1)
                                                        {
                                                            v69 = 0;
                                                            v70 = 0;
                                                            v71 = 0;
                                                            goto LABEL_ad8e0c;
                                                        }
                                                        v71 = sub_ad7930(sub_ad69f8(v8, 0), 0);
                                                    } while (v71 && sub_ad68b8(v8) && sub_ad68a0(v68, v71));
                                                    v69 = 0;
                                                    v70 = 0;
                                                }
                                                else
                                                {
                                                    v69 = 0;
LABEL_ad8e04:
                                                    v71 = 0;
                                                    v67 = 1;
                                                }
                                            }
                                            else
                                            {
                                                v70 = 0;
                                                goto LABEL_ad8e04;
                                            }
LABEL_ad8e0c:
                                            sub_a5a4c8(v10);
                                            sub_afc404(v9);
                                            sub_aded90(v8);
                                            sub_ad753c(v69);
                                            sub_ad753c(v70);
                                            sub_ad753c(v71);
                                            if (v67)
                                            {
                                                sub_ad6958(v68, sub_ad753c);
                                                v68 = 0;
                                            }
                                            *(unsigned long long *)&v24[64] = v68;
                                        }
                                        else
                                        {
                                            v67 = 1;
                                        }
                                    }
                                    else
                                    {
                                        sub_a368c8();
                                        sub_a369bc("crypto/store/store_result.c", 602, "try_pkcs12");
                                        if (!v11)
                                            v65 = (unsigned int)"empty password";
                                        else
                                            v65 = (unsigned int)"maybe wrong password";
                                        v66 = 113;
LABEL_ad9158:
                                        sub_a36abc(44, v66, v65);
                                        v67 = 1;
                                    }
                                }
                                sub_a66ec0(&v18, 1025);
                                sub_aa0308(v64);
                                v30 = sub_ad68b8((long long)v24[64]);
                                *(unsigned long long *)&a1->field_0 = v30;
                                if (!(v67 & 1))
                                    goto LABEL_ad8e7c;
                            }
                            else
                            {
                                *(unsigned long long *)&a1->field_0 = sub_ad68b8((long long)v24[64]);
                                goto LABEL_ad8e7c;
                            }
                        }
                        else
                        {
LABEL_ad8e7c:
                            sub_a36cd4();
                            if (!*(long long *)&a1->field_0)
                            {
                                if (!sub_a7a374(v26, "default"))
                                    v73 = ":maybe need to load the default provider?";
                                else
                                    v73 = &g_c7c2eb;
                                if (v25)
                                {
                                    sub_a368c8();
                                    sub_a369bc("crypto/store/store_result.c", 160, "ossl_store_handle_load_result");
                                    v0 = sub_a77644(v25);
                                    v1 = v73;
                                    v74 = (unsigned int)"provider=%s%s";
                                    goto LABEL_ad8f18;
                                }
                                else
                                {
                                    sub_a368c8();
                                    if (*v73)
                                    {
                                        sub_a369bc("crypto/store/store_result.c", 163, "ossl_store_handle_load_result");
                                        v0 = v73;
                                        v74 = (unsigned int)"%s";
LABEL_ad8f18:
                                    }
                                    else
                                    {
                                        sub_a369bc("crypto/store/store_result.c", 165, "ossl_store_handle_load_result");
                                        v74 = 0;
                                    }
                                }
                                sub_a36abc(44, 0x8010c, v74);
                            }
                            if (*(long long *)&g_10002b0 == v21)
                                return *(long long *)&a1->field_0 != 0;
                            ___stack_chk_fail();
                        }
                    }
                    else
                    {
                        v30 = sub_afc484(v26, v27);
                        v17 = v30;
                        if (v30)
                        {
                            if (*(unsigned long long *)((void*)&v2 + 8))
                            {
                                v56 = sub_a6e200(*(unsigned long long *)((void*)&v2 + 8), "TRUSTED CERTIFICATE");
                                if (sub_afc51c(&v17, &v4 + 2, v5))
                                    goto LABEL_ad8d0c;
                            }
                            else if (sub_afc51c(&v17, &v4 + 2, v5) || sub_afc3ec(&v17, &v4 + 2, v5))
                            {
LABEL_ad8d0c:
                                if (!v17 || (v2 = 3, v57 = sub_ad7930(v17), *(unsigned long long *)&a1->field_0 = v57, v57))
                                    goto LABEL_ad8844;
                            }
                            sub_afc404(v17);
                            goto LABEL_ad8844;
                        }
                    }
                }
                else
                {
                    switch (v34)
                    {
                    case 0:
LABEL_ad8ab0:
                        v41 = *(unsigned long long *)((void*)&v4 + 8);
                        if (v41)
                        {
                            v17 = 0;
                            v42 = v5;
                            v11 = v42;
                            v12 = v41;
                            v43 = (int)v24[40];
                            if (4 >= v43 && 29 >> ((char)v43 & 31) & 1)
                            {
                                v47 = sub_a2e274(&v17, v3, *(unsigned long long *)((void*)&v3 + 8), *(unsigned long long *)((void*)&v2 + 8), (&g_df9bb0.field_0)[v43], v26, v27);
                                sub_a2de78(v47, sub_a775f8, v24 + 72, *(unsigned long long *)((void*)&v2 + 8), (&g_df9bb0.field_0)[v43], v26, v27);
                                sub_a2c518(v47, &v12, &v11);
                                v48 = sub_a2ca7c(v47);
                                sub_a2d974(v47);
                                v40 = v17;
                                if (!v40 && !v48)
                                {
                                    v43 = (int)v24[40];
                                    v41 = *(unsigned long long *)((void*)&v4 + 8);
                                    v42 = v5;
                                    goto LABEL_ad8b4c;
                                }
                                if (v40)
                                    goto LABEL_ad8f84;
                                goto LABEL_ad9094;
                            }
LABEL_ad8b4c:
                            if (v43 == 3 || !v43)
                            {
                                v12 = v41;
                                if (sub_afb6e0(0, &v12, v42, v26, v27))
                                {
                                    v2 = 2;
                                    g_ad7838();
                                }
                                v43 = (int)v24[40];
                            }
                            if ((v43 | 4) == 4)
                            {
                                v11 = 0;
                                v12 = v41;
                                v50 = sub_9d043c(0, &v12, v42);
                                if (v50)
                                {
                                    v51 = v50;
                                    v10 = 0;
                                    if (sub_a775f8(&v17, 0x400, &v10, 0, v24 + 72))
                                    {
                                        v8 = 0;
                                        v9 = 0;
                                        v7 = 0;
                                        sub_9d0460(v51, &v9, &v8);
                                        sub_aa09a4(v9, &v17, v10, *(long long *)(v8 + 8), *(int *)v8, &v11, &v7, 0);
                                        v42 = v7;
                                        v41 = v11;
                                    }
                                    else
                                    {
                                        sub_a368c8();
                                        sub_a369bc("crypto/store/store_result.c", 356, "try_key_value_legacy");
                                        sub_a36abc(44, 115, 0);
                                    }
                                    sub_9d0454(v51);
                                }
                                if (v41 && !(v12 = v41, v52 = sub_9ca7fc(0, &v12, v42), !v52))
                                {
                                    v53 = sub_a51618();
                                    sub_9ca820(v52);
                                    sub_a6c2e4(v11, "crypto/store/store_result.c", 395);
                                    v48 = 0;
                                    if (v53)
                                    {
                                        v2 = 2;
                                        sub_ad78b4();
                                    }
                                    goto LABEL_ad9094;
                                }
                                else
                                {
                                    sub_a6c2e4(v11, "crypto/store/store_result.c", 395);
                                }
                            }
                        }
                        v48 = 0;
LABEL_ad9094:
                        v30 = *(long long *)&a1->field_0;
                        if (!*(long long *)&a1->field_0)
                            v30 = sub_a5a4c8(0);
                        if (!v48)
                            goto LABEL_ad8834;
                        break;
                    case 2:
                        if (!*(unsigned long long *)((void*)&v5 + 8))
                            goto LABEL_ad8ab0;
                        if (*(unsigned long long *)((void*)&v2 + 8))
                        {
                            v35 = sub_a55808(v26);
                            sub_a36c8c(v35);
                            if (v35)
                            {
                                v36 = 2;
                                do
                                {
                                    v37 = v36 - 1;
                                    if ((int)v36 < 1)
                                        goto LABEL_ad8d54;
                                    if (sub_975ff4(v35) == v25)
                                    {
                                        v38 = sub_a55b54(v35, *(unsigned long long *)((void*)&v5 + 8), v6);
                                        v37 = 0;
                                    }
                                    else
                                    {
                                        v17 = v35;
                                        v19 = 0;
                                        v20 = 135;
                                        if (*(long long *)((long long)v24[8] + 192))
                                            (*(long long *)((long long)v24[8] + 192))();
                                        v38 = 0;
                                        if (v37)
                                        {
                                            sub_a55830(v35);
                                            v35 = sub_a55240(v25, *(unsigned long long *)((void*)&v2 + 8), v27);
                                            if (!v35)
                                                goto LABEL_ad8d54;
                                            sub_a36c8c(sub_a36cd4());
                                            v38 = 0;
                                        }
                                    }
                                } while ((v36 = v37, !v38));
                                sub_a36cd4();
                                v40 = sub_a54918(v35, v38);
                                v30 = sub_a55830(v35);
                                if (v40)
                                {
LABEL_ad8f84:
                                    v2 = 2;
                                    if (sub_a54c94(v40, 1))
                                        sub_ad78b4();
                                    v49 = &g_ad7838;
                                    if (!sub_a54c94(v40, 2))
                                        v49 = &g_ad77bc;
                                    v49();
                                }
                            }
                            else
                            {
LABEL_ad8d54:
                                sub_a36e70();
                                v30 = sub_a55830(v35);
                                break;
                            }
                        }
                        break;
                    default:
                        goto LABEL_ad8834;
                    }
                }
            }
            sub_a36e70(v30);
            if (*(long long *)&g_10002b0 == v21)
                return 0;
            ___stack_chk_fail();
        }
    }
    if (*(long long *)&g_10002b0 == v21)
        return v28;
    ___stack_chk_fail();
}
