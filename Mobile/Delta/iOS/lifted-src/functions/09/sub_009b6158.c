/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9b6158..0x9b6a84 (2348 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9b6158_3 {
    char padding_0[8];
    long long field_8;
} st_9b6158_3;

typedef struct st_9b6158_0 {
    void* field_0;
    unsigned long long field_8;
} st_9b6158_0;

typedef struct st_9b6158_6 {
    char padding_0[8];
    struct st_9b6158_7 *field_8;
    char padding_10[56];
    unsigned int field_48;
    char padding_4c[692];
    struct st_9b6158_2 *field_300;
    char padding_308[184];
    long long field_3c0;
    long long field_3c8;
    char padding_3d0[1200];
    struct st_9b6158_4 *field_880;
    char padding_888[120];
    struct st_9b6158_5 *field_900;
    char padding_908[112];
    struct st_9b6158_8 *field_978;
} st_9b6158_6;

typedef struct st_9b6158_2 {
    char padding_0[28];
    unsigned int field_1c;
} st_9b6158_2;

typedef struct st_9b6158_4 {
    char padding_0[32];
    struct st_9b6158_3 *field_20;
} st_9b6158_4;

typedef struct st_9b6158_1 {
    uint128_t field_0;
    uint128_t field_10;
    unsigned long long field_20;
} st_9b6158_1;

typedef struct st_9b6158_5 {
    char padding_0[680];
    unsigned long long field_2a8;
} st_9b6158_5;

typedef struct st_9b6158_8 {
    unsigned long long field_0;
} st_9b6158_8;

typedef struct st_9b6158_7 {
    long long field_0;
    char padding_8[1128];
    long long field_470;
} st_9b6158_7;

extern char g_10002b0;

unsigned long long sub_9b6158(st_9b6158_6 *a0, st_9b6158_0 *a1)
{
    unsigned long v12;  // x23
    unsigned long long v13;  // x8
    long long v22;  // x1
    unsigned long v23;  // x21
    unsigned long long *v24;  // x25
    st_9b6158_6 *v25;  // x24
    void* v26;  // x23
    unsigned long v27;  // x22
    unsigned long long v28;  // x8
    unsigned long v29;  // x10
    unsigned long long v30;  // x0
    unsigned long long v31;  // x20
    unsigned long v14;  // x10
    unsigned long long v32;  // x21
    st_9b6158_1 *v33;  // x25
    unsigned long long v34;  // w0
    long long v36;  // x1
    st_9b6158_6 *v37;  // x0
    long long v38;  // x1
    long long v39;  // x2
    unsigned long long v40;  // x8
    unsigned long v41;  // x9
    unsigned long long v15;  // x20
    void* v42;  // x22
    unsigned long long v43;  // x23
    unsigned long long v44;  // x21
    unsigned long long v45;  // x20
    long long v46;  // x2
    long long v47;  // x1
    long long v48;  // x2
    long long v49;  // x1
    st_9b6158_6 *v50;  // x0
    long long v51;  // x1
    void* v16;  // x21
    long long v52;  // x2
    unsigned long v53;  // x8
    void* v54;  // x22
    unsigned long v55;  // x23
    unsigned long long v56;  // 4114
    st_9b6158_6 *v57;  // x0
    long long v58;  // x1
    long long v59;  // x2
    unsigned long long v60;  // x0
    st_9b6158_6 *v17;  // x0
    long long v18;  // x1
    long long v19;  // x2
    unsigned long long v20;  // x0
    long long v21;  // x2
    uint128_t v0;  // [bp-0x298]
    uint128_t v1;  // [bp-0x288]
    unsigned long long v2;  // [bp-0x278]
    unsigned long v3;  // [bp-0x270]
    char v4;  // [bp-0x268]
    uint128_t v5;  // [bp-0x240]
    uint128_t v6;  // [bp-0x230]
    unsigned long long v7;  // [bp-0x220]
    uint128_t v8;  // [bp-0x218]
    unsigned long v9;  // [bp-0x68]
    char *v10;  // [bp-0x10]
    char v11;  // [bp+0x0]

    v10 = &v11;
    v9 = *(long long *)&g_10002b0;
    v12 = a0->field_300->field_1c;
    if (v12 & 456)
    {
        v13 = a1->field_8 - 2;
        if (a1->field_8 < 2 || (v14 = *(short *)a1->field_0, v15 = (unsigned int)((v14 & 0xff00) >> 8) | (unsigned int)v14 * 0x100 & 0xff00ff00, v15 > v13))
        {
            sub_a368c8();
            v21 = "tls_process_cke_psk_preamble";
            v22 = 2956;
            goto LABEL_9b64f4;
        }
        else
        {
            v16 = a1->field_0 + 2;
            a1->field_0 = v16 + v15;
            a1->field_8 = v13 - v15;
            if (v15 >= 0x101)
            {
                sub_a368c8();
                sub_a369bc("ssl/statem/statem_srvr.c", 2960, "tls_process_cke_psk_preamble");
                v17 = a0;
                v18 = 50;
                v19 = 146;
                goto LABEL_9b6504;
            }
            else if (a0->field_978)
            {
                sub_a6c2e4(a0->field_900->field_2a8, "include/internal/packet.h", 483);
                v20 = sub_a6da14(v16, v15, "include/internal/packet.h", 486);
                a0->field_900->field_2a8 = v20;
                if (v20)
                    a0->field_978();
                sub_a368c8();
                sub_a369bc("ssl/statem/statem_srvr.c", 2969, "tls_process_cke_psk_preamble");
                v17 = a0;
                v18 = 80;
                v19 = 786691;
                goto LABEL_9b6504;
            }
            else
            {
                sub_a368c8();
                sub_a369bc("ssl/statem/statem_srvr.c", 2964, "tls_process_cke_psk_preamble");
                v17 = a0;
                v18 = 80;
                v19 = 225;
                goto LABEL_9b6504;
            }
        }
        goto LABEL_9b6504;
    }
    if (!(v12 >> 3 & 1))
    {
        if (v12 & 65)
        {
            v23 = a0->field_880->field_20->field_8;
            if (!v23)
            {
                sub_a368c8();
                sub_a369bc("ssl/statem/statem_srvr.c", 3021, "tls_process_cke_rsa");
                v17 = a0;
                v18 = 80;
                v19 = 168;
                goto LABEL_9b6504;
            }
            v24 = a0->field_8;
            v25 = a0;
            if ((v25->field_48 | 0x200) == 0x300)
            {
                v26 = a1->field_0;
                v27 = a1->field_8;
                goto LABEL_9b638c;
            }
            v28 = a1->field_8 - 2;
            if (a1->field_8 < 2 || (v29 = *(short *)a1->field_0, v27 = (unsigned int)((v29 & 0xff00) >> 8) | (unsigned int)v29 * 0x100 & 0xff00ff00, v28 < v27 || (v26 = a1->field_0 + 2, a1->field_0 = v26 + v27, a1->field_8 = v28 - v27, v28 != v27)))
            {
                sub_a368c8();
                v21 = "tls_process_cke_rsa";
                v22 = 3031;
LABEL_9b64f4:
                sub_a369bc("ssl/statem/statem_srvr.c", v22, v21);
                v17 = a0;
                v18 = 50;
                v19 = 159;
                goto LABEL_9b6504;
            }
LABEL_9b638c:
            v3 = 48;
            v30 = sub_a6bf4c(48, "ssl/statem/statem_srvr.c", 3037);
            if (v30)
            {
                v31 = v30;
                v32 = sub_a5d5a8(*v24, v23, v24[142]);
                if (!v32)
                {
                    sub_a368c8();
                    sub_a369bc("ssl/statem/statem_srvr.c", 3045, "tls_process_cke_rsa");
                    v39 = 524294;
                    v37 = a0;
                    v38 = 80;
                    goto LABEL_9b69b8;
                }
                if ((int)sub_a37fa8(v32) < 1 || (int)sub_ab2224(v32, 7) <= 0)
                {
                    sub_a368c8();
                    v36 = 3062;
                    goto LABEL_9b69a8;
                }
                v33 = &v5;
                sub_a70404("tls-client-version", &a0[1].padding_4c[8]);
                if ((char)a0[1].padding_10[0x22] < 0)
                {
                    sub_a70404("tls-negotiated-version", &v25->field_48);
                    v5 = v0;
                    v6 = v1;
                    v7 = v2;
                    v33 = &v8;
                }
                sub_a71bbc();
                v33->field_0 = v0;
                v33->field_10 = v1;
                v33->field_20 = v2;
                if (!sub_a5db1c(v32, &v4) || (int)sub_a37fb4(v32, v31, &v3, v26, v27) <= 0)
                {
                    sub_a368c8();
                    v36 = 3079;
                    goto LABEL_9b69a8;
                }
                else if (v3 == 48)
                {
                    v34 = (unsigned int)sub_9568f8(a0, v31, 48, 0);
                    sub_a6c2e4(v31, "ssl/statem/statem_srvr.c", 3101);
                    sub_a5d6b0(v32);
                    if (v34)
                    {
                        if (*(long long *)&g_10002b0 == v9)
                            return 2;
                        ___stack_chk_fail();
                    }
                }
                else
                {
                    sub_a368c8(sub_a66ec0(v31, 48), 48);
                    v36 = 3089;
LABEL_9b69a8:
                    sub_a369bc("ssl/statem/statem_srvr.c", v36, "tls_process_cke_rsa");
                    v37 = a0;
                    v38 = 0x33;
                    v39 = 147;
LABEL_9b69b8:
                    sub_9a58a4(v37, v38, v39, 0);
                    sub_a6c2e4(v31, "ssl/statem/statem_srvr.c", 3101);
                    sub_a5d6b0(v32);
                }
            }
            else
            {
                sub_a368c8();
                sub_a369bc("ssl/statem/statem_srvr.c", 3039, "tls_process_cke_rsa");
                v17 = a0;
                v18 = 80;
                v19 = 524303;
                goto LABEL_9b6504;
            }
        }
        else
        {
            if (v12 & 258)
            {
                v40 = a1->field_8 - 2;
                if (a1->field_8 >= 2)
                {
                    v41 = *(short *)a1->field_0;
                    v42 = a1->field_0 + 2;
                    v43 = (unsigned int)((v41 & 0xff00) >> 8) | (unsigned int)v41 * 0x100 & 0xff00ff00;
                    a1->field_0 = v42;
                    a1->field_8 = v40;
                    if (v40 != v43)
                        goto LABEL_9b6648;
                    v44 = *(long long *)&a0->padding_308[0];
                    if (!v44)
                    {
                        sub_a368c8();
                        sub_a369bc("ssl/statem/statem_srvr.c", 3120, "tls_process_cke_dhe");
                        v50 = a0;
                        v51 = 80;
                    }
                    else if (v43)
                    {
                        a1->field_0 = v42 + v43;
                        a1->field_8 = 0;
                        v45 = sub_a5ba1c();
                        if (!v45 || !sub_a59d8c(v45, v44))
                        {
                            sub_a368c8();
                            v48 = "tls_process_cke_dhe";
                            v49 = 3135;
                            goto LABEL_9b6a08;
                        }
                        if (0 >= (int)sub_a5b680(v45, v42, v43))
                        {
                            sub_a368c8();
                            v46 = "tls_process_cke_dhe";
                            v47 = 3140;
                            goto LABEL_9b6a6c;
                        }
                        goto LABEL_9b66fc;
                    }
                    else
                    {
                        sub_a368c8();
                        sub_a369bc("ssl/statem/statem_srvr.c", 3125, "tls_process_cke_dhe");
                        v50 = a0;
                        v51 = 50;
                    }
                    v52 = 171;
                    goto LABEL_9b6670;
                }
                else
                {
LABEL_9b6648:
                    sub_a368c8();
                    sub_a369bc("ssl/statem/statem_srvr.c", 3115, "tls_process_cke_dhe");
                    v50 = a0;
                    v51 = 50;
                    v52 = 148;
                    goto LABEL_9b6670;
                }
            }
            if (v12 & 132)
            {
                if (a1->field_8)
                {
                    v44 = *(long long *)&a0->padding_308[0];
                    v53 = *(char *)a1->field_0;
                    v54 = a1->field_0 + 1;
                    v55 = a1->field_8 - 1;
                    a1->field_0 = v54;
                    a1->field_8 = v55;
                    if (v55 < v53 || (a1->field_0 = v54 + v53, a1->field_8 = v55 - v53, v56 = arm64g_calculate_condition(20, v55, v53, 0), v56 & 1))
                    {
                        sub_a368c8();
                        sub_a369bc("ssl/statem/statem_srvr.c", 3179, "tls_process_cke_ecdhe");
                        v50 = a0;
                        v51 = 50;
                        v52 = 159;
                        goto LABEL_9b6670;
                    }
                    if (v44)
                    {
                        v45 = sub_a5ba1c();
                        if (!v45 || (int)sub_a59d8c(v45, v44) <= 0)
                        {
                            sub_a368c8();
                            v48 = "tls_process_cke_ecdhe";
                            v49 = 3189;
LABEL_9b6a08:
                            sub_a369bc("ssl/statem/statem_srvr.c", v49, v48);
                            v57 = a0;
                            v58 = 80;
                            v59 = 296;
                            goto LABEL_9b6a18;
                        }
                        if ((int)sub_a5b680(v45, v54, v55) > 0)
                        {
LABEL_9b66fc:
                            if (sub_956ec0(a0, v44, v45, 1))
                            {
                                sub_a5a4c8(*(long long *)&a0->padding_308[0]);
                                *(unsigned long long *)&a0->padding_308[0] = 0;
                                sub_a5a4c8(v45);
                                if (*(long long *)&g_10002b0 == v9)
                                    return 2;
                                ___stack_chk_fail();
                            }
                            goto LABEL_9b6a20;
                        }
                        else
                        {
                            sub_a368c8();
                            v46 = "tls_process_cke_ecdhe";
                            v47 = 3194;
LABEL_9b6a6c:
                            sub_a369bc("ssl/statem/statem_srvr.c", v47, v46);
                            v57 = a0;
                            v58 = 47;
                            v59 = 108;
LABEL_9b6a18:
                            sub_9a58a4(v57, v58, v59, 0);
LABEL_9b6a20:
                            v60 = v45;
LABEL_9b667c:
                            sub_a5a4c8(v60);
                        }
                    }
                    else
                    {
                        sub_a368c8();
                        sub_a369bc("ssl/statem/statem_srvr.c", 3183, "tls_process_cke_ecdhe");
                        v50 = a0;
                        v51 = 80;
                        v52 = 311;
LABEL_9b6670:
                        sub_9a58a4(v50, v51, v52, 0);
                        v60 = 0;
                        goto LABEL_9b667c;
                    }
                }
                else
                {
                    sub_a368c8();
                    sub_a369bc("ssl/statem/statem_srvr.c", 3165, "tls_process_cke_ecdhe");
                    v50 = a0;
                    v51 = 40;
                    v52 = 311;
                    goto LABEL_9b6670;
                }
            }
            else
            {
                if (!(v12 >> 5 & 1))
                {
                    if (!(v12 >> 4 & 1))
                    {
                        if (!(v12 >> 9 & 1))
                        {
                            sub_a368c8();
                            sub_a369bc("ssl/statem/statem_srvr.c", 3490, "tls_process_client_key_exchange");
                            v17 = a0;
                            v18 = 80;
                            v19 = 249;
LABEL_9b6504:
                            sub_9a58a4(v17, v18, v19, 0);
                        }
                        else if (sub_9b80f0(a0))
                        {
                            if (*(long long *)&g_10002b0 == v9)
                                return 2;
                            ___stack_chk_fail();
                        }
                    }
                    else
                    {
                        if (sub_9b7e14(a0))
                        {
                            if (*(long long *)&g_10002b0 == v9)
                                return 2;
                            ___stack_chk_fail();
                        }
                    }
                }
                else
                {
                    if (sub_9b7c90(a0))
                    {
                        if (*(long long *)&g_10002b0 == v9)
                            return 2;
                        ___stack_chk_fail();
                    }
                }
            }
        }
    }
    else
    {
        if (a1->field_8)
        {
            sub_a368c8();
            v21 = "tls_process_client_key_exchange";
            v22 = 3451;
            goto LABEL_9b64f4;
        }
        else if (sub_9568f8(a0, 0, 0, 0))
        {
            if (*(long long *)&g_10002b0 == v9)
                return 2;
            ___stack_chk_fail();
        }
    }
    sub_a6c4e8(a0->field_3c0, a0->field_3c8, "ssl/statem/statem_srvr.c", 3497);
    *(uint128_t *)&a0->field_3c0 = 0;
    if (*(long long *)&g_10002b0 == v9)
        return 0;
    ___stack_chk_fail();
}
