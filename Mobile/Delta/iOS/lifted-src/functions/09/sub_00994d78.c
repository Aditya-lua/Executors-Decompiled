/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x994d78..0x995000 (648 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_994d78_0 {
    char padding_0[8];
    struct st_994d78_0 *field_8;
} st_994d78_0;

typedef struct st_994d78_1 {
    char padding_0[8];
    struct st_994d78_0 *field_8;
    char padding_10[16];
    long long field_20;
    long long field_28;
} st_994d78_1;

extern char g_10002b0;

st_994d78_0 * sub_994d78(long long a0, st_994d78_1 *a1, st_994d78_0 *a2, st_994d78_0 *a3, st_994d78_0 *a4, unsigned long a5)
{
    st_994d78_0 *v11;  // x21
    st_994d78_0 *v12;  // x0
    st_994d78_0 *v13;  // x26
    st_994d78_0 *v14;  // x25
    unsigned long v15;  // x24
    unsigned long long v16;  // x26
    long long v18;  // x0
    long long v19;  // x1
    uint128_t v0;  // [bp-0xe8]
    uint128_t v1;  // [bp-0xd8]
    unsigned long long v2;  // [bp-0xc8]
    int v3;  // [bp-0xbc]
    char v4;  // [bp-0xb8]
    uint128_t v5;  // [bp-0x90]
    uint128_t v6;  // [bp-0x80]
    unsigned long long v7;  // [bp-0x70]
    unsigned long v8;  // [bp-0x68]
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v8 = *(long long *)&g_10002b0;
    if (a2 == 1 && !(v11 = *(long long *)(a0 + 4128), !v11))
    {
        v12 = sub_a2d030(v11);
        if (v12)
        {
            v13 = sub_9ffdd8();
            v14 = a1->field_8;
            v12 = sub_a50638(v11);
            if ((unsigned int)v12)
            {
                v15 = (unsigned int)v12;
                if (!a3 || (unsigned int)v15 == 1 || v13)
                {
                    if (a3 || v14 && !&v14->padding_0[-1 * v15 * v14 / v15])
                    {
                        if (!v13)
                            goto LABEL_994ef4;
                        if (sub_a4c6a0(v11, a1->field_20, &v3, a1->field_28, v14))
                        {
                            a1->field_8 = v3;
                            if (!a3 && a4)
                            {
                                *(unsigned int *)&a4->field_8 = 0;
                                sub_a71bbc(sub_a718b8("tls-mac"));
                                v5 = v0;
                                v6 = v1;
                                v7 = v2;
                                if (!sub_a4dd70(v11, &v4))
                                {
                                    sub_a368c8();
                                    sub_a369bc("ssl/record/methods/ssl3_meth.c", 175, "ssl3_cipher");
                                    v18 = a0;
                                    v19 = 80;
                                    goto LABEL_994f3c;
                                }
                            }
                            goto LABEL_994f10;
                        }
                    }
                    goto LABEL_994f60;
                }
                v16 = &-v14->padding_0[v15 * v14 / v15 + v15];
                v14 = &v14->padding_0[v16];
                _bzero(&a1->field_8->padding_0[a1->field_28], v16);
                a1->field_8 = &a1->field_8->padding_0[v16];
                *(&v14->padding_0[a1->field_28] - 1) = (unsigned int)v16 - 1;
LABEL_994ef4:
                if ((int)sub_a50654(v11, a1->field_20, a1->field_28, v14) > 0)
                {
                    if (!a3 && *(long long *)&g_10002b0 != v8)
                        ___stack_chk_fail();
LABEL_994f10:
                    v12 = 1;
                }
                else
                {
                    sub_a368c8();
                    sub_a369bc("ssl/record/methods/ssl3_meth.c", 182, "ssl3_cipher");
                    v18 = a0;
                    v19 = 20;
LABEL_994f3c:
                    sub_996e84(v18, v19, 0xc0103, 0);
                    goto LABEL_994f60;
                }
            }
        }
    }
    else
    {
LABEL_994f60:
        v12 = 0;
    }
    if (*(long long *)&g_10002b0 == v8)
        return v12;
    ___stack_chk_fail();
}
