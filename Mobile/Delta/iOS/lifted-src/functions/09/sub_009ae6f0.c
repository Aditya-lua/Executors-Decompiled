/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9ae6f0..0x9aeb90 (1184 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9ae6f0_1 {
    char padding_0[216];
    struct st_9ae6f0_0 *field_d8;
} st_9ae6f0_1;

typedef struct st_9ae6f0_4 {
    char padding_0[8];
    long long field_8;
    char padding_10[8];
    struct st_9ae6f0_1 *field_18;
    char padding_20[40];
    unsigned int field_48;
    char padding_4c[900];
    struct st_9ae6f0_2 *field_3d0;
    char padding_3d8[1320];
    struct st_9ae6f0_3 *field_900;
} st_9ae6f0_4;

typedef struct st_9ae6f0_2 {
    char padding_0[16];
    unsigned short field_10;
    char padding_12[10];
    unsigned int field_1c;
} st_9ae6f0_2;

typedef struct st_9ae6f0_0 {
    char padding_0[80];
    char field_50;
} st_9ae6f0_0;

typedef struct st_9ae6f0_3 {
    char padding_0[8];
    unsigned int field_8;
} st_9ae6f0_3;

extern char g_10002b0;

char sub_9ae6f0(st_9ae6f0_4 *a0, long long a1)
{
    st_9ae6f0_4 *v9;  // x20
    st_9ae6f0_2 *v10;  // x22
    char v11;  // x19
    long long v12;  // x2
    long long v13;  // x1
    char v14;  // x23
    long long v15;  // x1
    char v16;  // w0
    long long v17;  // x2
    long long v18;  // x1
    long long v0;  // [bp-0x128]
    char v1;  // [bp-0x120]
    char v2;  // [bp-0x118]
    char v3;  // [bp-0x110]
    char v4;  // [bp-0x108]
    char v5;  // [bp-0xfa]
    unsigned long v6;  // [bp-0x58]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v9 = a0;
    v6 = *(long long *)&g_10002b0;
    v3 = 0;
    v4 = 0;
    v1 = 0;
    v2 = 0;
    v10 = a0->field_3d0;
    if (!v10 || !*(long long *)&v9->padding_3d8[0])
    {
        sub_a368c8();
        v18 = 327;
        goto LABEL_9ae7ec;
    }
    if (!*(long long *)(*(long long *)&v9->padding_3d8[0] + 8) || !sub_969454(v9->field_8, v10, &v4))
    {
        sub_a368c8();
        v18 = 333;
LABEL_9ae7ec:
        sub_a369bc("ssl/statem/statem_lib.c", v18, "tls_construct_cert_verify");
        sub_9a58a4(v9, 80, 0xc0103, 0);
        v14 = 0;
        v11 = 0;
        goto LABEL_9ae810;
    }
    v11 = sub_a3f728();
    if (!v11)
    {
        sub_a368c8();
        v13 = 339;
        goto LABEL_9aeb38;
    }
    if (!sub_9aeb90(v9, &v5, &v0, &v2))
    {
        v14 = 0;
        goto LABEL_9ae810;
    }
    if (v9->field_18->field_d8->field_50 >> 1 & 1 && !sub_c68d5c(a1, v10->field_10, 2))
    {
        sub_a368c8();
        sub_a369bc("ssl/statem/statem_lib.c", 350, "tls_construct_cert_verify");
        v12 = 786691;
        goto LABEL_9aeb4c;
    }
    if (v4)
        sub_a50a58(v4);
    if ((int)sub_a565c4(v11, &v3) <= 0)
    {
        sub_a368c8();
        v13 = 359;
        goto LABEL_9aeb38;
    }
    if (v10->field_1c != 912 || (int)sub_ab2224(v3, 6) >= 1 && (int)sub_ab243c(v3, 0xffffffff) > 0)
    {
        if (v9->field_48 == 0x300)
        {
            if ((int)sub_a56f14(v11, v0, v2) >= 1 && (int)sub_a40e40(v11, 29, v9->field_900->field_8, &v9->field_900[6].field_8) >= 1 && (int)sub_a5727c(v11, 0, &v1) > 0)
            {
                v14 = sub_a6bf4c(v1, "ssl/statem/statem_lib.c", 387);
                if (!v14 || 0 >= (int)sub_a5727c(v11, v14, &v1))
                {
                    sub_a368c8();
                    v15 = 390;
                    goto LABEL_9aeafc;
                }
                goto LABEL_9aea38;
            }
            else
            {
                sub_a368c8();
                v13 = 384;
                goto LABEL_9aeb38;
            }
            goto LABEL_9aeb38;
        }
        if ((int)sub_a576f0(v11, 0, &v1) > 0)
        {
            v14 = sub_a6bf4c(v1, "ssl/statem/statem_lib.c", 402);
            if (!v14 || (int)sub_a576f0(v11, v14, &v1, v0, v2) <= 0)
            {
                sub_a368c8();
                v15 = 405;
LABEL_9aeafc:
                sub_a369bc("ssl/statem/statem_lib.c", v15, "tls_construct_cert_verify");
                v17 = 524294;
                goto LABEL_9aeb10;
            }
LABEL_9aea38:
            if (v10->field_1c - 979 < 2 || v10->field_1c == 811)
                sub_9ec040(v14, 0, v1);
            if (sub_a6ec4c(a1, v14, v1, 2))
            {
                if (!sub_9545a8(v9, 0))
                    goto LABEL_9aeb18;
                sub_a6c2e4(v14, "ssl/statem/statem_lib.c", 432);
                sub_a3f73c(v11);
                v16 = 1;
            }
            else
            {
                sub_a368c8();
                sub_a369bc("ssl/statem/statem_lib.c", 422, "tls_construct_cert_verify");
                v17 = 786691;
LABEL_9aeb10:
                sub_9a58a4(v9, 80, v17, 0);
LABEL_9aeb18:
LABEL_9ae810:
                sub_a6c2e4(v14, "ssl/statem/statem_lib.c", 436);
                sub_a3f73c(v11);
                v16 = 0;
            }
        }
        else
        {
            sub_a368c8();
            v13 = 399;
LABEL_9aeb38:
            sub_a369bc("ssl/statem/statem_lib.c", v13, "tls_construct_cert_verify");
            v12 = 524294;
LABEL_9aeb4c:
            sub_9a58a4(v9, 80, v12, 0);
            v14 = 0;
            goto LABEL_9ae810;
        }
    }
    else
    {
        sub_a368c8();
        v13 = 368;
        goto LABEL_9aeb38;
    }
    if (*(long long *)&g_10002b0 == v6)
        return v16;
    ___stack_chk_fail();
}
