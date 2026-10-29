/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1a5264..0x1a5708 (1188 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1a5264_0 {
    char field_0;
} st_1a5264_0;

extern long long g_e6f9a8;
extern long long g_f024b8;
extern char g_f024f8;
extern char g_1000050;
extern char g_10001e0;

long long sub_1a5264(unsigned long idx, long long a1, long long a2, long long a3)
{
    long long v22;  // x0
    unsigned long long v23;  // x0
    long long v32;  // x0
    long long v33;  // x0
    unsigned long long *v25;  // x21
    unsigned int v26;  // w22
    long long v30;  // x23
    long long v31;  // x0
    st_1a5264_0 **v0;  // [bp-0x138], Other Possible Types: char
    st_1a5264_0 *v1;  // [bp-0x130]
    st_1a5264_0 **v2;  // [bp-0x128], Other Possible Types: char
    st_1a5264_0 **v3;  // [bp-0x110], Other Possible Types: char
    char v4;  // [bp-0xf8]
    unsigned long long v5;  // [bp-0xe0]
    unsigned long long v6;  // [bp-0xd0]
    unsigned long long v7;  // [bp-0xc7]
    unsigned long long v8;  // [bp-0xb0]
    unsigned long long v9;  // [bp-0xa8]
    unsigned long long v10;  // [bp-0xa0]
    unsigned long long v11;  // [bp-0x98]
    unsigned long long v12;  // [bp-0x90]
    unsigned long long v13;  // [bp-0x88]
    unsigned long long v14;  // [bp-0x80]
    unsigned long long v15;  // [bp-0x78]
    st_1a5264_0 **v16;  // [bp-0x70], Other Possible Types: char, unsigned long long
    st_1a5264_0 *v17;  // [bp-0x68], Other Possible Types: unsigned long long *, char *, unsigned long long
    unsigned long long v18;  // [bp-0x60]
    unsigned long long v19;  // [bp-0x58]
    char *v20;  // [bp-0x10]
    char v21;  // [bp+0x0]

    v20 = &v21;
    v1 = &v0;
    v0 = &v1;
    *(unsigned long long *)idx = 0;
    *(char *)(idx + 8) = 0;
    /* unsupported instruction */;
    if (!(g_f024f8 & 1) && ___cxa_guard_acquire(&g_f024f8))
    {
        sub_1c306c(&g_f024b8, "(?:([a-z]+):\\/\\/)?(?:\\[([a-fA-F\\d:]+)\\]|([^:/?#]+))(?::(\\d+))?", 0);
        ___cxa_atexit(0x1acf04, &g_f024b8, 0);
        ___cxa_guard_release(&g_f024f8);
    }
    v8 = 0;
    v9 = 0;
    v10 = 0;
    v11 = 0;
    v12 = 0;
    v13 = 0;
    v14 = 0;
    v15 = 0;
    v5 = 0;
    v6 = 0;
    v7 = 0;
    v22 = sub_a0c8(a1);
    v23 = sub_a0c8(a1);
    if (sub_1a8c70(v22, v23 + sub_6b08(a1), &v5, &g_f024b8, 0))
    {
        sub_1b59b4(sub_1bc4cc(&v5, 1), 1);
        v17 = &v3;
        v3 = &v17;
        if (sub_6b08(&v4) && !(sub_9fd8(&v4, "http") & 1) && !(sub_9fd8(&v4, "https") & 1))
        {
            std::__1::operator+<char,std::__1::char_traits<char>,std::__1::allocator<char>>("'", &v4);
            sub_6826c(&v3, "' scheme is not supported.");
            v25 = ___cxa_allocate_exception(16);
            std::logic_error::logic_error(v25, &v17);
            *v25 = &g_10001e0;
            ___cxa_throw(v25, &g_e6f9a8, &g_1000050);
            __debugbreak();
        }
        v26 = sub_9fd8(&v4, "https");
        sub_1b59b4(sub_1bc4cc(&v5, 2), 2);
        v17 = &v2;
        v2 = &v17;
        if (!sub_6b08(&v3))
        {
            sub_1b59b4(sub_1bc4cc(&v5, 3), 3);
            sub_5ccc(&v3, &v17);
        }
        sub_1b59b4(sub_1bc4cc(&v5, 4), 4);
        v17 = &v16;
        v16 = &v17;
        if (sub_6b08(&v2))
        {
            v30 = std::__1::stoi(&v2, 0, 10);
            if (!v26)
                goto LABEL_1a5524;
LABEL_1a5478:
            v31 = operatornew(0x400);
            v17 = 0;
            v18 = 0;
            v19 = 0;
            sub_1bdd98(v31, &v3, v30, a2, a3, &v17);
            v16 = 0;
            sub_63c08(idx, v31);
            sub_1beb64(&v16, 0);
            *(char *)(idx + 8) = v26;
        }
        else
        {
            if (v26)
                v30 = 443;
            else
                v30 = 80;
            if (v26)
                goto LABEL_1a5478;
LABEL_1a5524:
            v32 = operatornew(912);
            sub_1a23b8(v32, &v3, v30, a2, a3);
            v17 = 0;
            sub_63c08(idx, v32);
            sub_63c08(&v17, 0);
        }
    }
    else
    {
        v33 = operatornew(912);
        sub_1a23b8(v33, a1, 80, a2, a3);
        v17 = 0;
        sub_63c08(idx, v33);
        sub_63c08(&v17, 0);
    }
    v17 = &v5;
    sub_127c0(&v17);
    return idx;
}
