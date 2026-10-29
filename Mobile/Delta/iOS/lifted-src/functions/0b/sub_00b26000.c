/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb26000..0xb265c0 (1472 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


unsigned int sub_b26000(unsigned int a0, unsigned int a1, unsigned long long a2)
{
    unsigned int v8;  // x0
    long long v9;  // x21
    long long v18;  // x22
    long long v19;  // x0
    unsigned int v20;  // x0
    unsigned int v21;  // x23
    unsigned int v22;  // x0
    unsigned int v23;  // x26
    long long v24;  // x0
    long long v25;  // x28
    unsigned int v26;  // x0
    long long v27;  // x27
    unsigned int v10;  // x25
    unsigned int v28;  // w24
    long long v29;  // x27
    unsigned int v30;  // x0
    long long v31;  // x21
    unsigned int v32;  // w0
    unsigned long long v33;  // x0
    unsigned int v34;  // x0
    long long v35;  // x1
    unsigned int v11;  // x19
    unsigned int v12;  // x26
    unsigned int v13;  // w0
    unsigned int v15;  // x21
    long long v16;  // x0
    unsigned int v17;  // x0
    unsigned long long v0;  // [bp-0x90]
    unsigned long long v1;  // [bp-0x88]
    long long v2;  // [bp-0x80]
    unsigned int v3;  // [bp-0x78]
    unsigned int v4;  // [bp-0x70]
    unsigned int v5;  // [bp-0x68]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v3 = 0;
    v4 = 0;
    if (a0 && a1)
    {
        v8 = sub_9ffdd0(a1);
        if (v8)
        {
            v9 = v8;
            if (a2 & 1)
            {
                if (!sub_962b90(a1))
                {
                    sub_a368c8();
                    sub_a369bc("providers/implementations/encode_decode/encode_key2text.c", 344, "ec_to_text");
                    sub_a36abc(57, 0xdd, 0);
                    sub_a6c4e8(v4, 0, "providers/implementations/encode_decode/encode_key2text.c", 378);
                    sub_a6c2e4(v3, "providers/implementations/encode_decode/encode_key2text.c", 379);
                    return 0;
                }
                v11 = sub_a19bd0(a1, &v4);
                if (!v11)
                {
                    sub_a6c4e8(v4, v11, "providers/implementations/encode_decode/encode_key2text.c", 378);
                    sub_a6c2e4(v3, "providers/implementations/encode_decode/encode_key2text.c", 379);
                    return 0;
                }
                v12 = 0;
                v10 = (unsigned int)"Private-Key";
                if (a2 & 3)
                {
LABEL_b26124:
                    if (!sub_975ff4(a1))
                    {
                        sub_a368c8();
                        sub_a369bc("providers/implementations/encode_decode/encode_key2text.c", 355, "ec_to_text");
                        sub_a36abc(57, 220, 0);
                        sub_a6c4e8(v4, v11, "providers/implementations/encode_decode/encode_key2text.c", 378);
                        sub_a6c2e4(v3, "providers/implementations/encode_decode/encode_key2text.c", 379);
                        return 0;
                    }
                    if (!sub_a19928(a1, sub_9d4f84(a1), &v3, 0))
                    {
                        sub_a6c4e8(v4, v11, "providers/implementations/encode_decode/encode_key2text.c", 378);
                        sub_a6c2e4(v3, "providers/implementations/encode_decode/encode_key2text.c", 379);
                        return 0;
                    }
                    if (!(v12 & 1))
                    {
LABEL_b26158:
                        v0 = v10;
                        v1 = sub_a1ab64(v9);
                        if ((int)sub_9d524c(a0, "%s: (%d bit)\n") < 1)
                        {
                            sub_a6c4e8(v4, v11, "providers/implementations/encode_decode/encode_key2text.c", 378);
                            sub_a6c2e4(v3, "providers/implementations/encode_decode/encode_key2text.c", 379);
                            return 0;
                        }
                    }
LABEL_b2617c:
                    if (!v4 || sub_a2fd10(a0, "priv:"))
                    {
                        if (v3)
                        {
                            if (!(a2 >> 2 & 1) || !sub_a2fd10(a0, "pub:"))
                            {
                                sub_a6c4e8(v4, v11, "providers/implementations/encode_decode/encode_key2text.c", 378);
                                sub_a6c2e4(v3, "providers/implementations/encode_decode/encode_key2text.c", 379);
                                return 0;
                            }
LABEL_b26268:
                            v16 = sub_a19700(a1);
                            if (!(sub_a1abe0(v9) & 1))
                            {
                                v17 = sub_9dddcc(v16);
                                if (v17)
                                {
                                    v18 = v17;
                                    sub_9de064();
                                    v19 = sub_a1abd4(v9);
                                    v20 = sub_c4ba8(v9);
                                    if (v20)
                                    {
                                        v21 = sub_97725c(v9);
                                        if (v21)
                                            v22 = sub_975fec(v9);
                                        else
                                            v22 = 0;
                                        v23 = sub_9ffdd0(v9);
                                        v0 = sub_a9976c(v19);
                                        if ((int)sub_9d524c(a0, "Field Type: %s\n") >= 1)
                                        {
                                            v2 = v22;
                                            v24 = sub_9de208(v18);
                                            v25 = sub_9de208(v18);
                                            v26 = sub_9de208(v18);
                                            if (v26 && !(v27 = v26, !sub_a1acc8(v9, v24, v25, v27, v18)) && sub_a1baa8(v9) && !(v0 = sub_a9976c(), (int)sub_9d524c(a0, "Basis Type: %s\n") < 1) && sub_a2fa60(a0) && sub_a2fa60(a0, "A:   ", v25) && sub_a2fa60(a0, "B:   ", v27) && !(v5 = 0, sub_a1abe8(v9), !sub_c4c40(v9)))
                                            {
                                                switch (v28)
                                                {
                                                case 2:
                                                    v29 = "Generator (compressed):";
                                                    break;
                                                case 6:
                                                    v29 = "Generator (hybrid):";
                                                    break;
                                                case 4:
                                                    v29 = "Generator (uncompressed):";
                                                    break;
                                                default:
                                                    goto LABEL_b265a8;
                                                }
                                                v30 = sub_a1dbcc(v9);
                                                if (v30)
                                                {
                                                    v31 = v30;
                                                    v32 = sub_a2fd10(a0, v29, v5, v31);
                                                    sub_a6c4e8(v5, v31, "providers/implementations/encode_decode/encode_key2text.c", 245);
                                                    if (v32 && sub_a2fa60(a0, "Order: ", v20) && (!v23 || sub_a2fa60(a0, "Cofactor: ", v23)) && (!v21 || sub_a2fd10(a0, "Seed:", v21, v2)))
                                                    {
                                                        v15 = 1;
                                                        goto LABEL_b265ac;
                                                    }
                                                }
                                            }
                                        }
                                    }
LABEL_b265a8:
                                    v15 = 0;
LABEL_b265ac:
                                    sub_9de17c(v18);
                                    sub_9dded4(v18);
                                    sub_a6c4e8(v4, v11, "providers/implementations/encode_decode/encode_key2text.c", 378);
                                    sub_a6c2e4(v3, "providers/implementations/encode_decode/encode_key2text.c", 379);
                                    return v15;
                                }
                            }
                            else
                            {
                                v33 = sub_a1abcc(v9);
                                if ((unsigned int)v33)
                                {
                                    v0 = "ASN1 OID";
                                    v1 = sub_a9976c();
                                    if ((int)sub_9d524c(a0, "%s: %s\n") >= 1)
                                    {
                                        v34 = sub_a186b4(v33);
                                        if (!v34)
                                        {
                                            sub_a6c4e8(v4, v11, "providers/implementations/encode_decode/encode_key2text.c", 378);
                                            sub_a6c2e4(v3, "providers/implementations/encode_decode/encode_key2text.c", 379);
                                            return 1;
                                        }
                                        v0 = "NIST CURVE";
                                        v1 = v34;
                                        v15 = (int)sub_9d524c(a0, "%s: %s\n") > 0;
                                        sub_a6c4e8(v4, v11, "providers/implementations/encode_decode/encode_key2text.c", 378);
                                        sub_a6c2e4(v3, "providers/implementations/encode_decode/encode_key2text.c", 379);
                                        return v15;
                                    }
                                }
                            }
                        }
                        else
                        {
                            if (a2 >> 2 & 1)
                                goto LABEL_b26268;
                        }
                    }
                    sub_a6c4e8(v4, v11, "providers/implementations/encode_decode/encode_key2text.c", 378);
                    sub_a6c2e4(v3, "providers/implementations/encode_decode/encode_key2text.c", 379);
                    return 0;
                }
            }
            else if (a2 >> 1 & 1)
            {
                v12 = 0;
                v11 = 0;
                v10 = (unsigned int)"Public-Key";
                if ((unsigned int)a2 & 3)
                    goto LABEL_b26124;
            }
            else if (!(a2 >> 2 & 1))
            {
                v10 = 0;
                v11 = 0;
                v12 = 1;
                if ((unsigned int)a2 & 3)
                    goto LABEL_b26124;
            }
            else
            {
                v13 = sub_a1abcc(v9);
                v11 = 0;
                v12 = v13 == 1172;
                if (v13 == 1172)
                    v10 = 0;
                else
                    v10 = (unsigned int)"EC-Parameters";
                if ((unsigned int)a2 & 3)
                    goto LABEL_b26124;
            }
            if (!(v12 & 1))
                goto LABEL_b26158;
            goto LABEL_b2617c;
        }
        else
        {
            sub_a368c8();
            sub_a369bc("providers/implementations/encode_decode/encode_key2text.c", 328, "ec_to_text");
            v35 = 158;
        }
    }
    else
    {
        sub_a368c8();
        sub_a369bc("providers/implementations/encode_decode/encode_key2text.c", 323, "ec_to_text");
        v35 = 786690;
    }
    sub_a36abc(57, v35, 0);
    return 0;
}
