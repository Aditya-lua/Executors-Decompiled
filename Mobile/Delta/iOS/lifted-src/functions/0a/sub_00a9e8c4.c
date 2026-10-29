/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa9e8c4..0xa9ebac (744 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_a9e8c4_0 {
    unsigned int field_0;
} st_a9e8c4_0;


long long sub_a9e8c4(st_a9e8c4_0 **a0, unsigned int a1, long long a2)
{
    long long v6;  // x20
    long long v7;  // x21
    long long v16;  // x25
    long long v17;  // x27
    long long v18;  // x26
    long long v19;  // x28
    long long v20;  // x27
    long long v21;  // x28
    long long v22;  // x19
    unsigned long v8;  // x25
    long long v9;  // x28
    long long v10;  // x22
    unsigned int *v11;  // x25
    long long v12;  // x24
    long long v13;  // x24
    long long v14;  // x23
    long long v15;  // x26
    long long v0;  // [bp-0x7c]
    long long v1;  // [bp-0x78]
    long long v2;  // [bp-0x70]
    long long v3;  // [bp-0x68]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v6 = 524291;
    v3 = sub_ab11bc();
    if (v3)
    {
        v7 = sub_9e4958();
        if (!v7 || (v8 = *a0 + 1, !sub_9e4d58(v7, *(int *)*a0)))
        {
            v10 = 0;
LABEL_a9e978:
            v14 = 0;
            goto LABEL_a9e980;
        }
        v9 = a1 + 7 >> 3;
        v10 = sub_9e5360(v8, v9, 0);
        if (!v10)
            goto LABEL_a9e978;
        v11 = v8 + v9;
        if (a2)
        {
            v12 = 0;
            goto LABEL_a9e950;
        }
        else
        {
            v13 = a1 + 15 >> 4;
            v14 = sub_9e5360(v11, v13, 0);
            if (!v14)
            {
LABEL_a9e980:
                v16 = 0;
                goto LABEL_a9e984;
            }
            v15 = (char *)v11 + v13;
            v16 = sub_9e5360(v15, v13, 0);
            if (!v16)
            {
LABEL_a9e984:
                v18 = 0;
                goto LABEL_a9e988;
            }
            v17 = v15 + v13;
            v18 = sub_9e5360(v17, v13, 0);
            if (!v18)
            {
LABEL_a9e988:
                v20 = 0;
                goto LABEL_a9e98c;
            }
            v2 = v9;
            v19 = v17 + v13;
            v20 = sub_9e5360(v19, v13, 0);
            if (v20)
            {
                v1 = v19 + v13;
                v21 = sub_9e5360(v1, v13, 0);
                if (v21)
                {
                    v1 += v13;
                    v12 = sub_9e5360(v1, v2, 0);
                    if (!v12)
                        goto LABEL_a9eb84;
                    if (sub_ab1958(v3, v14, v16))
                    {
                        v0 = 524292;
                        if (sub_ab19f0(v3, v18, v20, v21))
                        {
                            v11 = v1 + v2;
LABEL_a9e950:
                            if (sub_ab18b8(v3, v10, v7, v12))
                            {
                                *a0 = v11;
                                return v3;
                            }
                            goto LABEL_a9e9b8;
                            goto LABEL_a9e9b8;
                        }
                        else
                        {
                            v14 = 0;
                            v16 = 0;
                            v22 = 496;
                            v6 = v0;
                        }
                    }
                    else
                    {
                        v22 = 496;
                        v6 = 524292;
                    }
                }
                else
                {
                    v12 = 0;
LABEL_a9eb84:
                    v22 = 499;
                }
            }
            else
            {
                v12 = 0;
LABEL_a9e98c:
                v21 = 0;
                v22 = 499;
            }
        }
    }
    else
    {
        v10 = 0;
        v12 = 0;
        v7 = 0;
        v21 = 0;
        v20 = 0;
        v18 = 0;
        v16 = 0;
        v14 = 0;
LABEL_a9e9b8:
        v6 = 524292;
        v22 = 496;
    }
    sub_a368c8();
    sub_a369bc("crypto/pem/pvkfmt.c", v22, "ossl_b2i_RSA_after_header");
    sub_a36abc(9, v6, 0);
    sub_9e48d4(v7);
    sub_9e48d4(v10);
    sub_9e48d4(v14);
    sub_9e48d4(v16);
    sub_9e48d4(v18);
    sub_9e48d4(v20);
    sub_9e48d4(v21);
    sub_9e48d4(v12);
    sub_ab1360(v3);
    return 0;
}
