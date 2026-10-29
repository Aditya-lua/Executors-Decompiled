/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa58e9c..0xa59240 (932 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a58e9c_1 {
    struct st_a58e9c_0 *field_0;
    struct st_a58e9c_1 *field_8;
} st_a58e9c_1;

typedef struct st_a58e9c_0 {
    int field_0;
    char padding_4[4];
    unsigned long long field_8;
} st_a58e9c_0;

extern char g_10002b0;

st_a58e9c_1 * sub_a58e9c(long long a0, st_a58e9c_1 *a1, st_a58e9c_1 *a2, st_a58e9c_1 *a3, long long a4, long long a5, long long a6, long long a7)
{
    st_a58e9c_1 *v26;  // w25
    long long v27;  // x0
    long long v36;  // x0
    st_a58e9c_1 *v37;  // x28
    st_a58e9c_1 *v38;  // x20
    st_a58e9c_1 *v39;  // x0
    long long v40;  // x1
    long long v42;  // x1
    st_a58e9c_1 *v28;  // x0
    st_a58e9c_1 *v29;  // x19
    unsigned int v30;  // w0
    long long v31;  // x1
    unsigned int v32;  // w0
    st_a58e9c_1 *v33;  // w0
    unsigned long long v34;  // 4112
    st_a58e9c_1 *v35;  // w0
    unsigned long v0;  // [bp-0x1e8]
    unsigned int v1;  // [bp-0x1dc]
    unsigned long v2;  // [bp-0x1d8]
    unsigned int v3;  // [bp-0x1d0]
    st_a58e9c_1 *v4;  // [bp-0x1cc]
    char v5;  // [bp-0x1c8]
    uint128_t v6;  // [bp-0x1a0]
    uint128_t v7;  // [bp-0x190]
    unsigned long long v8;  // [bp-0x180]
    uint128_t v9;  // [bp-0x178]
    uint128_t v10;  // [bp-0x168]
    unsigned long long v11;  // [bp-0x158]
    uint128_t v12;  // [bp-0x150]
    uint128_t v13;  // [bp-0x140]
    unsigned long long v14;  // [bp-0x130]
    uint128_t v15;  // [bp-0x128]
    uint128_t v16;  // [bp-0x118]
    unsigned long long v17;  // [bp-0x108]
    char v18;  // [bp-0x100]
    char v19;  // [bp-0xf0]
    uint128_t v20;  // [bp-0xb0]
    uint128_t v21;  // [bp-0xa0]
    unsigned long long v22;  // [bp-0x90]
    unsigned long v23;  // [bp-0x70]
    char *v24;  // [bp-0x10]
    char v25;  // [bp+0x0]

    v24 = &v25;
    v26 = a2;
    v23 = *(long long *)&g_10002b0;
    v27 = sub_a50a58(a5);
    if (a3 && (int)a3->field_0 == 16 && a3->field_8)
    {
        v28 = sub_9c5520(sub_9c9c18(), a3);
        if (v28)
        {
            v29 = v28;
            v30 = sub_a50728(a4);
            if (v30 >= 0x11)
            {
                sub_a368c8();
                sub_a369bc("crypto/evp/p5_crpt.c", 58, "PKCS5_PBE_keyivgen_ex");
                v31 = 194;
                goto LABEL_a59018;
            }
            v3 = v30;
            v32 = sub_9e4290(a4);
            if (v32 >= 65)
            {
                sub_a368c8();
                sub_a369bc("crypto/evp/p5_crpt.c", 63, "PKCS5_PBE_keyivgen_ex");
                v31 = 130;
LABEL_a59018:
                sub_a36abc(6, v31, 0);
LABEL_a59020:
                v38 = 0;
                v39 = 0;
            }
            else
            {
                v1 = v32;
                if (v29->field_8)
                    v33 = (st_a58e9c_1 *)(unsigned int)sub_9c1a94(v29->field_8);
                else
                    v33 = (st_a58e9c_1 *)1;
                v4 = v33;
                v2 = v29->field_0->field_0;
                if (a1)
                {
                    v34 = arm64g_calculate_condition(0x11, (unsigned long long)v26, 1, 0);
                    if (!(v34 & 1))
                        v26 = (st_a58e9c_1 *)(unsigned int)_strlen(a1);
                }
                else
                {
                    v26 = (st_a58e9c_1 *)0;
                }
                v35 = (st_a58e9c_1 *)(unsigned int)sub_a50ac8(a5);
                if (v35 < 1)
                    goto LABEL_a59020;
                v0 = v29->field_0->field_8;
                v36 = sub_a537e4(a7, "PBKDF1", v25);
                v37 = sub_a53488(v36, "PBKDF1", v25);
                sub_a53b90(v36);
                if (!v37)
                    goto LABEL_a59020;
                v39 = v37;
                sub_a71670("pass", a1, v26);
                sub_a71670("salt", v0, v2);
                v6 = v20;
                v7 = v21;
                v8 = v22;
                sub_a6ffac("iter", &v4);
                v9 = v20;
                v10 = v21;
                v11 = v22;
                v40 = v27;
                v12 = v20;
                v13 = v21;
                v14 = v22;
                sub_a71bbc(sub_a71618("digest", v40, 0), v40, 0);
                v15 = v20;
                v16 = v21;
                v17 = v22;
                if (sub_a53798(v39, &v20, v35, &v5) == 1)
                {
                    ___memcpy_chk(&v19, &v20, v1, 64);
                    ___memcpy_chk(&v18, (char *)&v21 - v3, v3, 16);
                    if (!sub_a4c694(a0, a4, 0, &v19, &v18, a6))
                        goto LABEL_a59230;
                    sub_a66ec0(&v20, 64);
                    sub_a66ec0(&v19, 64);
                    sub_a66ec0(&v18, 16);
                    v38 = 1;
                }
                else
                {
LABEL_a59230:
                    v38 = 0;
                }
            }
            sub_a53588(v39);
            sub_9c9c24(v29);
        }
        else
        {
            sub_a368c8();
            v42 = 52;
LABEL_a58f74:
            sub_a369bc("crypto/evp/p5_crpt.c", v42, "PKCS5_PBE_keyivgen_ex");
            sub_a36abc(6, 114, 0);
            v38 = 0;
        }
    }
    else
    {
        sub_a368c8();
        v42 = 46;
        goto LABEL_a58f74;
    }
    if (*(long long *)&g_10002b0 == v23)
        return v38;
    ___stack_chk_fail();
}
