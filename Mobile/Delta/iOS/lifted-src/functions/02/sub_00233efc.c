/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x233efc..0x2346e4 (2024 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_233efc_1 {
    struct st_233efc_2 *field_0;
    char padding_8[4];
    unsigned int field_c;
} st_233efc_1;

typedef struct st_233efc_4 {
    struct st_233efc_2 *field_0;
    unsigned int field_8[2];
    long long field_c;
    unsigned short field_10;
    char padding_12[6];
    unsigned long long field_18;
    unsigned long long field_20;
    unsigned long long field_28;
} st_233efc_4;

typedef struct st_233efc_10 {
    unsigned long long field_0;
    uint128_t field_8;
    uint128_t field_18;
    char field_28[28];
    char field_34;
} st_233efc_10;

typedef struct st_233efc_3 {
    unsigned long long field_0;
} st_233efc_3;

typedef struct st_233efc_9 {
    uint128_t field_0;
    unsigned long long field_10;
    uint128_t field_18;
    uint128_t field_28;
    char field_38[28];
    char field_44;
} st_233efc_9;

typedef struct st_233efc_2 {
    char padding_0[80];
    struct st_233efc_3 *field_50;
    struct st_233efc_1 *field_58;
} st_233efc_2;

typedef struct st_233efc_8 {
    uint128_t field_0;
    uint128_t field_10;
    unsigned long long field_20;
    uint128_t field_28;
    uint128_t field_38;
    char field_48[28];
    char field_54;
} st_233efc_8;

typedef struct st_233efc_0 {
    char field_0;
} st_233efc_0;

typedef struct st_233efc_7 {
    char padding_0[280];
    struct st_233efc_3 *field_118;
} st_233efc_7;

typedef struct st_233efc_6 {
    char padding_0[928];
    unsigned long long field_3a0;
} st_233efc_6;

extern char g_e6a8d8;
extern st_233efc_6 *g_f0d198;
extern st_233efc_7 *g_f0d3d8;
extern unsigned long long g_f0d528;
extern char g_10002b0;

void sub_233efc(void* a0, st_233efc_2 *a1, long long a2)
{
    unsigned long long v42;  // x28
    unsigned long long v43;  // x27
    unsigned long long v52;  // x30
    long long len1;  // x0
    long long v55;  // x0
    long long v57;  // x0
    long long v58;  // x0
    long long v60;  // x0
    long long v61;  // x0
    unsigned long long v44;  // x26
    st_233efc_4 *v62;  // x0
    st_233efc_1 *v63;  // x8
    unsigned long long v45;  // x25
    unsigned long long v46;  // x24
    unsigned long long v47;  // x23
    unsigned long long v48;  // x22
    unsigned long long v49;  // x21
    unsigned long long v50;  // x20
    unsigned long long v51;  // x19
    st_233efc_10 *v0;  // [bp-0x1c8]
    st_233efc_9 *v1;  // [bp-0x1c0]
    st_233efc_8 *v2;  // [bp-0x1b8]
    st_233efc_0 **v3;  // [bp-0x1b0], Other Possible Types: char
    st_233efc_0 *v4;  // [bp-0x1a8]
    st_233efc_0 **v5;  // [bp-0x1a0], Other Possible Types: char, uint128_t
    uint128_t v6;  // [bp-0x180], Other Possible Types: uint128_t
    char *v7;  // [bp-0x170], Other Possible Types: uint128_t, uint128_t
    unsigned long v8;  // [bp-0x168]
    unsigned long v9;  // [bp-0x160]
    st_233efc_0 **v10;  // [bp-0x150], Other Possible Types: char
    uint128_t v11;  // [bp-0x130], Other Possible Types: char
    long long v12;  // [bp-0x128]
    uint128_t v13;  // [bp-0x120], Other Possible Types: unsigned long long *
    unsigned long v14;  // [bp-0x120]
    uint128_t v15;  // [bp-0x110]
    char v16;  // [bp-0x100]
    char v17;  // [bp-0xe8]
    unsigned short v18;  // [bp-0xd0]
    long long v19;  // [bp-0xcf]
    unsigned long v20;  // [bp-0xc8]
    unsigned long v21;  // [bp-0xc0]
    unsigned long v22;  // [bp-0xb8]
    char v23;  // [bp-0xb0]
    uint128_t v24;  // [bp-0xa0]
    st_233efc_0 *v25;  // [bp-0x90], Other Possible Types: uint128_t, unsigned long
    unsigned long v26;  // [bp-0x90]
    unsigned long v27;  // [bp-0x88]
    unsigned long v28;  // [bp-0x70]
    unsigned long long v29;  // [bp-0x60]
    unsigned long long v30;  // [bp-0x58]
    unsigned long long v31;  // [bp-0x50]
    unsigned long long v32;  // [bp-0x48]
    unsigned long long v33;  // [bp-0x40]
    unsigned long long v34;  // [bp-0x38]
    unsigned long long v35;  // [bp-0x30]
    unsigned long long v36;  // [bp-0x28]
    unsigned long long v37;  // [bp-0x20]
    unsigned long long v38;  // [bp-0x18]
    char *v39;  // [bp-0x10]
    unsigned long long v40;  // [bp-0x8]
    char v41;  // [bp+0x0]

    v29 = v42;
    v30 = v43;
    v31 = v44;
    v32 = v45;
    v33 = v46;
    v34 = v47;
    v35 = v48;
    v36 = v49;
    v37 = v50;
    v38 = v51;
    v39 = &v41;
    v40 = v52;
    v28 = *(long long *)&g_10002b0;
    v4 = &v3;
    v3 = &v4;
    *(unsigned long long *)a0 = 850045863;
    *(uint128_t *)&a0[88] = 0;
    *(uint128_t *)&a0[120] = 0;
    *(uint128_t *)&a0[0x88] = 0;
    *(unsigned long long *)&a0[152] = 850045863;
    *(uint128_t *)&a0[8] = 0;
    *(uint128_t *)&a0[24] = 0;
    *(uint128_t *)&a0[40] = 0;
    *(uint128_t *)&a0[56] = 0;
    *(uint128_t *)&a0[72] = 0;
    *(uint128_t *)&a0[104] = 0;
    *(uint128_t *)&a0[160] = 0;
    *(uint128_t *)&a0[176] = 0;
    *(uint128_t *)&a0[192] = 0;
    *(uint128_t *)&a0[0xcc] = 0;
    v1 = a0 + 0x88;
    v2 = a0 + 120;
    v0 = a0 + 152;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::operator=(a0 + 88, a2);
    v12 = 1;
    v13 = sub_72170(&v11, 1);
    v13[1] = 0;
    v13[2] = 0;
    *v13 = &g_e6a8d8;
    sub_6c188(v13 + 3);
    v14 = 0;
    v25 = CONCAT(v13, v13 + 3);
    sub_60c14(&v11);
    v26 = 0;
    v27 = 0;
    v11 = (int128_t)a0[64];
    *(uint128_t *)&a0[64] = v25;
    sub_60b78(&v11);
    sub_60b78(&v26);
    sub_6ac64((long long)a0[64]);
    sub_6b0c4((long long)a0[64], 0);
    sub_6baa8((long long)a0[64], 120);
    sub_6bab4((long long)a0[64], a2);
    v25 = &v10;
    v10 = &v25;
    v11 = 0;
    v13 = 0;
    v15 = 0;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v16, "SYSTEM", 6);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v17, "DEFAULT", 7);
    v18 = 0;
    v21 = 0;
    v22 = 0;
    v20 = 0;
    v23 = 0;
    v7 = CONCAT(9833478076077648906, 8791751712374410631);
    v25 = CONCAT(3064531296628809586, 11610444449354691342);
    v10 = CONCAT(11741146803621573496, 15790190029780627911);
    v7 ^= v25;
    v7 ^= v10;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::assign(&v16, &v7);
    v19 = 1;
    sub_6aba4((long long)a0[64], &v11);
    v5 = CONCAT(14249991279768698332, 17329494819854173991);
    v7 = CONCAT(14249991279768698332, 17329494954401931875);
    v5 ^= v7;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v25, &v5, _strlen(&v5));
    len1 = _strlen(g_f0d528 + 3429);
    v55 = std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(&v25, g_f0d528 + 3429, len1);
    sub_5c38(&v10, v55);
    v8 = 0;
    v9 = 0;
    v7 = &v8;
    v25 = g_f0d528 + 4414;
    sub_2350ec(&v7, &v25, &v10);
    v6 = CONCAT(14249991279768698332, 17329494819854173991);
    v24 = CONCAT(14249991279768698332, 17329494954401931875);
    v6 ^= v24;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v5, &v6, _strlen(&v6));
    v57 = _strlen(g_f0d528 + 4763);
    v58 = std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(&v5, g_f0d528 + 4763, v57);
    sub_5c38(&v25, v58);
    sub_2378bc(&v7, &v25, &v25, g_f0d198->field_3a0 + 0x7600);
    v6 = CONCAT(14249991279768698332, 17329494819854173991);
    v24 = CONCAT(14249991279768698332, 17329494954401931875);
    v6 ^= v24;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v5, &v6, _strlen(&v6));
    v60 = _strlen(g_f0d528 + 4464);
    v61 = std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(&v5, g_f0d528 + 4464, v60);
    sub_5c38(&v25, v61);
    sub_2378bc(&v7, &v25, &v25, g_f0d198->field_3a0 + 0x7600);
    sub_6ae88((long long)a0[64], &v7);
    v62 = operatornew(48);
    v25 = &v5;
    v5 = &v25;
    *(unsigned long long *)&v62->field_10 = 0;
    v62->field_18 = 0;
    v62->field_20 = 0;
    *(unsigned long long *)v62->field_8 = 0;
    *(unsigned short *)&v62->field_c = 0;
    *(unsigned long long *)a1->field_50 = 0xffffffffffffffff;
    v63 = a1->field_58;
    v63->field_0 = a1;
    v63->field_c = 10;
    a1->field_58 = a1->field_58 + 1;
    v62->field_8[1] = 1;
    v62->field_0 = a1;
    g_f0d3d8->field_118();
}
