/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9b46e8..0x9b517c (2708 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9b46e8_2 {
    char padding_0[8];
    unsigned long long field_8;
} st_9b46e8_2;

typedef struct st_9b46e8_1 {
    int field_0;
    char padding_4[212];
    struct st_9b46e8_0 *field_d8;
} st_9b46e8_1;

typedef struct st_9b46e8_6 {
    char padding_0[8];
    struct st_9b46e8_7 *field_8;
    char padding_10[8];
    struct st_9b46e8_1 *field_18;
    char padding_20[216];
    struct st_9b46e8_2 *field_f8;
    char padding_100[960];
    unsigned long long field_4c0;
    char padding_4c8[64];
    unsigned int field_508;
    char padding_50c[304];
    char field_63c;
    char padding_63d[707];
    struct st_9b46e8_3 *field_900;
    char padding_908[168];
    unsigned long long field_9b0;
    char padding_9b8[172];
    unsigned int field_a64;
    char padding_a68[288];
    struct st_9b46e8_4 *field_b88;
} st_9b46e8_6;

typedef struct st_9b46e8_0 {
    char padding_0[80];
    char field_50;
} st_9b46e8_0;

typedef struct st_9b46e8_5 {
    unsigned long long field_0;
} st_9b46e8_5;

typedef struct st_9b46e8_3 {
    char padding_0[80];
    char field_50;
    char padding_51[511];
    long long field_250;
    char field_258;
    char padding_259[235];
    unsigned int field_344;
    unsigned long long field_348;
} st_9b46e8_3;

typedef struct st_9b46e8_4 {
    char padding_0[576];
    uint128_t field_240;
    long long field_250;
    unsigned long long field_258;
    struct st_9b46e8_5 *field_260;
    char padding_268[448];
    struct st_9b46e8_5 *field_428;
} st_9b46e8_4;

typedef struct st_9b46e8_7 {
    long long field_0;
    char padding_8[1128];
    long long field_470;
} st_9b46e8_7;

extern char g_10002b0;

unsigned long long sub_9b46e8(st_9b46e8_6 *a0, long long a1)
{
    st_9b46e8_4 *v20;  // x24
    unsigned long long idx;  // x21
    st_9b46e8_6 *v30;  // x0
    long long v31;  // x2
    long long v32;  // x2
    long long v33;  // x1
    st_9b46e8_4 *v34;  // x26
    unsigned long long *v35;  // x23
    unsigned long long v36;  // w0
    unsigned long long v37;  // w25
    unsigned long v38;  // x28
    unsigned long long v39;  // x0
    unsigned long long v22;  // x0
    unsigned long long v40;  // x0
    unsigned long long v41;  // x28
    unsigned long long v42;  // x0
    unsigned long long v43;  // x25
    unsigned long long v45;  // x0
    unsigned long long v46;  // x28
    unsigned long long v47;  // x0
    unsigned int v48;  // w27
    unsigned int v49;  // w23
    unsigned long long v23;  // x22
    unsigned long v50;  // x8
    unsigned long long v51;  // x0
    long long v52;  // x1
    long long v54;  // x1
    long long v55;  // x2
    st_9b46e8_6 *v56;  // x0
    st_9b46e8_6 *v57;  // x0
    long long v58;  // x2
    unsigned long long v59;  // x0
    st_9b46e8_3 *v24;  // x23
    unsigned long long v25;  // x0
    unsigned long long i;  // x0
    st_9b46e8_3 *v27;  // x9
    st_9b46e8_3 *v28;  // x8
    unsigned long long v29;  // x0
    long long v0;  // [bp-0x108]
    unsigned long v1;  // [bp-0xf8]
    unsigned long long v2;  // [bp-0xec]
    char v3;  // [bp-0xe8], Other Possible Types: unsigned long
    unsigned long v4;  // [bp-0xe0]
    char v5;  // [bp-0xd8]
    int v6;  // [bp-0xd0]
    int v7;  // [bp-0xcc]
    unsigned long v8;  // [bp-0xc8]
    long long v9;  // [bp-0xc0]
    long long v10;  // [bp-0xb8]
    char v11;  // [bp-0xb0], Other Possible Types: unsigned long
    unsigned long v12;  // [bp-0xa8]
    unsigned long v13;  // [bp-0xa0]
    unsigned long v14;  // [bp-0x98]
    uint128_t v15;  // [bp-0x90]
    char v16;  // [bp-0x80]
    unsigned long v17;  // [bp-0x70]
    char *v18;  // [bp-0x10]
    char v19;  // [bp+0x0]

    v18 = &v19;
    v17 = *(long long *)&g_10002b0;
    v20 = a0->field_b88;
    v2 = 0;
    if (!(a0->field_18->field_d8->field_50 >> 3 & 1) && a0->field_18->field_0 >= 772 && a0->field_18->field_0 != 0x10000)
    {
        idx = sub_95a6a8(a0);
        v22 = sub_a50ac8(idx);
        if ((int)v22 <= 0)
        {
            sub_c65c74(a0);
            goto LABEL_9b4c94;
        }
        v23 = v22;
        if (*(long long *)&a0[1].padding_9b8[16] || a0->field_508)
        {
            v25 = sub_965e7c(a0->field_900, 0);
            if (v25)
            {
                v24 = v25;
                sub_9662a0(a0->field_900);
                a0->field_900 = v24;
                goto LABEL_9b47d4;
            }
            else
            {
                sub_a368c8();
                sub_a369bc("ssl/statem/statem_srvr.c", 0x10a0, "tls_construct_new_session_ticket");
                v31 = 524308;
                v30 = a0;
            }
        }
        else
        {
            v24 = a0->field_900;
LABEL_9b47d4:
            i = sub_965e98(a0, v24);
            if ((int)sub_aa8658(a0->field_8->field_0, &v2, 4, 0) > 0)
            {
                v23 &= 0xffffffff;
                v27 = a0->field_900;
                *(unsigned int *)&v27->padding_259[231] = v2;
                v14 = __builtin_bswap64(*(long long *)&a0[1].padding_9b8[24]);
                *(unsigned int *)&v0 = 1;
                i = sub_96ede8(a0, idx, &a0->field_63c, "resumption", 10, &v14, 8, &v27->field_50, v23, v0);
                idx = a0->field_900;
                *(unsigned long long *)(idx + 8) = v23;
                *(unsigned long long *)(idx + 736) = sub_a7c2c0();
                sub_965adc(a0->field_900);
                v28 = a0->field_900;
                if (*(long long *)&a0->padding_100[952])
                {
                    idx = "ssl/statem/statem_srvr.c";
                    sub_a6c2e4(v28->field_348, "ssl/statem/statem_srvr.c", 0x10c9);
                    v29 = sub_a6dac4(*(long long *)&a0->padding_100[952], a0->field_4c0, "ssl/statem/statem_srvr.c", 0x10ca);
                    v28 = a0->field_900;
                    v28->field_348 = v29;
                    if (v29)
                    {
                        *(unsigned long long *)&v28[1].padding_0[0] = a0->field_4c0;
                        goto LABEL_9b48bc;
                    }
                    else
                    {
                        *(unsigned long long *)&v28[1].padding_0[0] = 0;
                        sub_a368c8();
                        sub_a369bc("ssl/statem/statem_srvr.c", 0x10cd, "tls_construct_new_session_ticket");
                        v30 = a0;
                        v31 = 524303;
                    }
                }
                else
                {
LABEL_9b48bc:
                    v28->field_344 = a0[1].field_9b0;
                    goto LABEL_9b48c4;
                }
            }
            else
            {
                sub_a368c8();
                v32 = "tls_construct_new_session_ticket";
                v33 = 4271;
LABEL_9b4b10:
                sub_a369bc("ssl/statem/statem_srvr.c", v33, v32);
                v30 = a0;
                v31 = 786691;
            }
        }
        sub_9a58a4(v30, 80, v31, 0);
        goto LABEL_9b4c94;
    }
    else
    {
LABEL_9b48c4:
        if (v20->field_428)
            v20->field_428();
        if (a0->field_18->field_d8->field_50 >> 3 & 1 || a0->field_18->field_0 < 772 || a0->field_18->field_0 == 0x10000 || !(a0->field_9b0 >> 14 & 1) && (a0->field_9b0 >> 24 & 1 || !(int)a0[1].field_9b0))
        {
            v34 = a0->field_b88;
            v35 = a0->field_8;
            v36 = (unsigned int)sub_957938(a0->field_900, 0);
            if (!v36 || (v37 = v36, 0xff01 <= v36))
            {
                sub_a368c8();
                sub_a369bc("ssl/statem/statem_srvr.c", 4007, "construct_stateless_ticket");
                v57 = a0;
                v58 = 786691;
                goto LABEL_9b4b5c;
            }
            v38 = v37;
            v39 = sub_a6bf4c(v38, "ssl/statem/statem_srvr.c", 4010);
            if (!v39)
            {
                sub_a368c8();
                sub_a369bc("ssl/statem/statem_srvr.c", 4012, "construct_stateless_ticket");
                v57 = a0;
                v58 = 524303;
LABEL_9b4b5c:
                sub_9a58a4(v57, 80, v58, 0);
                v23 = 0;
                idx = 0;
                v59 = 0;
                goto LABEL_9b4c74;
            }
            v1 = v39;
            idx = sub_a4bc70();
            if (!idx)
            {
                sub_a368c8();
                sub_a369bc("ssl/statem/statem_srvr.c", 4018, "construct_stateless_ticket");
                sub_9a58a4(a0, 80, 0x80006, 0);
                v23 = 0;
                goto LABEL_9b4c70;
            }
            v23 = sub_96af20(v34);
            if (!v23)
            {
                sub_a368c8();
                sub_a369bc("ssl/statem/statem_srvr.c", 4023, "construct_stateless_ticket");
                v55 = 524308;
                v56 = a0;
                goto LABEL_9b4c68;
            }
            v13 = v1;
            if (!sub_957938(a0->field_900, &v13))
            {
                sub_a368c8();
                v52 = 4029;
                goto LABEL_9b4c54;
            }
            v8 = v1;
            v40 = sub_957c58(0, &v8, v38, *v35, v35[142]);
            if (!v40)
            {
                sub_a368c8();
                v52 = 4040;
                goto LABEL_9b4c54;
            }
            v41 = v40;
            v42 = sub_957938();
            if ((unsigned int)v42 && v37 >= (int)v42)
            {
                v43 = v42;
                v13 = v1;
                if (sub_957938(v41, &v13))
                {
                    sub_9662a0(v41);
                    if (v34->field_260)
                    {
                        sub_954340(v23);
                        v34->field_260();
                    }
                    if (v34->field_258)
                    {
                        sub_c4c40(v23);
                        v34->field_258();
                    }
                    v45 = sub_a4e104(*v35, "AES-256-CBC", v35[142]);
                    if (v45)
                    {
                        v46 = v45;
                        v47 = sub_a50728();
                        if (!(v47 >> 31 & 1) && (v48 = v47, (int)sub_aa8658(*v35, &v16, v48, 0) >= 1 && sub_a4d02c(idx, v46, 0, v34->field_250 + 32, &v16) && sub_96afdc(v23, v34->field_250, 32, "SHA256")))
                        {
                            sub_a4bbe4(v46);
                            v15 = v34->field_240;
                            if (!sub_9b86f8(a0, a1, v2, &v14))
                                goto LABEL_9b4c70;
                            if (!sub_c68eb8(a1, &v4) || !sub_a6ebd4(a1, &v15, 16) || !sub_a6ebd4(a1, &v16, v48) || !(v49 = (unsigned int)v43 + 32, sub_c68684(a1, v49, &v12) && sub_c672c8(idx, v12, &v7, v1, v43) && sub_a6e830(a1, v7, &v11) && v12 == v11 && sub_a4d024(idx, v12 + v7, &v6) && sub_a6e830(a1, v6, &v11) && (v50 = v7, v12 + v7 == v11 && (int)v49 >= v6 + v7 && sub_c68eb8(a1, &v3) && sub_96b0bc(v23, a0->field_f8->field_8 + v4, v3 - v4) && sub_c68684(a1, 64, &v10) && sub_96b0e0(v23, v10, &v5, 64) && 64 >= v5 && sub_a6e830(a1) && v10 == v9)))
                            {
                                sub_a368c8();
                                v52 = 4168;
                                goto LABEL_9b4c54;
                            }
                            else
                            {
                                v51 = sub_a6e970(a1);
                                if (!(unsigned int)v51)
                                    goto LABEL_9b5160;
                                sub_a6c2e4(v1, "ssl/statem/statem_srvr.c", 0x1054);
                                sub_a4bca0(idx);
                                sub_96b104(v23);
                            }
                        }
                        else
                        {
                            sub_a368c8(sub_a4bbe4(v46));
                            v52 = 4131;
                            goto LABEL_9b4c54;
                        }
                    }
                    else
                    {
                        sub_9a5810(a0, 80);
                        goto LABEL_9b4c70;
                    }
                }
                else
                {
                    sub_a368c8();
                    v54 = 4053;
LABEL_9b4d38:
                    sub_a369bc("ssl/statem/statem_srvr.c", v54, "construct_stateless_ticket");
                    sub_9a58a4(a0, 80, 0xc0103, 0);
                    sub_9662a0(v41);
                    goto LABEL_9b4c70;
                }
            }
            else
            {
                sub_a368c8();
                v54 = 4047;
                goto LABEL_9b4d38;
            }
LABEL_9b4950:
            if (!(a0->field_18->field_d8->field_50 >> 3 & 1))
            {
                i = 1;
                *(__m128i *)&a0[1].padding_9b8[16] = _mm_add_epi64(*(int128_t *)&a0[1].padding_9b8[16], _mm_set1_epi64x(1));
                if ((int)a0->field_a64 >= 1)
                    a0->field_a64 = a0->field_a64 - 1;
                sub_962408(a0, 2);
            }
            i = 1;
        }
        else if (sub_9b86f8(a0, a1, v2, &v14))
        {
            if (sub_a6ebd4(a1, &a0->field_900->field_258, a0->field_900->field_250) && sub_a6e970(a1))
                goto LABEL_9b4950;
            sub_a368c8();
            v32 = "construct_stateful_ticket";
            v33 = 4198;
            goto LABEL_9b4b10;
        }
        for (; *(long long *)&g_10002b0 != v17; i = 0)
        {
            v51 = ___stack_chk_fail();
LABEL_9b5160:
            sub_a368c8(v51);
            v52 = 4174;
LABEL_9b4c54:
            sub_a369bc("ssl/statem/statem_srvr.c", v52, "construct_stateless_ticket");
            v56 = a0;
            v55 = 786691;
LABEL_9b4c68:
            sub_9a58a4(v56, 80, v55, 0);
LABEL_9b4c70:
            v59 = v1;
LABEL_9b4c74:
            sub_a6c2e4(v59, "ssl/statem/statem_srvr.c", 0x1054);
            sub_a4bca0(idx);
            sub_96b104(v23);
LABEL_9b4c94:
        }
        return i;
    }
}
