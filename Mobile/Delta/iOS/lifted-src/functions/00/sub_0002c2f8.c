/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x2c2f8..0x2cd44 (2636 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_2c2f8_1 {
    unsigned int field_0;
    char field_4;
    char padding_5[3];
    unsigned int field_8;
    unsigned int field_c;
} st_2c2f8_1;

typedef struct st_2c2f8_4 {
    char padding_0[24];
    char field_18;
    char field_19;
    char field_1a;
    char field_1b;
    unsigned int field_1c;
    int field_20;
} st_2c2f8_4;

typedef struct st_2c2f8_3 {
    unsigned int field_0;
} st_2c2f8_3;

typedef struct st_2c2f8_2 {
    char padding_0[8];
    unsigned long long field_8;
    char padding_10[32];
    struct st_2c2f8_3 *field_30;
    struct st_2c2f8_3 *field_38;
    char padding_40[8];
    unsigned long long field_48;
    unsigned long long field_50;
    char padding_58[8];
    unsigned long long field_60;
    unsigned long long field_68;
    char padding_70[8];
    struct st_2c2f8_3 *field_78;
    struct st_2c2f8_3 *field_80;
    char padding_88[80];
    struct st_2c2f8_3 *field_d8;
    struct st_2c2f8_3 *field_e0;
    char padding_e8[424];
    struct st_2c2f8_1 *field_290;
    struct st_2c2f8_1 *field_298;
    char padding_2a0[8];
    struct st_2c2f8_3 *field_2a8;
    struct st_2c2f8_3 *field_2b0;
    char padding_2b8[8];
    struct st_2c2f8_1 *field_2c0;
    struct st_2c2f8_1 *field_2c8;
    char padding_2d0[8];
    struct st_2c2f8_3 *field_2d8;
    struct st_2c2f8_3 *field_2e0;
} st_2c2f8_2;

typedef struct st_2c2f8_0 {
    char field_0;
} st_2c2f8_0;

extern unsigned long long g_e632a0;
extern char g_f0ca50;
extern char g_f0cc58;
extern char g_f0cc98;
extern char g_f0ccb8;

unsigned long long sub_2c2f8(st_2c2f8_2 *a0, long long a1, unsigned int a2, unsigned int a3, long long a4)
{
    st_2c2f8_4 *v7;  // x21
    unsigned long long v18;  // x8
    unsigned int *v19;  // x8
    long long idx;  // x19
    char v21;  // x24
    long long v22;  // w23
    unsigned long long v23;  // x24
    long long i0;  // x25
    long long v25;  // x25
    long long v26;  // w8
    unsigned long long v9;  // x8
    unsigned long long v27;  // x9
    unsigned long long v28;  // x8
    unsigned int *k;  // x19
    unsigned long long v30;  // x8
    unsigned long long v31;  // x0
    unsigned long long v32;  // x8
    st_2c2f8_1 *iter;  // x19
    unsigned long long v34;  // x8
    unsigned int *m;  // x19
    unsigned int *n;  // x21
    unsigned long long v10;  // x8
    long long v11;  // x0
    unsigned int *i;  // x19
    st_2c2f8_1 *node;  // x19
    long long v16;  // x0
    st_2c2f8_4 *v0;  // [bp-0x90]
    st_2c2f8_0 **v1;  // [bp-0x80], Other Possible Types: char
    st_2c2f8_0 *v2;  // [bp-0x78]
    unsigned long v3;  // [bp-0x70]
    char *v4;  // [bp-0x68], Other Possible Types: unsigned int, long long, char
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v2 = &v1;
    v1 = &v2;
    v7 = a0->field_8 + a2 * 0x88;
    v4 = v7->field_18;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(a1, &v4, 1);
    v4 = v7->field_19;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(a1, &v4, 1);
    v4 = v7->field_1a;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(a1, &v4, 1);
    v4 = v7->field_1b;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(a1, &v4, 1);
    v4 = a3;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(a1, &v4, 1);
    v3 = &v4;
    v4 = &v3;
    v0 = v7;
    if (sub_6b08(&v7[3].padding_0[4]) || a0->field_2d8 != a0->field_2e0 || a0->field_2c0 != a0->field_2c8)
    {
        sub_30d84(&a0[1].padding_e8[8]);
        sub_30a74(&a0[1].padding_e8[8], sub_6b08(&v7[3].padding_0[4]) & 0xffffffff);
        v9 = a0->field_2e0 - a0->field_2d8;
        sub_30a74(&a0[1].padding_e8[8], (v9 * 0x4000000000000000 | v9 >> 2) & 0xc0000000ffffffff & 0xffffffff);
        v10 = a0->field_2c8 - a0->field_2c0;
        sub_30a74(&a0[1].padding_e8[8], (v10 * 0x1000000000000000 | v10 >> 4) & 0xf0000000ffffffff & 0xffffffff);
        v11 = sub_a0c8(&v7[3].padding_0[4]);
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(&a0[1].padding_e8[8], v11, sub_6b08(&v7[3].padding_0[4]));
        i = a0->field_2d8;
        if (a0->field_2d8 != a0->field_2e0)
        {
            do
            {
                v4 = *i;
                std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(&a0[1].padding_e8[8], &v4, 1);
                i += 1;
            } while (i != a0->field_2e0);
        }
        node = a0->field_2c0;
        if (a0->field_2c0 != a0->field_2c8)
        {
            do
            {
                v4 = node->field_0;
                std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(&a0[1].padding_e8[8], &v4, 1);
                v4 = node->field_4;
                std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(&a0[1].padding_e8[8], &v4, 1);
                sub_30a74(&a0[1].padding_e8[8], node->field_8);
                sub_30a74(&a0[1].padding_e8[8], node->field_c - node->field_8);
                node += 1;
            } while (node != a0->field_2c8);
        }
        sub_30a74(a1, sub_6b08(&a0[1].padding_e8[8]) & 0xffffffff);
        v16 = sub_a0c8(&a0[1].padding_e8[8]);
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(a1, v16, sub_6b08(&a0[1].padding_e8[8]));
    }
    else
    {
        sub_30a74(a1, 0);
    }
    v18 = a0->field_38 - a0->field_30;
    sub_30a74(a1, (v18 * 0x4000000000000000 | v18 >> 2) & 0xc0000000ffffffff & 0xffffffff);
    v19 = a0->field_30;
    if (a0->field_38 != a0->field_30)
    {
        idx = 0;
        do
        {
            v21 = v19[idx];
            v22 = (unsigned int)sub_2d3c0(v21);
            v4 = *(int *)&a0->field_30[idx] & 0xffffff00 | (*(int *)&a0->field_30[idx] & 0xffffff00 | 227 * v21 & 0xff) & 0xff;
            std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(a1, &v4, 4);
            if (v22 >= 2)
            {
                v23 = idx * 4 + 4;
                i0 = v22 - 1;
                do
                {
                    v25 = i0;
                    v4 = *(int *)((char *)a0->field_30 + v23);
                    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(a1, &v4, 4);
                    v23 += 4;
                    i0 = v25 - 1;
                } while (i0);
            }
        } while ((idx += v22, v19 = a0->field_30, (long long)(a0->field_38 - a0->field_30) >> 2 > (unsigned long long)idx));
    }
    sub_30a74(a1, 3435973837 * (a0->field_68 - a0->field_60 >> 3));
    if (a0->field_60 != a0->field_68)
    {
        v26 = *(int *)a0->field_60;
        v27 = 320;
        if (!v26)
            v27 = 456;
        if (v26 == 1)
            v27 = 144;
        if (v26 == 2)
            v27 = 200;
        if (v26 == 3)
            v27 = 64;
        if (v26 == 4)
            v27 = 208;
        if (v26 == 5)
            v27 = 328;
        if (v26 == 6)
            v27 = 192;
        if (v26 == 7)
            v27 = 520;
        if (v26 == 8)
            v27 = 424;
        if (v26 == 9)
            v27 = 568;
        if (v26 == 10)
            v27 = 472;
        goto *((void *)(*(long long *)((char *)&g_e632a0 + v27)));
    }
    else
    {
        v28 = a0->field_80 - a0->field_78;
        sub_30a74(a1, (v28 * 0x4000000000000000 | v28 >> 2) & 0xc0000000ffffffff & 0xffffffff);
        k = a0->field_78;
        if (a0->field_78 != a0->field_80)
        {
            do
            {
                sub_30a74(a1, *k);
                k += 1;
            } while (k != a0->field_80);
        }
        sub_30a74(a1, v0->field_20);
        sub_30a74(a1, v0->field_1c);
        v30 = a0->field_48;
        if (a0->field_48 != a0->field_50)
        {
            do
            {
                if (!*(int *)v30)
                {
                    v4 = 0;
                    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(a1, &v4, 1);
                    if (a0->field_290 != a0->field_298)
                        goto LABEL_2cb44;
                }
            } while ((v30 += 4, v30 != a0->field_50));
        }
        v4 = 1;
        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(a1, &v4, 1);
        sub_2a9c4(a0, a1);
        if (a0->field_290 != a0->field_298 || a0->field_2a8 != a0->field_2b0)
        {
LABEL_2cb44:
            v4 = 1;
            std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(a1, &v4, 1);
            v32 = a0->field_298 - a0->field_290;
            sub_30a74(a1, (v32 * 0x1000000000000000 | v32 >> 4) & 0xf0000000ffffffff & 0xffffffff);
            iter = a0->field_290;
            if (a0->field_290 != a0->field_298)
            {
                do
                {
                    sub_30a74(a1, iter->field_0);
                    sub_30a74(a1, iter->field_8);
                    sub_30a74(a1, iter->field_c);
                    v4 = iter->field_4;
                    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(a1, &v4, 1);
                    iter += 1;
                } while (iter != a0->field_298);
            }
            v34 = a0->field_2b0 - a0->field_2a8;
            v31 = sub_30a74(a1, (v34 * 0x4000000000000000 | v34 >> 2) & 0xc0000000ffffffff & 0xffffffff);
            m = a0->field_2a8;
            if (a0->field_2a8 != a0->field_2b0)
            {
                do
                {
                    v31 = sub_30a74(a1, *m);
                    m += 1;
                } while (m != a0->field_2b0);
            }
            if (g_f0cc58 != 1)
                goto LABEL_2cc9c;
LABEL_2cc20:
            v31 = sub_30a74(a1, (long long)(a0->field_e0 - a0->field_d8) >> 2);
            n = a0->field_d8;
            if (a0->field_d8 != a0->field_e0)
            {
                do
                {
                    v4 = 0;
                    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(a1, &v4, 1);
                    v31 = sub_30a74(a1, *n);
                    n += 1;
                } while (n != a0->field_e0);
            }
        }
        else
        {
            v4 = 0;
            v31 = std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(a1, &v4, 1);
            if (g_f0cc58 == 1)
                goto LABEL_2cc20;
LABEL_2cc9c:
            if (g_f0cc98 & 1 || g_f0ccb8 & 1 || g_f0ca50 == 1)
                v31 = sub_30a74(a1, 0);
        }
        if (g_f0cc98 & 1 || g_f0ccb8 & 1)
        {
            if (!(a3 >> 3 & 1))
                return v31;
        }
        else
        {
            if (!(a3 >> 3 & 1))
            {
                return v31;
            }
            else if (!(g_f0ca50 & 1))
            {
                return v31;
            }
        }
        return sub_30a74(a1, a4);
    }
}
