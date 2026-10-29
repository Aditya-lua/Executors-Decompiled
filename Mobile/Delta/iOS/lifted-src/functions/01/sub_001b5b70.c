/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1b5b70..0x1b5e34 (708 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1b5b70_0 {
    char field_0;
} st_1b5b70_0;

extern long long g_c7c2eb;
extern unsigned long long g_e72640;
extern char g_10002b0;

unsigned int sub_1b5b70(long long a0, unsigned int *a1, unsigned long a2, unsigned int a3, long long a4)
{
    long long v9;  // x0
    long long v11;  // x0
    unsigned long long v12;  // 4106
    unsigned long long v13;  // w23
    unsigned long long v14;  // w21
    unsigned int v15;  // w0
    unsigned long long v16;  // x8
    st_1b5b70_0 **v0;  // [bp-0xb0], Other Possible Types: char
    st_1b5b70_0 *v1;  // [bp-0xa8]
    unsigned long long v2;  // [bp-0xa0]
    char v3;  // [bp-0x98], Other Possible Types: unsigned long
    char v4;  // [bp-0x80]
    char v5;  // [bp-0x68]
    unsigned long v6;  // [bp-0x48]
    char *v7;  // [bp-0x10]
    char v8;  // [bp+0x0]

    v7 = &v8;
    v6 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    if (a3)
    {
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v5, "Content-Encoding", 16);
        v9 = sub_1bc900(a0 + 56, &v5, &g_c7c2eb, 0);
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v3, v9, _strlen(v9, &v5, &g_c7c2eb, 0));
        v2 = 0;
        if (!(sub_9fd8(&v3, "gzip") & 1) && !sub_9fd8(&v3, "deflate"))
        {
            v11 = sub_a0c8(&v3);
            v12 = arm64g_calculate_condition(18, sub_6516c(v11, sub_6b08(&v3), "br", 0, 2), 1, 0);
            if (!(v12 & 1) && !sub_9fd8(&v3, "zstd"))
                goto LABEL_1b5d50;
        }
        v13 = 0;
        *a1 = 415;
        v14 = 1;
    }
    else
    {
        v3 = a2;
        sub_1a590c(&v5, &v3, &v4);
        v15 = sub_1ac208(a4, &v5);
        sub_181a8(&v5);
        if (*(long long *)&g_10002b0 == v6)
            return v15 & 1;
        ___stack_chk_fail();
LABEL_1b5d50:
        if (v2)
            (*(long long *)(*(long long *)v2 + 16))();
        v14 = 0;
        v13 = 1;
    }
    sub_63c08(&v2, 0);
    v16 = 64;
    if (v13)
        v16 = 128;
    if (v14)
        v16 = 96;
    goto *((void *)(*(long long *)((char *)&g_e72640 + v16)));
}
