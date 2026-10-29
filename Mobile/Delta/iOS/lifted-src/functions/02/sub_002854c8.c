/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2854c8..0x285ba8 (1760 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2854c8_0 {
    char field_0;
} st_2854c8_0;

extern unsigned long long g_f0d350;
extern unsigned long long g_f0d358;
extern unsigned long long g_f0d360;
extern char g_10002b0;

int sub_2854c8(void)
{
    char *v48;  // x19
    unsigned int v49;  // w0
    long long v51;  // x0
    st_2854c8_0 **v0;  // [bp-0x2a0], Other Possible Types: char
    st_2854c8_0 *v1;  // [bp-0x298]
    uint128_t v2;  // [bp-0x290], Other Possible Types: uint128_t
    uint128_t v3;  // [bp-0x280], Other Possible Types: uint128_t
    unsigned long long v4;  // [bp-0x270]
    unsigned long long v5;  // [bp-0x268]
    uint128_t v6;  // [bp-0x260], Other Possible Types: uint128_t
    uint128_t v7;  // [bp-0x250], Other Possible Types: uint128_t
    uint128_t v8;  // [bp-0x240], Other Possible Types: uint128_t
    unsigned long long v9;  // [bp-0x230]
    unsigned long long v10;  // [bp-0x228]
    uint128_t v11;  // [bp-0x220], Other Possible Types: uint128_t
    unsigned long long v12;  // [bp-0x210]
    unsigned long long v13;  // [bp-0x208]
    uint128_t v14;  // [bp-0x200], Other Possible Types: uint128_t
    uint128_t v15;  // [bp-0x1f0], Other Possible Types: uint128_t
    uint128_t v16;  // [bp-0x1e0], Other Possible Types: uint128_t
    uint128_t v17;  // [bp-0x1d0], Other Possible Types: uint128_t
    uint128_t v18;  // [bp-0x1c0], Other Possible Types: uint128_t
    unsigned long long v19;  // [bp-0x1b0]
    unsigned long long v20;  // [bp-0x1a8]
    char v21;  // [bp-0x188]
    char v22;  // [bp-0x170]
    char v23;  // [bp-0x158]
    char v24;  // [bp-0x140]
    char v25;  // [bp-0x128]
    char v26;  // [bp-0x110]
    char v27;  // [bp-0xf8]
    char v28;  // [bp-0xe0]
    char v29;  // [bp-0xc8]
    char v30;  // [bp-0xb0]
    char v31;  // [bp-0x98]
    uint128_t v32;  // [bp-0x80], Other Possible Types: uint128_t
    uint128_t v33;  // [bp-0x70]
    unsigned long v34;  // [bp-0x58]
    char *v35;  // [bp-0x10]
    char v36;  // [bp+0x0]

    v35 = &v36;
    v34 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    v18 = CONCAT(12445208273763277746, 11027861576600142082);
    v19 = 17406804304865242482;
    v20 = 0xa77fe9b394508a3e;
    v32 = CONCAT(14249991279768698332, 17329494954401931875);
    v33 = CONCAT(0xa77fe9b394508a3e, 17406804304865248029);
    v18 ^= v32;
    *(uint128_t *)(&v18 | 16) = *(int128_t *)(&v18 | 16) ^ v33;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v21, &v18, _strlen(&v18));
    v17 = CONCAT(14249991279768698332, 0x951dc9bd03604d00);
    v32 = CONCAT(14249991279768698332, 17329494954401931875);
    v17 ^= v32;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v22, &v17, _strlen(&v17));
    v16 = CONCAT(14249991279137234621, 11245153730338702094);
    v32 = CONCAT(14249991279768698332, 17329494954401931875);
    v16 ^= v32;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v23, &v16, _strlen(&v16));
    v15 = CONCAT(0xc5b144ffd27289b9, 9442594507765727490);
    v32 = CONCAT(14249991279768698332, 17329494954401931875);
    v15 ^= v32;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v24, &v15, _strlen(&v15));
    v14 = CONCAT(14249991279768698332, 17329495081513211650);
    v32 = CONCAT(14249991279768698332, 17329494954401931875);
    v14 ^= v32;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v25, &v14, _strlen(&v14));
    v11 = CONCAT(0xb1b151fecf6798ae, 10594672729886179590);
    v12 = 17406804304866097020;
    v13 = 0xa77fe9b394508a3e;
    v32 = CONCAT(14249991279768698332, 17329494954401931875);
    v33 = CONCAT(0xa77fe9b394508a3e, 17406804304865248029);
    v11 ^= v32;
    *(uint128_t *)(&v11 | 16) = *(int128_t *)(&v11 | 16) ^ v33;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v26, &v11, _strlen(&v11));
    v8 = CONCAT(12298019899148835509, 10813376604997703178);
    v9 = 17406804304865248115;
    v10 = 0xa77fe9b394508a3e;
    v32 = CONCAT(14249991279768698332, 17329494954401931875);
    v33 = CONCAT(0xa77fe9b394508a3e, 17406804304865248029);
    v8 ^= v32;
    *(uint128_t *)(&v8 | 16) = *(int128_t *)(&v8 | 16) ^ v33;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v27, &v8, _strlen(&v8));
    v7 = CONCAT(14249991279768698332, 10744979294194782227);
    v32 = CONCAT(14249991279768698332, 17329494954401931875);
    v7 ^= v32;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v28, &v7, _strlen(&v7));
    v6 = CONCAT(14249991279768698332, 17329509130417491991);
    v32 = CONCAT(14249991279768698332, 17329494954401931875);
    v6 ^= v32;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v29, &v6, _strlen(&v6));
    v3 = CONCAT(12800146003528224697, 9659903081565017367);
    v4 = 17406804304866946164;
    v5 = 0xa77fe9b394508a3e;
    v32 = CONCAT(14249991279768698332, 17329494954401931875);
    v33 = CONCAT(0xa77fe9b394508a3e, 17406804304865248029);
    v3 ^= v32;
    *(uint128_t *)(&v3 | 16) = *(int128_t *)(&v3 | 16) ^ v33;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v30, &v3, _strlen(&v3));
    v2 = CONCAT(0xc5c24dfed2729cae, 10744133735376507158);
    v32 = CONCAT(14249991279768698332, 17329494954401931875);
    v2 ^= v32;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v31, &v2, _strlen(&v2));
    g_f0d350 = 0;
    g_f0d358 = 0;
    g_f0d360 = 0;
    sub_273b0(&g_f0d350, &v21, &v32, 11);
    v48 = &v21;
    v49 = ___cxa_atexit(0x2737c, &g_f0d350, 0);
    if (*(long long *)&g_10002b0 == v34)
        return v49;
    v51 = __Unwind_Resume(___stack_chk_fail());
    __Unwind_Resume(v51);
}
