/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x266e90..0x267744 (2228 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_266e90_0 {
    char field_0;
} st_266e90_0;

extern unsigned long long g_f0d228;
extern unsigned long long g_f0d230;
extern unsigned long long g_f0d238;
extern char g_10002b0;

int sub_266e90(void)
{
    char *v60;  // x19
    unsigned int v62;  // w0
    long long v64;  // x0
    st_266e90_0 **v0;  // [bp-0x380], Other Possible Types: char
    st_266e90_0 *v1;  // [bp-0x378]
    uint128_t v2;  // [bp-0x370], Other Possible Types: uint128_t
    uint128_t v3;  // [bp-0x360], Other Possible Types: uint128_t
    unsigned long long v4;  // [bp-0x350]
    unsigned long long v5;  // [bp-0x348]
    uint128_t v6;  // [bp-0x340], Other Possible Types: uint128_t
    uint128_t v7;  // [bp-0x330], Other Possible Types: uint128_t
    uint128_t v8;  // [bp-0x320], Other Possible Types: uint128_t
    unsigned long long v9;  // [bp-0x310]
    unsigned long long v10;  // [bp-0x308]
    uint128_t v11;  // [bp-0x300], Other Possible Types: uint128_t
    unsigned long long v12;  // [bp-0x2f0]
    unsigned long long v13;  // [bp-0x2e8]
    uint128_t v14;  // [bp-0x2d0], Other Possible Types: uint128_t
    uint128_t v15;  // [bp-0x2c0], Other Possible Types: uint128_t
    uint128_t v16;  // [bp-0x2b0], Other Possible Types: uint128_t
    uint128_t v17;  // [bp-0x2a0], Other Possible Types: uint128_t
    unsigned long long v18;  // [bp-0x290]
    unsigned long long v19;  // [bp-0x288]
    uint128_t v20;  // [bp-0x270], Other Possible Types: uint128_t
    uint128_t v21;  // [bp-0x260], Other Possible Types: uint128_t
    uint128_t v22;  // [bp-0x250], Other Possible Types: uint128_t
    uint128_t v23;  // [bp-0x240], Other Possible Types: uint128_t
    unsigned long long v24;  // [bp-0x230]
    unsigned long long v25;  // [bp-0x228]
    uint128_t v26;  // [bp-0x220], Other Possible Types: uint128_t
    char v27;  // [bp-0x1f0]
    char v28;  // [bp-0x1d8]
    char v29;  // [bp-0x1c0]
    char v30;  // [bp-0x1a8]
    char v31;  // [bp-0x190]
    char v32;  // [bp-0x178]
    char v33;  // [bp-0x160]
    char v34;  // [bp-0x148]
    char v35;  // [bp-0x130]
    char v36;  // [bp-0x118]
    char v37;  // [bp-0x100]
    char v38;  // [bp-0xe8]
    char v39;  // [bp-0xd0]
    char v40;  // [bp-0xb8]
    uint128_t v41;  // [bp-0xa0], Other Possible Types: uint128_t
    uint128_t v42;  // [bp-0x90]
    uint128_t v43;  // [bp-0x80]
    unsigned long v44;  // [bp-0x58]
    char *v45;  // [bp-0x10]
    char v46;  // [bp+0x0]

    v45 = &v46;
    v44 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    v23 = CONCAT(12333588945630327107, 3389160091137872758);
    v24 = 18292929023513674322;
    v25 = 9554075081723498293;
    v26 = CONCAT(18242283556969808186, 0xb11bda9312803fd4);
    v41 = CONCAT(14429746110317888822, 5631685737297962585);
    v42 = CONCAT(0xa9fe87c4beeb2318, 10209074494858999347);
    v43 = CONCAT(18242283556969808186, 12762034296091726269);
    v23 ^= v41;
    *(uint128_t *)(&v23 | 16) = *(int128_t *)(&v23 | 16) ^ v42;
    v26 ^= v43;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v27, &v23, _strlen(&v23));
    v22 = CONCAT(14429746110317888822, 5647137042835440956);
    v41 = CONCAT(14429746110317888822, 5631685737297962585);
    v22 ^= v41;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v28, &v22, _strlen(&v22));
    v21 = CONCAT(14429746110317888822, 3117817170045307194);
    v41 = CONCAT(14429746110317888822, 5631685737297962585);
    v21 ^= v41;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v29, &v21, _strlen(&v21));
    v20 = CONCAT(14429746110022542935, 2474640251091748660);
    v41 = CONCAT(14429746110317888822, 5631685737297962585);
    v20 ^= v41;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v30, &v20, _strlen(&v20));
    v17 = CONCAT(11616086153353880408, 2833795655651296568);
    v18 = 10209074494859008092;
    v19 = 0xa9fe87c4beeb2318;
    v41 = CONCAT(14429746110317888822, 5631685737297962585);
    v42 = CONCAT(0xa9fe87c4beeb2318, 10209074494858999347);
    v17 ^= v41;
    *(uint128_t *)(&v17 | 16) = *(int128_t *)(&v17 | 16) ^ v42;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v31, &v17, _strlen(&v17));
    v16 = CONCAT(14426057429888725331, 4419062724485711160);
    v41 = CONCAT(14429746110317888822, 5631685737297962585);
    v16 ^= v41;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v32, &v16, _strlen(&v16));
    v15 = CONCAT(14429746110317888822, 5631685885070349112);
    v41 = CONCAT(14429746110317888822, 5631685737297962585);
    v15 ^= v41;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v33, &v15, _strlen(&v15));
    v14 = CONCAT(14429746110317888822, 5638693918849306427);
    v41 = CONCAT(14429746110317888822, 5631685737297962585);
    v14 ^= v41;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v34, &v14, _strlen(&v14));
    v11 = CONCAT(13561380599565115460, 3269236439583819068);
    v12 = 0x8dadeb29bfe14252;
    v13 = 0xa9fe87c4beeb2318;
    v41 = CONCAT(14429746110317888822, 5631685737297962585);
    v42 = CONCAT(0xa9fe87c4beeb2318, 10209074494858999347);
    v11 ^= v41;
    *(uint128_t *)(&v11 | 16) = *(int128_t *)(&v11 | 16) ^ v42;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v35, &v11, _strlen(&v11));
    v8 = CONCAT(12045358531040764511, 2903039676776583728);
    v9 = 10209074494858999389;
    v10 = 0xa9fe87c4beeb2318;
    v41 = CONCAT(14429746110317888822, 5631685737297962585);
    v42 = CONCAT(0xa9fe87c4beeb2318, 10209074494858999347);
    v8 ^= v41;
    *(uint128_t *)(&v8 | 16) = *(int128_t *)(&v8 | 16) ^ v42;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v36, &v8, _strlen(&v8));
    v7 = CONCAT(14429746110317888822, 3117803975401935913);
    v41 = CONCAT(14429746110317888822, 5631685737297962585);
    v7 ^= v41;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v37, &v7, _strlen(&v7));
    v6 = CONCAT(14429746110317888822, 5631671286408549421);
    v41 = CONCAT(14429746110317888822, 5631685737297962585);
    v6 ^= v41;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v38, &v6, _strlen(&v6));
    v3 = CONCAT(13556295349462366035, 4059890762423734573);
    v4 = 0x8dadeb29bffc595a;
    v5 = 0xa9fe87c4beeb2318;
    v41 = CONCAT(14429746110317888822, 5631685737297962585);
    v42 = CONCAT(0xa9fe87c4beeb2318, 10209074494858999347);
    v3 ^= v41;
    *(uint128_t *)(&v3 | 16) = *(int128_t *)(&v3 | 16) ^ v42;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v39, &v3, _strlen(&v3));
    v60 = &v40;
    v2 = CONCAT(14429726504485577796, 3117523634279814444);
    v41 = CONCAT(14429746110317888822, 5631685737297962585);
    v2 ^= v41;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v40, &v2, _strlen(&v2));
    g_f0d228 = 0;
    g_f0d230 = 0;
    g_f0d238 = 0;
    sub_273b0(&g_f0d228, &v27, &v41, 14);
    v62 = ___cxa_atexit(0x2737c, &g_f0d228, 0);
    if (*(long long *)&g_10002b0 == v44)
        return v62;
    v64 = __Unwind_Resume(___stack_chk_fail());
    __Unwind_Resume(v64);
}
