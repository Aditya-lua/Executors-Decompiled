/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1bd098..0x1bd220 (392 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


char * sub_1bd098(long long a0, long long a1, long long a2, long long a3)
{
    long long v6;  // x24
    long long v7;  // x0
    long long v8;  // x25
    char v0;  // [bp-0x98]
    char v1;  // [bp-0x80]
    char v2;  // [bp-0x68]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    sub_1bd564(16);
    sub_5c38(&v1, std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::insert(&v2, 0, "--cpp-httplib-multipart-data-", 29));
    v6 = sub_6b08(&v1);
    sub_64128(&v2, v6 + 30, &v0);
    v7 = sub_a0c8(&v2);
    sub_12478(v7, "multipart/form-data; boundary=", 30);
    v8 = v7 + 30;
    sub_12478(v8, sub_a0c8(&v1), v6);
    v0 = 0;
    sub_348a4(v8 + v6, 1, &v0);
    sub_1a85f4(a3, &v1, 1);
    sub_1bf098(a0, a1, a2, &v0, &v2);
    return &v1;
}
