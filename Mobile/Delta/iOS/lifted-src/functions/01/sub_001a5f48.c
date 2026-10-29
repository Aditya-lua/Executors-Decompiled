/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a5f48..0x1a635c (1044 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1a5f48_1 {
    struct st_1a5f48_0 *field_0;
} st_1a5f48_1;

typedef struct st_1a5f48_0 {
    char field_0;
} st_1a5f48_0;


long long sub_1a5f48(long long a0, long long a1)
{
    long long v5;  // x22
    long long v6;  // x0
    long long v16;  // x0
    long long v18;  // x21
    long long v19;  // x0
    long long v20;  // x22
    long long v23;  // x0
    long long v7;  // x23
    long long v25;  // x21
    long long v26;  // x0
    long long v27;  // x22
    long long v30;  // x0
    long long v10;  // x8
    long long v11;  // x21
    long long v12;  // x0
    long long v13;  // x22
    st_1a5f48_0 **v0;  // [bp-0x78], Other Possible Types: st_1a5f48_1 **, char
    char *v1;  // [bp-0x60], Other Possible Types: st_1a5f48_1 **, char
    char v2;  // [bp-0x41]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v5 = sub_6b08(a1);
    sub_64128(&v1, v5 + 2, &v0);
    v6 = sub_a0c8(&v1);
    sub_12478(v6, "--", 2);
    v7 = v6 + 2;
    sub_12478(v7, sub_a0c8(a1), v5);
    v0 = 0;
    sub_348a4(v7 + v5, 1, &v0);
    sub_5c38(v10, std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(&v1, "\r\n", 2));
    v11 = sub_6b08(a0);
    sub_64128(&v0, v11 + 38, &v2);
    v12 = sub_a0c8(&v0);
    sub_12478(v12, "Content-Disposition: form-data; name=\"", 38);
    v13 = v12 + 38;
    sub_12478(v13, sub_a0c8(a0), v11);
    v2 = 0;
    sub_348a4(v13 + v11, 1, &v2);
    sub_5c38(&v1, std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(&v0, "\"", 1));
    v16 = sub_a0c8(&v1);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(v10, v16, sub_6b08(&v1));
    v1 = &v0;
    v0 = &v1;
    if (sub_6b08(a0 + 48))
    {
        v18 = sub_6b08(a0 + 48);
        sub_64128(&v0, v18 + 12, &v2);
        v19 = sub_a0c8(&v0);
        sub_12478(v19, "; filename=\"", 12);
        v20 = v19 + 12;
        sub_12478(v20, sub_a0c8(a0 + 48), v18);
        v2 = 0;
        sub_348a4(v20 + v18, 1, &v2);
        sub_5c38(&v1, std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(&v0, "\"", 1));
        v23 = sub_a0c8(&v1);
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(v10, v23, sub_6b08(&v1));
    }
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(v10, "\r\n", 2);
    v1 = &v0;
    v0 = &v1;
    if (!sub_6b08(a0 + 72))
        return std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(v10, "\r\n", 2);
    v25 = sub_6b08(a0 + 72);
    sub_64128(&v0, v25 + 14, &v2);
    v26 = sub_a0c8(&v0);
    sub_12478(v26, "Content-Type: ", 14);
    v27 = v26 + 14;
    sub_12478(v27, sub_a0c8(a0 + 72), v25);
    v2 = 0;
    sub_348a4(v27 + v25, 1, &v2);
    sub_5c38(&v1, std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(&v0, "\r\n", 2));
    v30 = sub_a0c8(&v1);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(v10, v30, sub_6b08(&v1));
    return std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(v10, "\r\n", 2);
}
