/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x3c2784..0x3c3594 (3600 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_3c2784_2 {
    char padding_0[32];
    unsigned long long field_20;
    char padding_28[112];
    struct st_3c2784_1 *field_98;
} st_3c2784_2;

typedef struct st_3c2784_1 {
    char padding_0[20];
    unsigned int field_14;
} st_3c2784_1;

typedef struct st_3c2784_3 {
    struct st_3c2784_2 *field_0;
} st_3c2784_3;

typedef struct st_3c2784_0 {
    char field_0;
} st_3c2784_0;

extern long long g_cbed28;
extern unsigned long long g_e7d690;

unsigned int * sub_3c2784(long long a0, long long a1, st_3c2784_2 *a2, unsigned int a3)
{
    long long v11;  // x22
    st_3c2784_1 *v12;  // w19
    st_3c2784_1 *v21;  // w8
    unsigned long long v22;  // x9
    st_3c2784_1 *i;  // w19
    unsigned int *v14;  // x0
    st_3c2784_2 *v15;  // x8
    st_3c2784_1 *v16;  // w24
    st_3c2784_1 *v17;  // x0
    long long v18;  // x0
    long long v19;  // x0
    unsigned int *v20;  // x0
    unsigned int v0;  // [bp-0xf4]
    long long v1;  // [bp-0xf0]
    long long v2;  // [bp-0xe8]
    st_3c2784_0 **v3;  // [bp-0xe0], Other Possible Types: char
    st_3c2784_0 *v4;  // [bp-0xd8]
    st_3c2784_1 *v5;  // [bp-0xcc]
    st_3c2784_2 *v6;  // [bp-0xc8]
    st_3c2784_3 **v7;  // [bp-0xb0]
    st_3c2784_2 **v8;  // [bp-0xa0], Other Possible Types: st_3c2784_3 **
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v0 = a3;
    v4 = &v3;
    v2 = a1;
    v3 = &v4;
    v6 = a2;
    v8 = &v6;
    v11 = sub_3c1a94(a1 + 168, &v6, &g_cbed28, &v8, &v7);
    v12 = (st_3c2784_1 *)(int)v6->field_98;
    v8 = &v7;
    v7 = &v8;
    do
    {
        i = v12;
        v14 = std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::push_back(a0, (char)i & 127 | (i > 127) * 128);
        v12 = i >> 7;
    } while (127 < i);
    v5 = (st_3c2784_1 *)0;
    v15 = v6;
    if ((int)v15->field_98 < 1)
        return v14;
    v16 = (st_3c2784_1 *)0;
    v1 = v11;
    while (1)
    {
        v17 = sub_3c0a7c(v11 + 24, &v5);
        if (!v17)
            break;
        v8 = &v7;
        v7 = &v8;
        v18 = sub_6b08(a0);
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::resize(a0, v18 + 1, 0);
        *(char *)sub_9c78(a0, v18) = 4;
        v8 = &v7;
        v7 = &v8;
        v19 = sub_6b08(a0);
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::resize(a0, v19 + 4, 0);
        v20 = sub_9c78(a0, v19);
        *v20 = v17->field_14;
        v16 = &v5->padding_0[1];
        v5 = v16;
        v15 = v6;
        if ((int)v15->field_98 <= v16)
            return v20;
    }
    v21 = (st_3c2784_1 *)*(int *)(v15->field_20 + (long long)v16 * 16 + 12);
    v22 = 64;
    if (!v21)
        v22 = 40;
    if (v21 == 1)
        v22 = 176;
    if (v21 == 3)
        v22 = 128;
    if (v21 == 5)
        v22 = 192;
    if (v21 == 6)
        v22 = 24;
    if (v21 == 7)
        v22 = 32;
    if (v21 == 8)
        v22 = 160;
    goto *((void *)(*(long long *)((char *)&g_e7d690 + v22)));
}
