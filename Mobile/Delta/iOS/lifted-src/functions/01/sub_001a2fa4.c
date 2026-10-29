/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a2fa4..0x1a3b40 (2972 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1a2fa4_4 {
    char padding_0[48];
    struct st_1a2fa4_5 *field_30;
} st_1a2fa4_4;

typedef struct st_1a2fa4_6 {
    struct st_1a2fa4_4 *field_0;
    char padding_8[288];
    char field_128;
    char padding_129[135];
    char field_1b0;
    char padding_1b1[23];
    char field_1c8;
    char padding_1c9[23];
    char field_1e0;
    char padding_1e1[73];
    long long field_22a;
} st_1a2fa4_6;

typedef struct st_1a2fa4_3 {
    char padding_0[24];
    char field_18;
    char padding_19[23];
    char field_30;
    char padding_31[23];
    char field_48;
    char padding_49[39];
    char field_70;
    char padding_71[479];
    long long field_250;
    char padding_258[32];
    char field_278;
} st_1a2fa4_3;

typedef struct st_1a2fa4_5 {
    unsigned long long field_0;
} st_1a2fa4_5;

typedef struct st_1a2fa4_1 {
    struct st_1a2fa4_2 *field_0;
} st_1a2fa4_1;

typedef struct st_1a2fa4_2 {
    struct st_1a2fa4_1 *field_0;
} st_1a2fa4_2;

typedef struct st_1a2fa4_0 {
    char field_0;
} st_1a2fa4_0;

extern char g_e70228;
extern unsigned long long g_e72100;
extern unsigned long long g_e722e0;

void sub_1a2fa4(st_1a2fa4_6 *a0, long long a1, st_1a2fa4_3 *a2, unsigned long long a3, long long *a4)
{
    unsigned long long v19;  // x26
    unsigned long long v20;  // x25
    long long v30;  // x0
    unsigned long long *v31;  // x23
    unsigned long long v21;  // x24
    unsigned long long v22;  // x23
    unsigned long long v23;  // x22
    unsigned long long v24;  // x21
    unsigned long long v25;  // x20
    unsigned long long v26;  // x19
    unsigned long long v27;  // x30
    st_1a2fa4_0 **v0;  // [bp-0xc0], Other Possible Types: char
    st_1a2fa4_0 *v1;  // [bp-0xb8]
    st_1a2fa4_2 **v2;  // [bp-0xb0]
    st_1a2fa4_2 **v3;  // [bp-0x98], Other Possible Types: unsigned long long
    unsigned long long v4;  // [bp-0x90]
    unsigned long long v5;  // [bp-0x88]
    unsigned long long v6;  // [bp-0x80]
    st_1a2fa4_2 **v7;  // [bp-0x68]
    unsigned long long v8;  // [bp-0x50]
    unsigned long long v9;  // [bp-0x48]
    unsigned long long v10;  // [bp-0x40]
    unsigned long long v11;  // [bp-0x38]
    unsigned long long v12;  // [bp-0x30]
    unsigned long long v13;  // [bp-0x28]
    unsigned long long v14;  // [bp-0x20]
    unsigned long long v15;  // [bp-0x18]
    char *v16;  // [bp-0x10]
    unsigned long long v17;  // [bp-0x8]
    char v18;  // [bp+0x0]

    v8 = v19;
    v9 = v20;
    v10 = v21;
    v11 = v22;
    v12 = v23;
    v13 = v24;
    v14 = v25;
    v15 = v26;
    v16 = &v18;
    v17 = v27;
    v1 = &v0;
    v0 = &v1;
    if (a3)
    {
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v3, "Connection", 10);
        v7 = &v2;
        v2 = &v7;
        if (!sub_1bf324(&a2->field_48, &v3))
        {
            std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v3, "Connection", 10);
            std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v7, "close", 5);
            sub_1bdca8(a2, &v3, &v7);
        }
    }
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v3, "Host", 4);
    v7 = &v2;
    v2 = &v7;
    if (!sub_1bf324(&a2->field_48, &v3))
        a0->field_0->field_30();
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v3, "Accept", 6);
    v7 = &v2;
    v2 = &v7;
    if (!sub_1bf324(&a2->field_48, &v3))
    {
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v3, "Accept", 6);
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v7, "*/*", 3);
        sub_1bdca8(a2, &v3, &v7);
        if (!*(long long *)&a2->padding_71[423])
        {
LABEL_1a31f8:
            std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v3, "Accept-Encoding", 15);
            v7 = &v2;
            v2 = &v7;
            if (!sub_1bf324(&a2->field_48, &v3))
            {
                v3 = 0;
                v4 = 0;
                v5 = 0;
                std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v7, "Accept-Encoding", 15);
                sub_1bdca8(a2, &v7, &v3);
            }
            std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v3, "User-Agent", 10);
            v7 = &v2;
            v2 = &v7;
            if (!sub_1bf324(&a2->field_48, &v3))
            {
                std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v7, "cpp-httplib/", 12);
                sub_5c38(&v3, std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(&v7, "0.20.1", 6));
                std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v7, "User-Agent", 10);
                sub_1bdca8(a2, &v7, &v3);
            }
        }
    }
    else if (!(*(long long *)&a2->padding_71[423]))
    {
        goto LABEL_1a31f8;
    }
    v3 = &v7;
    v7 = &v3;
    if (sub_6b08(&a2->field_70))
    {
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v3, "Content-Type", 12);
        v7 = &v2;
        v2 = &v7;
        if (!sub_1bf324(&a2->field_48, &v3))
        {
            std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v3, "Content-Type", 12);
            std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v7, "text/plain", 10);
            sub_1bdca8(a2, &v3, &v7);
        }
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v3, "Content-Length", 14);
        v7 = &v2;
        v2 = &v7;
        if (sub_1bf324(&a2->field_48, &v3))
            goto LABEL_1a3544;
        std::__1::to_string(sub_6b08(&a2->field_70));
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v7, "Content-Length", 14);
        sub_1bdca8(a2, &v7, &v3);
        goto LABEL_1a3534;
    }
    if (*(long long *)&a2->padding_258[24])
    {
        if (a2->field_278 & 1 || !(std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v3, "Content-Length", 14), v7 = &v2, v2 = &v7, !sub_1bf324(&a2->field_48, &v3)))
            goto LABEL_1a3544;
        std::__1::to_string(a2->field_250);
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v7, "Content-Length", 14);
        sub_1bdca8(a2, &v7, &v3);
        goto LABEL_1a3534;
    }
    else if (sub_9fd8(a2, "POST") & 1 || sub_9fd8(a2, "PUT") & 1 || sub_9fd8(a2, "PATCH"))
    {
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v3, "Content-Length", 14);
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v7, "0", 1);
        sub_1bdca8(a2, &v3, &v7);
