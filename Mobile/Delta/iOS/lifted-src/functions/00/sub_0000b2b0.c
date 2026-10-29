/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0xb2b0..0xb74c (1180 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_b2b0_0 {
    char field_0;
} st_b2b0_0;

extern unsigned long long g_e61c08;

long long sub_b2b0(long long a0)
{
    long long v6;  // x0
    unsigned long long v7;  // 4106
    long long v8;  // x0
    long long v9;  // x20
    long long i;  // x23
    long long v11;  // x21
    char *v12;  // x0
    char *v13;  // x0
    long long v14;  // w0
    unsigned long long v15;  // x8
    st_b2b0_0 **v0;  // [bp-0x80], Other Possible Types: char
    st_b2b0_0 *v1;  // [bp-0x78]
    st_b2b0_0 **v2;  // [bp-0x70], Other Possible Types: char
    st_b2b0_0 *v3;  // [bp-0x68]
    char *v4;  // [bp-0x10]
    char v5;  // [bp+0x0]

    v4 = &v5;
    v1 = &v0;
    v0 = &v1;
    v3 = &v2;
    v2 = &v3;
    if (!sub_6b08())
        return 1;
    v6 = sub_a0c8(a0);
    v7 = arm64g_calculate_condition(2, sub_c854(v6, sub_6b08(a0), 92, 0), 1, 0);
    if (!(v7 & 1))
    {
        v8 = sub_6b08(a0);
        if (v8)
        {
            v9 = v8;
            i = 0;
            v11 = 0;
            do
            {
                if (*(char *)sub_9c78(a0, i) == 92)
                {
                    if (i + 1 != v9)
                    {
                        v14 = *(char *)sub_9c78(a0);
                        v15 = 200;
                        if (v14 != 10)
                            v15 = 464;
                        if (v14 == 13)
                            v15 = 184;
                        if (!v14)
                            v15 = 264;
                        if (v14 == 120)
                            v15 = 576;
                        if (v14 == 122)
                            v15 = 64;
                        if (v14 == 117)
                            v15 = 224;
                        goto *((void *)(*(long long *)((char *)&g_e61c08 + v15)));
                    }
                    else
                    {
                        return 0;
                    }
                }
                v12 = sub_9c78(a0, i);
                v13 = sub_9c78(a0, v11);
                *v13 = *v12;
                i += 1;
                v11 += 1;
            } while (i != v9);
        }
        else
        {
            v11 = 0;
        }
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::resize(a0, v11, 0);
    }
    return 1;
}
