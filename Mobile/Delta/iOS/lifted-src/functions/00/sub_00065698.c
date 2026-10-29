/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x65698..0x65b4c (1204 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_65698_0 {
    char field_0;
} st_65698_0;

extern unsigned long long g_e69a98;
extern unsigned long long g_e69ac0;
extern unsigned long long g_e69ae8;
extern unsigned long long g_e69c70;
extern char g_10001c8;

unsigned long long sub_65698(void* a0, long long a1)
{
    unsigned long long v10;  // 4112
    unsigned long long v11;  // 4112
    long long v20;  // x0
    long long msg;  // x0
    long long v23;  // x1
    long long v25;  // x0
    long long msg1;  // x0
    long long v28;  // x1
    unsigned long long v12;  // 4112
    long long v30;  // x0
    long long msg2;  // x0
    long long v33;  // x1
    long long v35;  // x0
    long long v36;  // x0
    long long v38;  // x1
    unsigned long long v13;  // 4112
    long long v15;  // x0
    long long v16;  // x0
    long long v18;  // x1
    long long v0;  // [bp-0x190], Other Possible Types: unsigned long long
    st_65698_0 **v1;  // [bp-0x180], Other Possible Types: char
    st_65698_0 *v2;  // [bp-0x178]
    char v3;  // [bp-0x170]
    char v4;  // [bp-0x158], Other Possible Types: unsigned long long
    char v5;  // [bp-0x148], Other Possible Types: unsigned long long
    char v6;  // [bp-0x140], Other Possible Types: unsigned long long
    unsigned long long v7;  // [bp-0xd8]
    char *v8;  // [bp-0x10]
    char v9;  // [bp+0x0]

    v8 = &v9;
    v2 = &v1;
    v1 = &v2;
    std::__1::mutex::lock(a0 + 16);
    if (!(_pipe(a0 + 8) >> 31 & 1))
    {
        v0 = 4;
        v10 = arm64g_calculate_condition(1, _fcntl((int)a0[8], 4) & 0xffffffff, 1, 0);
        if (!(v10 & 1))
        {
            v0 = 4;
            v11 = arm64g_calculate_condition(1, _fcntl((int)a0[12], 4) & 0xffffffff, 1, 0);
            if (!(v11 & 1))
            {
                v0 = 1;
                v12 = arm64g_calculate_condition(1, _fcntl((int)a0[12], 73) & 0xffffffff, 1, 0);
                if (!(v12 & 1))
                {
                    v0 = 1;
                    v13 = arm64g_calculate_condition(1, _fcntl((int)a0[12], 73) & 0xffffffff, 1, 0);
                    if (!(v13 & 1))
                    {
                        std::__1::mutex::unlock(a0 + 16);
                        return 1;
                    }
                    sub_62748(&v4);
                    v15 = sub_60404(sub_60404(&v5, "SelectInterruptPipe::init() failed in fcntl(..., F_SETNOSIGPIPE) call", 69), " : ", 3);
                    v16 = _strerror(*(int *)___error(v15, " : ", 3));
                    v18 = v16;
                    sub_60404(v15, v18, _strlen(v16));
                    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v3, sub_62368(&v6), v18, v18);
                }
                else
                {
                    sub_62748(&v4);
                    v20 = sub_60404(sub_60404(&v5, "SelectInterruptPipe::init() failed in fcntl(.... F_SETNOSIGPIPE) call", 69), " : ", 3);
                    msg = _strerror(*(int *)___error(v20, " : ", 3));
                    v23 = msg;
                    sub_60404(v20, v23, _strlen(msg));
                    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v3, sub_62368(&v6), v23, v23);
                }
            }
            else
            {
                sub_62748(&v4);
                v25 = sub_60404(sub_60404(&v5, "SelectInterruptPipe::init() failed in fcntl(..., O_NONBLOCK) call", 65), " : ", 3);
                msg1 = _strerror(*(int *)___error(v25, " : ", 3));
                v28 = msg1;
                sub_60404(v25, v28, _strlen(msg1));
                std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v3, sub_62368(&v6), v28, v28);
            }
        }
        else
        {
            sub_62748(&v4);
            v30 = sub_60404(sub_60404(&v5, "SelectInterruptPipe::init() failed in fcntl(..., O_NONBLOCK) call", 65), " : ", 3);
            msg2 = _strerror(*(int *)___error(v30, " : ", 3));
            v33 = msg2;
            sub_60404(v30, v33, _strlen(msg2));
            std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v3, sub_62368(&v6), v33, v33);
        }
        sub_5ccc(a1, &v3);
        *(unsigned long *)&a0[8] = 0xffffffffffffffff;
    }
    else
    {
        sub_62748(&v4);
        v35 = sub_60404(sub_60404(&v5, "SelectInterruptPipe::init() failed in pipe() call", 49), " : ", 3);
        v36 = _strerror(*(int *)___error(v35, " : ", 3));
        v38 = v36;
        sub_60404(v35, v38, _strlen(v36));
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::__init(&v3, sub_62368(&v6), v38, v38);
        sub_5ccc(a1, &v3);
    }
    v4 = &g_e69a98;
    v5 = &g_e69ac0;
    v7 = &g_e69ae8;
    v6 = &g_e69c70;
    v6 = &g_10001c8;
    std::__1::mutex::unlock(a0 + 16);
    return 0;
}
