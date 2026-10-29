/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x6cac4..0x6ce70 (940 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_6cac4_0 {
    char field_0;
} st_6cac4_0;

extern long long g_cbeb80;
extern long long g_cbed28;

long long sub_6cac4(void* a0, long long a1)
{
    long long v28;  // x22
    long long v29;  // x25
    long long v30;  // x0
    long long i;  // x22
    long long v33;  // x0
    void* v36;  // x8
    st_6cac4_0 **v0;  // [bp-0x168], Other Possible Types: char
    st_6cac4_0 *v1;  // [bp-0x160]
    unsigned long v2;  // [bp-0x158]
    unsigned long v3;  // [bp-0x150]
    unsigned long v4;  // [bp-0x148]
    char v5;  // [bp-0x140], Other Possible Types: unsigned short
    char v6;  // [bp-0x138]
    char v7;  // [bp-0x120]
    char v8;  // [bp-0x118]
    char *v9;  // [bp-0x100]
    unsigned long v10;  // [bp-0xf8]
    unsigned long v11;  // [bp-0xf0]
    char v12;  // [bp-0xe8]
    char *v13;  // [bp-0xd0], Other Possible Types: uint128_t
    uint128_t v14;  // [bp-0xc0]
    uint128_t v15;  // [bp-0xb0]
    unsigned long v16;  // [bp-0xa0]
    unsigned int v17;  // [bp-0x90]
    unsigned int v18;  // [bp-0x8c]
    char v19;  // [bp-0x88]
    unsigned long v20;  // [bp-0x80]
    unsigned long v21;  // [bp-0x78]
    unsigned long v22;  // [bp-0x70]
    char *v23;  // [bp-0x68]
    unsigned long v24;  // [bp-0x60]
    unsigned long v25;  // [bp-0x58]
    char *v26;  // [bp-0x10]
    char v27;  // [bp+0x0]

    v26 = &v27;
    v1 = &v0;
    v0 = &v1;
    std::__1::mutex::lock(a0 + 1096);
    sub_731e8(a0, a0 + 952, a0 + 960, (char)a0[1404], (int)a0[1408]);
    std::__1::mutex::unlock(a0 + 1096);
    v24 = 0;
    v25 = 0;
    v23 = &v24;
    sub_62144(&v23, (long long)a0[928], a0 + 936);
    v20 = 0;
    v21 = 0;
    v22 = 0;
    std::__1::mutex::lock(a0 + 1096);
    std::__1::mutex::unlock(a0 + 1096);
    v28 = (long long)a0[1448];
    v29 = (long long)a0[1456];
    if (v28 != v29)
    {
        v30 = sub_a0c8(v28);
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(&v20, v30, sub_6b08(v28));
        i = v28 + 24;
        if (i != v29)
        {
            do
            {
                std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(&v20, ",", 1);
                v33 = sub_a0c8(i);
                std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(&v20, v33, sub_6b08(i));
                i += 24;
            } while (i != v29);
        }
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v8, "Sec-WebSocket-Protocol", 22);
        v13 = &v8;
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::operator=(sub_62be4(&v23, &v8, &g_cbed28, &v13, &v5) + 56, &v20);
    }
    sub_7272c(a0, a0 + 904, &v23, a1);
    if (*(char *)v36 != 1)
        return sub_62aa0(&v23, v24);
    v17 = 0;
    v18 = 1;
    v16 = 0;
    v14 = 0;
    v15 = 0;
    v13 = 0;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(&v8, v36 + 56);
    v10 = 0;
    v11 = 0;
    v9 = &v10;
    sub_62144(&v9, (long long)v36[32], v36 + 40);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(&v12, v36 + 80);
    v2 = 0;
    v3 = 0;
    v4 = 0;
    v5 = 0;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(&v6, &v2);
    v7 = 0;
    sub_6aa44(&v18, &g_cbeb80, &v17, &v13, &v8, &v5);
    sub_6b0cc(a0 + 1160, &v19);
    sub_6bb04(&v19, 0);
    sub_62aa0(&v9, v10);
    if ((int)a0[1408] >= 1)
        sub_742c4(a0, (int)a0[1440]);
    return sub_62aa0(&v23, v24);
}
