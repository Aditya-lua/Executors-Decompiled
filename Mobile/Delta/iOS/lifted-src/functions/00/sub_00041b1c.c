/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x41b1c..0x42034 (1304 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_41b1c_3 {
    long long field_0;
    char padding_8[256];
    char field_108;
    char padding_109[1247];
    long long field_5e8;
    char padding_5f0[12];
    unsigned int field_5fc;
} st_41b1c_3;

typedef struct st_41b1c_1 {
    char padding_0[12];
    char field_c;
    char padding_d[19];
    long long *field_20;
    char padding_28[8];
    struct st_41b1c_2 *field_30;
    unsigned int field_38;
} st_41b1c_1;

typedef struct st_41b1c_2 {
    unsigned long long field_0;
} st_41b1c_2;

typedef struct st_41b1c_4 {
    struct st_41b1c_5 *field_0;
} st_41b1c_4;

typedef struct st_41b1c_5 {
    struct st_41b1c_4 *field_0;
} st_41b1c_5;

typedef struct st_41b1c_0 {
    char field_0;
} st_41b1c_0;

extern long long g_c7c2eb;
extern long long g_f0cdf8;

unsigned long long * sub_41b1c(st_41b1c_3 *a0, st_41b1c_1 *a1, unsigned int a2, unsigned long long a3)
{
    unsigned long long v11;  // x23
    long long *i;  // x20
    unsigned long long v21;  // x26
    unsigned long long v22;  // x27
    long long *v23;  // x8
    unsigned long long v24;  // x0
    long long v25;  // x0
    long long v26;  // x0
    long long v27;  // x0
    long long v28;  // x0
    unsigned long long v29;  // x0
    unsigned int v30;  // w8
    unsigned long long *v13;  // x20
    char v31;  // x22
    unsigned long long v32;  // x23
    unsigned long long iter;  // x24
    unsigned long long v34;  // x0
    unsigned long long v35;  // x2
    unsigned int v36;  // w26
    unsigned long long v37;  // x0
    unsigned long v38;  // x20
    char v39;  // x0
    unsigned long long v14;  // x0
    unsigned long long node;  // x24
    unsigned long long iter1;  // x26
    unsigned long long v17;  // x25
    unsigned long long v18;  // x0
    unsigned long v19;  // x20
    unsigned long long v20;  // x24
    unsigned int v0;  // [bp-0xa4]
    st_41b1c_0 **v1;  // [bp-0xa0], Other Possible Types: char
    st_41b1c_0 *v2;  // [bp-0x98]
    unsigned long v3;  // [bp-0x90]
    char v4;  // [bp-0x88], Other Possible Types: unsigned long long
    unsigned long long v5;  // [bp-0x80]
    unsigned long long v6;  // [bp-0x78]
    char *v7;  // [bp-0x70], Other Possible Types: st_41b1c_5 **
    st_41b1c_5 **v8;  // [bp-0x68], Other Possible Types: char
    char *v9;  // [bp-0x10]
    char v10;  // [bp+0x0]

    v9 = &v10;
    v2 = &v1;
    v1 = &v2;
    if (a1->padding_28)
    {
        v11 = 0;
        i = a1->field_20;
        do
        {
            v13 = i + 2;
            v8 = 37;
            v14 = sub_3ec78(*i, *i + i[1], &v8, &v4);
            v11 = i[1] + v11 + v14;
            i = v13;
        } while (i != (char *)a1->field_20 + 16 * a1->padding_28);
        if (!*(long long *)&a1->field_38)
            goto LABEL_41c40;
LABEL_41ba4:
        node = 0;
        iter1 = 0;
        v17 = 0;
        while (1)
        {
            v18 = sub_3a7e0(&a0->field_108, (char *)a1->field_30 + node);
            if (!v18 || *(int *)(v18 + 8) != 7)
            {
                iter1 += 1;
                v11 += 2;
                node += 8;
                if ((unsigned long long)*(long long *)&a1->field_38 <= iter1)
                    break;
            }
            else
            {
                v19 = *(int *)(v18 + 12);
                v8 = 37;
                v17 += 1;
                iter1 += 1;
                v11 += sub_3ec78(*(long long *)(v18 + 16), *(long long *)(v18 + 16) + v19, &v8, &v4) + v19;
                node += 8;
                if (iter1 >= (unsigned long long)*(long long *)&a1->field_38)
                    break;
            }
        }
    }
    else
    {
        v11 = 0;
        if (*(long long *)&a1->field_38)
            goto LABEL_41ba4;
LABEL_41c40:
        v17 = 0;
    }
    v4 = 0;
    v5 = 0;
    v6 = 0;
    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::reserve(&v4, v11);
    if (a1->padding_28)
    {
        v20 = 0;
        v21 = 0;
        v22 = 0;
        do
        {
            v23 = (char *)a1->field_20 + v21;
            sub_3aa00(&v4, *v23, v23[1]);
            if ((unsigned long long)*(long long *)&a1->field_38 > v22)
            {
                v24 = sub_3a7e0(&a0->field_108, (char *)a1->field_30 + v20);
                if (!v24 || *(int *)(v24 + 8) != 7)
                    std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::append(&v4, "%*", 2);
                else
                    sub_3aa00(&v4, *(long long *)(v24 + 16), *(int *)(v24 + 12));
            }
        } while ((v22 += 1, v20 += 8, v21 += 16, a1->padding_28 > v22));
    }
    v8 = &v7;
    v7 = &v8;
    if (sub_6b08(&v4))
    {
        v25 = sub_a0c8(&v4);
        v26 = sub_6b08(&v4);
        v27 = sub_a38c(a0->field_5e8, v25, v26);
        v28 = sub_6b08(&v4);
        v29 = sub_2df40(a0->field_0, v27, v28);
    }
    else
    {
        v29 = sub_2df40(a0->field_0, &g_c7c2eb, 0);
    }
    if (!(v29 >> 31 & 1))
    {
        v30 = a1->field_38 - v17;
        v0 = a0->field_5fc;
        if ((char)g_f0cdf8 == 1 && a3 && a0->field_5fc - 1 == a2)
            v31 = sub_3b87c(a0, a1, v30 + 1) - 1;
        else
            v31 = sub_3b87c(a0, a1, v30 + 2);
        sub_3c904(a0, v31, v29);
        if (*(long long *)&a1->field_38)
        {
            v32 = 0;
            iter = 0;
            while (1)
            {
                v3 = *(long long *)&a1->field_30[iter];
                v34 = sub_3a7e0(&a0->field_108, &v3);
                if (v34 && *(int *)(v34 + 8) == 7)
                {
                    v32 += 1;
                    iter += 1;
                    if ((unsigned long long)*(long long *)&a1->field_38 <= iter)
                        break;
                }
                else
                {
                    v7 = &v8;
                    v8 = &v7;
                    v35 = (unsigned int)(v31 + 2 + iter - v32) & 0xff;
                    v36 = a0->field_5fc;
                    a0->field_5fc = (unsigned int)v35 + 1;
                    sub_47e48(a0, v3, v35, 1);
                    a0->field_5fc = v36;
                    iter += 1;
                    if (iter >= (unsigned long long)*(long long *)&a1->field_38)
                        break;
                }
            }
        }
        v37 = sub_2df40(a0->field_0, "format", 6);
        v38 = a2;
        if (!(v37 >> 31 & 1))
        {
            v39 = sub_2ffe8("format", 6);
            sub_2ad10(a0->field_0, 20, v31, v31, v39);
            sub_31514(a0->field_0, v37);
            sub_2ad10(a0->field_0, 21, v31, (unsigned int)(a1->field_38 - v17) + 2 & 0xff, 2);
            if ((unsigned int)v38 != v31)
                sub_2ad10(a0->field_0, 6, v38, v31, 0);
            a0->field_5fc = v0;
            return &v4;
        }
        sub_45808(&a1->field_c, "Exceeded constant limit; simplify the code to compile");
    }
    else
    {
        sub_45808(&a1->field_c, "Exceeded constant limit; simplify the code to compile");
    }
    __debugbreak();
}
