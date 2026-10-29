/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x96d864..0x96e110 (2220 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_96d864_1 {
    struct st_96d864_0 *field_0;
    unsigned long long field_8;
} st_96d864_1;

typedef struct st_96d864_0 {
    long long field_0;
    char padding_8[1128];
    long long field_470;
    char padding_478[528];
    void* field_688;
    void* field_690;
    void* field_698;
} st_96d864_0;


void* sub_96d864(long long a0, st_96d864_1 *a1)
{
    st_96d864_0 *v4;  // x23
    unsigned long v5;  // x21
    void* v14;  // x0
    void* v15;  // x0
    void* v16;  // x0
    void* v17;  // x0
    void* v18;  // x0
    void* v19;  // x0
    void* v20;  // x0
    void* v21;  // x0
    void* v22;  // x0
    void* v23;  // x0
    void* v6;  // x8
    void* v24;  // x0
    void* v25;  // x0
    void* v26;  // x0
    void* v27;  // x0
    void* v28;  // x20
    void* v29;  // x20
    long long v30;  // x1
    int v31;  // w8
    int v32;  // w9
    unsigned long long v33;  // 4112
    void* v7;  // x9
    unsigned long long v34;  // 4118
    void* v35;  // x20
    void* v36;  // x0
    long long v37;  // x0
    void* v38;  // x22
    void* v40;  // x19
    void* v8;  // x0
    void* v9;  // x22
    void* v10;  // x0
    void* v11;  // x0
    void* v12;  // x0
    void* v13;  // x0
    unsigned long v0;  // [bp-0x50]
    void* v1;  // [bp-0x44]
    char *v2;  // [bp-0x10]
    char v3;  // [bp+0x0]

    v2 = &v3;
    v4 = a1->field_0;
    v5 = a1->field_8;
    v1 = (void*)0;
    v6 = v4->field_698;
    v7 = v4->field_690;
    if (v6 == v7)
    {
        if (v6)
        {
            v8 = sub_a6c1b4(v4->field_688, 1040 + 104 * v6, "ssl/t1_lib.c", 403);
            if (!v8)
                return 0;
        }
        else
        {
            v8 = sub_a6bf4c(1040, "ssl/t1_lib.c", 398);
            if (!v8)
                return 0;
        }
        v4->field_688 = v8;
        _bzero(v8 + 104 * v4->field_698, 1040);
        v4->field_698 = v4->field_698 + 10;
        v7 = v4->field_690;
    }
    v9 = v4->field_688 + 104 * v7;
    v10 = sub_a6fbc4(a0, "tls-sigalg-name");
    if (!v10 || (int)v10[8] != 4)
    {
        sub_a368c8();
        sub_a369bc("ssl/t1_lib.c", 417, "add_provider_sigalgs");
        sub_a36abc(20, 0x80106, 0);
        v40 = 0;
        if (!v9)
            return 0;
        goto LABEL_96dad0;
    }
    sub_a6c2e4((long long)v9[16], "ssl/t1_lib.c", 420);
    v11 = sub_a6d9b4((long long)v10[16], "ssl/t1_lib.c", 421);
    *(void* *)&v9[16] = v11;
    if (v11)
    {
        v12 = sub_a6fbc4(a0, "tls-sigalg-iana-name");
        if (!v12 || (int)v12[8] != 4)
        {
            sub_a368c8();
            v30 = 427;
            goto LABEL_96dab4;
        }
        sub_a6c2e4(*(long long *)v9, "ssl/t1_lib.c", 430);
        v13 = sub_a6d9b4((long long)v12[16], "ssl/t1_lib.c", 431);
        *(void* *)v9 = v13;
        if (v13)
        {
            if (!sub_a6fbc4(a0, "tls-sigalg-code-point") || !sub_a6ffcc() || 0x10000 <= v1)
            {
                sub_a368c8();
                v30 = 440;
                goto LABEL_96dab4;
            }
            *(unsigned short *)&v9[8] = (unsigned short)v1;
            if (sub_a6fbc4(a0, "tls-sigalg-sec-bits") && sub_a6ffcc())
            {
                v14 = sub_a6fbc4(a0, "tls-sigalg-oid");
                if (!v14)
                {
                    *(unsigned long long *)&v9[24] = 0;
LABEL_96dbe4:
                    v16 = sub_a6fbc4(a0, "tls-sigalg-sig-name");
                    if (v16)
                    {
                        if ((int)v16[8] == 4)
                        {
                            sub_a6c2e4((long long)v9[32], "ssl/t1_lib.c", 471);
                            v17 = sub_a6d9b4((long long)v16[16], "ssl/t1_lib.c", 472);
                            *(void* *)&v9[32] = v17;
                            if (v17)
                                goto LABEL_96dc3c;
                        }
                    }
                    else
                    {
                        *(unsigned long long *)&v9[32] = 0;
LABEL_96dc3c:
                        v18 = sub_a6fbc4(a0, "tls-sigalg-sig-oid");
                        if (v18)
                        {
                            if ((int)v18[8] == 4)
                            {
                                sub_a6c2e4((long long)v9[40], "ssl/t1_lib.c", 483);
                                v19 = sub_a6d9b4((long long)v18[16], "ssl/t1_lib.c", 484);
                                *(void* *)&v9[40] = v19;
                                if (v19)
                                    goto LABEL_96dc94;
                            }
                        }
                        else
                        {
                            *(unsigned long long *)&v9[40] = 0;
LABEL_96dc94:
                            v20 = sub_a6fbc4(a0, "tls-sigalg-hash-name");
                            if (v20)
                            {
                                if ((int)v20[8] == 4)
                                {
                                    sub_a6c2e4((long long)v9[48], "ssl/t1_lib.c", 495);
                                    v21 = sub_a6d9b4((long long)v20[16], "ssl/t1_lib.c", 496);
                                    *(void* *)&v9[48] = v21;
                                    if (v21)
                                        goto LABEL_96dcec;
                                }
                            }
                            else
                            {
                                *(unsigned long long *)&v9[48] = 0;
LABEL_96dcec:
                                v22 = sub_a6fbc4(a0, "tls-sigalg-hash-oid");
                                if (v22)
                                {
                                    if ((int)v22[8] == 4)
                                    {
                                        sub_a6c2e4((long long)v9[56], "ssl/t1_lib.c", 507);
                                        v23 = sub_a6d9b4((long long)v22[16], "ssl/t1_lib.c", 508);
                                        *(void* *)&v9[56] = v23;
                                        if (v23)
                                            goto LABEL_96dd44;
                                    }
                                }
                                else
                                {
                                    *(unsigned long long *)&v9[56] = 0;
LABEL_96dd44:
                                    v24 = sub_a6fbc4(a0, "tls-sigalg-keytype");
                                    v0 = v5;
                                    if (v24)
                                    {
                                        if ((int)v24[8] == 4)
                                        {
                                            sub_a6c2e4((long long)v9[64], "ssl/t1_lib.c", 519);
                                            v25 = sub_a6d9b4((long long)v24[16], "ssl/t1_lib.c", 520);
                                            *(void* *)&v9[64] = v25;
                                            if (v25)
                                                goto LABEL_96dda4;
                                        }
                                    }
                                    else
                                    {
                                        *(unsigned long long *)&v9[64] = 0;
LABEL_96dda4:
                                        v26 = sub_a6fbc4(a0, "tls-sigalg-keytype-oid");
                                        if (v26)
                                        {
                                            if ((int)v26[8] == 4)
                                            {
                                                sub_a6c2e4((long long)v9[72], "ssl/t1_lib.c", 531);
                                                v27 = sub_a6d9b4((long long)v26[16], "ssl/t1_lib.c", 532);
                                                *(void* *)&v9[72] = v27;
                                                if (v27)
                                                    goto LABEL_96de00;
                                            }
                                        }
                                        else
                                        {
                                            *(unsigned long long *)&v9[72] = 0;
LABEL_96de00:
                                            v28 = v9;
                                            *(unsigned long *)&v28[92] = 0xffffffffffffffff;
                                            v29 = v28 + 92;
                                            if (!sub_a6fbc4(a0, "tls-min-dtls") || sub_a6fc2c())
                                            {
                                                if (!sub_a6fbc4(a0, "tls-max-dtls") || sub_a6fc2c())
                                                {
                                                    if (2 > (unsigned int)((int)v29[4] + 1) || (int)v29[4] <= *(int *)v29)
                                                    {
                                                        *(unsigned long *)v29 = 0xffffffffffffffff;
                                                        if (sub_a6fbc4(a0, "tls-min-tls") && sub_a6fc2c())
                                                        {
                                                            if (sub_a6fbc4(a0, "tls-max-tls") && sub_a6fc2c())
                                                            {
                                                                v31 = (int)v9[88];
                                                                if (2 > (unsigned int)(v31 + 1))
                                                                {
                                                                    v32 = (int)v9[84];
                                                                    goto LABEL_96deb8;
                                                                }
                                                                v32 = (int)v9[84];
                                                                if (v32 <= v31)
                                                                {
LABEL_96deb8:
                                                                    if ((2 > (unsigned int)(v32 + 1) || v32 <= 772) && (2 > (unsigned int)(v31 + 1) || 772 <= v31))
                                                                    {
                                                                        v33 = arm64g_calculate_condition(0x11, v32, 1, 0);
                                                                        if (v33 & 1)
                                                                            goto LABEL_96dfc4;
                                                                    }
                                                                    else
                                                                    {
                                                                        *(unsigned long long *)&v9[84] = 0xffffffffffffffff;
                                                                    }
                                                                    v34 = arm64g_calculate_condition(1, *(int *)v29, 1, 0);
                                                                    if (!(v34 & 1))
                                                                    {
LABEL_96dfc4:
                                                                        sub_a36c8c();
                                                                        v35 = (long long)v9[64];
                                                                        if (!(long long)v9[64])
                                                                        {
                                                                            v35 = (long long)v9[32];
                                                                            if (!v35)
                                                                                v35 = (long long)v9[16];
                                                                        }
                                                                        v36 = sub_a55808(v4->field_0, v35, v4->field_470);
                                                                        if (v36)
                                                                        {
                                                                            if (sub_975ff4() != v0)
                                                                            {
LABEL_96e004:
                                                                                sub_a55830(v36);
                                                                                goto LABEL_96e00c;
                                                                            }
                                                                            else
                                                                            {
                                                                                sub_a99efc((long long)v9[24], (long long)v9[16], 0);
                                                                                if (sub_a99eb4((long long)v9[16]) && sub_a99624(sub_a99eb4((long long)v9[16])))
                                                                                {
                                                                                    if ((long long)v9[32])
                                                                                        sub_a99efc((long long)v9[40]);
                                                                                    if ((long long)v9[64])
                                                                                        sub_a99efc((long long)v9[72]);
                                                                                    if ((long long)v9[48])
                                                                                        sub_a99efc((long long)v9[56]);
                                                                                    v37 = sub_a99eb4((long long)v9[16]);
                                                                                    if ((long long)v9[48])
                                                                                        v38 = sub_a99eb4((long long)v9[48]);
                                                                                    else
                                                                                        v38 = 0;
                                                                                    sub_a9afb8(v37, v38, sub_a99eb4(v35));
                                                                                    v9 = 0;
                                                                                    v4->field_690 = v4->field_690 + 1;
                                                                                    goto LABEL_96e004;
                                                                                }
                                                                                else
                                                                                {
                                                                                    sub_a368c8();
                                                                                    sub_a369bc("ssl/t1_lib.c", 617, "add_provider_sigalgs");
                                                                                    sub_a36abc(20, 0x80106, 0);
                                                                                    v40 = 1;
                                                                                }
                                                                            }
                                                                        }
                                                                        else
                                                                        {
LABEL_96e00c:
                                                                            sub_a36cd4();
                                                                            v40 = 1;
                                                                            if (!v9)
                                                                                return 1;
                                                                        }
                                                                    }
                                                                    else
                                                                    {
                                                                        v40 = 1;
                                                                    }
LABEL_96dad0:
                                                                    sub_a6c2e4(*(long long *)v9, "ssl/t1_lib.c", 639);
                                                                    *(unsigned long long *)v9 = 0;
                                                                    sub_a6c2e4((long long)v9[16], "ssl/t1_lib.c", 641);
                                                                    *(unsigned long long *)&v9[16] = 0;
                                                                    sub_a6c2e4((long long)v9[24], "ssl/t1_lib.c", 643);
                                                                    *(unsigned long long *)&v9[24] = 0;
                                                                    sub_a6c2e4((long long)v9[32], "ssl/t1_lib.c", 645);
                                                                    *(unsigned long long *)&v9[32] = 0;
                                                                    sub_a6c2e4((long long)v9[40], "ssl/t1_lib.c", 647);
                                                                    *(unsigned long long *)&v9[40] = 0;
                                                                    sub_a6c2e4((long long)v9[48], "ssl/t1_lib.c", 649);
                                                                    *(unsigned long long *)&v9[48] = 0;
                                                                    sub_a6c2e4((long long)v9[56], "ssl/t1_lib.c", 651);
                                                                    *(unsigned long long *)&v9[56] = 0;
                                                                    sub_a6c2e4((long long)v9[64], "ssl/t1_lib.c", 653);
                                                                    *(unsigned long long *)&v9[64] = 0;
                                                                    sub_a6c2e4((long long)v9[72], "ssl/t1_lib.c", 655);
                                                                    *(unsigned long long *)&v9[72] = 0;
                                                                    return v40;
                                                                }
                                                                sub_a368c8();
                                                                v30 = 569;
                                                            }
                                                            else
                                                            {
                                                                sub_a368c8();
                                                                v30 = 565;
                                                            }
                                                        }
                                                        else
                                                        {
                                                            sub_a368c8();
                                                            v30 = 560;
                                                        }
                                                    }
                                                    else
                                                    {
                                                        sub_a368c8();
                                                        v30 = 551;
                                                    }
                                                }
                                                else
                                                {
                                                    sub_a368c8();
                                                    v30 = 546;
                                                }
                                            }
                                            else
                                            {
                                                sub_a368c8();
                                                v30 = 541;
                                            }
LABEL_96dab4:
                                            sub_a369bc("ssl/t1_lib.c", v30, "add_provider_sigalgs");
                                            sub_a36abc(20, 0x80106, 0);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                else if ((int)v14[8] == 4)
                {
                    sub_a6c2e4((long long)v9[24], "ssl/t1_lib.c", 459);
                    v15 = sub_a6d9b4((long long)v14[16], "ssl/t1_lib.c", 460);
                    *(void* *)&v9[24] = v15;
                    if (v15)
                        goto LABEL_96dbe4;
                }
            }
            else
            {
                sub_a368c8();
                v30 = 448;
                goto LABEL_96dab4;
            }
        }
    }
    v40 = 0;
    goto LABEL_96dad0;
}
