/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xa20174..0xa20620 (1196 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_a20174(long long a0, unsigned long a1, long long a2)
{
    long long v10;  // x28
    unsigned long v11;  // x19
    unsigned long v20;  // x20
    unsigned long v21;  // x0
    unsigned long v22;  // x20
    unsigned long long v23;  // x0
    long long v12;  // x20
    unsigned long long v13;  // x0
    unsigned long v14;  // x21
    unsigned long v15;  // x24
    unsigned long v16;  // x20
    unsigned long v17;  // x22
    unsigned long v18;  // x23
    unsigned long long v19;  // x0
    unsigned long v0;  // [bp-0xa0], Other Possible Types: unsigned long long
    unsigned long v1;  // [bp-0x98], Other Possible Types: unsigned long long
    unsigned int v2;  // [bp-0x8c]
    unsigned long v3;  // [bp-0x88]
    unsigned long v4;  // [bp-0x80]
    long long v5;  // [bp-0x78], Other Possible Types: unsigned long
    unsigned int v6;  // [bp-0x6c]
    unsigned long v7;  // [bp-0x68]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v7 = 0;
    if (!a1)
    {
        v14 = 0;
        v18 = 0;
        v17 = 0;
        v15 = 0;
        v11 = 0;
        v12 = 786690;
        goto LABEL_a203a8;
    }
    v10 = 524320;
    v11 = sub_9dde10();
    v12 = 524291;
    if (!v11)
    {
        v14 = 0;
        v18 = 0;
        v17 = 0;
        goto LABEL_a203a0;
    }
    if (sub_a1abe0(a1))
    {
        if (sub_9d4cf4(a0, a2, 128) && !(v13 = sub_a1abcc(a1), !(unsigned int)v13 || (v0 = sub_a9976c(), (int)sub_9d524c(a0, "ASN1 OID: %s") < 1 || (int)sub_9d524c(a0, "\n") < 1)))
        {
            v14 = sub_a186b4(v13);
            if (!v14)
            {
                v15 = 0;
                v17 = 0;
                v18 = 0;
                goto LABEL_a20440;
            }
            if (!sub_9d4cf4(a0, a2, 128))
                goto LABEL_a202b0;
            v0 = v14;
            v15 = 0;
            if ((int)sub_9d524c(a0, "NIST CURVE: %s\n") >= 1)
            {
                v16 = 1;
                v17 = 0;
                v18 = 0;
                v14 = 0;
                goto LABEL_a203d8;
            }
            else
            {
                v14 = 0;
                v18 = 0;
                v17 = 0;
                v12 = v10;
                goto LABEL_a203a8;
            }
        }
        else
        {
LABEL_a202b0:
            v14 = 0;
            v18 = 0;
            v17 = 0;
            v15 = 0;
            v12 = v10;
            goto LABEL_a203a8;
        }
        goto LABEL_a203a8;
    }
    v19 = sub_a1abd4(a1);
    v17 = sub_9e4958(v19);
    if (!v17)
    {
        v14 = 0;
LABEL_a2039c:
        v18 = 0;
LABEL_a203a0:
        v15 = 0;
        goto LABEL_a203a8;
    }
    v14 = sub_9e4958();
    if (!v14)
        goto LABEL_a2039c;
    v18 = sub_9e4958();
    if (!v18 || (v12 = 524304, !sub_a1acc8(a1, v17, v14, v18, v11)))
        goto LABEL_a203a0;
    v6 = v19;
    v15 = sub_c4c40(a1);
    if (!v15)
    {
        v12 = 524304;
        goto LABEL_a203a8;
    }
    v5 = 524304;
    v20 = sub_c4ba8(a1);
    v21 = sub_9ffdd0(a1);
    v4 = v20;
    if (!v4)
    {
        v15 = 0;
LABEL_a20464:
        v12 = v5;
        goto LABEL_a203a8;
    }
    v3 = v21;
    v2 = sub_a1abe8(a1);
    v15 = sub_a1dbcc(a1, v15, v2, &v7, v11);
    if (!v15)
        goto LABEL_a20464;
    v5 = sub_97725c(a1);
    if (v5)
        v1 = sub_975fec(a1);
    else
        v1 = 0;
    v12 = v10;
    if (!sub_9d4cf4(a0, a2, 128) || (v22 = v6, v0 = sub_a9976c(v22), v12 = v10, (int)sub_9d524c(a0, "Field Type: %s\n") < 1))
        goto LABEL_a203a8;
    if ((unsigned int)v22 == 407)
    {
        v23 = sub_a1baa8(a1);
        v12 = v10;
        if ((unsigned int)v23 && !(v12 = v10, !sub_9d4cf4(a0, a2, 128) || (v0 = sub_a9976c(v23), v12 = v10, (int)sub_9d524c(a0, "Basis Type: %s\n") < 1)))
            goto LABEL_a20510;
        goto LABEL_a203a8;
    }
    else
    {
LABEL_a20510:
        v12 = v10;
        if (!sub_9cab08(a0) || (v12 = v10, !sub_9cab08(a0, "A:   ", v14, 0, a2) || (v12 = v10, !sub_9cab08(a0, "B:   ", v18, 0, a2))))
            goto LABEL_a203a8;
        if (v7)
        {
            v12 = v10;
            if (sub_a20620())
                goto LABEL_a205b0;
LABEL_a203a8:
            sub_a368c8();
            sub_a369bc("crypto/ec/eck_prn.c", 214, "ECPKParameters_print");
            sub_a36abc(16, v12, 0);
            v16 = 0;
        }
        else
        {
LABEL_a205b0:
            v12 = v10;
            if (!sub_9cab08(a0, "Order: ", v4, 0, a2) || v3 && !(v12 = v10, sub_9cab08(a0, "Cofactor: ", v3, 0, a2)) || v5 && !(v12 = v10, sub_a20620(a0, "Seed:")))
                goto LABEL_a203a8;
LABEL_a20440:
            v16 = 1;
        }
    }
LABEL_a203d8:
    sub_9e48d4(v17);
    sub_9e48d4(v14);
    sub_9e48d4(v18);
    sub_a6c4e8(v7, v15, "crypto/ec/eck_prn.c", 218);
    sub_9dded4(v11);
    return v16;
}
