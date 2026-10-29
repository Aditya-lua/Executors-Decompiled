/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x688d4..0x68fc4 (1776 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_688d4_2 {
    char padding_0[8];
    unsigned long long field_8;
} st_688d4_2;

typedef struct st_688d4_1 {
    char padding_0[8];
    char field_8;
    char padding_9[79];
    unsigned long long field_58;
    char field_60;
    char padding_61[7];
    unsigned long long field_68;
} st_688d4_1;

typedef struct st_688d4_0 {
    char field_0;
} st_688d4_0;

extern long long g_f0d0d8;
extern long long g_f0dc58;

unsigned long long sub_688d4(st_688d4_1 *a0, long long a1)
{
    unsigned long long v8;  // 4112
    unsigned long long v9;  // x0
    long long v20;  // x0
    long long v22;  // x0
    long long v23;  // x22
    long long v24;  // x0
    long long v25;  // x23
    unsigned long long v10;  // x0
    long long v28;  // x0
    long long v30;  // x0
    long long v31;  // x0
    long long v33;  // x0
    long long v34;  // x0
    long long v35;  // x0
    long long v37;  // x0
    st_688d4_2 *v11;  // x24
    long long v38;  // x0
    long long v40;  // x0
    unsigned long long v41;  // w0
    long long v42;  // x0
    unsigned long long v43;  // x0
    unsigned long long v45;  // x0
    long long v12;  // x0
    long long v13;  // x0
    long long v14;  // x0
    long long v15;  // x22
    long long v16;  // x0
    long long v17;  // x23
    st_688d4_0 **v0;  // [bp-0xa0], Other Possible Types: char
    st_688d4_0 *v1;  // [bp-0x98]
    char v2;  // [bp-0x90]
    char v3;  // [bp-0x78]
    char v4;  // [bp-0x60]
    unsigned long long v5;  // [bp-0x41], Other Possible Types: char
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v1 = &v0;
    v0 = &v1;
    std::__1::mutex::lock(&a0[2].padding_9[15]);
    if (sub_60768(&g_f0d0d8, 5) & 1)
    {
        v8 = arm64g_calculate_condition(1, sub_66808(&a0->field_8, 5) & 0xffffffff, 1, 0);
        if (!(v8 & 1))
        {
            v9 = sub_954160();
            if (v9)
            {
                a0->field_68 = v9;
                v10 = sub_961bfc();
                *(unsigned long long *)&a0->field_60 = v10;
                v11 = &a0->field_60;
                if (v10)
                {
                    sub_960f58();
                    sub_960f58(v11->padding_0, 33, 2, 0);
                    sub_962f5c(v11->padding_0, 2181040208);
                    if (v11->padding_0)
                    {
                        sub_a35af4();
                        if (sub_69140(a0 + 1))
                        {
                            v12 = sub_a0c8(a0 + 1);
                            if (sub_964ea8(v11->padding_0, v12) == 1)
                            {
                                v13 = sub_a0c8(&a0[1].padding_9[15]);
                                if (sub_964ccc(*(long long *)&a0->field_60, v13, 1) != 1)
                                {
                                    v14 = sub_a35cc4();
                                    v15 = sub_6b08(&a0[1].padding_9[15]);
                                    sub_64128(&v3, v15 + 46, &v5);
                                    v16 = sub_a0c8(&v3);
                                    sub_12478(v16, "OpenSSL failed - SSL_CTX_use_PrivateKey_file(\"", 46);
                                    v17 = v16 + 46;
                                    sub_12478(v17, sub_a0c8(&a0[1].padding_9[15]), v15);
                                    v5 = 0;
                                    sub_348a4(v17 + v15, 1, &v5);
                                    sub_5c38(&v4, std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(&v3, "\") failed: ", 11));
                                    sub_5ccc(a1, &v4);
                                    v20 = sub_a362b8(v14, 0);
                                    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(a1, v20, _strlen(v20, 0));
                                }
                            }
                            else
                            {
                                v22 = sub_a35cc4();
                                v23 = sub_6b08(a0 + 1);
                                sub_64128(&v3, v23 + 53, &v5);
                                v24 = sub_a0c8(&v3);
                                sub_12478(v24, "OpenSSL failed - SSL_CTX_use_certificate_chain_file(\"", 53);
                                v25 = v24 + 53;
                                sub_12478(v25, sub_a0c8(a0 + 1), v23);
                                v5 = 0;
                                sub_348a4(v25 + v23, 1, &v5);
                                sub_5c38(&v4, std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(&v3, "\") failed: ", 11));
                                sub_5ccc(a1, &v4);
                                v28 = sub_a362b8(v22, 0);
                                std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(a1, v28, _strlen(v28, 0));
                            }
                        }
                        sub_a35af4();
                        if (sub_690bc(a0 + 1) & 1)
                        {
                            sub_961c84(v11->padding_0, 0, 0);
                        }
                        else
                        {
                            if (sub_690ac(a0 + 1))
                            {
                                if (!sub_962a88(v11->padding_0))
                                {
                                    v30 = sub_a35cc4();
                                    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::assign(a1, "OpenSSL failed - SSL_CTX_default_verify_paths loading failed: ");
                                    v31 = sub_a362b8(v30, 0);
                                    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(a1, v31, _strlen(v31, 0));
                                }
                            }
                            else
                            {
                                if (sub_69028(a0 + 1))
                                {
                                    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(&v2, &a0[1].padding_9[39]);
                                    sub_68110(a0, &v2);
                                }
                                else
                                {
                                    v33 = sub_a0c8(&a0[1].padding_9[39]);
                                    if (sub_959338(v33))
                                    {
                                        sub_958f34(v11->padding_0);
                                        if (sub_962a9c(v11->padding_0, v33, 0) != 1)
                                        {
                                            v34 = sub_a35cc4();
                                            std::__1::operator+<char,std::__1::char_traits<char>,std::__1::allocator<char>>("OpenSSL failed - SSL_CTX_load_verify_locations(\"", &a0[1].padding_9[39]);
                                            sub_6826c(&v3, "\") failed: ");
                                            sub_5ccc(a1, &v4);
                                            v35 = sub_a362b8(v34, 0);
                                            std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(a1, v35, _strlen(v35, 0));
                                        }
                                    }
                                    else
                                    {
                                        v37 = sub_a35cc4();
                                        std::__1::operator+<char,std::__1::char_traits<char>,std::__1::allocator<char>>("OpenSSL failed - SSL_load_client_CA_file('", &a0[1].padding_9[39]);
                                        sub_6826c(&v3, "') failed: ");
                                        sub_5ccc(a1, &v4);
                                        v38 = sub_a362b8(v37, 0);
                                        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(a1, v38, _strlen(v38, 0));
                                    }
                                }
                            }
                            sub_961c84(v11->padding_0, 3, 0);
                            sub_961c90(v11->padding_0, 4);
                        }
                        if (sub_690cc(a0 + 1))
                        {
                            v40 = sub_a0c8(&g_f0dc58);
                            v41 = (unsigned int)sub_961418(v11->padding_0, v40);
                        }
                        else
                        {
                            v42 = sub_a0c8(&a0[1].padding_9[63]);
                            v41 = (unsigned int)sub_961418(v11->padding_0, v42);
                        }
                        if (v41 == 1)
                        {
                            v43 = sub_95e294(v11->padding_0);
                            a0->field_58 = v43;
                            if (v43)
                            {
                                sub_95f93c(v43, sub_66808(&a0->field_8, 5));
                                v45 = sub_682d0(a0, a1);
                                std::__1::mutex::unlock(&a0[2].padding_9[15]);
                                if (!(v45 & 1))
                                {
                                    sub_67290(a0);
                                    return 0;
                                }
                                return 1;
                            }
                            std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::assign(a1, "OpenSSL failed to connect");
                            sub_95e3b8(v11->padding_0);
                            *(unsigned long long *)v11->padding_0 = 0;
                        }
                    }
                }
            }
            else
            {
                std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::assign(a1, "SSLv23_server_method failure");
                *(unsigned long long *)&a0->field_60 = 0;
            }
        }
    }
    else
    {
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::assign(a1, "OPENSSL_init_ssl failure");
    }
    std::__1::mutex::unlock(&a0[2].padding_9[15]);
    return 0;
}
