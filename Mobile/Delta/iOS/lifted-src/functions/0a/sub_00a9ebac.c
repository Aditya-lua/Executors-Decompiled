/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa9ebac..0xa9ede8 (572 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a9ebac(long long *a0, unsigned int a1, long long a2)
{
    long long v2;  // x20
    long long v3;  // x19
    long long v12;  // x25
    long long v13;  // x24
    long long v14;  // x28
    long long v15;  // x26
    long long v16;  // x27
    long long v4;  // x26
    long long v5;  // x21
    long long v6;  // x23
    long long v7;  // x22
    long long v8;  // x25
    long long v9;  // x23
    long long v10;  // x28
    long long v11;  // x0
    char *v0;  // [bp-0x10]
    char v1;  // [bp+0x0]

    v0 = &v1;
    v2 = 524291;
    v3 = sub_a01fc8();
    if (!v3)
    {
        v5 = 0;
        v7 = 0;
        v9 = 0;
        v13 = 0;
        v12 = 0;
        v15 = 0;
        v2 = 524298;
LABEL_a9ecc4:
        v16 = 431;
        goto LABEL_a9ece4;
    }
    v4 = a1 + 7 >> 3;
    v5 = sub_9e5360(*a0, v4, 0);
    if (!v5)
    {
        v7 = 0;
LABEL_a9ecd0:
        v9 = 0;
LABEL_a9ecd4:
        v13 = 0;
        goto LABEL_a9ecd8;
    }
    v6 = *a0 + v4;
    v7 = sub_9e5360(v6, 20, 0);
    if (!v7)
        goto LABEL_a9ecd0;
    v8 = v6 + 20;
    v9 = sub_9e5360(v8, v4, 0);
    if (!v9)
        goto LABEL_a9ecd4;
    v10 = v8 + v4;
    v11 = v10;
    if (a2)
    {
        v12 = sub_9e5360(v11, v4, 0);
        v13 = 0;
        if (v12)
        {
            v14 = v10 + v4;
            goto LABEL_a9ec6c;
        }
    }
    else
    {
        v13 = sub_9e5360(v11, 20, 0);
        if (!v13)
        {
LABEL_a9ecd8:
            v12 = 0;
        }
        else
        {
            v12 = sub_9e4958(sub_9e5d14(v13, 4), 4);
            if (v12)
            {
                v15 = sub_9dde10();
                if (!v15 || !sub_9dea6c(v12, v9, v13, v5, v15))
                {
LABEL_a9ece0:
                    v16 = 434;
LABEL_a9ece4:
                    sub_a368c8();
                    sub_a369bc("crypto/pem/pvkfmt.c", v16, "ossl_b2i_DSA_after_header");
                    sub_a36abc(9, v2, 0);
                    sub_a01fd4(v3);
                    sub_9e48d4(v5);
                    sub_9e48d4(v7);
                    sub_9e48d4(v9);
                    sub_9e48d4(v12);
                    sub_9e48d4(v13);
                    sub_9dded4(v15);
                    return 0;
                }
                v14 = v10 + 20;
                sub_9dded4(v15);
LABEL_a9ec6c:
                if (sub_a020b8(v3, v5, v7, v9))
                {
                    if (sub_a02150(v3, v12, v13))
                    {
                        *a0 = v14;
                        return v3;
                    }
                    v5 = 0;
                    v7 = 0;
                    v9 = 0;
                    goto LABEL_a9ecc4;
                }
                else
                {
                    goto LABEL_a9ecc4;
                }
                goto LABEL_a9ecc4;
            }
        }
    }
    v15 = 0;
    goto LABEL_a9ece0;
}
