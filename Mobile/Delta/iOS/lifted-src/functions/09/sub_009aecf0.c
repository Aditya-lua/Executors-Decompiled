/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9aecf0..0x9af2b4 (1476 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9aecf0_1 {
    unsigned short field_0;
} st_9aecf0_1;

typedef struct st_9aecf0_3 {
    int field_0;
    char padding_4[212];
    struct st_9aecf0_2 *field_d8;
} st_9aecf0_3;

typedef struct st_9aecf0_6 {
    char padding_0[8];
    long long field_8;
    char padding_10[8];
    struct st_9aecf0_3 *field_18;
    char padding_20[40];
    unsigned int field_48;
    char padding_4c[348];
    long long field_1a8;
    char padding_1b0[592];
    struct st_9aecf0_4 *field_400;
    char padding_408[1272];
    struct st_9aecf0_5 *field_900;
} st_9aecf0_6;

typedef struct st_9aecf0_4 {
    char padding_0[28];
    unsigned int field_1c;
} st_9aecf0_4;

typedef struct st_9aecf0_5 {
    char padding_0[8];
    unsigned int field_8;
    char padding_c[68];
    char field_50;
    char padding_51[623];
    char field_2c0;
} st_9aecf0_5;

typedef struct st_9aecf0_2 {
    char padding_0[80];
    char field_50;
} st_9aecf0_2;

typedef struct st_9aecf0_0 {
    struct st_9aecf0_1 *field_0;
    char field_8;
} st_9aecf0_0;

extern char g_10002b0;

char sub_9aecf0(st_9aecf0_6 *a0, st_9aecf0_0 *a1)
{
    char v8;  // x20
    unsigned long v9;  // x22
    unsigned int v18;  // w8
    long long v19;  // x1
    unsigned long v20;  // x8
    char v21;  // x8
    unsigned short *v22;  // x25
    char v24;  // x21
    long long v25;  // x1
    long long v26;  // x0
    long long v27;  // x1
    char v10;  // x21
    st_9aecf0_6 *v28;  // x0
    long long v29;  // x1
    long long v30;  // x2
    char v31;  // x22
    long long v32;  // x1
    long long v33;  // x1
    st_9aecf0_6 *v11;  // x0
    long long v12;  // x1
    long long v13;  // x2
    char v14;  // x8
    unsigned long v15;  // x10
    char v16;  // x8
    char v17;  // x23
    char v0;  // [bp-0x120]
    long long v1;  // [bp-0x118]
    char v2;  // [bp-0x110]
    char v3;  // [bp-0x108]
    char v4;  // [bp-0xfa]
    unsigned long v5;  // [bp-0x58]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v5 = *(long long *)&g_10002b0;
    v2 = 0;
    v3 = 0;
    v8 = sub_a3f728();
    v0 = 0;
    if (!v8)
    {
        sub_a368c8();
        v32 = 460;
        goto LABEL_9aedc0;
    }
    v9 = a0->field_8;
    v10 = *(long long *)&a0->field_900->padding_51[615];
    if (!*(long long *)&a0->field_900->padding_51[615] && (v10 = *(long long *)&a0->field_900->field_2c0, !v10 || (v10 = sub_af1e94(v10), !v10)))
    {
        sub_a368c8(v10);
        v33 = 466;
        goto LABEL_9aef50;
    }
    if (!sub_959f90(v10, 0, v9))
    {
        sub_a368c8();
        sub_a369bc("ssl/statem/statem_lib.c", 472, "tls_process_cert_verify");
        v11 = a0;
        v12 = 47;
        v13 = 220;
        goto LABEL_9af008;
    }
    if (!(a0->field_18->field_d8->field_50 >> 1 & 1))
    {
        if (sub_9694a8(a0, v10))
            goto LABEL_9aee98;
        sub_a368c8();
        sub_a369bc("ssl/statem/statem_lib.c", 489, "tls_process_cert_verify");
        v11 = a0;
        v12 = 80;
        v13 = 333;
        goto LABEL_9af008;
    }
    v14 = *(long long *)&a1->field_8;
    if (1 >= (unsigned long long)*(long long *)&a1->field_8)
    {
        sub_a368c8();
        sub_a369bc("ssl/statem/statem_lib.c", 480, "tls_process_cert_verify");
        v11 = a0;
        v12 = 50;
        v13 = 240;
        goto LABEL_9af008;
    }
    v15 = *(short *)a1->field_0;
    a1->field_0 = a1->field_0 + 1;
    *(long long *)&a1->field_8 = v14 - 2;
    if ((int)sub_969808(a0, (((((v15 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v15 * 0x10000000000 & 0xff00ff00ff00ff00) & 0xffff0000ffff0000) >> 16 | ((v15 * 0x100000000 & 0xff00ff00ff00ff00) >> 8 | v15 * 0x10000000000 & 0xff00ff00ff00ff00) * 0x10000 & 0xffff0000ffff0000) & 0xffffffff00000000) >> 48 & 0xffffffff, v10) < 1)
        goto LABEL_9af010;
LABEL_9aee98:
    if (!sub_969454(v9, a0->field_400, &v3))
    {
        sub_a368c8();
        v33 = 494;
LABEL_9aef50:
        sub_a369bc("ssl/statem/statem_lib.c", v33, "tls_process_cert_verify");
        v11 = a0;
        v12 = 80;
        v13 = 786691;
        goto LABEL_9af008;
    }
    if (!(a0->field_18->field_d8->field_50 >> 1 & 1))
    {
        v16 = *(long long *)&a1->field_8;
        if (*(long long *)&a1->field_8 == 64)
        {
            if (sub_9c7b68(v10) == 811 || sub_9c7b68(v10) == 979)
                goto LABEL_9aef04;
            v16 = *(long long *)&a1->field_8;
        }
        if (v16 != 128 || sub_9c7b68(v10) != 980)
            goto LABEL_9aef10;
LABEL_9aef04:
        v17 = *(long long *)&a1->field_8;
        v18 = v17;
        goto LABEL_9aef78;
    }
LABEL_9aef10:
    v17 = *(long long *)&a1->field_8 - 2;
    if (2 > (unsigned long long)*(long long *)&a1->field_8)
    {
        sub_a368c8();
        v19 = 518;
        goto LABEL_9aeff8;
    }
    v20 = *(short *)a1->field_0;
    v18 = (unsigned int)((v20 & 0xff00) >> 8) | (unsigned int)v20 * 0x100 & 0xff00ff00;
    a1->field_0 = a1->field_0 + 1;
    *(unsigned long long *)&a1->field_8 = v17;
LABEL_9aef78:
    v21 = v18;
    if (v21 > v17)
    {
        sub_a368c8();
        v19 = 523;
        goto LABEL_9aeff8;
    }
    v22 = a1->field_0;
    a1->field_0 = (char *)v22 + v21;
    *(unsigned long long *)&a1->field_8 = v17 - v21;
    if (v17 == v21)
    {
        if (!sub_9aeb90(a0, &v4, &v1, &v2))
            goto LABEL_9af010;
        if (v3)
            sub_a50a58(v3);
        if ((int)sub_a56e98(v8, &v0) <= 0)
        {
            sub_a368c8();
            v32 = 544;
LABEL_9aedc0:
            sub_a369bc("ssl/statem/statem_lib.c", v32, "tls_process_cert_verify");
            v11 = a0;
            v12 = 80;
            v13 = 524294;
LABEL_9af008:
            sub_9a58a4(v11, v12, v13, 0);
LABEL_9af010:
            v31 = 0;
            v24 = 0;
        }
        else if (sub_9c7b68(v10) - 979 < 2 || sub_9c7b68(v10) == 811)
        {
            v24 = sub_a6bf4c(v17, "ssl/statem/statem_lib.c", 553);
            if (v24)
            {
                sub_9ec040(v24, v22, v17);
                v22 = (unsigned short *)v24;
LABEL_9af118:
                if (a0->field_400 && a0->field_400->field_1c == 912 && ((int)sub_ab2224(v0, 6) < 1 || (int)sub_ab243c(v0, 0xffffffff) <= 0))
                {
                    sub_a368c8();
                    v25 = 566;
                    goto LABEL_9af260;
                }
                v26 = v8;
                if (a0->field_48 == 0x300)
                {
                    if ((int)sub_a570c8(v26, v1, v2, v1, v2) >= 1 && (int)sub_a40e40(v8, 29, a0->field_900->field_8, &a0->field_900->field_50) > 0)
                    {
                        if (0 < (int)sub_a578ec(v8, v22, v17))
                            goto LABEL_9af1e4;
                        sub_a368c8();
                        v27 = 580;
LABEL_9af290:
                        sub_a369bc("ssl/statem/statem_lib.c", v27, "tls_process_cert_verify");
                        v28 = a0;
                        v29 = 0x33;
                        v30 = 123;
                    }
                    else
                    {
                        sub_a368c8();
                        v25 = 576;
LABEL_9af260:
                        sub_a369bc("ssl/statem/statem_lib.c", v25, "tls_process_cert_verify");
                        v28 = a0;
                        v29 = 80;
                        v30 = 524294;
                    }
                    sub_9a58a4(v28, v29, v30, 0);
                    v31 = 0;
                }
                else
                {
                    if ((int)sub_a57c20(v26, v22, v17, v1, v2) > 0)
                    {
LABEL_9af1e4:
                        if (!*(int *)&a0->padding_4c[44] && !(a0->field_18->field_d8->field_50 >> 3 & 1) && a0->field_18->field_0 >= 772 && a0->field_18->field_0 != 0x10000 && *(int *)&a0->padding_1b0[400] == 1)
                        {
                            v31 = 2;
                            goto LABEL_9af018;
                        }
                        else
                        {
                            v31 = 3;
                            goto LABEL_9af018;
                        }
                    }
                    else
                    {
                        sub_a368c8();
                        v27 = 591;
                        goto LABEL_9af290;
                    }
                    goto LABEL_9af290;
                }
            }
            else
            {
                v31 = 0;
            }
        }
        else
        {
            v24 = 0;
            goto LABEL_9af118;
        }
    }
    else
    {
        sub_a368c8();
        v19 = 527;
LABEL_9aeff8:
        sub_a369bc("ssl/statem/statem_lib.c", v19, "tls_process_cert_verify");
        v11 = a0;
        v12 = 50;
        v13 = 159;
        goto LABEL_9af008;
    }
LABEL_9af018:
    sub_9d3c28(a0->field_1a8);
    a0->field_1a8 = 0;
    sub_a3f73c(v8);
    sub_a6c2e4(v24, "ssl/statem/statem_lib.c", 613);
    if (*(long long *)&g_10002b0 == v5)
        return v31;
    ___stack_chk_fail();
}
