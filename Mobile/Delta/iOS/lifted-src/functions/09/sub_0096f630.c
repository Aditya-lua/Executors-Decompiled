/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x96f630..0x96fe80 (2128 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_96f630_3 {
    char padding_0[8];
    struct st_96f630_4 *field_8;
    char padding_10[104];
    unsigned int field_78;
    char padding_7c[116];
    unsigned int field_f0;
    char padding_f4[180];
    long long field_1a8;
    char padding_1b0[448];
    unsigned int field_370;
    char padding_374[4];
    unsigned int field_378;
    char padding_37c[4];
    unsigned int field_380;
    char padding_384[504];
    char field_57c;
    char padding_57d[63];
    char field_5bc;
    char padding_5bd[63];
    char field_5fc;
    char padding_5fd[63];
    char field_63c;
    char padding_63d[63];
    char field_67c;
    char padding_67d[63];
    char field_6bc;
    char padding_6bd[63];
    char field_6fc;
    char padding_6fd[63];
    char field_73c;
    char padding_73d[63];
    char field_77c;
    char padding_77d[63];
    char field_7bc;
    char padding_7bd[63];
    char field_7fc;
    char padding_7fd[63];
    char field_83c;
    char padding_83d[195];
    long long field_900;
    struct st_96f630_0 *field_908;
    char padding_910[872];
    struct st_96f630_1 *field_c78;
} st_96f630_3;

typedef struct st_96f630_7 {
    char padding_0[772];
    unsigned long long field_304;
} st_96f630_7;

typedef struct st_96f630_2 {
    unsigned long long field_0;
} st_96f630_2;

typedef struct st_96f630_0 {
    char padding_0[836];
    unsigned int field_344;
} st_96f630_0;

typedef struct st_96f630_1 {
    char padding_0[104];
    struct st_96f630_2 *field_68;
} st_96f630_1;

typedef struct st_96f630_5 {
    char field_0;
} st_96f630_5;

typedef struct st_96f630_4 {
    long long field_0;
    char padding_8[1128];
    long long field_470;
} st_96f630_4;

typedef struct st_96f630_6 {
    char padding_0[260];
    unsigned long long field_104;
    struct st_96f630_0 *field_10c;
    char padding_114[872];
    struct st_96f630_1 *field_47c;
} st_96f630_6;

extern char g_10002b0;

unsigned int sub_96f630(st_96f630_3 *a0, unsigned long long a1)
{
    st_96f630_3 *v29;  // x19
    long long *v30;  // x21
    unsigned int v39;  // x19
    unsigned int v40;  // w0
    unsigned int v41;  // x0
    unsigned int v42;  // x0
    st_96f630_0 *v43;  // x8
    unsigned int v44;  // x0
    long long v45;  // x24
    unsigned int v46;  // x0
    long long v47;  // x0
    long long v48;  // x0
    unsigned int v31;  // w22
    st_96f630_6 *v49;  // x26
    long long v50;  // x0
    long long v51;  // x2
    unsigned int v32;  // w27
    unsigned int v33;  // x28
    st_96f630_7 *v34;  // x23
    char *v35;  // x24
    unsigned int v36;  // w25
    long long v37;  // x21
    unsigned int v38;  // w0
    st_96f630_5 *v0;  // [bp-0x1f0], Other Possible Types: long long
    char *v1;  // [bp-0x1e8], Other Possible Types: long long, unsigned long
    char *v2;  // [bp-0x1e0], Other Possible Types: unsigned int, long long
    char *v3;  // [bp-0x1d8], Other Possible Types: unsigned int
    st_96f630_5 **v4;  // [bp-0x1d0], Other Possible Types: unsigned long long
    char *v5;  // [bp-0x1c8], Other Possible Types: unsigned long long
    char *v6;  // [bp-0x1c0], Other Possible Types: unsigned int
    unsigned long long v7;  // [bp-0x1b8]
    unsigned int v8;  // [bp-0x1b0]
    unsigned long long v9;  // [bp-0x1a8]
    unsigned int v10;  // [bp-0x19c]
    long long v11;  // [bp-0x198]
    unsigned int v12;  // [bp-0x190]
    unsigned int v13;  // [bp-0x184]
    char v14;  // [bp-0x180], Other Possible Types: unsigned long long
    unsigned long v15;  // [bp-0x178]
    char v16;  // [bp-0x170]
    unsigned int v17;  // [bp-0x164]
    unsigned int v18;  // [bp-0x160]
    unsigned int v19;  // [bp-0x158]
    unsigned int n;  // [bp-0x150]
    st_96f630_5 *v21;  // [bp-0x148]
    char v22;  // [bp-0x140]
    char v23;  // [bp-0x100], Other Possible Types: unsigned int
    char v24;  // [bp-0xc0]
    char v25;  // [bp-0x80]
    unsigned long v26;  // [bp-0x70]
    char *v27;  // [bp-0x10]
    char v28;  // [bp+0x0]

    v27 = &v28;
    v29 = a0;
    v26 = *(long long *)&g_10002b0;
    n = 0;
    v21 = &v25;
    v18 = 0;
    v19 = 0;
    v17 = 0;
    v30 = &a0->field_8->field_0;
    v15 = 16;
    if (~(unsigned int)a1 & 18 && ((unsigned int)a1 & 33) != 33)
    {
        if (!(a1 >> 7 & 1))
        {
            v31 = 0;
            v32 = 0;
            v10 = 0;
            v33 = 0;
            v12 = 0;
            v34 = &v29->field_5fc;
            v35 = &v29->field_6fc;
            v36 = 1;
            v37 = 12;
            v11 = "SERVER_TRAFFIC_SECRET_0";
            if (!(a1 >> 6 & 1))
                goto LABEL_96f98c;
        }
        else
        {
            v38 = sub_a50ac8(sub_95a6a8(v29));
            if ((int)v38 <= 0)
            {
                sub_a368c8();
                sub_a369bc("ssl/tls13_enc.c", 649, "tls13_change_cipher_state");
                sub_9a58a4(v29, 80, 0xc0103, 0);
                v39 = 0;
                if ((unsigned int)a1 & 64)
                    goto LABEL_96fdb0;
                goto LABEL_96fdcc;
            }
            v31 = v38;
            v32 = 0;
            v36 = 0;
            v10 = 0;
            v33 = 0;
            v12 = (unsigned int)(struct st_96f630_3 *)&v29->field_6bc;
            v34 = &v29->field_5bc;
            v35 = &v22;
            v37 = 12;
            v11 = "SERVER_HANDSHAKE_TRAFFIC_SECRET";
            if (!(a1 >> 6 & 1))
                goto LABEL_96f98c;
        }
    }
    else
    {
        if (a1 >> 6 & 1)
        {
            v41 = sub_966dac(v29->field_900);
            v42 = sub_9d46fc(v29->field_1a8, 3, 0, &v24);
            if (v42 <= 0)
            {
                sub_a368c8();
                sub_a369bc("ssl/tls13_enc.c", 530, "tls13_change_cipher_state");
                v51 = 332;
                goto LABEL_96fda4;
            }
            if (v29->field_f0 == 2 && *(int *)&v29[1].padding_83d[131] && !*(int *)(v29->field_900 + 836))
            {
                v43 = v29->field_908;
                if (v43 && *(int *)&v29[1].padding_83d[131] == v43->field_344)
                {
                    v41 = sub_966dac(v43);
                    goto LABEL_96f79c;
                }
                else
                {
                    sub_c61504(v29);
                    goto LABEL_96fdac;
                }
                goto LABEL_96fdac;
            }
LABEL_96f79c:
            if (!v41)
            {
                sub_a368c8();
                sub_a369bc("ssl/tls13_enc.c", 550, "tls13_change_cipher_state");
                v51 = 219;
                goto LABEL_96fda4;
            }
            if (!sub_95a0e8(v30, v41, &v18) || !(sub_a2cf88(v18) >> 21 & 1) && !sub_95a2fc(v30, v41, &v19, &v17, 0))
            {
                sub_9a5810(v29, 80);
                goto LABEL_96fdac;
            }
            v44 = sub_a3f728();
            if (!v44)
            {
                sub_a368c8();
                sub_a369bc("ssl/tls13_enc.c", 578, "tls13_change_cipher_state");
                v51 = 524294;
                goto LABEL_96fda4;
            }
            v45 = v44;
            v46 = sub_95a688(v30, *(int *)(v41 + 64));
            if (!v46 || (v33 = v46, !sub_a3fe04(v45, v33, 0) || !sub_a3fe10(v45, v24, v42) || !sub_a3ff7c(v45, &v22, &v23)))
            {
                sub_a368c8();
                sub_a369bc("ssl/tls13_enc.c", 586, "tls13_change_cipher_state");
                sub_9a58a4(v29, 80, 0xc0103, 0);
                sub_a3f73c(v45);
                goto LABEL_96fdac;
            }
            v34 = &v29->field_57c;
            n = v23;
            sub_a3f73c(v45);
            *(unsigned int *)&v1 = 1;
            if (!sub_96ede8(v29, v33, v34, "e exp master", 12, &v22, n, &v29->field_83c, n, v1))
            {
                sub_a368c8();
                sub_a369bc("ssl/tls13_enc.c", 599, "tls13_change_cipher_state");
                v51 = 786691;
LABEL_96fda4:
                sub_9a58a4(v29, 80, v51, 0);
LABEL_96fdac:
                v39 = 0;
LABEL_96fdb0:
                if (!(sub_a2cf88(v18) >> 21 & 1))
                    sub_961c0c(v19);
                sub_961c44(v18);
LABEL_96fdcc:
                sub_a66ec0(&v24, 64);
                sub_a66ec0(&v23, 64);
                if (v21 != &v25)
                    sub_a6c2e4(v21, "ssl/tls13_enc.c", 0x2ff);
                if (*(long long *)&g_10002b0 == v26)
                    return v39;
                ___stack_chk_fail();
            }
            if (!sub_963768(v29, "EARLY_EXPORTER_SECRET", &v29->field_83c, n))
                goto LABEL_96fdac;
            v31 = 0;
            v32 = 0;
            v36 = 0;
            v12 = 0;
            v35 = &v22;
            v10 = 1;
            v37 = 11;
            v11 = "CLIENT_EARLY_TRAFFIC_SECRET";
            if (!(a1 >> 6 & 1))
                goto LABEL_96f98c;
        }
        else if (!(a1 >> 7 & 1))
        {
            v31 = 0;
            v36 = 0;
            v10 = 0;
            v33 = 0;
            v12 = 0;
            v34 = &v29->field_5fc;
            v35 = &v29->field_6fc;
            v32 = 1;
            v37 = 12;
            v11 = "CLIENT_TRAFFIC_SECRET_0";
            if (!(a1 >> 6 & 1))
                goto LABEL_96f98c;
        }
        else
        {
            v40 = sub_a50ac8(sub_95a6a8(v29));
            if ((int)v40 <= 0)
            {
                sub_a368c8();
                sub_a369bc("ssl/tls13_enc.c", 613, "tls13_change_cipher_state");
                sub_9a58a4(v29, 80, 0xc0103, 0);
                v39 = 0;
                goto LABEL_96fdcc;
            }
            v31 = v40;
            v32 = 0;
            v36 = 0;
            v10 = 0;
            v33 = 0;
            v12 = (unsigned int)(struct st_96f630_3 *)&v29->field_67c;
            v34 = &v29->field_5bc;
            v35 = &v29->field_73c;
            v37 = 12;
            v11 = "CLIENT_HANDSHAKE_TRAFFIC_SECRET";
            if (!(a1 >> 6 & 1))
            {
LABEL_96f98c:
                v33 = sub_95a6a8(v29);
                v18 = *(long long *)&v29->field_370;
                v19 = *(long long *)&v29->field_378;
                v17 = v29->field_380;
                if (!sub_9545a8(v29, 1) || !sub_962d78(v29, &v22, 64, &n))
                {
                    v39 = 0;
                    goto LABEL_96fdcc;
                }
            }
        }
    }
    v13 = (unsigned int)a1 & 64;
    if (!v32 || !(v47 = sub_95a6a8(v29), *(unsigned int *)&v2 = 0, !sub_96eae0(v29->field_8->field_0, v29->field_8->field_470, sub_95a6a8(v29), v34, "res master", 10, &v22, n, &v29->field_63c, n, v2)))
    {
        if (!v18)
            goto LABEL_96fc40;
        v6 = &v14;
        v4 = &v21;
        v5 = &v15;
        v2 = &v24;
        v3 = &v16;
        v0 = v37;
        v1 = &v23;
        if (!sub_96fe80(v29, v33))
            goto LABEL_96fc40;
        if (v36)
        {
            _memcpy(&v29->field_7bc, &v23, n);
            v48 = sub_95a6a8(v29);
            v49 = &v29->field_7fc;
            *(unsigned int *)&v2 = 0;
            if (!sub_96eae0(v29->field_8->field_0, v29->field_8->field_470, v48, v34, "exp master", 10, v35, n, v49, n, v2))
                goto LABEL_96fc0c;
            if (sub_963768(v29, "EXPORTER_SECRET", v49, n))
                goto LABEL_96fb1c;
            goto LABEL_96fc40;
        }
        if (v32)
            _memcpy(&v29->field_77c, &v23, n);
LABEL_96fb1c:
        if (!sub_963768(v29, v11, &v23))
            goto LABEL_96fc40;
        if (v12 && (v50 = sub_95a6a8(v29), *(unsigned int *)&v2 = 0, !sub_96eae0(v29->field_8->field_0, v29->field_8->field_470, sub_95a6a8(v29), &v23, "finished", 8, 0, 0, v12, v31, v2)))
            goto LABEL_96fc0c;
        if (a1 >> 1 & 1)
            v29->field_c78->field_68();
        v2 = 0;
        v3 = 0;
        v8 = 0;
        v9 = v33;
        v7 = v19;
        v6 = v17;
        v4 = v18;
        v5 = v14;
        v0 = v21;
        v1 = v15;
        v39 = sub_992148() != 0;
        if (v13)
            goto LABEL_96fdb0;
        goto LABEL_96fdcc;
    }
    else
    {
LABEL_96fc0c:
        sub_a368c8();
        sub_a369bc("ssl/tls13_enc.c", 113, "tls13_hkdf_expand");
        sub_9a58a4(v29, 80, 0xc0103, 0);
LABEL_96fc40:
        v39 = 0;
        if (v13)
            goto LABEL_96fdb0;
        goto LABEL_96fdcc;
    }
}
