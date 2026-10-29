/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9ac528..0x9ac92c (1028 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9ac528_0 {
    char padding_0[36];
    unsigned int field_24;
} st_9ac528_0;

typedef struct st_9ac528_1 {
    char padding_0[8];
    struct st_9ac528_2 *field_8;
    char padding_10[752];
    struct st_9ac528_0 *field_300;
    char padding_308[168];
    unsigned int field_3b0;
} st_9ac528_1;

typedef struct st_9ac528_2 {
    long long field_0;
    char padding_8[1128];
    long long field_470;
} st_9ac528_2;

extern char g_10002b0;

unsigned int sub_9ac528(st_9ac528_1 *a0, long long a1)
{
    st_9ac528_1 *v6;  // x20
    unsigned int v7;  // w8
    long long v16;  // x2
    long long v17;  // x1
    unsigned int v18;  // x20
    long long v19;  // x1
    long long v20;  // x2
    long long v8;  // x23
    long long *v9;  // x21
    unsigned int v10;  // x19
    unsigned int v11;  // x0
    unsigned int v12;  // x0
    unsigned int v13;  // x21
    long long v15;  // x1
    char v0;  // [bp-0x78]
    unsigned int v1;  // [bp-0x70]
    char v2;  // [bp-0x68]
    unsigned long v3;  // [bp-0x48]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v6 = a0;
    v3 = *(long long *)&g_10002b0;
    v1 = 0;
    v7 = a0->field_300->field_24;
    if (!(v7 & 0x400000))
        v8 = 1013 & (int)(v7 * 0x100) >> 31;
    else
        v8 = 1188;
    if (v7 & 0xc00000)
    {
        v9 = &v6->field_8->field_0;
        if (!sub_9ac444(v6, &v2))
        {
            sub_a368c8();
            sub_a369bc("ssl/statem/statem_clnt.c", 3476, "tls_construct_cke_gost18");
            sub_9a58a4(v6, 80, 0xc0103, 0);
            v10 = 0;
            v18 = 0;
            v13 = 0;
            goto LABEL_9ac804;
        }
        v10 = sub_a6bf4c(32, "ssl/statem/statem_clnt.c", 3482);
        if (!v10)
        {
            sub_a368c8();
            sub_a369bc("ssl/statem/statem_clnt.c", 3484, "tls_construct_cke_gost18");
            v20 = 524303;
            v19 = 80;
        }
        else if ((int)sub_aa8658(*v9, v10, 32, 0) > 0)
        {
            v11 = sub_9af2b4(v6);
            if (v11)
            {
                v12 = sub_a5d5a8(*v9, v11, v9[142]);
                if (v12)
                {
                    v13 = v12;
                    if ((int)sub_a37848() <= 0)
                    {
                        sub_a368c8();
                        sub_a369bc("ssl/statem/statem_clnt.c", 3509, "tls_construct_cke_gost18");
                        v16 = 786691;
                    }
                    else if ((int)sub_a5e1f4(v13, 0xffffffff, 0x200, 8, 32, &v2) <= 0)
                    {
                        sub_a368c8();
                        v17 = 3517;
                        goto LABEL_9ac8b8;
                    }
                    else if ((int)sub_a5e1f4(v13, 0xffffffff, 0x200, 12, v8, 0) > 0)
                    {
                        if ((int)sub_a37d3c(v13, 0, &v0, v10, 32) > 0)
                        {
                            if (sub_a6e830(a1, v0, &v1) && (int)sub_a37d3c(v13, v1, &v0, v10, 32) > 0)
                            {
                                sub_a5d6b0(v13);
                                *(unsigned long long *)&v6->field_3b0 = v10;
                                *(unsigned long long *)&v6[1].padding_0[4] = 32;
                                if (*(long long *)&g_10002b0 == v3)
                                    return 1;
                                ___stack_chk_fail();
                            }
                            sub_a368c8();
                            v15 = 3535;
                        }
                        else
                        {
                            sub_a368c8();
                            v15 = 3529;
                        }
                        sub_a369bc("ssl/statem/statem_clnt.c", v15, "tls_construct_cke_gost18");
                        v16 = 524294;
                    }
                    else
                    {
                        sub_a368c8();
                        v17 = 3524;
LABEL_9ac8b8:
                        sub_a369bc("ssl/statem/statem_clnt.c", v17, "tls_construct_cke_gost18");
                        v16 = 274;
                    }
                    sub_9a58a4(v6, 80, v16, 0);
                    v18 = 32;
                    goto LABEL_9ac804;
                }
                else
                {
                    sub_a368c8();
                    sub_a369bc("ssl/statem/statem_clnt.c", 3504, "tls_construct_cke_gost18");
                    v19 = 80;
                    v20 = 524294;
                }
            }
            else
            {
                sub_a368c8();
                sub_a369bc("ssl/statem/statem_clnt.c", 3496, "tls_construct_cke_gost18");
                v19 = 40;
                v20 = 330;
            }
        }
        else
        {
            sub_a368c8();
            sub_a369bc("ssl/statem/statem_clnt.c", 3489, "tls_construct_cke_gost18");
            v19 = 80;
            v20 = 786691;
        }
        sub_9a58a4(v6, v19, v20, 0);
        v13 = 0;
        v18 = 32;
LABEL_9ac804:
        sub_a5d6b0(v13);
        sub_a6c4e8(v10, v18, "ssl/statem/statem_clnt.c", 3547);
        if (*(long long *)&g_10002b0 == v3)
            return 0;
        ___stack_chk_fail();
    }
    else
    {
        sub_a368c8();
        sub_a369bc("ssl/statem/statem_clnt.c", 3471, "tls_construct_cke_gost18");
        sub_9a58a4(v6, 80, 0xc0103, 0);
        if (*(long long *)&g_10002b0 == v3)
            return 0;
        ___stack_chk_fail();
    }
}
