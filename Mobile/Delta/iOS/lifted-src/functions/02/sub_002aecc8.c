/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2aecc8..0x2aedb8 (240 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2aecc8_0 {
    char field_0;
} st_2aecc8_0;

extern unsigned long long g_e7c218;
extern unsigned long long g_e7c240;

void sub_2aecc8(void* a0, int *a1, unsigned long a2)
{
    unsigned long long v9;  // x22
    unsigned long long v10;  // x21
    unsigned long long v11;  // x20
    unsigned long long v12;  // x19
    unsigned long long v13;  // x30
    int *v14;  // x20
    int *v15;  // x20
    unsigned int v16;  // w8
    st_2aecc8_0 **v0;  // [bp-0x40], Other Possible Types: char
    st_2aecc8_0 *v1;  // [bp-0x38]
    unsigned long long v2;  // [bp-0x30]
    unsigned long long v3;  // [bp-0x28]
    unsigned long long v4;  // [bp-0x20]
    unsigned long long v5;  // [bp-0x18]
    char *v6;  // [bp-0x10]
    unsigned long long v7;  // [bp-0x8]
    char v8;  // [bp+0x0]

    v2 = v9;
    v3 = v10;
    v4 = v11;
    v5 = v12;
    v6 = &v8;
    v7 = v13;
    v14 = a1;
    v1 = &v0;
    v0 = &v1;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::push_back(a0 + 80, (char)a0[20]);
    if (a2)
    {
        v15 = v14;
        while (1)
        {
            sub_2aa6a8(a0);
            v16 = (int)a0[20];
            if ((int)v16 < *v15 || v15[1] < (int)v16)
                break;
            std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::push_back(a0 + 80, (char)v16);
            v15 += 2;
            if (v15 == &v14[a2])
                goto *((void *)(g_e7c240));
        }
        *(char **)&a0[104] = "invalid string: ill-formed UTF-8 byte";
        goto *((void *)(g_e7c218));
    }
    else
    {
        goto *((void *)(g_e7c240));
    }
}
