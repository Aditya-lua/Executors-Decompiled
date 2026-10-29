/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x31554..0x31808 (692 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_31554_3 {
    char padding_0[8];
    unsigned long long field_8;
} st_31554_3;

typedef struct st_31554_1 {
    char padding_0[24];
    unsigned int field_18;
    long long field_1c;
} st_31554_1;

typedef struct st_31554_2 {
    char padding_0[8];
    long long field_8;
    long long field_10;
    char padding_18[12];
    unsigned int field_24;
    char padding_28[712];
    struct st_31554_1 *field_2f0;
    struct st_31554_1 *field_2f8;
    char padding_300[8];
    char field_308;
    char padding_309[7];
    unsigned long long field_310;
} st_31554_2;

typedef struct st_31554_0 {
    char field_0;
} st_31554_0;

extern long long g_f0ca50;
extern char g_f0cc98;
extern char g_f0ccb8;

long long sub_31554(st_31554_2 *a0, long long a1)
{
    st_31554_1 *iter;  // x20
    st_31554_1 *v9;  // x22
    long long j;  // x20
    long long v20;  // x0
    st_31554_3 *v10;  // x20
    long long v11;  // x20
    long long i;  // x21
    st_31554_1 *v14;  // x8
    st_31554_1 *v15;  // x9
    unsigned long long v16;  // x20
    unsigned long long v17;  // x21
    st_31554_0 **v0;  // [bp-0x80], Other Possible Types: char
    st_31554_0 *v1;  // [bp-0x78]
    st_31554_3 *v2;  // [bp-0x70]
    unsigned long v3;  // [bp-0x68]
    unsigned long long *v4;  // [bp-0x60], Other Possible Types: unsigned long long, char
    long long v5;  // [bp-0x58]
    char *v6;  // [bp-0x10]
    char v7;  // [bp+0x0]

    v6 = &v7;
    v1 = &v0;
    v0 = &v1;
    iter = a0->field_2f0;
    v9 = a0->field_2f8;
    if (iter != v9)
    {
        while (1)
        {
            if ((char)(&iter->field_18)[1] != 1)
            {
                iter = &iter->field_1c;
                if (iter == v9)
                    break;
            }
            else
            {
                a1 = sub_a0c8(iter);
                iter->field_18 = sub_2dc60(a0, a1, sub_6b08(iter));
                iter = &iter->field_1c;
                if (iter == v9)
                    break;
            }
        }
    }
    v10 = &a0->field_308;
    v4 = sub_2afec(v10);
    v5 = a1;
    v2 = v10;
    v3 = a0->field_310;
    v11 = 16;
    if (sub_290b8(&v4, &v2))
    {
        do
        {
            sub_2a8e0(&v4);
            v11 = v11 + *(long long *)(*v4 + 24 * v5 + 8) + 2;
        } while (sub_290b8(&v4, &v2) & 1);
    }
    i = a0->field_8;
    if (a0->field_8 != a0->field_10)
    {
        do
        {
            v11 += sub_6b08(i);
            i += 0x88;
        } while (i != a0->field_10);
    }
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::operator=(&a0[1].padding_28[72], (char)sub_2a968(std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::reserve(&a0[1].padding_28[72], v11), v11));
    v4 = 3;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(&a0[1].padding_28[72], &v4, 1);
    sub_2a7c0(a0, &a0[1].padding_28[72]);
    v14 = a0->field_2f8;
    v15 = a0->field_2f0;
    if (a0->field_2f8 - a0->field_2f0 & 0x1fffffffe0)
    {
        v16 = 0;
        v17 = 0;
        do
        {
            if (*&v15->padding_0[v16 + 28] == 1)
            {
                v4 = (char)v17 + 1;
                std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(&a0[1].padding_28[72], &v4, 1);
                sub_30a74(&a0[1].padding_28[72], *(int *)&a0->field_2f0->padding_0[v16 + 24]);
                v14 = a0->field_2f8;
                v15 = a0->field_2f0;
            }
        } while ((v17 += 1, v16 += 32, (v14 - v15 >> 5 & 0xffffffff) > v17));
    }
    v4 = 0;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(&a0[1].padding_28[72], &v4, 1);
    sub_30a74(&a0[1].padding_28[72], 4042322161 * ((unsigned long long)(a0->field_10 - a0->field_8) >> 3));
    j = a0->field_8;
    if (a0->field_8 != a0->field_10)
    {
        do
        {
            if (g_f0cc98 & 1 || g_f0ccb8 & 1 || (char)g_f0ca50 == 1)
                sub_30a74(&a0[1].padding_28[72], sub_6b08(j));
            v20 = sub_a0c8(j);
            std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(&a0[1].padding_28[72], v20, sub_6b08(j));
            j += 0x88;
        } while (j != a0->field_10);
    }
    return sub_30a74(&a0[1].padding_28[72], a0->field_24);
}
