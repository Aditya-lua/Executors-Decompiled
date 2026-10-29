/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9b53a4..0x9b5990 (1516 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9b53a4_2 {
    char padding_0[40];
    unsigned long long field_28;
} st_9b53a4_2;


int sub_9b53a4(void* a0, void* a1)
{
    char idx;  // x19
    char v4;  // w0
    char v13;  // x11
    unsigned long v14;  // x10
    char v15;  // x12
    unsigned long v16;  // x11
    unsigned long long v17;  // x13
    unsigned long long v18;  // x22
    unsigned long v19;  // x23
    void* v20;  // x9
    unsigned long long v21;  // x11
    unsigned long long v22;  // x8
    void* v5;  // x0
    char v23;  // x8
    unsigned long v24;  // x9
    st_9b53a4_2 *v25;  // x21
    unsigned long long *v26;  // x21
    unsigned long v27;  // x8
    unsigned long long v28;  // x2
    long long v29;  // x1
    uint128_t v30;  // q0
    void* v31;  // x10
    unsigned long v32;  // x22
    long long v6;  // x1
    unsigned long v33;  // x25
    unsigned long long v34;  // x23
    void* v35;  // x24
    unsigned long long v36;  // x2
    unsigned long long v37;  // x8
    void* v38;  // x1
    unsigned long long v39;  // x9
    unsigned long v40;  // x10
    unsigned long long v41;  // x10
    void* v42;  // x11
    long long v7;  // x2
    void* v43;  // x8
    unsigned long long v44;  // x9
    unsigned long long v45;  // x9
    void* v46;  // x8
    char v47;  // x10
    char v48;  // x10
    unsigned long v49;  // x9
    char v50;  // x9
    void* v51;  // x8
    unsigned long long v52;  // 4125
    unsigned long long v8;  // w10
    long long v53;  // x1
    unsigned long long v9;  // x8
    void* v10;  // x9
    unsigned long long v11;  // w10
    void* v12;  // x10
    uint128_t v0;  // [bp-0x60]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    if (!(int)a0[2976] && (long long)a0[608] && (long long)a0[744])
    {
        if (!((char)(*(char *)(*(long long *)((long long)a0[24] + 216) + 80)) >> 3 & 1) && *(int *)(long long)a0[24] >= 772 && *(int *)(long long)a0[24] != 0x10000)
        {
            sub_c65cb0(a0);
            sub_a6c2e4(0, "ssl/statem/statem_srvr.c", 1712);
            return 0;
        }
        if (((long long)a0[2480] & 0x40000100) != 0x100 || !((unsigned long long)((long long)a0[2480]) >> 18 & 1) && !(int)a0[1200])
        {
            sub_957628(a0, 1, 100);
            return 1;
        }
        *(unsigned int *)&a0[2976] = 1;
        *(unsigned int *)&a0[124] = 1;
    }
    idx = sub_a6bffc(656, "ssl/statem/statem_srvr.c", 1529);
    if (!idx)
    {
        sub_a368c8();
        sub_a369bc("ssl/statem/statem_srvr.c", 1531, "tls_process_client_hello");
        sub_9a58a4(a0, 80, 0xc0103, 0);
        sub_a6c2e4(idx, "ssl/statem/statem_srvr.c", 1712);
        return 0;
    }
    v4 = sub_993e5c(a0 + 3160);
    *(unsigned int *)idx = v4;
    if (!v4)
    {
        v9 = (long long)a1[8];
LABEL_9b54e8:
        if (1 >= v9)
        {
            sub_a368c8();
            sub_a369bc("ssl/statem/statem_srvr.c", 1578, "tls_process_client_hello");
            v5 = a0;
            v6 = 50;
            v7 = 160;
        }
        else
        {
            v10 = *(long long *)a1;
            v11 = *(char *)v10;
            *(unsigned int *)(idx + 4) = v11 * 0x100;
            *(unsigned int *)(idx + 4) = ((char)v10[1] | __ROL__(v11, 8) & 0xff00) & 0xffff;
            v12 = v10 + 2;
            v13 = v9 - 2;
            *(void* *)a1 = v12;
            *(unsigned long long *)&a1[8] = v13;
            if (!v4)
            {
                if (v13 >= 32)
                {
                    v30 = *(int128_t *)v12;
                    *(int128_t *)(idx + 24) = (int128_t)v12[16];
                    *(uint128_t *)(idx + 8) = v30;
                    v31 = v10 + 0x22;
                    *(void* *)a1 = v31;
                    *(unsigned long long *)&a1[8] = v9 - 0x22;
                    if (v9 != 0x22 && !(v32 = *(char *)v31, v33 = v9 - 35, v34 = v33 - v32, v33 < v32))
                    {
                        v35 = v10 + 35 + v32;
                        *(void* *)a1 = v35;
                        *(unsigned long long *)&a1[8] = v34;
                        if ((unsigned int)v32 >= 33)
                        {
                            *(unsigned long long *)(idx + 40) = 0;
                        }
                        else
                        {
                            *(unsigned long *)(idx + 40) = v32;
                            _memcpy(idx + 48);
                            if (!((char)(*(char *)(*(long long *)((long long)a0[24] + 216) + 80)) >> 3 & 1))
                            {
LABEL_9b5818:
                                v39 = (long long)a1[8] - 2;
                                if ((unsigned long long)(long long)a1[8] < 2 || (v40 = *(short *)*(long long *)a1, v41 = (unsigned int)((v40 & 0xff00) >> 8) | (unsigned int)v40 * 0x100 & 0xff00ff00, v41 > v39))
                                {
                                    sub_a368c8();
                                    v53 = 1669;
                                }
                                else
                                {
                                    v42 = *(long long *)a1 + 2;
                                    v43 = v42 + v41;
                                    *(void* *)(idx + 344) = v42;
                                    *(unsigned long long *)(idx + 352) = v41;
                                    v44 = v39 - v41;
                                    *(void* *)a1 = v43;
                                    *(unsigned long long *)&a1[8] = v44;
                                    if (v39 == v41 || (v28 = *(char *)v43, v45 = v44 - 1, v28 > v45))
                                    {
                                        sub_a368c8();
                                        v53 = 1674;
                                    }
                                    else
                                    {
                                        v46 = v43 + 1 + v28;
                                        v47 = v45 - v28;
                                        *(void* *)a1 = v46;
                                        *(unsigned long long *)&a1[8] = v47;
                                        if (v45 == v28)
                                        {
                                            v27 = idx + 624;
                                            v28 = v45;
LABEL_9b5798:
                                            *(unsigned long long *)v27 = 0;
                                            *(unsigned long long *)(v27 + 8) = 0;
                                            goto LABEL_9b579c;
                                        }
                                        else
                                        {
                                            v48 = v47 - 2;
                                            if (v47 >= 2 && !(v49 = *(short *)v46, v50 = (unsigned int)((v49 & 0xff00) >> 8) | (unsigned int)v49 * 0x100 & 0xff00ff00, v48 < v50))
                                            {
                                                v51 = v46 + 2;
                                                *(void* *)a1 = v51 + v50;
                                                *(unsigned long long *)&a1[8] = v48 - v50;
                                                *(void* *)(idx + 624) = v51;
                                                *(unsigned long long *)(idx + 632) = v50;
                                                v52 = arm64g_calculate_condition(4, v48, v50, 0);
                                                if (!(v52 & 1))
                                                    goto LABEL_9b5964;
LABEL_9b579c:
                                                *(unsigned long long *)(idx + 360) = v28;
                                                _memcpy(idx + 368);
                                                v0 = *(int128_t *)(idx + 624);
                                                if (sub_99a780(a0, &v0, 128, idx + 648, idx + 640, 1))
                                                {
                                                    *(unsigned long long *)&a0[2904] = idx;
                                                    return 2;
                                                }
                                                sub_a6c2e4(*(long long *)(idx + 648), "ssl/statem/statem_srvr.c", 1711);
                                                sub_a6c2e4(idx, "ssl/statem/statem_srvr.c", 1712);
                                                return 0;
                                            }
LABEL_9b5964:
                                            sub_a368c8();
                                            v53 = 1684;
                                        }
                                    }
                                }
                            }
                            else
                            {
                                if (v33 == v32 || (v36 = *(char *)v35, v37 = v34 - 1, v36 > v37))
                                {
                                    sub_a368c8();
                                    v53 = 1646;
                                }
                                else
                                {
                                    v38 = v35 + 1;
                                    *(void* *)a1 = v38 + v36;
                                    *(unsigned long long *)&a1[8] = v37 - v36;
                                    *(unsigned long long *)(idx + 80) = v36;
                                    _memcpy(idx + 88, v38);
                                    if (sub_962ef0(a0) >> 13 & 1 && !*(long long *)(idx + 80))
                                    {
                                        sub_a6c2e4(idx, "ssl/statem/statem_srvr.c", 1662);
                                        return 1;
                                    }
                                    goto LABEL_9b5818;
                                }
                            }
LABEL_9b5660:
                            sub_a369bc("ssl/statem/statem_srvr.c", v53, "tls_process_client_hello");
                            v5 = a0;
                            v6 = 50;
                            goto LABEL_9b566c;
                        }
                    }
                }
                sub_a368c8();
                v53 = 1640;
                goto LABEL_9b5660;
            }
            if (v13 < 2 || (v14 = (short)v10[2], v15 = v9 - 4, *(void* *)a1 = v10 + 4, *(unsigned long long *)&a1[8] = v15, v15 < 2 || (v16 = (short)v10[4], v17 = v9 - 6, *(void* *)a1 = v10 + 6, *(unsigned long long *)&a1[8] = v17, 1 >= v17)))
            {
                sub_a368c8();
                v29 = 1595;
                goto LABEL_9b5598;
            }
            else
            {
                v18 = (unsigned int)((v16 & 0xff00) >> 8) | (unsigned int)v16 * 0x100 & 0xff00ff00;
                v19 = (short)v10[6];
                v20 = v10 + 8;
                v21 = v9 - 8;
                *(void* *)a1 = v20;
                *(unsigned long long *)&a1[8] = v21;
                if ((unsigned int)v18 >= 33)
                {
                    sub_a368c8();
                    sub_a369bc("ssl/statem/statem_srvr.c", 1600, "tls_process_client_hello");
                    v5 = a0;
                    v6 = 47;
LABEL_9b566c:
                    v7 = 159;
                }
                else
                {
                    v22 = (unsigned int)((v14 & 0xff00) >> 8) | (unsigned int)v14 * 0x100 & 0xff00ff00;
                    if (v21 >= v22 && !(*(void* *)(idx + 344) = v20, *(unsigned long long *)(idx + 352) = v22, *(void* *)a1 = v20 + v22, *(unsigned long long *)&a1[8] = v21 - v22, !sub_9911fc(a1, idx + 48, v18) || (v23 = (unsigned int)((v19 & 0xff00) >> 8) | (unsigned int)v19 * 0x100 & 0xff00ff00, v24 = (long long)a1[8], v24 < v23 || (*(long long *)a1 = *(long long *)a1 + v23, *(unsigned long *)&a1[8] = v24 - v23, v24 != v23))))
                    {
                        v25 = (st_9b53a4_2 *)idx;
                        v25->field_28 = v18;
                        v26 = &v25->field_28;
                        *(uint128_t *)((char *)v26 - 32) = 0;
                        *(uint128_t *)((char *)v26 - 16) = 0;
                        _memcpy();
                        v27 = v26 + 73;
                        v28 = 1;
                        goto LABEL_9b5798;
                    }
                    else
                    {
                        sub_a368c8();
                        v29 = 1610;
                    }
LABEL_9b5598:
                    sub_a369bc("ssl/statem/statem_srvr.c", v29, "tls_process_client_hello");
                    v5 = a0;
                    v6 = 50;
                    v7 = 213;
                }
            }
        }
    }
    else if ((long long)a0[608] && (long long)a0[744] || (int)a0[2256])
    {
        sub_a368c8();
        sub_a369bc("ssl/statem/statem_srvr.c", 1546, "tls_process_client_hello");
        v5 = a0;
        v6 = 10;
        v7 = 244;
    }
    else
    {
        if ((long long)a1[8] && !(v8 = *(char *)*(long long *)a1, v9 = (long long)a1[8] - 1, *(long long *)a1 = *(long long *)a1 + 1, *(unsigned long long *)&a1[8] = v9, *(char *)*(long long *)a1 != 1))
            goto LABEL_9b54e8;
        sub_a368c8();
        sub_a369bc("ssl/statem/statem_srvr.c", 1572, "tls_process_client_hello");
        v5 = a0;
        v6 = 80;
        v7 = 786691;
    }
    sub_9a58a4(v5, v6, v7, 0);
    sub_a6c2e4(*(long long *)(idx + 648), "ssl/statem/statem_srvr.c", 1711);
    sub_a6c2e4(idx, "ssl/statem/statem_srvr.c", 1712);
    return 0;
}
