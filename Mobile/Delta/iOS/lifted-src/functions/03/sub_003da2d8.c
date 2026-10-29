/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3da2d8..0x3da694 (956 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3da2d8_0 {
    char field_0;
} st_3da2d8_0;

extern long long g_c7c2eb;
extern char g_e7f380;
extern unsigned long long g_e7f3a8;
extern char g_10002b0;
extern unsigned int g_fffffffffffffffc;

long long sub_3da2d8(unsigned long long *a0, long long a1)
{
    unsigned long v29;  // x20
    unsigned long iter;  // x24
    long long v39;  // x0
    long long v31;  // x22
    long long v32;  // x23
    long long v34;  // x22
    long long v36;  // x0
    long long v37;  // x0
    unsigned int v38;  // w0
    st_3da2d8_0 **v0;  // [bp-0x4f8], Other Possible Types: char
    st_3da2d8_0 *v1;  // [bp-0x4f0]
    unsigned long v2;  // [bp-0x4e8]
    unsigned int v3;  // [bp-0x4e0]
    char v4;  // [bp-0x4d0]
    char v5;  // [bp-0x4b8]
    char v6;  // [bp-0x4a0]
    char i;  // [bp-0x418]
    unsigned long v8;  // [bp-0x408]
    unsigned long long v9;  // [bp-0x400]
    unsigned long long v10;  // [bp-0x3f8]
    unsigned long long v11;  // [bp-0x3f0]
    unsigned long long v12;  // [bp-0x3e8]
    unsigned long long v13;  // [bp-0x3e0]
    unsigned long long v14;  // [bp-0x3d8]
    char *v15;  // [bp-0x3d0]
    unsigned long v16;  // [bp-0x3c8]
    unsigned long long v17;  // [bp-0x3c0]
    unsigned long v18;  // [bp-0x3b8]
    char *v19;  // [bp-0x3b0]
    char v20;  // [bp-0x3a8]
    char v21;  // [bp-0x3a8]
    char v22;  // [bp-0x3a0]
    unsigned long v23;  // [bp-0x328]
    unsigned long long v24;  // [bp-0x208]
    char v25;  // [bp-0x170]
    unsigned long v26;  // [bp-0x70]
    char *v27;  // [bp-0x10]
    char v28;  // [bp+0x0]

    v27 = &v28;
    v26 = *(long long *)&g_10002b0;
    v1 = &v0;
    v0 = &v1;
    v16 = *a0;
    v17 = a0[1] - *a0;
    v18 = 0;
    v8 = 4039280;
    v9 = 4040996;
    v10 = 4039160;
    v11 = 4040988;
    v12 = 0x3da200;
    v13 = 4039284;
    v14 = 4040340;
    v15 = &v16;
    v29 = sub_cdbd0(&g_c7c2eb, &v8);
    if (v29)
    {
        sub_cd14c(v29, &i);
        if (i)
        {
            iter = 0;
            v21 = v20;
            do
            {
                sub_cdc18(v29, &v6, &v25, 0x100, 0, 0, 0, 0);
                v31 = sub_6b08(a1);
                sub_64128(&v21, v31 + 1, &v4);
                v32 = sub_a0c8(&v21);
                sub_12478(v32, sub_a0c8(a1), v31);
                v34 = v32 + v31;
                sub_12478(v34, "/", 1);
                v4 = 0;
                sub_348a4(v34 + 1, 1, &v4);
                sub_5c38(&v5, std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(&v21, &v25, _strlen(&v25)));
                v36 = sub_a0c8(&v5);
                v37 = sub_3da974(v36, sub_6b08(&v5), 47, (char *)&g_fffffffffffffffc + 3);
                std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(&v4, &v5, 0, v37, &v21);
                if (sub_ce5bc(v29))
                {
                    iter += 1;
                    if (i <= iter)
                        continue;
                }
                else
                {
                    sub_3da7a4(&v21, &v5, 4);
                    if (v23)
                    {
                        sub_d1930(&v2, 0x1000);
                        while (1)
                        {
                            v38 = sub_cd8ac(v29, v2, v3 - v2);
                            if ((int)v38 < 1)
                                break;
                            std::__1::basic_ostream<char, std::__1::char_traits<char>>::write(&v21, v2, v38);
                        }
                        sub_3da75c(&v21);
                        v19 = &v2;
                        sub_d18e4(&v19);
                    }
                    sub_ce4e8(v29);
                    v21 = (char)&g_e7f380;
                    v24 = &g_e7f3a8;
                    sub_6549c(&v22);
                    iter += 1;
                    if (i <= iter)
                        continue;
                }
                sub_cdc54(v29);
            } while (i > iter);
        }
        sub_cec7c(v29);
    }
    if (*(long long *)&g_10002b0 == v26)
        return v29 != 0;
    v39 = ___stack_chk_fail(v29 != 0);
    v19 = &v2;
    sub_d18e4(&v19);
    sub_3da8c0(&v21);
    __Unwind_Resume(v39);
}
