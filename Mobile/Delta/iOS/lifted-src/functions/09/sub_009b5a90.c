/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9b5a90..0x9b6158 (1736 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9b5a90_0 {
    void* field_0;
    unsigned long long field_8;
} st_9b5a90_0;

typedef struct st_9b5a90_1 {
    int field_0;
    char padding_4[212];
    void* field_d8;
} st_9b5a90_1;


unsigned long long sub_9b5a90(void* a0, st_9b5a90_0 *a1)
{
    unsigned long long *v7;  // x24
    unsigned long long v8;  // w8
    unsigned long long v17;  // x25
    void* v18;  // x26
    unsigned long long v19;  // x21
    unsigned long long v20;  // x8
    unsigned long long v21;  // x23
    unsigned long long v22;  // x8
    unsigned long v23;  // x9
    unsigned long long v24;  // x23
    long long v25;  // x1
    long long v26;  // x1
    unsigned long long v9;  // x19
    unsigned long long *v27;  // x0
    unsigned long long v28;  // x0
    unsigned long long v29;  // x0
    unsigned long long *v30;  // x8
    unsigned long long *v31;  // x8
    st_9b5a90_1 *v32;  // x8
    unsigned long v33;  // x9
    unsigned long v10;  // x2
    unsigned long v11;  // x9
    void* v12;  // x0
    long long v13;  // x1
    long long v14;  // x2
    unsigned long long v15;  // x8
    void* v16;  // x9
    char *v0;  // [bp-0x78]
    unsigned long long v1;  // [bp-0x70]
    unsigned long long v2;  // [bp-0x68]
    void* v3;  // [bp-0x60]
    unsigned long long v4;  // [bp-0x58]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v4 = 0;
    v7 = (long long)a0[8];
    if (*(long long *)((long long)a0[3184] + 104))
        (*(long long *)((long long)a0[3184] + 104))();
    switch (v8)
    {
    case 0:
        v9 = sub_ad61b4();
        if (!v9)
        {
            sub_a368c8();
            v26 = 3685;
            goto LABEL_9b5ea4;
        }
        if (!((char)(*(char *)(*(long long *)((long long)a0[24] + 216) + 80)) >> 3 & 1) && *(int *)(long long)a0[24] >= 772 && *(int *)(long long)a0[24] != 0x10000)
        {
            if (a1->field_8 && !(v10 = *(char *)a1->field_0, v11 = a1->field_8 - 1, v11 < v10))
            {
                a1->field_0 = a1->field_0 + 1 + v10;
                a1->field_8 = v11 - v10;
                if ((long long)a0[2992])
                {
                    if ((long long)a0[3000] == v10 && !sub_a66f20())
                        goto LABEL_9b5b7c;
                }
                else
                {
                    if (!(unsigned int)v10)
                        goto LABEL_9b5b7c;
                }
            }
            sub_a368c8();
            sub_a369bc("ssl/statem/statem_srvr.c", 3695, "tls_process_client_certificate");
            v12 = a0;
            v13 = 50;
            v14 = 282;
        }
        else
        {
LABEL_9b5b7c:
            v15 = a1->field_8 - 3;
            if (a1->field_8 < 3 || (v16 = a1->field_0, v17 = *(char *)v16 * 0x10000 | (char)v16[1] * 0x100 | (char)v16[2], v15 < v17 || (v18 = v16 + 3, a1->field_0 = v18 + v17, a1->field_8 = v15 - v17, v15 != v17)))
            {
                sub_a368c8();
                sub_a369bc("ssl/statem/statem_srvr.c", 3701, "tls_process_client_certificate");
                v12 = a0;
                v13 = 50;
                v14 = 159;
            }
            else if (v17)
            {
                v19 = 0;
                while (1)
                {
                    v20 = v17 - 3;
                    if (v17 < 3 || (v21 = *(char *)v18 * 0x10000 | (char)v18[1] * 0x100 | (char)v18[2], v17 = v20 - v21, v20 < v21))
                    {
                        sub_a368c8();
                        v25 = 3708;
                        goto LABEL_9b6060;
                    }
                    v3 = v18 + 3;
                    v4 = sub_afc484(*v7, v7[142]);
                    if (!v4)
                    {
                        sub_a368c8();
                        sub_a369bc("ssl/statem/statem_srvr.c", 3715, "tls_process_client_certificate");
                        v14 = 524299;
                        goto LABEL_9b603c;
                    }
                    if (sub_afc3ec(&v4, &v3, v21))
                    {
                        v18 = v3 + v21;
                        if (v3 != v18)
                        {
                            sub_a368c8();
                            v25 = 3724;
LABEL_9b6060:
                            sub_a369bc("ssl/statem/statem_srvr.c", v25, "tls_process_client_certificate");
                            v12 = a0;
                            v13 = 50;
                            v14 = 135;
                            break;
                        }
                        else if (!((char)(*(char *)(*(long long *)((long long)a0[24] + 216) + 80)) >> 3 & 1) && *(int *)(long long)a0[24] >= 772 && *(int *)(long long)a0[24] != 0x10000)
                        {
                            v2 = 0;
                            v22 = v17 - 2;
                            if (v17 >= 2 && !(v23 = *(short *)v18, v24 = (unsigned int)((v23 & 0xff00) >> 8) | (unsigned int)v23 * 0x100 & 0xff00ff00, v17 = v22 - v24, v22 < v24))
                            {
                                v0 = v18 + 2;
                                v1 = v24;
                                if (sub_99a780(a0, &v0, 0x1000, &v2, 0, !v19) && sub_99b03c(a0, 0x1000, v2, v4, v19, !v17))
                                {
                                    v18 = &v0[v24];
                                    sub_a6c2e4(v2, "ssl/statem/statem_srvr.c", 3745);
                                    goto LABEL_9b5cdc;
                                }
                                else
                                {
                                    sub_a6c2e4(v2, "ssl/statem/statem_srvr.c", 3742);
                                    break;
                                }
                                break;
                            }
                            else
                            {
                                sub_a368c8();
                                sub_a369bc("ssl/statem/statem_srvr.c", 3733, "tls_process_client_certificate");
                                v12 = a0;
                                v13 = 50;
                                v14 = 271;
                                break;
                            }
                        }
                        else
                        {
LABEL_9b5cdc:
                            if (sub_ad68a0(v9, v4))
                            {
                                v4 = 0;
                                v19 += 1;
                                if (!v17)
                                    goto LABEL_9b5cf8;
                            }
                            else
                            {
                                sub_a368c8();
                                v26 = 3749;
LABEL_9b5ea4:
                                sub_a369bc("ssl/statem/statem_srvr.c", v26, "tls_process_client_certificate");
                                v12 = a0;
                                v13 = 80;
                                v14 = 524303;
                                break;
                            }
                        }
                    }
                    else
                    {
                        sub_a368c8();
                        sub_a369bc("ssl/statem/statem_srvr.c", 3719, "tls_process_client_certificate");
                        v14 = 524301;
LABEL_9b603c:
                        v12 = a0;
                        v13 = 50;
                        break;
                    }
                }
            }
            else
            {
LABEL_9b5cf8:
                if ((int)sub_ad69e4(v9) > 0)
                {
                    if ((int)sub_958e4c(a0, v9) > 0)
                    {
                        if (sub_af1e94(sub_ad69f8(v9, 0), 0))
                            goto LABEL_9b5d30;
                        sub_a368c8();
                        sub_a369bc("ssl/statem/statem_srvr.c", 3784, "tls_process_client_certificate");
                        v12 = a0;
                        v13 = 40;
                        v14 = 247;
                    }
                    else
                    {
                        sub_a368c8();
                        sub_a369bc("ssl/statem/statem_srvr.c", 3778, "tls_process_client_certificate");
                        v13 = sub_9b0df0((int)a0[2456]);
                        v12 = a0;
                        v14 = 134;
                    }
                }
                else
                {
                    if ((int)a0[72] == 0x300)
                    {
                        sub_a368c8();
                        sub_a369bc("ssl/statem/statem_srvr.c", 3759, "tls_process_client_certificate");
                        v12 = a0;
                        v13 = 40;
                        v14 = 176;
                    }
                    else if (!~((int)a0[2384] & 3))
                    {
                        sub_a368c8();
                        sub_a369bc("ssl/statem/statem_srvr.c", 3765, "tls_process_client_certificate");
                        v12 = a0;
                        v13 = 116;
                        v14 = 199;
                    }
                    else
                    {
                        if ((long long)a0[424] && !sub_9545a8(a0, 0))
                            break;
LABEL_9b5d30:
                        v27 = (long long)a0[0x900];
                        if ((int)a0[2984] == 4)
                        {
                            v28 = sub_965e7c(v27, 0);
                            if (v28)
                            {
                                sub_9662a0((long long)a0[0x900]);
                                v27 = v28;
                                *(unsigned long long **)&a0[0x900] = v27;
                                goto LABEL_9b5d64;
                            }
                            else
                            {
                                sub_a368c8();
                                sub_a369bc("ssl/statem/statem_srvr.c", 3799, "tls_process_client_certificate");
                                v14 = 524308;
                                v12 = a0;
                                v13 = 80;
                            }
                        }
                        else
                        {
LABEL_9b5d64:
                            sub_afc404(v27[88]);
                            v29 = sub_ad68b8(v9);
                            v30 = (long long)a0[0x900];
                            v30[88] = v29;
                            v30[90] = (long long)a0[2456];
                            sub_aded90(v30[89]);
                            v31 = (long long)a0[0x900];
                            v31[89] = v9;
                            sub_a5a4c8(v31[87]);
                            *(unsigned long long *)((long long)a0[0x900] + 696) = 0;
                            v32 = (long long)a0[24];
                            v33 = (int)v32->field_d8[80];
                            if (v33 >> 3 & 1 || v32->field_0 < 772 || v32->field_0 == 0x10000)
                            {
LABEL_9b5de4:
                                if (v33 >> 3 & 1)
                                {
                                    sub_afc404(v4);
                                    sub_aded90(0);
                                    return 3;
                                }
                                if (v32->field_0 >= 772)
                                {
                                    if (v32->field_0 != 0x10000)
                                    {
                                        if (sub_962d78(a0, a0 + 2184, 64, a0 + 2248))
                                        {
                                            *(unsigned long long *)&a0[5464] = 0;
                                            sub_afc404(v4);
                                            sub_aded90(0);
                                            return 3;
                                        }
                                    }
                                    else
                                    {
                                        sub_afc404(v4);
                                        sub_aded90(0);
                                        return 3;
                                    }
                                }
                                else
                                {
                                    sub_afc404(v4);
                                    sub_aded90(0);
                                    return 3;
                                }
                            }
                            else if (sub_9545a8(a0, 1))
                            {
                                v32 = (long long)a0[24];
                                v33 = (int)v32->field_d8[80];
                                goto LABEL_9b5de4;
                            }
                            goto LABEL_9b5e58;
                        }
                    }
                }
            }
        }
        sub_9a58a4(v12, v13, v14, 0);
    default:
        sub_a368c8();
        sub_a369bc("ssl/statem/statem_srvr.c", 3680, "tls_process_client_certificate");
        sub_9a58a4(a0, 43, 247, 0);
LABEL_9b5e58:
        v9 = 0;
        break;
    }
    sub_afc404(v4);
    sub_aded90(v9);
    return 0;
}
