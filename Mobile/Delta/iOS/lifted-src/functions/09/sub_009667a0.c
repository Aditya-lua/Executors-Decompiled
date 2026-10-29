/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9667a0..0x966abc (796 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9667a0_2 {
    int field_0;
    char padding_4[212];
    struct st_9667a0_1 *field_d8;
} st_9667a0_2;

typedef struct st_9667a0_4 {
    char padding_0[24];
    struct st_9667a0_2 *field_18;
    char padding_20[40];
    unsigned int field_48;
    char padding_4c[276];
    unsigned long long field_160;
    char padding_168[1912];
    char field_8e0;
    char padding_8e1[31];
    struct st_9667a0_3 *field_900;
    char padding_908[72];
    unsigned int field_950;
    char padding_954[68];
    unsigned long long field_998;
    char padding_9a0[488];
    long long field_b88;
} st_9667a0_4;

typedef struct st_9667a0_0 {
    char padding_0[648];
    long long field_288;
} st_9667a0_0;

typedef struct st_9667a0_3 {
    unsigned int field_0;
    char padding_4[636];
    char field_280;
    char padding_281[79];
    unsigned long long field_2d0;
} st_9667a0_3;

typedef struct st_9667a0_1 {
    char padding_0[80];
    char field_50;
} st_9667a0_1;


unsigned long long sub_9667a0(st_9667a0_4 *a0, st_9667a0_0 *a1)
{
    unsigned int v3;  // w21
    unsigned int v4;  // x0
    unsigned int v13;  // x0
    unsigned int v5;  // x22
    unsigned int v6;  // w0
    unsigned int v7;  // x20
    st_9667a0_4 *v8;  // x0
    long long v9;  // x1
    long long v10;  // x2
    unsigned long v11;  // x0
    unsigned int v12;  // x20
    unsigned int v0;  // [bp-0x38]
    char *v1;  // [bp-0x10]
    char v2;  // [bp+0x0]

    v1 = &v2;
    v0 = 0;
    if (!(a0->field_18->field_d8->field_50 >> 3 & 1) && a0->field_18->field_0 >= 772 && a0->field_18->field_0 != 0x10000)
    {
        sub_9662a0(a0->field_900);
        a0->field_900 = 0;
        *(unsigned int *)&a0->padding_9a0[192] = 1;
        if (!sub_99af14(a0, 20, 128, a1->field_288, 0, 0) || !sub_99af14(a0, 28, 128, a1->field_288, 0, 0))
            return 0xffffffff;
        v3 = 0;
        v4 = (unsigned int)a0->field_900;
        v0 = v4;
        v5 = 1;
        if (v4)
            goto LABEL_9668f4;
    }
    else
    {
        v6 = sub_96a920(a0, a1, &v0);
        if (v6 - 2 >= 2)
        {
            if (1 >= v6)
            {
                sub_a368c8();
                sub_a369bc("ssl/ssl_sess.c", 618, "ssl_get_prev_session");
                sub_9a58a4(a0, 80, 0xc0103, 0);
                v3 = 0;
                goto LABEL_9668ac;
            }
LABEL_9668e4:
            v3 = 0;
            v5 = 1;
            v4 = v0;
            if (v4)
                goto LABEL_9668f4;
        }
        else
        {
            if (!*(long long *)&a1->padding_0[40])
                goto LABEL_9668e4;
            v4 = sub_9663bc(a0, &a1->padding_0[48]);
            v5 = 0;
            v0 = v4;
            v3 = 1;
            if (v4)
            {
LABEL_9668f4:
                if (*(int *)v4 == a0->field_48 && !(v7 = *(long long *)(v4 + 632), v7 != *(long long *)&a0->padding_168[1904] || _memcmp(v4 + 640, &a0->field_8e0, v7)))
                {
                    if (!v7 && a0->field_950 & 1)
                    {
                        sub_a368c8();
                        sub_a369bc("ssl/ssl_sess.c", 665, "ssl_get_prev_session");
                        v8 = a0;
                        v9 = 80;
                        v10 = 277;
                        goto LABEL_9669c0;
                    }
                    else
                    {
                        v11 = sub_a7c2c0();
                        if (v11 > (unsigned long long)*(long long *)(v0 + 744))
                        {
                            do
                            {
                                /* unsupported instruction */;
                                /* unsupported instruction */;
                            } while (/* unsupported instruction */ ^ 1);
                            if (v5 & 1)
                            {
                                v3 = 0;
                            }
                            else
                            {
                                v3 = 1;
                                sub_966ac4(a0->field_b88);
                            }
                        }
                        else if (*(char *)(v0 + 888) & 1)
                        {
                            if (!(a0->field_160 >> 9 & 1))
                            {
                                sub_a368c8();
                                sub_a369bc("ssl/ssl_sess.c", 683, "ssl_get_prev_session");
                                v8 = a0;
                                v9 = 40;
                                v10 = 104;
                            }
                            else
                            {
LABEL_966a5c:
                                if (a0->field_18->field_d8->field_50 >> 3 & 1 || a0->field_18->field_0 < 772 || a0->field_18->field_0 == 0x10000)
                                {
                                    sub_9662a0(a0->field_900);
                                    a0->field_900 = v0;
                                }
                                do
                                {
                                    /* unsupported instruction */;
                                    /* unsupported instruction */;
                                } while (/* unsupported instruction */ ^ 1);
                                a0->field_998 = a0->field_900->field_2d0;
                                return 1;
                            }
LABEL_9669c0:
                            sub_9a58a4(v8, v9, v10, 0);
LABEL_9668ac:
                            v12 = 0xffffffff;
                            v13 = v0;
                            if (!v13)
                                return 0xffffffff;
                            goto LABEL_966934;
                        }
                        else if (!(a0->field_160 >> 9 & 1))
                        {
                            goto LABEL_966a5c;
                        }
                    }
                }
            }
        }
    }
    v12 = 0;
    v13 = v0;
    if (!v13)
        return 0;
LABEL_966934:
    sub_9662a0(v13);
    if (!(a0->field_18->field_d8->field_50 >> 3 & 1) && a0->field_18->field_0 >= 772 && a0->field_18->field_0 != 0x10000)
        a0->field_900 = 0;
    if (!v3)
        *(unsigned int *)&a0->padding_9a0[192] = 1;
    return v12;
}
