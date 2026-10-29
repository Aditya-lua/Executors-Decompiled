/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x67544..0x67c34 (1776 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_67544_1 {
    char padding_0[96];
    unsigned long long field_60;
} st_67544_1;

typedef struct st_67544_0 {
    char field_0;
} st_67544_0;

extern long long g_f0dc58;

unsigned long long sub_67544(st_67544_1 *a0, long long a1)
{
    long long v10;  // x0
    long long v11;  // x0
    long long v21;  // x22
    long long v22;  // x0
    long long v23;  // x23
    long long v25;  // x22
    long long v26;  // x0
    long long v27;  // x23
    long long v29;  // x0
    long long v12;  // x0
    long long len;  // x2
    long long v31;  // x1
    unsigned long long v33;  // w0
    unsigned long v34;  // x21
    long long v35;  // x0
    long long v36;  // x0
    unsigned long long v37;  // w0
    unsigned long long v38;  // x0
    long long v39;  // x22
    long long v13;  // x22
    long long v40;  // x0
    long long v41;  // x23
    unsigned long long v43;  // x0
    long long v44;  // x22
    long long v45;  // x0
    long long v46;  // x23
    long long v48;  // x22
    long long v49;  // x0
    long long v14;  // x0
    long long v50;  // x23
    long long v52;  // x0
    long long v15;  // x23
    long long v18;  // x0
    long long v19;  // x0
    st_67544_0 **v0;  // [bp-0xd0], Other Possible Types: char
    st_67544_0 *v1;  // [bp-0xc8]
    char v2;  // [bp-0xc0]
    char v3;  // [bp-0xa8]
    char v4;  // [bp-0x90], Other Possible Types: unsigned long long
    char v5;  // [bp-0x78]
    char v6;  // [bp-0x60]
    char v7;  // [bp-0x41], Other Possible Types: unsigned long long
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v1 = &v0;
    v0 = &v1;
    sub_a35af4();
    if (!sub_69140(&a0[1].padding_0[8]))
    {
LABEL_675d4:
        sub_a35af4();
        if (!(sub_690bc(&a0[1].padding_0[8]) & 1))
            goto LABEL_67824;
        goto LABEL_675e4;
    }
    v10 = sub_a0c8(&a0[1].padding_0[8]);
    if (sub_964ea8(a0->field_60, v10) == 1)
    {
        v11 = sub_a0c8(&a0[1].padding_0[32]);
        if (sub_964ccc(a0->field_60, v11, 1) == 1)
        {
            if (sub_95fae0(a0->field_60))
                goto LABEL_675d4;
            v12 = sub_a35cc4();
            v13 = sub_6b08(&a0[1].padding_0[8]);
            sub_64128(&v3, v13 + 36, &v7);
            v14 = sub_a0c8(&v3);
            sub_12478(v14, "OpenSSL failed - cert/key mismatch(\"", 36);
            v15 = v14 + 36;
            sub_12478(v15, sub_a0c8(&a0[1].padding_0[8]), v13);
            v7 = 0;
            sub_348a4(v15 + v13, 1, &v7);
            sub_5c38(&v4, std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(&v3, ", ", 2));
            v18 = sub_a0c8(&a0[1].padding_0[32]);
            v19 = std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(&v4, v18, sub_6b08(&a0[1].padding_0[32]));
            sub_5c38(&v5, v19);
            sub_5c38(&v6, std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(&v5, "\")", 2));
            sub_5ccc(a1, &v6);
        }
        else
        {
            v12 = sub_a35cc4();
            v21 = sub_6b08(&a0[1].padding_0[32]);
            sub_64128(&v5, v21 + 46, &v4);
            v22 = sub_a0c8(&v5);
            sub_12478(v22, "OpenSSL failed - SSL_CTX_use_PrivateKey_file(\"", 46);
            v23 = v22 + 46;
            sub_12478(v23, sub_a0c8(&a0[1].padding_0[32]), v21);
            v4 = 0;
            sub_348a4(v23 + v21, 1, &v4);
            std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(&v5, "\") failed: ", 11);
LABEL_677cc:
            sub_5c38(&v6);
            sub_5ccc(a1, &v6);
        }
        v29 = sub_a362b8(v12, 0);
        len = _strlen(v29, 0);
        v31 = v29;
        sub_a35af4(std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(a1, v31, len), v31, len);
        if (!(sub_690bc(&a0[1].padding_0[8]) & 1))
        {
LABEL_67824:
            if (sub_690ac(&a0[1].padding_0[8]))
            {
                if (!sub_962a88(a0->field_60))
                {
                    v35 = sub_a35cc4();
                    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::assign(a1, "OpenSSL failed - SSL_CTX_default_verify_paths loading failed: ");
                    goto LABEL_67a30;
                }
            }
            else
            {
                if (sub_69028(&a0[1].padding_0[8]))
                {
                    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(&v2, &a0[1].padding_0[56]);
                    sub_68110(a0, &v2);
                }
                else
                {
                    v36 = sub_a0c8(&a0[1].padding_0[56]);
                    if (sub_962a9c(a0->field_60, v36, 0) != 1)
                    {
                        v35 = sub_a35cc4();
                        v48 = sub_6b08(&a0[1].padding_0[56]);
                        sub_64128(&v5, v48 + 48, &v4);
                        v49 = sub_a0c8(&v5);
                        sub_12478(v49, "OpenSSL failed - SSL_CTX_load_verify_locations(\"", 48);
                        v50 = v49 + 48;
                        sub_12478(v50, sub_a0c8(&a0[1].padding_0[56]), v48);
                        v4 = 0;
                        sub_348a4(v50 + v48, 1, &v4);
                        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(&v5, "\") failed: ", 11);
LABEL_67a0c:
                        sub_5c38(&v6);
                        sub_5ccc(a1, &v6);
LABEL_67a30:
                        v52 = sub_a362b8(v35, 0);
                        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(a1, v52, _strlen(v52, 0));
                        return 0;
                    }
                }
            }
            sub_961c84(a0->field_60, 1, 0x67f38);
            sub_961c90(a0->field_60, 4);
            v37 = (unsigned int)sub_690cc(&a0[1].padding_0[8]);
            v34 = a0->field_60;
            if (v37)
            {
LABEL_67604:
                v38 = sub_961418(v34, sub_a0c8(&g_f0dc58));
                if ((unsigned int)v38 == 1)
                    return v38;
                v35 = sub_a35cc4();
                v39 = sub_6b08(&g_f0dc58);
                sub_64128(&v5, v39 + 42, &v4);
                v40 = sub_a0c8(&v5);
                sub_12478(v40, "OpenSSL failed - SSL_CTX_set_cipher_list(\"", 42);
                v41 = v40 + 42;
                sub_12478(v41, sub_a0c8(&g_f0dc58), v39);
                v4 = 0;
                sub_348a4(v41 + v39, 1, &v4);
                std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(&v5, "\") failed: ", 11);
                goto LABEL_67a0c;
            }
            else
            {
LABEL_678dc:
                v43 = sub_961418(v34, sub_a0c8(&a0[1].padding_0[80]));
                if ((unsigned int)v43 == 1)
                    return v43;
                v35 = sub_a35cc4();
                v44 = sub_6b08(&a0[1].padding_0[80]);
                sub_64128(&v5, v44 + 42, &v4);
                v45 = sub_a0c8(&v5);
                sub_12478(v45, "OpenSSL failed - SSL_CTX_set_cipher_list(\"", 42);
                v46 = v45 + 42;
                sub_12478(v46, sub_a0c8(&a0[1].padding_0[80]), v44);
                v4 = 0;
                sub_348a4(v46 + v44, 1, &v4);
                std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(&v5, "\") failed: ", 11);
                goto LABEL_67a0c;
            }
        }
LABEL_675e4:
        sub_961c84(a0->field_60, 0, 0);
        v33 = (unsigned int)sub_690cc(&a0[1].padding_0[8]);
        v34 = a0->field_60;
        if (!v33)
            goto LABEL_678dc;
        goto LABEL_67604;
    }
    else
    {
        v12 = sub_a35cc4();
        v25 = sub_6b08(&a0[1].padding_0[8]);
        sub_64128(&v5, v25 + 53, &v4);
        v26 = sub_a0c8(&v5);
        sub_12478(v26, "OpenSSL failed - SSL_CTX_use_certificate_chain_file(\"", 53);
        v27 = v26 + 53;
        sub_12478(v27, sub_a0c8(&a0[1].padding_0[8]), v25);
        v4 = 0;
        sub_348a4(v27 + v25, 1, &v4);
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(&v5, "\") failed: ", 11);
        goto LABEL_677cc;
    }
}
