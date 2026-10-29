/*
 * Machine-reconstructed pseudocode; not original vendor source.
 * Mach-O extent: 0x1ebf34..0x1ec1a0 (620 bytes).
 * Function and variable names are synthetic unless documented elsewhere.
 */

typedef struct st_1ebf34_2 {
    long long field_0;
    long long field_8;
    char field_10;
} st_1ebf34_2;

typedef struct st_1ebf34_1 {
    char padding_0[192];
    char field_c0;
    char padding_c1[7];
    unsigned long long field_c8;
    unsigned long long field_d0;
    char padding_d8[8];
    long long field_e0;
    char padding_e8[16];
    long long field_f8;
} st_1ebf34_1;

typedef struct st_1ebf34_0 {
    char field_0;
} st_1ebf34_0;


long long sub_1ebf34(st_1ebf34_1 *a0, long long a1, void* a2, void* a3)
{
    void* i;  // x24
    char v6;  // x0
    unsigned long long v15;  // 4105
    unsigned long long v16;  // 4105
    st_1ebf34_2 *v17;  // x0
    void* v18;  // x1
    char v19;  // w0
    st_1ebf34_2 *v20;  // x0
    void* v21;  // x8
    long long *v7;  // x0
    void* v8;  // x24
    void* v9;  // x24
    unsigned long v10;  // x8
    char v11;  // x1
    unsigned long v12;  // x8
    unsigned int v13;  // w9
    unsigned long v14;  // cc_dep1
    st_1ebf34_0 **v0;  // [bp-0x78], Other Possible Types: char
    st_1ebf34_0 *v1;  // [bp-0x70]
    char v2;  // [bp-0x61]
    char *v3;  // [bp-0x10]
    char v4;  // [bp+0x0]

    v3 = &v4;
    v1 = &v0;
    v0 = &v1;
    if (!(a0->field_c0 & 1))
    {
        return a1;
    }
    else if (a0->field_d0 != a0->field_c8)
    {
        i = a2;
        v6 = sub_1ef16c(&a0[1].padding_0[48]);
        v7 = sub_1f8448(a0, 0);
        if (i == a3)
            return a1;
        do
        {
            v8 = i + 1;
            while (1)
            {
                v9 = v8;
                if (*((char *)v9 - 1) == 36)
                    break;
                std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::push_back(a1);
                v8 = v9 + 1;
                if (v9 == a3)
                    return a1;
            }
            if (v9 != a3)
            {
                v10 = *(char *)v9;
                if (59 < (int)v10)
                {
                    if ((unsigned int)v10 == 60)
                    {
                        if (v6)
                        {
                            v18 = v9 + 1;
                            if (v18 != a3)
                            {
                                do
                                {
                                    if (*(char *)v18 == 62)
                                    {
                                        v19 = sub_1fb4dc(a0);
                                        if (v19)
                                        {
                                            v20 = sub_1f8448(a0, v19);
                                            if (v20->field_10 == 1)
                                            {
                                                sub_1ea8d0(&v2, v20->field_0, v20->field_8, a1);
                                                a1 = v20->field_0;
                                            }
                                        }
                                        i = v18 + 1;
                                        goto LABEL_1ec124;
                                    }
                                } while ((v18 += 1, v18 != a3));
                            }
                            goto LABEL_1ec0f8;
                        }
LABEL_1ec108:
                        std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::push_back(a1, 36);
                        v21 = v9;
                        i = v21 + 1;
                        if (*(char *)v21 == 36)
                        {
                            goto LABEL_1ec124;
                        }
                        else
                        {
                            i = v9;
                            goto LABEL_1ec124;
                        }
                    }
                    if ((unsigned int)v10 == 96)
                    {
                        a1 = a0->field_e0;
                    }
                    else
                    {
LABEL_1ec028:
                        if (9 < (unsigned int)v10 - 48)
                            goto LABEL_1ec108;
                        v11 = v10 & 15;
                        i = v9 + 1;
                        if (i == a3)
                        {
LABEL_1ec064:
                            if (v11 && ((long long)(a0->field_d0 - a0->field_c8) >> 3) * 12297829382473034411 > v11)
                            {
                                v17 = sub_1f8448(a0);
                                if (v17->field_10 == 1)
                                {
                                    sub_1ea8d0(&v2, v17->field_0, v17->field_8, a1);
                                    a1 = v17->field_0;
                                    goto LABEL_1ec124;
                                }
                                else
                                {
                                    goto LABEL_1ec124;
                                }
                            }
                            goto LABEL_1ec108;
                        }
                        v12 = *(char *)i;
                        v13 = (unsigned int)v12 - 48;
                        v14 = v13;
                        if (v13 <= 9)
                        {
                            i = v9 + 2;
                            v15 = arm64g_calculate_condition(131, v14, 9, 0);
                            if (!(v15 & 1))
                                goto LABEL_1ec062;
                        }
                        else
                        {
                            i = v9 + 1;
                            v16 = arm64g_calculate_condition(131, v14, 9, 0);
                            if (!(v16 & 1))
                            {
LABEL_1ec062:
                                v11 = (v12 & 15) + v11 * 10;
                                goto LABEL_1ec064;
                            }
                        }
                        goto LABEL_1ec064;
                    }
                }
                else if ((unsigned int)v10 != 38)
                {
                    if ((unsigned int)v10 != 39)
                        goto LABEL_1ec028;
                    a1 = a0->field_f8;
                }
                else
                {
                    a1 = *v7;
                }
                sub_1ea8d0(&v2);
                i = v9 + 1;
                continue;
            }
            else
            {
LABEL_1ec0f8:
                std::__1::basic_string<char, std::__1::char_traits<char>, std::__1::allocator<char>>::push_back(a1, 36);
                i = v9;
            }
LABEL_1ec124:
        } while (i != a3);
        return a1;
    }
    else
    {
        return a1;
    }
}
