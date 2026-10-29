/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x4b078..0x4b284 (524 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_4b078_1 {
    struct st_4b078_1 *field_0;
    char field_1;
    char padding_2[2];
    char field_4;
    char padding_5[3];
    unsigned int field_8[2];
    char field_c;
} st_4b078_1;

typedef struct st_4b078_4 {
    struct st_4b078_4 *field_0;
    char field_1;
    char padding_2[2];
    char field_4;
    char padding_5[3];
    long long field_8;
    unsigned int field_c;
} st_4b078_4;

typedef struct st_4b078_2 {
    char padding_0[32];
    struct st_4b078_3 *field_20;
    struct st_4b078_1 *field_28;
    unsigned long long field_30;
    struct st_4b078_1 *field_38;
} st_4b078_2;

typedef struct st_4b078_3 {
    unsigned long long field_0;
} st_4b078_3;

typedef struct st_4b078_0 {
    char field_0;
} st_4b078_0;

extern long long g_c7c2eb;

st_4b078_4 * sub_4b078(st_4b078_4 *a0, st_4b078_2 *a1, long long a2, long long a3)
{
    st_4b078_1 *i;  // x8
    st_4b078_4 *v8;  // x24
    st_4b078_4 *v17;  // x8
    st_4b078_4 *v18;  // x0
    st_4b078_4 *v9;  // x25
    st_4b078_4 *v10;  // x21
    unsigned long long v11;  // x26
    st_4b078_4 *v12;  // x0
    st_4b078_4 *v13;  // x8
    st_4b078_4 *v14;  // x24
    st_4b078_4 *v15;  // x25
    st_4b078_4 *v16;  // x26
    st_4b078_0 **v0;  // [bp-0x78], Other Possible Types: char
    st_4b078_0 *v1;  // [bp-0x70]
    st_4b078_4 *v2;  // [bp-0x68]
    st_4b078_4 *v3;  // [bp-0x60]
    st_4b078_4 *v4;  // [bp-0x58]
    char *v5;  // [bp-0x10]
    char v6;  // [bp+0x0]

    v5 = &v6;
    v1 = &v0;
    v0 = &v1;
    i = a1->field_28;
    if (a1->field_28)
    {
        v8 = 0;
        v9 = 0;
        v10 = 0;
        v11 = 8;
        v12 = a0;
        do
        {
            v10 = *(long long *)((char *)a1->field_20 + v11) + (char *)v10;
            if (a1->field_38 > v9)
            {
                v12 = sub_3a7e0(a2, a1->field_30 + (char *)v8);
                v13 = &v12->field_1;
                if (!v12)
                    v13 = 0;
                v10 = (char *)v10 + *(int *)((char *)&v13->field_0 + 4);
                i = a1->field_28;
            }
            v9 = (char *)&v9->field_0 + 1;
            v8 = &v8->field_1;
            v11 += 16;
        } while (i > v9);
        if (0x1000 < v10)
            return v12;
        *(unsigned int *)&a0->field_0 = 7;
        *(unsigned int *)((char *)&a0->field_0 + 4) = (unsigned int)v10;
        if (v10)
        {
            v2 = 0;
            v3 = 0;
            v4 = 0;
            std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::reserve(&v2, v10);
            if (a1->field_28)
            {
                v14 = 0;
                v15 = 0;
                v16 = 0;
                do
                {
                    v17 = a1->field_20 + v15;
                    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(&v2, v17->field_0, *(long long *)&v17->field_1);
                    if (a1->field_38 > v16)
                        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append();
                } while ((v16 = (char *)&v16->field_0 + 1, v14 = &v14->field_1, v15 = &v15->field_8, a1->field_28 > v16));
            }
            *(unsigned int *)&a0->field_0 = 7;
            *(unsigned int *)((char *)&a0->field_0 + 4) = (unsigned int)v10;
            *(unsigned long long *)&a0->field_1 = sub_a38c(a3, sub_a0c8(&v2), v10);
            return &v2;
        }
    }
    else
    {
        *(double *)&a0->field_0 = 3.5e-323;
        v12 = a0;
    }
    v18 = v12;
    *(long long **)&a0->field_1 = &g_c7c2eb;
    return v18;
}
