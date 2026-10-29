/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a7c1c..0x9a8834 (3096 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

extern char g_10002b0;

unsigned int sub_9a7c1c(void* a0, long long a1)
{
    void* v23;  // x19
    unsigned long v24;  // x27
    unsigned short *v34;  // x1
    unsigned int v35;  // x23
    long long v36;  // x20
    long long v37;  // x2
    long long v38;  // x1
    void* v39;  // x0
    unsigned long v40;  // x22
    unsigned int v41;  // x21
    unsigned int v42;  // x0
    unsigned long long *v25;  // x24
    long long v43;  // x22
    long long v44;  // x8
    long long v45;  // x23
    long long v46;  // x20
    long long v47;  // x2
    long long v48;  // x2
    unsigned long v49;  // x22
    unsigned int v50;  // x0
    long long v51;  // x20
    long long v52;  // x22
    long long v26;  // x2
    unsigned long long *v53;  // x24
    long long v54;  // x25
    unsigned int v55;  // x0
    unsigned int v56;  // x0
    long long v57;  // x21
    unsigned int v58;  // x22
    long long v59;  // x23
    unsigned int v60;  // x24
    long long v62;  // x20
    long long v27;  // x1
    unsigned int v28;  // x0
    long long v29;  // x22
    unsigned int v30;  // x0
    long long v31;  // x21
    unsigned long v32;  // x8
    char v0;  // [bp-0x37c]
    unsigned long v1;  // [bp-0x378]
    char v2;  // [bp-0x370], Other Possible Types: unsigned int
    unsigned int v3;  // [bp-0x170]
    unsigned int v4;  // [bp-0x160]
    unsigned int v5;  // [bp-0x150]
    unsigned int v6;  // [bp-0x140]
    unsigned int v7;  // [bp-0x130]
    unsigned int v8;  // [bp-0x120]
    unsigned int v9;  // [bp-0x110]
    unsigned int v10;  // [bp-0x100]
    unsigned int v11;  // [bp-0xf0]
    unsigned int v12;  // [bp-0xe0]
    unsigned int v13;  // [bp-0xd0]
    unsigned int v14;  // [bp-0xc0]
    unsigned int v15;  // [bp-0xb0]
    unsigned int v16;  // [bp-0xa0]
    unsigned int v17;  // [bp-0x90]
    unsigned int v18;  // [bp-0x80]
    unsigned int v19;  // [bp-0x70]
    unsigned long v20;  // [bp-0x68]
    char *v21;  // [bp-0x10]
    char v22;  // [bp+0x0]

    v21 = &v22;
    v23 = a0;
    v20 = *(long long *)&g_10002b0;
    v24 = *(int *)((long long)a0[0x300] + 28);
    if (v24 & 456)
    {
        if ((long long)v23[2416])
        {
            v19 = 0;
            v17 = 0;
            v18 = 0;
            v15 = 0;
            v16 = 0;
            v13 = 0;
            v14 = 0;
            v11 = 0;
            v12 = 0;
            v9 = 0;
            v10 = 0;
            v7 = 0;
            v8 = 0;
            v5 = 0;
            v6 = 0;
            v3 = 0;
            v4 = 0;
            (long long)v23[2416]();
        }
        sub_a368c8();
        sub_a369bc("ssl/statem/statem_clnt.c", 3052, "tls_construct_cke_psk_preamble");
        sub_9a58a4(v23, 80, 224, 0);
        sub_a66ec0(&v2, 0);
        sub_a66ec0(&v3, 0x101);
        sub_a6c4e8(0, 0, "ssl/statem/statem_clnt.c", 3103);
        sub_a6c4e8(0, 0, "ssl/statem/statem_clnt.c", 3104);
    }
    else
    {
        if (v24 & 65)
        {
            v2 = 0;
            v25 = (long long)v23[8];
            if (*(long long *)((long long)v23[0x900] + 696) || *(long long *)((long long)v23[0x900] + 704))
            {
                v28 = sub_9af2b4(v23);
                if (!v28)
                {
                    sub_a368c8();
                    v26 = "tls_construct_cke_rsa";
                    v27 = 3132;
                    goto LABEL_9a834c;
                }
                if (sub_a5b3bc())
                {
                    v29 = 524294;
                    v30 = sub_a6bf4c(48, "ssl/statem/statem_clnt.c", 3142);
                    if (v30)
                    {
                        v31 = v30;
                        v32 = (short)v23[2516];
                        v34 = (unsigned short *)v30;
                        *v34 = (((((v32 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v32 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v32 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v32 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 48;
                        if ((int)sub_aa8658(*v25, v34 + 1, 46, 0) >= 1)
                        {
                            if ((int)v23[72] < 769 || sub_c6876c(a1, 2))
                            {
                                v35 = sub_a5d5a8(*v25, v28, v25[142]);
                                if (v35 && (int)sub_a37848(v35) >= 1 && (int)sub_a37d3c(v35, 0, &v3, v31, 48) >= 1)
                                {
                                    if (sub_a6e830(a1, v3, &v2) && (int)sub_a37d3c(v35, v2, &v3, v31, 48) >= 1)
                                    {
                                        sub_a5d6b0(v35);
                                        if ((int)v23[72] < 769 || sub_a6e970(a1))
                                        {
                                            if (sub_9635a8(v23, v2, v3, v31, 48))
                                            {
                                                *(long long *)&v23[944] = v31;
                                                *(unsigned long long *)&v23[952] = 48;
                                                if (*(long long *)&g_10002b0 == v20)
                                                    return 1;
                                                ___stack_chk_fail();
                                            }
                                            else
                                            {
                                                v35 = 0;
                                                goto LABEL_9a8670;
                                            }
                                            goto LABEL_9a8670;
                                        }
                                        else
                                        {
                                            v35 = 0;
                                            v29 = 786691;
                                            v36 = 3177;
                                        }
                                    }
                                    else
                                    {
                                        v29 = 0x77;
                                        v36 = 3169;
                                    }
                                }
                                else
                                {
                                    v36 = 3164;
                                }
                            }
                            else
                            {
                                v35 = 0;
                                v29 = 786691;
                                v36 = 3157;
                            }
                        }
                        else
                        {
                            v35 = 0;
                            v29 = 524324;
                            v36 = 3151;
                        }
                        sub_a368c8();
                        sub_a369bc("ssl/statem/statem_clnt.c", v36, "tls_construct_cke_rsa");
                        sub_9a58a4(v23, 80, v29, 0);
LABEL_9a8670:
                        sub_a6c4e8(v31, 48, "ssl/statem/statem_clnt.c", 3192);
                        sub_a5d6b0(v35);
                    }
                    else
                    {
                        sub_a368c8();
                        sub_a369bc("ssl/statem/statem_clnt.c", 3144, "tls_construct_cke_rsa");
                        v37 = 524303;
                        v38 = 80;
                        v39 = v23;
                        goto LABEL_9a8360;
                    }
                }
                else
                {
                    sub_a368c8();
                    v26 = "tls_construct_cke_rsa";
                    v27 = 3137;
                    goto LABEL_9a834c;
                }
            }
            else
            {
                sub_a368c8();
                v26 = "tls_construct_cke_rsa";
                v27 = 3127;
                goto LABEL_9a834c;
            }
        }
        else if (v24 & 258)
        {
            v2 = 0;
            v2 = 0;
            v40 = (long long)v23[1248];
            if (v40)
            {
                v41 = sub_956b1c(v23, v40);
                if (v41)
                {
                    if (!sub_956ec0(v23, v41, v40, 0))
                        goto LABEL_9a82d0;
                    v42 = sub_a5b7c4(v41, &v2);
                    if (v42)
                    {
                        v43 = v42;
                        v44 = sub_a5bdac(v41);
                        v45 = v44 - v43;
                        if (v44 == v43)
                        {
LABEL_9a814c:
                            if (sub_a6ec4c(a1, v2, v43, 2))
                            {
                                v47 = 3256;
                                goto LABEL_9a8218;
                            }
                            else
                            {
                                v46 = 3250;
                                goto LABEL_9a829c;
                            }
                        }
                        else if (sub_a6e86c(a1, v45, &v2, 2))
                        {
                            _bzero(v2, v45);
                            goto LABEL_9a814c;
                        }
                        else
                        {
                            v46 = 3243;
                            goto LABEL_9a829c;
                        }
                        goto LABEL_9a829c;
                    }
                    else
                    {
                        sub_a368c8();
                        sub_a369bc("ssl/statem/statem_clnt.c", 3229, "tls_construct_cke_dhe");
                        sub_9a58a4(v23, 80, 0xc0103, 0);
LABEL_9a82e4:
                        sub_a5a4c8(v41);
                    }
                }
                else
                {
                    v46 = 3215;
LABEL_9a829c:
                    sub_a368c8();
                    sub_a369bc("ssl/statem/statem_clnt.c", v46, "tls_construct_cke_dhe");
                    sub_9a58a4(v23, 80, 0xc0103, 0);
LABEL_9a82d0:
                    v48 = 3256;
                    goto LABEL_9a82e0;
                }
            }
            else
            {
                v41 = 0;
                v46 = 3209;
                goto LABEL_9a829c;
            }
        }
        else
        {
            if (v24 & 132)
            {
                v2 = 0;
                v49 = (long long)v23[1248];
                if (v49)
                {
                    v41 = sub_956b1c(v23, v49);
                    if (v41)
                    {
                        if (!sub_956ec0(v23, v41, v49, 0))
                            goto LABEL_9a8758;
                        v50 = sub_a5b7c4(v41, &v2);
                        if (!v50)
                        {
                            v51 = 524304;
                            v52 = 3289;
                        }
                        else if (sub_a6ec4c(a1, v2, v50, 1))
                        {
                            v47 = 3300;
LABEL_9a8218:
                            sub_a6c2e4(v2, "ssl/statem/statem_clnt.c", v47);
                            sub_a5a4c8(v41);
                            if (*(long long *)&g_10002b0 == v20)
                                return 1;
                            ___stack_chk_fail();
                        }
                        else
                        {
                            v51 = 786691;
                            v52 = 3294;
                        }
                    }
                    else
                    {
                        v51 = 524308;
                        v52 = 3276;
                    }
                    sub_a368c8();
                    sub_a369bc("ssl/statem/statem_clnt.c", v52, "tls_construct_cke_ecdhe");
                    sub_9a58a4(v23, 80, v51, 0);
LABEL_9a8758:
                    v48 = 3300;
LABEL_9a82e0:
                    sub_a6c2e4(v2, "ssl/statem/statem_clnt.c", v48);
                    goto LABEL_9a82e4;
                }
                else
                {
                    sub_a368c8();
                    v26 = "tls_construct_cke_ecdhe";
                    v27 = 3270;
                    goto LABEL_9a834c;
                }
                goto LABEL_9a834c;
            }
            if (v24 >> 4 & 1)
            {
                v53 = (long long)v23[8];
                if (!(*(int *)((long long)v23[0x300] + 32) & 128))
                    v54 = 809;
                else
                    v54 = 982;
                v55 = sub_9af2b4();
                if (v55)
                {
                    v56 = sub_a5d5a8(*v53, v55, v53[142]);
                    if (v56)
                    {
                        v57 = v56;
                        v58 = sub_a6bf4c(32, "ssl/statem/statem_clnt.c", 3347);
                        if (v58)
                        {
                            v59 = 786691;
                            if ((int)sub_a37848(v57) >= 1 && (int)sub_aa8658(*v53, v58, 32, 0) >= 1)
                            {
                                v60 = sub_a3f728();
                                if (v60 && (int)sub_a3fd98(v60, sub_a58d60(sub_a9976c(v54))) >= 1 && (int)sub_a3fe10(v60, v23 + 392, 32) >= 1 && (int)sub_a3fe10(v60, v23 + 360, 32) >= 1 && (int)sub_a3ff7c(v60, &v3, &v0) >= 1)
                                {
                                    sub_a3f73c(v60);
                                    if ((int)sub_a5e1f4(v57, 0xffffffff, 0x200, 8, 8, &v3) >= 1)
                                    {
                                        v1 = 0xff;
                                        if ((int)sub_a37d3c(v57, &v2, &v1, v58, 32) >= 1)
                                        {
                                            if (sub_c68d5c(a1, 48, 1))
                                            {
                                                if (v1 >= 128)
                                                {
                                                    if (sub_c68d5c(a1, 129, 1))
                                                        goto LABEL_9a8598;
                                                }
                                                else
                                                {
LABEL_9a8598:
                                                    if (sub_a6ec4c(a1, &v2))
                                                    {
                                                        sub_a5d6b0(v57);
                                                        *(unsigned long long *)&v23[944] = v58;
                                                        *(unsigned long long *)&v23[952] = 32;
                                                        if (*(long long *)&g_10002b0 == v20)
                                                            return 1;
                                                        ___stack_chk_fail();
                                                    }
                                                }
                                            }
                                            v60 = 0;
                                            v62 = 3398;
                                        }
                                        else
                                        {
                                            v60 = 0;
                                            v59 = 274;
                                            v62 = 3391;
                                        }
                                    }
                                    else
                                    {
                                        v60 = 0;
                                        v59 = 274;
                                        v62 = 3382;
                                    }
                                }
                                else
                                {
                                    v62 = 3374;
                                }
                            }
                            else
                            {
                                v60 = 0;
                                v62 = 3357;
                            }
                        }
                        else
                        {
                            v60 = 0;
                            v59 = 524303;
                            v62 = 3349;
                        }
                        sub_a368c8();
                        sub_a369bc("ssl/statem/statem_clnt.c", v62, "tls_construct_cke_gost");
                        sub_9a58a4(v23, 80, v59, 0);
                        sub_a5d6b0(v57);
                        sub_a6c4e8(v58, 32, "ssl/statem/statem_clnt.c", 3409);
                        sub_a3f73c(v60);
                    }
                    else
                    {
                        sub_a368c8();
                        sub_a369bc("ssl/statem/statem_clnt.c", 3336, "tls_construct_cke_gost");
                        v38 = 80;
                        v37 = 524294;
                        v39 = v23;
LABEL_9a8360:
                        sub_9a58a4(v39, v38, v37, 0);
                    }
                }
                else
                {
                    sub_a368c8();
                    sub_a369bc("ssl/statem/statem_clnt.c", 0xd00, "tls_construct_cke_gost");
                    v38 = 40;
                    v37 = 330;
                    v39 = v23;
                    goto LABEL_9a8360;
                }
            }
            else if (!(v24 >> 9 & 1))
            {
                if (!(v24 >> 5 & 1))
                {
                    if (!(v24 >> 3 & 1))
                    {
                        sub_a368c8();
                        v26 = "tls_construct_client_key_exchange";
                        v27 = 3616;
                    }
                    else
                    {
                        if (*(long long *)&g_10002b0 == v20)
                            return 1;
                        ___stack_chk_fail();
                    }
LABEL_9a834c:
                    sub_a369bc("ssl/statem/statem_clnt.c", v27, v26);
                    v38 = 80;
                    v37 = 786691;
                    v39 = v23;
                    goto LABEL_9a8360;
                }
                else if (sub_9ac92c(v23, a1))
                {
                    if (*(long long *)&g_10002b0 == v20)
                        return 1;
                    ___stack_chk_fail();
                }
            }
            else
            {
                if (sub_9ac528(v23, a1))
                {
                    if (*(long long *)&g_10002b0 == v20)
                        return 1;
                    ___stack_chk_fail();
                }
            }
        }
    }
    sub_a6c4e8((long long)v23[944], (long long)v23[952], "ssl/statem/statem_clnt.c", 3622);
    *(uint128_t *)&v23[944] = 0;
    sub_a6c4e8((long long)v23[960], (long long)v23[968], "ssl/statem/statem_clnt.c", 3626);
    *(uint128_t *)&v23[960] = 0;
    if (*(long long *)&g_10002b0 == v20)
        return 0;
    ___stack_chk_fail();
}
