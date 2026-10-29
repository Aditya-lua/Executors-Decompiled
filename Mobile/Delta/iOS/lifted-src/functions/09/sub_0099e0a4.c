/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x99e0a4..0x99e54c (1192 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_99e0a4_2 {
    char padding_0[240];
    char *field_f0;
    char padding_f8[2008];
    char *field_8d0;
    char padding_8d8[40];
    char *field_900;
    char *field_908;
    char *field_910;
    char *field_918;
    char padding_920[80];
    char *field_970;
    char padding_978[16];
    char *field_988;
    char padding_990[144];
    char *field_a20;
    char padding_a28[200];
    char *field_af0;
    char *field_af8;
    char padding_b00[24];
    unsigned long long field_b18;
} st_99e0a4_2;

typedef struct st_99e0a4_3 {
    char padding_0[799];
    char *field_31f;
    char padding_327[28];
    struct st_99e0a4_1 *field_343;
    struct st_99e0a4_1 *field_347;
    struct st_99e0a4_0 *field_34f;
} st_99e0a4_3;

typedef struct st_99e0a4_1 {
    struct st_99e0a4_1 *field_0;
    char padding_8[792];
    struct st_99e0a4_1 *field_320;
    char padding_328[28];
    struct st_99e0a4_1 *field_344;
    struct st_99e0a4_1 *field_348;
    struct st_99e0a4_0 *field_350;
} st_99e0a4_1;

typedef struct st_99e0a4_0 {
    char padding_0[1];
    struct st_99e0a4_1 *field_1;
    char padding_9[792];
    struct st_99e0a4_1 *field_321;
    char padding_329[28];
    struct st_99e0a4_1 *field_345;
    struct st_99e0a4_1 *field_349;
    struct st_99e0a4_0 *field_351;
} st_99e0a4_0;

extern char g_10002b0;

char * sub_99e0a4(st_99e0a4_2 *a0, long long a1)
{
    char *v23;  // x8
    char *v24;  // x0
    st_99e0a4_0 *v33;  // x9
    st_99e0a4_3 *v34;  // x22
    long long v35;  // x1
    long long v25;  // x1
    char *v26;  // x23
    char *v27;  // x0
    char *v30;  // x8
    char *v31;  // x24
    st_99e0a4_0 *v32;  // x21
    char *v0;  // [bp-0x378]
    char *v1;  // [bp-0x370]
    char *v2;  // [bp-0x368]
    char *v3;  // [bp-0x160]
    char *v4;  // [bp-0x150]
    char *v5;  // [bp-0x140]
    char *v6;  // [bp-0x130]
    char *v7;  // [bp-0x120]
    char *v8;  // [bp-0x110]
    char *v9;  // [bp-0x100]
    char *v10;  // [bp-0xf0]
    char *v11;  // [bp-0xe0]
    char *v12;  // [bp-0xd0]
    char *v13;  // [bp-0xc0]
    char *v14;  // [bp-0xb0]
    char *v15;  // [bp-0xa0]
    char *v16;  // [bp-0x90]
    char *v17;  // [bp-0x80]
    char *v18;  // [bp-0x70]
    char *v19;  // [bp-0x60]
    unsigned long v20;  // [bp-0x58]
    char *v21;  // [bp-0x10]
    char v22;  // [bp+0x0]

    v21 = &v22;
    v20 = *(long long *)&g_10002b0;
    v1 = 0;
    v2 = 0;
    v0 = 0;
    if ((int)a0->field_8d0 == 1)
        sub_95a6a8(a0);
    if (a0->field_988)
    {
        a0->field_988();
    }
    else if (a0->field_970)
    {
        v3 = (char *)0;
        v4 = (char *)0;
        v5 = (char *)0;
        v6 = (char *)0;
        v7 = (char *)0;
        v8 = (char *)0;
        v9 = (char *)0;
        v10 = (char *)0;
        v11 = (char *)0;
        v12 = (char *)0;
        v13 = (char *)0;
        v14 = (char *)0;
        v15 = (char *)0;
        v16 = (char *)0;
        v17 = (char *)0;
        v18 = (char *)0;
        v19 = (char *)0;
        a0->field_970();
    }
    else
    {
        sub_9662a0(a0->field_908);
        v23 = v0;
        a0->field_908 = v23;
        if (v23)
        {
            sub_a6c2e4(a0->field_910, "ssl/statem/extensions_clnt.c", 895);
            v24 = sub_a6dac4(v2, v1, "ssl/statem/extensions_clnt.c", 896);
            a0->field_910 = v24;
            if (v24)
            {
                a0->field_918 = v1;
                goto LABEL_99e2d8;
            }
            else
            {
                a0->field_918 = 0;
                sub_a368c8();
                v25 = 899;
            }
        }
        else
        {
LABEL_99e2d8:
            if ((int)a0->field_f0 != 2 || !(v26 = a0->field_900, *(int *)&a0->field_900[836] || !(v26 = v0, !v26 || !*(int *)&v26[836])))
            {
                *(unsigned int *)&a0[1].field_a20 = 0;
                if (*(long long *)&g_10002b0 == v20)
                    return 2;
                ___stack_chk_fail();
            }
            *(int *)&a0[1].field_a20 = *(int *)&v26[836];
            if (*(long long *)&v26[800])
            {
                v27 = a0->field_a20;
                if (!v27 || !(v27 = _strcmp(v27), !(unsigned int)v27))
                {
                    sub_a368c8(v27);
                    sub_a369bc("ssl/statem/extensions_clnt.c", 919, "tls_construct_ctos_early_data");
                    sub_9a58a4(a0, 80, 231, 0);
                    if (*(long long *)&g_10002b0 == v20)
                        return 0;
                    ___stack_chk_fail();
                }
            }
            v30 = a0->field_af0;
            if (a0->field_af0)
            {
                if (!*(long long *)&v26[840])
                    goto LABEL_99e4b4;
                v31 = a0->field_af8;
                if (v31 >= 0)
                {
                    if (!v31)
                    {
LABEL_99e3c8:
                        sub_a368c8();
                        v35 = 950;
                        goto LABEL_99e4a0;
                    }
                    while (1)
                    {
                        v32 = *v30;
                        v33 = v31 - 1;
                        v31 = v33 - v32;
                        if (v33 < v32)
                            goto LABEL_99e3c8;
                        v34 = v30 + 1;
                        if (*(long long *)&v26[848] == v32 && !sub_a66f20(v34, *(long long *)&v26[840], v32))
                            goto LABEL_99e4b4;
                        v30 = v34 + v32;
                        if (!v31)
                            goto LABEL_99e3c8;
                    }
                }
                else
                {
                    sub_a368c8();
                    v25 = 938;
                }
            }
            else
            {
                if (*(long long *)&v26[840])
                {
                    sub_a368c8();
                    v35 = 925;
LABEL_99e4a0:
                    sub_a369bc("ssl/statem/extensions_clnt.c", v35, "tls_construct_ctos_early_data");
                    sub_9a58a4(a0, 80, 222, 0);
                    if (*(long long *)&g_10002b0 == v20)
                        return 0;
                    ___stack_chk_fail();
                }
LABEL_99e4b4:
                if (sub_c68d5c(a1, 42, 2) && sub_c6876c(a1, 2) && sub_a6e970(a1))
                {
                    a0->field_b18 = 4294967297;
                    if (*(long long *)&g_10002b0 == v20)
                        return 1;
                    ___stack_chk_fail();
                }
                sub_a368c8();
                v25 = 958;
            }
        }
        sub_a369bc("ssl/statem/extensions_clnt.c", v25, "tls_construct_ctos_early_data");
        sub_9a58a4(a0, 80, 0xc0103, 0);
        if (*(long long *)&g_10002b0 == v20)
            return 0;
        ___stack_chk_fail();
    }
}
