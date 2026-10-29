/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x284a84..0x284eb8 (1076 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_284a84_3 {
    char padding_0[8];
    long long field_8;
} st_284a84_3;

typedef struct st_284a84_0 {
    char field_0;
} st_284a84_0;

typedef struct st_284a84_1 {
    char padding_0[258];
    char field_102;
    char padding_103[132];
    char field_187;
} st_284a84_1;

typedef struct st_284a84_2 {
    char padding_0[96];
    struct st_284a84_1 *field_60;
} st_284a84_2;

extern st_284a84_2 *g_f0d198;
extern long long g_f0d350;
extern long long g_f0d358;
extern char g_f11ae0;
extern char g_f11ae8;
extern char g_f11af0;
extern long long g_f11af8;
extern long long g_f11b10;
extern long long g_f11b28;
extern char g_1000090;
extern char g_10002b0;

long long sub_284a84(st_284a84_3 *a0)
{
    long long v15;  // x0
    long long v16;  // x0
    long long v17;  // x0
    long long v18;  // x0
    long long v19;  // x0
    long long v20;  // x0
    long long v21;  // x0
    st_284a84_0 **v0;  // [bp-0xb0], Other Possible Types: char
    st_284a84_0 *v1;  // [bp-0xa8]
    uint128_t v2;  // [bp-0xa0], Other Possible Types: uint128_t
    unsigned long long v3;  // [bp-0x90]
    unsigned long long v4;  // [bp-0x88]
    uint128_t v5;  // [bp-0x80], Other Possible Types: uint128_t
    uint128_t v6;  // [bp-0x60], Other Possible Types: uint128_t
    uint128_t v7;  // [bp-0x50]
    uint128_t v8;  // [bp-0x40]
    unsigned long v9;  // [bp-0x28]
    char *v10;  // [bp-0x10]
    char v11;  // [bp+0x0]

    v10 = &v11;
    v9 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    if (g_f0d198->field_60->field_187 >> 3 & 1 || g_f0d198->field_60->field_102 & 48)
    {
        /* unsupported instruction */;
        if (!(g_f11ae0 & 1) && ___cxa_guard_acquire(&g_f11ae0))
        {
            v6 = CONCAT(14249991279768698332, 17296028975413477638);
            v2 = CONCAT(14249991279768698332, 17329494954401931875);
            v6 ^= v2;
            std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&g_f11af8, &v6, _strlen(&v6));
            ___cxa_atexit(&g_1000090, &g_f11af8, 0);
            ___cxa_guard_release(&g_f11ae0);
        }
        /* unsupported instruction */;
        if (!(g_f11ae8 & 1) && ___cxa_guard_acquire(&g_f11ae8))
        {
            v6 = CONCAT(14249991279768698332, 17301094399746329345);
            v2 = CONCAT(14249991279768698332, 17329494954401931875);
            v6 ^= v2;
            std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&g_f11b10, &v6, _strlen(&v6));
            ___cxa_atexit(&g_1000090, &g_f11b10, 0);
            ___cxa_guard_release(&g_f11ae8);
        }
        /* unsupported instruction */;
        if (!(g_f11af0 & 1) && ___cxa_guard_acquire(&g_f11af0))
        {
            v2 = CONCAT(0xa6ab57ffde6e89a9, 10471371241275938636);
            v3 = 9358767432646178684;
            v4 = 9950574587268949523;
            v5 = CONCAT(11133839036050894016, 12941789125808299854);
            v6 = CONCAT(14249991279768698332, 17329494954401931875);
            v7 = CONCAT(0xa77fe9b394508a3e, 17406804304865248029);
            v8 = CONCAT(11133839036050894016, 12941789126561591591);
            v2 ^= v6;
            *(uint128_t *)(&v2 | 16) = *(int128_t *)(&v2 | 16) ^ v7;
            v5 ^= v8;
            std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&g_f11b28, &v2, _strlen(&v2));
            ___cxa_atexit(&g_1000090, &g_f11b28, 0);
            ___cxa_guard_release(&g_f11af0);
        }
        v15 = sub_a0c8(&g_f11af8);
        if (!_strstr(a0->field_8, v15) && !(v16 = sub_a0c8(&g_f11b10), _strstr(a0->field_8, sub_a0c8(&g_f11b10)) || (v17 = sub_a0c8(&g_f11b28), _strstr(a0->field_8, sub_a0c8(&g_f11b28)))))
            goto LABEL_284e3c;
        v18 = 1;
        if (*(long long *)&g_10002b0 == v9)
            return 1;
    }
    else
    {
LABEL_284e3c:
        v18 = sub_1a587c(g_f0d350, g_f0d358, a0) ^ 1;
        if (*(long long *)&g_10002b0 == v9)
            return v18;
    }
    v19 = ___stack_chk_fail(v18);
    ___cxa_guard_abort(&g_f11af0);
    v20 = __Unwind_Resume(v19);
    ___cxa_guard_abort(&g_f11ae8);
    v21 = __Unwind_Resume(v20);
    ___cxa_guard_abort(&g_f11ae0);
    __Unwind_Resume(v21);
}
