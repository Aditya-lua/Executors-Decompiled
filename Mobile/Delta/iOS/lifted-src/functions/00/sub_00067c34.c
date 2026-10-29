/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x67c34..0x67e98 (612 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_67c34_1 {
    unsigned int field_0;
    char padding_4[76];
    unsigned long long field_50;
    unsigned long long field_58;
    char padding_60[105];
    char field_c9;
} st_67c34_1;

typedef struct st_67c34_0 {
    char field_0;
} st_67c34_0;

extern long long g_f0d0d8;

char sub_67c34(void* a0, long long a1, long long a2, long long a3, long long a4)
{
    st_67c34_1 *v5;  // x23
    unsigned long long v6;  // 4112
    unsigned long long v15;  // x0
    char v7;  // x0
    char v8;  // x0
    long long v10;  // x0
    long long v11;  // x23
    long long v12;  // x0
    st_67c34_0 **v0;  // [bp-0x60], Other Possible Types: char
    st_67c34_0 *v1;  // [bp-0x58]
    char v2;  // [bp-0x50]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v0 = &v1;
    std::__1::mutex::lock(a0 + 248);
    if (sub_60768(&g_f0d0d8, 5) & 1)
    {
        v5 = a0 + 8;
        /* unsupported instruction */;
        v5->field_0 = sub_66c70(a1, a2, a3, a4);
        v6 = arm64g_calculate_condition(1, sub_66808(v5, 5) & 0xffffffff, 1, 0);
        if (!(v6 & 1))
        {
            v7 = sub_6865c(a0, a3);
            *(unsigned long long *)&a0[96] = v7;
            if (v7 && sub_67544(a0, a3))
            {
                v8 = sub_95e294((long long)a0[96]);
                *(unsigned long long *)&a0[88] = v8;
                if (v8)
                {
                    sub_95f93c(v8, sub_66808(v5, 5));
                    v10 = sub_a0c8(a1);
                    sub_95f0c4((long long)a0[88], 55, 0, v10);
                    if (!((char)a0[209] & 1))
                    {
                        v11 = sub_95f0cc((long long)a0[88]);
                        if (sub_65528(2, sub_a0c8(a1), &v2) == 1 || sub_65528(30, sub_a0c8(a1), &v2) == 1)
                        {
                            sub_af8a94(v11, sub_a0c8(a1));
                        }
                        else
                        {
                            v12 = sub_a0c8(a1);
                            sub_af88dc(v11, v12, sub_6b08(a1));
                        }
                    }
                    v15 = sub_673ec(a0, a1, a3, a4);
                    std::__1::mutex::unlock(a0 + 248);
                    if (!(v15 & 1))
                    {
                        sub_67290(a0);
                        return 0;
                    }
                    return 1;
                }
                std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::assign(a3, "OpenSSL failed to connect");
                sub_95e3b8((long long)a0[96]);
                *(unsigned long long *)&a0[96] = 0;
            }
        }
    }
    else
    {
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::assign(a3, "OPENSSL_init_ssl failure");
    }
    std::__1::mutex::unlock(a0 + 248);
    return 0;
}
