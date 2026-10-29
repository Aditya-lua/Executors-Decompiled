/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2a9bcc..0x2a9c90 (196 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2a9bcc_0 {
    char field_0;
} st_2a9bcc_0;


void* sub_2a9bcc(void* a0, long long a1)
{
    st_2a9bcc_0 **v0;  // [bp-0x58], Other Possible Types: char
    st_2a9bcc_0 *v1;  // [bp-0x50]
    long long v2;  // [bp-0x48]
    unsigned long v3;  // [bp-0x48]
    char *v4;  // [bp-0x40]
    char v5;  // [bp-0x31]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    *(unsigned long long *)a0 = 0;
    *(unsigned long long *)&a0[8] = 0;
    v1 = &v0;
    v0 = &v1;
    sub_2a6e94(a0 + 8, 0);
    *(char *)a0 = 3;
    v2 = sub_10a00(&v5, 1);
    v4 = &v5;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(v2, a1);
    v3 = 0;
    sub_2a5b30(&v3, 0);
    *(long long *)&a0[8] = v2;
    return a0;
}
