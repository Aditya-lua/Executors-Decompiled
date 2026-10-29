/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x9c9f0c..0x9ca2b8 (940 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_9c9f0c_1 {
    struct st_9c9f0c_1 *field_0;
    struct st_9c9f0c_0 *field_8;
} st_9c9f0c_1;

typedef struct st_9c9f0c_0 {
    long long field_0;
    struct st_9c9f0c_1 *field_8;
} st_9c9f0c_0;

extern long long g_e8a3d0;
extern char g_10002b0;

st_9c9f0c_1 * sub_9c9f0c(long long a0, long long a1, long long a2, long long a3, st_9c9f0c_1 *a4, unsigned int a5, long long a6)
{
    unsigned long long v5;  // x0
    unsigned long long v6;  // x25
    st_9c9f0c_1 *v15;  // x0
    st_9c9f0c_1 *v16;  // x20
    st_9c9f0c_1 *v17;  // x2
    long long v18;  // x1
    long long v19;  // x1
    st_9c9f0c_1 *v20;  // x0
    long long v21;  // x1
    st_9c9f0c_1 *v7;  // x19
    st_9c9f0c_0 *v8;  // x28
    long long v9;  // x0
    st_9c9f0c_1 *v10;  // x0
    st_9c9f0c_1 *v11;  // x0
    st_9c9f0c_1 *v12;  // x27
    unsigned long long v13;  // 4112
    long long v14;  // x24
    unsigned int v0;  // [bp-0x7c]
    char v1;  // [bp-0x78]
    unsigned long v2;  // [bp-0x68]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v2 = *(long long *)&g_10002b0;
    v0 = a5;
    v5 = sub_a501f8();
    if (!(unsigned int)v5)
    {
        sub_a368c8();
        sub_a369bc("crypto/asn1/p5_pbev2.c", 64, "PKCS5_pbe2_set_iv_ex");
        sub_a36abc(13, 108, 0);
        v16 = 0;
        v20 = 0;
        v7 = 0;
        goto LABEL_9ca054;
    }
    v6 = v5;
    v7 = sub_9cde20(&g_e8a3d0);
    if (!v7)
    {
        sub_a368c8();
        v19 = 69;
        goto LABEL_9ca034;
    }
    v8 = v7->field_8;
    v9 = sub_a99624(v6);
    v8->field_0 = v9;
    v10 = sub_9cf1f0(v9);
    v8->field_8 = v10;
    if (v10)
    {
        if ((int)sub_a50728(a0) >= 1)
        {
            if (a4)
            {
                ___memcpy_chk(&v1, a4);
            }
            else if ((int)sub_aa8658(a6, &v1) < 1)
            {
LABEL_9ca04c:
                v16 = 0;
                goto LABEL_9ca050;
            }
        }
        v11 = sub_a4bc70();
        if (!v11)
        {
            sub_a368c8();
            sub_a369bc("crypto/asn1/p5_pbev2.c", 92, "PKCS5_pbe2_set_iv_ex");
            v21 = 524294;
LABEL_9ca044:
            sub_a36abc(13, v21, 0);
            goto LABEL_9ca04c;
        }
        v12 = v11;
        if (!sub_a4c694())
        {
LABEL_9ca1b4:
            v16 = 0;
            v20 = v12;
            goto LABEL_9ca054;
        }
        if ((int)sub_a4f864(v12, v8->field_8) <= 0)
        {
            sub_a368c8();
            sub_a369bc("crypto/asn1/p5_pbev2.c", 100, "PKCS5_pbe2_set_iv_ex");
            sub_a36abc(13, 114, 0);
            goto LABEL_9ca1b4;
        }
        sub_a36c8c();
        v13 = arm64g_calculate_condition(0x11, a5, 1, 0);
        if (!(v13 & 1) && 0 >= (int)sub_a4d5dc(v12, 7, 0, &v0))
            v0 = 799;
        sub_a36cd4();
        sub_a4bca0(v12);
        if ((unsigned int)v6 == 37)
            v14 = sub_9e4290(a0);
        else
            v14 = 0xffffffff;
        sub_9cf6c8(v7->field_0);
        v15 = sub_9ca2b8(a1, a2, a3, v0, v14, a6);
        v7->field_0 = v15;
        if (v15)
        {
            v16 = sub_9cf6bc();
            if (!v16)
            {
                sub_a368c8();
                sub_a369bc("crypto/asn1/p5_pbev2.c", 137, "PKCS5_pbe2_set_iv_ex");
                v18 = 524299;
                goto LABEL_9ca2a8;
            }
            v17 = v16;
            v17->field_0 = sub_a99624(161);
            if (sub_9c5460(&g_e8a3d0, v7, &v17->field_8))
            {
                sub_9cd960(v7, &g_e8a3d0);
            }
            else
            {
                sub_a368c8();
                sub_a369bc("crypto/asn1/p5_pbev2.c", 147, "PKCS5_pbe2_set_iv_ex");
                v18 = 524301;
LABEL_9ca2a8:
                sub_a36abc(13, v18, 0);
LABEL_9ca050:
                v20 = 0;
LABEL_9ca054:
                sub_a4bca0(v20);
                sub_9cd960(v7, &g_e8a3d0);
                sub_9cf6c8(v16);
                v16 = 0;
            }
        }
        else
        {
            sub_a368c8();
            v19 = 130;
LABEL_9ca034:
            sub_a369bc("crypto/asn1/p5_pbev2.c", v19, "PKCS5_pbe2_set_iv_ex");
            v21 = 524301;
            goto LABEL_9ca044;
        }
    }
    else
    {
        sub_a368c8();
        v19 = 77;
        goto LABEL_9ca034;
    }
    if (*(long long *)&g_10002b0 == v2)
        return v16;
    ___stack_chk_fail();
}
