/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9b02fc..0x9b0600 (772 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9b02fc_2 {
    char padding_0[8];
    struct st_9b02fc_0 *field_8;
    char padding_10[2160];
    struct st_9b02fc_1 *field_880;
    char padding_888[304];
    char field_9b8;
} st_9b02fc_2;

typedef struct st_9b02fc_0 {
    long long field_0;
    char padding_8[264];
    char field_110;
    char padding_111[863];
    long long field_470;
} st_9b02fc_0;

typedef struct st_9b02fc_1 {
    char padding_0[112];
    unsigned long long field_70;
} st_9b02fc_1;


char sub_9b02fc(st_9b02fc_2 *a0, long long a1, char a2, unsigned long long a3)
{
    st_9b02fc_2 *v2;  // x19
    char v3;  // x23
    long long v13;  // x23
    char v14;  // w0
    char v15;  // x25
    long long v16;  // x1
    long long v17;  // x1
    char v4;  // x22
    st_9b02fc_0 *v5;  // x8
    unsigned long long v6;  // x0
    char v7;  // x23
    unsigned long long v8;  // x23
    unsigned long v9;  // x24
    char v10;  // x0
    long long v11;  // x22
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = a0;
    if (sub_c6876c(a1, 3))
    {
        if (a2 && (v3 = *(long long *)a2, v3))
        {
            v4 = *(long long *)(a2 + 16);
            if (*(long long *)(a2 + 16) || !(v5 = v2->field_8, v4 = *(long long *)&v5->field_110, !(v2->field_9b8 >> 3 & 1) && !v4))
            {
LABEL_9b0348:
                v6 = sub_96cb2c(v2, v4, v3);
                if ((unsigned int)v6 == 1)
                {
                    if (sub_9b23b0(v2, a1, v3, 0, a3))
                    {
                        v7 = 1;
                        do
                        {
                            v8 = v7;
                            v9 = (unsigned int)v8 - 1;
                            if ((int)sub_ad69e4(v4) <= (int)v9)
                                goto LABEL_9b04ec;
                        } while ((v7 = (unsigned int)v8 + 1, sub_9b23b0(v2, a1, sub_ad69f8(v4, v9), v8, a3)));
                    }
                }
                else
                {
                    if (!(unsigned int)a3)
                    {
                        sub_a368c8();
                        sub_a369bc("ssl/statem/statem_lib.c", 1102, "ssl_add_cert_chain");
                        goto LABEL_9b0530;
                    }
                }
            }
            else
            {
                if (!v2->field_880->field_70 && !*(long long *)&v5->padding_8[32])
                {
                    v4 = 0;
                    goto LABEL_9b0348;
                }
                v10 = sub_af50b4(v5->field_0, v5->field_470);
                if (v10)
                {
                    v11 = v10;
                    if (sub_af5208())
                    {
                        sub_a35af4(sub_af4814(v11));
                        v13 = sub_98e304(v11);
                        v6 = sub_96cb2c(v2, v13, 0);
                        if ((unsigned int)v6 == 1)
                        {
                            v14 = sub_ad69e4(v13);
                            if (v14 >= 1)
                            {
                                v15 = 0;
                                do
                                {
                                    if (!sub_9b23b0(v2, a1, sub_ad69f8(v13, v15), v15, a3))
                                    {
                                        sub_af5130(v11);
                                        return 0;
                                    }
                                } while ((v15 += 1, v14 != v15));
                            }
                            sub_af5130(v11);
                            goto LABEL_9b04ec;
                        }
                        sub_af5130(v11);
                        if (!(unsigned int)a3)
                        {
                            sub_a368c8();
                            sub_a369bc("ssl/statem/statem_lib.c", 1084, "ssl_add_cert_chain");
LABEL_9b0530:
                            sub_9a58a4(v2, 80, v6, 0);
                        }
                    }
                    else
                    {
                        sub_af5130(v11);
                        if (!(unsigned int)a3)
                        {
                            sub_a368c8();
                            v16 = 1061;
LABEL_9b0598:
                            sub_a369bc("ssl/statem/statem_lib.c", v16, "ssl_add_cert_chain");
                            v6 = 524299;
                            goto LABEL_9b0530;
                        }
                    }
                }
                else if (!(unsigned int)a3)
                {
                    sub_a368c8();
                    v16 = 1055;
                    goto LABEL_9b0598;
                }
            }
        }
        else
        {
LABEL_9b04ec:
            if (sub_a6e970(a1))
                return 1;
            if (!(unsigned int)a3)
            {
                sub_a368c8();
                v17 = 1419;
LABEL_9b051c:
                sub_a369bc("ssl/statem/statem_lib.c", v17, "ssl3_output_cert_chain");
                v6 = 786691;
                goto LABEL_9b0530;
            }
        }
    }
    else
    {
        if (!(unsigned int)a3)
        {
            sub_a368c8();
            v17 = 1410;
            goto LABEL_9b051c;
        }
    }
    return 0;
}
