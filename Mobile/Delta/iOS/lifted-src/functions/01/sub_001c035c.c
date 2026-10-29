/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1c035c..0x1c05ac (592 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1c035c_0 {
    char field_0;
} st_1c035c_0;

extern unsigned long long g_a3f73c;
extern char g_e69a98;
extern unsigned long long g_e69ac0;
extern unsigned long long g_e69ae8;
extern unsigned long long g_e69c70;
extern char g_10001c8;
extern char g_10002b0;

unsigned long long sub_1c035c(long long a0, long long a1)
{
    unsigned long v14;  // x0
    long long v15;  // x0
    char *v17;  // x1
    unsigned long i;  // x21
    long long v20;  // x8
    unsigned long long v21;  // x0
    long long v22;  // x0
    st_1c035c_0 **v0;  // [bp-0x1e8], Other Possible Types: char
    st_1c035c_0 *v1;  // [bp-0x1e0]
    char v2;  // [bp-0x1d8], Other Possible Types: unsigned long
    unsigned long long *v3;  // [bp-0x1c8], Other Possible Types: unsigned long long
    unsigned int v4;  // [bp-0x1c0], Other Possible Types: unsigned long long
    char v5;  // [bp-0x1b0]
    unsigned long long v6;  // [bp-0x158]
    unsigned int v7;  // [bp-0xbc]
    unsigned long v8;  // [bp-0xb8]
    unsigned long long v9;  // [bp-0xb0]
    char v10;  // [bp-0xa8]
    unsigned long v11;  // [bp-0x68]
    char *v12;  // [bp-0x10]
    char v13;  // [bp+0x0]

    v12 = &v13;
    v11 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    v14 = sub_a3f728();
    v8 = v14;
    v9 = &g_a3f73c;
    v7 = 0;
    sub_a3fe04(v8, a1, 0);
    v15 = sub_a0c8(a0);
    sub_a3fe10(v14, v15, sub_6b08(a0));
    v17 = &v10;
    sub_a3ff7c(v8, &v10, &v7);
    sub_62748(&v2);
    if (v7)
    {
        i = 0;
        do
        {
            *(unsigned int *)((char *)&v4 + *(long long *)((char *)v3 - 24)) = *(int *)((char *)&v4 + *(long long *)((char *)v3 - 24)) & 0xffffffb5 | 8;
            *(unsigned long long *)&(&v5)[*(long long *)((char *)v3 - 24)] = 2;
            sub_63720((char *)&v3 + *(long long *)((char *)v3 - 24), 48);
            v17 = (&v10)[i];
            std::__1::basic_ostream<char, std::__1::char_traits<char>>::operator<<(&v3, v17);
            i += 1;
        } while (i < v7);
    }
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(v20, sub_62368(&v4), v17, v17);
    v2 = &g_e69a98;
    v3 = &g_e69ac0;
    v6 = &g_e69ae8;
    v4 = &g_e69c70;
    v4 = &g_10001c8;
    v21 = sub_1d34f4(&v8, 0);
    if (*(long long *)&g_10002b0 == v11)
        return v21;
    v22 = ___stack_chk_fail();
    sub_623b8(&v2);
    sub_1d34f4(&v8, 0);
    __Unwind_Resume(v22);
}
