/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x742c4..0x746b4 (1008 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_742c4_1 {
    char padding_0[509];
    char field_1fd;
    char padding_1fe[270];
    unsigned int field_30c;
    char field_310;
    char field_311;
    char padding_312[6];
    char field_318;
    char padding_319[31];
    char field_338;
    char padding_339[7];
    char field_340;
    char padding_341[63];
    unsigned long long field_380;
} st_742c4_1;

typedef struct st_742c4_0 {
    char field_0;
} st_742c4_0;

extern char g_e69a98;
extern unsigned long long g_e69ac0;
extern char g_e69ae8;
extern unsigned long long g_e69c70;
extern char g_10001c8;
extern char g_10002b0;

char * sub_742c4(st_742c4_1 *a0, char a1)
{
    long long v15;  // x0
    long long v23;  // x0
    char *idx;  // x8
    long long v27;  // x0
    long long v28;  // x0
    long long v29;  // x0
    long long v30;  // x0
    long long v17;  // x1
    long long v31;  // x0
    long long v32;  // x0
    long long v33;  // x0
    long long v34;  // x0
    long long v18;  // x0
    long long v19;  // x0
    st_742c4_0 **v0;  // [bp-0x1b8], Other Possible Types: char
    st_742c4_0 *v1;  // [bp-0x1b0]
    unsigned long v2;  // [bp-0x1a8]
    unsigned long long v3;  // [bp-0x1a0]
    unsigned long v4;  // [bp-0x190]
    unsigned long long v5;  // [bp-0x188]
    char v6;  // [bp-0x180], Other Possible Types: unsigned long
    char v7;  // [bp-0x170], Other Possible Types: unsigned long long
    char v8;  // [bp-0x168], Other Possible Types: unsigned long long
    unsigned long v9;  // [bp-0x100]
    char v10;  // [bp-0x68]
    char v11;  // [bp-0x50]
    unsigned long v12;  // [bp-0x48]
    char *v13;  // [bp-0x10]
    char v14;  // [bp+0x0]

    v13 = &v14;
    v12 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    sub_60b20(&a0->field_310, 0, 5);
    sub_62748(&v6);
    v15 = sub_a0c8(&a0->field_318);
    v17 = v15;
    sub_60404(&v7, v17, sub_6b08(&a0->field_318));
    if (!(a0->field_311 & 1))
    {
        v18 = sub_60404(&v7, "::", 2);
        v19 = sub_60404(sub_60404(std::__1::basic_ostream<char, std::__1::char_traits<char>>::operator<<(v18, a0->field_30c, 2), "s", 1), "::", 2);
        v17 = sub_60a74(&a0->field_338, 1, 5);
        std::__1::basic_ostream<char, std::__1::char_traits<char>>::operator<<(v19, v17);
    }
    if (!a1)
    {
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v2, sub_62368(&v8), v17, v17);
        v4 = sub_a0c8(&v2);
        v5 = sub_6b08(&v2);
        v11 = 0;
        sub_749a8(a0, 1, &v4, sub_60768(&a0->field_1fd, 5), &v10);
        sub_181a8(&v10);
        if (*idx != 1)
            goto LABEL_74550;
        v23 = std::__1::mutex::lock(&a0->field_340);
        goto LABEL_74534;
    }
    else if (a1 == 1)
    {
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v2, sub_62368(&v8), v17, v17);
        v4 = sub_a0c8(&v2);
        v5 = sub_6b08(&v2);
        v11 = 0;
        sub_749a8(a0, 2, &v4, sub_60768(&a0->field_1fd, 5), &v10);
        sub_181a8(&v10);
        if (*idx == 1)
        {
            v23 = std::__1::mutex::lock(&a0->field_340);
LABEL_74534:
            a0->field_380 = std::__1::chrono::steady_clock::now(v23);
            std::__1::mutex::unlock(&a0->field_340);
        }
    }
    else if (a1 == 2)
    {
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v10, sub_62368(&v8), v17, v17);
        v2 = sub_a0c8(&v10);
        v3 = sub_6b08(&v10);
        sub_73134(a0, &v2);
    }
    else
    {
        *(unsigned short *)idx = 0;
        *(unsigned long long *)&idx[8] = 0;
        *(unsigned long long *)&idx[16] = 0;
    }
LABEL_74550:
    v6 = &g_e69a98;
    v7 = &g_e69ac0;
    v9 = &g_e69ae8;
    v8 = &g_e69c70;
    v8 = &g_10001c8;
    if (*(long long *)&g_10002b0 == v12)
        return &v9;
    v27 = ___stack_chk_fail();
    sub_623b8(&v6);
    v28 = __Unwind_Resume(v27);
    sub_623b8(&v6);
    v29 = __Unwind_Resume(v28);
    sub_623b8(&v6);
    v30 = __Unwind_Resume(v29);
    sub_181a8(&v10);
    sub_623b8(&v6);
    v31 = __Unwind_Resume(v30);
    sub_623b8(&v6);
    v32 = __Unwind_Resume(v31);
    sub_623b8(&v6);
    v33 = __Unwind_Resume(v32);
    sub_623b8(&v6);
    v34 = __Unwind_Resume(__Unwind_Resume(v33));
    sub_623b8(&v6);
    __Unwind_Resume(v34);
}
