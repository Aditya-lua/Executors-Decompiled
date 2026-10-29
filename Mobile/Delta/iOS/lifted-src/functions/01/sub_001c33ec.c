/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1c33ec..0x1c3568 (380 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1c33ec_1 {
    char padding_0[16];
    unsigned long long field_10;
} st_1c33ec_1;

typedef struct st_1c33ec_2 {
    char padding_0[48];
    struct st_1c33ec_3 *field_30;
} st_1c33ec_2;

typedef struct st_1c33ec_3 {
    unsigned long long field_0;
} st_1c33ec_3;

typedef struct st_1c33ec_0 {
    char field_0;
} st_1c33ec_0;


void sub_1c33ec(st_1c33ec_2 **a0, st_1c33ec_1 *a1)
{
    unsigned long long v18;  // x28
    unsigned long long v19;  // x27
    unsigned long long v28;  // x30
    unsigned long long v29;  // x25
    long long v30;  // x0
    unsigned long long v20;  // x26
    unsigned long long v21;  // x25
    unsigned long long v22;  // x24
    unsigned long long v23;  // x23
    unsigned long long v24;  // x22
    unsigned long long v25;  // x21
    unsigned long long v26;  // x20
    unsigned long long v27;  // x19
    st_1c33ec_0 **v0;  // [bp-0x88], Other Possible Types: char
    st_1c33ec_0 *v1;  // [bp-0x80]
    unsigned long long v2;  // [bp-0x78]
    unsigned long long v3;  // [bp-0x70]
    unsigned long long v4;  // [bp-0x68]
    unsigned long long v5;  // [bp-0x60]
    unsigned long long v6;  // [bp-0x58]
    unsigned long long v7;  // [bp-0x50]
    unsigned long long v8;  // [bp-0x48]
    unsigned long long v9;  // [bp-0x40]
    unsigned long long v10;  // [bp-0x38]
    unsigned long long v11;  // [bp-0x30]
    unsigned long long v12;  // [bp-0x28]
    unsigned long long v13;  // [bp-0x20]
    unsigned long long v14;  // [bp-0x18]
    char *v15;  // [bp-0x10]
    unsigned long long v16;  // [bp-0x8]
    char v17;  // [bp+0x0]

    v5 = v18;
    v6 = v19;
    v7 = v20;
    v8 = v21;
    v9 = v22;
    v10 = v23;
    v11 = v24;
    v12 = v25;
    v13 = v26;
    v14 = v27;
    v15 = &v17;
    v16 = v28;
    v1 = &v0;
    v0 = &v1;
    v29 = a1->field_10;
    if (!v29)
        *a0->field_30();
    v2 = 0;
    v3 = 0;
    v4 = 0;
    v2 = v29 + 16;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(&v2, ": ", 2);
    v30 = sub_a0c8(v29 + 40);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(&v2, v30, sub_6b08(v29 + 40));
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(&v2, "\r\n", 2);
    sub_a0c8(&v2);
    sub_6b08(&v2);
    *a0->field_30();
}
