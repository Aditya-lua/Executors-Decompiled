/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x631fc..0x634c0 (708 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_631fc_1 {
    char padding_0[24];
    unsigned int field_18;
} st_631fc_1;

typedef struct st_631fc_0 {
    char field_0;
} st_631fc_0;

extern unsigned long long g_e69a98;
extern unsigned long long g_e69ac0;
extern unsigned long long g_e69ae8;
extern unsigned long long g_e69c70;
extern char g_10001c8;

char * sub_631fc(long long a0)
{
    unsigned long long **v23;  // x0
    char v24;  // x8
    char v25;  // x8
    long long v26;  // x0
    st_631fc_1 *v28;  // x8
    st_631fc_0 **v0;  // [bp-0x2f8], Other Possible Types: char
    st_631fc_0 *v1;  // [bp-0x2f0]
    char v2;  // [bp-0x2e8]
    char *v3;  // [bp-0x2d0], Other Possible Types: char, unsigned long long
    char v4;  // [bp-0x2c0], Other Possible Types: unsigned long long
    unsigned long long v5;  // [bp-0x2b8]
    unsigned long long v6;  // [bp-0x250]
    unsigned int v7;  // [bp-0x1b4]
    char v8;  // [bp-0x1b0]
    char v9;  // [bp-0x1a8]
    char v10;  // [bp-0x1a0]
    char v11;  // [bp-0x198]
    char v12;  // [bp-0x190]
    char v13;  // [bp-0x188]
    char v14;  // [bp-0x180], Other Possible Types: unsigned long long
    unsigned long long v15;  // [bp-0x170]
    unsigned long long v16;  // [bp-0x168]
    unsigned long long v17;  // [bp-0x100]
    char v18;  // [bp-0x68]
    char v19;  // [bp-0x60]
    char v20;  // [bp-0x58]
    char *v21;  // [bp-0x10]
    char v22;  // [bp+0x0]

    v21 = &v22;
    v1 = &v0;
    v0 = &v1;
    v18 = 0;
    v19 = 0;
    v20 = 0;
    sub_62cf4(&v14, a0, 24);
    v11 = 0;
    v12 = 0;
    v13 = 0;
    while (1)
    {
        v23 = sub_618bc(&v14, &v18, 32);
        if (*((char *)v23 + *(long long *)((char *)*v23 - 24) + 32) & 5)
            break;
        sub_62444(&v11, &v18);
    }
    v8 = 0;
    v9 = 0;
    v10 = 0;
    v24 = v12;
    if (v24 != v11)
    {
        sub_634c0(v11);
        sub_5ccc(&v8, &v3);
        v25 = v11;
        v24 = v12;
    }
    else
    {
        v25 = v24;
    }
    v7 = 0xffffffff;
    if ((unsigned long long)(((char)(v24 - v25) >> 3) * 12297829382473034411) >= 2)
    {
        sub_62748(&v3);
        sub_634c0(v11 + 24);
        v26 = sub_a0c8(&v2);
        sub_60404(&v4, v26, sub_6b08(&v2));
        std::__1::basic_istream<char, std::__1::char_traits<char>>::operator>>(&v3, &v7);
        v3 = &g_e69a98;
        v6 = &g_e69ae8;
        v4 = &g_e69ac0;
        v5 = &g_e69c70;
        v5 = &g_10001c8;
    }
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::basic_string(v28, &v8);
    v28->field_18 = v7;
    v3 = &v11;
    sub_271a8(&v3);
    v14 = &g_e69a98;
    v17 = &g_e69ae8;
    v15 = &g_e69ac0;
    v16 = &g_e69c70;
    v16 = &g_10001c8;
    return &v18;
}
