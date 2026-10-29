/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9a95c0..0x9a99dc (1052 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9a95c0_1 {
    int field_0;
    char padding_4[212];
    struct st_9a95c0_0 *field_d8;
} st_9a95c0_1;

typedef struct st_9a95c0_3 {
    char padding_0[8];
    struct st_9a95c0_4 *field_8;
    char padding_10[8];
    struct st_9a95c0_1 *field_18;
    char padding_20[2272];
    struct st_9a95c0_2 *field_900;
    char padding_908[586];
    char field_b52;
} st_9a95c0_3;

typedef struct st_9a95c0_2 {
    char padding_0[712];
    long long field_2c8;
} st_9a95c0_2;

typedef struct st_9a95c0_0 {
    char padding_0[80];
    char field_50;
} st_9a95c0_0;

typedef struct st_9a95c0_5 {
    void* field_0;
    char field_8;
} st_9a95c0_5;

typedef struct st_9a95c0_4 {
    long long field_0;
    char padding_8[1128];
    long long field_470;
} st_9a95c0_4;


char sub_9a95c0(st_9a95c0_3 *a0, st_9a95c0_5 *a1)
{
    char v7;  // w8
    st_9a95c0_3 *v8;  // x0
    unsigned long v17;  // x10
    unsigned long v18;  // x9
    unsigned long v19;  // x8
    char v20;  // x11
    char v21;  // x8
    char v22;  // x21
    char v23;  // x8
    void* v24;  // x9
    char v25;  // x23
    void* v26;  // x9
    long long v9;  // x1
    void* v27;  // x25
    unsigned long long v28;  // x9
    unsigned long v29;  // x8
    unsigned long long v30;  // x8
    char *v31;  // x10
    long long v32;  // x1
    long long v33;  // x1
    long long v10;  // x2
    unsigned long long *v11;  // x24
    char v12;  // x0
    char v13;  // x8
    char v14;  // w10
    char v15;  // x11
    void* v16;  // x12
    char *v0;  // [bp-0x78]
    unsigned long long v1;  // [bp-0x70]
    char v2;  // [bp-0x68]
    void* v3;  // [bp-0x60]
    char v4;  // [bp-0x58]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v4 = 0;
    switch (v7)
    {
    case 0:
        v11 = a0->field_8;
        v12 = sub_ad61b4();
        a0->field_900->field_2c8 = v12;
        if (!v12)
        {
            sub_a368c8();
            v33 = 2013;
            goto LABEL_9a96ec;
        }
        if (!(a0->field_18->field_d8->field_50 >> 3 & 1) && a0->field_18->field_0 >= 772 && a0->field_18->field_0 != 0x10000 && !(v13 = *(long long *)&a1->field_8, *(long long *)&a1->field_8 && !(v14 = *(char *)a1->field_0, a1->field_0 = a1->field_0 + 1, *(long long *)&a1->field_8 = *(long long *)&a1->field_8 - 1, *(char *)a1->field_0)) || (v15 = *(long long *)&a1->field_8, 3 > v15))
        {
LABEL_9a967c:
            sub_a368c8();
            sub_a369bc("ssl/statem/statem_clnt.c", 2022, "tls_process_server_certificate");
            v8 = a0;
            v9 = 50;
            v10 = 159;
            break;
        }
        else
        {
            v16 = a1->field_0;
            v17 = *(char *)v16;
            v18 = (char)v16[1];
            v19 = (char)v16[2];
            v20 = v15 - 3;
            a1->field_0 = v16 + 3;
            *(unsigned long long *)&a1->field_8 = v20;
            if (v15 == 3 || (v21 = v17 * 0x10000 | v18 * 0x100 | v19, v20 != v21))
                goto LABEL_9a967c;
            v22 = 0;
            while (1)
            {
                v23 = v21 - 3;
                if (v21 < 3)
                {
LABEL_9a98dc:
                    sub_a368c8();
                    v32 = 2028;
                    goto LABEL_9a9968;
                }
                v24 = a1->field_0;
                v25 = *(char *)v24 * 0x10000 | (char)v24[1] * 0x100 | (char)v24[2];
                v26 = v24 + 3;
                a1->field_0 = v26;
                *(unsigned long long *)&a1->field_8 = v23;
                if (v23 < v25)
                    goto LABEL_9a98dc;
                v3 = v26;
                v27 = v3 + v25;
                a1->field_0 = v27;
                *(unsigned long long *)&a1->field_8 = v23 - v25;
                v4 = sub_afc484(*v11, v11[142]);
                if (!v4)
                {
                    sub_a368c8();
                    sub_a369bc("ssl/statem/statem_clnt.c", 2035, "tls_process_server_certificate");
                    v8 = a0;
                    v9 = 50;
                    goto LABEL_9a9944;
                }
                else if (!sub_afc3ec(&v4, &v3, v25))
                {
                    sub_a368c8();
                    sub_a369bc("ssl/statem/statem_clnt.c", 0x7f9, "tls_process_server_certificate");
                    v8 = a0;
                    v9 = 42;
LABEL_9a9944:
                    v10 = 524301;
                    break;
                }
                else if (v3 == v27)
                {
                    if (!(a0->field_18->field_d8->field_50 >> 3 & 1) && a0->field_18->field_0 >= 772 && a0->field_18->field_0 != 0x10000)
                    {
                        v2 = 0;
                        v28 = *(long long *)&a1->field_8 - 2;
                        if ((unsigned long long)*(long long *)&a1->field_8 >= 2 && !(v29 = *(short *)a1->field_0, v30 = (unsigned int)((v29 & 0xff00) >> 8) | (unsigned int)v29 * 0x100 & 0xff00ff00, v28 < v30))
                        {
                            v31 = a1->field_0 + 2;
                            a1->field_0 = &v31[v30];
                            *(unsigned long long *)&a1->field_8 = v28 - v30;
                            v0 = v31;
                            v1 = v30;
                            if (!sub_99a780(a0, &v0, 0x1000, &v2, 0, !v22) || !sub_99b03c(a0, 0x1000, v2, v4, v22, !*(long long *)&a1->field_8))
                            {
                                sub_a6c2e4(v2, "ssl/statem/statem_clnt.c", 2064);
                                sub_afc404(v4);
                                sub_aded90(a0->field_900->field_2c8);
                                a0->field_900->field_2c8 = 0;
                                return 0;
                            }
                            sub_a6c2e4(v2, "ssl/statem/statem_clnt.c", 2068);
                        }
                        else
                        {
                            sub_a368c8();
                            sub_a369bc("ssl/statem/statem_clnt.c", 2055, "tls_process_server_certificate");
                            v8 = a0;
                            v9 = 50;
                            v10 = 271;
                            break;
                        }
                    }
                    if (sub_ad68a0(a0->field_900->field_2c8, v4))
                    {
                        v4 = 0;
                        v22 += 1;
                        v21 = *(long long *)&a1->field_8;
                        if (!v21)
                            return 2;
                    }
                    else
                    {
                        sub_a368c8();
                        v33 = 2072;
LABEL_9a96ec:
                        sub_a369bc("ssl/statem/statem_clnt.c", v33, "tls_process_server_certificate");
                        v10 = 524303;
                        v8 = a0;
                        v9 = 80;
                        break;
                    }
                }
                else
                {
                    sub_a368c8();
                    v32 = 0x7fe;
LABEL_9a9968:
                    sub_a369bc("ssl/statem/statem_clnt.c", v32, "tls_process_server_certificate");
                    v8 = a0;
                    v9 = 50;
                    v10 = 135;
                    break;
                }
            }
        }
    default:
        sub_a368c8();
        sub_a369bc("ssl/statem/statem_clnt.c", 2008, "tls_process_server_certificate");
        v8 = a0;
        v9 = 43;
        v10 = 247;
        break;
    }
    sub_9a58a4(v8, v9, v10, 0);
    sub_afc404(v4);
    sub_aded90(a0->field_900->field_2c8);
    a0->field_900->field_2c8 = 0;
    return 0;
}
