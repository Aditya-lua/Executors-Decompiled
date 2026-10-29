/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa02590..0xa02960 (976 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a02590_2 {
    char padding_0[112];
    unsigned long long field_70;
    char field_78;
    char padding_79[7];
    long long field_80;
    char padding_88[24];
    struct st_a02590_0 *field_a0;
    char padding_a8[8];
    long long field_b0;
} st_a02590_2;

typedef struct st_a02590_0 {
    char padding_0[40];
    struct st_a02590_1 *field_28;
} st_a02590_0;

typedef struct st_a02590_1 {
    char field_0;
} st_a02590_1;


char sub_a02590(st_a02590_2 *a0, char a1, void* a2, long long *a3, char a4, unsigned long a5, char a6, unsigned long a7, unsigned long a8, unsigned long long a9)
{
    long long v7;  // x23
    char v8;  // x19
    char v9;  // x21
    unsigned int v10;  // w19
    unsigned int v11;  // w0
    char v13;  // x0
    char v14;  // x20
    long long v15;  // x1
    unsigned int v0;  // [bp-0x90]
    unsigned int v1;  // [bp-0x8c]
    unsigned long long v2;  // [bp-0x88]
    unsigned long v3;  // [bp-0x80]
    char v4;  // [bp-0x70]
    char v5;  // [bp-0x68]
    char *v6;  // [bp-0x10]

    v6 = &a8;
    if (*(long long *)&a0->padding_0[8] && *(long long *)&a0->padding_0[16] && *(long long *)&a0->padding_0[24])
    {
        v7 = *a3;
        if (sub_9e4828() || sub_9e4828(*(long long *)&a0->padding_0[16]) || sub_9e4828(*(long long *)&a0->padding_0[24]) || sub_9e5c94(*(long long *)&a0->padding_0[8]) || sub_9e5c94(*(long long *)&a0->padding_0[16]) || sub_9e5c94(*(long long *)&a0->padding_0[24]))
        {
            sub_a368c8();
            sub_a369bc("crypto/dsa/dsa_ossl.c", 241, "dsa_sign_setup");
            v15 = 112;
        }
        else
        {
            if (a0->field_70)
            {
                v8 = sub_9e4958();
                v9 = sub_9e4958(v8);
                v5 = 0;
                if (!v8 || !v9)
                {
LABEL_a027f0:
                    sub_a368c8();
                    sub_a369bc("crypto/dsa/dsa_ossl.c", 347, "dsa_sign_setup");
                    sub_a36abc(10, 0x80003, 0);
                    v14 = 0;
                    goto LABEL_a02824;
                }
                v4 = v8;
                v5 = a1;
                if (a1 || !(v5 = sub_9dddcc(0), !v5))
                {
                    v10 = sub_9e46a8(*(long long *)&a0->padding_0[16]);
                    v11 = sub_9e4290(*(long long *)&a0->padding_0[16]);
                    v1 = v10;
                    if ((int)v1 < 128)
                        goto LABEL_a027ec;
                    v0 = v11;
                    v8 = v4;
                    if (!sub_9e4cdc(v8, v11 + 2))
                    {
LABEL_a027e0:
                        goto LABEL_a027f0;
                    }
                    if (!sub_9e4cdc(v9, v0 + 2))
                        goto LABEL_a027ec;
                    v2 = a9;
                    v3 = a8;
                    v8 = v4;
                    do
                    {
                        if (!a4)
                        {
                            if (sub_9e93e0(v8))
                                continue;
                        }
                        else
                        {
                            if (a6 == 1)
                            {
                                if (sub_a69cd0(v8))
                                    continue;
                            }
                            else
                            {
                                if (!sub_9e953c(v8))
                                    goto LABEL_a027e0;
                            }
                        }
                    } while (sub_9e5c0c(v8, 0));
                    sub_9e5d14(v8, 4);
                    sub_9e5d14(v9, 4);
                    if (a0->field_78 & 1 && !sub_9e6fac(&a0->field_80, a0->field_b0, *(long long *)&a0->padding_0[8], v5) || !sub_9db29c(v9, v4, *(long long *)&a0->padding_0[16]) || !sub_9db29c(v4, v9, *(long long *)&a0->padding_0[16]))
                        goto LABEL_a027ec;
                    sub_9e5980(sub_9e5748(v9, v1), v4, v9, v0 + 2);
                    if (a0->field_a0->field_28)
                        a0->field_a0->field_28();
                    if (!sub_9defb0(v7, *(long long *)&a0->padding_0[24], v4, *(long long *)&a0->padding_0[8], v5, a0->field_80) || !sub_9de520(0, v7, v7, *(long long *)&a0->padding_0[16], v5) || !(v13 = sub_a02d24(v4, *(long long *)&a0->padding_0[16], v5), v13))
                        goto LABEL_a027ec;
                    sub_9e4838(*(long long *)a2);
                    *(unsigned long long *)a2 = v13;
                    v14 = 1;
                    v8 = v4;
                }
                else
                {
                    v5 = 0;
LABEL_a027ec:
                    v8 = v4;
                    goto LABEL_a027f0;
                }
LABEL_a02824:
                if (v5 != a1)
                    sub_9dded4(v5);
                sub_9e4838(v8);
                sub_9e4838(v9);
                return v14;
            }
            sub_a368c8();
            sub_a369bc("crypto/dsa/dsa_ossl.c", 245, "dsa_sign_setup");
            v15 = 111;
        }
    }
    else
    {
        sub_a368c8(*(long long *)&a0->padding_0[8]);
        sub_a369bc("crypto/dsa/dsa_ossl.c", 230, "dsa_sign_setup");
        v15 = 101;
    }
    sub_a36abc(10, v15, 0);
    return 0;
}
