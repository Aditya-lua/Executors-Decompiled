/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x122d38..0x122e7c (324 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */


long long sub_122d38(long long a0)
{
    long long v7;  // x21
    unsigned long long v8;  // x0
    long long v9;  // x2
    unsigned long v10;  // x0
    unsigned long v11;  // x20
    long long v12;  // x21
    long long v14;  // x8
    long long v0;  // [bp-0x58]
    unsigned long v1;  // [bp-0x50]
    unsigned long v2;  // [bp-0x48]
    unsigned long v3;  // [bp-0x40]
    char *v4;  // [bp-0x38], Other Possible Types: unsigned long
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v7 = sub_a0c8();
    v8 = sub_a0c8(a0);
    v2 = 0;
    v3 = 0;
    v9 = v8 + sub_6b08(a0);
    v1 = 0;
    v10 = sub_9d3c1c(sub_a38690(sub_1228c0(&v1, v7, v9, v9 - v7), v7, v9, v9 - v7));
    v11 = v10;
    v4 = v10;
    v12 = sub_9d3c1c(sub_9d8844(sub_9d3d74(v10, 0x100), 0x100));
    sub_9d4ec8(v11, v12);
    sub_9d3fec(v11, v1, (unsigned int)v2 - v1);
    sub_9d46fc(v11, 11, 0, 0);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(v14, v0, sub_9d46fc(v12, 3, 0, &v0));
    sub_12277c(&v4);
    v4 = &v1;
    return sub_30030(&v4);
}