LABEL_1a3534:
    }
LABEL_1a3544:
    v3 = &v7;
    v7 = &v3;
    if (sub_6b08(&a0->field_1c8) || (v3 = &v7, v7 = &v3, sub_6b08(&a0->field_1b0)))
    {
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v3, "Authorization", 13);
        v7 = &v2;
        v2 = &v7;
        if (!sub_1bf324(&a2->field_48, &v3))
        {
            sub_1a4ef8(&a0->field_1b0, &a0->field_1c8, 0);
            sub_1bd4b4(&a2->field_48, &v3);
        }
    }
    v3 = &v7;
    v7 = &v3;
    if (!sub_6b08(&a0[1].padding_8[88]) || !(v3 = &v7, v7 = &v3, sub_6b08(&a0[1].padding_8[112]) && (std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v3, "Proxy-Authorization", 19), v7 = &v2, v2 = &v7, !sub_1bf324(&a2->field_48, &v3))))
    {
        v3 = &v7;
        v7 = &v3;
        if (sub_6b08(&a0->field_1e0))
            goto LABEL_1a3668;
    }
    else
    {
        sub_1a4ef8(&a0[1].padding_8[88], &a0[1].padding_8[112], 1);
        sub_1bd4b4(&a2->field_48, &v3);
        v3 = &v7;
        v7 = &v3;
        if (sub_6b08(&a0->field_1e0))
        {
LABEL_1a3668:
            std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v3, "Authorization", 13);
            v7 = &v2;
            v2 = &v7;
            if (!sub_1bf324(&a2->field_48, &v3))
            {
                sub_1b5180(&a0->field_1e0, 0);
                sub_1bd4b4(&a2->field_48, &v3);
            }
        }
    }
    v3 = &v7;
    v7 = &v3;
    if (sub_6b08(&a0[1].padding_8[0x88]))
    {
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v3, "Proxy-Authorization", 19);
        v7 = &v2;
        v2 = &v7;
        if (!sub_1bf324(&a2->field_48, &v3))
        {
            sub_1b5180(&a0[1].padding_8[0x88], 1);
            sub_1bd4b4(&a2->field_48, &v3);
        }
    }
    v3 = &g_e70228;
    v4 = 0;
    v6 = 0;
    if (*(long long *)&a2->padding_31[15])
        sub_1c1904(&a2->field_18, &a2->field_30);
    else
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(&v7, &a2->field_18);
    if ((a0->padding_1e1)[1] == 1)
        sub_1bbf04(&v7);
    else
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(&v2, &v7);
    sub_1c6848(&v3, a2, &v2);
    sub_664e4(&a0->field_128, &v3, &a2->field_48);
    v30 = sub_a0c8(&v4);
    if (sub_1c7708(a1, v30, sub_6b08(&v4)) & 1)
    {
        v31 = &g_e72100;
    }
    else
    {
        *(unsigned int *)a4 = 5;
        v31 = &g_e722e0;
    }
    goto *((void *)(*v31));
}
