/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x673ec..0x67520 (308 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_673ec_1 {
    char padding_0[88];
    long long field_58;
    char padding_60[113];
    char field_d1;
} st_673ec_1;

typedef struct st_673ec_0 {
    char field_0;
} st_673ec_0;

extern unsigned long long g_e6a4c8;
extern unsigned long long g_e6a4d8;

long long sub_673ec(st_673ec_1 *a0, unsigned long a1, long long a2, long long a3)
{
    unsigned long long v14;  // x26
    unsigned long long v15;  // x25
    unsigned long long v24;  // x23
    unsigned long long v16;  // x24
    unsigned long long v17;  // x23
    unsigned long long v18;  // x22
    unsigned long long v19;  // x21
    unsigned long long v20;  // x20
    unsigned long long v21;  // x19
    unsigned long long v22;  // x30
    unsigned long long v23;  // x0
    st_673ec_0 **v0;  // [bp-0x78], Other Possible Types: char
    st_673ec_0 *v1;  // [bp-0x70]
    char v2;  // [bp-0x68]
    unsigned long long v3;  // [bp-0x50]
    unsigned long long v4;  // [bp-0x48]
    unsigned long long v5;  // [bp-0x40]
    unsigned long long v6;  // [bp-0x38]
    unsigned long long v7;  // [bp-0x30]
    unsigned long long v8;  // [bp-0x28]
    unsigned long long v9;  // [bp-0x20]
    unsigned long long v10;  // [bp-0x18]
    char *v11;  // [bp-0x10]
    unsigned long long v12;  // [bp-0x8]
    char v13;  // [bp+0x0]

    v3 = v14;
    v4 = v15;
    v5 = v16;
    v6 = v17;
    v7 = v18;
    v8 = v19;
    v9 = v20;
    v10 = v21;
    v11 = &v13;
    v12 = v22;
    v1 = &v0;
    v0 = &v1;
    if (a0->field_58 && *(long long *)&a0->padding_60[0])
    {
        if (!sub_60b58(a3))
        {
            sub_a35af4();
            v23 = sub_95fdc4(a0->field_58);
            if ((unsigned int)v23 != 1)
            {
                v24 = v23;
                if ((sub_9625a4(a0->field_58, v24) & 0xfffffffe) != 2)
                {
                    sub_67f54(a0, v24);
                    sub_5ccc(a2, &v2);
                }
                else
                {
                    goto *((void *)(g_e6a4d8));
                }
            }
            else if (!(a0->field_d1 & 1))
            {
                sub_68478();
                goto *((void *)(g_e6a4c8));
            }
            goto *((void *)(g_e6a4c8));
        }
        else
        {
            std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::assign(a2, "Cancellation requested");
        }
    }
    return sub_674fc();
}
