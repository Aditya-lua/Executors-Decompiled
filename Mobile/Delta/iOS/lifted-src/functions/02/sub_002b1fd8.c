/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2b1fd8..0x2b21ec (532 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2b1fd8_0 {
    char field_0;
} st_2b1fd8_0;

extern char g_e69a98;
extern unsigned long long g_e69ac0;
extern char g_e69ae8;
extern unsigned long long g_e69c70;
extern char g_10001c8;
extern char g_10002b0;

char * sub_2b1fd8(long long a0, long long a1)
{
    long long v12;  // x20
    long long v13;  // x0
    char *v15;  // x1
    unsigned long i;  // x22
    long long v18;  // x8
    long long v19;  // x0
    long long v20;  // x0
    st_2b1fd8_0 **v0;  // [bp-0x1d8], Other Possible Types: char
    st_2b1fd8_0 *v1;  // [bp-0x1d0]
    char v2;  // [bp-0x1c8], Other Possible Types: unsigned long
    unsigned long long *v3;  // [bp-0x1b8], Other Possible Types: unsigned long long
    unsigned int v4;  // [bp-0x1b0], Other Possible Types: unsigned long long
    char v5;  // [bp-0x1a0]
    unsigned long v6;  // [bp-0x148]
    unsigned int v7;  // [bp-0xac]
    char v8;  // [bp-0xa8]
    unsigned long v9;  // [bp-0x68]
    char *v10;  // [bp-0x10]
    char v11;  // [bp+0x0]

    v10 = &v11;
    v9 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    v12 = sub_a3f728();
    v7 = 0;
    sub_a3fe04(v12, a1, 0);
    v13 = sub_a0c8(a0);
    sub_a3fe10(v12, v13, sub_6b08(a0));
    v15 = &v8;
    sub_a3ff7c(v12, &v8, &v7);
    sub_62748(&v2);
    if (v7)
    {
        i = 0;
        do
        {
            *(unsigned int *)((char *)&v4 + *(long long *)((char *)v3 - 24)) = *(int *)((char *)&v4 + *(long long *)((char *)v3 - 24)) & 0xffffffb5 | 8;
            *(unsigned long long *)&(&v5)[*(long long *)((char *)v3 - 24)] = 2;
            sub_63720((char *)&v3 + *(long long *)((char *)v3 - 24), 48);
            v15 = (&v8)[i];
            std::__1::basic_ostream<char, std::__1::char_traits<char>>::operator<<(&v3, v15);
            i += 1;
        } while (i < v7);
    }
    sub_a3f73c(v12);
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(v18, sub_62368(&v4), v15, v15);
    v2 = &g_e69a98;
    v3 = &g_e69ac0;
    v6 = &g_e69ae8;
    v4 = &g_e69c70;
    v4 = &g_10001c8;
    if (*(long long *)&g_10002b0 == v9)
        return &v6;
    v19 = ___stack_chk_fail();
    sub_623b8(&v2);
    v20 = __Unwind_Resume(__Unwind_Resume(v19));
    sub_623b8(&v2);
    __Unwind_Resume(v20);
}
